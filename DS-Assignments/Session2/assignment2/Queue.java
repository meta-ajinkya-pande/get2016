package assignment2;

import java.util.Arrays;

public class Queue<E> {
	
	Object[] array; // Queue array
	int front , rear; // two pointers for queue
	//Argument Constructor
	public Queue(int capacity){
		array = new Object[capacity];
		front = 0;
		rear = 0;
	}

	// constructor
	public Queue(){
		array = new Object[10];
		front = 0;
		rear = 0;
	}

	// to add element at rear
	public boolean enqueue(E item){
		// to ensure the size of list
		ensureCapacity(rear+1);
		array[rear++] = item;
		return true;
	}
	
	// to delete elements from front
	@SuppressWarnings("unchecked")
	public E dequeue(){
		if(front == rear){
			throw new IndexOutOfBoundsException("Queue Underflow");
		}
		return (E)array[front++];
	}
	
	// to make queue empty
	public boolean makeEmpty(){
		front = 0;
		rear = 0;
		return true;
	}
	
	// to get element from front
	@SuppressWarnings("unchecked")
	public E getFront(){
		return (E)array[front++];
	}

	/**
	 * @param minCapacity
	 * 
	 * this method increases the capacity of array by making a new array with increased capacity
	 * and transferring the old array into new one
	 */
	public void growCapacity(int minCapacity){
		try{
			int oldCapacity = array.length;
			int newCapacity = oldCapacity + (oldCapacity >> 1);
			array = Arrays.copyOf(array, newCapacity);
		}catch(Exception ex){
			System.out.println("Something went wrong: "+ex.getMessage());
		}
	}

	/**
	 * @param minCapacity
	 * 
	 * this method checks if the capacity is less and grows the capacity of array
	 */
	public void ensureCapacity(int minCapacity){
		try{
			// if capacity is less then grow the capacity 
			if(minCapacity - array.length > 0){
				growCapacity(minCapacity);
			}
		}catch(Exception ex){
			System.out.println("Something went wrong: "+ex.getMessage());
		}
	}
	
	// To check the queue is empty or not
	public boolean isEmpty(){
		if(rear == front){
			return true;
		}
		return false;
	}
	
	// To get the size of queue 
	public int size(){
		int size = rear - front ;
		return size;
	}
	
	// To print whole queue
	public void print(){
		for(int i = front ; i < rear ; ++i ){
			System.out.println(array[i]);
		}
	}	
}