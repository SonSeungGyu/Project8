package typecasting.quiz;

public class Quiz1 {
	public static void main(String[] args) {
		Parents pc = new Child("한국","고","길동");
		pc.showInfo();
		
		//System.out.println(pc.firstName);//이용 불가능
		
	}
}

class Parents{
	String nation;
	String lastName;
	
	public Parents(String nation, String lastName) {//객체를 생성하고 멤버 변수의 값을 초기화 하는 역활
		super();
		this.nation = nation;
		this.lastName = lastName;
	}
	public void showInfo() {
		System.out.println("국적 : " + nation);
		System.out.println("성 : " + lastName);
	}
	
}

class Child extends Parents{
	String firstName;

	public Child(String nation, String lastName, String firstName) {
		super(nation, lastName);
		this.firstName = firstName;
	}
	
	
	public void showInfo() {//오버라이드 규칙에 의해서 실행이 가능
		System.out.println("국적 : " + nation);
		System.out.println("성 : " + lastName);
		System.out.println("이름 : " + firstName);
	}
	
}
