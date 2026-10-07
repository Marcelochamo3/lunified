package o;

import java.util.UUID;

/* JADX INFO: renamed from: o.ny, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2322ny implements InterfaceC2871ti {
    public static final boolean d;
    public final UUID a;
    public final byte[] b;
    public final boolean c;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z;
        if ("Amazon".equals(Lr0.c)) {
            String str = Lr0.d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        d = z;
    }

    public C2322ny(UUID uuid, byte[] bArr, boolean z) {
        this.a = uuid;
        this.b = bArr;
        this.c = z;
    }
}
