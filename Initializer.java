//============================
//      イニシャライザ
//============================
/*
クラスに対する処理か。（インスタンスに対するコンストラクタみたいなもん）
*/
// static

class User {
    private String name;
    private static int count; // クラス変数

    // イニシャライザ
    static {
        User.count = 0;
        System.out.println("Static initializer");
    }

    {
        System.out.println("Instance initializer");
    }
    // ↑インスタンスイニシャライザ（インスタンスを初期化する際に行う処理を書ける）

    // インスタンスイニシャライザはインスタンス化される前、
    // コンストラクタはインスタンス化された後に実行される。
    // 主な使い道としてはコンストラクタがオーバーロードされていて複数あった場合、共通処理をこちらに書いておいて先に実行しておく、とか。

    public User(String name) {
        this.name = name;
        User.count++;
        System.out.println("Constructor");
    }

    public static void getInfo() { // クラスメソッド
        System.out.println("# of instances: " + User.count);
    }

}

public class Initializer {

    public static void main(String[] args) {
        User.getInfo(); // 0 //=> Static initializer, # of instances: 0
        User tom = new User("tom"); // => Constructor
        User.getInfo(); // 1 //=> # of instances: 1
        User bob = new User("bob"); // => Instance initializer, Constructor
        User.getInfo(); // 2 //=> # of instances: 2
    }

}

// Static initializer
// # of instances: 0
// Instance initializer
// Constructor
// # of instances: 1
// Instance initializer
// Constructor
// # of instances: 2
