package project2;

public class StaticInstanceDemo {
public static void main(String[] args) {
	Ali a1 = new Ali();
	a1.speak();
	
	Ali.walk();
	
}
}



class Ali{
	String name; /// instance 
	static String country ;
			
	int add(int a , int b){
		return a+b;
	}
	
	void speak() {
		
	}
	static void walk() {
		
	}
	
	
}

class B{
	
}
