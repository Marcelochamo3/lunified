package o;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.Spannable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.sL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2743sL implements InterfaceC2940uO, InterfaceC2719s30, InterfaceC0406Es, InterfaceC2387oi, InterfaceC1479fL, InterfaceC0602Mh, InterfaceC3231xO, InterfaceC0940Zh, Ls0 {
    public static C2743sL m;
    public final /* synthetic */ int l;

    public /* synthetic */ C2743sL(int i) {
        this.l = i;
    }

    public static ArrayList f(List list) {
        AbstractC1474fG.j(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((O30) obj) != O30.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1016af.O(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((O30) it.next()).l);
        }
        return arrayList2;
    }

    public static byte[] h(List list) {
        AbstractC1474fG.j(list, "protocols");
        E9 e9 = new E9();
        for (String str : f(list)) {
            e9.f0(str.length());
            e9.l0(str);
        }
        return e9.W(e9.m);
    }

    public static C2243n70 j(int i, int i2, TP tp, byte[] bArr) {
        AbstractC1474fG.j(bArr, "<this>");
        Mr0.c(bArr.length, i, i2);
        return new C2243n70(i2, i, tp, bArr);
    }

    public static C2243n70 k(String str, TP tp) {
        AbstractC1474fG.j(str, "<this>");
        Charset charset = AbstractC1305dd.a;
        if (tp != null) {
            Pattern pattern = TP.e;
            Charset charsetA = tp.a(null);
            if (charsetA == null) {
                tp = AbstractC1474fG.N(tp + "; charset=utf-8");
            } else {
                charset = charsetA;
            }
        }
        byte[] bytes = str.getBytes(charset);
        AbstractC1474fG.i(bytes, "this as java.lang.String).getBytes(charset)");
        return j(0, bytes.length, tp, bytes);
    }

    public static DT n(Context context, TT tt, Bundle bundle, TJ tj, LT lt) {
        String string = UUID.randomUUID().toString();
        AbstractC1474fG.i(string, "randomUUID().toString()");
        AbstractC1474fG.j(tj, "hostLifecycleState");
        return new DT(context, tt, bundle, tj, lt, string, null);
    }

    public static C2243n70 o(TP tp, byte[] bArr) {
        int length = bArr.length;
        AbstractC1474fG.j(bArr, "content");
        return j(0, length, tp, bArr);
    }

    public static MediaCodec p(C3134wO c3134wO) throws IOException {
        c3134wO.a.getClass();
        String str = c3134wO.a.a;
        Pu0.c("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Pu0.i();
        return mediaCodecCreateByCodecName;
    }

    public static boolean t() {
        return AbstractC1474fG.b("Dalvik", System.getProperty("java.vm.name"));
    }

    @Override // o.InterfaceC2940uO
    public long a() {
        throw new NoSuchElementException();
    }

    @Override // o.InterfaceC1479fL
    public void b() {
        synchronized (Jp0.c) {
            Object obj = Jp0.d;
            synchronized (obj) {
                if (Jp0.e) {
                    return;
                }
                long jA = Jp0.a();
                synchronized (obj) {
                    Jp0.f = jA;
                    Jp0.e = true;
                }
            }
        }
    }

    @Override // o.InterfaceC3231xO
    public InterfaceC3328yO c(C3134wO c3134wO) {
        MediaCodec mediaCodecP = null;
        try {
            mediaCodecP = p(c3134wO);
            Pu0.c("configureCodec");
            mediaCodecP.configure(c3134wO.b, c3134wO.d, c3134wO.e, 0);
            Pu0.i();
            Pu0.c("startCodec");
            mediaCodecP.start();
            Pu0.i();
            return new RN(mediaCodecP);
        } catch (IOException | RuntimeException e) {
            if (mediaCodecP != null) {
                mediaCodecP.release();
            }
            throw e;
        }
    }

    @Override // o.InterfaceC2940uO
    public long d() {
        throw new NoSuchElementException();
    }

    @Override // o.InterfaceC2719s30
    public void g(int i, Object obj) {
        if (i == 6 || i == 7 || i == 8) {
        }
    }

    @Override // o.Ls0
    public void i(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        switch (this.l) {
            case 21:
                mediaMetadataRetriever.setDataSource(new Ks0((ByteBuffer) obj));
                break;
            default:
                mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    @Override // o.InterfaceC0602Mh
    public Object l(Object obj) {
        AbstractC2051l80 abstractC2051l80 = (AbstractC2051l80) obj;
        AbstractC1474fG.j(abstractC2051l80, "value");
        return new String(abstractC2051l80.f(), AbstractC1305dd.a);
    }

    @Override // o.Ls0
    public void m(MediaExtractor mediaExtractor, Object obj) throws IOException {
        switch (this.l) {
            case 21:
                mediaExtractor.setDataSource(new Ks0((ByteBuffer) obj));
                break;
            default:
                mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    @Override // o.InterfaceC2940uO
    public boolean next() {
        return false;
    }

    @Override // o.InterfaceC0406Es
    public Object q() {
        try {
            return new C3119w90(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public String r(Method method, int i) {
        return "parameter #" + (i + 1);
    }

    public Object s(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    public boolean u(Method method) {
        return false;
    }

    public boolean v(Spannable spannable) {
        return false;
    }

    public C2743sL(Context context) {
        this.l = 23;
    }

    @Override // o.InterfaceC1479fL
    public void e() {
    }
}
