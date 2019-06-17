package cn.sohu.jack.thinking.java.chapter15generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: contain three object
 * @author: Xiangbao Jin
 * @since 2019/6/14 6:12 PM
 */
public class Holder<T> {
    public T a;
    public T b;
    public T c;

    public Holder(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public T getA() { return a; }
    public T getB() { return b; }
    public T getC() { return c; }
    public void setA(T a) {  this.a = a; }
    public void setB(T b) {  this.b = b; }
    public void setC(T c) {  this.c = c; }
}
