package o;

/* JADX INFO: renamed from: o.hZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1689hZ extends AbstractC2325o0 {
    public boolean a;
    public boolean b;
    public int c;
    public String d;
    public float e;

    @Override // o.AbstractC2325o0
    public final void a(InterfaceC1739hy0 interfaceC1739hy0, float f) {
        AbstractC1474fG.j(interfaceC1739hy0, "youTubePlayer");
        this.e = f;
    }

    @Override // o.AbstractC2325o0
    public final void b(InterfaceC1739hy0 interfaceC1739hy0, int i) {
        AbstractC1474fG.j(interfaceC1739hy0, "youTubePlayer");
        AbstractC1701hf0.q(i, "error");
        if (i == 3) {
            this.c = i;
        }
    }

    @Override // o.AbstractC2325o0
    public final void d(InterfaceC1739hy0 interfaceC1739hy0, int i) {
        AbstractC1474fG.j(interfaceC1739hy0, "youTubePlayer");
        AbstractC1701hf0.q(i, "state");
        int iW = AbstractC1701hf0.w(i);
        if (iW != 2) {
            if (iW == 3) {
                this.b = true;
                return;
            } else if (iW != 4) {
                return;
            }
        }
        this.b = false;
    }

    @Override // o.AbstractC2325o0
    public final void e(InterfaceC1739hy0 interfaceC1739hy0, String str) {
        AbstractC1474fG.j(interfaceC1739hy0, "youTubePlayer");
        this.d = str;
    }
}
