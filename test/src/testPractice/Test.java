package testPractice;

public class Test {
public static void main(String[] args) {
Test t1=new Test();
t1.add();
	System.out.println("\"hello\"");
}
public static void demo() {
	System.out.println("Accessing static method from non static method" );
}
public void add() {
	addPro();
	this.addPro();
	System.out.println(" non static method");

}
public void addPro() {
	demo();
	Test.demo();
	Test t1=new Test();
	t1.demo();
	System.out.println("non static access");
}
}
