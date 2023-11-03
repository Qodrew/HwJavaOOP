package hw02;

public class Track implements Crossable{

    private final int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public void cross(Contestants contestant) {
        contestant.run(length);
    }
}
