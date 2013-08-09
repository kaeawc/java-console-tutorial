import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    StringBuilder list = new StringBuilder();

    String prompt = "Do you want to do something? (y/n)";

    for (String arg : args) list.append(arg);

    System.out.printf("Here are my args: %s", list.toString());

    System.out.println(prompt);

    while(!new Scanner(System.in).nextLine().equals("n")) {

      System.out.println("Doing something...");

      System.out.println(prompt);

    }

  }
}
