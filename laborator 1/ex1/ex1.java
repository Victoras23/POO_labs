import java.util.*;
public class ex1 {
		public static void main(String[] args) {
		    Scanner input=new Scanner(System.in);
			Monitor mon1=new Monitor();
			System.out.print("enter the nr of colors of display 1 (integer) : ");
			mon1.color= input.nextInt();
			System.out.print("enter the dimension of display 1 (float number ): ");
			mon1.dimension= input.nextDouble();
			System.out.print("enter the resolution of display 1 (integer): ");
			mon1.resolution= input.nextInt();
			Monitor mon2=new Monitor();
			System.out.print("enter the nr of colors of display 2 (integer) : ");
			mon2.color= input.nextInt();
			System.out.print("enter the dimension of display 2 (float number ): ");
			mon2.dimension= input.nextDouble();
			System.out.print("enter the resolution of display 2 (integer): ");
			mon2.resolution= input.nextInt();
			compare.colors(mon1,mon2);
			compare.dimension(mon1,mon2);
			compare.resolution(mon1,mon2);
			
			
		
	}
}
