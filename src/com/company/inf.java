package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//code by sir
public class inf {

    static Set <Integer>subseqNums = new HashSet<Integer>();
    static int highestPrime = -1;

    public static void main(String[] args) {
// TODO Auto-generated method stub
        try {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a number to find it's Subsequences and then find highest Prime:");
            String origNumStr = sc.nextLine();
            int origNum = Integer.parseInt(origNumStr);
            int numLen = origNumStr.length();

            findSubsequences(origNumStr);

            for(int i=0; i<numLen; i++) {
                String currChar = String.valueOf(origNumStr.charAt(i));
                int currCharNum = Integer.parseInt(currChar);
                if(currCharNum != 0 && !subseqNums.contains(currCharNum)) {
                    subseqNums.add(currCharNum);
                }
                StringBuffer sb = new StringBuffer(origNumStr);
                String newNum = sb.deleteCharAt(i).toString();
                findSubsequences(newNum);
            }



            if(!subseqNums.contains(origNum)) {
                subseqNums.add(origNum);
            }
            System.out.println("The Subsequences of "+origNumStr+" are:\n"+subseqNums);
            System.out.println("Number of subsequeces found="+subseqNums.size());
//find the highest prime

            for(int seqNum : subseqNums) {
                if(isNumberPrime(seqNum)) {
                    if(seqNum > highestPrime) {
                        highestPrime = seqNum;
                    }
                }
            }
            System.out.println("The highest Prime Number in this subsequence set is: "+highestPrime);
        }
        catch(Exception e) {
            System.out.println("Unexpected error while executing the program. Please ensure you are passing a valid integer");
            e.printStackTrace();
        }
    }

    //recursive function to find subsequences
    private static void findSubsequences(String num) {

        if(num.length() ==0) {
            return;
        }
        int currNum = Integer.parseInt(num);

        if(currNum!= 0 && !subseqNums.contains(currNum)) {
            subseqNums.add(currNum);
        }
        StringBuffer sb = new StringBuffer(num);
        StringBuffer sbReverse = new StringBuffer(num);
        String subNum = sb.deleteCharAt(0).toString();
        findSubsequences(subNum);
        String revNum = sbReverse.deleteCharAt(num.length()-1).toString();
        findSubsequences(revNum);
    }

    //This function evaluates if num is a prime number or not and returns corresponding flag
    private static boolean isNumberPrime(int num) {
        boolean isPrime = true;
        for(int i=2; i<num; i++) {
            if(num%i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}

