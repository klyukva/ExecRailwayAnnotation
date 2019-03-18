package main;

import com.example.annotation.Railway;

public class Main {

  @Railway
  public static final String demoNoCollision = "1 2 4,2 3 5,3 6 3,6 4 3,4 5 5,5 1 6,5 2 10,1 6 10,5 6 3,2 6 3;1 5 6 3,2 6 4";
  @Railway
  public static final String demoCollision = "1 2 4,2 3 5,3 6 3,6 4 3,4 5 5,5 1 6,5 2 10,1 6 10,5 6 3,2 6 3;1 5 6 3,2 6 4,5 6";
  @Railway
  public static final String demoNoRoute = "1 2 4,2 3 5,3 6 3,6 4 3,4 5 5,5 1 6,5 2 10,1 6 10,5 6 3,2 6 3;1 5 6 3,2 6 4,5 60";
  @Railway
  public static final String demoIncorrectArgument = "!1 2 4,2 3 5,3 6 3,6 4 3,4 5 5,5 1 6,5 2 10,1 6 10,5 6 3,2 6 3;1 5 6 3,2 6 4,5 6";

  public static void main (String ... args) {
    System.out.println(demoNoCollision + "\n" + demoCollision
            + "\n" + demoNoRoute + "\n" + demoIncorrectArgument);
  }
}
