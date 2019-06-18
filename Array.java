public class Array {

  public static void main(String[] args) {
    //============================
    //           Array
    //============================
    // 配列
    // sales1, sales2, ...
    // sales

    int[] sales1;
    sales1 = new int[3];

    int[] sales2;
    sales2 = new int[] {100, 200, 300};

    int[] sales3 = {100, 200, 300};

    sales3[0] = 100;
    sales3[1] = 200;
    sales3[2] = 300;

    System.out.println(sales3[1]); // 200
    sales3[1] = 1000;
    System.out.println(sales3[1]); // 1000

    //============================
    //        値の取り出し
    //============================
    // 配列
    // sales.length
    int[] sales = {700, 400, 500};

    // for (int i = 0; i < 3; i++) {
    // for (int i = 0; i < sales.length; i++) {
    //   System.out.println(sales[i]);
    // }

    for (int sale : sales) {
      System.out.println(sale);
    }


  }

}