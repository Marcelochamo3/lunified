package io.sentry;

/* JADX INFO: renamed from: io.sentry.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0091t1 implements InterfaceC0084r0 {
    Session("session"),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile("profile"),
    ClientReport("client_report"),
    ReplayEvent("replay_event"),
    ReplayRecording("replay_recording"),
    ReplayVideo("replay_video"),
    CheckIn("check_in"),
    Statsd("statsd"),
    Unknown("__unknown__");

    private final String itemType;

    EnumC0091t1(String str) {
        this.itemType = str;
    }

    public static EnumC0091t1 resolve(Object obj) {
        if (obj instanceof C0083q1) {
            return Event;
        }
        if (obj instanceof io.sentry.protocol.A) {
            return Transaction;
        }
        if (obj instanceof S1) {
            return Session;
        }
        return obj instanceof io.sentry.clientreport.b ? ClientReport : Attachment;
    }

    public static EnumC0091t1 valueOfLabel(String str) {
        for (EnumC0091t1 enumC0091t1 : values()) {
            if (enumC0091t1.itemType.equals(str)) {
                return enumC0091t1;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.InterfaceC0084r0
    public void serialize(F0 f0, ILogger iLogger) {
        ((io.sentry.internal.debugmeta.c) f0).m(this.itemType);
    }
}
