import java.util.StringTokenizer;

public class StringTokenizerExam {

	public static void main(String[] args) {
		String s1 = "이름 유재현 성별 남자 나이 24";
		String s2 = "이름,유재현,성별,남자,나이,24";
		String s3 = "이름/유재현/성별/남자/나이/24";
		String s4 = "이름:유재현:성별:남자:나이:24";
		
		System.out.println("-------- 빈칸을 기준으로 --------");
		// 빈칸을 기준으로 잘라내는게 가장 기본이다.
		StringTokenizer st1 = new StringTokenizer(s1);
		// 토큰이 있는동안 반복
		while(st1.hasMoreTokens()) {
			String first = st1.nextToken(); // 이름 성별 나이 들어감
			String second = st1.nextToken(); // 유재현 남자 24 들어감
			System.out.println(first + "\t" + second);
		}
		
		System.out.println("-------- ,을 기준으로 --------");
		// 빈칸을 기준으로 잘라내는게 가장 기본이다.
		StringTokenizer st2 = new StringTokenizer(s2,",");
		// 토큰이 있는동안 반복
		while(st2.hasMoreTokens()) {
			String first = st2.nextToken(); // 이름 성별 나이 들어감
			String second = st2.nextToken(); // 유재현 남자 24 들어감
			System.out.println(first + "\t" + second);
		}
		
		System.out.println("-------- /을 기준으로 --------");
		// 빈칸을 기준으로 잘라내는게 가장 기본이다.
		StringTokenizer st3 = new StringTokenizer(s3,"/");
		// 토큰이 있는동안 반복
		while(st3.hasMoreTokens()) {
			String first = st3.nextToken(); // 이름 성별 나이 들어감
			String second = st3.nextToken(); // 유재현 남자 24 들어감
			System.out.println(first + "\t" + second);
		}
		
		System.out.println("-------- :을 기준으로 --------");
		// 빈칸을 기준으로 잘라내는게 가장 기본이다.
		StringTokenizer st4 = new StringTokenizer(s4,":");
		// 토큰이 있는동안 반복
		while(st4.hasMoreTokens()) {
			String first = st4.nextToken(); // 이름 성별 나이 들어감
			String second = st4.nextToken(); // 유재현 남자 24 들어감
			System.out.println(first + "\t" + second);
		}

	}

}
