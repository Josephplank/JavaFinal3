import java.io.IOException;

public class FileArrayLauncher {

	public static void main(String[] args) throws IOException{
	
		//new object
		FileArray fileArray = new FileArray();
		int[] firstArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };//filled array
		int[] secondArray = new int[10];//second array
		
		//user inputs
		System.out.print("Contents of first array: ");
		printArray(firstArray);
		System.out.println("\nWriting to contents of first array into array.bin.");
		FileArray.writeArray("array.bin", firstArray);
		System.out.println("Reading contents of array.bin into second array.");
		FileArray.readArray("array.bin", secondArray);
		System.out.print("Contents of second array: ");
		printArray(secondArray);
	}
	
	//for loop to print output
	public static void printArray(int[] array)
	{
		for(int index = 0; index < array.length; index++)
		{
			System.out.print(array[index]);
		}
	}
	}


