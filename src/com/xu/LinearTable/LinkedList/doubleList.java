package com.xu.LinearTable.LinkedList;

public class doubleList <T>{

    private Node head;//首节点
    private Node last;//尾节点
    private int N;//链表长度
    //初始化
    public doubleList() {
        head=new Node(null,null,null);
        last=null;
        N=0;
    }
    //置空线性表
    public void clear(){
        //只有一个头节点
        head.next=null;
        last=null;
        N=0;
    }
   //获取链表长度
    public int length(){
      return N;
    }
    //判断链表是否为空
    public boolean isEmpty(){
        return N==0;
    }
    //获取第一个元素
    public T first(){
      if(isEmpty()){
          //链表为空
          return null;//因为链表为空，只有一个不存数据的头节点，根本没有元素
      }else {
          return (T) head.next.next;
      }
    }

    //获取最后一个元素
    public T last(){
        if(isEmpty()){
            //链表为空
            return null;//因为链表为空，只有一个不存数据的头节点，根本没有元素
        }else {
            return (T) last.item;
        }
    }

    //插入元素
    public void insert(T t){
        if(last==null) {
            //双链表为空
            //尾节点是先创建的节点
          last=new Node(t,head,null);
            //头结点指向尾节点
            head.next=last;
        }else {
            //双链表不为空
            Node oldlast=last;
        Node node=new Node(t,oldlast,null);
        oldlast.next=node;
        last=node;
        }
    }

    //向指定位置i处插入
    public void insert(int i,T t){
//        if(i<0||i>=N){
//            throw new RuntimeException("位置不合法");
//        }
      Node pre=head.next;
      //找到i的前一个节点
      for (int index=1;index<i-1;index++){
          pre=pre.next;
      }
      Node curr=pre.next;
      //new一个新的节点
        Node newnode=new Node(t,pre,curr);
        //pre指着new,new指着curr
        pre.next=newnode;
        newnode.next=curr;
        N++;
    }

    //获取指定位置i处的元素
    public T get(int i){
      Node n=head.next;
      //找到i
      for (int index=1;index<i;index++){
          n=n.next;
      }
      return (T) n.item;
    }
    //找到元素t第一次出现的位置
    public int indexOf(T t){
        Node n=head;
        for (int index=1;n.next!=null;index++){
            n=n.next;
            if(n.item.equals(t)){
                return index;
            }
        }
        return -1;
    }
    //删除i位置处的元素并返回
    public T delet(int i){
        Node pre=head.next;
        //找到i的前一个节点
        for (int index=1;index<i-1;index++){
            pre=pre.next;
        }
        Node curr=pre.next;
        Node hou=curr.next;
        pre.next=hou;
        N--;
        return (T) curr.item;

    }
    //结点类
    private class Node{
        public Node(T item, Node pre, Node next) {
            this.item = item;
            this.pre = pre;
            this.next = next;
        }
        //存储数据
        public T item;
        //指向上一个结点
        public Node pre;
        //指向下一个结点
        public Node next;
    }

    public static void main(String[] args) {
        doubleList<String> list = new doubleList<>();
        list.insert("张三");
        list.insert("李四");
        list.insert(2,"王五");
        list.insert("赵六");
        list.insert(3,"老七");
        list.insert(5,"王五");
     //   list.insert("李四");
        // System.out.println(list.get(2));
        System.out.println(list.indexOf("王五"));
//        for (Node x=first;){
//
//        }

    }
}
