package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedRead {

	public static void main(String[] args) {
		File file = new File("Text.bin");
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String line;
			while((line = br.readLine()) != null ) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("The file was not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("The file was not readable");
			e.printStackTrace();
		}
		
		

	}

}
