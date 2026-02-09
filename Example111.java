import java.util.*;
class Example111{
	public static void main(String[] args) {
		
		ArrayList<Object>list = new ArrayList<>();
		list.add(10);
		list.add("jhj");
		list.add(20);
		list.add(1231.12);
		list.add('a');
		list.add(false);
		list.add(40);

		System.out.println(list);

		ArrayList<Interger>it= new ArrayList<>();
		Iterator it=list.Iterator();

		while(it.hasNext()){
			Object obj = it.next();
			if(obj instanceof Integer){

			}

		}


	}
}