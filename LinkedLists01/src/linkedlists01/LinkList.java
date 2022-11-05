package linkedlists01;

public class LinkList {
   node head;
   node tail;
   int count;
   
   
   public LinkList(){//Constructor //1- no return type //2- the same name of the class
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
            tail = head;
            count++;        
       }
       else{
           node nn= new node();
           nn.data= val;
           nn.next=head;
           head= nn;
           count++;
       }
   }

   
   //Singly Linked List 02
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
            t.next =nn;
            count++; 
        }
    }
    
    public int deleteFromHead(){
        if(!isEmpty()){
            int x = head.data;
            
            if (head==tail) // or count==1
                head=tail=null;
            else
                head = head.next;
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
            node t = head;
           // for (int i=1;i<count-1;i++)
           while (t.next != tail)
                t=t.next;
           tail = t;
           t.next = null;
        }
        count--;
        return x;
    }
    else 
        return -1;
    }
    
    //Singly Linked List 03
    public int deleteFromPos(int pos){
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
            count--;
            return x;
        }    
    }
   
   
   }
    
    //To print the whole list
    public void printAll(){
    
        node t =head;
        while (t!=null){
            System.out.println(t.data);
            t = t.next;
        }  
    
    }

    public void deleteEven() {
        node t = head;
        int x = 1;
        while(t!=null){
                if(t.data%2==0)
                    deleteFromPos(x);
                else
                    x++;
                t=t.next;
        }
    }
    
    //Singly Linked List 04
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

    public void reverse() {
        node t1=head;
        node t2=t1.next;
        node t3=t2.next;
        while(t3 != null){
            t2.next =t1;
            t1=t2;
            t2=t3;
            t3=t3.next;
        }
        tail.next = t1;
        head.next = null;
        tail = head;
        head = t2;
       
    }
}
