package override;

public class Ex02 {
	public static void main(String[] args) {
		Customer vc = new VIPCustomer("둘리");
		
		vc.calcPrice(10000);// 클래스 형변환이 일어난 상태이지만 자식클래스에서 오버라이드 하였기에 호출이 가능하다.
	}
}
