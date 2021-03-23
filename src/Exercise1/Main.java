package Exercise1;

public class Main {

	
    public static void main(String[] args) {
    	
    	MyArrayList testMyArray = new MyArrayList();
    	testMyArray.addanInt(5);
    	testMyArray.addanInt(7);
    	testMyArray.addanInt(8);
    	testMyArray.addanInt(10);
    	testMyArray.addanInt(77);
    	testMyArray.addanInt(12);
    	testMyArray.addanInt(11);
    	testMyArray.addanInt(8);
    	testMyArray.addanInt(8);
    	testMyArray.addanInt(8);
    	testMyArray.addanInt(4);
    	testMyArray.addanInt(5);
    	testMyArray.addanInt(7);
    	testMyArray.addanInt(9);
    	testMyArray.addanInt(10);
    	System.out.println(testMyArray);

    	testMyArray.removeDuplicate();
    	System.out.println(testMyArray);

    }
}
