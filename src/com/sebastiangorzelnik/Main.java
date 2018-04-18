package com.sebastiangorzelnik;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Plase enter a Player One name: ");
        String playerOneName = in.nextLine();
        System.out.println("Plase enter a Player Two name: ");
        String playerTWoName = in.nextLine();
        int playerOneScore = 0;
        int playerTwoScore = 0;
        System.out.println("How many fields should have a board?:");
        int field = in.nextInt();
        ConsoleMatch FirstMatch = new ConsoleMatch(playerOneName, playerTWoName,playerOneScore, playerTwoScore, field);


     /*   int [][] board = new int [3][3];
        for(int i =0; board.length>i; i++)
            for (int j =0; board[i].length >j ; j++) {
                System.out.print(j);
                if (j+1==board[i].length)
                    System.out.println();

            }
    */
    }

}
