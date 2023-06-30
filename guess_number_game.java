package com.company;
import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses;
    public int getNoOfGuesses() {
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
        
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        try (Scanner sc = new Scanner(System.in)) {
            inputNumber = sc.nextInt();
        }
    }
    boolean isCorrectNumber(){
        if(inputNumber == number){
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low...");
        }
        else if(inputNumber>number){
            System.out.println("Too high...");
        }
        return false;
    }
}
public class guess_number_game {
    public static void main(String[] args)
    {
        Game g = new Game();
        g.takeUserInput();
        boolean b = g.isCorrectNumber();
        System.out.println(b);
    }
    
    
}
