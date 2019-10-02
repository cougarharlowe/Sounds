package com.example.sounds;

public class Note {
    private int soundId;
    private int delay;

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public int getSoundId() {
        return soundId;
    }

    public void setSoundId(int soundId) {
        this.soundId = soundId;
    }

    public Note(int soundId, int delay) {
        this.soundId = soundId;
        this.delay = delay;
    }
}
