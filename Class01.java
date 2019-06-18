class User {
  String name = "Me!"; // フィールド

  void sayHi() {
    System.out.println("hi!");
  }
}

public class Class01 {

  public static void main(String[] args) {
    // int x;
    // String s;

    // Class
    User tom;
    tom = new User(); // インスタンス
    System.out.println(tom.name);       //=> Me!
    tom.sayHi();                        //=> hi!
  }

}