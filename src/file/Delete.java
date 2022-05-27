package file;

import java.io.File;

public class Delete {

	public static void main(String[] args) {
		File file = new File("Text.bin");
		if(file.delete()) {
			System.out.println("The file was deleted successfully");
		}else {
			System.out.println("The file could not be deleted");
		}

	}

}
