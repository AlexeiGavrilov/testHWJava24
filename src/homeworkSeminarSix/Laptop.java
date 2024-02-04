package homeworkSeminarSix;


public class Laptop {

    public Color color;
    public Brand brand;

    public Laptop(Color color, Brand brand) {
        this.color = color;
        this.brand = brand;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Laptop laptop = (Laptop) obj;
        return laptop.color.equals(this.color) && laptop.brand.equals(this.brand);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 :color.hashCode());
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return String.format("Ноутбук {Цвет = %s, Брэнд = %s}", this.color, this.brand);
    }

    public Color getColor() {
        return color;
    }

    public Brand getBrand() {
        return brand;
    }
}
