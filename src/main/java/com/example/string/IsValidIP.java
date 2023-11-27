package com.example.string;

public class IsValidIP {
    public boolean inRange(int n) { // check if every split is in range 0-255
        if (n >= 0 && n <= 255) {
            return true;
        }
        return false;
    }

    public boolean hasLeadingZero(String n) { // check if every split has leading zero or not.
        if (n.length() > 1) {
            if (n.charAt(0) == '0') {
                return true;
            }
        }
        return false;
    }

    public int isValid(String s) {
        String[] parts = s.split("\\.");
        if (parts.length != 4) {
            return 0;
        }
        for (String part : parts) {
            if (hasLeadingZero(part)) {
                return 0;
            }
            if (part.length() == 0) {
                return 0;
            }
            try {
                int num = Integer.parseInt(part);
                if (!inRange(num)) {
                    return 0;
                }
            } catch (NumberFormatException e) {
                return 0;
            }
        }
        return 1;
    }
}
