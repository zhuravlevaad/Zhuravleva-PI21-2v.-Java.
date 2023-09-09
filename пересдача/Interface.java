import javafx.application.Application; 
import static javafx.application.Application.launch; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 

import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.control.PasswordField; 
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text; 
import javafx.scene.control.TextField; 
import javafx.stage.Stage;  
         
public class Interface extends Application { 
   @Override 
   public void start(Stage stage) {      
      //заголовок
      Text text1 = new Text("Введите каталог");       
       
      //текстовое поле       
      TextField textField1 = new TextField(); 
       
      //кнопки 
      Button button1 = new Button("Применить"); 
      Button button2 = new Button("Очистить");  
      
      //разметка
      GridPane gridPane = new GridPane();    
      gridPane.setMinSize(400, 200); 
      gridPane.setPadding(new Insets(10, 10, 10, 10)); 
      gridPane.setVgap(5); 
      gridPane.setHgap(5);       
      gridPane.setAlignment(Pos.CENTER); 
      gridPane.add(text1, 0, 0); 
      gridPane.add(textField1, 1, 0);
      gridPane.add(button1, 0, 2); 
      gridPane.add(button2, 1, 2); 
      
      //стилизация 
      button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
      button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
       
      text1.setStyle("-fx-font: normal bold 20px 'serif' "); 
      gridPane.setStyle("-fx-background-color: BEIGE;"); 
       
      //сцена
      Scene scene = new Scene(gridPane); 
      stage.setTitle("Programm"); 
      stage.setScene(scene);
      stage.show(); 
   }      
   public static void main(String args[]){ 
      launch(args); 
   } 
}


//javac Interface.java 
//java Interface