public class Part1 {
	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		C c=new C();
		D d=new D();
		E e=new E();
		F f=new F();
		G g=new G();
		H h=new H();
		I i=new I();
		J j=new J();
		System.out.println("Class A : a: "+a.a);
		System.out.println("Class B : a: "+b.a+" b: "+b.b);
		System.out.println("Class C : a: "+c.a+" b: "+c.b+" c: "+c.c);
		System.out.println("Class D : a: "+d.a+" b: "+d.b+" c: "+d.c+" d: "+d.d);
		System.out.println("Class E : a: "+e.a+" b: "+e.b+" c: "+e.c+" d: "+e.d+" e: "+e.e);
		System.out.println("Class F : a: "+f.a+" b: "+f.b+" c: "+f.c+" d: "+f.d+" e: "+f.e+" f: "+f.f);
		System.out.println("Class G : a: "+g.a+" b: "+g.b+" c: "+g.c+" d: "+g.d+" e: "+g.e+" f: "+g.f+" g: "+g.g);
		System.out.println("Class H : a: "+h.a+" b: "+h.b+" c: "+h.c+" d: "+h.d+" e: "+h.e+" f: "+h.f+" g: "+h.g+" h: "+h.h);
		System.out.println("Class I : a: "+i.a+" b: "+i.b+" c: "+i.c+" d: "+i.d+" e: "+i.e+" f: "+i.f+" g: "+i.g+" h: "+i.h+" i: "+i.i);
		System.out.println("Class J : a: "+j.a+" b: "+j.b+" c: "+j.c+" d: "+j.d+" e: "+j.e+" f: "+j.f+" g: "+j.g+" h: "+j.h+" i: "+j.i+" j: "+j.j);
	}
}
class A{
	public String a;
}

class B extends A{
	public String b;
}

class C extends B{
	public String c;
}

class D extends C{
	public String d;
}

class E extends D{
	public String e;
}

class F extends E{
	public String f;
}

class G extends F{
	public String g;
}

class H extends G{
	public String h;
}

class I extends H{
	public String i;
}

class J extends I{
	public String j;
}
