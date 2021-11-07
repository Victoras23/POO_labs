import com.sun.jdi.Field;

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
		java.lang.reflect.Field f1 = null;
		try {
			f1 = H.class.getDeclaredField("x");
		} catch (NoSuchFieldException e1) {
			e1.printStackTrace();
		} catch (SecurityException e1) {
			e1.printStackTrace();
		}
		f1.setAccessible(true);
		X XInH = null;
		try {
			XInH = (X)f1.get(h);
		} catch (IllegalArgumentException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		System.out.println("Class H : a: "+h.a+" b: "+h.b+" c: "+h.c+" d: "+h.d+" e: "+h.e+" f: "+h.f+" g: "+h.g+" h: "+h.h+" x: "+XInH.x);
		System.out.println("Class I : a: "+i.a+" b: "+i.b+" c: "+i.c+" d: "+i.d+" e: "+i.e+" f: "+i.f+" g: "+i.g+" h: "+i.h+" i: "+i.i+" x: "+i.x.x);
		System.out.println("Class J : a: "+j.a+" b: "+j.b+" c: "+j.c+" d: "+j.d+" e: "+j.e+" f: "+j.f+" g: "+j.g+" h: "+j.h+" i: "+j.i+" j: "+j.j+" x: "+j.x.x);
	}
}