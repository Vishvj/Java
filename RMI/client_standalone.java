

import java.rmi.*;

public class client_standalone
{
   

public static void main(String args[]) throws Exception
{


      
   convert_interface ref=(convert_interface) Naming.lookup("rmi://localhost/covertsion");
   System.out.println("Object found"); 
   System.out.println("Temperature Result is "+ref.convert_temp(10.0));
   
   System.out.println("Rs :"+ ref.dollar_rupee(250)); 
   System.out.println("Radian : "+ ref.degree_radian(90));
    
 
}
}
