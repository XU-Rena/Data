package com.xu.LinearTable.LinkedList;

//    1.public void clear()：空置线性表
//    2.publicboolean isEmpty()：判断线性表是否为空，是返回true，否返回false
//    3.public int length():获取线性表中元素的个数
//    4.public T get(int i):读取并返回线性表中的第i个元素的值
//    5.public void insert(T t)：往线性表中添加一个元素；
//    6.public void insert(int i,T t)：在线性表的第i个元素之前插入一个值为t的数据元素。
//    7.public T remove(int i):删除并返回线性表中第i个数据元素。
//    8.public int indexOf(T t):返回线性表中首次出现的指定的数据元素的位序号，若不存在，则
//    返回-1。
public class singleList<T> {
    //记录头结点
    private Node head;
    //记录链表的长度
    private int N;
    public singleList(){
     //初始化头结点
        head = new Node(null,null);
        N=0;
    }
    //置空链表
    public void clear(){
        head.next=null;
        head.item=null;
        N=0;
    }
    //判断链表是否为空
    public boolean isEmpty(){
        return N==0;
    }
    //获取链表中元素的个数
    public int length(){
        return N;
    }
    //读取并返回链表中第i个元素的值
    public T get(int i){
//        if (i<0||i>N){
//            throw new RuntimeException("位置不合法！");
//        }
        Node n = head.next;
        for (int index = 1; index < i; index++){
            n = n.next;
        }
        return (T) n.item;
    }
    //往链表中添加一个元素
    public void insert(T t){
        //找到最后一个节点
        Node n=head;//要找到最后一个，先从第一个开始，找到头节点
        while (n.next!=null){//只要下一个不是空的就往下走，走一步，就把n得到一个指针
           n=n.next;
        }
        Node<T> newnode = new Node<>(t, null);
        n.next=newnode;
        N++;
    }
    //向指定位置i处，添加元素t
    public void insert(int i,T t){
//        if (i<0||i>=N){
//            throw new RuntimeException("tianjiade 位置不合法！");
//        }
//寻找位置i之前的结点
        Node pre = head;
        for (int index = 0; index <i-1; index++){
            pre = pre.next;
        }
//位置i的结点
        Node curr = pre.next;
//构建新的结点，让新结点指向位置i的结点
        Node newNode = new Node(t, curr);
//让之前的结点指向新结点
        pre.next = newNode;
//长度+1
        N++;
    }
        //在指定位置i处添加t
    public void inserti(int i,T t){
        if(i<0||i>N){
            throw new RuntimeException("位置不合法！");
        }
        //先找前一个结点
        Node pre=head;
        for(int index=0;index<i-1;index++){
            pre=pre.next;
        }
        // new一个新的
        //让前一个指着新的
        //新的指着原来i位置那个
        Node curr=pre.next;//位置i的节点
        Node<T> newnode = new Node<>(t, curr);
        newnode.next=curr;
        N++;

    }
    //删除指定位置i处的元素并返回
    public T  delet(int i){
        //先找前一个结点
        Node pre=head;
        for(int index=0;index<i-1;index++){
            pre=pre.next;
        }
        Node curr=pre.next;//位置i的节点
        pre.next=curr.next;
        N--;
        return (T) curr.item;
    }
    //查找t在链表中第一次出现的位置
    public int indexof(T t){
        //从头节点开始往后找到如果有相等的就返回位置
        Node n=head;
        for(int i=1;n.next!=null;i++){
            n=n.next;
            if(n.item.equals(t)){
               return i;
            }
        }
        return -1;
    }
    //遍历链表
public void bianli(singleList<T> list){

        for (Node n=head.next;n.next!=null;n=n.next){
            System.out.println(n.item);
        }

}
    //单链表反转
    public void reverse(){
        if (N==0){
//当前是空链表，不需要反转
            return;
        }
        reverse(head.next);
    }

    public Node reverse(Node curr){
    //已经到了最后一个元素
        if (curr.next==null){
    //反转后，头结点应该指向原链表中的最后一个元素
            head.next=curr;
            return curr;
        }
    //当前结点的上一个结点
        Node pre = reverse(curr.next);
        pre.next = curr;
    //当前结点的下一个结点设为null
        curr.next=null;
    //返回当前结点
        return curr;
    }
    public static void main(String[] args){
        singleList<String> list = new singleList<>();
        list.insert(1,"张三");
        list.insert(2,"李四");
        list.insert(3,"王五");
        list.insert(4,"赵六");
        //list.insert(5,"李四");
        System.out.println("---"+list.get(5));
     //   System.out.println(list.indexof("李四"));
//        for (Node x=first;){
//
//        }
        list.bianli(list);

    }
}
