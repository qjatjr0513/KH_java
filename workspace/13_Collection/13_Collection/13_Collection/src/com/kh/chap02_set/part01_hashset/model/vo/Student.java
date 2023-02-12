package com.kh.chap02_set.part01_hashset.model.vo;

public class Student {
	private String name;
	private int age;
	private int score;
	
	public Student() {
		
	}

	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	@Override
	public int hashCode() { // 홍길동 25 80
		final int prime = 31;
		int result = 1;
		result = prime * result + age; // 31 * 1 + 25 =>56
		result = prime * result + ((name == null) ? 0 : name.hashCode());// 31 * 55 + 100000
		result = prime * result + score;// 31 * ??? + 80
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (score != other.score)
			return false;
		return true;
	}
	
//	@Override
//	public boolean equals(Object obj) { //오버라이드의 규칙 때문에 Object 클래스 사용
//										//Object obj = Student std2
//		// Student 객체.equals(비교할 Student 객체);
//		
//		// Student this			Object obj
//		// this.age				(Student) obj
//		Student other = (Student)obj;
//		
//		//this.name.equals(other.name);
//		//this.age == other.age;
//		//this.score == other.score;
//		if(this.name.equals(other.name) && this.age == other.age && this.score == other.score) {
//			return true;
//		}else {
//			return false;
//		}
//	}
//
//	@Override
//	public int hashCode() {
//		return (name+age+score).hashCode();
//		// name + age + score
//		// "홍길동" + 25 + 80 => "홍길동2580".hashCode();
//		
//	}
	
	
	
}
