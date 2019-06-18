// 抽象クラス -> 具象クラス

abstract class User {
    public abstract void sayHi(); // 抽象メソッド
}

class JapaneseUser extends User {
    @Override
    public void sayHi() {
        System.out.println("こんにちは！");
    }
}

class AmericanUser extends User {
    @Override
    public void sayHi() {
        System.out.println("Hi!");
    }
}

public class AbstractClass {

    public static void main(String[] args) {
        AmericanUser tom = new AmericanUser();
        JapaneseUser aki = new JapaneseUser();
        tom.sayHi(); // => Hi!
        aki.sayHi(); // => こんにちは！
    }

}