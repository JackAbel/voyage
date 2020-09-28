package cn.sohu.jack.datastructureandarithmatic;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2020/9/18 11:20 PM
 */
public class Vector_Array implements Vector {

    private int N = 1024;// 数组容量
    private int n = 0;//对象的实际大小
    private Object[] A;

    public Vector_Array() {
        A = new Object[N];
        n = 0;
    }
    @Override
    public int getSize() {

        return n;
    }

    @Override
    public boolean isEmpty() {
        return 0 == n;
    }

    @Override
    public Object getAtRank(int r) throws ExceptionBoundaryViolation {
        if (0>r || r > n ) throw new  ExceptionBoundaryViolation("数组越界");
        return A[r];
    }

    @Override
    public Object replaceAtRank(int r, Object elem) throws ExceptionBoundaryViolation {
        if (0>r || r > n ) throw new  ExceptionBoundaryViolation("数组越界");
        Object bak = A[r];
        A[r] = elem;
        return bak;
    }

    @Override
    public Object insertAtRank(int r, Object obj) throws ExceptionBoundaryViolation {
        if (0>r || r > n ) throw new  ExceptionBoundaryViolation("数组越界");
        //if (n >= N) throw new  ExceptionBoundaryViolation("数组越界, 意外退出");
        // 对空间溢出的处理
        if (N <= n) {
            N = N << 1;
            Object[] B = new Object[N];
            for (int i = 0; i < n; i++) {
                B[i] = A[i];
            }
            A=B;
        }
        for (int i = n; i > r; i--) {
            A[i] = A[i-1];
        }
        A[r] = obj;
        n++;
        return obj;
    }

    @Override
    public Object removeAtRank(int r) throws ExceptionBoundaryViolation {
        if (0>r || r > n ) throw new  ExceptionBoundaryViolation("数组越界");
        Object bak = A[r];
        // 后续元素顺序前移
        for (int i = r; i < n; i++) {
            A[i] = A[i+1];
        }
        n--;
        return bak;
    }
}
