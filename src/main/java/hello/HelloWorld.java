package hello;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    ObjectMapper Obj = new ObjectMapper();

    try { 
        Person tintin = new Person("tintin");
        // get Oraganisation object as a json string 
        String jsonStr = Obj.writeValueAsString(tintin); 

        // Displaying JSON String 
        System.out.println(jsonStr); 
    } 

    catch (IOException e) { 
        e.printStackTrace(); 
    } 
  }
}

class Person {
  private String name;
  Person(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
}