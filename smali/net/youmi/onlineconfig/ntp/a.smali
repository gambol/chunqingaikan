.class public Lnet/youmi/android/onlineconfig/ntp/a;
.super Ljava/lang/Object;


# static fields
.field private static final a:[Ljava/lang/String;


# instance fields
.field private b:I

.field private c:I

.field private d:I

.field private e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x11

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "133.100.11.8"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "130.149.17.21"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "time.asia.apple.com"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "ntp.nasa.gov"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "ntp-sop.inria.frserver"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "203.117.180.36"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "133.100.9.2"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "210.72.145.44"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "210.72.145.44"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "131.107.1.10"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "64.236.96.53"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v2, "66.92.68.246"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string v2, "18.145.0.30"

    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-string v2, "137.92.140.80"

    aput-object v2, v0, v1

    const/16 v1, 0xe

    const-string v2, "128.118.46.3"

    aput-object v2, v0, v1

    const/16 v1, 0xf

    const-string v2, "129.7.1.66"

    aput-object v2, v0, v1

    const/16 v1, 0x10

    const-string v2, "131.107.1.10"

    aput-object v2, v0, v1

    sput-object v0, Lnet/youmi/android/onlineconfig/ntp/a;->a:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(III)V
    .locals 2

    const/4 v1, 0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x7d0

    if-gt p1, v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "out of range! Year should be [2000, \u221e)"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    if-lt p2, v1, :cond_1

    const/16 v0, 0xc

    if-le p2, v0, :cond_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "out of range! Month should be [1, 12]"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    if-lt p3, v1, :cond_3

    const/16 v0, 0x1f

    if-le p3, v0, :cond_4

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "out of range! Day should be [1, 31]"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    iput p1, p0, Lnet/youmi/android/onlineconfig/ntp/a;->b:I

    iput p2, p0, Lnet/youmi/android/onlineconfig/ntp/a;->c:I

    iput p3, p0, Lnet/youmi/android/onlineconfig/ntp/a;->d:I

    invoke-direct {p0}, Lnet/youmi/android/onlineconfig/ntp/a;->b()V

    return-void
.end method

.method public static a(D)Ljava/lang/String;
    .locals 4

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

    const-string v3, "yyyy-MM-dd"

    invoke-direct {v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3, v0, v1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private b()V
    .locals 4

    new-instance v0, Landroid/text/format/Time;

    const-string v1, "GMT+8"

    invoke-direct {v0, v1}, Landroid/text/format/Time;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lnet/youmi/android/onlineconfig/ntp/a;->d:I

    iget v2, p0, Lnet/youmi/android/onlineconfig/ntp/a;->c:I

    add-int/lit8 v2, v2, -0x1

    iget v3, p0, Lnet/youmi/android/onlineconfig/ntp/a;->b:I

    invoke-virtual {v0, v1, v2, v3}, Landroid/text/format/Time;->set(III)V

    const-string v1, "%Y-%m-%d"

    invoke-virtual {v0, v1}, Landroid/text/format/Time;->format(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/onlineconfig/ntp/a;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 10

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v3, 0x0

    :try_start_0
    new-instance v2, Ljava/net/DatagramSocket;

    invoke-direct {v2}, Ljava/net/DatagramSocket;-><init>()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v3, 0xbb8

    :try_start_1
    invoke-virtual {v2, v3}, Ljava/net/DatagramSocket;->setSoTimeout(I)V

    move v5, v1

    :goto_0
    sget-object v3, Lnet/youmi/android/onlineconfig/ntp/a;->a:[Ljava/lang/String;

    array-length v3, v3
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ge v5, v3, :cond_f

    move v4, v1

    :goto_1
    const/4 v3, 0x2

    if-ge v4, v3, :cond_e

    :try_start_2
    new-instance v3, Lnet/youmi/android/onlineconfig/ntp/b;

    invoke-direct {v3}, Lnet/youmi/android/onlineconfig/ntp/b;-><init>()V

    invoke-virtual {v3}, Lnet/youmi/android/onlineconfig/ntp/b;->a()[B

    move-result-object v3

    new-instance v6, Ljava/net/DatagramPacket;

    array-length v7, v3

    sget-object v8, Lnet/youmi/android/onlineconfig/ntp/a;->a:[Ljava/lang/String;

    aget-object v8, v8, v5

    invoke-static {v8}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v8

    const/16 v9, 0x7b

    invoke-direct {v6, v3, v7, v8, v9}, Ljava/net/DatagramPacket;-><init>([BILjava/net/InetAddress;I)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-virtual {v2, v6}, Ljava/net/DatagramSocket;->send(Ljava/net/DatagramPacket;)V

    new-instance v6, Ljava/net/DatagramPacket;

    array-length v7, v3

    invoke-direct {v6, v3, v7}, Ljava/net/DatagramPacket;-><init>([BI)V

    invoke-virtual {v2, v6}, Ljava/net/DatagramSocket;->receive(Ljava/net/DatagramPacket;)V

    new-instance v3, Lnet/youmi/android/onlineconfig/ntp/b;

    invoke-virtual {v6}, Ljava/net/DatagramPacket;->getData()[B

    move-result-object v6

    invoke-direct {v3, v6}, Lnet/youmi/android/onlineconfig/ntp/b;-><init>([B)V

    iget-wide v6, v3, Lnet/youmi/android/onlineconfig/ntp/b;->j:D

    const-wide/16 v8, 0x0

    cmpl-double v6, v6, v8

    if-lez v6, :cond_d

    iget-wide v6, v3, Lnet/youmi/android/onlineconfig/ntp/b;->j:D

    invoke-static {v6, v7}, Lnet/youmi/android/onlineconfig/ntp/a;->a(D)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_0

    iget-object v6, p0, Lnet/youmi/android/onlineconfig/ntp/a;->e:Ljava/lang/String;

    invoke-static {v6}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-result v6

    if-eqz v6, :cond_3

    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/net/DatagramSocket;->close()V

    :cond_1
    move v0, v1

    :cond_2
    :goto_2
    return v0

    :cond_3
    :try_start_3
    iget-object v6, p0, Lnet/youmi/android/onlineconfig/ntp/a;->e:Ljava/lang/String;

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-result v6

    if-eqz v6, :cond_4

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/net/DatagramSocket;->close()V

    goto :goto_2

    :cond_4
    :try_start_4
    const-string v6, "-"

    invoke-virtual {v3, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    iget-object v3, p0, Lnet/youmi/android/onlineconfig/ntp/a;->e:Ljava/lang/String;

    const-string v7, "-"

    invoke-virtual {v3, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    array-length v3, v6

    array-length v8, v7
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-eq v3, v8, :cond_6

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/net/DatagramSocket;->close()V

    :cond_5
    move v0, v1

    goto :goto_2

    :cond_6
    move v3, v1

    :goto_3
    :try_start_5
    array-length v8, v6

    if-ge v3, v8, :cond_b

    aget-object v8, v6, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    aget-object v9, v7, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    move-result v9

    if-ne v8, v9, :cond_8

    :cond_7
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_8
    if-le v8, v9, :cond_9

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/net/DatagramSocket;->close()V

    goto :goto_2

    :cond_9
    if-ge v8, v9, :cond_7

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Ljava/net/DatagramSocket;->close()V

    :cond_a
    move v0, v1

    goto :goto_2

    :cond_b
    if-eqz v2, :cond_c

    invoke-virtual {v2}, Ljava/net/DatagramSocket;->close()V

    :cond_c
    move v0, v1

    goto :goto_2

    :catch_0
    move-exception v3

    :cond_d
    add-int/lit8 v3, v4, 0x1

    move v4, v3

    goto/16 :goto_1

    :cond_e
    add-int/lit8 v3, v5, 0x1

    move v5, v3

    goto/16 :goto_0

    :cond_f
    if-eqz v2, :cond_10

    invoke-virtual {v2}, Ljava/net/DatagramSocket;->close()V

    :cond_10
    :goto_4
    move v0, v1

    goto :goto_2

    :catch_1
    move-exception v0

    move-object v0, v3

    :goto_5
    if-eqz v0, :cond_10

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->close()V

    goto :goto_4

    :catchall_0
    move-exception v0

    move-object v2, v3

    :goto_6
    if-eqz v2, :cond_11

    invoke-virtual {v2}, Ljava/net/DatagramSocket;->close()V

    :cond_11
    throw v0

    :catchall_1
    move-exception v0

    goto :goto_6

    :catch_2
    move-exception v0

    move-object v0, v2

    goto :goto_5
.end method
