class Employee{
         int eid;
         String ename;

       Employee(int eid,String ename){
         this.eid = eid;
         this.ename = ename;
         }

        public int hashCode(){
        return eid+ename.hashCode();
        }
}
class ExampleHashCode{
	public static void main(String[] args) {
		Employee obj1 = new Employee(1,"Ramesh");
        Employee obj2 = new Employee(1,"Ramesh");
        Employee obj3 = new Employee(3,"Mahesh");


         // here output is classname@hashcode
        System.out.println(obj1);
        System.out.println(obj2);
        // obj1 and obj2 hashcode are same
        System.out.println(obj3);

        System.out.println(obj1==obj2); // hashcode are same 
        System.out.println(obj1==obj3);
        System.out.println(obj1.equals(obj2)); // attribute are same 
        System.out.println(obj1.equals(obj3));

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        // obj1 and obj2 unique integer value are same 
        System.out.println(obj3.hashCode());
        


		
	}
}