public class Variable {
    
  public static void main(String[] args) {
    String msg01;
    msg01 = "Hello World!";
    String msg02 = "Hello World Again!";

    System.out.println(msg01);
    System.out.println(msg02);

    //==========================
    //
    //==========================

    // 文字
    char a05 = 'a'; //''で囲む
    // 整数   byte < short < int < long
    int x05 = 10;
    long y05 = 5555555555L; // longは後方にLを付ける
    // 浮動小数点数    float < double
    double d05 = 23423.344;
    float f05 = 32.33F; //floatは、後方にFを付ける。
    // 論理値
    boolean flag05 = true; // false
    // 文字列
    // \n
    // \t
    String msg05 = "Hello Wo\nrld Again\t!";
    System.out.println(msg05);        

  }  
}