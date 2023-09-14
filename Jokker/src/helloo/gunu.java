package helloo;

public class gunu {
	public void result(int i) {
		System.out.println(i);
	}
	public void result(String name) {
		System.out.println(name);
	}
	public void result() {
		System.out.println(50);
	}
	

	public static void main(String[] args) {
	gunu obj = new gunu();
	obj.result(45);
	obj.result("Sheeyam");
	obj.result();
	}
	}
	

