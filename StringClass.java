import java.util.*;

public class StringClass {

    public static void main(String[] args) {
        String s = "abcdef";
        System.out.println(s.length()); // 6
        System.out.println(s.substring(2, 5)); // cde
        System.out.println(s.replaceAll("ab", "AB"));// ABcdef

        String s1 = "ab";
        String s2 = "ab";

        if (s1.equals(s2)) {
            System.out.println("same!"); // same!
        }

        if (s1 == s2) {
            System.out.println("same!same!");
        }

        String ss1 = new String("ab");
        String ss2 = new String("ab");

        if (ss1 == ss2) {
            System.out.println("same!same!same!"); // same!same!
        }

        // =========================
        // split
        // =========================
        String str1 = "りんご,,すいか,ぶどう,,,";
        String[] fruits1 = str1.split(",", -1);

        // System.out.println(fruit);

        for (String fruit1 : fruits1) {
            System.out.println("[" + fruit1 + "]");
        }
        // [りんご]
        // []
        // [すいか]
        // [ぶどう]
        // []
        // []
        // []

        // =========================
        // split
        // =========================
        String str2 = "りんご,,すいか,ぶどう,,,";
        String[] fruits2 = str1.split(",", 0); // 末尾の値を持たない部分が省略されます。

        for (String fruit2 : fruits2) {
            System.out.println("[" + fruit2 + "]");
        }
        // [りんご]
        // []
        // [すいか]
        // [ぶどう]

        // =========================
        // split
        // =========================
        String str3 = "りんご,,すいか,ぶどう,,,";
        String[] fruits3 = str1.split(",", 2); // 左から指定の個数分、分割

        for (String fruit3 : fruits3) {
            System.out.println("[" + fruit3 + "]");
        }
        // [りんご]
        // [,すいか,ぶどう,,,]

        // =========================
        // split -> Array
        // =========================
        String str4 = "A,BC,,D";
        List<String> split4 = Arrays.asList(str4.split(","));
        System.out.println(split4); // → ["A", "BC", "", "D"]
        System.out.println(split4.size()); // → 4

    }

}
