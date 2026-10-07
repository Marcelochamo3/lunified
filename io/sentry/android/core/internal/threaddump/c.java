package io.sentry.android.core.internal.threaddump;

import io.sentry.C0072p0;
import io.sentry.C0097v1;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.protocol.x;
import io.sentry.protocol.y;
import io.sentry.protocol.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.AbstractC1701hf0;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final Pattern d = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");
    public static final Pattern e = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");
    public static final Pattern f = Pattern.compile(" *(?:native: )?#\\d+ \\S+ [0-9a-fA-F]+\\s+(.*?)\\s+\\((.*)\\+(\\d+)\\)(?: \\(.*\\))?");
    public static final Pattern g = Pattern.compile(" *(?:native: )?#\\d+ \\S+ [0-9a-fA-F]+\\s+(.*)\\s*\\(?(.*)\\)?(?: \\(.*\\))?");
    public static final Pattern h = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");
    public static final Pattern i = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");
    public static final Pattern j = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern k = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern l = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern m = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern n = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f79o = Pattern.compile(" *- waiting to lock an unknown object");
    public static final Pattern p = Pattern.compile("\\s+");
    public final I1 a;
    public final boolean b;
    public final C0072p0 c;

    public c(SentryAndroidOptions sentryAndroidOptions, boolean z) {
        this.a = sentryAndroidOptions;
        this.b = z;
        this.c = new C0072p0(sentryAndroidOptions);
    }

    public static void a(z zVar, C0097v1 c0097v1) {
        Map map = zVar.u;
        if (map == null) {
            map = new HashMap();
        }
        C0097v1 c0097v2 = (C0097v1) map.get(c0097v1.m);
        if (c0097v2 != null) {
            c0097v2.l = Math.max(c0097v2.l, c0097v1.l);
        } else {
            String str = c0097v1.m;
            C0097v1 c0097v3 = new C0097v1();
            c0097v3.l = c0097v1.l;
            c0097v3.m = str;
            c0097v3.n = c0097v1.n;
            c0097v3.f151o = c0097v1.f151o;
            c0097v3.p = c0097v1.p;
            c0097v3.q = io.sentry.config.a.z(c0097v1.q);
            map.put(str, c0097v3);
        }
        zVar.u = map;
    }

    public static Long b(Matcher matcher, int i2) {
        String strGroup = matcher.group(i2);
        if (strGroup == null || strGroup.length() == 0) {
            return null;
        }
        return Long.valueOf(Long.parseLong(strGroup));
    }

    public static boolean c(Matcher matcher, String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:102:0x02e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:104:0x0308  */
    /* JADX WARN: Code duplicated, block: B:106:0x0312 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0314  */
    /* JADX WARN: Code duplicated, block: B:109:0x0340  */
    /* JADX WARN: Code duplicated, block: B:111:0x0348 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x034a  */
    /* JADX WARN: Code duplicated, block: B:113:0x036f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0373  */
    /* JADX WARN: Code duplicated, block: B:116:0x037f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0381  */
    /* JADX WARN: Code duplicated, block: B:119:0x0390  */
    /* JADX WARN: Code duplicated, block: B:121:0x0396  */
    /* JADX WARN: Code duplicated, block: B:138:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x03ad A[EDGE_INSN: B:139:0x03ad->B:125:0x03ad BREAK  A[LOOP:1: B:54:0x017e->B:124:0x039f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x03ad A[EDGE_INSN: B:140:0x03ad->B:125:0x03ad BREAK  A[LOOP:1: B:54:0x017e->B:124:0x039f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x039f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0102  */
    /* JADX WARN: Code duplicated, block: B:51:0x011c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0182  */
    /* JADX WARN: Code duplicated, block: B:59:0x0196  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x01df  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:75:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:77:0x0208  */
    /* JADX WARN: Code duplicated, block: B:87:0x0249  */
    /* JADX WARN: Code duplicated, block: B:89:0x0258  */
    /* JADX WARN: Code duplicated, block: B:91:0x025f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0286  */
    /* JADX WARN: Code duplicated, block: B:94:0x028c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x028e  */
    /* JADX WARN: Code duplicated, block: B:96:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:98:0x02b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x02b9  */
    public final ArrayList d(b bVar) {
        Pattern pattern;
        String str;
        ArrayList arrayList;
        Matcher matcher;
        Matcher matcher2;
        Matcher matcher3;
        Matcher matcher4;
        Matcher matcher5;
        Matcher matcher6;
        Matcher matcher7;
        Matcher matcher8;
        Matcher matcher9;
        Matcher matcher10;
        Matcher matcher11;
        x xVar;
        a aVarA;
        String str2;
        boolean zC;
        int i2;
        C0072p0 c0072p0;
        Matcher matcher12;
        Matcher matcher13;
        Matcher matcher14;
        Matcher matcher15;
        String strGroup;
        Integer num;
        String strGroup2;
        Integer numValueOf;
        boolean zEquals;
        boolean z;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        Pattern pattern2 = d;
        String str3 = "";
        Matcher matcher16 = pattern2.matcher("");
        Pattern pattern3 = e;
        Matcher matcher17 = pattern3.matcher("");
        while (true) {
            int i3 = bVar.c;
            int i4 = bVar.b;
            if (i3 >= i4) {
                return arrayList3;
            }
            a aVarA2 = bVar.a();
            I1 i1 = this.a;
            if (aVarA2 == null) {
                i1.getLogger().h(EnumC0094u1.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                return arrayList3;
            }
            String str4 = aVarA2.a;
            if (c(matcher16, str4) || c(matcher17, str4)) {
                bVar.c--;
                z zVar = new z();
                Matcher matcher18 = pattern2.matcher(str3);
                Matcher matcher19 = pattern3.matcher(str3);
                if (bVar.c < i4) {
                    a aVarA3 = bVar.a();
                    if (aVarA3 == null) {
                        i1.getLogger().h(EnumC0094u1.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                        pattern = pattern2;
                        zVar = null;
                    } else {
                        String str5 = aVarA3.a;
                        pattern = pattern2;
                        if (c(matcher18, str5)) {
                            Long lB = b(matcher18, 4);
                            if (lB == null) {
                                i1.getLogger().h(EnumC0094u1.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                                zVar = null;
                            } else {
                                zVar.l = lB;
                                zVar.n = matcher18.group(1);
                                String strGroup3 = matcher18.group(5);
                                if (strGroup3 != null) {
                                    if (strGroup3.contains(" ")) {
                                        zVar.f139o = strGroup3.substring(0, strGroup3.indexOf(32));
                                    } else {
                                        zVar.f139o = strGroup3;
                                    }
                                }
                                str = zVar.n;
                                if (str != null) {
                                    zEquals = str.equals("main");
                                    zVar.s = Boolean.valueOf(zEquals);
                                    zVar.p = Boolean.valueOf(zEquals);
                                    if (zEquals || this.b) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    zVar.q = Boolean.valueOf(z);
                                }
                                arrayList = new ArrayList();
                                matcher = f.matcher(str3);
                                matcher2 = g.matcher(str3);
                                matcher3 = h.matcher(str3);
                                matcher4 = i.matcher(str3);
                                matcher5 = j.matcher(str3);
                                matcher6 = l.matcher(str3);
                                matcher7 = k.matcher(str3);
                                arrayList3 = arrayList3;
                                matcher8 = n.matcher(str3);
                                matcher9 = m.matcher(str3);
                                matcher10 = f79o.matcher(str3);
                                matcher11 = p.matcher(str3);
                                xVar = null;
                                while (bVar.c < i4) {
                                    aVarA = bVar.a();
                                    if (aVarA == null) {
                                        i1.getLogger().h(EnumC0094u1.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                                        break;
                                    }
                                    str2 = aVarA.a;
                                    if (c(matcher, str2)) {
                                        x xVar2 = new x();
                                        xVar2.t = matcher.group(1);
                                        xVar2.m = matcher.group(2);
                                        strGroup2 = matcher.group(3);
                                        if (strGroup2 != null || strGroup2.length() == 0) {
                                            numValueOf = null;
                                        } else {
                                            numValueOf = Integer.valueOf(Integer.parseInt(strGroup2));
                                        }
                                        xVar2.f137o = numValueOf;
                                        arrayList.add(xVar2);
                                    } else {
                                        if (c(matcher2, str2)) {
                                            x xVar3 = new x();
                                            xVar3.t = matcher2.group(1);
                                            xVar3.m = matcher2.group(2);
                                            arrayList.add(xVar3);
                                        } else {
                                            zC = c(matcher3, str2);
                                            i2 = i4;
                                            c0072p0 = this.c;
                                            if (zC) {
                                                if (c(matcher4, str2)) {
                                                    if (c(matcher5, str2)) {
                                                        if (c(matcher6, str2)) {
                                                            if (c(matcher7, str2)) {
                                                                matcher12 = matcher8;
                                                                if (c(matcher12, str2)) {
                                                                    matcher13 = matcher9;
                                                                    if (c(matcher13, str2)) {
                                                                        matcher8 = matcher12;
                                                                        matcher14 = matcher10;
                                                                        if (c(matcher14, str2)) {
                                                                            if (str2.length() != 0) {
                                                                                break;
                                                                            }
                                                                            matcher15 = matcher11;
                                                                            if (c(matcher15, str2)) {
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            if (xVar != null) {
                                                                                C0097v1 c0097v1 = new C0097v1();
                                                                                c0097v1.l = 8;
                                                                                xVar.C = c0097v1;
                                                                                a(zVar, c0097v1);
                                                                            }
                                                                            matcher15 = matcher11;
                                                                        }
                                                                    } else {
                                                                        if (xVar != null) {
                                                                            C0097v1 c0097v2 = new C0097v1();
                                                                            c0097v2.l = 8;
                                                                            matcher8 = matcher12;
                                                                            c0097v2.m = matcher13.group(1);
                                                                            c0097v2.n = matcher13.group(2);
                                                                            c0097v2.f151o = matcher13.group(3);
                                                                            xVar.C = c0097v2;
                                                                            a(zVar, c0097v2);
                                                                        } else {
                                                                            matcher8 = matcher12;
                                                                        }
                                                                        matcher14 = matcher10;
                                                                        matcher15 = matcher11;
                                                                    }
                                                                } else {
                                                                    if (xVar != null) {
                                                                        C0097v1 c0097v3 = new C0097v1();
                                                                        c0097v3.l = 8;
                                                                        c0097v3.m = matcher12.group(1);
                                                                        c0097v3.n = matcher12.group(2);
                                                                        c0097v3.f151o = matcher12.group(3);
                                                                        c0097v3.p = b(matcher12, 4);
                                                                        xVar.C = c0097v3;
                                                                        a(zVar, c0097v3);
                                                                    }
                                                                    matcher8 = matcher12;
                                                                }
                                                            } else if (xVar != null) {
                                                                C0097v1 c0097v4 = new C0097v1();
                                                                c0097v4.l = 4;
                                                                c0097v4.m = matcher7.group(1);
                                                                c0097v4.n = matcher7.group(2);
                                                                c0097v4.f151o = matcher7.group(3);
                                                                xVar.C = c0097v4;
                                                                a(zVar, c0097v4);
                                                            }
                                                        } else if (xVar != null) {
                                                            C0097v1 c0097v5 = new C0097v1();
                                                            c0097v5.l = 2;
                                                            c0097v5.m = matcher6.group(1);
                                                            c0097v5.n = matcher6.group(2);
                                                            c0097v5.f151o = matcher6.group(3);
                                                            xVar.C = c0097v5;
                                                            a(zVar, c0097v5);
                                                        }
                                                    } else if (xVar != null) {
                                                        C0097v1 c0097v6 = new C0097v1();
                                                        c0097v6.l = 1;
                                                        c0097v6.m = matcher5.group(1);
                                                        c0097v6.n = matcher5.group(2);
                                                        c0097v6.f151o = matcher5.group(3);
                                                        xVar.C = c0097v6;
                                                        a(zVar, c0097v6);
                                                    }
                                                } else {
                                                    xVar = new x();
                                                    String strE = AbstractC1701hf0.e(matcher4.group(1), ".", matcher4.group(2));
                                                    xVar.n = strE;
                                                    xVar.m = matcher4.group(3);
                                                    xVar.s = c0072p0.e(strE);
                                                    arrayList.add(xVar);
                                                }
                                            } else {
                                                xVar = new x();
                                                String strE2 = AbstractC1701hf0.e(matcher3.group(1), ".", matcher3.group(2));
                                                xVar.n = strE2;
                                                xVar.m = matcher3.group(3);
                                                xVar.l = matcher3.group(4);
                                                strGroup = matcher3.group(5);
                                                if (strGroup != null || strGroup.length() == 0) {
                                                    num = null;
                                                } else {
                                                    int i5 = Integer.parseInt(strGroup);
                                                    Integer numValueOf2 = Integer.valueOf(i5);
                                                    if (i5 < 0) {
                                                        numValueOf2 = null;
                                                    }
                                                    num = numValueOf2;
                                                }
                                                xVar.f137o = num;
                                                xVar.s = c0072p0.e(strE2);
                                                arrayList.add(xVar);
                                            }
                                            matcher13 = matcher9;
                                            matcher14 = matcher10;
                                            matcher15 = matcher11;
                                        }
                                        matcher10 = matcher14;
                                        matcher9 = matcher13;
                                        matcher11 = matcher15;
                                        i4 = i2;
                                        this = this;
                                        bVar = bVar;
                                    }
                                    i2 = i4;
                                    xVar = null;
                                    matcher13 = matcher9;
                                    matcher14 = matcher10;
                                    matcher15 = matcher11;
                                    matcher10 = matcher14;
                                    matcher9 = matcher13;
                                    matcher11 = matcher15;
                                    i4 = i2;
                                    this = this;
                                    bVar = bVar;
                                }
                                Collections.reverse(arrayList);
                                y yVar = new y(arrayList);
                                yVar.n = Boolean.TRUE;
                                zVar.t = yVar;
                            }
                        } else {
                            if (c(matcher19, str5)) {
                                Long lB2 = b(matcher19, 3);
                                if (lB2 == null) {
                                    i1.getLogger().h(EnumC0094u1.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                                    zVar = null;
                                } else {
                                    zVar.l = lB2;
                                    zVar.n = matcher19.group(1);
                                }
                            }
                            str = zVar.n;
                            if (str != null) {
                                zEquals = str.equals("main");
                                zVar.s = Boolean.valueOf(zEquals);
                                zVar.p = Boolean.valueOf(zEquals);
                                if (zEquals) {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                zVar.q = Boolean.valueOf(z);
                            }
                            arrayList = new ArrayList();
                            matcher = f.matcher(str3);
                            matcher2 = g.matcher(str3);
                            matcher3 = h.matcher(str3);
                            matcher4 = i.matcher(str3);
                            matcher5 = j.matcher(str3);
                            matcher6 = l.matcher(str3);
                            matcher7 = k.matcher(str3);
                            arrayList3 = arrayList3;
                            matcher8 = n.matcher(str3);
                            matcher9 = m.matcher(str3);
                            matcher10 = f79o.matcher(str3);
                            matcher11 = p.matcher(str3);
                            xVar = null;
                            while (bVar.c < i4) {
                                aVarA = bVar.a();
                                if (aVarA == null) {
                                    i1.getLogger().h(EnumC0094u1.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                                    break;
                                }
                                str2 = aVarA.a;
                                if (c(matcher, str2)) {
                                    x xVar4 = new x();
                                    xVar4.t = matcher.group(1);
                                    xVar4.m = matcher.group(2);
                                    strGroup2 = matcher.group(3);
                                    if (strGroup2 != null) {
                                        numValueOf = null;
                                    } else {
                                        numValueOf = null;
                                    }
                                    xVar4.f137o = numValueOf;
                                    arrayList.add(xVar4);
                                } else {
                                    if (c(matcher2, str2)) {
                                        x xVar5 = new x();
                                        xVar5.t = matcher2.group(1);
                                        xVar5.m = matcher2.group(2);
                                        arrayList.add(xVar5);
                                    } else {
                                        zC = c(matcher3, str2);
                                        i2 = i4;
                                        c0072p0 = this.c;
                                        if (zC) {
                                            if (c(matcher4, str2)) {
                                                if (c(matcher5, str2)) {
                                                    if (c(matcher6, str2)) {
                                                        if (c(matcher7, str2)) {
                                                            matcher12 = matcher8;
                                                            if (c(matcher12, str2)) {
                                                                matcher13 = matcher9;
                                                                if (c(matcher13, str2)) {
                                                                    matcher8 = matcher12;
                                                                    matcher14 = matcher10;
                                                                    if (c(matcher14, str2)) {
                                                                        if (str2.length() != 0) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        matcher15 = matcher11;
                                                                        if (c(matcher15, str2)) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        if (xVar != null) {
                                                                            C0097v1 c0097v7 = new C0097v1();
                                                                            c0097v7.l = 8;
                                                                            xVar.C = c0097v7;
                                                                            a(zVar, c0097v7);
                                                                        }
                                                                        matcher15 = matcher11;
                                                                    }
                                                                } else {
                                                                    if (xVar != null) {
                                                                        C0097v1 c0097v8 = new C0097v1();
                                                                        c0097v8.l = 8;
                                                                        matcher8 = matcher12;
                                                                        c0097v8.m = matcher13.group(1);
                                                                        c0097v8.n = matcher13.group(2);
                                                                        c0097v8.f151o = matcher13.group(3);
                                                                        xVar.C = c0097v8;
                                                                        a(zVar, c0097v8);
                                                                    } else {
                                                                        matcher8 = matcher12;
                                                                    }
                                                                    matcher14 = matcher10;
                                                                    matcher15 = matcher11;
                                                                }
                                                            } else {
                                                                if (xVar != null) {
                                                                    C0097v1 c0097v9 = new C0097v1();
                                                                    c0097v9.l = 8;
                                                                    c0097v9.m = matcher12.group(1);
                                                                    c0097v9.n = matcher12.group(2);
                                                                    c0097v9.f151o = matcher12.group(3);
                                                                    c0097v9.p = b(matcher12, 4);
                                                                    xVar.C = c0097v9;
                                                                    a(zVar, c0097v9);
                                                                }
                                                                matcher8 = matcher12;
                                                            }
                                                        } else if (xVar != null) {
                                                            C0097v1 c0097v10 = new C0097v1();
                                                            c0097v10.l = 4;
                                                            c0097v10.m = matcher7.group(1);
                                                            c0097v10.n = matcher7.group(2);
                                                            c0097v10.f151o = matcher7.group(3);
                                                            xVar.C = c0097v10;
                                                            a(zVar, c0097v10);
                                                        }
                                                    } else if (xVar != null) {
                                                        C0097v1 c0097v11 = new C0097v1();
                                                        c0097v11.l = 2;
                                                        c0097v11.m = matcher6.group(1);
                                                        c0097v11.n = matcher6.group(2);
                                                        c0097v11.f151o = matcher6.group(3);
                                                        xVar.C = c0097v11;
                                                        a(zVar, c0097v11);
                                                    }
                                                } else if (xVar != null) {
                                                    C0097v1 c0097v12 = new C0097v1();
                                                    c0097v12.l = 1;
                                                    c0097v12.m = matcher5.group(1);
                                                    c0097v12.n = matcher5.group(2);
                                                    c0097v12.f151o = matcher5.group(3);
                                                    xVar.C = c0097v12;
                                                    a(zVar, c0097v12);
                                                }
                                            } else {
                                                xVar = new x();
                                                String strE3 = AbstractC1701hf0.e(matcher4.group(1), ".", matcher4.group(2));
                                                xVar.n = strE3;
                                                xVar.m = matcher4.group(3);
                                                xVar.s = c0072p0.e(strE3);
                                                arrayList.add(xVar);
                                            }
                                        } else {
                                            xVar = new x();
                                            String strE4 = AbstractC1701hf0.e(matcher3.group(1), ".", matcher3.group(2));
                                            xVar.n = strE4;
                                            xVar.m = matcher3.group(3);
                                            xVar.l = matcher3.group(4);
                                            strGroup = matcher3.group(5);
                                            if (strGroup != null) {
                                                num = null;
                                            } else {
                                                num = null;
                                            }
                                            xVar.f137o = num;
                                            xVar.s = c0072p0.e(strE4);
                                            arrayList.add(xVar);
                                        }
                                        matcher13 = matcher9;
                                        matcher14 = matcher10;
                                        matcher15 = matcher11;
                                    }
                                    matcher10 = matcher14;
                                    matcher9 = matcher13;
                                    matcher11 = matcher15;
                                    i4 = i2;
                                    this = this;
                                    bVar = bVar;
                                }
                                i2 = i4;
                                xVar = null;
                                matcher13 = matcher9;
                                matcher14 = matcher10;
                                matcher15 = matcher11;
                                matcher10 = matcher14;
                                matcher9 = matcher13;
                                matcher11 = matcher15;
                                i4 = i2;
                                this = this;
                                bVar = bVar;
                            }
                            Collections.reverse(arrayList);
                            y yVar2 = new y(arrayList);
                            yVar2.n = Boolean.TRUE;
                            zVar.t = yVar2;
                        }
                    }
                } else {
                    pattern = pattern2;
                    zVar = null;
                }
                arrayList2 = arrayList3;
                if (zVar != null) {
                    arrayList2.add(zVar);
                }
            } else {
                arrayList2 = arrayList3;
                pattern = pattern2;
                str3 = str3;
                matcher16 = matcher16;
                pattern3 = pattern3;
                matcher17 = matcher17;
            }
            arrayList3 = arrayList2;
            pattern2 = pattern;
            matcher16 = matcher16;
            pattern3 = pattern3;
            matcher17 = matcher17;
            str3 = str3;
        }
    }
}
