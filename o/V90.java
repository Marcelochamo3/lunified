package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class V90 extends AbstractC0973a60 {
    public AbstractC1633gu0 a;
    public final ViewPager2 b;
    public final RecyclerView c;
    public final LinearLayoutManager d;
    public int e;
    public int f;
    public final U90 g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    public V90(ViewPager2 viewPager2) {
        this.b = viewPager2;
        C2023ku0 c2023ku0 = viewPager2.u;
        this.c = c2023ku0;
        this.d = (LinearLayoutManager) c2023ku0.getLayoutManager();
        this.g = new U90();
        d();
    }

    @Override // o.AbstractC0973a60
    public final void a(int i, RecyclerView recyclerView) {
        AbstractC1633gu0 abstractC1633gu0;
        AbstractC1633gu0 abstractC1633gu1;
        int i2 = this.e;
        boolean z = true;
        if (!(i2 == 1 && this.f == 1) && i == 1) {
            this.m = false;
            this.e = 1;
            int i3 = this.i;
            if (i3 != -1) {
                this.h = i3;
                this.i = -1;
            } else if (this.h == -1) {
                this.h = this.d.f1();
            }
            c(1);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.k) {
                c(2);
                this.j = true;
                return;
            }
            return;
        }
        if (i2 != 1 && i2 != 4) {
            z = false;
        }
        U90 u90 = this.g;
        if (z && i == 0) {
            e();
            if (!this.k) {
                int i4 = u90.b;
                if (i4 != -1 && (abstractC1633gu1 = this.a) != null) {
                    abstractC1633gu1.b(i4, 0.0f, 0);
                }
            } else if (u90.c == 0) {
                int i5 = this.h;
                int i6 = u90.b;
                if (i5 != i6 && (abstractC1633gu0 = this.a) != null) {
                    abstractC1633gu0.c(i6);
                }
            }
            c(0);
            d();
        }
        if (this.e == 2 && i == 0 && this.l) {
            e();
            if (u90.c == 0) {
                int i7 = this.i;
                int i8 = u90.b;
                if (i7 != i8) {
                    if (i8 == -1) {
                        i8 = 0;
                    }
                    AbstractC1633gu0 abstractC1633gu2 = this.a;
                    if (abstractC1633gu2 != null) {
                        abstractC1633gu2.c(i8);
                    }
                }
                c(0);
                d();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x002c  */
    @Override // o.AbstractC0973a60
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int i3;
        AbstractC1633gu0 abstractC1633gu0;
        this.k = true;
        e();
        boolean z = this.j;
        U90 u90 = this.g;
        if (z) {
            this.j = false;
            if (i2 <= 0) {
                if (i2 == 0) {
                    if ((i < 0) == (this.b.r.I() == 1)) {
                        if (u90.c != 0) {
                            i3 = u90.b + 1;
                        }
                    }
                }
                i3 = u90.b;
            } else if (u90.c != 0) {
                i3 = u90.b + 1;
            } else {
                i3 = u90.b;
            }
            this.i = i3;
            if (this.h != i3 && (abstractC1633gu0 = this.a) != null) {
                abstractC1633gu0.c(i3);
            }
        } else if (this.e == 0) {
            int i4 = u90.b;
            if (i4 == -1) {
                i4 = 0;
            }
            AbstractC1633gu0 abstractC1633gu1 = this.a;
            if (abstractC1633gu1 != null) {
                abstractC1633gu1.c(i4);
            }
        }
        int i5 = u90.b;
        if (i5 == -1) {
            i5 = 0;
        }
        float f = u90.a;
        int i6 = u90.c;
        AbstractC1633gu0 abstractC1633gu2 = this.a;
        if (abstractC1633gu2 != null) {
            abstractC1633gu2.b(i5, f, i6);
        }
        int i7 = u90.b;
        int i8 = this.i;
        if ((i7 == i8 || i8 == -1) && u90.c == 0 && this.f != 1) {
            c(0);
            d();
        }
    }

    public final void c(int i) {
        if ((this.e == 3 && this.f == 0) || this.f == i) {
            return;
        }
        this.f = i;
        AbstractC1633gu0 abstractC1633gu0 = this.a;
        if (abstractC1633gu0 != null) {
            abstractC1633gu0.a(i);
        }
    }

    public final void d() {
        this.e = 0;
        this.f = 0;
        U90 u90 = this.g;
        u90.b = -1;
        u90.a = 0.0f;
        u90.c = 0;
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.k = false;
        this.m = false;
        this.l = false;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0132  */
    /* JADX WARN: Code duplicated, block: B:65:0x013e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0148 A[LOOP:2: B:64:0x013c->B:67:0x0148, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x014b A[SYNTHETIC] */
    public final void e() {
        int top;
        int iX;
        int top2;
        int i;
        int bottom;
        int i2;
        LinearLayoutManager linearLayoutManager = this.d;
        int iF1 = linearLayoutManager.f1();
        U90 u90 = this.g;
        u90.b = iF1;
        if (iF1 == -1) {
            u90.b = -1;
            u90.a = 0.0f;
            u90.c = 0;
            return;
        }
        View viewS = linearLayoutManager.s(iF1);
        if (viewS == null) {
            u90.b = -1;
            u90.a = 0.0f;
            u90.c = 0;
            return;
        }
        int i3 = ((Y50) viewS.getLayoutParams()).b.left;
        int i4 = ((Y50) viewS.getLayoutParams()).b.right;
        int i5 = ((Y50) viewS.getLayoutParams()).b.top;
        int i6 = ((Y50) viewS.getLayoutParams()).b.bottom;
        ViewGroup.LayoutParams layoutParams = viewS.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i3 += marginLayoutParams.leftMargin;
            i4 += marginLayoutParams.rightMargin;
            i5 += marginLayoutParams.topMargin;
            i6 += marginLayoutParams.bottomMargin;
        }
        int height = viewS.getHeight() + i5 + i6;
        int width = viewS.getWidth() + i3 + i4;
        int i7 = linearLayoutManager.p;
        RecyclerView recyclerView = this.c;
        if (i7 == 0) {
            top = (viewS.getLeft() - i3) - recyclerView.getPaddingLeft();
            if (this.b.r.I() == 1) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewS.getTop() - i5) - recyclerView.getPaddingTop();
        }
        int i8 = -top;
        u90.c = i8;
        if (i8 >= 0) {
            u90.a = height != 0 ? i8 / height : 0.0f;
            return;
        }
        int iX2 = linearLayoutManager.x();
        if (iX2 != 0) {
            boolean z = linearLayoutManager.p == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iX2, 2);
            for (int i9 = 0; i9 < iX2; i9++) {
                View viewW = linearLayoutManager.w(i9);
                if (viewW == null) {
                    throw new IllegalStateException("null view contained in the view hierarchy");
                }
                ViewGroup.LayoutParams layoutParams2 = viewW.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : O2.a;
                int[] iArr2 = iArr[i9];
                if (z) {
                    top2 = viewW.getLeft();
                    i = marginLayoutParams2.leftMargin;
                } else {
                    top2 = viewW.getTop();
                    i = marginLayoutParams2.topMargin;
                }
                iArr2[0] = top2 - i;
                int[] iArr3 = iArr[i9];
                if (z) {
                    bottom = viewW.getRight();
                    i2 = marginLayoutParams2.rightMargin;
                } else {
                    bottom = viewW.getBottom();
                    i2 = marginLayoutParams2.bottomMargin;
                }
                iArr3[1] = bottom + i2;
            }
            Arrays.sort(iArr, new N2(0));
            int i10 = 1;
            while (true) {
                if (i10 >= iX2) {
                    int[] iArr4 = iArr[0];
                    int i11 = iArr4[1];
                    int i12 = iArr4[0];
                    int i13 = i11 - i12;
                    if (i12 <= 0 && iArr[iX2 - 1][1] >= i13) {
                        if (linearLayoutManager.x() <= 1) {
                        }
                    }
                } else if (iArr[i10 - 1][1] == iArr[i10][0]) {
                    i10++;
                }
                iX = linearLayoutManager.x();
                for (int i14 = 0; i14 < iX; i14++) {
                    if (!O2.a(linearLayoutManager.w(i14))) {
                        throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                    }
                }
            }
        } else if (linearLayoutManager.x() <= 1) {
            iX = linearLayoutManager.x();
            while (i14 < iX) {
                if (!O2.a(linearLayoutManager.w(i14))) {
                    throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                }
            }
        }
        Locale locale = Locale.US;
        throw new IllegalStateException(AbstractC1674hK.n(u90.c, "Page can only be offset by a positive amount, not by "));
    }
}
