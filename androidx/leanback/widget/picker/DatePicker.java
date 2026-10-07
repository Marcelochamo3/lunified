package androidx.leanback.widget.picker;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import o.AbstractC3021v9;
import o.C2994uv;
import o.It0;
import o.LY;
import o.MY;
import o.Q40;
import o.RunnableC0972a6;

/* JADX INFO: loaded from: classes.dex */
public class DatePicker extends LY {
    public static final int[] N = {5, 2, 1};
    public String A;
    public MY B;
    public MY C;
    public MY D;
    public int E;
    public int F;
    public int G;
    public final SimpleDateFormat H;
    public final C2994uv I;
    public final Calendar J;
    public final Calendar K;
    public final Calendar L;
    public final Calendar M;

    public DatePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy", Locale.getDefault());
        this.H = simpleDateFormat;
        Locale locale = Locale.getDefault();
        getContext().getResources();
        this.I = new C2994uv(locale);
        this.M = AbstractC3021v9.k(this.M, locale);
        this.J = AbstractC3021v9.k(this.J, (Locale) this.I.m);
        this.K = AbstractC3021v9.k(this.K, (Locale) this.I.m);
        this.L = AbstractC3021v9.k(this.L, (Locale) this.I.m);
        MY my = this.B;
        if (my != null) {
            my.d = (String[]) this.I.n;
            a(this.E, my);
        }
        int[] iArr = Q40.d;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        It0.o(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        try {
            String string = typedArrayObtainStyledAttributes.getString(0);
            String string2 = typedArrayObtainStyledAttributes.getString(1);
            String string3 = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            this.M.clear();
            if (TextUtils.isEmpty(string)) {
                this.M.set(1900, 0, 1);
            } else {
                try {
                    this.M.setTime(simpleDateFormat.parse(string));
                } catch (ParseException unused) {
                    this.M.set(1900, 0, 1);
                }
            }
            this.J.setTimeInMillis(this.M.getTimeInMillis());
            this.M.clear();
            if (TextUtils.isEmpty(string2)) {
                this.M.set(2100, 0, 1);
            } else {
                try {
                    this.M.setTime(this.H.parse(string2));
                } catch (ParseException unused2) {
                    this.M.set(2100, 0, 1);
                }
            }
            this.K.setTimeInMillis(this.M.getTimeInMillis());
            setDatePickerFormat(TextUtils.isEmpty(string3) ? new String(DateFormat.getDateFormatOrder(context)) : string3);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void g(int i, int i2, int i3) {
        if (this.L.get(1) == i && this.L.get(2) == i3 && this.L.get(5) == i2) {
            return;
        }
        this.L.set(i, i2, i3);
        if (this.L.before(this.J)) {
            this.L.setTimeInMillis(this.J.getTimeInMillis());
        } else if (this.L.after(this.K)) {
            this.L.setTimeInMillis(this.K.getTimeInMillis());
        }
        post(new RunnableC0972a6(this));
    }

    public long getDate() {
        return this.L.getTimeInMillis();
    }

    public String getDatePickerFormat() {
        return this.A;
    }

    public long getMaxDate() {
        return this.K.getTimeInMillis();
    }

    public long getMinDate() {
        return this.J.getTimeInMillis();
    }

    public void setDate(long j) {
        this.M.setTimeInMillis(j);
        g(this.M.get(1), this.M.get(2), this.M.get(5));
    }

    public void setDatePickerFormat(String str) {
        int i = 6;
        C2994uv c2994uv = this.I;
        String str2 = TextUtils.isEmpty(str) ? new String(DateFormat.getDateFormatOrder(getContext())) : str;
        if (TextUtils.equals(this.A, str2)) {
            return;
        }
        this.A = str2;
        String bestDateTimePattern = DateFormat.getBestDateTimePattern((Locale) c2994uv.m, str2);
        if (TextUtils.isEmpty(bestDateTimePattern)) {
            bestDateTimePattern = "MM/dd/yyyy";
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        char[] cArr = {'Y', 'y', 'M', 'm', 'D', 'd'};
        int i2 = 0;
        boolean z = false;
        char c = 0;
        while (i2 < bestDateTimePattern.length()) {
            char cCharAt = bestDateTimePattern.charAt(i2);
            if (cCharAt != ' ') {
                if (cCharAt != '\'') {
                    if (!z) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= i) {
                                sb.append(cCharAt);
                                break;
                            }
                            if (cCharAt == cArr[i3]) {
                                if (cCharAt == c) {
                                    break;
                                }
                                arrayList.add(sb.toString());
                                sb.setLength(0);
                                break;
                            }
                            i3++;
                            i = 6;
                        }
                    } else {
                        sb.append(cCharAt);
                    }
                    c = cCharAt;
                } else if (z) {
                    z = false;
                } else {
                    sb.setLength(0);
                    z = true;
                }
            }
            i2++;
            i = 6;
        }
        arrayList.add(sb.toString());
        if (arrayList.size() != str2.length() + 1) {
            throw new IllegalStateException("Separators size: " + arrayList.size() + " must equal the size of datePickerFormat: " + str2.length() + " + 1");
        }
        setSeparators(arrayList);
        this.C = null;
        this.B = null;
        this.D = null;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        String upperCase = str2.toUpperCase((Locale) c2994uv.m);
        ArrayList arrayList2 = new ArrayList(3);
        for (int i4 = 0; i4 < upperCase.length(); i4++) {
            char cCharAt2 = upperCase.charAt(i4);
            if (cCharAt2 == 'D') {
                if (this.C != null) {
                    throw new IllegalArgumentException("datePicker format error");
                }
                MY my = new MY();
                this.C = my;
                arrayList2.add(my);
                this.C.e = "%02d";
                this.F = i4;
            } else if (cCharAt2 != 'M') {
                if (cCharAt2 != 'Y') {
                    throw new IllegalArgumentException("datePicker format error");
                }
                if (this.D != null) {
                    throw new IllegalArgumentException("datePicker format error");
                }
                MY my2 = new MY();
                this.D = my2;
                arrayList2.add(my2);
                this.G = i4;
                this.D.e = "%d";
            } else {
                if (this.B != null) {
                    throw new IllegalArgumentException("datePicker format error");
                }
                MY my3 = new MY();
                this.B = my3;
                arrayList2.add(my3);
                this.B.d = (String[]) c2994uv.n;
                this.E = i4;
            }
        }
        setColumns(arrayList2);
        post(new RunnableC0972a6(this));
    }

    public void setMaxDate(long j) {
        this.M.setTimeInMillis(j);
        if (this.M.get(1) != this.K.get(1) || this.M.get(6) == this.K.get(6)) {
            this.K.setTimeInMillis(j);
            if (this.L.after(this.K)) {
                this.L.setTimeInMillis(this.K.getTimeInMillis());
            }
            post(new RunnableC0972a6(this));
        }
    }

    public void setMinDate(long j) {
        this.M.setTimeInMillis(j);
        if (this.M.get(1) != this.J.get(1) || this.M.get(6) == this.J.get(6)) {
            this.J.setTimeInMillis(j);
            if (this.L.before(this.J)) {
                this.L.setTimeInMillis(this.J.getTimeInMillis());
            }
            post(new RunnableC0972a6(this));
        }
    }
}
