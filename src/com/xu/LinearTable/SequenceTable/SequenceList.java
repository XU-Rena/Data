package com.xu.LinearTable.SequenceTable;

import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
* 类名 SequenceList
构造方法
SequenceList(int capacity)：创建容量为capacity的SequenceList对象
成员方法
1.public void clear()：空置线性表
2.publicboolean isEmpty()：判断线性表是否为空，是返回true，否返回false
3.public int length():获取线性表中元素的个数
4.public T get(int i):读取并返回线性表中的第i个元素的值
5.public void insert(int i,T t)：在线性表的第i个元素之前插入一个值为t的数据元素。
6.public void insert(T t):向线性表中添加一个元素t
7.public T remove(int i):删除并返回线性表中第i个数据元素。
8.public int indexOf(T t):返回线性表中首次出现的指定的数据元素的位序号，若不存在，则返
回-1。
成员变量
1.private T[] eles：存储元素的数组
2.private int N:当前线性表的长度
* */
public class SequenceList<T> {
    //存储元素的数组
    private T[] eles;
    //记录当前顺序表中的元素个数
    private int N;

    //构造方法
    public SequenceList(int capacity) {
        eles = (T[]) new Object[capacity];
        N = 0;
    }

    //将一个线性表置为空表
    public void clear() {
        N = 0;
    }

    //判断当前线性表是否为空表
    public boolean isEmpty() {
        return N == 0;
    }

    //获取线性表的长度
    public int length() {
        return N;
    }

    //获取指定位置的元素
    public T get(int i) {
      if(i<0||i>N){
          throw new RuntimeException("当前元素不存在！");
      }else {
          return eles[i];
      }
    }

    //向线型表中添加元素t（往后头插）
    public void insert(T t) {
        if (N==eles.length){
            throw new RuntimeException("当前表已满");
        }
        eles[N++] = t;
    }
    //在i元素处插入元素t
    public void insert(int i,T t){
        if (i==eles.length){
            throw new RuntimeException("当前表已满");
        }
        if (i<0 || i>N){
            throw new RuntimeException("插入的位置不合法");
        }
      //把i位置空出来，i位置及其后面的元素依次向后移动一位
        for (int index=N;index>i;index--){
            eles[index]=eles[index-1];
        }
      //把t放到i位置处
        eles[i]=t;
      //元素数量+1
        N++;
    }

    //删除指定位置i处的元素，并返回该元素
    public T remove(int i){
        T result=eles[i];//将该元素存在result中
        if(i<0||i>N-1){
            throw new RuntimeException("当前要删除的元素位置不合理");
        }
        for(int index=i;index<N-1;index++){
            eles[i]=eles[i+1];
        }
        return result;
    }
    //查找t元素第一次出现的位置
    public int indexOf(T t){
        if(t==null){
            throw new RuntimeException("查找的元素不合法");
        }
        for (int i=0;i<N;i++){
            if(t==eles[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
    //创建顺序表对象
        SequenceList<String> sl = new SequenceList<>(10);
    //测试插入
        sl.insert("姚明");
        sl.insert("科比");
        sl.insert("麦迪");
        sl.insert(1,"詹姆斯");
      //  System.out.println(sl.toString(sl));
    //测试获取
        String getResult = sl.get(1);
        System.out.println("获取索引1处的结果为："+getResult);
    //测试删除
        String removeResult = sl.remove(0);
        System.out.println("删除的元素是："+removeResult);
    //测试清空
        sl.clear();
        System.out.println("清空后的线性表中的元素个数为:"+sl.length());
    }
}

