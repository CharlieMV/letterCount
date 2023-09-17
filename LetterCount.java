
/**
 *	Counts the frequency of letters in a file and produces a histogram.
 *
 *	@author Charles Chang	
 *	@since September 14
 */

 
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
		int[] anArray;
		charCount = new int[36];
		char[] charList = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		boolean found = false;
		int search = 0;
		String fileName = args[0];
		File newFile = new File("cities.txt");
		Scanner newReader = new Scanner(newFile);
		while (newReader.hasNextLine()) {
			String data = newReader.nextLine();
			while (data.length() != 0) {
				search = 0;
				found = false;
				while (found == false) {
					if (charAt() == charList[search]){
						charCount[search] ++;
						found = true;
					}
					search++;
				}
				data = data.substring(1, data.length());
			}
		}
	}
	
}
