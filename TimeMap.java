import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TimeMap {

    private Map<String, TreeMap<Integer, String>> map;

    public TimeMap(){
        map= new HashMap<>();
    }

    public void set(String key, String value, int timeStamp){
        map.computeIfAbsent(key, k -> new TreeMap<>()).put(timeStamp, value);
    }

    public String get(String key, int timestamp){
        TreeMap<Integer, String> treeMap = map.get(key);
        if(treeMap == null){
            return "";
        }
        Map.Entry<Integer, String> entry = treeMap.floorEntry(timestamp);
        return entry == null ?"": entry.getValue();
    }

}
