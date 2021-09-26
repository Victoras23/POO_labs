import java.util.*;
public class ex3 {
	public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
		 University u[]=new University[3];
		 for (int i=0;i<3;i++) {
			 u[i]=new University();
			 u[i].nc(i);
			 u[i].sd();
			 }
		 for(int i=0;i<3;i++) {
			 u[i].afisare();
		 }
	}
}
