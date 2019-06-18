import java.util.*;

/*
ArrayList 同様複数のデータを扱うものですが、重複を許さない点とデータを保持する順番が定まらない点が異なります。
順番が定まらないので何番目を取り出すといったことも出来ません。
ループで取り出す時、順番が保障されない
*/

/*
【 類似品 】

HashSet : 順番が不定、
TreeSet : 値順にソート、
LinkedHashSet は追加された順を保持する
*/
public class HashSet01 {

    public static void main(String[] args) {
        // HashSet
        // TreeSet
        // LinkedHashSet

        // HashSet<Integer> sales = new HashSet<>();
        Set<Integer> sales = new HashSet<>();

        sales.add(10);
        sales.add(20);
        sales.add(30);
        sales.add(10);

        System.out.println(sales.size()); // 3

        for (Integer sale : sales) {
            System.out.println(sale);
        }

        sales.remove(30);

        for (Integer sale : sales) {
            System.out.println(sale);
        }
    }

}

// 3
// 20
// 10
// 30
// 20
// 10
