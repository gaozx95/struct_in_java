package com.gaozx.link;
import java.util.ArrayList;
public class LinkNode {
    public int val;
    public LinkNode next =null;

    public LinkNode() {
    }

    public LinkNode(int val) {
        this.val = val;
    }

    public LinkNode(int val,LinkNode next) {
        this.val = val;
        this.next = next;
    }


}
