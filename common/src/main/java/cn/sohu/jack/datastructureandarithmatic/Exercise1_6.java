package cn.sohu.jack.datastructureandarithmatic;

/**
 * @description: prints all the permutations of the characters in String str
 * @author: Xiangbao Jin
 * @since 2019/7/19 6:23 PM
 */
public class Exercise1_6 {

    private static void permute(String str) {
        char[] chars = str.toCharArray();
        permute(chars, 0, chars.length -1);

    }

    private static void permute(char[] chars, int low, int high) {
        if (low == high) {
            String count = "";
            for (int i = 0; i < chars.length; i++) {
                count += chars[i];
            }
            System.out.println(count);
        } else {
            for (int i = low; i <= high; i++) {
                swap(chars, low, i);
                permute(chars, low+1, high);
                swap(chars, low, i);
            }
        }

    }

    private static void swap(char[] chars, int i, int j) {
        char tmp = chars[i];
        chars[i] = chars[j];
        chars[j] = tmp;
    }

    public static void main(String[] args) {
        permute("abcd");
    }
}
