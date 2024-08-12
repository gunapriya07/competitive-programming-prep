package Day1;


// Question:
// Chef and Interactive Contests
// ###Read problems statements Hindi , Vietnamese , Mandarin Chinese , Russian and Bengali as well.

// "Every beginning has an end... and an editorial." - taran_1407

// What the hell are all these interactive problems? What does flushing output mean? So many questions... Chef explains it in an easy way: you must communicate with a grader program, which accepts your input only if you flushed the output.

// There is a contest with interactive problems where 
// N
// N people participate. Each contestant has a known rating. Chef wants to know which contestants will not forget to flush the output in interactive problems. Fortunately, he knows that contestants with rating at least 
// r
// r never forget to flush their output and contestants with rating smaller than 
// r
// r always forget to do it. Help Chef!

// Input
// The first line of the input contains two space-separated integers 
// N
// N and 
// r
// r.
// Each of the following 
// N
// N lines contains a single integer 
// R
// R denoting the rating of one contestant.
// Output
// For each contestant, print a single line containing the string "Good boi" if this contestant does not forget to flush the output or "Bad boi" otherwise.

// Constraints
// 1
// ≤
// N
// ≤
// 1
// ,
// 000
// 1≤N≤1,000
// 1
// ,
// 300
// ≤
// r
// ,
// R
// ≤
// 1
// ,
// 501
// 1,300≤r,R≤1,501
// Subtasks
// Subtask #1 (100 points): original constraints

// Sample 1:
// Input
// Output
// 2 1500
// 1499
// 1501
// Bad boi
// Good boi

import  java.util.Scanner;

public class FlushOutput{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int r=scanner.nextInt();
        for(int i=0;i<n;i++){
            int rating=scanner.nextInt();
            if(rating>=r){
                System.err.println("Good boi");
            }else{
                System.err.println("Bad boi");
            }

        }

    }
}
