package io.sentry;

import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import o.Yu0;

/* JADX INFO: renamed from: io.sentry.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0069o0 implements Closeable {
    public final /* synthetic */ int l = 0;
    public final Object m;

    public C0069o0(Reader reader) {
        this.m = new io.sentry.vendor.gson.stream.a(reader);
    }

    public final float K() throws IOException {
        switch (this.l) {
            case 0:
                return (float) ((io.sentry.vendor.gson.stream.a) this.m).X();
            default:
                Object objK0 = k0();
                if (objK0 instanceof Number) {
                    return ((Number) objK0).floatValue();
                }
                throw new IOException("Expected float");
        }
    }

    public final Float Q() throws IOException {
        switch (this.l) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.m;
                if (aVar.g0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return Float.valueOf(K());
                }
                aVar.c0();
                return null;
            default:
                Object objK0 = k0();
                if (objK0 instanceof Number) {
                    return Float.valueOf(((Number) objK0).floatValue());
                }
                return null;
        }
    }

    public final int R() throws IOException {
        switch (this.l) {
            case 0:
                return ((io.sentry.vendor.gson.stream.a) this.m).Y();
            default:
                Object objK0 = k0();
                if (objK0 instanceof Number) {
                    return ((Number) objK0).intValue();
                }
                throw new IOException("Expected int");
        }
    }

    public final Integer W() throws IOException {
        switch (this.l) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.m;
                if (aVar.g0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return Integer.valueOf(aVar.Y());
                }
                aVar.c0();
                return null;
            default:
                Object objK0 = k0();
                if (objK0 instanceof Number) {
                    return Integer.valueOf(((Number) objK0).intValue());
                }
                return null;
        }
    }

    public final ArrayList X(ILogger iLogger, InterfaceC0033c0 interfaceC0033c0) {
        switch (this.l) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.m;
                if (aVar.g0() == io.sentry.vendor.gson.stream.b.NULL) {
                    aVar.c0();
                    return null;
                }
                aVar.a();
                ArrayList arrayList = new ArrayList();
                if (aVar.K()) {
                    do {
                        try {
                            arrayList.add(interfaceC0033c0.a(this, iLogger));
                        } catch (Exception e) {
                            iLogger.v(EnumC0094u1.WARNING, "Failed to deserialize object in list.", e);
                        }
                        break;
                    } while (aVar.g0() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT);
                }
                aVar.p();
                return arrayList;
            default:
                if (l0() == io.sentry.vendor.gson.stream.b.NULL) {
                    d0();
                    return null;
                }
                try {
                    a();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayDeque arrayDeque = (ArrayDeque) this.m;
                    if (!arrayDeque.isEmpty()) {
                        do {
                            try {
                                arrayList2.add(interfaceC0033c0.a(this, iLogger));
                            } catch (Exception e2) {
                                iLogger.v(EnumC0094u1.WARNING, "Failed to deserialize object in list.", e2);
                            }
                            break;
                        } while (l0() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT);
                    }
                    if (arrayDeque.size() > 1) {
                        arrayDeque.removeLast();
                        break;
                    }
                    return arrayList2;
                } catch (Exception e3) {
                    throw new IOException(e3);
                }
        }
    }

    public final long Y() throws IOException {
        switch (this.l) {
            case 0:
                return ((io.sentry.vendor.gson.stream.a) this.m).Z();
            default:
                Object objK0 = k0();
                if (objK0 instanceof Number) {
                    return ((Number) objK0).longValue();
                }
                throw new IOException("Expected long");
        }
    }

    public final Long Z() {
        switch (this.l) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.m;
                if (aVar.g0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return Long.valueOf(aVar.Z());
                }
                aVar.c0();
                return null;
            default:
                Object objK0 = k0();
                if (objK0 instanceof Number) {
                    return Long.valueOf(((Number) objK0).longValue());
                }
                return null;
        }
    }

    public void a() throws IOException {
        ArrayDeque arrayDeque = (ArrayDeque) this.m;
        Map.Entry entry = (Map.Entry) arrayDeque.removeLast();
        if (entry == null) {
            throw new IOException("No more entries");
        }
        Object value = entry.getValue();
        if (!(value instanceof List)) {
            throw new IOException("Current token is not an object");
        }
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_ARRAY));
        List list = (List) value;
        for (int size = list.size() - 1; size >= 0; size--) {
            arrayDeque.addLast(new AbstractMap.SimpleEntry(null, list.get(size)));
        }
    }

    public final HashMap a0(ILogger iLogger, io.sentry.clientreport.a aVar) {
        switch (this.l) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar2 = (io.sentry.vendor.gson.stream.a) this.m;
                if (aVar2.g0() == io.sentry.vendor.gson.stream.b.NULL) {
                    aVar2.c0();
                    return null;
                }
                HashMap map = new HashMap();
                f();
                if (aVar2.K()) {
                    while (true) {
                        String strA0 = aVar2.a0();
                        ArrayList arrayListX = X(iLogger, aVar);
                        if (arrayListX != null) {
                            map.put(strA0, arrayListX);
                        }
                        if (aVar2.g0() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT || aVar2.g0() == io.sentry.vendor.gson.stream.b.NAME) {
                        }
                    }
                }
                i();
                return map;
            default:
                if (l0() == io.sentry.vendor.gson.stream.b.NULL) {
                    d0();
                    return null;
                }
                HashMap map2 = new HashMap();
                try {
                    f();
                    if (!((ArrayDeque) this.m).isEmpty()) {
                        while (true) {
                            String strC0 = c0();
                            ArrayList arrayListX2 = X(iLogger, aVar);
                            if (arrayListX2 != null) {
                                map2.put(strC0, arrayListX2);
                            }
                            if (l0() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT || l0() == io.sentry.vendor.gson.stream.b.NAME) {
                            }
                        }
                    }
                    i();
                    return map2;
                } catch (Exception e) {
                    throw new IOException(e);
                }
        }
    }

    public final HashMap b0(ILogger iLogger, InterfaceC0033c0 interfaceC0033c0) {
        switch (this.l) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.m;
                if (aVar.g0() == io.sentry.vendor.gson.stream.b.NULL) {
                    aVar.c0();
                    return null;
                }
                aVar.f();
                HashMap map = new HashMap();
                if (aVar.K()) {
                    while (true) {
                        try {
                            map.put(aVar.a0(), interfaceC0033c0.a(this, iLogger));
                        } catch (Exception e) {
                            iLogger.v(EnumC0094u1.WARNING, "Failed to deserialize object in map.", e);
                        }
                        if (aVar.g0() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT || aVar.g0() == io.sentry.vendor.gson.stream.b.NAME) {
                        }
                        break;
                    }
                }
                aVar.q();
                return map;
            default:
                if (l0() == io.sentry.vendor.gson.stream.b.NULL) {
                    d0();
                    return null;
                }
                try {
                    f();
                    HashMap map2 = new HashMap();
                    if (!((ArrayDeque) this.m).isEmpty()) {
                        while (true) {
                            try {
                                map2.put(c0(), interfaceC0033c0.a(this, iLogger));
                            } catch (Exception e2) {
                                iLogger.v(EnumC0094u1.WARNING, "Failed to deserialize object in map.", e2);
                            }
                            if (l0() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT || l0() == io.sentry.vendor.gson.stream.b.NAME) {
                            }
                            break;
                        }
                    }
                    i();
                    return map2;
                } catch (Exception e3) {
                    throw new IOException(e3);
                }
        }
    }

    public final String c0() {
        switch (this.l) {
            case 0:
                return ((io.sentry.vendor.gson.stream.a) this.m).a0();
            default:
                Map.Entry entry = (Map.Entry) ((ArrayDeque) this.m).peekLast();
                if (entry != null && entry.getKey() != null) {
                    return (String) entry.getKey();
                }
                throw new IOException("Expected a name but was " + l0());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.l) {
            case 0:
                ((io.sentry.vendor.gson.stream.a) this.m).close();
                break;
            default:
                ((ArrayDeque) this.m).clear();
                break;
        }
    }

    public void d0() throws IOException {
        if (k0() == null) {
            return;
        }
        throw new IOException("Expected null but was " + l0());
    }

    public final Object e0() {
        switch (this.l) {
            case 0:
                C0066n0 c0066n0 = new C0066n0();
                c0066n0.d(this);
                InterfaceC0051i0 interfaceC0051i0A = c0066n0.a();
                if (interfaceC0051i0A != null) {
                    return interfaceC0051i0A.getValue();
                }
                return null;
            default:
                return k0();
        }
    }

    public final void f() {
        switch (this.l) {
            case 0:
                ((io.sentry.vendor.gson.stream.a) this.m).f();
                return;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.m;
                Map.Entry entry = (Map.Entry) arrayDeque.removeLast();
                if (entry == null) {
                    throw new IOException("No more entries");
                }
                Object value = entry.getValue();
                if (!(value instanceof Map)) {
                    throw new IOException("Current token is not an object");
                }
                arrayDeque.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_OBJECT));
                Iterator it = ((Map) value).entrySet().iterator();
                while (it.hasNext()) {
                    arrayDeque.addLast((Map.Entry) it.next());
                }
                return;
        }
    }

    public final Object f0(ILogger iLogger, InterfaceC0033c0 interfaceC0033c0) {
        switch (this.l) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.m;
                if (aVar.g0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return interfaceC0033c0.a(this, iLogger);
                }
                aVar.c0();
                return null;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.m;
                Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
                if (entry == null) {
                    return null;
                }
                Object value = entry.getValue();
                if (iLogger != null) {
                    return interfaceC0033c0.a(this, iLogger);
                }
                arrayDeque.removeLast();
                return value;
        }
    }

    public final String g0() {
        switch (this.l) {
            case 0:
                return ((io.sentry.vendor.gson.stream.a) this.m).e0();
            default:
                String str = (String) k0();
                if (str != null) {
                    return str;
                }
                throw new IOException("Expected string");
        }
    }

    public final String h0() {
        switch (this.l) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.m;
                if (aVar.g0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return aVar.e0();
                }
                aVar.c0();
                return null;
            default:
                return (String) k0();
        }
    }

    public final void i() {
        switch (this.l) {
            case 0:
                ((io.sentry.vendor.gson.stream.a) this.m).q();
                break;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.m;
                if (arrayDeque.size() > 1) {
                    arrayDeque.removeLast();
                }
                break;
        }
    }

    public final TimeZone i0(ILogger iLogger) {
        switch (this.l) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.m;
                if (aVar.g0() == io.sentry.vendor.gson.stream.b.NULL) {
                    aVar.c0();
                    return null;
                }
                try {
                    return DesugarTimeZone.getTimeZone(aVar.e0());
                } catch (Exception e) {
                    iLogger.v(EnumC0094u1.ERROR, "Error when deserializing TimeZone", e);
                    return null;
                }
            default:
                String str = (String) k0();
                if (str != null) {
                    return DesugarTimeZone.getTimeZone(str);
                }
                return null;
        }
    }

    public final void j0(ILogger iLogger, AbstractMap abstractMap, String str) {
        switch (this.l) {
            case 0:
                try {
                    abstractMap.put(str, e0());
                } catch (Exception e) {
                    iLogger.s(EnumC0094u1.ERROR, e, "Error deserializing unknown key: %s", str);
                }
                break;
            default:
                try {
                    abstractMap.put(str, k0());
                } catch (Exception e2) {
                    iLogger.s(EnumC0094u1.ERROR, e2, "Error deserializing unknown key: %s", str);
                    return;
                }
                break;
        }
    }

    public Object k0() throws IOException {
        try {
            ArrayDeque arrayDeque = (ArrayDeque) this.m;
            Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
            if (entry == null) {
                return null;
            }
            Object value = entry.getValue();
            arrayDeque.removeLast();
            return value;
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    public final Boolean l() {
        switch (this.l) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.m;
                if (aVar.g0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return Boolean.valueOf(aVar.W());
                }
                aVar.c0();
                return null;
            default:
                return (Boolean) k0();
        }
    }

    public final io.sentry.vendor.gson.stream.b l0() {
        switch (this.l) {
            case 0:
                return ((io.sentry.vendor.gson.stream.a) this.m).g0();
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.m;
                if (arrayDeque.isEmpty()) {
                    return io.sentry.vendor.gson.stream.b.END_DOCUMENT;
                }
                Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
                if (entry == null) {
                    return io.sentry.vendor.gson.stream.b.END_DOCUMENT;
                }
                if (entry.getKey() != null) {
                    return io.sentry.vendor.gson.stream.b.NAME;
                }
                Object value = entry.getValue();
                if (value instanceof Map) {
                    return io.sentry.vendor.gson.stream.b.BEGIN_OBJECT;
                }
                if (value instanceof List) {
                    return io.sentry.vendor.gson.stream.b.BEGIN_ARRAY;
                }
                if (value instanceof String) {
                    return io.sentry.vendor.gson.stream.b.STRING;
                }
                if (value instanceof Number) {
                    return io.sentry.vendor.gson.stream.b.NUMBER;
                }
                if (value instanceof Boolean) {
                    return io.sentry.vendor.gson.stream.b.BOOLEAN;
                }
                return value instanceof io.sentry.vendor.gson.stream.b ? (io.sentry.vendor.gson.stream.b) value : io.sentry.vendor.gson.stream.b.END_DOCUMENT;
        }
    }

    public final void m0(boolean z) {
        switch (this.l) {
            case 0:
                ((io.sentry.vendor.gson.stream.a) this.m).m = z;
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:64:0x00a5. Please report as an issue. */
    public final void o0() throws IOException {
        io.sentry.vendor.gson.stream.a aVar;
        switch (this.l) {
            case 0:
                int i = 0;
                do {
                    aVar = (io.sentry.vendor.gson.stream.a) this.m;
                    int iL = aVar.s;
                    if (iL == 0) {
                        iL = aVar.l();
                    }
                    if (iL == 3) {
                        aVar.h0(1);
                    } else {
                        if (iL == 1) {
                            aVar.h0(3);
                        } else if (iL == 4 || iL == 2) {
                            aVar.x--;
                            i--;
                        } else if (iL == 14 || iL == 10) {
                            while (true) {
                                int i2 = 0;
                                while (true) {
                                    int i3 = aVar.f152o + i2;
                                    if (i3 < aVar.p) {
                                        char c = aVar.n[i3];
                                        if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                                            if (c != '#') {
                                                if (c != ',') {
                                                    if (c != '/' && c != '=') {
                                                        if (c != '{' && c != '}' && c != ':') {
                                                            if (c != ';') {
                                                                switch (c) {
                                                                    case Yu0.b.P /* 91 */:
                                                                    case Yu0.b.Q /* 93 */:
                                                                        break;
                                                                    case '\\':
                                                                        break;
                                                                    default:
                                                                        i2++;
                                                                        break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            aVar.i();
                                        }
                                        aVar.f152o += i2;
                                    } else {
                                        aVar.f152o = i3;
                                        if (!aVar.t(1)) {
                                        }
                                    }
                                }
                            }
                        } else if (iL == 8 || iL == 12) {
                            aVar.j0('\'');
                        } else if (iL == 9 || iL == 13) {
                            aVar.j0('\"');
                        } else if (iL == 16) {
                            aVar.f152o += aVar.u;
                        }
                        aVar.s = 0;
                    }
                    i++;
                    aVar.s = 0;
                } while (i != 0);
                int[] iArr = aVar.z;
                int i4 = aVar.x - 1;
                iArr[i4] = iArr[i4] + 1;
                aVar.y[i4] = "null";
                break;
        }
    }

    public final Date p(ILogger iLogger) {
        switch (this.l) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.m;
                if (aVar.g0() == io.sentry.vendor.gson.stream.b.NULL) {
                    aVar.c0();
                    return null;
                }
                String strE0 = aVar.e0();
                if (strE0 == null) {
                    return null;
                }
                try {
                    try {
                        return io.sentry.config.a.l(strE0);
                    } catch (Exception e) {
                        iLogger.v(EnumC0094u1.ERROR, "Error when deserializing millis timestamp format.", e);
                        return null;
                    }
                } catch (Exception unused) {
                    return io.sentry.config.a.m(strE0);
                }
            default:
                String str = (String) k0();
                if (str == null) {
                    return null;
                }
                try {
                    try {
                        return io.sentry.config.a.l(str);
                    } catch (Exception unused2) {
                        return io.sentry.config.a.m(str);
                    }
                } catch (Exception e2) {
                    iLogger.v(EnumC0094u1.ERROR, "Error when deserializing millis timestamp format.", e2);
                    return null;
                }
        }
    }

    public final double q() throws IOException {
        switch (this.l) {
            case 0:
                return ((io.sentry.vendor.gson.stream.a) this.m).X();
            default:
                Object objK0 = k0();
                if (objK0 instanceof Number) {
                    return ((Number) objK0).doubleValue();
                }
                throw new IOException("Expected double");
        }
    }

    public final Double t() {
        switch (this.l) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.m;
                if (aVar.g0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return Double.valueOf(aVar.X());
                }
                aVar.c0();
                return null;
            default:
                Object objK0 = k0();
                if (objK0 instanceof Number) {
                    return Double.valueOf(((Number) objK0).doubleValue());
                }
                return null;
        }
    }

    public C0069o0(Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.m = arrayDeque;
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, map));
    }

    private final void p0() {
    }

    private final void n0(boolean z) {
    }
}
