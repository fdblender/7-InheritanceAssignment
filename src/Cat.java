
public class Cat extends Animal {
	private String name;

	public Cat(String name) {
		this.name = name;
		System.out.println(name+ " is created.");
	}
	public void eats() {
		System.out.println("A cat eats.");
	}

	public void sleeps() {
		System.out.println("A cat sleeps.");

	}
	public void meows() {
		System.out.println("A cat meows.");

	}
	public String toString() {
		return("This cat's name is "+this.name);
	}



}
