package Pareja_rodriguez_martinez.reto4;

import java.util.AbstractMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Reto4 {

    public static HashMap<String,Integer> saveInHashMap(List<Object[]> listToSave){
        return listToSave.stream()
                .collect(Collectors.toMap(
                        arr -> (String) arr[0],
                        arr -> (Integer) arr[1],
                        (v1, v2) -> v1,
                        HashMap::new
                ));
    }

    public static Map<String,Integer> unifyMaps(HashMap<String,Integer> hashMapToUnify,Hashtable<String,Integer> hashTableToUnify){
        return Stream.concat(hashMapToUnify.entrySet().stream(), hashTableToUnify.entrySet().stream()).
                collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> v2,
                        HashMap::new
                ));
    }
}