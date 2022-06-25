//Constructor Overlaoding
package app_java_1;

public class B {
	B(){
		System.out.println("This is the first keyword");
	}
	B(int x){
		System.out.println(x);
	}
	B(int x,int y){
		System.out.println(x);
		System.out.println(y);
	}
public static void main(String[] args) {
	new B();
	new B(100);
	new B(200,300);
//	System.out.println(b1);
	
}
 
}
