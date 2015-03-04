package net.slidingmenu.tools.b.b.i; class i { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/b/i/i;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(Landroid/content/Context;Ljava/lang/String;)J
a=0;//     .locals 7
a=0;// 
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     if-nez p1, :cond_2
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {v4}, Lorg/apache/http/client/methods/HttpGet;->abort()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_4
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-virtual {v2}, Lorg/apache/http/impl/client/DefaultHttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v2}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_c
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v3=(Reference,Ujava/lang/Object;);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-wide v0
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_2
a=0;//     #v2=(Null);v3=(Null);v4=(Null);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/i/i;->b(Landroid/content/Context;)Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :try_start_3
a=0;//     #v4=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     new-instance v2, Lorg/apache/http/client/methods/HttpGet;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     invoke-direct {v2, p1}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_a
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     :try_start_4
a=0;//     #v2=(Reference,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     invoke-virtual {v4, v2}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lorg/apache/http/HttpResponse;);
a=0;//     invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lorg/apache/http/StatusLine;);
a=0;//     invoke-interface {v5}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/16 v6, 0xc8
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     if-lt v5, v6, :cond_4
a=0;// 
a=0;//     const/16 v6, 0x12c
a=0;// 
a=0;//     if-ge v5, v6, :cond_4
a=0;// 
a=0;//     invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v3}, Lorg/apache/http/HttpEntity;->getContentLength()J
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_b
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_2
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     :try_start_5
a=0;//     invoke-virtual {v2}, Lorg/apache/http/client/methods/HttpGet;->abort()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_5
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_2
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     :try_start_6
a=0;//     invoke-virtual {v4}, Lorg/apache/http/impl/client/DefaultHttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v2
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     :try_start_7
a=0;//     invoke-virtual {v2}, Lorg/apache/http/client/methods/HttpGet;->abort()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_6
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_3
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     :try_start_8
a=0;//     invoke-virtual {v4}, Lorg/apache/http/impl/client/DefaultHttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;//     :try_end_8
a=0;//     .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     move-exception v2
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_2
a=0;//     #v2=(Null);v3=(Null);v4=(Null);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     :goto_4
a=0;//     #v3=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);v4=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     :try_start_9
a=0;//     invoke-virtual {v2}, Lorg/apache/http/client/methods/HttpGet;->abort()V
a=0;//     :try_end_9
a=0;//     .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_7
a=0;// 
a=0;//     :cond_6
a=0;//     :goto_5
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     :try_start_a
a=0;//     invoke-virtual {v3}, Lorg/apache/http/impl/client/DefaultHttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;//     :try_end_a
a=0;//     .catch Ljava/lang/Throwable; {:try_start_a .. :try_end_a} :catch_3
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_3
a=0;//     move-exception v2
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v2=(Null);v3=(Null);v4=(Null);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     move-object v4, v3
a=0;// 
a=0;//     :goto_6
a=0;//     #v2=(Reference,Lorg/apache/http/client/methods/HttpGet;);v3=(Reference,Ujava/lang/Object;);v4=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     :try_start_b
a=0;//     invoke-virtual {v2}, Lorg/apache/http/client/methods/HttpGet;->abort()V
a=0;//     :try_end_b
a=0;//     .catch Ljava/lang/Throwable; {:try_start_b .. :try_end_b} :catch_8
a=0;// 
a=0;//     :cond_7
a=0;//     :goto_7
a=0;//     #v1=(Conflicted);
a=0;//     if-eqz v4, :cond_8
a=0;// 
a=0;//     :try_start_c
a=0;//     invoke-virtual {v4}, Lorg/apache/http/impl/client/DefaultHttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v1}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;//     :try_end_c
a=0;//     .catch Ljava/lang/Throwable; {:try_start_c .. :try_end_c} :catch_9
a=0;// 
a=0;//     :cond_8
a=0;//     :goto_8
a=0;//     #v1=(Conflicted);
a=0;//     throw v0
a=0;// 
a=0;//     :catch_4
a=0;//     #v0=(LongLo);v1=(LongHi);v2=(Null);v3=(Null);v4=(Null);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_5
a=0;//     #v2=(Reference,Lorg/apache/http/client/methods/HttpGet;);v3=(Reference,Lorg/apache/http/HttpEntity;);v5=(Integer);v6=(PosShort);
a=0;//     move-exception v2
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_6
a=0;//     move-exception v2
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_7
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_8
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_7
a=0;// 
a=0;//     :catch_9
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_8
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(LongLo);v1=(LongHi);v2=(Conflicted);v3=(Null);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_6
a=0;// 
a=0;//     :catchall_2
a=0;//     #v0=(LongLo);v2=(Reference,Lorg/apache/http/client/methods/HttpGet;);v3=(Reference,Ujava/lang/Object;);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_6
a=0;// 
a=0;//     :catch_a
a=0;//     #v0=(LongLo);v2=(Conflicted);v3=(Null);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     #v3=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_b
a=0;//     #v2=(Reference,Lorg/apache/http/client/methods/HttpGet;);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     move-object v3, v4
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_c
a=0;//     #v3=(Null);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static a()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/i/i;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v1, 0x100
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "Mozilla/5.0 (Linux; U; Android "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, "; "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/b/h/e;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, "; "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/b/h/e;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, " Build/"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     sget-object v1, Landroid/os/Build;->ID:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, ") AppleWebkit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/b/i/i;->a:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/i/i;->a:Ljava/lang/String;
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Lnet/slidingmenu/tools/b/b/i/e;)Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/i/i;->a(Landroid/content/Context;)Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/params/HttpParams;);
a=0;//     invoke-direct {v0, v1}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     new-instance v1, Lnet/slidingmenu/tools/b/b/i/j;
a=0;// 
a=0;//     #v1=(UninitRef,Lnet/slidingmenu/tools/b/b/i/j;);
a=0;//     invoke-direct {v1, p1}, Lnet/slidingmenu/tools/b/b/i/j;-><init>(Lnet/slidingmenu/tools/b/b/i/e;)V
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/b/b/i/j;);
a=0;//     invoke-virtual {v0, v1}, Lorg/apache/http/impl/client/DefaultHttpClient;->setRedirectHandler(Lorg/apache/http/client/RedirectHandler;)V
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;)Lorg/apache/http/params/HttpParams;
a=0;//     .locals 5
a=0;// 
a=0;//     const/16 v3, 0x7530
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     new-instance v0, Lorg/apache/http/params/BasicHttpParams;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     invoke-direct {v0}, Lorg/apache/http/params/BasicHttpParams;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     const-wide/16 v1, 0x3e8
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {v0, v1, v2}, Lorg/apache/http/conn/params/ConnManagerParams;->setTimeout(Lorg/apache/http/params/HttpParams;J)V
a=0;// 
a=0;//     invoke-static {v0, v3}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     invoke-static {v0, v3}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v0, v1}, Lorg/apache/http/client/params/HttpClientParams;->setRedirecting(Lorg/apache/http/params/HttpParams;Z)V
a=0;// 
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/b/i/i;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lorg/apache/http/params/HttpProtocolParams;->setUserAgent(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/i/k;->c(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "cmwap"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     new-instance v1, Lorg/apache/http/HttpHost;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/HttpHost;);
a=0;//     const-string v2, "10.0.0.172"
a=0;// 
a=0;//     const/16 v3, 0x50
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-direct {v1, v2, v3, v4}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/HttpHost;);
a=0;//     const-string v2, "http.route.default-proxy"
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1}, Lorg/apache/http/params/BasicHttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v3=(PosShort);v4=(Conflicted);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     if-nez p1, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     move v0, v1
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_0
a=0;//     #v0=(One);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-nez v4, :cond_4
a=0;// 
a=0;//     :cond_3
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(One);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(One);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static b(Landroid/content/Context;)Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, v0}, Lnet/slidingmenu/tools/b/b/i/i;->a(Landroid/content/Context;Lnet/slidingmenu/tools/b/b/i/e;)Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     return-object v0
a=0;// .end method
}}
