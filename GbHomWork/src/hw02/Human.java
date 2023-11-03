package hw02;

public class Human implements Contestants{
    private final int maxLength;
    private final int maxHeight;
    boolean isActive;

    public Human(int maxLength, int maxHeight) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
        this.isActive = true;
    }

    @Override
    public void run(int length) {
        if (isActive) {
            System.out.printf("Human %s ran %d\n", maxLength < length ? "couldn't" : "", length);
        }
        if (maxLength < length)isActive = false;
    }

    @Override
    public void jump(int height) {
        if (isActive) {
            System.out.printf("Human %s jumped %d\n", maxHeight < height ? "couldn't" : "", height);
        }
        if (maxHeight < height)isActive = false;
    }
}
