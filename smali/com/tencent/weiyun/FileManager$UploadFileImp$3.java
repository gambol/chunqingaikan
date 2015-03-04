package com.tencent.weiyun; class FileManager$UploadFileImp$3 { void a() { int a;
a=0;// .class Lcom/tencent/weiyun/FileManager$UploadFileImp$3;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/tencent/weiyun/FileManager$UploadFileImp;->doUpload()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$1:Lcom/tencent/weiyun/FileManager$UploadFileImp;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/tencent/weiyun/FileManager$UploadFileImp;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 351
a=0;//     iput-object p1, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/weiyun/FileManager$UploadFileImp;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/weiyun/FileManager$UploadFileImp$3;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v10, -0x2
a=0;// 
a=0;//     .line 353
a=0;//     #v10=(Byte);
a=0;//     new-instance v0, Lorg/apache/http/params/BasicHttpParams;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     invoke-direct {v0}, Lorg/apache/http/params/BasicHttpParams;-><init>()V
a=0;// 
a=0;//     .line 354
a=0;//     #v0=(Reference,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     const/16 v2, 0x3a98
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-static {v0, v2}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 355
a=0;//     const/16 v2, 0x4e20
a=0;// 
a=0;//     invoke-static {v0, v2}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 357
a=0;//     sget-object v2, Lorg/apache/http/HttpVersion;->HTTP_1_1:Lorg/apache/http/HttpVersion;
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/HttpVersion;);
a=0;//     invoke-static {v0, v2}, Lorg/apache/http/params/HttpProtocolParams;->setVersion(Lorg/apache/http/params/HttpParams;Lorg/apache/http/ProtocolVersion;)V
a=0;// 
a=0;//     .line 358
a=0;//     const-string v2, "UTF-8"
a=0;// 
a=0;//     invoke-static {v0, v2}, Lorg/apache/http/params/HttpProtocolParams;->setContentCharset(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 359
a=0;//     const-string v2, "TX_QQF_ANDROID"
a=0;// 
a=0;//     invoke-static {v0, v2}, Lorg/apache/http/params/HttpProtocolParams;->setUserAgent(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 361
a=0;//     new-instance v3, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-direct {v3, v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V
a=0;// 
a=0;//     .line 367
a=0;//     #v3=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     const/high16 v0, 0x20000
a=0;// 
a=0;//     .line 368
a=0;//     #v0=(Integer);
a=0;//     new-array v4, v0, [B
a=0;// 
a=0;//     .line 371
a=0;//     :try_start_0
a=0;//     #v4=(Reference,[B);
a=0;//     new-instance v5, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/weiyun/FileManager$UploadFileImp;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/FileManager$UploadFileImp;);
a=0;//     invoke-static {v0}, Lcom/tencent/weiyun/FileManager$UploadFileImp;->access$400(Lcom/tencent/weiyun/FileManager$UploadFileImp;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v5, v0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/FileInputStream;);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 381
a=0;//     :goto_0
a=0;//     #v0=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     int-to-long v6, v0
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     iget-object v2, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/weiyun/FileManager$UploadFileImp;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/tencent/weiyun/FileManager$UploadFileImp;->access$800(Lcom/tencent/weiyun/FileManager$UploadFileImp;)J
a=0;// 
a=0;//     move-result-wide v8
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     cmp-long v2, v6, v8
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gez v2, :cond_0
a=0;// 
a=0;//     .line 383
a=0;//     :try_start_1
a=0;//     invoke-virtual {v5, v4}, Ljava/io/FileInputStream;->read([B)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 384
a=0;//     #v2=(Integer);
a=0;//     iget-object v6, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/weiyun/FileManager$UploadFileImp;
a=0;// 
a=0;//     #v6=(Reference,Lcom/tencent/weiyun/FileManager$UploadFileImp;);
a=0;//     invoke-static {v6, v4, v2, v0}, Lcom/tencent/weiyun/FileManager$UploadFileImp;->access$1400(Lcom/tencent/weiyun/FileManager$UploadFileImp;[BII)[B
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 385
a=0;//     add-int/2addr v0, v2
a=0;// 
a=0;//     .line 394
a=0;//     if-nez v6, :cond_1
a=0;// 
a=0;//     .line 443
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v0=(Conflicted);v1=(Reference,Landroid/os/Handler;);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
a=0;// 
a=0;//     .line 451
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);v5=(Conflicted);v9=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 372
a=0;//     :catch_0
a=0;//     #v1=(Null);v2=(Reference,Ljava/lang/String;);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 373
a=0;//     #v0=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/weiyun/FileManager$UploadFileImp;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 374
a=0;//     iput v10, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 375
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 376
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/weiyun/FileManager$UploadFileImp;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 386
a=0;//     :catch_1
a=0;//     #v0=(Integer);v1=(Null);v2=(Integer);v5=(Reference,Ljava/io/FileInputStream;);v6=(Conflicted);v7=(LongHi);v8=(LongLo);v9=(LongHi);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 387
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/weiyun/FileManager$UploadFileImp;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 388
a=0;//     iput v10, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 389
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 390
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/weiyun/FileManager$UploadFileImp;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 398
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Null);v6=(Reference,[B);
a=0;//     new-instance v2, Lorg/apache/http/client/methods/HttpPost;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "http://"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-object v8, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/weiyun/FileManager$UploadFileImp;
a=0;// 
a=0;//     invoke-static {v8}, Lcom/tencent/weiyun/FileManager$UploadFileImp;->access$200(Lcom/tencent/weiyun/FileManager$UploadFileImp;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, "/ftn_handler/?bmd5="
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-object v8, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/weiyun/FileManager$UploadFileImp;
a=0;// 
a=0;//     invoke-static {v8}, Lcom/tencent/weiyun/FileManager$UploadFileImp;->access$700(Lcom/tencent/weiyun/FileManager$UploadFileImp;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v2, v7}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 399
a=0;//     #v2=(Reference,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     const-string v7, "Accept-Encoding"
a=0;// 
a=0;//     const-string v8, "*/*"
a=0;// 
a=0;//     invoke-virtual {v2, v7, v8}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 400
a=0;//     const-string v7, "Connection"
a=0;// 
a=0;//     const-string v8, "Keep-Alive"
a=0;// 
a=0;//     invoke-virtual {v2, v7, v8}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 401
a=0;//     const-string v7, "Pragma"
a=0;// 
a=0;//     const-string v8, "no-cache"
a=0;// 
a=0;//     invoke-virtual {v2, v7, v8}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 402
a=0;//     const-string v7, "Content-Type"
a=0;// 
a=0;//     const-string v8, "application/x-www-form-urlencoded"
a=0;// 
a=0;//     invoke-virtual {v2, v7, v8}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 404
a=0;//     new-instance v7, Lorg/apache/http/entity/ByteArrayEntity;
a=0;// 
a=0;//     #v7=(UninitRef,Lorg/apache/http/entity/ByteArrayEntity;);
a=0;//     invoke-direct {v7, v6}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V
a=0;// 
a=0;//     .line 405
a=0;//     #v7=(Reference,Lorg/apache/http/entity/ByteArrayEntity;);
a=0;//     invoke-virtual {v2, v7}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     .line 410
a=0;//     :try_start_3
a=0;//     invoke-interface {v3, v2}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 411
a=0;//     invoke-interface {v2}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 412
a=0;//     invoke-interface {v2}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 420
a=0;//     :goto_3
a=0;//     #v2=(Integer);
a=0;//     const/16 v6, 0xc8
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     if-ne v2, v6, :cond_3
a=0;// 
a=0;//     .line 421
a=0;//     int-to-long v6, v0
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     iget-object v2, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/weiyun/FileManager$UploadFileImp;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/weiyun/FileManager$UploadFileImp;);
a=0;//     invoke-static {v2}, Lcom/tencent/weiyun/FileManager$UploadFileImp;->access$800(Lcom/tencent/weiyun/FileManager$UploadFileImp;)J
a=0;// 
a=0;//     move-result-wide v8
a=0;// 
a=0;//     #v8=(LongLo);
a=0;//     cmp-long v2, v6, v8
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gez v2, :cond_2
a=0;// 
a=0;//     .line 422
a=0;//     int-to-long v6, v0
a=0;// 
a=0;//     const-wide/16 v8, 0x64
a=0;// 
a=0;//     mul-long/2addr v6, v8
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/weiyun/FileManager$UploadFileImp;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/weiyun/FileManager$UploadFileImp;);
a=0;//     invoke-static {v2}, Lcom/tencent/weiyun/FileManager$UploadFileImp;->access$800(Lcom/tencent/weiyun/FileManager$UploadFileImp;)J
a=0;// 
a=0;//     move-result-wide v8
a=0;// 
a=0;//     div-long/2addr v6, v8
a=0;// 
a=0;//     long-to-int v2, v6
a=0;// 
a=0;//     .line 423
a=0;//     #v2=(Integer);
a=0;//     iget-object v6, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/weiyun/FileManager$UploadFileImp;
a=0;// 
a=0;//     #v6=(Reference,Lcom/tencent/weiyun/FileManager$UploadFileImp;);
a=0;//     invoke-static {v6}, Lcom/tencent/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 424
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     iput v7, v6, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 425
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, ""
a=0;// 
a=0;//     invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v6, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 426
a=0;//     iget-object v2, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/weiyun/FileManager$UploadFileImp;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/tencent/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 413
a=0;//     :catch_2
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 414
a=0;//     iget-object v2, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/weiyun/FileManager$UploadFileImp;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/tencent/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 415
a=0;//     iput v10, v2, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 416
a=0;//     const-string v6, ""
a=0;// 
a=0;//     iput-object v6, v2, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 417
a=0;//     iget-object v6, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/weiyun/FileManager$UploadFileImp;
a=0;// 
a=0;//     invoke-static {v6}, Lcom/tencent/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 428
a=0;//     :cond_2
a=0;//     #v2=(Byte);v6=(LongLo);v7=(LongHi);v8=(LongLo);
a=0;//     iget-object v2, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/weiyun/FileManager$UploadFileImp;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/weiyun/FileManager$UploadFileImp;);
a=0;//     invoke-static {v2}, Lcom/tencent/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 429
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     iput v6, v2, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 430
a=0;//     const-string v6, ""
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     iput-object v6, v2, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 431
a=0;//     iget-object v6, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/weiyun/FileManager$UploadFileImp;
a=0;// 
a=0;//     invoke-static {v6}, Lcom/tencent/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 434
a=0;//     :cond_3
a=0;//     #v2=(Integer);v6=(PosShort);v7=(Reference,Lorg/apache/http/entity/ByteArrayEntity;);v8=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/weiyun/FileManager$UploadFileImp;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/FileManager$UploadFileImp;);
a=0;//     invoke-static {v0}, Lcom/tencent/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 435
a=0;//     const/16 v1, -0x9
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 436
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 437
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/weiyun/FileManager$UploadFileImp;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 444
a=0;//     :catch_3
a=0;//     #v0=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 445
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     iget-object v1, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/weiyun/FileManager$UploadFileImp;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 446
a=0;//     iput v10, v1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 447
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 448
a=0;//     iget-object v0, p0, Lcom/tencent/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/weiyun/FileManager$UploadFileImp;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// .end method
}}
