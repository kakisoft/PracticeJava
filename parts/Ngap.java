import java.util.*;

public class Ngap {

    public static void main(String[] args) {
        // =========================
        //
        // =========================

        int argDec = 254;
        String argBin = Integer.toBinaryString(argDec);
        // System.out.println(argBin); // => 1111110
        argBin = "1000000100001000101";

        String[] arr01 = argBin.split("1", 0);
        // こっちだとエラー出た。
        // List<String> list01 = Arrays.asList(argBin.split("1"));
        // 配列をリストに変換
        List<String> list02 = new ArrayList<String>(Arrays.asList(arr01));

        if (argBin.substring(0, 1) != "1") {

        }

        // こっちだとエラー出た。
        // list01.remove("0");
        // list01.remove(0);
        // list01.remove(list01.size() - 1);

        list02.remove(0);
        if (argBin.substring(argBin.length() - 1).equals("0") && list02.size() > 0) {
            list02.remove(list02.size() - 1);
        }

        for (String li : list02) {
            System.out.println("[" + li + "]");
        }

        list02.stream()
                // 中間処理
                .filter(e -> e.length() > 0) // ラムダ式 引数 -> 処理
                .map(e -> "(" + e.length() + ")")
                // 終端処理
                .forEach(System.out::println);

    }

}
