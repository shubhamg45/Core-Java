// if else if ladder
import java.util.Scanner;
class ExamScore
{
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Marks : ");
        int marks = sc.nextInt();
         int totalMarks= 500;

        if(marks<0 || marks>500)
        {
        	System.out.println("you Enter Wrong Marks plese enter coorect Marks ");
        	return;
        }
         double percentage = (marks*100)/totalMarks;
          if (percentage>=90 && percentage<=100) {
          	System.out.println(percentage+ "Outstanding  you get O grade");
          	
          }
          else if (percentage>=75 && percentage<=89) {
          	System.out.println(percentage+ "  First class With Distinction  you get A grade");
          	
          }
          else if (percentage>=60 && percentage<=74) {
          	System.out.println(percentage+ " First class   you get B grade");
          	
          }
          else if (percentage>=50 && percentage<=59) {
          	System.out.println(percentage+ " Second  class With Distinction  you get c grade");
          	
          }
          else if (percentage>=35 && percentage<=49) {
          	System.out.println(percentage+ " pass  With Distinction  you get P grade");
          	
          }
          else {
          	System.out.println(percentage+ " Fail With Distinction  you get  F grade");
          	
          }

          }


	}
