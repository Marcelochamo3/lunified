package o;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: o.mj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2196mj0 {
    public static final C2196mj0 x = new C2196mj0("builtin-2026-07-30", "https://api.tigosports.com.py/api/v4", "https://api.tigosports.com.py/sls/v1", "PY", "content/get-events/{country}/live/games/1/10", "content/get-events/{country}/next/games/1/20", "content/get-events/{country}/replay/games/1/10", "content/get-event/{country}/{cid}/other/game", "streaming/{cid}", "{cid}", null, AbstractC2506pt.A("contentful_id"), AbstractC0937Ze.K("contentful_data.fields.name", "contentful_data.fields.title", "contentful_data.fields.eventName", "contentful_data.fields.matchName"), AbstractC2506pt.A("home_team_data.json.fields.name"), AbstractC2506pt.A("away_team_data.json.fields.name"), AbstractC2506pt.A("league"), AbstractC2506pt.A("sport"), AbstractC2506pt.A("contentful_data.fields.horizontal_thumbnails.file.fields.file.url"), AbstractC0937Ze.K("event.channel_data.json.fields.livestreamingUrl.streamingUrlDash", "event.channel.livestreamingUrl.streamingUrlDash", "data.replayUrlDash", "data.streamingUrl"), AbstractC1370eA.O("Programación"), AbstractC1370eA.O("Otros"), Lc0.T("", "Eventos Tigo Sports"), C1330dq.l);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final List l;
    public final List m;
    public final List n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f919o;
    public final List p;
    public final List q;
    public final List r;
    public final List s;
    public final Set t;
    public final Set u;
    public final Set v;
    public final Map w;

    public C2196mj0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, Set set, Set set2, Set set3, Map map) {
        AbstractC1474fG.j(str2, "apiBase");
        AbstractC1474fG.j(str3, "vecimaBase");
        AbstractC1474fG.j(list, "contentIdFields");
        AbstractC1474fG.j(list2, "titleFields");
        AbstractC1474fG.j(list3, "homeFields");
        AbstractC1474fG.j(list4, "awayFields");
        AbstractC1474fG.j(list5, "leagueFields");
        AbstractC1474fG.j(list6, "sportFields");
        AbstractC1474fG.j(list7, "posterFields");
        AbstractC1474fG.j(list8, "dashFields");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = list;
        this.m = list2;
        this.n = list3;
        this.f919o = list4;
        this.p = list5;
        this.q = list6;
        this.r = list7;
        this.s = list8;
        this.t = set;
        this.u = set2;
        this.v = set3;
        this.w = map;
    }

    public static String a(String str, Map map) {
        AbstractC1474fG.j(str, "template");
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            str = AbstractC1899jh0.R(str, AbstractC1701hf0.u("{", str2, "}"), (String) entry.getValue(), false);
        }
        return str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2196mj0)) {
            return false;
        }
        C2196mj0 c2196mj0 = (C2196mj0) obj;
        return AbstractC1474fG.b(this.a, c2196mj0.a) && AbstractC1474fG.b(this.b, c2196mj0.b) && AbstractC1474fG.b(this.c, c2196mj0.c) && AbstractC1474fG.b(this.d, c2196mj0.d) && AbstractC1474fG.b(this.e, c2196mj0.e) && AbstractC1474fG.b(this.f, c2196mj0.f) && AbstractC1474fG.b(this.g, c2196mj0.g) && AbstractC1474fG.b(this.h, c2196mj0.h) && AbstractC1474fG.b(this.i, c2196mj0.i) && AbstractC1474fG.b(this.j, c2196mj0.j) && AbstractC1474fG.b(this.k, c2196mj0.k) && AbstractC1474fG.b(this.l, c2196mj0.l) && AbstractC1474fG.b(this.m, c2196mj0.m) && AbstractC1474fG.b(this.n, c2196mj0.n) && AbstractC1474fG.b(this.f919o, c2196mj0.f919o) && AbstractC1474fG.b(this.p, c2196mj0.p) && AbstractC1474fG.b(this.q, c2196mj0.q) && AbstractC1474fG.b(this.r, c2196mj0.r) && AbstractC1474fG.b(this.s, c2196mj0.s) && AbstractC1474fG.b(this.t, c2196mj0.t) && AbstractC1474fG.b(this.u, c2196mj0.u) && AbstractC1474fG.b(this.v, c2196mj0.v) && AbstractC1474fG.b(this.w, c2196mj0.w);
    }

    public final int hashCode() {
        int i = AbstractC1674hK.i(AbstractC1674hK.i(AbstractC1674hK.i(AbstractC1674hK.i(AbstractC1674hK.i(AbstractC1674hK.i(AbstractC1674hK.i(AbstractC1674hK.i(AbstractC1674hK.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), this.h, 31), this.i, 31), this.j, 31);
        String str = this.k;
        return this.w.hashCode() + ((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + AbstractC1674hK.j(this.s, AbstractC1674hK.j(this.r, AbstractC1674hK.j(this.q, AbstractC1674hK.j(this.p, AbstractC1674hK.j(this.f919o, AbstractC1674hK.j(this.n, AbstractC1674hK.j(this.m, AbstractC1674hK.j(this.l, (i + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TigoExtractionRules(revision=" + this.a + ", apiBase=" + this.b + ", vecimaBase=" + this.c + ", country=" + this.d + ", liveEndpoint=" + this.e + ", nextEndpoint=" + this.f + ", fallbackEndpoint=" + this.g + ", detailEndpoint=" + this.h + ", vecimaEndpoint=" + this.i + ", typeContent=" + this.j + ", indexCam=" + this.k + ", contentIdFields=" + this.l + ", titleFields=" + this.m + ", homeFields=" + this.n + ", awayFields=" + this.f919o + ", leagueFields=" + this.p + ", sportFields=" + this.q + ", posterFields=" + this.r + ", dashFields=" + this.s + ", fillerSports=" + this.t + ", fillerLeagues=" + this.u + ", fillerTeams=" + this.v + ", clearKeysByKid=" + this.w + ")";
    }
}
