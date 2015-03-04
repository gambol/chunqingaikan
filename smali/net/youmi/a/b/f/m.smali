.class final Lnet/youmi/android/a/b/f/m;
.super Lnet/youmi/android/a/b/f/a;


# static fields
.field private static c:Ljava/security/SecureRandom;

.field private static volatile d:Z


# instance fields
.field private e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    sput-object v0, Lnet/youmi/android/a/b/f/m;->c:Ljava/security/SecureRandom;

    const/4 v0, 0x1

    sput-boolean v0, Lnet/youmi/android/a/b/f/m;->d:Z

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lnet/youmi/android/a/b/f/n;

    invoke-direct {v1}, Lnet/youmi/android/a/b/f/n;-><init>()V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public constructor <init>(J)V
    .locals 1

    invoke-static {}, Ljava/nio/channels/DatagramChannel;->open()Ljava/nio/channels/DatagramChannel;

    move-result-object v0

    invoke-direct {p0, v0, p1, p2}, Lnet/youmi/android/a/b/f/a;-><init>(Ljava/nio/channels/SelectableChannel;J)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnet/youmi/android/a/b/f/m;->e:Z

    return-void
.end method

.method private a(Ljava/net/InetSocketAddress;)V
    .locals 5

    sget-boolean v0, Lnet/youmi/android/a/b/f/m;->d:Z

    if-eqz v0, :cond_1

    const-wide/16 v0, 0x2

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    sget-boolean v0, Lnet/youmi/android/a/b/f/m;->d:Z

    if-eqz v0, :cond_1

    :cond_0
    :goto_1
    return-void

    :cond_1
    iget-object v0, p0, Lnet/youmi/android/a/b/f/m;->b:Ljava/nio/channels/SelectionKey;

    invoke-virtual {v0}, Ljava/nio/channels/SelectionKey;->channel()Ljava/nio/channels/SelectableChannel;

    move-result-object v0

    check-cast v0, Ljava/nio/channels/DatagramChannel;

    const/4 v1, 0x0

    move v2, v1

    :goto_2
    const/16 v1, 0x400

    if-ge v2, v1, :cond_0

    :try_start_1
    sget-object v1, Lnet/youmi/android/a/b/f/m;->c:Ljava/security/SecureRandom;

    const v3, 0xfbff

    invoke-virtual {v1, v3}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v1

    add-int/lit16 v3, v1, 0x400

    if-eqz p1, :cond_2

    new-instance v1, Ljava/net/InetSocketAddress;

    invoke-virtual {p1}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v4

    invoke-direct {v1, v4, v3}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    :goto_3
    invoke-virtual {v0}, Ljava/nio/channels/DatagramChannel;->socket()Ljava/net/DatagramSocket;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/net/DatagramSocket;->bind(Ljava/net/SocketAddress;)V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lnet/youmi/android/a/b/f/m;->e:Z

    goto :goto_1

    :catch_0
    move-exception v1

    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_2

    :cond_2
    new-instance v1, Ljava/net/InetSocketAddress;

    invoke-direct {v1, v3}, Ljava/net/InetSocketAddress;-><init>(I)V
    :try_end_1
    .catch Ljava/net/SocketException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method static synthetic a(Z)Z
    .locals 0

    sput-boolean p0, Lnet/youmi/android/a/b/f/m;->d:Z

    return p0
.end method

.method static a(Ljava/net/SocketAddress;Ljava/net/SocketAddress;[BIJ)[B
    .locals 2

    new-instance v1, Lnet/youmi/android/a/b/f/m;

    invoke-direct {v1, p4, p5}, Lnet/youmi/android/a/b/f/m;-><init>(J)V

    :try_start_0
    invoke-virtual {v1, p0}, Lnet/youmi/android/a/b/f/m;->a(Ljava/net/SocketAddress;)V

    invoke-virtual {v1, p1}, Lnet/youmi/android/a/b/f/m;->b(Ljava/net/SocketAddress;)V

    invoke-virtual {v1, p2}, Lnet/youmi/android/a/b/f/m;->a([B)V

    invoke-virtual {v1, p3}, Lnet/youmi/android/a/b/f/m;->a(I)[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    invoke-virtual {v1}, Lnet/youmi/android/a/b/f/m;->a()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Lnet/youmi/android/a/b/f/m;->a()V

    throw v0
.end method

.method static synthetic b()Ljava/security/SecureRandom;
    .locals 1

    sget-object v0, Lnet/youmi/android/a/b/f/m;->c:Ljava/security/SecureRandom;

    return-object v0
.end method


# virtual methods
.method a(Ljava/net/SocketAddress;)V
    .locals 1

    if-eqz p1, :cond_0

    instance-of v0, p1, Ljava/net/InetSocketAddress;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Ljava/net/InetSocketAddress;

    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    move-object v0, p1

    check-cast v0, Ljava/net/InetSocketAddress;

    invoke-direct {p0, v0}, Lnet/youmi/android/a/b/f/m;->a(Ljava/net/InetSocketAddress;)V

    iget-boolean v0, p0, Lnet/youmi/android/a/b/f/m;->e:Z

    if-eqz v0, :cond_2

    :cond_1
    :goto_0
    return-void

    :cond_2
    if-eqz p1, :cond_1

    iget-object v0, p0, Lnet/youmi/android/a/b/f/m;->b:Ljava/nio/channels/SelectionKey;

    invoke-virtual {v0}, Ljava/nio/channels/SelectionKey;->channel()Ljava/nio/channels/SelectableChannel;

    move-result-object v0

    check-cast v0, Ljava/nio/channels/DatagramChannel;

    invoke-virtual {v0}, Ljava/nio/channels/DatagramChannel;->socket()Ljava/net/DatagramSocket;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/net/DatagramSocket;->bind(Ljava/net/SocketAddress;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnet/youmi/android/a/b/f/m;->e:Z

    goto :goto_0
.end method

.method a([B)V
    .locals 2

    iget-object v0, p0, Lnet/youmi/android/a/b/f/m;->b:Ljava/nio/channels/SelectionKey;

    invoke-virtual {v0}, Ljava/nio/channels/SelectionKey;->channel()Ljava/nio/channels/SelectableChannel;

    move-result-object v0

    check-cast v0, Ljava/nio/channels/DatagramChannel;

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/channels/DatagramChannel;->write(Ljava/nio/ByteBuffer;)I

    return-void
.end method

.method a(I)[B
    .locals 7

    const/4 v6, 0x0

    iget-object v0, p0, Lnet/youmi/android/a/b/f/m;->b:Ljava/nio/channels/SelectionKey;

    invoke-virtual {v0}, Ljava/nio/channels/SelectionKey;->channel()Ljava/nio/channels/SelectableChannel;

    move-result-object v0

    check-cast v0, Ljava/nio/channels/DatagramChannel;

    new-array v1, p1, [B

    iget-object v2, p0, Lnet/youmi/android/a/b/f/m;->b:Ljava/nio/channels/SelectionKey;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/nio/channels/SelectionKey;->interestOps(I)Ljava/nio/channels/SelectionKey;

    :goto_0
    :try_start_0
    iget-object v2, p0, Lnet/youmi/android/a/b/f/m;->b:Ljava/nio/channels/SelectionKey;

    invoke-virtual {v2}, Ljava/nio/channels/SelectionKey;->isReadable()Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lnet/youmi/android/a/b/f/m;->b:Ljava/nio/channels/SelectionKey;

    iget-wide v4, p0, Lnet/youmi/android/a/b/f/m;->a:J

    invoke-static {v2, v4, v5}, Lnet/youmi/android/a/b/f/m;->a(Ljava/nio/channels/SelectionKey;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lnet/youmi/android/a/b/f/m;->b:Ljava/nio/channels/SelectionKey;

    invoke-virtual {v1}, Ljava/nio/channels/SelectionKey;->isValid()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lnet/youmi/android/a/b/f/m;->b:Ljava/nio/channels/SelectionKey;

    invoke-virtual {v1, v6}, Ljava/nio/channels/SelectionKey;->interestOps(I)Ljava/nio/channels/SelectionKey;

    :cond_0
    throw v0

    :cond_1
    iget-object v2, p0, Lnet/youmi/android/a/b/f/m;->b:Ljava/nio/channels/SelectionKey;

    invoke-virtual {v2}, Ljava/nio/channels/SelectionKey;->isValid()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lnet/youmi/android/a/b/f/m;->b:Ljava/nio/channels/SelectionKey;

    invoke-virtual {v2, v6}, Ljava/nio/channels/SelectionKey;->interestOps(I)Ljava/nio/channels/SelectionKey;

    :cond_2
    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/nio/channels/DatagramChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result v0

    int-to-long v2, v0

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-gtz v0, :cond_3

    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    :cond_3
    long-to-int v0, v2

    new-array v2, v0, [B

    invoke-static {v1, v6, v2, v6, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method

.method b(Ljava/net/SocketAddress;)V
    .locals 1

    iget-boolean v0, p0, Lnet/youmi/android/a/b/f/m;->e:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lnet/youmi/android/a/b/f/m;->a(Ljava/net/SocketAddress;)V

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/b/f/m;->b:Ljava/nio/channels/SelectionKey;

    invoke-virtual {v0}, Ljava/nio/channels/SelectionKey;->channel()Ljava/nio/channels/SelectableChannel;

    move-result-object v0

    check-cast v0, Ljava/nio/channels/DatagramChannel;

    invoke-virtual {v0, p1}, Ljava/nio/channels/DatagramChannel;->connect(Ljava/net/SocketAddress;)Ljava/nio/channels/DatagramChannel;

    return-void
.end method
