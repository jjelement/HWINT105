package homwork;

import java.util.Arrays;

public class Cinema extends Movie {
    private Theater[] theaters;

    public Cinema() {
    }

    public Cinema(Theater[] theaters) {
        this.theaters = theaters;
    }

    public Theater[] getTheaters() {
        return theaters;
    }

    public void setTheaters(Theater[] theaters) {
        this.theaters = theaters;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "theaters=" + Arrays.toString(theaters) +
                '}';
    }
}
