class ExampleEquals{
     public static void main(String[] args) {
         String str1 = new String("hello");
         String str2 = new String("hello");

         System.out.println(str1==str2);  //   false // cheaks hashcode
         System.out.println(str1.equals(str2)); // true  // cheaks attribute 

         Demo obj1 = new Demo();
         Demo obj2 = new Demo();
         Demo obj3 = obj2;

         System.out.println(obj1==obj2); //false
         System.out.println(obj2==obj3); //true
         System.out.println(obj1.equals(obj2)); //false
       }
}
class Demo{

}