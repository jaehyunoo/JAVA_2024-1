import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DB_Update {

	public static void main(String[] args) {
		
		//드라이버 설정 
		String jdbcDriver = "com.mysql.cj.jdbc.Driver";
				
		//데이터베이스 URL 설정
		String url = "jdbc:mysql://localhost:3306/dbstudent?";
				
		//Connection  클래스 변수 선언. 
		Connection conn;
				
		String id = "root"; //DB에 로그인할 ID
		String pw = "1234"; //MYSQL 설정시 입력한 PASSWORD
		
		//statement : SQL문 실행하기 위해 사용하는 클래스 
		Statement stmt = null;
		
		//ResultSet : SQL문 실행결과를 얻어오기 위한 클래스 
		ResultSet result = null;
		
		
		try {
			//1단계 : JDBC드라이버 로드 
			Class.forName(jdbcDriver);
			
			//2단계: 데이터베이스 연결
			conn = DriverManager.getConnection(url, id, pw);
			//DriverManager 자바 어플리케이션을 JDBC드라이버에 연결시켜주는 클래스
			//getConnection() 메소드로 DB에 연결하여 Connection 객체 반환. 
			
			System.out.println("DB연결 완료");
			
			//3단계 : Statement 생성 
			stmt = conn.createStatement();
			
			//3단계 : SQL문 전송
			// 홍길동의 학번을 수정하시오
			stmt.executeUpdate("update student set id='202033021' where name ='김라면';");
			stmt.executeUpdate("update student set Dept='식품영양과' where name ='김구라';");
			
			printTable(stmt);
			
			//5단계 연결 해제 
			conn.close();
		}catch(ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 에러 ");
		}catch(SQLException e){
			System.out.println("DB 연결 오류");
		}
		finally {
			System.out.println("끝");
		}

	}
	
	private static void printTable(Statement stmt) throws SQLException{
		//5단계 결과 받기 
		ResultSet  result = stmt.executeQuery("select * from student");
		//executeQuery : 주어진 SQL문을 실행하고 결과는 ResultSet 객체에 반환. 
		while(result.next()) {
			System.out.print(result.getString("NAME"));
			System.out.print("\t|\t" + result.getString("ID"));
			System.out.println("\t|\t" + result.getString("Dept"));
			//getString() 메소드 : 해당 데이터 타입으로  '열' 값을 읽어온다. 
		}
		//5단계 연결 해제 
		result.close();
		//ResultSet에서 모든 데이터를 다 읽어들인 후 자원 해제. 
	}

}

