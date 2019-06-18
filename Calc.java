public class Calc {

  public static void main(String[] args) {
    // 演算
    // + - * / %
    // ++ --
    int i;
    i = 10 / 3;
    System.out.println(i); // 3

    i = 10 % 3;
    System.out.println(i); // 1
    int x = 5;
    x++;
    System.out.println(x); // 6
    x--;
    System.out.println(x); // 5

    int y = 5;
    // y = y + 12;
    y += 12;
    System.out.println(y); // 17

    String s;
    s = "hello " + "world";
    System.out.println(s);
  }

}