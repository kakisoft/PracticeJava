public class Printf {

    public static void main(String[] args) {

        int score = 50;
        double height = 165.8;
        String name = "taguchi";

        // 文字列の場合は %s, 整数値の場合は %d, 浮動小数点数の場合は %f を使う
        System.out.printf("name: %s, score: %d, height: %f\n", name, score, height);
        // name と score に関しては 10 桁で表示
        System.out.printf("name: %-10s, score: %10d, height: %5.2f\n", name, score, height);
        // %10s 右詰め 、%-10s 左詰め
        // 浮動小数点数に関しては、整数部分を 5 桁、小数点以下を 2 桁にしたい場合は %5.2f のように書く。

        String s = String.format("name: %10s, score: %-10d, height: %5.2f\n", name, score, height);
        System.out.println(s);
    }

}

// name: taguchi, score: 50, height: 165.800000
// name: taguchi , score: 50, height: 165.80
// name: taguchi, score: 50 , height: 165.80
