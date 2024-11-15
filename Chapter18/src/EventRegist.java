import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EventRegist {

	
		Scanner scanner = new Scanner(System.in);
		
		String jdbcUrl = "jdbc:mysql://localhost/dbevent?";
		Connection conn;
		
		String id = "root"; 
		String pw = "1234"; 
		
		
		PreparedStatement pstmt;
		ResultSet rs;
		
		public EventRegist() {
			System.out.println("## 이벤트 등록을 위해 이름과 이메일을 입력하세요");
			System.out.print("이름 : ");
			String uname = scanner.next();
			System.out.print("이메일 : ");
			String email = scanner.next();
			
			connectDB(); // DB 연결 메서드 호출
			registUser(uname,email);  // SQL문 전송 메서드 호출
			printList(); // 결과 출력 메서드 호출
			closeDB();  // DB 연결 종료 메서드 호출
		}
		
		// DB 연결 메서드
		public void connectDB() {
			try {
				// 1단계 : JDBC 드라이버 로드
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				// 2단계 : 데이터 베이스 연결
				conn = DriverManager.getConnection(jdbcUrl, id, pw);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public void closeDB() {
			try {
				//6단계 : 연결 해제
				pstmt.close();
				rs.close();
				conn.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		// SQL문 전송 메서드
		public void registUser(String uname, String email) {
			String sql = "insert into event values(?,?)";
			try {
				// 3단계 : Statement 생성
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1,  uname);
				pstmt.setString(2, email);
				
				// 4단계 : SQL 문 전송
				pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		// 화면 출력 메소드
		public void printList() {
			System.out.println("# 등록자 명단");
			String sql = "select * from event";
			try {
				pstmt = conn.prepareStatement(sql);
				
				// 5단계 : 결과받기
				rs = pstmt.executeQuery();
				while(rs.next()){
					System.out.println(rs.getString("uname")+ " = " + rs.getString(2));
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	public static void main(String[] args) {
		EventRegist er = new EventRegist();

	}

}
