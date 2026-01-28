package core.com.module_09;

class KeyValuePair<K, V> {
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return key + " = " + value;
    }
}

class KeyValueTest {
    public static void main(String[] args) {
        KeyValuePair<String, Integer> javaSalary = new KeyValuePair<String, Integer>();
        javaSalary.setKey("Java");
        javaSalary.setValue(5000);
        System.out.println(javaSalary);

        KeyValuePair<String, String> javaSalary2 = new KeyValuePair<String, String>();
        KeyValuePair<Integer, Float> yearAvgTemperature = new KeyValuePair<Integer, Float>();

        javaSalary2.setKey("Java");
        javaSalary2.setValue("The Best");
        System.out.println(javaSalary2);

        yearAvgTemperature.setKey(3200);
        yearAvgTemperature.setValue(15f);
        System.out.println(yearAvgTemperature);
    }
}
