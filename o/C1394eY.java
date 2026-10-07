package o;

import android.util.Base64;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.eY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1394eY extends Ph0 implements InterfaceC0775Sy {
    public String m;
    public Serializable n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f755o;
    public final /* synthetic */ Ds0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1394eY(Ds0 ds0, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.p = ds0;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1394eY) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1394eY(this.p, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0106 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // o.R7
    public final Object r(Object obj) throws Exception {
        Exception exc;
        String str;
        Exception e;
        ?? r2;
        ?? r0;
        String str2;
        String str3;
        String strM;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        ?? r3 = this.f755o;
        Ds0 ds0 = this.p;
        try {
            try {
                if (r3 != 0) {
                    if (r3 == 1) {
                        str3 = (String) this.n;
                        String str4 = this.m;
                        try {
                            Jp0.O(obj);
                        } catch (Exception e2) {
                            e = e2;
                            e.getMessage();
                        }
                    } else {
                        if (r3 != 2) {
                            if (r3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            exc = (Exception) this.n;
                            str = this.m;
                            try {
                                Jp0.O(obj);
                                Js0 js0 = (Js0) obj;
                                String str5 = js0.l;
                                return js0;
                            } catch (Exception e3) {
                                e = e3;
                                e.getMessage();
                                throw new Exception("Failed to extract video from " + str + ": direct=" + exc.getMessage() + ", webview=" + e.getMessage());
                            }
                        }
                        String str6 = this.m;
                        Jp0.O(obj);
                    }
                    Js0 js1 = (Js0) obj;
                    String str7 = js1.l;
                    return js1;
                }
                Jp0.O(obj);
                String str8 = ds0.n;
                if (str8 == null) {
                    str8 = ds0.l;
                }
                r3 = str8;
                boolean zU = AbstractC1899jh0.U(r3, "http", false);
                r2 = r3;
                if (zU) {
                    r0 = r2;
                } else {
                    byte[] bArrDecode = Base64.decode((String) r3, 0);
                    AbstractC1474fG.i(bArrDecode, "decode(...)");
                    Charset charset = AbstractC1305dd.a;
                    str2 = new String(bArrDecode, charset);
                    if (!AbstractC1119bh0.W(str2, "https://", false)) {
                        byte[] bytes = r3.getBytes(charset);
                        AbstractC1474fG.i(bytes, "getBytes(...)");
                        byte[] bArrEncode = Base64.encode(bytes, 0);
                        AbstractC1474fG.i(bArrEncode, "encode(...)");
                        String string = AbstractC1119bh0.E0(new String(bArrEncode, charset)).toString();
                        C1590gY c1590gY = C1590gY.b;
                        String str9 = "https://pelisplus.to/player/" + string;
                        try {
                            this.m = r3;
                            this.n = str2;
                            this.f755o = 1;
                            obj = C1590gY.p(str9, this);
                            if (obj == enumC1706hi) {
                                return enumC1706hi;
                            }
                            str3 = str2;
                        } catch (Exception e4) {
                            e = e4;
                            str3 = str2;
                            e.getMessage();
                        }
                    }
                    r0 = str2;
                }
                int i = AbstractC3473zs.a;
                this.m = r0;
                this.n = null;
                this.f755o = 2;
                obj = C0622Nb.m(r0, ds0, this, 4);
                if (obj == enumC1706hi) {
                    return enumC1706hi;
                }
                Js0 js2 = (Js0) obj;
                String str10 = js2.l;
                return js2;
                C3176wp c3176wpX = ((C0660On) obj).X("script:containsData(window.onload)");
                if (c3176wpX != null && (strM = c3176wpX.M()) != null) {
                    Pattern patternCompile = Pattern.compile("(https?://[^\\s'\"]+)");
                    AbstractC1474fG.i(patternCompile, "compile(...)");
                    Matcher matcher = patternCompile.matcher(strM);
                    AbstractC1474fG.i(matcher, "matcher(...)");
                    JN jnA = AbstractC1370eA.a(matcher, 0, strM);
                    String str11 = jnA != null ? (String) ((HN) jnA.a()).get(1) : null;
                    if (str11 != null) {
                        str3 = str11;
                    }
                }
                str2 = str3;
                r0 = str2;
            } catch (Exception e5) {
                exc = e5;
                exc.getMessage();
                try {
                    Hv0 hv0 = new Hv0();
                    this.m = "https://pelisplus.to/player/";
                    this.n = exc;
                    this.f755o = 3;
                    Object objG = hv0.g("https://pelisplus.to/player/", C1330dq.l, this);
                    if (objG == enumC1706hi) {
                        return enumC1706hi;
                    }
                    str = "https://pelisplus.to/player/";
                    obj = objG;
                } catch (Exception e6) {
                    str = "https://pelisplus.to/player/";
                    e = e6;
                    e.getMessage();
                    throw new Exception("Failed to extract video from " + str + ": direct=" + exc.getMessage() + ", webview=" + e.getMessage());
                }
            }
        } catch (Exception e7) {
            e7.getMessage();
            r2 = r3;
        }
        int i2 = AbstractC3473zs.a;
        this.m = r0;
        this.n = null;
        this.f755o = 2;
        obj = C0622Nb.m(r0, ds0, this, 4);
        if (obj == enumC1706hi) {
            return enumC1706hi;
        }
        Js0 js3 = (Js0) obj;
        String str12 = js3.l;
        return js3;
    }
}
