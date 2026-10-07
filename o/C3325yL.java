package o;

import android.app.Dialog;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.graphics.Path;
import android.graphics.drawable.GradientDrawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.skidush.clonex.R;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.slf4j.ILoggerFactory;

/* JADX INFO: renamed from: o.yL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3325yL implements InterfaceC0406Es, MO, ILoggerFactory, BW, InterfaceC2719s30, InterfaceC2387oi, IV, Ls0 {
    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    public static final String n(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5 = -1;
        byte[] bArr3 = PublicSuffixDatabase.e;
        int length = bArr.length;
        int i6 = 0;
        while (i6 < length) {
            int i7 = (i6 + length) / 2;
            while (i7 > i5 && bArr[i7] != 10) {
                i7 += i5;
            }
            int i8 = i7 + 1;
            int i9 = 1;
            while (true) {
                i2 = i8 + i9;
                if (bArr[i2] == 10) {
                    break;
                }
                i9++;
            }
            int i10 = i2 - i8;
            int i11 = i;
            boolean z2 = false;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte b = bArr2[i11][i12];
                    byte[] bArr4 = Mr0.a;
                    int i14 = b & 255;
                    z = z2;
                    i3 = i14;
                }
                byte b2 = bArr[i8 + i13];
                byte[] bArr5 = Mr0.a;
                i4 = i3 - (b2 & 255);
                if (i4 != 0) {
                    break;
                }
                i13++;
                i12++;
                if (i13 == i10) {
                    break;
                }
                if (bArr2[i11].length != i12) {
                    z2 = z;
                } else {
                    if (i11 == bArr2.length - 1) {
                        break;
                    }
                    i11++;
                    z2 = true;
                    i12 = -1;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i15 = i10 - i13;
                    int length2 = bArr2[i11].length - i12;
                    int length3 = bArr2.length;
                    for (int i16 = i11 + 1; i16 < length3; i16++) {
                        length2 += bArr2[i16].length;
                    }
                    if (length2 < i15) {
                        length = i7;
                    } else if (length2 <= i15) {
                        Charset charset = StandardCharsets.UTF_8;
                        AbstractC1474fG.i(charset, "UTF_8");
                        return new String(bArr, i8, i10, charset);
                    }
                }
                i6 = i2 + 1;
            } else {
                length = i7;
            }
            i5 = -1;
        }
        return null;
    }

    public static final String o(String str) {
        ZF zfB;
        Context context = Hv0.b;
        JN jnA = AbstractC1370eA.a(AbstractC1701hf0.m(",https?://", "compile(...)", str, "matcher(...)"), 0, str);
        Integer numValueOf = (jnA == null || (zfB = jnA.b()) == null) ? null : Integer.valueOf(zfB.l);
        if (numValueOf != null) {
            str = str.substring(0, numValueOf.intValue());
            AbstractC1474fG.i(str, "substring(...)");
        }
        Pattern patternCompile = Pattern.compile(":T\\d+$");
        AbstractC1474fG.i(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(str).replaceAll("");
        AbstractC1474fG.i(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public static final int p(int i) {
        return (i & 2) != 0 ? i | 64 : i;
    }

    public static final String r(String str, String str2) {
        Context context = Hv0.b;
        if (AbstractC1899jh0.N(str, "Cookie", true) || AbstractC1899jh0.N(str, "Authorization", true)) {
            return "<redacted>";
        }
        if (AbstractC1899jh0.N(str, "Referer", true) || AbstractC1899jh0.N(str, "Origin", true)) {
            return y(str2);
        }
        return AbstractC1119bh0.D0(50, str2).concat(str2.length() > 50 ? "..." : "");
    }

    public static EnumC1139br0 u(String str) {
        Object next;
        C0404Eq c0404Eq = EnumC1139br0.r;
        c0404Eq.getClass();
        G g = new G(0, c0404Eq);
        do {
            if (!g.hasNext()) {
                next = null;
                break;
            }
            next = g.next();
        } while (!AbstractC1899jh0.N(((EnumC1139br0) next).l, str, true));
        EnumC1139br0 enumC1139br0 = (EnumC1139br0) next;
        return enumC1139br0 == null ? EnumC1139br0.f706o : enumC1139br0;
    }

    public static Path v(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    public static String y(String str) {
        int iD0 = AbstractC1119bh0.d0(str, '?', 0, false, 6);
        if (iD0 < 0) {
            return AbstractC1119bh0.A0(str, '#', str);
        }
        String strSubstring = str.substring(iD0 + 1);
        AbstractC1474fG.i(strSubstring, "substring(...)");
        List<String> listS0 = AbstractC1119bh0.s0(AbstractC1119bh0.A0(strSubstring, '#', strSubstring), new char[]{'&'}, 0, 6);
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(listS0, 10));
        for (String str2 : listS0) {
            arrayList.add(AbstractC1119bh0.E0(AbstractC1119bh0.A0(str2, '=', str2)).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!AbstractC1899jh0.O((String) obj)) {
                arrayList2.add(obj);
            }
        }
        List listX = AbstractC0911Ye.X(arrayList2);
        String strSubstring2 = str.substring(0, iD0);
        AbstractC1474fG.i(strSubstring2, "substring(...)");
        return strSubstring2.concat(AbstractC0911Ye.h0(listX, "&", "?", null, Iu0.r, 28));
    }

    public static void z(Context context, String str, String str2, ArrayList arrayList, Set set, boolean z, int i, boolean z2, int i2, InterfaceC0412Ey interfaceC0412Ey) {
        final C1111bd0 c1111bd0 = new C1111bd0(context, str, str2, arrayList, set, z, i, z2, i2, interfaceC0412Ey);
        Dialog dialog = c1111bd0.j;
        dialog.requestWindowFeature(1);
        C1215ch c1215ch = c1111bd0.g;
        dialog.setContentView((LinearLayout) c1215ch.m);
        TextView textView = (TextView) c1215ch.p;
        textView.setText(str);
        TextView textView2 = (TextView) c1215ch.n;
        textView2.setText(str2);
        ImageView imageView = c1215ch.f722o;
        imageView.setImageResource(i2);
        C1123bj0 c1123bj0 = c1111bd0.i;
        textView.setTextColor(c1123bj0.e);
        textView2.setTextColor(c1123bj0.f);
        int i3 = c1123bj0.c;
        imageView.setImageTintList(ColorStateList.valueOf(i3));
        ((FrameLayout) c1215ch.t).setBackground(c1111bd0.b(AbstractC1894jf.f(i3, 32), 15.0f));
        GradientDrawable gradientDrawableB = c1111bd0.b(AbstractC1894jf.f(c1123bj0.d, 120), 2.0f);
        View view = c1215ch.q;
        view.setBackground(gradientDrawableB);
        view.setVisibility(z2 ^ true ? 0 : 8);
        c1111bd0.k = new C1013ad0(c1111bd0);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        RecyclerView recyclerView = (RecyclerView) c1215ch.u;
        recyclerView.setLayoutManager(linearLayoutManager);
        C1013ad0 c1013ad0 = c1111bd0.k;
        if (c1013ad0 == null) {
            AbstractC1474fG.U("adapter");
            throw null;
        }
        recyclerView.setAdapter(c1013ad0);
        recyclerView.setItemAnimator(null);
        final int i4 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: o.Xc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        C1111bd0 c1111bd1 = c1111bd0;
                        AbstractC1474fG.j(c1111bd1, "this$0");
                        c1111bd1.j.dismiss();
                        break;
                    default:
                        C1111bd0 c1111bd2 = c1111bd0;
                        AbstractC1474fG.j(c1111bd2, "this$0");
                        Set set2 = c1111bd2.h;
                        if (set2.size() >= c1111bd2.d) {
                            c1111bd2.f.b(AbstractC0911Ye.B0(set2));
                            c1111bd2.j.dismiss();
                        } else {
                            Toast.makeText(c1111bd2.a, R.string.settings_visible_providers_required, 0).show();
                        }
                        break;
                }
            }
        };
        TextView textView3 = c1215ch.s;
        textView3.setOnClickListener(onClickListener);
        TextView textView4 = c1215ch.r;
        AbstractC1474fG.i(textView4, "settingsDialogApply");
        textView4.setVisibility(z ? 0 : 8);
        AbstractC1376eG.a(textView4, i3, z2);
        AbstractC1376eG.l(textView3, z2);
        final int i5 = 1;
        textView4.setOnClickListener(new View.OnClickListener() { // from class: o.Xc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i5) {
                    case 0:
                        C1111bd0 c1111bd1 = c1111bd0;
                        AbstractC1474fG.j(c1111bd1, "this$0");
                        c1111bd1.j.dismiss();
                        break;
                    default:
                        C1111bd0 c1111bd2 = c1111bd0;
                        AbstractC1474fG.j(c1111bd2, "this$0");
                        Set set2 = c1111bd2.h;
                        if (set2.size() >= c1111bd2.d) {
                            c1111bd2.f.b(AbstractC0911Ye.B0(set2));
                            c1111bd2.j.dismiss();
                        } else {
                            Toast.makeText(c1111bd2.a, R.string.settings_visible_providers_required, 0).show();
                        }
                        break;
                }
            }
        });
        dialog.setOnShowListener(new HL(1, c1111bd0));
        dialog.show();
    }

    @Override // o.MO
    public MediaCodecInfo a(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // org.slf4j.ILoggerFactory
    public CL b(String str) {
        return C1487fT.l;
    }

    @Override // o.IV
    public InterfaceC2664rb0 d() {
        return new C3114w7(-9223372036854775807L);
    }

    @Override // o.IV
    public long e(C0554Kk c0554Kk) {
        return -1L;
    }

    @Override // o.MO
    public boolean f(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // o.MO
    public int h() {
        return MediaCodecList.getCodecCount();
    }

    @Override // o.Ls0
    public void i(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // o.MO
    public boolean j(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // o.MO
    public boolean l() {
        return false;
    }

    @Override // o.Ls0
    public void m(MediaExtractor mediaExtractor, Object obj) throws IOException {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // o.InterfaceC0406Es
    public Object q() {
        return new C3422zL();
    }

    public float t(float f, float f2) {
        return 1.0f;
    }

    public int w(Object obj) {
        return ((C0488Hw) obj).c;
    }

    public boolean x(Object obj) {
        return ((C0488Hw) obj).d;
    }

    @Override // o.IV
    public void k(long j) {
    }

    @Override // o.InterfaceC2719s30
    public void g(int i, Object obj) {
    }

    @Override // o.BW
    public void c(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }
}
