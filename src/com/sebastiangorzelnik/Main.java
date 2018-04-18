
package com.sebastiangorzelnik;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner inInt = new Scanner(System.in);
        Scanner inString = new Scanner(System.in);
        int numerOfPlayers=0;
        String playerName;
        List<Player> players = new ArrayList<>();

        System.out.println("What do you want to do? \n Please Press: \n 1.Add New Player \n " +
                "2.Play Match \n 3.Check Score \n 4.End Game \n");
        int click = inInt.nextInt();

        while(click!=4) {
            if(click == 1){
                System.out.print("Player's name \n");
                Player playerName
                playerName = inString.nextLine();
                if(players.contains(playerName));
                players.add(playerName);

            }



        }

        System.out.println("How many fields should have a board?:");
        int field = inInt.nextInt();
       // ConsoleMatch FirstMatch = new ConsoleMatch(playerOneName, playerTWoName);


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
