import java.util.*;

public class Array {

  // 配列のサイズは変更できません。したがって、技術的には配列から要素を削除することはできません。
  // Arrays.asList は、プリミティブ型の配列をリスト化してくれない。
  // List.add(int 追加位置, Object 追加する要素)

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

    //============================
    //        値の削除
    //============================
    // int[] ari1 = {1, 2, 3, 4, 5};
    int[] ari1 = {3, 8, 9, 7, 6};
    int loopCnt = 3;

    List<Integer> intList = new ArrayList<Integer>();
    for (int i : ari1)
    {
        intList.add(i);
    }

    for(int i=0; i<loopCnt; i++)
    {
      int tmpi = intList.get(intList.size() - 1);
      intList.remove(intList.size() - 1);
      intList.add(0, tmpi);
    }

    // for (int i : intList)
    // {
    //     System.out.println(i);
    // }

    
    System.out.println("============");

    int[] ret = new int[intList.size()];
    int cnt = intList.size();
    for(int i=0; i<cnt; i++)
    {
      ret[i] = intList.get(0);
      intList.remove(0);
    }    

    for (int i : ret)
    {
        System.out.println(i);
    }

  }

}