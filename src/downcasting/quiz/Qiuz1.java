package downcasting.quiz;

import java.util.ArrayList;

public class Qiuz1 {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Student("둘리"));
		list.add(new Worker("또치"));
		for (Person person : list) {
			person.eat();
		}
		for (int i = 0; i < list.size(); i++) {
			
			Person per = list.get(i);
			if(per instanceof Student) {
				((Student)per).study();
			}else if(per instanceof Worker) {
				((Worker)per).working();
			}
		}
	}
}

class Person{
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
	public void eat() {
		System.out.println(name + "가 밥을 먹는다.");
	}
	
}

class Student extends Person{
	
	public Student(String name){
		super(name);
	}
	
	public void study() {
		System.out.println(name + " 학생이 공부를 한다.");
	}
}

class Worker extends Person{
	public Worker(String name) {
		super(name);
	}
	public void working() {
		System.out.println(name+" 회사원이 일을 한다.");
	}
	
}
