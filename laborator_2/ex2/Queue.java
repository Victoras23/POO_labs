
public class Queue {
	public int components[], first, last, capacity,count;
	public int components1[], count1, first1, last1;
	Queue(int size){
		components= new int[size];
		capacity=size;
		first=0;
		last=-1;
		count=0;
	}
	Queue(){
		components1=new int[1];
		count1=0;
		first1=0;
		last1=-1;	
	}
	public void push(int element) {
		if(count==capacity) {
			System.out.println("the queue is full");
		}
		else {
			last=last+1;
			components[last]=element;
			count++;
			}
	}
	public int pop() {
		if(count==0) {
			System.out.println("the queue is empty");
			return (0);
		}
		else {
			first++;
			count--;
			return(components[first-1]);
		}
	}
	public void push1(int element) {
		if (count1==0) {
			last1=last1+1;
			components1[last1]=element;
			count1++;
		}
		else {
			int[] temp = new int[count1+1];
			count1++;
			for (int i=0;i<components1.length;i++) {
				temp[i]=components1[i];
			}
			components1=temp;
			last1=last1+1;
			components1[last1]=element;
		}
	}
	public int pop1() {
		if (count1==0) {
			System.out.println("the queue is empty");
			return (0);
		}
		else {
			int a=components1[0];
			int[] temp = new int[count1-1];
			for (int i=1;i<components1.length;i++) {
				temp[i-1]=components1[i];
			}
			count1--;
			last1--;
			components1=temp;
			return(a);
		}
	}
	public int try_to_pop() {
		if (count!=0)return(1);
		else return(0);
	}
	public int try_to_pop1() {
		if (count1!=0)return(1);
		else return(0);
	}
}
