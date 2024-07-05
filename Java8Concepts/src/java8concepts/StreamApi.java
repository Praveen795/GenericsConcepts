   package java8concepts;

import java.util.Arrays;

import java.util.List;

import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1. it reduce the number lines of code
		 * 2. it basically perform bulk operation and process the objects of collection.
		 * 
		 */
		
		List<Integer> list=Arrays.asList(2,3,-4,5,-6,7,10);
		
		List<Integer> asList=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(asList);
		
		List<Integer> newlist=list.stream().filter(i->i>0).collect(Collectors.toList());
		System.out.println(newlist);
		
		List<Integer> obj=list.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(obj);
		
		list.stream().map(i->i+1).forEach(System.out::println);

	}

}
