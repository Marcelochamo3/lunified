package androidx.media;

import o.AbstractC3280xs0;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC3280xs0 abstractC3280xs0) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = abstractC3280xs0.f(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = abstractC3280xs0.f(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = abstractC3280xs0.f(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = abstractC3280xs0.f(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC3280xs0 abstractC3280xs0) {
        abstractC3280xs0.getClass();
        abstractC3280xs0.j(audioAttributesImplBase.a, 1);
        abstractC3280xs0.j(audioAttributesImplBase.b, 2);
        abstractC3280xs0.j(audioAttributesImplBase.c, 3);
        abstractC3280xs0.j(audioAttributesImplBase.d, 4);
    }
}
