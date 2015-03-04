.class public Lnet/youmi/android/onlineconfig/ntp/b;
.super Ljava/lang/Object;


# instance fields
.field public a:B

.field public b:B

.field public c:B

.field public d:S

.field public e:B

.field public f:B

.field public g:D

.field public h:D

.field public i:[B

.field public j:D

.field public k:D

.field public l:D

.field public m:D


# direct methods
.method public constructor <init>()V
    .locals 4

    const/4 v1, 0x3

    const/4 v0, 0x0

    const-wide/16 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-byte v0, p0, Lnet/youmi/android/onlineconfig/ntp/b;->a:B

    iput-byte v1, p0, Lnet/youmi/android/onlineconfig/ntp/b;->b:B

    iput-byte v0, p0, Lnet/youmi/android/onlineconfig/ntp/b;->c:B

    iput-short v0, p0, Lnet/youmi/android/onlineconfig/ntp/b;->d:S

    iput-byte v0, p0, Lnet/youmi/android/onlineconfig/ntp/b;->e:B

    iput-byte v0, p0, Lnet/youmi/android/onlineconfig/ntp/b;->f:B

    iput-wide v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->g:D

    iput-wide v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->h:D

    const/4 v0, 0x4

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    iput-object v0, p0, Lnet/youmi/android/onlineconfig/ntp/b;->i:[B

    iput-wide v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->j:D

    iput-wide v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->k:D

    iput-wide v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->l:D

    iput-wide v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->m:D

    iput-byte v1, p0, Lnet/youmi/android/onlineconfig/ntp/b;->c:B

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    long-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    const-wide v2, 0x41e0754fd0000000L    # 2.2089888E9

    add-double/2addr v0, v2

    iput-wide v0, p0, Lnet/youmi/android/onlineconfig/ntp/b;->m:D

    return-void

    nop

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>([B)V
    .locals 10

    const-wide/high16 v8, 0x40f0000000000000L    # 65536.0

    const/4 v5, 0x3

    const-wide/high16 v6, 0x4070000000000000L    # 256.0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-byte v4, p0, Lnet/youmi/android/onlineconfig/ntp/b;->a:B

    iput-byte v5, p0, Lnet/youmi/android/onlineconfig/ntp/b;->b:B

    iput-byte v4, p0, Lnet/youmi/android/onlineconfig/ntp/b;->c:B

    iput-short v4, p0, Lnet/youmi/android/onlineconfig/ntp/b;->d:S

    iput-byte v4, p0, Lnet/youmi/android/onlineconfig/ntp/b;->e:B

    iput-byte v4, p0, Lnet/youmi/android/onlineconfig/ntp/b;->f:B

    iput-wide v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->g:D

    iput-wide v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->h:D

    const/4 v0, 0x4

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    iput-object v0, p0, Lnet/youmi/android/onlineconfig/ntp/b;->i:[B

    iput-wide v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->j:D

    iput-wide v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->k:D

    iput-wide v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->l:D

    iput-wide v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->m:D

    aget-byte v0, p1, v4

    shr-int/lit8 v0, v0, 0x6

    and-int/lit8 v0, v0, 0x3

    int-to-byte v0, v0

    iput-byte v0, p0, Lnet/youmi/android/onlineconfig/ntp/b;->a:B

    aget-byte v0, p1, v4

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0x7

    int-to-byte v0, v0

    iput-byte v0, p0, Lnet/youmi/android/onlineconfig/ntp/b;->b:B

    aget-byte v0, p1, v4

    and-int/lit8 v0, v0, 0x7

    int-to-byte v0, v0

    iput-byte v0, p0, Lnet/youmi/android/onlineconfig/ntp/b;->c:B

    const/4 v0, 0x1

    aget-byte v0, p1, v0

    invoke-static {v0}, Lnet/youmi/android/onlineconfig/ntp/b;->a(B)S

    move-result v0

    iput-short v0, p0, Lnet/youmi/android/onlineconfig/ntp/b;->d:S

    const/4 v0, 0x2

    aget-byte v0, p1, v0

    iput-byte v0, p0, Lnet/youmi/android/onlineconfig/ntp/b;->e:B

    aget-byte v0, p1, v5

    iput-byte v0, p0, Lnet/youmi/android/onlineconfig/ntp/b;->f:B

    const/4 v0, 0x4

    aget-byte v0, p1, v0

    int-to-double v0, v0

    mul-double/2addr v0, v6

    const/4 v2, 0x5

    aget-byte v2, p1, v2

    invoke-static {v2}, Lnet/youmi/android/onlineconfig/ntp/b;->a(B)S

    move-result v2

    int-to-double v2, v2

    add-double/2addr v0, v2

    const/4 v2, 0x6

    aget-byte v2, p1, v2

    invoke-static {v2}, Lnet/youmi/android/onlineconfig/ntp/b;->a(B)S

    move-result v2

    int-to-double v2, v2

    div-double/2addr v2, v6

    add-double/2addr v0, v2

    const/4 v2, 0x7

    aget-byte v2, p1, v2

    invoke-static {v2}, Lnet/youmi/android/onlineconfig/ntp/b;->a(B)S

    move-result v2

    int-to-double v2, v2

    div-double/2addr v2, v8

    add-double/2addr v0, v2

    iput-wide v0, p0, Lnet/youmi/android/onlineconfig/ntp/b;->g:D

    const/16 v0, 0x8

    aget-byte v0, p1, v0

    invoke-static {v0}, Lnet/youmi/android/onlineconfig/ntp/b;->a(B)S

    move-result v0

    int-to-double v0, v0

    mul-double/2addr v0, v6

    const/16 v2, 0x9

    aget-byte v2, p1, v2

    invoke-static {v2}, Lnet/youmi/android/onlineconfig/ntp/b;->a(B)S

    move-result v2

    int-to-double v2, v2

    add-double/2addr v0, v2

    const/16 v2, 0xa

    aget-byte v2, p1, v2

    invoke-static {v2}, Lnet/youmi/android/onlineconfig/ntp/b;->a(B)S

    move-result v2

    int-to-double v2, v2

    div-double/2addr v2, v6

    add-double/2addr v0, v2

    const/16 v2, 0xb

    aget-byte v2, p1, v2

    invoke-static {v2}, Lnet/youmi/android/onlineconfig/ntp/b;->a(B)S

    move-result v2

    int-to-double v2, v2

    div-double/2addr v2, v8

    add-double/2addr v0, v2

    iput-wide v0, p0, Lnet/youmi/android/onlineconfig/ntp/b;->h:D

    iget-object v0, p0, Lnet/youmi/android/onlineconfig/ntp/b;->i:[B

    const/16 v1, 0xc

    aget-byte v1, p1, v1

    aput-byte v1, v0, v4

    iget-object v0, p0, Lnet/youmi/android/onlineconfig/ntp/b;->i:[B

    const/4 v1, 0x1

    const/16 v2, 0xd

    aget-byte v2, p1, v2

    aput-byte v2, v0, v1

    iget-object v0, p0, Lnet/youmi/android/onlineconfig/ntp/b;->i:[B

    const/4 v1, 0x2

    const/16 v2, 0xe

    aget-byte v2, p1, v2

    aput-byte v2, v0, v1

    iget-object v0, p0, Lnet/youmi/android/onlineconfig/ntp/b;->i:[B

    const/16 v1, 0xf

    aget-byte v1, p1, v1

    aput-byte v1, v0, v5

    const/16 v0, 0x10

    invoke-static {p1, v0}, Lnet/youmi/android/onlineconfig/ntp/b;->a([BI)D

    move-result-wide v0

    iput-wide v0, p0, Lnet/youmi/android/onlineconfig/ntp/b;->j:D

    const/16 v0, 0x18

    invoke-static {p1, v0}, Lnet/youmi/android/onlineconfig/ntp/b;->a([BI)D

    move-result-wide v0

    iput-wide v0, p0, Lnet/youmi/android/onlineconfig/ntp/b;->k:D

    const/16 v0, 0x20

    invoke-static {p1, v0}, Lnet/youmi/android/onlineconfig/ntp/b;->a([BI)D

    move-result-wide v0

    iput-wide v0, p0, Lnet/youmi/android/onlineconfig/ntp/b;->l:D

    const/16 v0, 0x28

    invoke-static {p1, v0}, Lnet/youmi/android/onlineconfig/ntp/b;->a([BI)D

    move-result-wide v0

    iput-wide v0, p0, Lnet/youmi/android/onlineconfig/ntp/b;->m:D

    return-void

    nop

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public static a([BI)D
    .locals 10

    const-wide/16 v2, 0x0

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x8

    if-ge v0, v1, :cond_0

    add-int v1, p1, v0

    aget-byte v1, p0, v1

    invoke-static {v1}, Lnet/youmi/android/onlineconfig/ntp/b;->a(B)S

    move-result v1

    int-to-double v4, v1

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    rsub-int/lit8 v1, v0, 0x3

    mul-int/lit8 v1, v1, 0x8

    int-to-double v8, v1

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v6

    mul-double/2addr v4, v6

    add-double/2addr v2, v4

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-wide v2
.end method

.method public static a(D)Ljava/lang/String;
    .locals 6

    const-wide/16 v0, 0x0

    cmpl-double v0, p0, v0

    if-nez v0, :cond_0

    const-string v0, "0"

    :goto_0
    return-object v0

    :cond_0
    const-wide v0, 0x41e0754fd0000000L    # 2.2089888E9

    sub-double v0, p0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    mul-double/2addr v0, v2

    double-to-long v0, v0

    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v3, "dd-MMM-yyyy HH:mm:ss"

    invoke-direct {v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3, v0, v1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    double-to-long v2, p0

    long-to-double v2, v2

    sub-double v2, p0, v2

    new-instance v1, Ljava/text/DecimalFormat;

    const-string v4, ".000000"

    invoke-direct {v1, v4}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2, v3}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static a([BSB)Ljava/lang/String;
    .locals 10

    const/4 v9, 0x2

    const/4 v2, 0x0

    const/4 v8, 0x3

    const/4 v6, 0x1

    if-eqz p1, :cond_0

    if-ne p1, v6, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p0}, Ljava/lang/String;-><init>([B)V

    :goto_0
    return-object v0

    :cond_1
    if-ne p2, v8, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    aget-byte v1, p0, v2

    invoke-static {v1}, Lnet/youmi/android/onlineconfig/ntp/b;->a(B)S

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    aget-byte v1, p0, v6

    invoke-static {v1}, Lnet/youmi/android/onlineconfig/ntp/b;->a(B)S

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    aget-byte v1, p0, v9

    invoke-static {v1}, Lnet/youmi/android/onlineconfig/ntp/b;->a(B)S

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    aget-byte v1, p0, v8

    invoke-static {v1}, Lnet/youmi/android/onlineconfig/ntp/b;->a(B)S

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x4

    if-ne p2, v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    aget-byte v1, p0, v2

    invoke-static {v1}, Lnet/youmi/android/onlineconfig/ntp/b;->a(B)S

    move-result v1

    int-to-double v2, v1

    const-wide/high16 v4, 0x4070000000000000L    # 256.0

    div-double/2addr v2, v4

    aget-byte v1, p0, v6

    invoke-static {v1}, Lnet/youmi/android/onlineconfig/ntp/b;->a(B)S

    move-result v1

    int-to-double v4, v1

    const-wide/high16 v6, 0x40f0000000000000L    # 65536.0

    div-double/2addr v4, v6

    add-double/2addr v2, v4

    aget-byte v1, p0, v9

    invoke-static {v1}, Lnet/youmi/android/onlineconfig/ntp/b;->a(B)S

    move-result v1

    int-to-double v4, v1

    const-wide/high16 v6, 0x4170000000000000L    # 1.6777216E7

    div-double/2addr v4, v6

    add-double/2addr v2, v4

    aget-byte v1, p0, v8

    invoke-static {v1}, Lnet/youmi/android/onlineconfig/ntp/b;->a(B)S

    move-result v1

    int-to-double v4, v1

    const-wide/high16 v6, 0x41f0000000000000L    # 4.294967296E9

    div-double/2addr v4, v6

    add-double/2addr v2, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_3
    const-string v0, ""

    goto/16 :goto_0
.end method

.method public static a(B)S
    .locals 2

    and-int/lit16 v0, p0, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_0

    and-int/lit8 v0, p0, 0x7f

    add-int/lit16 v0, v0, 0x80

    int-to-short v0, v0

    :goto_0
    return v0

    :cond_0
    int-to-short v0, p0

    goto :goto_0
.end method

.method public static a([BID)V
    .locals 6

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x8

    if-ge v0, v1, :cond_0

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    rsub-int/lit8 v1, v0, 0x3

    mul-int/lit8 v1, v1, 0x8

    int-to-double v4, v1

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    add-int v1, p1, v0

    div-double v4, p2, v2

    double-to-int v4, v4

    int-to-byte v4, v4

    aput-byte v4, p0, v1

    add-int v1, p1, v0

    aget-byte v1, p0, v1

    invoke-static {v1}, Lnet/youmi/android/onlineconfig/ntp/b;->a(B)S

    move-result v1

    int-to-double v4, v1

    mul-double/2addr v2, v4

    sub-double/2addr p2, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x7

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v2

    const-wide v4, 0x406fe00000000000L    # 255.0

    mul-double/2addr v2, v4

    double-to-int v1, v2

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    return-void
.end method


# virtual methods
.method public a()[B
    .locals 11

    const/4 v10, 0x2

    const/4 v9, 0x1

    const/4 v8, 0x0

    const-wide/high16 v4, 0x40f0000000000000L    # 65536.0

    const-wide/16 v6, 0xff

    const/16 v0, 0x30

    new-array v0, v0, [B

    iget-byte v1, p0, Lnet/youmi/android/onlineconfig/ntp/b;->a:B

    shl-int/lit8 v1, v1, 0x6

    iget-byte v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->b:B

    shl-int/lit8 v2, v2, 0x3

    or-int/2addr v1, v2

    iget-byte v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->c:B

    or-int/2addr v1, v2

    int-to-byte v1, v1

    aput-byte v1, v0, v8

    iget-short v1, p0, Lnet/youmi/android/onlineconfig/ntp/b;->d:S

    int-to-byte v1, v1

    aput-byte v1, v0, v9

    iget-byte v1, p0, Lnet/youmi/android/onlineconfig/ntp/b;->e:B

    aput-byte v1, v0, v10

    const/4 v1, 0x3

    iget-byte v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->f:B

    aput-byte v2, v0, v1

    iget-wide v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->g:D

    mul-double/2addr v2, v4

    double-to-int v1, v2

    const/4 v2, 0x4

    shr-int/lit8 v3, v1, 0x18

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v2

    const/4 v2, 0x5

    shr-int/lit8 v3, v1, 0x10

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v2

    const/4 v2, 0x6

    shr-int/lit8 v3, v1, 0x8

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v2

    const/4 v2, 0x7

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, v0, v2

    iget-wide v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->h:D

    mul-double/2addr v2, v4

    double-to-long v2, v2

    const/16 v1, 0x8

    const/16 v4, 0x18

    shr-long v4, v2, v4

    and-long/2addr v4, v6

    long-to-int v4, v4

    int-to-byte v4, v4

    aput-byte v4, v0, v1

    const/16 v1, 0x9

    const/16 v4, 0x10

    shr-long v4, v2, v4

    and-long/2addr v4, v6

    long-to-int v4, v4

    int-to-byte v4, v4

    aput-byte v4, v0, v1

    const/16 v1, 0xa

    const/16 v4, 0x8

    shr-long v4, v2, v4

    and-long/2addr v4, v6

    long-to-int v4, v4

    int-to-byte v4, v4

    aput-byte v4, v0, v1

    const/16 v1, 0xb

    and-long/2addr v2, v6

    long-to-int v2, v2

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    const/16 v1, 0xc

    iget-object v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->i:[B

    aget-byte v2, v2, v8

    aput-byte v2, v0, v1

    const/16 v1, 0xd

    iget-object v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->i:[B

    aget-byte v2, v2, v9

    aput-byte v2, v0, v1

    const/16 v1, 0xe

    iget-object v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->i:[B

    aget-byte v2, v2, v10

    aput-byte v2, v0, v1

    const/16 v1, 0xf

    iget-object v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->i:[B

    const/4 v3, 0x3

    aget-byte v2, v2, v3

    aput-byte v2, v0, v1

    const/16 v1, 0x10

    iget-wide v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->j:D

    invoke-static {v0, v1, v2, v3}, Lnet/youmi/android/onlineconfig/ntp/b;->a([BID)V

    const/16 v1, 0x18

    iget-wide v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->k:D

    invoke-static {v0, v1, v2, v3}, Lnet/youmi/android/onlineconfig/ntp/b;->a([BID)V

    const/16 v1, 0x20

    iget-wide v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->l:D

    invoke-static {v0, v1, v2, v3}, Lnet/youmi/android/onlineconfig/ntp/b;->a([BID)V

    const/16 v1, 0x28

    iget-wide v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->m:D

    invoke-static {v0, v1, v2, v3}, Lnet/youmi/android/onlineconfig/ntp/b;->a([BID)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    const-wide v6, 0x408f400000000000L    # 1000.0

    new-instance v0, Ljava/text/DecimalFormat;

    const-string v1, "0.#E0"

    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    iget-byte v1, p0, Lnet/youmi/android/onlineconfig/ntp/b;->f:B

    int-to-double v4, v1

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Leap indicator: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-byte v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->a:B

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\nVersion: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-byte v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->b:B

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\nMode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-byte v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->c:B

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\nStratum: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-short v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->d:S

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\nPoll: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-byte v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->e:B

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\nPrecision: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-byte v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->f:B

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " seconds)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nRoot delay: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/text/DecimalFormat;

    const-string v2, "0.00"

    invoke-direct {v1, v2}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->g:D

    mul-double/2addr v2, v6

    invoke-virtual {v1, v2, v3}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ms "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nRoot dispersion: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/text/DecimalFormat;

    const-string v2, "0.00"

    invoke-direct {v1, v2}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->h:D

    mul-double/2addr v2, v6

    invoke-virtual {v1, v2, v3}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ms "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nReference identifier: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/onlineconfig/ntp/b;->i:[B

    iget-short v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->d:S

    iget-byte v3, p0, Lnet/youmi/android/onlineconfig/ntp/b;->b:B

    invoke-static {v1, v2, v3}, Lnet/youmi/android/onlineconfig/ntp/b;->a([BSB)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\u53c2\u8003\u65f6\u95f4\u6233:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->j:D

    invoke-static {v2, v3}, Lnet/youmi/android/onlineconfig/ntp/b;->a(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\u672c\u5730\u65f6\u95f4\u6233:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->k:D

    invoke-static {v2, v3}, Lnet/youmi/android/onlineconfig/ntp/b;->a(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\u63a5\u6536\u65f6\u95f4\u6233:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->l:D

    invoke-static {v2, v3}, Lnet/youmi/android/onlineconfig/ntp/b;->a(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\u4f20\u8f93\u65f6\u95f4\u6233:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lnet/youmi/android/onlineconfig/ntp/b;->m:D

    invoke-static {v2, v3}, Lnet/youmi/android/onlineconfig/ntp/b;->a(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
