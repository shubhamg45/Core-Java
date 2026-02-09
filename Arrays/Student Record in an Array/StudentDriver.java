import java.util.Arrays;
class StudentDriver{
	public static void main(String[] args) 
	{
		Student[] db1=new Student[2];
		db1[0]=new Student("RAM",24,1234,81.12,"FC CLG");
		db1[1]=new Student("SHYAM",22,1334,56.21,"SP CLG");

		Student[]db2=new Student[4];
		db2[0]=new Student("Mahesh",23,3412,56.21,"DYP CLG");
		db2[1]=new Student("GANESH",27,4125,61.16,"TMV CLG");
		db2[2]=new Student("RAMESH",21,1334,69.98,"MCOE CLG");
		db2[3]=new Student("SURESH",19,1334,86.66,"CORP CLG");


		showDB(db1,db2);
		System.out.println();

		Student []mAr=margeDB(db1,db2);
		System.out.println("Merge arr"+Arrays.toString(mAr));
		System.out.println();

		System.out.println("Topper is : "+findTopper(db2));
		System.out.println();

		System.out.println("Youngest Student From Merge arr : "+youngestStudent(mAr));
		System.out.println();


     }
          public static void showDB(Student[]db1,Student[]db2)
          {
          	for (int i=0;i<db1.length ;i++ ) {
          		System.out.println(db1[i]);
          	}
          	for (int i=0;i<db2.length ;i++ ) {
          		System.out.println(db2[i]);
          	}
          } 
          public static Student findTopper(Student[]ar)
          {
              double max=0;
              Student ans=ar[0];

              for (int i=0;i<ar.length ;i++ ) 
              {
              	
              	if (ar[i].per>max) 
              	  {
              		max=ar[i].per;
              		ans=ar[i]; 
                 }             	 
              }
              return ans;
 
          }
          public static Student [] margeDB(Student[]db1,Student[]db2)
          {

          	Student[]ans=new Student[db1.length+db2.length];

          	for (int i=0;i<ans.length ;i++ ) {
          		if (i<db1.length) {
          			ans[i]=db1[i];
          		}
          		else{
          			ans[i]=db2[i-db1.length];
          		}
          	}
          	return ans;
          }

          public static Student youngestStudent(Student[]mAr){
          	int minAge=mAr[0].age;
          	Student ans=null;

          	for (int i =0;i<mAr.length ;i++ ) {
          		if (mAr[i].age<minAge) {
          			
          			minAge=mAr[i].age;
          			ans=mAr[i];
          		}
          	}
          	return ans;
          }
}