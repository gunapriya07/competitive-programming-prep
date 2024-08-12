package Day1;  

// Question 2:

//Question from the codechef (code of the question: FLOW013 ) 

// Valid Triangles
// Write a program to check whether a triangle is valid or not, when the three angles of the triangle are the inputs. A triangle is valid if the sum of all the three angles is equal to 180 degrees.

// Input Format
// The first line contains an integer T, the total number of testcases. Then T lines follow, each line contains three angles A, B and C, of the triangle separated by space.

// Output Format
// For each test case, display 'YES' if the triangle is valid, and 'NO', if it is not, in a new line.

// Constraints
// 1 ≤ T ≤ 1000
// 1 ≤ A,B,C ≤ 180
// Sample 1:
// Input
// Output
// 3 
// 40 40 100
// 45 45 90
// 180 1 1
// YES
// YES
// NO



//SOLUTION 2:

import  java.util.Scanner;

public  class  ValidTriangle{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        for(int i=0;i<t;i++){
            int A=scanner.nextInt();
            int B=scanner.nextInt();
            int C=scanner.nextInt();
            if(A+B+C==180){
                System.out.println("Yes");
            }else{
                System.err.println("No");
            }
        }
       
    }
}



