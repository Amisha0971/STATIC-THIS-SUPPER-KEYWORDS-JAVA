package keywords;

class Parent {
    void display() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void display() {
        super.display(); // Calls Parent's display method
        System.out.println("Child class");
    }
}
public class ThisSuperExample {

	public static void main(String[] args) {
		Child c = new Child();
		c.display();
	}

}
