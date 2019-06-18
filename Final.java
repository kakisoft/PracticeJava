//
// kaki@PMAC465S ~/tmp/java/PracticeJava> java Static
// Exception in thread "main" java.lang.NoSuchMethodError: User.getInfo()V
//         at Static.main(Static.java:21)
// kaki@PMAC465S ~/tmp/java/PracticeJava> javac Final.java
// Final.java:17: エラー: final Userからは継承できません
// class AdminUser extends User {
//                         ^
// Final.java:9: エラー: final変数VERSIONに値を代入することはできません
//         User.VERSION = 1.2;
//             ^
// Final.java:24: エラー: AdminUserのsayHi()はUserのsayHi()をオーバーライドできません
//     public void sayHi() {
//                 ^
//   オーバーライドされたメソッドはfinalです
// エラー3個

// final: 変更ができない

final class User {
    protected String name;
    private static final double VERSION = 1.1;

    public User(String name) {
        this.name = name;
        User.VERSION = 1.2;
    }

    public final void sayHi() {
        System.out.println("hi! " + this.name);
    }
}

class AdminUser extends User {

    public AdminUser(String name) {
        super(name);
    }

    @Override
    public void sayHi() {
        System.out.println("[admin] hi! " + this.name);
    }

}

public class Final {

    public static void main(String[] args) {
        User tom = new User("tom");
    }

}