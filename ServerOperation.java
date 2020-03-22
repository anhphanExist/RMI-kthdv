import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;


public class ServerOperation extends UnicastRemoteObject implements RMIInterface {
	private static final long serverUID = 1L;
	private List<Student> students;

	protected ServerOperation() throws RemoteException {
		super();
		students = new ArrayList<Student>();
		students.add(new Student("17020589", "Phan Anh", "anhphan.csf@gmail.com", "07-12-99"));
		students.add(new Student("17020671", "Luu Le Tuan Dat", "tad.louis@gmail.com", "28-10-99"));
	}

	// Method helloTo
	@Override
	public String helloTo(String name) throws RemoteException {
		System.err.println(name + "is connected with you!");
		return "Server says hello to" + name;
	}

	@Override
	public String getStudentInfo(String studentId) throws RemoteException {
		for (Student student : students) {
			if (student.getId().equalsIgnoreCase(studentId)) {
				return student.getInfo();
			}
		}
		return "Can't find student";
	}

	public static void main(String[] args) {
		try {
			ServerOperation sv_o = new ServerOperation();
			System.setProperty("java.rmi.server.hostname", "192.168.1.40");
			Naming.rebind("//localhost/MyServer", sv_o);
			System.err.println("Server ready");
		} catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}
	}
}