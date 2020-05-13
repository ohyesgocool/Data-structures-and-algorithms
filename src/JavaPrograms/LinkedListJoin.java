package JavaPrograms;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import org.w3c.dom.Node;

import java.io.*;
public class LinkedListJoin {
	public static LinkedList joinLinkedList (LinkedList a, LinkedList b)
	{
		Set<LinkedList> visited = new HashSet<>();
		visited = (Set<LinkedList>) a.iterator();
		System.out.println(visited);
		if (visited.contains(b.iterator()))
		{
			return b ;
		}
		return null;
		
	}

	public static void main(String[] args) {
		LinkedList<Node> lb = new LinkedList<Node>();
		lb.addLast(1);
		lb.add(1, 12);
		lb.add(3, 15);
		lb.add(4, 12);
		lb.add(5,3);
		LinkedList la = new LinkedList();
		
		la.add(0, 5);
		la.add(1, 9);
		la.add(2, 15);
		la.add(3, 12);
		la.add(4,3);
		joinLinkedList(la,lb);

	}

}
