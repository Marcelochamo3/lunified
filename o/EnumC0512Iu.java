package o;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o.Iu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class EnumC0512Iu {
    public static final C0330Bu l;
    public static final /* synthetic */ EnumC0512Iu[] m;

    static {
        C0330Bu c0330Bu = new C0330Bu();
        l = c0330Bu;
        m = new EnumC0512Iu[]{c0330Bu, new EnumC0512Iu() { // from class: o.Cu
            @Override // o.EnumC0512Iu
            public final String b(Field field) {
                return EnumC0512Iu.c(field.getName());
            }
        }, new EnumC0512Iu() { // from class: o.Du
            @Override // o.EnumC0512Iu
            public final String b(Field field) {
                return EnumC0512Iu.c(EnumC0512Iu.a(field.getName(), ' '));
            }
        }, new EnumC0512Iu() { // from class: o.Eu
            @Override // o.EnumC0512Iu
            public final String b(Field field) {
                return EnumC0512Iu.a(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        }, new EnumC0512Iu() { // from class: o.Fu
            @Override // o.EnumC0512Iu
            public final String b(Field field) {
                return EnumC0512Iu.a(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        }, new EnumC0512Iu() { // from class: o.Gu
            @Override // o.EnumC0512Iu
            public final String b(Field field) {
                return EnumC0512Iu.a(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        }, new EnumC0512Iu() { // from class: o.Hu
            @Override // o.EnumC0512Iu
            public final String b(Field field) {
                return EnumC0512Iu.a(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public static String a(String str, char c) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static String c(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    public static EnumC0512Iu valueOf(String str) {
        return (EnumC0512Iu) Enum.valueOf(EnumC0512Iu.class, str);
    }

    public static EnumC0512Iu[] values() {
        return (EnumC0512Iu[]) m.clone();
    }

    public abstract String b(Field field);
}
