
public class main {

	public static void main(String[] args) {
		box b[]=new box[3];
		b[0]=new box();
		b[0].type1();
		b[1]=new box();
		b[1].type2(3.15);
		b[2]=new box();
		b[2].type3(11.25,12.5,6.725);
		output.out(b);
		area.count(b);
		volume.count(b);
	}

}
