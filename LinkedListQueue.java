/**
   Add a method firstToLast to this implementation of a queue.
   The method moves the element at the head of the queue to
   the tail of the queue. The element that was second in line
   will now be at the head.
*/
public class LinkedListQueue
{
    //data
    private Node head;
    private Node tail;// I forgot about the last ref


   /**
      Constructs an empty queue.
   */
    public  LinkedListQueue ()
    {
        head = null;
        tail = null;
        
    }
  


   /**
      Checks whether this queue is empty.
      @return true if this queue is empty -- I need to look at this again!!!!!
   */
    public boolean empty()
    {
        return head == null;
    }


   /**
      Adds an element to the tail of this queue.
      @param newElement the element to add
   */
    public void add (Object newElement)
    {
        if (tail == null)// head must also be null
        {
            Node newNode = new Node();
            newNode.data = newElement;
            newNode.next = null;// obj auto gets set to null
            tail = newNode;
            head = newNode;
            
            
        }
        else
        {
            Node newNode = new Node();
            newNode.data = newElement;
            newNode.next = null; // end of the list
            tail.next = newNode; // previous tail = new node adds to the list
            tail = newNode; //q tail now the last element
        }
        
    }


   /**
      Removes an element from the head of this queue.
      @return the removed element
   */
    public Object remove()
    {
        if (head == null)
            return null;
        Object element = head.data;
        head = head.next;
        //what if last node is removed --I did not think about that
        if (head == null) // queue is empty
        {
            tail = null;
        }
        
        return element;
        
    }



   class Node
   {
      public Object data;
      public Node next;
   }
}
