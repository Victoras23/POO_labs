class H extends G{
	protected String h;
	private static X x= new X("x2x");
	H(String a, String x, String b, String c, String d, String e, String f, String g, String h) {
		super(a, x, b, c, d, e, f, g);
		this.h=h;
	}
	static X getX() {
		return x;
	}

}