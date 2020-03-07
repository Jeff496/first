import javax.lang.model.util.ElementScanner6;

class Main {
  public static void main(String[] args) {
    // System.out.println(123);
    // System.out.print("123");
    // System.out.print("dsgj");
    //Comments
    //println allows the cursor to move to the next line
    //print keeps the cursor where it ended
    //things are printed to the console screen
    
    //variables
    //4 primtive(basic data types)
    //int-integers(positve, negative) ex:5, 90, -4, 0
    //double - decimal numbers ex:6.5, 3.4, 0.0
    //boolean - true or false 
    //char - single characters ex: 'c', 'r', need to be in single quotes
    //non primitve data types
    //String - collection of chars ex. "Hello world", "125", "false"

    //Format:
    //dataType variableName = value;
    //Example:
    int age = 12;
    System.out.println(age);
    double math = age/2.0;
    System.out.println(math);
    String hi =  "hello";
    System.out.println(hi);
    char bird = 'o';
    boolean turtle = false;

    //variable naming conventions
    //must:
    //variable must not start with a numbers
    // Ex. 3doorsDown(illegal)
    //variable name must not start with a special character(with an exception)
    //Ex. ?question, !wow, (illegal examples)
    //your variable name cannot have spaces in between, Ex. my awesome variable, great kid(illegal)
    //  should:
    //should not start variable name with a capital letter Ex: Dog, God(illegal)
    //should follow camelCasing. Ex. mySummerCar, towerOfGod(legal)
    //variable name should give as much info as possible. 
    //Ex. int score = 98;
    //Ex. String name = "Robin";

    String textbookType = "Science";
    int periodNumber = 3;
    double gpa = 2.2;

    //Concatenation
    //Adding strings together
    System.out.println("Hello " + "world");
    System.out.println("My gpa is " + gpa + ".");

    //Mathematical operators and comparison operators and logical operators
    //Mathematical operators: +, -, *, /, %
    // % - called a modulo (mod)
    //returns the remainder
    //Ex. 13 % 6 == 1
    // = - call the assignment operator gives the value to a variable
    
    // comparison operators
    //makes comparison between two numbers 
    // >, < , >=, <=, ==, !=
    //== - comparison operator 
    //checks if two values are equal
    //!= - not equal to sign
    //checks to see if two values are not equal

    // logical operators
    // and (&&), or (||)
    // x && y == true
    // x= true, y = true

    // Conditional statements
    // or if statements
    // if (condition) {
    //    body;
    //}
    if (age >= 21){
      System.out.println("you are allowed to drive");
    } 
    if (age == 12){
      System.out.println("you are 12");
    }else{
      System.out.println("you are not allowed to drive");
    }

    //else
    //allows us to run the code inside else when the condition is false
    //else statement is linked to the one right above it
    //else if 
    //can only be created below an if statement
    // else if is skipped if the if statements above it are true
    //you can have as many else if as you want
    int hour = 7;
    if (hour<4){
      System.out.println("You're early");
    }else if (hour<6 && hour > 4){
      System.out.println("You're late'");
    }else{
      System.out.println("Class has passed");
    }

  }
}