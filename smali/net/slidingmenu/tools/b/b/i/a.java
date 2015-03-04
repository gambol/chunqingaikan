package net.slidingmenu.tools.b.b.i; class a { void a() { int a;
a=0;// .class public abstract Lnet/slidingmenu/tools/b/b/i/a;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected a:Landroid/content/Context;
a=0;// 
a=0;// .field protected b:Lorg/apache/http/client/methods/HttpUriRequest;
a=0;// 
a=0;// .field protected c:Lorg/apache/http/client/HttpClient;
a=0;// 
a=0;// .field protected d:Lnet/slidingmenu/tools/b/b/i/b;
a=0;// 
a=0;// .field protected e:Lnet/slidingmenu/tools/b/b/i/c;
a=0;// 
a=0;// .field protected f:J
a=0;// 
a=0;// .field protected g:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Lnet/slidingmenu/tools/b/b/i/c;)V
a=0;//     .locals 2
a=0;// 
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/b/i/a;);
a=0;//     iput-wide v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->f:J
a=0;// 
a=0;//     iput-wide v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->g:J
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     new-instance v0, Ljava/lang/NullPointerException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/NullPointerException;);
a=0;//     invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/NullPointerException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(LongLo);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     iput-object p2, p0, Lnet/slidingmenu/tools/b/b/i/a;->e:Lnet/slidingmenu/tools/b/b/i/c;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Lorg/apache/http/HttpResponse;J)V
a=0;//     .locals 3
a=0;// 
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->d:Lnet/slidingmenu/tools/b/b/i/b;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/b/i/b;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     sub-long/2addr v1, p2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lnet/slidingmenu/tools/b/b/i/b;->b(J)V
a=0;// 
a=0;//     invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/StatusLine;);
a=0;//     invoke-interface {v1}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/StatusLine;);
a=0;//     invoke-interface {v2}, Lorg/apache/http/StatusLine;->getReasonPhrase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lnet/slidingmenu/tools/b/b/i/b;->a(I)V
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lnet/slidingmenu/tools/b/b/i/b;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/b/i/b;->f()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/i/a;->b:Lorg/apache/http/client/methods/HttpUriRequest;
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/client/methods/HttpUriRequest;);
a=0;//     invoke-interface {v1}, Lorg/apache/http/client/methods/HttpUriRequest;->getAllHeaders()[Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lnet/slidingmenu/tools/b/b/i/b;->a([Lorg/apache/http/Header;)V
a=0;// 
a=0;//     invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getAllHeaders()[Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lnet/slidingmenu/tools/b/b/i/b;->b([Lorg/apache/http/Header;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private e()Lorg/apache/http/HttpResponse;
a=0;//     .locals 4
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->c:Lorg/apache/http/client/HttpClient;
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/client/HttpClient;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/b/i/i;->b(Landroid/content/Context;)Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->c:Lorg/apache/http/client/HttpClient;
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->b:Lorg/apache/http/client/methods/HttpUriRequest;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->e:Lnet/slidingmenu/tools/b/b/i/c;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/b/i/c;->b()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->e:Lnet/slidingmenu/tools/b/b/i/c;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/b/i/c;->b()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_3
a=0;// 
a=0;//     new-instance v1, Lorg/apache/http/client/methods/HttpPost;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->e:Lnet/slidingmenu/tools/b/b/i/c;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/b/i/c;);
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/b/i/c;->e()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v0}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->e:Lnet/slidingmenu/tools/b/b/i/c;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/b/i/c;->b()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->e:Lnet/slidingmenu/tools/b/b/i/c;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/b/i/c;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->e:Lnet/slidingmenu/tools/b/b/i/c;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/b/i/c;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     new-instance v3, Lorg/apache/http/client/entity/UrlEncodedFormEntity;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/apache/http/client/entity/UrlEncodedFormEntity;);
a=0;//     invoke-direct {v3, v2, v0}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Lorg/apache/http/client/entity/UrlEncodedFormEntity;);
a=0;//     invoke-virtual {v1, v3}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     iput-object v1, p0, Lnet/slidingmenu/tools/b/b/i/a;->b:Lorg/apache/http/client/methods/HttpUriRequest;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     :try_start_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->e:Lnet/slidingmenu/tools/b/b/i/c;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/b/i/c;->c()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_5
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     invoke-interface {v2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ge v1, v0, :cond_5
a=0;// 
a=0;//     iget-object v3, p0, Lnet/slidingmenu/tools/b/b/i/a;->b:Lorg/apache/http/client/methods/HttpUriRequest;
a=0;// 
a=0;//     #v3=(Reference,Lorg/apache/http/client/methods/HttpUriRequest;);
a=0;//     invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lorg/apache/http/Header;
a=0;// 
a=0;//     invoke-interface {v3, v0}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Lorg/apache/http/Header;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Lorg/apache/http/client/methods/HttpPost;);v3=(Uninit);
a=0;//     const-string v0, "UTF-8"
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->e:Lnet/slidingmenu/tools/b/b/i/c;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/b/i/c;);
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/b/i/c;->k()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->e:Lnet/slidingmenu/tools/b/b/i/c;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/b/i/c;->k()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_4
a=0;// 
a=0;//     new-instance v0, Lorg/apache/http/client/methods/HttpPost;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/i/a;->e:Lnet/slidingmenu/tools/b/b/i/c;
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/b/b/i/c;);
a=0;//     invoke-virtual {v1}, Lnet/slidingmenu/tools/b/b/i/c;->e()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     new-instance v1, Lorg/apache/http/entity/ByteArrayEntity;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/entity/ByteArrayEntity;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/b/i/a;->e:Lnet/slidingmenu/tools/b/b/i/c;
a=0;// 
a=0;//     #v2=(Reference,Lnet/slidingmenu/tools/b/b/i/c;);
a=0;//     invoke-virtual {v2}, Lnet/slidingmenu/tools/b/b/i/c;->k()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/entity/ByteArrayEntity;);
a=0;//     invoke-virtual {v0, v1}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->b:Lorg/apache/http/client/methods/HttpUriRequest;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     :goto_3
a=0;//     :try_start_3
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->c:Lorg/apache/http/client/HttpClient;
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/client/HttpClient;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/i/a;->b:Lorg/apache/http/client/methods/HttpUriRequest;
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/client/methods/HttpUriRequest;);
a=0;//     invoke-interface {v0, v1}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Lorg/apache/http/HttpEntity;->getContentLength()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iput-wide v1, p0, Lnet/slidingmenu/tools/b/b/i/a;->g:J
a=0;//     :try_end_3
a=0;//     .catch Lorg/apache/http/conn/ConnectionPoolTimeoutException; {:try_start_3 .. :try_end_3} :catch_3
a=0;//     .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_3 .. :try_end_3} :catch_4
a=0;//     .catch Ljava/net/SocketTimeoutException; {:try_start_3 .. :try_end_3} :catch_5
a=0;//     .catch Ljava/net/UnknownHostException; {:try_start_3 .. :try_end_3} :catch_6
a=0;//     .catch Lorg/apache/http/conn/HttpHostConnectException; {:try_start_3 .. :try_end_3} :catch_7
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_8
a=0;// 
a=0;//     :goto_4
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_4
a=0;//     :try_start_4
a=0;//     #v0=(Conflicted);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     new-instance v0, Lorg/apache/http/client/methods/HttpGet;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/i/a;->e:Lnet/slidingmenu/tools/b/b/i/c;
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/b/b/i/c;);
a=0;//     invoke-virtual {v1}, Lnet/slidingmenu/tools/b/b/i/c;->e()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->b:Lorg/apache/http/client/methods/HttpUriRequest;
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :cond_5
a=0;//     :try_start_5
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/b/i/a;->c()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_2
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_3
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/conn/ConnectionPoolTimeoutException;);
a=0;//     const/16 v1, -0x65
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {p0, v1, v0}, Lnet/slidingmenu/tools/b/b/i/a;->a(ILjava/lang/Exception;)V
a=0;// 
a=0;//     :goto_5
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/conn/ConnectTimeoutException;);
a=0;//     const/16 v1, -0x64
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {p0, v1, v0}, Lnet/slidingmenu/tools/b/b/i/a;->a(ILjava/lang/Exception;)V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/SocketTimeoutException;);
a=0;//     const/16 v1, -0x66
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {p0, v1, v0}, Lnet/slidingmenu/tools/b/b/i/a;->a(ILjava/lang/Exception;)V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_6
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/UnknownHostException;);
a=0;//     const/16 v1, -0x67
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {p0, v1, v0}, Lnet/slidingmenu/tools/b/b/i/a;->a(ILjava/lang/Exception;)V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_7
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/conn/HttpHostConnectException;);
a=0;//     const/16 v1, -0x68
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {p0, v1, v0}, Lnet/slidingmenu/tools/b/b/i/a;->a(ILjava/lang/Exception;)V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_8
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const/16 v1, -0x63
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {p0, v1, v0}, Lnet/slidingmenu/tools/b/b/i/a;->a(ILjava/lang/Exception;)V
a=0;// 
a=0;//     goto :goto_5
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()J
a=0;//     .locals 2
a=0;// 
a=0;//     iget-wide v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->f:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method protected a(ILjava/lang/Exception;)V
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->d:Lnet/slidingmenu/tools/b/b/i/b;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/b/i/b;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->d:Lnet/slidingmenu/tools/b/b/i/b;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lnet/slidingmenu/tools/b/b/i/b;->b(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->d:Lnet/slidingmenu/tools/b/b/i/b;
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Lnet/slidingmenu/tools/b/b/i/b;->a(Ljava/lang/Exception;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Lnet/slidingmenu/tools/b/b/i/b;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lnet/slidingmenu/tools/b/b/i/a;->d:Lnet/slidingmenu/tools/b/b/i/b;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Lnet/slidingmenu/tools/b/b/i/c;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lnet/slidingmenu/tools/b/b/i/a;->e:Lnet/slidingmenu/tools/b/b/i/c;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected abstract a(Lorg/apache/http/HttpResponse;)V
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized b()V
a=0;//     .locals 5
a=0;// 
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iput-wide v1, p0, Lnet/slidingmenu/tools/b/b/i/a;->f:J
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/b/b/i/a;->e()Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/HttpResponse;);
a=0;//     invoke-direct {p0, v0, v1, v2}, Lnet/slidingmenu/tools/b/b/i/a;->a(Lorg/apache/http/HttpResponse;J)V
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/b/b/i/a;->a(Lorg/apache/http/HttpResponse;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     :try_start_2
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->b:Lorg/apache/http/client/methods/HttpUriRequest;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->b:Lorg/apache/http/client/methods/HttpUriRequest;
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/client/methods/HttpUriRequest;->abort()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_9
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_3
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->b:Lorg/apache/http/client/methods/HttpUriRequest;
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     :try_start_4
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->c:Lorg/apache/http/client/HttpClient;
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/client/HttpClient;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->c:Lorg/apache/http/client/HttpClient;
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_8
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_5
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->c:Lorg/apache/http/client/HttpClient;
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_1
a=0;// 
a=0;//     :try_start_6
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->d:Lnet/slidingmenu/tools/b/b/i/b;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/b/i/b;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     sub-long v0, v3, v1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/b/i/a;->d:Lnet/slidingmenu/tools/b/b/i/b;
a=0;// 
a=0;//     #v2=(Reference,Lnet/slidingmenu/tools/b/b/i/b;);
a=0;//     invoke-virtual {v2, v0, v1}, Lnet/slidingmenu/tools/b/b/i/b;->a(J)V
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_7
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_1
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(LongLo);v2=(LongHi);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_7
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->b:Lorg/apache/http/client/methods/HttpUriRequest;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->b:Lorg/apache/http/client/methods/HttpUriRequest;
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/client/methods/HttpUriRequest;->abort()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_6
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_1
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_3
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_8
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->b:Lorg/apache/http/client/methods/HttpUriRequest;
a=0;//     :try_end_8
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_1
a=0;// 
a=0;//     :try_start_9
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->c:Lorg/apache/http/client/HttpClient;
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/client/HttpClient;);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->c:Lorg/apache/http/client/HttpClient;
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;//     :try_end_9
a=0;//     .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_5
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_1
a=0;// 
a=0;//     :cond_4
a=0;//     :goto_4
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_a
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->c:Lorg/apache/http/client/HttpClient;
a=0;//     :try_end_a
a=0;//     .catchall {:try_start_a .. :try_end_a} :catchall_1
a=0;// 
a=0;//     :try_start_b
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/i/a;->d:Lnet/slidingmenu/tools/b/b/i/b;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/b/i/b;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     sub-long v0, v3, v1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/b/i/a;->d:Lnet/slidingmenu/tools/b/b/i/b;
a=0;// 
a=0;//     #v2=(Reference,Lnet/slidingmenu/tools/b/b/i/b;);
a=0;//     invoke-virtual {v2, v0, v1}, Lnet/slidingmenu/tools/b/b/i/b;->a(J)V
a=0;//     :try_end_b
a=0;//     .catch Ljava/lang/Throwable; {:try_start_b .. :try_end_b} :catch_1
a=0;//     .catchall {:try_start_b .. :try_end_b} :catchall_1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(LongLo);v2=(LongHi);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_c
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v3, p0, Lnet/slidingmenu/tools/b/b/i/a;->b:Lorg/apache/http/client/methods/HttpUriRequest;
a=0;// 
a=0;//     #v3=(Reference,Lorg/apache/http/client/methods/HttpUriRequest;);
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     iget-object v3, p0, Lnet/slidingmenu/tools/b/b/i/a;->b:Lorg/apache/http/client/methods/HttpUriRequest;
a=0;// 
a=0;//     invoke-interface {v3}, Lorg/apache/http/client/methods/HttpUriRequest;->abort()V
a=0;//     :try_end_c
a=0;//     .catch Ljava/lang/Throwable; {:try_start_c .. :try_end_c} :catch_4
a=0;//     .catchall {:try_start_c .. :try_end_c} :catchall_1
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_5
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :try_start_d
a=0;//     #v3=(Null);
a=0;//     iput-object v3, p0, Lnet/slidingmenu/tools/b/b/i/a;->b:Lorg/apache/http/client/methods/HttpUriRequest;
a=0;//     :try_end_d
a=0;//     .catchall {:try_start_d .. :try_end_d} :catchall_1
a=0;// 
a=0;//     :try_start_e
a=0;//     iget-object v3, p0, Lnet/slidingmenu/tools/b/b/i/a;->c:Lorg/apache/http/client/HttpClient;
a=0;// 
a=0;//     #v3=(Reference,Lorg/apache/http/client/HttpClient;);
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     iget-object v3, p0, Lnet/slidingmenu/tools/b/b/i/a;->c:Lorg/apache/http/client/HttpClient;
a=0;// 
a=0;//     invoke-interface {v3}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v3}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;//     :try_end_e
a=0;//     .catch Ljava/lang/Throwable; {:try_start_e .. :try_end_e} :catch_3
a=0;//     .catchall {:try_start_e .. :try_end_e} :catchall_1
a=0;// 
a=0;//     :cond_6
a=0;//     :goto_6
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :try_start_f
a=0;//     #v3=(Null);
a=0;//     iput-object v3, p0, Lnet/slidingmenu/tools/b/b/i/a;->c:Lorg/apache/http/client/HttpClient;
a=0;//     :try_end_f
a=0;//     .catchall {:try_start_f .. :try_end_f} :catchall_1
a=0;// 
a=0;//     :try_start_10
a=0;//     iget-object v3, p0, Lnet/slidingmenu/tools/b/b/i/a;->d:Lnet/slidingmenu/tools/b/b/i/b;
a=0;// 
a=0;//     #v3=(Reference,Lnet/slidingmenu/tools/b/b/i/b;);
a=0;//     if-eqz v3, :cond_7
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     sub-long v1, v3, v1
a=0;// 
a=0;//     iget-object v3, p0, Lnet/slidingmenu/tools/b/b/i/a;->d:Lnet/slidingmenu/tools/b/b/i/b;
a=0;// 
a=0;//     #v3=(Reference,Lnet/slidingmenu/tools/b/b/i/b;);
a=0;//     invoke-virtual {v3, v1, v2}, Lnet/slidingmenu/tools/b/b/i/b;->a(J)V
a=0;//     :try_end_10
a=0;//     .catch Ljava/lang/Throwable; {:try_start_10 .. :try_end_10} :catch_2
a=0;//     .catchall {:try_start_10 .. :try_end_10} :catchall_1
a=0;// 
a=0;//     :cond_7
a=0;//     :goto_7
a=0;//     :try_start_11
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     throw v0
a=0;//     :try_end_11
a=0;//     .catchall {:try_start_11 .. :try_end_11} :catchall_1
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :catch_2
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_7
a=0;// 
a=0;//     :catch_3
a=0;//     #v1=(LongLo);v3=(Reference,Ujava/lang/Object;);v4=(Uninit);
a=0;//     move-exception v3
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     :catch_4
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_5
a=0;//     #v3=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_6
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_7
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_8
a=0;//     #v1=(LongLo);v2=(LongHi);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_9
a=0;//     move-exception v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected c()V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public abstract d()J
a=0;// .end method
}}
