package com.titan.ranger;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class JniHandler {
    private static volatile String prepareEvent = "";

    private String Callback(String str, String str2) {
        if (!"OnPrepareEvent".equals(str)) {
            return "{\"err\":0,\"res\":\"\"}";
        }
        prepareEvent = str2;
        logPrepareState(str2);
        return "{\"err\":0,\"res\":\"\"}";
    }

    private static String firstNonBlank(String... strArr) {
        for (String str : strArr) {
            if (str != null && !str.trim().isEmpty()) {
                return str;
            }
        }
        return "-";
    }

    public static String getPrepareEvent() {
        return prepareEvent;
    }

    private static void logPrepareState(String str) {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            Object objOpt = jSONObject2.opt("status");
            if (objOpt instanceof JSONObject) {
                jSONObject = (JSONObject) objOpt;
            } else {
                jSONObject = objOpt instanceof String ? new JSONObject((String) objOpt) : new JSONObject();
            }
            String strFirstNonBlank = firstNonBlank(jSONObject.optString("state"), jSONObject.optString("status"), jSONObject2.optString("state"));
            String strFirstNonBlank2 = firstNonBlank(jSONObject.optString("error_code"), jSONObject.optString("err"), jSONObject.optString("code"), jSONObject2.optString("error_code"), jSONObject2.optString("err"));
            safeToken(strFirstNonBlank);
            safeToken(strFirstNonBlank2);
            jSONObject.optString("play_url").isEmpty();
        } catch (Exception unused) {
        }
    }

    public static void resetPrepareEvent() {
        prepareEvent = "";
    }

    private static String safeToken(String str) {
        return str.matches("[A-Za-z0-9_.:-]{1,32}") ? str : "-";
    }
}
