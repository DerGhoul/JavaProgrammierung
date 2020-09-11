package leistung;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
	
	public void write(){
		String titel = Model.getInstance().getTitel();
		String genre = Model.getGenre();
		String yearOfRelease = Model.getYearofRelease();
		String system = Model.getSystem();
		String playedThrough = Model.getPlayedThrough();
		
	
		
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




