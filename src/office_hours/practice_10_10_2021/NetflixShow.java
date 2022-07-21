package office_hours.practice_10_10_2021;

import day15_switch.NestedExample;

public class NetflixShow extends Streaming{

    String showName;
    int episodeNumber;
    int seasonNumber;


    public NetflixShow(double duration, String showName, int episodeNumber, int seasonNumber){
        super("Netflix",duration);
        this.showName = showName;
        this.episodeNumber = episodeNumber;
        this.seasonNumber = seasonNumber;
    }
}
