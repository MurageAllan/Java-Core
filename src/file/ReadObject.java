package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) {
		try (ObjectInputStream os = new ObjectInputStream(new FileInputStream("Text.bin"))) {
			
			Person person1 = (Person) os.readObject();
			Person person2 = (Person) os.readObject();
			Person person3 = (Person) os.readObject();
			System.out.println(person1);
			System.out.println(person2);
			System.out.println(person3);

		} catch (FileNotFoundException e) {
			System.out.println("The file could not be located.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("The file is unreadable. ");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("The class where the object were created was not found.");
			e.printStackTrace();
		}

	}

}
