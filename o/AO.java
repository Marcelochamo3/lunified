package o;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class AO extends IO implements InterfaceC3037vO {
    public final Context Q0;
    public final C1364e7 R0;
    public final InterfaceC1852j7 S0;
    public int T0;
    public boolean U0;
    public C0643Nw V0;
    public C0643Nw W0;
    public long X0;
    public boolean Y0;
    public boolean Z0;
    public boolean a1;
    public C1140bs b1;

    public AO(Context context, C2102ll c2102ll, JO jo, boolean z, Handler handler, SurfaceHolderCallbackC0898Xr surfaceHolderCallbackC0898Xr, C1904jk c1904jk) {
        super(1, c2102ll, jo, z, 44100.0f);
        this.Q0 = context.getApplicationContext();
        this.S0 = c1904jk;
        this.R0 = new C1364e7(handler, surfaceHolderCallbackC0898Xr, 0);
        c1904jk.r = new C0334By(14, this);
    }

    public static M60 s0(JO jo, C0643Nw c0643Nw, boolean z, InterfaceC1852j7 interfaceC1852j7) {
        List listD;
        if (c0643Nw.w == null) {
            XE xe = AbstractC0985aF.m;
            return M60.p;
        }
        if (((C1904jk) interfaceC1852j7).g(c0643Nw) != 0) {
            List listE = OO.e("audio/raw", false, false);
            EO eo = listE.isEmpty() ? null : (EO) listE.get(0);
            if (eo != null) {
                return AbstractC0985aF.q(eo);
            }
        }
        Pattern pattern = OO.a;
        List listD2 = jo.d(c0643Nw.w, z, false);
        String strB = OO.b(c0643Nw);
        if (strB == null) {
            XE xe2 = AbstractC0985aF.m;
            listD = M60.p;
        } else {
            listD = jo.d(strB, z, false);
        }
        XE xe3 = AbstractC0985aF.m;
        WE we = new WE();
        we.d(listD2);
        we.d(listD);
        return we.g();
    }

    @Override // o.IO
    public final C0708Qj B(EO eo, C0643Nw c0643Nw, C0643Nw c0643Nw2) {
        C0708Qj c0708QjB = eo.b(c0643Nw, c0643Nw2);
        boolean z = this.O == null && m0(c0643Nw2);
        int i = c0708QjB.e;
        if (z) {
            i |= 32768;
        }
        if (r0(eo, c0643Nw2) > this.T0) {
            i |= 64;
        }
        int i2 = i;
        return new C0708Qj(eo.a, c0643Nw, c0643Nw2, i2 != 0 ? 0 : c0708QjB.d, i2);
    }

    @Override // o.IO
    public final float L(float f, C0643Nw[] c0643NwArr) {
        int iMax = -1;
        for (C0643Nw c0643Nw : c0643NwArr) {
            int i = c0643Nw.K;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f * iMax;
    }

    @Override // o.IO
    public final ArrayList M(JO jo, C0643Nw c0643Nw, boolean z) {
        M60 m60S0 = s0(jo, c0643Nw, z, this.S0);
        Pattern pattern = OO.a;
        ArrayList arrayList = new ArrayList(m60S0);
        Collections.sort(arrayList, new C0419Ff(1, new C2278nc(18, c0643Nw)));
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ad  */
    @Override // o.IO
    public final C3134wO N(EO eo, C0643Nw c0643Nw, MediaCrypto mediaCrypto, float f) {
        boolean z;
        C0643Nw[] c0643NwArr = this.t;
        c0643NwArr.getClass();
        int iR0 = r0(eo, c0643Nw);
        if (c0643NwArr.length != 1) {
            for (C0643Nw c0643Nw2 : c0643NwArr) {
                if (eo.b(c0643Nw, c0643Nw2).d != 0) {
                    iR0 = Math.max(iR0, r0(eo, c0643Nw2));
                }
            }
        }
        this.T0 = iR0;
        int i = Lr0.a;
        if (i < 24 && "OMX.SEC.aac.dec".equals(eo.a) && "samsung".equals(Lr0.c)) {
            String str = Lr0.b;
            if (str.startsWith("zeroflte") || str.startsWith("herolte") || str.startsWith("heroqlte")) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.U0 = z;
        int i2 = this.T0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", eo.c);
        mediaFormat.setInteger("channel-count", c0643Nw.J);
        int i3 = c0643Nw.K;
        mediaFormat.setInteger("sample-rate", i3);
        AbstractC1370eA.N(mediaFormat, c0643Nw.y);
        AbstractC1370eA.F(mediaFormat, "max-input-size", i2);
        if (i >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                if (i == 23) {
                    String str2 = Lr0.d;
                    if (!"ZTE B2017G".equals(str2) && !"AXON 7 mini".equals(str2)) {
                        mediaFormat.setFloat("operating-rate", f);
                    }
                } else {
                    mediaFormat.setFloat("operating-rate", f);
                }
            }
        }
        String str3 = c0643Nw.w;
        if (i <= 28 && "audio/ac4".equals(str3)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i >= 24) {
            C0617Mw c0617Mw = new C0617Mw();
            c0617Mw.k = "audio/raw";
            c0617Mw.x = c0643Nw.J;
            c0617Mw.y = i3;
            c0617Mw.z = 4;
            if (((C1904jk) this.S0).g(new C0643Nw(c0617Mw)) == 2) {
                mediaFormat.setInteger("pcm-encoding", 4);
            }
        }
        if (i >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        this.W0 = (!"audio/raw".equals(eo.b) || "audio/raw".equals(str3)) ? null : c0643Nw;
        return new C3134wO(eo, mediaFormat, c0643Nw, null, mediaCrypto);
    }

    @Override // o.IO
    public final void S(Exception exc) {
        AP.g("Audio codec error", exc);
        C1364e7 c1364e7 = this.R0;
        Handler handler = c1364e7.b;
        if (handler != null) {
            handler.post(new Z6(c1364e7, exc, 0));
        }
    }

    @Override // o.IO
    public final void T(long j, long j2, String str) {
        C1364e7 c1364e7 = this.R0;
        Handler handler = c1364e7.b;
        if (handler != null) {
            handler.post(new Y6(c1364e7, str, j, j2, 0));
        }
    }

    @Override // o.IO
    public final void U(String str) {
        C1364e7 c1364e7 = this.R0;
        Handler handler = c1364e7.b;
        if (handler != null) {
            handler.post(new O3(c1364e7, 1, str));
        }
    }

    @Override // o.IO
    public final C0708Qj V(C2994uv c2994uv) throws Lr {
        C0643Nw c0643Nw = (C0643Nw) c2994uv.n;
        c0643Nw.getClass();
        this.V0 = c0643Nw;
        C0708Qj c0708QjV = super.V(c2994uv);
        C0643Nw c0643Nw2 = this.V0;
        C1364e7 c1364e7 = this.R0;
        Handler handler = c1364e7.b;
        if (handler != null) {
            handler.post(new RunnableC1169c7(c1364e7, c0643Nw2, c0708QjV, 0));
        }
        return c0708QjV;
    }

    @Override // o.IO
    public final void W(C0643Nw c0643Nw, MediaFormat mediaFormat) throws Lr {
        int iX;
        int i;
        C0643Nw c0643Nw2 = this.W0;
        int[] iArr = null;
        if (c0643Nw2 != null) {
            c0643Nw = c0643Nw2;
        } else if (this.U != null) {
            if ("audio/raw".equals(c0643Nw.w)) {
                iX = c0643Nw.L;
            } else if (Lr0.a < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iX = mediaFormat.containsKey("v-bits-per-sample") ? Lr0.x(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iX = mediaFormat.getInteger("pcm-encoding");
            }
            C0617Mw c0617Mw = new C0617Mw();
            c0617Mw.k = "audio/raw";
            c0617Mw.z = iX;
            c0617Mw.A = c0643Nw.M;
            c0617Mw.B = c0643Nw.N;
            c0617Mw.x = mediaFormat.getInteger("channel-count");
            c0617Mw.y = mediaFormat.getInteger("sample-rate");
            C0643Nw c0643Nw3 = new C0643Nw(c0617Mw);
            if (this.U0 && c0643Nw3.J == 6 && (i = c0643Nw.J) < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = i2;
                }
            }
            c0643Nw = c0643Nw3;
        }
        try {
            ((C1904jk) this.S0).b(c0643Nw, iArr);
        } catch (C1462f7 e) {
            throw e(e, e.l, false, 5001);
        }
    }

    @Override // o.IO
    public final void X() {
        this.S0.getClass();
    }

    @Override // o.IO
    public final void Z() {
        ((C1904jk) this.S0).K = true;
    }

    @Override // o.InterfaceC3037vO
    public final void a(C1591gZ c1591gZ) {
        C1904jk c1904jk = (C1904jk) this.S0;
        c1904jk.getClass();
        c1904jk.B = new C1591gZ(Lr0.i(c1591gZ.l, 0.1f, 8.0f), Lr0.i(c1591gZ.m, 0.1f, 8.0f));
        if (c1904jk.s()) {
            c1904jk.r();
            return;
        }
        C1612gk c1612gk = new C1612gk(c1591gZ, -9223372036854775807L, -9223372036854775807L);
        if (c1904jk.m()) {
            c1904jk.z = c1612gk;
        } else {
            c1904jk.A = c1612gk;
        }
    }

    @Override // o.IO
    public final void a0(C0656Oj c0656Oj) {
        if (!this.Y0 || c0656Oj.j(Integer.MIN_VALUE)) {
            return;
        }
        if (Math.abs(c0656Oj.q - this.X0) > 500000) {
            this.X0 = c0656Oj.q;
        }
        this.Y0 = false;
    }

    @Override // o.InterfaceC3037vO
    public final C1591gZ b() {
        return ((C1904jk) this.S0).B;
    }

    @Override // o.AbstractC1952k8, o.AZ
    public final void c(int i, Object obj) {
        InterfaceC1852j7 interfaceC1852j7 = this.S0;
        if (i == 2) {
            float fFloatValue = ((Float) obj).floatValue();
            C1904jk c1904jk = (C1904jk) interfaceC1852j7;
            if (c1904jk.N != fFloatValue) {
                c1904jk.N = fFloatValue;
                if (c1904jk.m()) {
                    if (Lr0.a >= 21) {
                        c1904jk.v.setVolume(c1904jk.N);
                        return;
                    }
                    AudioTrack audioTrack = c1904jk.v;
                    float f = c1904jk.N;
                    audioTrack.setStereoVolume(f, f);
                }
                return;
            }
            return;
        }
        if (i == 3) {
            I6 i6 = (I6) obj;
            C1904jk c1904jk2 = (C1904jk) interfaceC1852j7;
            if (c1904jk2.y.equals(i6)) {
                return;
            }
            c1904jk2.y = i6;
            if (c1904jk2.a0) {
                return;
            }
            c1904jk2.d();
            return;
        }
        if (i == 6) {
            C2823t7 c2823t7 = (C2823t7) obj;
            C1904jk c1904jk3 = (C1904jk) interfaceC1852j7;
            if (c1904jk3.Y.equals(c2823t7)) {
                return;
            }
            c2823t7.getClass();
            if (c1904jk3.v != null) {
                c1904jk3.Y.getClass();
            }
            c1904jk3.Y = c2823t7;
            return;
        }
        switch (i) {
            case 9:
                C1904jk c1904jk4 = (C1904jk) interfaceC1852j7;
                c1904jk4.C = ((Boolean) obj).booleanValue();
                C1612gk c1612gk = new C1612gk(c1904jk4.s() ? C1591gZ.f794o : c1904jk4.B, -9223372036854775807L, -9223372036854775807L);
                if (!c1904jk4.m()) {
                    c1904jk4.A = c1612gk;
                } else {
                    c1904jk4.z = c1612gk;
                }
                break;
            case 10:
                int iIntValue = ((Integer) obj).intValue();
                C1904jk c1904jk5 = (C1904jk) interfaceC1852j7;
                if (c1904jk5.X != iIntValue) {
                    c1904jk5.X = iIntValue;
                    c1904jk5.W = iIntValue != 0;
                    c1904jk5.d();
                }
                break;
            case 11:
                this.b1 = (C1140bs) obj;
                break;
            case 12:
                if (Lr0.a >= 23) {
                    AbstractC3425zO.a(interfaceC1852j7, obj);
                }
                break;
        }
    }

    @Override // o.InterfaceC3037vO
    public final long d() {
        if (this.r == 2) {
            t0();
        }
        return this.X0;
    }

    @Override // o.IO
    public final boolean d0(long j, long j2, InterfaceC3328yO interfaceC3328yO, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C0643Nw c0643Nw) throws Lr {
        byteBuffer.getClass();
        if (this.W0 != null && (i2 & 2) != 0) {
            interfaceC3328yO.getClass();
            interfaceC3328yO.f(i, false);
            return true;
        }
        InterfaceC1852j7 interfaceC1852j7 = this.S0;
        if (z) {
            if (interfaceC3328yO != null) {
                interfaceC3328yO.f(i, false);
            }
            this.L0.f += i3;
            ((C1904jk) interfaceC1852j7).K = true;
            return true;
        }
        try {
            if (!((C1904jk) interfaceC1852j7).j(byteBuffer, j3, i3)) {
                return false;
            }
            if (interfaceC3328yO != null) {
                interfaceC3328yO.f(i, false);
            }
            this.L0.e += i3;
            return true;
        } catch (C1560g7 e) {
            throw e(e, this.V0, e.m, 5001);
        } catch (C1756i7 e2) {
            throw e(e2, c0643Nw, e2.m, 5002);
        }
    }

    @Override // o.IO
    public final void g0() throws Lr {
        try {
            C1904jk c1904jk = (C1904jk) this.S0;
            if (!c1904jk.T && c1904jk.m() && c1904jk.c()) {
                c1904jk.o();
                c1904jk.T = true;
            }
        } catch (C1756i7 e) {
            throw e(e, e.n, e.m, 5002);
        }
    }

    @Override // o.AbstractC1952k8
    public final String h() {
        return "MediaCodecAudioRenderer";
    }

    @Override // o.AbstractC1952k8
    public final boolean j() {
        if (this.H0) {
            C1904jk c1904jk = (C1904jk) this.S0;
            if (!c1904jk.m() || (c1904jk.T && !c1904jk.k())) {
                return true;
            }
        }
        return false;
    }

    @Override // o.IO, o.AbstractC1952k8
    public final boolean k() {
        return ((C1904jk) this.S0).k() || super.k();
    }

    @Override // o.IO, o.AbstractC1952k8
    public final void l() {
        C1364e7 c1364e7 = this.R0;
        this.a1 = true;
        this.V0 = null;
        try {
            ((C1904jk) this.S0).d();
            try {
                super.l();
            } finally {
                c1364e7.a(this.L0);
            }
        } catch (Throwable th) {
            try {
                super.l();
                throw th;
            } finally {
                c1364e7.a(this.L0);
            }
        }
    }

    @Override // o.AbstractC1952k8
    public final void m(boolean z, boolean z2) {
        C0579Lj c0579Lj = new C0579Lj();
        this.L0 = c0579Lj;
        C1364e7 c1364e7 = this.R0;
        Handler handler = c1364e7.b;
        if (handler != null) {
            handler.post(new RunnableC1072b7(c1364e7, c0579Lj, 0));
        }
        Y60 y60 = this.f862o;
        y60.getClass();
        boolean z3 = y60.a;
        InterfaceC1852j7 interfaceC1852j7 = this.S0;
        if (z3) {
            C1904jk c1904jk = (C1904jk) interfaceC1852j7;
            c1904jk.getClass();
            AbstractC0397Ej.f(Lr0.a >= 21);
            AbstractC0397Ej.f(c1904jk.W);
            if (!c1904jk.a0) {
                c1904jk.a0 = true;
                c1904jk.d();
            }
        } else {
            C1904jk c1904jk2 = (C1904jk) interfaceC1852j7;
            if (c1904jk2.a0) {
                c1904jk2.a0 = false;
                c1904jk2.d();
            }
        }
        C3436zZ c3436zZ = this.q;
        c3436zZ.getClass();
        ((C1904jk) interfaceC1852j7).q = c3436zZ;
    }

    @Override // o.IO
    public final boolean m0(C0643Nw c0643Nw) {
        return ((C1904jk) this.S0).g(c0643Nw) != 0;
    }

    @Override // o.IO, o.AbstractC1952k8
    public final void n(long j, boolean z) throws Lr {
        super.n(j, z);
        ((C1904jk) this.S0).d();
        this.X0 = j;
        this.Y0 = true;
        this.Z0 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
    
        if ((r4.isEmpty() ? null : (o.EO) r4.get(0)) != null) goto L30;
     */
    @Override // o.IO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int n0(o.JO r12, o.C0643Nw r13) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AO.n0(o.JO, o.Nw):int");
    }

    @Override // o.AbstractC1952k8
    public final void o() {
        O6 o6;
        Q6 q6 = ((C1904jk) this.S0).x;
        if (q6 == null || !q6.a) {
            return;
        }
        q6.h = null;
        int i = Lr0.a;
        Context context = (Context) q6.b;
        if (i >= 23 && (o6 = (O6) q6.e) != null) {
            N6.b(context, o6);
        }
        C1066b4 c1066b4 = (C1066b4) q6.f;
        if (c1066b4 != null) {
            context.unregisterReceiver(c1066b4);
        }
        P6 p6 = (P6) q6.g;
        if (p6 != null) {
            p6.a.unregisterContentObserver(p6);
        }
        q6.a = false;
    }

    @Override // o.AbstractC1952k8
    public final void p() {
        InterfaceC1852j7 interfaceC1852j7 = this.S0;
        try {
            try {
                D();
                f0();
                InterfaceC3465zo interfaceC3465zo = this.O;
                if (interfaceC3465zo != null) {
                    interfaceC3465zo.d(null);
                }
                this.O = null;
                if (this.a1) {
                    this.a1 = false;
                    ((C1904jk) interfaceC1852j7).q();
                }
            } catch (Throwable th) {
                InterfaceC3465zo interfaceC3465zo2 = this.O;
                if (interfaceC3465zo2 != null) {
                    interfaceC3465zo2.d(null);
                }
                this.O = null;
                throw th;
            }
        } catch (Throwable th2) {
            if (this.a1) {
                this.a1 = false;
                ((C1904jk) interfaceC1852j7).q();
            }
            throw th2;
        }
    }

    @Override // o.AbstractC1952k8
    public final void q() {
        C1904jk c1904jk = (C1904jk) this.S0;
        c1904jk.V = true;
        if (c1904jk.m()) {
            C2145m7 c2145m7 = c1904jk.i.f;
            c2145m7.getClass();
            c2145m7.a();
            c1904jk.v.play();
        }
    }

    @Override // o.AbstractC1952k8
    public final void r() {
        t0();
        C1904jk c1904jk = (C1904jk) this.S0;
        c1904jk.V = false;
        if (c1904jk.m()) {
            C2242n7 c2242n7 = c1904jk.i;
            c2242n7.d();
            if (c2242n7.y == -9223372036854775807L) {
                C2145m7 c2145m7 = c2242n7.f;
                c2145m7.getClass();
                c2145m7.a();
                c1904jk.v.pause();
            }
        }
    }

    public final int r0(EO eo, C0643Nw c0643Nw) {
        int i;
        if (!"OMX.google.raw.decoder".equals(eo.a) || (i = Lr0.a) >= 24 || (i == 23 && Lr0.J(this.Q0))) {
            return c0643Nw.x;
        }
        return -1;
    }

    public final void t0() {
        long jMax;
        ArrayDeque arrayDeque;
        long jV;
        long jR;
        boolean zJ = j();
        C1904jk c1904jk = (C1904jk) this.S0;
        if (!c1904jk.m() || c1904jk.L) {
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(c1904jk.i.a(zJ), Lr0.Q(c1904jk.t.e, c1904jk.i()));
            while (true) {
                arrayDeque = c1904jk.j;
                if (arrayDeque.isEmpty() || jMin < ((C1612gk) arrayDeque.getFirst()).c) {
                    break;
                } else {
                    c1904jk.A = (C1612gk) arrayDeque.remove();
                }
            }
            C1612gk c1612gk = c1904jk.A;
            long j = jMin - c1612gk.c;
            boolean zEquals = c1612gk.a.equals(C1591gZ.f794o);
            Na0 na0 = c1904jk.b;
            if (zEquals) {
                jV = c1904jk.A.b + j;
            } else if (arrayDeque.isEmpty()) {
                C1993kf0 c1993kf0 = (C1993kf0) na0.f414o;
                if (c1993kf0.f869o >= 1024) {
                    long j2 = c1993kf0.n;
                    C1895jf0 c1895jf0 = c1993kf0.j;
                    c1895jf0.getClass();
                    long j3 = j2 - ((long) ((c1895jf0.k * c1895jf0.b) * 2));
                    int i = c1993kf0.h.a;
                    int i2 = c1993kf0.g.a;
                    jR = i == i2 ? Lr0.R(j, j3, c1993kf0.f869o) : Lr0.R(j, j3 * ((long) i), c1993kf0.f869o * ((long) i2));
                } else {
                    jR = (long) (((double) c1993kf0.c) * j);
                }
                jV = jR + c1904jk.A.b;
            } else {
                C1612gk c1612gk2 = (C1612gk) arrayDeque.getFirst();
                jV = c1612gk2.b - Lr0.v(c1612gk2.c - jMin, c1904jk.A.a.l);
            }
            jMax = Lr0.Q(c1904jk.t.e, ((Md0) na0.n).t) + jV;
        }
        if (jMax != Long.MIN_VALUE) {
            if (!this.Z0) {
                jMax = Math.max(this.X0, jMax);
            }
            this.X0 = jMax;
            this.Z0 = false;
        }
    }

    @Override // o.AbstractC1952k8
    public final InterfaceC3037vO g() {
        return this;
    }
}
