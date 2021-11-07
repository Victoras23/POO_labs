public class Part1 {
	public static void main(String[] args) {
		A a=new A("a","x");
		B b=new B("a","x","b");
		C c=new C("a","x","b","c");
		D d=new D("a","x","b","c","d");
		E e=new E("a","x","b","c","d","e");
		F f=new F("a","x","b","c","d","e","f");
		G g=new G("a","x","b","c","d","e","f","g");
		H h=new H("a","x","b","c","d","e","f","g","h");
		I i=new I("a","x","b","c","d","e","f","g","h","i");
		J j=new J("a","x","b","c","d","e","f","g","h","i","j");
		System.out.println("Class A : a: "+a.a+" x: "+a.x.x);
		System.out.println("Class B : a: "+b.a+" b: "+b.b+" x: "+b.x.x);
		System.out.println("Class C : a: "+c.a+" b: "+c.b+" c: "+c.c+" x: "+c.x.x);
		System.out.println("Class D : a: "+d.a+" b: "+d.b+" c: "+d.c+" d: "+d.d+" x: "+d.x.x);
		System.out.println("Class E : a: "+e.a+" b: "+e.b+" c: "+e.c+" d: "+e.d+" e: "+e.e+" x: "+e.x.x);
		System.out.println("Class F : a: "+f.a+" b: "+f.b+" c: "+f.c+" d: "+f.d+" e: "+f.e+" f: "+f.f+" x: "+f.x.x);
		System.out.println("Class G : a: "+g.a+" b: "+g.b+" c: "+g.c+" d: "+g.d+" e: "+g.e+" f: "+g.f+" g: "+g.g+" x: "+g.x.x);
		System.out.println("Class H : a: "+h.a+" b: "+h.b+" c: "+h.c+" d: "+h.d+" e: "+h.e+" f: "+h.f+" g: "+h.g+" h: "+h.h+" x: "+h.x.x);
		System.out.println("Class I : a: "+i.a+" b: "+i.b+" c: "+i.c+" d: "+i.d+" e: "+i.e+" f: "+i.f+" g: "+i.g+" h: "+i.h+" i: "+i.i+" x: "+i.x.x);
		System.out.println("Class J : a: "+j.a+" b: "+j.b+" c: "+j.c+" d: "+j.d+" e: "+j.e+" f: "+j.f+" g: "+j.g+" h: "+j.h+" i: "+j.i+" j: "+j.j+" x: "+j.x.x);
	}
}
class A{
	protected String a;
	protected X x = new X("x");
	A(String a , String x){
		this.a=a;
		this.x= new X("x");
	}
}

class B extends A{	
	protected String b;
	B(String a, String x , String b) {
		super(a, x);
		this.b=b;
	}

}

class C extends B{
	protected String c;
	C(String a, String x, String b, String c) {
		super(a, x, b);
		this.c=c;
	}
	
}

class D extends C{
	protected String d;
	D(String a, String x, String b, String c, String d) {
		super(a, x, b, c);
		this.d=d;
	}
}

class E extends D{
	protected String e;
	E(String a, String x, String b, String c, String d, String e) {
		super(a, x, b, c, d);
		this.e=e;
	}

}

class F extends E{
	protected String f;
	F(String a, String x, String b, String c, String d, String e, String f) {
		super(a, x, b, c, d, e);
		this.f=f;
	}

}

class G extends F{	
	protected String g;
	G(String a, String x, String b, String c, String d, String e, String f, String g) {
		super(a, x, b, c, d, e, f);
		this.g=g;
	}

}

class H extends G{
	protected String h;
	H(String a, String x, String b, String c, String d, String e, String f, String g, String h) {
		super(a, x, b, c, d, e, f, g);
		this.h=h;
	}

}

class I extends H{
	protected String i;
	I(String a, String x, String b, String c, String d, String e, String f, String g, String h, String i) {
		super(a, x, b, c, d, e, f, g, h);
		this.i=i;
	}

}

class J extends I{
	protected String j;
	J(String a, String x, String b, String c, String d, String e, String f, String g, String h, String i, String j) {
		super(a, x, b, c, d, e, f, g, h, i);
		this.j=j;
	}

}

class X {
	protected String x;
	X(String x){
		this.x=x;
	}
}
