package com.cs116.Lab5;

import java.util.ArrayList;

public class ArrayListMethods {
    public ArrayListMethods() {
        
    }

    public void reverse(ArrayList<String> list) {
        int size = list.size();
        for(int i = 0, mid = size>>1, j = size - 1; i < mid; i++, j--) {
            swap(list, i, j);
        }
    }

    public void capitalizePlurals(ArrayList<String> list) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).endsWith("s")) {
                list.set(i, list.get(i).toUpperCase());
            }
        }
    }

    public void removePlurals(ArrayList<String> list) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).endsWith("s")) {
                list.remove(list.get(i));
            }
        }
    }

    public ArrayList<Integer> intersect(ArrayList<Integer> list, ArrayList<Integer> list1) {
        ArrayList<Integer> intersect = new ArrayList<>();
        int i = 0, j = 0;

        while(i < list.size() && j < list1.size()) {
            if(list.get(i) == list1.get(j)) {
                intersect.add(list.get(i));
                i++;
                j++;
            } else if(list.get(i) < list1.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return intersect;
    }

    private static void swap(ArrayList<String> list, int i, int j) {
        final ArrayList<String> l = list;
        l.set(i, l.set(j, l.get(i)));
    }
}
