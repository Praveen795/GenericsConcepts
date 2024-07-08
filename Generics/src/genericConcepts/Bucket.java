package genericConcepts;

public class Bucket<T> {
	
	public T id;
	
	public Bucket(T id) {
		this.id=id;
	}
	
	public T getId() {
		return id;
	}
	

}
