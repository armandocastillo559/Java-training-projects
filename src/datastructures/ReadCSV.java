package datastructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {

	public static void main(String[] args) {
		// This method will read data from a CSV file
		List<String[]> data = new ArrayList<String[]>();
		String filename = "C:\\Users\\EatLocal\\Google Drive\\Education\\JAVA\\files\\accounts.csv";
		String dataRow;
		try {
			// Open the file
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			// Read the file as long as its not empty
			while((dataRow = br.readLine()) != null) {
				// Parse the data by commas
				String[] line = dataRow.split(",");
				// Add the data to the collection
				data.add(line);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (String[] account : data) {
			System.out.println("");
			for (String field : account) {
				System.out.print(" [ " + field + " ] ");
			}
		}	

	}

}
