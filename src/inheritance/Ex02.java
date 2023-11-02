package inheritance;

public class Ex02 {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.sound();//부모로 부터 상속을 받아 부모가 가진 메소드를 이용 가능
		stu.eat();
		stu.study();
		
		Professor pro = new Professor();
		pro.sound();//부모로 부터 상속을 받아 부모가 가진 메소드를 이용 가능
		pro.eat();
		pro.wokr();
		
		Person per = new Person();
//		per.study();//부모가 자식의 메소드는 이용하지 못 함
	}
}

class Person{
	
	public void sound() {
		System.out.println("대화를 한다");
	}
	
	public void eat() {
		System.out.println("밥을 먹는다");
	}
}

//-----------------위의 Person클래스를 상속 받는 두 클래스
class Student extends Person{
	public void study() {
		System.out.println("공부를 한다");
	}
}

class Professor extends Person{
	public void wokr() {
		System.out.println("일을 한다");
	}
}
