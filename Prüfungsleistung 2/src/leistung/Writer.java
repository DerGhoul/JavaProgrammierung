package leistung;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
	
	public void write(){
	
		
		File file = new File("C:/Temp/MyGames.txt");
	
		try (FileWriter fw = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(fw)){
			 
				bw.write(titel + " " + genre + " " + yearOfRelease + " " + system + " " + playedthrough);
				}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}	




