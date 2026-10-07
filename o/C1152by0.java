package o;

import android.os.SystemClock;
import com.skidush.clonex.models.Video$Type;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.by0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1152by0 implements Q30 {
    public static volatile Mx0 e;
    public static volatile Rx0 h;
    public static final C1152by0 b = new C1152by0();
    public static final Set c = Lc0.T("todos los canales", "channellist");
    public static final YS d = AbstractC1923jt0.a();
    public static final ConcurrentHashMap f = new ConcurrentHashMap();
    public static final Object g = new Object();

    public static final List p(int i) throws JSONException {
        Lx0 lx0 = Lx0.b;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("columnId", i);
        jSONObject.put("dataVersion", "");
        jSONObject.put("pageSize", 3000);
        jSONObject.put("pageNum", 1);
        jSONObject.put("expireTimeStr", "");
        JSONObject jSONObjectN = Lx0.N(8, jSONObject);
        Lx0.O(jSONObjectN, "Canales de televisión");
        JSONObject jSONObjectOptJSONObject = jSONObjectN.optJSONObject("data");
        return Lx0.G(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray("channelList") : null);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0299 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0037, B:60:0x0131, B:61:0x0149, B:64:0x0153, B:66:0x0172, B:67:0x017a, B:68:0x0182, B:70:0x0188, B:72:0x019f, B:73:0x01b6, B:75:0x01bc, B:77:0x01dc, B:79:0x01ed, B:81:0x01f7, B:83:0x0201, B:85:0x0207, B:86:0x020f, B:87:0x0221, B:89:0x0227, B:91:0x0259, B:93:0x0261, B:95:0x0268, B:100:0x0284, B:101:0x0293, B:103:0x0299, B:105:0x02b9, B:108:0x02c5, B:112:0x02e6, B:116:0x030d, B:117:0x033d, B:118:0x0364, B:120:0x036a, B:122:0x0373, B:123:0x0386, B:124:0x038a, B:125:0x038b, B:126:0x03a0, B:128:0x03a6, B:130:0x03cb, B:131:0x03cd, B:132:0x03e2, B:133:0x03eb, B:135:0x03f1, B:137:0x0402, B:139:0x0424, B:140:0x0428, B:143:0x0436, B:144:0x043f, B:146:0x0445, B:147:0x0452, B:26:0x0065, B:29:0x006f, B:31:0x0085, B:36:0x0090, B:38:0x0096, B:43:0x00a0, B:45:0x00d7, B:47:0x00df, B:48:0x00ec, B:50:0x00f2, B:52:0x0105, B:53:0x0109, B:55:0x0112, B:56:0x0116, B:150:0x0469, B:151:0x0470, B:152:0x0471, B:153:0x0478), top: B:156:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:105:0x02b9 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0037, B:60:0x0131, B:61:0x0149, B:64:0x0153, B:66:0x0172, B:67:0x017a, B:68:0x0182, B:70:0x0188, B:72:0x019f, B:73:0x01b6, B:75:0x01bc, B:77:0x01dc, B:79:0x01ed, B:81:0x01f7, B:83:0x0201, B:85:0x0207, B:86:0x020f, B:87:0x0221, B:89:0x0227, B:91:0x0259, B:93:0x0261, B:95:0x0268, B:100:0x0284, B:101:0x0293, B:103:0x0299, B:105:0x02b9, B:108:0x02c5, B:112:0x02e6, B:116:0x030d, B:117:0x033d, B:118:0x0364, B:120:0x036a, B:122:0x0373, B:123:0x0386, B:124:0x038a, B:125:0x038b, B:126:0x03a0, B:128:0x03a6, B:130:0x03cb, B:131:0x03cd, B:132:0x03e2, B:133:0x03eb, B:135:0x03f1, B:137:0x0402, B:139:0x0424, B:140:0x0428, B:143:0x0436, B:144:0x043f, B:146:0x0445, B:147:0x0452, B:26:0x0065, B:29:0x006f, B:31:0x0085, B:36:0x0090, B:38:0x0096, B:43:0x00a0, B:45:0x00d7, B:47:0x00df, B:48:0x00ec, B:50:0x00f2, B:52:0x0105, B:53:0x0109, B:55:0x0112, B:56:0x0116, B:150:0x0469, B:151:0x0470, B:152:0x0471, B:153:0x0478), top: B:156:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:107:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:110:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:111:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:114:0x0308  */
    /* JADX WARN: Code duplicated, block: B:115:0x030b  */
    /* JADX WARN: Code duplicated, block: B:120:0x036a A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0037, B:60:0x0131, B:61:0x0149, B:64:0x0153, B:66:0x0172, B:67:0x017a, B:68:0x0182, B:70:0x0188, B:72:0x019f, B:73:0x01b6, B:75:0x01bc, B:77:0x01dc, B:79:0x01ed, B:81:0x01f7, B:83:0x0201, B:85:0x0207, B:86:0x020f, B:87:0x0221, B:89:0x0227, B:91:0x0259, B:93:0x0261, B:95:0x0268, B:100:0x0284, B:101:0x0293, B:103:0x0299, B:105:0x02b9, B:108:0x02c5, B:112:0x02e6, B:116:0x030d, B:117:0x033d, B:118:0x0364, B:120:0x036a, B:122:0x0373, B:123:0x0386, B:124:0x038a, B:125:0x038b, B:126:0x03a0, B:128:0x03a6, B:130:0x03cb, B:131:0x03cd, B:132:0x03e2, B:133:0x03eb, B:135:0x03f1, B:137:0x0402, B:139:0x0424, B:140:0x0428, B:143:0x0436, B:144:0x043f, B:146:0x0445, B:147:0x0452, B:26:0x0065, B:29:0x006f, B:31:0x0085, B:36:0x0090, B:38:0x0096, B:43:0x00a0, B:45:0x00d7, B:47:0x00df, B:48:0x00ec, B:50:0x00f2, B:52:0x0105, B:53:0x0109, B:55:0x0112, B:56:0x0116, B:150:0x0469, B:151:0x0470, B:152:0x0471, B:153:0x0478), top: B:156:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0373 A[Catch: all -> 0x003c, LOOP:5: B:118:0x0364->B:122:0x0373, LOOP_END, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0037, B:60:0x0131, B:61:0x0149, B:64:0x0153, B:66:0x0172, B:67:0x017a, B:68:0x0182, B:70:0x0188, B:72:0x019f, B:73:0x01b6, B:75:0x01bc, B:77:0x01dc, B:79:0x01ed, B:81:0x01f7, B:83:0x0201, B:85:0x0207, B:86:0x020f, B:87:0x0221, B:89:0x0227, B:91:0x0259, B:93:0x0261, B:95:0x0268, B:100:0x0284, B:101:0x0293, B:103:0x0299, B:105:0x02b9, B:108:0x02c5, B:112:0x02e6, B:116:0x030d, B:117:0x033d, B:118:0x0364, B:120:0x036a, B:122:0x0373, B:123:0x0386, B:124:0x038a, B:125:0x038b, B:126:0x03a0, B:128:0x03a6, B:130:0x03cb, B:131:0x03cd, B:132:0x03e2, B:133:0x03eb, B:135:0x03f1, B:137:0x0402, B:139:0x0424, B:140:0x0428, B:143:0x0436, B:144:0x043f, B:146:0x0445, B:147:0x0452, B:26:0x0065, B:29:0x006f, B:31:0x0085, B:36:0x0090, B:38:0x0096, B:43:0x00a0, B:45:0x00d7, B:47:0x00df, B:48:0x00ec, B:50:0x00f2, B:52:0x0105, B:53:0x0109, B:55:0x0112, B:56:0x0116, B:150:0x0469, B:151:0x0470, B:152:0x0471, B:153:0x0478), top: B:156:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:128:0x03a6 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0037, B:60:0x0131, B:61:0x0149, B:64:0x0153, B:66:0x0172, B:67:0x017a, B:68:0x0182, B:70:0x0188, B:72:0x019f, B:73:0x01b6, B:75:0x01bc, B:77:0x01dc, B:79:0x01ed, B:81:0x01f7, B:83:0x0201, B:85:0x0207, B:86:0x020f, B:87:0x0221, B:89:0x0227, B:91:0x0259, B:93:0x0261, B:95:0x0268, B:100:0x0284, B:101:0x0293, B:103:0x0299, B:105:0x02b9, B:108:0x02c5, B:112:0x02e6, B:116:0x030d, B:117:0x033d, B:118:0x0364, B:120:0x036a, B:122:0x0373, B:123:0x0386, B:124:0x038a, B:125:0x038b, B:126:0x03a0, B:128:0x03a6, B:130:0x03cb, B:131:0x03cd, B:132:0x03e2, B:133:0x03eb, B:135:0x03f1, B:137:0x0402, B:139:0x0424, B:140:0x0428, B:143:0x0436, B:144:0x043f, B:146:0x0445, B:147:0x0452, B:26:0x0065, B:29:0x006f, B:31:0x0085, B:36:0x0090, B:38:0x0096, B:43:0x00a0, B:45:0x00d7, B:47:0x00df, B:48:0x00ec, B:50:0x00f2, B:52:0x0105, B:53:0x0109, B:55:0x0112, B:56:0x0116, B:150:0x0469, B:151:0x0470, B:152:0x0471, B:153:0x0478), top: B:156:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:130:0x03cb A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0037, B:60:0x0131, B:61:0x0149, B:64:0x0153, B:66:0x0172, B:67:0x017a, B:68:0x0182, B:70:0x0188, B:72:0x019f, B:73:0x01b6, B:75:0x01bc, B:77:0x01dc, B:79:0x01ed, B:81:0x01f7, B:83:0x0201, B:85:0x0207, B:86:0x020f, B:87:0x0221, B:89:0x0227, B:91:0x0259, B:93:0x0261, B:95:0x0268, B:100:0x0284, B:101:0x0293, B:103:0x0299, B:105:0x02b9, B:108:0x02c5, B:112:0x02e6, B:116:0x030d, B:117:0x033d, B:118:0x0364, B:120:0x036a, B:122:0x0373, B:123:0x0386, B:124:0x038a, B:125:0x038b, B:126:0x03a0, B:128:0x03a6, B:130:0x03cb, B:131:0x03cd, B:132:0x03e2, B:133:0x03eb, B:135:0x03f1, B:137:0x0402, B:139:0x0424, B:140:0x0428, B:143:0x0436, B:144:0x043f, B:146:0x0445, B:147:0x0452, B:26:0x0065, B:29:0x006f, B:31:0x0085, B:36:0x0090, B:38:0x0096, B:43:0x00a0, B:45:0x00d7, B:47:0x00df, B:48:0x00ec, B:50:0x00f2, B:52:0x0105, B:53:0x0109, B:55:0x0112, B:56:0x0116, B:150:0x0469, B:151:0x0470, B:152:0x0471, B:153:0x0478), top: B:156:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:135:0x03f1 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0037, B:60:0x0131, B:61:0x0149, B:64:0x0153, B:66:0x0172, B:67:0x017a, B:68:0x0182, B:70:0x0188, B:72:0x019f, B:73:0x01b6, B:75:0x01bc, B:77:0x01dc, B:79:0x01ed, B:81:0x01f7, B:83:0x0201, B:85:0x0207, B:86:0x020f, B:87:0x0221, B:89:0x0227, B:91:0x0259, B:93:0x0261, B:95:0x0268, B:100:0x0284, B:101:0x0293, B:103:0x0299, B:105:0x02b9, B:108:0x02c5, B:112:0x02e6, B:116:0x030d, B:117:0x033d, B:118:0x0364, B:120:0x036a, B:122:0x0373, B:123:0x0386, B:124:0x038a, B:125:0x038b, B:126:0x03a0, B:128:0x03a6, B:130:0x03cb, B:131:0x03cd, B:132:0x03e2, B:133:0x03eb, B:135:0x03f1, B:137:0x0402, B:139:0x0424, B:140:0x0428, B:143:0x0436, B:144:0x043f, B:146:0x0445, B:147:0x0452, B:26:0x0065, B:29:0x006f, B:31:0x0085, B:36:0x0090, B:38:0x0096, B:43:0x00a0, B:45:0x00d7, B:47:0x00df, B:48:0x00ec, B:50:0x00f2, B:52:0x0105, B:53:0x0109, B:55:0x0112, B:56:0x0116, B:150:0x0469, B:151:0x0470, B:152:0x0471, B:153:0x0478), top: B:156:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0434  */
    /* JADX WARN: Code duplicated, block: B:146:0x0445 A[Catch: all -> 0x003c, LOOP:8: B:144:0x043f->B:146:0x0445, LOOP_END, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0037, B:60:0x0131, B:61:0x0149, B:64:0x0153, B:66:0x0172, B:67:0x017a, B:68:0x0182, B:70:0x0188, B:72:0x019f, B:73:0x01b6, B:75:0x01bc, B:77:0x01dc, B:79:0x01ed, B:81:0x01f7, B:83:0x0201, B:85:0x0207, B:86:0x020f, B:87:0x0221, B:89:0x0227, B:91:0x0259, B:93:0x0261, B:95:0x0268, B:100:0x0284, B:101:0x0293, B:103:0x0299, B:105:0x02b9, B:108:0x02c5, B:112:0x02e6, B:116:0x030d, B:117:0x033d, B:118:0x0364, B:120:0x036a, B:122:0x0373, B:123:0x0386, B:124:0x038a, B:125:0x038b, B:126:0x03a0, B:128:0x03a6, B:130:0x03cb, B:131:0x03cd, B:132:0x03e2, B:133:0x03eb, B:135:0x03f1, B:137:0x0402, B:139:0x0424, B:140:0x0428, B:143:0x0436, B:144:0x043f, B:146:0x0445, B:147:0x0452, B:26:0x0065, B:29:0x006f, B:31:0x0085, B:36:0x0090, B:38:0x0096, B:43:0x00a0, B:45:0x00d7, B:47:0x00df, B:48:0x00ec, B:50:0x00f2, B:52:0x0105, B:53:0x0109, B:55:0x0112, B:56:0x0116, B:150:0x0469, B:151:0x0470, B:152:0x0471, B:153:0x0478), top: B:156:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x025e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x0386 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x03cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x0402 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x0424 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x03eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x03eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0153 A[Catch: all -> 0x003c, TRY_ENTER, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0037, B:60:0x0131, B:61:0x0149, B:64:0x0153, B:66:0x0172, B:67:0x017a, B:68:0x0182, B:70:0x0188, B:72:0x019f, B:73:0x01b6, B:75:0x01bc, B:77:0x01dc, B:79:0x01ed, B:81:0x01f7, B:83:0x0201, B:85:0x0207, B:86:0x020f, B:87:0x0221, B:89:0x0227, B:91:0x0259, B:93:0x0261, B:95:0x0268, B:100:0x0284, B:101:0x0293, B:103:0x0299, B:105:0x02b9, B:108:0x02c5, B:112:0x02e6, B:116:0x030d, B:117:0x033d, B:118:0x0364, B:120:0x036a, B:122:0x0373, B:123:0x0386, B:124:0x038a, B:125:0x038b, B:126:0x03a0, B:128:0x03a6, B:130:0x03cb, B:131:0x03cd, B:132:0x03e2, B:133:0x03eb, B:135:0x03f1, B:137:0x0402, B:139:0x0424, B:140:0x0428, B:143:0x0436, B:144:0x043f, B:146:0x0445, B:147:0x0452, B:26:0x0065, B:29:0x006f, B:31:0x0085, B:36:0x0090, B:38:0x0096, B:43:0x00a0, B:45:0x00d7, B:47:0x00df, B:48:0x00ec, B:50:0x00f2, B:52:0x0105, B:53:0x0109, B:55:0x0112, B:56:0x0116, B:150:0x0469, B:151:0x0470, B:152:0x0471, B:153:0x0478), top: B:156:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0172 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0037, B:60:0x0131, B:61:0x0149, B:64:0x0153, B:66:0x0172, B:67:0x017a, B:68:0x0182, B:70:0x0188, B:72:0x019f, B:73:0x01b6, B:75:0x01bc, B:77:0x01dc, B:79:0x01ed, B:81:0x01f7, B:83:0x0201, B:85:0x0207, B:86:0x020f, B:87:0x0221, B:89:0x0227, B:91:0x0259, B:93:0x0261, B:95:0x0268, B:100:0x0284, B:101:0x0293, B:103:0x0299, B:105:0x02b9, B:108:0x02c5, B:112:0x02e6, B:116:0x030d, B:117:0x033d, B:118:0x0364, B:120:0x036a, B:122:0x0373, B:123:0x0386, B:124:0x038a, B:125:0x038b, B:126:0x03a0, B:128:0x03a6, B:130:0x03cb, B:131:0x03cd, B:132:0x03e2, B:133:0x03eb, B:135:0x03f1, B:137:0x0402, B:139:0x0424, B:140:0x0428, B:143:0x0436, B:144:0x043f, B:146:0x0445, B:147:0x0452, B:26:0x0065, B:29:0x006f, B:31:0x0085, B:36:0x0090, B:38:0x0096, B:43:0x00a0, B:45:0x00d7, B:47:0x00df, B:48:0x00ec, B:50:0x00f2, B:52:0x0105, B:53:0x0109, B:55:0x0112, B:56:0x0116, B:150:0x0469, B:151:0x0470, B:152:0x0471, B:153:0x0478), top: B:156:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0188 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0037, B:60:0x0131, B:61:0x0149, B:64:0x0153, B:66:0x0172, B:67:0x017a, B:68:0x0182, B:70:0x0188, B:72:0x019f, B:73:0x01b6, B:75:0x01bc, B:77:0x01dc, B:79:0x01ed, B:81:0x01f7, B:83:0x0201, B:85:0x0207, B:86:0x020f, B:87:0x0221, B:89:0x0227, B:91:0x0259, B:93:0x0261, B:95:0x0268, B:100:0x0284, B:101:0x0293, B:103:0x0299, B:105:0x02b9, B:108:0x02c5, B:112:0x02e6, B:116:0x030d, B:117:0x033d, B:118:0x0364, B:120:0x036a, B:122:0x0373, B:123:0x0386, B:124:0x038a, B:125:0x038b, B:126:0x03a0, B:128:0x03a6, B:130:0x03cb, B:131:0x03cd, B:132:0x03e2, B:133:0x03eb, B:135:0x03f1, B:137:0x0402, B:139:0x0424, B:140:0x0428, B:143:0x0436, B:144:0x043f, B:146:0x0445, B:147:0x0452, B:26:0x0065, B:29:0x006f, B:31:0x0085, B:36:0x0090, B:38:0x0096, B:43:0x00a0, B:45:0x00d7, B:47:0x00df, B:48:0x00ec, B:50:0x00f2, B:52:0x0105, B:53:0x0109, B:55:0x0112, B:56:0x0116, B:150:0x0469, B:151:0x0470, B:152:0x0471, B:153:0x0478), top: B:156:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:72:0x019f A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0037, B:60:0x0131, B:61:0x0149, B:64:0x0153, B:66:0x0172, B:67:0x017a, B:68:0x0182, B:70:0x0188, B:72:0x019f, B:73:0x01b6, B:75:0x01bc, B:77:0x01dc, B:79:0x01ed, B:81:0x01f7, B:83:0x0201, B:85:0x0207, B:86:0x020f, B:87:0x0221, B:89:0x0227, B:91:0x0259, B:93:0x0261, B:95:0x0268, B:100:0x0284, B:101:0x0293, B:103:0x0299, B:105:0x02b9, B:108:0x02c5, B:112:0x02e6, B:116:0x030d, B:117:0x033d, B:118:0x0364, B:120:0x036a, B:122:0x0373, B:123:0x0386, B:124:0x038a, B:125:0x038b, B:126:0x03a0, B:128:0x03a6, B:130:0x03cb, B:131:0x03cd, B:132:0x03e2, B:133:0x03eb, B:135:0x03f1, B:137:0x0402, B:139:0x0424, B:140:0x0428, B:143:0x0436, B:144:0x043f, B:146:0x0445, B:147:0x0452, B:26:0x0065, B:29:0x006f, B:31:0x0085, B:36:0x0090, B:38:0x0096, B:43:0x00a0, B:45:0x00d7, B:47:0x00df, B:48:0x00ec, B:50:0x00f2, B:52:0x0105, B:53:0x0109, B:55:0x0112, B:56:0x0116, B:150:0x0469, B:151:0x0470, B:152:0x0471, B:153:0x0478), top: B:156:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01bc A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0037, B:60:0x0131, B:61:0x0149, B:64:0x0153, B:66:0x0172, B:67:0x017a, B:68:0x0182, B:70:0x0188, B:72:0x019f, B:73:0x01b6, B:75:0x01bc, B:77:0x01dc, B:79:0x01ed, B:81:0x01f7, B:83:0x0201, B:85:0x0207, B:86:0x020f, B:87:0x0221, B:89:0x0227, B:91:0x0259, B:93:0x0261, B:95:0x0268, B:100:0x0284, B:101:0x0293, B:103:0x0299, B:105:0x02b9, B:108:0x02c5, B:112:0x02e6, B:116:0x030d, B:117:0x033d, B:118:0x0364, B:120:0x036a, B:122:0x0373, B:123:0x0386, B:124:0x038a, B:125:0x038b, B:126:0x03a0, B:128:0x03a6, B:130:0x03cb, B:131:0x03cd, B:132:0x03e2, B:133:0x03eb, B:135:0x03f1, B:137:0x0402, B:139:0x0424, B:140:0x0428, B:143:0x0436, B:144:0x043f, B:146:0x0445, B:147:0x0452, B:26:0x0065, B:29:0x006f, B:31:0x0085, B:36:0x0090, B:38:0x0096, B:43:0x00a0, B:45:0x00d7, B:47:0x00df, B:48:0x00ec, B:50:0x00f2, B:52:0x0105, B:53:0x0109, B:55:0x0112, B:56:0x0116, B:150:0x0469, B:151:0x0470, B:152:0x0471, B:153:0x0478), top: B:156:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01dc A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0037, B:60:0x0131, B:61:0x0149, B:64:0x0153, B:66:0x0172, B:67:0x017a, B:68:0x0182, B:70:0x0188, B:72:0x019f, B:73:0x01b6, B:75:0x01bc, B:77:0x01dc, B:79:0x01ed, B:81:0x01f7, B:83:0x0201, B:85:0x0207, B:86:0x020f, B:87:0x0221, B:89:0x0227, B:91:0x0259, B:93:0x0261, B:95:0x0268, B:100:0x0284, B:101:0x0293, B:103:0x0299, B:105:0x02b9, B:108:0x02c5, B:112:0x02e6, B:116:0x030d, B:117:0x033d, B:118:0x0364, B:120:0x036a, B:122:0x0373, B:123:0x0386, B:124:0x038a, B:125:0x038b, B:126:0x03a0, B:128:0x03a6, B:130:0x03cb, B:131:0x03cd, B:132:0x03e2, B:133:0x03eb, B:135:0x03f1, B:137:0x0402, B:139:0x0424, B:140:0x0428, B:143:0x0436, B:144:0x043f, B:146:0x0445, B:147:0x0452, B:26:0x0065, B:29:0x006f, B:31:0x0085, B:36:0x0090, B:38:0x0096, B:43:0x00a0, B:45:0x00d7, B:47:0x00df, B:48:0x00ec, B:50:0x00f2, B:52:0x0105, B:53:0x0109, B:55:0x0112, B:56:0x0116, B:150:0x0469, B:151:0x0470, B:152:0x0471, B:153:0x0478), top: B:156:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01ed A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0037, B:60:0x0131, B:61:0x0149, B:64:0x0153, B:66:0x0172, B:67:0x017a, B:68:0x0182, B:70:0x0188, B:72:0x019f, B:73:0x01b6, B:75:0x01bc, B:77:0x01dc, B:79:0x01ed, B:81:0x01f7, B:83:0x0201, B:85:0x0207, B:86:0x020f, B:87:0x0221, B:89:0x0227, B:91:0x0259, B:93:0x0261, B:95:0x0268, B:100:0x0284, B:101:0x0293, B:103:0x0299, B:105:0x02b9, B:108:0x02c5, B:112:0x02e6, B:116:0x030d, B:117:0x033d, B:118:0x0364, B:120:0x036a, B:122:0x0373, B:123:0x0386, B:124:0x038a, B:125:0x038b, B:126:0x03a0, B:128:0x03a6, B:130:0x03cb, B:131:0x03cd, B:132:0x03e2, B:133:0x03eb, B:135:0x03f1, B:137:0x0402, B:139:0x0424, B:140:0x0428, B:143:0x0436, B:144:0x043f, B:146:0x0445, B:147:0x0452, B:26:0x0065, B:29:0x006f, B:31:0x0085, B:36:0x0090, B:38:0x0096, B:43:0x00a0, B:45:0x00d7, B:47:0x00df, B:48:0x00ec, B:50:0x00f2, B:52:0x0105, B:53:0x0109, B:55:0x0112, B:56:0x0116, B:150:0x0469, B:151:0x0470, B:152:0x0471, B:153:0x0478), top: B:156:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0201 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0037, B:60:0x0131, B:61:0x0149, B:64:0x0153, B:66:0x0172, B:67:0x017a, B:68:0x0182, B:70:0x0188, B:72:0x019f, B:73:0x01b6, B:75:0x01bc, B:77:0x01dc, B:79:0x01ed, B:81:0x01f7, B:83:0x0201, B:85:0x0207, B:86:0x020f, B:87:0x0221, B:89:0x0227, B:91:0x0259, B:93:0x0261, B:95:0x0268, B:100:0x0284, B:101:0x0293, B:103:0x0299, B:105:0x02b9, B:108:0x02c5, B:112:0x02e6, B:116:0x030d, B:117:0x033d, B:118:0x0364, B:120:0x036a, B:122:0x0373, B:123:0x0386, B:124:0x038a, B:125:0x038b, B:126:0x03a0, B:128:0x03a6, B:130:0x03cb, B:131:0x03cd, B:132:0x03e2, B:133:0x03eb, B:135:0x03f1, B:137:0x0402, B:139:0x0424, B:140:0x0428, B:143:0x0436, B:144:0x043f, B:146:0x0445, B:147:0x0452, B:26:0x0065, B:29:0x006f, B:31:0x0085, B:36:0x0090, B:38:0x0096, B:43:0x00a0, B:45:0x00d7, B:47:0x00df, B:48:0x00ec, B:50:0x00f2, B:52:0x0105, B:53:0x0109, B:55:0x0112, B:56:0x0116, B:150:0x0469, B:151:0x0470, B:152:0x0471, B:153:0x0478), top: B:156:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0207 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0037, B:60:0x0131, B:61:0x0149, B:64:0x0153, B:66:0x0172, B:67:0x017a, B:68:0x0182, B:70:0x0188, B:72:0x019f, B:73:0x01b6, B:75:0x01bc, B:77:0x01dc, B:79:0x01ed, B:81:0x01f7, B:83:0x0201, B:85:0x0207, B:86:0x020f, B:87:0x0221, B:89:0x0227, B:91:0x0259, B:93:0x0261, B:95:0x0268, B:100:0x0284, B:101:0x0293, B:103:0x0299, B:105:0x02b9, B:108:0x02c5, B:112:0x02e6, B:116:0x030d, B:117:0x033d, B:118:0x0364, B:120:0x036a, B:122:0x0373, B:123:0x0386, B:124:0x038a, B:125:0x038b, B:126:0x03a0, B:128:0x03a6, B:130:0x03cb, B:131:0x03cd, B:132:0x03e2, B:133:0x03eb, B:135:0x03f1, B:137:0x0402, B:139:0x0424, B:140:0x0428, B:143:0x0436, B:144:0x043f, B:146:0x0445, B:147:0x0452, B:26:0x0065, B:29:0x006f, B:31:0x0085, B:36:0x0090, B:38:0x0096, B:43:0x00a0, B:45:0x00d7, B:47:0x00df, B:48:0x00ec, B:50:0x00f2, B:52:0x0105, B:53:0x0109, B:55:0x0112, B:56:0x0116, B:150:0x0469, B:151:0x0470, B:152:0x0471, B:153:0x0478), top: B:156:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0227 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0037, B:60:0x0131, B:61:0x0149, B:64:0x0153, B:66:0x0172, B:67:0x017a, B:68:0x0182, B:70:0x0188, B:72:0x019f, B:73:0x01b6, B:75:0x01bc, B:77:0x01dc, B:79:0x01ed, B:81:0x01f7, B:83:0x0201, B:85:0x0207, B:86:0x020f, B:87:0x0221, B:89:0x0227, B:91:0x0259, B:93:0x0261, B:95:0x0268, B:100:0x0284, B:101:0x0293, B:103:0x0299, B:105:0x02b9, B:108:0x02c5, B:112:0x02e6, B:116:0x030d, B:117:0x033d, B:118:0x0364, B:120:0x036a, B:122:0x0373, B:123:0x0386, B:124:0x038a, B:125:0x038b, B:126:0x03a0, B:128:0x03a6, B:130:0x03cb, B:131:0x03cd, B:132:0x03e2, B:133:0x03eb, B:135:0x03f1, B:137:0x0402, B:139:0x0424, B:140:0x0428, B:143:0x0436, B:144:0x043f, B:146:0x0445, B:147:0x0452, B:26:0x0065, B:29:0x006f, B:31:0x0085, B:36:0x0090, B:38:0x0096, B:43:0x00a0, B:45:0x00d7, B:47:0x00df, B:48:0x00ec, B:50:0x00f2, B:52:0x0105, B:53:0x0109, B:55:0x0112, B:56:0x0116, B:150:0x0469, B:151:0x0470, B:152:0x0471, B:153:0x0478), top: B:156:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0259 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0037, B:60:0x0131, B:61:0x0149, B:64:0x0153, B:66:0x0172, B:67:0x017a, B:68:0x0182, B:70:0x0188, B:72:0x019f, B:73:0x01b6, B:75:0x01bc, B:77:0x01dc, B:79:0x01ed, B:81:0x01f7, B:83:0x0201, B:85:0x0207, B:86:0x020f, B:87:0x0221, B:89:0x0227, B:91:0x0259, B:93:0x0261, B:95:0x0268, B:100:0x0284, B:101:0x0293, B:103:0x0299, B:105:0x02b9, B:108:0x02c5, B:112:0x02e6, B:116:0x030d, B:117:0x033d, B:118:0x0364, B:120:0x036a, B:122:0x0373, B:123:0x0386, B:124:0x038a, B:125:0x038b, B:126:0x03a0, B:128:0x03a6, B:130:0x03cb, B:131:0x03cd, B:132:0x03e2, B:133:0x03eb, B:135:0x03f1, B:137:0x0402, B:139:0x0424, B:140:0x0428, B:143:0x0436, B:144:0x043f, B:146:0x0445, B:147:0x0452, B:26:0x0065, B:29:0x006f, B:31:0x0085, B:36:0x0090, B:38:0x0096, B:43:0x00a0, B:45:0x00d7, B:47:0x00df, B:48:0x00ec, B:50:0x00f2, B:52:0x0105, B:53:0x0109, B:55:0x0112, B:56:0x0116, B:150:0x0469, B:151:0x0470, B:152:0x0471, B:153:0x0478), top: B:156:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0268 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0037, B:60:0x0131, B:61:0x0149, B:64:0x0153, B:66:0x0172, B:67:0x017a, B:68:0x0182, B:70:0x0188, B:72:0x019f, B:73:0x01b6, B:75:0x01bc, B:77:0x01dc, B:79:0x01ed, B:81:0x01f7, B:83:0x0201, B:85:0x0207, B:86:0x020f, B:87:0x0221, B:89:0x0227, B:91:0x0259, B:93:0x0261, B:95:0x0268, B:100:0x0284, B:101:0x0293, B:103:0x0299, B:105:0x02b9, B:108:0x02c5, B:112:0x02e6, B:116:0x030d, B:117:0x033d, B:118:0x0364, B:120:0x036a, B:122:0x0373, B:123:0x0386, B:124:0x038a, B:125:0x038b, B:126:0x03a0, B:128:0x03a6, B:130:0x03cb, B:131:0x03cd, B:132:0x03e2, B:133:0x03eb, B:135:0x03f1, B:137:0x0402, B:139:0x0424, B:140:0x0428, B:143:0x0436, B:144:0x043f, B:146:0x0445, B:147:0x0452, B:26:0x0065, B:29:0x006f, B:31:0x0085, B:36:0x0090, B:38:0x0096, B:43:0x00a0, B:45:0x00d7, B:47:0x00df, B:48:0x00ec, B:50:0x00f2, B:52:0x0105, B:53:0x0109, B:55:0x0112, B:56:0x0116, B:150:0x0469, B:151:0x0470, B:152:0x0471, B:153:0x0478), top: B:156:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:97:0x026e  */
    public static final Object q(C1152by0 c1152by0, InterfaceC0473Hh interfaceC0473Hh) {
        Xx0 xx0;
        Mx0 mx0;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        Iterator it;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i;
        Map mapA;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int iX;
        LinkedHashMap linkedHashMap4;
        Nx0 nx0;
        String lowerCase;
        List list;
        int i2;
        String str;
        JSONObject jSONObject;
        String strOptString;
        Integer num;
        Integer num2;
        String string;
        String str2;
        Px0 px0;
        Integer num3;
        Object arrayList6;
        List list2;
        Iterator it2;
        JSONObject jSONObject2;
        String strOptString2;
        ArrayList arrayList7;
        Iterator it3;
        Iterator it4;
        ArrayList arrayList8;
        Iterator it5;
        Object qx0;
        Qx0 qx1;
        Iterator it6;
        JSONObject jSONObject3;
        String strH0;
        Object next;
        JSONObject jSONObject4;
        String strOptString3;
        String strOptString4;
        C1152by0 c1152by1 = c1152by0;
        c1152by0.getClass();
        if (interfaceC0473Hh instanceof Xx0) {
            xx0 = (Xx0) interfaceC0473Hh;
            int i3 = xx0.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xx0.p = i3 - Integer.MIN_VALUE;
            } else {
                xx0 = new Xx0(c1152by1, interfaceC0473Hh);
            }
        } else {
            xx0 = new Xx0(c1152by1, interfaceC0473Hh);
        }
        Object objN = xx0.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i4 = xx0.p;
        try {
            if (i4 == 0) {
                Jp0.O(objN);
                mx0 = e;
                if (mx0 == null) {
                    YS ys = d;
                    xx0.l = c1152by1;
                    xx0.p = 1;
                    if (ys.d(null, xx0) == enumC1706hi) {
                        return enumC1706hi;
                    }
                }
                return mx0;
            }
            if (i4 == 1) {
                c1152by1 = xx0.l;
                Jp0.O(objN);
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                arrayList = xx0.m;
                Jp0.O(objN);
            }
            SystemClock.elapsedRealtime();
            linkedHashMap = new LinkedHashMap();
            linkedHashMap2 = new LinkedHashMap();
            linkedHashMap3 = new LinkedHashMap();
            it = ((List) objN).iterator();
            while (it.hasNext()) {
                px0 = (Px0) it.next();
                linkedHashMap3.put(new Integer(px0.a), px0.b);
                num3 = new Integer(px0.a);
                arrayList6 = linkedHashMap2.get(num3);
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                    linkedHashMap2.put(num3, arrayList6);
                }
                list2 = (List) arrayList6;
                it2 = px0.c.iterator();
                while (it2.hasNext()) {
                    jSONObject2 = (JSONObject) it2.next();
                    strOptString2 = jSONObject2.optString("channelCode");
                    AbstractC1474fG.g(strOptString2);
                    if (AbstractC1899jh0.O(strOptString2)) {
                        arrayList7 = arrayList;
                        it3 = it;
                        it4 = it2;
                    } else {
                        Lx0 lx0 = Lx0.b;
                        List listG = Lx0.G(jSONObject2.optJSONArray("liveAddressList"));
                        it3 = it;
                        arrayList8 = new ArrayList();
                        it5 = listG.iterator();
                        while (it5.hasNext()) {
                            Iterator it7 = it2;
                            next = it5.next();
                            Iterator it8 = it5;
                            jSONObject4 = (JSONObject) next;
                            ArrayList arrayList9 = arrayList;
                            strOptString3 = jSONObject4.optString("playCode");
                            AbstractC1474fG.i(strOptString3, "optString(...)");
                            if (!AbstractC1899jh0.O(strOptString3)) {
                                strOptString4 = jSONObject4.optString("license");
                                AbstractC1474fG.i(strOptString4, "optString(...)");
                                if (!AbstractC1899jh0.O(strOptString4)) {
                                    arrayList8.add(next);
                                }
                            }
                            it2 = it7;
                            it5 = it8;
                            arrayList = arrayList9;
                        }
                        arrayList7 = arrayList;
                        it4 = it2;
                        if (!arrayList8.isEmpty()) {
                            qx0 = linkedHashMap.get(strOptString2);
                            if (qx0 == null) {
                                qx0 = new Qx0(jSONObject2);
                                linkedHashMap.put(strOptString2, qx0);
                            }
                            qx1 = (Qx0) qx0;
                            qx1.b.add(new Integer(px0.a));
                            it6 = arrayList8.iterator();
                            while (it6.hasNext()) {
                                jSONObject3 = (JSONObject) it6.next();
                                Iterator it9 = it6;
                                strH0 = AbstractC0911Ye.h0(AbstractC0937Ze.K("cdnType", "quality", "AVFormat", "tag"), "|", null, null, new C3219xC(4, jSONObject3), 30);
                                if (!qx1.c.containsKey(strH0)) {
                                    qx1.c.put(strH0, jSONObject3);
                                }
                                it6 = it9;
                            }
                            if (!list2.contains(strOptString2)) {
                                list2.add(strOptString2);
                            }
                        }
                        it = it3;
                        it2 = it4;
                        arrayList = arrayList7;
                    }
                    it = it3;
                    it2 = it4;
                    arrayList = arrayList7;
                }
            }
            ArrayList arrayList10 = arrayList;
            arrayList2 = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                str = (String) entry.getKey();
                Qx0 qx2 = (Qx0) entry.getValue();
                jSONObject = qx2.a;
                strOptString = jSONObject.optString("name");
                if (AbstractC1899jh0.O(strOptString)) {
                    strOptString = jSONObject.optString("alias");
                    if (AbstractC1899jh0.O(strOptString)) {
                        strOptString = str;
                    }
                }
                AbstractC1474fG.i(strOptString, "ifBlank(...)");
                String strOptString5 = jSONObject.optString("alias");
                AbstractC1474fG.i(strOptString5, "optString(...)");
                num = new Integer(jSONObject.optInt("channelNumber", -1));
                if (num.intValue() >= 0) {
                    num2 = num;
                } else {
                    num2 = null;
                }
                String strOptString6 = jSONObject.optString("quality");
                AbstractC1474fG.i(strOptString6, "optString(...)");
                String strOptString7 = jSONObject.optString("posterUrl");
                AbstractC1474fG.i(strOptString7, "optString(...)");
                string = AbstractC1119bh0.E0(strOptString7).toString();
                if (!AbstractC1899jh0.O(string)) {
                    str2 = string;
                } else {
                    str2 = null;
                }
                String strOptString8 = jSONObject.optString("supportVideoType");
                AbstractC1474fG.i(strOptString8, "optString(...)");
                Collection collectionValues = qx2.c.values();
                AbstractC1474fG.i(collectionValues, "<get-values>(...)");
                arrayList2.add(new Ox0(str, strOptString, strOptString5, num2, strOptString6, str2, strOptString8, AbstractC0911Ye.x0(collectionValues), qx2.b));
            }
            List listR0 = AbstractC0911Ye.r0(arrayList2, new C1698he(new C1698he(new C1749i30(16), 5), 6));
            arrayList3 = new ArrayList(AbstractC1016af.O(listR0, 10));
            i = 0;
            for (Object obj : listR0) {
                i2 = i + 1;
                if (i >= 0) {
                    AbstractC0937Ze.N();
                    throw null;
                }
                arrayList3.add(new C1101bX(((Ox0) obj).a, new Integer(i)));
                i = i2;
            }
            mapA = AbstractC3327yN.A(arrayList3);
            arrayList4 = new ArrayList(linkedHashMap3.size());
            for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                int iIntValue = ((Number) entry2.getKey()).intValue();
                String str3 = (String) entry2.getValue();
                list = (List) linkedHashMap2.get(new Integer(iIntValue));
                if (list == null) {
                    list = C1233cq.l;
                }
                arrayList4.add(new Nx0(iIntValue, str3, AbstractC0911Ye.r0(AbstractC0911Ye.X(list), new WN(2, mapA))));
            }
            arrayList5 = new ArrayList();
            for (Object obj2 : arrayList4) {
                nx0 = (Nx0) obj2;
                if (!nx0.c.isEmpty()) {
                    String string2 = AbstractC1119bh0.E0(nx0.b).toString();
                    Locale locale = Locale.ROOT;
                    AbstractC1474fG.i(locale, "ROOT");
                    lowerCase = string2.toLowerCase(locale);
                    AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
                    if (!c.contains(lowerCase)) {
                        arrayList5.add(obj2);
                    }
                }
            }
            iX = AbstractC3327yN.x(AbstractC1016af.O(listR0, 10));
            if (iX < 16) {
                iX = 16;
            }
            linkedHashMap4 = new LinkedHashMap(iX);
            for (Object obj3 : listR0) {
                linkedHashMap4.put(((Ox0) obj3).a, obj3);
            }
            Mx0 mx1 = new Mx0(arrayList5, listR0, linkedHashMap4);
            e = mx1;
            SystemClock.elapsedRealtime();
            arrayList10.size();
            listR0.size();
            d.e(null);
            return mx1;
            mx0 = e;
            if (mx0 != null) {
                d.e(null);
                return mx0;
            }
            SystemClock.elapsedRealtime();
            Lx0 lx1 = Lx0.b;
            JSONObject jSONObject5 = new JSONObject();
            String strH = com.skidush.clonex.bridge.N7.a.h(13);
            if (strH != null) {
                if (!(!AbstractC1899jh0.O(strH))) {
                    strH = null;
                }
                if (strH != null) {
                    Integer numJ = AbstractC1802ih0.J(strH);
                    if (numJ != null) {
                        if (numJ.intValue() <= 0) {
                            numJ = null;
                        }
                        if (numJ != null) {
                            jSONObject5.put("columnId", numJ.intValue());
                            Object obj4 = JSONObject.NULL;
                            jSONObject5.put("specialFlag", obj4);
                            jSONObject5.put("pageNum", 1);
                            jSONObject5.put("pageSize", 100);
                            jSONObject5.put("numDisplay", obj4);
                            jSONObject5.put("isAv1", "0");
                            JSONObject jSONObjectN = Lx0.N(2, jSONObject5);
                            Lx0.O(jSONObjectN, "Categorías de televisión");
                            JSONObject jSONObjectOptJSONObject = jSONObjectN.optJSONObject("data");
                            List listG2 = Lx0.G(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray("childColumnList") : null);
                            ArrayList arrayList11 = new ArrayList();
                            for (Object obj5 : listG2) {
                                JSONObject jSONObject6 = (JSONObject) obj5;
                                Lx0 lx2 = Lx0.b;
                                String strOptString9 = jSONObject6.optString("name");
                                if (AbstractC1899jh0.O(strOptString9)) {
                                    strOptString9 = jSONObject6.optString("alias");
                                }
                                AbstractC1474fG.i(strOptString9, "ifBlank(...)");
                                if (!Lx0.F(strOptString9)) {
                                    arrayList11.add(obj5);
                                }
                            }
                            SystemClock.elapsedRealtime();
                            Zx0 zx0 = new Zx0(arrayList11, Nb0.a(4), null);
                            xx0.l = c1152by1;
                            xx0.m = arrayList11;
                            xx0.p = 2;
                            objN = zy0.n(zx0, xx0);
                            if (objN == enumC1706hi) {
                                return enumC1706hi;
                            }
                            arrayList = arrayList11;
                            SystemClock.elapsedRealtime();
                            linkedHashMap = new LinkedHashMap();
                            linkedHashMap2 = new LinkedHashMap();
                            linkedHashMap3 = new LinkedHashMap();
                            it = ((List) objN).iterator();
                            while (it.hasNext()) {
                                px0 = (Px0) it.next();
                                linkedHashMap3.put(new Integer(px0.a), px0.b);
                                num3 = new Integer(px0.a);
                                arrayList6 = linkedHashMap2.get(num3);
                                if (arrayList6 == null) {
                                    arrayList6 = new ArrayList();
                                    linkedHashMap2.put(num3, arrayList6);
                                }
                                list2 = (List) arrayList6;
                                it2 = px0.c.iterator();
                                while (it2.hasNext()) {
                                    jSONObject2 = (JSONObject) it2.next();
                                    strOptString2 = jSONObject2.optString("channelCode");
                                    AbstractC1474fG.g(strOptString2);
                                    if (AbstractC1899jh0.O(strOptString2)) {
                                        Lx0 lx3 = Lx0.b;
                                        List listG3 = Lx0.G(jSONObject2.optJSONArray("liveAddressList"));
                                        it3 = it;
                                        arrayList8 = new ArrayList();
                                        it5 = listG3.iterator();
                                        while (it5.hasNext()) {
                                            Iterator it10 = it2;
                                            next = it5.next();
                                            Iterator it11 = it5;
                                            jSONObject4 = (JSONObject) next;
                                            ArrayList arrayList12 = arrayList;
                                            strOptString3 = jSONObject4.optString("playCode");
                                            AbstractC1474fG.i(strOptString3, "optString(...)");
                                            if (!AbstractC1899jh0.O(strOptString3)) {
                                                strOptString4 = jSONObject4.optString("license");
                                                AbstractC1474fG.i(strOptString4, "optString(...)");
                                                if (!AbstractC1899jh0.O(strOptString4)) {
                                                    arrayList8.add(next);
                                                }
                                            }
                                            it2 = it10;
                                            it5 = it11;
                                            arrayList = arrayList12;
                                        }
                                        arrayList7 = arrayList;
                                        it4 = it2;
                                        if (!arrayList8.isEmpty()) {
                                            qx0 = linkedHashMap.get(strOptString2);
                                            if (qx0 == null) {
                                                qx0 = new Qx0(jSONObject2);
                                                linkedHashMap.put(strOptString2, qx0);
                                            }
                                            qx1 = (Qx0) qx0;
                                            qx1.b.add(new Integer(px0.a));
                                            it6 = arrayList8.iterator();
                                            while (it6.hasNext()) {
                                                jSONObject3 = (JSONObject) it6.next();
                                                Iterator it12 = it6;
                                                strH0 = AbstractC0911Ye.h0(AbstractC0937Ze.K("cdnType", "quality", "AVFormat", "tag"), "|", null, null, new C3219xC(4, jSONObject3), 30);
                                                if (!qx1.c.containsKey(strH0)) {
                                                    qx1.c.put(strH0, jSONObject3);
                                                }
                                                it6 = it12;
                                            }
                                            if (!list2.contains(strOptString2)) {
                                                list2.add(strOptString2);
                                            }
                                        }
                                        it = it3;
                                        it2 = it4;
                                        arrayList = arrayList7;
                                    } else {
                                        arrayList7 = arrayList;
                                        it3 = it;
                                        it4 = it2;
                                    }
                                    it = it3;
                                    it2 = it4;
                                    arrayList = arrayList7;
                                }
                            }
                            ArrayList arrayList13 = arrayList;
                            arrayList2 = new ArrayList();
                            while (r1.hasNext()) {
                                str = (String) entry.getKey();
                                Qx0 qx3 = (Qx0) entry.getValue();
                                jSONObject = qx3.a;
                                strOptString = jSONObject.optString("name");
                                if (AbstractC1899jh0.O(strOptString)) {
                                    strOptString = jSONObject.optString("alias");
                                    if (AbstractC1899jh0.O(strOptString)) {
                                        strOptString = str;
                                    }
                                }
                                AbstractC1474fG.i(strOptString, "ifBlank(...)");
                                String strOptString10 = jSONObject.optString("alias");
                                AbstractC1474fG.i(strOptString10, "optString(...)");
                                num = new Integer(jSONObject.optInt("channelNumber", -1));
                                if (num.intValue() >= 0) {
                                    num2 = num;
                                } else {
                                    num2 = null;
                                }
                                String strOptString11 = jSONObject.optString("quality");
                                AbstractC1474fG.i(strOptString11, "optString(...)");
                                String strOptString12 = jSONObject.optString("posterUrl");
                                AbstractC1474fG.i(strOptString12, "optString(...)");
                                string = AbstractC1119bh0.E0(strOptString12).toString();
                                if (!AbstractC1899jh0.O(string)) {
                                    str2 = string;
                                } else {
                                    str2 = null;
                                }
                                String strOptString13 = jSONObject.optString("supportVideoType");
                                AbstractC1474fG.i(strOptString13, "optString(...)");
                                Collection collectionValues2 = qx3.c.values();
                                AbstractC1474fG.i(collectionValues2, "<get-values>(...)");
                                arrayList2.add(new Ox0(str, strOptString, strOptString10, num2, strOptString11, str2, strOptString13, AbstractC0911Ye.x0(collectionValues2), qx3.b));
                            }
                            List listR1 = AbstractC0911Ye.r0(arrayList2, new C1698he(new C1698he(new C1749i30(16), 5), 6));
                            arrayList3 = new ArrayList(AbstractC1016af.O(listR1, 10));
                            i = 0;
                            while (r3.hasNext()) {
                                i2 = i + 1;
                                if (i >= 0) {
                                    AbstractC0937Ze.N();
                                    throw null;
                                }
                                arrayList3.add(new C1101bX(((Ox0) obj).a, new Integer(i)));
                                i = i2;
                            }
                            mapA = AbstractC3327yN.A(arrayList3);
                            arrayList4 = new ArrayList(linkedHashMap3.size());
                            while (r4.hasNext()) {
                                int iIntValue2 = ((Number) entry2.getKey()).intValue();
                                String str4 = (String) entry2.getValue();
                                list = (List) linkedHashMap2.get(new Integer(iIntValue2));
                                if (list == null) {
                                    list = C1233cq.l;
                                }
                                arrayList4.add(new Nx0(iIntValue2, str4, AbstractC0911Ye.r0(AbstractC0911Ye.X(list), new WN(2, mapA))));
                            }
                            arrayList5 = new ArrayList();
                            while (r3.hasNext()) {
                                nx0 = (Nx0) obj2;
                                if (!nx0.c.isEmpty()) {
                                    String string3 = AbstractC1119bh0.E0(nx0.b).toString();
                                    Locale locale2 = Locale.ROOT;
                                    AbstractC1474fG.i(locale2, "ROOT");
                                    lowerCase = string3.toLowerCase(locale2);
                                    AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
                                    if (!c.contains(lowerCase)) {
                                        arrayList5.add(obj2);
                                    }
                                }
                            }
                            iX = AbstractC3327yN.x(AbstractC1016af.O(listR1, 10));
                            if (iX < 16) {
                                iX = 16;
                            }
                            linkedHashMap4 = new LinkedHashMap(iX);
                            while (r2.hasNext()) {
                                linkedHashMap4.put(((Ox0) obj3).a, obj3);
                            }
                            Mx0 mx2 = new Mx0(arrayList5, listR1, linkedHashMap4);
                            e = mx2;
                            SystemClock.elapsedRealtime();
                            arrayList13.size();
                            listR1.size();
                            d.e(null);
                            return mx2;
                        }
                    }
                    throw new IllegalStateException("Configuración protegida no válida");
                }
            }
            throw new IllegalStateException("Configuración protegida no disponible");
        } catch (Throwable th) {
            d.e(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c7  */
    public static final C1387eR r(Ox0 ox0) {
        String str;
        C2420oz c2420oz;
        List list;
        Object next;
        C1387eR c1387eR = (C1387eR) f.get(ox0.a);
        if (c1387eR != null) {
            return c1387eR;
        }
        String strT = AbstractC1701hf0.t("xuper-live:", ox0.a);
        String str2 = ox0.b;
        String str3 = ox0.c;
        if (!(!AbstractC1899jh0.O(str3))) {
            str3 = null;
        }
        Integer num = ox0.d;
        String strH0 = AbstractC0911Ye.h0(AbstractC0911Ye.Z(AbstractC0937Ze.K(str3, num != null ? AbstractC1674hK.n(num.intValue(), "Canal ") : null)), " · ", null, null, null, 62);
        String str4 = AbstractC1899jh0.O(strH0) ^ true ? strH0 : null;
        String str5 = ox0.e;
        if (AbstractC1474fG.b(str5, "2")) {
            str = "HD";
        } else if (AbstractC1474fG.b(str5, "3")) {
            str = "FHD";
        } else {
            str = ox0.e;
            if (!(!AbstractC1899jh0.O(str))) {
                str = null;
            }
            if (str == null) {
                str = "TV";
            }
        }
        String str6 = str;
        String str7 = ox0.f;
        Set set = ox0.i;
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            Mx0 mx0 = e;
            if (mx0 == null || (list = mx0.a) == null) {
                c2420oz = null;
            } else {
                Iterator it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (((Nx0) next).a != iIntValue);
                Nx0 nx0 = (Nx0) next;
                if (nx0 != null) {
                    String str8 = nx0.b;
                    c2420oz = new C2420oz(str8, str8);
                } else {
                    c2420oz = null;
                }
            }
            if (c2420oz != null) {
                arrayList.add(c2420oz);
            }
        }
        Boolean bool = Boolean.TRUE;
        C1387eR c1387eR2 = new C1387eR(strT, str2, str4, null, null, null, str6, null, str7, str7, arrayList, null, null, null, AbstractC3327yN.z(new C1101bX("is_tv_channel", bool), new C1101bX("is_live_channel", bool)), 14520);
        c1387eR2.t = "CANALES OTROS PAISES";
        f.put(ox0.a, c1387eR2);
        return c1387eR2;
    }

    public static Set s(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("cdn_list");
        C1722hq c1722hq = C1722hq.l;
        if (jSONArrayOptJSONArray == null) {
            return c1722hq;
        }
        C3421zK c3421zK = new C3421zK();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null && AbstractC1899jh0.N(jSONObjectOptJSONObject.optString("tag"), "live", true)) {
                c3421zK.add(jSONObjectOptJSONObject);
            }
        }
        JSONObject jSONObject2 = (JSONObject) AbstractC0911Ye.d0(AbstractC0911Ye.r0(AbstractC2506pt.h(c3421zK), new C1749i30(15)));
        JSONArray jSONArrayOptJSONArray2 = jSONObject2 != null ? jSONObject2.optJSONArray("url_list") : null;
        if (jSONArrayOptJSONArray2 == null) {
            return c1722hq;
        }
        Fc0 fc0 = new Fc0();
        int length2 = jSONArrayOptJSONArray2.length();
        for (int i2 = 0; i2 < length2; i2++) {
            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i2);
            if (jSONObjectOptJSONObject2 != null) {
                String strOptString = jSONObjectOptJSONObject2.optString("url");
                AbstractC1474fG.i(strOptString, "optString(...)");
                if (!AbstractC1899jh0.O(strOptString)) {
                    String strOptString2 = jSONObjectOptJSONObject2.optString("tag");
                    if (!(!AbstractC1899jh0.O(strOptString2))) {
                        strOptString2 = null;
                    }
                    if (strOptString2 != null) {
                        fc0.add(strOptString2);
                    }
                }
            }
        }
        return AbstractC1370eA.c(fc0);
    }

    public static void u() {
        synchronized (g) {
            h = null;
        }
    }

    public static String v(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("quality");
        if (AbstractC1474fG.b(strOptString, "3")) {
            return "FHD";
        }
        return AbstractC1474fG.b(strOptString, "2") ? "HD" : "SD";
    }

    public static Rx0 w(String str) {
        Rx0 rx0 = h;
        Rx0 rx1 = null;
        if (rx0 != null) {
            if (!AbstractC1474fG.b(rx0.a, str) || System.currentTimeMillis() - rx0.e >= 600000) {
                rx0 = null;
            }
            if (rx0 != null) {
                return rx0;
            }
        }
        synchronized (g) {
            Rx0 rx2 = h;
            if (rx2 != null) {
                if (AbstractC1474fG.b(rx2.a, str) && System.currentTimeMillis() - rx2.e < 600000) {
                    rx1 = rx2;
                }
                if (rx1 != null) {
                    return rx1;
                }
            }
            Lx0 lx0 = Lx0.b;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "1");
            JSONObject jSONObjectN = Lx0.N(9, jSONObject);
            Lx0.O(jSONObjectN, "Autorización de televisión");
            JSONObject jSONObjectOptJSONObject = jSONObjectN.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            String strOptString = jSONObjectOptJSONObject.optString("hasPay");
            String strOptString2 = jSONObjectOptJSONObject.optString("userIdentity");
            AbstractC1474fG.g(strOptString);
            if (!AbstractC1899jh0.O(strOptString)) {
                AbstractC1474fG.g(strOptString2);
                if (!AbstractC1899jh0.O(strOptString2)) {
                    String strF = com.skidush.clonex.bridge.N7.a.f();
                    if (strF == null) {
                        throw new IllegalStateException("El motor de reproducción no está disponible");
                    }
                    JSONObject jSONObject2 = new JSONObject(strF);
                    String strValueOf = String.valueOf(AbstractC1923jt0.L(4));
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("hasPay", strOptString);
                    jSONObject3.put("userIdentity", strOptString2);
                    jSONObject3.put("type", "merge");
                    jSONObject3.put("appVer", strValueOf);
                    String strOptString3 = jSONObject2.optString("lang");
                    if (AbstractC1899jh0.O(strOptString3)) {
                        strOptString3 = "es";
                    }
                    jSONObject3.put("lang", strOptString3);
                    jSONObject3.put("encMediaSupported", 1);
                    jSONObject3.put("liveCodeList", new JSONArray().put(str));
                    jSONObject3.put("appParams", "");
                    jSONObject3.put("reserve1", jSONObject2.optString("reserve1"));
                    jSONObject3.put("pipFlag", "0");
                    JSONObject jSONObjectN2 = Lx0.N(10, jSONObject3);
                    Lx0.O(jSONObjectN2, "Servidor de televisión");
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectN2.optJSONObject("data");
                    if (jSONObjectOptJSONObject2 == null) {
                        jSONObjectOptJSONObject2 = new JSONObject();
                    }
                    if (!AbstractC1474fG.b(jSONObjectOptJSONObject2.optString("error_code", "0"), "0")) {
                        throw new IllegalStateException("Servidor de televisión no disponible (código " + jSONObjectOptJSONObject2.optString("error_code") + ")");
                    }
                    Set setS = s(jSONObjectOptJSONObject2);
                    if (setS.isEmpty()) {
                        throw new IllegalStateException("El proveedor no devolvió rutas Live compatibles");
                    }
                    JSONObject jSONObjectE = AbstractC1923jt0.E(jSONObject2, jSONObjectOptJSONObject2);
                    JSONObject jSONObjectOptJSONObject3 = jSONObjectE.optJSONObject("environment");
                    if (jSONObjectOptJSONObject3 == null) {
                        throw new IllegalStateException("El proveedor no devolvió el entorno de reproducción");
                    }
                    JSONArray jSONArrayOptJSONArray = jSONObjectE.optJSONArray("entries");
                    if (jSONArrayOptJSONArray == null) {
                        throw new IllegalStateException("El proveedor no devolvió fuentes de reproducción");
                    }
                    if (jSONArrayOptJSONArray.length() == 0) {
                        throw new IllegalStateException("El proveedor no devolvió fuentes de reproducción");
                    }
                    Rx0 rx3 = new Rx0(str, jSONObjectOptJSONObject3, jSONArrayOptJSONArray, setS, System.currentTimeMillis());
                    h = rx3;
                    return rx3;
                }
            }
            throw new IllegalStateException("El proveedor no devolvió una autorización válida");
        }
    }

    @Override // o.Q30
    public final Object a(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new C1055ay0(str, i, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final Object b(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new Ux0(str, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final Object c(String str, String str2, InterfaceC0473Hh interfaceC0473Hh) {
        return C1233cq.l;
    }

    @Override // o.Q30
    public final Object d(int i, InterfaceC0473Hh interfaceC0473Hh) {
        return C1233cq.l;
    }

    @Override // o.Q30
    public final Object e(Video$Type video$Type, String str, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new Wx0(str, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final String f() {
        return "https://img.magnific.com/premium-vector/television-icon-logo-design-template_847417-313.jpg";
    }

    @Override // o.Q30
    public final Object g(InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new Tx0(2, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final String getName() {
        return "CANALES OTROS PAISES";
    }

    @Override // o.Q30
    public final Object h(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new Sx0(str, i, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final Object i(int i, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new Vx0(i, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final Object j(String str, InterfaceC0473Hh interfaceC0473Hh) {
        C2109lo0 c2109lo0 = new C2109lo0(str, "Televisión en vivo", null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65532);
        c2109lo0.r = "CANALES OTROS PAISES";
        return c2109lo0;
    }

    @Override // o.Q30
    public final Object k(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1688hY(str, str, null, null, 12);
    }

    @Override // o.Q30
    public final boolean l() {
        return true;
    }

    @Override // o.Q30
    public final String m() {
        return "es";
    }

    @Override // o.Q30
    public final Object n(Ds0 ds0, InterfaceC0473Hh interfaceC0473Hh) {
        Js0 js0 = ds0.r;
        return js0 == null ? new Js0(ds0.n, ds0.f223o, (String) null, ds0.p, ds0.q, (byte[]) null, ds0.m, (String) null, (String) null, (List) null, true, 2980) : js0;
    }

    @Override // o.Q30
    public final Object o(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return C2985uq0.a;
    }

    public final void t() {
        e = null;
        f.clear();
        synchronized (g) {
            h = null;
        }
        Uj0.b.incrementAndGet();
        AbstractC2065lL.a.set(null);
        ReentrantLock reentrantLock = Uj0.a;
        if (reentrantLock.tryLock()) {
            try {
                Uj0.d();
            } finally {
                reentrantLock.unlock();
            }
        } else if (Uj0.c.compareAndSet(false, true)) {
            Thread thread = new Thread(new UU(11), "xuper-ranger-clear");
            thread.setDaemon(true);
            thread.start();
        }
    }
}
