package com.lidroid.xutils.http; class SyncHttpHandler { void a() { int a;
a=0;// .class public Lcom/lidroid/xutils/http/SyncHttpHandler;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SyncHttpHandler.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private charset:Ljava/lang/String;
a=0;// 
a=0;// .field private final client:Lorg/apache/http/impl/client/AbstractHttpClient;
a=0;// 
a=0;// .field private final context:Lorg/apache/http/protocol/HttpContext;
a=0;// 
a=0;// .field private expiry:J
a=0;// 
a=0;// .field private httpRedirectHandler:Lcom/lidroid/xutils/http/callback/HttpRedirectHandler;
a=0;// 
a=0;// .field private requestMethod:Ljava/lang/String;
a=0;// 
a=0;// .field private requestUrl:Ljava/lang/String;
a=0;// 
a=0;// .field private retriedTimes:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lorg/apache/http/impl/client/AbstractHttpClient;Lorg/apache/http/protocol/HttpContext;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "client"    # Lorg/apache/http/impl/client/AbstractHttpClient;
a=0;//     .param p2, "context"    # Lorg/apache/http/protocol/HttpContext;
a=0;//     .param p3, "charset"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 47
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/SyncHttpHandler;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/lidroid/xutils/http/SyncHttpHandler;->retriedTimes:I
a=0;// 
a=0;//     .line 56
a=0;//     invoke-static {}, Lcom/lidroid/xutils/http/HttpCache;->getDefaultExpiryTime()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/lidroid/xutils/http/SyncHttpHandler;->expiry:J
a=0;// 
a=0;//     .line 50
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/SyncHttpHandler;->client:Lorg/apache/http/impl/client/AbstractHttpClient;
a=0;// 
a=0;//     .line 51
a=0;//     iput-object p2, p0, Lcom/lidroid/xutils/http/SyncHttpHandler;->context:Lorg/apache/http/protocol/HttpContext;
a=0;// 
a=0;//     .line 52
a=0;//     iput-object p3, p0, Lcom/lidroid/xutils/http/SyncHttpHandler;->charset:Ljava/lang/String;
a=0;// 
a=0;//     .line 53
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private handleResponse(Lorg/apache/http/HttpResponse;)Lcom/lidroid/xutils/http/ResponseStream;
a=0;//     .locals 9
a=0;//     .param p1, "response"    # Lorg/apache/http/HttpResponse;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/lidroid/xutils/exception/HttpException;,
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 105
a=0;//     new-instance v1, Lcom/lidroid/xutils/exception/HttpException;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/lidroid/xutils/exception/HttpException;);
a=0;//     const-string v2, "response is null"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Lcom/lidroid/xutils/exception/HttpException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/exception/HttpException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 107
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 108
a=0;//     .local v7, "status":Lorg/apache/http/StatusLine;
a=0;//     #v7=(Reference,Lorg/apache/http/StatusLine;);
a=0;//     invoke-interface {v7}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 109
a=0;//     .local v8, "statusCode":I
a=0;//     #v8=(Integer);
a=0;//     const/16 v1, 0x12c
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     if-ge v8, v1, :cond_1
a=0;// 
a=0;//     .line 110
a=0;//     new-instance v0, Lcom/lidroid/xutils/http/ResponseStream;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/http/ResponseStream;);
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/SyncHttpHandler;->charset:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/http/SyncHttpHandler;->requestUrl:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-wide v4, p0, Lcom/lidroid/xutils/http/SyncHttpHandler;->expiry:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/HttpResponse;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/lidroid/xutils/http/ResponseStream;-><init>(Lorg/apache/http/HttpResponse;Ljava/lang/String;Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 111
a=0;//     .local v0, "responseStream":Lcom/lidroid/xutils/http/ResponseStream;
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/ResponseStream;);
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/http/SyncHttpHandler;->requestMethod:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/lidroid/xutils/http/ResponseStream;->setRequestMethod(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 126
a=0;//     .end local v0    # "responseStream":Lcom/lidroid/xutils/http/ResponseStream;
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 113
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(PosShort);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     const/16 v1, 0x12d
a=0;// 
a=0;//     if-eq v8, v1, :cond_2
a=0;// 
a=0;//     const/16 v1, 0x12e
a=0;// 
a=0;//     if-ne v8, v1, :cond_4
a=0;// 
a=0;//     .line 114
a=0;//     :cond_2
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/http/SyncHttpHandler;->httpRedirectHandler:Lcom/lidroid/xutils/http/callback/HttpRedirectHandler;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/callback/HttpRedirectHandler;);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 115
a=0;//     new-instance v1, Lcom/lidroid/xutils/http/callback/DefaultHttpRedirectHandler;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/lidroid/xutils/http/callback/DefaultHttpRedirectHandler;);
a=0;//     invoke-direct {v1}, Lcom/lidroid/xutils/http/callback/DefaultHttpRedirectHandler;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/callback/DefaultHttpRedirectHandler;);
a=0;//     iput-object v1, p0, Lcom/lidroid/xutils/http/SyncHttpHandler;->httpRedirectHandler:Lcom/lidroid/xutils/http/callback/HttpRedirectHandler;
a=0;// 
a=0;//     .line 117
a=0;//     :cond_3
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/http/SyncHttpHandler;->httpRedirectHandler:Lcom/lidroid/xutils/http/callback/HttpRedirectHandler;
a=0;// 
a=0;//     invoke-interface {v1, p1}, Lcom/lidroid/xutils/http/callback/HttpRedirectHandler;->getDirectRequest(Lorg/apache/http/HttpResponse;)Lorg/apache/http/client/methods/HttpRequestBase;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 118
a=0;//     .local v6, "request":Lorg/apache/http/client/methods/HttpRequestBase;
a=0;//     #v6=(Reference,Lorg/apache/http/client/methods/HttpRequestBase;);
a=0;//     if-eqz v6, :cond_6
a=0;// 
a=0;//     .line 119
a=0;//     invoke-virtual {p0, v6}, Lcom/lidroid/xutils/http/SyncHttpHandler;->sendRequest(Lorg/apache/http/client/methods/HttpRequestBase;)Lcom/lidroid/xutils/http/ResponseStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/ResponseStream;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 121
a=0;//     .end local v6    # "request":Lorg/apache/http/client/methods/HttpRequestBase;
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v1=(PosShort);v6=(Uninit);
a=0;//     const/16 v1, 0x1a0
a=0;// 
a=0;//     if-ne v8, v1, :cond_5
a=0;// 
a=0;//     .line 122
a=0;//     new-instance v1, Lcom/lidroid/xutils/exception/HttpException;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/lidroid/xutils/exception/HttpException;);
a=0;//     const-string v2, "maybe the file has downloaded completely"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v8, v2}, Lcom/lidroid/xutils/exception/HttpException;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/exception/HttpException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 124
a=0;//     :cond_5
a=0;//     #v1=(PosShort);v2=(Uninit);
a=0;//     new-instance v1, Lcom/lidroid/xutils/exception/HttpException;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/lidroid/xutils/exception/HttpException;);
a=0;//     invoke-interface {v7}, Lorg/apache/http/StatusLine;->getReasonPhrase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v8, v2}, Lcom/lidroid/xutils/exception/HttpException;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/exception/HttpException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 126
a=0;//     .restart local v6    # "request":Lorg/apache/http/client/methods/HttpRequestBase;
a=0;//     :cond_6
a=0;//     #v2=(Uninit);v6=(Reference,Lorg/apache/http/client/methods/HttpRequestBase;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public sendRequest(Lorg/apache/http/client/methods/HttpRequestBase;)Lcom/lidroid/xutils/http/ResponseStream;
a=0;//     .locals 8
a=0;//     .param p1, "request"    # Lorg/apache/http/client/methods/HttpRequestBase;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/lidroid/xutils/exception/HttpException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     iget-object v6, p0, Lcom/lidroid/xutils/http/SyncHttpHandler;->client:Lorg/apache/http/impl/client/AbstractHttpClient;
a=0;// 
a=0;//     #v6=(Reference,Lorg/apache/http/impl/client/AbstractHttpClient;);
a=0;//     invoke-virtual {v6}, Lorg/apache/http/impl/client/AbstractHttpClient;->getHttpRequestRetryHandler()Lorg/apache/http/client/HttpRequestRetryHandler;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 66
a=0;//     .local v5, "retryHandler":Lorg/apache/http/client/HttpRequestRetryHandler;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Reference,Lorg/apache/http/client/HttpRequestRetryHandler;);v6=(Conflicted);v7=(Conflicted);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 67
a=0;//     .local v4, "retry":Z
a=0;//     #v4=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 69
a=0;//     .local v1, "exception":Ljava/io/IOException;
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1}, Lorg/apache/http/client/methods/HttpRequestBase;->getURI()Ljava/net/URI;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/net/URI;);
a=0;//     invoke-virtual {v6}, Ljava/net/URI;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iput-object v6, p0, Lcom/lidroid/xutils/http/SyncHttpHandler;->requestUrl:Ljava/lang/String;
a=0;// 
a=0;//     .line 70
a=0;//     invoke-virtual {p1}, Lorg/apache/http/client/methods/HttpRequestBase;->getMethod()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iput-object v6, p0, Lcom/lidroid/xutils/http/SyncHttpHandler;->requestMethod:Ljava/lang/String;
a=0;// 
a=0;//     .line 71
a=0;//     sget-object v6, Lcom/lidroid/xutils/HttpUtils;->sHttpCache:Lcom/lidroid/xutils/http/HttpCache;
a=0;// 
a=0;//     iget-object v7, p0, Lcom/lidroid/xutils/http/SyncHttpHandler;->requestMethod:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Lcom/lidroid/xutils/http/HttpCache;->isEnabled(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 72
a=0;//     sget-object v6, Lcom/lidroid/xutils/HttpUtils;->sHttpCache:Lcom/lidroid/xutils/http/HttpCache;
a=0;// 
a=0;//     #v6=(Reference,Lcom/lidroid/xutils/http/HttpCache;);
a=0;//     iget-object v7, p0, Lcom/lidroid/xutils/http/SyncHttpHandler;->requestUrl:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Lcom/lidroid/xutils/http/HttpCache;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 73
a=0;//     .local v3, "result":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 74
a=0;//     new-instance v6, Lcom/lidroid/xutils/http/ResponseStream;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/lidroid/xutils/http/ResponseStream;);
a=0;//     invoke-direct {v6, v3}, Lcom/lidroid/xutils/http/ResponseStream;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 79
a=0;//     .end local v3    # "result":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v6=(Reference,Lcom/lidroid/xutils/http/ResponseStream;);
a=0;//     return-object v6
a=0;// 
a=0;//     .line 78
a=0;//     :cond_1
a=0;//     #v6=(Conflicted);
a=0;//     iget-object v6, p0, Lcom/lidroid/xutils/http/SyncHttpHandler;->client:Lorg/apache/http/impl/client/AbstractHttpClient;
a=0;// 
a=0;//     #v6=(Reference,Lorg/apache/http/impl/client/AbstractHttpClient;);
a=0;//     iget-object v7, p0, Lcom/lidroid/xutils/http/SyncHttpHandler;->context:Lorg/apache/http/protocol/HttpContext;
a=0;// 
a=0;//     invoke-virtual {v6, p1, v7}, Lorg/apache/http/impl/client/AbstractHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 79
a=0;//     .local v2, "response":Lorg/apache/http/HttpResponse;
a=0;//     #v2=(Reference,Lorg/apache/http/HttpResponse;);
a=0;//     invoke-direct {p0, v2}, Lcom/lidroid/xutils/http/SyncHttpHandler;->handleResponse(Lorg/apache/http/HttpResponse;)Lcom/lidroid/xutils/http/ResponseStream;
a=0;//     :try_end_0
a=0;//     .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_2
a=0;//     .catch Lcom/lidroid/xutils/exception/HttpException; {:try_start_0 .. :try_end_0} :catch_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_4
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 80
a=0;//     .end local v2    # "response":Lorg/apache/http/HttpResponse;
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 81
a=0;//     .local v0, "e":Ljava/net/UnknownHostException;
a=0;//     #v0=(Reference,Ljava/net/UnknownHostException;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 82
a=0;//     #v1=(Reference,Ljava/net/UnknownHostException;);
a=0;//     iget v6, p0, Lcom/lidroid/xutils/http/SyncHttpHandler;->retriedTimes:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     iput v6, p0, Lcom/lidroid/xutils/http/SyncHttpHandler;->retriedTimes:I
a=0;// 
a=0;//     iget-object v7, p0, Lcom/lidroid/xutils/http/SyncHttpHandler;->context:Lorg/apache/http/protocol/HttpContext;
a=0;// 
a=0;//     #v7=(Reference,Lorg/apache/http/protocol/HttpContext;);
a=0;//     invoke-interface {v5, v1, v6, v7}, Lorg/apache/http/client/HttpRequestRetryHandler;->retryRequest(Ljava/io/IOException;ILorg/apache/http/protocol/HttpContext;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 97
a=0;//     .end local v0    # "e":Ljava/net/UnknownHostException;
a=0;//     :goto_1
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 98
a=0;//     new-instance v6, Lcom/lidroid/xutils/exception/HttpException;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/lidroid/xutils/exception/HttpException;);
a=0;//     invoke-direct {v6, v1}, Lcom/lidroid/xutils/exception/HttpException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v6=(Reference,Lcom/lidroid/xutils/exception/HttpException;);
a=0;//     throw v6
a=0;// 
a=0;//     .line 83
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Null);v4=(One);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 84
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 85
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     iget v6, p0, Lcom/lidroid/xutils/http/SyncHttpHandler;->retriedTimes:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     iput v6, p0, Lcom/lidroid/xutils/http/SyncHttpHandler;->retriedTimes:I
a=0;// 
a=0;//     iget-object v7, p0, Lcom/lidroid/xutils/http/SyncHttpHandler;->context:Lorg/apache/http/protocol/HttpContext;
a=0;// 
a=0;//     #v7=(Reference,Lorg/apache/http/protocol/HttpContext;);
a=0;//     invoke-interface {v5, v1, v6, v7}, Lorg/apache/http/client/HttpRequestRetryHandler;->retryRequest(Ljava/io/IOException;ILorg/apache/http/protocol/HttpContext;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 86
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v1=(Null);v4=(One);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 87
a=0;//     .local v0, "e":Ljava/lang/NullPointerException;
a=0;//     #v0=(Reference,Ljava/lang/NullPointerException;);
a=0;//     new-instance v1, Ljava/io/IOException;
a=0;// 
a=0;//     .end local v1    # "exception":Ljava/io/IOException;
a=0;//     #v1=(UninitRef,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/lang/NullPointerException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v6}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 88
a=0;//     .restart local v1    # "exception":Ljava/io/IOException;
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1, v0}, Ljava/io/IOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
a=0;// 
a=0;//     .line 89
a=0;//     iget v6, p0, Lcom/lidroid/xutils/http/SyncHttpHandler;->retriedTimes:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     iput v6, p0, Lcom/lidroid/xutils/http/SyncHttpHandler;->retriedTimes:I
a=0;// 
a=0;//     iget-object v7, p0, Lcom/lidroid/xutils/http/SyncHttpHandler;->context:Lorg/apache/http/protocol/HttpContext;
a=0;// 
a=0;//     #v7=(Reference,Lorg/apache/http/protocol/HttpContext;);
a=0;//     invoke-interface {v5, v1, v6, v7}, Lorg/apache/http/client/HttpRequestRetryHandler;->retryRequest(Ljava/io/IOException;ILorg/apache/http/protocol/HttpContext;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 90
a=0;//     .end local v0    # "e":Ljava/lang/NullPointerException;
a=0;//     :catch_3
a=0;//     #v0=(Conflicted);v1=(Null);v4=(One);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 91
a=0;//     .local v0, "e":Lcom/lidroid/xutils/exception/HttpException;
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/exception/HttpException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 92
a=0;//     .end local v0    # "e":Lcom/lidroid/xutils/exception/HttpException;
a=0;//     :catch_4
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 93
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     new-instance v1, Ljava/io/IOException;
a=0;// 
a=0;//     .end local v1    # "exception":Ljava/io/IOException;
a=0;//     #v1=(UninitRef,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v6}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 94
a=0;//     .restart local v1    # "exception":Ljava/io/IOException;
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1, v0}, Ljava/io/IOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
a=0;// 
a=0;//     .line 95
a=0;//     iget v6, p0, Lcom/lidroid/xutils/http/SyncHttpHandler;->retriedTimes:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     iput v6, p0, Lcom/lidroid/xutils/http/SyncHttpHandler;->retriedTimes:I
a=0;// 
a=0;//     iget-object v7, p0, Lcom/lidroid/xutils/http/SyncHttpHandler;->context:Lorg/apache/http/protocol/HttpContext;
a=0;// 
a=0;//     #v7=(Reference,Lorg/apache/http/protocol/HttpContext;);
a=0;//     invoke-interface {v5, v1, v6, v7}, Lorg/apache/http/client/HttpRequestRetryHandler;->retryRequest(Ljava/io/IOException;ILorg/apache/http/protocol/HttpContext;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public setExpiry(J)V
a=0;//     .locals 0
a=0;//     .param p1, "expiry"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     iput-wide p1, p0, Lcom/lidroid/xutils/http/SyncHttpHandler;->expiry:J
a=0;// 
a=0;//     .line 60
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setHttpRedirectHandler(Lcom/lidroid/xutils/http/callback/HttpRedirectHandler;)V
a=0;//     .locals 0
a=0;//     .param p1, "httpRedirectHandler"    # Lcom/lidroid/xutils/http/callback/HttpRedirectHandler;
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/SyncHttpHandler;->httpRedirectHandler:Lcom/lidroid/xutils/http/callback/HttpRedirectHandler;
a=0;// 
a=0;//     .line 41
a=0;//     return-void
a=0;// .end method
}}
