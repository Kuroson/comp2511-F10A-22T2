package youtube.state;

import youtube.Viewing;

public class PlayingState extends ViewingState {
    public PlayingState(Viewing viewing) {
        super(viewing);
    }

    @Override
    public String onLock() {
        return null;
    }

    @Override
    public String onPlay() {
        return null;
    }

    @Override
    public String onNext() {
        return null;
    }
}