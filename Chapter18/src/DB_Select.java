import java.sql.Connection;

public class DB_Select {

	public static void main(String[] args) {
		//드라이버 설정 
		String jdbcDriver = "com.mysql.cj.jdbc.Driver";
				
		//데이터베이스 URL 설정
		String url = "jdbc:mysql://localhost:3306/dbstudent?";
				
		//Connection  클래스 변수 선언. 
		Connection conn;
				
		String id = "root"; //DB에 로그인할 ID
		String pw = "1234"; //MYSQL 설정시 입력한 PASSWORD

	}

}
