import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

public class ClientOperation {

	private static RMIInterface look_up;

	public static void main(String[] args) 
		throws MalformedURLException, RemoteException, NotBoundException {
		
		look_up = (RMIInterface) Naming.lookup("//localhost/MyServer");
		String studentId = JOptionPane.showInputDialog("Input Student ID:");
			
		String response = look_up.getStudentInfo(studentId);
		JOptionPane.showMessageDialog(null, response);

	}

}