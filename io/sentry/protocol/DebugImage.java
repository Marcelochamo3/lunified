package io.sentry.protocol;

import io.sentry.AbstractC0035d;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class DebugImage implements InterfaceC0084r0 {
    public static final String JVM = "jvm";
    public static final String PROGUARD = "proguard";
    private String arch;
    private String codeFile;
    private String codeId;
    private String debugFile;
    private String debugId;
    private String imageAddr;
    private Long imageSize;
    private String type;
    private Map<String, Object> unknown;
    private String uuid;

    public String getArch() {
        return this.arch;
    }

    public String getCodeFile() {
        return this.codeFile;
    }

    public String getCodeId() {
        return this.codeId;
    }

    public String getDebugFile() {
        return this.debugFile;
    }

    public String getDebugId() {
        return this.debugId;
    }

    public String getImageAddr() {
        return this.imageAddr;
    }

    public Long getImageSize() {
        return this.imageSize;
    }

    public String getType() {
        return this.type;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getUuid() {
        return this.uuid;
    }

    @Override // io.sentry.InterfaceC0084r0
    public void serialize(F0 f0, ILogger iLogger) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        if (this.uuid != null) {
            cVar.f("uuid");
            cVar.m(this.uuid);
        }
        if (this.type != null) {
            cVar.f("type");
            cVar.m(this.type);
        }
        if (this.debugId != null) {
            cVar.f("debug_id");
            cVar.m(this.debugId);
        }
        if (this.debugFile != null) {
            cVar.f("debug_file");
            cVar.m(this.debugFile);
        }
        if (this.codeId != null) {
            cVar.f("code_id");
            cVar.m(this.codeId);
        }
        if (this.codeFile != null) {
            cVar.f("code_file");
            cVar.m(this.codeFile);
        }
        if (this.imageAddr != null) {
            cVar.f("image_addr");
            cVar.m(this.imageAddr);
        }
        if (this.imageSize != null) {
            cVar.f("image_size");
            cVar.l(this.imageSize);
        }
        if (this.arch != null) {
            cVar.f("arch");
            cVar.m(this.arch);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.unknown, str, cVar, str, iLogger);
            }
        }
        cVar.c();
    }

    public void setArch(String str) {
        this.arch = str;
    }

    public void setCodeFile(String str) {
        this.codeFile = str;
    }

    public void setCodeId(String str) {
        this.codeId = str;
    }

    public void setDebugFile(String str) {
        this.debugFile = str;
    }

    public void setDebugId(String str) {
        this.debugId = str;
    }

    public void setImageAddr(String str) {
        this.imageAddr = str;
    }

    public void setImageSize(Long l) {
        this.imageSize = l;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public void setImageSize(long j) {
        this.imageSize = Long.valueOf(j);
    }
}
