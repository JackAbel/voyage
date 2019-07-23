package cn.sohu.jack.datastructureandarithmatic;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @description: the word puzzle problem
 * @author: Xiangbao Jin
 * @since 2019/7/19 3:10 PM
 */
public class Exercise1_2 {
    public static void main(String[] args) {
        char[][] puzzles = {
                {'t','h','i','s'},
                {'w','a','t','s'},
                {'o','a','h','g'},
                {'f','g','g','t'},
        };
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                for (int direction = 0; direction < 8; direction++) {
                    for (int strLen = 2; strLen <= 4; strLen++) {
                        if (wordExist(x, y, direction, strLen, "that", puzzles) == 1) {
                            System.out.println("that is 1");
                            break;
                        }
                    }
                }
            }
        }
    }

    public static int wordExist(int x, int y, int direction, int strLen, String word, char[][] puzzles) {
        char[] swords = new char[5];
        int i = 0;
        while (i < strLen) {
            swords[i] = puzzles[x][y];
            swords[i+1] = ' ';
            i++;
            switch (direction) {
                case 0: // left to right
                    y++;
                    break;
                case 1: // right to left
                    y--;
                    break;
                case 2:
                    x++; // up to down
                    break;
                case 3:
                    x--; // down to up
                    break;
                case 4: // left to right and up to down
                    y++;
                    x++;
                    break;
                case 5: // left to right and down to up
                    y++;
                    x--;
                    break;
                case 6: // right to left and up to down
                    y--;
                    x++;
                    break;
                case 7: // right to left and down to up
                    y--;
                    x--;
                    break;
                default:
                    System.out.println("direction error");
                    return 0;
            }

            if (x < 0 || y < 0 || x >= puzzles.length || y >= puzzles[0].length) {
                System.out.println(String.valueOf(swords).trim());
                if (String.valueOf(swords).trim().equals(word)) {
                    return 1;
                }
                return 0;
            }
        }
        if (Arrays.toString(swords).equals(word)) {
            return 1;
        }
        return 0;
    }
}
