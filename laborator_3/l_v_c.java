
public class l_v_c {
	static void leters(text t) {
		int count=0;
		for (int i=0;i<t.a.length();i++)
			//verify if the character from string is a letter 
			//if it is i take it in account 
			if (t.a.charAt(i)>=65 && t.a.charAt(i)<=90  || t.a.charAt(i)>=97 && t.a.charAt(i)<=122)count++;
		System.out.println("Number of letters is : "+count);
	}
	static void v_c(text t) {
		int count=0,count1=0;
		for (int i=0;i<t.a.length();i++) {
			//verify the number of vowels 
			if (t.a.charAt(i)=='A'||t.a.charAt(i)=='a'||t.a.charAt(i)=='E'||t.a.charAt(i)=='e'||t.a.charAt(i)=='I'||t.a.charAt(i)=='i'||t.a.charAt(i)=='O'||t.a.charAt(i)=='o'||t.a.charAt(i)=='U'||t.a.charAt(i)=='u'||t.a.charAt(i)=='Y'||t.a.charAt(i)=='y')
				count++;
			//if its a letter and it is not a vowels is a consonant
			//I verify this 
			else if (t.a.charAt(i)>=65 && t.a.charAt(i)<=90  || t.a.charAt(i)>=97 && t.a.charAt(i)<=122) count1++;
		}
		System.out.println("Number of vowels is : "+count);
		System.out.println("number of consonants is : "+count1);
	}
}
