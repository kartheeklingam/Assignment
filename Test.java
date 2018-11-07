import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test{

	public static void main(String[] args){
	
		
		ArrayList<Customer> arrayList = new ArrayList<>();
		
		arrayList.add(new Customer(1,"John","john@gmail.com","ABC"));
		arrayList.add(new Customer(3,"Harry","harry@gmail.com","DEF"));
		arrayList.add(new Customer(4,"Alicia","alicia@gmail.com","GHI"));
		arrayList.add(new Customer(2,"Mel","mel@gmail.com","JKL"));
		arrayList.add(new Customer(5,"Ron","ron@gmail.com","MNO"));
		
		Collections.sort(arrayList, ItemNameComparator());
		
		for (Customer customer : arrayList) {
			System.out.println(customer);
		}
		
	
		
		
		
		}

	private static Comparator ItemNameComparator() {
		// TODO Auto-generated method stub
		return null;
	}
		
		}
		
		
	

