import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote {

    public String helloTo(String name) throws RemoteException;

    public String getStudentInfo(String studentId) throws RemoteException;

}