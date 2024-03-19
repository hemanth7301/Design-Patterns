package ProxyPattern;

public class EmployeeImpl implements EmployeeDao{
    public void create(String client,EmployeeDo empObj){
        System.out.println("Created an employee Object");
    }
    public void delete(String client,int employeeID){
        System.out.println("Deleted an employee Object");
    }
    public EmployeeDo get(String client,int employeeID){
        System.out.println("Fetching an employee Object");
        return new EmployeeDo();
    }
}
