import java.util.*;

	class univer{
		String name;
		int foundationYear;
		int nr;
		student st[];
		Scanner in = new Scanner(System.in);
		void un(int i){
			System.out.print("Name of university "+(i+1)+" : ");
			this.name=in.next();
		}
		void fy(int i){
			System.out.print("Foundation year of university "+(i+1)+" : ");
			this.foundationYear=in.nextInt();
		}
		void ss(int j){
			System.out.print("Number of students in university "+(j+1)+" : ");
			this.nr=in.nextInt();
			st = new student[nr];
			for(int i=0;i<nr;i++) {
				st[i]=new student();
				System.out.print("Name of student " + (i+1) +" : ");
				st[i].name=in.next();
				System.out.print("Age of student " + (i+1) +" : ");
				st[i].year=in.nextInt();
				System.out.println("Mark of student " + (i+1) +" : ");
				st[i].mark=in.nextDouble();
			}
		}
		void chu() {
			System.out.println("Old name : "+this.name);
			System.out.print("New name : ");
			this.name=in.next();
			System.out.println("Old foundation year : "+this.foundationYear);
			System.out.print("New foundation year : ");
			this.foundationYear=in.nextInt();
		}
		void chs() {
			System.out.print("what number has this student ?");
			int a;
			a=in.nextInt();
			a=a-1;
			System.out.println("old name : "+this.st[a].name);
			System.out.print("New name : ");
			this.st[a].name=in.next();
			System.out.println("old year : "+this.st[a].year);
			System.out.print("New year : ");
			this.st[a].year=in.nextInt();
			System.out.println("old mark : "+this.st[a].mark);
			System.out.print("New mark : ");
			this.st[a].mark=in.nextDouble();
		}
	}


