package leistung;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Writer {
	public String toString(String[]a) {
		String b = "";		
		for (String string : a) {
			b += string;
		}
		return b;
	}
	
	public void write(){
		
		Model m =  Model.getInstance();
		
		String titel = m.getTitle();
		String genre = m.getGenre();
		String yearOfRelease = m.getYearofRelease();
		String system = m.getSystem();
		String playedThrough = m.getPlayedThrough()+"";
		
	
		
		File file = new File("C:/Temp/MyGames.txt");
	
		try (FileWriter fw = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(fw)){
				bw.write(titel + ";" + genre + ";" + yearOfRelease + ";" + system + ";" + playedThrough);
				}
			catch (IOException e) {
				e.printStackTrace();
		}
	}
	
	
	@SuppressWarnings("null")
	public void read() {
		
		File file = new File("C:/Temp/MyGames.txt");
		
		Model m =  Model.getInstance();
	
		String a="";
		ArrayList<String> tableViewItems = null;
		
		try (FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr)){
			String line;
			while ((line = br.readLine()) != null) {
				String[] tokens = line.split(" ");
				
				String titel = tokens[0];
				String genre = tokens[1];
				String yearOfRelease = tokens[2];
				String system = tokens[3];
				String playedThrough = tokens[4];
				
				m.setTitle(titel);
				m.setGenre(genre);
				m.setYearofRelease(yearOfRelease);
				m.setSystem(system);
				if (playedThrough != "false") {
					m.setPlayedThrough(true);
				}
				if (playedThrough != "true") {
					m.setPlayedThrough(false);
				}
				a = ( titel + ";" + genre + ";" + yearOfRelease + ";" + system + ";" + playedThrough);
				tableViewItems.add(a);
			}
			m.setTableViewItems(tableViewItems);
				}
			catch (IOException e) {
				e.printStackTrace();
		}
			
			
			
	}
	
}	




