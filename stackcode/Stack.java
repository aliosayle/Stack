package stackcode;
// The stack data structure. This is an implementation of an integer stack.

public class Stack 
{
    private char stackArray[];
    private int stackTop;

    // This constructor creates an empty stack
    public Stack()
    {
        stackArray = new char[100];
        stackTop = -1;
    }

   // This constructor creates an empty stack of a specific size
    public Stack(int size)
    {
        stackArray = new char[size];
        stackTop = -1;
    }
    
    // This method is used to add a new element at the top of the stack
    public void push(char item)
    {
        if(!isFull())
        {
            stackTop++;
            stackArray[stackTop] = item;
        }
        else 
            System.out.println("Push operation failed. The stack is full.");
    } // end push
    
    // This method is used to remove and return the top element from the stack
    public char pop()
    {
        if(isEmpty())
        {
            System.out.println("Pop operation failed. The stack is empty. ");
            System.exit(1);
        }

        return stackArray[stackTop--];
    }
    
    // This method is used to return the top element in the stack
    public char top()
    {
        if(isEmpty())
        {
            System.out.println("Top operation failed. The stack is empty. ");
            System.exit(1);
        }

        return stackArray[stackTop];
    }
    
    // This method is used to check if the stack is empty
    public boolean isEmpty()
    {
        return (stackTop == -1);
    }
    
    //This method is used to check if the stack is isFull
    public boolean isFull()
    {
        return (stackTop == stackArray.length-1);
    }

}// end class Stack
