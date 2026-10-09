package com.google.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.ads.ai */
/* JADX INFO: loaded from: classes.dex */
public class C0268ai extends AbstractC0267ah {

    /* JADX INFO: renamed from: d */
    private static Method f926d = null;

    /* JADX INFO: renamed from: e */
    private static Method f927e = null;

    /* JADX INFO: renamed from: f */
    private static Method f928f = null;

    /* JADX INFO: renamed from: g */
    private static Method f929g = null;

    /* JADX INFO: renamed from: h */
    private static Method f930h = null;

    /* JADX INFO: renamed from: i */
    private static String f931i = null;

    /* JADX INFO: renamed from: j */
    private static long f932j = 0;

    /* JADX INFO: renamed from: c */
    static boolean f925c = false;

    protected C0268ai(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static C0268ai m1174a(String str, Context context) {
        m1179b(str, context);
        return new C0268ai(context);
    }

    /* JADX INFO: renamed from: a */
    static String m1175a() throws C0269aj {
        if (f931i == null) {
            throw new C0269aj();
        }
        return f931i;
    }

    /* JADX INFO: renamed from: a */
    static ArrayList m1176a(MotionEvent motionEvent, DisplayMetrics displayMetrics) throws C0269aj {
        if (f929g == null || motionEvent == null) {
            throw new C0269aj();
        }
        try {
            return (ArrayList) f929g.invoke(null, motionEvent, displayMetrics);
        } catch (IllegalAccessException e) {
            throw new C0269aj(e);
        } catch (InvocationTargetException e2) {
            throw new C0269aj(e2);
        }
    }

    /* JADX INFO: renamed from: b */
    static Long m1177b() throws C0269aj {
        if (f926d == null) {
            throw new C0269aj();
        }
        try {
            return (Long) f926d.invoke(null, new Object[0]);
        } catch (IllegalAccessException e) {
            throw new C0269aj(e);
        } catch (InvocationTargetException e2) {
            throw new C0269aj(e2);
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m1178b(byte[] bArr, String str) throws C0269aj {
        try {
            return new String(C0272am.m1191a(bArr, str), "UTF-8");
        } catch (C0273an e) {
            throw new C0269aj(e);
        } catch (C0275ap e2) {
            throw new C0269aj(e2);
        } catch (UnsupportedEncodingException e3) {
            throw new C0269aj(e3);
        }
    }

    /* JADX INFO: renamed from: b */
    protected static synchronized void m1179b(String str, Context context) {
        if (!f925c) {
            try {
                f931i = str;
                m1183f(context);
                f932j = m1177b().longValue();
                f925c = true;
            } catch (C0269aj e) {
            } catch (UnsupportedOperationException e2) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    static String m1180c() throws C0269aj {
        if (f927e == null) {
            throw new C0269aj();
        }
        try {
            return (String) f927e.invoke(null, new Object[0]);
        } catch (IllegalAccessException e) {
            throw new C0269aj(e);
        } catch (InvocationTargetException e2) {
            throw new C0269aj(e2);
        }
    }

    /* JADX INFO: renamed from: d */
    static String m1181d(Context context) throws C0269aj {
        if (f930h == null) {
            throw new C0269aj();
        }
        try {
            String str = (String) f930h.invoke(null, context);
            if (str == null) {
                throw new C0269aj();
            }
            return str;
        } catch (IllegalAccessException e) {
            throw new C0269aj(e);
        } catch (InvocationTargetException e2) {
            throw new C0269aj(e2);
        }
    }

    /* JADX INFO: renamed from: e */
    static String m1182e(Context context) throws C0269aj {
        if (f928f == null) {
            throw new C0269aj();
        }
        try {
            ByteBuffer byteBuffer = (ByteBuffer) f928f.invoke(null, context);
            if (byteBuffer == null) {
                throw new C0269aj();
            }
            return C0276aq.m1206a(byteBuffer.array(), false);
        } catch (IllegalAccessException e) {
            throw new C0269aj(e);
        } catch (InvocationTargetException e2) {
            throw new C0269aj(e2);
        }
    }

    /* JADX INFO: renamed from: f */
    private static void m1183f(Context context) throws C0269aj {
        try {
            byte[] bArrM1190a = C0272am.m1190a(C0274ao.m1192a());
            byte[] bArrM1191a = C0272am.m1191a(bArrM1190a, C0274ao.m1193b());
            File cacheDir = context.getCacheDir();
            if (cacheDir == null && (cacheDir = context.getDir("dex", 0)) == null) {
                throw new C0269aj();
            }
            File fileCreateTempFile = File.createTempFile("ads", ".jar", cacheDir);
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(bArrM1191a, 0, bArrM1191a.length);
            fileOutputStream.close();
            DexClassLoader dexClassLoader = new DexClassLoader(fileCreateTempFile.getAbsolutePath(), cacheDir.getAbsolutePath(), null, context.getClassLoader());
            Class clsLoadClass = dexClassLoader.loadClass(m1178b(bArrM1190a, C0274ao.m1194c()));
            Class clsLoadClass2 = dexClassLoader.loadClass(m1178b(bArrM1190a, C0274ao.m1200i()));
            Class clsLoadClass3 = dexClassLoader.loadClass(m1178b(bArrM1190a, C0274ao.m1198g()));
            Class clsLoadClass4 = dexClassLoader.loadClass(m1178b(bArrM1190a, C0274ao.m1202k()));
            Class clsLoadClass5 = dexClassLoader.loadClass(m1178b(bArrM1190a, C0274ao.m1196e()));
            f926d = clsLoadClass.getMethod(m1178b(bArrM1190a, C0274ao.m1195d()), new Class[0]);
            f927e = clsLoadClass2.getMethod(m1178b(bArrM1190a, C0274ao.m1201j()), new Class[0]);
            f928f = clsLoadClass3.getMethod(m1178b(bArrM1190a, C0274ao.m1199h()), Context.class);
            f929g = clsLoadClass4.getMethod(m1178b(bArrM1190a, C0274ao.m1203l()), MotionEvent.class, DisplayMetrics.class);
            f930h = clsLoadClass5.getMethod(m1178b(bArrM1190a, C0274ao.m1197f()), Context.class);
            String name = fileCreateTempFile.getName();
            fileCreateTempFile.delete();
            new File(cacheDir, name.replace(".jar", ".dex")).delete();
        } catch (C0273an e) {
            throw new C0269aj(e);
        } catch (C0275ap e2) {
            throw new C0269aj(e2);
        } catch (FileNotFoundException e3) {
            throw new C0269aj(e3);
        } catch (IOException e4) {
            throw new C0269aj(e4);
        } catch (ClassNotFoundException e5) {
            throw new C0269aj(e5);
        } catch (NoSuchMethodException e6) {
            throw new C0269aj(e6);
        } catch (NullPointerException e7) {
            throw new C0269aj(e7);
        }
    }

    @Override // com.google.ads.AbstractC0267ah
    /* JADX INFO: renamed from: b */
    protected void mo1172b(Context context) {
        try {
            try {
                m1169a(1, m1180c());
            } catch (C0269aj e) {
            }
            try {
                m1169a(2, m1175a());
            } catch (C0269aj e2) {
            }
            try {
                m1168a(25, m1177b().longValue());
            } catch (C0269aj e3) {
            }
            try {
                m1169a(24, m1181d(context));
            } catch (C0269aj e4) {
            }
        } catch (IOException e5) {
        }
    }

    @Override // com.google.ads.AbstractC0267ah
    /* JADX INFO: renamed from: c */
    protected void mo1173c(Context context) {
        try {
            try {
                m1169a(2, m1175a());
            } catch (IOException e) {
                return;
            }
        } catch (C0269aj e2) {
        }
        try {
            m1169a(1, m1180c());
        } catch (C0269aj e3) {
        }
        try {
            long jLongValue = m1177b().longValue();
            m1168a(25, jLongValue);
            if (f932j != 0) {
                m1168a(17, jLongValue - f932j);
                m1168a(23, f932j);
            }
        } catch (C0269aj e4) {
        }
        try {
            ArrayList arrayListM1176a = m1176a(this.f921a, this.f922b);
            m1168a(14, ((Long) arrayListM1176a.get(0)).longValue());
            m1168a(15, ((Long) arrayListM1176a.get(1)).longValue());
            if (arrayListM1176a.size() >= 3) {
                m1168a(16, ((Long) arrayListM1176a.get(2)).longValue());
            }
        } catch (C0269aj e5) {
        }
        try {
            m1169a(27, m1182e(context));
        } catch (C0269aj e6) {
        }
    }
}
