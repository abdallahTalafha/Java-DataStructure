
package doublylinkedlists02;

public class DoublyList {
    node head;
    node tail;
    int count;
    
   
   //Doubly Linked List 01
    public DoublyList(){
        head = null; 
        tail = null;
        count = 0;
    }
    public boolean isEmpty(){
        if(head == null)
            return true;
        else
            return false;
   }
    public void insertToHead(int val){
       if(isEmpty()){
           head = new node();
            head.data = val;
            head.next=null;
            head.previous=null;
            tail = head;
            count++;        
       }
       else{
           node nn= new node();
           nn.data= val;
           nn.next=head;
           nn.previous = null;
           head.previous = nn;
           head= nn;
           count++;
       }
   }
    public void insertToTail(int val) {
        if(isEmpty()){
            insertToHead(val);
            
            /*tail = new node();
            tail.data =val;
            tail.next =null;
            head = tail;
            count++;*/
        }
        else{
            node nn = new node();
            nn.data = val;
            nn.next= null;
            tail.next =nn;
            nn.previous =tail;
            tail.next =nn;
            tail =nn;
            count++;
        }
    }
    public void insertToPos(int pos, int val) {
        if(pos<1 || pos > count+1){
            insertToHead(val);
        
        }
        else if(pos ==1){
            insertToHead(val); 
        }
        else if (pos == count+1){
            insertToTail(val);  
        }
        else{
            node t = head;
            for (int i=1;i<pos-1;i++)
                t=t.next;
            node nn =new node();
            nn.data =val;
            nn.next = t.next;
            nn.previous =t;
            nn.next.previous =nn;
            t.next =nn;
            count++;
        }
    }
    public int deleteFromHead(){
        if(!isEmpty()){
            int x = head.data;
            
            if (head==tail) // or count==1
                head=tail=null;
            else{
                head = head.next;
                head.previous=null;
            }
            count--;
            return x ;
        }
        return -1;     
    }
    public int deleteFromTail(){
    if(!isEmpty()){
        int x = tail.data;
        if(tail==head)
            tail=head=null;
        else{
            tail=tail.previous;
            tail.next = null;    //Complexity now is O(1) instead of O(n)
        }
        count--;
        return x;
    }
    else 
        return -1;
    }
    
    //Doubly Linked List 02
    public int deleteFromPosition(int pos){
        
        if(pos<1 || pos > count){
            return -1;
        }
        else{
            if(pos == 1)
                return (deleteFromHead());
            else if(pos == count)
                return(deleteFromTail());
            else{
                node t = head;
                for (int i=1;i<pos-1;i++)
                    t=t.next;
                int x =t.next.data;
                t.next = t.next.next;
                t.next.previous =t;
                count--;
                return x;
            }
        }
    }
    public void printAll(){
        
        node t =head;
        while (t!=null){
            System.out.println(t.data);
            t = t.next;
        }
    }
    public void printRevercs(){
        node t =tail;
        while (t!=null){
            System.out.println(t.data);
            t = t.previous;
        }
    }
    
    public void deleteEven() {
        node t = head;
        int x = 1;
        while(t!=null){
                if(t.data%2==0)
                    deleteFromPosition(x);
                else
                    x++;
                t=t.next;
        }
    }
    public void repeteAll(){
        int x =1;
        node t =head;
        while(t!=null){
            insertToPos(x+1,t.data);
            t=t.next.next;
            x+=2;
        }
    }
    public void evenOnTail(){
        node t =head;
        int localCount = count;
        for (int i =1;i<localCount;i++){
            if(t.data %2 == 0)
               insertToTail(t.data);
            t=t.next;
        
        }
    
    }
}
