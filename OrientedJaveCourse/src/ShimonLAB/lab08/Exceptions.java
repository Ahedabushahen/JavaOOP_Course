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
		String input = new String();
		String[] line= new String[10];
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
					try {
					  input = scanner.nextLine();
					if(input == null || input.length() == 0) {
						throw new EmptyLineException();
					}
						line = input.split("\\s+");
						if(line.length > 1) {
							throw new MultipleEntriesException();
						}
						
						number = Double.parseDouble(input);
						
						if(Math.abs(number) > maxiumItem) {
							throw new TooBigException();
						}
						linesCount++;
						if(linesCount > maxiumLines && maxLines) {
							maxLines = false;
							sumValues+=number;
							throw new TooManyEntriesException();
							
						}
						sumValues+=number;
						
						if(sumValues > maxiumSum && maxLines) {
							maxLines = false;
							linesCount--;
							throw new SumTooLargeException();
						}
//						scanner.close();
					}
					catch(EmptyLineException ele) {
						System.err.println("Exception program - empty line at line number " + linesCount);
					}
					catch(NumberFormatException nfe) {
						System.err.println("Exception program - not a number.\r\nFor input string: "+'"'+input+'"'+" after processing " + linesCount + " lines.");
						}
					catch(MultipleEntriesException tme) {
						System.err.println("Exception program - multiple entries in a line.\r\n" + line.length +" entries in line " + linesCount); //note
					}
					catch(TooBigException tbe) {
						System.err.println("Exception program - entry too big\noffending entry: "+number+" after processing " + linesCount + " lines.");
					}
					catch(TooManyEntriesException tmee) {
						System.err.println("Exception program - Too many entries\r\nafter processing " + linesCount+ " lines.");
					}
					catch(SumTooLargeException stle) {
						System.err.println("Exception program - sum too large.\r\nis "+ sumValues +"(exceeding 5.0E8) after processing "+linesCount+" lines.");
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