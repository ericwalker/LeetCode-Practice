class MyLinkedList {

    private class ListNode
    {
        int val;
        ListNode prev;
        ListNode next;
        ListNode(int x) {val = x;}
    }

    private ListNode head;
    private ListNode tail;

    /** Initialize your data structure here. */
    public MyLinkedList() {
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {

        ListNode cur = head;

        for (int counter = 0; counter < index; counter++)
        {
            if (cur.next == null)
                return -1;

            cur = cur.next;
        }

        return cur.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {

        ListNode newNode = new ListNode(val);
        newNode.next = head;

        if (head == null)
        {
            head = newNode;
            tail = newNode;
            return;
        }

        head.prev = newNode;
        head = newNode;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        tail.next = newNode;
        newNode.prev = tail;
        tail = tail.next;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        ListNode cur = head;

        if (index == 0)
        {
            addAtHead(val);
            return;
        }

        for (int counter = 0; counter < index-1; counter++)
        {
            if (cur.next == null)
                return;

            cur = cur.next;
        }

        if (cur.next == null)
        {
            ListNode newNode = new ListNode(val);
            cur.next = newNode;
            newNode.prev = cur;
            tail = newNode;
            return;
        }

        if (cur.next != null)
        {
            ListNode newNode = new ListNode(val);
            newNode.next = cur.next;
            cur.next.prev = newNode;

            newNode.prev = cur;
            cur.next = newNode;
        }

    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        ListNode cur = head;

        if (head.next == null && index == 0)
        {
            head = null;
            tail = null;
            return;
        }


        if (index == 0)
        {
            head = head.next;
            head.prev = null;
            return;
        }

        for (int counter = 0; counter < index; counter++)
        {
            if (cur.next == null)
                return;
            cur = cur.next;
        }

        // if cur points out the last node
        if (cur.next == null)
        {
            cur = cur.prev;
            tail = cur;
            cur.next = null;
            return;
        }

        ListNode prevNode = cur.prev;
        cur = cur.next;
        prevNode.next = cur;
        cur.prev = prevNode;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */