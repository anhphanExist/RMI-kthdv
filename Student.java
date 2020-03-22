public class Student {
	private String Id;
	private String name;
	private String email;
	private String birthday;

	public Student(String Id, String name, String email, String birthday) {
		this.Id = Id;
		this.name = name;
		this.email = email;
		this.birthday = birthday;
	}

	public String getInfo() {
		return String.format("Mssv:" + Id + "\tTen:" + name + "\tEmail:" + email + "\tNgay sinh:" + birthday);
	}

	public String getId() {
		return Id;
	}
}