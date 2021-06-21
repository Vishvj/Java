import java.rmi.*;

public interface convert_interface extends Remote
{
public   double convert_temp(double c) throws RemoteException;
public  double dollar_rupee(double d) throws RemoteException;
public  double degree_radian(double deg) throws RemoteException;

} 
