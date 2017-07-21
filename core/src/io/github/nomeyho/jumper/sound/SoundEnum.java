package io.github.nomeyho.jumper.sound;

import com.badlogic.gdx.utils.Array;

public enum SoundEnum {
    TINK("sound/tink.mp3");

    private String fileName;

    SoundEnum(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return this.fileName;
    }

    // Chapter 7, p. 257 of "Learning LibGDX Development" 2nd Edition
    public static Array<SoundEnum> toList() {
        Array<SoundEnum> ret = new Array<SoundEnum>();

        for(SoundEnum sound: SoundEnum.values())
            ret.add(sound);

        return ret;
    }
}
