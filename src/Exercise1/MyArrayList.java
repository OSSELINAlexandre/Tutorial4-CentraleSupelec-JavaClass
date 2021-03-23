package Exercise1;

public class MyArrayList {
	
	public int size;
	public int[] list = new int[1];

	public MyArrayList() {
		super();
	}
	
	public void addanInt(Integer next) {
	
		size ++;
		int[] templist = new int[size];
		if(size > 1) {
			
			for(int i = 0 ; i < size  - 1 ; i++) {
				// Ok, so i put a minus 1 here because the last value of the array is set after this block. 
				templist[i] = list[i];			
			}
			
			templist[size - 1] = next;
			list = templist;
			
		}else {	
			list[0] = next;	
		}
	}

	@Override
	public String toString() {
			
		String answer = "{";
		for(int i = 0 ; i < size; i++) {
			answer += ("" + list[i] +", "); 
		}
		return answer + "}";
	}
	
	public void removeDuplicate() {
		
		
		
		if(size > 1) {
		int[] templist = new int[1];
		templist[0] = list[0];
		boolean test = true;
		int newsize = 1;
		
 		for(int i = 1 ; i <= size - 1 ; i ++) {

			test = true;

 			for(int z = 0 ; z < templist.length ; z ++) {
 				
 				
 				if(templist[z] == list[i]) {
 					test = false;
 				}
 				
		
 			}
 			
 			if(test) {
 					
 				templist = addanIntInner(list[i], templist.length, templist);
 			}
		}
 		
 		list = templist;
 		size = templist.length;
 		
		}else {
			
			System.out.println("There is only one value in your list.");
		}
		
	}
	
	public int[] addanIntInner(Integer next, Integer length, int[] thelist) {
		
		int[] templist = new int[length + 1];		
		for(int i = 0 ; i <= length  - 1 ; i++) {
				
			templist[i] = thelist[i];			
		}
			
		templist[length] = next;
		return templist;
			
	}
}
