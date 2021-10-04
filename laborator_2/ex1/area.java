
public class area {
	static void count(box[] b) {
		double a;
		for (int i=0;i<3;i++) {
			a=b[i].height*b[i].width+b[i].depth*b[i].height+b[i].width*b[i].depth;
			a=a*2;
			System.out.println("the area of box "+(i+1)+" is "+a);
		}
	}
}
