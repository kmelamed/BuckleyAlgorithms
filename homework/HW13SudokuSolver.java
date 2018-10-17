
package sudokuhw12;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SudokuHW12 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox(10);
        root.setPadding(new Insets(15, 15, 15, 15));

        GridPane pane = new GridPane();
        GridPane[][]gp = new GridPane[3][3];
        for (int i = 0; i < 3; i++) 
            for (int j = 0; j < 3; j++) {
                gp[i][j] = new GridPane();
                gp[i][j].setPadding(new Insets(2, 2, 2, 2));
                gp[i][j].setStyle("-fx-border-color: purple");
                pane.add(gp[i][j], j, i);
            }
        TextField[][] tfCells = new TextField[9][9];
        for (int i = 0; i < tfCells.length; i++) {
            for (int j = 0; j < tfCells[i].length; j++) {
                tfCells[i][j] = new TextField();
                tfCells[i][j].setPrefColumnCount(1);
                gp[i / 3][j / 3].add(tfCells[i][j], j % 3, i % 3);
            }
        }
        int[][] cells = new int[9][9];
                      
        Button solveBtn = new Button();
        solveBtn.setText("Solve!");
        
        solveBtn.setOnAction(e -> {
            for (int i = 0; i < tfCells.length; i++)
                for (int j = 0; j < tfCells[i].length; j++) 
                    if (!tfCells[i][j].getText().isEmpty())
                        cells[i][j] = Integer.parseInt(tfCells[i][j].getText());            
            
            solve(cells);
            
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (cells[i][j] != 0)
                        tfCells[i][j].setText(cells[i][j] + "");
                    else tfCells[i][j].setText("");
                }
            }
      
        });

        Button resetBtn = new Button("Clear");
        resetBtn.setOnAction(e -> {
            for (int i = 0; i < tfCells.length; i++) {
                for (int j = 0; j < tfCells[i].length; j++) {
                    tfCells[i][j].setText("");
                    cells[i][j] = 0;
                }
            }
        });
             
        StackPane sPane = new StackPane();
        sPane.getChildren().add(solveBtn);
        StackPane sPane2 = new StackPane();
        sPane2.getChildren().add(resetBtn);
        root.getChildren().addAll(pane, sPane, sPane2);
        
        Scene scene = new Scene(root);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Sudoku Solver");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
     
    void solve(int[][] grid) {
        backtrack(grid);

    }
    
    static boolean backtrack(int[][] grid) {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (grid[r][c] == 0) {
                    for (int n = 1; n <= 9; n++) {
                        if (isOk(grid, n, r, c)) {
                            grid[r][c] = n;
                            if (backtrack(grid))
                                return true;
                            else
                                grid[r][c] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    static boolean isOk(int[][] grid, int n, int r, int c) { //need to check row, col, and box
        //checks row
        for (int row = 0; row < grid.length; row++) {
            if (grid[row][c] == n) {
                return false;
            }
        }
        //checks col
        for (int col = 0; col < grid[0].length; col++) { 
            if (grid[r][col] == n) {
                return false;
            }
        }
        //checks box
        int boxRow = r - r % 3;
        int boxCol = c - c % 3;
        for (int i = boxRow; i < boxRow + 3; i++) {
            for (int j = boxCol; i < boxCol + 3; j++) {
                if (grid[boxRow][boxCol] == n) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
}
