package androidx.media;

import android.media.AudioAttributes;
import o.AbstractC3280xs0;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC3280xs0 abstractC3280xs0) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) abstractC3280xs0.g(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = abstractC3280xs0.f(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC3280xs0 abstractC3280xs0) {
        abstractC3280xs0.getClass();
        abstractC3280xs0.k(audioAttributesImplApi21.a, 1);
        abstractC3280xs0.j(audioAttributesImplApi21.b, 2);
    }
}
