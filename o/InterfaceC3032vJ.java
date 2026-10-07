package o;

/* JADX INFO: renamed from: o.vJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3032vJ {
    @InterfaceC1251cz("/wp-api/v1/search")
    Object a(@InterfaceC3206x40("q") String str, @InterfaceC3206x40("page") int i, InterfaceC0473Hh<? super C1477fJ> interfaceC0473Hh);

    @InterfaceC1251cz("/wp-api/v1/listing/tvshows")
    Object b(@InterfaceC3206x40("page") int i, @InterfaceC3206x40("postsPerPage") int i2, @InterfaceC3206x40("postType") String str, InterfaceC0473Hh<? super C1477fJ> interfaceC0473Hh);

    @InterfaceC1251cz("/wp-api/v1/single/episodes/list")
    Object c(@InterfaceC3206x40("_id") String str, @InterfaceC3206x40("season") int i, @InterfaceC3206x40("page") int i2, InterfaceC0473Hh<? super C1282dJ> interfaceC0473Hh);

    @InterfaceC1251cz("/wp-api/v1/listing/movies")
    Object d(@InterfaceC3206x40("page") int i, @InterfaceC3206x40("postsPerPage") int i2, @InterfaceC3206x40("filter") String str, @InterfaceC3206x40("orderBy") String str2, @InterfaceC3206x40("order") String str3, @InterfaceC3206x40("postType") String str4, InterfaceC0473Hh<? super C1477fJ> interfaceC0473Hh);

    @InterfaceC1251cz("/wp-api/v1/single/movies")
    Object e(@InterfaceC3206x40("slug") String str, @InterfaceC3206x40("postType") String str2, InterfaceC0473Hh<? super C3129wJ> interfaceC0473Hh);

    @InterfaceC1251cz("/wp-api/v1/listing/movies")
    Object f(@InterfaceC3206x40("page") int i, @InterfaceC3206x40("postsPerPage") int i2, @InterfaceC3206x40("postType") String str, InterfaceC0473Hh<? super C1477fJ> interfaceC0473Hh);

    @InterfaceC1251cz("/wp-api/v1/single/tvshows")
    Object g(@InterfaceC3206x40("slug") String str, @InterfaceC3206x40("postType") String str2, InterfaceC0473Hh<? super C3129wJ> interfaceC0473Hh);

    @InterfaceC1251cz("/wp-api/v1/player")
    Object h(@InterfaceC3206x40("postId") String str, @InterfaceC3206x40("demo") int i, InterfaceC0473Hh<? super C1771iJ> interfaceC0473Hh);
}
