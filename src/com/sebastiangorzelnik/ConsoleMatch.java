package com.sebastiangorzelnik;

import java.util.Scanner;

public class ConsoleMatch {
    String playerOne;
    String playerTwo;
    int playerOneScore;
    int playerTwoScore;
    Scanner in = new Scanner(System.in);

    public ConsoleMatch(String playerOne, String playerTwo, int playerOneScore, int playerTwoScore, int howManyFields) {
        playMatch(playerOne, playerTwo, playerOneScore, playerTwoScore, howManyFields);


        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.playerOneScore = playerOneScore;
        this.playerTwoScore = playerTwoScore;
    }

    private void playMatch(String playerOne, String playerTwo, int playerOneScore, int playerTwoScore, int howManyFields) {
        boolean isEnd = false;
        char[][] board = new char[howManyFields][howManyFields];
        int counter = 0;
        int column;
        int row;
        while (!isEnd) {
            System.out.println("Please insert O, on free column (1-" + howManyFields + ") and row (1-" + howManyFields + ")");
            showBoard(board);
            column = in.nextInt() - 1;
            row = in.nextInt() - 1;
            counter++;
            if (ifEnd(counter, howManyFields)) {
                break;
            }

            enterSymbol('O', board, column, row);
            showBoard(board);


            System.out.println("Please insert X, on free column (0-" + howManyFields + ") and row (0-" + howManyFields + ")");
            column = in.nextInt() - 1;
            row = in.nextInt() - 1;
            counter++;
            if (ifEnd(counter, howManyFields)) {
                break;
            }
            enterSymbol('X', board, column, row);


        }
    }

    private void showBoard(char board[][]) {
        for (int i = 0; board.length > i; i++)
            for (int j = 0; board[i].length > j; j++) {
                if (j == board[i].length - 1)
                    System.out.println(printSymbol(board[i][j]));
                else
                    System.out.print(printSymbol(board[i][j]) + "|");


            }
    }

    private String printSymbol(char symbol) {
        String output;
        if (symbol == 'O' || symbol == 'X')
            output = " " + symbol + " ";
        else
            output = "   ";

        return output;
    }

    private void enterSymbol(char symbol, char board[][], int column, int row) {
        if (column >= board.length || row >= board.length || column < 0 || row < 0) {
            System.out.println("You are out of board, plase choose one more time :)");
            column = in.nextInt() - 1;
            row = in.nextInt() - 1;
            enterSymbol(symbol, board, column, row);
        } else if (board[column][row] != 0) {
            System.out.println("This field is already filled, plase choose again");
            column = in.nextInt() - 1;
            row = in.nextInt() - 1;
            enterSymbol(symbol, board, column, row);
        } else {
            board[column][row] = symbol;
        }
    }

    private boolean ifEnd(int counter, int howManyFields) {
        counter *= counter;
        if (counter == howManyFields)
            return true;
        else
            return false;
    }
}


