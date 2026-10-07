package o;

/* JADX INFO: loaded from: classes.dex */
public final class QJ {
    public static SJ a(TJ tj) {
        AbstractC1474fG.j(tj, "state");
        int iOrdinal = tj.ordinal();
        if (iOrdinal == 2) {
            return SJ.ON_DESTROY;
        }
        if (iOrdinal == 3) {
            return SJ.ON_STOP;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return SJ.ON_PAUSE;
    }

    public static SJ b(TJ tj) {
        AbstractC1474fG.j(tj, "state");
        int iOrdinal = tj.ordinal();
        if (iOrdinal == 1) {
            return SJ.ON_CREATE;
        }
        if (iOrdinal == 2) {
            return SJ.ON_START;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return SJ.ON_RESUME;
    }
}
