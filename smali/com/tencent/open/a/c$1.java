package com.tencent.open.a; class c$1 { void a() { int a;
a=0;// .class Lcom/tencent/open/a/c$1;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/tencent/open/a/c;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Ljava/lang/String;
a=0;// 
a=0;// .field final synthetic b:Landroid/content/Context;
a=0;// 
a=0;// .field final synthetic c:Landroid/os/Bundle;
a=0;// 
a=0;// .field final synthetic d:Lcom/tencent/open/a/c;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/tencent/open/a/c;Ljava/lang/String;Landroid/content/Context;Landroid/os/Bundle;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 318
a=0;//     iput-object p1, p0, Lcom/tencent/open/a/c$1;->d:Lcom/tencent/open/a/c;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/tencent/open/a/c$1;->a:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/tencent/open/a/c$1;->b:Landroid/content/Context;
a=0;// 
a=0;//     iput-object p4, p0, Lcom/tencent/open/a/c$1;->c:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/open/a/c$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 320
a=0;//     #v1=(Null);
a=0;//     const-string v0, "cgi_report_debug"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "ReportManager doUploadItems Thread start, url = "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v4, p0, Lcom/tencent/open/a/c$1;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 322
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/c$1;->d:Lcom/tencent/open/a/c;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/open/a/c$1;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v2, v5}, Lcom/tencent/utils/OpenConfig;->getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/utils/OpenConfig;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v4, "Common_HttpRetryCount"
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Lcom/tencent/utils/OpenConfig;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0, v2}, Lcom/tencent/open/a/c;->a(Lcom/tencent/open/a/c;I)I
a=0;// 
a=0;//     .line 323
a=0;//     iget-object v2, p0, Lcom/tencent/open/a/c$1;->d:Lcom/tencent/open/a/c;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/open/a/c;);
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/c$1;->d:Lcom/tencent/open/a/c;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/open/a/c;->a(Lcom/tencent/open/a/c;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-static {v2, v0}, Lcom/tencent/open/a/c;->a(Lcom/tencent/open/a/c;I)I
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 327
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v2=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     .line 328
a=0;//     const-string v4, "cgi_report_debug"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "ReportManager doUploadItems Thread request count = "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 334
a=0;//     :try_start_0
a=0;//     iget-object v4, p0, Lcom/tencent/open/a/c$1;->b:Landroid/content/Context;
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     iget-object v6, p0, Lcom/tencent/open/a/c$1;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v4, v5, v6}, Lcom/tencent/utils/HttpUtils;->getHttpClient(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lorg/apache/http/client/HttpClient;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 336
a=0;//     new-instance v5, Lorg/apache/http/client/methods/HttpPost;
a=0;// 
a=0;//     #v5=(UninitRef,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     iget-object v6, p0, Lcom/tencent/open/a/c$1;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v5, v6}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 337
a=0;//     #v5=(Reference,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     const-string v6, "Accept-Encoding"
a=0;// 
a=0;//     const-string v7, "gzip"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6, v7}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 338
a=0;//     const-string v6, "Content-Type"
a=0;// 
a=0;//     const-string v7, "application/x-www-form-urlencoded"
a=0;// 
a=0;//     invoke-virtual {v5, v6, v7}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 340
a=0;//     iget-object v6, p0, Lcom/tencent/open/a/c$1;->c:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-static {v6}, Lcom/tencent/utils/Util;->encodeUrl(Landroid/os/Bundle;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 341
a=0;//     invoke-virtual {v6}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 342
a=0;//     new-instance v7, Lorg/apache/http/entity/ByteArrayEntity;
a=0;// 
a=0;//     #v7=(UninitRef,Lorg/apache/http/entity/ByteArrayEntity;);
a=0;//     invoke-direct {v7, v6}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V
a=0;// 
a=0;//     .line 343
a=0;//     #v7=(Reference,Lorg/apache/http/entity/ByteArrayEntity;);
a=0;//     invoke-virtual {v5, v7}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     .line 346
a=0;//     invoke-interface {v4, v5}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 347
a=0;//     invoke-interface {v4}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 348
a=0;//     invoke-interface {v4}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 350
a=0;//     #v4=(Integer);
a=0;//     const/16 v5, 0xc8
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     if-eq v4, v5, :cond_2
a=0;// 
a=0;//     .line 351
a=0;//     const-string v4, "cgi_report_debug"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "ReportManager doUploadItems : HttpStatuscode != 200"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
a=0;// 
a=0;//     .line 372
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/tencent/open/a/c$1;->d:Lcom/tencent/open/a/c;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/open/a/c;);
a=0;//     invoke-static {v2, v1}, Lcom/tencent/open/a/c;->a(Lcom/tencent/open/a/c;Z)Z
a=0;// 
a=0;//     .line 373
a=0;//     const-string v1, "cgi_report_debug"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "ReportManager doUploadItems Thread end, url = "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v4, p0, Lcom/tencent/open/a/c$1;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 375
a=0;//     if-ne v0, v3, :cond_3
a=0;// 
a=0;//     .line 376
a=0;//     const-string v0, "cgi_report_debug"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "ReportManager doUploadItems Thread request success"
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 381
a=0;//     :goto_2
a=0;//     return-void
a=0;// 
a=0;//     .line 323
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Null);v5=(Null);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/c$1;->d:Lcom/tencent/open/a/c;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/a/c;);
a=0;//     invoke-static {v0}, Lcom/tencent/open/a/c;->a(Lcom/tencent/open/a/c;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 354
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);v2=(Integer);v4=(Integer);v5=(PosShort);v6=(Reference,[B);v7=(Reference,Lorg/apache/http/entity/ByteArrayEntity;);
a=0;//     const-string v0, "cgi_report_debug"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "ReportManager doUploadItems Thread success"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_1
a=0;//     .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_1 .. :try_end_1} :catch_5
a=0;//     .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
a=0;// 
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 358
a=0;//     :catch_0
a=0;//     #v0=(Boolean);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     .line 359
a=0;//     :goto_3
a=0;//     #v4=(Reference,Lorg/apache/http/conn/ConnectTimeoutException;);
a=0;//     invoke-virtual {v4}, Lorg/apache/http/conn/ConnectTimeoutException;->printStackTrace()V
a=0;// 
a=0;//     .line 360
a=0;//     const-string v4, "cgi_report_debug"
a=0;// 
a=0;//     const-string v5, "ReportManager doUploadItems : ConnectTimeoutException"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 370
a=0;//     :goto_4
a=0;//     #v5=(Conflicted);
a=0;//     iget-object v4, p0, Lcom/tencent/open/a/c$1;->d:Lcom/tencent/open/a/c;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/tencent/open/a/c;->a(Lcom/tencent/open/a/c;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lt v2, v4, :cond_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 361
a=0;//     :catch_1
a=0;//     #v4=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     .line 362
a=0;//     :goto_5
a=0;//     #v4=(Reference,Ljava/net/SocketTimeoutException;);
a=0;//     invoke-virtual {v4}, Ljava/net/SocketTimeoutException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 363
a=0;//     :catch_2
a=0;//     #v4=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 364
a=0;//     :goto_6
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 366
a=0;//     const-string v2, "cgi_report_debug"
a=0;// 
a=0;//     const-string v4, "ReportManager doUploadItems : Exception"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 378
a=0;//     :cond_3
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "cgi_report_debug"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "ReportManager doUploadItems Thread request failed"
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 379
a=0;//     iget-object v0, p0, Lcom/tencent/open/a/c$1;->d:Lcom/tencent/open/a/c;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/open/a/c;->c(Lcom/tencent/open/a/c;)Lcom/tencent/open/a/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/open/a/c$1;->d:Lcom/tencent/open/a/c;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/open/a/c;->b(Lcom/tencent/open/a/c;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/open/a/b;->a(Ljava/util/ArrayList;)I
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 363
a=0;//     :catch_3
a=0;//     #v0=(Conflicted);v1=(Null);v2=(Integer);v4=(Conflicted);v5=(PosShort);v7=(Reference,Lorg/apache/http/entity/ByteArrayEntity;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 361
a=0;//     :catch_4
a=0;//     #v0=(Conflicted);v2=(Integer);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/SocketTimeoutException;);
a=0;//     move-object v4, v0
a=0;// 
a=0;//     #v4=(Reference,Ljava/net/SocketTimeoutException;);
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 358
a=0;//     :catch_5
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/conn/ConnectTimeoutException;);
a=0;//     move-object v4, v0
a=0;// 
a=0;//     #v4=(Reference,Lorg/apache/http/conn/ConnectTimeoutException;);
a=0;//     move v0, v3
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_3
a=0;// .end method
}}
