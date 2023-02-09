package com.cs116.Lab4;

public class BlockWorld {
    private String[][] grid;
    
    public BlockWorld() {
        grid = new String[10][10];
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                grid[i][j] = "X";
            }
        }
    }
    
    public BlockWorld(int size) {
        grid = new String[size][size];
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                grid[i][j] = "X";
            }
        }
    }

    public boolean getCellColor(int x, int y) {
        if(grid[x][y].equals("X"))
            return false;
        else
            return true;
    }

    public void setCellColor(int x, int y, boolean setWhite) {
        if(setWhite) {
            grid[x][y] = " ";
        } else {
            grid[x][y] = "X";
        }
    }

    public String toString() {
        String str = "";
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                str += grid[i][j] + "\t";
            }
            str += "\n";
        }
        return str;
    }

    public static void main(String[] args) {
        BlockWorld world = new BlockWorld(3);
        world.setCellColor(0, 0, true);
        world.setCellColor(2, 2, true);
        System.out.println(world.toString());   
    }
}
