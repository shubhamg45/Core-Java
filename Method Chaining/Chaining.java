class MyInterger{
    int number;

    MyInterger(int number){
        this.number=number;
    }
    public int displayMyInterger(){
        return number;
    
    }
    public MyInterger removeEven(){
        String op= "";
        for(int i =number;i>0;i/=10){
            int rem = i%10;
            if (rem%2!=0) {
                op=rem+op;
            }
        }
        number=Integer.parseInt(op);
        return this;
    }
    public MyInterger sumMyInterger(){
        int sum=0;
        for(int i=number;i>0;i/=10){
            int rem= i%10;
            sum+=rem;
        }
        number=sum;
        return this;
    }
    public MyInterger reverseNum(){
        int rev=0;
        for (int i=number;i>0;i/=10) {
            int rem =i%10;
            rev=rev*10+rem;    
        }
        number=rev;
        return this;
    }

}

class Chaining{
    public static void main(String[] args) {

    MyInterger obj=new MyInterger(76554874);
    obj.removeEven().sumMyInterger().reverseNum();
    System.out.println(obj.displayMyInterger());

     MyInterger obj1=new MyInterger(54356874);
    obj1.sumMyInterger().removeEven().reverseNum();
    System.out.println(obj1.displayMyInterger());

     MyInterger obj2=new MyInterger(54873564);
    obj2.reverseNum().removeEven().sumMyInterger();
    System.out.println(obj2.displayMyInterger());

     
    }
}