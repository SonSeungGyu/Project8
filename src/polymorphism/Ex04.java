package polymorphism;

import java.util.ArrayList;

public class Ex04 {
	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customer1 = new Customer("둘리");
		Customer customer2 = new Customer("또치");
		Customer customer3 = new Customer("도우너");
		Customer customer4 = new VIPCustomer("마이콜");
		Customer customer5 = new VIPCustomer("고길동");
		
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);
		
		System.out.println("---------------------------");
		
		for (Customer customer : customerList) {
			customer.calcPrice(10000);//부모 클래스로 객체가 선언되면 부모의 메소드를 호출
									//자식 객체에서는 오버라이드된 메소드가 호출
		}
		
		for (Customer customer : customerList) {
			customer.showInfo();
		}
	}
}

