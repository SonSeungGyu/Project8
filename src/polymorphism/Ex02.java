package polymorphism;


public class Ex02 {
	public static void main(String[] args) {
		Customer customer = new Customer("둘리");
		customer.calcPrice(10000);
		customer.showInfo();
		
		Customer customer2 = new VIPCustomer("또치");
		customer2.calcPrice(10000);
		customer2.showInfo();
		
	}
}

//부모 클래스
class Customer{
	String customerName;//회원 이름
	String customerGrade;//등급
	double bonusPoint; //보너스 포인트
	double bonusRatio; //적립률
	
	
	public Customer(String customerName) {
		super();
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer() 생성자 호출");
		
	}
	
	
	
	//보너스 포인트 적립하고, 지불 가격을 계산하는 메소드
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		System.out.println(customerName + "님이 " + price + "원을 결제했습니다.");
	}
	

	public void showInfo() {
		System.out.println(customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "점 입니다.");
	}
}


//Customer를 상속 받는 클래스
class VIPCustomer extends Customer{
	double saleRatio;
	
	//default constructor
	public VIPCustomer(String customerName) {
		super(customerName);//부모클래스의 매개변수가 있는 생성자 호출
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
		System.out.println("VIPCustomer() 생성자 호출");//생성자 호출 문장
	}

	@Override//annotation
	public void calcPrice(int price) {
		
		bonusPoint = bonusPoint + (price * bonusRatio);
		
		int salePrice = price - (int)(price * saleRatio);
		
		System.out.println(customerName + "님이 " + salePrice + "원을 결제했습니다.");
		
	}
	
	
	
}