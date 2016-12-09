package circularArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class CircularArray<T> implements Iterable<T>{
	private int size;
	private ArrayList<T> array;
			
	public CircularArray(int size){
		this.size = size;
		this.array = new ArrayList<T>();
		fillArrayWithNull();
	}
	
	
	private void fillArrayWithNull() {
		for(int i=0 ; i<size ; i++){
			array.add(null);
		}
		
	}


	public void put(int index, T element){
		array.set(getCircularIndex(index), element);
	}
	
	public T get(int index){
		return array.get(index);
	}
	
	private int getCircularIndex(int index){
		return index % size;
	}

	public int getSize(){
		return size;
	}
	
	
	@Override
	public Iterator iterator() {
		return new CircularArrayIterator();
	}
	
	private class CircularArrayIterator implements Iterator<T>{
		
		private int cursor;
		
		public CircularArrayIterator(){
			this.cursor = 0;
		}
		
		@Override
		public boolean hasNext() {
			return this.cursor < CircularArray.this.size;
		}

		@Override
		public T next() {
			if(this.hasNext()){
				int current = cursor;
				cursor++;
				return CircularArray.this.get(current);
			}
			throw new NoSuchElementException();
		}
		
	}
}
