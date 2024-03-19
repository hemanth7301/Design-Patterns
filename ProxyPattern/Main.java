package ProxyPattern;

public class Main {
    public static void main(String args[]) {
        try{
            EmployeeDao employeeDao = new EmployeeProxy();
            employeeDao.create("ADMIN", new EmployeeDo());

            //employeeDao.delete("USER", 1);
            employeeDao.delete("ADMIN", 1);

            employeeDao.get("USER", 1);
            employeeDao.get("ADMIN", 1);

            employeeDao.create("USER", new EmployeeDo());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
