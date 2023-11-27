package com.example.string;


import java.util.ArrayDeque;
import java.util.Deque;

public class LeftRotateByK {

     public String leftRotateString(String s, int d) {
        Deque<Character> charDeque = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            charDeque.addLast(c);
        }
        for (int i = 0; i < d; i++) {
            char firstChar = charDeque.removeFirst();
            charDeque.addLast(firstChar);
        }
        StringBuilder result = new StringBuilder();
        for (char c : charDeque) {
            result.append(c);
        }
        return result.toString();
    }
}
