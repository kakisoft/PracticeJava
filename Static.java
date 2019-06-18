// static

class User {
    private String name;
    private static int count = 0; // クラス変数

    public User(String name) {
        this.name = name;
        User.count++;
    }

    public static void getInfo() { // クラスメソッド
        System.out.println("# of instances: " + User.count);
    }

}

public class Static {

    public static void main(String[] args) {
        User.getInfo(); // # of instances: 0
        User tom = new User("tom");
        User.getInfo(); // # of instances: 1
        User bob = new User("bob");
        User.getInfo(); // # of instances: 2
    }

}