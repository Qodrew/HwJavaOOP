package hw02;

public class Barrier implements Crossable{

    private final int height;

    public Barrier(int height) {
        this.height = height;
    }

    @Override
    public void cross(Contestants contestant) {
        contestant.jump(height);
    }
}
