package Exercise2;

import java.io.IOException;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		String test;
		readingWritingFromFile RW = new readingWritingFromFile();
		test = RW.readTextFileInOneGo("C:\\Users\\FamilleOSSELIN\\eclipse-workspace\\Tutorial4\\src\\words.txt");
		System.out.println(test);
		String[] yeah = test.split("[,\\s+.!: ]+");
		for(String s : yeah) {
			
			System.out.println(s);
		}
		System.out.println(yeah.length);
		try {
			RW.WritingaNewFilewithNumbers("C:\\Users\\FamilleOSSELIN\\eclipse-workspace\\Tutorial4\\src\\words.txt" , 
					"C:\\Users\\FamilleOSSELIN\\eclipse-workspace\\Tutorial4\\src\\wordscOUNT.txt" );
		} catch (IOException e) {
	
			System.out.println("Couldn't write to the file.");
		}
		      
		
	}

}
