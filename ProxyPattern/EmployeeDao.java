package ProxyPattern;

public interface EmployeeDao{
    public void create(String client,EmployeeDo empObj) throws Exception;
    public void delete(String client,int employeeID)throws Exception;
    public EmployeeDo get(String client,int employeeID)throws Exception;
}