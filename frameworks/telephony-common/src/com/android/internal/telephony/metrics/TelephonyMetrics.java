/*
 * Copyright (C) 2026 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.android.internal.telephony.metrics;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class TelephonyMetrics {
    private static TelephonyMetrics sInstance;

    public TelephonyMetrics() {}

    public synchronized static TelephonyMetrics getInstance() {
        if (sInstance == null) {
            sInstance = new TelephonyMetrics();
        }
        return sInstance;
    }

    public void setContext(Context context) {}

    public synchronized void dump(FileDescriptor fd, PrintWriter pw, String[] args) {}

    public void writeOnRilSolicitedResponse(int phoneId, int rilSerial, int rilError,
                                            int rilRequest, Object ret) {}

    public void writeOnRilTimeoutResponse(int phoneId, int rilSerial, int rilRequest) {}

    public void writeRilAnswer(int phoneId, int rilSerial) {}

    public synchronized void writeRilSendSms(int phoneId, int rilSerial, int tech, int format,
            long messageId) {}
}
