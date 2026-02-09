import java.util.Scanner;
class EvmMachine
{
	static int bjp,con,ss,mns,aap,nota;
	public static void main(String[] args)
	 {

		Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Population : ");
        int pop = sc.nextInt();

        for (int i = 1;i<=pop ;i++ ) {

        	System.out.println();
        	System.out.println(   "    Wel-Come    "  	 );
        	System.out.println();
        	System.out.println("1.BJP");
        	System.out.println("2.CON");
        	System.out.println("3.Shiv Sena");
        	System.out.println("4.MNS");
        	System.out.println("5.AAP");
        	System.out.println("6.NOTA");
        	System.out.println();

        	System.out.println( " Enter your Vote : ");
        	int vote = sc.nextInt();

        	switch(vote)
        	{
        	case 1 :
        		{
        			System.out.println("Acche Din Ayenge ");
        			bjp++;
        			break;
        		}
        		case 2 :
        		{
        			System.out.println("Bharat Jodo ");
        			con++;
        			break;
        		}
        		case 3 :
        		{
        			System.out.println("Hum Hai Asli Sena ");
        			ss++;
        			break;
        		}
        		case 4 :
        		{
        			System.out.println("Jai Maharashtra  ");
        			mns++;
        		    break;
        		}
        		case 5 :
        		{
        			System.out.println("apka Ek Vote Muze Azad kar Dega ");
        			aap++;
        			break;
        		}
        		case 6 :
        		{
        			System.out.println("OHHH YOU ARE EDUCATED THANK YOU GIVE THE CONTRIBUTION TO SAVE OUR STATE");
        			nota++;
        			break;
        		}
        		default :
        		{
        			System.out.println("Invalid Input Entered ");
        			i--;
        			break;
        		}
        	}
        }
        System.out.println();
        if (bjp>=con && bjp>=mns && bjp>=ss && bjp>=aap && bjp>=nota) {
        	System.out.println("BJP won the Election by "+bjp+"votes");	
        }
        else if(con>=bjp && con>=mns && con>=ss && con>=aap && con>=nota) {
        	System.out.println("CONG  won the Election by "+con+"votes");	
        }
        else if(mns>=con && mns>=bjp && mns>=ss && mns>=aap && mns>=nota) {
        	System.out.println("MNS won the Election by "+mns+"votes");	
        }
        else if(ss>=con && ss>=mns && ss>=bjp && ss>=aap && ss>=nota) {
        	System.out.println("Shivsena  won the Election by "+ss+"votes");	
        }
        else if(aap>=con && aap>=mns && aap>=ss && aap>=bjp && aap>=nota) {
        	System.out.println("AAP won the Election by "+aap+"votes");	
        }
        else  
        	System.out.println("Nota Has"+nota+"votes  No one Won The election");
	}
}
