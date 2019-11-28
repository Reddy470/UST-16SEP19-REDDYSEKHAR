
public class NewInstance
{  
String str="hello";  
public static void main(String args[])  
{  
try  
{  
//creating object of class  
NewInstance obj= NewInstance.class.newInstance();   
System.out.println(obj.str);          
}  
catch(Exception e)  
{  
e.printStackTrace();  
}  
}  
} 