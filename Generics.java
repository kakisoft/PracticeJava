// generics

// class MyInteger {
//   public void getThree(int x) {
//     System.out.println(x);
//     System.out.println(x);
//     System.out.println(x);
//   }
// }

// Type という意味で大文字の T がよく使われる。
class MyData<T> {
    public void getThree(T x) {
        System.out.println(x);
        System.out.println(x);
        System.out.println(x);
    }
}

public class Generics {

    public static void main(String[] args) {
        // MyInteger mi = new MyInteger();
        // mi.getThree(55);
        MyData<Integer> i = new MyData<>();
        i.getThree(32);
        MyData<String> s = new MyData<>();
        s.getThree("hello");
    }

}

// 32
// 32
// 32
// hello
// hello
// hello
