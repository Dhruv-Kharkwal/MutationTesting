package com.example.graph;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class AccountsMergeTest {

    @Test
    public void testAccountsMerge() {
        AccountsMerge solution = new AccountsMerge();

        // Test case 1
        List<List<String>> accounts1 = Arrays.asList(
                Arrays.asList("John", "john@gmail.com", "john@yahoo.com"),
                Arrays.asList("John", "john@yahoo.com", "john@gmail.com", "john@gmail.com"));
        List<List<String>> result1 = solution.accountsMerge(accounts1);
        List<List<String>> expected1 = Arrays.asList(
                Arrays.asList("John", "john@gmail.com", "john@yahoo.com"));
        assertEquals(expected1, result1);

        // Test case 2
        List<List<String>> accounts2 = Arrays.asList(
                Arrays.asList("Alice", "alice@gmail.com"),
                Arrays.asList("Bob", "bob@gmail.com"),
                Arrays.asList("Alice", "alice@yahoo.com"),
                Arrays.asList("John", "john@gmail.com", "john@yahoo.com"),
                Arrays.asList("John", "john@yahoo.com", "john@gmail.com", "john@gmail.com"));
        List<List<String>> result2 = solution.accountsMerge(accounts2);
        List<List<String>> expected2 = Arrays.asList(
                Arrays.asList("Bob", "bob@gmail.com"),
                Arrays.asList("Alice", "alice@gmail.com"),
                Arrays.asList("John", "john@gmail.com", "john@yahoo.com"),
                Arrays.asList("Alice", "alice@yahoo.com"));
        assertEquals(expected2, result2);

        // Test case 3
        List<List<String>> accounts3 = Arrays.asList(
                Arrays.asList("David", "david@gmail.com"),
                Arrays.asList("David", "david@yahoo.com"));
        List<List<String>> result3 = solution.accountsMerge(accounts3);
        List<List<String>> expected3 = Arrays.asList(
                Arrays.asList("David", "david@yahoo.com"),
                Arrays.asList("David", "david@gmail.com"));
        assertEquals(expected3, result3);

        // Test case 4
        List<List<String>> accounts4 = Arrays.asList(
                Arrays.asList("David", "david@gmail.com"));
        List<List<String>> result4 = solution.accountsMerge(accounts4);
        List<List<String>> expected4 = Arrays.asList(
                Arrays.asList("David", "david@gmail.com"));
        assertEquals(expected4, result4);

        // Test case 4
        List<List<String>> accounts5 = Arrays.asList();
        List<List<String>> result5 = solution.accountsMerge(accounts5);
        List<List<String>> expected5 = Arrays.asList();
        assertEquals(expected5, result5);
    }
}