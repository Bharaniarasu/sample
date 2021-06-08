import java.util.LinkedList;

public class Linked {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(400);
		ll.add(500);
		ll.addFirst(1000);
		ll.addLast(10);
		System.out.println(ll);
		System.out.println(ll.poll());
		//System.out.println(ll.get(4));
		System.out.println(ll);
		ll.offerFirst(20);
		LinkedList ll2=(LinkedList) ll.clone();
		ll.clear();
	System.out.println("cloned ll2 was" +ll2);
		System.out.println(ll);

	}

}
