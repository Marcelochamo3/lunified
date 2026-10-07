package androidx.media;

import o.AbstractC3280xs0;
import o.InterfaceC3474zs0;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC3280xs0 abstractC3280xs0) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        InterfaceC3474zs0 interfaceC3474zs0H = audioAttributesCompat.a;
        if (abstractC3280xs0.e(1)) {
            interfaceC3474zs0H = abstractC3280xs0.h();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) interfaceC3474zs0H;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC3280xs0 abstractC3280xs0) {
        abstractC3280xs0.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        abstractC3280xs0.i(1);
        abstractC3280xs0.l(audioAttributesImpl);
    }
}
