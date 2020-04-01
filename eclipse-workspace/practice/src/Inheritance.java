class A{
	void a() {
		System.out.println("I am a() method");
	}
}

class B extends A{
	void b() {
		System.out.println("I am b() method");
	}
}

class P{
	void p() {
		System.out.println("I am p() method");
	}
}


class Q extends P{
	void q() {
		System.out.println("I am q() method");
	}
}

class R extends Q{
	void r() {
		System.out.println("I am r() method");
	}
}

class U{
	void u() {
		System.out.println("I am u() Method");
	}
}

class V extends U{
	void v() {
		System.out.println("I am v() method");
	}
}

class W extends U{
	void w() {
		System.out.println("I am w() method");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		System.out.println("Single Inheritance");
		
		B b = new B();
		b.b();
		b.a();
		
		A a = new A();
		a.a();
		
		System.out.println("MultiLevel Inheritance");
		Q q = new Q();
		q.p();
		q.q();
		
		R r = new R();
		r.p();
		r.q();
		r.r();
		
		System.out.println("Hierarchial Inheritance");
		V v = new V();
		v.u();
		v.v();
		
		W w = new W();
		w.u();
		w.w();
	}
}
