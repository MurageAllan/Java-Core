package file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteFile {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("Text.bin");
			writer.write("This file is very long.");
			writer.close();
		} catch (IOException e) {
			System.out.println("The file could not be written to.");
			e.printStackTrace();
		}
		

	}

}
