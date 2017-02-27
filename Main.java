package src;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("main loaded.");
		FileReader theFile = new FileReader("Data.txt"); // select file
		Loader theloadedFile = new Loader(theFile); // load file
		

	}

}
