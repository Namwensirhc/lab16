package lab16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CountriesTextFile {

	public static void createDirectory() {
		String dirPath = "Country List";
//		String fileName = "CountriesList";
		Path folder = Paths.get(dirPath);
		if (Files.notExists(folder)) {
			try { // This is an example of a checked exception
				Files.createDirectory(folder);
				System.out.println("Folder was created succesfully");
			} catch (IOException e) {
				System.out.println("Something went wrong with folder creation");

			}

		}

	}

	public static void createFile(String directoryFolder, String fileName) {

		Path filePath = Paths.get("Country List", "CountriesList");
		if (Files.notExists(filePath)) {
			try {
				Files.createFile(filePath);
				System.out.println("File was created successfully");
			} catch (IOException e) {
				System.out.println("Something went wrong with file creation");
			}
		} else {
			System.out.println("File already Exists!");
		}
	}

	public static void readFromFile(String directoryFolder, String fileName) {
		Path filePath = Paths.get(directoryFolder, fileName);
		File file = filePath.toFile();

		try {
			FileReader fr = new FileReader(file);
			BufferedReader reader = new BufferedReader(fr);

			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				line = reader.readLine();
			}
			reader.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		} catch (IOException e) {
			System.out.println("Contact customer service");

		}
	}

	public static void writeToFile(String directoryFolder, String fileName) {
		Path filePath = Paths.get(directoryFolder, fileName);
		File file = filePath.toFile();
		Scanner sc = new Scanner(System.in);

		CountryList userInput = new CountryList(sc.nextLine());
		// THIS IS WHERE USER INPUT COME IN

		try {
			// The true parameter for the FileOutputStream() constructor appends data to the
			// end of the file
			// false rewrites over the entire file
			PrintWriter outW = new PrintWriter(new FileOutputStream(file, true));
			outW.println(userInput);
			outW.close(); // *MANDATORY* This needs to be closed when you run or it may not go to file
		} catch (FileNotFoundException e) {
			System.out.println("File was not Found");
		}

	}
}
