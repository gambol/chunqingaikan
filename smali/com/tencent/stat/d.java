package com.tencent.stat; class d { void a() { int a;
a=0;// .class Lcom/tencent/stat/d;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static c:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;// .field private static d:J
a=0;// 
a=0;// .field private static e:Lcom/tencent/stat/d;
a=0;// 
a=0;// .field private static f:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;// .field b:Landroid/os/Handler;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {}, Lcom/tencent/stat/common/k;->b()Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     sput-object v0, Lcom/tencent/stat/d;->c:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sput-wide v0, Lcom/tencent/stat/d;->d:J
a=0;// 
a=0;//     sput-object v2, Lcom/tencent/stat/d;->e:Lcom/tencent/stat/d;
a=0;// 
a=0;//     sput-object v2, Lcom/tencent/stat/d;->f:Landroid/content/Context;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/stat/d;);
a=0;//     iput-object v0, p0, Lcom/tencent/stat/d;->a:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/stat/d;->b:Landroid/os/Handler;
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Landroid/os/HandlerThread;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/HandlerThread;);
a=0;//     const-string v1, "StatDispatcher"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/HandlerThread;);
a=0;//     invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/HandlerThread;->getId()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     sput-wide v1, Lcom/tencent/stat/d;->d:J
a=0;// 
a=0;//     new-instance v1, Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v1, p0, Lcom/tencent/stat/d;->b:Landroid/os/Handler;
a=0;// 
a=0;//     new-instance v0, Lorg/apache/http/params/BasicHttpParams;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     invoke-direct {v0}, Lorg/apache/http/params/BasicHttpParams;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     const/16 v1, 0x2710
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-static {v0, v1}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     const/16 v1, 0x2710
a=0;// 
a=0;//     invoke-static {v0, v1}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     new-instance v1, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-direct {v1, v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     iput-object v1, p0, Lcom/tencent/stat/d;->a:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/d;->a:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/stat/e;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/stat/e;);
a=0;//     invoke-direct {v1, p0}, Lcom/tencent/stat/e;-><init>(Lcom/tencent/stat/d;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/e;);
a=0;//     invoke-virtual {v0, v1}, Lorg/apache/http/impl/client/DefaultHttpClient;->setKeepAliveStrategy(Lorg/apache/http/conn/ConnectionKeepAliveStrategy;)V
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->b()Lorg/apache/http/HttpHost;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/d;->a:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     invoke-virtual {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "http.route.default-proxy"
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->b()Lorg/apache/http/HttpHost;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/HttpHost;);
a=0;//     invoke-interface {v0, v1, v2}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lcom/tencent/stat/d;->c:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static a()Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/d;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static a(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     sput-object v0, Lcom/tencent/stat/d;->f:Landroid/content/Context;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static declared-synchronized b()Lcom/tencent/stat/d;
a=0;//     .locals 2
a=0;// 
a=0;//     const-class v1, Lcom/tencent/stat/d;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/tencent/stat/d;->e:Lcom/tencent/stat/d;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/d;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcom/tencent/stat/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/stat/d;);
a=0;//     invoke-direct {v0}, Lcom/tencent/stat/d;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/d;);
a=0;//     sput-object v0, Lcom/tencent/stat/d;->e:Lcom/tencent/stat/d;
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Lcom/tencent/stat/d;->e:Lcom/tencent/stat/d;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c()Lcom/tencent/stat/common/StatLogger;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/d;->c:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method a(Lcom/tencent/stat/a/e;Lcom/tencent/stat/c;)V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1}, Lcom/tencent/stat/a/e;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0, p2}, Lcom/tencent/stat/d;->b(Ljava/util/List;Lcom/tencent/stat/c;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method a(Ljava/util/List;Lcom/tencent/stat/c;)V
a=0;//     .locals 12
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Lcom/tencent/stat/c;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const-wide/16 v10, 0x0
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     const/16 v9, 0xc8
a=0;// 
a=0;//     #v9=(PosShort);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v0, "["
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Integer);
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v2, v0, :cond_1
a=0;// 
a=0;//     invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     if-eq v2, v0, :cond_0
a=0;// 
a=0;//     const-string v0, ","
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     const-string v0, "]"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->getStatReportUrl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v2, Lcom/tencent/stat/d;->c:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "["
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "]Send request("
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "bytes):"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Lcom/tencent/stat/common/StatLogger;->i(Ljava/lang/Object;)V
a=0;// 
a=0;//     new-instance v2, Lorg/apache/http/client/methods/HttpPost;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     invoke-direct {v2, v0}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     const-string v0, "Accept-Encoding"
a=0;// 
a=0;//     const-string v4, "gzip"
a=0;// 
a=0;//     invoke-virtual {v2, v0, v4}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "Connection"
a=0;// 
a=0;//     const-string v4, "Keep-Alive"
a=0;// 
a=0;//     invoke-virtual {v2, v0, v4}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "Cache-Control"
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lorg/apache/http/client/methods/HttpPost;->removeHeaders(Ljava/lang/String;)V
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/d;->f:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/stat/common/k;->a(Landroid/content/Context;)Lorg/apache/http/HttpHost;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/d;->a:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     invoke-virtual {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "http.route.default-proxy"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v5, Lcom/tencent/stat/d;->f:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v5}, Lcom/tencent/stat/common/k;->a(Landroid/content/Context;)Lorg/apache/http/HttpHost;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-interface {v0, v1, v5}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     const-string v0, "X-Online-Host"
a=0;// 
a=0;//     const-string v1, "pingma.qq.com:80"
a=0;// 
a=0;//     invoke-virtual {v2, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "Accept"
a=0;// 
a=0;//     const-string v1, "*/*"
a=0;// 
a=0;//     invoke-virtual {v2, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "Content-Type"
a=0;// 
a=0;//     const-string v1, "json"
a=0;// 
a=0;//     invoke-virtual {v2, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     move v1, v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Boolean);
a=0;//     new-instance v5, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v5}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "UTF-8"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     array-length v6, v0
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/16 v7, 0x100
a=0;// 
a=0;//     #v7=(PosShort);
a=0;//     if-ge v3, v7, :cond_7
a=0;// 
a=0;//     if-nez v4, :cond_6
a=0;// 
a=0;//     const-string v3, "Content-Encoding"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "rc4"
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_1
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-static {v0}, Lcom/tencent/stat/common/e;->a([B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v3, Lorg/apache/http/entity/ByteArrayEntity;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/apache/http/entity/ByteArrayEntity;);
a=0;//     invoke-direct {v3, v0}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V
a=0;// 
a=0;//     #v3=(Reference,Lorg/apache/http/entity/ByteArrayEntity;);
a=0;//     invoke-virtual {v2, v3}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/d;->a:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/d;->a:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     invoke-virtual {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "http.route.default-proxy"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1}, Lorg/apache/http/params/HttpParams;->removeParameter(Ljava/lang/String;)Z
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     invoke-interface {v2}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v2}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/StatusLine;);
a=0;//     invoke-interface {v1}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContentLength()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     sget-object v6, Lcom/tencent/stat/d;->c:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v6=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "recv response status code:"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, ", content length:"
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Lcom/tencent/stat/common/StatLogger;->i(Ljava/lang/Object;)V
a=0;// 
a=0;//     cmp-long v6, v3, v10
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-nez v6, :cond_a
a=0;// 
a=0;//     invoke-static {v0}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;)Ljava/lang/String;
a=0;// 
a=0;//     if-ne v1, v9, :cond_9
a=0;// 
a=0;//     if-eqz p2, :cond_4
a=0;// 
a=0;//     invoke-interface {p2}, Lcom/tencent/stat/c;->a()V
a=0;// 
a=0;//     :cond_4
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_3
a=0;//     #v5=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_6
a=0;//     #v1=(Boolean);v2=(Reference,Lorg/apache/http/client/methods/HttpPost;);v3=(Integer);v4=(Reference,Lorg/apache/http/HttpHost;);v5=(Reference,Ljava/io/ByteArrayOutputStream;);v6=(Integer);v7=(PosShort);v8=(Uninit);
a=0;//     const-string v3, "X-Content-Encoding"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "rc4"
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lcom/tencent/stat/d;->c:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     if-eqz p2, :cond_5
a=0;// 
a=0;//     :try_start_2
a=0;//     invoke-interface {p2}, Lcom/tencent/stat/c;->b()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_3
a=0;//     sget-object v1, Lcom/tencent/stat/d;->c:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_7
a=0;//     #v1=(Boolean);v2=(Reference,Lorg/apache/http/client/methods/HttpPost;);v3=(Integer);v4=(Reference,Lorg/apache/http/HttpHost;);v5=(Reference,Ljava/io/ByteArrayOutputStream;);v6=(Integer);v7=(PosShort);v8=(Uninit);
a=0;//     if-nez v4, :cond_8
a=0;// 
a=0;//     :try_start_4
a=0;//     const-string v3, "Content-Encoding"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "rc4,gzip"
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_4
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [B
a=0;// 
a=0;//     #v3=(Reference,[B);
a=0;//     invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     new-instance v3, Ljava/util/zip/GZIPOutputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/zip/GZIPOutputStream;);
a=0;//     invoke-direct {v3, v5}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/zip/GZIPOutputStream;);
a=0;//     invoke-virtual {v3, v0}, Ljava/util/zip/GZIPOutputStream;->write([B)V
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/zip/GZIPOutputStream;->close()V
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x4
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-static {v0, v3, v4}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     invoke-virtual {v3, v6}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     sget-object v3, Lcom/tencent/stat/d;->c:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "before Gzip:"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v6, " bytes, after Gzip:"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     array-length v6, v0
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v6, " bytes"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcom/tencent/stat/common/StatLogger;->d(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_8
a=0;//     #v3=(Integer);v6=(Integer);v7=(PosShort);
a=0;//     const-string v3, "X-Content-Encoding"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "rc4,gzip"
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_9
a=0;//     #v1=(Integer);v3=(LongLo);v4=(LongHi);v6=(Byte);v7=(Reference,Ljava/lang/String;);v8=(Reference,Ljava/lang/String;);
a=0;//     sget-object v0, Lcom/tencent/stat/d;->c:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Server response error code:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_a
a=0;//     #v1=(Integer);v3=(LongLo);
a=0;//     cmp-long v3, v3, v10
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_13
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/InputStream;);
a=0;//     new-instance v4, Ljava/io/DataInputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/DataInputStream;);
a=0;//     invoke-direct {v4, v3}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/DataInputStream;);
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContentLength()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     long-to-int v0, v6
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-virtual {v4, v0}, Ljava/io/DataInputStream;->readFully([B)V
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/DataInputStream;->close()V
a=0;// 
a=0;//     const-string v4, "Content-Encoding"
a=0;// 
a=0;//     invoke-interface {v2, v4}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_b
a=0;// 
a=0;//     invoke-interface {v2}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v6, "gzip,rc4"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_f
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/stat/common/k;->a([B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/stat/common/e;->b([B)[B
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_b
a=0;//     :goto_5
a=0;//     #v2=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     if-ne v1, v9, :cond_12
a=0;// 
a=0;//     :try_start_5
a=0;//     new-instance v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/String;);
a=0;//     const-string v2, "UTF-8"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v0, Lcom/tencent/stat/d;->c:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->d(Ljava/lang/Object;)V
a=0;// 
a=0;//     new-instance v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v2, "cfg"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_c
a=0;// 
a=0;//     const-string v2, "cfg"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/tencent/stat/StatConfig;->a(Lorg/json/JSONObject;)V
a=0;// 
a=0;//     :cond_c
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "et"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_d
a=0;// 
a=0;//     const-string v2, "st"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_d
a=0;// 
a=0;//     sget-object v2, Lcom/tencent/stat/d;->c:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "get mid respone:"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Lcom/tencent/stat/common/StatLogger;->d(Ljava/lang/Object;)V
a=0;// 
a=0;//     const-string v1, "et"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sget-object v2, Lcom/tencent/stat/a/f;->b:Lcom/tencent/stat/a/f;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/stat/a/f;->a()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v1, v2, :cond_d
a=0;// 
a=0;//     const-string v1, "st"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/d;->c:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "error type for st:"
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_2
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     :cond_d
a=0;//     :goto_6
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz p2, :cond_e
a=0;// 
a=0;//     :try_start_6
a=0;//     invoke-interface {p2}, Lcom/tencent/stat/c;->a()V
a=0;// 
a=0;//     :cond_e
a=0;//     :goto_7
a=0;//     invoke-virtual {v3}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_f
a=0;//     #v1=(Integer);v2=(Reference,Lorg/apache/http/Header;);v4=(Boolean);v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "rc4,gzip"
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_10
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/stat/common/e;->b([B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/stat/common/k;->a([B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     :cond_10
a=0;//     invoke-interface {v2}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "gzip"
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_11
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/stat/common/k;->a([B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     :cond_11
a=0;//     invoke-interface {v2}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v4, "rc4"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_b
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/stat/common/e;->b([B)[B
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_0
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     :pswitch_0
a=0;//     :try_start_7
a=0;//     #v2=(Integer);
a=0;//     const-string v1, "mid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_d
a=0;// 
a=0;//     sget-object v1, Lcom/tencent/stat/d;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "mid"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/tencent/stat/StatMid;->updateDeviceInfo(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_2
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_0
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_8
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v1, Lcom/tencent/stat/d;->c:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->i(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     :cond_12
a=0;//     #v1=(Integer);
a=0;//     sget-object v2, Lcom/tencent/stat/d;->c:Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "Server response error code:"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, ", error:"
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v4, Ljava/lang/String;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/String;);
a=0;//     const-string v6, "UTF-8"
a=0;// 
a=0;//     invoke-direct {v4, v0, v6}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     :cond_13
a=0;//     #v1=(Integer);v3=(Byte);v4=(LongHi);v6=(Byte);v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;)Ljava/lang/String;
a=0;//     :try_end_8
a=0;//     .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_0
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_0
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch -0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method b(Ljava/util/List;Lcom/tencent/stat/c;)V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Lcom/tencent/stat/c;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/d;->b:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/os/Handler;);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/stat/d;->b:Landroid/os/Handler;
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/stat/f;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/stat/f;);
a=0;//     invoke-direct {v1, p0, p1, p2}, Lcom/tencent/stat/f;-><init>(Lcom/tencent/stat/d;Ljava/util/List;Lcom/tencent/stat/c;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/f;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
