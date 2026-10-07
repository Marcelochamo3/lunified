package io.sentry;

/* JADX INFO: renamed from: io.sentry.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0053j {
    All("__all__"),
    Default("default"),
    Error("error"),
    Session("session"),
    Attachment("attachment"),
    Monitor("monitor"),
    Profile("profile"),
    MetricBucket("metric_bucket"),
    Transaction("transaction"),
    Replay("replay"),
    Span("span"),
    Security("security"),
    UserReport("user_report"),
    Unknown("unknown");

    private final String category;

    EnumC0053j(String str) {
        this.category = str;
    }

    public String getCategory() {
        return this.category;
    }
}
