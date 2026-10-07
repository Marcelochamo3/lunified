package o;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: o.lk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2100lk implements InterfaceC3064vh0 {
    public int a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public C2100lk() {
        this.c = new C0519Jb(7);
        this.d = new C3258xh0(1);
        this.e = new ArrayDeque();
        for (int i = 0; i < 2; i++) {
            ((ArrayDeque) this.e).addFirst(new C2472pc(this, 1));
        }
        this.a = 0;
    }

    @Override // o.InterfaceC0553Kj
    public void a() {
        this.b = true;
    }

    @Override // o.InterfaceC0553Kj
    public void b(C3258xh0 c3258xh0) {
        AbstractC0397Ej.f(!this.b);
        AbstractC0397Ej.f(this.a == 1);
        AbstractC0397Ej.c(((C3258xh0) this.d) == c3258xh0);
        this.a = 2;
    }

    @Override // o.InterfaceC0553Kj
    public Object d() {
        AbstractC0397Ej.f(!this.b);
        if (this.a == 2) {
            ArrayDeque arrayDeque = (ArrayDeque) this.e;
            if (!arrayDeque.isEmpty()) {
                C2472pc c2472pc = (C2472pc) arrayDeque.removeFirst();
                C3258xh0 c3258xh0 = (C3258xh0) this.d;
                if (c3258xh0.j(4)) {
                    c2472pc.b(4);
                } else {
                    long j = c3258xh0.q;
                    ByteBuffer byteBuffer = c3258xh0.f439o;
                    byteBuffer.getClass();
                    byte[] bArrArray = byteBuffer.array();
                    ((C0519Jb) this.c).getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.unmarshall(bArrArray, 0, bArrArray.length);
                    parcelObtain.setDataPosition(0);
                    Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                    parcelObtain.recycle();
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                    parcelableArrayList.getClass();
                    c2472pc.F(c3258xh0.q, new C3306y6(j, U9.p(C3162wi.U, parcelableArrayList), 4), 0L);
                }
                c3258xh0.E();
                this.a = 0;
                return c2472pc;
            }
        }
        return null;
    }

    @Override // o.InterfaceC0553Kj
    public Object e() {
        AbstractC0397Ej.f(!this.b);
        if (this.a != 0) {
            return null;
        }
        this.a = 1;
        return (C3258xh0) this.d;
    }

    @Override // o.InterfaceC0553Kj
    public void flush() {
        AbstractC0397Ej.f(!this.b);
        ((C3258xh0) this.d).E();
        this.a = 0;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    public C2100lk(Context context) {
        String strJ;
        TelephonyManager telephonyManager;
        this.c = context == null ? null : context.getApplicationContext();
        int i = Lr0.a;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                strJ = U9.J(networkCountryIso);
            } else {
                strJ = U9.J(Locale.getDefault().getCountry());
            }
        } else {
            strJ = U9.J(Locale.getDefault().getCountry());
        }
        int[] iArrA = C2197mk.a(strJ);
        HashMap map = new HashMap(8);
        map.put(0, 1000000L);
        M60 m60 = C2197mk.n;
        map.put(2, (Long) m60.get(iArrA[0]));
        map.put(3, (Long) C2197mk.f920o.get(iArrA[1]));
        map.put(4, (Long) C2197mk.p.get(iArrA[2]));
        map.put(5, (Long) C2197mk.q.get(iArrA[3]));
        map.put(10, (Long) C2197mk.r.get(iArrA[4]));
        map.put(9, (Long) C2197mk.s.get(iArrA[5]));
        map.put(7, (Long) m60.get(iArrA[0]));
        this.d = map;
        this.a = 2000;
        this.e = Sh0.a;
        this.b = true;
    }

    @Override // o.InterfaceC3064vh0
    public void c(long j) {
    }
}
