package polymorphism.quiz;

public class Quiz1 {
	public static void main(String[] args) {

		runCar(new Bus());
		runCar(new SportsCar());
		

	}

	public static void runCar(Car car) {
		car.run();
	}
}
//	public static void runCar(Bus bus) {   --------다형성을 이용하지 않으면 두개의 메소드를 더 선언 해야했음
//		bus.run();
//	}
//
//	public static void runCar(SportsCar sportsCar) {
//		sportsCar.run();
//	}
//	
//}

class Car {

	public void run() {
		System.out.println("자동차가 달린다.");

	}
}

class Bus extends Car {
	public void run() {
		System.out.println("버스가 달린다.");
	}
}

class SportsCar extends Car {
	public void run() {
		System.out.println("스포츠카가 달린다.");
	}

}
