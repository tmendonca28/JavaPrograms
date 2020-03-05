import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        char [][] board = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}
        };

        printBoard(board);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your placement (1-9): ");
        int position = scanner.nextInt();
        System.out.println(position);

        placeChoice(board, position, "player");
        printBoard(board);
    }

    public static void printBoard(char[][] board) {
        // Creating a 2d Array for the board
        for(char[] row: board){
            for(char c: row){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void placeChoice(char[][] board, int position, String user) {
        char symbol = ' ';
        if(user.equals("player")){
            symbol='X';
        } else if(user.equals("cpu")){
            symbol='O';
        }
        switch(position) {
            case 1:
                board[0][0] = symbol;
                break;
            case 2:
                board[0][2] = symbol;
                break;
            case 3:
                board[0][4] = symbol;
                break;
            case 4:
                board[2][0] = symbol;
                break;
            case 5:
                board[2][2] = symbol;
                break;
            case 6:
                board[2][4] = symbol;
                break;
            case 7:
                board[4][0] = symbol;
                break;
            case 8:
                board[4][2] = symbol;
                break;
            case 9:
                board[4][4] = symbol;
                break;
            default:
                break;
        }
    }
}
