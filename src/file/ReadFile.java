package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		File file = new File("Text.bin");
		try {
			Scanner Reader = new Scanner(file);
			while(Reader.hasNextLine()) {
				String text = Reader.nextLine();
				System.out.println(text);
			}
			Reader.close();
		} catch (FileNotFoundException e) {
			System.out.println( "The file was not found");
			e.printStackTrace();
		}
		

	}

}
