package com.google.tagmanager.p020a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'i' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.google.tagmanager.a.bm */
/* JADX INFO: loaded from: classes.dex */
public class EnumC0807bm {

    /* JADX INFO: renamed from: a */
    public static final EnumC0807bm f2380a = new EnumC0807bm("DOUBLE", 0, EnumC0812br.DOUBLE, 1);

    /* JADX INFO: renamed from: b */
    public static final EnumC0807bm f2381b = new EnumC0807bm("FLOAT", 1, EnumC0812br.FLOAT, 5);

    /* JADX INFO: renamed from: c */
    public static final EnumC0807bm f2382c = new EnumC0807bm("INT64", 2, EnumC0812br.LONG, 0);

    /* JADX INFO: renamed from: d */
    public static final EnumC0807bm f2383d = new EnumC0807bm("UINT64", 3, EnumC0812br.LONG, 0);

    /* JADX INFO: renamed from: e */
    public static final EnumC0807bm f2384e = new EnumC0807bm("INT32", 4, EnumC0812br.INT, 0);

    /* JADX INFO: renamed from: f */
    public static final EnumC0807bm f2385f = new EnumC0807bm("FIXED64", 5, EnumC0812br.LONG, 1);

    /* JADX INFO: renamed from: g */
    public static final EnumC0807bm f2386g = new EnumC0807bm("FIXED32", 6, EnumC0812br.INT, 5);

    /* JADX INFO: renamed from: h */
    public static final EnumC0807bm f2387h = new EnumC0807bm("BOOL", 7, EnumC0812br.BOOLEAN, 0);

    /* JADX INFO: renamed from: i */
    public static final EnumC0807bm f2388i;

    /* JADX INFO: renamed from: j */
    public static final EnumC0807bm f2389j;

    /* JADX INFO: renamed from: k */
    public static final EnumC0807bm f2390k;

    /* JADX INFO: renamed from: l */
    public static final EnumC0807bm f2391l;

    /* JADX INFO: renamed from: m */
    public static final EnumC0807bm f2392m;

    /* JADX INFO: renamed from: n */
    public static final EnumC0807bm f2393n;

    /* JADX INFO: renamed from: o */
    public static final EnumC0807bm f2394o;

    /* JADX INFO: renamed from: p */
    public static final EnumC0807bm f2395p;

    /* JADX INFO: renamed from: q */
    public static final EnumC0807bm f2396q;

    /* JADX INFO: renamed from: r */
    public static final EnumC0807bm f2397r;

    /* JADX INFO: renamed from: u */
    private static final /* synthetic */ EnumC0807bm[] f2398u;

    /* JADX INFO: renamed from: s */
    private final EnumC0812br f2399s;

    /* JADX INFO: renamed from: t */
    private final int f2400t;

    static {
        final int i = 3;
        final int i2 = 2;
        final String str = "STRING";
        final int i3 = 8;
        final EnumC0812br enumC0812br = EnumC0812br.STRING;
        f2388i = new EnumC0807bm(str, i3, enumC0812br, i2) { // from class: com.google.tagmanager.a.bn
            @Override // com.google.tagmanager.p020a.EnumC0807bm
            /* JADX INFO: renamed from: c */
            public boolean mo3389c() {
                return false;
            }
        };
        final String str2 = "GROUP";
        final int i4 = 9;
        final EnumC0812br enumC0812br2 = EnumC0812br.MESSAGE;
        f2389j = new EnumC0807bm(str2, i4, enumC0812br2, i) { // from class: com.google.tagmanager.a.bo
            @Override // com.google.tagmanager.p020a.EnumC0807bm
            /* JADX INFO: renamed from: c */
            public boolean mo3389c() {
                return false;
            }
        };
        final String str3 = "MESSAGE";
        final int i5 = 10;
        final EnumC0812br enumC0812br3 = EnumC0812br.MESSAGE;
        f2390k = new EnumC0807bm(str3, i5, enumC0812br3, i2) { // from class: com.google.tagmanager.a.bp
            @Override // com.google.tagmanager.p020a.EnumC0807bm
            /* JADX INFO: renamed from: c */
            public boolean mo3389c() {
                return false;
            }
        };
        final String str4 = "BYTES";
        final int i6 = 11;
        final EnumC0812br enumC0812br4 = EnumC0812br.BYTE_STRING;
        f2391l = new EnumC0807bm(str4, i6, enumC0812br4, i2) { // from class: com.google.tagmanager.a.bq
            @Override // com.google.tagmanager.p020a.EnumC0807bm
            /* JADX INFO: renamed from: c */
            public boolean mo3389c() {
                return false;
            }
        };
        f2392m = new EnumC0807bm("UINT32", 12, EnumC0812br.INT, 0);
        f2393n = new EnumC0807bm("ENUM", 13, EnumC0812br.ENUM, 0);
        f2394o = new EnumC0807bm("SFIXED32", 14, EnumC0812br.INT, 5);
        f2395p = new EnumC0807bm("SFIXED64", 15, EnumC0812br.LONG, 1);
        f2396q = new EnumC0807bm("SINT32", 16, EnumC0812br.INT, 0);
        f2397r = new EnumC0807bm("SINT64", 17, EnumC0812br.LONG, 0);
        f2398u = new EnumC0807bm[]{f2380a, f2381b, f2382c, f2383d, f2384e, f2385f, f2386g, f2387h, f2388i, f2389j, f2390k, f2391l, f2392m, f2393n, f2394o, f2395p, f2396q, f2397r};
    }

    private EnumC0807bm(String str, int i, EnumC0812br enumC0812br, int i2) {
        super(str, i);
        this.f2399s = enumC0812br;
        this.f2400t = i2;
    }

    public static EnumC0807bm valueOf(String str) {
        return (EnumC0807bm) Enum.valueOf(EnumC0807bm.class, str);
    }

    public static EnumC0807bm[] values() {
        return (EnumC0807bm[]) f2398u.clone();
    }

    /* JADX INFO: renamed from: a */
    public EnumC0812br m3387a() {
        return this.f2399s;
    }

    /* JADX INFO: renamed from: b */
    public int m3388b() {
        return this.f2400t;
    }

    /* JADX INFO: renamed from: c */
    public boolean mo3389c() {
        return true;
    }
}
