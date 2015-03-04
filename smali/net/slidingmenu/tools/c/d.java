package net.slidingmenu.tools.c; class d { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/c/d;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static declared-synchronized a(Landroid/content/Context;)V
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const-class v4, Lnet/slidingmenu/tools/c/d;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v4
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/c/c;->a(Landroid/content/Context;)Lnet/slidingmenu/tools/c/c;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lnet/slidingmenu/tools/c/c;);
a=0;//     move v3, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     const/16 v0, 0xa
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ge v3, v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/16 v1, 0x14
a=0;// 
a=0;//     :try_start_1
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v5, v0, v1}, Lnet/slidingmenu/tools/c/c;->a(II)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/List;);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/16 v1, 0x32
a=0;// 
a=0;//     invoke-virtual {v5, v0, v1}, Lnet/slidingmenu/tools/c/c;->a(II)Ljava/util/List;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/List;);
a=0;//     if-nez v6, :cond_1
a=0;// 
a=0;//     if-nez v7, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     monitor-exit v4
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(PosByte);v1=(PosByte);v3=(Integer);v5=(Reference,Lnet/slidingmenu/tools/c/c;);v6=(Reference,Ljava/util/List;);v7=(Reference,Ljava/util/List;);
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     :try_start_2
a=0;//     invoke-interface {v6}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_3
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v6}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ge v1, v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lnet/slidingmenu/tools/c/e;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lnet/slidingmenu/tools/c/d;->b(Landroid/content/Context;Lnet/slidingmenu/tools/c/e;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_2
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Lnet/slidingmenu/tools/c/c;->a(Lnet/slidingmenu/tools/c/e;)Z
a=0;// 
a=0;//     :cond_2
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     #v8=(Conflicted);
a=0;//     invoke-static {p0, v7}, Lnet/slidingmenu/tools/c/d;->b(Landroid/content/Context;Ljava/util/List;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-virtual {v5, v7}, Lnet/slidingmenu/tools/c/c;->a(Ljava/util/List;)Z
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     :cond_4
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     add-int/lit8 v0, v3, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v3, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v4
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Integer);v3=(Integer);v5=(Reference,Lnet/slidingmenu/tools/c/c;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Ljava/util/List;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Null);v1=(Uninit);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/c/c;->a(Landroid/content/Context;)Lnet/slidingmenu/tools/c/c;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/c/c;);
a=0;//     invoke-virtual {v1, p1}, Lnet/slidingmenu/tools/c/c;->b(Ljava/util/List;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized a(Landroid/content/Context;Lnet/slidingmenu/tools/c/e;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const-class v2, Lnet/slidingmenu/tools/c/d;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Null);v1=(One);v3=(Uninit);v4=(Uninit);
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/c/c;->a(Landroid/content/Context;)Lnet/slidingmenu/tools/c/c;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lnet/slidingmenu/tools/c/c;);
a=0;//     invoke-virtual {v4, v3}, Lnet/slidingmenu/tools/c/c;->b(Ljava/util/List;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Null);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static b(Landroid/content/Context;)Lorg/apache/http/params/HttpParams;
a=0;//     .locals 2
a=0;// 
a=0;//     const/16 v1, 0x7530
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     new-instance v0, Lorg/apache/http/params/BasicHttpParams;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     invoke-direct {v0}, Lorg/apache/http/params/BasicHttpParams;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     invoke-static {v0, v1}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     invoke-static {v0, v1}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v0, v1}, Lorg/apache/http/client/params/HttpClientParams;->setRedirecting(Lorg/apache/http/params/HttpParams;Z)V
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static b(Landroid/content/Context;Ljava/util/List;)Z
a=0;//     .locals 12
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v4, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v4=(Integer);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ge v4, v0, :cond_6
a=0;// 
a=0;//     invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lnet/slidingmenu/tools/c/e;
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     :goto_2
a=0;//     add-int/lit8 v0, v4, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v4, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/c/e;);
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/c/e;->d()J
a=0;// 
a=0;//     move-result-wide v8
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     sub-long v8, v5, v8
a=0;// 
a=0;//     invoke-static {v8, v9}, Ljava/lang/Math;->abs(J)J
a=0;// 
a=0;//     move-result-wide v8
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     if-lez v10, :cond_3
a=0;// 
a=0;//     const/16 v10, 0xa
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_3
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/c/e;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v10, "&"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v10, "tsp"
a=0;// 
a=0;//     invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v10, 0x3d
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-wide/16 v10, 0x3e8
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     div-long/2addr v8, v10
a=0;// 
a=0;//     invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Reference,Ljava/util/zip/GZIPOutputStream;);v1=(Reference,Ljava/io/ByteArrayOutputStream;);v2=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);v3=(Conflicted);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     :cond_4
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/zip/GZIPOutputStream;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_b
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_4
a=0;//     :try_start_2
a=0;//     invoke-interface {v2}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_a
a=0;// 
a=0;//     :goto_5
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     :try_start_3
a=0;//     #v0=(Integer);v1=(Null);v2=(Null);v3=(Null);v4=(Integer);v5=(LongLo);v6=(LongHi);v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->length()I
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-gtz v0, :cond_9
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     :try_start_4
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     :cond_7
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/zip/GZIPOutputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_10
a=0;// 
a=0;//     :cond_8
a=0;//     :goto_6
a=0;//     :try_start_5
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-interface {v3}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     move-exception v1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_9
a=0;//     :try_start_6
a=0;//     #v0=(Integer);v1=(Null);
a=0;//     new-instance v4, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v4=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/c/d;->b(Landroid/content/Context;)Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/params/HttpParams;);
a=0;//     invoke-direct {v4, v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_0
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_1
a=0;// 
a=0;//     :try_start_7
a=0;//     #v4=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_c
a=0;// 
a=0;//     invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "CN"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_c
a=0;// 
a=0;//     new-instance v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     const-string v3, "aHR0cDovL3QuZ2xvYmFsLnl5YXBpLm5ldC92MS9iYXRjaF9ldmVudA=="
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v3, v5}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v3}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     :goto_7
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Lorg/apache/http/client/methods/HttpPost;
a=0;// 
a=0;//     #v5=(UninitRef,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     invoke-direct {v5, v0}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     const-string v0, "Content-Encoding"
a=0;// 
a=0;//     const-string v3, "gzip"
a=0;// 
a=0;//     invoke-virtual {v5, v0, v3}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v3, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_3
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_2
a=0;// 
a=0;//     :try_start_8
a=0;//     #v3=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     new-instance v2, Ljava/util/zip/GZIPOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/zip/GZIPOutputStream;);
a=0;//     invoke-direct {v2, v3}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;//     :try_end_8
a=0;//     .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_5
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_3
a=0;// 
a=0;//     :try_start_9
a=0;//     #v2=(Reference,Ljava/util/zip/GZIPOutputStream;);
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "UTF-8"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/util/zip/GZIPOutputStream;->write([B)V
a=0;//     :try_end_9
a=0;//     .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_4
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_0
a=0;// 
a=0;//     :try_start_a
a=0;//     invoke-virtual {v2}, Ljava/util/zip/GZIPOutputStream;->close()V
a=0;//     :try_end_a
a=0;//     .catch Ljava/lang/Throwable; {:try_start_a .. :try_end_a} :catch_c
a=0;//     .catchall {:try_start_a .. :try_end_a} :catchall_4
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_8
a=0;//     :try_start_b
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v2, Lorg/apache/http/entity/ByteArrayEntity;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/entity/ByteArrayEntity;);
a=0;//     invoke-direct {v2, v0}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/entity/ByteArrayEntity;);
a=0;//     invoke-virtual {v5, v2}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     invoke-interface {v4, v5}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v2, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v0, "c"
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;//     :try_end_b
a=0;//     .catch Ljava/lang/Throwable; {:try_start_b .. :try_end_b} :catch_5
a=0;//     .catchall {:try_start_b .. :try_end_b} :catchall_3
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_d
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-eqz v3, :cond_a
a=0;// 
a=0;//     :try_start_c
a=0;//     invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     :cond_a
a=0;//     if-eqz v1, :cond_b
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/zip/GZIPOutputStream;->close()V
a=0;//     :try_end_c
a=0;//     .catch Ljava/lang/Throwable; {:try_start_c .. :try_end_c} :catch_f
a=0;// 
a=0;//     :cond_b
a=0;//     :goto_9
a=0;//     :try_start_d
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-interface {v4}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;//     :try_end_d
a=0;//     .catch Ljava/lang/Throwable; {:try_start_d .. :try_end_d} :catch_2
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_2
a=0;//     move-exception v1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_c
a=0;//     :try_start_e
a=0;//     #v0=(Conflicted);v1=(Null);v2=(Null);v5=(LongLo);
a=0;//     new-instance v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     const-string v3, "aHR0cDovL3QueW91bWkubmV0L3YxL2JhdGNoX2V2ZW50"
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v3, v5}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v3}, Ljava/lang/String;-><init>([B)V
a=0;//     :try_end_e
a=0;//     .catch Ljava/lang/Throwable; {:try_start_e .. :try_end_e} :catch_3
a=0;//     .catchall {:try_start_e .. :try_end_e} :catchall_2
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_7
a=0;// 
a=0;//     :catch_3
a=0;//     #v0=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     move-object v2, v4
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catch_4
a=0;//     #v0=(Reference,Ljava/lang/Object;);v1=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/io/ByteArrayOutputStream;);v5=(Reference,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_f
a=0;//     invoke-virtual {v2}, Ljava/util/zip/GZIPOutputStream;->close()V
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_8
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/zip/GZIPOutputStream;->close()V
a=0;//     :try_end_f
a=0;//     .catch Ljava/lang/Throwable; {:try_start_f .. :try_end_f} :catch_c
a=0;//     .catchall {:try_start_f .. :try_end_f} :catchall_4
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_10
a=0;//     #v1=(Null);
a=0;//     throw v0
a=0;//     :try_end_10
a=0;//     .catch Ljava/lang/Throwable; {:try_start_10 .. :try_end_10} :catch_5
a=0;//     .catchall {:try_start_10 .. :try_end_10} :catchall_3
a=0;// 
a=0;//     :catch_5
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v2, v4
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     move-object v1, v3
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_d
a=0;//     #v0=(Integer);v1=(Null);
a=0;//     const/16 v2, -0x3e8
a=0;// 
a=0;//     #v2=(Short);
a=0;//     if-eq v0, v2, :cond_e
a=0;// 
a=0;//     const/16 v2, -0x3e9
a=0;// 
a=0;//     if-ne v0, v2, :cond_11
a=0;// 
a=0;//     :cond_e
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-eqz v3, :cond_f
a=0;// 
a=0;//     :try_start_11
a=0;//     invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     :cond_f
a=0;//     if-eqz v1, :cond_10
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/zip/GZIPOutputStream;->close()V
a=0;//     :try_end_11
a=0;//     .catch Ljava/lang/Throwable; {:try_start_11 .. :try_end_11} :catch_e
a=0;// 
a=0;//     :cond_10
a=0;//     :goto_a
a=0;//     :try_start_12
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-interface {v4}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;//     :try_end_12
a=0;//     .catch Ljava/lang/Throwable; {:try_start_12 .. :try_end_12} :catch_6
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_6
a=0;//     move-exception v1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_11
a=0;//     #v0=(Integer);v1=(Null);
a=0;//     if-eqz v3, :cond_12
a=0;// 
a=0;//     :try_start_13
a=0;//     invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     :cond_12
a=0;//     if-eqz v1, :cond_13
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/zip/GZIPOutputStream;->close()V
a=0;//     :try_end_13
a=0;//     .catch Ljava/lang/Throwable; {:try_start_13 .. :try_end_13} :catch_d
a=0;// 
a=0;//     :cond_13
a=0;//     :goto_b
a=0;//     :try_start_14
a=0;//     #v0=(Conflicted);
a=0;//     invoke-interface {v4}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;//     :try_end_14
a=0;//     .catch Ljava/lang/Throwable; {:try_start_14 .. :try_end_14} :catch_7
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     :catch_7
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v2=(Null);v3=(Null);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     :goto_c
a=0;//     #v1=(Reference,Ljava/util/zip/GZIPOutputStream;);v2=(Reference,Ljava/io/ByteArrayOutputStream;);v3=(Conflicted);v4=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     if-eqz v2, :cond_14
a=0;// 
a=0;//     :try_start_15
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     :cond_14
a=0;//     if-eqz v1, :cond_15
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/zip/GZIPOutputStream;->close()V
a=0;//     :try_end_15
a=0;//     .catch Ljava/lang/Throwable; {:try_start_15 .. :try_end_15} :catch_9
a=0;// 
a=0;//     :cond_15
a=0;//     :goto_d
a=0;//     :try_start_16
a=0;//     invoke-interface {v4}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;//     :try_end_16
a=0;//     .catch Ljava/lang/Throwable; {:try_start_16 .. :try_end_16} :catch_8
a=0;// 
a=0;//     :goto_e
a=0;//     throw v0
a=0;// 
a=0;//     :catch_8
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_e
a=0;// 
a=0;//     :catch_9
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_d
a=0;// 
a=0;//     :catchall_2
a=0;//     #v0=(Conflicted);v1=(Null);v2=(Null);v6=(LongHi);v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_c
a=0;// 
a=0;//     :catchall_3
a=0;//     #v2=(Conflicted);v3=(Reference,Ljava/io/ByteArrayOutputStream;);v5=(Reference,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     goto :goto_c
a=0;// 
a=0;//     :catchall_4
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     goto :goto_c
a=0;// 
a=0;//     :catch_a
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     :catch_b
a=0;//     move-exception v0
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :catch_c
a=0;//     #v3=(Reference,Ljava/io/ByteArrayOutputStream;);v4=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);v5=(Reference,Lorg/apache/http/client/methods/HttpPost;);v6=(LongHi);v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v0, v2
a=0;// 
a=0;//     move-object v1, v3
a=0;// 
a=0;//     move-object v2, v4
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catch_d
a=0;//     #v0=(Integer);v1=(Null);v2=(Short);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_b
a=0;// 
a=0;//     :catch_e
a=0;//     #v0=(One);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_a
a=0;// 
a=0;//     :catch_f
a=0;//     #v1=(Null);v2=(Reference,Lorg/json/JSONObject;);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_9
a=0;// 
a=0;//     :catch_10
a=0;//     #v0=(Null);v1=(Null);v2=(Null);v3=(Null);v4=(Integer);v5=(LongLo);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_6
a=0;// .end method
a=0;// 
a=0;// .method private static b(Landroid/content/Context;Lnet/slidingmenu/tools/c/e;)Z
a=0;//     .locals 14
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Null);v1=(Uninit);v2=(LongLo);v5=(Uninit);v6=(Uninit);v7=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     new-instance v7, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v7=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/c/d;->b(Landroid/content/Context;)Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/params/HttpParams;);
a=0;//     invoke-direct {v7, v1}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_5
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v7=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v5, "CN"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_5
a=0;// 
a=0;//     new-instance v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/String;);
a=0;//     const-string v5, "aHR0cDovL3QuZ2xvYmFsLnl5YXBpLm5ldC92MS9hY3RpdmU/"
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {v5, v6}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v1, v5}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/c/e;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v5, Lorg/apache/http/client/methods/HttpGet;
a=0;// 
a=0;//     #v5=(UninitRef,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     invoke-direct {v5, v1}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     invoke-interface {v7, v5}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v9, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v9=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v9, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v1, "c"
a=0;// 
a=0;//     invoke-virtual {v9, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_6
a=0;// 
a=0;//     :try_start_2
a=0;//     const-string v0, "ts"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_d
a=0;// 
a=0;//     const-string v0, "ts"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     :goto_2
a=0;//     :try_start_3
a=0;//     #v0=(Conflicted);v5=(LongLo);v6=(LongHi);
a=0;//     const-string v0, "ft"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_c
a=0;// 
a=0;//     const-string v0, "ft"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_9
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     move-wide v9, v5
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     move-wide v5, v0
a=0;// 
a=0;//     :goto_4
a=0;//     :try_start_4
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/c/h;->a(Landroid/content/Context;)Lnet/slidingmenu/tools/c/h;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Lnet/slidingmenu/tools/c/h;);
a=0;//     cmp-long v0, v9, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_b
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/c/e;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v11, v0, v1}, Lnet/slidingmenu/tools/c/h;->a(ILjava/lang/String;)Lnet/slidingmenu/tools/c/i;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/c/i;);
a=0;//     if-nez v0, :cond_a
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/c/i;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/c/i;);
a=0;//     invoke-direct {v0}, Lnet/slidingmenu/tools/c/i;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/c/i;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Lnet/slidingmenu/tools/c/i;->b(I)V
a=0;// 
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/c/e;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lnet/slidingmenu/tools/c/i;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     :goto_5
a=0;//     const-wide/16 v12, 0x3e8
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     mul-long/2addr v9, v12
a=0;// 
a=0;//     invoke-virtual {v1, v9, v10}, Lnet/slidingmenu/tools/c/i;->a(J)V
a=0;// 
a=0;//     if-nez v8, :cond_9
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     :goto_6
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     :goto_7
a=0;//     #v1=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     cmp-long v1, v5, v2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_3
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/c/e;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v11, v1, v2}, Lnet/slidingmenu/tools/c/h;->a(ILjava/lang/String;)Lnet/slidingmenu/tools/c/i;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/c/i;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     new-instance v1, Lnet/slidingmenu/tools/c/i;
a=0;// 
a=0;//     #v1=(UninitRef,Lnet/slidingmenu/tools/c/i;);
a=0;//     invoke-direct {v1}, Lnet/slidingmenu/tools/c/i;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/c/i;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Lnet/slidingmenu/tools/c/i;->b(I)V
a=0;// 
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/c/e;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lnet/slidingmenu/tools/c/i;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_1
a=0;//     const-wide/16 v2, 0x3e8
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     mul-long/2addr v2, v5
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Lnet/slidingmenu/tools/c/i;->a(J)V
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-virtual {v11, v0}, Lnet/slidingmenu/tools/c/h;->a(Ljava/util/List;)Z
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_8
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     :cond_4
a=0;//     :goto_8
a=0;//     :try_start_5
a=0;//     #v2=(Conflicted);v11=(Conflicted);
a=0;//     invoke-interface {v7}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_7
a=0;// 
a=0;//     :goto_9
a=0;//     move v0, v4
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     :try_start_6
a=0;//     #v0=(Null);v2=(LongLo);v5=(Conflicted);v6=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     new-instance v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/String;);
a=0;//     const-string v5, "aHR0cDovL3QueW91bWkubmV0L3YxL2FjdGl2ZT8="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {v5, v6}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v1, v5}, Ljava/lang/String;-><init>([B)V
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_0
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v5=(Conflicted);v6=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v7
a=0;// 
a=0;//     :goto_a
a=0;//     :try_start_7
a=0;//     #v7=(Conflicted);
a=0;//     invoke-interface {v1}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     move-exception v1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v1=(Integer);v5=(Reference,Lorg/apache/http/client/methods/HttpGet;);v6=(Null);v7=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);v9=(Reference,Lorg/json/JSONObject;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-wide v0, v2
a=0;// 
a=0;//     :goto_b
a=0;//     #v0=(LongLo);v1=(LongHi);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-wide v5, v2
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     move-wide v9, v0
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Null);v1=(Integer);v5=(Reference,Lorg/apache/http/client/methods/HttpGet;);v6=(Null);v9=(Reference,Lorg/json/JSONObject;);v10=(Uninit);
a=0;//     const/16 v2, -0x3e8
a=0;// 
a=0;//     #v2=(Short);
a=0;//     if-eq v1, v2, :cond_7
a=0;// 
a=0;//     const/16 v2, -0x3e9
a=0;// 
a=0;//     if-ne v1, v2, :cond_8
a=0;// 
a=0;//     :cond_7
a=0;//     :try_start_8
a=0;//     invoke-interface {v7}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;//     :try_end_8
a=0;//     .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_6
a=0;// 
a=0;//     :goto_c
a=0;//     move v0, v4
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_8
a=0;//     :try_start_9
a=0;//     #v0=(Null);
a=0;//     invoke-interface {v7}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v1}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;//     :try_end_9
a=0;//     .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_3
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_3
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(LongLo);v5=(Uninit);v6=(Uninit);v7=(Conflicted);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v7, v8
a=0;// 
a=0;//     :goto_d
a=0;//     :try_start_a
a=0;//     #v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     invoke-interface {v7}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v1}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;//     :try_end_a
a=0;//     .catch Ljava/lang/Throwable; {:try_start_a .. :try_end_a} :catch_4
a=0;// 
a=0;//     :goto_e
a=0;//     throw v0
a=0;// 
a=0;//     :catch_4
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_e
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_d
a=0;// 
a=0;//     :catch_5
a=0;//     #v0=(Null);v2=(LongLo);v5=(Uninit);v6=(Uninit);v7=(Conflicted);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v8
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_a
a=0;// 
a=0;//     :catch_6
a=0;//     #v0=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);v1=(Integer);v2=(Short);v5=(Reference,Lorg/apache/http/client/methods/HttpGet;);v6=(Null);v7=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);v9=(Reference,Lorg/json/JSONObject;);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_c
a=0;// 
a=0;//     :catch_7
a=0;//     #v1=(Conflicted);v2=(Conflicted);v5=(LongLo);v6=(LongHi);v9=(LongLo);v10=(LongHi);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_9
a=0;// 
a=0;//     :catch_8
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_8
a=0;// 
a=0;//     :catch_9
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(LongLo);v9=(Reference,Lorg/json/JSONObject;);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-wide v0, v5
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_b
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/c/i;);v1=(Reference,Lnet/slidingmenu/tools/c/i;);v9=(LongLo);v10=(LongHi);v11=(Reference,Lnet/slidingmenu/tools/c/h;);v12=(LongLo);v13=(LongHi);
a=0;//     move-object v0, v8
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/c/i;);v12=(Uninit);v13=(Uninit);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     :cond_b
a=0;//     #v0=(Byte);v1=(LongHi);
a=0;//     move-object v0, v8
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     :cond_c
a=0;//     #v0=(Boolean);v1=(Integer);v9=(Reference,Lorg/json/JSONObject;);v10=(Uninit);v11=(Uninit);
a=0;//     move-wide v0, v2
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_d
a=0;//     #v0=(Boolean);v1=(Integer);v5=(Reference,Lorg/apache/http/client/methods/HttpGet;);v6=(Null);
a=0;//     move-wide v5, v2
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     goto/16 :goto_2
a=0;// .end method
}}
