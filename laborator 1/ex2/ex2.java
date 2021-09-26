import java.util.*;
public class ex2 {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n;
			System.out.print("nr of universityes : ");
			n=in.nextInt();
			univer[] u =new univer[n];
			for(int i=0;i<n;i++) {
				u[i]=new univer();
				u[i].un(i);
				u[i].fy(i);
				u[i].ss(i);	
			}
			change_information.change(u);
		}
	

}
