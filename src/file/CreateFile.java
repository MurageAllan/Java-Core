package file;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		File file = new File("Text.bin");
		try {
			if(file.createNewFile()) {
				System.out.println("The file name is. "+ file.getName());
				
			}else {
				System.out.println("The file already exist.");
			}
		} catch (IOException e) {
			System.out.println("There was an error when trying to create the new file.");
		
		}

	}

}
