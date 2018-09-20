package binaryviewer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BinaryViewer extends Application {
    
    @Override
    public void start(Stage primaryStage){
        TextField tf = new TextField();
        TextArea display = new TextArea();
 
        VBox root = new VBox(15);
        root.getChildren().addAll(tf, display);
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Binary Viewer");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        tf.setOnAction(e -> {
           String f1 = tf.getText();
           int counter = 0;
           try {
               RandomAccessFile raf = new RandomAccessFile(f1, "r");
               raf.seek(0);
               StringBuilder makeBinary = new StringBuilder();
               while (raf.getFilePointer()<raf.length()) {
                   String newBinary = Integer.toBinaryString(raf.read());
                   if (newBinary.length() != 8) {
                       for (int i = 0; i < 8-newBinary.length(); i++) {
                           makeBinary.append("0");
                       }
                   }
                   counter++;
                   makeBinary.append(newBinary + " "); 
                   if (counter%8==0) {
                       makeBinary.append("\n");
                   }
               }
               display.setText(makeBinary.toString());
               System.out.print(makeBinary.toString());
           } catch (FileNotFoundException ex) {
                Logger.getLogger(BinaryViewer.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(BinaryViewer.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
    public static void main(String[] args) {
        launch(args);
        
        ///Users/kaylenmelamed/Documents/workspace/Chap12/Lincoln.txt
    }
    
}
