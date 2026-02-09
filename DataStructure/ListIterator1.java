import java.util.*;
class ListIterator1{
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1;i<=10;i++){
			list.add(i);
		}
		System.out.println(list);
		ListIterator it=list.listIterator();

		System.out.println("\n Forword traverse");

		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}

		System.out.println("\n backword traverse");

		while(it.hasPrevious()){
			System.out.print(it.previous()+" ");
		}
		
	}
}