import java.time.Instant;
import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		System.out.print("Enter the size of the square matrix: ");
    
    Scanner input = new Scanner(System.in);
        int size= input.nextInt();
        
        long startTime = Instant.now().toEpochMilli();
        int[][] A = new int[size][size];
        int[][] B = new int[size][size];
        int[][] C = new int[size][size];
        
    Random rand = new Random();
     // closing the scanner object
     input.close();
     
     //Get First Matrix
    for (int i = 0; i <size; ++i) {
        for (int j = 0; j < size; ++j) {
            int random = rand.nextInt(11);
            A[i][j]=random;
        }
    }
    //Get Second Matrix
    for (int i = 0; i <size; ++i) {
        for (int j = 0; j < size; ++j) {
            int random = rand.nextInt(11);
            B[i][j]=random;
        }
    }

    // Initializing elements of matrix mult to 0.
    for (int i = 0; i < size; ++i) {
        for (int j = 0; j < size; ++j) {
            C[i][j] = 0;
        }
    }
    // Multiplying first and second matrices and storing it in result
    for (int i = 0; i < size; ++i) {
        for (int j = 0; j < size; ++j) {
            for (int k = 0; k < size; ++k) {
                C[i][j] += A[i][k] * B[k][j];
            }
        }
    }
    
    /*
    //display Result
    for (int i = 0; i <size; ++i) {
        for (int j = 0; j < size; ++j) {
        	System.out.print(C[i][j]+"  ");
    	}
         System.out.print("\n");
    }
    */
        
	long endTime = Instant.now().toEpochMilli();
    long time_spent = endTime - startTime;
    System.out.println("Execution time in milliseconds: "+time_spent);
    
	}
}