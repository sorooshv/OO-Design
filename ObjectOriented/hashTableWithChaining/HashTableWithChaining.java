package hashTableWithChaining;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class HashTableWithChaining<K, V> {
	
	private class LinkedListNode<K, V>{
		public LinkedListNode<K, V> next;
		public LinkedListNode<K, V> prev;
		public K key;
		public V value;
		
		public LinkedListNode(K key, V value){
			this.key = key;
			this.value = value;
		}
		
		public void addToTail(LinkedListNode<K, V> node){
			LinkedListNode<K, V> n = this;
			while(n.next != null){
				n= n.next;
			}
			n.next = node;
		}
		
	}
	
	private ArrayList<LinkedListNode> arr;
	
	
	public HashTableWithChaining(int capacity){
		arr = new ArrayList<LinkedListNode>();
		arr.ensureCapacity(capacity);
		for(int i=0 ; i< capacity; i++){
			arr.add(null);
		}
	}
	
	public void put(K key, V value){
		int index = getIndexByKey(key);
		LinkedListNode<K, V> newNode = new LinkedListNode(key, value);
		if(arr.get(index) == null){
			arr.set(index, newNode);
		}
		else{
			LinkedListNode<K, V> node = arr.get(index);
			node.addToTail(newNode);
		}
	}
	
	public void remove(K key){
		int index = getIndexByKey(key);
		if(arr.get(index) == null){
			return;
		}
		else{
			LinkedListNode<K, V> node = arr.get(index);
			if(node.key == key){
				node = node.next;
				return;
			}
			LinkedListNode<K, V> n = node;
			while(n.next != null){
				if(n.next.key == key){
					n.next = n.next.next;
				}
			}
			
		}
	}

	private int getIndexByKey(K key) {
		return Math.abs(key.hashCode() % arr.size());
	}
	
}
