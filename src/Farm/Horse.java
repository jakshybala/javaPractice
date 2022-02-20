package Farm;

public class Horse extends Animals{
    private String color;

    public Horse(String color, double weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
