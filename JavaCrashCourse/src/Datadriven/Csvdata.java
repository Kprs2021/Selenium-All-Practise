package DataDriven;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class Csvdata {

	public void CsvTest() throws IOException {
		
		
		try {
		
			CSVReader reader;
			reader = new CSVReader(new FileReader("C:\\Users\\Probe7\\Desktop\\Test.csv"));
			
			String [] nextLine;
			
			while ((nextLine = reader.readNext()) != null) {
			System.out.println("");
			
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

			
		
		
	}

}

