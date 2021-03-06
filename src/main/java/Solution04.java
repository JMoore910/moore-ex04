import java.util.Scanner;

/*
 *    UCF  COP3330 Fall 2021 Assignment 1 Solution04
 *    Copyright 2021 Sean Moore
 */

public class Solution04 {
    /*
        Create an application that receives input words to form a MadLib-sentence,
        take in noun
        take in verb
        take in adjective that applies to the noun
        take in adverb that applies to the verb
        Output a sentence using a single output statement using all 4 input strings
        Output example: "Do you <verb> your <adjective> <noun> <adverb>?"
     */
    public static void main(String[] args) {
        
        //  Use a scanner for input to take in a noun, verb, adjective, and adverb
        Scanner input = new Scanner(System.in);
        String noun, verb, adj, adv;
        System.out.printf("Enter a noun: ");
        noun = input.nextLine();
        System.out.printf("Enter a verb: ");
        verb = input.nextLine();
        System.out.printf("Enter an adjective: ");
        adj = input.nextLine();
        System.out.printf("Enter an adverb: ");
        adv = input.nextLine();

        //  Output the four strings together as a sentence using string concatenation
        System.out.printf("Do you %s your %s %s %s?",verb,adj,noun,adv);
    }
}
