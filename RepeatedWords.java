
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;



//Reading text file
public class RepeatedWords {
	public static void main(String[] args) throws IOException {
		String data, words;
		//boolean info;
        ArrayList<String> word = new ArrayList<String>();    
        int count =1;
			FileReader file = new FileReader("eap.txt");
	        BufferedReader br = new BufferedReader(file);    
			while ((data = br.readLine()) != null) {
				String string [] = data.toLowerCase().split("[(' '),]");
				for(String s : string) {
					word.add(s);
				}
			}
				
				for(int i = 0; i < word.size(); i++) {
				 count = 1;
					for(int j =i+1; j < word.size(); j++) {
						if(word.get(i).equals(word.get(j))) {
							count++;
							//info = word.get(j) = "0";
							//word.equals("0");
						}
					}
					//Collections.sort(word);
					words = word.get(i);
						
						
					//Arrays.sort(word);
							System.out.println(words+ "  - "+count);
							count = 1;
						
					}
				
				}
			}
	
