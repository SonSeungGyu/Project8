package inheritance.quiz;

public class Quiz4 {
	public static void main(String[] args) {
		Monster monster = new Monster();
		monster.showInfo();
		monster.attack();
		
		System.out.println("---------------------------------");
		
		Slime slime = new Slime();
		slime.showInfo();
		slime.attack();
		slime.useSkill();
	}
}


class Monster{
	int power;
	int strength;
	
	public Monster() {
		power = 10;
		strength = 100;
	}
	
	public void attack() {
		System.out.println("몬스터가 " + power + "만큼 공격했다~!");
	}
	
	public void showInfo() {
		System.out.println("몬스터의 공격력은 " + power + "이고 체력은 " + strength + "이다.");
	}
}

class Slime extends Monster{
	String skill;
	
	public Slime() {
		power = 30;
		strength = 200;
		skill = "마비";
	}
	
	public void useSkill() {
		System.out.println("슬라임이 " + skill + "를 시전했다.");
	}
	
	public void showInfo() {
		System.out.println("몬스터의 공격력은 " + power + "이고 체력은 " + strength + "이다.");
	}
	
	
}
