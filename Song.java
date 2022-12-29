package MusicApp;

public class Song {
    String title;
    double duration;
    double size;
    String genre;

public Song(String title, double duration){
    this.title=title;
    this.duration=duration;

}

public Song(){

}

public String getTitle(){
    return title;
}

public  double getDuration(){
    return duration;
}

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", size=" + size +
                ", genre='" + genre + '\'' +
                '}';
    }
}
