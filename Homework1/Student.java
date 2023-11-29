package homework1;

public class Student {
	static int idSeed =1;
	private int id;
	private String name;
	private int age;
	private String parent;
	private String email;
	
	
	public Student(String name, int age, String parent, String email) {
		this.name = name;
		this.age = age;
		this.parent = parent;
		this.email = email;
		this.id = idSeed++;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
