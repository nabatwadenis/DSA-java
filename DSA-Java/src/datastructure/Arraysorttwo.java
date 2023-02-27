package datastructure;

public class Arraysorttwo {
	public static String search(String array[], String index) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == index) {
				return index;
			}
		}
		return null;
		
		
	}

	public static void main(String[] args) {
		String[] names = new String[] {"Dave","Bob", "Richie","Clive","Oswald", "Millie"};
		
		String value = search(names, "Clive");
		
		if(value == null) {
			System.out.print("No such name");
		}else {
			System.out.print("the name exists at index: "+ value);
		}
		

	}

}
