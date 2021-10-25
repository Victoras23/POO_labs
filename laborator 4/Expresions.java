class Expresions {
	static String exp;
	Expresions(String s) {
		exp=s;
	}
	static boolean countParentheses() {
		int parentheses=0;
		for (int i=0;i<exp.length();i++)
			if(exp.charAt(i)=='(')parentheses++;
			else if(exp.charAt(i)==')')parentheses--;
		if (parentheses!=0)return false;
		else return true;
	}
	static boolean result() {
		StringBuilder s = new StringBuilder(exp);
		for (int i=0;i<s.length();i++) {
			if (s.charAt(i)==')')
				for(int j=i;j>=0;j--) {
					boolean cont,contIf;
					cont=false;
					contIf=false;
					if(s.charAt(j)=='(') {
						s.setCharAt(i, ' ');
						s.setCharAt(j, ' ');
						cont=true;
						contIf=true;
						break;
					}
					if(cont && contIf)return false;
				}		
		}
		return true;
	}
	static void output(String s) {
		if (countParentheses()) {
			if(result()) {
				System.out.println(exp+ " is a corent mathematical expression ");
			}
			else System.out.println(exp+ " is an incorent mathematical expression ");
		}
		else System.out.println(exp+ " is an incorent mathematical expression ");
	}
}
