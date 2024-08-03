abstract class Employee{
    private String name;

    private int id;

    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }
    public String getName(){
        return name;

    }
    public int getId(){
        return id;
    }

    public abstract double calculateSalary();

    @Override

    public String toStirng(){
        return "Employee [name="+name+", id="+id", Salary="+calculateSalary()+"]";
    }

}


class FullTimeEmployee extends Employee{

    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary){
        super(name, id);
        this.monthlySalary = monthlySalary;

    }

    @Override
    public double calculateSalary(){
        return monthlySalary; 

    }
}

class PartTimeEmployee extends Employee{
    private int hoursWorked;

    private double houurlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double houurlyRate){
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.houurlyRate = houurlyRate;
    }

    @Override

    public double calculateSalary(){
        return hoursWorked = houurlyRate;

    }

}




class PayrollSystem{

    private ArrayList<Employee> employeeList;


    public PayrollSystem(){
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void removeEmployee(int id){
        Employee employeeToRemove = null;
        for(Employee employee : employeeList){
            if(employee.getId()==id){
                employeeToRemove = employee;
                break;
            }
        }
        if(employeeToRemove != null){
            employeeList.remove(employeeToRemove);
        }
    }


    public void displayEmployees(){
        for(Employee employee: employeeList){
            System.out.println(employee);
        }
    }

}



public class Main{
    public static void Main(String[] args){
        PayrollSystem PayrollSystem = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee(name:"om", id:1, monthlySalary:50000);
        PartTimeEmployee emp2 = new PartTimeEmployee(name:"swara", id:2, hoursWorked:48, houurlyRate: 100);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        System.out.println("Initial Employee Details: ");
        payrollSystem.displayEmployees();
        System.out.println("Removing employees");
        payrollSystem.removeEmployee(id: 2);
        System.out.println("Remaining Employees details: ");
        payrollSystem.displayEmployees(); 
    }
}