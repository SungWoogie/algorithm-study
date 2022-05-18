package study.oop;

public class Bicycle {

    private final String handle;
    private final String frame;
    private final String chair;

    public Bicycle(String handle, String frame, String chair) {
        this.handle = handle;
        this.frame = frame;
        this.chair = chair;
    }

    public String getHandle() {
        return handle;
    }

    public String getFrame() {
        return frame;
    }

    public String getChair() {
        return chair;
    }


}
