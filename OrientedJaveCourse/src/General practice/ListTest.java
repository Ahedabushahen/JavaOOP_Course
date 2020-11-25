import java.util.ArrayList;

// list is an interface !
/*Most be imported 
 * Deletion and Addition > Linked list, will be used in case of a lot 
 * addition and deletion no order matters
 * Search methods > ArrayList - order matters, search and find quickly.
 * Memory > ArrayList
 */
public class ListTest {
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		ArrayList<Integer> l2 = new ArrayList<Integer>(); // creating new Arraylist
		l1.add(5);
		l1.add(1,4);
		l2.add(3);
		l2.add(2);
		l1.addAll(l2); // Adds all of l2 into l1
		for(int i=0; i<l1.size();i++) {
			System.out.println(l1.get(i));
			
		}
		
	}
}
