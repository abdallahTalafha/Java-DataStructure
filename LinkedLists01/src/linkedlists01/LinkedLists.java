package linkedlists01;
//******For better understanding, check the PPT file from slide 8.********//


public class LinkedLists {

    
    public static void main(String[] args) {
        LinkList A = new LinkList();//when it sees NEW it calles the Constructor from LinkList class
        //Singly Linked List 01
        A.insertToHead(5);
        A.insertToHead(3);
        A.insertToHead(10);
        
        /*
        for (int i=15;i<=20;i++){
        A.insertToHead(i);
        }*/
            
        //Singly Linked List 02
        A.insertToTail(35);
        A.insertToPos(4,150);
        A.deleteFromHead();
        A.deleteFromTail();
          
        //Singly Linked List 03
        //A.deleteFromPos(2);
        //A.printAll(); //extra func
        //A.deleteEven();//extra func

        //Singly Linked List 04
        //A.repeteAll();//extra func
        //A.evenOnTail();//extra func
        //A.reverse();//extra func **IMPORTANT**

        /*       
        //To print the whole list **replaced with printAll()
        node temp = A.head;
        while (A.count >0){
            System.out.println(temp.data);
            temp = temp.next;
            A.count--;
        }  
        
        System.out.println(A.head.data); // 1st node
        System.out.println(A.head.next.data); // 2nd node
        System.out.println(A.head.next.next.data); //3rd node
        System.out.println(A.tail.data+"++++++++++++"); //last node
        System.out.println(A.head.next); // location
        System.out.println(A.tail.next); // null
        System.out.println(A.head); // location
        System.out.println(A.tail); // location
        System.out.println("The list lenght = " + A.count); // counter       
        */   
    }
 
}
