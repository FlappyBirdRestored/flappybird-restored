package org.andengine.opengl.view;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'a' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: org.andengine.opengl.view.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class EnumC1027b {

    /* JADX INFO: renamed from: a */
    public static final EnumC1027b f3033a;

    /* JADX INFO: renamed from: b */
    public static final EnumC1027b f3034b;

    /* JADX INFO: renamed from: c */
    public static final EnumC1027b f3035c;

    /* JADX INFO: renamed from: d */
    public static final EnumC1027b f3036d;

    /* JADX INFO: renamed from: e */
    private static final /* synthetic */ EnumC1027b[] f3037e;

    static {
        final int i = 3;
        final int i2 = 2;
        final int i3 = 1;
        final int i4 = 0;
        final String str = "STRICT";
        f3033a = new EnumC1027b(str, i4) { // from class: org.andengine.opengl.view.c
            {
                EnumC1027b enumC1027b = null;
            }

            @Override // org.andengine.opengl.view.EnumC1027b
            /* JADX INFO: renamed from: a */
            public boolean mo4073a(int i5, int i6, int i7, int i8, int i9, int i10) {
                return i9 == 0 && i10 == 0 && i5 == 5 && i6 == 6 && i7 == 5 && i8 == 0;
            }
        };
        final String str2 = "LOOSE_STENCIL";
        f3034b = new EnumC1027b(str2, i3) { // from class: org.andengine.opengl.view.d
            {
                EnumC1027b enumC1027b = null;
            }

            @Override // org.andengine.opengl.view.EnumC1027b
            /* JADX INFO: renamed from: a */
            public boolean mo4073a(int i5, int i6, int i7, int i8, int i9, int i10) {
                return i9 == 0 && i10 >= 0 && i5 == 5 && i6 == 6 && i7 == 5 && i8 == 0;
            }
        };
        final String str3 = "LOOSE_DEPTH_AND_STENCIL";
        f3035c = new EnumC1027b(str3, i2) { // from class: org.andengine.opengl.view.e
            {
                EnumC1027b enumC1027b = null;
            }

            @Override // org.andengine.opengl.view.EnumC1027b
            /* JADX INFO: renamed from: a */
            public boolean mo4073a(int i5, int i6, int i7, int i8, int i9, int i10) {
                return i9 >= 0 && i10 >= 0 && i5 == 5 && i6 == 6 && i7 == 5 && i8 == 0;
            }
        };
        final String str4 = "ANY";
        f3036d = new EnumC1027b(str4, i) { // from class: org.andengine.opengl.view.f
            {
                EnumC1027b enumC1027b = null;
            }

            @Override // org.andengine.opengl.view.EnumC1027b
            /* JADX INFO: renamed from: a */
            public boolean mo4073a(int i5, int i6, int i7, int i8, int i9, int i10) {
                return true;
            }
        };
        f3037e = new EnumC1027b[]{f3033a, f3034b, f3035c, f3036d};
    }

    private EnumC1027b(String str, int i) {
        super(str, i);
    }

    /* synthetic */ EnumC1027b(String str, int i, EnumC1027b enumC1027b) {
        this(str, i);
    }

    public static EnumC1027b valueOf(String str) {
        return (EnumC1027b) Enum.valueOf(EnumC1027b.class, str);
    }

    public static EnumC1027b[] values() {
        EnumC1027b[] enumC1027bArr = f3037e;
        int length = enumC1027bArr.length;
        EnumC1027b[] enumC1027bArr2 = new EnumC1027b[length];
        System.arraycopy(enumC1027bArr, 0, enumC1027bArr2, 0, length);
        return enumC1027bArr2;
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo4073a(int i, int i2, int i3, int i4, int i5, int i6);
}
