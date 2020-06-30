package project2;

public class Demo1 {
public static void main(String[] args) {
	Human ali = new Human();
	ali.name = "Ali";
	ali.age =25;
	ali.country = "India";
	System.out.println(ali.name);
	
	Human h2 = new Human();
	h2.name = "vaibhav";
	h2.age=30;
	h2.country = "nepal";
	System.out.println(h2.name);
	System.out.println(ali.country);
	
}
}


class Human{
	String name;
	int age;
static String country ;

	public void speak(){
		System.out.println(name + " speaking now");
	}
}