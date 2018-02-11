package homwork;

import java.util.Arrays;

public class Serie extends Movie {
    private SerieEp[] serieEps;

    public Serie() {
    }

    public Serie(SerieEp[] serieEps) {
        this.serieEps = serieEps;
    }

    public SerieEp[] getSerieEps() {
        return serieEps;
    }

    public void setSerieEps(SerieEp[] serieEps) {
        this.serieEps = serieEps;
    }

    @Override
    public Integer getLength() {
        int totalLength = 0;
        for(SerieEp serieEp : this.getSerieEps()) {
            totalLength += serieEp.getLength();
        }
        return totalLength;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "serieEps=" + Arrays.toString(serieEps) +
                '}';
    }
}
