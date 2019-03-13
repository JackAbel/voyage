package cn.sohu.jack.thinking.java.chapter7;

/**
 * @author jinxianbao
 * @date 2019/3/10 9:19 PM
 * 第七章练习8
 */
public class Exercise708 {
    class BaseClass {
        public BaseClass() {
            System.out.println("baseClass Constructor");
        }
    }

    class SonClass extends BaseClass {
        public SonClass() {
        }

        public SonClass(int i) {
            super();
            System.out.println("create SonClass " + i);
        }
    }
}
