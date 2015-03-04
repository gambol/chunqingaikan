package com.tencent.utils; class HttpUtils$1 { void a() { int a;
a=0;// .class final Lcom/tencent/utils/HttpUtils$1;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/tencent/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;// .field final synthetic b:Landroid/content/Context;
a=0;// 
a=0;// .field final synthetic c:Ljava/lang/String;
a=0;// 
a=0;// .field final synthetic d:Landroid/os/Bundle;
a=0;// 
a=0;// .field final synthetic e:Ljava/lang/String;
a=0;// 
a=0;// .field final synthetic f:Lcom/tencent/tauth/IRequestListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 331
a=0;//     iput-object p1, p0, Lcom/tencent/utils/HttpUtils$1;->a:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/tencent/utils/HttpUtils$1;->b:Landroid/content/Context;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/tencent/utils/HttpUtils$1;->c:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p4, p0, Lcom/tencent/utils/HttpUtils$1;->d:Landroid/os/Bundle;
a=0;// 
a=0;//     iput-object p5, p0, Lcom/tencent/utils/HttpUtils$1;->e:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p6, p0, Lcom/tencent/utils/HttpUtils$1;->f:Lcom/tencent/tauth/IRequestListener;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/utils/HttpUtils$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 335
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/tencent/utils/HttpUtils$1;->a:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     iget-object v1, p0, Lcom/tencent/utils/HttpUtils$1;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Lcom/tencent/utils/HttpUtils$1;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/tencent/utils/HttpUtils$1;->d:Landroid/os/Bundle;
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     iget-object v4, p0, Lcom/tencent/utils/HttpUtils$1;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2, v3, v4}, Lcom/tencent/utils/HttpUtils;->request(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 337
a=0;//     iget-object v1, p0, Lcom/tencent/utils/HttpUtils$1;->f:Lcom/tencent/tauth/IRequestListener;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 338
a=0;//     iget-object v1, p0, Lcom/tencent/utils/HttpUtils$1;->f:Lcom/tencent/tauth/IRequestListener;
a=0;// 
a=0;//     invoke-interface {v1, v0}, Lcom/tencent/tauth/IRequestListener;->onComplete(Lorg/json/JSONObject;)V
a=0;// 
a=0;//     .line 339
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     const-string v1, "OpenApi onComplete"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_2
a=0;//     .catch Lcom/tencent/utils/HttpUtils$NetworkUnavailableException; {:try_start_0 .. :try_end_0} :catch_3
a=0;//     .catch Lcom/tencent/utils/HttpUtils$HttpStatusException; {:try_start_0 .. :try_end_0} :catch_4
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_6
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7
a=0;// 
a=0;//     .line 382
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 341
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 342
a=0;//     #v0=(Reference,Ljava/net/MalformedURLException;);
a=0;//     iget-object v1, p0, Lcom/tencent/utils/HttpUtils$1;->f:Lcom/tencent/tauth/IRequestListener;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/tauth/IRequestListener;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 343
a=0;//     iget-object v1, p0, Lcom/tencent/utils/HttpUtils$1;->f:Lcom/tencent/tauth/IRequestListener;
a=0;// 
a=0;//     invoke-interface {v1, v0}, Lcom/tencent/tauth/IRequestListener;->onMalformedURLException(Ljava/net/MalformedURLException;)V
a=0;// 
a=0;//     .line 344
a=0;//     const-string v1, "openSDK_LOG"
a=0;// 
a=0;//     const-string v2, "OpenApi requestAsync MalformedURLException"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 346
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 347
a=0;//     #v0=(Reference,Lorg/apache/http/conn/ConnectTimeoutException;);
a=0;//     iget-object v1, p0, Lcom/tencent/utils/HttpUtils$1;->f:Lcom/tencent/tauth/IRequestListener;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/tauth/IRequestListener;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 348
a=0;//     iget-object v1, p0, Lcom/tencent/utils/HttpUtils$1;->f:Lcom/tencent/tauth/IRequestListener;
a=0;// 
a=0;//     invoke-interface {v1, v0}, Lcom/tencent/tauth/IRequestListener;->onConnectTimeoutException(Lorg/apache/http/conn/ConnectTimeoutException;)V
a=0;// 
a=0;//     .line 349
a=0;//     const-string v1, "openSDK_LOG"
a=0;// 
a=0;//     const-string v2, "OpenApi requestAsync onConnectTimeoutException"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 351
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 352
a=0;//     #v0=(Reference,Ljava/net/SocketTimeoutException;);
a=0;//     iget-object v1, p0, Lcom/tencent/utils/HttpUtils$1;->f:Lcom/tencent/tauth/IRequestListener;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/tauth/IRequestListener;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 353
a=0;//     iget-object v1, p0, Lcom/tencent/utils/HttpUtils$1;->f:Lcom/tencent/tauth/IRequestListener;
a=0;// 
a=0;//     invoke-interface {v1, v0}, Lcom/tencent/tauth/IRequestListener;->onSocketTimeoutException(Ljava/net/SocketTimeoutException;)V
a=0;// 
a=0;//     .line 354
a=0;//     const-string v1, "openSDK_LOG"
a=0;// 
a=0;//     const-string v2, "OpenApi requestAsync onSocketTimeoutException"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 356
a=0;//     :catch_3
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 357
a=0;//     #v0=(Reference,Lcom/tencent/utils/HttpUtils$NetworkUnavailableException;);
a=0;//     iget-object v1, p0, Lcom/tencent/utils/HttpUtils$1;->f:Lcom/tencent/tauth/IRequestListener;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/tauth/IRequestListener;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 358
a=0;//     iget-object v1, p0, Lcom/tencent/utils/HttpUtils$1;->f:Lcom/tencent/tauth/IRequestListener;
a=0;// 
a=0;//     invoke-interface {v1, v0}, Lcom/tencent/tauth/IRequestListener;->onNetworkUnavailableException(Lcom/tencent/utils/HttpUtils$NetworkUnavailableException;)V
a=0;// 
a=0;//     .line 359
a=0;//     const-string v1, "openSDK_LOG"
a=0;// 
a=0;//     const-string v2, "OpenApi requestAsync onNetworkUnavailableException"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 361
a=0;//     :catch_4
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 362
a=0;//     #v0=(Reference,Lcom/tencent/utils/HttpUtils$HttpStatusException;);
a=0;//     iget-object v1, p0, Lcom/tencent/utils/HttpUtils$1;->f:Lcom/tencent/tauth/IRequestListener;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/tauth/IRequestListener;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 363
a=0;//     iget-object v1, p0, Lcom/tencent/utils/HttpUtils$1;->f:Lcom/tencent/tauth/IRequestListener;
a=0;// 
a=0;//     invoke-interface {v1, v0}, Lcom/tencent/tauth/IRequestListener;->onHttpStatusException(Lcom/tencent/utils/HttpUtils$HttpStatusException;)V
a=0;// 
a=0;//     .line 364
a=0;//     const-string v1, "openSDK_LOG"
a=0;// 
a=0;//     const-string v2, "OpenApi requestAsync onHttpStatusException"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 366
a=0;//     :catch_5
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 367
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     iget-object v1, p0, Lcom/tencent/utils/HttpUtils$1;->f:Lcom/tencent/tauth/IRequestListener;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/tauth/IRequestListener;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 368
a=0;//     iget-object v1, p0, Lcom/tencent/utils/HttpUtils$1;->f:Lcom/tencent/tauth/IRequestListener;
a=0;// 
a=0;//     invoke-interface {v1, v0}, Lcom/tencent/tauth/IRequestListener;->onIOException(Ljava/io/IOException;)V
a=0;// 
a=0;//     .line 369
a=0;//     const-string v1, "openSDK_LOG"
a=0;// 
a=0;//     const-string v2, "OpenApi requestAsync IOException"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 371
a=0;//     :catch_6
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 372
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     iget-object v1, p0, Lcom/tencent/utils/HttpUtils$1;->f:Lcom/tencent/tauth/IRequestListener;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/tauth/IRequestListener;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 373
a=0;//     iget-object v1, p0, Lcom/tencent/utils/HttpUtils$1;->f:Lcom/tencent/tauth/IRequestListener;
a=0;// 
a=0;//     invoke-interface {v1, v0}, Lcom/tencent/tauth/IRequestListener;->onJSONException(Lorg/json/JSONException;)V
a=0;// 
a=0;//     .line 374
a=0;//     const-string v1, "openSDK_LOG"
a=0;// 
a=0;//     const-string v2, "OpenApi requestAsync JSONException"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 376
a=0;//     :catch_7
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 377
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     iget-object v1, p0, Lcom/tencent/utils/HttpUtils$1;->f:Lcom/tencent/tauth/IRequestListener;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/tauth/IRequestListener;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 378
a=0;//     iget-object v1, p0, Lcom/tencent/utils/HttpUtils$1;->f:Lcom/tencent/tauth/IRequestListener;
a=0;// 
a=0;//     invoke-interface {v1, v0}, Lcom/tencent/tauth/IRequestListener;->onUnknowException(Ljava/lang/Exception;)V
a=0;// 
a=0;//     .line 379
a=0;//     const-string v1, "openSDK_LOG"
a=0;// 
a=0;//     const-string v2, "OpenApi requestAsync onUnknowException"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
