import java.util.*;
class Student{
     public static void main(String[] args) {
     	Scanner sc=new Scanner(System.in);
     	System.out.print("Name : ");
     	String name=sc.next();
     	System.out.print("Contact : ");
     	long contact=sc.nextLong();
     	System.out.print("Sub1 : ");
     	int sub1=sc.nextInt();
     	System.out.print("Sub2 : ");
     	int sub2=sc.nextInt();
     	System.out.print("Sub3 : ");
     	int sub3=sc.nextInt();
     	System.out.print("Sub4 : ");
     	int sub4=sc.nextInt();
     	System.out.print("Sub5 : ");
     	int sub5=sc.nextInt();

     	percentage(name,contact,sub1,sub2,sub3,sub4,sub5);
     }
     public static void	percentage(String name,long contact,int ... marks)
     {
       int totalMarks=0;
       for (int ele :marks ) 
       { 
       	totalMarks+=ele;
       }
       System.out.println(totalMarks);
       double percent=(totalMarks/500.0)*100;
       System.out.println("Student Name : "+name);
       System.out.println("Contact No : "+contact);
       System.out.println("Total marks : "+totalMarks);
       System.out.println("gets the total "+ percent+" %");
     }

}