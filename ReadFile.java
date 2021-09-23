import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



//Reading text file
public class ReadFile {
	public static void main(String[] args) {
		try {
			File file = new File("eap.txt");
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String data = scanner.nextLine();
				String words = data.toLowerCase();
				String[] word = words.split(" ");
						//("[\\s.;,?:!()\"]+");
						//("[(' '),]");
				
				int count;
				
				for(int i = 0; i < word.length; i++) {
					count = 1;
					for(int j =i+1; j < word.length; j++) {
						if(word[i].equals(word[j])) {
							count++;
							//word[j] = "0";
							
						}
					}
					String info = word[i];
						//if(word[i]!="0")
						//if(count > 1 & word[i] != "0")
						{
							System.out.println(info+"  - "+count);
							//count = 1;
						}
					
				}
				/*
				for(int i=0; i<word.length;i++)
				{
					count = 1;
					for(int j=i+1; j<word.length; j++)
					{
						if(word[i].equals(word[j]))
						{
							count = count+1;
							word[j]="0";
						}
					}
					//if(word[i]!="0")
					if(count > 1 & word[i] != "0")
					{
						System.out.println(word[i]+"      "+count);
						
					}
				}
				*/
		        //System.out.println(data);
			
			//scanner.close();
	}
		}
	catch(FileNotFoundException e) {
		System.out.println("Error.");
		e.printStackTrace();
	}
		
	}
	
	

}
