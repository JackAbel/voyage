package cn.sohu.jack.thinking.java.chapter11collection;

import cn.sohu.jack.thinking.java.chapter10innerclass.U;

/**
 * @author jinxianbao
 * @date 2019/4/16 9:42 AM
 */
public class Practice15 {
    public static void main(String[] args) {
        String example = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";
        Stack<Character> charStack = new Stack<Character>();
        charStack.push('U');
        charStack.push('n');
        charStack.push('c');
        System.out.print(charStack.pop());
        System.out.print(charStack.pop());
        System.out.print(charStack.pop());
        charStack.push('e');
        charStack.push('r');
        charStack.push('t');
        System.out.print(charStack.pop());
        System.out.print(charStack.pop());
        System.out.print(charStack.pop());
        charStack.push('a');
        System.out.print(charStack.pop());      
        charStack.push('i');
        System.out.print(charStack.pop());
        charStack.push('n');
        charStack.push('t');
        charStack.push('y');
        System.out.print(charStack.pop());
        System.out.print(charStack.pop());
        System.out.print(charStack.pop());
        charStack.push('r');
        charStack.push('u');
        System.out.print(charStack.pop());
        System.out.print(charStack.pop());        
        charStack.push('l');
        charStack.push('e');
        charStack.push('s');        
        System.out.print(charStack.pop());
        System.out.print(charStack.pop());
        System.out.print(charStack.pop());
    }
}
