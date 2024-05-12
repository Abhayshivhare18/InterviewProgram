package prm;

public class Candidat {
  
	int id;
	String name;
    String skill;
    public Candidat(int id, String name, String skill, String age) {
		super();
		this.id = id;
		this.name = name;
		this.skill = skill;
		this.age = age;
	}
	String age;
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
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Candidat [id=" + id + ", name=" + name + ", skill=" + skill + ", age=" + age + "]";
	}
    
    
}
