package o;

/* JADX INFO: loaded from: classes.dex */
public final class FK implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ JK m;

    public /* synthetic */ FK(JK jk, int i) {
        this.l = i;
        this.m = jk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                C0687Po c0687Po = this.m.n;
                if (c0687Po != null) {
                    c0687Po.setListSelectionHidden(true);
                    c0687Po.requestLayout();
                }
                break;
            default:
                JK jk = this.m;
                C0687Po c0687Po2 = jk.n;
                if (c0687Po2 != null && c0687Po2.isAttachedToWindow() && jk.n.getCount() > jk.n.getChildCount() && jk.n.getChildCount() <= jk.x) {
                    jk.K.setInputMethodMode(2);
                    jk.e();
                    break;
                }
                break;
        }
    }
}
