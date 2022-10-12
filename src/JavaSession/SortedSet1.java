package JavaSession;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<String> set = new TreeSet<String>();
		
		set.add("Infosys");
		set.add("IBM");
		set.add("Wipro");
		set.add("google");
		set.add("microsoft");
		set.add("cognizant");
		System.out.println(set);
		
		for(String str : set)
		{
			System.out.println(str);
		}
		System.out.println();
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.headSet("Infosys"));
		System.out.println(set.tailSet("google"));

	}

}
