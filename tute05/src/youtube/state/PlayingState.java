package youtube.state;

import youtube.Viewing;

public class PlayingState extends ViewingState {
    public PlayingState(Viewing viewing) {
        super(viewing);
    }

    @Override
    public String onLock() {
        // Stop playing
        this.getViewing().setPlaying(false);
        this.getViewing().changeState(new LockedState(this.getViewing()));
        return "Locked";
    }

    @Override
    public String onPlay() {
        return "Paused";
    }

    @Override
    public String onNext() {
        this.getViewing().getNextVideo();
        return "Next video";
    }
}