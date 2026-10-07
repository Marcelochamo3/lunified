package j$.time.zone;

import j$.time.Clock;
import j$.time.Instant;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC0121i;
import j$.time.k;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Serializable {
    private static final long[] i = new long[0];
    private static final e[] j = new e[0];
    private static final k[] k = new k[0];
    private static final b[] l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;
    private final long[] a;
    private final ZoneOffset[] b;
    private final long[] c;
    private final k[] d;
    private final ZoneOffset[] e;
    private final e[] f;
    private final TimeZone g;
    private final transient ConcurrentHashMap h = new ConcurrentHashMap();

    private f(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = null;
    }

    f(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {k(timeZone.getRawOffset())};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = timeZone;
    }

    private f(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        k kVarR;
        this.a = jArr;
        this.b = zoneOffsetArr;
        this.c = jArr2;
        this.e = zoneOffsetArr2;
        this.f = eVarArr;
        if (jArr2.length == 0) {
            this.d = k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jArr2.length) {
                int i3 = i2 + 1;
                b bVar = new b(jArr2[i2], zoneOffsetArr2[i2], zoneOffsetArr2[i3]);
                if (bVar.E()) {
                    arrayList.add(bVar.r());
                    kVarR = bVar.p();
                } else {
                    arrayList.add(bVar.p());
                    kVarR = bVar.r();
                }
                arrayList.add(kVarR);
                i2 = i3;
            }
            this.d = (k[]) arrayList.toArray(new k[arrayList.size()]);
        }
        this.g = null;
    }

    private static Object a(k kVar, b bVar) {
        k kVarR = bVar.r();
        boolean zE = bVar.E();
        boolean zA0 = kVar.a0(kVarR);
        if (zE) {
            if (zA0) {
                return bVar.x();
            }
            return kVar.a0(bVar.p()) ? bVar : bVar.u();
        }
        if (zA0) {
            return kVar.a0(bVar.p()) ? bVar.x() : bVar;
        }
        return bVar.u();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b[] b(int i2) {
        long j2;
        Integer numValueOf = Integer.valueOf(i2);
        ConcurrentHashMap concurrentHashMap = this.h;
        b[] bVarArr = (b[]) concurrentHashMap.get(numValueOf);
        if (bVarArr != null) {
            return bVarArr;
        }
        TimeZone timeZone = this.g;
        if (timeZone == null) {
            e[] eVarArr = this.f;
            b[] bVarArr2 = new b[eVarArr.length];
            for (int i3 = 0; i3 < eVarArr.length; i3++) {
                bVarArr2[i3] = eVarArr[i3].a(i2);
            }
            if (i2 < 2100) {
                concurrentHashMap.putIfAbsent(numValueOf, bVarArr2);
            }
            return bVarArr2;
        }
        b[] bVarArr3 = l;
        if (i2 < 1800) {
            return bVarArr3;
        }
        long jN = AbstractC0121i.n(k.b0(i2 - 1), this.b[0]);
        int offset = timeZone.getOffset(jN * 1000);
        long j3 = 31968000 + jN;
        while (jN < j3) {
            long j4 = 7776000 + jN;
            long j5 = jN;
            if (offset != timeZone.getOffset(j4 * 1000)) {
                jN = j5;
                while (j4 - jN > 1) {
                    int i4 = offset;
                    long j6 = j3;
                    long jK = j$.com.android.tools.r8.a.k(j4 + jN, 2L);
                    if (timeZone.getOffset(jK * 1000) == i4) {
                        jN = jK;
                    } else {
                        j4 = jK;
                    }
                    offset = i4;
                    j3 = j6;
                }
                j2 = j3;
                int i5 = offset;
                if (timeZone.getOffset(jN * 1000) == i5) {
                    jN = j4;
                }
                ZoneOffset zoneOffsetK = k(i5);
                offset = timeZone.getOffset(jN * 1000);
                ZoneOffset zoneOffsetK2 = k(offset);
                if (c(jN, zoneOffsetK2) == i2) {
                    bVarArr3 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length + 1);
                    bVarArr3[bVarArr3.length - 1] = new b(jN, zoneOffsetK, zoneOffsetK2);
                }
            } else {
                j2 = j3;
                jN = j4;
            }
            j3 = j2;
        }
        if (1916 <= i2 && i2 < 2100) {
            concurrentHashMap.putIfAbsent(numValueOf, bVarArr3);
        }
        return bVarArr3;
    }

    private static int c(long j2, ZoneOffset zoneOffset) {
        return j$.time.i.k0(j$.com.android.tools.r8.a.k(j2 + ((long) zoneOffset.c0()), 86400)).c0();
    }

    private Object e(k kVar) {
        Object obj = null;
        ZoneOffset[] zoneOffsetArr = this.b;
        int i2 = 0;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            b[] bVarArrB = b(kVar.Y());
            if (bVarArrB.length == 0) {
                return k(timeZone.getOffset(AbstractC0121i.n(kVar, zoneOffsetArr[0]) * 1000));
            }
            int length = bVarArrB.length;
            while (i2 < length) {
                b bVar = bVarArrB[i2];
                Object objA = a(kVar, bVar);
                if ((objA instanceof b) || objA.equals(bVar.x())) {
                    return objA;
                }
                i2++;
                obj = objA;
            }
            return obj;
        }
        if (this.c.length == 0) {
            return zoneOffsetArr[0];
        }
        int length2 = this.f.length;
        k[] kVarArr = this.d;
        if (length2 > 0 && kVar.Z(kVarArr[kVarArr.length - 1])) {
            b[] bVarArrB2 = b(kVar.Y());
            int length3 = bVarArrB2.length;
            while (i2 < length3) {
                b bVar2 = bVarArrB2[i2];
                Object objA2 = a(kVar, bVar2);
                if ((objA2 instanceof b) || objA2.equals(bVar2.x())) {
                    return objA2;
                }
                i2++;
                obj = objA2;
            }
            return obj;
        }
        int iBinarySearch = Arrays.binarySearch(kVarArr, kVar);
        ZoneOffset[] zoneOffsetArr2 = this.e;
        if (iBinarySearch == -1) {
            return zoneOffsetArr2[0];
        }
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        } else if (iBinarySearch < kVarArr.length - 1) {
            int i3 = iBinarySearch + 1;
            if (kVarArr[iBinarySearch].equals(kVarArr[i3])) {
                iBinarySearch = i3;
            }
        }
        if ((iBinarySearch & 1) != 0) {
            return zoneOffsetArr2[(iBinarySearch / 2) + 1];
        }
        k kVar2 = kVarArr[iBinarySearch];
        k kVar3 = kVarArr[iBinarySearch + 1];
        int i4 = iBinarySearch / 2;
        ZoneOffset zoneOffset = zoneOffsetArr2[i4];
        ZoneOffset zoneOffset2 = zoneOffsetArr2[i4 + 1];
        return zoneOffset2.c0() > zoneOffset.c0() ? new b(kVar2, zoneOffset, zoneOffset2) : new b(kVar3, zoneOffset, zoneOffset2);
    }

    public static f j(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return new f(zoneOffset);
    }

    private static ZoneOffset k(int i2) {
        return ZoneOffset.f0(i2 / 1000);
    }

    static f l(DataInput dataInput) throws IOException {
        int i2 = dataInput.readInt();
        long[] jArr = i;
        long[] jArr2 = i2 == 0 ? jArr : new long[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            jArr2[i3] = a.a(dataInput);
        }
        int i4 = i2 + 1;
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            zoneOffsetArr[i5] = a.b(dataInput);
        }
        int i6 = dataInput.readInt();
        if (i6 != 0) {
            jArr = new long[i6];
        }
        long[] jArr3 = jArr;
        for (int i7 = 0; i7 < i6; i7++) {
            jArr3[i7] = a.a(dataInput);
        }
        int i8 = i6 + 1;
        ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            zoneOffsetArr2[i9] = a.b(dataInput);
        }
        int i10 = dataInput.readByte();
        e[] eVarArr = i10 == 0 ? j : new e[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            eVarArr[i11] = e.b(dataInput);
        }
        return new f(jArr2, zoneOffsetArr, jArr3, zoneOffsetArr2, eVarArr);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.g != null ? (byte) 100 : (byte) 1, this);
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return k(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.c;
        if (jArr.length == 0) {
            return this.b[0];
        }
        long epochSecond = instant.getEpochSecond();
        int length = this.f.length;
        ZoneOffset[] zoneOffsetArr = this.e;
        if (length <= 0 || epochSecond <= jArr[jArr.length - 1]) {
            int iBinarySearch = Arrays.binarySearch(jArr, epochSecond);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            return zoneOffsetArr[iBinarySearch + 1];
        }
        b[] bVarArrB = b(c(epochSecond, zoneOffsetArr[zoneOffsetArr.length - 1]));
        b bVar = null;
        for (int i2 = 0; i2 < bVarArrB.length; i2++) {
            bVar = bVarArrB[i2];
            if (epochSecond < bVar.T()) {
                return bVar.x();
            }
        }
        return bVar.u();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Objects.equals(this.g, fVar.g) && Arrays.equals(this.a, fVar.a) && Arrays.equals(this.b, fVar.b) && Arrays.equals(this.c, fVar.c) && Arrays.equals(this.e, fVar.e) && Arrays.equals(this.f, fVar.f);
    }

    public final b f(k kVar) {
        Object objE = e(kVar);
        if (objE instanceof b) {
            return (b) objE;
        }
        return null;
    }

    public final List g(k kVar) {
        Object objE = e(kVar);
        return objE instanceof b ? ((b) objE).C() : Collections.singletonList((ZoneOffset) objE);
    }

    public final boolean h(Instant instant) {
        ZoneOffset zoneOffsetK;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            zoneOffsetK = k(timeZone.getRawOffset());
        } else {
            int length = this.c.length;
            ZoneOffset[] zoneOffsetArr = this.b;
            if (length == 0) {
                zoneOffsetK = zoneOffsetArr[0];
            } else {
                int iBinarySearch = Arrays.binarySearch(this.a, instant.getEpochSecond());
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 2;
                }
                zoneOffsetK = zoneOffsetArr[iBinarySearch + 1];
            }
        }
        return !zoneOffsetK.equals(d(instant));
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.g) ^ Arrays.hashCode(this.a)) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.c)) ^ Arrays.hashCode(this.e)) ^ Arrays.hashCode(this.f);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00dd A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public final boolean i() {
        b bVar;
        TimeZone timeZone = this.g;
        if (timeZone == null) {
            return this.c.length == 0;
        }
        if (timeZone.useDaylightTime() || timeZone.getDSTSavings() != 0) {
            return false;
        }
        Instant instantNow = Instant.now();
        long epochSecond = instantNow.getEpochSecond();
        if (instantNow.getNano() > 0 && epochSecond < Long.MAX_VALUE) {
            epochSecond++;
        }
        int iC = c(epochSecond, d(instantNow));
        b[] bVarArrB = b(iC);
        for (int length = bVarArrB.length - 1; length >= 0; length--) {
            if (epochSecond > bVarArrB[length].T()) {
                bVar = bVarArrB[length];
                if (bVar == null) {
                    return true;
                }
                return false;
            }
        }
        if (iC > 1800) {
            b[] bVarArrB2 = b(iC - 1);
            for (int length2 = bVarArrB2.length - 1; length2 >= 0; length2--) {
                if (epochSecond > bVarArrB2[length2].T()) {
                    bVar = bVarArrB2[length2];
                }
            }
            int offset = timeZone.getOffset((epochSecond - 1) * 1000);
            long jY = j$.time.i.i0(1800, 1, 1).y() * 86400;
            for (long jMin = Math.min(epochSecond - 31104000, (Clock.systemUTC().b() / 1000) + 31968000); jY <= jMin; jMin -= 7776000) {
                int offset2 = timeZone.getOffset(jMin * 1000);
                if (offset != offset2) {
                    int iC2 = c(jMin, k(offset2));
                    b[] bVarArrB3 = b(iC2 + 1);
                    for (int length3 = bVarArrB3.length - 1; length3 >= 0; length3--) {
                        if (epochSecond > bVarArrB3[length3].T()) {
                            bVar = bVarArrB3[length3];
                        }
                    }
                    b[] bVarArrB4 = b(iC2);
                    bVar = bVarArrB4[bVarArrB4.length - 1];
                }
            }
            bVar = null;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            return true;
        }
        return false;
    }

    final void m(DataOutput dataOutput) throws IOException {
        long[] jArr = this.a;
        dataOutput.writeInt(jArr.length);
        for (long j2 : jArr) {
            a.c(j2, dataOutput);
        }
        for (ZoneOffset zoneOffset : this.b) {
            a.d(zoneOffset, dataOutput);
        }
        long[] jArr2 = this.c;
        dataOutput.writeInt(jArr2.length);
        for (long j3 : jArr2) {
            a.c(j3, dataOutput);
        }
        for (ZoneOffset zoneOffset2 : this.e) {
            a.d(zoneOffset2, dataOutput);
        }
        e[] eVarArr = this.f;
        dataOutput.writeByte(eVarArr.length);
        for (e eVar : eVarArr) {
            eVar.c(dataOutput);
        }
    }

    final void n(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(this.g.getID());
    }

    public final String toString() {
        StringBuilder sb;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            String id = timeZone.getID();
            sb = new StringBuilder("ZoneRules[timeZone=");
            sb.append(id);
        } else {
            ZoneOffset[] zoneOffsetArr = this.b;
            ZoneOffset zoneOffset = zoneOffsetArr[zoneOffsetArr.length - 1];
            sb = new StringBuilder("ZoneRules[currentStandardOffset=");
            sb.append(zoneOffset);
        }
        sb.append("]");
        return sb.toString();
    }
}
