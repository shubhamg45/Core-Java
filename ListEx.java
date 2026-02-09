import java.util.*;
class ListEx{
	public static void main(String[] args) {
		LinkedList<Integer> list= new LinkedList<>();

		for (int i=1;i<15;i++ ) {
			list.add((int )(Math.random()*100));
		}
		System.out.println(list);

		// for (int i=list.size()-1;i>=0 ;i-- ) 
		// {
		// 	Integer ele =list.get(i);
		// 	if (ele%2!=0) {
		// 		list.remove(ele);
		// 	}
		// }
		// System.out.println(list);

		for(int i=0;i<list.size();i++){
			Integer ele=list.get(i);
			if(ele%2!=0) list.remove(ele);
		}
	}
}