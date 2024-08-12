package Day1;

//Question:
// Square of a Number
// Problem Statement
// Write a program that accepts numbers and prints their squares.

// Input
// First line contains the number of integers, N.
// The next N lines which follow each have an integer.
// Output
// For each integer, output one new line which contains the square of that integer.

// Constraints
// 1 ≤ N ≤ 20
// 0 ≤ every integer ≤ 100
// Sample Input
// 7
// 0
// 1
// 2
// 3
// 4
// 5
// 10
// Sample Output
// 0
// 1
// 4
// 9
// 16
// 25
// 100




//SOLUTION
import  java.util.Scanner;
public class SquareOfNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            int number=scanner.nextInt();
            System.err.println(number*number);
        }
        
    }
    
}
