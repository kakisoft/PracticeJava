public class Conditions {

  public static void main(String[] args) {
    //============================
    //           if
    //============================
    // if
    // > >= < <= == !=
    // && || !
    int score = 95;
    if (score > 80) {
      System.out.println("Great!");
    } else if (score > 60) {
      System.out.println("Good!");
    } else {
      System.out.println("so so ... !");
    }


    String msg = score > 80 ? "Great!" : "so so ... !";
    System.out.println(msg);

    //============================
    //         switch
    //============================
    String signal = "green";
    switch (signal) {
      case "red":
        System.out.println("stop!");
        break;
      case "blue":
      case "green":
        System.out.println("go!");
        break;
      case "yellow":
        System.out.println("caution!");
        break;
      default:
        System.out.println("wrong signal!");
        break;
    }



  }

}