package com.randebrock.bigdecimal.main.classes;

public class Movie extends Video{
    private String staringActors;

    public Movie(String title, int length, int year, String staringActors) {
        super(title, length, year);
        this.staringActors = staringActors;
    }

    public String getStaringActors() {
        return staringActors;
    }

    public void setStaringActors(String staringActors) {
        this.staringActors = staringActors;
    }
    public String goToSleep(){
        return "Movie has finished... go to Sleep 🛌";
    }
}

/*
Suppose you are building a video streaming service. All Videos are either tv series or movies.
Create classes TvSeries and Movie which extend an Abstract class Video.
Add a few methods and properties to each.
 */