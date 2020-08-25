package cn.sohu.jack.datastructureandarithmatic;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.Arrays;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/11/21 4:33 PM
 */
public class Solution {
    public void merge(int []a,int left,int mid,int right){
        int lb = mid - left + 1;
        int [] tmp = new int[lb]; //前半部分辅助数组
        for (int i = 0; i < lb; i++) {
            tmp[i] = a[left + i];
        }
       for (int i = 0, j = 0, k = mid+1; (j < lb || k <= right);) {
            if ((j < lb) && (right < k || tmp[j] <= a[k])) {
                a[left + i] = tmp[j++];
                i++;
            }
            if ((k <= right) && (lb <= j || a[k] < tmp[j])) {
                a[left + i] = a[k++];
                i++;
            }
        } /*
        int []tmp=new int[a.length];//辅助数组
        int p1=left,p2=mid+1,k=left;//p1、p2是检测指针，k是存放指针

        while(p1<=mid && p2<=right){
            if(a[p1]<=a[p2])
                tmp[k++]=a[p1++];
            else
                tmp[k++]=a[p2++];
        }

        while(p1<=mid) tmp[k++]=a[p1++];//如果第一个序列未检测完，直接将后面所有元素加到合并的序列中
        while(p2<=right) tmp[k++]=a[p2++];//同上

        //复制回原素组
        for (int i = left; i <=right; i++)
            a[i]=tmp[i];*/
    }

    public void mergeSort(int [] a,int start,int end){
        if(start<end){//当子序列中只有一个元素时结束递归
            int mid=(start+end) >> 1;//划分子序列
            mergeSort(a, start, mid);//对左侧子序列进行递归排序
            mergeSort(a, mid+1, end);//对右侧子序列进行递归排序
            System.out.println("ge----" + Arrays.toString(a));
            merge(a, start, mid, end);//合并
            System.out.println("sg" + Arrays.toString(a));
        }
    }

    public void test(){
        int[] a = { 49, 38, 65, 97, 76, 13, 27, 50,12 };
        //merge(a, 0, 3, 6);
        mergeSort(a, 0, a.length-1);
        System.out.println("排好序的数组：");
        for (int e : a)
            System.out.print(e+" ");
    }

    public static void main(String[] args) {
        String s = "{\"timelocal\":\"[05/Apr/2020:00:59:43 +0800]\"}";
        String v = "timelocal";
        JSONObject j = JSONObject.parseObject(s);
        System.out.println(j.get("ege"));
    }
}
