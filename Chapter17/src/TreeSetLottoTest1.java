import java.util.Random;
import java.util.TreeSet;

public class TreeSetLottoTest1 {

	public static void main(String[] args) {
		TreeSet<Integer> num1 = new TreeSet<Integer>();
		Random r = new Random();
		
		while(num1.size() < 6) {
			num1.add(r.nextInt(45));
		}
		
		System.out.println(num1);

	}

}
