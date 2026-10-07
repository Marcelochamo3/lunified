package o;

/* JADX INFO: renamed from: o.l20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2039l20 implements InterfaceC1941k20 {
    public final Object[] l;
    public int m;

    public C2039l20(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0".toString());
        }
        this.l = new Object[i];
    }

    public void a(Object obj) {
        int i = this.m;
        Object[] objArr = this.l;
        if (i < objArr.length) {
            objArr[i] = obj;
            this.m = i + 1;
        }
    }

    @Override // o.InterfaceC1941k20
    public boolean e(Object obj) {
        Object[] objArr;
        boolean z;
        AbstractC1474fG.j(obj, "instance");
        int i = this.m;
        int i2 = 0;
        while (true) {
            objArr = this.l;
            if (i2 >= i) {
                z = false;
                break;
            }
            if (objArr[i2] == obj) {
                z = true;
                break;
            }
            i2++;
        }
        if (!(!z)) {
            throw new IllegalStateException("Already in the pool!".toString());
        }
        int i3 = this.m;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.m = i3 + 1;
        return true;
    }

    @Override // o.InterfaceC1941k20
    public Object n() {
        int i = this.m;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.l;
        Object obj = objArr[i2];
        AbstractC1474fG.h(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i2] = null;
        this.m--;
        return obj;
    }

    public C2039l20() {
        this.l = new Object[256];
    }
}
