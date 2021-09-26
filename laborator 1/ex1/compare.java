
public class compare {
	
	static void colors(Monitor mon1,Monitor mon2) {
		System.out.print("color : monitor1 "+mon1.color+' ');
		if(mon1.color>mon2.color)System.out.print("> ");
		else if (mon1.color<mon2.color)System.out.print("< ");
		else System.out.print("= ");
		System.out.println(mon2.color+" monitor2");
	}
	
	static void dimension(Monitor mon1,Monitor mon2) {
		System.out.print("dimension : monitor1 "+mon1.dimension+' ');
		if(mon1.dimension>mon2.dimension)System.out.print("> ");
		else if (mon1.dimension<mon2.dimension)System.out.print("< ");
		else System.out.print("= ");
		System.out.println(mon2.dimension+" monitor2");
	}
	static void resolution(Monitor mon1,Monitor mon2){
		System.out.print("resolution : monitor1 "+mon1.resolution+' ');
		if(mon1.resolution>mon2.resolution)System.out.print("> ");
		else if (mon1.resolution<mon2.resolution)System.out.print("< ");
		else System.out.print("= ");
		System.out.println(mon2.resolution+" monitor2");
	}
}
