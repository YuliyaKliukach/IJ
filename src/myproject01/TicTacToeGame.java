package myproject01;

import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {

        TicTacToe tictactoe=new TicTacToe();

        System.out.println("Lets play TicTacToe");
        tictactoe.printGameBoard();

        while (true){
            tictactoe.replace();
            tictactoe.printGameBoard();
            tictactoe.isWinner();

        }



    }
    }

