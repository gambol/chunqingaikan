package com.tencent.weiyun; class FileManager$DownLoadImp$3 { void a() { int a;
a=0;// .class Lcom/tencent/weiyun/FileManager$DownLoadImp$3;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/tencent/weiyun/FileManager$DownLoadImp;->doDownload()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/tencent/weiyun/FileManager$DownLoadImp;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 669
a=0;//     iput-object p1, p0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp$3;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 20
a=0;// 
a=0;//     .prologue
a=0;//     .line 671
a=0;//     new-instance v2, Lorg/apache/http/params/BasicHttpParams;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     invoke-direct {v2}, Lorg/apache/http/params/BasicHttpParams;-><init>()V
a=0;// 
a=0;//     .line 672
a=0;//     #v2=(Reference,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     const/16 v1, 0x3a98
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-static {v2, v1}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 673
a=0;//     const/16 v1, 0x4e20
a=0;// 
a=0;//     invoke-static {v2, v1}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 675
a=0;//     sget-object v1, Lorg/apache/http/HttpVersion;->HTTP_1_1:Lorg/apache/http/HttpVersion;
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/HttpVersion;);
a=0;//     invoke-static {v2, v1}, Lorg/apache/http/params/HttpProtocolParams;->setVersion(Lorg/apache/http/params/HttpParams;Lorg/apache/http/ProtocolVersion;)V
a=0;// 
a=0;//     .line 676
a=0;//     const-string v1, "UTF-8"
a=0;// 
a=0;//     invoke-static {v2, v1}, Lorg/apache/http/params/HttpProtocolParams;->setContentCharset(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 677
a=0;//     const-string v1, "TX_QQF_ANDROID"
a=0;// 
a=0;//     invoke-static {v2, v1}, Lorg/apache/http/params/HttpProtocolParams;->setUserAgent(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 679
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "http://"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp$3;);
a=0;//     iget-object v3, v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$2000(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, ":"
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$1900(Lcom/tencent/weiyun/FileManager$DownLoadImp;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, "/ftn_handler/"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$1600(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, "/"
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 681
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$2100(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 682
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, "?size="
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$2100(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 684
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     new-instance v9, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v9=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-direct {v9, v2}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V
a=0;// 
a=0;//     .line 685
a=0;//     #v9=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 686
a=0;//     #v7=(Null);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     invoke-static {v3}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$2300(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 689
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     new-instance v10, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v10, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 698
a=0;//     #v10=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const/high16 v2, 0x40000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     new-array v11, v2, [B
a=0;// 
a=0;//     .line 700
a=0;//     #v11=(Reference,[B);
a=0;//     const-wide/16 v5, 0x0
a=0;// 
a=0;//     .line 702
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 703
a=0;//     #v4=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     invoke-static {v2}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$2600(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     .line 704
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     invoke-static {v2}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$2500(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Lcom/tencent/weiyun/WeiyunFile;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/weiyun/WeiyunFile;->getFileSize()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/32 v12, 0x40000
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     cmp-long v2, v2, v12
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_2
a=0;// 
a=0;//     const-wide/32 v2, 0x40000
a=0;// 
a=0;//     .line 705
a=0;//     :goto_0
a=0;//     #v2=(LongLo);
a=0;//     add-long/2addr v2, v5
a=0;// 
a=0;//     move/from16 v17, v4
a=0;// 
a=0;//     #v17=(Null);
a=0;//     move-wide/from16 v18, v2
a=0;// 
a=0;//     #v18=(LongLo);v19=(LongHi);
a=0;//     move/from16 v2, v17
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-wide v3, v5
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     move-object v5, v7
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-wide/from16 v6, v18
a=0;// 
a=0;//     .line 706
a=0;//     :goto_1
a=0;//     #v2=(Integer);v5=(Reference,Ljava/io/InputStream;);v6=(LongLo);v7=(LongHi);v8=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v8, v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v8=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     invoke-static {v8}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$2500(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Lcom/tencent/weiyun/WeiyunFile;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Lcom/tencent/weiyun/WeiyunFile;->getFileSize()J
a=0;// 
a=0;//     move-result-wide v12
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     cmp-long v8, v6, v12
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     if-gtz v8, :cond_3
a=0;// 
a=0;//     .line 707
a=0;//     new-instance v8, Lorg/apache/http/client/methods/HttpGet;
a=0;// 
a=0;//     #v8=(UninitRef,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     invoke-direct {v8, v1}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 708
a=0;//     #v8=(Reference,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     const-string v12, "Accept-Encoding"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     const-string v13, "gzip"
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v8, v12, v13}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 709
a=0;//     const-string v12, "Host"
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     invoke-static {v13}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$2000(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-interface {v8, v12, v13}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 710
a=0;//     const-string v12, "Connection"
a=0;// 
a=0;//     const-string v13, "Keep-Alive"
a=0;// 
a=0;//     invoke-interface {v8, v12, v13}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 711
a=0;//     const-string v12, "Cookie"
a=0;// 
a=0;//     new-instance v13, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v14=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     invoke-static {v14}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$1700(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     const-string v14, "="
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     invoke-static {v14}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$1800(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-interface {v8, v12, v13}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 712
a=0;//     const-string v12, "Pragma"
a=0;// 
a=0;//     const-string v13, "no-cache"
a=0;// 
a=0;//     invoke-interface {v8, v12, v13}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 713
a=0;//     const-string v12, "RANGE"
a=0;// 
a=0;//     new-instance v13, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v14, "bytes="
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     const-string v14, "-"
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     const-string v14, ""
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-interface {v8, v12, v13}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 716
a=0;//     :try_start_1
a=0;//     invoke-interface {v9, v8}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 717
a=0;//     const-string v12, "weiyun_test"
a=0;// 
a=0;//     new-instance v13, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v14, "uploadFileToWeiyun doDownloadPic response:"
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-static {v12, v13}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 720
a=0;//     invoke-interface {v8}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 721
a=0;//     invoke-interface {v12}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 722
a=0;//     #v12=(Integer);
a=0;//     const/16 v13, 0xc8
a=0;// 
a=0;//     #v13=(PosShort);
a=0;//     if-eq v12, v13, :cond_1
a=0;// 
a=0;//     const/16 v13, 0xce
a=0;// 
a=0;//     if-ne v12, v13, :cond_3
a=0;// 
a=0;//     .line 723
a=0;//     :cond_1
a=0;//     invoke-interface {v8}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-interface {v8}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 725
a=0;//     :goto_2
a=0;//     #v8=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     invoke-virtual {v5, v11}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-lez v8, :cond_4
a=0;// 
a=0;//     .line 726
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     invoke-virtual {v10, v11, v12, v8}, Ljava/io/FileOutputStream;->write([BII)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 727
a=0;//     int-to-long v12, v8
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     add-long/2addr v3, v12
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 690
a=0;//     :catch_0
a=0;//     #v2=(Reference,Ljava/io/File;);v3=(Reference,Ljava/lang/String;);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Null);v8=(Uninit);v10=(Conflicted);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 691
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 692
a=0;//     const/4 v3, -0x2
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     iput v3, v2, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 693
a=0;//     invoke-virtual {v1}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v2, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 694
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 811
a=0;//     :goto_3
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 704
a=0;//     :cond_2
a=0;//     #v2=(Byte);v3=(LongHi);v4=(Null);v5=(LongLo);v6=(LongHi);v7=(Null);v8=(Uninit);v10=(Reference,Ljava/io/FileOutputStream;);v11=(Reference,[B);v12=(LongLo);v13=(LongHi);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     invoke-static {v2}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$2500(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Lcom/tencent/weiyun/WeiyunFile;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/tencent/weiyun/WeiyunFile;->getFileSize()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 732
a=0;//     :catch_1
a=0;//     #v2=(Integer);v3=(LongLo);v4=(LongHi);v5=(Reference,Ljava/io/InputStream;);v6=(LongLo);v7=(LongHi);v8=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Reference,Ljava/lang/String;);v15=(Conflicted);v16=(Conflicted);v17=(Null);v18=(LongLo);v19=(LongHi);
a=0;//     move-exception v8
a=0;// 
a=0;//     .line 733
a=0;//     #v8=(Reference,Ljava/lang/Exception;);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     .line 734
a=0;//     const/16 v12, 0xa
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     if-le v2, v12, :cond_4
a=0;// 
a=0;//     .line 735
a=0;//     invoke-virtual {v8}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 736
a=0;//     const-string v1, "weiyun_test"
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "uploadFileToWeiyun doDownloadPic error:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 738
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 739
a=0;//     const/4 v2, -0x2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     iput v2, v1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 740
a=0;//     invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 741
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 799
a=0;//     :cond_3
a=0;//     :goto_4
a=0;//     :try_start_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v12=(Conflicted);v14=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);
a=0;//     invoke-virtual {v10}, Ljava/io/FileOutputStream;->close()V
a=0;// 
a=0;//     .line 800
a=0;//     invoke-virtual {v5}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4
a=0;// 
a=0;//     .line 808
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     invoke-static {v1}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 809
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iput v2, v1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 810
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     invoke-static {v2}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 745
a=0;//     :cond_4
a=0;//     #v2=(Integer);v3=(LongLo);v4=(LongHi);v6=(LongLo);v7=(LongHi);v14=(Reference,Ljava/lang/String;);v17=(Null);v18=(LongLo);v19=(LongHi);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v8, v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v8=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     invoke-static {v8}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$2500(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Lcom/tencent/weiyun/WeiyunFile;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Lcom/tencent/weiyun/WeiyunFile;->getFileSize()J
a=0;// 
a=0;//     move-result-wide v12
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     sub-long v6, v12, v6
a=0;// 
a=0;//     const-wide/16 v12, 0x0
a=0;// 
a=0;//     cmp-long v6, v6, v12
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-lez v6, :cond_3
a=0;// 
a=0;//     .line 749
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v6, v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v6=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     invoke-static {v6}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$2500(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Lcom/tencent/weiyun/WeiyunFile;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/tencent/weiyun/WeiyunFile;->getFileSize()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(LongLo);
a=0;//     sub-long/2addr v6, v3
a=0;// 
a=0;//     const-wide/32 v12, 0x40000
a=0;// 
a=0;//     cmp-long v6, v6, v12
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-lez v6, :cond_5
a=0;// 
a=0;//     const-wide/32 v6, 0x40000
a=0;// 
a=0;//     .line 750
a=0;//     :goto_5
a=0;//     #v6=(LongLo);
a=0;//     add-long/2addr v6, v3
a=0;// 
a=0;//     .line 751
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v8, v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     invoke-static {v8}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 752
a=0;//     const/4 v12, 0x1
a=0;// 
a=0;//     #v12=(One);
a=0;//     iput v12, v8, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 753
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-wide/16 v13, 0x64
a=0;// 
a=0;//     #v13=(LongLo);v14=(LongHi);
a=0;//     mul-long/2addr v13, v6
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v15=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     invoke-static {v15}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$2500(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Lcom/tencent/weiyun/WeiyunFile;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Lcom/tencent/weiyun/WeiyunFile;->getFileSize()J
a=0;// 
a=0;//     move-result-wide v15
a=0;// 
a=0;//     #v15=(LongLo);v16=(LongHi);
a=0;//     div-long/2addr v13, v15
a=0;// 
a=0;//     invoke-virtual {v12, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     const-string v13, ""
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     iput-object v12, v8, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 754
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v12, v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     invoke-static {v12}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12, v8}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 749
a=0;//     :cond_5
a=0;//     #v6=(Byte);v12=(LongLo);v13=(LongHi);v14=(Reference,Ljava/lang/String;);v15=(Conflicted);v16=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v6, v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v6=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     invoke-static {v6}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$2500(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Lcom/tencent/weiyun/WeiyunFile;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/tencent/weiyun/WeiyunFile;->getFileSize()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(LongLo);
a=0;//     sub-long/2addr v6, v3
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 758
a=0;//     :cond_6
a=0;//     #v2=(Boolean);v3=(Reference,Ljava/lang/String;);v4=(Null);v5=(LongLo);v6=(LongHi);v7=(Null);v8=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);
a=0;//     new-instance v2, Lorg/apache/http/client/methods/HttpGet;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     invoke-direct {v2, v1}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 759
a=0;//     #v2=(Reference,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     const-string v1, "Accept-Encoding"
a=0;// 
a=0;//     const-string v3, "gzip"
a=0;// 
a=0;//     invoke-interface {v2, v1, v3}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 760
a=0;//     const-string v1, "Host"
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$2000(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v2, v1, v3}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 761
a=0;//     const-string v1, "Connection"
a=0;// 
a=0;//     const-string v3, "Keep-Alive"
a=0;// 
a=0;//     invoke-interface {v2, v1, v3}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 762
a=0;//     const-string v1, "Cookie"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v4=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     invoke-static {v4}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$1700(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "="
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$1800(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ""
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v2, v1, v3}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 763
a=0;//     const-string v1, "Pragma"
a=0;// 
a=0;//     const-string v3, "no-cache"
a=0;// 
a=0;//     invoke-interface {v2, v1, v3}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 766
a=0;//     :try_start_3
a=0;//     invoke-interface {v9, v2}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 767
a=0;//     const-string v2, "weiyun_test"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "uploadFileToWeiyun doDownloadPic response:"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 770
a=0;//     invoke-interface {v1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 771
a=0;//     invoke-interface {v2}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 772
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0xc8
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     if-eq v2, v3, :cond_7
a=0;// 
a=0;//     const/16 v3, 0xce
a=0;// 
a=0;//     if-ne v2, v3, :cond_8
a=0;// 
a=0;//     .line 773
a=0;//     :cond_7
a=0;//     invoke-interface {v1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 775
a=0;//     :goto_6
a=0;//     #v1=(Conflicted);v7=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-virtual {v7, v11}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_8
a=0;// 
a=0;//     .line 776
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v10, v11, v2, v1}, Ljava/io/FileOutputStream;->write([BII)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 779
a=0;//     :catch_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 780
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 781
a=0;//     const-string v2, "weiyun_test"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "uploadFileToWeiyun doDownloadPic error:"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ""
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 783
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 784
a=0;//     const/4 v3, -0x2
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     iput v3, v2, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 785
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v2, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 786
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 788
a=0;//     :try_start_4
a=0;//     invoke-virtual {v10}, Ljava/io/FileOutputStream;->close()V
a=0;// 
a=0;//     .line 789
a=0;//     invoke-virtual {v7}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 790
a=0;//     :catch_3
a=0;//     move-exception v1
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_8
a=0;//     #v1=(Conflicted);v2=(Integer);v3=(PosShort);
a=0;//     move-object v5, v7
a=0;// 
a=0;//     .line 795
a=0;//     #v5=(Reference,Ljava/io/InputStream;);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 801
a=0;//     :catch_4
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 802
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/weiyun/FileManager$DownLoadImp;);
a=0;//     invoke-static {v2}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 803
a=0;//     const/4 v3, -0x2
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     iput v3, v2, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 804
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v2, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 805
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/tencent/weiyun/FileManager$DownLoadImp$3;->this$1:Lcom/tencent/weiyun/FileManager$DownLoadImp;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// .end method
}}
