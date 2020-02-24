
import java.util.Scanner;


public class Main1001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int sum = 0;
			int a = sc.nextInt();
			for(int i = 0;i < a;i++) {
				sum += i+1;
			}
			System.out.println(sum);
			System.out.println();
		}
	}
}
