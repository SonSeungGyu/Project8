package inheritance.quiz;

public class Quiz {
	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.foot = 4;
		t.tail = 1;
		System.out.println("다리 : " + t.foot + "개, 꼬리 : " + t.tail + "개");
		Eagle e = new Eagle();
		e.foot = 2;
		e.wing = 2;
		System.out.println("다리 : " + e.foot + "개, 날개 : " + e.wing + "개");
	}
}

class Animal{
	int foot;
}

class Tiger extends Animal{
	int tail;
}

class Eagle extends Animal{
	int wing;
}
