package youtube.state;

import youtube.Viewing;

public class ReadyState extends ViewingState {
    public ReadyState(Viewing viewing) {
        super(viewing);
    }

    @Override
    public String onLock() {
        this.getViewing().changeState(new LockedState(this.getViewing()));
        return "Locked";
    }

    @Override
    public String onPlay() {
        this.getViewing().startPlayback();
        this.getViewing().changeState(new PlayingState(this.getViewing()));
        return null;
    }

    @Override
    public String onNext() {
        return "Error: Locked";
    }
}