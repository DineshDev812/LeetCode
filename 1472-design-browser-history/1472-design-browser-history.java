class Node{
    String url;
    Node prev,next;
    Node(String url)
    {
        this.url=url;
        prev=next=null;
    }
}
class BrowserHistory {
    Node cur;
    public BrowserHistory(String homepage) {
        cur=new Node(homepage);
        
    }
    
    public void visit(String url) {
        Node newnode = new Node(url);
        cur.next=newnode;
        newnode.prev=cur;
        cur=newnode;
        
    }
    
    public String back(int steps) {
        while(cur.prev!=null&&steps>0)
        {
            cur=cur.prev;
            steps-=1;
        }
        return cur.url;
        
    }
    
    public String forward(int steps) {
        while(cur.next!=null&&steps>0)
        {
            cur=cur.next;
            steps-=1;
        }
        return cur.url;
        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */