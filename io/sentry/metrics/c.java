package io.sentry.metrics;

import java.security.SecureRandom;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        Pattern.compile("\\W+");
        Pattern.compile("[^\\w\\-.]+");
        Pattern.compile("[^\\w\\-./]+");
        a = (long) (new SecureRandom().nextFloat() * 10000.0f);
    }
}
