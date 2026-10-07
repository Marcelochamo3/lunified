package io.sentry;

import io.sentry.protocol.C0074a;
import io.sentry.protocol.C0075b;
import io.sentry.protocol.C0076c;
import io.sentry.protocol.C0077d;
import io.sentry.protocol.C0079f;
import io.sentry.protocol.C0080g;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.EnumC0078e;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0087s0 implements U {
    public static final Charset n = Charset.forName("UTF-8");
    public final I1 l;
    public final HashMap m;

    public C0087s0(I1 i1) {
        this.l = i1;
        HashMap map = new HashMap();
        this.m = map;
        map.put(C0074a.class, new io.sentry.clientreport.a(4));
        map.put(C0041f.class, new C0038e(0));
        map.put(C0075b.class, new io.sentry.clientreport.a(5));
        map.put(C0076c.class, new io.sentry.clientreport.a(6));
        map.put(DebugImage.class, new io.sentry.clientreport.a(7));
        map.put(C0077d.class, new io.sentry.clientreport.a(8));
        map.put(C0079f.class, new io.sentry.clientreport.a(9));
        map.put(EnumC0078e.class, new io.sentry.clientreport.a(10));
        map.put(io.sentry.protocol.h.class, new io.sentry.clientreport.a(12));
        map.put(io.sentry.protocol.i.class, new io.sentry.clientreport.a(13));
        map.put(io.sentry.protocol.j.class, new io.sentry.clientreport.a(14));
        map.put(io.sentry.protocol.k.class, new io.sentry.clientreport.a(15));
        map.put(io.sentry.protocol.l.class, new io.sentry.clientreport.a(16));
        map.put(io.sentry.protocol.m.class, new io.sentry.clientreport.a(17));
        map.put(J0.class, new C0038e(1));
        map.put(K0.class, new C0038e(2));
        map.put(io.sentry.profilemeasurements.a.class, new io.sentry.clientreport.a(2));
        map.put(io.sentry.profilemeasurements.b.class, new io.sentry.clientreport.a(3));
        map.put(io.sentry.protocol.n.class, new io.sentry.clientreport.a(18));
        map.put(P0.class, new C0038e(3));
        map.put(io.sentry.rrweb.a.class, new io.sentry.protocol.D(3));
        map.put(io.sentry.rrweb.c.class, new io.sentry.protocol.D(4));
        map.put(io.sentry.rrweb.g.class, new io.sentry.protocol.D(6));
        map.put(io.sentry.rrweb.i.class, new io.sentry.protocol.D(8));
        map.put(io.sentry.rrweb.j.class, new io.sentry.protocol.D(10));
        map.put(io.sentry.rrweb.k.class, new io.sentry.protocol.D(11));
        map.put(io.sentry.rrweb.l.class, new io.sentry.protocol.D(12));
        map.put(io.sentry.protocol.q.class, new io.sentry.clientreport.a(19));
        map.put(io.sentry.protocol.r.class, new io.sentry.clientreport.a(20));
        map.put(C0055j1.class, new C0038e(5));
        map.put(C0073p1.class, new C0038e(6));
        map.put(C0083q1.class, new C0038e(7));
        map.put(io.sentry.protocol.s.class, new io.sentry.clientreport.a(21));
        map.put(EnumC0091t1.class, new C0038e(8));
        map.put(EnumC0094u1.class, new C0038e(9));
        map.put(C0097v1.class, new C0038e(10));
        map.put(io.sentry.protocol.u.class, new io.sentry.clientreport.a(23));
        map.put(io.sentry.protocol.v.class, new io.sentry.clientreport.a(24));
        map.put(K1.class, new C0038e(11));
        map.put(io.sentry.protocol.w.class, new io.sentry.clientreport.a(25));
        map.put(io.sentry.protocol.x.class, new io.sentry.clientreport.a(26));
        map.put(io.sentry.protocol.y.class, new io.sentry.clientreport.a(27));
        map.put(C0034c1.class, new C0038e(4));
        map.put(io.sentry.protocol.z.class, new io.sentry.clientreport.a(28));
        map.put(io.sentry.protocol.A.class, new io.sentry.clientreport.a(29));
        map.put(S1.class, new C0038e(13));
        map.put(U1.class, new C0038e(14));
        map.put(W1.class, new C0038e(15));
        map.put(Y1.class, new C0038e(16));
        map.put(io.sentry.protocol.E.class, new io.sentry.protocol.D(0));
        map.put(C0080g.class, new io.sentry.clientreport.a(11));
        map.put(j2.class, new C0038e(19));
        map.put(io.sentry.clientreport.b.class, new io.sentry.clientreport.a(0));
        map.put(io.sentry.protocol.G.class, new io.sentry.protocol.D(2));
        map.put(io.sentry.protocol.F.class, new io.sentry.protocol.D(1));
    }

    public final String a(Object obj, boolean z) throws IOException {
        StringWriter stringWriter = new StringWriter();
        I1 i1 = this.l;
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(stringWriter, i1.getMaxDepth());
        if (z) {
            io.sentry.vendor.gson.stream.c cVar2 = (io.sentry.vendor.gson.stream.c) cVar.b;
            cVar2.getClass();
            cVar2.f153o = "\t";
            cVar2.p = ": ";
        }
        ((C0072p0) cVar.c).f(cVar, i1.getLogger(), obj);
        return stringWriter.toString();
    }

    @Override // io.sentry.U
    public final Object b(Reader reader, Class cls) {
        I1 i1 = this.l;
        try {
            C0069o0 c0069o0 = new C0069o0(reader);
            try {
                InterfaceC0033c0 interfaceC0033c0 = (InterfaceC0033c0) this.m.get(cls);
                if (interfaceC0033c0 != null) {
                    Object objCast = cls.cast(interfaceC0033c0.a(c0069o0, i1.getLogger()));
                    c0069o0.close();
                    return objCast;
                }
                if (!cls.isArray() && !Collection.class.isAssignableFrom(cls) && !String.class.isAssignableFrom(cls) && !Map.class.isAssignableFrom(cls)) {
                    c0069o0.close();
                    return null;
                }
                Object objE0 = c0069o0.e0();
                c0069o0.close();
                return objE0;
            } catch (Throwable th) {
                try {
                    c0069o0.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            i1.getLogger().v(EnumC0094u1.ERROR, "Error when deserializing", e);
            return null;
        }
    }

    @Override // io.sentry.U
    public final C0088s1 k(BufferedInputStream bufferedInputStream) {
        I1 i1 = this.l;
        try {
            return i1.getEnvelopeReader().x(bufferedInputStream);
        } catch (IOException e) {
            i1.getLogger().v(EnumC0094u1.ERROR, "Error deserializing envelope.", e);
            return null;
        }
    }

    @Override // io.sentry.U
    public final String o(Map map) {
        return a(map, false);
    }

    @Override // io.sentry.U
    public final Object p(BufferedReader bufferedReader, Class cls, C0038e c0038e) {
        I1 i1 = this.l;
        try {
            C0069o0 c0069o0 = new C0069o0(bufferedReader);
            try {
                if (!Collection.class.isAssignableFrom(cls)) {
                    Object objE0 = c0069o0.e0();
                    c0069o0.close();
                    return objE0;
                }
                if (c0038e == null) {
                    Object objE1 = c0069o0.e0();
                    c0069o0.close();
                    return objE1;
                }
                ArrayList arrayListX = c0069o0.X(i1.getLogger(), c0038e);
                c0069o0.close();
                return arrayListX;
            } catch (Throwable th) {
                try {
                    c0069o0.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            i1.getLogger().v(EnumC0094u1.ERROR, "Error when deserializing", th3);
            return null;
        }
    }

    @Override // io.sentry.U
    public final void r(C0088s1 c0088s1, OutputStream outputStream) throws IOException {
        I1 i1 = this.l;
        io.sentry.config.a.C(c0088s1, "The SentryEnvelope object is required.");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), n));
        try {
            ((C0055j1) c0088s1.l).serialize(new io.sentry.internal.debugmeta.c(bufferedWriter, i1.getMaxDepth()), i1.getLogger());
            bufferedWriter.write("\n");
            for (C0070o1 c0070o1 : (Iterable) c0088s1.m) {
                try {
                    byte[] bArrD = c0070o1.d();
                    c0070o1.a.serialize(new io.sentry.internal.debugmeta.c(bufferedWriter, i1.getMaxDepth()), i1.getLogger());
                    bufferedWriter.write("\n");
                    bufferedWriter.flush();
                    outputStream.write(bArrD);
                    bufferedWriter.write("\n");
                } catch (Exception e) {
                    i1.getLogger().v(EnumC0094u1.ERROR, "Failed to create envelope item. Dropping it.", e);
                }
            }
            bufferedWriter.flush();
        } catch (Throwable th) {
            bufferedWriter.flush();
            throw th;
        }
    }

    @Override // io.sentry.U
    public final void z(Object obj, BufferedWriter bufferedWriter) throws IOException {
        io.sentry.config.a.C(obj, "The entity is required.");
        I1 i1 = this.l;
        ILogger logger = i1.getLogger();
        EnumC0094u1 enumC0094u1 = EnumC0094u1.DEBUG;
        if (logger.n(enumC0094u1)) {
            i1.getLogger().h(enumC0094u1, "Serializing object: %s", a(obj, i1.isEnablePrettySerializationOutput()));
        }
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(bufferedWriter, i1.getMaxDepth());
        ((C0072p0) cVar.c).f(cVar, i1.getLogger(), obj);
        bufferedWriter.flush();
    }
}
