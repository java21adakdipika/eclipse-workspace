package account.model;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AccountDeserialize {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream file = new FileInputStream("D:\\Swabhav Techlabs\\Serialize\\test.txt");
			ObjectInputStream in = new ObjectInputStream(file);
			
			Account account = (Account)in.readObject();
			
			in.close();
			file.close();
			System.out.println(account);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
