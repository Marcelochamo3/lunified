package o;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* JADX INFO: renamed from: o.Ul, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0814Ul extends C1715hm0 {
    public static final /* synthetic */ int b0 = 0;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;
    public final boolean S;
    public final boolean T;
    public final boolean U;
    public final boolean V;
    public final boolean W;
    public final boolean X;
    public final boolean Y;
    public final SparseArray Z;
    public final SparseBooleanArray a0;

    static {
        new C0788Tl().e();
        int i = Lr0.a;
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(1017, 36);
    }

    public C0814Ul(C0788Tl c0788Tl) {
        super(c0788Tl);
        this.L = c0788Tl.A;
        this.M = c0788Tl.B;
        this.N = c0788Tl.C;
        this.O = c0788Tl.D;
        this.P = c0788Tl.E;
        this.Q = c0788Tl.F;
        this.R = c0788Tl.G;
        this.S = c0788Tl.H;
        this.T = c0788Tl.I;
        this.U = c0788Tl.J;
        this.V = c0788Tl.K;
        this.W = c0788Tl.L;
        this.X = c0788Tl.M;
        this.Y = c0788Tl.N;
        this.Z = c0788Tl.O;
        this.a0 = c0788Tl.P;
    }

    public final C0788Tl a() {
        return new C0788Tl(this);
    }

    @Override // o.C1715hm0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0814Ul.class != obj.getClass()) {
            return false;
        }
        C0814Ul c0814Ul = (C0814Ul) obj;
        if (super.equals(c0814Ul) && this.L == c0814Ul.L && this.M == c0814Ul.M && this.N == c0814Ul.N && this.O == c0814Ul.O && this.P == c0814Ul.P && this.Q == c0814Ul.Q && this.R == c0814Ul.R && this.S == c0814Ul.S && this.T == c0814Ul.T && this.U == c0814Ul.U && this.V == c0814Ul.V && this.W == c0814Ul.W && this.X == c0814Ul.X && this.Y == c0814Ul.Y) {
            SparseBooleanArray sparseBooleanArray = this.a0;
            int size = sparseBooleanArray.size();
            SparseBooleanArray sparseBooleanArray2 = c0814Ul.a0;
            if (sparseBooleanArray2.size() == size) {
                for (int i = 0; i < size; i++) {
                    if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) >= 0) {
                    }
                }
                SparseArray sparseArray = this.Z;
                int size2 = sparseArray.size();
                SparseArray sparseArray2 = c0814Ul.Z;
                if (sparseArray2.size() == size2) {
                    for (int i2 = 0; i2 < size2; i2++) {
                        int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                        if (iIndexOfKey >= 0) {
                            Map map = (Map) sparseArray.valueAt(i2);
                            Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                            if (map2.size() == map.size()) {
                                for (Map.Entry entry : map.entrySet()) {
                                    C1031am0 c1031am0 = (C1031am0) entry.getKey();
                                    if (!map2.containsKey(c1031am0) || !Lr0.a(entry.getValue(), map2.get(c1031am0))) {
                                    }
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o.C1715hm0
    public final int hashCode() {
        return ((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.L ? 1 : 0)) * 31) + (this.M ? 1 : 0)) * 31) + (this.N ? 1 : 0)) * 31) + (this.O ? 1 : 0)) * 31) + (this.P ? 1 : 0)) * 31) + (this.Q ? 1 : 0)) * 31) + (this.R ? 1 : 0)) * 31) + (this.S ? 1 : 0)) * 31) + (this.T ? 1 : 0)) * 31) + (this.U ? 1 : 0)) * 31) + (this.V ? 1 : 0)) * 31) + (this.W ? 1 : 0)) * 31) + (this.X ? 1 : 0)) * 31) + (this.Y ? 1 : 0);
    }
}
