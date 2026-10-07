package o;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: o.ye0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3349ye0 {
    public static final C2147m8 h = new C2147m8(13);
    public static final C2147m8 i = new C2147m8(14);
    public final int a;
    public int e;
    public int f;
    public int g;
    public final C3252xe0[] c = new C3252xe0[5];
    public final ArrayList b = new ArrayList();
    public int d = -1;

    public C3349ye0(int i2) {
        this.a = i2;
    }

    public final void a(int i2, float f) {
        C3252xe0 c3252xe0;
        int i3 = this.d;
        ArrayList arrayList = this.b;
        if (i3 != 1) {
            Collections.sort(arrayList, h);
            this.d = 1;
        }
        int i4 = this.g;
        C3252xe0[] c3252xe0Arr = this.c;
        if (i4 > 0) {
            int i5 = i4 - 1;
            this.g = i5;
            c3252xe0 = c3252xe0Arr[i5];
        } else {
            c3252xe0 = new C3252xe0();
        }
        int i6 = this.e;
        this.e = i6 + 1;
        c3252xe0.a = i6;
        c3252xe0.b = i2;
        c3252xe0.c = f;
        arrayList.add(c3252xe0);
        this.f += i2;
        while (true) {
            int i7 = this.f;
            int i8 = this.a;
            if (i7 <= i8) {
                return;
            }
            int i9 = i7 - i8;
            C3252xe0 c3252xe1 = (C3252xe0) arrayList.get(0);
            int i10 = c3252xe1.b;
            if (i10 <= i9) {
                this.f -= i10;
                arrayList.remove(0);
                int i11 = this.g;
                if (i11 < 5) {
                    this.g = i11 + 1;
                    c3252xe0Arr[i11] = c3252xe1;
                }
            } else {
                c3252xe1.b = i10 - i9;
                this.f -= i9;
            }
        }
    }

    public final float b() {
        int i2 = this.d;
        ArrayList arrayList = this.b;
        if (i2 != 0) {
            Collections.sort(arrayList, i);
            this.d = 0;
        }
        float f = 0.5f * this.f;
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            C3252xe0 c3252xe0 = (C3252xe0) arrayList.get(i4);
            i3 += c3252xe0.b;
            if (i3 >= f) {
                return c3252xe0.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((C3252xe0) AbstractC1701hf0.c(1, arrayList)).c;
    }
}
