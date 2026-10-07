package o;

import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes.dex */
public final class D8 {
    public static final String d;
    public static final String e;
    public static final D8 f;
    public static final D8 g;
    public final boolean a;
    public final int b;
    public final C2149m9 c;

    static {
        C2149m9 c2149m9 = Gi0.c;
        d = Character.toString((char) 8206);
        e = Character.toString((char) 8207);
        f = new D8(false, 2, c2149m9);
        g = new D8(true, 2, c2149m9);
    }

    public D8(boolean z, int i, C2149m9 c2149m9) {
        this.a = z;
        this.b = i;
        this.c = c2149m9;
    }

    public static int a(CharSequence charSequence) {
        byte directionality;
        C8 c8 = new C8(charSequence);
        c8.c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = c8.c;
            if (i4 < c8.b && i == 0) {
                CharSequence charSequence2 = c8.a;
                char cCharAt = charSequence2.charAt(i4);
                c8.d = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence2, c8.c);
                    c8.c = Character.charCount(iCodePointAt) + c8.c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    c8.c++;
                    char c = c8.d;
                    directionality = c < 1792 ? C8.e[c] : Character.getDirectionality(c);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
        }
        if (i == 0) {
            return 0;
        }
        if (i2 != 0) {
            return i2;
        }
        while (c8.c > 0) {
            switch (c8.a()) {
                case 14:
                case 15:
                    if (i == i3) {
                        return -1;
                    }
                    i3--;
                    break;
                case 16:
                case 17:
                    if (i == i3) {
                        return 1;
                    }
                    i3--;
                    break;
                case 18:
                    i3++;
                    break;
                default:
                    break;
            }
        }
        return 0;
    }

    public static int b(CharSequence charSequence) {
        C8 c8 = new C8(charSequence);
        c8.c = c8.b;
        int i = 0;
        int i2 = 0;
        while (c8.c > 0) {
            byte bA = c8.a();
            if (bA == 0) {
                if (i == 0) {
                    return -1;
                }
                if (i2 == 0) {
                    i2 = i;
                }
            } else if (bA == 1 || bA == 2) {
                if (i == 0) {
                    return 1;
                }
                if (i2 == 0) {
                    i2 = i;
                }
            } else if (bA != 9) {
                switch (bA) {
                    case 14:
                    case 15:
                        if (i2 == i) {
                            return -1;
                        }
                        i--;
                        break;
                    case 16:
                    case 17:
                        if (i2 == i) {
                            return 1;
                        }
                        i--;
                        break;
                    case 18:
                        i++;
                        break;
                    default:
                        if (i2 == 0) {
                            i2 = i;
                        }
                        break;
                }
            } else {
                continue;
            }
        }
        return 0;
    }

    public final SpannableStringBuilder c(CharSequence charSequence, C2149m9 c2149m9) {
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean zD = c2149m9.d(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = this.b & 2;
        String str2 = "";
        String str3 = e;
        String str4 = d;
        boolean z = this.a;
        if (i != 0) {
            boolean zD2 = (zD ? Gi0.b : Gi0.a).d(charSequence, charSequence.length());
            if (z || !(zD2 || a(charSequence) == 1)) {
                str = (!z || (zD2 && a(charSequence) != -1)) ? "" : str3;
            } else {
                str = str4;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (zD != z) {
            spannableStringBuilder.append(zD ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zD3 = (zD ? Gi0.b : Gi0.a).d(charSequence, charSequence.length());
        if (!z && (zD3 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z && (!zD3 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
