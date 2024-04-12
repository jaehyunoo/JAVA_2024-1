import java.util.Scanner;
public class ContinueTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("원하는 정수 입력 : ");
		
		int num = stdIn.nextInt();
		
		int i, sum = 0;
		for (i = 1; i <= num; i++) {
			if (i % 2 == 1) {
				continue;
			}
			sum = sum + i;
		}
		
		System.out.println("1부터" + num + "까지의 합 = " + sum );
		

	}

}
