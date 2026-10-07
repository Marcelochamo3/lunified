package io.sentry;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import o.AbstractC1701hf0;
import o.C3285xv;

/* JADX INFO: renamed from: io.sentry.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0038e implements InterfaceC0033c0 {
    public final /* synthetic */ int a;

    public /* synthetic */ C0038e(int i) {
        this.a = i;
    }

    public static U1 b(C0069o0 c0069o0, ILogger iLogger) {
        c0069o0.f();
        String strG0 = null;
        io.sentry.protocol.t tVar = null;
        W1 w1 = null;
        W1 w2 = null;
        ConcurrentHashMap concurrentHashMap = null;
        String strG1 = null;
        Y1 y1 = null;
        String strG2 = null;
        ConcurrentHashMap concurrentHashMapZ = null;
        while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strC0 = c0069o0.c0();
            strC0.getClass();
            switch (strC0) {
                case "span_id":
                    w1 = new W1(c0069o0.g0());
                    break;
                case "parent_span_id":
                    w2 = (W1) c0069o0.f0(iLogger, new C0038e(15));
                    break;
                case "description":
                    strG1 = c0069o0.g0();
                    break;
                case "origin":
                    strG2 = c0069o0.g0();
                    break;
                case "status":
                    y1 = (Y1) c0069o0.f0(iLogger, new C0038e(16));
                    break;
                case "op":
                    strG0 = c0069o0.g0();
                    break;
                case "tags":
                    concurrentHashMapZ = io.sentry.config.a.z((Map) c0069o0.e0());
                    break;
                case "trace_id":
                    tVar = new io.sentry.protocol.t(c0069o0.g0());
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c0069o0.j0(iLogger, concurrentHashMap, strC0);
                    break;
            }
        }
        if (tVar == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
            iLogger.v(EnumC0094u1.ERROR, "Missing required field \"trace_id\"", illegalStateException);
            throw illegalStateException;
        }
        if (w1 == null) {
            IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"span_id\"");
            iLogger.v(EnumC0094u1.ERROR, "Missing required field \"span_id\"", illegalStateException2);
            throw illegalStateException2;
        }
        U1 u1 = new U1(tVar, w1, strG0 == null ? "" : strG0, w2, null);
        u1.q = strG1;
        u1.r = y1;
        u1.t = strG2;
        if (concurrentHashMapZ != null) {
            u1.s = concurrentHashMapZ;
        }
        u1.u = concurrentHashMap;
        c0069o0.i();
        return u1;
    }

    public static IllegalStateException c(String str, ILogger iLogger) {
        String strU = AbstractC1701hf0.u("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strU);
        iLogger.v(EnumC0094u1.ERROR, strU, illegalStateException);
        return illegalStateException;
    }

    public static IllegalStateException d(String str, ILogger iLogger) {
        String strU = AbstractC1701hf0.u("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strU);
        iLogger.v(EnumC0094u1.ERROR, strU, illegalStateException);
        return illegalStateException;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:126:0x0222 A[PHI: r4
  0x0222: PHI (r4v87 java.lang.String) = (r4v86 java.lang.String), (r4v89 java.lang.String) binds: [B:121:0x0216, B:124:0x021c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:144:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:202:0x035a  */
    /* JADX WARN: Code duplicated, block: B:263:0x048f  */
    /* JADX WARN: Code duplicated, block: B:331:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:372:0x0661  */
    /* JADX WARN: Code duplicated, block: B:436:0x079e  */
    /* JADX WARN: Code duplicated, block: B:477:0x0856  */
    /* JADX WARN: Code duplicated, block: B:509:0x08fb  */
    /* JADX WARN: Code duplicated, block: B:59:0x0127  */
    /* JADX WARN: Code duplicated, block: B:601:0x0a8b  */
    /* JADX WARN: Code duplicated, block: B:641:0x0b69  */
    /* JADX WARN: Code duplicated, block: B:703:0x0c8a A[PHI: r8
  0x0c8a: PHI (r8v79 java.lang.Object) = 
  (r8v11 java.lang.Object)
  (r8v12 java.lang.Object)
  (r8v13 java.lang.Object)
  (r8v14 java.lang.Object)
  (r8v15 java.lang.Object)
  (r8v16 java.lang.Object)
  (r8v17 java.lang.Object)
  (r8v18 java.lang.Object)
  (r8v19 java.lang.Object)
  (r8v20 java.lang.Object)
  (r8v21 java.lang.Object)
  (r8v22 java.lang.Object)
  (r8v23 java.lang.Object)
  (r8v24 java.lang.Object)
  (r8v25 java.lang.Object)
  (r8v27 java.lang.Object)
  (r8v32 java.lang.Object)
  (r8v37 java.lang.Object)
  (r8v42 java.lang.Object)
  (r8v47 java.lang.Object)
  (r8v52 java.lang.Object)
  (r8v57 java.lang.Object)
  (r8v61 java.lang.Object)
  (r8v65 java.lang.Object)
  (r8v70 java.lang.Object)
  (r8v75 java.lang.Object)
  (r8v80 java.lang.Object)
 binds: [B:805:0x0e19, B:801:0x0e0c, B:797:0x0dff, B:793:0x0df2, B:789:0x0de5, B:785:0x0dd8, B:781:0x0dcb, B:777:0x0dbc, B:773:0x0dac, B:769:0x0d9c, B:765:0x0d8c, B:761:0x0d7c, B:757:0x0d6c, B:753:0x0d5c, B:749:0x0d4c, B:1228:?, B:1227:?, B:1226:?, B:1225:?, B:1224:?, B:1223:?, B:1222:?, B:1221:?, B:1220:?, B:1219:?, B:1218:?, B:702:0x0c88] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:899:0x0f7a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0044  */
    @Override // io.sentry.InterfaceC0033c0
    public final Object a(C0069o0 c0069o0, ILogger iLogger) throws Throwable {
        Object obj;
        byte b;
        String strH0;
        String str;
        byte b2;
        String str2;
        C0069o0 c0069o1 = c0069o0;
        int i = 22;
        String str3 = "environment";
        switch (this.a) {
            case 0:
                String strH1 = null;
                c0069o0.f();
                Date dateJ = io.sentry.config.a.j();
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                String strH2 = null;
                String strH3 = null;
                EnumC0094u1 enumC0094u1ValueOf = null;
                ConcurrentHashMap concurrentHashMap2 = null;
                Date date = dateJ;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC0 = c0069o0.c0();
                    strC0.getClass();
                    strC0.hashCode();
                    switch (strC0) {
                        case "data":
                            ConcurrentHashMap concurrentHashMapZ = io.sentry.config.a.z((Map) c0069o0.e0());
                            if (concurrentHashMapZ != null) {
                                concurrentHashMap = concurrentHashMapZ;
                                continue;
                            }
                            break;
                        case "type":
                            strH2 = c0069o0.h0();
                            continue;
                            break;
                        case "category":
                            strH3 = c0069o0.h0();
                            continue;
                            break;
                        case "timestamp":
                            Date dateP = c0069o0.p(iLogger);
                            if (dateP != null) {
                                date = dateP;
                            } else {
                                continue;
                            }
                            break;
                        case "level":
                            try {
                                enumC0094u1ValueOf = EnumC0094u1.valueOf(c0069o0.g0().toUpperCase(Locale.ROOT));
                                break;
                            } catch (Exception e) {
                                iLogger.s(EnumC0094u1.ERROR, e, "Error when deserializing SentryLevel", new Object[0]);
                                break;
                            }
                            break;
                        case "message":
                            strH1 = c0069o0.h0();
                            break;
                        default:
                            if (concurrentHashMap2 == null) {
                                concurrentHashMap2 = new ConcurrentHashMap();
                            }
                            c0069o1.j0(iLogger, concurrentHashMap2, strC0);
                            break;
                    }
                }
                C0041f c0041f = new C0041f(date);
                c0041f.m = strH1;
                c0041f.n = strH2;
                c0041f.f111o = concurrentHashMap;
                c0041f.p = strH3;
                c0041f.q = enumC0094u1ValueOf;
                c0041f.r = concurrentHashMap2;
                c0069o0.i();
                return c0041f;
            case 1:
                Object obj2 = "environment";
                ConcurrentHashMap concurrentHashMap3 = null;
                c0069o0.f();
                File file = new File("dummy");
                Date dateJ2 = io.sentry.config.a.j();
                ArrayList arrayList = new ArrayList();
                io.sentry.protocol.t tVar = io.sentry.protocol.t.m;
                String string = tVar.toString();
                W1 w1 = W1.m;
                new ConcurrentHashMap();
                io.sentry.config.a.C(w1, "spanId is required");
                J0 j0 = new J0(file, dateJ2, arrayList, "", string, tVar.toString(), "0", 0, "", new CallableC0107z(2), null, null, null, null, null, null, null, null, "normal", new HashMap());
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC1 = c0069o0.c0();
                    strC1.getClass();
                    strC1.hashCode();
                    switch (strC1.hashCode()) {
                        case -2133529830:
                            obj = obj2;
                            if (strC1.equals("device_manufacturer")) {
                                b = 0;
                            } else {
                                b = -1;
                            }
                            break;
                        case -1981468849:
                            obj = obj2;
                            if (strC1.equals("android_api_level")) {
                                b = 1;
                            } else {
                                b = -1;
                            }
                            break;
                        case -1430655860:
                            obj = obj2;
                            if (strC1.equals("build_id")) {
                                b = 2;
                            } else {
                                b = -1;
                            }
                            break;
                        case -1172160413:
                            obj = obj2;
                            if (strC1.equals("device_locale")) {
                                b = 3;
                            } else {
                                b = -1;
                            }
                            break;
                        case -1102636175:
                            obj = obj2;
                            if (strC1.equals("profile_id")) {
                                b = 4;
                            } else {
                                b = -1;
                            }
                            break;
                        case -716656436:
                            obj = obj2;
                            if (strC1.equals("device_os_build_number")) {
                                b = 5;
                            } else {
                                b = -1;
                            }
                            break;
                        case -591076352:
                            obj = obj2;
                            if (strC1.equals("device_model")) {
                                b = 6;
                            } else {
                                b = -1;
                            }
                            break;
                        case -512511455:
                            obj = obj2;
                            if (strC1.equals("device_is_emulator")) {
                                b = 7;
                            } else {
                                b = -1;
                            }
                            break;
                        case -478065584:
                            obj = obj2;
                            if (strC1.equals("duration_ns")) {
                                b = 8;
                            } else {
                                b = -1;
                            }
                            break;
                        case -362243017:
                            obj = obj2;
                            if (strC1.equals("measurements")) {
                                b = 9;
                            } else {
                                b = -1;
                            }
                            break;
                        case -332426004:
                            obj = obj2;
                            if (strC1.equals("device_physical_memory_bytes")) {
                                b = 10;
                            } else {
                                b = -1;
                            }
                            break;
                        case -212264198:
                            obj = obj2;
                            if (strC1.equals("device_cpu_frequencies")) {
                                b = C3285xv.h;
                            } else {
                                b = -1;
                            }
                            break;
                        case -102985484:
                            obj = obj2;
                            if (strC1.equals("version_code")) {
                                b = 12;
                            } else {
                                b = -1;
                            }
                            break;
                        case -102670958:
                            obj = obj2;
                            if (strC1.equals("version_name")) {
                                b = 13;
                            } else {
                                b = -1;
                            }
                            break;
                        case -85904877:
                            obj = obj2;
                            if (strC1.equals(obj)) {
                                b = 14;
                            } else {
                                b = -1;
                            }
                            break;
                        case 55126294:
                            if (strC1.equals("timestamp")) {
                                obj = obj2;
                                b = 15;
                            } else {
                                obj = obj2;
                                b = -1;
                            }
                            break;
                        case 508853068:
                            if (strC1.equals("transaction_name")) {
                                obj = obj2;
                                b = 16;
                            } else {
                                obj = obj2;
                                b = -1;
                            }
                            break;
                        case 796476189:
                            if (strC1.equals("device_os_name")) {
                                obj = obj2;
                                b = 17;
                            } else {
                                obj = obj2;
                                b = -1;
                            }
                            break;
                        case 839674195:
                            if (strC1.equals("architecture")) {
                                obj = obj2;
                                b = 18;
                            } else {
                                obj = obj2;
                                b = -1;
                            }
                            break;
                        case 1010584092:
                            if (strC1.equals("transaction_id")) {
                                obj = obj2;
                                b = 19;
                            } else {
                                obj = obj2;
                                b = -1;
                            }
                            break;
                        case 1052553990:
                            if (strC1.equals("device_os_version")) {
                                obj = obj2;
                                b = 20;
                            } else {
                                obj = obj2;
                                b = -1;
                            }
                            break;
                        case 1163928186:
                            if (strC1.equals("truncation_reason")) {
                                obj = obj2;
                                b = 21;
                            } else {
                                obj = obj2;
                                b = -1;
                            }
                            break;
                        case 1270300245:
                            if (strC1.equals("trace_id")) {
                                obj = obj2;
                                b = 22;
                            } else {
                                obj = obj2;
                                b = -1;
                            }
                            break;
                        case 1874684019:
                            if (strC1.equals("platform")) {
                                obj = obj2;
                                b = 23;
                            } else {
                                obj = obj2;
                                b = -1;
                            }
                            break;
                        case 1953158756:
                            if (strC1.equals("sampled_profile")) {
                                obj = obj2;
                                b = 24;
                            } else {
                                obj = obj2;
                                b = -1;
                            }
                            break;
                        case 1954122069:
                            if (strC1.equals("transactions")) {
                                obj = obj2;
                                b = 25;
                            } else {
                                obj = obj2;
                                b = -1;
                            }
                            break;
                        default:
                            obj = obj2;
                            b = -1;
                            break;
                    }
                    switch (b) {
                        case 0:
                            String strH4 = c0069o0.h0();
                            if (strH4 != null) {
                                j0.p = strH4;
                                continue;
                            }
                            obj2 = obj;
                            break;
                        case 1:
                            Integer numW = c0069o0.W();
                            if (numW != null) {
                                j0.n = numW.intValue();
                            } else {
                                continue;
                            }
                            obj2 = obj;
                            break;
                        case 2:
                            String strH5 = c0069o0.h0();
                            if (strH5 != null) {
                                j0.z = strH5;
                            } else {
                                continue;
                            }
                            obj2 = obj;
                            break;
                        case 3:
                            String strH6 = c0069o0.h0();
                            if (strH6 != null) {
                                j0.f50o = strH6;
                            } else {
                                continue;
                            }
                            obj2 = obj;
                            break;
                        case 4:
                            String strH7 = c0069o0.h0();
                            if (strH7 != null) {
                                j0.H = strH7;
                            } else {
                                continue;
                            }
                            obj2 = obj;
                            break;
                        case 5:
                            String strH8 = c0069o0.h0();
                            if (strH8 != null) {
                                j0.r = strH8;
                            } else {
                                continue;
                            }
                            obj2 = obj;
                            break;
                        case 6:
                            String strH9 = c0069o0.h0();
                            if (strH9 != null) {
                                j0.q = strH9;
                            } else {
                                continue;
                            }
                            obj2 = obj;
                            break;
                        case 7:
                            Boolean boolL = c0069o0.l();
                            if (boolL != null) {
                                j0.u = boolL.booleanValue();
                            } else {
                                continue;
                            }
                            obj2 = obj;
                            break;
                        case 8:
                            String strH10 = c0069o0.h0();
                            if (strH10 != null) {
                                j0.C = strH10;
                            } else {
                                continue;
                            }
                            obj2 = obj;
                            break;
                        case 9:
                            HashMap mapB0 = c0069o1.b0(iLogger, new io.sentry.clientreport.a(2));
                            if (mapB0 != null) {
                                j0.L.putAll(mapB0);
                            } else {
                                continue;
                            }
                            obj2 = obj;
                            break;
                        case 10:
                            String strH11 = c0069o0.h0();
                            if (strH11 != null) {
                                j0.x = strH11;
                            }
                            break;
                        case 11:
                            List list = (List) c0069o0.e0();
                            if (list != null) {
                                j0.w = list;
                            }
                            break;
                        case 12:
                            String strH12 = c0069o0.h0();
                            if (strH12 != null) {
                                j0.D = strH12;
                            }
                            break;
                        case 13:
                            String strH13 = c0069o0.h0();
                            if (strH13 != null) {
                                j0.E = strH13;
                            }
                            break;
                        case 14:
                            String strH14 = c0069o0.h0();
                            if (strH14 != null) {
                                j0.I = strH14;
                            }
                            break;
                        case 15:
                            Date dateP2 = c0069o0.p(iLogger);
                            if (dateP2 != null) {
                                j0.K = dateP2;
                            }
                            break;
                        case 16:
                            String strH15 = c0069o0.h0();
                            if (strH15 != null) {
                                j0.B = strH15;
                            }
                            break;
                        case 17:
                            String strH16 = c0069o0.h0();
                            if (strH16 != null) {
                                j0.s = strH16;
                            }
                            break;
                        case 18:
                            String strH17 = c0069o0.h0();
                            if (strH17 != null) {
                                j0.v = strH17;
                            }
                            break;
                        case 19:
                            String strH18 = c0069o0.h0();
                            if (strH18 != null) {
                                j0.F = strH18;
                            }
                            break;
                        case 20:
                            String strH19 = c0069o0.h0();
                            if (strH19 != null) {
                                j0.t = strH19;
                            }
                            break;
                        case 21:
                            String strH20 = c0069o0.h0();
                            if (strH20 != null) {
                                j0.J = strH20;
                            }
                            break;
                        case 22:
                            String strH21 = c0069o0.h0();
                            if (strH21 != null) {
                                j0.G = strH21;
                            }
                            break;
                        case 23:
                            String strH22 = c0069o0.h0();
                            if (strH22 != null) {
                                j0.y = strH22;
                            }
                            break;
                        case 24:
                            String strH23 = c0069o0.h0();
                            if (strH23 != null) {
                                j0.M = strH23;
                            }
                            break;
                        case 25:
                            ArrayList arrayListX = c0069o1.X(iLogger, new C0038e(2));
                            if (arrayListX != null) {
                                j0.A.addAll(arrayListX);
                            }
                            break;
                        default:
                            if (concurrentHashMap3 == null) {
                                concurrentHashMap3 = new ConcurrentHashMap();
                            }
                            c0069o1.j0(iLogger, concurrentHashMap3, strC1);
                            break;
                    }
                    obj2 = obj;
                }
                j0.N = concurrentHashMap3;
                c0069o0.i();
                return j0;
            case 2:
                ConcurrentHashMap concurrentHashMap4 = null;
                c0069o0.f();
                K0 k0 = new K0(D0.a, 0L, 0L);
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC2 = c0069o0.c0();
                    strC2.getClass();
                    strC2.hashCode();
                    switch (strC2) {
                        case "relative_start_ns":
                            Long lZ = c0069o0.Z();
                            if (lZ == null) {
                                break;
                            } else {
                                k0.f51o = lZ;
                                break;
                            }
                            break;
                        case "relative_end_ns":
                            Long lZ2 = c0069o0.Z();
                            if (lZ2 == null) {
                                break;
                            } else {
                                k0.p = lZ2;
                                break;
                            }
                            break;
                        case "id":
                            String strH24 = c0069o0.h0();
                            if (strH24 == null) {
                                break;
                            } else {
                                k0.l = strH24;
                                break;
                            }
                            break;
                        case "name":
                            String strH25 = c0069o0.h0();
                            if (strH25 == null) {
                                break;
                            } else {
                                k0.n = strH25;
                                break;
                            }
                            break;
                        case "trace_id":
                            String strH26 = c0069o0.h0();
                            if (strH26 == null) {
                                break;
                            } else {
                                k0.m = strH26;
                                break;
                            }
                            break;
                        case "relative_cpu_end_ms":
                            Long lZ3 = c0069o0.Z();
                            if (lZ3 == null) {
                                break;
                            } else {
                                k0.r = lZ3;
                                break;
                            }
                            break;
                        case "relative_cpu_start_ms":
                            Long lZ4 = c0069o0.Z();
                            if (lZ4 == null) {
                                break;
                            } else {
                                k0.q = lZ4;
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap4 == null) {
                                concurrentHashMap4 = new ConcurrentHashMap();
                            }
                            c0069o1.j0(iLogger, concurrentHashMap4, strC2);
                            break;
                    }
                }
                k0.s = concurrentHashMap4;
                c0069o0.i();
                return k0;
            case 3:
                ArrayList arrayList2 = null;
                P0 p0 = new P0();
                c0069o0.f();
                HashMap map = null;
                Integer numW2 = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC3 = c0069o0.c0();
                    strC3.getClass();
                    if (strC3.equals("segment_id")) {
                        numW2 = c0069o0.W();
                    } else {
                        if (map == null) {
                            map = new HashMap();
                        }
                        c0069o1.j0(iLogger, map, strC3);
                    }
                }
                c0069o0.i();
                c0069o1.m0(true);
                List list2 = (List) c0069o0.e0();
                c0069o1.m0(false);
                if (list2 != null) {
                    arrayList2 = new ArrayList(list2.size());
                    for (Object obj3 : list2) {
                        if (obj3 instanceof Map) {
                            Map map2 = (Map) obj3;
                            C0069o0 c0069o2 = new C0069o0(map2);
                            for (Map.Entry entry : map2.entrySet()) {
                                String str4 = (String) entry.getKey();
                                Object value = entry.getValue();
                                if (str4.equals("type")) {
                                    io.sentry.rrweb.c cVar = io.sentry.rrweb.c.values()[((Integer) value).intValue()];
                                    int i2 = O0.b[cVar.ordinal()];
                                    if (i2 == 1) {
                                        Map mapEmptyMap = (Map) map2.get("data");
                                        if (mapEmptyMap == null) {
                                            mapEmptyMap = Collections.emptyMap();
                                        }
                                        Integer num = (Integer) mapEmptyMap.get("source");
                                        if (num != null) {
                                            io.sentry.rrweb.d dVar = io.sentry.rrweb.d.values()[num.intValue()];
                                            int i3 = O0.a[dVar.ordinal()];
                                            if (i3 == 1) {
                                                arrayList2.add(io.sentry.protocol.D.c(c0069o2, iLogger));
                                            } else if (i3 != 2) {
                                                iLogger.h(EnumC0094u1.DEBUG, "Unsupported rrweb incremental snapshot type %s", dVar);
                                            } else {
                                                arrayList2.add(io.sentry.protocol.D.d(c0069o2, iLogger));
                                            }
                                        }
                                    } else if (i2 == 2) {
                                        arrayList2.add(io.sentry.protocol.D.e(c0069o2, iLogger));
                                    } else if (i2 == 3) {
                                        Map mapEmptyMap2 = (Map) map2.get("data");
                                        if (mapEmptyMap2 == null) {
                                            mapEmptyMap2 = Collections.emptyMap();
                                        }
                                        String str5 = (String) mapEmptyMap2.get("tag");
                                        if (str5 != null) {
                                            str5.hashCode();
                                            switch (str5) {
                                                case "performanceSpan":
                                                    arrayList2.add(io.sentry.protocol.D.f(c0069o2, iLogger));
                                                    break;
                                                case "video":
                                                    arrayList2.add(io.sentry.protocol.D.g(c0069o2, iLogger));
                                                    break;
                                                case "breadcrumb":
                                                    arrayList2.add(io.sentry.protocol.D.b(c0069o2, iLogger));
                                                    break;
                                                default:
                                                    iLogger.h(EnumC0094u1.DEBUG, "Unsupported rrweb event type %s", cVar);
                                                    break;
                                            }
                                        }
                                    } else {
                                        iLogger.h(EnumC0094u1.DEBUG, "Unsupported rrweb event type %s", cVar);
                                    }
                                }
                            }
                        }
                    }
                }
                p0.l = numW2;
                p0.m = arrayList2;
                p0.n = map;
                return p0;
            case 4:
                c0069o0.f();
                C0034c1 c0034c1 = new C0034c1();
                c0034c1.n = false;
                ConcurrentHashMap concurrentHashMap5 = null;
                c0034c1.f105o = null;
                c0034c1.l = false;
                c0034c1.m = null;
                c0034c1.p = null;
                c0034c1.q = false;
                c0034c1.r = 0;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC4 = c0069o0.c0();
                    strC4.getClass();
                    strC4.hashCode();
                    switch (strC4) {
                        case "trace_sampled":
                            Boolean boolL2 = c0069o0.l();
                            if (boolL2 == null) {
                                break;
                            } else {
                                c0034c1.n = boolL2.booleanValue();
                                break;
                            }
                            break;
                        case "profiling_traces_dir_path":
                            String strH27 = c0069o0.h0();
                            if (strH27 == null) {
                                break;
                            } else {
                                c0034c1.p = strH27;
                                break;
                            }
                            break;
                        case "is_profiling_enabled":
                            Boolean boolL3 = c0069o0.l();
                            if (boolL3 == null) {
                                break;
                            } else {
                                c0034c1.q = boolL3.booleanValue();
                                break;
                            }
                            break;
                        case "profile_sampled":
                            Boolean boolL4 = c0069o0.l();
                            if (boolL4 == null) {
                                break;
                            } else {
                                c0034c1.l = boolL4.booleanValue();
                                break;
                            }
                            break;
                        case "profiling_traces_hz":
                            Integer numW3 = c0069o0.W();
                            if (numW3 == null) {
                                break;
                            } else {
                                c0034c1.r = numW3.intValue();
                                break;
                            }
                            break;
                        case "trace_sample_rate":
                            Double dT = c0069o0.t();
                            if (dT == null) {
                                break;
                            } else {
                                c0034c1.f105o = dT;
                                break;
                            }
                            break;
                        case "profile_sample_rate":
                            Double dT2 = c0069o0.t();
                            if (dT2 == null) {
                                break;
                            } else {
                                c0034c1.m = dT2;
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap5 == null) {
                                concurrentHashMap5 = new ConcurrentHashMap();
                            }
                            c0069o1.j0(iLogger, concurrentHashMap5, strC4);
                            break;
                    }
                }
                c0034c1.s = concurrentHashMap5;
                c0069o0.i();
                return c0034c1;
            case 5:
                c0069o0.f();
                io.sentry.protocol.r rVar = null;
                d2 d2Var = null;
                Date dateP3 = null;
                io.sentry.protocol.t tVar2 = null;
                HashMap map3 = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC5 = c0069o0.c0();
                    strC5.getClass();
                    strC5.hashCode();
                    switch (strC5) {
                        case "sdk":
                            rVar = (io.sentry.protocol.r) c0069o1.f0(iLogger, new io.sentry.clientreport.a(20));
                            break;
                        case "trace":
                            d2Var = (d2) c0069o1.f0(iLogger, new C0038e(17));
                            break;
                        case "event_id":
                            tVar2 = (io.sentry.protocol.t) c0069o1.f0(iLogger, new io.sentry.clientreport.a(i));
                            break;
                        case "sent_at":
                            dateP3 = c0069o0.p(iLogger);
                            break;
                        default:
                            if (map3 == null) {
                                map3 = new HashMap();
                            }
                            c0069o1.j0(iLogger, map3, strC5);
                            break;
                    }
                }
                C0055j1 c0055j1 = new C0055j1(tVar2, rVar, d2Var);
                c0055j1.f115o = dateP3;
                c0055j1.p = map3;
                c0069o0.i();
                return c0055j1;
            case 6:
                c0069o0.f();
                HashMap map4 = null;
                EnumC0091t1 enumC0091t1 = null;
                int iR = 0;
                String strH28 = null;
                String strH29 = null;
                String strH30 = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC6 = c0069o0.c0();
                    strC6.getClass();
                    strC6.hashCode();
                    switch (strC6) {
                        case "length":
                            iR = c0069o0.R();
                            continue;
                            break;
                        case "filename":
                            strH29 = c0069o0.h0();
                            continue;
                            break;
                        case "attachment_type":
                            strH30 = c0069o0.h0();
                            continue;
                            break;
                        case "type":
                            enumC0091t1 = (EnumC0091t1) c0069o1.f0(iLogger, new C0038e(8));
                            continue;
                            break;
                        case "content_type":
                            strH28 = c0069o0.h0();
                            break;
                        default:
                            if (map4 == null) {
                                map4 = new HashMap();
                            }
                            c0069o1.j0(iLogger, map4, strC6);
                            break;
                    }
                }
                if (enumC0091t1 == null) {
                    Throwable illegalStateException = new IllegalStateException("Missing required field \"type\"");
                    iLogger.v(EnumC0094u1.ERROR, "Missing required field \"type\"", illegalStateException);
                    throw illegalStateException;
                }
                C0073p1 c0073p1 = new C0073p1(enumC0091t1, iR, strH28, strH29, strH30);
                c0073p1.r = map4;
                c0069o0.i();
                return c0073p1;
            case 7:
                c0069o0.f();
                C0083q1 c0083q1 = new C0083q1();
                ConcurrentHashMap concurrentHashMap6 = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC7 = c0069o0.c0();
                    strC7.getClass();
                    strC7.hashCode();
                    switch (strC7) {
                        case "fingerprint":
                            List list3 = (List) c0069o0.e0();
                            if (list3 != null) {
                                c0083q1.H = list3;
                            } else {
                                continue;
                            }
                            break;
                        case "threads":
                            c0069o0.f();
                            c0069o0.c0();
                            c0083q1.D = new C0066n0(c0069o1.X(iLogger, new io.sentry.clientreport.a(28)));
                            c0069o0.i();
                            continue;
                            break;
                        case "logger":
                            c0083q1.C = c0069o0.h0();
                            continue;
                            break;
                        case "timestamp":
                            Date dateP4 = c0069o0.p(iLogger);
                            if (dateP4 != null) {
                                c0083q1.A = dateP4;
                            } else {
                                continue;
                            }
                            break;
                        case "level":
                            c0083q1.F = (EnumC0094u1) c0069o1.f0(iLogger, new C0038e(9));
                            continue;
                            break;
                        case "message":
                            c0083q1.B = (io.sentry.protocol.k) c0069o1.f0(iLogger, new io.sentry.clientreport.a(15));
                            break;
                        case "modules":
                            c0083q1.J = io.sentry.config.a.z((Map) c0069o0.e0());
                            break;
                        case "exception":
                            c0069o0.f();
                            c0069o0.c0();
                            c0083q1.E = new C0066n0(c0069o1.X(iLogger, new io.sentry.clientreport.a(21)));
                            c0069o0.i();
                            break;
                        case "transaction":
                            c0083q1.G = c0069o0.h0();
                            break;
                        default:
                            if (!io.sentry.config.a.d(c0083q1, strC7, c0069o1, iLogger)) {
                                if (concurrentHashMap6 == null) {
                                    concurrentHashMap6 = new ConcurrentHashMap();
                                }
                                c0069o1.j0(iLogger, concurrentHashMap6, strC7);
                                break;
                            }
                            break;
                    }
                }
                c0083q1.I = concurrentHashMap6;
                c0069o0.i();
                return c0083q1;
            case 8:
                return EnumC0091t1.valueOfLabel(c0069o0.g0().toLowerCase(Locale.ROOT));
            case 9:
                return EnumC0094u1.valueOf(c0069o0.g0().toUpperCase(Locale.ROOT));
            case 10:
                C0097v1 c0097v1 = new C0097v1();
                c0069o0.f();
                ConcurrentHashMap concurrentHashMap7 = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC8 = c0069o0.c0();
                    strC8.getClass();
                    strC8.hashCode();
                    switch (strC8) {
                        case "package_name":
                            c0097v1.n = c0069o0.h0();
                            break;
                        case "thread_id":
                            c0097v1.p = c0069o0.Z();
                            break;
                        case "address":
                            c0097v1.m = c0069o0.h0();
                            break;
                        case "class_name":
                            c0097v1.f151o = c0069o0.h0();
                            break;
                        case "type":
                            c0097v1.l = c0069o0.R();
                            break;
                        default:
                            if (concurrentHashMap7 == null) {
                                concurrentHashMap7 = new ConcurrentHashMap();
                            }
                            c0069o1.j0(iLogger, concurrentHashMap7, strC8);
                            break;
                    }
                }
                c0097v1.q = concurrentHashMap7;
                c0069o0.i();
                return c0097v1;
            case 11:
                K1 k1 = new K1();
                c0069o0.f();
                J1 j1 = null;
                Date dateP5 = null;
                HashMap map5 = null;
                String strH31 = null;
                io.sentry.protocol.t tVar3 = null;
                Date dateP6 = null;
                List list4 = null;
                List list5 = null;
                List list6 = null;
                Integer numW4 = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC9 = c0069o0.c0();
                    strC9.getClass();
                    strC9.hashCode();
                    switch (strC9) {
                        case "replay_id":
                            tVar3 = (io.sentry.protocol.t) c0069o0.f0(iLogger, new io.sentry.clientreport.a(i));
                            break;
                        case "replay_start_timestamp":
                            dateP6 = c0069o0.p(iLogger);
                            break;
                        case "type":
                            strH31 = c0069o0.h0();
                            break;
                        case "urls":
                            list4 = (List) c0069o0.e0();
                            break;
                        case "timestamp":
                            dateP5 = c0069o0.p(iLogger);
                            break;
                        case "error_ids":
                            list5 = (List) c0069o0.e0();
                            break;
                        case "trace_ids":
                            list6 = (List) c0069o0.e0();
                            break;
                        case "replay_type":
                            j1 = (J1) c0069o0.f0(iLogger, new C0038e(12));
                            break;
                        case "segment_id":
                            numW4 = c0069o0.W();
                            break;
                        default:
                            if (!io.sentry.config.a.d(k1, strC9, c0069o0, iLogger)) {
                                if (map5 == null) {
                                    map5 = new HashMap();
                                }
                                c0069o0.j0(iLogger, map5, strC9);
                                break;
                            } else {
                                break;
                            }
                            break;
                    }
                }
                c0069o0.i();
                if (strH31 != null) {
                    k1.B = strH31;
                }
                if (j1 != null) {
                    k1.C = j1;
                }
                if (numW4 != null) {
                    k1.E = numW4.intValue();
                }
                if (dateP5 != null) {
                    k1.F = dateP5;
                }
                k1.D = tVar3;
                k1.G = dateP6;
                k1.H = list4;
                k1.I = list5;
                k1.J = list6;
                k1.K = map5;
                return k1;
            case 12:
                return J1.valueOf(c0069o0.g0().toUpperCase(Locale.ROOT));
            case 13:
                c0069o0.f();
                R1 r1ValueOf = null;
                String strH32 = null;
                Double dT3 = null;
                ConcurrentHashMap concurrentHashMap8 = null;
                Date dateP7 = null;
                Date dateP8 = null;
                Integer numW5 = null;
                UUID uuidFromString = null;
                Boolean boolL5 = null;
                Long lZ5 = null;
                String strH33 = null;
                String strH34 = null;
                String strH35 = null;
                String strH36 = null;
                String str6 = null;
                while (true) {
                    Double d = dT3;
                    Long l = lZ5;
                    if (c0069o0.l0() != io.sentry.vendor.gson.stream.b.NAME) {
                        if (r1ValueOf == null) {
                            throw c("status", iLogger);
                        }
                        if (dateP7 == null) {
                            throw c("started", iLogger);
                        }
                        if (numW5 == null) {
                            throw c("errors", iLogger);
                        }
                        if (strH35 == null) {
                            throw c("release", iLogger);
                        }
                        S1 s1 = new S1(r1ValueOf, dateP7, dateP8, numW5.intValue(), strH32, uuidFromString, boolL5, l, d, str6, strH33, strH34, strH35, strH36);
                        s1.A = concurrentHashMap8;
                        c0069o0.i();
                        return s1;
                    }
                    String strC10 = c0069o0.c0();
                    strC10.getClass();
                    strC10.hashCode();
                    switch (strC10) {
                        case "duration":
                            str = str3;
                            dT3 = c0069o0.t();
                            lZ5 = l;
                            break;
                        case "started":
                            str = str3;
                            dateP7 = c0069o0.p(iLogger);
                            dT3 = d;
                            lZ5 = l;
                            break;
                        case "errors":
                            str = str3;
                            numW5 = c0069o0.W();
                            dT3 = d;
                            lZ5 = l;
                            break;
                        case "status":
                            str = str3;
                            String strA = io.sentry.util.e.a(c0069o0.h0());
                            if (strA != null) {
                                r1ValueOf = R1.valueOf(strA);
                            }
                            dT3 = d;
                            lZ5 = l;
                            break;
                        case "did":
                            str = str3;
                            strH32 = c0069o0.h0();
                            dT3 = d;
                            lZ5 = l;
                            break;
                        case "seq":
                            str = str3;
                            lZ5 = c0069o0.Z();
                            dT3 = d;
                            break;
                        case "sid":
                            try {
                                strH0 = c0069o0.h0();
                                try {
                                    uuidFromString = UUID.fromString(strH0);
                                    str = str3;
                                } catch (IllegalArgumentException unused) {
                                    str = str3;
                                    iLogger.h(EnumC0094u1.ERROR, "%s sid is not valid.", strH0);
                                }
                            } catch (IllegalArgumentException unused2) {
                                strH0 = null;
                            }
                            dT3 = d;
                            lZ5 = l;
                            break;
                        case "init":
                            boolL5 = c0069o0.l();
                            str = str3;
                            dT3 = d;
                            lZ5 = l;
                            break;
                        case "timestamp":
                            dateP8 = c0069o0.p(iLogger);
                            str = str3;
                            dT3 = d;
                            lZ5 = l;
                            break;
                        case "attrs":
                            c0069o0.f();
                            String strH37 = str6;
                            while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                                String strC11 = c0069o0.c0();
                                strC11.getClass();
                                strC11.hashCode();
                                switch (strC11.hashCode()) {
                                    case -85904877:
                                        if (strC11.equals(str3)) {
                                            b2 = 0;
                                        } else {
                                            b2 = -1;
                                        }
                                        break;
                                    case 1090594823:
                                        if (strC11.equals("release")) {
                                            b2 = 1;
                                        } else {
                                            b2 = -1;
                                        }
                                        break;
                                    case 1480014044:
                                        if (strC11.equals("ip_address")) {
                                            b2 = 2;
                                        } else {
                                            b2 = -1;
                                        }
                                        break;
                                    case 1917799825:
                                        if (strC11.equals("user_agent")) {
                                            b2 = 3;
                                        } else {
                                            b2 = -1;
                                        }
                                        break;
                                    default:
                                        b2 = -1;
                                        break;
                                }
                                switch (b2) {
                                    case 0:
                                        strH34 = c0069o0.h0();
                                        break;
                                    case 1:
                                        strH35 = c0069o0.h0();
                                        break;
                                    case 2:
                                        strH37 = c0069o0.h0();
                                        break;
                                    case 3:
                                        strH33 = c0069o0.h0();
                                        break;
                                    default:
                                        c0069o0.o0();
                                        break;
                                }
                            }
                            c0069o0.i();
                            str6 = strH37;
                            str = str3;
                            dT3 = d;
                            lZ5 = l;
                            break;
                        case "abnormal_mechanism":
                            strH36 = c0069o0.h0();
                            str = str3;
                            dT3 = d;
                            lZ5 = l;
                            break;
                        default:
                            if (concurrentHashMap8 == null) {
                                concurrentHashMap8 = new ConcurrentHashMap();
                            }
                            c0069o1.j0(iLogger, concurrentHashMap8, strC10);
                            str = str3;
                            dT3 = d;
                            lZ5 = l;
                            break;
                    }
                    c0069o1 = c0069o0;
                    str3 = str;
                }
                break;
            case 14:
                return b(c0069o0, iLogger);
            case 15:
                return new W1(c0069o0.g0());
            case 16:
                return Y1.valueOf(c0069o0.g0().toUpperCase(Locale.ROOT));
            case 17:
                c0069o0.f();
                c2 c2Var = null;
                ConcurrentHashMap concurrentHashMap9 = null;
                String strH38 = null;
                String strH39 = null;
                String strG0 = null;
                String strH40 = null;
                String strH41 = null;
                io.sentry.protocol.t tVar4 = null;
                String strH42 = null;
                String strH43 = null;
                String strH44 = null;
                io.sentry.protocol.t tVar5 = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC12 = c0069o0.c0();
                    strC12.getClass();
                    strC12.hashCode();
                    switch (strC12) {
                        case "user_segment":
                            strH39 = c0069o0.h0();
                            break;
                        case "replay_id":
                            tVar5 = new io.sentry.protocol.t(c0069o0.g0());
                            break;
                        case "user_id":
                            strH38 = c0069o0.h0();
                            break;
                        case "environment":
                            strH41 = c0069o0.h0();
                            break;
                        case "user":
                            c2Var = (c2) c0069o1.f0(iLogger, new C0038e(18));
                            break;
                        case "sample_rate":
                            strH43 = c0069o0.h0();
                            break;
                        case "release":
                            strH40 = c0069o0.h0();
                            break;
                        case "trace_id":
                            tVar4 = new io.sentry.protocol.t(c0069o0.g0());
                            break;
                        case "sampled":
                            strH44 = c0069o0.h0();
                            break;
                        case "public_key":
                            strG0 = c0069o0.g0();
                            break;
                        case "transaction":
                            strH42 = c0069o0.h0();
                            break;
                        default:
                            if (concurrentHashMap9 == null) {
                                concurrentHashMap9 = new ConcurrentHashMap();
                            }
                            c0069o1.j0(iLogger, concurrentHashMap9, strC12);
                            break;
                    }
                }
                if (tVar4 == null) {
                    throw d("trace_id", iLogger);
                }
                if (strG0 == null) {
                    throw d("public_key", iLogger);
                }
                if (c2Var == null) {
                    str2 = strH39;
                } else {
                    if (strH38 == null) {
                        strH38 = c2Var.a;
                    }
                    if (strH39 == null) {
                        str2 = c2Var.b;
                    } else {
                        str2 = strH39;
                    }
                }
                d2 d2Var2 = new d2(tVar4, strG0, strH40, strH41, strH38, str2, strH42, strH43, strH44, tVar5);
                d2Var2.v = concurrentHashMap9;
                c0069o0.i();
                return d2Var2;
            case 18:
                c0069o0.f();
                String strH45 = null;
                String strH46 = null;
                ConcurrentHashMap concurrentHashMap10 = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC13 = c0069o0.c0();
                    strC13.getClass();
                    if (strC13.equals("id")) {
                        strH45 = c0069o0.h0();
                    } else if (strC13.equals("segment")) {
                        strH46 = c0069o0.h0();
                    } else {
                        if (concurrentHashMap10 == null) {
                            concurrentHashMap10 = new ConcurrentHashMap();
                        }
                        ConcurrentHashMap concurrentHashMap11 = concurrentHashMap10;
                        c0069o1.j0(iLogger, concurrentHashMap11, strC13);
                        concurrentHashMap10 = concurrentHashMap11;
                    }
                }
                c2 c2Var2 = new c2();
                c2Var2.a = strH45;
                c2Var2.b = strH46;
                c0069o0.i();
                return c2Var2;
            default:
                c0069o0.f();
                io.sentry.protocol.t tVar6 = null;
                String strH47 = null;
                String strH48 = null;
                String strH49 = null;
                HashMap map6 = null;
                while (c0069o0.l0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strC14 = c0069o0.c0();
                    strC14.getClass();
                    strC14.hashCode();
                    switch (strC14) {
                        case "comments":
                            strH49 = c0069o0.h0();
                            break;
                        case "name":
                            strH47 = c0069o0.h0();
                            break;
                        case "email":
                            strH48 = c0069o0.h0();
                            break;
                        case "event_id":
                            tVar6 = new io.sentry.protocol.t(c0069o0.g0());
                            break;
                        default:
                            if (map6 == null) {
                                map6 = new HashMap();
                            }
                            c0069o1.j0(iLogger, map6, strC14);
                            break;
                    }
                }
                c0069o0.i();
                if (tVar6 != null) {
                    j2 j2Var = new j2(tVar6, strH47, strH48, strH49);
                    j2Var.p = map6;
                    return j2Var;
                }
                Throwable illegalStateException2 = new IllegalStateException("Missing required field \"event_id\"");
                iLogger.v(EnumC0094u1.ERROR, "Missing required field \"event_id\"", illegalStateException2);
                throw illegalStateException2;
        }
    }
}
