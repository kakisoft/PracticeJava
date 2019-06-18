public class ValType {

  public static void main(String[] args) {
    int x = 10;
    int y = x;
    y = 5;
    System.out.println(x);  // 10
    System.out.println(y);  // 5

    int[] a = {3, 5, 7};
    int[] b = a;
    b[1] = 8;
    System.out.println(a[1]);  // 8（ a[] の内容が書き換わる ）
    System.out.println(b[1]);  // 8

    String s = "hello";
    String t = s;
    t = "world";
    System.out.println(s);  // hello（文字列はよく使うので、基本データ型と似たような動作になるように調整されている。）
    System.out.println(t);  // world
  }

}