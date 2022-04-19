public class Employee extends Manager{
    Employee(String name, int id, int salary) {
		super(name, id, salary);
    	//this.name=name;
	}
	public static void main(String[] args) {
    Manager m=new Manager("Gokul",26,30000);
	System.out.println("Employee Details are: ");
	System.out.println(m.name);
	System.out.println(m.id);
	System.out.println(m.salary);
	}
}
