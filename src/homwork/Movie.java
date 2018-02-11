package homwork;

public class Movie {
    private String name;
    private String genre;
    private Integer season;
    private Integer length;

    public Movie() {
    }

    public Movie(String name, String genre, Integer season, Integer length) {
        this.name = name;
        this.genre = genre;
        this.season = season;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", season=" + season +
                ", length=" + length +
                '}';
    }
}
