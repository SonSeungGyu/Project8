package override.quiz;

public class Quiz1 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		cat.eat();
		cat.balk();
		dog.eat();
		dog.balk();
	}
}


class Animal{
	public void eat() {
		System.out.println("잡식이야");
	}
	
	public void balk() {
		System.out.println("우와아아아앙 하고 울어");
	}
}

class Cat extends Animal{
	public void eat() {
		System.out.println("고양이는 쥐를 먹는다.");
	}
	
	public void balk() {
		System.out.println("고양이는 야옹하고 짖는다.");
	}
}

class Dog extends Animal{
	public void eat() {
		System.out.println("개는 고기를 먹는다.");
	}
	
	public void balk() {
		System.out.println("개는 멍멍하고 짖는다.");
	}
}
