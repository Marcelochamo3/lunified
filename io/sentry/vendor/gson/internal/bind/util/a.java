package io.sentry.vendor.gson.internal.bind.util;

import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final TimeZone a = DesugarTimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    public static void b(StringBuilder sb, int i, int i2) {
        String string = Integer.toString(i);
        for (int length = i2 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0206  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:99:0x0200  */
    /* JADX WARN: Instruction removed from duplicated block: B:101:0x0206, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:96:0x01e7, please report this as an issue */
    public static Date c(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        String message;
        int i;
        int iD;
        int i2;
        int iD2;
        int length;
        char cCharAt;
        try {
            int index = parsePosition.getIndex();
            int i3 = index + 4;
            int iD3 = d(index, str, i3);
            if (a(str, i3, '-')) {
                i3 = index + 5;
            }
            int i4 = i3 + 2;
            int iD4 = d(i3, str, i4);
            if (a(str, i4, '-')) {
                i4 = i3 + 3;
            }
            int i5 = i4 + 2;
            int iD5 = d(i4, str, i5);
            boolean zA = a(str, i5, 'T');
            if (!zA && str.length() <= i5) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iD3, iD4 - 1, iD5);
                parsePosition.setIndex(i5);
                return gregorianCalendar.getTime();
            }
            if (zA) {
                int i6 = i4 + 5;
                int iD6 = d(i4 + 3, str, i6);
                if (a(str, i6, ':')) {
                    i6 = i4 + 6;
                }
                int i7 = i6 + 2;
                int iD7 = d(i6, str, i7);
                if (a(str, i7, ':')) {
                    i7 = i6 + 3;
                }
                if (str.length() <= i7 || (cCharAt = str.charAt(i7)) == 'Z' || cCharAt == '+' || cCharAt == '-') {
                    i2 = iD7;
                    iD = 0;
                    iD2 = 0;
                    i5 = i7;
                    i = iD6;
                } else {
                    int i8 = i7 + 2;
                    iD2 = d(i7, str, i8);
                    if (iD2 > 59 && iD2 < 63) {
                        iD2 = 59;
                    }
                    if (a(str, i8, '.')) {
                        int i9 = i7 + 3;
                        int length2 = i7 + 4;
                        while (true) {
                            if (length2 >= str.length()) {
                                length2 = str.length();
                                break;
                            }
                            char cCharAt2 = str.charAt(length2);
                            if (cCharAt2 < '0' || cCharAt2 > '9') {
                                break;
                                break;
                            }
                            length2++;
                        }
                        int iMin = Math.min(length2, i7 + 6);
                        iD = d(i9, str, iMin);
                        int i10 = iMin - i9;
                        if (i10 == 1) {
                            iD *= 100;
                        } else if (i10 == 2) {
                            iD *= 10;
                        }
                        i = iD6;
                        i5 = length2;
                        i2 = iD7;
                    } else {
                        i = iD6;
                        i5 = i8;
                        i2 = iD7;
                        iD = 0;
                    }
                }
            } else {
                i = 0;
                iD = 0;
                i2 = 0;
                iD2 = 0;
            }
            if (str.length() <= i5) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char cCharAt3 = str.charAt(i5);
            TimeZone timeZone = a;
            if (cCharAt3 == 'Z') {
                length = i5 + 1;
            } else {
                if (cCharAt3 != '+' && cCharAt3 != '-') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt3 + "'");
                }
                String strSubstring = str.substring(i5);
                if (strSubstring.length() < 5) {
                    strSubstring = strSubstring + "00";
                }
                length = i5 + strSubstring.length();
                if (!"+0000".equals(strSubstring) && !"+00:00".equals(strSubstring)) {
                    String str3 = "GMT" + strSubstring;
                    timeZone = DesugarTimeZone.getTimeZone(str3);
                    String id = timeZone.getID();
                    if (!id.equals(str3) && !id.replace(":", "").equals(str3)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone.getID());
                    }
                }
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, iD3);
            gregorianCalendar2.set(2, iD4 - 1);
            gregorianCalendar2.set(5, iD5);
            gregorianCalendar2.set(11, i);
            gregorianCalendar2.set(12, i2);
            gregorianCalendar2.set(13, iD2);
            gregorianCalendar2.set(14, iD);
            parsePosition.setIndex(length);
            return gregorianCalendar2.getTime();
        } catch (IllegalArgumentException e) {
            e = e;
            if (str == null) {
                str2 = null;
            } else {
                str2 = "\"" + str + '\"';
            }
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            if (str == null) {
                str2 = null;
            } else {
                str2 = "\"" + str + '\"';
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException2 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (NumberFormatException e3) {
            e = e3;
            if (str == null) {
                str2 = null;
            } else {
                str2 = "\"" + str + '\"';
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException3 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException3.initCause(e);
            throw parseException3;
        }
    }

    public static int d(int i, String str, int i2) {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int iDigit = Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = -iDigit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int iDigit2 = Character.digit(str.charAt(i4), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = (i3 * 10) - iDigit2;
            i4 = i5;
        }
        return -i3;
    }
}
