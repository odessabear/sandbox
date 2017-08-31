package com.amikhailov.t5.collections.multiMap;

import java.util.Map;
import java.util.Set;

/**
 * Created by X501A on 06.08.2017.
 */
public class MapUtilsImpl implements MapUtils {

    @Override
    public MultiMap<MapKey, Integer> merge(Map<MapKey, Integer>... maps) throws IllegalArgumentException {
        MultiMapImpl<MapKey,Integer> unity = new MultiMapImpl<>();
        for(Map<MapKey, Integer> map: maps){
            Set<MapKey> keys = map.keySet();
            for (MapKey key:keys){
                unity.put(key,map.get(key));
            }

        }
       // unity.values();

        return unity;
    }
}
