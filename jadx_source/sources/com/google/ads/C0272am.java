package com.google.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.google.ads.am */
/* JADX INFO: loaded from: classes.dex */
public class C0272am {
    /* JADX INFO: renamed from: a */
    static void m1189a(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (bArr[i] ^ 68);
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m1190a(String str) throws C0273an {
        byte[] bArrM1207a = C0276aq.m1207a(str);
        if (bArrM1207a.length != 32) {
            throw new C0273an();
        }
        byte[] bArr = new byte[16];
        ByteBuffer.wrap(bArrM1207a, 4, 16).get(bArr);
        m1189a(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m1191a(byte[] bArr, String str) throws C0273an {
        if (bArr.length != 16) {
            throw new C0273an();
        }
        try {
            byte[] bArrM1207a = C0276aq.m1207a(str);
            if (bArrM1207a.length <= 16) {
                throw new C0273an();
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrM1207a.length);
            byteBufferAllocate.put(bArrM1207a);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[bArrM1207a.length - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(bArr2));
            return cipher.doFinal(bArr3);
        } catch (InvalidAlgorithmParameterException e) {
            throw new C0273an(e);
        } catch (InvalidKeyException e2) {
            throw new C0273an(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new C0273an(e3);
        } catch (BadPaddingException e4) {
            throw new C0273an(e4);
        } catch (IllegalBlockSizeException e5) {
            throw new C0273an(e5);
        } catch (NoSuchPaddingException e6) {
            throw new C0273an(e6);
        }
    }
}
