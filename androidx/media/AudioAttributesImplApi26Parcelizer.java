package androidx.media;

import android.media.AudioAttributes;
import o.AbstractC3280xs0;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(AbstractC3280xs0 abstractC3280xs0) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) abstractC3280xs0.g(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = abstractC3280xs0.f(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, AbstractC3280xs0 abstractC3280xs0) {
        abstractC3280xs0.getClass();
        abstractC3280xs0.k(audioAttributesImplApi26.a, 1);
        abstractC3280xs0.j(audioAttributesImplApi26.b, 2);
    }
}
