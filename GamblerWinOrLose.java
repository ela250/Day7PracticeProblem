package com.gamblingSimulator;

public class GamblerWinOrLose {
    public static void main(String[] args) {
        int check = (int) Math.floor(Math.random() * 10) % 6;
        gamble(check,100);
    }
       public static void gamble(int check,int stack){
        int sum =1;
        int win =1;
        if (check == win){
            sum = stack + sum;
            System.out.println("Gambler won the game and remainig stack amount is :" + sum +  "Dollar");
        }else{
            sum = stack - sum;
            System.out.println("Gambler lost the game and remainig stack amount is :" + sum +  "Dollar");
        }
           System.out.println(" the updated stack amount is :" + sum +  "Dollar");
        }


}
