package genericConcepts;

public class GenericsConcepts {
	
	public static void main(String[] args) {
		
		/*
		 * Generic Class 
		 */
		
		Bucket<Integer> objBucket=new Bucket<>(12);
		System.out.println("Integer ID :"+objBucket.getId());
		
		Bucket<String> objBucket2=new Bucket<String>("1212");
		System.out.println("String ID :"+objBucket2.getId());
		
		
		BigBucket<Integer, String> bigBucket=new BigBucket<>(161, "hello navin");

		System.out.println("key :"+bigBucket.getKey());
		System.out.println("val :"+bigBucket.getval());
		
    	/*
    	 * Generic Method
	     */
		GenericMethod genericMethod=new GenericMethod();
		genericMethod.TargetData(123);
		genericMethod.TargetData("Hello India");
		
		/*
		 * Bounded Generics
		 */
		
		BoundedGenerics<Integer> bounded=new BoundedGenerics<>(1234);
		System.out.println(bounded.getData());
		
		BoundedGenerics<Double> bounded1=new BoundedGenerics<>(121.12);
		System.out.println(bounded1.getData());

		
		
	}

}
