package o;

import android.util.Base64;

/* JADX INFO: renamed from: o.tl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2877tl implements Gh0 {
    public final /* synthetic */ int l;

    @Override // o.Gh0
    public final Object get() {
        switch (this.l) {
            case 0:
                byte[] bArr = new byte[12];
                C3071vl.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            default:
                return new C1906jl(new C1562g8(), 50000, 50000, 2500, 5000, false);
        }
    }
}
