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
   
   
}
