package org.example;

import org.example.entity.Employee;

import java.util.*;

public class Main {

    public static List<Employee> findDuplicates(List<Employee> list) {
        Map<Employee, Integer> map = new HashMap<>();
        List<Employee> result = new LinkedList<>();

        for (Employee e : list) {
            if (e == null) continue;
            map.put(e, map.getOrDefault(e, 0) + 1);
        }

        for (Employee e : list) {
            if (e == null) continue;
            if (map.get(e) > 1 && !result.contains(e)) {
                result.add(e);
            }
        }

        return result;
    }

    public static Map<Integer, Employee> findUniques(List<Employee> list) {
        Map<Integer, Employee> map = new HashMap<>();

        for (Employee e : list) {
            if (e == null) continue;
            map.put(e.getId(), e);
        }

        return map;
    }

    public static List<Employee> removeDuplicates(List<Employee> list) {
        Map<Employee, Integer> map = new HashMap<>();
        List<Employee> result = new LinkedList<>();

        for (Employee e : list) {
            if (e == null) continue;
            map.put(e, map.getOrDefault(e, 0) + 1);
        }

        for (Employee e : list) {
            if (e == null) continue;
            if (map.get(e) == 1) {
                result.add(e);
            }
        }

        return result;
    }
}