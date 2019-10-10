/**
 * Lab16.Java
 * James Pettitt, 2018
 * Lab 16
 * Creates and displays a multiplication table and can be editted by changing the number of rows and number of columns
 */
public class Lab16 {
  public static void main(String[] args) {
     /*
    int cols = 13; 
    int rows = 13; 
    int [] [] table = new int[rows][cols]; 
    //repeats for every row
    for (int row = 1; row < rows; row++){ 
       //repeats for every column
      for (int col = 1; col < cols; col++){ 
        table[row][col] = row * col; //puts row*col into the element at table[row][col]
        System.out.printf("%6d", table[row][col]); //indents and displays the element
      } 
      System.out.println();
    }*/
    
    int cols = 12;
    int rows = 12;
    int [][] table = new int [rows][cols];
    for( int row = 0; row < rows; row++ ){
       for (int col = 0; col < cols; col++){ 
          table[row][col] = (row+1) * (col+1); //puts row*col into the element at table[row][col]          
       }
    }

     for( int[] row: table) {
        for(int num: row) {
         System.out.print(num + "\t");  
        }
        System.out.println();
     }
     
    
    
  }//main
}//class