import java.nio.channels.ScatteringByteChannel;

public class Employee {
    private String name;
    private int age;
    private String position;


  /*  public Employee()
    {
        this.name = empName;
        this. age = age;
        this.position = empPosition;
    }*/

    public String getName() throws Exception {
        Exception e = new Exception();
        throw e;
        throw new Exception();
        Base e = new Base();
        foo(e);

        //return name;
    }
    public void foo(Base aastha)
    {

    }

    try
    {
        obj.getName();
    }
    catch(Exception aastha)
    {
        System.out.println(aastha.getMessage());
    }

    public void setName(String empName) throws Exception {
        this.name = empName;
        getName();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String empPosition) {
        this.position = empPosition;

    }

    public static void main(String[] args) {

        try {
            Employee employee = new Employee();
            //employee.setName(null);
            employee.setName("bob");

        }
        catch (Exception e){
            System.out.println("exception caught" + e.getMessage());
        }

    }
}