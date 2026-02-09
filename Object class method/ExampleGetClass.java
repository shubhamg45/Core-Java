/*
The getClass() is used to fetch the runtime name of a class.

This method returns an instance of that particular class.
*/
class Student{
        int id;
        String name;


        Student(int id,String name){
        this.id=id;
        this.name=name;
        }
}
class ExampleGetClass{

        public static void main(String[] args) {

        Student obj1 = new Student(1,"Ramesh");
        System.out.println(obj1.getClass()); // class Student

        String str = new String("Hello");
        System.out.println(str.getClass()); // class java.lang.String
        
        Integer a = new Integer(10);
        System.out.println(a.getClass()); // class java.lang.Integer

        /* warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
        Integer a = new Integer(10); */
}
}