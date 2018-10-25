package lab16;

import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String directoryFolder = "Country List";
		String fileName = "CountriesList";

		CountriesTextFile.createDirectory();
		CountriesTextFile.createFile(directoryFolder, fileName);
		CountriesTextFile.readFromFile(directoryFolder, fileName);
		Scanner sc = new Scanner(System.in);
		System.out.println("Above is a list of countries, Enter another to add it to the list");
		String userInput = sc.nextLine();
		CountriesTextFile.writeToFile(directoryFolder, fileName);
		CountriesTextFile.readFromFile(directoryFolder, fileName);

	}

}
