class Student{
       int id;
       String name;
       String edu;
       int yop;

       Student(int id,String name,String edu,int yop)
       {
       this.id = id;
       this.name = name;
       this.edu = edu;
       this.yop = yop;
       }

        @Override
       public String toString(){
       return "id : "+id+", Name : "+name+", Education : "+edu+", YOP : "+yop;
       }
       /*
       if we comment Out this toString overrided method of object class
       then it will return fully Qualified name 
       ie. classname@hashcodevalue

       */
}

class ExampleToString{

       public static void main(String[] args){
       Student obj1 = new Student(1,"Ramesh","BE",2024);
       Student obj2 = new Student(2,"Suresh","BCA",2023);
       Student obj3 = new Student(3,"Ganesh","MCA",2022);
       Student obj4 = new Student(4,"Mukesh","Btech",2021);
       System.out.println(obj1);
       System.out.println(obj2);
       System.out.println(obj3);
       System.out.println(obj4);
   }
}