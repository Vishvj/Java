


import java.rmi.*;
import java.rmi.server.*;

public class server extends UnicastRemoteObject implements convert_interface
{


public server() throws  RemoteException
{ }

public double convert_temp(double c) throws RemoteException
 {  
    double f=(1.8*c)+32.0;
    return f;
    
}
public  double dollar_rupee(double d) throws RemoteException
{
    return d*74.63;   
}
public  double degree_radian(double deg) throws RemoteException
{

   return 3.14*deg;
}

   public static void main(String args[]) throws Exception
  {
      server  s_imp=new server();
       Naming.rebind("covertsion",s_imp);
       System.out.println("Server Ready to Receive Request \n");
  }

}
