package youtube;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject/Observable
 */
public class Producer {
    private String name;
    private List<User> subscribers = new ArrayList<>();
    private List<Video> videos = new ArrayList<>();

    public Producer(String name) {
        this.name = name;
    }

    // Add()
    public void addSubscriber(User u) {
        this.subscribers.add(u);
    }

    // Remove()
    public void removeSubscriber(User u) {
        this.subscribers.remove(u);
    }

    /**
     * Notify(), a new video has been posted
     * @param name name of video
     * @param length length of video
     */
    public void postVideo(String name, int length) {
        Video v = new Video(name, length, this);
        this.videos.add(v);

        // Notify all subscribed users that a new video exists
        this.subscribers.stream().forEach(subscriber -> {
            subscriber.alertNewVideo(v);
        });

        // for (User u : this.subscribers) {
        //     u.alertNewVideo(v);
        // }
    }

    public static void main(String[] args) {
        User u1 = new User("Max");
        User u2 = new User("Sam");
        Producer p = new Producer("Jess");
        u1.subscribeTo(p);
        p.postVideo("Video1", 100);
        u2.subscribeTo(p);
        System.out.println();
        p.postVideo("Video2", 100);
    }
}
