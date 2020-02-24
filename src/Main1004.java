import java.util.ArrayList;
import java.util.Scanner;

public class Main1004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			int n = sc.nextInt();
			if(n <= 0)break;
			
			ArrayList<color> c = new ArrayList<color>();
			
			for(int i=0;i<n;i++) {
				String s = sc.next();
				boolean flag = false;
				
				for(int j = 0;j<c.size();j++) {
					if(s.equals(c.get(j).name)) {
						c.get(j).conunt++;
						flag = true;
						break;
					}
				}
				
				if(!flag) {
					c.add(new color());
					c.get(c.size()-1).conunt=1;
					c.get(c.size()-1).name=s;
				}
			}
			int max = c.get(0).conunt;
			for(int i = 0;i<c.size();i++) {
				if(max<c.get(i).conunt) {
					max = c.get(i).conunt;
				}
			}
			for(int i = 0;i<c.size();i++) {
				if(c.get(i).conunt==max) {
					System.out.println(c.get(i).name);
				}
			}
		}
	}
}
class color{
	String name;
	int conunt;
}
