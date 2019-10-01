import java.util.NoSuchElementException;

/**
   An implementation of a stack as a sequence of nodes.
*/
public class LinkedListStack
{
   private Node first;

   /**
      Constructs an empty stack.
   */
   public LinkedListStack()
   {
      first = null;
   }

   /**
      Adds an element to the top of the stack.
      @param element the element to add
   */
   public void push(Object element)
   {
	   //make a new Node
	   Node newNode = new Node();
	   //node = element
	   newNode.data = element;
	   newNode.next = first;
	   first = newNode;



   }






   /**
      Removes the element from the top of the stack.
      @return the removed element
   */
	public Object pop ()
	{

		return new Object();
	}







   /**
      Checks whether this stack is empty.
      @return true if the stack is empty
   */



   class Node
   {
      public Object data;
      public Node next;
   }
}
