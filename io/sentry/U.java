package io.sentry;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.Reader;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface U {
    Object b(Reader reader, Class cls);

    C0088s1 k(BufferedInputStream bufferedInputStream);

    String o(Map map);

    Object p(BufferedReader bufferedReader, Class cls, C0038e c0038e);

    void r(C0088s1 c0088s1, OutputStream outputStream);

    void z(Object obj, BufferedWriter bufferedWriter);
}
