import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.RemoteException;

public class client {
	public static void main(String[] args){
	    try{
		 Registry registre=LocateRegistry.getRegistry("localhost",1099);
		 interfac monservice =(interfac) registre.lookup("monservice");
		 int add = monservice.addition(1,2);
		 int mul = monservice.multiplication(2,2);
		 System.out.println("somme est:"+add);
		System.out.println("produit est:"+mul);
}catch(Exception e){
           e.printStackTrace();}
}
}					
