package com.randebrock.bigdecimal.main.classes;

public class TvSeries extends Video{
    private int season;

    public TvSeries(String title, int length, int year, int season) {
        super(title, length, year);
        this.season = season;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public String nextSeason(){
        return "if it is not too late..., watch the next episode";
    }
}

