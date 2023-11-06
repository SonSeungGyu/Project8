package polymorphism.quiz;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {
		ArrayList<Customer> list = new ArrayList<Customer>();
//		Customer customer = new Customer("둘리");
//		Customer customer2 = new VIPCustomer("또치");
//		Customer customer3 = new GOLDCustomer("마이콜");
//		list.add(customer);
//		list.add(customer2);
//		list.add(customer3);
		list.add(new Customer("둘리"));
		list.add(new VIPCustomer("또치"));
		list.add(new GOLDCustomer("도우너"));
		
//		for (Customer customers : list) {//람다식 for문
//			customers.calcPrice(10000);
//		}
		for (int i = 0; i < list.size(); i++) {//일반 for문 이용
			list.get(i).calcPrice(10000);
		}
//		for (Customer customers : list) {
//			customers.showInfo();
//		}
		for (int i = 0; i < list.size(); i++) {
			list.get(i).showInfo();
		}
		
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
		//System.out.println("Customer() 생성자 호출");
		
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
		
		//System.out.println("VIPCustomer() 생성자 호출");//생성자 호출 문장
	}

	@Override//annotation
	public void calcPrice(int price) {
		
		bonusPoint = bonusPoint + (price * bonusRatio);
		
		int salePrice = price - (int)(price * saleRatio);
		
		System.out.println(customerName + "님이 " + salePrice + "원을 결제했습니다.");
		
	}
	
}



//새로운 등급의 클래스 선언
class GOLDCustomer extends Customer{
	double saleRatio;

	public GOLDCustomer(String customerName) {
		super(customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;//보너스 포인트 2%
		saleRatio = 0.1; //할인률 10%
	}

	@Override
	public void calcPrice(int price) {
		
		bonusPoint = bonusPoint + (price * bonusRatio);
		
		int salePrice = price - (int)(price * saleRatio);
		
		System.out.println(customerName + "님이 " + salePrice + "원을 결제했습니다.");
		
	}
	
}






