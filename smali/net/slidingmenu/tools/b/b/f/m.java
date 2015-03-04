package net.slidingmenu.tools.b.b.f; class m { void a() { int a;
a=0;// .class final Lnet/slidingmenu/tools/b/b/f/m;
a=0;// .super Lnet/slidingmenu/tools/b/b/f/a;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static c:Ljava/security/SecureRandom;
a=0;// 
a=0;// .field private static volatile d:Z
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private e:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Ljava/security/SecureRandom;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/security/SecureRandom;);
a=0;//     invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/security/SecureRandom;);
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/b/f/m;->c:Ljava/security/SecureRandom;
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     sput-boolean v0, Lnet/slidingmenu/tools/b/b/f/m;->d:Z
a=0;// 
a=0;//     new-instance v0, Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v1, Lnet/slidingmenu/tools/b/b/f/n;
a=0;// 
a=0;//     #v1=(UninitRef,Lnet/slidingmenu/tools/b/b/f/n;);
a=0;//     invoke-direct {v1}, Lnet/slidingmenu/tools/b/b/f/n;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/b/b/f/n;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(J)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {}, Ljava/nio/channels/DatagramChannel;->open()Ljava/nio/channels/DatagramChannel;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/channels/DatagramChannel;);
a=0;//     invoke-direct {p0, v0, p1, p2}, Lnet/slidingmenu/tools/b/b/f/a;-><init>(Ljava/nio/channels/SelectableChannel;J)V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/b/f/m;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lnet/slidingmenu/tools/b/b/f/m;->e:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/net/InetSocketAddress;)V
a=0;//     .locals 5
a=0;// 
a=0;//     sget-boolean v0, Lnet/slidingmenu/tools/b/b/f/m;->d:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-wide/16 v0, 0x2
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     sget-boolean v0, Lnet/slidingmenu/tools/b/b/f/m;->d:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/f/m;->b:Ljava/nio/channels/SelectionKey;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/channels/SelectionKey;);
a=0;//     invoke-virtual {v0}, Ljava/nio/channels/SelectionKey;->channel()Ljava/nio/channels/SelectableChannel;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/nio/channels/DatagramChannel;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v2, v1
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Integer);v2=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     const/16 v1, 0x400
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     if-ge v2, v1, :cond_0
a=0;// 
a=0;//     :try_start_1
a=0;//     sget-object v1, Lnet/slidingmenu/tools/b/b/f/m;->c:Ljava/security/SecureRandom;
a=0;// 
a=0;//     #v1=(Reference,Ljava/security/SecureRandom;);
a=0;//     const v3, 0xfbff
a=0;// 
a=0;//     #v3=(Char);
a=0;//     invoke-virtual {v1, v3}, Ljava/security/SecureRandom;->nextInt(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit16 v3, v1, 0x400
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     new-instance v1, Ljava/net/InetSocketAddress;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/net/InetSocketAddress;);
a=0;//     invoke-virtual {p1}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/net/InetAddress;);
a=0;//     invoke-direct {v1, v4, v3}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Reference,Ljava/net/InetSocketAddress;);v4=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/nio/channels/DatagramChannel;->socket()Ljava/net/DatagramSocket;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/net/DatagramSocket;);
a=0;//     invoke-virtual {v3, v1}, Ljava/net/DatagramSocket;->bind(Ljava/net/SocketAddress;)V
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, p0, Lnet/slidingmenu/tools/b/b/f/m;->e:Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/net/SocketException;);
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_2
a=0;//     #v3=(Integer);
a=0;//     new-instance v1, Ljava/net/InetSocketAddress;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/net/InetSocketAddress;);
a=0;//     invoke-direct {v1, v3}, Ljava/net/InetSocketAddress;-><init>(I)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/net/SocketException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     #v1=(Reference,Ljava/net/InetSocketAddress;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(LongLo);v1=(LongHi);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/InterruptedException;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Z)Z
a=0;//     .locals 0
a=0;// 
a=0;//     sput-boolean p0, Lnet/slidingmenu/tools/b/b/f/m;->d:Z
a=0;// 
a=0;//     return p0
a=0;// .end method
a=0;// 
a=0;// .method static a(Ljava/net/SocketAddress;Ljava/net/SocketAddress;[BIJ)[B
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v1, Lnet/slidingmenu/tools/b/b/f/m;
a=0;// 
a=0;//     #v1=(UninitRef,Lnet/slidingmenu/tools/b/b/f/m;);
a=0;//     invoke-direct {v1, p4, p5}, Lnet/slidingmenu/tools/b/b/f/m;-><init>(J)V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/b/b/f/m;);
a=0;//     invoke-virtual {v1, p0}, Lnet/slidingmenu/tools/b/b/f/m;->a(Ljava/net/SocketAddress;)V
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Lnet/slidingmenu/tools/b/b/f/m;->b(Ljava/net/SocketAddress;)V
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Lnet/slidingmenu/tools/b/b/f/m;->a([B)V
a=0;// 
a=0;//     invoke-virtual {v1, p3}, Lnet/slidingmenu/tools/b/b/f/m;->a(I)[B
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-virtual {v1}, Lnet/slidingmenu/tools/b/b/f/m;->a()V
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v1}, Lnet/slidingmenu/tools/b/b/f/m;->a()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b()Ljava/security/SecureRandom;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/f/m;->c:Ljava/security/SecureRandom;
a=0;// 
a=0;//     #v0=(Reference,Ljava/security/SecureRandom;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method a(Ljava/net/SocketAddress;)V
a=0;//     .locals 1
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     instance-of v0, p1, Ljava/net/InetSocketAddress;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/SocketAddress;);
a=0;//     check-cast v0, Ljava/net/InetSocketAddress;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getPort()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/SocketAddress;);
a=0;//     check-cast v0, Ljava/net/InetSocketAddress;
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lnet/slidingmenu/tools/b/b/f/m;->a(Ljava/net/InetSocketAddress;)V
a=0;// 
a=0;//     iget-boolean v0, p0, Lnet/slidingmenu/tools/b/b/f/m;->e:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/f/m;->b:Ljava/nio/channels/SelectionKey;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/channels/SelectionKey;);
a=0;//     invoke-virtual {v0}, Ljava/nio/channels/SelectionKey;->channel()Ljava/nio/channels/SelectableChannel;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/nio/channels/DatagramChannel;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/nio/channels/DatagramChannel;->socket()Ljava/net/DatagramSocket;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/net/DatagramSocket;->bind(Ljava/net/SocketAddress;)V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lnet/slidingmenu/tools/b/b/f/m;->e:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method a([B)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/f/m;->b:Ljava/nio/channels/SelectionKey;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/channels/SelectionKey;);
a=0;//     invoke-virtual {v0}, Ljava/nio/channels/SelectionKey;->channel()Ljava/nio/channels/SelectableChannel;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/nio/channels/DatagramChannel;
a=0;// 
a=0;//     invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v0, v1}, Ljava/nio/channels/DatagramChannel;->write(Ljava/nio/ByteBuffer;)I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method a(I)[B
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/f/m;->b:Ljava/nio/channels/SelectionKey;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/channels/SelectionKey;);
a=0;//     invoke-virtual {v0}, Ljava/nio/channels/SelectionKey;->channel()Ljava/nio/channels/SelectableChannel;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/nio/channels/DatagramChannel;
a=0;// 
a=0;//     new-array v1, p1, [B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/b/f/m;->b:Ljava/nio/channels/SelectionKey;
a=0;// 
a=0;//     #v2=(Reference,Ljava/nio/channels/SelectionKey;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v2, v3}, Ljava/nio/channels/SelectionKey;->interestOps(I)Ljava/nio/channels/SelectionKey;
a=0;// 
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/b/f/m;->b:Ljava/nio/channels/SelectionKey;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/nio/channels/SelectionKey;->isReadable()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/b/f/m;->b:Ljava/nio/channels/SelectionKey;
a=0;// 
a=0;//     #v2=(Reference,Ljava/nio/channels/SelectionKey;);
a=0;//     iget-wide v3, p0, Lnet/slidingmenu/tools/b/b/f/m;->a:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-static {v2, v3, v4}, Lnet/slidingmenu/tools/b/b/f/m;->a(Ljava/nio/channels/SelectionKey;J)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/f/m;->b:Ljava/nio/channels/SelectionKey;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/nio/channels/SelectionKey;->isValid()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/f/m;->b:Ljava/nio/channels/SelectionKey;
a=0;// 
a=0;//     #v1=(Reference,Ljava/nio/channels/SelectionKey;);
a=0;//     invoke-virtual {v1, v6}, Ljava/nio/channels/SelectionKey;->interestOps(I)Ljava/nio/channels/SelectionKey;
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Reference,[B);v2=(Boolean);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/b/f/m;->b:Ljava/nio/channels/SelectionKey;
a=0;// 
a=0;//     #v2=(Reference,Ljava/nio/channels/SelectionKey;);
a=0;//     invoke-virtual {v2}, Ljava/nio/channels/SelectionKey;->isValid()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/b/f/m;->b:Ljava/nio/channels/SelectionKey;
a=0;// 
a=0;//     #v2=(Reference,Ljava/nio/channels/SelectionKey;);
a=0;//     invoke-virtual {v2, v6}, Ljava/nio/channels/SelectionKey;->interestOps(I)Ljava/nio/channels/SelectionKey;
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);
a=0;//     invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v0, v2}, Ljava/nio/channels/DatagramChannel;->read(Ljava/nio/ByteBuffer;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v2, v0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v0, v2, v4
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_3
a=0;// 
a=0;//     new-instance v0, Ljava/io/EOFException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/EOFException;);
a=0;//     invoke-direct {v0}, Ljava/io/EOFException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/EOFException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Byte);
a=0;//     long-to-int v0, v2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v2, v0, [B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     invoke-static {v1, v6, v2, v6, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method b(Ljava/net/SocketAddress;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-boolean v0, p0, Lnet/slidingmenu/tools/b/b/f/m;->e:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/b/b/f/m;->a(Ljava/net/SocketAddress;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/f/m;->b:Ljava/nio/channels/SelectionKey;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/channels/SelectionKey;);
a=0;//     invoke-virtual {v0}, Ljava/nio/channels/SelectionKey;->channel()Ljava/nio/channels/SelectableChannel;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/nio/channels/DatagramChannel;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/nio/channels/DatagramChannel;->connect(Ljava/net/SocketAddress;)Ljava/nio/channels/DatagramChannel;
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
