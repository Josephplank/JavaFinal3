import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class Decrypted {

	
	public Decrypted() throws IOException
	{
		readArray();
	}
	
	public static void readArray() throws IOException
	{
		FileInputStream fstream = new FileInputStream("Encryption.dat");
		DataInputStream inputFile = new DataInputStream(fstream);
	
		boolean end = false;
		int x = 0;
		String input = "";
		String output = "";
		
		while(!end)
		{
			try{
				input += inputFile.readUTF();
			}catch(EOFException e)
			{
				end = true;
			}
		}
		
		for(int i = 0; i < input.length() +1; i++)
		{
		String test;
		if(i == 0){
			test = input.substring(0, i);
		}else{
			test = input.substring(i-1, i);
		}
		
		if(test.equals("^"))
		{
			output = output + " ";
		}else{
			output = output + test;
		}
		
		}
		
		inputFile.close();
		
		System.out.println(input);
		System.out.println(output);
		
		
	}
	
}
