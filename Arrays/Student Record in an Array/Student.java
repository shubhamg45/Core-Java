import java.util.Arrays;
class Student{
     String name;
     int age;
     int id;
     double per;
     String collage;

     Student(){
     	super();
     }
     Student(String name,int age,int id,double per,String collage){
     	this.name=name;
     	this.id=id;
     	this.per=per;
     	this.age=age;
     	this.collage=collage;
     }
     @Override
    public String toString(){
        return "[ "+name+" , "+age+" , "+id+" , "+per+" , "+collage+" ]";
    }
}
