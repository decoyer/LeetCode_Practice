class MyLinkedList {
    int length;    // 연결 리스트의 길이
    Node head;    // 첫번째 노드 포인터
    
    class Node {
        int val;    // 노드 값
        Node next;    // 다음 노드 포인터
        // 생성자(노드 값 초기화)
        Node(int x) {
            val = x;
        }
    }

    // 변수 초기화
    public MyLinkedList() {
        this.length = 0;
        this.head = null;
    }

    // 노드 값 반환
    public int get(int index) {
        if (index < 0 || index >= length)
            return -1;
        
        int count = 0;
        Node cur = this.head;
        
        while (count != index) {
            cur = cur.next;
            count++;
        }
        
        return cur.val;
    }

    // 노드 생성 후 노드 처음에 추가
    public void addAtHead(int val) {
        Node tmp = new Node(val);

        tmp.next = this.head;
        this.head = tmp;
        length++;
    }

    // 노드 생성 후 노드 끝에 추가
    public void addAtTail(int val) {
        if (this.length == 0) {
            addAtHead(val);
            return;
        }

        Node tmp = new Node(val);
        Node cur = this.head;
        
        while (cur.next != null)
            cur = cur.next;

        cur.next = tmp;
        tmp.next = null;
        this.length++;
    }

    // 지정한 자리에 노드 추가
    public void addAtIndex(int index, int val) {
        if (index == this.length) {
            addAtTail(val);
            return;
        }

        if(index == 0) {
            addAtHead(val);
            return;
        }

        if (index > this.length)
            return;
        
        int count = 0;
        Node tmp = new Node(val);
        Node cur = this.head;
        
        while (count != index - 1) {
            cur = cur.next;
            count++;
        }
        
        tmp.next = cur.next;
        cur.next = tmp;
        this.length++;
    }

    // 지정한 자리에 노드 제거
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= this.length)
            return;

        if (index == 0)
            head = head.next;

        else {
            Node cur = this.head;
            int count = 0;

            while (count != index - 1) {
                cur = cur.next;
                count++;
            }

            cur.next = cur.next.next;
        }

        this.length--;
    }
}
