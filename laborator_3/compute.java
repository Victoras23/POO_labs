
public class compute {
	static int compute_words(text t) {
		int count=0;
		for(int i=0;i<t.a.length();i++) {
			//here I search the first letter in each word and pass over the others letters
			if(t.a.charAt(i)>=65 && t.a.charAt(i)<=90  || t.a.charAt(i)>=97 && t.a.charAt(i)<=122) {
				count++;
				char ne=t.a.charAt(i);
				while ((ne!=32 )&& i<t.a.length()-1) {
					i++;
					ne=t.a.charAt(i);
				}
			}
		}
		//I did it as a function with returning number of words in order to use it in other classes
		return(count);
	}
	static void compute_s(text t) {
		int count=0;
		//because at the end of each sentence we have some dots I just take the number of dots in order to know how much sentences i have 
		for(int i=0;i<t.a.length();i++) {
			if (t.a.charAt(i)=='.'  )count++;
		}
	System.out.println("the number of sentences is : "+count);
	}
}
