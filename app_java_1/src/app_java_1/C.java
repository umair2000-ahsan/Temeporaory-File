package app_java_1;

public class C {
	C(){
		
	System.out.println(100);
	}
	C(int x){
		this();
	}
	public static void main(String[] args) {
		new C(200);
	}

}
