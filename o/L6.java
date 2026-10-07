package o;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes.dex */
public abstract class L6 {
    public static final AudioAttributes a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static AbstractC0985aF a() {
        XE xe = AbstractC0985aF.m;
        WE we = new WE();
        R60 r60 = M6.e;
        P60 p60 = r60.m;
        if (p60 == null) {
            P60 p61 = new P60(r60, new Q60(r60.p, 0, r60.q));
            r60.m = p61;
            p60 = p61;
        }
        Aq0 it = p60.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            if (Lr0.a >= 34 || iIntValue != 30) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), a)) {
                    we.a(num);
                }
            }
        }
        we.a(2);
        return we.g();
    }

    public static int b(int i, int i2) {
        for (int i3 = 10; i3 > 0; i3--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(Lr0.p(i3)).build(), a)) {
                return i3;
            }
        }
        return 0;
    }
}
