package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class FV implements InterfaceC3403z6, VV {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f260o = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};
    public static final byte[] p = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, C3285xv.h, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    public int l;
    public int m;
    public Object n;

    public /* synthetic */ FV(int i, int i2, Object obj) {
        this.l = i;
        this.m = i2;
        this.n = obj;
    }

    public static void g(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        long j2 = i2;
        AbstractC1459f50.g((j2 >> 8) == 0, "out of range: %s", j2);
        byteBuffer.put((byte) j2);
    }

    @Override // o.InterfaceC3403z6
    public int a() {
        return this.l;
    }

    @Override // o.InterfaceC3403z6
    public int b() {
        return this.m;
    }

    @Override // o.InterfaceC3403z6
    public int c() {
        int i = this.l;
        return i == -1 ? ((C2562qX) this.n).x() : i;
    }

    public void d(int i) {
        int[] iArr = (int[]) this.n;
        int i2 = this.l;
        iArr[i2] = i;
        int i3 = this.m & (i2 + 1);
        this.l = i3;
        if (i3 == 0) {
            int length = iArr.length;
            int i4 = length << 1;
            if (i4 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i4];
            X5.J(0, 0, length, iArr, iArr2);
            X5.J(length, 0, 0, (int[]) this.n, iArr2);
            this.n = iArr2;
            this.l = length;
            this.m = i4 - 1;
        }
    }

    public void e() {
        int i;
        int i2 = this.l;
        if (i2 != 2) {
            if (i2 != 3 && i2 != 1) {
                this.n = null;
                return;
            }
            C2841tM c2841tM = (C2841tM) this.n;
            if (c2841tM == null || c2841tM.j() != Integer.MAX_VALUE) {
                this.n = new C2841tM(Integer.MAX_VALUE);
                return;
            }
            return;
        }
        if (this.m <= 0) {
            throw new IllegalArgumentException();
        }
        C2841tM c2841tM2 = (C2841tM) this.n;
        if (c2841tM2 != null) {
            synchronized (((C2743sL) c2841tM2.g)) {
                i = c2841tM2.b;
            }
            if (i == this.m) {
                return;
            }
        }
        this.n = new C2841tM(this.m);
    }

    public int f(int i) {
        if (i >= 0) {
            int i2 = this.l;
            int i3 = this.m;
            if (i < (i2 & i3)) {
                return ((int[]) this.n)[i & i3];
            }
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    @Override // o.VV
    public Kw0 r(View view, Kw0 kw0) {
        int i = kw0.a.f(7).b;
        int i2 = this.l;
        View view2 = (View) this.n;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.m + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return kw0;
    }

    public FV(Context context, XmlResourceParser xmlResourceParser) {
        this.n = new ArrayList();
        this.m = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), M40.h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.l = typedArrayObtainStyledAttributes.getResourceId(index, this.l);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.m);
                this.m = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C0705Qg().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public FV() {
        this.n = new FV[256];
        this.l = 0;
        this.m = 0;
    }
}
