package j$.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
final class g extends l {
    final l[] e;

    g(l[] lVarArr) {
        super(-1, null, null);
        this.e = lVarArr;
    }

    @Override // j$.util.concurrent.l
    final l a(Object obj, int i) {
        int length;
        l lVarK;
        Object obj2;
        l[] lVarArr = this.e;
        loop0: while (obj != null && lVarArr != null && (length = lVarArr.length) != 0 && (lVarK = ConcurrentHashMap.k(lVarArr, (length - 1) & i)) != null) {
            do {
                int i2 = lVarK.a;
                if (i2 == i && ((obj2 = lVarK.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return lVarK;
                }
                if (i2 >= 0) {
                    lVarK = lVarK.d;
                } else {
                    if (!(lVarK instanceof g)) {
                        return lVarK.a(obj, i);
                    }
                    lVarArr = ((g) lVarK).e;
                }
            } while (lVarK != null);
        }
        return null;
    }
}
