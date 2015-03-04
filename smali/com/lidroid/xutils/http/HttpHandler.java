package com.lidroid.xutils.http; class HttpHandler { void a() { int a;
a=0;// .class public Lcom/lidroid/xutils/http/HttpHandler;
a=0;// .super Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;
a=0;// .source "HttpHandler.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/lidroid/xutils/http/HttpHandler$NotUseApacheRedirectHandler;,
a=0;//         Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Lcom/lidroid/xutils/util/core/CompatibleAsyncTask",
a=0;//         "<",
a=0;//         "Ljava/lang/Object;",
a=0;//         "Ljava/lang/Object;",
a=0;//         "Ljava/lang/Void;",
a=0;//         ">;",
a=0;//         "Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final UPDATE_FAILURE:I = 0x3
a=0;// 
a=0;// .field private static final UPDATE_LOADING:I = 0x2
a=0;// 
a=0;// .field private static final UPDATE_START:I = 0x1
a=0;// 
a=0;// .field private static final UPDATE_SUCCESS:I = 0x4
a=0;// 
a=0;// .field private static final notUseApacheRedirectHandler:Lcom/lidroid/xutils/http/HttpHandler$NotUseApacheRedirectHandler;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private autoRename:Z
a=0;// 
a=0;// .field private autoResume:Z
a=0;// 
a=0;// .field private callback:Lcom/lidroid/xutils/http/callback/RequestCallBack;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/lidroid/xutils/http/callback/RequestCallBack",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private charset:Ljava/lang/String;
a=0;// 
a=0;// .field private final client:Lorg/apache/http/impl/client/AbstractHttpClient;
a=0;// 
a=0;// .field private final context:Lorg/apache/http/protocol/HttpContext;
a=0;// 
a=0;// .field private expiry:J
a=0;// 
a=0;// .field private fileSavePath:Ljava/lang/String;
a=0;// 
a=0;// .field private httpRedirectHandler:Lcom/lidroid/xutils/http/callback/HttpRedirectHandler;
a=0;// 
a=0;// .field private isDownloadingFile:Z
a=0;// 
a=0;// .field private isUploading:Z
a=0;// 
a=0;// .field private lastUpdateTime:J
a=0;// 
a=0;// .field private final mFileDownloadHandler:Lcom/lidroid/xutils/http/callback/FileDownloadHandler;
a=0;// 
a=0;// .field private final mStringDownloadHandler:Lcom/lidroid/xutils/http/callback/StringDownloadHandler;
a=0;// 
a=0;// .field private request:Lorg/apache/http/client/methods/HttpRequestBase;
a=0;// 
a=0;// .field private requestMethod:Ljava/lang/String;
a=0;// 
a=0;// .field private requestUrl:Ljava/lang/String;
a=0;// 
a=0;// .field private retriedCount:I
a=0;// 
a=0;// .field private state:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 348
a=0;//     new-instance v0, Lcom/lidroid/xutils/http/HttpHandler$NotUseApacheRedirectHandler;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/http/HttpHandler$NotUseApacheRedirectHandler;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, v1}, Lcom/lidroid/xutils/http/HttpHandler$NotUseApacheRedirectHandler;-><init>(Lcom/lidroid/xutils/http/HttpHandler$NotUseApacheRedirectHandler;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/HttpHandler$NotUseApacheRedirectHandler;);
a=0;//     sput-object v0, Lcom/lidroid/xutils/http/HttpHandler;->notUseApacheRedirectHandler:Lcom/lidroid/xutils/http/HttpHandler$NotUseApacheRedirectHandler;
a=0;// 
a=0;//     .line 40
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lorg/apache/http/impl/client/AbstractHttpClient;Lorg/apache/http/protocol/HttpContext;Ljava/lang/String;Lcom/lidroid/xutils/http/callback/RequestCallBack;)V
a=0;//     .locals 2
a=0;//     .param p1, "client"    # Lorg/apache/http/impl/client/AbstractHttpClient;
a=0;//     .param p2, "context"    # Lorg/apache/http/protocol/HttpContext;
a=0;//     .param p3, "charset"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lorg/apache/http/impl/client/AbstractHttpClient;",
a=0;//             "Lorg/apache/http/protocol/HttpContext;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/lidroid/xutils/http/callback/RequestCallBack",
a=0;//             "<TT;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/lidroid/xutils/http/HttpHandler;, "Lcom/lidroid/xutils/http/HttpHandler<TT;>;"
a=0;//     .local p4, "callback":Lcom/lidroid/xutils/http/callback/RequestCallBack;, "Lcom/lidroid/xutils/http/callback/RequestCallBack<TT;>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 69
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;-><init>()V
a=0;// 
a=0;//     .line 45
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/HttpHandler;);
a=0;//     new-instance v0, Lcom/lidroid/xutils/http/callback/StringDownloadHandler;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/http/callback/StringDownloadHandler;);
a=0;//     invoke-direct {v0}, Lcom/lidroid/xutils/http/callback/StringDownloadHandler;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/callback/StringDownloadHandler;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->mStringDownloadHandler:Lcom/lidroid/xutils/http/callback/StringDownloadHandler;
a=0;// 
a=0;//     .line 46
a=0;//     new-instance v0, Lcom/lidroid/xutils/http/callback/FileDownloadHandler;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/http/callback/FileDownloadHandler;);
a=0;//     invoke-direct {v0}, Lcom/lidroid/xutils/http/callback/FileDownloadHandler;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/callback/FileDownloadHandler;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->mFileDownloadHandler:Lcom/lidroid/xutils/http/callback/FileDownloadHandler;
a=0;// 
a=0;//     .line 59
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->isUploading:Z
a=0;// 
a=0;//     .line 62
a=0;//     iput v1, p0, Lcom/lidroid/xutils/http/HttpHandler;->retriedCount:I
a=0;// 
a=0;//     .line 63
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->fileSavePath:Ljava/lang/String;
a=0;// 
a=0;//     .line 64
a=0;//     iput-boolean v1, p0, Lcom/lidroid/xutils/http/HttpHandler;->isDownloadingFile:Z
a=0;// 
a=0;//     .line 65
a=0;//     iput-boolean v1, p0, Lcom/lidroid/xutils/http/HttpHandler;->autoResume:Z
a=0;// 
a=0;//     .line 66
a=0;//     iput-boolean v1, p0, Lcom/lidroid/xutils/http/HttpHandler;->autoRename:Z
a=0;// 
a=0;//     .line 77
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/HttpHandler$State;->WAITING:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->state:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     .line 83
a=0;//     invoke-static {}, Lcom/lidroid/xutils/http/HttpCache;->getDefaultExpiryTime()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->expiry:J
a=0;// 
a=0;//     .line 70
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/HttpHandler;->client:Lorg/apache/http/impl/client/AbstractHttpClient;
a=0;// 
a=0;//     .line 71
a=0;//     iput-object p2, p0, Lcom/lidroid/xutils/http/HttpHandler;->context:Lorg/apache/http/protocol/HttpContext;
a=0;// 
a=0;//     .line 72
a=0;//     iput-object p4, p0, Lcom/lidroid/xutils/http/HttpHandler;->callback:Lcom/lidroid/xutils/http/callback/RequestCallBack;
a=0;// 
a=0;//     .line 73
a=0;//     iput-object p3, p0, Lcom/lidroid/xutils/http/HttpHandler;->charset:Ljava/lang/String;
a=0;// 
a=0;//     .line 74
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->client:Lorg/apache/http/impl/client/AbstractHttpClient;
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/impl/client/AbstractHttpClient;);
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/HttpHandler;->notUseApacheRedirectHandler:Lcom/lidroid/xutils/http/HttpHandler$NotUseApacheRedirectHandler;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/HttpHandler$NotUseApacheRedirectHandler;);
a=0;//     invoke-virtual {v0, v1}, Lorg/apache/http/impl/client/AbstractHttpClient;->setRedirectHandler(Lorg/apache/http/client/RedirectHandler;)V
a=0;// 
a=0;//     .line 75
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private handleResponse(Lorg/apache/http/HttpResponse;)Lcom/lidroid/xutils/http/ResponseInfo;
a=0;//     .locals 13
a=0;//     .param p1, "response"    # Lorg/apache/http/HttpResponse;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lorg/apache/http/HttpResponse;",
a=0;//             ")",
a=0;//             "Lcom/lidroid/xutils/http/ResponseInfo",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/lidroid/xutils/exception/HttpException;,
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/lidroid/xutils/http/HttpHandler;, "Lcom/lidroid/xutils/http/HttpHandler<TT;>;"
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 230
a=0;//     #v10=(Null);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 231
a=0;//     new-instance v0, Lcom/lidroid/xutils/exception/HttpException;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/exception/HttpException;);
a=0;//     const-string v2, "response is null"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Lcom/lidroid/xutils/exception/HttpException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/exception/HttpException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 233
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/lidroid/xutils/http/HttpHandler;->isCancelled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 267
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Reference,Lcom/lidroid/xutils/http/ResponseInfo;);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     return-object v5
a=0;// 
a=0;//     .line 235
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Null);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v11=(Uninit);v12=(Uninit);
a=0;//     invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 236
a=0;//     .local v8, "status":Lorg/apache/http/StatusLine;
a=0;//     #v8=(Reference,Lorg/apache/http/StatusLine;);
a=0;//     invoke-interface {v8}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 237
a=0;//     .local v9, "statusCode":I
a=0;//     #v9=(Integer);
a=0;//     const/16 v0, 0x12c
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     if-ge v9, v0, :cond_7
a=0;// 
a=0;//     .line 238
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 239
a=0;//     .local v7, "result":Ljava/lang/Object;
a=0;//     #v7=(Null);
a=0;//     invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 240
a=0;//     .local v1, "entity":Lorg/apache/http/HttpEntity;
a=0;//     #v1=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 241
a=0;//     iput-boolean v10, p0, Lcom/lidroid/xutils/http/HttpHandler;->isUploading:Z
a=0;// 
a=0;//     .line 242
a=0;//     iget-boolean v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->isDownloadingFile:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     .line 243
a=0;//     iget-boolean v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->autoResume:Z
a=0;// 
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     invoke-static {p1}, Lcom/lidroid/xutils/util/OtherUtils;->isSupportRange(Lorg/apache/http/HttpResponse;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     iput-boolean v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->autoResume:Z
a=0;// 
a=0;//     .line 244
a=0;//     iget-boolean v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->autoRename:Z
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-static {p1}, Lcom/lidroid/xutils/util/OtherUtils;->getFileNameFromHttpResponse(Lorg/apache/http/HttpResponse;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 245
a=0;//     .local v5, "responseFileName":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->mFileDownloadHandler:Lcom/lidroid/xutils/http/callback/FileDownloadHandler;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/callback/FileDownloadHandler;);
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/http/HttpHandler;->fileSavePath:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-boolean v4, p0, Lcom/lidroid/xutils/http/HttpHandler;->autoResume:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     move-object v2, p0
a=0;// 
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/http/HttpHandler;);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/lidroid/xutils/http/callback/FileDownloadHandler;->handleEntity(Lorg/apache/http/HttpEntity;Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;Ljava/lang/String;ZLjava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 253
a=0;//     .end local v5    # "responseFileName":Ljava/lang/String;
a=0;//     .end local v7    # "result":Ljava/lang/Object;
a=0;//     :cond_4
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v7=(Reference,Ujava/lang/Object;);v11=(Conflicted);v12=(Conflicted);
a=0;//     new-instance v5, Lcom/lidroid/xutils/http/ResponseInfo;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/lidroid/xutils/http/ResponseInfo;);
a=0;//     invoke-direct {v5, p1, v7, v10}, Lcom/lidroid/xutils/http/ResponseInfo;-><init>(Lorg/apache/http/HttpResponse;Ljava/lang/Object;Z)V
a=0;// 
a=0;//     #v5=(Reference,Lcom/lidroid/xutils/http/ResponseInfo;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .restart local v7    # "result":Ljava/lang/Object;
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Null);v7=(Null);v11=(Uninit);v12=(Uninit);
a=0;//     move v0, v10
a=0;// 
a=0;//     .line 243
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 247
a=0;//     :cond_6
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->mStringDownloadHandler:Lcom/lidroid/xutils/http/callback/StringDownloadHandler;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/callback/StringDownloadHandler;);
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/HttpHandler;->charset:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p0, v2}, Lcom/lidroid/xutils/http/callback/StringDownloadHandler;->handleEntity(Lorg/apache/http/HttpEntity;Lcom/lidroid/xutils/http/callback/RequestCallBackHandler;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 248
a=0;//     .local v7, "result":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     sget-object v0, Lcom/lidroid/xutils/HttpUtils;->sHttpCache:Lcom/lidroid/xutils/http/HttpCache;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/HttpHandler;->requestMethod:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/lidroid/xutils/http/HttpCache;->isEnabled(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 249
a=0;//     sget-object v2, Lcom/lidroid/xutils/HttpUtils;->sHttpCache:Lcom/lidroid/xutils/http/HttpCache;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/http/HttpHandler;->requestUrl:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v0, v7
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     iget-wide v11, p0, Lcom/lidroid/xutils/http/HttpHandler;->expiry:J
a=0;// 
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     invoke-virtual {v2, v3, v0, v11, v12}, Lcom/lidroid/xutils/http/HttpCache;->put(Ljava/lang/String;Ljava/lang/String;J)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 254
a=0;//     .end local v1    # "entity":Lorg/apache/http/HttpEntity;
a=0;//     .end local v7    # "result":Ljava/lang/String;
a=0;//     :cond_7
a=0;//     #v0=(PosShort);v1=(Uninit);v2=(Uninit);v3=(Uninit);v7=(Uninit);v11=(Uninit);v12=(Uninit);
a=0;//     const/16 v0, 0x12d
a=0;// 
a=0;//     if-eq v9, v0, :cond_8
a=0;// 
a=0;//     const/16 v0, 0x12e
a=0;// 
a=0;//     if-ne v9, v0, :cond_a
a=0;// 
a=0;//     .line 255
a=0;//     :cond_8
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->httpRedirectHandler:Lcom/lidroid/xutils/http/callback/HttpRedirectHandler;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/callback/HttpRedirectHandler;);
a=0;//     if-nez v0, :cond_9
a=0;// 
a=0;//     .line 256
a=0;//     new-instance v0, Lcom/lidroid/xutils/http/callback/DefaultHttpRedirectHandler;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/http/callback/DefaultHttpRedirectHandler;);
a=0;//     invoke-direct {v0}, Lcom/lidroid/xutils/http/callback/DefaultHttpRedirectHandler;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/callback/DefaultHttpRedirectHandler;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->httpRedirectHandler:Lcom/lidroid/xutils/http/callback/HttpRedirectHandler;
a=0;// 
a=0;//     .line 258
a=0;//     :cond_9
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->httpRedirectHandler:Lcom/lidroid/xutils/http/callback/HttpRedirectHandler;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Lcom/lidroid/xutils/http/callback/HttpRedirectHandler;->getDirectRequest(Lorg/apache/http/HttpResponse;)Lorg/apache/http/client/methods/HttpRequestBase;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 259
a=0;//     .local v6, "request":Lorg/apache/http/client/methods/HttpRequestBase;
a=0;//     #v6=(Reference,Lorg/apache/http/client/methods/HttpRequestBase;);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 260
a=0;//     invoke-direct {p0, v6}, Lcom/lidroid/xutils/http/HttpHandler;->sendRequest(Lorg/apache/http/client/methods/HttpRequestBase;)Lcom/lidroid/xutils/http/ResponseInfo;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lcom/lidroid/xutils/http/ResponseInfo;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 262
a=0;//     .end local v6    # "request":Lorg/apache/http/client/methods/HttpRequestBase;
a=0;//     :cond_a
a=0;//     #v0=(PosShort);v5=(Null);v6=(Uninit);
a=0;//     const/16 v0, 0x1a0
a=0;// 
a=0;//     if-ne v9, v0, :cond_b
a=0;// 
a=0;//     .line 263
a=0;//     new-instance v0, Lcom/lidroid/xutils/exception/HttpException;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/exception/HttpException;);
a=0;//     const-string v2, "maybe the file has downloaded completely"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v9, v2}, Lcom/lidroid/xutils/exception/HttpException;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/exception/HttpException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 265
a=0;//     :cond_b
a=0;//     #v0=(PosShort);v2=(Uninit);
a=0;//     new-instance v0, Lcom/lidroid/xutils/exception/HttpException;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/exception/HttpException;);
a=0;//     invoke-interface {v8}, Lorg/apache/http/StatusLine;->getReasonPhrase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v9, v2}, Lcom/lidroid/xutils/exception/HttpException;-><init>(ILjava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/exception/HttpException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private sendRequest(Lorg/apache/http/client/methods/HttpRequestBase;)Lcom/lidroid/xutils/http/ResponseInfo;
a=0;//     .locals 13
a=0;//     .param p1, "request"    # Lorg/apache/http/client/methods/HttpRequestBase;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lorg/apache/http/client/methods/HttpRequestBase;",
a=0;//             ")",
a=0;//             "Lcom/lidroid/xutils/http/ResponseInfo",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/lidroid/xutils/exception/HttpException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 101
a=0;//     .local p0, "this":Lcom/lidroid/xutils/http/HttpHandler;, "Lcom/lidroid/xutils/http/HttpHandler<TT;>;"
a=0;//     iget-object v10, p0, Lcom/lidroid/xutils/http/HttpHandler;->client:Lorg/apache/http/impl/client/AbstractHttpClient;
a=0;// 
a=0;//     #v10=(Reference,Lorg/apache/http/impl/client/AbstractHttpClient;);
a=0;//     invoke-virtual {v10}, Lorg/apache/http/impl/client/AbstractHttpClient;->getHttpRequestRetryHandler()Lorg/apache/http/client/HttpRequestRetryHandler;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 104
a=0;//     .local v9, "retryHandler":Lorg/apache/http/client/HttpRequestRetryHandler;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Reference,Lorg/apache/http/client/HttpRequestRetryHandler;);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     iget-boolean v10, p0, Lcom/lidroid/xutils/http/HttpHandler;->autoResume:Z
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_2
a=0;// 
a=0;//     iget-boolean v10, p0, Lcom/lidroid/xutils/http/HttpHandler;->isDownloadingFile:Z
a=0;// 
a=0;//     if-eqz v10, :cond_2
a=0;// 
a=0;//     .line 105
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v10, p0, Lcom/lidroid/xutils/http/HttpHandler;->fileSavePath:Ljava/lang/String;
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 106
a=0;//     .local v0, "downloadFile":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     .line 107
a=0;//     .local v3, "fileLen":J
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->isFile()Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     if-eqz v10, :cond_1
a=0;// 
a=0;//     .line 108
a=0;//     invoke-virtual {v0}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     .line 110
a=0;//     :cond_1
a=0;//     const-wide/16 v10, 0x0
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     cmp-long v10, v3, v10
a=0;// 
a=0;//     #v10=(Byte);
a=0;//     if-lez v10, :cond_2
a=0;// 
a=0;//     .line 111
a=0;//     const-string v10, "RANGE"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, "bytes="
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v11, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     const-string v12, "-"
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {p1, v10, v11}, Lorg/apache/http/client/methods/HttpRequestBase;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 115
a=0;//     .end local v0    # "downloadFile":Ljava/io/File;
a=0;//     .end local v3    # "fileLen":J
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     .line 116
a=0;//     .local v8, "retry":Z
a=0;//     #v8=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 118
a=0;//     .local v2, "exception":Ljava/io/IOException;
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p1}, Lorg/apache/http/client/methods/HttpRequestBase;->getMethod()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     iput-object v10, p0, Lcom/lidroid/xutils/http/HttpHandler;->requestMethod:Ljava/lang/String;
a=0;// 
a=0;//     .line 119
a=0;//     sget-object v10, Lcom/lidroid/xutils/HttpUtils;->sHttpCache:Lcom/lidroid/xutils/http/HttpCache;
a=0;// 
a=0;//     iget-object v11, p0, Lcom/lidroid/xutils/http/HttpHandler;->requestMethod:Ljava/lang/String;
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v11}, Lcom/lidroid/xutils/http/HttpCache;->isEnabled(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_4
a=0;// 
a=0;//     .line 120
a=0;//     sget-object v10, Lcom/lidroid/xutils/HttpUtils;->sHttpCache:Lcom/lidroid/xutils/http/HttpCache;
a=0;// 
a=0;//     #v10=(Reference,Lcom/lidroid/xutils/http/HttpCache;);
a=0;//     iget-object v11, p0, Lcom/lidroid/xutils/http/HttpHandler;->requestUrl:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Lcom/lidroid/xutils/http/HttpCache;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 121
a=0;//     .local v7, "result":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v7, :cond_4
a=0;// 
a=0;//     .line 122
a=0;//     new-instance v6, Lcom/lidroid/xutils/http/ResponseInfo;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/lidroid/xutils/http/ResponseInfo;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     #v11=(One);
a=0;//     invoke-direct {v6, v10, v7, v11}, Lcom/lidroid/xutils/http/ResponseInfo;-><init>(Lorg/apache/http/HttpResponse;Ljava/lang/Object;Z)V
a=0;// 
a=0;//     .line 131
a=0;//     .end local v7    # "result":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     :goto_0
a=0;//     #v6=(Reference,Lcom/lidroid/xutils/http/ResponseInfo;);v7=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     return-object v6
a=0;// 
a=0;//     .line 126
a=0;//     :cond_4
a=0;//     #v6=(Conflicted);v11=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 127
a=0;//     .local v6, "responseInfo":Lcom/lidroid/xutils/http/ResponseInfo;, "Lcom/lidroid/xutils/http/ResponseInfo<TT;>;"
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {p0}, Lcom/lidroid/xutils/http/HttpHandler;->isCancelled()Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-nez v10, :cond_3
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v10, p0, Lcom/lidroid/xutils/http/HttpHandler;->client:Lorg/apache/http/impl/client/AbstractHttpClient;
a=0;// 
a=0;//     #v10=(Reference,Lorg/apache/http/impl/client/AbstractHttpClient;);
a=0;//     iget-object v11, p0, Lcom/lidroid/xutils/http/HttpHandler;->context:Lorg/apache/http/protocol/HttpContext;
a=0;// 
a=0;//     invoke-virtual {v10, p1, v11}, Lorg/apache/http/impl/client/AbstractHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 129
a=0;//     .local v5, "response":Lorg/apache/http/HttpResponse;
a=0;//     #v5=(Reference,Lorg/apache/http/HttpResponse;);
a=0;//     invoke-direct {p0, v5}, Lcom/lidroid/xutils/http/HttpHandler;->handleResponse(Lorg/apache/http/HttpResponse;)Lcom/lidroid/xutils/http/ResponseInfo;
a=0;//     :try_end_0
a=0;//     .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_2
a=0;//     .catch Lcom/lidroid/xutils/exception/HttpException; {:try_start_0 .. :try_end_0} :catch_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_4
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Lcom/lidroid/xutils/http/ResponseInfo;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 132
a=0;//     .end local v5    # "response":Lorg/apache/http/HttpResponse;
a=0;//     .end local v6    # "responseInfo":Lcom/lidroid/xutils/http/ResponseInfo;, "Lcom/lidroid/xutils/http/ResponseInfo<TT;>;"
a=0;//     :catch_0
a=0;//     #v5=(Conflicted);v6=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 133
a=0;//     .local v1, "e":Ljava/net/UnknownHostException;
a=0;//     #v1=(Reference,Ljava/net/UnknownHostException;);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     .line 134
a=0;//     #v2=(Reference,Ljava/net/UnknownHostException;);
a=0;//     iget v10, p0, Lcom/lidroid/xutils/http/HttpHandler;->retriedCount:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     add-int/lit8 v10, v10, 0x1
a=0;// 
a=0;//     iput v10, p0, Lcom/lidroid/xutils/http/HttpHandler;->retriedCount:I
a=0;// 
a=0;//     iget-object v11, p0, Lcom/lidroid/xutils/http/HttpHandler;->context:Lorg/apache/http/protocol/HttpContext;
a=0;// 
a=0;//     #v11=(Reference,Lorg/apache/http/protocol/HttpContext;);
a=0;//     invoke-interface {v9, v2, v10, v11}, Lorg/apache/http/client/HttpRequestRetryHandler;->retryRequest(Ljava/io/IOException;ILorg/apache/http/protocol/HttpContext;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 149
a=0;//     .end local v1    # "e":Ljava/net/UnknownHostException;
a=0;//     :goto_1
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_0
a=0;// 
a=0;//     .line 150
a=0;//     new-instance v10, Lcom/lidroid/xutils/exception/HttpException;
a=0;// 
a=0;//     #v10=(UninitRef,Lcom/lidroid/xutils/exception/HttpException;);
a=0;//     invoke-direct {v10, v2}, Lcom/lidroid/xutils/exception/HttpException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v10=(Reference,Lcom/lidroid/xutils/exception/HttpException;);
a=0;//     throw v10
a=0;// 
a=0;//     .line 135
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v2=(Null);v8=(One);v10=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 136
a=0;//     .local v1, "e":Ljava/io/IOException;
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     .line 137
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     iget v10, p0, Lcom/lidroid/xutils/http/HttpHandler;->retriedCount:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     add-int/lit8 v10, v10, 0x1
a=0;// 
a=0;//     iput v10, p0, Lcom/lidroid/xutils/http/HttpHandler;->retriedCount:I
a=0;// 
a=0;//     iget-object v11, p0, Lcom/lidroid/xutils/http/HttpHandler;->context:Lorg/apache/http/protocol/HttpContext;
a=0;// 
a=0;//     #v11=(Reference,Lorg/apache/http/protocol/HttpContext;);
a=0;//     invoke-interface {v9, v2, v10, v11}, Lorg/apache/http/client/HttpRequestRetryHandler;->retryRequest(Ljava/io/IOException;ILorg/apache/http/protocol/HttpContext;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 138
a=0;//     .end local v1    # "e":Ljava/io/IOException;
a=0;//     :catch_2
a=0;//     #v1=(Conflicted);v2=(Null);v8=(One);v10=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 139
a=0;//     .local v1, "e":Ljava/lang/NullPointerException;
a=0;//     #v1=(Reference,Ljava/lang/NullPointerException;);
a=0;//     new-instance v2, Ljava/io/IOException;
a=0;// 
a=0;//     .end local v2    # "exception":Ljava/io/IOException;
a=0;//     #v2=(UninitRef,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/lang/NullPointerException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v10}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 140
a=0;//     .restart local v2    # "exception":Ljava/io/IOException;
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v2, v1}, Ljava/io/IOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
a=0;// 
a=0;//     .line 141
a=0;//     iget v10, p0, Lcom/lidroid/xutils/http/HttpHandler;->retriedCount:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     add-int/lit8 v10, v10, 0x1
a=0;// 
a=0;//     iput v10, p0, Lcom/lidroid/xutils/http/HttpHandler;->retriedCount:I
a=0;// 
a=0;//     iget-object v11, p0, Lcom/lidroid/xutils/http/HttpHandler;->context:Lorg/apache/http/protocol/HttpContext;
a=0;// 
a=0;//     #v11=(Reference,Lorg/apache/http/protocol/HttpContext;);
a=0;//     invoke-interface {v9, v2, v10, v11}, Lorg/apache/http/client/HttpRequestRetryHandler;->retryRequest(Ljava/io/IOException;ILorg/apache/http/protocol/HttpContext;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 142
a=0;//     .end local v1    # "e":Ljava/lang/NullPointerException;
a=0;//     :catch_3
a=0;//     #v1=(Conflicted);v2=(Null);v8=(One);v10=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 143
a=0;//     .local v1, "e":Lcom/lidroid/xutils/exception/HttpException;
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/exception/HttpException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 144
a=0;//     .end local v1    # "e":Lcom/lidroid/xutils/exception/HttpException;
a=0;//     :catch_4
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 145
a=0;//     .local v1, "e":Ljava/lang/Throwable;
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     new-instance v2, Ljava/io/IOException;
a=0;// 
a=0;//     .end local v2    # "exception":Ljava/io/IOException;
a=0;//     #v2=(UninitRef,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v10}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 146
a=0;//     .restart local v2    # "exception":Ljava/io/IOException;
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v2, v1}, Ljava/io/IOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
a=0;// 
a=0;//     .line 147
a=0;//     iget v10, p0, Lcom/lidroid/xutils/http/HttpHandler;->retriedCount:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     add-int/lit8 v10, v10, 0x1
a=0;// 
a=0;//     iput v10, p0, Lcom/lidroid/xutils/http/HttpHandler;->retriedCount:I
a=0;// 
a=0;//     iget-object v11, p0, Lcom/lidroid/xutils/http/HttpHandler;->context:Lorg/apache/http/protocol/HttpContext;
a=0;// 
a=0;//     #v11=(Reference,Lorg/apache/http/protocol/HttpContext;);
a=0;//     invoke-interface {v9, v2, v10, v11}, Lorg/apache/http/client/HttpRequestRetryHandler;->retryRequest(Ljava/io/IOException;ILorg/apache/http/protocol/HttpContext;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/lidroid/xutils/http/HttpHandler;->doInBackground([Ljava/lang/Object;)Ljava/lang/Void;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Void;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected varargs doInBackground([Ljava/lang/Object;)Ljava/lang/Void;
a=0;//     .locals 10
a=0;//     .param p1, "params"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/lidroid/xutils/http/HttpHandler;, "Lcom/lidroid/xutils/http/HttpHandler<TT;>;"
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v7, 0x3
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 157
a=0;//     #v3=(One);
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/HttpHandler;->state:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     sget-object v5, Lcom/lidroid/xutils/http/HttpHandler$State;->STOPPED:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v5=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     if-eq v2, v5, :cond_0
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     array-length v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 188
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v8
a=0;// 
a=0;//     .line 159
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Integer);v3=(One);v5=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);v6=(Uninit);
a=0;//     array-length v2, p1
a=0;// 
a=0;//     if-le v2, v7, :cond_2
a=0;// 
a=0;//     .line 160
a=0;//     aget-object v2, p1, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, p0, Lcom/lidroid/xutils/http/HttpHandler;->fileSavePath:Ljava/lang/String;
a=0;// 
a=0;//     .line 161
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/HttpHandler;->fileSavePath:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Boolean);
a=0;//     iput-boolean v2, p0, Lcom/lidroid/xutils/http/HttpHandler;->isDownloadingFile:Z
a=0;// 
a=0;//     .line 162
a=0;//     aget-object v2, p1, v9
a=0;// 
a=0;//     #v2=(Null);
a=0;//     check-cast v2, Ljava/lang/Boolean;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     iput-boolean v2, p0, Lcom/lidroid/xutils/http/HttpHandler;->autoResume:Z
a=0;// 
a=0;//     .line 163
a=0;//     aget-object v2, p1, v7
a=0;// 
a=0;//     #v2=(Null);
a=0;//     check-cast v2, Ljava/lang/Boolean;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     iput-boolean v2, p0, Lcom/lidroid/xutils/http/HttpHandler;->autoRename:Z
a=0;// 
a=0;//     .line 167
a=0;//     :cond_2
a=0;//     :try_start_0
a=0;//     #v2=(Integer);
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/HttpHandler;->state:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     sget-object v5, Lcom/lidroid/xutils/http/HttpHandler$State;->STOPPED:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     if-eq v2, v5, :cond_0
a=0;// 
a=0;//     .line 169
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget-object v2, p1, v2
a=0;// 
a=0;//     check-cast v2, Lorg/apache/http/client/methods/HttpRequestBase;
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/client/methods/HttpRequestBase;);
a=0;//     iput-object v2, p0, Lcom/lidroid/xutils/http/HttpHandler;->request:Lorg/apache/http/client/methods/HttpRequestBase;
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/HttpHandler;->request:Lorg/apache/http/client/methods/HttpRequestBase;
a=0;// 
a=0;//     invoke-virtual {v2}, Lorg/apache/http/client/methods/HttpRequestBase;->getURI()Ljava/net/URI;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/net/URI;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Lcom/lidroid/xutils/http/HttpHandler;->requestUrl:Ljava/lang/String;
a=0;// 
a=0;//     .line 171
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/HttpHandler;->callback:Lcom/lidroid/xutils/http/callback/RequestCallBack;
a=0;// 
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 172
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/HttpHandler;->callback:Lcom/lidroid/xutils/http/callback/RequestCallBack;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/lidroid/xutils/http/HttpHandler;->requestUrl:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Lcom/lidroid/xutils/http/callback/RequestCallBack;->setRequestUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 175
a=0;//     :cond_3
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v6, v2, v5
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Lcom/lidroid/xutils/http/HttpHandler;->publishProgress([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 177
a=0;//     invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     iput-wide v5, p0, Lcom/lidroid/xutils/http/HttpHandler;->lastUpdateTime:J
a=0;// 
a=0;//     .line 179
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/HttpHandler;->request:Lorg/apache/http/client/methods/HttpRequestBase;
a=0;// 
a=0;//     invoke-direct {p0, v2}, Lcom/lidroid/xutils/http/HttpHandler;->sendRequest(Lorg/apache/http/client/methods/HttpRequestBase;)Lcom/lidroid/xutils/http/ResponseInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 180
a=0;//     .local v1, "responseInfo":Lcom/lidroid/xutils/http/ResponseInfo;, "Lcom/lidroid/xutils/http/ResponseInfo<TT;>;"
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/ResponseInfo;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 181
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x4
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v6, v2, v5
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     aput-object v1, v2, v5
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Lcom/lidroid/xutils/http/HttpHandler;->publishProgress([Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Lcom/lidroid/xutils/exception/HttpException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 184
a=0;//     .end local v1    # "responseInfo":Lcom/lidroid/xutils/http/ResponseInfo;, "Lcom/lidroid/xutils/http/ResponseInfo<TT;>;"
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 185
a=0;//     .local v0, "e":Lcom/lidroid/xutils/exception/HttpException;
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/exception/HttpException;);
a=0;//     new-array v2, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v2, v4
a=0;// 
a=0;//     aput-object v0, v2, v3
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/lidroid/xutils/exception/HttpException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v2, v9
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Lcom/lidroid/xutils/http/HttpHandler;->publishProgress([Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .end local v0    # "e":Lcom/lidroid/xutils/exception/HttpException;
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(One);v6=(Uninit);
a=0;//     move v2, v4
a=0;// 
a=0;//     .line 161
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public getRequestCallBack()Lcom/lidroid/xutils/http/callback/RequestCallBack;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/lidroid/xutils/http/callback/RequestCallBack",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     .local p0, "this":Lcom/lidroid/xutils/http/HttpHandler;, "Lcom/lidroid/xutils/http/HttpHandler<TT;>;"
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->callback:Lcom/lidroid/xutils/http/callback/RequestCallBack;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/callback/RequestCallBack;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getState()Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     .local p0, "this":Lcom/lidroid/xutils/http/HttpHandler;, "Lcom/lidroid/xutils/http/HttpHandler<TT;>;"
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->state:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public isStopped()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 295
a=0;//     .local p0, "this":Lcom/lidroid/xutils/http/HttpHandler;, "Lcom/lidroid/xutils/http/HttpHandler<TT;>;"
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->state:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/HttpHandler$State;->STOPPED:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected varargs onProgressUpdate([Ljava/lang/Object;)V
a=0;//     .locals 6
a=0;//     .param p1, "values"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/lidroid/xutils/http/HttpHandler;, "Lcom/lidroid/xutils/http/HttpHandler<TT;>;"
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 199
a=0;//     #v3=(One);
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->state:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/HttpHandler$State;->STOPPED:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->callback:Lcom/lidroid/xutils/http/callback/RequestCallBack;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/callback/RequestCallBack;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 226
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 200
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/callback/RequestCallBack;);v1=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);v2=(PosByte);v3=(One);v4=(PosByte);v5=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     aget-object v0, p1, v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 202
a=0;//     :pswitch_0
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/HttpHandler$State;->STARTED:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->state:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     .line 203
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->callback:Lcom/lidroid/xutils/http/callback/RequestCallBack;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/lidroid/xutils/http/callback/RequestCallBack;->onStart()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 206
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);
a=0;//     array-length v0, p1
a=0;// 
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     .line 207
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/HttpHandler$State;->LOADING:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->state:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     .line 208
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->callback:Lcom/lidroid/xutils/http/callback/RequestCallBack;
a=0;// 
a=0;//     .line 209
a=0;//     aget-object v1, p1, v3
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     .line 210
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     aget-object v3, p1, v4
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     .line 211
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     iget-boolean v5, p0, Lcom/lidroid/xutils/http/HttpHandler;->isUploading:Z
a=0;// 
a=0;//     .line 208
a=0;//     #v5=(Boolean);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/lidroid/xutils/http/callback/RequestCallBack;->onLoading(JJZ)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 214
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);v1=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);v2=(PosByte);v3=(One);v4=(PosByte);v5=(Uninit);
a=0;//     array-length v0, p1
a=0;// 
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     .line 215
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/HttpHandler$State;->FAILURE:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->state:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     .line 216
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/HttpHandler;->callback:Lcom/lidroid/xutils/http/callback/RequestCallBack;
a=0;// 
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/http/callback/RequestCallBack;);
a=0;//     aget-object v0, p1, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     check-cast v0, Lcom/lidroid/xutils/exception/HttpException;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/exception/HttpException;);
a=0;//     aget-object v1, p1, v4
a=0;// 
a=0;//     #v1=(Null);
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0, v1}, Lcom/lidroid/xutils/http/callback/RequestCallBack;->onFailure(Lcom/lidroid/xutils/exception/HttpException;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 219
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);v2=(PosByte);
a=0;//     array-length v0, p1
a=0;// 
a=0;//     if-ne v0, v4, :cond_0
a=0;// 
a=0;//     .line 220
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/HttpHandler$State;->SUCCESS:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->state:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     .line 221
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/http/HttpHandler;->callback:Lcom/lidroid/xutils/http/callback/RequestCallBack;
a=0;// 
a=0;//     aget-object v0, p1, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     check-cast v0, Lcom/lidroid/xutils/http/ResponseInfo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/ResponseInfo;);
a=0;//     invoke-virtual {v1, v0}, Lcom/lidroid/xutils/http/callback/RequestCallBack;->onSuccess(Lcom/lidroid/xutils/http/ResponseInfo;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 200
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public setExpiry(J)V
a=0;//     .locals 0
a=0;//     .param p1, "expiry"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     .local p0, "this":Lcom/lidroid/xutils/http/HttpHandler;, "Lcom/lidroid/xutils/http/HttpHandler<TT;>;"
a=0;//     iput-wide p1, p0, Lcom/lidroid/xutils/http/HttpHandler;->expiry:J
a=0;// 
a=0;//     .line 87
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setHttpRedirectHandler(Lcom/lidroid/xutils/http/callback/HttpRedirectHandler;)V
a=0;//     .locals 0
a=0;//     .param p1, "httpRedirectHandler"    # Lcom/lidroid/xutils/http/callback/HttpRedirectHandler;
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     .local p0, "this":Lcom/lidroid/xutils/http/HttpHandler;, "Lcom/lidroid/xutils/http/HttpHandler<TT;>;"
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 52
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/HttpHandler;->httpRedirectHandler:Lcom/lidroid/xutils/http/callback/HttpRedirectHandler;
a=0;// 
a=0;//     .line 54
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setRequestCallBack(Lcom/lidroid/xutils/http/callback/RequestCallBack;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/lidroid/xutils/http/callback/RequestCallBack",
a=0;//             "<TT;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     .local p0, "this":Lcom/lidroid/xutils/http/HttpHandler;, "Lcom/lidroid/xutils/http/HttpHandler<TT;>;"
a=0;//     .local p1, "callback":Lcom/lidroid/xutils/http/callback/RequestCallBack;, "Lcom/lidroid/xutils/http/callback/RequestCallBack<TT;>;"
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/HttpHandler;->callback:Lcom/lidroid/xutils/http/callback/RequestCallBack;
a=0;// 
a=0;//     .line 91
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public stop()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 274
a=0;//     .local p0, "this":Lcom/lidroid/xutils/http/HttpHandler;, "Lcom/lidroid/xutils/http/HttpHandler<TT;>;"
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/HttpHandler$State;->STOPPED:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->state:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     .line 276
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->request:Lorg/apache/http/client/methods/HttpRequestBase;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->request:Lorg/apache/http/client/methods/HttpRequestBase;
a=0;// 
a=0;//     invoke-virtual {v0}, Lorg/apache/http/client/methods/HttpRequestBase;->isAborted()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 278
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->request:Lorg/apache/http/client/methods/HttpRequestBase;
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/client/methods/HttpRequestBase;);
a=0;//     invoke-virtual {v0}, Lorg/apache/http/client/methods/HttpRequestBase;->abort()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 282
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/lidroid/xutils/http/HttpHandler;->isCancelled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 284
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lcom/lidroid/xutils/http/HttpHandler;->cancel(Z)Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 289
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->callback:Lcom/lidroid/xutils/http/callback/RequestCallBack;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/callback/RequestCallBack;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 290
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->callback:Lcom/lidroid/xutils/http/callback/RequestCallBack;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/lidroid/xutils/http/callback/RequestCallBack;->onStopped()V
a=0;// 
a=0;//     .line 292
a=0;//     :cond_2
a=0;//     return-void
a=0;// 
a=0;//     .line 285
a=0;//     :catch_0
a=0;//     #v0=(One);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 279
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public updateProgress(JJZ)Z
a=0;//     .locals 10
a=0;//     .param p1, "total"    # J
a=0;//     .param p3, "current"    # J
a=0;//     .param p5, "forceUpdateUI"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/lidroid/xutils/http/HttpHandler;, "Lcom/lidroid/xutils/http/HttpHandler<TT;>;"
a=0;//     const/4 v9, 0x3
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     .line 302
a=0;//     #v8=(PosByte);
a=0;//     iget-object v4, p0, Lcom/lidroid/xutils/http/HttpHandler;->callback:Lcom/lidroid/xutils/http/callback/RequestCallBack;
a=0;// 
a=0;//     #v4=(Reference,Lcom/lidroid/xutils/http/callback/RequestCallBack;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     iget-object v4, p0, Lcom/lidroid/xutils/http/HttpHandler;->state:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     sget-object v5, Lcom/lidroid/xutils/http/HttpHandler$State;->STOPPED:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v5=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     if-eq v4, v5, :cond_0
a=0;// 
a=0;//     .line 303
a=0;//     if-eqz p5, :cond_1
a=0;// 
a=0;//     .line 304
a=0;//     new-array v4, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v4, v3
a=0;// 
a=0;//     invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v4, v2
a=0;// 
a=0;//     invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v4, v8
a=0;// 
a=0;//     invoke-virtual {p0, v4}, Lcom/lidroid/xutils/http/HttpHandler;->publishProgress([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 313
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v4, p0, Lcom/lidroid/xutils/http/HttpHandler;->state:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v4=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     sget-object v5, Lcom/lidroid/xutils/http/HttpHandler$State;->STOPPED:Lcom/lidroid/xutils/http/HttpHandler$State;
a=0;// 
a=0;//     #v5=(Reference,Lcom/lidroid/xutils/http/HttpHandler$State;);
a=0;//     if-eq v4, v5, :cond_2
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Boolean);
a=0;//     return v2
a=0;// 
a=0;//     .line 306
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(One);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 307
a=0;//     .local v0, "currTime":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-wide v4, p0, Lcom/lidroid/xutils/http/HttpHandler;->lastUpdateTime:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     sub-long v4, v0, v4
a=0;// 
a=0;//     iget-object v6, p0, Lcom/lidroid/xutils/http/HttpHandler;->callback:Lcom/lidroid/xutils/http/callback/RequestCallBack;
a=0;// 
a=0;//     #v6=(Reference,Lcom/lidroid/xutils/http/callback/RequestCallBack;);
a=0;//     invoke-virtual {v6}, Lcom/lidroid/xutils/http/callback/RequestCallBack;->getRate()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-long v6, v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     cmp-long v4, v4, v6
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-ltz v4, :cond_0
a=0;// 
a=0;//     .line 308
a=0;//     iput-wide v0, p0, Lcom/lidroid/xutils/http/HttpHandler;->lastUpdateTime:J
a=0;// 
a=0;//     .line 309
a=0;//     new-array v4, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v4, v3
a=0;// 
a=0;//     invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v4, v2
a=0;// 
a=0;//     invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v4, v8
a=0;// 
a=0;//     invoke-virtual {p0, v4}, Lcom/lidroid/xutils/http/HttpHandler;->publishProgress([Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .end local v0    # "currTime":J
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 313
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// .end method
}}
