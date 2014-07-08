package org.psoft.collections;

import java.util.HashMap;
import java.util.Map;

public class Maps<K, V> {

	public static <K, V> FluentMap<K, V> put(K key, V value) {
		FluentMap<K, V> instance =  new FluentMap<K, V>();
		return instance.put(key, value);
	}

	public static <K, V> FluentMap<K, V> create(Map<K, V> map) {
		return new FluentMap<K, V>(map);
	}

	public static class FluentMap<K, V> {

		Map<K, V> map;

		protected FluentMap() {
			this.map = new HashMap<K, V>();
		}

		protected FluentMap(Map<K, V> map) {
			this.map = map;
		}

		public Map<K, V> map() {
			return map;
		}

		public FluentMap<K, V> clear() {
			map.clear();
			return this;
		}

		public FluentMap<K, V> put(K key, V value) {
			map.put(key, value);
			return this;
		}

		public FluentMap<K, V> putAll(Map<K, V> values) {
			map.putAll(values);
			return this;

		}

		public FluentMap<K, V> remove(K key) {
			map.remove(key);
			return this;
		}
	}
}
