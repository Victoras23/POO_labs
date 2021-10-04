
public class volume {
	static void count(box[] b) {
		double v;
		for (int i=0;i<3;i++) {
			v=b[i].height*b[i].width*b[i].depth;
			System.out.println("the volume of box "+(i+1)+" is "+v);
		}
	}
}
