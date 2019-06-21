import java.util.*;

public class BinaryControl {

    public static void main(String[] args) {
        // ============================
        // 2進数 -> 10進数
        // ============================
        final String bin1 = "11111110";
        final int dec1 = Integer.parseInt(bin1, 2);
        System.out.println(dec1); // => 254

        // ============================
        // 10進数 -> 2進数
        // ============================
        final int dec2 = 254;
        final String bin2 = Integer.toBinaryString(dec2);
        System.out.println(bin2); // => 1111110

        // ============================
        //
        // ============================

        // ============================
        //
        // ============================
    }

}

// 10
// 20
// 30
// 100
// 20
