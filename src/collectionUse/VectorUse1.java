package collectionUse;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorUse1 {

	public static void main(String[] args)
	{
		Vector<Object>v=new Vector<>();
		
		v.add("Hello");
		v.add('M');
		v.add(3);
		v.add(null);
		v.add("Good");
		v.add("Hello");
		v.add("Bye");
		
		System.out.println(v);
		
		System.out.println(v.contains("Good"));
		
		System.out.println(v.elementAt(4));
		
		System.out.println(v.firstElement());
		
		System.out.println(v.get(6));
		
		System.out.println(v.lastElement());
		
		System.out.println(v.size());
		
		//Static for loop, dyanamic for loop, for each loop,iterator,list-iterator,enumeration
		
		System.out.println("================= static for loop =======================");
		
		for(int i=0;i<=6;i++)
		{
			System.out.println(v.get(i));
		}
		
		System.out.println("================== dynamic for loop=======================");
		
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		
		System.out.println("==================for each loop =======================");
		
		for(Object p:v)
		{
			System.out.println(p);
		}
		
		System.out.println("==================Iterator=======================");
		
		Iterator<Object>it=v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("==================List-Iterator=======================");
		
		ListIterator<Object>li=v.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		System.out.println("==================Enumeration=======================");
		
		Enumeration<Object>enu=v.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
		
		
		
	}

}
