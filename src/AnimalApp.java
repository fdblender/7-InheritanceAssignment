
public class AnimalApp {

	public static void main(String[] args) {

		Animal a = new Animal();
		a.eats();
		a.sleeps();

		Cat c = new Cat("Tabby");
		System.out.println(c.toString());
		c.eats();
		c.sleeps();
		c.meows();
		
		Dog d = new Dog();
		d.eats();
		d.sleeps();
		d.barks();

		Bird b = new Bird();
		b.eats();
		b.sleeps();
		b.flies();

	}
}
