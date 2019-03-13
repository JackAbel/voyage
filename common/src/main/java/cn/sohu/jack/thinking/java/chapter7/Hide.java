package cn.sohu.jack.thinking.java.chapter7;

/**
 * @author jinxianbao
 * @date 2019/3/10 9:55 PM
 * 导出类重新定义该方法名称并不会屏蔽其在基类的方法的任何版本
 */
public class Hide {
    static class Homer {
        char doh(char c) {
            System.out.println("doh(char c)");
            return 'd';
        }

        float doh(float f) {
            System.out.println("doh(float f)");
            return 1.0f;
        }
    }

    static class Milhouse {

    }

    static class Bart extends Homer {
        void doh(Milhouse milhouse) {
            System.out.println("doh(milhouse)");
        }
    }

    public static void main(String[] args) {
        Bart bart = new Bart();
        bart.doh('a');
        bart.doh(1);
        bart.doh(1.0f);
        bart.doh(new Milhouse());

    }

}
