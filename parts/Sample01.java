import java.util.*;
import java.util.stream.Stream;

public class Sample01 {

    public static void main(String[] args) {

        // 5つの要素の配列
        String[] arr_1 = new String[] { "1", "2", "3", "4", "5" };

        // 配列の要素をすべて出力
        for (String str : arr_1) {
            System.out.println(str);
        }

        // 配列をリストに変換
        List<String> list = new ArrayList<String>(Arrays.asList(arr_1));

        System.out.println("配列から要素「3」を削除");
        list.remove("3");
        list.remove(0);

        // 配列の要素をすべて出力
        String[] arr_2 = (String[]) list.toArray(new String[list.size()]);
        for (String str : arr_2) {
            System.out.println(str);
        }

    }

}

// 6
// cde
// ABcdef
// same!
// same!same!
