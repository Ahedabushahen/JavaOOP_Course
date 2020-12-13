package ShimonLAB.lab08;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions {
	public static final double maxiumItem = 1.0E6;
	public static final double maxiumSum = 5.0E8;
	public static final int maxiumLines = 1000;
	double sumValues;
	int linesCount;
	double number;
	boolean maxLines;
	void process(String filename) {
		
		sumValues =0;
		linesCount =0;
		number=0;
		maxLines = true;
		File file = new File(filename);
		try {
			Scanner scanner = new Scanner(file);
			if(!scanner.hasNext()) {
				throw new EmptyFileException("Exception program - file empty");
			}
				while(scanner.hasNext()) {
					String input = scanner.nextLine();
					String[] line = input.split(" ");
					int sumEntries= 0;
					for(int i=0;i<line.length ;i++) {
						if(i%2==0)
							sumEntries++;
					}
					
					try {
						if(line.length > 1) {
							throw new MultipleEntriesException();
						}
						
						number = Double.parseDouble(input);
						
						if(Math.abs(number) > maxiumItem) {
							throw new TooBigException();
						}
						else if(linesCount > maxiumLines && maxLines) {
							maxLines = false;
							linesCount++;
							sumValues+=number;
							throw new TooManyEntriesException();
							
						}
						else if(sumValues > maxiumSum && maxLines) {
							maxLines = false;
							sumValues+=number;
							throw new SumTooLargeException();
						}
						else {
							linesCount++;
							sumValues+=number;
						}
					}
					catch(NumberFormatException nfe) {
						System.err.println("Exception program - not a number.\r\nFor input string: "+'"'+input+'"'+" after processing " + linesCount + " lines.");
						}
					catch(MultipleEntriesException tme) {
						System.err.println("Exception program - multiple entries in a line.\r\n" + sumEntries +" entries in line " + linesCount); //note
					}
					catch(TooBigException tbe) {
						System.err.println("Exception program - entry too big\noffending entry: "+number+" after processing " + linesCount + " lines.");
					}
					catch(TooManyEntriesException tmee) {
						linesCount--;
						System.err.println("Exception program - Too many entries\r\nafter processing " + linesCount+ " lines.");
						linesCount++;
					}
					catch(SumTooLargeException stle) {
						linesCount--;
						System.err.println("Exception program - sum too large.\r\nis "+ sumValues +"(exceeding 5.0E8) after processing "+linesCount+" lines.");
						linesCount++;
					}
					
			}
				System.out.println(linesCount+ " lines were processed.\nSum of all entries is " + sumValues);
				scanner.close();
			}
		
		catch(EmptyFileException e) {
			System.err.println("Exception program - file empty");
		}
			
		
		catch(FileNotFoundException e){
			System.err.println("Exception program - file not found");
		}
}
}