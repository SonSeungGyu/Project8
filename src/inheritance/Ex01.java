package inheritance;

public class Ex01 {
	public static void main(String[] args) {
		Child child = new Child();
		child.nationality = "한구";
		child.lastName = "고";
		child.firstName = "길동";
	}
}

class Parents{
	String nationality;//국적
	String lastName;//성
}

class Child extends Parents{
	String firstName;//이름
	
}
