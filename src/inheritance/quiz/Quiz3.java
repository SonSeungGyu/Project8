package inheritance.quiz;

public class Quiz3 {
	public static void main(String[] args) {
		System.out.println("------------볼펜----------------------");
		BallPen ballPen = new BallPen();
		ballPen.showInfo();
		
		System.out.println("-----------만년필----------------------");
		FountainPen fountainPen = new FountainPen();
		fountainPen.showInfo();
	}
}

class Pen{
	int width;
	String amount;
}

//볼펜 클래스 
class BallPen extends Pen{
	String color;
	
	//기본 생성자
	public BallPen() {
		width = 2;
		amount = "100%";
		color = "파랑색";
		
	}
	
	public void showInfo() {
		System.out.println("펜의 굵기 : " + width);
		System.out.println("남은양 : " + amount);
		System.out.println("볼펜의 색 : " + color);
	}
}

//만년필 클래스
class FountainPen extends Pen{
	String brand;
	
	//기본 생성자
	public FountainPen() {
		width = 3;
		amount = "80%";
		brand = "몽블랑";
	}
	
	public void showInfo() {
		System.out.println("펜의 굵기 : " + width);
		System.out.println("남은양 : " + amount);
		System.out.println("볼펜의 색 : " + brand);
	}
}
