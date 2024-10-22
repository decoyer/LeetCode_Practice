class MyLinkedList { 
    int length;
    Node head;
    
    class Node {
        int val;
        Node next;
        Node(int x) {
            val = x;
        }
    }

    public MyLinkedList() {
        this.length = 0;
        this.head = null;
    }
    
    public int get(int index) {
        if(index < 0 || index >= length)
            return -1;
        
        int count = 0;
        Node cur = this.head;
        
        while(count != index) {
            cur = cur.next;
            count++;
        }
        
        return cur.val;
    }
    
    public void addAtHead(int val) {
        Node tmp = new Node(val);

        tmp.next = this.head;
        this.head = tmp;
        length++;
    }
    
    public void addAtTail(int val) {
        if(this.length == 0) {
            addAtHead(val);
            return;
        }

        Node tmp = new Node(val);
        Node cur = this.head;
        
        while(cur.next != null)
            cur = cur.next;

        cur.next = tmp;
        tmp.next = null;
        this.length++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index == this.length) {
            addAtTail(val);
            return;
        }

        if(index == 0) {
            addAtHead(val);
            return;
        }

        if(index > this.length) {
            return;
        }
        
        int count = 0;
        Node tmp = new Node(val);
        Node cur = this.head;
        
        while(count != index - 1) {
            cur = cur.next;
            count++;
        }
        
        tmp.next = cur.next;
        cur.next = tmp;
        this.length++;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= this.length)
            return;

        if(index == 0)
            head = head.next;

        else {
            Node cur = this.head;
            int count = 0;

            while(count != index - 1) {
                cur = cur.next;
                count++;
            }

            cur.next = cur.next.next;
        }

        this.length--;
    }
}