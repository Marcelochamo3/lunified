package o;

/* JADX INFO: loaded from: classes.dex */
public final class Od0 extends Thread {
    public final /* synthetic */ Rd0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Od0(Rd0 rd0) {
        super("ExoPlayer:SimpleDecoder");
        this.l = rd0;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Rd0 rd0 = this.l;
        rd0.getClass();
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (rd0.h());
    }
}
