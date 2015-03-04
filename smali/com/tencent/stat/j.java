package com.tencent.stat; class j { void a() { int a;
a=0;// .class Lcom/tencent/stat/j;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/content/Context;
a=0;// 
a=0;// .field private b:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Integer;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/util/Map;)V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Integer;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/stat/j;);
a=0;//     iput-object v0, p0, Lcom/tencent/stat/j;->a:Landroid/content/Context;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/stat/j;->b:Ljava/util/Map;
a=0;// 
a=0;//     iput-object p1, p0, Lcom/tencent/stat/j;->a:Landroid/content/Context;
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     iput-object p2, p0, Lcom/tencent/stat/j;->b:Ljava/util/Map;
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;I)Lcom/tencent/stat/NetworkMonitor;
a=0;//     .locals 8
a=0;// 
a=0;//     new-instance v2, Lcom/tencent/stat/NetworkMonitor;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/stat/NetworkMonitor;);
a=0;//     invoke-direct {v2}, Lcom/tencent/stat/NetworkMonitor;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/NetworkMonitor;);
a=0;//     new-instance v3, Ljava/net/Socket;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/net/Socket;);
a=0;//     invoke-direct {v3}, Ljava/net/Socket;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/net/Socket;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v2, p1}, Lcom/tencent/stat/NetworkMonitor;->setDomain(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v2, p2}, Lcom/tencent/stat/NetworkMonitor;->setPort(I)V
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     new-instance v1, Ljava/net/InetSocketAddress;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/net/InetSocketAddress;);
a=0;//     invoke-direct {v1, p1, p2}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/net/InetSocketAddress;);
a=0;//     const/16 v6, 0x7530
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     invoke-virtual {v3, v1, v6}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     sub-long v4, v6, v4
a=0;// 
a=0;//     invoke-virtual {v2, v4, v5}, Lcom/tencent/stat/NetworkMonitor;->setMillisecondsConsume(J)V
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Lcom/tencent/stat/NetworkMonitor;->setRemoteIp(Ljava/lang/String;)V
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/net/Socket;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :cond_0
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-virtual {v3}, Ljava/net/Socket;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Byte);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v2, v0}, Lcom/tencent/stat/NetworkMonitor;->setStatusCode(I)V
a=0;// 
a=0;//     return-object v2
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v4=(LongLo);v5=(LongHi);v6=(LongLo);v7=(LongHi);
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatService;->b()Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     :try_start_2
a=0;//     #v0=(Byte);
a=0;//     invoke-static {}, Lcom/tencent/stat/StatService;->b()Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v4, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     :try_start_3
a=0;//     invoke-virtual {v3}, Ljava/net/Socket;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_2
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatService;->b()Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     :try_start_4
a=0;//     invoke-virtual {v3}, Ljava/net/Socket;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_3
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     throw v0
a=0;// 
a=0;//     :catch_3
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {}, Lcom/tencent/stat/StatService;->b()Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private a()Ljava/util/Map;
a=0;//     .locals 8
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Integer;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "__MTA_TEST_SPEED__"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/stat/StatConfig;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Reference,Ljava/lang/String;);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     const-string v2, ";"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     array-length v5, v4
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move v2, v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Integer);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-ge v2, v5, :cond_0
a=0;// 
a=0;//     aget-object v1, v4, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const-string v6, ","
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     array-length v6, v1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-eq v6, v7, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Reference,[Ljava/lang/String;);v6=(Integer);v7=(PosByte);
a=0;//     aget-object v6, v1, v3
a=0;// 
a=0;//     #v6=(Null);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-eqz v7, :cond_2
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     :try_start_0
a=0;//     #v7=(One);
a=0;//     aget-object v1, v1, v7
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v0, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatService;->b()Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v6, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 6
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/tencent/stat/j;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/tencent/stat/common/k;->h(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/stat/j;->b:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/tencent/stat/j;->a()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/stat/j;->b:Ljava/util/Map;
a=0;// 
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Lcom/tencent/stat/j;->b:Ljava/util/Map;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/j;->b:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     invoke-static {}, Lcom/tencent/stat/StatService;->b()Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     const-string v1, "empty domain list."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->w(Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {}, Lcom/tencent/stat/StatService;->b()Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     :try_start_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     new-instance v3, Lorg/json/JSONArray;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/json/JSONArray;);
a=0;//     invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Lorg/json/JSONArray;);
a=0;//     iget-object v0, p0, Lcom/tencent/stat/j;->b:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Reference,Ljava/util/Iterator;);v5=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_6
a=0;// 
a=0;//     :cond_5
a=0;//     #v2=(Conflicted);
a=0;//     invoke-static {}, Lcom/tencent/stat/StatService;->b()Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "empty domain name."
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->w(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Ljava/lang/Integer;
a=0;// 
a=0;//     if-nez v2, :cond_7
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatService;->b()Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "port is null for "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->w(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_7
a=0;//     #v5=(Conflicted);
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v1, v0}, Lcom/tencent/stat/j;->a(Ljava/lang/String;I)Lcom/tencent/stat/NetworkMonitor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/NetworkMonitor;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/stat/NetworkMonitor;->toJSONObject()Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-virtual {v3}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcom/tencent/stat/a/i;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/stat/a/i;);
a=0;//     iget-object v1, p0, Lcom/tencent/stat/j;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Lcom/tencent/stat/j;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v2, v4}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Z)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/tencent/stat/a/i;-><init>(Landroid/content/Context;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/a/i;);
a=0;//     invoke-virtual {v3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/a/i;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/j;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/j;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Lcom/tencent/stat/k;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/stat/k;);
a=0;//     invoke-direct {v2, v0}, Lcom/tencent/stat/k;-><init>(Lcom/tencent/stat/a/e;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/k;);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
