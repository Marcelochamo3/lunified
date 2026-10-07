package o;

import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* JADX INFO: renamed from: o.g8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1562g8 {
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Object g;

    public /* synthetic */ C1562g8(int i) {
        this.a = i;
    }

    public void a(RecyclerView recyclerView) {
        int i = this.f;
        if (i >= 0) {
            this.f = -1;
            recyclerView.Q(i);
            this.b = false;
        } else if (this.b) {
            Interpolator interpolator = (Interpolator) this.g;
            if (interpolator != null && this.e < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i2 = this.e;
            if (i2 < 1) {
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            recyclerView.q0.c(this.c, this.d, i2, interpolator);
            this.b = false;
        }
    }

    public synchronized void b(int i) {
        boolean z = i < this.d;
        this.d = i;
        if (z) {
            c();
        }
    }

    public synchronized void c() {
        int iMax = Math.max(0, Lr0.g(this.d, this.c) - this.e);
        int i = this.f;
        if (iMax >= i) {
            return;
        }
        Arrays.fill((C2813t2[]) this.g, iMax, i, (Object) null);
        this.f = iMax;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return C1562g8.class.getSimpleName() + "[buffer=" + Arrays.toString((byte[]) this.g) + ", currentLinePos=0, eof=" + this.b + ", ibitWorkArea=" + this.c + ", lbitWorkArea=0, modulus=" + this.f + ", pos=" + this.d + ", readPos=" + this.e + "]";
            default:
                return super.toString();
        }
    }

    public C1562g8() {
        this.a = 1;
        this.b = true;
        this.c = 65536;
        this.f = 0;
        this.g = new C2813t2[100];
    }
}
