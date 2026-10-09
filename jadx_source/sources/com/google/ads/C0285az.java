package com.google.ads;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/* JADX INFO: renamed from: com.google.ads.az */
/* JADX INFO: loaded from: classes.dex */
public class C0285az {

    /* JADX INFO: renamed from: c */
    private static C0285az f960c = null;

    /* JADX INFO: renamed from: b */
    private BigInteger f962b = BigInteger.ONE;

    /* JADX INFO: renamed from: a */
    private final BigInteger f961a = m1235d();

    private C0285az() {
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C0285az m1233a() {
        if (f960c == null) {
            f960c = new C0285az();
        }
        return f960c;
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m1234a(long j) {
        return BigInteger.valueOf(j).toByteArray();
    }

    /* JADX INFO: renamed from: d */
    private static BigInteger m1235d() {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            UUID uuidRandomUUID = UUID.randomUUID();
            messageDigest.update(m1234a(uuidRandomUUID.getLeastSignificantBits()));
            messageDigest.update(m1234a(uuidRandomUUID.getMostSignificantBits()));
            byte[] bArr = new byte[9];
            bArr[0] = 0;
            System.arraycopy(messageDigest.digest(), 0, bArr, 1, 8);
            return new BigInteger(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Cannot find MD5 message digest algorithm.");
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized BigInteger m1236b() {
        return this.f961a;
    }

    /* JADX INFO: renamed from: c */
    public synchronized BigInteger m1237c() {
        BigInteger bigInteger;
        bigInteger = this.f962b;
        this.f962b = this.f962b.add(BigInteger.ONE);
        return bigInteger;
    }
}
