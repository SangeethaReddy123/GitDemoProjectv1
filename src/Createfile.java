import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Createfile 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("C:\\Sangeetha\\sangeetha\\New folder\\Roopa.txt");
		f.createNewFile();
		System.out.println("Successful");
		FileWriter writer = new FileWriter(f,true);
//		writer.append("Hello sir");
//		writer.flush();
//		System.out.println("DONE");
        Scanner sc = new Scanner(f);
		
		 while(sc.hasNextLine())
		{
			String data = sc.nextLine();
			System.out.println(data);
		}
		sc.close();
		
	}   
	}


