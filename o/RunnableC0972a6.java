package o;

import androidx.leanback.widget.VerticalGridView;
import androidx.leanback.widget.picker.DatePicker;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import io.sentry.C0032c;
import java.util.ArrayList;

/* JADX INFO: renamed from: o.a6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0972a6 implements Runnable {
    public final /* synthetic */ int l;
    public boolean m;
    public final /* synthetic */ Object n;

    public /* synthetic */ RunnableC0972a6(int i, Object obj, boolean z) {
        this.l = i;
        this.n = obj;
        this.m = z;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x0083  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        Object obj = this.n;
        switch (this.l) {
            case 0:
                this.m = false;
                int i = AspectRatioFrameLayout.f35o;
                ((AspectRatioFrameLayout) obj).getClass();
                break;
            case 1:
                DatePicker datePicker = (DatePicker) obj;
                int[] iArr = {datePicker.F, datePicker.E, datePicker.G};
                boolean z3 = true;
                boolean z4 = true;
                for (int i2 = 2; i2 >= 0; i2--) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        int i4 = DatePicker.N[i2];
                        ArrayList arrayList = datePicker.n;
                        MY my = arrayList == null ? null : (MY) arrayList.get(i3);
                        if (z3) {
                            int i5 = datePicker.J.get(i4);
                            if (i5 != my.b) {
                                my.b = i5;
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            int actualMinimum = datePicker.L.getActualMinimum(i4);
                            if (actualMinimum != my.b) {
                                my.b = actualMinimum;
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z4) {
                            int i6 = datePicker.K.get(i4);
                            if (i6 != my.c) {
                                my.c = i6;
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            int actualMaximum = datePicker.L.getActualMaximum(i4);
                            if (actualMaximum != my.c) {
                                my.c = actualMaximum;
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                        boolean z5 = z | z2;
                        z3 &= datePicker.L.get(i4) == datePicker.J.get(i4);
                        z4 &= datePicker.L.get(i4) == datePicker.K.get(i4);
                        if (z5) {
                            datePicker.a(iArr[i2], my);
                        }
                        int i7 = iArr[i2];
                        int i8 = datePicker.L.get(i4);
                        MY my2 = (MY) datePicker.n.get(i7);
                        if (my2.a != i8) {
                            my2.a = i8;
                            VerticalGridView verticalGridView = (VerticalGridView) datePicker.m.get(i7);
                            if (verticalGridView != null) {
                                int i9 = i8 - ((MY) datePicker.n.get(i7)).b;
                                if (this.m) {
                                    verticalGridView.setSelectedPositionSmooth(i9);
                                } else {
                                    verticalGridView.setSelectedPosition(i9);
                                }
                            }
                        }
                    }
                }
                break;
            case 2:
                C1503fe0 c1503fe0 = (C1503fe0) obj;
                c1503fe0.getClass();
                Kr0.a();
                C0032c c0032c = c1503fe0.a;
                boolean z6 = c0032c.b;
                boolean z7 = this.m;
                c0032c.b = z7;
                if (z6 != z7) {
                    ((InterfaceC2964ug) c0032c.c).a(z7);
                }
                break;
            default:
                ((C1699he0) obj).b.a(this.m);
                break;
        }
    }

    public RunnableC0972a6(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.l = 0;
        this.n = aspectRatioFrameLayout;
    }

    public RunnableC0972a6(DatePicker datePicker) {
        this.l = 1;
        this.n = datePicker;
        this.m = false;
    }
}
