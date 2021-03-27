package myproject01;

import java.util.Scanner;

public class TicTacToe {

    char[][] gameBoard = {{'1', '|', '2', '|', '3'},
            {'-', '+', '-', '+', '-'},
            {'4', '|', '5', '|', '6'},
            {'-', '+', '-', '+', '-'},
            {'7', '|', '8', '|', '9'}};
    Scanner scanner = new Scanner(System.in);


    public void printGameBoard() {

        for (char[] chars : gameBoard) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }


    }

    public void replace() {

        char symbol = 0;
        String user;
        System.out.println("What player is playing: 1 or 2?");
        user = scanner.next();
        if (user.equals("1")) {
            symbol = 'X';
        } else if (user.equals("2")) {
            symbol = 'O';
        }

        System.out.println("Enter a number from GameBoard");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                System.out.println("Not correct replacement number");
        }

    }

    public void isWinner() {

        if (gameBoard[0][0] == 'X' && gameBoard[0][2] == 'X' && gameBoard[0][4] == 'X') {
            System.out.println("User 1 is winner");
        } else if (gameBoard[2][0] == 'X' && gameBoard[2][2] == 'X' && gameBoard[2][4] == 'X') {
            System.out.println("User 1 is winner");
        } else if (gameBoard[4][0] == 'X' && gameBoard[4][2] == 'X' && gameBoard[4][4] == 'X') {
            System.out.println("User 1 is winner");
        } else if (gameBoard[0][0] == 'X' && gameBoard[2][0] == 'X' && gameBoard[4][0] == 'X') {
            System.out.println("User 1 is winner");
        } else if (gameBoard[0][2] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][2] == 'X') {
            System.out.println("User 1 is winner");
        } else if (gameBoard[0][4] == 'X' && gameBoard[2][4] == 'X' && gameBoard[4][4] == 'X') {
            System.out.println("User 1 is winner");
        } else if (gameBoard[0][0] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][4] == 'X') {
            System.out.println("User 1 is winner");
        } else if (gameBoard[0][4] == 'X' && gameBoard[2][2] == 'X' && gameBoard[0][4] == 'X') {
            System.out.println("User 1 is winner");
        }else if (gameBoard[0][0] == 'O' && gameBoard[0][2] == 'O' && gameBoard[0][4] == 'O') {
            System.out.println("User 2 is winner");
        } else if (gameBoard[2][0] == 'O' && gameBoard[2][2] == 'O' && gameBoard[2][4] == 'O') {
            System.out.println("User 2 is winner");
        } else if (gameBoard[4][0] == 'O' && gameBoard[4][2] == 'O' && gameBoard[4][4] == 'O') {
            System.out.println("User 2 is winner");
        } else if (gameBoard[0][0] == 'O' && gameBoard[2][0] == 'O' && gameBoard[4][0] == 'O') {
            System.out.println("User 2 is winner");
        } else if (gameBoard[0][2] == 'O' && gameBoard[2][2] == 'O' && gameBoard[4][2] == 'O') {
            System.out.println("User 2 is winner");
        } else if (gameBoard[0][4] == 'O' && gameBoard[2][4] == 'O' && gameBoard[4][4] == 'O') {
            System.out.println("User 2 is winner");
        } else if (gameBoard[0][0] == 'O' && gameBoard[2][2] == 'O' && gameBoard[4][4] == 'O') {
            System.out.println("User 2 is winner");
        } else if (gameBoard[0][4] == 'O' && gameBoard[2][2] == 'O' && gameBoard[0][4] == 'O') {
            System.out.println("User 2 is winner");
        }else{
            System.out.println("No winner");
        }

    }
}




