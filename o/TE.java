package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class TE {
    public Object[] a;
    public int b;
    public boolean c;

    public TE() {
        U9.d(4, "initialCapacity");
        this.a = new Object[4];
        this.b = 0;
    }

    public static int e(int i, int i2) {
        if (i2 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i2) {
            iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public final void a(Object obj) {
        obj.getClass();
        f(this.b + 1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    public abstract TE b(Object obj);

    public void c(Object obj) {
        a(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(List list) {
        if (list instanceof Collection) {
            f(list.size() + this.b);
            if (list instanceof UE) {
                this.b = ((UE) list).d(this.b, this.a);
                return;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    public final void f(int i) {
        Object[] objArr = this.a;
        if (objArr.length < i) {
            this.a = Arrays.copyOf(objArr, e(objArr.length, i));
            this.c = false;
        } else if (this.c) {
            this.a = (Object[]) objArr.clone();
            this.c = false;
        }
    }
}
