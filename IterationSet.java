package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterationSet {
	public static void main(String[] args) {
		Set<String> s= new HashSet<String>();
		s.add("Mohan");
		s.add("vamsi");
		s.add("Venkat");
		s.add("Ramana");
		Iterator<String> l=s.iterator();
		while(l.hasNext()){
			String m=l.next();
			System.out.println(m);
		}
	}
}
