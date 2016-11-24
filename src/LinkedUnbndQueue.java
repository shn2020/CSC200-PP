
public class LinkedUnbndQueue<T> implements UnboundedQueueInterface<T> {
	//instance variables
	private LLNode<T> front;
	private LLNode<T> rear;
	
	//default constructor
	public LinkedUnbndQueue() {
		front = null;
		rear = null;
	}
	
	@Override
	public T dequeue() throws QueueUnderFlowException {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new QueueUnderFlowException("There is nothing in the queue");	
		}
		else {
			T elementToRemove = front.getInfo();
			front = front.getLink();
			if(front == null)
				rear = null;
			
			return elementToRemove;
		}
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (front == null && rear == null);
	}

	@Override
	public void enqueue(T element) {
		// TODO Auto-generated method stub
		LLNode<T> newNode = new LLNode<T>(element);
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
		}
		else {
			rear.setLink(newNode);
			rear = newNode;
		}
	}
	
	@Override
	public String toString() {
		if (isEmpty()) {
			return "There is nothing in the queue";
		}
		else {
			String allInfo = "All print request";
			LLNode<T> currentNode = front;
			while (currentNode != null) {
				allInfo += "\n\n" + currentNode.getInfo().toString();
				currentNode = currentNode.getLink();
			}
			return allInfo;
		}
	}	

}