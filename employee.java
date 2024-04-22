
import java.util.*;
class employee
{
    public static void main(String[] args) 
    { 
      System.out.println("\n enter the employee name, ---- id,------ slalary");      
      Scanner sc=new Scanner(System.in);
      String n= sc.next();
      int id=sc.nextInt();
      int s=sc.nextInt();
      System.out.format("employee name is :",n);
      System.out.format("employee id is %d \n:",id);
      System.out.format("employee salary  is %d \n:",s);

    }
}