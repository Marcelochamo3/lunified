package o;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: renamed from: o.pf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2479pf0 extends SpannableStringBuilder {
    public final Class l;
    public final ArrayList m;

    public C2479pf0(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.m = new ArrayList();
        Jp0.h(cls, "watcherClass cannot be null");
        this.l = cls;
    }

    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i >= arrayList.size()) {
                return;
            }
            ((C2382of0) arrayList.get(i)).m.incrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i >= arrayList.size()) {
                return;
            }
            ((C2382of0) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    public final C2382of0 c(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i >= arrayList.size()) {
                return null;
            }
            C2382of0 c2382of0 = (C2382of0) arrayList.get(i);
            if (c2382of0.l == obj) {
                return c2382of0;
            }
            i++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            if (this.l == obj.getClass()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i >= arrayList.size()) {
                return;
            }
            ((C2382of0) arrayList.get(i)).m.decrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        C2382of0 c2382of0C;
        if (d(obj) && (c2382of0C = c(obj)) != null) {
            obj = c2382of0C;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C2382of0 c2382of0C;
        if (d(obj) && (c2382of0C = c(obj)) != null) {
            obj = c2382of0C;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C2382of0 c2382of0C;
        if (d(obj) && (c2382of0C = c(obj)) != null) {
            obj = c2382of0C;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.l != cls) {
            return super.getSpans(i, i2, cls);
        }
        C2382of0[] c2382of0Arr = (C2382of0[]) super.getSpans(i, i2, C2382of0.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, c2382of0Arr.length);
        for (int i3 = 0; i3 < c2382of0Arr.length; i3++) {
            objArr[i3] = c2382of0Arr[i3].l;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        if (cls == null || this.l == cls) {
            cls = C2382of0.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        C2382of0 c2382of0C;
        if (d(obj)) {
            c2382of0C = c(obj);
            if (c2382of0C != null) {
                obj = c2382of0C;
            }
        } else {
            c2382of0C = null;
        }
        super.removeSpan(obj);
        if (c2382of0C != null) {
            this.m.remove(c2382of0C);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (d(obj)) {
            C2382of0 c2382of0 = new C2382of0(obj);
            this.m.add(c2382of0);
            obj = c2382of0;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C2479pf0(this.l, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        a();
        super.replace(i, i2, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public C2479pf0(Class cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.m = new ArrayList();
        Jp0.h(cls, "watcherClass cannot be null");
        this.l = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        a();
        super.replace(i, i2, charSequence, i3, i4);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
