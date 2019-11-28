
public class Student {
	int id;
	String name;
    String cname;
    String branch;
    double percentage;
	public Student(int id, String name, String cname, String branch, double percentage) {
		
		this.id = id;
		this.name = name;
		this.cname = cname;
		this.branch = branch;
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cname=" + cname + ", branch=" + branch + ", percentage="
				+ percentage + "]";
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
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
    
    
    
	

}
