import java.util.*;
public class change_information {
	static void change(univer[] u) {
		Scanner in = new Scanner(System.in);
		boolean z=true;
		int numar;
		while(z) {
			System.out.println("what would you want to change ?");
			System.out.println("1 university informations ");
			System.out.println("2 student informations ");
			System.out.println("3 Nothing");
			int r;
			r=in.nextInt();
			switch(r) {
				case 1:{
					System.out.print("enter the university number : ");
					numar=in.nextInt();
					u[numar-1].chu();
					break;
				}
				case 2:{
					System.out.print("enter the university number : ");
					numar=in.nextInt();
					u[numar-1].chs();
					break;
				}
				case 3:System.out.println("ok");z=false;break;
			}
		}
	}
}
