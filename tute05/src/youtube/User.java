package youtube;

/**
 * Subscriber/Observer
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void subscribeTo(Producer p) {
        p.addSubscriber(this);
    }

    // Update()
    public void alertNewVideo(Video video) {
        // UserName: VideoName
        System.out.println(String.format("%s: %s", this.name, video.getName()));
    }
}
