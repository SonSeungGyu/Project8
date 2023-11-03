package polymorphism;

public class Ex03 {
	public static void main(String[] args) {
		moveAnimal(new Human());//자식 클래스의 객체를 넣어줄 수 있음 왜냐? 자식 클래스가 부모타입이기에
		moveAnimal(new Tiger());
		moveAnimal(new Eagle());
		
	}
	
	//자식클래스인 사람, 호랑이, 독수리를 받을 수 있음.
	//아래의 매개변수는 Animal animal = new Human() 과 같음 
	public static void moveAnimal(Animal animal) {
		animal.move();
	}
	
	//-----다형성을 이용하지 않으면 이렇게 객체마다 메소드를 다 선언해주어야 함
	public static void moveAnimal(Human human) {
		human.move();
	}
	public static void moveAnimal(Tiger tiger) {
		tiger.move();
	}
	public static void moveAnimal(Eagle eagle) {
		eagle.move();
	}
}
