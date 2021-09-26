import java.util.*;
public class ex1 {
		public static void main(String[] args) {
		    Scanner input=new Scanner(System.in);
			Monitor mon1=new Monitor();
			System.out.println("enter the nr of colors of display 1 (integer) : ");
			mon1.color= input.nextInt();
			System.out.println("enter the dimension of display 1 (float number ): ");
			mon1.dimension= input.nextDouble();
			System.out.println("enter the resolution of display 1 (integer): ");
			mon1.resolution= input.nextInt();
			Monitor mon2=new Monitor();
			System.out.println("enter the nr of colors of display 2 (integer) : ");
			mon2.color= input.nextInt();
			System.out.println("enter the dimension of display 2 (float number ): ");
			mon2.dimension= input.nextDouble();
			System.out.println("enter the resolution of display 2 (integer): ");
			mon2.resolution= input.nextInt();
			
			System.out.print("color : monitor1 "+mon1.color+' ');
			if(mon1.color>mon2.color)System.out.print("> ");
			else if (mon1.color<mon2.color)System.out.print("< ");
			else System.out.print("= ");
			System.out.println(mon2.color+" monitor2");
			
			System.out.print("dimension : monitor1 "+mon1.dimension+' ');
			if(mon1.dimension>mon2.dimension)System.out.print("> ");
			else if (mon1.dimension<mon2.dimension)System.out.print("< ");
			else System.out.print("= ");
			System.out.println(mon2.dimension+" monitor2");
			
			System.out.print("resolution : monitor1 "+mon1.resolution+' ');
			if(mon1.resolution>mon2.resolution)System.out.print("> ");
			else if (mon1.resolution<mon2.resolution)System.out.print("< ");
			else System.out.print("= ");
			System.out.println(mon2.resolution+" monitor2");
			
			
		
	}
}
