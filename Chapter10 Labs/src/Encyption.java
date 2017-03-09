import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Encyption {
	
	//used for output
	public Encyption() throws IOException {
		writeArray();
	}

	//writes to array
	public static void writeArray() throws IOException
	{
		FileOutputStream fstream = new FileOutputStream("Encryption.dat");
		DataOutputStream outputFile = new DataOutputStream(fstream);
		
	outputFile.writeUTF("This^is^encrypted");
		
		outputFile.close();
	}
}
