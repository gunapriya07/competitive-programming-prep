// Question1: Palindrome Number

//QUESTION FORM THE LEETCODE

// Given an integer x, return true if x is a 
// palindrome
// , and false otherwise.
// Example 1:
// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.

// Example 2:
// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

// Example 3:
// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

// Constraints:

// -231 <= x <= 231 - 1


// solution 1:


// import java.util.Scanner;

// public class Solution {
//     public static void main(String[] args) {
//     Scanner scanner=new Scanner(System.in);
//     System.out.println("please enter the number:");
//     int x=scanner.nextInt();
//     if(x<0){
//         System.out.println("false");
//         return;
//     }

//     int reverse=0;
//     int xcopy=x;

//     while(x>0){
//         reverse=(x*10)+(x%10);
//         x/=10;
//     }
//     if(reverse==xcopy){
//         System.out.println("true");
//     }else{
//         System.out.println("false");
//     }
//     }
// }






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

// import  java.util.Scanner;

// public  class  Solution{
//     public static void main(String[] args) {
//         Scanner scanner=new Scanner(System.in);
//         int t=scanner.nextInt();
//         for(int i=0;i<t;i++){
//             int A=scanner.nextInt();
//             int B=scanner.nextInt();
//             int C=scanner.nextInt();
//             if(A+B+C==180){
//                 System.out.println("Yes");
//             }else{
//                 System.err.println("No");
//             }
//         }
       
//     }
// }


//QUESTION 3:

