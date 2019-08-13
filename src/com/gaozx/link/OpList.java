package com.gaozx.link;

import org.w3c.dom.Node;

public class OpList {
    /**
     * 向链表添加数据
     *
     * @param head  头指针
     * @param val 要添加的数据
     */
    public static void add(LinkNode head,int val){
        LinkNode newnode = new LinkNode(val);

        LinkNode temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = newnode;
    }

    /**
     * 插入节点
     *
     * @param head  头指针
     * @param index 要插入的位置
     * @param val 要插入的值
     */
    public static void insert(LinkNode head,int index,int val){
        //首先需要判断指定位置是否合法，
        if (index < 1 || index > linkLength(head) + 1) {
            System.out.println("插入位置不合法。");
            return;
        }
        LinkNode insertNode = new LinkNode(val);
        int currentPos =0;
        LinkNode temp = head;

        while (temp.next != null) {

            //找到上一个节点的位置了
            if ((index - 1) == currentPos) {

                //temp表示的是上一个节点

                //将原本由上一个节点的指向交由插入的节点来指向
                insertNode.next = temp.next;

                //将上一个节点的指针域指向要插入的节点
                temp.next = insertNode;

                return;

            }

            currentPos++;
            temp = temp.next;
        }

    }

    /**
     * 获取链表的长度
     * @param head 头指针
     */
    public static int  linkLength(LinkNode head) {

        int length = 0;
        //临时节点，从首节点开始
        LinkNode temp = head.next;

        // 找到尾节点
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        return length;
    }
    /**
     * 遍历链表
     *
     * @param head 头节点
     */
    public static void traverse(LinkNode head) {


        //临时节点，从首节点开始
        LinkNode temp = head.next;

        while (temp != null) {

            System.out.println(temp.val);

            //继续下一个
            temp = temp.next;
        }
    }
}
