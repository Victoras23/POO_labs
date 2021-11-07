class D extends C{
	protected String d;
	protected X x = new X("x1x");
	D(String a, String x, String b, String c, String d) {
		super(a, x, b, c);
		this.d=d;
	}
}
