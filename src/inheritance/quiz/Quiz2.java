package inheritance.quiz;

public class Quiz2 {
	public static void main(String[] args) {
		BasicTv b = new BasicTv();
		b.power = "on";
		b.cha = 7;
		b.vol = 20;
		b.showInfo();
		System.out.println();
		
		SmartTv s = new SmartTv();
		s.power = "on";
		s.cha = 11;
		s.vol = 30;
		s.ip = "192.0.0.0";
		s.showInfo();
		System.out.print(", 아이피:"+s.ip);
	}
}

class BasicTv{
	String power;
	int cha;
	int vol;
	
	public void showInfo() {
		System.out.print("전원상태:" + power + ", 채널:"+ cha + ", 소리:" + vol);
	}
}

class SmartTv extends BasicTv{
	String ip;
}
