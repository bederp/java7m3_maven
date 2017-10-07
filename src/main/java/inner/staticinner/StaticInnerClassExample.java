package inner.staticinner;

import java.awt.*;

public class StaticInnerClassExample {

    private String name;
    private int year;
    private Color color;

    private StaticInnerClassExample(Builder builder) {
        this.name = builder.name;
        this.year = builder.year;
        this.color = builder.color;
    }

    @Override
    public String toString() {
        return "inner.staticinner.StaticInnerClassExample{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", color=" + color +
                '}';
    }

    public static class Builder {
        private String name;
        private int year;
        private Color color;

        public Builder(String name) {
            this.name = name;
        }

        public Builder year(int year) {
            this.year = year;
            return this;
        }

        public Builder color(Color color) {
            this.color = color;
            return this;
        }

        public StaticInnerClassExample build() {
            return new StaticInnerClassExample(this);
        }
    }
}
