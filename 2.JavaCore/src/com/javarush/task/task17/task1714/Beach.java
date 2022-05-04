package com.javarush.task.task17.task1714;

/*
Comparable
*/

public class Beach implements Comparable<Beach> {
    private String name;
    private float distance;
    private int quality;

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {
    }

//
    @Override
    public synchronized int compareTo(Beach o) {
        int current = 0;
        int other = 0;
        float deltaDistance = distance - o.getDistance();
        if (deltaDistance > 0) {
            other++;
        } else if (deltaDistance < 0) {
            current++;
        }
        int deltaQuality = quality - o.getQuality();
        if (deltaQuality > 0) {
            current ++;
        } else if (deltaQuality < 0) {
            other++;
        };
        return current - other;
    }
}