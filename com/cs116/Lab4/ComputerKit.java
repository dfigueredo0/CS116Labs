package com.cs116.Lab4;

import java.util.ArrayList;

public class ComputerKit {
    private ArrayList<ComputerPart> computerParts = new ArrayList<>();

    public void addPart(ComputerPart part) {
        computerParts.add(part);
    }

    public String getPriceRange() {
        int sum = 0;
        for(ComputerPart part : computerParts) {
            sum += part.getPrice();
        }

        if(sum > 1000) {
            return "expensive";
        } else if(sum < 1000 && sum > 250) {
            return "normal";
        } else {
            return "cheap";
        }
    }

    public boolean contains(String item) {
        for(ComputerPart part : computerParts) {
            if(part.getItem().equals(item)) {
                return true;
            }
        }
        return false;
    }

    public int countItem(String item) {
        int count = 0;
        for(ComputerPart part : computerParts) {
            if(part.getItem().equals(item)) {
                count++;
            }
        }
        return count;
    }
}
