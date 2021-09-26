import java.util.*;
public class University {
	Scanner input=new Scanner(System.in);
    String name;
    int nr;
    student st[];
    double med;
    void nc(int i) {
 	   System.out.print("enter the name of university "+(i+1)+" : ");
 	   this.name=input.next();
    }
    void sd() {
 	   System.out.print("enter the number of students : ");
 	   this.nr=input.nextInt();
 	   double a=0;
 	   st=new student[nr];
 	   for (int i=0;i<nr;i++) {
 		   st[i]=new student();
 		   System.out.print("enter students name : ");
 		   st[i].nume=input.next();
 		   System.out.print("enter students mark : ");
 		   st[i].media=input.nextDouble();
 		   a=a+st[i].media;
 	   }
 	   a=a/nr;
 	   this.med=a;
    }
    void afisare() {
 	   System.out.println(this.name+" : "+this.med);
    }
}
