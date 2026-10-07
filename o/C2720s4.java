package o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ImageDecoder;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.SparseArray;
import android.util.Xml;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.cardview.widget.CardView;
import j$.time.Instant;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: o.s4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2720s4 implements GU, InterfaceC2811t1, InterfaceC3231xO, T70, InterfaceC0428Fo, InterfaceC0673Pa, InterfaceC0777Ta, InterfaceC2486pj, InterfaceC0740Rp, CL, InterfaceC1958kC, InterfaceC3046vX {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f1018o = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public final /* synthetic */ int l;
    public Object m;
    public Object n;

    public /* synthetic */ C2720s4(char c, int i) {
        this.l = i;
    }

    public static P2 W(ImageDecoder.Source source, int i, int i2, FW fw) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new C2780sl(i, i2, fw));
        if (AbstractC3294y0.w(drawableDecodeDrawable)) {
            return new P2(0, AbstractC3294y0.h(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    @Override // o.CL
    public void A(String str, Object... objArr) {
        j0(objArr);
    }

    @Override // o.InterfaceC0428Fo
    public InterfaceC3465zo B(C0350Co c0350Co, C0643Nw c0643Nw) {
        AbstractC1474fG.j(c0643Nw, "format");
        return ((InterfaceC0428Fo) this.m).B(c0350Co, S(c0643Nw));
    }

    @Override // o.CL
    public void C(Object obj, String str) {
        h0(new Object[]{obj});
    }

    @Override // o.InterfaceC3046vX
    public Object D(Uri uri, C2776sj c2776sj) {
        InterfaceC1536fv interfaceC1536fv = (InterfaceC1536fv) ((InterfaceC3046vX) this.m).D(uri, c2776sj);
        List list = (List) this.n;
        return (list == null || list.isEmpty()) ? interfaceC1536fv : (InterfaceC1536fv) interfaceC1536fv.a(list);
    }

    @Override // o.InterfaceC0777Ta
    public void E(InterfaceC0621Na interfaceC0621Na, C1759i80 c1759i80) {
        ((C2294nk) this.n).l.execute(new RunnableC1169c7(this, (InterfaceC0777Ta) this.m, c1759i80, 1));
    }

    @Override // o.CL
    public void F(String str, Exception exc) {
        h0(null);
    }

    @Override // o.InterfaceC0673Pa
    public Type G() {
        return (Type) this.m;
    }

    @Override // o.InterfaceC2486pj
    public InterfaceC2583qj H() {
        return new C3069vk((Context) this.m, ((InterfaceC2486pj) this.n).H());
    }

    @Override // o.CL
    public void I(String str, Exception exc) {
        h0(null);
    }

    @Override // o.InterfaceC1958kC
    public InterfaceC3046vX J(C1568gC c1568gC, C1177cC c1177cC) {
        return new C2720s4(((InterfaceC1958kC) this.m).J(c1568gC, c1177cC), 29, (List) this.n);
    }

    @Override // o.InterfaceC1916jq
    public boolean K(Object obj, File file, FW fw) {
        return ((T70) this.n).K(new R8(((BitmapDrawable) ((M70) obj).get()).getBitmap(), (Q8) this.m), file, fw);
    }

    @Override // o.InterfaceC0740Rp
    public boolean L(CharSequence charSequence, int i, int i2, Rp0 rp0) {
        if ((rp0.c & 4) > 0) {
            return true;
        }
        if (((Eq0) this.m) == null) {
            this.m = new Eq0(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((C0622Nb) this.n).getClass();
        ((Eq0) this.m).setSpan(new Sp0(rp0), i, i2, 33);
        return true;
    }

    @Override // o.CL
    public void M(String str) {
        h0(null);
    }

    @Override // o.InterfaceC2811t1
    public boolean N(AbstractC2908u1 abstractC2908u1, ZP zp) {
        return ((InterfaceC2811t1) this.m).N(abstractC2908u1, zp);
    }

    @Override // o.CL
    public boolean O() {
        return true;
    }

    @Override // o.InterfaceC1958kC
    public InterfaceC3046vX P() {
        return new C2720s4(((InterfaceC1958kC) this.m).P(), 29, (List) this.n);
    }

    @Override // o.CL
    public void Q(IOException iOException) {
        h0(null);
    }

    @Override // o.CL
    public void R(Object obj, Object obj2, String str) {
        i0(obj, obj2);
    }

    public C0643Nw S(C0643Nw c0643Nw) {
        C3271xo c3271xo;
        byte[] bArr = (byte[]) this.n;
        if (bArr == null || (c3271xo = c0643Nw.z) == null) {
            return c0643Nw;
        }
        String str = c3271xo.n;
        if (str != null && !AbstractC1474fG.b(str, "cenc")) {
            return c0643Nw;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < c3271xo.f1124o; i++) {
            C3174wo c3174wo = c3271xo.l[i];
            AbstractC1474fG.i(c3174wo, "get(...)");
            z = z || c3174wo.a(AbstractC2661ra.c) || c3174wo.a(AbstractC2661ra.b);
            z2 = z2 || c3174wo.a(AbstractC2661ra.d) || c3174wo.a(AbstractC2661ra.e);
        }
        if (z || !z2) {
            return c0643Nw;
        }
        C3271xo c3271xo2 = new C3271xo("cenc", true, new C3174wo(AbstractC2661ra.b, null, "video/mp4", bArr));
        C0617Mw c0617MwA = c0643Nw.a();
        c0617MwA.n = c3271xo2;
        return c0617MwA.a();
    }

    public boolean T(int i, int i2) {
        return AbstractC1474fG.b((InterfaceC3106w3) ((C3300y3) this.m).d.get(i), (InterfaceC3106w3) ((List) this.n).get(i2));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0060  */
    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    public boolean U(int i, int i2) {
        boolean zB;
        InterfaceC3106w3 interfaceC3106w3 = (InterfaceC3106w3) ((C3300y3) this.m).d.get(i);
        InterfaceC3106w3 interfaceC3106w4 = (InterfaceC3106w3) ((List) this.n).get(i2);
        if ((interfaceC3106w3 instanceof C0882Xb) && (interfaceC3106w4 instanceof C0882Xb)) {
            C0882Xb c0882Xb = (C0882Xb) interfaceC3106w3;
            String str = c0882Xb.g;
            C0882Xb c0882Xb2 = (C0882Xb) interfaceC3106w4;
            String str2 = c0882Xb2.g;
            zB = (str == null || str2 == null) ? AbstractC1474fG.b(c0882Xb.a, c0882Xb2.a) : AbstractC1474fG.b(str, str2);
        } else if ((interfaceC3106w3 instanceof C0456Gq) && (interfaceC3106w4 instanceof C0456Gq)) {
            C0456Gq c0456Gq = (C0456Gq) interfaceC3106w3;
            C0456Gq c0456Gq2 = (C0456Gq) interfaceC3106w4;
            if (AbstractC1474fG.b(c0456Gq.a, c0456Gq2.a) && AbstractC1474fG.b(c0456Gq.k, c0456Gq2.k)) {
                zB = true;
            } else {
                zB = false;
            }
        } else if ((interfaceC3106w3 instanceof C2420oz) && (interfaceC3106w4 instanceof C2420oz)) {
            zB = AbstractC1474fG.b(((C2420oz) interfaceC3106w3).a, ((C2420oz) interfaceC3106w4).a);
        } else if ((interfaceC3106w3 instanceof C1387eR) && (interfaceC3106w4 instanceof C1387eR)) {
            C1387eR c1387eR = (C1387eR) interfaceC3106w3;
            C1387eR c1387eR2 = (C1387eR) interfaceC3106w4;
            if (AbstractC1474fG.b(c1387eR.a, c1387eR2.a) && AbstractC1474fG.b(c1387eR.t, c1387eR2.t)) {
                zB = true;
            } else {
                zB = false;
            }
        } else if ((interfaceC3106w3 instanceof C1688hY) && (interfaceC3106w4 instanceof C1688hY)) {
            zB = AbstractC1474fG.b(((C1688hY) interfaceC3106w3).a, ((C1688hY) interfaceC3106w4).a);
        } else if ((interfaceC3106w3 instanceof R30) && (interfaceC3106w4 instanceof R30)) {
            zB = AbstractC1474fG.b(((R30) interfaceC3106w3).a, ((R30) interfaceC3106w4).a);
        } else if ((interfaceC3106w3 instanceof Ma0) && (interfaceC3106w4 instanceof Ma0)) {
            zB = AbstractC1474fG.b(((Ma0) interfaceC3106w3).a, ((Ma0) interfaceC3106w4).a);
        } else {
            if ((interfaceC3106w3 instanceof C2109lo0) && (interfaceC3106w4 instanceof C2109lo0)) {
                C2109lo0 c2109lo0 = (C2109lo0) interfaceC3106w3;
                C2109lo0 c2109lo1 = (C2109lo0) interfaceC3106w4;
                if (AbstractC1474fG.b(c2109lo0.a, c2109lo1.a) && AbstractC1474fG.b(c2109lo0.r, c2109lo1.r)) {
                    zB = true;
                }
            }
            zB = false;
        }
        return zB && interfaceC3106w3.c().ordinal() == interfaceC3106w4.c().ordinal();
    }

    @Override // o.InterfaceC3231xO
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public C2434p6 c(C3134wO c3134wO) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        String str = c3134wO.a.a;
        C2434p6 c2434p6 = null;
        try {
            Pu0.c("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                C2434p6 c2434p7 = new C2434p6(mediaCodecCreateByCodecName, (HandlerThread) ((Gh0) this.m).get(), (HandlerThread) ((Gh0) this.n).get(), false);
                try {
                    Pu0.i();
                    C2434p6.b(c2434p7, c3134wO.b, c3134wO.d, c3134wO.e);
                    return c2434p7;
                } catch (Exception e) {
                    e = e;
                    c2434p6 = c2434p7;
                    if (c2434p6 != null) {
                        c2434p6.a();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodecCreateByCodecName = null;
        }
    }

    public byte[] X(C2016kr c2016kr) {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.m;
        byteArrayOutputStream.reset();
        DataOutputStream dataOutputStream = (DataOutputStream) this.n;
        try {
            dataOutputStream.writeBytes(c2016kr.l);
            dataOutputStream.writeByte(0);
            String str = c2016kr.m;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(c2016kr.n);
            dataOutputStream.writeLong(c2016kr.f878o);
            dataOutputStream.write(c2016kr.p);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public InterfaceC0302As Y(Object... objArr) {
        Constructor constructorA;
        synchronized (((AtomicBoolean) this.n)) {
            if (!((AtomicBoolean) this.n).get()) {
                try {
                    constructorA = ((C0838Vj) this.m).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.n).set(true);
                    constructorA = null;
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            constructorA = null;
        }
        if (constructorA == null) {
            return null;
        }
        try {
            return (InterfaceC0302As) constructorA.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }

    public KeyListener Z(KeyListener keyListener) {
        if (!(!(keyListener instanceof NumberKeyListener))) {
            return keyListener;
        }
        ((C2720s4) ((C2133m1) this.n).m).getClass();
        if (keyListener instanceof C0714Qp) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C0714Qp(keyListener);
    }

    @Override // o.InterfaceC0428Fo
    public void a() {
        ((InterfaceC0428Fo) this.m).a();
    }

    public int a0() {
        return ((C3300y3) this.m).d.size();
    }

    @Override // o.InterfaceC0740Rp
    public Object b() {
        return (Eq0) this.m;
    }

    public void b0(AttributeSet attributeSet, int i) {
        switch (this.l) {
            case 0:
                ProgressBar progressBar = (ProgressBar) this.m;
                RN rnY = RN.y(progressBar.getContext(), attributeSet, f1018o, i, 0);
                Drawable drawableV = rnY.v(0);
                if (drawableV != null) {
                    if (drawableV instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableV;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable drawableN0 = n0(animationDrawable.getFrame(i2), true);
                            drawableN0.setLevel(10000);
                            animationDrawable2.addFrame(drawableN0, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableV = animationDrawable2;
                    }
                    progressBar.setIndeterminateDrawable(drawableV);
                }
                Drawable drawableV2 = rnY.v(1);
                if (drawableV2 != null) {
                    progressBar.setProgressDrawable(n0(drawableV2, false));
                }
                rnY.A();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.m).getContext().obtainStyledAttributes(attributeSet, T40.i, i, 0);
                try {
                    boolean z = true;
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    l0(z);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public C0636Np c0(InputConnection inputConnection, EditorInfo editorInfo) {
        C2133m1 c2133m1 = (C2133m1) this.n;
        if (inputConnection == null) {
            c2133m1.getClass();
            inputConnection = null;
        } else {
            C2720s4 c2720s4 = (C2720s4) c2133m1.m;
            c2720s4.getClass();
            if (!(inputConnection instanceof C0636Np)) {
                inputConnection = new C0636Np((EditText) c2720s4.m, inputConnection, editorInfo);
            }
        }
        return (C0636Np) inputConnection;
    }

    @Override // o.InterfaceC0428Fo
    public void d(Looper looper, C3436zZ c3436zZ) {
        AbstractC1474fG.j(looper, "playbackLooper");
        ((InterfaceC0428Fo) this.m).d(looper, c3436zZ);
    }

    public void d0(Set set) {
        ((InterfaceC0416Fc) this.n).o(C2985uq0.a);
    }

    @Override // o.InterfaceC2811t1
    public boolean e(AbstractC2908u1 abstractC2908u1, ZP zp) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C1456f4) this.n).M;
        WeakHashMap weakHashMap = It0.a;
        AbstractC2991ut0.c(viewGroup);
        return ((InterfaceC2811t1) this.m).e(abstractC2908u1, zp);
    }

    public void e0(Exception exc, boolean z) {
        this.n = null;
        HashSet hashSet = (HashSet) this.m;
        AbstractC0985aF abstractC0985aFL = AbstractC0985aF.l(hashSet);
        hashSet.clear();
        XE xeListIterator = abstractC0985aFL.listIterator(0);
        while (xeListIterator.hasNext()) {
            C0294Ak c0294Ak = (C0294Ak) xeListIterator.next();
            c0294Ak.getClass();
            c0294Ak.k(exc, z ? 1 : 3);
        }
    }

    @Override // o.CL
    public void f(String str, Object... objArr) {
        j0(objArr);
    }

    public void f0(C0306Aw c0306Aw) {
        int i = c0306Aw.b;
        Handler handler = (Handler) this.n;
        L80 l80 = (L80) this.m;
        if (i == 0) {
            handler.post(new RunnableC1938k1(l80, c0306Aw.a, 4, false));
        } else {
            handler.post(new RunnableC0907Ya(i, 0, l80));
        }
    }

    @Override // o.CL
    public void g(String str, Object obj, Exception exc) {
        i0(obj, exc);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:80:0x012d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void g0(Context context, XmlResourceParser xmlResourceParser) {
        byte b;
        C0705Qg c0705Qg = new C0705Qg();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = Integer.parseInt(attributeValue.substring(1));
                }
                try {
                    int eventType = xmlResourceParser.getEventType();
                    C0576Lg c0576LgD = null;
                    while (eventType != 1) {
                        if (eventType == 0) {
                            xmlResourceParser.getName();
                        } else if (eventType == 2) {
                            switch (xmlResourceParser.getName()) {
                                case "Constraint":
                                    c0576LgD = C0705Qg.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                case "ConstraintOverride":
                                    c0576LgD = C0705Qg.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                case "Guideline":
                                    c0576LgD = C0705Qg.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c0576LgD.d.a = true;
                                    break;
                                case "Barrier":
                                    c0576LgD = C0705Qg.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c0576LgD.d.h0 = 1;
                                    break;
                                case "PropertySet":
                                    if (c0576LgD == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0576LgD.b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                    break;
                                case "Transform":
                                    if (c0576LgD == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0576LgD.e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                    break;
                                case "Layout":
                                    if (c0576LgD == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0576LgD.d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                    break;
                                case "Motion":
                                    if (c0576LgD == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0576LgD.c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                    break;
                                case "CustomAttribute":
                                case "CustomMethod":
                                    if (c0576LgD == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    C0420Fg.a(context, xmlResourceParser, c0576LgD.f);
                                    break;
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        b = 3;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        b = 1;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        b = 2;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        b = 0;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                default:
                                    b = -1;
                                    break;
                            }
                            if (b == 0) {
                                ((SparseArray) this.n).put(identifier, c0705Qg);
                                return;
                            } else if (b == 1 || b == 2 || b == 3) {
                                c0705Qg.c.put(Integer.valueOf(c0576LgD.a), c0576LgD);
                                c0576LgD = null;
                            }
                        }
                        eventType = xmlResourceParser.next();
                    }
                } catch (IOException | XmlPullParserException unused) {
                }
                ((SparseArray) this.n).put(identifier, c0705Qg);
                return;
            }
        }
    }

    @Override // o.InterfaceC2811t1
    public void h(AbstractC2908u1 abstractC2908u1) {
        ((InterfaceC2811t1) this.m).h(abstractC2908u1);
        LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4 = (LayoutInflaterFactory2C1456f4) this.n;
        if (layoutInflaterFactory2C1456f4.H != null) {
            layoutInflaterFactory2C1456f4.w.getDecorView().removeCallbacks(layoutInflaterFactory2C1456f4.I);
        }
        if (layoutInflaterFactory2C1456f4.G != null) {
            C2509pu0 c2509pu0 = layoutInflaterFactory2C1456f4.J;
            if (c2509pu0 != null) {
                c2509pu0.b();
            }
            C2509pu0 c2509pu0A = It0.a(layoutInflaterFactory2C1456f4.G);
            c2509pu0A.a(0.0f);
            layoutInflaterFactory2C1456f4.J = c2509pu0A;
            c2509pu0A.d(new U3(2, this));
        }
        layoutInflaterFactory2C1456f4.F = null;
        ViewGroup viewGroup = layoutInflaterFactory2C1456f4.M;
        WeakHashMap weakHashMap = It0.a;
        AbstractC2991ut0.c(viewGroup);
        layoutInflaterFactory2C1456f4.G();
    }

    public void h0(Object[] objArr) {
        C2870th0 c2870th0 = new C2870th0();
        System.currentTimeMillis();
        c2870th0.a = (C2773sh0) this.m;
        Thread.currentThread().getName();
        c2870th0.b = objArr;
        ((Queue) this.n).add(c2870th0);
    }

    @Override // o.CL
    public void i(Instant instant) {
        h0(new Object[]{instant});
    }

    public void i0(Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            h0(new Object[]{obj});
        } else {
            h0(new Object[]{obj, obj2});
        }
    }

    @Override // o.CL
    public boolean j() {
        return true;
    }

    public void j0(Object[] objArr) {
        Throwable th = null;
        if (objArr.length != 0) {
            Object obj = objArr[objArr.length - 1];
            if (obj instanceof Throwable) {
                th = (Throwable) obj;
            }
        }
        if (th == null) {
            h0(objArr);
            return;
        }
        if (objArr.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        }
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        if (length > 0) {
            System.arraycopy(objArr, 0, objArr2, 0, length);
        }
        h0(objArr2);
    }

    @Override // o.InterfaceC0428Fo
    public InterfaceC0402Eo k(C0350Co c0350Co, C0643Nw c0643Nw) {
        AbstractC1474fG.j(c0643Nw, "format");
        return ((InterfaceC0428Fo) this.m).k(c0350Co, S(c0643Nw));
    }

    public void k0(String str) {
        C0815Um c0815Um;
        synchronized (this) {
            try {
                c0815Um = (C0815Um) ((HashMap) this.m).get(str);
                AbstractC3045vW.k(c0815Um, "Argument must not be null");
                int i = c0815Um.b;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c0815Um.b);
                }
                int i2 = i - 1;
                c0815Um.b = i2;
                if (i2 == 0) {
                    C0815Um c0815Um2 = (C0815Um) ((HashMap) this.m).remove(str);
                    if (!c0815Um2.equals(c0815Um)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c0815Um + ", but actually removed: " + c0815Um2 + ", safeKey: " + str);
                    }
                    ((C1788ia) this.n).b(c0815Um2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c0815Um.a.unlock();
    }

    @Override // o.InterfaceC0673Pa
    public Object l(MV mv) {
        Executor executor = (Executor) this.n;
        return executor == null ? mv : new C2294nk(executor, mv);
    }

    public void l0(boolean z) {
        C0870Wp c0870Wp = (C0870Wp) ((C2720s4) ((C2133m1) this.n).m).n;
        if (c0870Wp.f606o != z) {
            if (c0870Wp.n != null) {
                C0455Gp c0455GpA = C0455Gp.a();
                C0844Vp c0844Vp = c0870Wp.n;
                c0455GpA.getClass();
                Jp0.h(c0844Vp, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = c0455GpA.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    c0455GpA.b.remove(c0844Vp);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            c0870Wp.f606o = z;
            if (z) {
                C0870Wp.a(c0870Wp.l, C0455Gp.a().b());
            }
        }
    }

    @Override // o.CL
    public void m(Object... objArr) {
        j0(objArr);
    }

    public void m0(int i, int i2, int i3, int i4) {
        CardView cardView = (CardView) this.n;
        cardView.f12o.set(i, i2, i3, i4);
        Rect rect = cardView.n;
        super/*android.widget.FrameLayout*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    @Override // o.CL
    public void n(String str) {
        h0(new Object[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable n0(Drawable drawable, boolean z) {
        if (drawable instanceof Tw0) {
            Uw0 uw0 = (Uw0) ((Tw0) drawable);
            Drawable drawable2 = uw0.q;
            if (drawable2 != null) {
                uw0.c(n0(drawable2, z));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = n0(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    if (Build.VERSION.SDK_INT >= 23) {
                        AbstractC2623r4.a(layerDrawable, layerDrawable2, i2);
                    }
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.n) == null) {
                    this.n = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    @Override // o.InterfaceC0428Fo
    public int o(C0643Nw c0643Nw) {
        AbstractC1474fG.j(c0643Nw, "format");
        return ((InterfaceC0428Fo) this.m).o(S(c0643Nw));
    }

    public InterfaceC1324dm0 o0(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = (int[]) this.m;
            if (i2 >= iArr.length) {
                AP.f();
                return new C0921Yo();
            }
            if (i == iArr[i2]) {
                return ((C90[]) this.n)[i2];
            }
            i2++;
        }
    }

    @Override // o.InterfaceC2811t1
    public boolean p(AbstractC2908u1 abstractC2908u1, MenuItem menuItem) {
        return ((InterfaceC2811t1) this.m).p(abstractC2908u1, menuItem);
    }

    @Override // o.CL
    public void q(String str) {
        h0(null);
    }

    @Override // o.InterfaceC0428Fo
    public void r() {
        ((InterfaceC0428Fo) this.m).r();
    }

    @Override // o.CL
    public void s(Object obj, String str) {
        h0(new Object[]{obj});
    }

    @Override // o.CL
    public void t(String str) {
        h0(null);
    }

    @Override // o.CL
    public void u(String str, Object... objArr) {
        j0(objArr);
    }

    @Override // o.CL
    public void v(String str) {
        h0(null);
    }

    @Override // o.InterfaceC0777Ta
    public void w(InterfaceC0621Na interfaceC0621Na, Throwable th) {
        ((C2294nk) this.n).l.execute(new RunnableC1169c7(this, (InterfaceC0777Ta) this.m, th, 2));
    }

    @Override // o.T70
    public int x(FW fw) {
        return ((T70) this.n).x(fw);
    }

    @Override // o.CL
    public void y(Object obj, String str) {
        h0(new Object[]{obj});
    }

    @Override // o.CL
    public void z(Object obj, Object obj2, String str) {
        i0(obj, obj2);
    }

    public /* synthetic */ C2720s4(Object obj, int i, Object obj2) {
        this.l = i;
        this.m = obj;
        this.n = obj2;
    }

    public /* synthetic */ C2720s4(Object obj, Object obj2, int i, boolean z) {
        this.l = i;
        this.n = obj;
        this.m = obj2;
    }

    public C2720s4(C0398Ek c0398Ek, byte[] bArr) {
        this.l = 14;
        AbstractC1474fG.j(bArr, "licenseData");
        this.m = c0398Ek;
        byte[] bArrD = null;
        try {
            JSONArray jSONArray = new JSONObject(new String(bArr, AbstractC1305dd.a)).getJSONArray("keys");
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getJSONObject(i).getString("kid");
                byte[] bArrDecode = Base64.decode(string + AbstractC1899jh0.Q((4 - (string.length() % 4)) % 4, "="), 10);
                if (bArrDecode.length == 16) {
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrDecode);
                    arrayList.add(new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong()));
                }
            }
            if (!arrayList.isEmpty()) {
                arrayList.size();
                bArrD = AbstractC3021v9.d(AbstractC2661ra.b, (UUID[]) arrayList.toArray(new UUID[0]), null);
            }
        } catch (Exception unused) {
        }
        this.n = bArrD;
    }

    public C2720s4(EditText editText, int i) {
        this.l = i;
        switch (i) {
            case 24:
                this.m = editText;
                C0870Wp c0870Wp = new C0870Wp(editText);
                this.n = c0870Wp;
                editText.addTextChangedListener(c0870Wp);
                if (C0585Lp.b == null) {
                    synchronized (C0585Lp.a) {
                        try {
                            if (C0585Lp.b == null) {
                                C0585Lp c0585Lp = new C0585Lp();
                                try {
                                    C0585Lp.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C0585Lp.class.getClassLoader());
                                    break;
                                } catch (Throwable unused) {
                                }
                                C0585Lp.b = c0585Lp;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                editText.setEditableFactory(C0585Lp.b);
                return;
            default:
                this.m = editText;
                this.n = new C2133m1(editText);
                return;
        }
    }

    public C2720s4(ProgressBar progressBar) {
        this.l = 0;
        this.m = progressBar;
    }

    public C2720s4(Context context) {
        this.l = 11;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(zy0.A(com.skidush.clonex.R.attr.materialCalendarStyle, context, C1287dO.class.getCanonicalName()).data, H40.n);
        C2691rp.p(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        C2691rp.p(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        C2691rp.p(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        C2691rp.p(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListL = AbstractC3021v9.l(context, typedArrayObtainStyledAttributes, 7);
        this.m = C2691rp.p(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        C2691rp.p(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.n = C2691rp.p(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(colorStateListL.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }

    public C2720s4(final int i) {
        this.l = 7;
        final int i2 = 0;
        Gh0 gh0 = new Gh0() { // from class: o.o6
            @Override // o.Gh0
            public final Object get() {
                switch (i2) {
                    case 0:
                        return new HandlerThread(C2434p6.c(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
                    default:
                        return new HandlerThread(C2434p6.c(i, "ExoPlayer:MediaCodecQueueingThread:"));
                }
            }
        };
        final int i3 = 1;
        Gh0 gh1 = new Gh0() { // from class: o.o6
            @Override // o.Gh0
            public final Object get() {
                switch (i3) {
                    case 0:
                        return new HandlerThread(C2434p6.c(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
                    default:
                        return new HandlerThread(C2434p6.c(i, "ExoPlayer:MediaCodecQueueingThread:"));
                }
            }
        };
        this.m = gh0;
        this.n = gh1;
    }

    public C2720s4(Context context, InterfaceC2486pj interfaceC2486pj) {
        this.l = 20;
        this.m = context.getApplicationContext();
        this.n = interfaceC2486pj;
    }

    public C2720s4(String[] strArr, I9 i9) {
        this.l = 16;
        this.n = i9;
        this.l = 16;
        AbstractC1474fG.j(strArr, "tables");
        this.m = strArr;
    }

    public C2720s4(MediaCodec.CryptoInfo cryptoInfo) {
        this.l = 17;
        this.m = cryptoInfo;
        this.n = AbstractC3197x0.b();
    }

    public C2720s4(CardView cardView) {
        this.l = 13;
        this.n = cardView;
    }

    public C2720s4(C0838Vj c0838Vj) {
        this.l = 22;
        this.m = c0838Vj;
        this.n = new AtomicBoolean(false);
    }

    public C2720s4(int i, byte b) {
        this.l = i;
        switch (i) {
            case 23:
                this.m = new HashMap();
                this.n = new C1788ia(1);
                break;
            case 26:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.m = byteArrayOutputStream;
                this.n = new DataOutputStream(byteArrayOutputStream);
                break;
            default:
                this.m = new HashSet();
                break;
        }
    }
}
