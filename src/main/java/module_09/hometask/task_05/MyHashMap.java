package core.com.module_09.hometask.task_05;

public class MyHashMap<K, V> {
    private HashNode<K, V>[] table;
    private int size;

    public MyHashMap() {
        table = (HashNode<K, V>[]) new HashNode[16];
        size = 0;
    }

    public void put(K key, V value) {
        int index = indexFor(key);

        HashNode<K, V> current = table[index];
        while (current != null) {
            if (keysEqual(current.key, key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }

        table[index] = new HashNode<>(key, value, table[index]);
        size++;
    }

    public void remove(K key) {
        int index = indexFor(key);

        HashNode<K, V> current = table[index];
        HashNode<K, V> prev = null;

        while (current != null) {
            if (keysEqual(current.key, key)) {
                if (prev == null) {
                    table[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public void clear() {
        for (int i = 0; i < table.length; i++) {
            table[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    public V get(K key) {
        int index = indexFor(key);

        HashNode<K, V> current = table[index];
        while (current != null) {
            if (keysEqual(current.key, key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    private int indexFor(K key) {
        int h = (key == null) ? 0 : key.hashCode();
        h = h ^ (h >>> 16);
        return (table.length - 1) & h;
    }

    private boolean keysEqual(K a, K b) {
        if (a == b) return true;
        if (a == null) return false;
        return a.equals(b);
    }
}
