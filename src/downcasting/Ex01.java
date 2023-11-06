package downcasting;

public class Ex01 {
	public static void main(String[] args) {
		Animal animal = new Human(); //형변환이 일어남 고로 Human클래스의 기능을 이용하지 못 함.
		
		
		if(animal instanceof Human) {//Human 클래스의 기능을 알고 이용하고 싶다면 다운캐스팅을 해야함.
			
			Human human = (Human) animal;
			human.readBook();
		}
		if(animal instanceof Tiger) {//타입이 아니기에 블록내부로 애초에 들어가지 못 함
			Tiger tiger = (Tiger)animal;
			tiger.hunting();
		}
		
		Tiger tiger = (Tiger) animal;//상속관계가 아니기에 형변환이 일어날 수 없다.(런타임 오류:프로그램 실행해야 알 수 있음)
		
	}
}

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다..");
	}

}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}
