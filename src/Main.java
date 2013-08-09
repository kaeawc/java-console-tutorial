import java.util.Scanner;

public class Main {

  private static String prompt = "Do you want to do something? (y/n)";

  public static void main(String[] args) {

    StringBuilder list = new StringBuilder();

    for (String arg : args) list.append(arg);

    System.out.printf("Here are my args: %s", list.toString());

    System.out.println(prompt);

  }

  public static void loop() {

    while(!new Scanner(System.in).nextLine().equals("n")) {

      System.out.println("Doing something...");

      System.out.println(prompt);

    }

  }


}
