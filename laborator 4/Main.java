import java.io.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		try {
			File file = new File("D:\\java\\Laborator 4\\laborator 4\\one_expression.txt");
			Scanner input = new Scanner(file);	  
			while(input.hasNextLine()) {
				String s=input.nextLine();
				Expresions exp=new Expresions(s);
				exp.output(s);
			}
			System.out.println();
			File file1 = new File("D:\\java\\Laborator 4\\laborator 4\\three_expressions.txt");
			Scanner input1 = new Scanner(file1);	  
			while(input1.hasNextLine()) {
				String s=input1.nextLine();
				Expresions exp=new Expresions(s);
				exp.output(s);
			}
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
