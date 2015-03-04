.class public Lnet/youmi/android/a/b/f/j;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final a:Lnet/youmi/android/a/b/f/j;

.field public static final b:Lnet/youmi/android/a/b/f/j;

.field private static final e:[B

.field private static final f:[B

.field private static final g:Ljava/text/DecimalFormat;


# instance fields
.field private c:[B

.field private d:J


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-array v0, v3, [B

    aput-byte v2, v0, v2

    sput-object v0, Lnet/youmi/android/a/b/f/j;->e:[B

    const/16 v0, 0x100

    new-array v0, v0, [B

    sput-object v0, Lnet/youmi/android/a/b/f/j;->f:[B

    new-instance v0, Ljava/text/DecimalFormat;

    invoke-direct {v0}, Ljava/text/DecimalFormat;-><init>()V

    sput-object v0, Lnet/youmi/android/a/b/f/j;->g:Ljava/text/DecimalFormat;

    new-instance v0, Lnet/youmi/android/a/b/f/j;

    invoke-direct {v0}, Lnet/youmi/android/a/b/f/j;-><init>()V

    sput-object v0, Lnet/youmi/android/a/b/f/j;->a:Lnet/youmi/android/a/b/f/j;

    sget-object v0, Lnet/youmi/android/a/b/f/j;->a:Lnet/youmi/android/a/b/f/j;

    sget-object v1, Lnet/youmi/android/a/b/f/j;->e:[B

    invoke-direct {v0, v1, v2, v3}, Lnet/youmi/android/a/b/f/j;->a([BII)V

    new-instance v0, Lnet/youmi/android/a/b/f/j;

    invoke-direct {v0}, Lnet/youmi/android/a/b/f/j;-><init>()V

    sput-object v0, Lnet/youmi/android/a/b/f/j;->b:Lnet/youmi/android/a/b/f/j;

    sget-object v0, Lnet/youmi/android/a/b/f/j;->b:Lnet/youmi/android/a/b/f/j;

    new-array v1, v2, [B

    iput-object v1, v0, Lnet/youmi/android/a/b/f/j;->c:[B

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lnet/youmi/android/a/b/f/j;)V
    .locals 11

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v5, -0x1

    const/4 v4, 0x1

    const/16 v0, 0x40

    new-array v9, v0, [B

    const/4 v3, 0x0

    const/4 v2, 0x0

    const/4 v1, 0x0

    const/4 v7, 0x0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v6

    if-ge v0, v6, :cond_e

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v6

    int-to-byte v8, v6

    if-eqz v3, :cond_9

    const/16 v6, 0x30

    if-lt v8, v6, :cond_7

    const/16 v6, 0x39

    if-gt v8, v6, :cond_7

    const/4 v6, 0x3

    if-ge v2, v6, :cond_7

    add-int/lit8 v2, v2, 0x1

    mul-int/lit8 v1, v1, 0xa

    add-int/lit8 v6, v8, -0x30

    add-int/2addr v1, v6

    const/16 v6, 0xff

    if-le v1, v6, :cond_5

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "bad escape"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const-string v0, "@"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    if-nez p2, :cond_3

    sget-object v0, Lnet/youmi/android/a/b/f/j;->b:Lnet/youmi/android/a/b/f/j;

    invoke-static {v0, p0}, Lnet/youmi/android/a/b/f/j;->b(Lnet/youmi/android/a/b/f/j;Lnet/youmi/android/a/b/f/j;)V

    :cond_2
    :goto_1
    return-void

    :cond_3
    invoke-static {p2, p0}, Lnet/youmi/android/a/b/f/j;->b(Lnet/youmi/android/a/b/f/j;Lnet/youmi/android/a/b/f/j;)V

    goto :goto_1

    :cond_4
    const-string v0, "."

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lnet/youmi/android/a/b/f/j;->a:Lnet/youmi/android/a/b/f/j;

    invoke-static {v0, p0}, Lnet/youmi/android/a/b/f/j;->b(Lnet/youmi/android/a/b/f/j;Lnet/youmi/android/a/b/f/j;)V

    goto :goto_1

    :cond_5
    const/4 v6, 0x3

    if-ge v2, v6, :cond_6

    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_6
    int-to-byte v3, v1

    :goto_3
    const/16 v5, 0x3f

    if-le v4, v5, :cond_8

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "label too long"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    if-lez v2, :cond_13

    const/4 v3, 0x3

    if-ge v2, v3, :cond_13

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "bad escape"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    add-int/lit8 v5, v4, 0x1

    aput-byte v3, v9, v4

    const/4 v3, 0x0

    move v10, v5

    move v5, v4

    move v4, v10

    goto :goto_2

    :cond_9
    const/16 v6, 0x5c

    if-ne v8, v6, :cond_a

    const/4 v3, 0x1

    const/4 v2, 0x0

    const/4 v1, 0x0

    goto :goto_2

    :cond_a
    const/16 v6, 0x2e

    if-ne v8, v6, :cond_c

    const/4 v6, -0x1

    if-ne v5, v6, :cond_b

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid empty label"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    const/4 v5, 0x0

    add-int/lit8 v4, v4, -0x1

    int-to-byte v4, v4

    aput-byte v4, v9, v5

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-direct {p0, p1, v9, v4, v5}, Lnet/youmi/android/a/b/f/j;->a(Ljava/lang/String;[BII)V

    const/4 v5, -0x1

    const/4 v4, 0x1

    goto :goto_2

    :cond_c
    const/4 v6, -0x1

    if-ne v5, v6, :cond_12

    move v6, v0

    :goto_4
    const/16 v5, 0x3f

    if-le v4, v5, :cond_d

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "label too long"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    add-int/lit8 v5, v4, 0x1

    aput-byte v8, v9, v4

    move v4, v5

    move v5, v6

    goto :goto_2

    :cond_e
    if-lez v2, :cond_f

    const/4 v0, 0x3

    if-ge v2, v0, :cond_f

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "bad escape"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    if-eqz v3, :cond_10

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "bad escape"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    const/4 v0, -0x1

    if-ne v5, v0, :cond_11

    sget-object v0, Lnet/youmi/android/a/b/f/j;->e:[B

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {p0, p1, v0, v1, v2}, Lnet/youmi/android/a/b/f/j;->a(Ljava/lang/String;[BII)V

    const/4 v0, 0x1

    :goto_5
    if-eqz p2, :cond_2

    if-nez v0, :cond_2

    iget-object v0, p2, Lnet/youmi/android/a/b/f/j;->c:[B

    const/4 v1, 0x0

    invoke-direct {p2, v1}, Lnet/youmi/android/a/b/f/j;->a(I)I

    move-result v1

    invoke-direct {p2}, Lnet/youmi/android/a/b/f/j;->c()I

    move-result v2

    invoke-direct {p0, p1, v0, v1, v2}, Lnet/youmi/android/a/b/f/j;->a(Ljava/lang/String;[BII)V

    goto/16 :goto_1

    :cond_11
    const/4 v0, 0x0

    add-int/lit8 v1, v4, -0x1

    int-to-byte v1, v1

    aput-byte v1, v9, v0

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, p1, v9, v0, v1}, Lnet/youmi/android/a/b/f/j;->a(Ljava/lang/String;[BII)V

    move v0, v7

    goto :goto_5

    :cond_12
    move v6, v5

    goto :goto_4

    :cond_13
    move v3, v8

    goto/16 :goto_3
.end method

.method public constructor <init>(Lnet/youmi/android/a/b/f/e;)V
    .locals 8

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x40

    new-array v4, v0, [B

    move v0, v2

    move v3, v2

    :goto_0
    if-nez v3, :cond_4

    invoke-virtual {p1}, Lnet/youmi/android/a/b/f/e;->e()I

    move-result v5

    and-int/lit16 v6, v5, 0xc0

    sparse-switch v6, :sswitch_data_0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "bad label type"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_0
    invoke-direct {p0}, Lnet/youmi/android/a/b/f/j;->c()I

    move-result v6

    const/16 v7, 0x80

    if-lt v6, v7, :cond_0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "too many labels"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    if-nez v5, :cond_1

    sget-object v3, Lnet/youmi/android/a/b/f/j;->e:[B

    invoke-direct {p0, v3, v2, v1}, Lnet/youmi/android/a/b/f/j;->b([BII)V

    move v3, v1

    goto :goto_0

    :cond_1
    int-to-byte v6, v5

    aput-byte v6, v4, v2

    invoke-virtual {p1, v4, v1, v5}, Lnet/youmi/android/a/b/f/e;->a([BII)V

    invoke-direct {p0, v4, v2, v1}, Lnet/youmi/android/a/b/f/j;->b([BII)V

    goto :goto_0

    :sswitch_1
    invoke-virtual {p1}, Lnet/youmi/android/a/b/f/e;->e()I

    move-result v6

    and-int/lit16 v5, v5, -0xc1

    shl-int/lit8 v5, v5, 0x8

    add-int/2addr v5, v6

    invoke-virtual {p1}, Lnet/youmi/android/a/b/f/e;->a()I

    move-result v6

    add-int/lit8 v6, v6, -0x2

    if-lt v5, v6, :cond_2

    new-instance v0, Ljava/io/IOException;

    const-string v1, "bad compression"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    if-nez v0, :cond_3

    invoke-virtual {p1}, Lnet/youmi/android/a/b/f/e;->c()V

    move v0, v1

    :cond_3
    invoke-virtual {p1, v5}, Lnet/youmi/android/a/b/f/e;->a(I)V

    goto :goto_0

    :cond_4
    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lnet/youmi/android/a/b/f/e;->d()V

    :cond_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xc0 -> :sswitch_1
    .end sparse-switch
.end method

.method public constructor <init>(Lnet/youmi/android/a/b/f/j;I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lnet/youmi/android/a/b/f/j;->a()I

    move-result v1

    if-le p2, v1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "attempted to remove too many labels"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p1, Lnet/youmi/android/a/b/f/j;->c:[B

    iput-object v0, p0, Lnet/youmi/android/a/b/f/j;->c:[B

    sub-int v0, v1, p2

    invoke-direct {p0, v0}, Lnet/youmi/android/a/b/f/j;->b(I)V

    const/4 v0, 0x0

    :goto_0
    const/4 v2, 0x7

    if-ge v0, v2, :cond_1

    sub-int v2, v1, p2

    if-ge v0, v2, :cond_1

    add-int v2, v0, p2

    invoke-direct {p1, v2}, Lnet/youmi/android/a/b/f/j;->a(I)I

    move-result v2

    invoke-direct {p0, v0, v2}, Lnet/youmi/android/a/b/f/j;->a(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private final a(I)I
    .locals 5

    const/4 v0, 0x6

    if-nez p1, :cond_1

    invoke-direct {p0}, Lnet/youmi/android/a/b/f/j;->c()I

    move-result v1

    if-nez v1, :cond_1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    return v0

    :cond_1
    if-ltz p1, :cond_2

    invoke-direct {p0}, Lnet/youmi/android/a/b/f/j;->c()I

    move-result v1

    if-lt p1, v1, :cond_3

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "label out of range"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    const/4 v1, 0x7

    if-ge p1, v1, :cond_4

    rsub-int/lit8 v0, p1, 0x7

    mul-int/lit8 v0, v0, 0x8

    iget-wide v2, p0, Lnet/youmi/android/a/b/f/j;->d:J

    ushr-long v0, v2, v0

    long-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    goto :goto_0

    :cond_4
    invoke-direct {p0, v0}, Lnet/youmi/android/a/b/f/j;->a(I)I

    move-result v1

    move v4, v0

    move v0, v1

    move v1, v4

    :goto_1
    if-ge v1, p1, :cond_0

    iget-object v2, p0, Lnet/youmi/android/a/b/f/j;->c:[B

    aget-byte v2, v2, v0

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v2, v0

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    move v0, v2

    goto :goto_1
.end method

.method private a([BI)Ljava/lang/String;
    .locals 9

    const/16 v8, 0x5c

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    add-int/lit8 v1, p2, 0x1

    aget-byte v3, p1, p2

    move v0, v1

    :goto_0
    add-int v4, v1, v3

    if-ge v0, v4, :cond_4

    aget-byte v4, p1, v0

    and-int/lit16 v4, v4, 0xff

    const/16 v5, 0x20

    if-le v4, v5, :cond_0

    const/16 v5, 0x7f

    if-lt v4, v5, :cond_1

    :cond_0
    invoke-virtual {v2, v8}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    sget-object v5, Lnet/youmi/android/a/b/f/j;->g:Ljava/text/DecimalFormat;

    int-to-long v6, v4

    invoke-virtual {v5, v6, v7}, Ljava/text/DecimalFormat;->format(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/16 v5, 0x22

    if-eq v4, v5, :cond_2

    const/16 v5, 0x28

    if-eq v4, v5, :cond_2

    const/16 v5, 0x29

    if-eq v4, v5, :cond_2

    const/16 v5, 0x2e

    if-eq v4, v5, :cond_2

    const/16 v5, 0x3b

    if-eq v4, v5, :cond_2

    if-eq v4, v8, :cond_2

    const/16 v5, 0x40

    if-eq v4, v5, :cond_2

    const/16 v5, 0x24

    if-ne v4, v5, :cond_3

    :cond_2
    invoke-virtual {v2, v8}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    int-to-char v4, v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_1

    :cond_3
    int-to-char v4, v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_1

    :cond_4
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Lnet/youmi/android/a/b/f/j;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lnet/youmi/android/a/b/f/j;->a(Ljava/lang/String;Lnet/youmi/android/a/b/f/j;)Lnet/youmi/android/a/b/f/j;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;Lnet/youmi/android/a/b/f/j;)Lnet/youmi/android/a/b/f/j;
    .locals 1

    const-string v0, "@"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    :goto_0
    return-object p1

    :cond_0
    const-string v0, "."

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lnet/youmi/android/a/b/f/j;->a:Lnet/youmi/android/a/b/f/j;

    goto :goto_0

    :cond_1
    new-instance v0, Lnet/youmi/android/a/b/f/j;

    invoke-direct {v0, p0, p1}, Lnet/youmi/android/a/b/f/j;-><init>(Ljava/lang/String;Lnet/youmi/android/a/b/f/j;)V

    move-object p1, v0

    goto :goto_0
.end method

.method public static a(Lnet/youmi/android/a/b/f/j;Lnet/youmi/android/a/b/f/j;)Lnet/youmi/android/a/b/f/j;
    .locals 4

    invoke-virtual {p0}, Lnet/youmi/android/a/b/f/j;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-object p0

    :cond_0
    new-instance v0, Lnet/youmi/android/a/b/f/j;

    invoke-direct {v0}, Lnet/youmi/android/a/b/f/j;-><init>()V

    invoke-static {p0, v0}, Lnet/youmi/android/a/b/f/j;->b(Lnet/youmi/android/a/b/f/j;Lnet/youmi/android/a/b/f/j;)V

    iget-object v1, p1, Lnet/youmi/android/a/b/f/j;->c:[B

    const/4 v2, 0x0

    invoke-direct {p1, v2}, Lnet/youmi/android/a/b/f/j;->a(I)I

    move-result v2

    invoke-direct {p1}, Lnet/youmi/android/a/b/f/j;->c()I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lnet/youmi/android/a/b/f/j;->b([BII)V

    move-object p0, v0

    goto :goto_0
.end method

.method private final a(II)V
    .locals 8

    const/4 v0, 0x7

    if-lt p1, v0, :cond_0

    :goto_0
    return-void

    :cond_0
    rsub-int/lit8 v0, p1, 0x7

    mul-int/lit8 v0, v0, 0x8

    iget-wide v2, p0, Lnet/youmi/android/a/b/f/j;->d:J

    const-wide/16 v4, 0xff

    shl-long/2addr v4, v0

    const-wide/16 v6, -0x1

    xor-long/2addr v4, v6

    and-long/2addr v2, v4

    iput-wide v2, p0, Lnet/youmi/android/a/b/f/j;->d:J

    iget-wide v2, p0, Lnet/youmi/android/a/b/f/j;->d:J

    int-to-long v4, p2

    shl-long v0, v4, v0

    or-long/2addr v0, v2

    iput-wide v0, p0, Lnet/youmi/android/a/b/f/j;->d:J

    goto :goto_0
.end method

.method private final a(Ljava/lang/String;[BII)V
    .locals 1

    :try_start_0
    invoke-direct {p0, p2, p3, p4}, Lnet/youmi/android/a/b/f/j;->b([BII)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private final a([BII)V
    .locals 1

    :try_start_0
    invoke-direct {p0, p1, p2, p3}, Lnet/youmi/android/a/b/f/j;->b([BII)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private final b(I)V
    .locals 4

    iget-wide v0, p0, Lnet/youmi/android/a/b/f/j;->d:J

    const-wide/16 v2, -0x100

    and-long/2addr v0, v2

    iput-wide v0, p0, Lnet/youmi/android/a/b/f/j;->d:J

    iget-wide v0, p0, Lnet/youmi/android/a/b/f/j;->d:J

    int-to-long v2, p1

    or-long/2addr v0, v2

    iput-wide v0, p0, Lnet/youmi/android/a/b/f/j;->d:J

    return-void
.end method

.method private static final b(Lnet/youmi/android/a/b/f/j;Lnet/youmi/android/a/b/f/j;)V
    .locals 6

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lnet/youmi/android/a/b/f/j;->a(I)I

    move-result v1

    if-nez v1, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/b/f/j;->c:[B

    iput-object v0, p1, Lnet/youmi/android/a/b/f/j;->c:[B

    iget-wide v0, p0, Lnet/youmi/android/a/b/f/j;->d:J

    iput-wide v0, p1, Lnet/youmi/android/a/b/f/j;->d:J

    :goto_0
    return-void

    :cond_0
    invoke-direct {p0, v0}, Lnet/youmi/android/a/b/f/j;->a(I)I

    move-result v1

    iget-object v2, p0, Lnet/youmi/android/a/b/f/j;->c:[B

    array-length v2, v2

    sub-int/2addr v2, v1

    invoke-virtual {p0}, Lnet/youmi/android/a/b/f/j;->a()I

    move-result v3

    new-array v4, v2, [B

    iput-object v4, p1, Lnet/youmi/android/a/b/f/j;->c:[B

    iget-object v4, p0, Lnet/youmi/android/a/b/f/j;->c:[B

    iget-object v5, p1, Lnet/youmi/android/a/b/f/j;->c:[B

    invoke-static {v4, v1, v5, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_1
    if-ge v0, v3, :cond_1

    const/4 v2, 0x7

    if-ge v0, v2, :cond_1

    invoke-direct {p0, v0}, Lnet/youmi/android/a/b/f/j;->a(I)I

    move-result v2

    sub-int/2addr v2, v1

    invoke-direct {p1, v0, v2}, Lnet/youmi/android/a/b/f/j;->a(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    invoke-direct {p1, v3}, Lnet/youmi/android/a/b/f/j;->b(I)V

    goto :goto_0
.end method

.method private final b([BII)V
    .locals 8

    const/4 v1, 0x0

    iget-object v0, p0, Lnet/youmi/android/a/b/f/j;->c:[B

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    move v2, p2

    move v3, v1

    move v4, v1

    :goto_1
    if-ge v3, p3, :cond_2

    aget-byte v5, p1, v2

    const/16 v6, 0x3f

    if-le v5, v6, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "invalid label"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/b/f/j;->c:[B

    array-length v0, v0

    invoke-direct {p0, v1}, Lnet/youmi/android/a/b/f/j;->a(I)I

    move-result v2

    sub-int/2addr v0, v2

    goto :goto_0

    :cond_1
    add-int/lit8 v5, v5, 0x1

    add-int/2addr v2, v5

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    add-int v2, v0, v4

    const/16 v3, 0xff

    if-le v2, v3, :cond_3

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "name too long"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-direct {p0}, Lnet/youmi/android/a/b/f/j;->c()I

    move-result v3

    add-int v5, v3, p3

    const/16 v6, 0x80

    if-le v5, v6, :cond_4

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "too many labels"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-array v2, v2, [B

    if-eqz v0, :cond_5

    iget-object v6, p0, Lnet/youmi/android/a/b/f/j;->c:[B

    invoke-direct {p0, v1}, Lnet/youmi/android/a/b/f/j;->a(I)I

    move-result v7

    invoke-static {v6, v7, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_5
    invoke-static {p1, p2, v2, v0, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v2, p0, Lnet/youmi/android/a/b/f/j;->c:[B

    :goto_2
    if-ge v1, p3, :cond_6

    add-int v4, v3, v1

    invoke-direct {p0, v4, v0}, Lnet/youmi/android/a/b/f/j;->a(II)V

    aget-byte v4, v2, v0

    add-int/lit8 v4, v4, 0x1

    add-int/2addr v0, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_6
    invoke-direct {p0, v5}, Lnet/youmi/android/a/b/f/j;->b(I)V

    return-void
.end method

.method private final c()I
    .locals 4

    iget-wide v0, p0, Lnet/youmi/android/a/b/f/j;->d:J

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method


# virtual methods
.method public a()I
    .locals 1

    invoke-direct {p0}, Lnet/youmi/android/a/b/f/j;->c()I

    move-result v0

    return v0
.end method

.method public a(Z)Ljava/lang/String;
    .locals 7

    const/16 v6, 0x2e

    const/4 v1, 0x0

    invoke-virtual {p0}, Lnet/youmi/android/a/b/f/j;->a()I

    move-result v2

    if-nez v2, :cond_0

    const-string v0, "@"

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x1

    if-ne v2, v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/a/b/f/j;->c:[B

    invoke-direct {p0, v1}, Lnet/youmi/android/a/b/f/j;->a(I)I

    move-result v3

    aget-byte v0, v0, v3

    if-nez v0, :cond_1

    const-string v0, "."

    goto :goto_0

    :cond_1
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    invoke-direct {p0, v1}, Lnet/youmi/android/a/b/f/j;->a(I)I

    move-result v0

    :goto_1
    if-ge v1, v2, :cond_3

    iget-object v4, p0, Lnet/youmi/android/a/b/f/j;->c:[B

    aget-byte v4, v4, v0

    const/16 v5, 0x3f

    if-le v4, v5, :cond_2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "invalid label"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    if-nez v4, :cond_4

    if-nez p1, :cond_3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    :cond_3
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_4
    if-lez v1, :cond_5

    invoke-virtual {v3, v6}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    :cond_5
    iget-object v5, p0, Lnet/youmi/android/a/b/f/j;->c:[B

    invoke-direct {p0, v5, v0}, Lnet/youmi/android/a/b/f/j;->a([BI)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v4, v4, 0x1

    add-int/2addr v0, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_1
.end method

.method public a(Lnet/youmi/android/a/b/f/f;Lnet/youmi/android/a/b/f/b;)V
    .locals 6

    const/4 v3, 0x0

    invoke-virtual {p0}, Lnet/youmi/android/a/b/f/j;->a()I

    move-result v4

    move v2, v3

    :goto_0
    add-int/lit8 v0, v4, -0x1

    if-ge v2, v0, :cond_4

    if-nez v2, :cond_1

    move-object v1, p0

    :goto_1
    const/4 v0, -0x1

    if-eqz p2, :cond_0

    invoke-virtual {p2, v1}, Lnet/youmi/android/a/b/f/b;->a(Lnet/youmi/android/a/b/f/j;)I

    move-result v0

    :cond_0
    if-ltz v0, :cond_2

    const v1, 0xc000

    or-int/2addr v0, v1

    invoke-virtual {p1, v0}, Lnet/youmi/android/a/b/f/f;->b(I)V

    :goto_2
    return-void

    :cond_1
    new-instance v0, Lnet/youmi/android/a/b/f/j;

    invoke-direct {v0, p0, v2}, Lnet/youmi/android/a/b/f/j;-><init>(Lnet/youmi/android/a/b/f/j;I)V

    move-object v1, v0

    goto :goto_1

    :cond_2
    if-eqz p2, :cond_3

    invoke-virtual {p1}, Lnet/youmi/android/a/b/f/f;->a()I

    move-result v0

    invoke-virtual {p2, v0, v1}, Lnet/youmi/android/a/b/f/b;->a(ILnet/youmi/android/a/b/f/j;)V

    :cond_3
    invoke-direct {p0, v2}, Lnet/youmi/android/a/b/f/j;->a(I)I

    move-result v0

    iget-object v1, p0, Lnet/youmi/android/a/b/f/j;->c:[B

    iget-object v5, p0, Lnet/youmi/android/a/b/f/j;->c:[B

    aget-byte v5, v5, v0

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {p1, v1, v0, v5}, Lnet/youmi/android/a/b/f/f;->a([BII)V

    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :cond_4
    invoke-virtual {p1, v3}, Lnet/youmi/android/a/b/f/f;->a(I)V

    goto :goto_2
.end method

.method public b()Z
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0}, Lnet/youmi/android/a/b/f/j;->a()I

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v2, p0, Lnet/youmi/android/a/b/f/j;->c:[B

    add-int/lit8 v1, v1, -0x1

    invoke-direct {p0, v1}, Lnet/youmi/android/a/b/f/j;->a(I)I

    move-result v1

    aget-byte v1, v2, v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/b/f/j;->a(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
