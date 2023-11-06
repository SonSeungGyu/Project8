package downcasting;

import java.util.ArrayList;

public class Ex02 {
	public static void main(String[] args) {
	
		ArrayList<Animal> list = new ArrayList<Animal>();
		
		list.add(new Human());
		list.add(new Tiger());
		list.add(new Eagle());
		
		for (int i = 0; i < list.size(); i++) {
			Animal ani = list.get(i);//부모 타입의 참조변수 선언하고 list에서 하나씩 꺼내어 저장
			
			//list의 각 인덱스마다 맞는 객체타입별로 형변환을 해주고 메소드를 호출 해준다.
			if(ani instanceof Human) {
				Human h = (Human)ani;
				h.readBook();
			}else if(ani instanceof Tiger) {
				Tiger t = (Tiger)ani;
				t.hunting();
			}else if(ani instanceof Eagle) {
				Eagle e = (Eagle)ani;
				e.flying();
			}
			
		}
		
	}
}
