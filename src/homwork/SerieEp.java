package homwork;

public class SerieEp {
    private String title;
    private Integer length;

    public SerieEp() {
    }

    public SerieEp(String title, Integer length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "SerieEp{" +
                "title='" + title + '\'' +
                ", length=" + length +
                '}';
    }
}
