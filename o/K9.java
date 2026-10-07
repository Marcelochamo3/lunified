package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class K9 {
    public static final C0805Uc a = new C0805Uc(-1, null, null, 0);
    public static final int b = AbstractC0397Ej.I("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);
    public static final int c = AbstractC0397Ej.I("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);
    public static final J2 d = new J2(10, "BUFFERED", false);
    public static final J2 e = new J2(10, "SHOULD_BUFFER", false);
    public static final J2 f = new J2(10, "S_RESUMING_BY_RCV", false);
    public static final J2 g = new J2(10, "RESUMING_BY_EB", false);
    public static final J2 h = new J2(10, "POISONED", false);
    public static final J2 i = new J2(10, "DONE_RCV", false);
    public static final J2 j = new J2(10, "INTERRUPTED_SEND", false);
    public static final J2 k = new J2(10, "INTERRUPTED_RCV", false);
    public static final J2 l = new J2(10, "CHANNEL_CLOSED", false);
    public static final J2 m = new J2(10, "SUSPEND", false);
    public static final J2 n = new J2(10, "SUSPEND_NO_WAITER", false);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final J2 f357o = new J2(10, "FAILED", false);
    public static final J2 p = new J2(10, "NO_RECEIVE_RESULT", false);
    public static final J2 q = new J2(10, "CLOSE_HANDLER_CLOSED", false);
    public static final J2 r = new J2(10, "CLOSE_HANDLER_INVOKED", false);
    public static final J2 s = new J2(10, "NO_CLOSE_CAUSE", false);

    public static final boolean a(InterfaceC1594gb interfaceC1594gb, Object obj, InterfaceC0412Ey interfaceC0412Ey) {
        J2 j2K = interfaceC1594gb.k(obj, interfaceC0412Ey);
        if (j2K == null) {
            return false;
        }
        interfaceC1594gb.u(j2K);
        return true;
    }
}
