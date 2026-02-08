import java.io.File;			//for general file operations and needed for reading files
import java.io.FileWriter;		//for writing to files
import java.io.IOException;		//most file operations must catch exceptions
import java.util.Scanner;		//this time using the scanner to read a file


public class Lecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			File test = new File("input.txt");
			FileWriter output = new FileWriter("output.txt");
			
			Scanner scan = new Scanner(test);
			while(scan.hasNextLine())
			{
				//try
				//{
					String line = scan.nextLine();
					int x = Integer.parseInt(line);
					if(x % 2 == 0)
					{
						output.write("Is Even\n");
					}
					else
					{
						output.write("Is Odd\n");
					}
				//}
				//catch(Exception e)
				//{
					//output.write("Invalid\n");
				//}
			}
			
			scan.close();
			output.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Done.");
	}

}
