
public class LLNode<T> {
	//instance variable
	private T info;
	private LLNode<T> link;
	
	//default constructor
	public LLNode(T info) {
		this.info = info;
		link = null;
	}
	
	//non-static methods
	public void setInfo(T info) {
		this.info = info;
	}
	
	public T getInfo() {
		return info;
	}
	
	public void setLink(LLNode<T> link) {
		this.link = link;		
	}
	
	public LLNode<T> getLink() {
		return link;
	}
	
}