package DS.Stack;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getString(){
		return "Name: " + this.name + " Age: " + this.age;
	}
}
