class Employee{
	String name;
    int age;
    String position;
    double salary;
    String email;

    Employee(String name,int age,String position,double salary,String email){
    	super();
    	this.name=name;
    	this.age=age;
    	this.position=position;
    	this.salary=salary;
    	this.email=email;
    }
    public void displayEmployee(){
    	System.out.println(" EMP DETAILS ");
    	System.out.println("NAME : "+name);
    	System.out.println("AGE : "+age);
    	System.out.println("POSITION : "+position);
    	System.out.println("SAL : "+salary);
    	System.out.println("EMAIL : "+email);
    }
}
class Department{
    String dName;
    int deptId;
    int floor;
    int numEmployees;
    String manager;

    Department(String dName,int deptId,int floor,int numEmployees,String manager){
    	super();
    	this.dName=dName;
    	this.deptId=deptId;
    	this.floor=floor;
    	this.numEmployees=numEmployees;
    	this.manager=manager;
    }
    public void displayDeparment(){
    	System.out.println("DEPATMENT DETAILS ");
    	System.out.println("Depatment Name : "+dName);
    	System.out.println("Depatment ID : "+deptId);
    	System.out.println("Floor : "+floor);
    	System.out.println("Number Of Employee : "+numEmployees);
    	System.out.println("Manager Name : "+manager);
    }
}
class Company{
    String companyName;
    String location;
    int establishedYear;
    Employee employee=new Employee("Ajit Pawar",28,"Senior loan agent",32000,"scammerajit70000cr@gmail.com");      
    Department department=new Department("Finanace",1001,5,150,"Devendra Fadanvis"); 

    Company(String companyName,String location,int establishedYear){
    	super();
    	this.companyName=companyName;
    	this.location=location;
    	this. establishedYear=establishedYear;
    	this.employee=employee;
    	this.department=department;

    	// Employee employee = new Employee("Ajit Pawar", 28, "Senior loan agent", 32000, "ajit@example.com");      
        // Department department = new Department("Finance", 1001, 5, 150, "Devendra");

    }
    public void displayCompany(){
    	System.out.println("Company Details ");
    	System.out.println("Company Name : "+companyName);
    	System.out.println("Location : "+location);
    	System.out.println("ESTAB. Year : "+establishedYear);
    }
}
class CompositionDriver{
	public static void main(String[] args) {

		Company company =new Company("MAHARASHTRA FUND LTD.","Mumbai",2024);
		company.displayCompany();
		company.employee.displayEmployee();
		company.department.displayDeparment();
		
	}
}