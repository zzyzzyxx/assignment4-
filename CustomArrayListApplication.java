package src.com.coderscampus.arraylist;

public class CustomArrayListApplication {

	public static void main(String[] args) {
		CustomList<String> myCustomList = new CustomArrayList<>();
		
		myCustomList.add("element 01");
		myCustomList.add("element 02");
		myCustomList.add("element 03");
		myCustomList.add("element 04");
		myCustomList.add("element 05");
		myCustomList.add("element 06");
		myCustomList.add("element 07");
		myCustomList.add("element 08");
		myCustomList.add("element 09");
		myCustomList.add("element 10");
		myCustomList.add("element 11");
		myCustomList.add("element 12");
		myCustomList.add("element 13");
		myCustomList.add("element 14");
		myCustomList.add("element 15");
		myCustomList.add("element 16");
		myCustomList.add("element 17");
		myCustomList.add("element 18");
		myCustomList.add("element 19");
		myCustomList.add("element 20");
		myCustomList.add("element 21");
		myCustomList.add("element 22");
		
		// then you should validate that all the elements 
		//you've inserted actually exist in your data structure
		for (int i=0; i<myCustomList.getSize(); i++) {
		    System.out.println(myCustomList.get(i));
		   // System.out.println(myCustomList.getSize());
		}
		
		
}
}
