package com.example.string;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public boolean checkPangram(String str) {
        Set<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z')
                set.add(ch);

            if (ch >= 'A' && ch <= 'Z') {
                ch = Character.toLowerCase(ch);
                set.add(ch);
            }
        }
        return set.size() == 26;
    }
}
