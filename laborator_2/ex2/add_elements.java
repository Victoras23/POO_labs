
public class add_elements {
	static void add(Queue q,Queue q1) {
		for(int i=0;i<3;i++) {
				q.push(i);
				q1.push1(i+3);
			}
	}
	static void extract(Queue q,Queue q1) {
		int a ,r = 0 ;
		a=q.try_to_pop();
		while ( a==1) {
			r=q.pop();
			a=q.try_to_pop();
		}
		System.out.println("the last element in queue 1 was : "+r);
		a=q1.try_to_pop1();
		while ( a==1) {
			r=q1.pop1();
			a=q1.try_to_pop1();
		}
		System.out.println("the last element in queue 2 was : "+r);
	}

}
