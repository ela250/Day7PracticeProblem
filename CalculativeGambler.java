package com.gamblingSimulator;


import java.util.Random;
import java.util.Scanner;

        public class CalculativeGambler {



            static void gamble(int noOfTimes, int $Stack, int $Goal) {
                int bets = 0; // total number of bets made
                int wins = 0; // total number of games won

                // repeat number of times
                for (int i = 0; i < noOfTimes; i++) {
                    int cash = $Stack;

                    while (cash > 0 && cash < $Goal) {
                        bets++;

                        if (Math.random() < 0.5)
                            cash++; // win $1
                        else
                            cash--; // lose $1
                    }
                    if (cash == $Goal)
                        wins++; // to find no. of wins
                }

                // print results
                System.out.println();
                System.out.println(wins + " wins out of of " + noOfTimes);
                System.out.println("Percent of games won = " + 100.0 * wins / noOfTimes);
                System.out.println("Percent of games lost = " + 100.0 * (noOfTimes - wins) / noOfTimes);
                System.out.println("Total bets in " + noOfTimes + " games = " + bets);
            }

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int n, $stack, $goal;
                System.out.println("enter stack amount");
                $stack = scanner.nextInt();
                System.out.println("enter goal amount");
                $goal = scanner.nextInt();
                System.out.println("enter no of times to gamble");
                n = scanner.nextInt();
                scanner.close();
                gamble(n, $stack, $goal);

            }
        }


