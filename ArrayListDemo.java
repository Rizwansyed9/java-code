import java.util.*;
class ArrayListDemo{
	public static void main(String[] args){
		ArrayList l=new ArrayList();
		l.add("A");
		l.add(100);
		l.add("A");
		l.add(null);
		l.add(2);
		System.out.println(l);
		l.remove(3);
		System.out.println(l);
		l.remove(new Integer(100));
		System.out.println(l);
		l.add("Main");
		l.add("n");
		System.out.println(l);
		List l1=Collections.unmodifiableList(l);
		l.add("Anushka");
		System.out.println(l);
		


	}
}