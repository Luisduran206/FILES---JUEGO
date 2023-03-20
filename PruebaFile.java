import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class PruebaFile {

	int wins;
	int losses;
	int games;
	String usuario;
	
	
	public PruebaFile(String usuario, int wins, int losses, int games) {
		this.usuario = usuario;
		this.wins = wins;
		this.losses = losses;
		this.games = games;
	}
	
	public void crear(String usuario, int wins, int losses) throws IOException {
		File one = new File(usuario+".data");
		Path filepath = Path.of(one.getPath());
		if (one.createNewFile()){
			try {
				PrintWriter writer = new PrintWriter(usuario + ".data");
				writer.println("Wins: " + wins);
				writer.println("Losses: " + losses);
				writer.close();
				if(one.exists()) {
					String str = Files.readString(filepath);
					System.out.println(str);
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
        } else {
        	try{
        		Scanner scanner = new Scanner(one);
        		ArrayList<String> words = new ArrayList<>();
        	      while (scanner.hasNext()) {
        	         words.add(scanner.next());
        	      }
        	    String[] wordsArray = words.toArray(new String[0]);
        	    System.out.println("hsibfa$$ "+ wordsArray);
        	    escribir(wordsArray);
        		scanner.close();
        	} catch(IOException e){
    			e.printStackTrace();
    		}
        }
	}
	
	public void leer(Path filename) throws IOException {
		String str = Files.readString(filename);
		try {
			escribir(str.split("\n"));
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void escribir(String[] str) throws IOException {
		String winCadena = str[0].split("")[1];
		String loseCadena = str[0].split("")[1];
		int victoriasBf = Integer.parseInt(winCadena.split("")[1]);
		int derrotasBf = Integer.parseInt(loseCadena.split("")[1]);
		PrintWriter escritor = new PrintWriter(usuario + ".data"); 
		escritor.println("Wins: " + wins+victoriasBf);
		escritor.println("Losses: " + losses+derrotasBf);
		escritor.close();
	}
}