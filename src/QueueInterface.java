
public interface QueueInterface<T> {
	public T dequeue() throws QueueUnderFlowException;
	
	public boolean isEmpty();
}
