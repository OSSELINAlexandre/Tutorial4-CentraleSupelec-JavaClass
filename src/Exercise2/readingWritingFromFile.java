package Exercise2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class readingWritingFromFile {
	
public String readTextFileInOneGo(String fileName) {


	String returnValue = "";
	BufferedReader reader = null;
	FileReader file = null;

	try
	{

		file = new FileReader(fileName);
		reader = new BufferedReader(file);

		String line = "";
		while ((line = reader.readLine()) != null) {

			returnValue += line + "\n";

		}
	}catch(Exception E){

		throw new RuntimeException(E);

	}finally {
		if (reader != null) {
			try {
				reader.close();
			} catch (IOException e) {// Ignore issues }
			}
			if (file != null) {
				try {
					file.close();
				} catch (IOException e) { // Ignore issues during closing }
				}
			}
		}
	}
	
	return returnValue;
}

public void WritingaNewFilewithNumbers(String fileNamesrc, String filenameDest) throws IOException {
		String material = "";
		String Answer = "";
		String[] templist;

		material = readTextFileInOneGo(fileNamesrc);
		
		String[] yeah = material.split("[,\\s+.!: ]+");
		templist = material.split("\\n");

		for(String s : yeah) {
			
			System.out.println(s);
		}
		for (String s : templist) {
			
			String[] e = s.split("[,\\s+.!: ]+");

			System.out.println(s + " " + e.length);
			Answer += s + " " + e.length + "\n";
		}


		try {
		      FileWriter myWriter = new FileWriter(filenameDest);
		      myWriter.write(Answer);
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}


}