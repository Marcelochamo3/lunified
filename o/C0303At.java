package o;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.At, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0303At extends Ph0 implements InterfaceC0412Ey {
    public Context m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f178o;
    public C1951k70 p;
    public long q;
    public int r;
    public int s;
    public final /* synthetic */ JSONObject t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0303At(JSONObject jSONObject, InterfaceC0473Hh interfaceC0473Hh) {
        super(1, interfaceC0473Hh);
        this.t = jSONObject;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        return new C0303At(this.t, (InterfaceC0473Hh) obj).r(C2985uq0.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:12|121|13|14|119|47|48|75|(0)|82|(4:84|(2:86|92)(1:92)|93|94)(4:95|(2:97|(2:99|(2:101|102)(2:103|104)))|105|106)) */
    /* JADX WARN: Can't wrap try/catch for region: R(25:26|(2:29|27)|129|30|113|31|117|32|33|34|115|35|123|36|37|38|111|39|40|127|41|42|125|43|(1:45)(8:46|119|47|48|75|(0)|82|(4:84|(2:86|92)(1:92)|93|94)(4:95|(2:97|(2:99|(2:101|102)(2:103|104)))|105|106))) */
    /* JADX WARN: Code duplicated, block: B:101:0x0245  */
    /* JADX WARN: Code duplicated, block: B:103:0x0253  */
    /* JADX WARN: Code duplicated, block: B:107:0x0263 A[LOOP:1: B:67:0x019d->B:107:0x0263, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x0276  */
    /* JADX WARN: Code duplicated, block: B:130:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:29:0x010e A[LOOP:0: B:27:0x0108->B:29:0x010e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x0152 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x0153  */
    /* JADX WARN: Code duplicated, block: B:68:0x019f  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x01ca A[EDGE_INSN: B:73:0x01ca->B:74:0x01cb BREAK  A[LOOP:1: B:67:0x019d->B:107:0x0263]] */
    /* JADX WARN: Code duplicated, block: B:77:0x01da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x020b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0211  */
    /* JADX WARN: Code duplicated, block: B:92:0x0225  */
    /* JADX WARN: Code duplicated, block: B:95:0x022b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0235  */
    /* JADX WARN: Code duplicated, block: B:99:0x023d  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0169, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x016a, code lost:
    
        r28 = r4;
        r4 = r0;
        r0 = r11;
        r11 = r12;
        r13 = r15;
        r15 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0173, code lost:
    
        r13 = r15;
        r15 = r4;
        r4 = r0;
        r0 = r5;
        r28 = r14;
        r14 = r3;
        r3 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x017d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x017f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0182, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0183, code lost:
    
        r5 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0186, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0187, code lost:
    
        r5 = r25;
        r11 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x018c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x018d, code lost:
    
        r5 = r25;
        r11 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0192, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0193, code lost:
    
        r4 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0196, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0197, code lost:
    
        r4 = r31;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x01f4 -> B:81:0x01f7). Please report as a decompilation issue!!! */
    @Override // o.R7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0303At.r(java.lang.Object):java.lang.Object");
    }
}
