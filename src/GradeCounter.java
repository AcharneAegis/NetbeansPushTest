
/**
 *
 * @author Payton Askew
 */
import java.io.*;
import java.util.*;


public class GradeCounter {
    public static void main(String[] args) throws FileNotFoundException {
        int NumOfGrades;
        double grade;
        int gRangeOne =0, gRangeTwo = 0, gRangeThree = 0, gRangeFour = 0, gRangeFive = 0, gRangeSix = 0, gRangeSeven = 0, gRangeEight = 0;
        Scanner inFile = new Scanner(new FileReader("lab2_input.txt"));
        NumOfGrades = inFile.nextInt();
        
        for(int i = 0; i < NumOfGrades; i++){
            grade = inFile.nextInt();
            if (grade > 0 && grade < 25){
                gRangeOne++;
            }  
            else if (grade > 24 && grade < 50){
                gRangeTwo++;
            }  
            else if (grade > 49 && grade < 75){
                gRangeThree++;
            } 
            else if (grade > 74 && grade < 100){
                gRangeFour++;
            } 
            else if (grade > 99 && grade < 125){
                gRangeFive++;
            } 
            else if (grade > 124 && grade < 150){
                gRangeSix++;
            } 
            else if (grade > 149 && grade < 175){
                gRangeSeven++;
            } 
            else{
                gRangeEight++;
            }
        }
        System.out.println("[0 - 24]:" + gRangeOne);
        System.out.println("[25-49]:" + gRangeTwo);
        System.out.println("[50-74]:" + gRangeThree);
        System.out.println("[75-99]:" + gRangeFour);
        System.out.println("[100-124]:" + gRangeFive);
        System.out.println("[125-149]:" + gRangeSix);
        System.out.println("[150-174]:" + gRangeSeven);
        System.out.println("[175-200]:" + gRangeEight);
        
    }
    
}
