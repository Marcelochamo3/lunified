package o;

import android.content.Context;

/* JADX INFO: renamed from: o.cx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1248cx0 extends Ph0 implements InterfaceC0412Ey {
    public Context m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f729o;
    public byte[] p;
    public C1951k70 q;
    public long r;
    public int s;
    public int t;
    public final /* synthetic */ Long u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1248cx0(Long l, String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(1, interfaceC0473Hh);
        this.u = l;
        this.v = str;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        return new C1248cx0(this.u, this.v, (InterfaceC0473Hh) obj).r(C2985uq0.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:12|147|13|14|141|66|67|91|(0)|98|(4:100|(2:102|108)(1:108)|109|110)(2:111|(2:113|(2:115|(2:117|(2:119|120)(2:121|122))(2:123|124))(2:125|126))(2:127|128))) */
    /* JADX WARN: Can't wrap try/catch for region: R(23:46|(2:49|47)|151|50|139|51|149|52|53|54|55|143|56|145|57|58|59|137|60|61|135|62|(1:64)(8:65|141|66|67|91|(0)|98|(4:100|(2:102|108)(1:108)|109|110)(2:111|(2:113|(2:115|(2:117|(2:119|120)(2:121|122))(2:123|124))(2:125|126))(2:127|128)))) */
    /* JADX WARN: Code duplicated, block: B:100:0x0278  */
    /* JADX WARN: Code duplicated, block: B:102:0x027e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0292  */
    /* JADX WARN: Code duplicated, block: B:111:0x0298  */
    /* JADX WARN: Code duplicated, block: B:113:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:115:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:117:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:119:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:121:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:123:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:125:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:127:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:129:0x0304 A[LOOP:1: B:84:0x020a->B:129:0x0304, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:131:0x031a  */
    /* JADX WARN: Code duplicated, block: B:152:0x0319 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:41:0x010d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0110  */
    /* JADX WARN: Code duplicated, block: B:46:0x0139  */
    /* JADX WARN: Code duplicated, block: B:49:0x0192 A[LOOP:0: B:47:0x018c->B:49:0x0192, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x01d6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:85:0x020c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0238 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:93:0x0246 A[ADDED_TO_REGION] */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e6, code lost:
    
        r6 = r0;
        r0 = r3;
        r3 = r10;
        r11 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01eb, code lost:
    
        r15 = r6;
        r6 = r0;
        r0 = r3;
        r3 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01f0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01f2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01f5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01f6, code lost:
    
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01f9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01fa, code lost:
    
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01fd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01fe, code lost:
    
        r11 = r22;
        r6 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0203, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0204, code lost:
    
        r11 = r22;
        r6 = r32;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x0139, please report this as an issue */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x0264 -> B:97:0x0267). Please report as a decompilation issue!!! */
    @Override // o.R7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 814
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1248cx0.r(java.lang.Object):java.lang.Object");
    }
}
