import java.rmi.Remote;
import java.rmi.RemoteException;

public interface interfac extends Remote{
	int addition(int a,int b) throws RemoteException;
	int multiplication(int a, int b) throws RemoteException;
}

