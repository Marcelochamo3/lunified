package o;

import android.graphics.Color;

/* JADX INFO: loaded from: classes.dex */
public final class Xf0 {
    public final String a;
    public final int b;
    public final Integer c;
    public final Integer d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;

    public Xf0(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.a = str;
        this.b = i;
        this.c = num;
        this.d = num2;
        this.e = f;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = i2;
    }

    public static int a(String str) {
        try {
            int i = Integer.parseInt(str.trim());
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return i;
                default:
                    AP.z();
                    return -1;
            }
        } catch (NumberFormatException unused) {
        }
    }

    public static boolean b(String str) {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            AP.A("Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            AbstractC0397Ej.c(j <= 4294967295L);
            return Integer.valueOf(Color.argb(Pu0.d(((j >> 24) & 255) ^ 255), Pu0.d(j & 255), Pu0.d((j >> 8) & 255), Pu0.d((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            AP.A("Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }
}
