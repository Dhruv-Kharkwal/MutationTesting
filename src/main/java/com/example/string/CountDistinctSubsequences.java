package com.example.string;

import java.util.HashMap;

public class CountDistinctSubsequences {
    public int countSub(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), -1);
        }

        int allCount = 0;
        int levelCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (i == 0) {
                allCount = 1;
                map.put(c, 1);
                levelCount = 1;
                continue;
            }

            levelCount = allCount + 1;

            if (map.get(c) < 0) {
                allCount = allCount + levelCount;
            } else {
                allCount = allCount + levelCount - map.get(c);
            }
            map.put(c, levelCount);
        }

        return allCount + 1;
    }
}
