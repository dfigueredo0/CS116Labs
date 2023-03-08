package com.cs116.Lab6.Games;

public class PCBasedGame extends Game {
    private int minRAM;
    private int size;
    private int minCPU;

    public PCBasedGame(String description, int minRAM, int size, int minCPU) {
        super(description);
        setRequiredRAM(minRAM);
        setFileSize(size);
        setRequiredCPU(minCPU);
    }
    
    public int getRequiredRAM() {
        return minRAM;
    }

    public int getFileSize() {
        return size;
    }

    public int getRequiredCPU() {
        return minCPU;
    }

    public void setRequiredRAM(int minRAM) {
        this.minRAM = minRAM;
    }

    public void setFileSize(int size) {
        this.size = size;
    }

    public void setRequiredCPU(int minCPU) {
        this.minCPU = minCPU;
    }

    @Override
    public String toString() {
        return "Description: " + getDescription() + "\nMinimun GB of RAM: " + minRAM + "\nMinimum GHz of CPU: " + minCPU + "\nMB needed in hard drive: " + size;
    }
}
