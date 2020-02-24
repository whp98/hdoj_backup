import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNextInt()) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			int n = cin.nextInt();
			if(a==0 & b==0 &n==0)break;
			int continer[] = new int[49];
			continer[0]=1;
			continer[1]=1;
			for(int i = 2;i<49;i++) {
				continer[i]=(a*continer[i-1]+b*continer[i-2])%7;
			}
			System.out.println(continer[(n-1)%49]);
		}
	}
}
