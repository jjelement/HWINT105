package homwork;

public class Theater {
    private String name;

    public Theater() {
    }

    public Theater(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Theater) {
            return ((Theater)obj).name == this.name;
        }
        return false;
    }
}
