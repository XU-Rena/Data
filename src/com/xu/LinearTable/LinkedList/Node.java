package com.xu.LinearTable.LinkedList;

public class Node <T>{
    //存储元素
    public T item;
    //指向下一个结点
    public Node next;
    public Node(T item, Node next) {
        this.item = item;
        this.next = next;
    }

    public static void main(String[] args) throws Exception {
        //构建结点
        Node<Integer> first = new Node<Integer>(11, null);
        Node<Integer> second = new Node<Integer>(13, null);
        Node<Integer> third = new Node<Integer>(12, null);
        Node<Integer> fourth = new Node<Integer>(8, null);
        Node<Integer> fifth = new Node<Integer>(9, null);
        //生成链表
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        for (Node x=first;x!=null;x=x.next){
            System.out.println(x.item);
        }
    }

}
