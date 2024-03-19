package ProxyPattern;

public class EmployeeProxy implements EmployeeDao{
    EmployeeDao employeeDao;
    EmployeeProxy(){
        employeeDao = new EmployeeImpl();
    }
    public void create(String client,EmployeeDo empObj) throws Exception{
        if(client.equals("ADMIN")){
            employeeDao.create(client, empObj);
            return ;
        }
        throw new Exception("Access Denied");
    }
    public void delete(String client,int employeeID)throws Exception{
        if(client.equals("ADMIN")){
            employeeDao.delete(client, employeeID);
            return ;
        }
        throw new Exception("Access Denied");
    }
    public EmployeeDo get(String client,int employeeID)throws Exception{
        if(client.equals("ADMIN")||client.equals("USER")){
            return employeeDao.get(client, employeeID);
        }
        throw new Exception("Access Denied");
    }
}
