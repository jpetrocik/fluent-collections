package org.psoft.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lists<V> {

    public static <V> FluentList<V> add(V e) {
    	FluentList<V> instance =  new FluentList<V>();
    	return instance.add(e);
    }

    public static <V> FluentList<V> create(List<V> list) {
        return new FluentList<V>(list);
    }

    public static class FluentList<V> {
    	
    	List<V> list;
    	
	   	protected <T> FluentList() {
			this.list = new ArrayList<V>();
		}
	
		protected <T> FluentList(List<V> list) {
			this.list = list;
		}
	
		public List<V> list() {
			return list;
		}
	
		public FluentList<V> add(int index, V element) {
			list.add(index, element);
			return this;
	
		}
	
		public FluentList<V> add(V e) {
			list.add(e);
			return this;
		}
	
		public FluentList<V> addAll(Collection<V> c) {
			list.addAll(c);
			return this;
		}
	
		public FluentList<V> addAll(int index, Collection<V> c) {
			list.addAll(index, c);
			return this;
		}
	
		public FluentList<V> clear() {
			list.clear();
			return this;
		}
	
		public FluentList<V> remove(int index) {
			list.remove(index);
			return this;
		}
	
		public FluentList<V> remove(Object o) {
			list.remove(o);
			return this;
		}
	
		public FluentList<V> removeAll(Collection<V> c) {
			list.removeAll(c);
			return this;
		}
	
		public FluentList<V> retainAll(Collection<V> c) {
			list.retainAll(c);
			return this;
		}
		
    }

}
