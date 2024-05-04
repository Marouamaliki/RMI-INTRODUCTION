import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class serveur extends UnicastRemoteObject implements interfac{
	protected serveur() throws RemoteException{
		super();
	}
	@Override
        public	int addition(int a,int b) throws RemoteException{
		return a+b;}
	@Override
       public int multiplication(int a,int b) throws RemoteException{
		return a*b;}

public static void main(String[] args){
try{
	interfac service = new serveur();
	Registry registre = LocateRegistry.createRegistry(1099);
	registre.rebind("monservice",service);
        System.out.println("serveur RPC est pret");
}catch(Exception e){
	e.printStackTrace();}
}   	
}
