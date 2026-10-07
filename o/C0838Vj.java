package o;

import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: o.Vj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0838Vj implements QK, InterfaceC0809Ug {
    public final /* synthetic */ int l;

    public /* synthetic */ C0838Vj(int i) {
        this.l = i;
    }

    public Constructor a() {
        switch (this.l) {
            case 28:
                if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(InterfaceC0302As.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(InterfaceC0302As.class).getConstructor(null);
        }
    }

    @Override // o.InterfaceC0809Ug
    public void accept(Object obj) {
        ((C0350Co) obj).a();
    }

    @Override // o.QK
    public void b(Object obj) {
        C2747sP c2747sP = (C2747sP) obj;
        switch (this.l) {
            case 0:
                c2747sP.getClass();
                break;
            case 1:
                c2747sP.getClass();
                break;
            case 2:
                c2747sP.getClass();
                break;
            case 3:
                c2747sP.getClass();
                break;
            case 4:
                c2747sP.getClass();
                break;
            case 5:
                c2747sP.getClass();
                break;
            case 6:
                c2747sP.getClass();
                break;
            case 7:
                c2747sP.getClass();
                break;
            case 8:
                c2747sP.getClass();
                break;
            case 9:
                c2747sP.getClass();
                break;
            case 10:
                c2747sP.getClass();
                break;
            case 11:
                c2747sP.getClass();
                break;
            case 12:
                c2747sP.getClass();
                break;
            case 13:
                c2747sP.getClass();
                break;
            case 14:
                c2747sP.getClass();
                break;
            case 15:
                c2747sP.getClass();
                break;
            case 16:
                c2747sP.getClass();
                break;
            case 17:
                c2747sP.getClass();
                break;
            case 18:
                c2747sP.getClass();
                break;
            case 19:
                c2747sP.getClass();
                break;
            case 20:
                c2747sP.getClass();
                break;
            case 21:
                c2747sP.getClass();
                break;
            case 22:
                c2747sP.getClass();
                break;
            case 23:
                c2747sP.getClass();
                break;
            case 24:
                c2747sP.getClass();
                break;
            case 25:
                c2747sP.getClass();
                break;
            default:
                c2747sP.getClass();
                break;
        }
    }

    public /* synthetic */ C0838Vj(C3201x2 c3201x2) {
        this.l = 18;
    }

    public /* synthetic */ C0838Vj(C3201x2 c3201x2, int i) {
        this.l = 13;
    }

    public /* synthetic */ C0838Vj(C3201x2 c3201x2, Object obj, int i) {
        this.l = i;
    }

    public /* synthetic */ C0838Vj(C3201x2 c3201x2, boolean z) {
        this.l = 12;
    }
}
