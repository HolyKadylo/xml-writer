import java.util.Properties;
import java.io.FileWriter;
import java.io.IOException;

public class App {

        public static void main(String[] args){

            System.out.println("Hello");
            Properties property = new Properties();
            property.setProperty("Hello", "World");
            try{
                FileWriter writer = new FileWriter("result");
                property.store(writer, "comment");
            } catch (IOException io){
                io.printStackTrace();
            }
           
            System.out.println("Bye");

        }

}