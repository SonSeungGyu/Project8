package override.quiz;


public class Quiz2 {
	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		coffee.taste();
		Coffee coffee2 = new Ame();
		coffee2.taste();
		Coffee coffee3 = new Latte();
		coffee3.taste();
	}
}

class Coffee{
	public void taste() {
		System.out.println("커피를 마신다.");
	}
}

class Ame extends Coffee{
	public void taste() {
		System.out.println("아메를 마신다.");
	}
}

class Latte extends Coffee{
	public void taste() {
		System.out.println("라떼를 마신다.");
	}
}
