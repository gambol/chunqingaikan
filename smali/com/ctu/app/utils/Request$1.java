package com.ctu.app.utils; class Request$1 { void a() { int a;
a=0;// .class Lcom/ctu/app/utils/Request$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Request.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/ctu/app/utils/Request;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/ctu/app/utils/Request;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/ctu/app/utils/Request;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     iput-object p1, p0, Lcom/ctu/app/utils/Request$1;->this$0:Lcom/ctu/app/utils/Request;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/ctu/app/utils/Request$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 15
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v14, 0x6
a=0;// 
a=0;//     .line 74
a=0;//     #v14=(PosByte);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 76
a=0;//     .local v11, "retryCount":I
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v11=(Integer);v12=(Conflicted);v13=(Conflicted);
a=0;//     invoke-static {}, Lcom/ctu/app/utils/Request;->access$000()Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-nez v12, :cond_1
a=0;// 
a=0;//     if-ge v11, v14, :cond_1
a=0;// 
a=0;//     .line 77
a=0;//     add-int/lit8 v11, v11, 0x1
a=0;// 
a=0;//     .line 78
a=0;//     const-string v12, "kaiz"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     const-string v13, "retryCount++"
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v12, v13}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 79
a=0;//     iget-object v12, p0, Lcom/ctu/app/utils/Request$1;->this$0:Lcom/ctu/app/utils/Request;
a=0;// 
a=0;//     iget-object v12, v12, Lcom/ctu/app/utils/Request;->thread:Ljava/lang/Thread;
a=0;// 
a=0;//     const-wide/16 v12, 0x5dc
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     invoke-static {v12, v13}, Ljava/lang/Thread;->sleep(J)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 86
a=0;//     :catch_0
a=0;//     #v12=(Conflicted);v13=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 87
a=0;//     .local v2, "e":Ljava/lang/Exception;
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 91
a=0;//     .end local v2    # "e":Ljava/lang/Exception;
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v12, p0, Lcom/ctu/app/utils/Request$1;->this$0:Lcom/ctu/app/utils/Request;
a=0;// 
a=0;//     #v12=(Reference,Lcom/ctu/app/utils/Request;);
a=0;//     iget-boolean v12, v12, Lcom/ctu/app/utils/Request;->isPost:Z
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_2
a=0;// 
a=0;//     .line 92
a=0;//     new-instance v0, Lorg/apache/http/entity/ByteArrayEntity;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/entity/ByteArrayEntity;);
a=0;//     iget-object v12, p0, Lcom/ctu/app/utils/Request$1;->this$0:Lcom/ctu/app/utils/Request;
a=0;// 
a=0;//     #v12=(Reference,Lcom/ctu/app/utils/Request;);
a=0;//     iget-object v12, v12, Lcom/ctu/app/utils/Request;->data:[B
a=0;// 
a=0;//     invoke-direct {v0, v12}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V
a=0;// 
a=0;//     .line 93
a=0;//     .local v0, "arrayEntity":Lorg/apache/http/entity/ByteArrayEntity;
a=0;//     #v0=(Reference,Lorg/apache/http/entity/ByteArrayEntity;);
a=0;//     const-string v12, "application/octet-stream"
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Lorg/apache/http/entity/ByteArrayEntity;->setContentType(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 94
a=0;//     new-instance v8, Lorg/apache/http/client/methods/HttpPost;
a=0;// 
a=0;//     #v8=(UninitRef,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     iget-object v12, p0, Lcom/ctu/app/utils/Request$1;->this$0:Lcom/ctu/app/utils/Request;
a=0;// 
a=0;//     iget-object v12, v12, Lcom/ctu/app/utils/Request;->url:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v8, v12}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 95
a=0;//     .local v8, "post":Lorg/apache/http/client/methods/HttpPost;
a=0;//     #v8=(Reference,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     invoke-virtual {v8, v0}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     .line 96
a=0;//     move-object v5, v8
a=0;// 
a=0;//     .line 101
a=0;//     .end local v0    # "arrayEntity":Lorg/apache/http/entity/ByteArrayEntity;
a=0;//     .end local v8    # "post":Lorg/apache/http/client/methods/HttpPost;
a=0;//     .local v5, "http":Lorg/apache/http/client/methods/HttpUriRequest;
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Reference,Ujava/lang/Object;);v8=(Conflicted);
a=0;//     new-instance v1, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-direct {v1}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V
a=0;// 
a=0;//     .line 103
a=0;//     .local v1, "client":Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-virtual {v1}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     const-string v13, "http.connection.timeout"
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     const/16 v14, 0x1388
a=0;// 
a=0;//     #v14=(PosShort);
a=0;//     invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v12, v13, v14}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     .line 105
a=0;//     invoke-virtual {v1}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     const-string v13, "http.socket.timeout"
a=0;// 
a=0;//     const/16 v14, 0x2710
a=0;// 
a=0;//     #v14=(PosShort);
a=0;//     invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v12, v13, v14}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     .line 108
a=0;//     invoke-virtual {v1, v5}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 109
a=0;//     .local v9, "response":Lorg/apache/http/HttpResponse;
a=0;//     #v9=(Reference,Lorg/apache/http/HttpResponse;);
a=0;//     invoke-interface {v9}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-interface {v12}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     const/16 v13, 0xc8
a=0;// 
a=0;//     #v13=(PosShort);
a=0;//     if-ne v12, v13, :cond_3
a=0;// 
a=0;//     .line 110
a=0;//     new-instance v10, Lorg/apache/http/entity/BufferedHttpEntity;
a=0;// 
a=0;//     #v10=(UninitRef,Lorg/apache/http/entity/BufferedHttpEntity;);
a=0;//     invoke-interface {v9}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     invoke-direct {v10, v12}, Lorg/apache/http/entity/BufferedHttpEntity;-><init>(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     .line 112
a=0;//     .local v10, "retEntity":Lorg/apache/http/entity/BufferedHttpEntity;
a=0;//     #v10=(Reference,Lorg/apache/http/entity/BufferedHttpEntity;);
a=0;//     invoke-virtual {v10}, Lorg/apache/http/entity/BufferedHttpEntity;->getContent()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 113
a=0;//     .local v6, "is":Ljava/io/InputStream;
a=0;//     #v6=(Reference,Ljava/io/InputStream;);
a=0;//     sget-object v12, Lcom/ctu/app/utils/Request;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     new-instance v13, Lcom/ctu/app/utils/Request$1$1;
a=0;// 
a=0;//     #v13=(UninitRef,Lcom/ctu/app/utils/Request$1$1;);
a=0;//     invoke-direct {v13, p0, v6}, Lcom/ctu/app/utils/Request$1$1;-><init>(Lcom/ctu/app/utils/Request$1;Ljava/io/InputStream;)V
a=0;// 
a=0;//     #v13=(Reference,Lcom/ctu/app/utils/Request$1$1;);
a=0;//     invoke-virtual {v12, v13}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 147
a=0;//     .end local v1    # "client":Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;//     .end local v5    # "http":Lorg/apache/http/client/methods/HttpUriRequest;
a=0;//     .end local v6    # "is":Ljava/io/InputStream;
a=0;//     .end local v9    # "response":Lorg/apache/http/HttpResponse;
a=0;//     .end local v10    # "retEntity":Lorg/apache/http/entity/BufferedHttpEntity;
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);v13=(Conflicted);v14=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 81
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v12=(Boolean);v14=(PosByte);
a=0;//     if-lt v11, v14, :cond_0
a=0;// 
a=0;//     .line 83
a=0;//     :try_start_2
a=0;//     iget-object v12, p0, Lcom/ctu/app/utils/Request$1;->this$0:Lcom/ctu/app/utils/Request;
a=0;// 
a=0;//     #v12=(Reference,Lcom/ctu/app/utils/Request;);
a=0;//     iget-object v12, v12, Lcom/ctu/app/utils/Request;->ret:Lcom/ctu/app/utils/Request$Response;
a=0;// 
a=0;//     const/4 v13, -0x1
a=0;// 
a=0;//     #v13=(Byte);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     invoke-interface {v12, v13, v14}, Lcom/ctu/app/utils/Request$Response;->Ret(ILjava/io/InputStream;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 98
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v12=(Boolean);v13=(Conflicted);v14=(PosByte);
a=0;//     new-instance v4, Lorg/apache/http/client/methods/HttpGet;
a=0;// 
a=0;//     #v4=(UninitRef,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     iget-object v12, p0, Lcom/ctu/app/utils/Request$1;->this$0:Lcom/ctu/app/utils/Request;
a=0;// 
a=0;//     #v12=(Reference,Lcom/ctu/app/utils/Request;);
a=0;//     iget-object v12, v12, Lcom/ctu/app/utils/Request;->url:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v4, v12}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 99
a=0;//     .local v4, "get":Lorg/apache/http/client/methods/HttpGet;
a=0;//     #v4=(Reference,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     move-object v5, v4
a=0;// 
a=0;//     .restart local v5    # "http":Lorg/apache/http/client/methods/HttpUriRequest;
a=0;//     #v5=(Reference,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 122
a=0;//     .end local v4    # "get":Lorg/apache/http/client/methods/HttpGet;
a=0;//     .restart local v1    # "client":Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;//     .restart local v9    # "response":Lorg/apache/http/HttpResponse;
a=0;//     :cond_3
a=0;//     :try_start_3
a=0;//     #v0=(Conflicted);v1=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);v4=(Conflicted);v8=(Conflicted);v9=(Reference,Lorg/apache/http/HttpResponse;);v12=(Integer);v13=(PosShort);v14=(Reference,Ljava/lang/Integer;);
a=0;//     const-string v12, "kaiz"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     new-instance v13, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v14, "Connection Failed : "
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-interface {v9}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-interface {v14}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-static {v12, v13}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 124
a=0;//     invoke-interface {v9}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-interface {v12}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 126
a=0;//     .local v3, "errorCode":I
a=0;//     #v3=(Integer);
a=0;//     sget-object v12, Lcom/ctu/app/utils/Request;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     new-instance v13, Lcom/ctu/app/utils/Request$1$2;
a=0;// 
a=0;//     #v13=(UninitRef,Lcom/ctu/app/utils/Request$1$2;);
a=0;//     invoke-direct {v13, p0, v3}, Lcom/ctu/app/utils/Request$1$2;-><init>(Lcom/ctu/app/utils/Request$1;I)V
a=0;// 
a=0;//     #v13=(Reference,Lcom/ctu/app/utils/Request$1$2;);
a=0;//     invoke-virtual {v12, v13}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 135
a=0;//     .end local v3    # "errorCode":I
a=0;//     .end local v9    # "response":Lorg/apache/http/HttpResponse;
a=0;//     :catch_1
a=0;//     #v3=(Conflicted);v6=(Conflicted);v9=(Conflicted);v10=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 136
a=0;//     .restart local v2    # "e":Ljava/lang/Exception;
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 137
a=0;//     invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 138
a=0;//     .local v7, "msg":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     sget-object v12, Lcom/ctu/app/utils/Request;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v12=(Reference,Landroid/app/Activity;);
a=0;//     new-instance v13, Lcom/ctu/app/utils/Request$1$3;
a=0;// 
a=0;//     #v13=(UninitRef,Lcom/ctu/app/utils/Request$1$3;);
a=0;//     invoke-direct {v13, p0, v7}, Lcom/ctu/app/utils/Request$1$3;-><init>(Lcom/ctu/app/utils/Request$1;Ljava/lang/String;)V
a=0;// 
a=0;//     #v13=(Reference,Lcom/ctu/app/utils/Request$1$3;);
a=0;//     invoke-virtual {v12, v13}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
}}
