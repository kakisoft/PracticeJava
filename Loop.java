public class Loop {

  public static void main(String[] args) {
    //============================
    //           for
    //============================
    // for
    // 0 - 9
    // break
    // continue
    for (int i = 0; i < 10; i++) {
      if (i == 5) {
        // break;
        continue;
      }
      System.out.println(i);
    }


    //============================
    //         while
    //============================
    // while
    // 0 - 9
    int j = 5;
    while (j < 10) {
      System.out.println(j);
      j++;
    }

    j = 5;
    do {
      System.out.println(j);
      j++;
    } while (j < 10);


  }
}