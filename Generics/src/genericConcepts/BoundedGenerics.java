package genericConcepts;

public class BoundedGenerics<T extends Number> {
	
	public T data;

	public BoundedGenerics(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	

}
