package hw02;

public class Robot implements Contestants {
    private final int maxLength;
    private final int maxHeight;
    boolean isActive;

    public Robot(int maxLength, int maxHeight) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
        this.isActive = true;
    }

    @Override
    public void run(int length) {
        if (isActive) {
            System.out.printf("Robot %s ran %d\n", maxLength < length ? "couldn't" : "", length);
        }
        if (maxLength < length)isActive = false;
    }

    @Override
    public void jump(int height) {
        if (isActive) {
            System.out.printf("Robot %s jumped %d\n", maxHeight < height ? "couldn't" : "", height);
        }
        if (maxHeight < height)isActive = false;
    }
}
