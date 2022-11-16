import java.util.Scanner; 

public class Unit1 {
      public static void main(String[] args) { 
    	  int p1Wins = 0; 
    	  int p2Wins = 0; 
    	  
    	  Scanner scanner = new Scanner(System.in); 
    	  char grid[][] = new char[][]{ {'1','2','3'}, {'4','5','6'}, {'7','8','9'}}; 
    	  
    	  System.out.println("Enter Player 1 Name: "); 
    	  String player1 = scanner.nextLine(); 
    	  
    	  System.out.println("Enter Player 2 Name: "); 
    	  String player2 = scanner.nextLine(); 
    	  
    	  Player p1 = new Player(player1); 
    	  Player p2 = new Player(player2); 
    	  
    	  while (p1.wins() < 2 && p2.wins() < 2) { 
    		  grid = new char[][]{{'1','2','3'}, {'4','5','6'}, {'7','8','9'}}; 
    		  
    		  for (int i = 1; i <= 9; i++) {
    			  
    			  printGrid(grid);  
    			  
    			  int choice; 
    			  if (i % 2 == 1) { 
    				  System.out.print("(X) >> ");
    				  choice = scanner.nextInt();
    				  
    				  switch (choice) { 
    				      case 1:
    				    	  grid[0][0] = 'X';
    				    	  break;
    				      case 2:
    				    	  grid[0][1] = 'X';
    				    	  break;
    				      case 3:
    				    	  grid[0][2] = 'X';
    				    	  break;

    				      case 4:
    				    	  grid[1][0] = 'X';
    				    	  break;

    				      case 5:
    				    	  grid[1][1] = 'X';
    				    	  break;

    				      case 6:
    				    	  grid[1][2] = 'X';
    				    	  break;

    				      case 7:
    				    	  grid[2][0] = 'X';
    				    	  break;

    				      case 8:
    				    	  grid[2][1] = 'X';
    				    	  break;

    				      case 9:
    				    	  grid[2][2] = 'X';
    				    	  break;

    				      default: 
    				    	  System.out.println("That is not within the range!"); 
    				  }
    				  
    				  if(p1.checkWin(grid)) { 
    					   p1.addWins(); 
     					   System.out.println("----------------"); 
    					   System.out.println(p1.name() + ": " + p1.wins()); 
    					   System.out.println(p2.name() + ": " + p2.wins()); 
     					   System.out.println("----------------"); 
    					   break;
    				  }
    			  }
    			  else { 
     				  System.out.print("(O) >> ");
                      choice = scanner.nextInt();

    				  switch (choice) { 
    				      case 1:
    				    	  grid[0][0] = 'O';
    				    	  break;

    				      case 2:
    				    	  grid[0][1] = 'O';
    				    	  break;
    				      case 3:
    				    	  grid[0][2] = 'O';
    				    	  break;

    				      case 4:
    				    	  grid[1][0] = 'O';
    				    	  break;
    				      case 5:
    				    	  grid[1][1] = 'O';
    				    	  break;

    				      case 6:
    				    	  grid[1][2] = 'O';
    				    	  break;

    				      case 7:
    				    	  grid[2][0] = 'O';
    				    	  break;

    				      case 8:
    				    	  grid[2][1] = 'O';
    				    	  break;

    				      case 9:
    				    	  grid[2][2] = 'O';
    				    	  break;

    				      default: 
    				    	  System.out.println("That is not within the range!"); 
    				  }
    				  
    				  if (p2.checkWin(grid)) { 
    					  p2.addWins(); 
    					  System.out.println("----------------"); 
   					      System.out.println(p1.name() + ": " + p1.wins()); 
   					      System.out.println(p2.name() + ": " + p2.wins()); 
    					  System.out.println("----------------"); 
   					      break;
    				  }
    			  }
    		  }
    	  }
    	  

          if (p1.wins() > p2.wins()) { 
        	  System.out.println(p1.name() + " win!"); 
          }
          else { 
        	  System.out.println(p2.name() + " win!"); 
          }
    	  
    	  scanner.close(); 
      }
      
      public static void printGrid(char grid[][]) { 
          for (int i = 0; i < grid.length; i++) { 
        	  for (int j = 0; j < grid[0].length; j++) { 
        		  System.out.print(grid[i][j] + " ");
        	  }
        	  System.out.println();
          }
      }
}
