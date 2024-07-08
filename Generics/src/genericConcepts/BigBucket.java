package genericConcepts;

public class BigBucket<S,T> {
	public S Key;
	public T val;
	
	public BigBucket(S key, T val) {
		this.Key=key;
		this.val=val;
	}
	
	public S getKey() {
		return Key;
	}

	public T getval() {
		return val;
	}

}
