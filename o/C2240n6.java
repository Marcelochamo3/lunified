package o;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: o.n6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2240n6 implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RO b;
    public final /* synthetic */ InterfaceC3328yO c;

    public /* synthetic */ C2240n6(InterfaceC3328yO interfaceC3328yO, RO ro, int i) {
        this.a = i;
        this.c = interfaceC3328yO;
        this.b = ro;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        switch (this.a) {
            case 0:
                C2434p6 c2434p6 = (C2434p6) this.c;
                RO ro = this.b;
                c2434p6.getClass();
                ro.getClass();
                if (Lr0.a >= 30) {
                    ro.a(j);
                } else {
                    Handler handler = ro.l;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                }
                break;
            default:
                RN rn = (RN) this.c;
                RO ro2 = this.b;
                rn.getClass();
                ro2.getClass();
                if (Lr0.a >= 30) {
                    ro2.a(j);
                } else {
                    Handler handler2 = ro2.l;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                }
                break;
        }
    }
}
