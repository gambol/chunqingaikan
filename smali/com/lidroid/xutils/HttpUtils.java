package com.lidroid.xutils; class HttpUtils { void a() { int a;
a=0;// .class public Lcom/lidroid/xutils/HttpUtils;
a=0;// .super Ljava/lang/Object;
a=0;// .source "HttpUtils.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DEFAULT_CONN_TIMEOUT:I = 0x3a98
a=0;// 
a=0;// .field private static final DEFAULT_RETRY_TIMES:I = 0x5
a=0;// 
a=0;// .field private static final ENCODING_GZIP:Ljava/lang/String; = "gzip"
a=0;// 
a=0;// .field private static final HEADER_ACCEPT_ENCODING:Ljava/lang/String; = "Accept-Encoding"
a=0;// 
a=0;// .field private static executor:Ljava/util/concurrent/Executor;
a=0;// 
a=0;// .field public static final sHttpCache:Lcom/lidroid/xutils/http/HttpCache;
a=0;// 
a=0;// .field private static final sThreadFactory:Ljava/util/concurrent/ThreadFactory;
a=0;// 
a=0;// .field private static threadPoolSize:I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private currentRequestExpiry:J
a=0;// 
a=0;// .field private final httpClient:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;// .field private final httpContext:Lorg/apache/http/protocol/HttpContext;
a=0;// 
a=0;// .field private httpRedirectHandler:Lcom/lidroid/xutils/http/callback/HttpRedirectHandler;
a=0;// 
a=0;// .field private responseTextCharset:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     new-instance v0, Lcom/lidroid/xutils/http/HttpCache;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/http/HttpCache;);
a=0;//     invoke-direct {v0}, Lcom/lidroid/xutils/http/HttpCache;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/HttpCache;);
a=0;//     sput-object v0, Lcom/lidroid/xutils/HttpUtils;->sHttpCache:Lcom/lidroid/xutils/http/HttpCache;
a=0;// 
a=0;//     .line 131
a=0;//     new-instance v0, Lcom/lidroid/xutils/HttpUtils$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/HttpUtils$1;);
a=0;//     invoke-direct {v0}, Lcom/lidroid/xutils/HttpUtils$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/HttpUtils$1;);
a=0;//     sput-object v0, Lcom/lidroid/xutils/HttpUtils;->sThreadFactory:Ljava/util/concurrent/ThreadFactory;
a=0;// 
a=0;//     .line 142
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     sput v0, Lcom/lidroid/xutils/HttpUtils;->threadPoolSize:I
a=0;// 
a=0;//     .line 144
a=0;//     sget v0, Lcom/lidroid/xutils/HttpUtils;->threadPoolSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget-object v1, Lcom/lidroid/xutils/HttpUtils;->sThreadFactory:Ljava/util/concurrent/ThreadFactory;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/ThreadFactory;);
a=0;//     invoke-static {v0, v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ExecutorService;);
a=0;//     sput-object v0, Lcom/lidroid/xutils/HttpUtils;->executor:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     .line 54
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     const/16 v0, 0x3a98
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-direct {p0, v0}, Lcom/lidroid/xutils/HttpUtils;-><init>(I)V
a=0;// 
a=0;//     .line 65
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/HttpUtils;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(I)V
a=0;//     .locals 6
a=0;//     .param p1, "connTimeout"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v4, 0xa
a=0;// 
a=0;//     .line 67
a=0;//     #v4=(PosByte);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 59
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/HttpUtils;);
a=0;//     new-instance v2, Lorg/apache/http/protocol/BasicHttpContext;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/protocol/BasicHttpContext;);
a=0;//     invoke-direct {v2}, Lorg/apache/http/protocol/BasicHttpContext;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/protocol/BasicHttpContext;);
a=0;//     iput-object v2, p0, Lcom/lidroid/xutils/HttpUtils;->httpContext:Lorg/apache/http/protocol/HttpContext;
a=0;// 
a=0;//     .line 120
a=0;//     const-string v2, "UTF-8"
a=0;// 
a=0;//     iput-object v2, p0, Lcom/lidroid/xutils/HttpUtils;->responseTextCharset:Ljava/lang/String;
a=0;// 
a=0;//     .line 122
a=0;//     invoke-static {}, Lcom/lidroid/xutils/http/HttpCache;->getDefaultExpiryTime()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iput-wide v2, p0, Lcom/lidroid/xutils/HttpUtils;->currentRequestExpiry:J
a=0;// 
a=0;//     .line 68
a=0;//     new-instance v0, Lorg/apache/http/params/BasicHttpParams;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     invoke-direct {v0}, Lorg/apache/http/params/BasicHttpParams;-><init>()V
a=0;// 
a=0;//     .line 70
a=0;//     .local v0, "params":Lorg/apache/http/params/HttpParams;
a=0;//     #v0=(Reference,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     int-to-long v2, p1
a=0;// 
a=0;//     invoke-static {v0, v2, v3}, Lorg/apache/http/conn/params/ConnManagerParams;->setTimeout(Lorg/apache/http/params/HttpParams;J)V
a=0;// 
a=0;//     .line 71
a=0;//     invoke-static {v0, p1}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 72
a=0;//     invoke-static {v0, p1}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 74
a=0;//     new-instance v2, Lorg/apache/http/conn/params/ConnPerRouteBean;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/conn/params/ConnPerRouteBean;);
a=0;//     invoke-direct {v2, v4}, Lorg/apache/http/conn/params/ConnPerRouteBean;-><init>(I)V
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/conn/params/ConnPerRouteBean;);
a=0;//     invoke-static {v0, v2}, Lorg/apache/http/conn/params/ConnManagerParams;->setMaxConnectionsPerRoute(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/params/ConnPerRoute;)V
a=0;// 
a=0;//     .line 75
a=0;//     invoke-static {v0, v4}, Lorg/apache/http/conn/params/ConnManagerParams;->setMaxTotalConnections(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 77
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {v0, v2}, Lorg/apache/http/params/HttpConnectionParams;->setTcpNoDelay(Lorg/apache/http/params/HttpParams;Z)V
a=0;// 
a=0;//     .line 78
a=0;//     const/16 v2, 0x2000
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-static {v0, v2}, Lorg/apache/http/params/HttpConnectionParams;->setSocketBufferSize(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 79
a=0;//     sget-object v2, Lorg/apache/http/HttpVersion;->HTTP_1_1:Lorg/apache/http/HttpVersion;
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/HttpVersion;);
a=0;//     invoke-static {v0, v2}, Lorg/apache/http/params/HttpProtocolParams;->setVersion(Lorg/apache/http/params/HttpParams;Lorg/apache/http/ProtocolVersion;)V
a=0;// 
a=0;//     .line 81
a=0;//     new-instance v1, Lorg/apache/http/conn/scheme/SchemeRegistry;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/conn/scheme/SchemeRegistry;);
a=0;//     invoke-direct {v1}, Lorg/apache/http/conn/scheme/SchemeRegistry;-><init>()V
a=0;// 
a=0;//     .line 82
a=0;//     .local v1, "schemeRegistry":Lorg/apache/http/conn/scheme/SchemeRegistry;
a=0;//     #v1=(Reference,Lorg/apache/http/conn/scheme/SchemeRegistry;);
a=0;//     new-instance v2, Lorg/apache/http/conn/scheme/Scheme;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/conn/scheme/Scheme;);
a=0;//     const-string v3, "http"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lorg/apache/http/conn/scheme/PlainSocketFactory;->getSocketFactory()Lorg/apache/http/conn/scheme/PlainSocketFactory;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lorg/apache/http/conn/scheme/PlainSocketFactory;);
a=0;//     const/16 v5, 0x50
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-direct {v2, v3, v4, v5}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/conn/scheme/Scheme;);
a=0;//     invoke-virtual {v1, v2}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
a=0;// 
a=0;//     .line 83
a=0;//     new-instance v2, Lorg/apache/http/conn/scheme/Scheme;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/conn/scheme/Scheme;);
a=0;//     const-string v3, "https"
a=0;// 
a=0;//     invoke-static {}, Lcom/lidroid/xutils/http/client/DefaultSSLSocketFactory;->getSocketFactory()Lcom/lidroid/xutils/http/client/DefaultSSLSocketFactory;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/16 v5, 0x1bb
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     invoke-direct {v2, v3, v4, v5}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/conn/scheme/Scheme;);
a=0;//     invoke-virtual {v1, v2}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
a=0;// 
a=0;//     .line 85
a=0;//     new-instance v2, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     new-instance v3, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;);
a=0;//     invoke-direct {v3, v0, v1}, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;-><init>(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;)V
a=0;// 
a=0;//     #v3=(Reference,Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;);
a=0;//     invoke-direct {v2, v3, v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     iput-object v2, p0, Lcom/lidroid/xutils/HttpUtils;->httpClient:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     .line 87
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/HttpUtils;->httpClient:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     new-instance v3, Lcom/lidroid/xutils/http/client/RetryHandler;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/lidroid/xutils/http/client/RetryHandler;);
a=0;//     const/4 v4, 0x5
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-direct {v3, v4}, Lcom/lidroid/xutils/http/client/RetryHandler;-><init>(I)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/lidroid/xutils/http/client/RetryHandler;);
a=0;//     invoke-virtual {v2, v3}, Lorg/apache/http/impl/client/DefaultHttpClient;->setHttpRequestRetryHandler(Lorg/apache/http/client/HttpRequestRetryHandler;)V
a=0;// 
a=0;//     .line 89
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/HttpUtils;->httpClient:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     new-instance v3, Lcom/lidroid/xutils/HttpUtils$2;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/lidroid/xutils/HttpUtils$2;);
a=0;//     invoke-direct {v3, p0}, Lcom/lidroid/xutils/HttpUtils$2;-><init>(Lcom/lidroid/xutils/HttpUtils;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/lidroid/xutils/HttpUtils$2;);
a=0;//     invoke-virtual {v2, v3}, Lorg/apache/http/impl/client/DefaultHttpClient;->addRequestInterceptor(Lorg/apache/http/HttpRequestInterceptor;)V
a=0;// 
a=0;//     .line 98
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/HttpUtils;->httpClient:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     new-instance v3, Lcom/lidroid/xutils/HttpUtils$3;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/lidroid/xutils/HttpUtils$3;);
a=0;//     invoke-direct {v3, p0}, Lcom/lidroid/xutils/HttpUtils$3;-><init>(Lcom/lidroid/xutils/HttpUtils;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/lidroid/xutils/HttpUtils$3;);
a=0;//     invoke-virtual {v2, v3}, Lorg/apache/http/impl/client/DefaultHttpClient;->addResponseInterceptor(Lorg/apache/http/HttpResponseInterceptor;)V
a=0;// 
a=0;//     .line 116
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private sendRequest(Lcom/lidroid/xutils/http/client/HttpRequest;Lcom/lidroid/xutils/http/RequestParams;Lcom/lidroid/xutils/http/callback/RequestCallBack;)Lcom/lidroid/xutils/http/HttpHandler;
a=0;//     .locals 4
a=0;//     .param p1, "request"    # Lcom/lidroid/xutils/http/client/HttpRequest;
a=0;//     .param p2, "params"    # Lcom/lidroid/xutils/http/RequestParams;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/lidroid/xutils/http/client/HttpRequest;",
a=0;//             "Lcom/lidroid/xutils/http/RequestParams;",
a=0;//             "Lcom/lidroid/xutils/http/callback/RequestCallBack",
a=0;//             "<TT;>;)",
a=0;//             "Lcom/lidroid/xutils/http/HttpHandler",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 311
a=0;//     .local p3, "callBack":Lcom/lidroid/xutils/http/callback/RequestCallBack;, "Lcom/lidroid/xutils/http/callback/RequestCallBack<TT;>;"
a=0;//     new-instance v0, Lcom/lidroid/xutils/http/HttpHandler;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/http/HttpHandler;);
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/HttpUtils;->httpClient:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/HttpUtils;->httpContext:Lorg/apache/http/protocol/HttpContext;
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/protocol/HttpContext;);
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/HttpUtils;->responseTextCharset:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2, v3, p3}, Lcom/lidroid/xutils/http/HttpHandler;-><init>(Lorg/apache/http/impl/client/AbstractHttpClient;Lorg/apache/http/protocol/HttpContext;Ljava/lang/String;Lcom/lidroid/xutils/http/callback/RequestCallBack;)V
a=0;// 
a=0;//     .line 313
a=0;//     .local v0, "handler":Lcom/lidroid/xutils/http/HttpHandler;, "Lcom/lidroid/xutils/http/HttpHandler<TT;>;"
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/HttpHandler;);
a=0;//     iget-wide v1, p0, Lcom/lidroid/xutils/HttpUtils;->currentRequestExpiry:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/lidroid/xutils/http/HttpHandler;->setExpiry(J)V
a=0;// 
a=0;//     .line 314
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/HttpUtils;->httpRedirectHandler:Lcom/lidroid/xutils/http/callback/HttpRedirectHandler;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/callback/HttpRedirectHandler;);
a=0;//     invoke-virtual {v0, v1}, Lcom/lidroid/xutils/http/HttpHandler;->setHttpRedirectHandler(Lcom/lidroid/xutils/http/callback/HttpRedirectHandler;)V
a=0;// 
a=0;//     .line 315
a=0;//     invoke-virtual {p1, p2, v0}, Lcom/lidroid/xutils/http/client/HttpRequest;->setRequestParams(Lcom/lidroid/xutils/http/RequestParams;Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;)V
a=0;// 
a=0;//     .line 317
a=0;//     sget-object v1, Lcom/lidroid/xutils/HttpUtils;->executor:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object p1, v2, v3
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/lidroid/xutils/http/HttpHandler;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;
a=0;// 
a=0;//     .line 318
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private sendSyncRequest(Lcom/lidroid/xutils/http/client/HttpRequest;Lcom/lidroid/xutils/http/RequestParams;)Lcom/lidroid/xutils/http/ResponseStream;
a=0;//     .locals 4
a=0;//     .param p1, "request"    # Lcom/lidroid/xutils/http/client/HttpRequest;
a=0;//     .param p2, "params"    # Lcom/lidroid/xutils/http/RequestParams;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/lidroid/xutils/exception/HttpException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 323
a=0;//     new-instance v0, Lcom/lidroid/xutils/http/SyncHttpHandler;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/http/SyncHttpHandler;);
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/HttpUtils;->httpClient:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/HttpUtils;->httpContext:Lorg/apache/http/protocol/HttpContext;
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/protocol/HttpContext;);
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/HttpUtils;->responseTextCharset:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/lidroid/xutils/http/SyncHttpHandler;-><init>(Lorg/apache/http/impl/client/AbstractHttpClient;Lorg/apache/http/protocol/HttpContext;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 325
a=0;//     .local v0, "handler":Lcom/lidroid/xutils/http/SyncHttpHandler;
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/SyncHttpHandler;);
a=0;//     iget-wide v1, p0, Lcom/lidroid/xutils/HttpUtils;->currentRequestExpiry:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/lidroid/xutils/http/SyncHttpHandler;->setExpiry(J)V
a=0;// 
a=0;//     .line 326
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/HttpUtils;->httpRedirectHandler:Lcom/lidroid/xutils/http/callback/HttpRedirectHandler;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/callback/HttpRedirectHandler;);
a=0;//     invoke-virtual {v0, v1}, Lcom/lidroid/xutils/http/SyncHttpHandler;->setHttpRedirectHandler(Lcom/lidroid/xutils/http/callback/HttpRedirectHandler;)V
a=0;// 
a=0;//     .line 327
a=0;//     invoke-virtual {p1, p2}, Lcom/lidroid/xutils/http/client/HttpRequest;->setRequestParams(Lcom/lidroid/xutils/http/RequestParams;)V
a=0;// 
a=0;//     .line 329
a=0;//     invoke-virtual {v0, p1}, Lcom/lidroid/xutils/http/SyncHttpHandler;->sendRequest(Lorg/apache/http/client/methods/HttpRequestBase;)Lcom/lidroid/xutils/http/ResponseStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public configCookieStore(Lorg/apache/http/client/CookieStore;)Lcom/lidroid/xutils/HttpUtils;
a=0;//     .locals 2
a=0;//     .param p1, "cookieStore"    # Lorg/apache/http/client/CookieStore;
a=0;// 
a=0;//     .prologue
a=0;//     .line 181
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/HttpUtils;->httpContext:Lorg/apache/http/protocol/HttpContext;
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/protocol/HttpContext;);
a=0;//     const-string v1, "http.cookie-store"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, p1}, Lorg/apache/http/protocol/HttpContext;->setAttribute(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 182
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public configCurrentHttpCacheExpiry(J)Lcom/lidroid/xutils/HttpUtils;
a=0;//     .locals 0
a=0;//     .param p1, "currRequestExpiry"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 176
a=0;//     iput-wide p1, p0, Lcom/lidroid/xutils/HttpUtils;->currentRequestExpiry:J
a=0;// 
a=0;//     .line 177
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public configDefaultHttpCacheExpiry(J)Lcom/lidroid/xutils/HttpUtils;
a=0;//     .locals 2
a=0;//     .param p1, "defaultExpiry"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 170
a=0;//     invoke-static {p1, p2}, Lcom/lidroid/xutils/http/HttpCache;->setDefaultExpiryTime(J)V
a=0;// 
a=0;//     .line 171
a=0;//     invoke-static {}, Lcom/lidroid/xutils/http/HttpCache;->getDefaultExpiryTime()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/lidroid/xutils/HttpUtils;->currentRequestExpiry:J
a=0;// 
a=0;//     .line 172
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public configHttpCacheSize(I)Lcom/lidroid/xutils/HttpUtils;
a=0;//     .locals 1
a=0;//     .param p1, "httpCacheSize"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 165
a=0;//     sget-object v0, Lcom/lidroid/xutils/HttpUtils;->sHttpCache:Lcom/lidroid/xutils/http/HttpCache;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/HttpCache;);
a=0;//     invoke-virtual {v0, p1}, Lcom/lidroid/xutils/http/HttpCache;->setCacheSize(I)V
a=0;// 
a=0;//     .line 166
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public configHttpRedirectHandler(Lcom/lidroid/xutils/http/callback/HttpRedirectHandler;)Lcom/lidroid/xutils/HttpUtils;
a=0;//     .locals 0
a=0;//     .param p1, "httpRedirectHandler"    # Lcom/lidroid/xutils/http/callback/HttpRedirectHandler;
a=0;// 
a=0;//     .prologue
a=0;//     .line 160
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/HttpUtils;->httpRedirectHandler:Lcom/lidroid/xutils/http/callback/HttpRedirectHandler;
a=0;// 
a=0;//     .line 161
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public configRegisterScheme(Lorg/apache/http/conn/scheme/Scheme;)Lcom/lidroid/xutils/HttpUtils;
a=0;//     .locals 1
a=0;//     .param p1, "scheme"    # Lorg/apache/http/conn/scheme/Scheme;
a=0;// 
a=0;//     .prologue
a=0;//     .line 199
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/HttpUtils;->httpClient:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-virtual {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->getSchemeRegistry()Lorg/apache/http/conn/scheme/SchemeRegistry;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
a=0;// 
a=0;//     .line 200
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public configRequestRetryCount(I)Lcom/lidroid/xutils/HttpUtils;
a=0;//     .locals 2
a=0;//     .param p1, "count"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 210
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/HttpUtils;->httpClient:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     new-instance v1, Lcom/lidroid/xutils/http/client/RetryHandler;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/lidroid/xutils/http/client/RetryHandler;);
a=0;//     invoke-direct {v1, p1}, Lcom/lidroid/xutils/http/client/RetryHandler;-><init>(I)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/client/RetryHandler;);
a=0;//     invoke-virtual {v0, v1}, Lorg/apache/http/impl/client/DefaultHttpClient;->setHttpRequestRetryHandler(Lorg/apache/http/client/HttpRequestRetryHandler;)V
a=0;// 
a=0;//     .line 211
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public configRequestThreadPoolSize(I)Lcom/lidroid/xutils/HttpUtils;
a=0;//     .locals 1
a=0;//     .param p1, "threadPoolSize"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 215
a=0;//     if-lez p1, :cond_0
a=0;// 
a=0;//     sget v0, Lcom/lidroid/xutils/HttpUtils;->threadPoolSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     .line 216
a=0;//     sput p1, Lcom/lidroid/xutils/HttpUtils;->threadPoolSize:I
a=0;// 
a=0;//     .line 217
a=0;//     sget-object v0, Lcom/lidroid/xutils/HttpUtils;->sThreadFactory:Ljava/util/concurrent/ThreadFactory;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ThreadFactory;);
a=0;//     invoke-static {p1, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/lidroid/xutils/HttpUtils;->executor:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     .line 219
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public configResponseTextCharset(Ljava/lang/String;)Lcom/lidroid/xutils/HttpUtils;
a=0;//     .locals 1
a=0;//     .param p1, "charSet"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 153
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 154
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/HttpUtils;->responseTextCharset:Ljava/lang/String;
a=0;// 
a=0;//     .line 156
a=0;//     :cond_0
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public configSSLSocketFactory(Lorg/apache/http/conn/ssl/SSLSocketFactory;)Lcom/lidroid/xutils/HttpUtils;
a=0;//     .locals 3
a=0;//     .param p1, "sslSocketFactory"    # Lorg/apache/http/conn/ssl/SSLSocketFactory;
a=0;// 
a=0;//     .prologue
a=0;//     .line 204
a=0;//     new-instance v0, Lorg/apache/http/conn/scheme/Scheme;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/conn/scheme/Scheme;);
a=0;//     const-string v1, "https"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/16 v2, 0x1bb
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-direct {v0, v1, p1, v2}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V
a=0;// 
a=0;//     .line 205
a=0;//     .local v0, "scheme":Lorg/apache/http/conn/scheme/Scheme;
a=0;//     #v0=(Reference,Lorg/apache/http/conn/scheme/Scheme;);
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/HttpUtils;->httpClient:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     invoke-virtual {v1}, Lorg/apache/http/impl/client/DefaultHttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Lorg/apache/http/conn/ClientConnectionManager;->getSchemeRegistry()Lorg/apache/http/conn/scheme/SchemeRegistry;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
a=0;// 
a=0;//     .line 206
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public configTimeout(I)Lcom/lidroid/xutils/HttpUtils;
a=0;//     .locals 3
a=0;//     .param p1, "timeout"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 191
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/HttpUtils;->httpClient:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-virtual {v1}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 192
a=0;//     .local v0, "httpParams":Lorg/apache/http/params/HttpParams;
a=0;//     #v0=(Reference,Lorg/apache/http/params/HttpParams;);
a=0;//     int-to-long v1, p1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {v0, v1, v2}, Lorg/apache/http/conn/params/ConnManagerParams;->setTimeout(Lorg/apache/http/params/HttpParams;J)V
a=0;// 
a=0;//     .line 193
a=0;//     invoke-static {v0, p1}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 194
a=0;//     invoke-static {v0, p1}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 195
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public configUserAgent(Ljava/lang/String;)Lcom/lidroid/xutils/HttpUtils;
a=0;//     .locals 1
a=0;//     .param p1, "userAgent"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 186
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/HttpUtils;->httpClient:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-virtual {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0, p1}, Lorg/apache/http/params/HttpProtocolParams;->setUserAgent(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 187
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public download(Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;Ljava/lang/String;Ljava/lang/String;Lcom/lidroid/xutils/http/RequestParams;Lcom/lidroid/xutils/http/callback/RequestCallBack;)Lcom/lidroid/xutils/http/HttpHandler;
a=0;//     .locals 8
a=0;//     .param p1, "method"    # Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;
a=0;//     .param p2, "url"    # Ljava/lang/String;
a=0;//     .param p3, "target"    # Ljava/lang/String;
a=0;//     .param p4, "params"    # Lcom/lidroid/xutils/http/RequestParams;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/lidroid/xutils/http/RequestParams;",
a=0;//             "Lcom/lidroid/xutils/http/callback/RequestCallBack",
a=0;//             "<",
a=0;//             "Ljava/io/File;",
a=0;//             ">;)",
a=0;//             "Lcom/lidroid/xutils/http/HttpHandler",
a=0;//             "<",
a=0;//             "Ljava/io/File;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p5, "callback":Lcom/lidroid/xutils/http/callback/RequestCallBack;, "Lcom/lidroid/xutils/http/callback/RequestCallBack<Ljava/io/File;>;"
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 282
a=0;//     #v5=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/HttpUtils;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p4
a=0;// 
a=0;//     #v4=(Reference,Lcom/lidroid/xutils/http/RequestParams;);
a=0;//     move v6, v5
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move-object v7, p5
a=0;// 
a=0;//     #v7=(Reference,Lcom/lidroid/xutils/http/callback/RequestCallBack;);
a=0;//     invoke-virtual/range {v0 .. v7}, Lcom/lidroid/xutils/HttpUtils;->download(Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;Ljava/lang/String;Ljava/lang/String;Lcom/lidroid/xutils/http/RequestParams;ZZLcom/lidroid/xutils/http/callback/RequestCallBack;)Lcom/lidroid/xutils/http/HttpHandler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public download(Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;Ljava/lang/String;Ljava/lang/String;Lcom/lidroid/xutils/http/RequestParams;ZLcom/lidroid/xutils/http/callback/RequestCallBack;)Lcom/lidroid/xutils/http/HttpHandler;
a=0;//     .locals 8
a=0;//     .param p1, "method"    # Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;
a=0;//     .param p2, "url"    # Ljava/lang/String;
a=0;//     .param p3, "target"    # Ljava/lang/String;
a=0;//     .param p4, "params"    # Lcom/lidroid/xutils/http/RequestParams;
a=0;//     .param p5, "autoResume"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/lidroid/xutils/http/RequestParams;",
a=0;//             "Z",
a=0;//             "Lcom/lidroid/xutils/http/callback/RequestCallBack",
a=0;//             "<",
a=0;//             "Ljava/io/File;",
a=0;//             ">;)",
a=0;//             "Lcom/lidroid/xutils/http/HttpHandler",
a=0;//             "<",
a=0;//             "Ljava/io/File;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 287
a=0;//     .local p6, "callback":Lcom/lidroid/xutils/http/callback/RequestCallBack;, "Lcom/lidroid/xutils/http/callback/RequestCallBack<Ljava/io/File;>;"
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/HttpUtils;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p4
a=0;// 
a=0;//     #v4=(Reference,Lcom/lidroid/xutils/http/RequestParams;);
a=0;//     move v5, p5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     move-object v7, p6
a=0;// 
a=0;//     #v7=(Reference,Lcom/lidroid/xutils/http/callback/RequestCallBack;);
a=0;//     invoke-virtual/range {v0 .. v7}, Lcom/lidroid/xutils/HttpUtils;->download(Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;Ljava/lang/String;Ljava/lang/String;Lcom/lidroid/xutils/http/RequestParams;ZZLcom/lidroid/xutils/http/callback/RequestCallBack;)Lcom/lidroid/xutils/http/HttpHandler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public download(Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;Ljava/lang/String;Ljava/lang/String;Lcom/lidroid/xutils/http/RequestParams;ZZLcom/lidroid/xutils/http/callback/RequestCallBack;)Lcom/lidroid/xutils/http/HttpHandler;
a=0;//     .locals 6
a=0;//     .param p1, "method"    # Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;
a=0;//     .param p2, "url"    # Ljava/lang/String;
a=0;//     .param p3, "target"    # Ljava/lang/String;
a=0;//     .param p4, "params"    # Lcom/lidroid/xutils/http/RequestParams;
a=0;//     .param p5, "autoResume"    # Z
a=0;//     .param p6, "autoRename"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/lidroid/xutils/http/RequestParams;",
a=0;//             "ZZ",
a=0;//             "Lcom/lidroid/xutils/http/callback/RequestCallBack",
a=0;//             "<",
a=0;//             "Ljava/io/File;",
a=0;//             ">;)",
a=0;//             "Lcom/lidroid/xutils/http/HttpHandler",
a=0;//             "<",
a=0;//             "Ljava/io/File;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 293
a=0;//     .local p7, "callback":Lcom/lidroid/xutils/http/callback/RequestCallBack;, "Lcom/lidroid/xutils/http/callback/RequestCallBack<Ljava/io/File;>;"
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     new-instance v2, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v3, "url may not be null"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 294
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     if-nez p3, :cond_1
a=0;// 
a=0;//     new-instance v2, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v3, "target may not be null"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 296
a=0;//     :cond_1
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     new-instance v1, Lcom/lidroid/xutils/http/client/HttpRequest;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/lidroid/xutils/http/client/HttpRequest;);
a=0;//     invoke-direct {v1, p1, p2}, Lcom/lidroid/xutils/http/client/HttpRequest;-><init>(Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 298
a=0;//     .local v1, "request":Lcom/lidroid/xutils/http/client/HttpRequest;
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/client/HttpRequest;);
a=0;//     new-instance v0, Lcom/lidroid/xutils/http/HttpHandler;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/http/HttpHandler;);
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/HttpUtils;->httpClient:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/HttpUtils;->httpContext:Lorg/apache/http/protocol/HttpContext;
a=0;// 
a=0;//     #v3=(Reference,Lorg/apache/http/protocol/HttpContext;);
a=0;//     iget-object v4, p0, Lcom/lidroid/xutils/HttpUtils;->responseTextCharset:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2, v3, v4, p7}, Lcom/lidroid/xutils/http/HttpHandler;-><init>(Lorg/apache/http/impl/client/AbstractHttpClient;Lorg/apache/http/protocol/HttpContext;Ljava/lang/String;Lcom/lidroid/xutils/http/callback/RequestCallBack;)V
a=0;// 
a=0;//     .line 300
a=0;//     .local v0, "handler":Lcom/lidroid/xutils/http/HttpHandler;, "Lcom/lidroid/xutils/http/HttpHandler<Ljava/io/File;>;"
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/HttpHandler;);
a=0;//     iget-wide v2, p0, Lcom/lidroid/xutils/HttpUtils;->currentRequestExpiry:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v2, v3}, Lcom/lidroid/xutils/http/HttpHandler;->setExpiry(J)V
a=0;// 
a=0;//     .line 301
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/HttpUtils;->httpRedirectHandler:Lcom/lidroid/xutils/http/callback/HttpRedirectHandler;
a=0;// 
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/http/callback/HttpRedirectHandler;);
a=0;//     invoke-virtual {v0, v2}, Lcom/lidroid/xutils/http/HttpHandler;->setHttpRedirectHandler(Lcom/lidroid/xutils/http/callback/HttpRedirectHandler;)V
a=0;// 
a=0;//     .line 302
a=0;//     invoke-virtual {v1, p4, v0}, Lcom/lidroid/xutils/http/client/HttpRequest;->setRequestParams(Lcom/lidroid/xutils/http/RequestParams;Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;)V
a=0;// 
a=0;//     .line 304
a=0;//     sget-object v2, Lcom/lidroid/xutils/HttpUtils;->executor:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aput-object v1, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     aput-object p3, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-static {p5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Boolean;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     invoke-static {p6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Lcom/lidroid/xutils/http/HttpHandler;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;
a=0;// 
a=0;//     .line 305
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public download(Ljava/lang/String;Ljava/lang/String;Lcom/lidroid/xutils/http/RequestParams;Lcom/lidroid/xutils/http/callback/RequestCallBack;)Lcom/lidroid/xutils/http/HttpHandler;
a=0;//     .locals 8
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "target"    # Ljava/lang/String;
a=0;//     .param p3, "params"    # Lcom/lidroid/xutils/http/RequestParams;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/lidroid/xutils/http/RequestParams;",
a=0;//             "Lcom/lidroid/xutils/http/callback/RequestCallBack",
a=0;//             "<",
a=0;//             "Ljava/io/File;",
a=0;//             ">;)",
a=0;//             "Lcom/lidroid/xutils/http/HttpHandler",
a=0;//             "<",
a=0;//             "Ljava/io/File;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p4, "callback":Lcom/lidroid/xutils/http/callback/RequestCallBack;, "Lcom/lidroid/xutils/http/callback/RequestCallBack<Ljava/io/File;>;"
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 267
a=0;//     #v5=(Null);
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;->GET:Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/HttpUtils;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Lcom/lidroid/xutils/http/RequestParams;);
a=0;//     move v6, v5
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move-object v7, p4
a=0;// 
a=0;//     #v7=(Reference,Lcom/lidroid/xutils/http/callback/RequestCallBack;);
a=0;//     invoke-virtual/range {v0 .. v7}, Lcom/lidroid/xutils/HttpUtils;->download(Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;Ljava/lang/String;Ljava/lang/String;Lcom/lidroid/xutils/http/RequestParams;ZZLcom/lidroid/xutils/http/callback/RequestCallBack;)Lcom/lidroid/xutils/http/HttpHandler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public download(Ljava/lang/String;Ljava/lang/String;Lcom/lidroid/xutils/http/RequestParams;ZLcom/lidroid/xutils/http/callback/RequestCallBack;)Lcom/lidroid/xutils/http/HttpHandler;
a=0;//     .locals 8
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "target"    # Ljava/lang/String;
a=0;//     .param p3, "params"    # Lcom/lidroid/xutils/http/RequestParams;
a=0;//     .param p4, "autoResume"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/lidroid/xutils/http/RequestParams;",
a=0;//             "Z",
a=0;//             "Lcom/lidroid/xutils/http/callback/RequestCallBack",
a=0;//             "<",
a=0;//             "Ljava/io/File;",
a=0;//             ">;)",
a=0;//             "Lcom/lidroid/xutils/http/HttpHandler",
a=0;//             "<",
a=0;//             "Ljava/io/File;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 272
a=0;//     .local p5, "callback":Lcom/lidroid/xutils/http/callback/RequestCallBack;, "Lcom/lidroid/xutils/http/callback/RequestCallBack<Ljava/io/File;>;"
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;->GET:Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/HttpUtils;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Lcom/lidroid/xutils/http/RequestParams;);
a=0;//     move v5, p4
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     move-object v7, p5
a=0;// 
a=0;//     #v7=(Reference,Lcom/lidroid/xutils/http/callback/RequestCallBack;);
a=0;//     invoke-virtual/range {v0 .. v7}, Lcom/lidroid/xutils/HttpUtils;->download(Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;Ljava/lang/String;Ljava/lang/String;Lcom/lidroid/xutils/http/RequestParams;ZZLcom/lidroid/xutils/http/callback/RequestCallBack;)Lcom/lidroid/xutils/http/HttpHandler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public download(Ljava/lang/String;Ljava/lang/String;Lcom/lidroid/xutils/http/RequestParams;ZZLcom/lidroid/xutils/http/callback/RequestCallBack;)Lcom/lidroid/xutils/http/HttpHandler;
a=0;//     .locals 8
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "target"    # Ljava/lang/String;
a=0;//     .param p3, "params"    # Lcom/lidroid/xutils/http/RequestParams;
a=0;//     .param p4, "autoResume"    # Z
a=0;//     .param p5, "autoRename"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/lidroid/xutils/http/RequestParams;",
a=0;//             "ZZ",
a=0;//             "Lcom/lidroid/xutils/http/callback/RequestCallBack",
a=0;//             "<",
a=0;//             "Ljava/io/File;",
a=0;//             ">;)",
a=0;//             "Lcom/lidroid/xutils/http/HttpHandler",
a=0;//             "<",
a=0;//             "Ljava/io/File;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 277
a=0;//     .local p6, "callback":Lcom/lidroid/xutils/http/callback/RequestCallBack;, "Lcom/lidroid/xutils/http/callback/RequestCallBack<Ljava/io/File;>;"
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;->GET:Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/HttpUtils;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Lcom/lidroid/xutils/http/RequestParams;);
a=0;//     move v5, p4
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     move v6, p5
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     move-object v7, p6
a=0;// 
a=0;//     #v7=(Reference,Lcom/lidroid/xutils/http/callback/RequestCallBack;);
a=0;//     invoke-virtual/range {v0 .. v7}, Lcom/lidroid/xutils/HttpUtils;->download(Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;Ljava/lang/String;Ljava/lang/String;Lcom/lidroid/xutils/http/RequestParams;ZZLcom/lidroid/xutils/http/callback/RequestCallBack;)Lcom/lidroid/xutils/http/HttpHandler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public download(Ljava/lang/String;Ljava/lang/String;Lcom/lidroid/xutils/http/callback/RequestCallBack;)Lcom/lidroid/xutils/http/HttpHandler;
a=0;//     .locals 8
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "target"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/lidroid/xutils/http/callback/RequestCallBack",
a=0;//             "<",
a=0;//             "Ljava/io/File;",
a=0;//             ">;)",
a=0;//             "Lcom/lidroid/xutils/http/HttpHandler",
a=0;//             "<",
a=0;//             "Ljava/io/File;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p3, "callback":Lcom/lidroid/xutils/http/callback/RequestCallBack;, "Lcom/lidroid/xutils/http/callback/RequestCallBack<Ljava/io/File;>;"
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 252
a=0;//     #v5=(Null);
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;->GET:Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/HttpUtils;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move v6, v5
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move-object v7, p3
a=0;// 
a=0;//     #v7=(Reference,Lcom/lidroid/xutils/http/callback/RequestCallBack;);
a=0;//     invoke-virtual/range {v0 .. v7}, Lcom/lidroid/xutils/HttpUtils;->download(Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;Ljava/lang/String;Ljava/lang/String;Lcom/lidroid/xutils/http/RequestParams;ZZLcom/lidroid/xutils/http/callback/RequestCallBack;)Lcom/lidroid/xutils/http/HttpHandler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public download(Ljava/lang/String;Ljava/lang/String;ZLcom/lidroid/xutils/http/callback/RequestCallBack;)Lcom/lidroid/xutils/http/HttpHandler;
a=0;//     .locals 8
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "target"    # Ljava/lang/String;
a=0;//     .param p3, "autoResume"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Z",
a=0;//             "Lcom/lidroid/xutils/http/callback/RequestCallBack",
a=0;//             "<",
a=0;//             "Ljava/io/File;",
a=0;//             ">;)",
a=0;//             "Lcom/lidroid/xutils/http/HttpHandler",
a=0;//             "<",
a=0;//             "Ljava/io/File;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 257
a=0;//     .local p4, "callback":Lcom/lidroid/xutils/http/callback/RequestCallBack;, "Lcom/lidroid/xutils/http/callback/RequestCallBack<Ljava/io/File;>;"
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;->GET:Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/HttpUtils;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move v5, p3
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     move-object v7, p4
a=0;// 
a=0;//     #v7=(Reference,Lcom/lidroid/xutils/http/callback/RequestCallBack;);
a=0;//     invoke-virtual/range {v0 .. v7}, Lcom/lidroid/xutils/HttpUtils;->download(Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;Ljava/lang/String;Ljava/lang/String;Lcom/lidroid/xutils/http/RequestParams;ZZLcom/lidroid/xutils/http/callback/RequestCallBack;)Lcom/lidroid/xutils/http/HttpHandler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public download(Ljava/lang/String;Ljava/lang/String;ZZLcom/lidroid/xutils/http/callback/RequestCallBack;)Lcom/lidroid/xutils/http/HttpHandler;
a=0;//     .locals 8
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "target"    # Ljava/lang/String;
a=0;//     .param p3, "autoResume"    # Z
a=0;//     .param p4, "autoRename"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "ZZ",
a=0;//             "Lcom/lidroid/xutils/http/callback/RequestCallBack",
a=0;//             "<",
a=0;//             "Ljava/io/File;",
a=0;//             ">;)",
a=0;//             "Lcom/lidroid/xutils/http/HttpHandler",
a=0;//             "<",
a=0;//             "Ljava/io/File;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 262
a=0;//     .local p5, "callback":Lcom/lidroid/xutils/http/callback/RequestCallBack;, "Lcom/lidroid/xutils/http/callback/RequestCallBack<Ljava/io/File;>;"
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;->GET:Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/HttpUtils;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move v5, p3
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     move v6, p4
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     move-object v7, p5
a=0;// 
a=0;//     #v7=(Reference,Lcom/lidroid/xutils/http/callback/RequestCallBack;);
a=0;//     invoke-virtual/range {v0 .. v7}, Lcom/lidroid/xutils/HttpUtils;->download(Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;Ljava/lang/String;Ljava/lang/String;Lcom/lidroid/xutils/http/RequestParams;ZZLcom/lidroid/xutils/http/callback/RequestCallBack;)Lcom/lidroid/xutils/http/HttpHandler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getHttpClient()Lorg/apache/http/client/HttpClient;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 147
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/HttpUtils;->httpClient:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public send(Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;Ljava/lang/String;Lcom/lidroid/xutils/http/RequestParams;Lcom/lidroid/xutils/http/callback/RequestCallBack;)Lcom/lidroid/xutils/http/HttpHandler;
a=0;//     .locals 3
a=0;//     .param p1, "method"    # Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;
a=0;//     .param p2, "url"    # Ljava/lang/String;
a=0;//     .param p3, "params"    # Lcom/lidroid/xutils/http/RequestParams;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/lidroid/xutils/http/RequestParams;",
a=0;//             "Lcom/lidroid/xutils/http/callback/RequestCallBack",
a=0;//             "<TT;>;)",
a=0;//             "Lcom/lidroid/xutils/http/HttpHandler",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 231
a=0;//     .local p4, "callBack":Lcom/lidroid/xutils/http/callback/RequestCallBack;, "Lcom/lidroid/xutils/http/callback/RequestCallBack<TT;>;"
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v2, "url may not be null"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 233
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v0, Lcom/lidroid/xutils/http/client/HttpRequest;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/http/client/HttpRequest;);
a=0;//     invoke-direct {v0, p1, p2}, Lcom/lidroid/xutils/http/client/HttpRequest;-><init>(Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 234
a=0;//     .local v0, "request":Lcom/lidroid/xutils/http/client/HttpRequest;
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/HttpRequest;);
a=0;//     invoke-direct {p0, v0, p3, p4}, Lcom/lidroid/xutils/HttpUtils;->sendRequest(Lcom/lidroid/xutils/http/client/HttpRequest;Lcom/lidroid/xutils/http/RequestParams;Lcom/lidroid/xutils/http/callback/RequestCallBack;)Lcom/lidroid/xutils/http/HttpHandler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/HttpHandler;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public send(Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;Ljava/lang/String;Lcom/lidroid/xutils/http/callback/RequestCallBack;)Lcom/lidroid/xutils/http/HttpHandler;
a=0;//     .locals 1
a=0;//     .param p1, "method"    # Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;
a=0;//     .param p2, "url"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/lidroid/xutils/http/callback/RequestCallBack",
a=0;//             "<TT;>;)",
a=0;//             "Lcom/lidroid/xutils/http/HttpHandler",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 226
a=0;//     .local p3, "callBack":Lcom/lidroid/xutils/http/callback/RequestCallBack;, "Lcom/lidroid/xutils/http/callback/RequestCallBack<TT;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, p2, v0, p3}, Lcom/lidroid/xutils/HttpUtils;->send(Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;Ljava/lang/String;Lcom/lidroid/xutils/http/RequestParams;Lcom/lidroid/xutils/http/callback/RequestCallBack;)Lcom/lidroid/xutils/http/HttpHandler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/HttpHandler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public sendSync(Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;Ljava/lang/String;)Lcom/lidroid/xutils/http/ResponseStream;
a=0;//     .locals 1
a=0;//     .param p1, "method"    # Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;
a=0;//     .param p2, "url"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/lidroid/xutils/exception/HttpException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 238
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, p2, v0}, Lcom/lidroid/xutils/HttpUtils;->sendSync(Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;Ljava/lang/String;Lcom/lidroid/xutils/http/RequestParams;)Lcom/lidroid/xutils/http/ResponseStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/ResponseStream;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public sendSync(Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;Ljava/lang/String;Lcom/lidroid/xutils/http/RequestParams;)Lcom/lidroid/xutils/http/ResponseStream;
a=0;//     .locals 3
a=0;//     .param p1, "method"    # Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;
a=0;//     .param p2, "url"    # Ljava/lang/String;
a=0;//     .param p3, "params"    # Lcom/lidroid/xutils/http/RequestParams;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/lidroid/xutils/exception/HttpException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 242
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v2, "url may not be null"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 244
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v0, Lcom/lidroid/xutils/http/client/HttpRequest;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/http/client/HttpRequest;);
a=0;//     invoke-direct {v0, p1, p2}, Lcom/lidroid/xutils/http/client/HttpRequest;-><init>(Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 245
a=0;//     .local v0, "request":Lcom/lidroid/xutils/http/client/HttpRequest;
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/HttpRequest;);
a=0;//     invoke-direct {p0, v0, p3}, Lcom/lidroid/xutils/HttpUtils;->sendSyncRequest(Lcom/lidroid/xutils/http/client/HttpRequest;Lcom/lidroid/xutils/http/RequestParams;)Lcom/lidroid/xutils/http/ResponseStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/ResponseStream;);
a=0;//     return-object v1
a=0;// .end method
}}
