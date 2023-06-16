package ss11_stack_queue;

import java.util.*;

public class PracticeTreeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> treeMap = new TreeMap<>();
        System.out.println("Nhập văn bản: ");
        String text = scanner.nextLine();
        String[] words = ((text.toLowerCase()).split("\\s"));
        int value = 0;
        Set<String> keySet = treeMap.keySet();
        for(String word : words){
            treeMap.put(word, value);
        }
        for (String key : keySet) {
            for(String word : words){
                if(Objects.equals(key, word)){
                    int currentValue = treeMap.get(key);
                    int newValue = currentValue + 1;
                    treeMap.put(key, newValue);
                }
            }
        }
        for(Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            String key = entry.getKey();
            int val = entry.getValue();
            System.out.println("Key: " + key + ", value: " + val);
        }
    }
}
