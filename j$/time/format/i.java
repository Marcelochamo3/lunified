package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
final class i implements InterfaceC0131f {
    public final /* synthetic */ int a;
    private final Object b;

    public /* synthetic */ i(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private static void a(StringBuilder sb, int i) {
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    static int b(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if (cCharAt < '0' || cCharAt > '9') {
            return -1;
        }
        return cCharAt - '0';
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005c  */
    @Override // j$.time.format.InterfaceC0131f
    public final boolean p(y yVar, StringBuilder sb) {
        switch (this.a) {
            case 0:
                Long lE = yVar.e(j$.time.temporal.a.OFFSET_SECONDS);
                if (lE == null) {
                    return false;
                }
                sb.append("GMT");
                int iE = j$.com.android.tools.r8.a.e(lE.longValue());
                if (iE != 0) {
                    int iAbs = Math.abs((iE / 3600) % 100);
                    int iAbs2 = Math.abs((iE / 60) % 60);
                    int iAbs3 = Math.abs(iE % 60);
                    sb.append(iE < 0 ? "-" : "+");
                    if (((G) this.b) == G.FULL) {
                        a(sb, iAbs);
                        sb.append(':');
                        a(sb, iAbs2);
                        if (iAbs3 != 0) {
                            sb.append(':');
                            a(sb, iAbs3);
                        }
                    } else {
                        if (iAbs >= 10) {
                            sb.append((char) ((iAbs / 10) + 48));
                        }
                        sb.append((char) ((iAbs % 10) + 48));
                        if (iAbs2 != 0 || iAbs3 != 0) {
                            sb.append(':');
                            a(sb, iAbs2);
                            if (iAbs3 != 0) {
                                sb.append(':');
                                a(sb, iAbs3);
                            }
                        }
                    }
                }
                return true;
            default:
                sb.append((String) this.b);
                return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0121 A[PHI: r2 r7
  0x0121: PHI (r2v5 int) = (r2v4 int), (r2v7 int), (r2v7 int), (r2v7 int), (r2v7 int), (r2v7 int), (r2v7 int) binds: [B:50:0x00cb, B:55:0x00db, B:57:0x00e1, B:58:0x00e3, B:60:0x00e9, B:62:0x00f5, B:63:0x00f7] A[DONT_GENERATE, DONT_INLINE]
  0x0121: PHI (r7v1 int) = (r7v0 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:50:0x00cb, B:55:0x00db, B:57:0x00e1, B:58:0x00e3, B:60:0x00e9, B:62:0x00f5, B:63:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // j$.time.format.InterfaceC0131f
    public final int r(w wVar, CharSequence charSequence, int i) {
        int i2;
        int iB;
        int i3;
        int i4;
        int i5;
        int i6;
        switch (this.a) {
            case 0:
                int length = charSequence.length();
                if (wVar.s(charSequence, i, "GMT", 0, 3)) {
                    int i7 = i + 3;
                    if (i7 != length) {
                        char cCharAt = charSequence.charAt(i7);
                        if (cCharAt != '+') {
                            i2 = cCharAt == '-' ? -1 : 1;
                        }
                        int i8 = i + 4;
                        int i9 = 0;
                        if (((G) this.b) == G.FULL) {
                            int iB2 = b(charSequence, i8);
                            int i10 = i + 6;
                            int iB3 = b(charSequence, i + 5);
                            if (iB2 >= 0 && iB3 >= 0) {
                                int i11 = i + 7;
                                if (charSequence.charAt(i10) == ':') {
                                    iB = (iB2 * 10) + iB3;
                                    int iB4 = b(charSequence, i11);
                                    i6 = i + 9;
                                    int iB5 = b(charSequence, i + 8);
                                    if (iB4 >= 0 && iB5 >= 0) {
                                        i5 = (iB4 * 10) + iB5;
                                        int i12 = i + 11;
                                        if (i12 < length && charSequence.charAt(i6) == ':') {
                                            int iB6 = b(charSequence, i + 10);
                                            int iB7 = b(charSequence, i12);
                                            if (iB6 >= 0 && iB7 >= 0) {
                                                i9 = (iB6 * 10) + iB7;
                                                i6 = i + 12;
                                            }
                                        }
                                        i4 = i9;
                                        i3 = i6;
                                        i9 = i5;
                                    }
                                }
                            }
                        } else {
                            int i13 = i + 5;
                            iB = b(charSequence, i8);
                            if (iB >= 0) {
                                if (i13 >= length) {
                                    i3 = i13;
                                } else {
                                    int iB8 = b(charSequence, i13);
                                    if (iB8 >= 0) {
                                        iB = (iB * 10) + iB8;
                                        i13 = i + 6;
                                    }
                                    int i14 = i13 + 2;
                                    if (i14 >= length || charSequence.charAt(i13) != ':' || i14 >= length || charSequence.charAt(i13) != ':') {
                                        i3 = i13;
                                    } else {
                                        int iB9 = b(charSequence, i13 + 1);
                                        int iB10 = b(charSequence, i14);
                                        if (iB9 < 0 || iB10 < 0) {
                                            i3 = i13;
                                        } else {
                                            i5 = (iB9 * 10) + iB10;
                                            int i15 = i13 + 3;
                                            int i16 = i13 + 5;
                                            if (i16 < length && charSequence.charAt(i15) == ':') {
                                                int iB11 = b(charSequence, i13 + 4);
                                                int iB12 = b(charSequence, i16);
                                                if (iB11 >= 0 && iB12 >= 0) {
                                                    i9 = (iB11 * 10) + iB12;
                                                    i6 = i13 + 6;
                                                    i4 = i9;
                                                    i3 = i6;
                                                    i9 = i5;
                                                }
                                            }
                                            i3 = i15;
                                            i9 = i5;
                                        }
                                    }
                                }
                                i4 = 0;
                            }
                        }
                        return wVar.o(j$.time.temporal.a.OFFSET_SECONDS, ((((long) i9) * 60) + (((long) iB) * 3600) + ((long) i4)) * ((long) i2), i, i3);
                    }
                    return wVar.o(j$.time.temporal.a.OFFSET_SECONDS, 0L, i, i7);
                }
                return ~i;
            default:
                if (i > charSequence.length() || i < 0) {
                    throw new IndexOutOfBoundsException();
                }
                String str = (String) this.b;
                return !wVar.s(charSequence, i, str, 0, str.length()) ? ~i : str.length() + i;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "LocalizedOffset(" + ((G) this.b) + ")";
            default:
                return "'" + ((String) this.b).replace("'", "''") + "'";
        }
    }
}
