import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MysqlConnect {
	Scanner scan = new Scanner(System.in);
	String jdbcDrvier = "com.mysql.jdbc.Driver";
	String jdbcUrl = "jdbc:mysql://localhost/shopdb";
	Connection conn;
	
	PreparedStatement pstmt;
	ResultSet rs;

	public static void main(String[] args) {
		
		
		
	}
	
	public EventRegist() {
		System.out.println("## 이벤트 등록을 위한 이름과 이메일 입력");
		System.out.print("Name: ");
		String uname = scan.next();
		System.out.print("email: ");
		String email = scan.next();
		
		connectDB();
		registUser(uname, email);
		printList();
		closeDB();
	}

	public void connectDB() {
		try {
			// JDBC 드라이버 로드
			Class.forName(jdbcDrvier);
			
			// 데이터베이스 연결
			conn = DriverManager.getConnection(jdbcUrl, "root", "1234");
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void closeDB() {
		try {
			// 연결 해제
			pstmt.close();
			rs.close();
			conn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void registUser(String uname, String email) {
		String sql = "insert into event values(?, ?)";
		try {
			// Statement 생성
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  uname);
			pstmt.setString(2, email);
			
			// SQL 전송
			pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void printList() {
		System.out.println("# 등록자 명단");
		String sql = "select * from event";
		try {
			pstmt = conn.prepareStatement(sql);
			
			// 결과받기
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("uname") + ", " + rs.getString(2));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
