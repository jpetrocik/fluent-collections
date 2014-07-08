package org.psoft.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Sets<V> {

    public static <V> FluentSet<V> add(V e) {
    	FluentSet<V> instance =  new FluentSet<V>();
    	return instance.add(e);
    }

    public static <V> FluentSet<V> create(Set<V> list) {
        return new FluentSet<V>(list);
    }

    public static class FluentSet<V> {
    	
    	Set<V> set;
    	
	   	protected <T> FluentSet() {
			this.set = new HashSet<V>();
		}
	
		protected <T> FluentSet(Set<V> list) {
			this.set = list;
		}
	
		public Set<V> set() {
			return set;
		}
	
		public FluentSet<V> add(V e) {
			set.add(e);
			return this;
		}
	
		public FluentSet<V> addAll(Collection<V> c) {
			set.addAll(c);
			return this;
		}
	
		public FluentSet<V> clear() {
			set.clear();
			return this;
		}
	
		public FluentSet<V> remove(int index) {
			set.remove(index);
			return this;
		}
	
		public FluentSet<V> remove(Object o) {
			set.remove(o);
			return this;
		}
	
		public FluentSet<V> removeAll(Collection<V> c) {
			set.removeAll(c);
			return this;
		}
	
		public FluentSet<V> retainAll(Collection<V> c) {
			set.retainAll(c);
			return this;
		}
		
    }

}
