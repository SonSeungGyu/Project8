package override.quiz;

public class Quiz3 {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.turnOn();
		computer.turnOff();
		Computer computer2 = new NoteBook();
		computer2.turnOn();
		computer2.turnOff();
		
		Computer computer3 = new DeskTop();
		computer3.turnOn();
		computer3.turnOff();
	}
}

class Computer{
	public void turnOn() {
		System.out.println("컴퓨터를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("컴퓨터를 끕니다");
	}
}

class NoteBook extends Computer{
	public void turnOn() {
		System.out.println("노트북을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("노트북을 끕니다");
	}
}

class DeskTop extends Computer{
	public void turnOn() {
		System.out.println("데스크톱을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("데스크탑을 끕니다");
	}
}
