package com.lidroid.xutils.http.client; class RetryHandler { void a() { int a;
a=0;// .class public Lcom/lidroid/xutils/http/client/RetryHandler;
a=0;// .super Ljava/lang/Object;
a=0;// .source "RetryHandler.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lorg/apache/http/client/HttpRequestRetryHandler;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final RETRY_SLEEP_INTERVAL:I = 0x1f4
a=0;// 
a=0;// .field private static exceptionBlackList:Ljava/util/HashSet;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashSet",
a=0;//             "<",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private static exceptionWhiteList:Ljava/util/HashSet;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashSet",
a=0;//             "<",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final maxRetries:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     new-instance v0, Ljava/util/HashSet;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashSet;);
a=0;//     invoke-direct {v0}, Ljava/util/HashSet;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashSet;);
a=0;//     sput-object v0, Lcom/lidroid/xutils/http/client/RetryHandler;->exceptionWhiteList:Ljava/util/HashSet;
a=0;// 
a=0;//     .line 40
a=0;//     new-instance v0, Ljava/util/HashSet;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashSet;);
a=0;//     invoke-direct {v0}, Ljava/util/HashSet;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashSet;);
a=0;//     sput-object v0, Lcom/lidroid/xutils/http/client/RetryHandler;->exceptionBlackList:Ljava/util/HashSet;
a=0;// 
a=0;//     .line 43
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/client/RetryHandler;->exceptionWhiteList:Ljava/util/HashSet;
a=0;// 
a=0;//     const-class v1, Lorg/apache/http/NoHttpResponseException;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 44
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/client/RetryHandler;->exceptionWhiteList:Ljava/util/HashSet;
a=0;// 
a=0;//     const-class v1, Ljava/net/UnknownHostException;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 45
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/client/RetryHandler;->exceptionWhiteList:Ljava/util/HashSet;
a=0;// 
a=0;//     const-class v1, Ljava/net/SocketException;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 47
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/client/RetryHandler;->exceptionBlackList:Ljava/util/HashSet;
a=0;// 
a=0;//     const-class v1, Ljava/io/InterruptedIOException;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 48
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/client/RetryHandler;->exceptionBlackList:Ljava/util/HashSet;
a=0;// 
a=0;//     const-class v1, Ljavax/net/ssl/SSLHandshakeException;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 34
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(I)V
a=0;//     .locals 0
a=0;//     .param p1, "maxRetries"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 54
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/RetryHandler;);
a=0;//     iput p1, p0, Lcom/lidroid/xutils/http/client/RetryHandler;->maxRetries:I
a=0;// 
a=0;//     .line 55
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public retryRequest(Ljava/io/IOException;ILorg/apache/http/protocol/HttpContext;)Z
a=0;//     .locals 10
a=0;//     .param p1, "exception"    # Ljava/io/IOException;
a=0;//     .param p2, "retriedTimes"    # I
a=0;//     .param p3, "context"    # Lorg/apache/http/protocol/HttpContext;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 59
a=0;//     #v7=(Null);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 61
a=0;//     .local v6, "retry":Z
a=0;//     #v6=(One);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     if-nez p3, :cond_1
a=0;// 
a=0;//     .line 103
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Boolean);v7=(Boolean);v8=(Conflicted);v9=(Conflicted);
a=0;//     return v7
a=0;// 
a=0;//     .line 65
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(One);v7=(Null);v8=(Uninit);v9=(Uninit);
a=0;//     const-string v8, "http.request_sent"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p3, v8}, Lorg/apache/http/protocol/HttpContext;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 66
a=0;//     .local v3, "isReqSent":Ljava/lang/Object;
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v3, :cond_5
a=0;// 
a=0;//     .line 68
a=0;//     .end local v3    # "isReqSent":Ljava/lang/Object;
a=0;//     .local v7, "sent":Z
a=0;//     :goto_1
a=0;//     #v7=(Boolean);
a=0;//     iget v8, p0, Lcom/lidroid/xutils/http/client/RetryHandler;->maxRetries:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-le p2, v8, :cond_6
a=0;// 
a=0;//     .line 69
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 78
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v6=(Boolean);v9=(Conflicted);
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     .line 80
a=0;//     :try_start_0
a=0;//     const-string v8, "http.request"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p3, v8}, Lorg/apache/http/protocol/HttpContext;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 81
a=0;//     .local v1, "currRequest":Ljava/lang/Object;
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v1, :cond_a
a=0;// 
a=0;//     .line 82
a=0;//     instance-of v8, v1, Lorg/apache/http/client/methods/HttpRequestBase;
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_9
a=0;// 
a=0;//     .line 83
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lorg/apache/http/client/methods/HttpRequestBase;
a=0;// 
a=0;//     move-object v4, v0
a=0;// 
a=0;//     .line 84
a=0;//     .local v4, "requestBase":Lorg/apache/http/client/methods/HttpRequestBase;
a=0;//     #v4=(Reference,Lorg/apache/http/client/methods/HttpRequestBase;);
a=0;//     const-string v8, "GET"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4}, Lorg/apache/http/client/methods/HttpRequestBase;->getMethod()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 99
a=0;//     .end local v1    # "currRequest":Ljava/lang/Object;
a=0;//     .end local v4    # "requestBase":Lorg/apache/http/client/methods/HttpRequestBase;
a=0;//     :cond_3
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     .line 100
a=0;//     const-wide/16 v8, 0x1f4
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     invoke-static {v8, v9}, Landroid/os/SystemClock;->sleep(J)V
a=0;// 
a=0;//     :cond_4
a=0;//     #v8=(Conflicted);v9=(Conflicted);
a=0;//     move v7, v6
a=0;// 
a=0;//     .line 103
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 66
a=0;//     .end local v7    # "sent":Z
a=0;//     .restart local v3    # "isReqSent":Ljava/lang/Object;
a=0;//     :cond_5
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(One);v7=(Null);v8=(Reference,Ljava/lang/String;);v9=(Uninit);
a=0;//     check-cast v3, Ljava/lang/Boolean;
a=0;// 
a=0;//     .end local v3    # "isReqSent":Ljava/lang/Object;
a=0;//     invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 70
a=0;//     .restart local v7    # "sent":Z
a=0;//     :cond_6
a=0;//     #v8=(Integer);
a=0;//     sget-object v8, Lcom/lidroid/xutils/http/client/RetryHandler;->exceptionBlackList:Ljava/util/HashSet;
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/HashSet;);
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v8, v9}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_7
a=0;// 
a=0;//     .line 71
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 72
a=0;//     :cond_7
a=0;//     #v6=(One);
a=0;//     sget-object v8, Lcom/lidroid/xutils/http/client/RetryHandler;->exceptionWhiteList:Ljava/util/HashSet;
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/HashSet;);
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_8
a=0;// 
a=0;//     .line 73
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 74
a=0;//     :cond_8
a=0;//     if-nez v7, :cond_2
a=0;// 
a=0;//     .line 75
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 85
a=0;//     .restart local v1    # "currRequest":Ljava/lang/Object;
a=0;//     :cond_9
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/lang/Object;);v6=(Boolean);v9=(Conflicted);
a=0;//     instance-of v8, v1, Lorg/apache/http/impl/client/RequestWrapper;
a=0;// 
a=0;//     if-eqz v8, :cond_3
a=0;// 
a=0;//     .line 86
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lorg/apache/http/impl/client/RequestWrapper;
a=0;// 
a=0;//     move-object v5, v0
a=0;// 
a=0;//     .line 87
a=0;//     .local v5, "requestWrapper":Lorg/apache/http/impl/client/RequestWrapper;
a=0;//     #v5=(Reference,Lorg/apache/http/impl/client/RequestWrapper;);
a=0;//     const-string v8, "GET"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5}, Lorg/apache/http/impl/client/RequestWrapper;->getMethod()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 90
a=0;//     .end local v5    # "requestWrapper":Lorg/apache/http/impl/client/RequestWrapper;
a=0;//     :cond_a
a=0;//     #v0=(Uninit);v5=(Uninit);v9=(Conflicted);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 91
a=0;//     #v6=(Null);
a=0;//     const-string v8, "retry error, curr request is null"
a=0;// 
a=0;//     invoke-static {v8}, Lcom/lidroid/xutils/util/LogUtils;->e(Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 93
a=0;//     .end local v1    # "currRequest":Ljava/lang/Object;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Boolean);v8=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 94
a=0;//     .local v2, "e":Ljava/lang/Throwable;
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 95
a=0;//     #v6=(Null);
a=0;//     const-string v8, "retry error"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8, v2}, Lcom/lidroid/xutils/util/LogUtils;->e(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
}}
