import java.util.*;

//key と value でデータを管理
//データの順番が不定

/*
【 類似品 】

TreeMap : key の順番が一定
LinkedHashMap : データが追加された順番が一定
*/
public class HashMap01 {

    public static void main(String[] args) {
        // HashMap: key value
        // TreeMap
        // LinkedHashMap

        // HashMap<String, Integer> sales = new HashMap<>();
        Map<String, Integer> sales = new HashMap<>();

        sales.put("tom", 10);
        sales.put("bob", 20);
        sales.put("steve", 30);

        System.out.println(sales.get("tom")); // 10
        System.out.println(sales.size()); // 3

        for (Map.Entry<String, Integer> sale : sales.entrySet()) {
            System.out.println(sale.getKey() + ":" + sale.getValue());
        }

        sales.put("tom", 100);
        sales.remove("steve");

        for (Map.Entry<String, Integer> sale : sales.entrySet()) {
            System.out.println(sale.getKey() + ":" + sale.getValue());
        }
    }

}

// 10
// 3
// tom:10
// bob:20
// steve:30
// tom:100
// bob:20
