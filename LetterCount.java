
/**
 *	Counts the frequency of letters in a file and produces a histogram.
 *
 *	@author Charles Chang	
 *	@since September 14
 */
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class LetterCount {
	
	// Fields go here, all must be private
	
	/* Constructor */							
	public LetterCount() {}
	
	/* Main routine */
	public static void main(String[] args) {
		LetterCount lc = new LetterCount();
		if (args.length != 1)
			System.out.println("Usage: java LetterCount <inputFile>");
		else
			lc.run(args);
	}
	
	/**	The core program of the class, it
	 *	- opens the input file
	 *	- reads the file and counts the letters
	 *	- closes the input file
	 *	- prints the histogram of the letter count
	 */
	public void run(String[] args) {
		int[] charCount;
		charCount = new int[26];
		char[] charList = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		boolean found = false;
		int search = 0;
		String fileName = args[0];
		try {
			File newFile = new File("panama.txt");
			Scanner newReader = new Scanner(newFile);
			while (newReader.hasNextLine()) {
				String data = newReader.nextLine();
				while (data.length() != 0) {
					search = 0;
					found = false;
					while (found == false) {
						if (data.charAt(0) == charList[search]){
							charCount[search] ++;
							found = true;
						}
						search++;
					}
					data = data.substring(1, data.length());
				}
			}
			newReader.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("FileNotFound");
			e.printStackTrace();
		}
		for (int soup = 0; soup <= 26 ; soup++) {
			System.out.printf("'%-7s'", charList[soup]);
			System.out.print(charCount[soup] + " ");
		}
	}
	
}
