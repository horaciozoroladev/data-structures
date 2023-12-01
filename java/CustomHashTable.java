import java.util.ArrayList;
import java.util.List;

public class CustomHashTable {
    private List<List<Entry>> buckets;
    private int numBuckets;

    public CustomHashTable(int size) {
        this.buckets = new ArrayList<>(size);
        this.numBuckets = size;

        for (int i = 0; i < size; i++) {
            this.buckets.add(null);
        }
    }

    public int hash(String key) {
        int total = 0;

        for (int i = 0; i < key.length(); i++) {
            total += key.charAt(i);
        }

        return total % this.numBuckets;
    }

    public void insert(String key, String value) {
        int index = hash(key);

        if (this.buckets.get(index) == null) {
            this.buckets.set(index, new ArrayList<>());
        }

        this.buckets.get(index).add(new Entry(key, value));
    }

    public String get(String key) {
        int index = hash(key);
        List<Entry> bucket = this.buckets.get(index);

        if (bucket == null) {
            return null;
        }

        for (Entry entry : bucket) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }

        return null;
    }

    private static class Entry {
        private String key;
        private String value;

        public Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }
}
