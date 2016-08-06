import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;


class Point {

    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }
}

class PointsAndScores {

    int score;
    Point point;

    PointsAndScores(int score, Point point) {
        this.score = score;
        this.point = point;
    }
}

class Board {
 
    List<Point> availablePoints;
    Scanner scan = new Scanner(System.in);
    char[][] board = new char[3][3];

    public Board() {
    }

    public boolean isGameOver() {
        return (hasXWon() || hasOWon() || getAvailableStates().isEmpty());
    }

    public boolean hasXWon() {
        if ((board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] == 'O') || (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] == 1)) {
            return true;
        }
        for (int i = 0; i < 3; ++i) {
            if (((board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] == 'O')
                    || (board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][i] == 'O'))) {
                return true;
            }
        }
        return false;
    }

    public boolean hasOWon() {
        if ((board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] == 'X') || (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] == 'X')) {
            return true;
        }
        for (int i = 0; i < 3; ++i) {
            if ((board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] == 'X')
                    || (board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][i] == 'X')) {                
                return true;
            }
        }

        return false;
    }

    public List<Point> getAvailableStates() {
        availablePoints = new ArrayList<>();
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (board[i][j] == 0) {
                    availablePoints.add(new Point(i, j));
                }
            }
        }
        return availablePoints;
    }

    public void placeAMove(Point point, char Player) {
        board[point.x][point.y] = Player; 
    }

    public Point returnBestMove() {
        int MAX = -100000;
        int best = -1;

        for (int i = 0; i < rootsChildrenScores.size(); ++i) { 
            if (MAX < rootsChildrenScores.get(i).score) {
                MAX = rootsChildrenScores.get(i).score;
                best = i;
            }
        }

        return rootsChildrenScores.get(best).point;
    }

    void takeHumanInput() {
        System.out.println("Your move: ");
        int x = scan.nextInt();
        int y = scan.nextInt();
        
        while (board[x][y] != ' ') {
            System.out.print(" !! The cell is already taken. Enter the row and column indices: ");
            x = scan.nextInt();
            y = scan.nextInt();
        }
        
        Point point = new Point(x, y);
        placeAMove(point, 'O'); 
    }
    
    public void displayBoard(){
    
      System.out.println();
      
      System.out.print("   y");
      for (int i = 0; i < 3; i++)
        System.out.print(i + "   ");
      System.out.print(' ');

      System.out.println("x"); 

      
      for (int i = 0; i < 3; i++) {
        System.out.print(i + "  ");
        for (int j = 0; j < 3; j++) {
          if (j != 0)
            System.out.print("|");
          System.out.print(" " + board[i][j] + " ");
        }

        System.out.println();

        if (i != (3 - 1)) {
          // separator line
          System.out.print("   ");
          for (int j = 0; j < 3; j++) {
            if (j != 0)
              System.out.print("+");
            System.out.print("---");
          }
          System.out.println();
        }
      }
      System.out.println();
    }
    

    public int returnMin(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i) < min) {
                min = list.get(i);
                index = i;
            }
        }
        return list.get(index);
    }

    public int returnMax(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i) > max) {
                max = list.get(i);
                index = i;
            }
        }
        return list.get(index);
    }

    List<PointsAndScores> rootsChildrenScores;
 
    public void callMinimax(int depth, int turn){
        rootsChildrenScores = new ArrayList<>();
        minimax(depth, turn);
    }
    
    public int minimax(int depth, int turn) {

        if (hasXWon()) return +1;
        if (hasOWon()) return -1;

        List<Point> pointsAvailable = getAvailableStates();
        if (pointsAvailable.isEmpty()) return 0; 

        List<Integer> scores = new ArrayList<>(); 

        for (int i = 0; i < pointsAvailable.size(); ++i) {
            Point point = pointsAvailable.get(i);  

            if (turn == 1) {
                placeAMove(point, 'O'); 
                int currentScore = minimax(depth + 1, 2);
                scores.add(currentScore);

                if (depth == 0) 
                    rootsChildrenScores.add(new PointsAndScores(currentScore, point));
                
            } else if (turn == 2) {
                placeAMove(point, 'X'); 
                scores.add(minimax(depth + 1, 1));
            }
            board[point.x][point.y] = 0; 
        }
        return turn == 1 ? returnMax(scores) : returnMin(scores);
    }
}

public class Game {

	public static void main(String[] args) {
        
        do{
    	Board b = new Board();
        Random rand = new Random();
        b.displayBoard();        
        
        System.out.println("Press Enter to random select who play first.");
        String enter = b.scan.nextLine();
        
        int r = rand.nextInt(2);
        if(r == 1){
            Point p = new Point(1,1);
            b.placeAMove(p, 'O');
            System.out.println(" Computer move first.");
            b.displayBoard();
        }else if (r == 0){
        	System.out.println("You move first!");
        }
        
        while (!b.isGameOver()) {
            System.out.println(" Your move: ");
            int x = b.scan.nextInt();
            int y = b.scan.nextInt();
            
            while ((x!=0 && x!=1 && x!=2)||(y!=0&&y!=1&&y!=2)||b.board[x][y] != ' ') {
                System.out.print(" Invaild cell! Your move: ");
                x = b.scan.nextInt();
                y = b.scan.nextInt();
            }
            Point userMove = new Point(x,y);
            b.placeAMove(userMove, 'X'); 
            b.displayBoard();
            if (b.isGameOver()) {
                break;
            } 
            b.callMinimax(0, 1);
            for (PointsAndScores pas : b.rootsChildrenScores) {
                //System.out.println("Point: " + pas.point + " Score: " + pas.score);
            }
            try{
            	Runtime.getRuntime().exec("cls");
            }
           catch(IOException e){
        	   System.out.println(e.getMessage());
           }
            System.out.println("Computer's move.");
            b.placeAMove(b.returnBestMove(), 'O');
            b.displayBoard();
        }
        if (b.hasXWon()) {
            System.out.println("Unfortunately, you lost!");
        } else if (b.hasOWon()) {
            System.out.println("You win!");
        } else {
            System.out.println("It's a draw!");
        }
        System.out.print("Play again (y/n)? ");
        char ans = b.scan.next().charAt(0);
        if (ans != 'y' && ans != 'Y') {
           System.out.println("Bye!");
           System.exit(0);  // terminate the program
        }
     } while (true);
        
    }
}