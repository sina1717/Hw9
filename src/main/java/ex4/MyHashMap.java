package ex4;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Set;

public class MyHashMap<K,V> extends AbstractMap<K,V> {
    Set<Entry<K,V>> entrySet;
    public MyHashMap() {
        entrySet =new HashSet<>();
    }

    @Override
    public V put(K key, V value) {
        entrySet().add(new SimpleEntry<K,V>(key,value));
        return value;
    }

    @Override
    public boolean containsKey(Object key) {
        return super.containsKey(key);
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    public void findAll(){
        for (Entry<K,V> e: entrySet()) {
            System.out.print("{"+e.getKey().toString() + "  "+ e.getValue().toString()+"}");
        }
        System.out.println();
    }

    public void setValue (K key, V value ){
        if(containsKey(key)){
            for (Entry<K,V> e: entrySet()) {
                if(e.getKey().equals(key))
                    e.setValue(value);
            }
        }else {
            System.out.println("Key not found");
        }
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return entrySet;
    }
}
