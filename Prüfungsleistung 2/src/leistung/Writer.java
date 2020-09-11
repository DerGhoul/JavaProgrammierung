package leistung;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
	
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
			 
				bw.write(titel + " " + genre + " " + yearOfRelease + " " + system + " " + playedThrough);
				}
			catch (IOException e) {
				e.printStackTrace();
		}
	}
	
	
	public void read() {
		Model m =  Model.getInstance();
		
		String titel = m.getTitle();
		String genre = m.getGenre();
		String yearOfRelease = m.getYearofRelease();
		String system = m.getSystem();
		String playedThrough = m.getPlayedThrough()+"";
		
	
		
		File file = new File("C:/Temp/MyGames.txt");
	
		try (FileWriter fw = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(fw)){
			 
				bw.write(titel + " " + genre + " " + yearOfRelease + " " + system + " " + playedThrough);
				}
			catch (IOException e) {
				e.printStackTrace();
		}
	}
	
}	




