package o;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class IO extends AbstractC1952k8 {
    public static final byte[] P0 = {0, 0, 1, 103, 66, -64, C3285xv.h, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final JO A;
    public int A0;
    public final boolean B;
    public boolean B0;
    public final float C;
    public boolean C0;
    public final C0656Oj D;
    public boolean D0;
    public final C0656Oj E;
    public long E0;
    public final C0656Oj F;
    public long F0;
    public final C3407z8 G;
    public boolean G0;
    public final ArrayList H;
    public boolean H0;
    public final MediaCodec.BufferInfo I;
    public boolean I0;
    public final ArrayDeque J;
    public boolean J0;
    public final FV K;
    public Lr K0;
    public C0643Nw L;
    public C0579Lj L0;
    public C0643Nw M;
    public HO M0;
    public InterfaceC3465zo N;
    public long N0;
    public InterfaceC3465zo O;
    public boolean O0;
    public MediaCrypto P;
    public boolean Q;
    public final long R;
    public float S;
    public float T;
    public InterfaceC3328yO U;
    public C0643Nw V;
    public MediaFormat W;
    public boolean X;
    public float Y;
    public ArrayDeque Z;
    public GO a0;
    public EO b0;
    public int c0;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public C2565qa n0;
    public long o0;
    public int p0;
    public int q0;
    public ByteBuffer r0;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public int y0;
    public final InterfaceC3231xO z;
    public int z0;

    public IO(int i, C2102ll c2102ll, JO jo, boolean z, float f) {
        super(i);
        this.z = c2102ll;
        jo.getClass();
        this.A = jo;
        this.B = z;
        this.C = f;
        this.D = new C0656Oj(0);
        this.E = new C0656Oj(0);
        this.F = new C0656Oj(2);
        C3407z8 c3407z8 = new C3407z8(2);
        c3407z8.w = 32;
        this.G = c3407z8;
        this.H = new ArrayList();
        this.I = new MediaCodec.BufferInfo();
        this.S = 1.0f;
        this.T = 1.0f;
        this.R = -9223372036854775807L;
        this.J = new ArrayDeque();
        k0(HO.d);
        c3407z8.H(0);
        c3407z8.f439o.order(ByteOrder.nativeOrder());
        FV fv = new FV();
        fv.n = X6.a;
        fv.m = 0;
        fv.l = 2;
        this.K = fv;
        this.Y = -1.0f;
        this.c0 = 0;
        this.y0 = 0;
        this.p0 = -1;
        this.q0 = -1;
        this.o0 = -9223372036854775807L;
        this.E0 = -9223372036854775807L;
        this.F0 = -9223372036854775807L;
        this.N0 = -9223372036854775807L;
        this.z0 = 0;
        this.A0 = 0;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0281  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    public final boolean A(long j, long j2) throws Lr {
        C3407z8 c3407z8;
        String str;
        int i;
        int length;
        AbstractC0397Ej.f(!this.H0);
        C3407z8 c3407z9 = this.G;
        int i2 = c3407z9.v;
        if (!(i2 > 0)) {
            c3407z8 = c3407z9;
        } else {
            if (!d0(j, j2, null, c3407z9.f439o, this.q0, 0, i2, c3407z9.q, c3407z9.j(Integer.MIN_VALUE), c3407z9.j(4), this.M)) {
                return false;
            }
            c3407z8 = c3407z9;
            Y(c3407z8.u);
            c3407z8.E();
        }
        ?? r1 = 0;
        if (this.G0) {
            this.H0 = true;
            return false;
        }
        boolean z = true;
        boolean z2 = this.v0;
        C0656Oj c0656Oj = this.F;
        if (z2) {
            AbstractC0397Ej.f(c3407z8.J(c0656Oj));
            this.v0 = false;
        }
        if (this.w0) {
            if (c3407z8.v > 0) {
                return true;
            }
            D();
            this.w0 = false;
            Q();
            if (!this.u0) {
                return false;
            }
        }
        AbstractC0397Ej.f(!this.G0);
        C2994uv c2994uv = this.n;
        c2994uv.u();
        c0656Oj.E();
        while (true) {
            c0656Oj.E();
            int iT = t(c2994uv, c0656Oj, r1);
            if (iT == -5) {
                V(c2994uv);
                break;
            }
            if (iT != -4) {
                if (iT != -3) {
                    throw new IllegalStateException();
                }
            } else if (c0656Oj.j(4)) {
                this.G0 = z;
            } else {
                byte[] bArr = null;
                if (this.I0) {
                    C0643Nw c0643Nw = this.L;
                    c0643Nw.getClass();
                    this.M = c0643Nw;
                    W(c0643Nw, null);
                    this.I0 = r1;
                }
                c0656Oj.I();
                C0643Nw c0643Nw2 = this.L;
                if (c0643Nw2 != null && (str = c0643Nw2.w) != null && str.equals("audio/opus")) {
                    List list = this.L.y;
                    FV fv = this.K;
                    fv.getClass();
                    c0656Oj.f439o.getClass();
                    if (c0656Oj.f439o.limit() - c0656Oj.f439o.position() != 0) {
                        if (fv.l == 2 && (list.size() == z || list.size() == 3)) {
                            bArr = (byte[]) list.get(r1);
                        }
                        ByteBuffer byteBuffer = c0656Oj.f439o;
                        int iPosition = byteBuffer.position();
                        int iLimit = byteBuffer.limit();
                        int i3 = iLimit - iPosition;
                        int i4 = (i3 + 255) / 255;
                        int i5 = i4 + 27 + i3;
                        if (fv.l == 2) {
                            length = bArr != null ? bArr.length + 28 : 47;
                            i = length + 44 + i5;
                        } else {
                            i = i5;
                            length = 0;
                        }
                        if (((ByteBuffer) fv.n).capacity() < i) {
                            fv.n = ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
                        } else {
                            ((ByteBuffer) fv.n).clear();
                        }
                        ByteBuffer byteBuffer2 = (ByteBuffer) fv.n;
                        if (fv.l == 2) {
                            if (bArr != null) {
                                FV.g(byteBuffer2, 0L, 0, 1, true);
                                long length2 = bArr.length;
                                AbstractC1459f50.g((length2 >> 8) == 0, "out of range: %s", length2);
                                byteBuffer2.put((byte) length2);
                                byteBuffer2.put(bArr);
                                byteBuffer2.putInt(22, Lr0.m(byteBuffer2.arrayOffset(), bArr.length + 28, 0, byteBuffer2.array()));
                                byteBuffer2.position(bArr.length + 28);
                            } else {
                                byteBuffer2.put(FV.f260o);
                            }
                            byteBuffer2.put(FV.p);
                        } else {
                            iLimit = iLimit;
                        }
                        int iM = fv.m + ((int) ((Ou0.m(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000));
                        fv.m = iM;
                        FV.g(byteBuffer2, iM, fv.l, i4, false);
                        int i6 = i3;
                        for (int i7 = 0; i7 < i4; i7++) {
                            if (i6 >= 255) {
                                byteBuffer2.put((byte) -1);
                                i6 -= 255;
                            } else {
                                byteBuffer2.put((byte) i6);
                                i6 = 0;
                            }
                        }
                        int i8 = iLimit;
                        while (iPosition < i8) {
                            byteBuffer2.put(byteBuffer.get(iPosition));
                            iPosition++;
                        }
                        byteBuffer.position(byteBuffer.limit());
                        byteBuffer2.flip();
                        if (fv.l == 2) {
                            byteBuffer2.putInt(length + 66, Lr0.m(byteBuffer2.arrayOffset() + length + 44, byteBuffer2.limit() - byteBuffer2.position(), 0, byteBuffer2.array()));
                        } else {
                            byteBuffer2.putInt(22, Lr0.m(byteBuffer2.arrayOffset(), byteBuffer2.limit() - byteBuffer2.position(), 0, byteBuffer2.array()));
                        }
                        fv.l++;
                        fv.n = byteBuffer2;
                        c0656Oj.E();
                        c0656Oj.H(((ByteBuffer) fv.n).remaining());
                        c0656Oj.f439o.put((ByteBuffer) fv.n);
                        c0656Oj.I();
                    }
                }
                if (!c3407z8.J(c0656Oj)) {
                    this.v0 = true;
                    break;
                }
                r1 = 0;
                z = true;
            }
            break;
        }
        if (c3407z8.v > 0) {
            c3407z8.I();
        }
        return c3407z8.v > 0 || this.G0 || this.w0;
    }

    public abstract C0708Qj B(EO eo, C0643Nw c0643Nw, C0643Nw c0643Nw2);

    public BO C(IllegalStateException illegalStateException, EO eo) {
        return new BO(illegalStateException, eo);
    }

    public final void D() {
        this.w0 = false;
        this.G.E();
        this.F.E();
        this.v0 = false;
        this.u0 = false;
        FV fv = this.K;
        fv.getClass();
        fv.n = X6.a;
        fv.m = 0;
        fv.l = 2;
    }

    public final boolean E() throws Lr {
        if (this.B0) {
            this.z0 = 1;
            if (this.e0 || this.g0) {
                this.A0 = 3;
                return false;
            }
            this.A0 = 2;
        } else {
            p0();
        }
        return true;
    }

    public final boolean F(long j, long j2) throws Lr {
        boolean z;
        boolean z2;
        MediaCodec.BufferInfo bufferInfo;
        boolean zD0;
        int iD;
        boolean z3;
        boolean z4 = this.q0 >= 0;
        MediaCodec.BufferInfo bufferInfo2 = this.I;
        if (!z4) {
            if (this.h0 && this.C0) {
                try {
                    iD = this.U.d(bufferInfo2);
                } catch (IllegalStateException unused) {
                    c0();
                    if (this.H0) {
                        f0();
                    }
                    return false;
                }
            } else {
                iD = this.U.d(bufferInfo2);
            }
            if (iD < 0) {
                if (iD != -2) {
                    if (this.m0 && (this.G0 || this.z0 == 2)) {
                        c0();
                    }
                    return false;
                }
                this.D0 = true;
                MediaFormat mediaFormatI = this.U.i();
                if (this.c0 != 0 && mediaFormatI.getInteger("width") == 32 && mediaFormatI.getInteger("height") == 32) {
                    this.l0 = true;
                } else {
                    if (this.j0) {
                        mediaFormatI.setInteger("channel-count", 1);
                    }
                    this.W = mediaFormatI;
                    this.X = true;
                }
                return true;
            }
            if (this.l0) {
                this.l0 = false;
                this.U.f(iD, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                c0();
                return false;
            }
            this.q0 = iD;
            ByteBuffer byteBufferN = this.U.n(iD);
            this.r0 = byteBufferN;
            if (byteBufferN != null) {
                byteBufferN.position(bufferInfo2.offset);
                this.r0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.i0 && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                long j3 = this.E0;
                if (j3 != -9223372036854775807L) {
                    bufferInfo2.presentationTimeUs = j3;
                }
            }
            long j4 = bufferInfo2.presentationTimeUs;
            ArrayList arrayList = this.H;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z3 = false;
                    break;
                }
                if (((Long) arrayList.get(i)).longValue() == j4) {
                    arrayList.remove(i);
                    z3 = true;
                    break;
                }
                i++;
            }
            this.s0 = z3;
            long j5 = this.F0;
            long j6 = bufferInfo2.presentationTimeUs;
            this.t0 = j5 == j6;
            q0(j6);
        }
        if (this.h0 && this.C0) {
            try {
                z = true;
                z2 = false;
                try {
                    zD0 = d0(j, j2, this.U, this.r0, this.q0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.s0, this.t0, this.M);
                    bufferInfo = bufferInfo2;
                } catch (IllegalStateException unused2) {
                    c0();
                    if (this.H0) {
                        f0();
                    }
                    return z2;
                }
            } catch (IllegalStateException unused3) {
                z2 = false;
            }
        } else {
            z = true;
            z2 = false;
            bufferInfo = bufferInfo2;
            zD0 = d0(j, j2, this.U, this.r0, this.q0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.s0, this.t0, this.M);
        }
        if (zD0) {
            Y(bufferInfo.presentationTimeUs);
            boolean z5 = (bufferInfo.flags & 4) != 0;
            this.q0 = -1;
            this.r0 = null;
            if (!z5) {
                return z;
            }
            c0();
        }
        return z2;
    }

    public final boolean G() throws Lr {
        InterfaceC3328yO interfaceC3328yO = this.U;
        if (interfaceC3328yO == null || this.z0 == 2 || this.G0) {
            return false;
        }
        int i = this.p0;
        C0656Oj c0656Oj = this.E;
        if (i < 0) {
            int iP = interfaceC3328yO.p();
            this.p0 = iP;
            if (iP < 0) {
                return false;
            }
            c0656Oj.f439o = this.U.k(iP);
            c0656Oj.E();
        }
        if (this.z0 == 1) {
            if (!this.m0) {
                this.C0 = true;
                this.U.r(this.p0, 0, 0L, 4);
                this.p0 = -1;
                c0656Oj.f439o = null;
            }
            this.z0 = 2;
            return false;
        }
        if (this.k0) {
            this.k0 = false;
            c0656Oj.f439o.put(P0);
            this.U.r(this.p0, 38, 0L, 0);
            this.p0 = -1;
            c0656Oj.f439o = null;
            this.B0 = true;
            return true;
        }
        if (this.y0 == 1) {
            for (int i2 = 0; i2 < this.V.y.size(); i2++) {
                c0656Oj.f439o.put((byte[]) this.V.y.get(i2));
            }
            this.y0 = 2;
        }
        int iPosition = c0656Oj.f439o.position();
        C2994uv c2994uv = this.n;
        c2994uv.u();
        try {
            int iT = t(c2994uv, c0656Oj, 0);
            if (i() || c0656Oj.j(536870912)) {
                this.F0 = this.E0;
            }
            if (iT == -3) {
                return false;
            }
            if (iT == -5) {
                if (this.y0 == 2) {
                    c0656Oj.E();
                    this.y0 = 1;
                }
                V(c2994uv);
                return true;
            }
            if (c0656Oj.j(4)) {
                if (this.y0 == 2) {
                    c0656Oj.E();
                    this.y0 = 1;
                }
                this.G0 = true;
                if (!this.B0) {
                    c0();
                    return false;
                }
                try {
                    if (!this.m0) {
                        this.C0 = true;
                        this.U.r(this.p0, 0, 0L, 4);
                        this.p0 = -1;
                        c0656Oj.f439o = null;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw e(e, this.L, false, Lr0.t(e.getErrorCode()));
                }
            }
            if (!this.B0 && !c0656Oj.j(1)) {
                c0656Oj.E();
                if (this.y0 == 2) {
                    this.y0 = 1;
                }
                return true;
            }
            boolean zJ = c0656Oj.j(1073741824);
            C2968ui c2968ui = c0656Oj.n;
            if (zJ) {
                if (iPosition == 0) {
                    c2968ui.getClass();
                } else {
                    if (c2968ui.d == null) {
                        int[] iArr = new int[1];
                        c2968ui.d = iArr;
                        c2968ui.i.numBytesOfClearData = iArr;
                    }
                    int[] iArr2 = c2968ui.d;
                    iArr2[0] = iArr2[0] + iPosition;
                }
            }
            if (this.d0 && !zJ) {
                ByteBuffer byteBuffer = c0656Oj.f439o;
                int iPosition2 = byteBuffer.position();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int i5 = i3 + 1;
                    if (i5 >= iPosition2) {
                        byteBuffer.clear();
                        break;
                    }
                    int i6 = byteBuffer.get(i3) & 255;
                    if (i4 == 3) {
                        if (i6 == 1 && (byteBuffer.get(i5) & 31) == 7) {
                            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                            byteBufferDuplicate.position(i3 - 3);
                            byteBufferDuplicate.limit(iPosition2);
                            byteBuffer.position(0);
                            byteBuffer.put(byteBufferDuplicate);
                            break;
                        }
                    } else if (i6 == 0) {
                        i4++;
                    }
                    if (i6 != 0) {
                        i4 = 0;
                    }
                    i3 = i5;
                }
                if (c0656Oj.f439o.position() == 0) {
                    return true;
                }
                this.d0 = false;
            }
            long jMax = c0656Oj.q;
            C2565qa c2565qa = this.n0;
            if (c2565qa != null) {
                C0643Nw c0643Nw = this.L;
                if (c2565qa.b == 0) {
                    c2565qa.a = jMax;
                }
                if (!c2565qa.c) {
                    ByteBuffer byteBuffer2 = c0656Oj.f439o;
                    byteBuffer2.getClass();
                    int i7 = 0;
                    int i8 = 0;
                    for (int i9 = 4; i7 < i9; i9 = 4) {
                        i8 = (i8 << 8) | (byteBuffer2.get(i7) & 255);
                        i7++;
                    }
                    int iX = Sr0.x(i8);
                    if (iX == -1) {
                        c2565qa.c = true;
                        c2565qa.b = 0L;
                        c2565qa.a = c0656Oj.q;
                        AP.z();
                        jMax = c0656Oj.q;
                    } else {
                        jMax = Math.max(0L, ((c2565qa.b - 529) * 1000000) / c0643Nw.K) + c2565qa.a;
                        c2565qa.b += (long) iX;
                    }
                }
                long j = this.E0;
                C2565qa c2565qa2 = this.n0;
                C0643Nw c0643Nw2 = this.L;
                c2565qa2.getClass();
                this.E0 = Math.max(j, Math.max(0L, ((c2565qa2.b - 529) * 1000000) / c0643Nw2.K) + c2565qa2.a);
            } else {
                zJ = zJ;
            }
            if (c0656Oj.j(Integer.MIN_VALUE)) {
                this.H.add(Long.valueOf(jMax));
            }
            if (this.I0) {
                ArrayDeque arrayDeque = this.J;
                if (arrayDeque.isEmpty()) {
                    this.M0.c.a(jMax, this.L);
                } else {
                    ((HO) arrayDeque.peekLast()).c.a(jMax, this.L);
                }
                this.I0 = false;
            }
            this.E0 = Math.max(this.E0, jMax);
            c0656Oj.I();
            if (c0656Oj.j(268435456)) {
                O(c0656Oj);
            }
            a0(c0656Oj);
            try {
                if (zJ) {
                    this.U.j(this.p0, c2968ui, jMax);
                } else {
                    this.U.r(this.p0, c0656Oj.f439o.limit(), jMax, 0);
                }
                this.p0 = -1;
                c0656Oj.f439o = null;
                this.B0 = true;
                this.y0 = 0;
                this.L0.c++;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw e(e2, this.L, false, Lr0.t(e2.getErrorCode()));
            }
        } catch (C0630Nj e3) {
            S(e3);
            e0(0);
            H();
            return true;
        }
    }

    public final void H() {
        try {
            this.U.flush();
        } finally {
            h0();
        }
    }

    public final boolean I() {
        if (this.U == null) {
            return false;
        }
        int i = this.A0;
        if (i == 3 || this.e0 || ((this.f0 && !this.D0) || (this.g0 && this.C0))) {
            f0();
            return true;
        }
        if (i == 2) {
            int i2 = Lr0.a;
            AbstractC0397Ej.f(i2 >= 23);
            if (i2 >= 23) {
                try {
                    p0();
                } catch (Lr e) {
                    AP.A("Failed to update the DRM session, releasing the codec instead.", e);
                    f0();
                    return true;
                }
            }
        }
        H();
        return false;
    }

    public final List J(boolean z) {
        C0643Nw c0643Nw = this.L;
        JO jo = this.A;
        ArrayList arrayListM = M(jo, c0643Nw, z);
        if (arrayListM.isEmpty() && z) {
            arrayListM = M(jo, this.L, false);
            if (!arrayListM.isEmpty()) {
                String str = this.L.w;
                arrayListM.toString();
                AP.z();
            }
        }
        return arrayListM;
    }

    public boolean K() {
        return false;
    }

    public abstract float L(float f, C0643Nw[] c0643NwArr);

    public abstract ArrayList M(JO jo, C0643Nw c0643Nw, boolean z);

    public abstract C3134wO N(EO eo, C0643Nw c0643Nw, MediaCrypto mediaCrypto, float f);

    /* JADX WARN: Code duplicated, block: B:179:0x031a  */
    /* JADX WARN: Code duplicated, block: B:194:0x0352  */
    /* JADX WARN: Code duplicated, block: B:239:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:266:0x0445  */
    public final void P(EO eo, MediaCrypto mediaCrypto) {
        float fL;
        int i;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4;
        String str;
        String str2;
        String str3;
        int i5;
        String str4 = eo.a;
        int i6 = Lr0.a;
        if (i6 < 23) {
            fL = -1.0f;
        } else {
            float f = this.T;
            C0643Nw[] c0643NwArr = this.t;
            c0643NwArr.getClass();
            fL = L(f, c0643NwArr);
        }
        if (fL <= this.C) {
            fL = -1.0f;
        }
        b0(this.L);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C3134wO c3134wON = N(eo, this.L, mediaCrypto, fL);
        if (i6 >= 31) {
            C3436zZ c3436zZ = this.q;
            c3436zZ.getClass();
            FO.a(c3134wON, c3436zZ);
        }
        try {
            Pu0.c("createCodec:" + str4);
            this.U = this.z.c(c3134wON);
            Pu0.i();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!eo.d(this.L)) {
                C0643Nw c0643Nw = this.L;
                if (c0643Nw != null) {
                    StringBuilder sbK = AbstractC1701hf0.k("id=");
                    sbK.append(c0643Nw.l);
                    sbK.append(", mimeType=");
                    sbK.append(c0643Nw.w);
                    int i7 = c0643Nw.s;
                    if (i7 != -1) {
                        sbK.append(", bitrate=");
                        sbK.append(i7);
                    }
                    String str5 = c0643Nw.t;
                    if (str5 != null) {
                        sbK.append(", codecs=");
                        sbK.append(str5);
                    }
                    C3271xo c3271xo = c0643Nw.z;
                    if (c3271xo != null) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (int i8 = 0; i8 < c3271xo.f1124o; i8++) {
                            UUID uuid = c3271xo.l[i8].m;
                            if (uuid.equals(AbstractC2661ra.b)) {
                                linkedHashSet.add("cenc");
                            } else if (uuid.equals(AbstractC2661ra.c)) {
                                linkedHashSet.add("clearkey");
                            } else if (uuid.equals(AbstractC2661ra.e)) {
                                linkedHashSet.add("playready");
                            } else if (uuid.equals(AbstractC2661ra.d)) {
                                linkedHashSet.add("widevine");
                            } else if (uuid.equals(AbstractC2661ra.a)) {
                                linkedHashSet.add("universal");
                            } else {
                                linkedHashSet.add("unknown (" + uuid + ")");
                            }
                        }
                        sbK.append(", drm=[");
                        new J2(String.valueOf(','), 6).d(sbK, linkedHashSet);
                        sbK.append(']');
                    }
                    int i9 = c0643Nw.B;
                    if (i9 != -1 && (i5 = c0643Nw.C) != -1) {
                        sbK.append(", res=");
                        sbK.append(i9);
                        sbK.append("x");
                        sbK.append(i5);
                    }
                    C1602gf c1602gf = c0643Nw.I;
                    if (c1602gf != null && (i2 = c1602gf.l) != -1 && (i3 = c1602gf.m) != -1 && (i4 = c1602gf.n) != -1) {
                        sbK.append(", color=");
                        if (i2 == -1 || i3 == -1 || i4 == -1) {
                            str = "NA";
                        } else {
                            if (i2 == -1) {
                                str2 = "Unset color space";
                            } else if (i2 == 6) {
                                str2 = "BT2020";
                            } else if (i2 != 1) {
                                str2 = i2 != 2 ? "Undefined color space" : "BT601";
                            } else {
                                str2 = "BT709";
                            }
                            if (i3 == -1) {
                                str3 = "Unset color range";
                            } else if (i3 != 1) {
                                str3 = i3 != 2 ? "Undefined color range" : "Limited range";
                            } else {
                                str3 = "Full range";
                            }
                            String strA = C1602gf.a(i4);
                            int i10 = Lr0.a;
                            Locale locale = Locale.US;
                            str = str2 + "/" + str3 + "/" + strA;
                        }
                        sbK.append(str);
                    }
                    float f2 = c0643Nw.D;
                    if (f2 != -1.0f) {
                        sbK.append(", fps=");
                        sbK.append(f2);
                    }
                    int i11 = c0643Nw.J;
                    if (i11 != -1) {
                        sbK.append(", channels=");
                        sbK.append(i11);
                    }
                    int i12 = c0643Nw.K;
                    if (i12 != -1) {
                        sbK.append(", sample_rate=");
                        sbK.append(i12);
                    }
                    String str6 = c0643Nw.n;
                    if (str6 != null) {
                        sbK.append(", language=");
                        sbK.append(str6);
                    }
                    String str7 = c0643Nw.m;
                    if (str7 != null) {
                        sbK.append(", label=");
                        sbK.append(str7);
                    }
                    int i13 = c0643Nw.f421o;
                    if (i13 != 0) {
                        ArrayList arrayList = new ArrayList();
                        if ((i13 & 4) != 0) {
                            arrayList.add("auto");
                        }
                        if ((i13 & 1) != 0) {
                            arrayList.add("default");
                        }
                        if ((i13 & 2) != 0) {
                            arrayList.add("forced");
                        }
                        sbK.append(", selectionFlags=[");
                        new J2(String.valueOf(','), 6).d(sbK, arrayList);
                        sbK.append("]");
                    }
                    int i14 = c0643Nw.p;
                    if (i14 != 0) {
                        ArrayList arrayList2 = new ArrayList();
                        if ((i14 & 1) != 0) {
                            arrayList2.add("main");
                        }
                        if ((i14 & 2) != 0) {
                            arrayList2.add("alt");
                        }
                        if ((i14 & 4) != 0) {
                            arrayList2.add("supplementary");
                        }
                        if ((i14 & 8) != 0) {
                            arrayList2.add("commentary");
                        }
                        if ((i14 & 16) != 0) {
                            arrayList2.add("dub");
                        }
                        if ((i14 & 32) != 0) {
                            arrayList2.add("emergency");
                        }
                        if ((i14 & 64) != 0) {
                            arrayList2.add("caption");
                        }
                        if ((i14 & 128) != 0) {
                            arrayList2.add("subtitle");
                        }
                        if ((i14 & 256) != 0) {
                            arrayList2.add("sign");
                        }
                        if ((i14 & 512) != 0) {
                            arrayList2.add("describes-video");
                        }
                        if ((i14 & 1024) != 0) {
                            arrayList2.add("describes-music");
                        }
                        if ((i14 & C1672hI.a.g) != 0) {
                            arrayList2.add("enhanced-intelligibility");
                        }
                        if ((i14 & C1672hI.a.f) != 0) {
                            arrayList2.add("transcribes-dialog");
                        }
                        if ((i14 & C1672hI.a.e) != 0) {
                            arrayList2.add("easy-read");
                        }
                        if ((i14 & 16384) != 0) {
                            arrayList2.add("trick-play");
                        }
                        sbK.append(", roleFlags=[");
                        new J2(String.valueOf(','), 6).d(sbK, arrayList2);
                        sbK.append("]");
                    }
                }
                Locale locale2 = Locale.US;
                AP.z();
            }
            this.b0 = eo;
            this.Y = fL;
            this.V = this.L;
            int i15 = Lr0.a;
            if (i15 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str4)) {
                String str8 = Lr0.d;
                if (str8.startsWith("SM-T585") || str8.startsWith("SM-A510") || str8.startsWith("SM-A520") || str8.startsWith("SM-J700")) {
                    i = 2;
                } else if (i15 < 24) {
                    i = 0;
                } else {
                    i = 0;
                }
            } else if (i15 < 24 || !("OMX.Nvidia.h264.decode".equals(str4) || "OMX.Nvidia.h264.decode.secure".equals(str4))) {
                i = 0;
            } else {
                String str9 = Lr0.b;
                if ("flounder".equals(str9) || "flounder_lte".equals(str9) || "grouper".equals(str9) || "tilapia".equals(str9)) {
                    i = 1;
                } else {
                    i = 0;
                }
            }
            this.c0 = i;
            this.d0 = i15 < 21 && this.V.y.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str4);
            this.e0 = i15 < 18 || (i15 == 18 && ("OMX.SEC.avc.dec".equals(str4) || "OMX.SEC.avc.dec.secure".equals(str4))) || (i15 == 19 && Lr0.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str4) || "OMX.Exynos.avc.dec.secure".equals(str4)));
            this.f0 = i15 == 29 && "c2.android.aac.decoder".equals(str4);
            if (i15 > 23 || !"OMX.google.vorbis.decoder".equals(str4)) {
                if (i15 <= 19) {
                    String str10 = Lr0.b;
                    z = ("hb2000".equals(str10) || "stvm8".equals(str10)) && ("OMX.amlogic.avc.decoder.awesome".equals(str4) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str4));
                }
            }
            this.g0 = z;
            this.h0 = i15 == 21 && "OMX.google.aac.decoder".equals(str4);
            if (i15 < 21 && "OMX.SEC.mp3.dec".equals(str4) && "samsung".equals(Lr0.c)) {
                String str11 = Lr0.b;
                if (str11.startsWith("baffin") || str11.startsWith("grand") || str11.startsWith("fortuna") || str11.startsWith("gprimelte") || str11.startsWith("j2y18lte") || str11.startsWith("ms01")) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            this.i0 = z2;
            this.j0 = i15 <= 18 && this.V.J == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str4);
            String str12 = eo.a;
            this.m0 = (i15 <= 25 && "OMX.rk.video_decoder.avc".equals(str12)) || (i15 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str12)) || ((i15 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str12) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str12) || "OMX.bcm.vdec.avc.tunnel".equals(str12) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str12) || "OMX.bcm.vdec.hevc.tunnel".equals(str12) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str12))) || (("Amazon".equals(Lr0.c) && "AFTS".equals(Lr0.d) && eo.f) || K()));
            this.U.getClass();
            if ("c2.android.mp3.decoder".equals(str12)) {
                this.n0 = new C2565qa();
            }
            if (this.r == 2) {
                this.o0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.L0.a++;
            T(jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime, str4);
        } catch (Throwable th) {
            Pu0.i();
            throw th;
        }
    }

    public final void Q() throws Lr {
        C0643Nw c0643Nw;
        if (this.U != null || this.u0 || (c0643Nw = this.L) == null) {
            return;
        }
        if (this.O == null && m0(c0643Nw)) {
            C0643Nw c0643Nw2 = this.L;
            D();
            String str = c0643Nw2.w;
            boolean zEquals = "audio/mp4a-latm".equals(str);
            C3407z8 c3407z8 = this.G;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                c3407z8.getClass();
                c3407z8.w = 32;
            } else {
                c3407z8.getClass();
                c3407z8.w = 1;
            }
            this.u0 = true;
            return;
        }
        j0(this.O);
        String str2 = this.L.w;
        InterfaceC3465zo interfaceC3465zo = this.N;
        if (interfaceC3465zo != null) {
            InterfaceC2871ti interfaceC2871tiG = interfaceC3465zo.g();
            if (this.P == null) {
                if (interfaceC2871tiG == null) {
                    if (this.N.f() == null) {
                        return;
                    }
                } else if (interfaceC2871tiG instanceof C2322ny) {
                    C2322ny c2322ny = (C2322ny) interfaceC2871tiG;
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(c2322ny.a, c2322ny.b);
                        this.P = mediaCrypto;
                        this.Q = !c2322ny.c && mediaCrypto.requiresSecureDecoderComponent(str2);
                    } catch (MediaCryptoException e) {
                        throw e(e, this.L, false, 6006);
                    }
                }
            }
            if (C2322ny.d && (interfaceC2871tiG instanceof C2322ny)) {
                int state = this.N.getState();
                if (state == 1) {
                    C3368yo c3368yoF = this.N.f();
                    c3368yoF.getClass();
                    throw e(c3368yoF, this.L, false, c3368yoF.l);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            R(this.P, this.Q);
        } catch (GO e2) {
            throw e(e2, this.L, false, 4001);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00af  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00be  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x004a A[SYNTHETIC] */
    public final void R(MediaCrypto mediaCrypto, boolean z) throws GO {
        GO go;
        String str;
        GO go2;
        String diagnosticInfo;
        if (this.Z == null) {
            try {
                List listJ = J(z);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.Z = arrayDeque;
                if (this.B) {
                    arrayDeque.addAll(listJ);
                } else if (!listJ.isEmpty()) {
                    this.Z.add((EO) listJ.get(0));
                }
                this.a0 = null;
            } catch (LO e) {
                throw new GO(this.L, e, z, -49998);
            }
        }
        if (this.Z.isEmpty()) {
            throw new GO(this.L, null, z, -49999);
        }
        EO eo = (EO) this.Z.peekFirst();
        while (this.U == null) {
            EO eo2 = (EO) this.Z.peekFirst();
            if (!l0(eo2)) {
                return;
            }
            try {
                P(eo2, mediaCrypto);
            } catch (Exception e2) {
                if (eo2 != eo) {
                    throw e2;
                }
                try {
                    AP.z();
                    Thread.sleep(50L);
                    P(eo2, mediaCrypto);
                } catch (Exception e3) {
                    AP.A("Failed to initialize decoder: " + eo2, e3);
                    this.Z.removeFirst();
                    C0643Nw c0643Nw = this.L;
                    String str2 = "Decoder init failed: " + eo2.a + ", " + c0643Nw;
                    String str3 = c0643Nw.w;
                    if (Lr0.a >= 21) {
                        if (e3 instanceof MediaCodec.CodecException) {
                            diagnosticInfo = ((MediaCodec.CodecException) e3).getDiagnosticInfo();
                        } else {
                            diagnosticInfo = null;
                        }
                        str = diagnosticInfo;
                    } else {
                        str = null;
                    }
                    go = new GO(str2, e3, str3, z, eo2, str);
                    S(go);
                    go2 = this.a0;
                    if (go2 == null) {
                        this.a0 = go;
                    } else {
                        this.a0 = new GO(go2.getMessage(), go2.getCause(), go2.l, go2.m, go2.n, go2.f276o);
                    }
                    if (!this.Z.isEmpty()) {
                        throw this.a0;
                    }
                }
                AP.A("Failed to initialize decoder: " + eo2, e3);
                this.Z.removeFirst();
                C0643Nw c0643Nw2 = this.L;
                String str4 = "Decoder init failed: " + eo2.a + ", " + c0643Nw2;
                String str5 = c0643Nw2.w;
                if (Lr0.a >= 21) {
                    if (e3 instanceof MediaCodec.CodecException) {
                        diagnosticInfo = ((MediaCodec.CodecException) e3).getDiagnosticInfo();
                    } else {
                        diagnosticInfo = null;
                    }
                    str = diagnosticInfo;
                } else {
                    str = null;
                }
                go = new GO(str4, e3, str5, z, eo2, str);
                S(go);
                go2 = this.a0;
                if (go2 == null) {
                    this.a0 = go;
                } else {
                    this.a0 = new GO(go2.getMessage(), go2.getCause(), go2.l, go2.m, go2.n, go2.f276o);
                }
                if (!this.Z.isEmpty()) {
                    throw this.a0;
                }
            }
        }
        this.Z = null;
    }

    public abstract void S(Exception exc);

    public abstract void T(long j, long j2, String str);

    public abstract void U(String str);

    /* JADX WARN: Code duplicated, block: B:73:0x00de  */
    /* JADX WARN: Code duplicated, block: B:92:0x0112  */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ad, code lost:
    
        if (r14 != false) goto L128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o.C0708Qj V(o.C2994uv r14) throws o.Lr {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.IO.V(o.uv):o.Qj");
    }

    public abstract void W(C0643Nw c0643Nw, MediaFormat mediaFormat);

    public void Y(long j) {
        this.N0 = j;
        while (true) {
            ArrayDeque arrayDeque = this.J;
            if (arrayDeque.isEmpty() || j < ((HO) arrayDeque.peek()).a) {
                return;
            }
            k0((HO) arrayDeque.poll());
            Z();
        }
    }

    public abstract void Z();

    public abstract void a0(C0656Oj c0656Oj);

    public final void c0() throws Lr {
        int i = this.A0;
        if (i == 1) {
            H();
            return;
        }
        if (i == 2) {
            H();
            p0();
        } else if (i != 3) {
            this.H0 = true;
            g0();
        } else {
            f0();
            Q();
        }
    }

    public abstract boolean d0(long j, long j2, InterfaceC3328yO interfaceC3328yO, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C0643Nw c0643Nw);

    public final boolean e0(int i) throws Lr {
        C2994uv c2994uv = this.n;
        c2994uv.u();
        C0656Oj c0656Oj = this.D;
        c0656Oj.E();
        int iT = t(c2994uv, c0656Oj, i | 4);
        if (iT == -5) {
            V(c2994uv);
            return true;
        }
        if (iT != -4 || !c0656Oj.j(4)) {
            return false;
        }
        this.G0 = true;
        c0();
        return false;
    }

    public final void f0() {
        try {
            InterfaceC3328yO interfaceC3328yO = this.U;
            if (interfaceC3328yO != null) {
                interfaceC3328yO.a();
                this.L0.b++;
                U(this.b0.a);
            }
            this.U = null;
            try {
                MediaCrypto mediaCrypto = this.P;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.P = null;
                j0(null);
                i0();
            }
        } catch (Throwable th) {
            this.U = null;
            try {
                MediaCrypto mediaCrypto2 = this.P;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
                this.P = null;
                j0(null);
                i0();
            }
        }
    }

    public void h0() {
        this.p0 = -1;
        this.E.f439o = null;
        this.q0 = -1;
        this.r0 = null;
        this.o0 = -9223372036854775807L;
        this.C0 = false;
        this.B0 = false;
        this.k0 = false;
        this.l0 = false;
        this.s0 = false;
        this.t0 = false;
        this.H.clear();
        this.E0 = -9223372036854775807L;
        this.F0 = -9223372036854775807L;
        this.N0 = -9223372036854775807L;
        C2565qa c2565qa = this.n0;
        if (c2565qa != null) {
            c2565qa.a = 0L;
            c2565qa.b = 0L;
            c2565qa.c = false;
        }
        this.z0 = 0;
        this.A0 = 0;
        this.y0 = this.x0 ? 1 : 0;
    }

    public final void i0() {
        h0();
        this.K0 = null;
        this.n0 = null;
        this.Z = null;
        this.b0 = null;
        this.V = null;
        this.W = null;
        this.X = false;
        this.D0 = false;
        this.Y = -1.0f;
        this.c0 = 0;
        this.d0 = false;
        this.e0 = false;
        this.f0 = false;
        this.g0 = false;
        this.h0 = false;
        this.i0 = false;
        this.j0 = false;
        this.m0 = false;
        this.x0 = false;
        this.y0 = 0;
        this.Q = false;
    }

    public final void j0(InterfaceC3465zo interfaceC3465zo) {
        InterfaceC3465zo interfaceC3465zo2 = this.N;
        if (interfaceC3465zo2 != interfaceC3465zo) {
            if (interfaceC3465zo != null) {
                interfaceC3465zo.b(null);
            }
            if (interfaceC3465zo2 != null) {
                interfaceC3465zo2.d(null);
            }
        }
        this.N = interfaceC3465zo;
    }

    @Override // o.AbstractC1952k8
    public boolean k() {
        boolean zE;
        if (this.L == null) {
            return false;
        }
        if (i()) {
            zE = this.w;
        } else {
            D90 d90 = this.s;
            d90.getClass();
            zE = d90.e();
        }
        if (!zE) {
            if (!(this.q0 >= 0) && (this.o0 == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.o0)) {
                return false;
            }
        }
        return true;
    }

    public final void k0(HO ho) {
        this.M0 = ho;
        if (ho.b != -9223372036854775807L) {
            this.O0 = true;
            X();
        }
    }

    @Override // o.AbstractC1952k8
    public void l() {
        this.L = null;
        k0(HO.d);
        this.J.clear();
        I();
    }

    public boolean l0(EO eo) {
        return true;
    }

    public boolean m0(C0643Nw c0643Nw) {
        return false;
    }

    @Override // o.AbstractC1952k8
    public void n(long j, boolean z) throws Lr {
        int i;
        this.G0 = false;
        this.H0 = false;
        this.J0 = false;
        if (this.u0) {
            this.G.E();
            this.F.E();
            this.v0 = false;
            FV fv = this.K;
            fv.getClass();
            fv.n = X6.a;
            fv.m = 0;
            fv.l = 2;
        } else if (I()) {
            Q();
        }
        C0709Qk c0709Qk = this.M0.c;
        synchronized (c0709Qk) {
            i = c0709Qk.m;
        }
        if (i > 0) {
            this.I0 = true;
        }
        this.M0.c.b();
        this.J.clear();
    }

    public abstract int n0(JO jo, C0643Nw c0643Nw);

    public final boolean o0(C0643Nw c0643Nw) throws Lr {
        if (Lr0.a >= 23 && this.U != null && this.A0 != 3 && this.r != 0) {
            float f = this.T;
            C0643Nw[] c0643NwArr = this.t;
            c0643NwArr.getClass();
            float fL = L(f, c0643NwArr);
            float f2 = this.Y;
            if (f2 == fL) {
                return true;
            }
            if (fL == -1.0f) {
                if (this.B0) {
                    this.z0 = 1;
                    this.A0 = 3;
                    return false;
                }
                f0();
                Q();
                return false;
            }
            if (f2 == -1.0f && fL <= this.C) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fL);
            this.U.m(bundle);
            this.Y = fL;
        }
        return true;
    }

    public final void p0() throws Lr {
        InterfaceC2871ti interfaceC2871tiG = this.O.g();
        if (interfaceC2871tiG instanceof C2322ny) {
            try {
                this.P.setMediaDrmSession(((C2322ny) interfaceC2871tiG).b);
            } catch (MediaCryptoException e) {
                throw e(e, this.L, false, 6006);
            }
        }
        j0(this.O);
        this.z0 = 0;
        this.A0 = 0;
    }

    public final void q0(long j) {
        Object objF;
        C0643Nw c0643Nw = (C0643Nw) this.M0.c.e(j);
        if (c0643Nw == null && this.O0 && this.W != null) {
            C0709Qk c0709Qk = this.M0.c;
            synchronized (c0709Qk) {
                objF = c0709Qk.m == 0 ? null : c0709Qk.f();
            }
            c0643Nw = (C0643Nw) objF;
        }
        if (c0643Nw != null) {
            this.M = c0643Nw;
        } else if (!this.X || this.M == null) {
            return;
        }
        W(this.M, this.W);
        this.X = false;
        this.O0 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r2 >= r7) goto L13;
     */
    @Override // o.AbstractC1952k8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(o.C0643Nw[] r6, long r7, long r9) {
        /*
            r5 = this;
            o.HO r6 = r5.M0
            long r6 = r6.b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 != 0) goto L16
            o.HO r6 = new o.HO
            r6.<init>(r0, r9)
            r5.k0(r6)
            goto L4c
        L16:
            java.util.ArrayDeque r6 = r5.J
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L42
            long r7 = r5.E0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L2e
            long r2 = r5.N0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L42
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 < 0) goto L42
        L2e:
            o.HO r6 = new o.HO
            r6.<init>(r0, r9)
            r5.k0(r6)
            o.HO r6 = r5.M0
            long r6 = r6.b
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 == 0) goto L4c
            r5.Z()
            goto L4c
        L42:
            o.HO r7 = new o.HO
            long r0 = r5.E0
            r7.<init>(r0, r9)
            r6.add(r7)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.IO.s(o.Nw[], long, long):void");
    }

    @Override // o.AbstractC1952k8
    public void u(long j, long j2) throws Lr {
        boolean z = false;
        if (this.J0) {
            this.J0 = false;
            c0();
        }
        Lr lr = this.K0;
        if (lr != null) {
            this.K0 = null;
            throw lr;
        }
        try {
            if (this.H0) {
                g0();
                return;
            }
            if (this.L != null || e0(2)) {
                Q();
                if (this.u0) {
                    Pu0.c("bypassRender");
                    while (A(j, j2)) {
                    }
                    Pu0.i();
                } else if (this.U != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    Pu0.c("drainAndFeed");
                    while (F(j, j2)) {
                        long j3 = this.R;
                        if (j3 != -9223372036854775807L && SystemClock.elapsedRealtime() - jElapsedRealtime >= j3) {
                            break;
                        }
                    }
                    while (G()) {
                        long j4 = this.R;
                        if (j4 != -9223372036854775807L && SystemClock.elapsedRealtime() - jElapsedRealtime >= j4) {
                            break;
                        }
                    }
                    Pu0.i();
                } else {
                    C0579Lj c0579Lj = this.L0;
                    int i = c0579Lj.d;
                    D90 d90 = this.s;
                    d90.getClass();
                    c0579Lj.d = i + d90.f(j - this.u);
                    e0(1);
                }
                synchronized (this.L0) {
                }
            }
        } catch (IllegalStateException e) {
            int i2 = Lr0.a;
            if (i2 < 21 || !(e instanceof MediaCodec.CodecException)) {
                StackTraceElement[] stackTrace = e.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e;
                }
            }
            S(e);
            if (i2 >= 21) {
                if (e instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e).isRecoverable() : false) {
                    z = true;
                }
            }
            if (z) {
                f0();
            }
            throw e(C(e, this.b0), this.L, z, 4003);
        }
    }

    @Override // o.AbstractC1952k8
    public void x(float f, float f2) throws Lr {
        this.S = f;
        this.T = f2;
        o0(this.V);
    }

    @Override // o.AbstractC1952k8
    public final int y(C0643Nw c0643Nw) throws Lr {
        try {
            return n0(this.A, c0643Nw);
        } catch (LO e) {
            throw f(e, c0643Nw);
        }
    }

    @Override // o.AbstractC1952k8
    public final int z() {
        return 8;
    }

    public void X() {
    }

    public void g0() {
    }

    public void O(C0656Oj c0656Oj) {
    }

    public void b0(C0643Nw c0643Nw) {
    }
}
