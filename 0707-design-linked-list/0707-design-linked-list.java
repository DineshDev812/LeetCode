class Node{
    int val;
    Node next;
    Node(int val)
    {
        this.val=val;
        next=null;
    }
}
class MyLinkedList {
        Node head=null;
    public MyLinkedList() {
    }
    
    public int get(int index) {
        Node temp=head;
        int c=0;
        if(head==null)
        return -1;
        while(temp!=null)
        {
            if(c==index)
            {
                return temp.val;
            }
            c++;
            temp=temp.next;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        Node newnode=new Node(val);
        newnode.next=head;
        head=newnode;
        return;
        
    }
    
    public void addAtTail(int val) {
        if(head==null)
        {
            addAtHead(val);
            return;
        }
        Node newnode=new Node(val);
        Node temp=head;
        while(temp.next!=null)
        temp=temp.next;
        temp.next=newnode;
        return;
        
    }
    
    public void addAtIndex(int index, int val) {
        int c=0;
        Node temp=head;
        Node newnode = new Node(val);
        if(index==0)
        {
            addAtHead(val);
            return;
        }
        while(temp!=null)
        {
            if(c==index-1)
            {
                newnode.next=temp.next;
                temp.next=newnode;
            }
            temp=temp.next;
            c++;
        }
        if(c==index)
        {
            addAtTail(val);
            return;
        } 
    }
    
    public void deleteAtIndex(int index) {
        int c=0;
        Node temp=head;
        if(head==null)
        {
            return;
        }
        if(index==0)
        {
            head=head.next;
            return;
        }
        while(temp.next!=null)
        {
            if(c==index-1)
            {
                temp.next=temp.next.next;
                return;
            }
            temp=temp.next;
            c++;
        }
        
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