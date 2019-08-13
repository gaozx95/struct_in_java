package com.gaozx.link;

public class Main {
    public static void main(String[] args) {
        LinkNode myLink = new LinkNode(0);

        OpList.add(myLink,1);
        OpList.add(myLink,3);
        OpList.add(myLink,4);
        OpList.add(myLink,5);
        OpList.insert(myLink,2,2);

        int len = OpList.linkLength(myLink);
        System.out.println(len);
        OpList.traverse(myLink);
    }
}
