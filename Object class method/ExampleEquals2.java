class Employee{
      int eid;
      String ename;

    Employee(int eid,String ename){
      this.eid = eid;
      this.ename = ename;
}

      public boolean euqals(Object obj){
       
       Employee obj2 = (Employee)obj;

        if((this.eid==obj2.eid)&&(this.ename==obj2.ename))
             return true;

       return false;
}

      public String toString(){

         return "Eid : "+eid+", Ename : "+ename;
    }
}
class ExampleEquals2{

   public static void main(String[] args) {
         Employee obj1 = new Employee(1,"Ramesh");
         Employee obj2 = new Employee(2,"Suresh");

         System.out.println(obj1==obj2); // false  hashcode are not same 

         System.out.println(obj1.euqals(obj2)); // false // attribute are not same 

         Employee obj3 = new Employee(1,"Ramesh");
         System.out.println(obj1.euqals(obj3)); // true 
     }
}