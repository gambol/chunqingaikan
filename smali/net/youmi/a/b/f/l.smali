.class public Lnet/youmi/android/a/b/f/l;
.super Ljava/lang/Object;


# static fields
.field private static d:Ljava/lang/String;

.field private static e:I


# instance fields
.field private a:Ljava/net/InetSocketAddress;

.field private b:Ljava/net/InetSocketAddress;

.field private c:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "localhost"

    sput-object v0, Lnet/youmi/android/a/b/f/l;->d:Ljava/lang/String;

    const/4 v0, 0x0

    sput v0, Lnet/youmi/android/a/b/f/l;->e:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lnet/youmi/android/a/b/f/l;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x2710

    iput-wide v0, p0, Lnet/youmi/android/a/b/f/l;->c:J

    if-nez p1, :cond_0

    invoke-static {}, Lnet/youmi/android/a/b/f/k;->b()Lnet/youmi/android/a/b/f/k;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/b/f/k;->a()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, Lnet/youmi/android/a/b/f/l;->d:Ljava/lang/String;

    :cond_0
    :try_start_0
    const-string v0, "0"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Ljava/net/InetAddress;->getLocalHost()Ljava/net/InetAddress;

    move-result-object v0

    :goto_0
    new-instance v1, Ljava/net/InetSocketAddress;

    const/16 v2, 0x35

    invoke-direct {v1, v0, v2}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    iput-object v1, p0, Lnet/youmi/android/a/b/f/l;->a:Ljava/net/InetSocketAddress;

    :goto_1
    return-void

    :cond_1
    invoke-static {p1}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_1
    invoke-static {}, Lnet/youmi/android/a/b/f/k;->b()Lnet/youmi/android/a/b/f/k;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/b/f/k;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, Ljava/net/InetAddress;->getLocalHost()Ljava/net/InetAddress;

    move-result-object v0

    :goto_2
    new-instance v1, Ljava/net/InetSocketAddress;

    const/16 v2, 0x35

    invoke-direct {v1, v0, v2}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    iput-object v1, p0, Lnet/youmi/android/a/b/f/l;->a:Ljava/net/InetSocketAddress;

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_1

    :cond_2
    invoke-static {v0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    goto :goto_2
.end method

.method private a([B)Lnet/youmi/android/a/b/f/g;
    .locals 1

    new-instance v0, Lnet/youmi/android/a/b/f/g;

    invoke-direct {v0, p1}, Lnet/youmi/android/a/b/f/g;-><init>([B)V

    return-object v0
.end method

.method private b(Lnet/youmi/android/a/b/f/g;)I
    .locals 1

    const/16 v0, 0x200

    return v0
.end method


# virtual methods
.method public a(Lnet/youmi/android/a/b/f/g;)Lnet/youmi/android/a/b/f/g;
    .locals 6

    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Sending to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lnet/youmi/android/a/b/f/l;->a:Ljava/net/InetSocketAddress;

    invoke-virtual {v2}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lnet/youmi/android/a/b/f/l;->a:Ljava/net/InetSocketAddress;

    invoke-virtual {v2}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-virtual {p1}, Lnet/youmi/android/a/b/f/g;->b()[B

    move-result-object v2

    invoke-direct {p0, p1}, Lnet/youmi/android/a/b/f/l;->b(Lnet/youmi/android/a/b/f/g;)I

    move-result v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v4, p0, Lnet/youmi/android/a/b/f/l;->c:J

    add-long/2addr v4, v0

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/b/f/l;->b:Ljava/net/InetSocketAddress;

    iget-object v1, p0, Lnet/youmi/android/a/b/f/l;->a:Ljava/net/InetSocketAddress;

    invoke-static/range {v0 .. v5}, Lnet/youmi/android/a/b/f/m;->a(Ljava/net/SocketAddress;Ljava/net/SocketAddress;[BIJ)[B

    move-result-object v0

    array-length v1, v0

    const/16 v2, 0xc

    if-ge v1, v2, :cond_0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "invalid DNS header - too short"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    :goto_0
    return-object p1

    :cond_0
    :try_start_1
    invoke-direct {p0, v0}, Lnet/youmi/android/a/b/f/l;->a([B)Lnet/youmi/android/a/b/f/g;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object p1

    goto :goto_0
.end method
