package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

	public static void main(String[] args) {
		Person person1 = new Person(20, "Maish");
		Person person2 = new Person(21, "Allan");
		Person person3 = new Person(21, "Masha");
		Person.setCount(88);

		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Text.bin")) ) {
			
			os.writeObject(person1);
			os.writeObject(person2);
			os.writeObject(person3);
			

		} catch (FileNotFoundException e) {
			System.out.println("The file was not found ");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("There was a problem while trying to write objects to the file");
			e.printStackTrace();
		}

	}

}
