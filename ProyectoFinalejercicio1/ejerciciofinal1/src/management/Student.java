package management;

public class Student {
     
     private Integer id;
     private String email;
     private String lastname;
     private String name;
     private Grades grade;
      public Student (String lastname , String name,String email) {
    	  this.name= name;
    	  this.lastname=lastname;
    	  this.email=email;
    	  this.grade=new Grades();
    	  
      }
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastename(String lastname) {
		this.lastname = lastname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Grades getGrade() {
		return grade;
	}
	public void setGrade(Grades grade) {
		this.grade = grade;
	}
	
      
}