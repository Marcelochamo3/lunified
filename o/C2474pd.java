package o;

import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.skidush.clonex.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.pd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2474pd extends C3003v0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Rect f975o = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final C0622Nb p = new C0622Nb(17);
    public static final C0519Jb q = new C0519Jb(18);
    public final AccessibilityManager h;
    public final View i;
    public C2116ls j;
    public final /* synthetic */ Chip n;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;

    public C2474pd(Chip chip, Chip chip2) {
        this.n = chip;
        if (chip2 == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.i = chip2;
        this.h = (AccessibilityManager) chip2.getContext().getSystemService("accessibility");
        chip2.setFocusable(true);
        WeakHashMap weakHashMap = It0.a;
        if (chip2.getImportantForAccessibility() == 0) {
            chip2.setImportantForAccessibility(1);
        }
    }

    @Override // o.C3003v0
    public final L0 b(View view) {
        if (this.j == null) {
            this.j = new C2116ls(this);
        }
        return this.j;
    }

    @Override // o.C3003v0
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    @Override // o.C3003v0
    public final void d(View view, N0 n0) {
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = n0.a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = this.n;
        accessibilityNodeInfo.setCheckable(chip.d());
        accessibilityNodeInfo.setClickable(chip.isClickable());
        n0.i(chip.getAccessibilityClassName());
        CharSequence text = chip.getText();
        if (Build.VERSION.SDK_INT >= 23) {
            n0.n(text);
        } else {
            accessibilityNodeInfo.setContentDescription(text);
        }
    }

    public final boolean j(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        if (i == 1) {
            Chip chip = this.n;
            chip.x = false;
            chip.refreshDrawableState();
        }
        q(i, 8);
        return true;
    }

    public final N0 k(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        N0 n0 = new N0(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        n0.i("android.view.View");
        Rect rect = f975o;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        n0.b = -1;
        View view = this.i;
        accessibilityNodeInfoObtain.setParent(view);
        o(i, n0);
        if (n0.g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.e;
        n0.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(view.getContext().getPackageName());
        n0.c = i;
        accessibilityNodeInfoObtain.setSource(view, i);
        if (this.k == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            n0.a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            n0.a(64);
        }
        boolean z = this.l == i;
        if (z) {
            n0.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            n0.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z);
        int[] iArr = this.g;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            n0.f(rect3);
            if (n0.b != -1) {
                N0 n1 = new N0(AccessibilityNodeInfo.obtain());
                for (int i2 = n0.b; i2 != -1; i2 = n1.b) {
                    n1.b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = n1.a;
                    accessibilityNodeInfo.setParent(view, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    o(i2, n1);
                    n1.f(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                n0.a.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (parent instanceof View) {
                        View view2 = (View) parent;
                        if (view2.getAlpha() > 0.0f && view2.getVisibility() == 0) {
                            parent = view2.getParent();
                        }
                    }
                    if (parent != null) {
                        accessibilityNodeInfoObtain.setVisibleToUser(true);
                    }
                }
            }
        }
        return n0;
    }

    public final void l(ArrayList arrayList) {
        boolean z = false;
        arrayList.add(0);
        Rect rect = Chip.H;
        Chip chip = this.n;
        if (chip.c()) {
            C2667rd c2667rd = chip.p;
            if (c2667rd != null && c2667rd.V) {
                z = true;
            }
            if (!z || chip.s == null) {
                return;
            }
            arrayList.add(1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:51:0x0106  */
    /* JADX WARN: Code duplicated, block: B:54:0x010f  */
    /* JADX WARN: Code duplicated, block: B:57:0x011c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0131  */
    /* JADX WARN: Code duplicated, block: B:68:0x0152  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a9  */
    public final boolean m(int i, Rect rect) {
        Object obj;
        N0 n0;
        int i2;
        Rect rect2;
        int iH;
        Rect rect3;
        int i3;
        N0 n1;
        int i4;
        int iR;
        int iS;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        C2866tf0 c2866tf0 = new C2866tf0(0);
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            c2866tf0.g(((Integer) arrayList.get(i5)).intValue(), k(((Integer) arrayList.get(i5)).intValue()));
        }
        int i6 = this.l;
        int iE = Integer.MIN_VALUE;
        N0 n2 = i6 == Integer.MIN_VALUE ? null : (N0) c2866tf0.d(i6);
        C0622Nb c0622Nb = p;
        C0519Jb c0519Jb = q;
        View view = this.i;
        if (i == 1 || i == 2) {
            WeakHashMap weakHashMap = It0.a;
            boolean z = view.getLayoutDirection() == 1;
            c0519Jb.getClass();
            int iH2 = c2866tf0.h();
            ArrayList arrayList2 = new ArrayList(iH2);
            for (int i7 = 0; i7 < iH2; i7++) {
                arrayList2.add((N0) c2866tf0.j(i7));
            }
            Collections.sort(arrayList2, new C2996uw(z, c0622Nb));
            if (i == 1) {
                int size = arrayList2.size();
                if (n2 != null) {
                    size = arrayList2.indexOf(n2);
                }
                int i8 = size - 1;
                if (i8 >= 0) {
                    obj = arrayList2.get(i8);
                } else {
                    obj = null;
                }
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (n2 == null ? -1 : arrayList2.lastIndexOf(n2)) + 1;
                if (iLastIndexOf < size2) {
                    obj = arrayList2.get(iLastIndexOf);
                } else {
                    obj = null;
                }
            }
            n0 = (N0) obj;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect4 = new Rect();
            int i9 = this.l;
            if (i9 != Integer.MIN_VALUE) {
                n(i9).f(rect4);
            } else if (rect != null) {
                rect4.set(rect);
            } else {
                int width = view.getWidth();
                int height = view.getHeight();
                if (i == 17) {
                    rect4.set(width, 0, width, height);
                } else if (i == 33) {
                    rect4.set(0, height, width, height);
                } else if (i == 66) {
                    rect4.set(-1, 0, -1, height);
                } else {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    rect4.set(0, -1, width, -1);
                }
                rect2 = new Rect(rect4);
                if (i != 17) {
                    rect2.offset(rect4.width() + 1, 0);
                } else if (i != 33) {
                    rect2.offset(0, rect4.height() + 1);
                } else if (i != 66) {
                    rect2.offset(-(rect4.width() + 1), 0);
                } else {
                    if (i == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    rect2.offset(0, -(rect4.height() + 1));
                }
                c0519Jb.getClass();
                iH = c2866tf0.h();
                rect3 = new Rect();
                n0 = null;
                for (i3 = 0; i3 < iH; i3++) {
                    n1 = (N0) c2866tf0.j(i3);
                    if (n1 == n2) {
                        c0622Nb.getClass();
                        n1.f(rect3);
                        if (AbstractC1923jt0.q(i, rect4, rect3)) {
                            if (AbstractC1923jt0.q(i, rect4, rect2) || AbstractC1923jt0.c(i, rect4, rect3, rect2)) {
                                rect2.set(rect3);
                                n0 = n1;
                            } else if (AbstractC1923jt0.c(i, rect4, rect2, rect3)) {
                                int iR2 = AbstractC1923jt0.r(i, rect4, rect3);
                                int iS2 = AbstractC1923jt0.s(i, rect4, rect3);
                                i4 = (iS2 * iS2) + (iR2 * 13 * iR2);
                                iR = AbstractC1923jt0.r(i, rect4, rect2);
                                iS = AbstractC1923jt0.s(i, rect4, rect2);
                                if (i4 < (iS * iS) + (iR * 13 * iR)) {
                                    rect2.set(rect3);
                                    n0 = n1;
                                }
                            }
                        }
                    }
                }
            }
            rect2 = new Rect(rect4);
            if (i != 17) {
                rect2.offset(rect4.width() + 1, 0);
            } else if (i != 33) {
                rect2.offset(0, rect4.height() + 1);
            } else if (i != 66) {
                rect2.offset(-(rect4.width() + 1), 0);
            } else {
                if (i == 130) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                rect2.offset(0, -(rect4.height() + 1));
            }
            c0519Jb.getClass();
            iH = c2866tf0.h();
            rect3 = new Rect();
            n0 = null;
            while (i3 < iH) {
                n1 = (N0) c2866tf0.j(i3);
                if (n1 == n2) {
                    c0622Nb.getClass();
                    n1.f(rect3);
                    if (AbstractC1923jt0.q(i, rect4, rect3)) {
                        if (AbstractC1923jt0.q(i, rect4, rect2)) {
                            rect2.set(rect3);
                            n0 = n1;
                        } else if (AbstractC1923jt0.c(i, rect4, rect2, rect3)) {
                            int iR3 = AbstractC1923jt0.r(i, rect4, rect3);
                            int iS3 = AbstractC1923jt0.s(i, rect4, rect3);
                            i4 = (iS3 * iS3) + (iR3 * 13 * iR3);
                            iR = AbstractC1923jt0.r(i, rect4, rect2);
                            iS = AbstractC1923jt0.s(i, rect4, rect2);
                            if (i4 < (iS * iS) + (iR * 13 * iR)) {
                                rect2.set(rect3);
                                n0 = n1;
                            }
                        }
                    }
                }
            }
        }
        N0 n3 = n0;
        if (n3 != null) {
            if (c2866tf0.l) {
                Nr0.b(c2866tf0);
            }
            int i10 = c2866tf0.f1044o;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    i2 = -1;
                    break;
                }
                if (c2866tf0.n[i11] == n3) {
                    i2 = i11;
                    break;
                }
                i11++;
            }
            iE = c2866tf0.e(i2);
        }
        return p(iE);
    }

    public final N0 n(int i) {
        if (i != -1) {
            return k(i);
        }
        View view = this.i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
        N0 n0 = new N0(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = It0.a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            n0.a.addChild(view, ((Integer) arrayList.get(i2)).intValue());
        }
        return n0;
    }

    public final void o(int i, N0 n0) {
        AccessibilityNodeInfo accessibilityNodeInfo = n0.a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.H);
            return;
        }
        Chip chip = this.n;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        n0.b(F0.e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }

    public final boolean p(int i) {
        int i2;
        View view = this.i;
        if ((!view.isFocused() && !view.requestFocus()) || (i2 = this.l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.l = i;
        if (i == 1) {
            Chip chip = this.n;
            chip.x = true;
            chip.refreshDrawableState();
        }
        q(i, 8);
        return true;
    }

    public final void q(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            N0 n0N = n(i);
            accessibilityEventObtain.getText().add(n0N.g());
            AccessibilityNodeInfo accessibilityNodeInfo = n0N.a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            accessibilityEventObtain.setSource(view, i);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}
