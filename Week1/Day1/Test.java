package Day1;  

//QUESTION[FROM THE CODECHIEF : CODE(TEST)]


// Life, the Universe, and Everything
// For help on this problem, please check out our tutorial Input and Output (I/O)

// Your program is to use the brute-force approach in order to find the Answer to Life, the Universe, and Everything. More precisely... rewrite small numbers from input to output. Stop processing input after reading in the number 
// 42
// 42. All numbers at input are integers of one or two digits.

// Sample 1:
// Input
// Output
// 1
// 2
// 88
// 42
// 99
// 1
// 2
// 88


import java.util.Scanner;

public  class  Test{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while (true) { 
            int number=scanner.nextInt();
            if(number==42){
                break; // if the number is 42 the code will start running
            }
            System.out.println(number);
        }
    }
}
