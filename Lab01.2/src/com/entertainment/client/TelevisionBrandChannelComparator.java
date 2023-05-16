package com.entertainment.client;

import com.entertainment.Television;

public class TelevisionBrandChannelComparator {
    public int compare(Television tv1, Television tv2) {
        int result = tv1.getBrand().compareTo(tv2.getBrand());

        if(result == 0) {
            result = tv1.getBrand().compareTo(tv2.getBrand());}
    }
}
