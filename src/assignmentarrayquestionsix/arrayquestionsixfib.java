package assignmentarrayquestionsix;

/********************************************************************
 * Programmer:	sveinson
 * Class:       CS30S
 *
 * Assignment:      simple static method example
 * Program Name:    simpleStaticMethodExample
 *
 * Description: use static methods to perform some simple
 *              operations.
 *
 * Input: some integers from the keyboard
 *
 * Output: banners and closing messages
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 //import java.text.DecimalFormat;
 import java.io.*; 					// import file io libraries
import java.util.Random;
 

public class arrayquestionsixfib{  // begin class

    public static void main(String[] args) throws IOException{  // begin main
    
    // ********* declaration of constants **********
    			// maximum number of randoms allowed
    // ********** declaration of variables **********
    
    	String strin;				// string data input from keyboard
    	String strout;				// processed info string to be output
    	
        String banner;                          //string for printing banners
    	String prompt;				// prompt for use in input dialogs
    	
        
    	String delim = " ";		// delimiter string for splitting input string
    	String tabSpace = "      ";	// six spaces
//           Random r = new Random();		// create new random object
//        int rand = r.nextInt(128);				// generate a random number between 0 and 127
        

        String tokens[];
        
        int pcount = 10;
        int max = 0;  
        int count = 0 ; //a varible for counting the iterations of loops and assigning the arry chunk to be printed accordingly
     
    	//BufferedReader fin = new BufferedReader(new FileReader("name of file"));
  //  	PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("testOut.txt")));
    	
    // ********** Print output Banner **********
    // below are the mathod calls that tell the program to run the sub-program.
        
        printBanner();                      // print a banner to the output windowl
      //  fileBanner(fout);
        banner = windowBanner();         // make a string to print in joption pane

JOptionPane.showMessageDialog(null, banner);    	
    
 	   	
    // ************************ get input **********************

    prompt = "Enter the number of numbers you would like the fibonacci sequence to have";	
     max = Integer.parseInt(JOptionPane.showInputDialog(banner + "\n" + prompt));
     int arreh[] = new int[max];
     try{
     prompt = "enter the first two numbers";	
     strin = (JOptionPane.showInputDialog(banner + "\n" + prompt));
     tokens = strin.split(delim);
     arreh[0] = Integer.parseInt(tokens[0]);
     arreh[1] = Integer.parseInt(tokens[1]);
}//end try
     catch(ArrayIndexOutOfBoundsException e){
         JOptionPane.showMessageDialog(null,"Enter the correct amount of numbers","Try again", JOptionPane.ERROR_MESSAGE);
     }//end catch
     
            
    // ************************ processing ***************************
                   
     for(count = 2; count < max; count++){
     arreh[count] = arreh[count-2] + arreh[count-1];
     }//end for
     
     System.out.println("First five numbers");

         for(count=0; count < 5; count ++){
        System.out.print(arreh[count] + ", "); 
       if (pcount % 3 == 0){
          System.out.println("");
       }//end if
            pcount ++;   
         }//end for

     
     System.out.println("\nLast five numbers");
     for(count=max-5; count < max; count ++){
     System.out.print(arreh[count]);
            if (pcount % 3 == 0){
          System.out.println("");
       }//end if
            pcount ++;  
     }//end for
     
    // ************************ print output ****************************
   
        // ******** closing message *********
        
        System.out.println("\nend of processing.");
      //  fout.format("%n%nend of processing.");
        
        // ***** close streams *****
        
        //fin.close();			// close input buffer
      //  fout.close();			// close output buffer
    }  // end main

// ******************** static methods *****************************

    //************************************************
    // Purpose: get one int value from the keyboad
    // Interface: IN: string prompt
    // Returns: int read from keyboard buffer
    // *****************************************************
    public static int getNumber(String p, String banner, String promt){
        int n = 0;          // local varible to hold integer from keyboard buffer
        n = Integer.parseInt(JOptionPane.showInputDialog(banner, promt));
        return(n);
    } // end getNumber
    
    //************************************************
    // Purpose: print an output banner to the output window
    // Interface: IN: none
    // Returns: none
    // *****************************************************
    public static void printBanner(){
        System.out.println("*******************************************\\n");
        System.out.println("Name:		Evan Chartrand");
        System.out.println("Class:		CS30S");
        System.out.println("Assignment:	Ax Qy");
        System.out.println("*******************************************");
    }  // end print banner
    
    //************************************************
    // Purpose: print an output banner to the output file
    // Interface: IN: PrintWriter
    // Returns: none
    // *****************************************************
    public static void fileBanner(PrintWriter fo){
        fo.println("*******************************************");
        fo.println("Name:		Evan Chartrand");
        fo.println("Class:		CS30S");
        fo.println("Assignment:	Ax Qy");
        fo.println("*******************************************");    
    } // end fileBanner
    
    //************************************************
    // Purpose: Make an output banner string to use with message
    //          dialogs
    // Interface: IN: none
    // Returns: output banner string
    // *****************************************************
    public static String windowBanner(){
        // *** local variabls ***
        
        String banner;               // output banner for windows
        
        // **** create banner ****
        
        banner = "*******************************************\n";
        banner += "Name:		Evan Chartrand\n";
        banner += "Class:		CS30S\n";
        banner += "Assignment:	Ax Qy\n";
        banner += "*******************************************\n\n";  
        
        // *** return the banner ***
        
        return banner;           
    } // end windowBanner
}  // end clas