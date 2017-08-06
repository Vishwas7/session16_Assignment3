package Assignment3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * 
 * @author Vishwas
 * In this program I'll find number of characters,
 * number of words and number of lines from  in a text file;
 * so first i've created class named FileHandling in side 
 * the main method and in the main method i've creating instance
 * of BufferedReader and initializing by null;
 * and initializing countCharacter, wordCount and lineCount to 0;
 * as mention in question.
 */
public class FileHandling {

	  public static void main(String[] args) 
	    {
	        BufferedReader reader = null;
	        
	        int countCharacter = 0;
	        int countword = 0;
	        int countLine = 0;
	     /**
	      * in here created a try catch block to handle 
	      * exception and in try catch block Created BufferedReader object
	      * and in the BufferedReader constructor calling FileReader
	      * and passing path of the file;
	      * than created a variable of String which will help to 
	      * reading the first line into currentLine
	      */
	        try
	        {
	            reader = new BufferedReader(new FileReader("E:/File In Java/DemoString.txt"));
	             
	            String currentLine = reader.readLine();
	            /**
	              * In here i've created  a while loop to read every line
	              * in this while loop assigning each line which 
	              * will read from the file, to this 'line' variable 
	              * to this checking file is null or not, 
	              * if null out of the loop than print the file.
	              * and than updating the lineCount
	              * 
	              */
	            while (currentLine != null)
	            {  
	            	countLine++;
	                 
	                /**
	                 * In her getting number of words in currentLine
	                 * by using split method and than updating the wordCount
	                 */
	                 
	                String[] words = currentLine.split(" ");
	            
	                countword = countword + words.length;
	                 
	                /**
	                 * In here using for loop for iterating each word and updating 
	                 * the charCount and than reading next line into currentLine
	                 */
	                 
	                for (String word : words)
	                {	                	
	                	countCharacter = countCharacter + word.length();
	                }
	                 
	                	currentLine = reader.readLine();
	            }
	             
	            /**
	             * In here Printing countCharacter, countword and countLine
	             */
	            System.out.println("Please Count from this file number of Character,word and lines\n");
	             
	            System.out.println("Number Of Character = "+countCharacter);
	             
	            System.out.println("Number Of Words = "+countword);
	             
	            System.out.println("Number Of Lines = "+countLine);
	        } 
	        catch (IOException e) 
	        {
	            e.printStackTrace();
	        }
	        finally
	        {
	            try
	            {
	            	//reader closing 
	                reader.close();           
	            }
	            catch (IOException e) 
	            {
	                e.printStackTrace();
	            }
	        }
	    } 
			}

	
