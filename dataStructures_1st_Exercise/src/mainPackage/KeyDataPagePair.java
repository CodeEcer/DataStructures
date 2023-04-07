package mainPackage;

import java.util.Arrays;

public class KeyDataPagePair implements Comparable<KeyDataPagePair> {
    private int key;
    private int dataPage;

    
    public KeyDataPagePair(int key, int dataPage) {
        this.key = key;
        this.dataPage = dataPage;
    }

    public int getKey() {
        return key;
    }

    public int getDataPage() {
        return dataPage;
    }

    @Override
    public int compareTo(KeyDataPagePair other) {
        return Integer.compare(this.key, other.key);
    }

    @Override
    public String toString() {
        return "(" + key + ", " + dataPage + ")";
    }

    
}