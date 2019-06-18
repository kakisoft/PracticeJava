/*
基本データ型には、それに対応する参照型のクラスが用意されている。
int には Integer クラス
ouble には Double クラス
これらをラッパークラス（Wrapper Class）と呼ぶ



double や long、float など、そういったものに関しても「Integer」や「int」あたりを変えてあげればいい
*/

/*
Wrapper Class
int -> Integer
double -> Double
*/

public class WrapperClass {

    public static void main(String[] args) {
        // Integer i = new Integer(32);
        // int n = i.intValue();

        Integer i = 32; // auto boxing
        i = null;
        int n = i; // auto unboxing

    }

}

// null は unboxing できないので、例外が発生