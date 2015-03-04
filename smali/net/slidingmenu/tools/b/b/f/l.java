package net.slidingmenu.tools.b.b.f; class l { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/b/f/l;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static d:Ljava/lang/String;
a=0;// 
a=0;// .field private static e:I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Ljava/net/InetSocketAddress;
a=0;// 
a=0;// .field private b:Ljava/net/InetSocketAddress;
a=0;// 
a=0;// .field private c:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "localhost"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/b/f/l;->d:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput v0, Lnet/slidingmenu/tools/b/b/f/l;->e:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Lnet/slidingmenu/tools/b/b/f/l;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/b/f/l;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/b/f/l;);
a=0;//     const-wide/16 v0, 0x2710
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lnet/slidingmenu/tools/b/b/f/l;->c:J
a=0;// 
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/b/f/k;->b()Lnet/slidingmenu/tools/b/b/f/k;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/b/f/k;);
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/b/f/k;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     sget-object p1, Lnet/slidingmenu/tools/b/b/f/l;->d:Ljava/lang/String;
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "0"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-static {}, Ljava/net/InetAddress;->getLocalHost()Ljava/net/InetAddress;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/net/InetAddress;);
a=0;//     new-instance v1, Ljava/net/InetSocketAddress;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/net/InetSocketAddress;);
a=0;//     const/16 v2, 0x35
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-direct {v1, v0, v2}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/net/InetSocketAddress;);
a=0;//     iput-object v1, p0, Lnet/slidingmenu/tools/b/b/f/l;->a:Ljava/net/InetSocketAddress;
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(LongHi);v2=(Uninit);
a=0;//     invoke-static {p1}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/InetAddress;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/b/f/k;->b()Lnet/slidingmenu/tools/b/b/f/k;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/b/f/k;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "0"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-static {}, Ljava/net/InetAddress;->getLocalHost()Ljava/net/InetAddress;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_2
a=0;//     new-instance v1, Ljava/net/InetSocketAddress;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/net/InetSocketAddress;);
a=0;//     const/16 v2, 0x35
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-direct {v1, v0, v2}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/net/InetSocketAddress;);
a=0;//     iput-object v1, p0, Lnet/slidingmenu/tools/b/b/f/l;->a:Ljava/net/InetSocketAddress;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Boolean);
a=0;//     invoke-static {v0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private a([B)Lnet/slidingmenu/tools/b/b/f/g;
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/b/b/f/g;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/b/b/f/g;);
a=0;//     invoke-direct {v0, p1}, Lnet/slidingmenu/tools/b/b/f/g;-><init>([B)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/b/f/g;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private b(Lnet/slidingmenu/tools/b/b/f/g;)I
a=0;//     .locals 1
a=0;// 
a=0;//     const/16 v0, 0x200
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lnet/slidingmenu/tools/b/b/f/g;)Lnet/slidingmenu/tools/b/b/f/g;
a=0;//     .locals 6
a=0;// 
a=0;//     sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/PrintStream;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Sending to "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/b/f/l;->a:Ljava/net/InetSocketAddress;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ":"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/b/f/l;->a:Ljava/net/InetSocketAddress;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/net/InetSocketAddress;->getPort()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/b/f/g;->b()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     invoke-direct {p0, p1}, Lnet/slidingmenu/tools/b/b/f/l;->b(Lnet/slidingmenu/tools/b/b/f/g;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-wide v4, p0, Lnet/slidingmenu/tools/b/b/f/l;->c:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     add-long/2addr v4, v0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/f/l;->b:Ljava/net/InetSocketAddress;
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/InetSocketAddress;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/f/l;->a:Ljava/net/InetSocketAddress;
a=0;// 
a=0;//     #v1=(Reference,Ljava/net/InetSocketAddress;);
a=0;//     invoke-static/range {v0 .. v5}, Lnet/slidingmenu/tools/b/b/f/m;->a(Ljava/net/SocketAddress;Ljava/net/SocketAddress;[BIJ)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     array-length v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0xc
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ge v1, v2, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/io/IOException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/IOException;);
a=0;//     const-string v1, "invalid DNS header - too short"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     throw v0
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     :goto_0
a=0;//     return-object p1
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v1=(Integer);v2=(PosByte);
a=0;//     invoke-direct {p0, v0}, Lnet/slidingmenu/tools/b/b/f/l;->a([B)Lnet/slidingmenu/tools/b/b/f/g;
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
