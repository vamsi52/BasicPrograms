package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterationList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(13623);
		list.add(31543);
		list.add(98765);
		list.add(12345);
	Iterator<Integer> i=list.iterator();
	while(i.hasNext()){
		int y=i.next();
		System.out.println(y);
		
	}
	/*for(int x:list){
		System.out.println(x);
	}*/
	}

}
