package java_with_DSA;

import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) {
		try {
			FileReader reader=new FileReader("C:\\Users\\basha\\OneDrive\\Documents\\text_for_practice.txt\r\n");
			int ch;
			while((ch = reader.read()) != -1)
			{
				System.out.println((char) ch);
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("error:"+ e.getMessage());
		}

	}

}
