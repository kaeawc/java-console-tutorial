import java.util.Scanner;

public class Main {

  private static String prompt = "Do you want to do something? (y/n)";

  public static void main(String[] args) {

    StringBuilder list = new StringBuilder();

    for (String arg : args) list.append(arg);

    System.out.printf("Here are my args: %s", list.toString());

    loop();

  }

  public static void loop() {

    while(getYesNo()) {

      doSomething();

    }

  }

  public static Boolean getYesNo() {

    System.out.println(prompt);

    String input = new Scanner(System.in).nextLine();

    if(input.toLowerCase() == "n")
      return false;
    else if(input.toLowerCase() == "y")
      return true;

    return false;
  }

  public static void doSomething() {

    System.out.println("Doing something...");

  }
}
