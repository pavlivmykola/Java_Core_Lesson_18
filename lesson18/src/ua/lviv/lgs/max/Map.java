package ua.lviv.lgs.max;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Map extends MyEntry{
	private HashMap map;

	public Map(Object ob1, Object ob2) {
		super(ob1, ob2);
		this.map = new HashMap();
	}
	
	public void add(Object ob1, Object ob2) {
		map.put(ob1, ob2);
	}
	
	public void removeKey (Object ob1) {
		map.remove(ob1);
	}
	
	public void removeValue (Object ob1) {
		Iterator iterator=map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry next = (Entry) iterator.next();
			if (next.getValue().equals(ob1)) {
				next.setValue(null);
			}
		}
	}
	
	public void setKeys (Object ob1) {
		Iterator iterator=map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry next = (Entry) iterator.next();
			System.out.println("Key is "+next.getKey().toString());
		}
	}
	
	public void listValue (Object ob1) {
		Iterator iterator=map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry next = (Entry) iterator.next();
			System.out.println("Value is "+next.getValue().toString());
		}
	}
	
	public void allMap (Object ob1) {
		Iterator iterator=map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry next = (Entry) iterator.next();
			System.out.println("Key is "+next.getKey().toString()+" value is"+next.getValue().toString());
		}
	}
	
	

}
