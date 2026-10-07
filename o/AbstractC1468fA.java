package o;

import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.integration.okhttp3.OkHttpGlideModule;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.skidush.clonex.R;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: o.fA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1468fA {
    public static Method Q;
    public static boolean R;
    public static Constructor S;
    public static volatile String T;
    public static volatile long U;
    public static final Object a = new Object();
    public static final String[] b = {"base", "basefont", "bgsound", "command", "link"};
    public static final String[] c = {"noframes", "style"};
    public static final String[] d = {"body", "br", "html"};
    public static final String[] e = {"body", "br", "html"};
    public static final String[] f = {"body", "br", "head", "html"};
    public static final String[] g = {"basefont", "bgsound", "link", "meta", "noframes", "style"};
    public static final String[] h = {"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", "template", "title"};
    public static final String[] i = {"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", "p", "section", "summary", "ul"};
    public static final String[] j = {"h1", "h2", "h3", "h4", "h5", "h6"};
    public static final String[] k = {"address", "div", "p"};
    public static final String[] l = {"dd", "dt"};
    public static final String[] m = {"applet", "marquee", "object"};
    public static final String[] n = {"param", "source", "track"};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String[] f769o = {"action", "name", "prompt"};
    public static final String[] p = {"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] q = {"address", "article", "aside", "blockquote", "button", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};
    public static final String[] r = {"body", "dd", "dt", "html", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] s = {"a", "b", "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"};
    public static final String[] t = {"table", "tbody", "tfoot", "thead", "tr"};
    public static final String[] u = {"tbody", "tfoot", "thead"};
    public static final String[] v = {"td", "th", "tr"};
    public static final String[] w = {"script", "style", "template"};
    public static final String[] x = {"td", "th"};
    public static final String[] y = {"body", "caption", "col", "colgroup", "html"};
    public static final String[] z = {"table", "tbody", "tfoot", "thead", "tr"};
    public static final String[] A = {"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] B = {"body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] C = {"table", "tbody", "tfoot", "thead", "tr"};
    public static final String[] D = {"caption", "col", "colgroup", "tbody", "tfoot", "thead"};
    public static final String[] E = {"body", "caption", "col", "colgroup", "html", "td", "th", "tr"};
    public static final String[] F = {"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"};
    public static final String[] G = {"body", "caption", "col", "colgroup", "html", "td", "th"};
    public static final String[] H = {"input", "keygen", "textarea"};
    public static final String[] I = {"caption", "table", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] J = {"tbody", "tfoot", "thead"};
    public static final String[] K = {"head", "noscript"};
    public static final String[] L = {"body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] M = {"base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "template", "title"};
    public static final String[] N = {"caption", "colgroup", "tbody", "tfoot", "thead"};
    public static final String[] O = {"b", "big", "blockquote", "body", "br", "center", "code", "dd", "div", "dl", "dt", "em", "embed", "h1", "h2", "h3", "h4", "h5", "h6", "head", "hr", "i", "img", "li", "listing", "menu", "meta", "nobr", "ol", "p", "pre", "ruby", "s", "small", "span", "strike", "strong", "sub", "sup", "table", "tt", "u", "ul", "var"};
    public static final Object P = new Object();

    public AbstractC1468fA() {
        new ConcurrentHashMap();
    }

    public static int A(Object obj, Object obj2, int i2, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iQ = AbstractC1370eA.Q(obj);
        int i3 = iQ & i2;
        int iD = D(i3, obj3);
        if (iD == 0) {
            return -1;
        }
        int i4 = ~i2;
        int i5 = iQ & i4;
        int i6 = -1;
        while (true) {
            int i7 = iD - 1;
            int i8 = iArr[i7];
            if ((i8 & i4) == i5 && AbstractC1459f50.p(obj, objArr[i7]) && (objArr2 == null || AbstractC1459f50.p(obj2, objArr2[i7]))) {
                int i9 = i8 & i2;
                if (i6 == -1) {
                    E(i3, i9, obj3);
                } else {
                    iArr[i6] = u(iArr[i6], i9, i2);
                }
                return i7;
            }
            int i10 = i8 & i2;
            if (i10 == 0) {
                return -1;
            }
            i6 = i7;
            iD = i10;
        }
    }

    public static void B(final Context context, String str, String str2, String str3, final boolean z2, int i2, InterfaceC0360Cy interfaceC0360Cy) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.dialog_settings_confirmation, (ViewGroup) null, false);
        int i3 = R.id.settings_confirm_action;
        TextView textView = (TextView) Sr0.g(viewInflate, R.id.settings_confirm_action);
        if (textView != null) {
            i3 = R.id.settings_confirm_cancel;
            TextView textView2 = (TextView) Sr0.g(viewInflate, R.id.settings_confirm_cancel);
            if (textView2 != null) {
                i3 = R.id.settings_confirm_handle;
                View viewG = Sr0.g(viewInflate, R.id.settings_confirm_handle);
                if (viewG != null) {
                    i3 = R.id.settings_confirm_icon;
                    ImageView imageView = (ImageView) Sr0.g(viewInflate, R.id.settings_confirm_icon);
                    if (imageView != null) {
                        i3 = R.id.settings_confirm_icon_box;
                        FrameLayout frameLayout = (FrameLayout) Sr0.g(viewInflate, R.id.settings_confirm_icon_box);
                        if (frameLayout != null) {
                            i3 = R.id.settings_confirm_message;
                            TextView textView3 = (TextView) Sr0.g(viewInflate, R.id.settings_confirm_message);
                            if (textView3 != null) {
                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                TextView textView4 = (TextView) Sr0.g(viewInflate, R.id.settings_confirm_title);
                                if (textView4 != null) {
                                    final Na0 na0 = new Na0(linearLayout, textView, textView2, viewG, imageView, frameLayout, textView3, linearLayout, textView4);
                                    String strB = Cr0.y.b();
                                    if (strB == null) {
                                        strB = "default";
                                    }
                                    final C1123bj0 c1123bj0F = AbstractC1459f50.F(strB);
                                    Dialog dialog = z2 ? new Dialog(context) : new DialogC2924u9(context);
                                    dialog.requestWindowFeature(1);
                                    dialog.setContentView(linearLayout);
                                    textView4.setText(str);
                                    textView3.setText(str2);
                                    textView.setText(str3);
                                    imageView.setImageResource(i2);
                                    textView4.setTextColor(c1123bj0F.e);
                                    textView3.setTextColor(c1123bj0F.f);
                                    int i4 = c1123bj0F.c;
                                    imageView.setImageTintList(ColorStateList.valueOf(i4));
                                    int iF = AbstractC1894jf.f(i4, 32);
                                    GradientDrawable gradientDrawable = new GradientDrawable();
                                    gradientDrawable.setColor(iF);
                                    gradientDrawable.setCornerRadius(16.0f * context.getResources().getDisplayMetrics().density);
                                    frameLayout.setBackground(gradientDrawable);
                                    viewG.setVisibility(z2 ^ true ? 0 : 8);
                                    AbstractC1376eG.a(textView, i4, z2);
                                    AbstractC1376eG.l(textView2, z2);
                                    textView2.setOnClickListener(new ViewOnClickListenerC3251xe(24, dialog));
                                    textView.setOnClickListener(new ViewOnClickListenerC1010ac(dialog, 12, interfaceC0360Cy));
                                    final Dialog dialog2 = dialog;
                                    dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: o.Oc0
                                        @Override // android.content.DialogInterface.OnShowListener
                                        public final void onShow(DialogInterface dialogInterface) {
                                            GradientDrawable gradientDrawable2;
                                            Dialog dialog3 = dialog2;
                                            AbstractC1474fG.j(dialog3, "$dialog");
                                            Na0 na1 = na0;
                                            AbstractC1474fG.j(na1, "$binding");
                                            Context context2 = context;
                                            AbstractC1474fG.j(context2, "$context");
                                            C1123bj0 c1123bj0 = c1123bj0F;
                                            AbstractC1474fG.j(c1123bj0, "$palette");
                                            Window window = dialog3.getWindow();
                                            if (window == null) {
                                                return;
                                            }
                                            window.setBackgroundDrawable(new ColorDrawable(0));
                                            window.setDimAmount(0.68f);
                                            window.addFlags(2);
                                            boolean z3 = z2;
                                            int i5 = c1123bj0.b;
                                            if (z3) {
                                                gradientDrawable2 = new GradientDrawable();
                                                gradientDrawable2.setColor(i5);
                                                gradientDrawable2.setCornerRadius(24.0f * context2.getResources().getDisplayMetrics().density);
                                            } else {
                                                GradientDrawable gradientDrawable3 = new GradientDrawable();
                                                gradientDrawable3.setColor(i5);
                                                gradientDrawable3.setCornerRadius(context2.getResources().getDisplayMetrics().density * 28.0f);
                                                float f2 = 28.0f * context2.getResources().getDisplayMetrics().density;
                                                gradientDrawable3.setCornerRadii(new float[]{f2, f2, f2, f2, 0.0f, 0.0f, 0.0f, 0.0f});
                                                gradientDrawable2 = gradientDrawable3;
                                            }
                                            ((LinearLayout) na1.f414o).setBackground(gradientDrawable2);
                                            if (z3) {
                                                window.setLayout((int) (context2.getResources().getDisplayMetrics().widthPixels * 0.58f), -2);
                                                ((TextView) na1.n).requestFocus();
                                                return;
                                            }
                                            window.setNavigationBarColor(i5);
                                            FrameLayout frameLayout2 = (FrameLayout) dialog3.findViewById(R.id.design_bottom_sheet);
                                            if (frameLayout2 != null) {
                                                frameLayout2.setBackgroundColor(0);
                                                BottomSheetBehavior.A(frameLayout2).H(3);
                                            }
                                        }
                                    });
                                    dialog.show();
                                    return;
                                }
                                i3 = R.id.settings_confirm_title;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
    }

    public static ZK C(int i2, C0554Kk c0554Kk, C2562qX c2562qX) throws C2949uX {
        ZK zkB = ZK.b(c0554Kk, c2562qX);
        while (true) {
            int i3 = zkB.a;
            if (i3 == i2) {
                return zkB;
            }
            AP.z();
            long j2 = zkB.b + 8;
            if (j2 > C1707hi0.a) {
                throw C2949uX.c("Chunk is too large (~2GB+) to skip; id: " + i3);
            }
            c0554Kk.q((int) j2);
            zkB = ZK.b(c0554Kk, c2562qX);
        }
    }

    public static int D(int i2, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i2] & 255;
        }
        return obj instanceof short[] ? ((short[]) obj)[i2] & 65535 : ((int[]) obj)[i2];
    }

    public static void E(int i2, int i3, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i2] = (byte) i3;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i2] = (short) i3;
        } else {
            ((int[]) obj)[i2] = i3;
        }
    }

    public static LinkedHashMap a(String str, String str2, Map map) {
        String strW;
        AbstractC1474fG.j(map, "headers");
        AbstractC1474fG.j(str2, "mediaUrl");
        String strW2 = w(str);
        boolean zB = (strW2 == null || (strW = w(str2)) == null) ? false : AbstractC1474fG.b(strW2, strW);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            if (!zB) {
                String lowerCase = AbstractC1119bh0.E0(str3).toString().toLowerCase(Locale.ROOT);
                AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
                if (AbstractC1119bh0.W(lowerCase, "authorization", false) || AbstractC1119bh0.W(lowerCase, "cookie", false) || AbstractC1119bh0.W(lowerCase, "api-key", false) || AbstractC1119bh0.W(lowerCase, "token", false) || AbstractC1119bh0.W(lowerCase, "session", false) || AbstractC1119bh0.W(lowerCase, "secret", false) || AbstractC1119bh0.W(lowerCase, "credential", false) || AbstractC1119bh0.W(lowerCase, "signature", false) || AbstractC1899jh0.L(lowerCase, "-key", false)) {
                }
            }
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    public static boolean b(C0554Kk c0554Kk) {
        C2562qX c2562qX = new C2562qX(8);
        int i2 = ZK.b(c0554Kk, c2562qX).a;
        if (i2 != 1380533830 && i2 != 1380333108) {
            return false;
        }
        c0554Kk.x(c2562qX.a, 0, 4, false);
        c2562qX.F(0);
        if (c2562qX.g() == 1463899717) {
            return true;
        }
        AP.f();
        return false;
    }

    public static void c(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty".toString());
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(Mr0.i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i2), str).toString());
            }
        }
    }

    public static void d(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 > i3) {
                throw new IllegalArgumentException(AbstractC1674hK.m(i2, i3, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
    }

    public static void e(String str, String str2) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder();
                sb.append(Mr0.i("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i2), str2));
                sb.append(Mr0.q(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static L60 f(com.bumptech.glide.a aVar, List list) {
        Q70 c1494fa;
        Q70 l8;
        Q8 q8 = aVar.m;
        C1566gA c1566gA = aVar.f34o;
        Context applicationContext = c1566gA.getApplicationContext();
        C0334By c0334By = c1566gA.h;
        L60 l60 = new L60();
        C0865Wk c0865Wk = new C0865Wk();
        C2112lq c2112lq = l60.g;
        synchronized (c2112lq) {
            c2112lq.m.add(c0865Wk);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 27) {
            l60.k(new C0405Er());
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListF = l60.f();
        C1813in c1813in = aVar.p;
        C1884ja c1884ja = new C1884ja(applicationContext, arrayListF, q8, c1813in);
        Ns0 ns0 = new Ns0(q8, new C2743sL(22));
        C2010ko c2010ko = new C2010ko(l60.f(), resources.getDisplayMetrics(), q8, c1813in);
        if (i2 < 28 || !((Map) c0334By.m).containsKey(AbstractC1370eA.class)) {
            c1494fa = new C1494fa(c2010ko, 0);
            l8 = new L8(c2010ko, 2, c1813in);
        } else {
            l8 = new C1592ga(1);
            c1494fa = new C1592ga(0);
        }
        if (i2 >= 28) {
            l60.d("Animation", InputStream.class, Drawable.class, new Q2(new C2720s4(arrayListF, 2, c1813in), 1));
            l60.d("Animation", ByteBuffer.class, Drawable.class, new Q2(new C2720s4(arrayListF, 2, c1813in), 0));
        }
        S70 s70 = new S70(applicationContext);
        N8 n8 = new N8(c1813in);
        C2295nk0 c2295nk0 = new C2295nk0(1);
        C0622Nb c0622Nb = new C0622Nb(24);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        l60.b(ByteBuffer.class, new C2691rp(27));
        l60.b(InputStream.class, new L80(c1813in));
        l60.d("Bitmap", ByteBuffer.class, Bitmap.class, c1494fa);
        l60.d("Bitmap", InputStream.class, Bitmap.class, l8);
        String str = Build.FINGERPRINT;
        if (!"robolectric".equals(str)) {
            l60.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C1494fa(c2010ko, 1));
        }
        l60.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new Ns0(q8, new C3325yL()));
        l60.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, ns0);
        C3082vq0 c3082vq0 = C3082vq0.b;
        l60.a(Bitmap.class, Bitmap.class, c3082vq0);
        l60.d("Bitmap", Bitmap.class, Bitmap.class, new C0615Mu(1));
        l60.c(Bitmap.class, n8);
        l60.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new L8(resources, c1494fa));
        l60.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new L8(resources, l8));
        l60.d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new L8(resources, ns0));
        l60.c(BitmapDrawable.class, new C2720s4(q8, 9, n8));
        l60.d("Animation", InputStream.class, C0672Oz.class, new Bg0(arrayListF, c1884ja, c1813in));
        l60.d("Animation", ByteBuffer.class, C0672Oz.class, c1884ja);
        l60.c(C0672Oz.class, new C0519Jb(25));
        l60.a(C1897jg0.class, C1897jg0.class, c3082vq0);
        l60.d("Bitmap", C1897jg0.class, Bitmap.class, new O8(q8));
        l60.d("legacy_append", Uri.class, Drawable.class, s70);
        l60.d("legacy_append", Uri.class, Bitmap.class, new L8(s70, 1, q8));
        l60.j(new C1982ka(0));
        l60.a(File.class, ByteBuffer.class, new C3082vq0(3));
        l60.a(File.class, InputStream.class, new C0667Ou(new C0622Nb(21)));
        l60.d("legacy_append", File.class, File.class, new C0615Mu(0));
        l60.a(File.class, ParcelFileDescriptor.class, new C0667Ou(new C0519Jb(21)));
        l60.a(File.class, File.class, c3082vq0);
        l60.j(new QF(c1813in));
        if (!"robolectric".equals(str)) {
            l60.j(new C1982ka(2));
        }
        C0711Qm c0711Qm = new C0711Qm(applicationContext, 2);
        C0711Qm c0711Qm2 = new C0711Qm(applicationContext, 0);
        C0711Qm c0711Qm3 = new C0711Qm(applicationContext, 1);
        Class cls = Integer.TYPE;
        l60.a(cls, InputStream.class, c0711Qm);
        l60.a(Integer.class, InputStream.class, c0711Qm);
        l60.a(cls, AssetFileDescriptor.class, c0711Qm2);
        l60.a(Integer.class, AssetFileDescriptor.class, c0711Qm2);
        l60.a(cls, Drawable.class, c0711Qm3);
        l60.a(Integer.class, Drawable.class, c0711Qm3);
        l60.a(Uri.class, InputStream.class, new C0711Qm(applicationContext, 7));
        l60.a(Uri.class, AssetFileDescriptor.class, new C0711Qm(applicationContext, 6));
        V70 v70 = new V70(resources, 2);
        V70 v71 = new V70(resources, 0);
        V70 v72 = new V70(resources, 1);
        l60.a(Integer.class, Uri.class, v70);
        l60.a(cls, Uri.class, v70);
        l60.a(Integer.class, AssetFileDescriptor.class, v71);
        l60.a(cls, AssetFileDescriptor.class, v71);
        l60.a(Integer.class, InputStream.class, v72);
        l60.a(cls, InputStream.class, v72);
        l60.a(String.class, InputStream.class, new RV(1));
        l60.a(Uri.class, InputStream.class, new RV(1));
        l60.a(String.class, InputStream.class, new C3082vq0(6));
        l60.a(String.class, ParcelFileDescriptor.class, new C3082vq0(5));
        l60.a(String.class, AssetFileDescriptor.class, new C3082vq0(4));
        l60.a(Uri.class, InputStream.class, new C1460f6(applicationContext.getAssets(), 1));
        l60.a(Uri.class, AssetFileDescriptor.class, new C1460f6(applicationContext.getAssets(), 0));
        l60.a(Uri.class, InputStream.class, new C0711Qm(applicationContext, 4));
        l60.a(Uri.class, InputStream.class, new C0711Qm(applicationContext, 5));
        if (i2 >= 29) {
            l60.a(Uri.class, InputStream.class, new C2915u40(applicationContext, InputStream.class));
            l60.a(Uri.class, ParcelFileDescriptor.class, new C2915u40(applicationContext, ParcelFileDescriptor.class));
        }
        l60.a(Uri.class, InputStream.class, new C3181wr0(contentResolver, 2));
        l60.a(Uri.class, ParcelFileDescriptor.class, new C3181wr0(contentResolver, 1));
        l60.a(Uri.class, AssetFileDescriptor.class, new C3181wr0(contentResolver, 0));
        l60.a(Uri.class, InputStream.class, new C3082vq0(8));
        l60.a(URL.class, InputStream.class, new C3082vq0(7));
        l60.a(Uri.class, File.class, new C0711Qm(applicationContext, 3));
        l60.a(C2151mA.class, InputStream.class, new RV(2));
        l60.a(byte[].class, ByteBuffer.class, new C3082vq0(1));
        l60.a(byte[].class, InputStream.class, new C3082vq0(2));
        l60.a(Uri.class, Uri.class, c3082vq0);
        l60.a(Drawable.class, Drawable.class, c3082vq0);
        l60.d("legacy_append", Drawable.class, Drawable.class, new C0615Mu(2));
        l60.i(Bitmap.class, BitmapDrawable.class, new M8(resources, 0));
        l60.i(Bitmap.class, byte[].class, c2295nk0);
        l60.i(Drawable.class, byte[].class, new Na0(q8, c2295nk0, c0622Nb, 18));
        l60.i(C0672Oz.class, byte[].class, c0622Nb);
        if (i2 >= 23) {
            Ns0 ns1 = new Ns0(q8, new C2743sL(21));
            l60.d("legacy_append", ByteBuffer.class, Bitmap.class, ns1);
            l60.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new L8(resources, ns1));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OkHttpGlideModule okHttpGlideModule = (OkHttpGlideModule) it.next();
            try {
                okHttpGlideModule.a(l60);
            } catch (AbstractMethodError e2) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(okHttpGlideModule.getClass().getName()), e2);
            }
        }
        return l60;
    }

    public static Object k(int i2) {
        if (i2 >= 2 && i2 <= 1073741824 && Integer.highestOneBit(i2) == i2) {
            if (i2 <= 256) {
                return new byte[i2];
            }
            return i2 <= 65536 ? new short[i2] : new int[i2];
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static boolean l(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z2 = true;
        for (File file2 : fileArrListFiles) {
            z2 = l(file2) && z2;
        }
        return z2;
    }

    public static final C1855j80 m(OV ov, C1951k70 c1951k70, Long l2) throws SocketTimeoutException {
        AbstractC1474fG.j(ov, "<this>");
        AbstractC1474fG.j(c1951k70, "request");
        if (l2 != null && l2.longValue() <= System.nanoTime()) {
            throw new SocketTimeoutException("Se agotó el tiempo para establecer el túnel");
        }
        A50 a50C = ov.c(c1951k70);
        if (l2 != null) {
            a50C.q.d(l2.longValue());
        }
        return a50C.g();
    }

    public static Object n(Object[] objArr, int i2, C3325yL c3325yL) {
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z2 = (i2 & 2) != 0;
        Object obj = null;
        int i4 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int iAbs = (Math.abs(c3325yL.w(obj2) - i3) * 2) + (c3325yL.x(obj2) == z2 ? 0 : 1);
            if (obj == null || i4 > iAbs) {
                obj = obj2;
                i4 = iAbs;
            }
        }
        return obj;
    }

    public static final int p(Zb0 zb0, Zb0[] zb0Arr) {
        AbstractC1474fG.j(zb0, "<this>");
        AbstractC1474fG.j(zb0Arr, "typeParams");
        int iHashCode = (zb0.a().hashCode() * 31) + Arrays.hashCode(zb0Arr);
        C1109bc0 c1109bc0 = new C1109bc0(zb0, 0);
        int iHashCode2 = 1;
        int i2 = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!c1109bc0.hasNext()) {
                break;
            }
            int i3 = i2 * 31;
            String strA = ((Zb0) c1109bc0.next()).a();
            if (strA != null) {
                iHashCode3 = strA.hashCode();
            }
            i2 = i3 + iHashCode3;
        }
        C1109bc0 c1109bc1 = new C1109bc0(zb0, 0);
        while (c1109bc1.hasNext()) {
            int i4 = iHashCode2 * 31;
            U9 u9B = ((Zb0) c1109bc1.next()).b();
            iHashCode2 = i4 + (u9B != null ? u9B.hashCode() : 0);
        }
        return (((iHashCode * 31) + i2) * 31) + iHashCode2;
    }

    public static Object q(Method method, Class cls, Object obj, Object[] objArr) throws NoSuchMethodException {
        Constructor declaredConstructor = S;
        if (declaredConstructor == null) {
            declaredConstructor = AbstractC3391z0.n().getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            S = declaredConstructor;
        }
        return AbstractC3391z0.r(declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    public static boolean r(String str, String str2) {
        String host;
        String strG0;
        AbstractC1474fG.j(str, "url");
        URI uriX = x(str);
        if (uriX == null || !AbstractC1899jh0.N(uriX.getScheme(), "https", true) || uriX.isOpaque() || uriX.getUserInfo() != null || (host = uriX.getHost()) == null || (strG0 = AbstractC1119bh0.G0(host, '.')) == null) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String lowerCase = strG0.toLowerCase(locale);
        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        String lowerCase2 = AbstractC1119bh0.G0(AbstractC1119bh0.E0(str2).toString(), '.').toLowerCase(locale);
        AbstractC1474fG.i(lowerCase2, "toLowerCase(...)");
        return AbstractC1474fG.b(lowerCase, lowerCase2) || AbstractC1899jh0.L(lowerCase, ".".concat(lowerCase2), false);
    }

    public static boolean s(String str) {
        String host;
        String strG0;
        URI uriX = x(str);
        if (uriX != null && (host = uriX.getHost()) != null && (strG0 = AbstractC1119bh0.G0(host, '.')) != null) {
            String lowerCase = strG0.toLowerCase(Locale.ROOT);
            AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
            if (!(!AbstractC1899jh0.O(lowerCase))) {
                lowerCase = null;
            }
            if (lowerCase != null) {
                Integer numJ = AbstractC1802ih0.J(AbstractC1119bh0.A0(lowerCase, '.', ""));
                return AbstractC1899jh0.N(uriX.getScheme(), "https", true) && !uriX.isOpaque() && uriX.getUserInfo() == null && !(AbstractC1474fG.b(lowerCase, "localhost") || AbstractC1474fG.b(lowerCase, "::1") || (numJ != null && numJ.intValue() == 127));
            }
        }
        return false;
    }

    public static boolean t(C0821Us c0821Us, C0795Ts c0795Ts) {
        AbstractC1474fG.j(c0821Us, "spec");
        AbstractC1474fG.j(c0795Ts, "page");
        String str = c0821Us.c;
        if (str == null) {
            str = c0795Ts.a;
        }
        if (str == null) {
            str = "";
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        if (AbstractC1899jh0.N(c0821Us.b, "EventsPlaylist", true)) {
            return true;
        }
        List<C0613Ms> list = c0795Ts.b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C0613Ms c0613Ms : list) {
                if (c0613Ms.b == EnumC0639Ns.m || c0613Ms.h) {
                    return true;
                }
            }
        }
        List listK = AbstractC0937Ze.K("en vivo", "live", "próxim", "proxim", "evento");
        if (!listK.isEmpty()) {
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                if (AbstractC1119bh0.W(lowerCase, (CharSequence) it.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int u(int i2, int i3, int i4) {
        return (i2 & (~i4)) | (i3 & i4);
    }

    public static C2152mB v(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            String str = strArr2[i3];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null".toString());
            }
            strArr2[i3] = AbstractC1119bh0.E0(str).toString();
        }
        int iN = Sr0.n(0, strArr2.length - 1, 2);
        if (iN >= 0) {
            while (true) {
                String str2 = strArr2[i2];
                String str3 = strArr2[i2 + 1];
                c(str2);
                e(str3, str2);
                if (i2 == iN) {
                    break;
                }
                i2 += 2;
            }
        }
        return new C2152mB(strArr2);
    }

    public static String w(String str) {
        String host;
        String strG0;
        URI uriX = x(str);
        if (uriX == null || (host = uriX.getHost()) == null || (strG0 = AbstractC1119bh0.G0(host, '.')) == null) {
            return null;
        }
        String lowerCase = strG0.toLowerCase(Locale.ROOT);
        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        if (true ^ AbstractC1899jh0.O(lowerCase)) {
            return lowerCase;
        }
        return null;
    }

    public static URI x(String str) {
        Object objK;
        if (str == null) {
            return null;
        }
        if (!(!AbstractC1899jh0.O(str))) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            objK = new URI(str);
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        return (URI) (objK instanceof C2439p80 ? null : objK);
    }

    public static void y(Context context, String str) {
        synchronized (a) {
            if (str.equals("")) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                    xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                    xmlSerializerNewSerializer.startTag(null, "locales");
                    xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                    xmlSerializerNewSerializer.endTag(null, "locales");
                    xmlSerializerNewSerializer.endDocument();
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (Exception unused2) {
                    if (fileOutputStreamOpenFileOutput != null) {
                        fileOutputStreamOpenFileOutput.close();
                    }
                } catch (Throwable th) {
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused4) {
            }
        }
    }

    public static String z(Context context) {
        String attributeValue;
        synchronized (a) {
            attributeValue = "";
            try {
                FileInputStream fileInputStreamOpenFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                    int depth = xmlPullParserNewPullParser.getDepth();
                    while (true) {
                        int next = xmlPullParserNewPullParser.next();
                        if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                            if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "application_locales");
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (IOException | XmlPullParserException unused2) {
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                } catch (Throwable th) {
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
                if (attributeValue.isEmpty()) {
                    context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                }
            } catch (FileNotFoundException unused4) {
                return "";
            }
        }
        return attributeValue;
    }

    public abstract Typeface g(Context context, C0410Ew c0410Ew, Resources resources, int i2);

    public abstract Typeface h(Context context, C0488Hw[] c0488HwArr, int i2);

    public Typeface i(Context context, InputStream inputStream) {
        File fileU = AbstractC1376eG.u(context);
        if (fileU == null) {
            return null;
        }
        try {
            if (AbstractC1376eG.n(fileU, inputStream)) {
                return Typeface.createFromFile(fileU.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileU.delete();
        }
    }

    public Typeface j(Context context, Resources resources, int i2, String str, int i3) {
        File fileU = AbstractC1376eG.u(context);
        if (fileU == null) {
            return null;
        }
        try {
            if (AbstractC1376eG.m(fileU, resources, i2)) {
                return Typeface.createFromFile(fileU.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileU.delete();
        }
    }

    public C0488Hw o(int i2, C0488Hw[] c0488HwArr) {
        return (C0488Hw) n(c0488HwArr, i2, new C3325yL());
    }
}
