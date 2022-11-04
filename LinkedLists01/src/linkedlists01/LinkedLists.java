package linkedlists01;


public class LinkedLists {

 
    public static void main(String[] args) {
        LinkList A = new LinkList();//when it sees NEW it calles the Constructor from LinkList class
        
        A.insertToHead(5);
        A.insertToHead(3);
        A.insertToHead(10);
        
        for (int i=1;i<=10;i++){
        A.insertToHead(i);
        }
        
        
        //To print the whole list
        node temp = A.head;
        while (A.count >0){
            System.out.println(temp.data);
            temp = temp.next;
            A.count--;
        }  

        System.out.println(A.head.data); // 1st node
        System.out.println(A.head.next.data); // 2nd node
        System.out.println(A.head.next.next.data); //3rd node
        System.out.println(A.tail.data); //last node
        System.out.println(A.head.next); // location
        System.out.println(A.tail.next); // null
        System.out.println(A.head); // location
        System.out.println(A.tail); // location
        System.out.println("The list lenght = " + A.count); // counter          
    }
    
}
