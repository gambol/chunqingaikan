package net.slidingmenu.tools.update; class a { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/update/a;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(Landroid/content/Context;)Lnet/slidingmenu/tools/update/slidingawxc;
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v5=(Null);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/update/a;->b(Landroid/content/Context;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     const-string v1, "Check for app update , request : [%s] , response : [%s]"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object v3, v2, v5
a=0;// 
a=0;//     aput-object v0, v2, v6
a=0;// 
a=0;//     invoke-static {v1, v2}, Lnet/slidingmenu/tools/b/c/b/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/update/slidingawxc;);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);v4=(PosByte);
a=0;//     invoke-static {p0, v3}, Lnet/slidingmenu/tools/b/c/d/c;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     const-string v1, "Check for app update , request : [%s] , response : [%s]"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object v3, v4, v5
a=0;// 
a=0;//     aput-object v2, v4, v6
a=0;// 
a=0;//     invoke-static {v1, v4}, Lnet/slidingmenu/tools/b/c/b/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_2
a=0;//     #v1=(Uninit);v4=(PosByte);
a=0;//     invoke-static {p0, v2}, Lnet/slidingmenu/tools/update/a;->a(Landroid/content/Context;Ljava/lang/String;)Lnet/slidingmenu/tools/update/slidingawxc;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_2
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/update/slidingawxc;);
a=0;//     const-string v1, "Check for app update , request : [%s] , response : [%s]"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object v3, v4, v5
a=0;// 
a=0;//     aput-object v2, v4, v6
a=0;// 
a=0;//     invoke-static {v1, v4}, Lnet/slidingmenu/tools/b/c/b/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(PosByte);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v3, v0
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_3
a=0;//     #v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/b/c/b/a;->a(Ljava/lang/Throwable;)V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_2
a=0;// 
a=0;//     const-string v1, "Check for app update , request : [%s] , response : [%s]"
a=0;// 
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object v3, v4, v5
a=0;// 
a=0;//     aput-object v2, v4, v6
a=0;// 
a=0;//     invoke-static {v1, v4}, Lnet/slidingmenu/tools/b/c/b/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(PosByte);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v3, v0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v1=(Conflicted);v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "Check for app update , request : [%s] , response : [%s]"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object v3, v4, v5
a=0;// 
a=0;//     aput-object v2, v4, v6
a=0;// 
a=0;//     invoke-static {v1, v4}, Lnet/slidingmenu/tools/b/c/b/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);v4=(PosByte);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catchall_2
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_2
a=0;//     #v1=(Uninit);v2=(Reference,Ljava/lang/String;);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static a(Landroid/content/Context;Ljava/lang/String;)Lnet/slidingmenu/tools/update/slidingawxc;
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/c/c/a;->f(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/update/slidingawxc;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-static {p1}, Lnet/slidingmenu/tools/b/b/b/b;->a(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     const-string v3, "c"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v2, v3, v4}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     const-string v3, "d"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     invoke-static {v2, v3, v4}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     const-string v3, "url"
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     invoke-static {v2, v3, v4}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     const-string v4, "vc"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v2, v4, v5}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-le v4, v1, :cond_0
a=0;// 
a=0;//     const-string v1, "vn"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     invoke-static {v2, v1, v5}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "tips"
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {v2, v1, v6}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v1, Lnet/slidingmenu/tools/update/slidingawxc;
a=0;// 
a=0;//     #v1=(UninitRef,Lnet/slidingmenu/tools/update/slidingawxc;);
a=0;//     invoke-direct {v1}, Lnet/slidingmenu/tools/update/slidingawxc;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/update/slidingawxc;);
a=0;//     invoke-virtual {v1, v2}, Lnet/slidingmenu/tools/update/slidingawxc;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Lnet/slidingmenu/tools/update/slidingawxc;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Lnet/slidingmenu/tools/update/slidingawxc;->a(I)V
a=0;// 
a=0;//     invoke-virtual {v1, v5}, Lnet/slidingmenu/tools/update/slidingawxc;->a(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/update/slidingawxc;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/b/c/b/a;->a(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static b(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/a/c;->f()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     :try_start_1
a=0;//     new-instance v1, Lnet/slidingmenu/tools/b/c/c/b;
a=0;// 
a=0;//     #v1=(UninitRef,Lnet/slidingmenu/tools/b/c/c/b;);
a=0;//     invoke-direct {v1, p0}, Lnet/slidingmenu/tools/b/c/c/b;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/b/c/c/b;);
a=0;//     const-string v3, "?cid="
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1}, Lnet/slidingmenu/tools/b/c/c/b;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, "&apn="
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/i/k;->c(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lnet/slidingmenu/tools/b/b/d/j;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, "&chn="
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/c/c/a;->g(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, "&ver="
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/c/c/a;->f(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, "&app="
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/c/c/a;->a(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Lnet/slidingmenu/tools/b/b/d/j;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, "&rt="
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const-wide/16 v5, 0x3e8
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     div-long/2addr v3, v5
a=0;// 
a=0;//     invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/b/c/b/a;->a(Ljava/lang/Throwable;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/b/c/b/a;->a(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
