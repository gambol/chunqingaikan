package net.slidingmenu.tools.d.a; class a { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/d/a/a;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:J
a=0;// 
a=0;// .field private b:J
a=0;// 
a=0;// .field private c:Z
a=0;// 
a=0;// .field private d:Ljava/lang/String;
a=0;// 
a=0;// .field private e:Ljava/io/File;
a=0;// 
a=0;// .field private f:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)V
a=0;//     .locals 6
a=0;// 
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(UninitThis,Lnet/slidingmenu/tools/d/a/a;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-direct/range {v0 .. v5}, Lnet/slidingmenu/tools/d/a/a;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;J)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/d/a/a;);p0=(Reference,Lnet/slidingmenu/tools/d/a/a;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;J)V
a=0;//     .locals 3
a=0;// 
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/d/a/a;);
a=0;//     iput-wide v1, p0, Lnet/slidingmenu/tools/d/a/a;->a:J
a=0;// 
a=0;//     iput-wide v1, p0, Lnet/slidingmenu/tools/d/a/a;->b:J
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lnet/slidingmenu/tools/d/a/a;->c:Z
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/d/a/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     iput-object p2, p0, Lnet/slidingmenu/tools/d/a/a;->d:Ljava/lang/String;
a=0;// 
a=0;//     cmp-long v0, p4, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     iput-wide p4, p0, Lnet/slidingmenu/tools/d/a/a;->a:J
a=0;// 
a=0;//     :cond_0
a=0;//     iput-object p3, p0, Lnet/slidingmenu/tools/d/a/a;->e:Ljava/io/File;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()I
a=0;//     .locals 12
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/d/a/a;->d:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1c
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     const/4 v0, -0x2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iput-boolean v3, p0, Lnet/slidingmenu/tools/d/a/a;->c:Z
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_5
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     :try_start_2
a=0;//     invoke-virtual {v5}, Ljava/io/RandomAccessFile;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_6
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     :try_start_3
a=0;//     invoke-virtual {v4}, Lorg/apache/http/client/methods/HttpGet;->abort()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_7
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     :try_start_4
a=0;//     invoke-virtual {v2}, Lorg/apache/http/impl/client/DefaultHttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_21
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_3
a=0;//     #v2=(Reference,Ujava/lang/Object;);v3=(Reference,Ujava/lang/Object;);v4=(Reference,Ljava/io/RandomAccessFile;);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_4
a=0;//     :try_start_5
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Null);v2=(Null);v3=(Uninit);v4=(Null);v5=(Null);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/d/a/a;->e:Ljava/io/File;
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_1c
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     if-nez v0, :cond_8
a=0;// 
a=0;//     const/4 v0, -0x2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iput-boolean v3, p0, Lnet/slidingmenu/tools/d/a/a;->c:Z
a=0;// 
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     :try_start_6
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_8
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_4
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v5, :cond_6
a=0;// 
a=0;//     :try_start_7
a=0;//     invoke-virtual {v5}, Ljava/io/RandomAccessFile;->close()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_9
a=0;// 
a=0;//     :cond_6
a=0;//     :goto_5
a=0;//     if-eqz v4, :cond_7
a=0;// 
a=0;//     :try_start_8
a=0;//     invoke-virtual {v4}, Lorg/apache/http/client/methods/HttpGet;->abort()V
a=0;//     :try_end_8
a=0;//     .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_a
a=0;// 
a=0;//     :cond_7
a=0;//     :goto_6
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     :try_start_9
a=0;//     invoke-virtual {v2}, Lorg/apache/http/impl/client/DefaultHttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;//     :try_end_9
a=0;//     .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Reference,Ljava/io/File;);v1=(Null);v3=(Uninit);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :try_start_a
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lnet/slidingmenu/tools/d/a/a;->c:Z
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/d/a/a;->f:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/b/i/i;->b(Landroid/content/Context;)Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;//     :try_end_a
a=0;//     .catch Ljava/lang/Throwable; {:try_start_a .. :try_end_a} :catch_1c
a=0;//     .catchall {:try_start_a .. :try_end_a} :catchall_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :try_start_b
a=0;//     #v2=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     new-instance v3, Lorg/apache/http/client/methods/HttpGet;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/d/a/a;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v3, v0}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_b
a=0;//     .catch Ljava/lang/Throwable; {:try_start_b .. :try_end_b} :catch_1d
a=0;//     .catchall {:try_start_b .. :try_end_b} :catchall_0
a=0;// 
a=0;//     :try_start_c
a=0;//     #v3=(Reference,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     iget-wide v6, p0, Lnet/slidingmenu/tools/d/a/a;->a:J
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     const-wide/16 v8, 0x0
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     cmp-long v0, v6, v8
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_9
a=0;// 
a=0;//     const-string v0, "RANGE"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "bytes=%d-"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     new-array v8, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v10, v8, v9
a=0;// 
a=0;//     invoke-static {v4, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v0, v4}, Lorg/apache/http/client/methods/HttpGet;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     invoke-virtual {v2, v3}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/HttpResponse;);
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-interface {v4}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;//     :try_end_c
a=0;//     .catch Ljava/lang/Throwable; {:try_start_c .. :try_end_c} :catch_1e
a=0;//     .catchall {:try_start_c .. :try_end_c} :catchall_1
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/16 v8, 0xc8
a=0;// 
a=0;//     #v8=(PosShort);
a=0;//     if-lt v4, v8, :cond_a
a=0;// 
a=0;//     const/16 v8, 0x12c
a=0;// 
a=0;//     if-lt v4, v8, :cond_e
a=0;// 
a=0;//     :cond_a
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     iput-boolean v4, p0, Lnet/slidingmenu/tools/d/a/a;->c:Z
a=0;// 
a=0;//     if-eqz v1, :cond_b
a=0;// 
a=0;//     :try_start_d
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_d
a=0;//     .catch Ljava/lang/Throwable; {:try_start_d .. :try_end_d} :catch_b
a=0;// 
a=0;//     :cond_b
a=0;//     :goto_7
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v5, :cond_c
a=0;// 
a=0;//     :try_start_e
a=0;//     invoke-virtual {v5}, Ljava/io/RandomAccessFile;->close()V
a=0;//     :try_end_e
a=0;//     .catch Ljava/lang/Throwable; {:try_start_e .. :try_end_e} :catch_c
a=0;// 
a=0;//     :cond_c
a=0;//     :goto_8
a=0;//     if-eqz v3, :cond_d
a=0;// 
a=0;//     :try_start_f
a=0;//     invoke-virtual {v3}, Lorg/apache/http/client/methods/HttpGet;->abort()V
a=0;//     :try_end_f
a=0;//     .catch Ljava/lang/Throwable; {:try_start_f .. :try_end_f} :catch_d
a=0;// 
a=0;//     :cond_d
a=0;//     :goto_9
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     :try_start_10
a=0;//     invoke-virtual {v2}, Lorg/apache/http/impl/client/DefaultHttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;//     :try_end_10
a=0;//     .catch Ljava/lang/Throwable; {:try_start_10 .. :try_end_10} :catch_1
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catch_1
a=0;//     move-exception v1
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_e
a=0;//     :try_start_11
a=0;//     #v0=(Reference,Lorg/apache/http/HttpResponse;);v1=(Null);v4=(Integer);
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     invoke-interface {v8}, Lorg/apache/http/HttpEntity;->getContentLength()J
a=0;// 
a=0;//     move-result-wide v8
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     const/16 v10, 0xc8
a=0;// 
a=0;//     #v10=(PosShort);
a=0;//     if-ne v4, v10, :cond_f
a=0;// 
a=0;//     const-wide/16 v10, 0x0
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     cmp-long v4, v6, v10
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-lez v4, :cond_f
a=0;// 
a=0;//     iget-object v4, p0, Lnet/slidingmenu/tools/d/a/a;->e:Ljava/io/File;
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v10
a=0;// 
a=0;//     cmp-long v4, v10, v6
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-eqz v4, :cond_f
a=0;// 
a=0;//     iget-object v4, p0, Lnet/slidingmenu/tools/d/a/a;->e:Ljava/io/File;
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->delete()Z
a=0;//     :try_end_11
a=0;//     .catch Ljava/lang/Throwable; {:try_start_11 .. :try_end_11} :catch_1e
a=0;//     .catchall {:try_start_11 .. :try_end_11} :catchall_1
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_f
a=0;// 
a=0;//     :cond_f
a=0;//     #v4=(Integer);v10=(Conflicted);v11=(Conflicted);
a=0;//     const-wide/16 v10, 0x0
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     cmp-long v4, v6, v10
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-nez v4, :cond_10
a=0;// 
a=0;//     :try_start_12
a=0;//     iget-object v4, p0, Lnet/slidingmenu/tools/d/a/a;->e:Ljava/io/File;
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_10
a=0;// 
a=0;//     iget-object v4, p0, Lnet/slidingmenu/tools/d/a/a;->e:Ljava/io/File;
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->isFile()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_10
a=0;// 
a=0;//     iget-object v4, p0, Lnet/slidingmenu/tools/d/a/a;->e:Ljava/io/File;
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v10
a=0;// 
a=0;//     cmp-long v4, v10, v8
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-lez v4, :cond_10
a=0;// 
a=0;//     iget-object v4, p0, Lnet/slidingmenu/tools/d/a/a;->e:Ljava/io/File;
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->delete()Z
a=0;//     :try_end_12
a=0;//     .catch Ljava/lang/Throwable; {:try_start_12 .. :try_end_12} :catch_20
a=0;//     .catchall {:try_start_12 .. :try_end_12} :catchall_1
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_10
a=0;// 
a=0;//     :cond_10
a=0;//     :goto_a
a=0;//     :try_start_13
a=0;//     #v4=(Conflicted);
a=0;//     new-instance v4, Ljava/io/RandomAccessFile;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/RandomAccessFile;);
a=0;//     iget-object v8, p0, Lnet/slidingmenu/tools/d/a/a;->e:Ljava/io/File;
a=0;// 
a=0;//     #v8=(Reference,Ljava/io/File;);
a=0;//     const-string v9, "rw"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v8, v9}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;//     :try_end_13
a=0;//     .catch Ljava/lang/Throwable; {:try_start_13 .. :try_end_13} :catch_1e
a=0;//     .catchall {:try_start_13 .. :try_end_13} :catchall_1
a=0;// 
a=0;//     :try_start_14
a=0;//     #v4=(Reference,Ljava/io/RandomAccessFile;);
a=0;//     invoke-virtual {v4, v6, v7}, Ljava/io/RandomAccessFile;->seek(J)V
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     invoke-interface {v5}, Lorg/apache/http/HttpEntity;->getContentLength()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     iput-wide v5, p0, Lnet/slidingmenu/tools/d/a/a;->b:J
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
a=0;//     :try_end_14
a=0;//     .catch Ljava/lang/Throwable; {:try_start_14 .. :try_end_14} :catch_1f
a=0;//     .catchall {:try_start_14 .. :try_end_14} :catchall_2
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/InputStream;);
a=0;//     const/16 v0, 0x800
a=0;// 
a=0;//     :try_start_15
a=0;//     #v0=(PosShort);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     :goto_b
a=0;//     #v0=(Reference,[B);v8=(Conflicted);v9=(Conflicted);
a=0;//     iget-boolean v5, p0, Lnet/slidingmenu/tools/d/a/a;->c:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_15
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-lez v5, :cond_15
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v4, v0, v6, v5}, Ljava/io/RandomAccessFile;->write([BII)V
a=0;// 
a=0;//     iget-wide v6, p0, Lnet/slidingmenu/tools/d/a/a;->a:J
a=0;// 
a=0;//     #v6=(LongLo);
a=0;//     int-to-long v8, v5
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     add-long v5, v6, v8
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     iput-wide v5, p0, Lnet/slidingmenu/tools/d/a/a;->a:J
a=0;//     :try_end_15
a=0;//     .catch Ljava/lang/Throwable; {:try_start_15 .. :try_end_15} :catch_2
a=0;//     .catchall {:try_start_15 .. :try_end_15} :catchall_2
a=0;// 
a=0;//     goto :goto_b
a=0;// 
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     move-object v3, v4
a=0;// 
a=0;//     :goto_c
a=0;//     #v4=(Conflicted);v7=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     iput-boolean v4, p0, Lnet/slidingmenu/tools/d/a/a;->c:Z
a=0;// 
a=0;//     if-eqz v0, :cond_11
a=0;// 
a=0;//     :try_start_16
a=0;//     invoke-virtual {v0}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_16
a=0;//     .catch Ljava/lang/Throwable; {:try_start_16 .. :try_end_16} :catch_14
a=0;// 
a=0;//     :cond_11
a=0;//     :goto_d
a=0;//     if-eqz v3, :cond_12
a=0;// 
a=0;//     :try_start_17
a=0;//     invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V
a=0;//     :try_end_17
a=0;//     .catch Ljava/lang/Throwable; {:try_start_17 .. :try_end_17} :catch_15
a=0;// 
a=0;//     :cond_12
a=0;//     :goto_e
a=0;//     if-eqz v2, :cond_13
a=0;// 
a=0;//     :try_start_18
a=0;//     invoke-virtual {v2}, Lorg/apache/http/client/methods/HttpGet;->abort()V
a=0;//     :try_end_18
a=0;//     .catch Ljava/lang/Throwable; {:try_start_18 .. :try_end_18} :catch_16
a=0;// 
a=0;//     :cond_13
a=0;//     :goto_f
a=0;//     if-eqz v1, :cond_14
a=0;// 
a=0;//     :try_start_19
a=0;//     invoke-virtual {v1}, Lorg/apache/http/impl/client/DefaultHttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;//     :try_end_19
a=0;//     .catch Ljava/lang/Throwable; {:try_start_19 .. :try_end_19} :catch_1b
a=0;// 
a=0;//     :cond_14
a=0;//     :goto_10
a=0;//     const/4 v0, -0x4
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_15
a=0;//     :try_start_1a
a=0;//     #v0=(Reference,[B);v4=(Reference,Ljava/io/RandomAccessFile;);v5=(Integer);v6=(LongHi);v7=(LongHi);v10=(LongLo);v11=(LongHi);
a=0;//     iget-wide v5, p0, Lnet/slidingmenu/tools/d/a/a;->b:J
a=0;// 
a=0;//     #v5=(LongLo);
a=0;//     iget-wide v7, p0, Lnet/slidingmenu/tools/d/a/a;->a:J
a=0;//     :try_end_1a
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1a .. :try_end_1a} :catch_2
a=0;//     .catchall {:try_start_1a .. :try_end_1a} :catchall_2
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     cmp-long v0, v5, v7
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_19
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     iput-boolean v5, p0, Lnet/slidingmenu/tools/d/a/a;->c:Z
a=0;// 
a=0;//     if-eqz v1, :cond_16
a=0;// 
a=0;//     :try_start_1b
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_1b
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1b .. :try_end_1b} :catch_e
a=0;// 
a=0;//     :cond_16
a=0;//     :goto_11
a=0;//     if-eqz v4, :cond_17
a=0;// 
a=0;//     :try_start_1c
a=0;//     invoke-virtual {v4}, Ljava/io/RandomAccessFile;->close()V
a=0;//     :try_end_1c
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1c .. :try_end_1c} :catch_f
a=0;// 
a=0;//     :cond_17
a=0;//     :goto_12
a=0;//     if-eqz v3, :cond_18
a=0;// 
a=0;//     :try_start_1d
a=0;//     invoke-virtual {v3}, Lorg/apache/http/client/methods/HttpGet;->abort()V
a=0;//     :try_end_1d
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1d .. :try_end_1d} :catch_10
a=0;// 
a=0;//     :cond_18
a=0;//     :goto_13
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     :try_start_1e
a=0;//     invoke-virtual {v2}, Lorg/apache/http/impl/client/DefaultHttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;//     :try_end_1e
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1e .. :try_end_1e} :catch_3
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catch_3
a=0;//     move-exception v1
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_19
a=0;//     #v0=(Byte);v5=(LongLo);
a=0;//     const/4 v0, -0x3
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     iput-boolean v5, p0, Lnet/slidingmenu/tools/d/a/a;->c:Z
a=0;// 
a=0;//     if-eqz v1, :cond_1a
a=0;// 
a=0;//     :try_start_1f
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_1f
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1f .. :try_end_1f} :catch_11
a=0;// 
a=0;//     :cond_1a
a=0;//     :goto_14
a=0;//     if-eqz v4, :cond_1b
a=0;// 
a=0;//     :try_start_20
a=0;//     invoke-virtual {v4}, Ljava/io/RandomAccessFile;->close()V
a=0;//     :try_end_20
a=0;//     .catch Ljava/lang/Throwable; {:try_start_20 .. :try_end_20} :catch_12
a=0;// 
a=0;//     :cond_1b
a=0;//     :goto_15
a=0;//     if-eqz v3, :cond_1c
a=0;// 
a=0;//     :try_start_21
a=0;//     invoke-virtual {v3}, Lorg/apache/http/client/methods/HttpGet;->abort()V
a=0;//     :try_end_21
a=0;//     .catch Ljava/lang/Throwable; {:try_start_21 .. :try_end_21} :catch_13
a=0;// 
a=0;//     :cond_1c
a=0;//     :goto_16
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     :try_start_22
a=0;//     invoke-virtual {v2}, Lorg/apache/http/impl/client/DefaultHttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;//     :try_end_22
a=0;//     .catch Ljava/lang/Throwable; {:try_start_22 .. :try_end_22} :catch_4
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catch_4
a=0;//     move-exception v1
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Null);v3=(Conflicted);v4=(Null);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     :goto_17
a=0;//     #v1=(Reference,Ljava/io/InputStream;);v3=(Reference,Lorg/apache/http/client/methods/HttpGet;);v4=(Conflicted);v5=(Reference,Ljava/io/RandomAccessFile;);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     iput-boolean v4, p0, Lnet/slidingmenu/tools/d/a/a;->c:Z
a=0;// 
a=0;//     if-eqz v1, :cond_1d
a=0;// 
a=0;//     :try_start_23
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_23
a=0;//     .catch Ljava/lang/Throwable; {:try_start_23 .. :try_end_23} :catch_17
a=0;// 
a=0;//     :cond_1d
a=0;//     :goto_18
a=0;//     if-eqz v5, :cond_1e
a=0;// 
a=0;//     :try_start_24
a=0;//     invoke-virtual {v5}, Ljava/io/RandomAccessFile;->close()V
a=0;//     :try_end_24
a=0;//     .catch Ljava/lang/Throwable; {:try_start_24 .. :try_end_24} :catch_18
a=0;// 
a=0;//     :cond_1e
a=0;//     :goto_19
a=0;//     if-eqz v3, :cond_1f
a=0;// 
a=0;//     :try_start_25
a=0;//     invoke-virtual {v3}, Lorg/apache/http/client/methods/HttpGet;->abort()V
a=0;//     :try_end_25
a=0;//     .catch Ljava/lang/Throwable; {:try_start_25 .. :try_end_25} :catch_19
a=0;// 
a=0;//     :cond_1f
a=0;//     :goto_1a
a=0;//     if-eqz v2, :cond_20
a=0;// 
a=0;//     :try_start_26
a=0;//     invoke-virtual {v2}, Lorg/apache/http/impl/client/DefaultHttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;//     :try_end_26
a=0;//     .catch Ljava/lang/Throwable; {:try_start_26 .. :try_end_26} :catch_1a
a=0;// 
a=0;//     :cond_20
a=0;//     :goto_1b
a=0;//     throw v0
a=0;// 
a=0;//     :catch_5
a=0;//     #v0=(Byte);v1=(Null);v2=(Null);v3=(Null);v5=(Null);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_6
a=0;//     move-exception v1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_7
a=0;//     move-exception v1
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :catch_8
a=0;//     #v1=(Null);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :catch_9
a=0;//     move-exception v1
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     :catch_a
a=0;//     move-exception v1
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     :catch_b
a=0;//     #v1=(Null);v2=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);v3=(Reference,Lorg/apache/http/client/methods/HttpGet;);v6=(LongLo);v7=(LongHi);v8=(PosShort);v9=(Conflicted);v10=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     :catch_c
a=0;//     move-exception v1
a=0;// 
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     :catch_d
a=0;//     move-exception v1
a=0;// 
a=0;//     goto/16 :goto_9
a=0;// 
a=0;//     :catch_e
a=0;//     #v0=(Null);v4=(Reference,Ljava/io/RandomAccessFile;);v6=(LongHi);v7=(LongLo);v8=(LongHi);v10=(LongLo);v11=(LongHi);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_11
a=0;// 
a=0;//     :catch_f
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_12
a=0;// 
a=0;//     :catch_10
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_13
a=0;// 
a=0;//     :catch_11
a=0;//     #v0=(Byte);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_14
a=0;// 
a=0;//     :catch_12
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_15
a=0;// 
a=0;//     :catch_13
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_16
a=0;// 
a=0;//     :catch_14
a=0;//     #v0=(Reference,Ljava/io/InputStream;);v4=(Null);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto/16 :goto_d
a=0;// 
a=0;//     :catch_15
a=0;//     move-exception v0
a=0;// 
a=0;//     goto/16 :goto_e
a=0;// 
a=0;//     :catch_16
a=0;//     move-exception v0
a=0;// 
a=0;//     goto/16 :goto_f
a=0;// 
a=0;//     :catch_17
a=0;//     #v5=(Reference,Ljava/io/RandomAccessFile;);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_18
a=0;// 
a=0;//     :catch_18
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_19
a=0;// 
a=0;//     :catch_19
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_1a
a=0;// 
a=0;//     :catch_1a
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_1b
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v1=(Null);v4=(Conflicted);v5=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_17
a=0;// 
a=0;//     :catchall_2
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/io/InputStream;);v4=(Reference,Ljava/io/RandomAccessFile;);v5=(Conflicted);v7=(LongHi);v10=(LongLo);v11=(LongHi);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v5, v4
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/RandomAccessFile;);
a=0;//     goto :goto_17
a=0;// 
a=0;//     :catch_1b
a=0;//     #v4=(Null);v5=(Conflicted);v7=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto/16 :goto_10
a=0;// 
a=0;//     :catch_1c
a=0;//     #v0=(Conflicted);v1=(Null);v2=(Null);v3=(Uninit);v5=(Null);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v3, v5
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     move-object v2, v4
a=0;// 
a=0;//     goto/16 :goto_c
a=0;// 
a=0;//     :catch_1d
a=0;//     #v0=(Reference,Ujava/lang/Object;);v2=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v3, v5
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     move-object v2, v4
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto/16 :goto_c
a=0;// 
a=0;//     :catch_1e
a=0;//     #v0=(Conflicted);v1=(Null);v2=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);v3=(Reference,Lorg/apache/http/client/methods/HttpGet;);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     move-object v3, v5
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto/16 :goto_c
a=0;// 
a=0;//     :catch_1f
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Null);v3=(Reference,Lorg/apache/http/client/methods/HttpGet;);v4=(Reference,Ljava/io/RandomAccessFile;);v5=(Conflicted);v7=(LongHi);v8=(Reference,Ljava/io/File;);v9=(Reference,Ljava/lang/String;);v10=(LongLo);v11=(LongHi);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     move-object v3, v4
a=0;// 
a=0;//     goto/16 :goto_c
a=0;// 
a=0;//     :catch_20
a=0;//     #v0=(Reference,Lorg/apache/http/HttpResponse;);v1=(Null);v4=(Conflicted);v5=(Null);v6=(LongLo);v8=(LongLo);v9=(LongHi);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_a
a=0;// 
a=0;//     :catch_21
a=0;//     #v0=(Byte);v1=(Reference,Ujava/lang/Object;);v2=(Null);v3=(Null);v4=(Null);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// .end method
}}
