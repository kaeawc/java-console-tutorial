public class Main {

  public static void main(String[] args) {

    StringBuilder list = new StringBuilder();

    for (String arg : args) list.append(arg);

    System.out.printf("Here are my args: %s", list.toString());

  }
}
