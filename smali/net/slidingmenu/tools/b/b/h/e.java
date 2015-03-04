package net.slidingmenu.tools.b.b.h; class e { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/b/h/e;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Ljava/lang/String;
a=0;// 
a=0;// .field private static b:Ljava/lang/String;
a=0;// 
a=0;// .field private static c:Ljava/lang/String;
a=0;// 
a=0;// .field private static d:Ljava/lang/String;
a=0;// 
a=0;// .field private static e:Ljava/lang/String;
a=0;// 
a=0;// .field private static f:Ljava/lang/String;
a=0;// 
a=0;// .field private static g:Ljava/lang/String;
a=0;// 
a=0;// .field private static h:Ljava/lang/String;
a=0;// 
a=0;// .field private static i:Ljava/lang/String;
a=0;// 
a=0;// .field private static j:Ljava/lang/String;
a=0;// 
a=0;// .field private static k:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a()Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->h:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "%s-%s"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     aput-object v0, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/b/h/e;->h:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->h:Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->g:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/h/e;->m(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/b/h/e;->g:Ljava/lang/String;
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->g:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->g:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static declared-synchronized a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-class v5, Lnet/slidingmenu/tools/b/b/h/e;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v5
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {p1}, Lnet/slidingmenu/tools/b/b/b/e;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {p2}, Lnet/slidingmenu/tools/b/b/b/e;->a(Ljava/lang/String;)Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     move-object v0, v3
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     monitor-exit v5
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);v1=(One);v2=(Null);v4=(Uninit);v6=(Uninit);
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/b/k/n;->a()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_e
a=0;// 
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/b/k/n;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v6, "/Android/data/.dataycache/"
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v2=(Boolean);v4=(Conflicted);v6=(Conflicted);
a=0;//     if-nez v0, :cond_d
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     :try_start_2
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     new-instance v4, Ljava/io/FileReader;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/FileReader;);
a=0;//     invoke-direct {v4, v0}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     :try_start_3
a=0;//     #v4=(Reference,Ljava/io/FileReader;);
a=0;//     new-instance v2, Ljava/io/BufferedReader;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/BufferedReader;);
a=0;//     invoke-direct {v2, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_9
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_2
a=0;// 
a=0;//     :try_start_4
a=0;//     #v2=(Reference,Ljava/io/BufferedReader;);
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/b/b/e;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_7
a=0;// 
a=0;//     invoke-static {v0, p2}, Lnet/slidingmenu/tools/b/b/d/i;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/b/b/e;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     invoke-static {p0, p1, v0, p2}, Lnet/slidingmenu/tools/b/b/h/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_a
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_3
a=0;// 
a=0;//     :cond_4
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     :try_start_5
a=0;//     invoke-virtual {v4}, Ljava/io/FileReader;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_3
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_1
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_3
a=0;//     #v1=(Conflicted);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     :try_start_6
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_0
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v1=(Boolean);v2=(Boolean);v4=(Conflicted);v6=(Conflicted);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     :cond_7
a=0;//     #v2=(Reference,Ljava/io/BufferedReader;);v4=(Reference,Ljava/io/FileReader;);
a=0;//     if-eqz v4, :cond_8
a=0;// 
a=0;//     :try_start_7
a=0;//     invoke-virtual {v4}, Ljava/io/FileReader;->close()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_4
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_1
a=0;// 
a=0;//     :cond_8
a=0;//     :goto_4
a=0;//     if-eqz v2, :cond_9
a=0;// 
a=0;//     :try_start_8
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
a=0;//     :try_end_8
a=0;//     .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_5
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_1
a=0;// 
a=0;//     :cond_9
a=0;//     :goto_5
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     move-object v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Reference,Ljava/io/File;);v1=(Boolean);v2=(Boolean);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v1, v3
a=0;// 
a=0;//     :goto_6
a=0;//     #v0=(Reference,Ljava/io/BufferedReader;);v1=(Reference,Ljava/io/FileReader;);v2=(Conflicted);
a=0;//     if-eqz v1, :cond_a
a=0;// 
a=0;//     :try_start_9
a=0;//     invoke-virtual {v1}, Ljava/io/FileReader;->close()V
a=0;//     :try_end_9
a=0;//     .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_6
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_1
a=0;// 
a=0;//     :cond_a
a=0;//     :goto_7
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     :try_start_a
a=0;//     invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
a=0;//     :try_end_a
a=0;//     .catch Ljava/lang/Throwable; {:try_start_a .. :try_end_a} :catch_2
a=0;//     .catchall {:try_start_a .. :try_end_a} :catchall_1
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Boolean);v2=(Boolean);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     :goto_8
a=0;//     #v2=(Reference,Ljava/io/BufferedReader;);v4=(Reference,Ljava/io/FileReader;);
a=0;//     if-eqz v4, :cond_b
a=0;// 
a=0;//     :try_start_b
a=0;//     invoke-virtual {v4}, Ljava/io/FileReader;->close()V
a=0;//     :try_end_b
a=0;//     .catch Ljava/lang/Throwable; {:try_start_b .. :try_end_b} :catch_7
a=0;//     .catchall {:try_start_b .. :try_end_b} :catchall_1
a=0;// 
a=0;//     :cond_b
a=0;//     :goto_9
a=0;//     #v1=(Conflicted);
a=0;//     if-eqz v2, :cond_c
a=0;// 
a=0;//     :try_start_c
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
a=0;//     :try_end_c
a=0;//     .catch Ljava/lang/Throwable; {:try_start_c .. :try_end_c} :catch_8
a=0;//     .catchall {:try_start_c .. :try_end_c} :catchall_1
a=0;// 
a=0;//     :cond_c
a=0;//     :goto_a
a=0;//     :try_start_d
a=0;//     throw v0
a=0;//     :try_end_d
a=0;//     .catchall {:try_start_d .. :try_end_d} :catchall_1
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v5
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :catch_3
a=0;//     #v1=(Boolean);v2=(Reference,Ljava/io/BufferedReader;);v4=(Reference,Ljava/io/FileReader;);v6=(Boolean);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_4
a=0;//     #v1=(Boolean);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_5
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_6
a=0;//     #v1=(Reference,Ljava/io/FileReader;);v2=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     :catch_7
a=0;//     #v1=(Boolean);v2=(Reference,Ljava/io/BufferedReader;);v4=(Reference,Ljava/io/FileReader;);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_9
a=0;// 
a=0;//     :catch_8
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_a
a=0;// 
a=0;//     :catchall_2
a=0;//     #v1=(Boolean);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_8
a=0;// 
a=0;//     :catchall_3
a=0;//     #v2=(Reference,Ljava/io/BufferedReader;);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     :catch_9
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v1, v4
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/FileReader;);
a=0;//     goto :goto_6
a=0;// 
a=0;//     :catch_a
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Boolean);v2=(Reference,Ljava/io/BufferedReader;);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v0, v2
a=0;// 
a=0;//     move-object v1, v4
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/FileReader;);
a=0;//     goto :goto_6
a=0;// 
a=0;//     :cond_d
a=0;//     #v1=(One);v2=(Boolean);v4=(Conflicted);
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_e
a=0;//     #v0=(Boolean);v1=(One);v2=(Null);v4=(Uninit);v6=(Uninit);
a=0;//     move-object v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 0
a=0;// 
a=0;//     sput-object p0, Lnet/slidingmenu/tools/b/b/h/e;->k:Ljava/lang/String;
a=0;// 
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method private static declared-synchronized a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const-class v5, Lnet/slidingmenu/tools/b/b/h/e;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v5
a=0;// 
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {p2}, Lnet/slidingmenu/tools/b/b/b/e;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {p1}, Lnet/slidingmenu/tools/b/b/b/e;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {p1}, Lnet/slidingmenu/tools/b/b/b/e;->a(Ljava/lang/String;)Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/Throwable;);v2=(Conflicted);v3=(Reference,Ujava/lang/Object;);v4=(Conflicted);v6=(Conflicted);
a=0;//     monitor-exit v5
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v1=(Null);v2=(Uninit);v3=(Null);v4=(Uninit);v6=(Uninit);
a=0;//     invoke-static {p2, p3}, Lnet/slidingmenu/tools/b/b/d/i;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/n;->a(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/b/k/n;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v4, "/Android/data/.dataycache"
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v4, "/"
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_5
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_3
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     :cond_3
a=0;//     #v4=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     :try_start_2
a=0;//     new-instance v4, Ljava/io/FileWriter;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/FileWriter;);
a=0;//     invoke-direct {v4, v0}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     :try_start_3
a=0;//     #v4=(Reference,Ljava/io/FileWriter;);
a=0;//     new-instance v2, Ljava/io/BufferedWriter;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/BufferedWriter;);
a=0;//     invoke-direct {v2, v4}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_a
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_2
a=0;// 
a=0;//     :try_start_4
a=0;//     #v2=(Reference,Ljava/io/BufferedWriter;);
a=0;//     invoke-virtual {v2, v6}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedWriter;->flush()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_b
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_3
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     :try_start_5
a=0;//     invoke-virtual {v4}, Ljava/io/FileWriter;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_4
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_1
a=0;// 
a=0;//     :cond_4
a=0;//     :goto_1
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     :try_start_6
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedWriter;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_0
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Reference,Ljava/io/File;);v1=(Null);v2=(Boolean);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     :try_start_7
a=0;//     #v0=(Boolean);v2=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {p0, p1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_3
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_1
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Reference,Ljava/io/File;);v2=(Null);v4=(Null);
a=0;//     if-eqz v3, :cond_8
a=0;// 
a=0;//     :try_start_8
a=0;//     invoke-virtual {v2}, Ljava/io/FileWriter;->close()V
a=0;//     :try_end_8
a=0;//     .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_5
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_1
a=0;// 
a=0;//     :cond_8
a=0;//     :goto_2
a=0;//     if-eqz v3, :cond_9
a=0;// 
a=0;//     :try_start_9
a=0;//     invoke-virtual {v4}, Ljava/io/BufferedWriter;->close()V
a=0;//     :try_end_9
a=0;//     .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_6
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_1
a=0;// 
a=0;//     :cond_9
a=0;//     :goto_3
a=0;//     #v2=(Conflicted);v3=(Reference,Ujava/lang/Object;);v4=(Conflicted);v6=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Reference,Ljava/io/File;);v2=(Null);v3=(Null);v6=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v0, v3
a=0;// 
a=0;//     :goto_4
a=0;//     #v2=(Conflicted);v3=(Reference,Ljava/io/FileWriter;);
a=0;//     if-eqz v3, :cond_a
a=0;// 
a=0;//     :try_start_a
a=0;//     invoke-virtual {v3}, Ljava/io/FileWriter;->close()V
a=0;//     :try_end_a
a=0;//     .catch Ljava/lang/Throwable; {:try_start_a .. :try_end_a} :catch_7
a=0;//     .catchall {:try_start_a .. :try_end_a} :catchall_1
a=0;// 
a=0;//     :cond_a
a=0;//     :goto_5
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     :try_start_b
a=0;//     invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V
a=0;//     :try_end_b
a=0;//     .catch Ljava/lang/Throwable; {:try_start_b .. :try_end_b} :catch_2
a=0;//     .catchall {:try_start_b .. :try_end_b} :catchall_1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catchall_0
a=0;//     #v2=(Null);v3=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v4, v3
a=0;// 
a=0;//     :goto_6
a=0;//     #v2=(Conflicted);v3=(Reference,Ljava/io/BufferedWriter;);v4=(Reference,Ljava/io/FileWriter;);
a=0;//     if-eqz v4, :cond_b
a=0;// 
a=0;//     :try_start_c
a=0;//     invoke-virtual {v4}, Ljava/io/FileWriter;->close()V
a=0;//     :try_end_c
a=0;//     .catch Ljava/lang/Throwable; {:try_start_c .. :try_end_c} :catch_8
a=0;//     .catchall {:try_start_c .. :try_end_c} :catchall_1
a=0;// 
a=0;//     :cond_b
a=0;//     :goto_7
a=0;//     if-eqz v3, :cond_c
a=0;// 
a=0;//     :try_start_d
a=0;//     invoke-virtual {v3}, Ljava/io/BufferedWriter;->close()V
a=0;//     :try_end_d
a=0;//     .catch Ljava/lang/Throwable; {:try_start_d .. :try_end_d} :catch_9
a=0;//     .catchall {:try_start_d .. :try_end_d} :catchall_1
a=0;// 
a=0;//     :cond_c
a=0;//     :goto_8
a=0;//     :try_start_e
a=0;//     throw v0
a=0;//     :try_end_e
a=0;//     .catch Ljava/lang/Throwable; {:try_start_e .. :try_end_e} :catch_3
a=0;//     .catchall {:try_start_e .. :try_end_e} :catchall_1
a=0;// 
a=0;//     :catch_3
a=0;//     #v0=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_4
a=0;//     #v0=(One);v2=(Reference,Ljava/io/BufferedWriter;);v3=(Null);v4=(Reference,Ljava/io/FileWriter;);v6=(Reference,Ljava/lang/String;);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_5
a=0;//     #v0=(Reference,Ljava/io/File;);v1=(Null);v2=(Null);v4=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_6
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_7
a=0;//     #v2=(Conflicted);v3=(Reference,Ljava/io/FileWriter;);v4=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_8
a=0;//     #v2=(Conflicted);v4=(Reference,Ljava/io/FileWriter;);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_7
a=0;// 
a=0;//     :catch_9
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_8
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/Throwable;);v2=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v5
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :catchall_2
a=0;//     #v1=(Null);v3=(Null);v4=(Reference,Ljava/io/FileWriter;);v6=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     :catchall_3
a=0;//     #v2=(Reference,Ljava/io/BufferedWriter;);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v3, v2
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/BufferedWriter;);
a=0;//     goto :goto_6
a=0;// 
a=0;//     :catch_a
a=0;//     #v2=(Conflicted);v3=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v3, v4
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/FileWriter;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_b
a=0;//     #v0=(Reference,Ljava/io/File;);v2=(Reference,Ljava/io/BufferedWriter;);v3=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v0, v2
a=0;// 
a=0;//     move-object v3, v4
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/FileWriter;);
a=0;//     goto :goto_4
a=0;// .end method
a=0;// 
a=0;// .method public static b()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->i:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const-class v0, Landroid/os/Build;
a=0;// 
a=0;//     const-string v1, "MANUFACTURER"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-class v1, Landroid/os/Build;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/b/h/e;->i:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->i:Ljava/lang/String;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;
a=0;// 
a=0;//     :goto_1
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->i:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static b(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/h/e;->n(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/b/h/e;->a:Ljava/lang/String;
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->a:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-string v0, "i42d45df023jnkdd93la483f9xGFKXI"
a=0;// 
a=0;//     sget-object v1, Lnet/slidingmenu/tools/b/b/h/e;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "pY32nlkjdf0xik2ljso0d9fi21LOI23"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0, v1, v2}, Lnet/slidingmenu/tools/b/b/h/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->a:Ljava/lang/String;
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static c()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "android "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static c(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "i42d45df023jnkdd93la483f9xGFKXI"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "pY32nlkjdf0xik2ljso0d9fi21LOI23"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0, v1}, Lnet/slidingmenu/tools/b/b/h/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/b/h/e;->b:Ljava/lang/String;
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->b:Ljava/lang/String;
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_2
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static d()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static d(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/h/g;->a(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/b/h/e;->c:Ljava/lang/String;
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->c:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-string v0, "s92TjjdfoP2n3o9dfji2l9s1olkjf0p"
a=0;// 
a=0;//     sget-object v1, Lnet/slidingmenu/tools/b/b/h/e;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "pY32nlkjdf0xik2ljso0d9fi21LOI23"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0, v1, v2}, Lnet/slidingmenu/tools/b/b/h/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->c:Ljava/lang/String;
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static e()I
a=0;//     .locals 1
a=0;// 
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static e(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->d:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "s92TjjdfoP2n3o9dfji2l9s1olkjf0p"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "pY32nlkjdf0xik2ljso0d9fi21LOI23"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0, v1}, Lnet/slidingmenu/tools/b/b/h/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/b/h/e;->d:Ljava/lang/String;
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->d:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->d:Ljava/lang/String;
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_2
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static f(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->e:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "m929bb76e8110d1a70260af57b446ebc"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "pY32nlkjdf0xik2ljso0d9fi21LOI23"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0, v1}, Lnet/slidingmenu/tools/b/b/h/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/b/h/e;->e:Ljava/lang/String;
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->e:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/h/e;->o(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/b/h/e;->e:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "m929bb76e8110d1a70260af57b446ebc"
a=0;// 
a=0;//     sget-object v1, Lnet/slidingmenu/tools/b/b/h/e;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "pY32nlkjdf0xik2ljso0d9fi21LOI23"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0, v1, v2}, Lnet/slidingmenu/tools/b/b/h/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->e:Ljava/lang/String;
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_4
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static g(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/o;->c(Landroid/content/Context;)Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/net/wifi/WifiManager;);
a=0;//     invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getBSSID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/b/h/e;->f:Ljava/lang/String;
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->f:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->f:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static h(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->j:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/h/e;->p(Landroid/content/Context;)V
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->j:Ljava/lang/String;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->j:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static i(Landroid/content/Context;)I
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/o;->b(Landroid/content/Context;)Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/telephony/TelephonyManager;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getPhoneType()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static j(Landroid/content/Context;)I
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/o;->b(Landroid/content/Context;)Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/telephony/TelephonyManager;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkType()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static k(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->k:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/b/b/e;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/h/e;->l(Landroid/content/Context;)V
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->k:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/b/b/e;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->k:Ljava/lang/String;
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static l(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/b/h/e;->k:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/b/b/e;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v1, Lnet/slidingmenu/tools/b/b/h/f;
a=0;// 
a=0;//     #v1=(UninitRef,Lnet/slidingmenu/tools/b/b/h/f;);
a=0;//     invoke-direct {v1, p0}, Lnet/slidingmenu/tools/b/b/h/f;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/b/b/h/f;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static m(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/ContentResolver;);
a=0;//     const-string v1, "android_id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static n(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     :try_start_0
a=0;//     #v4=(Byte);
a=0;//     const-string v0, "phone"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, " "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-le v2, v4, :cond_0
a=0;// 
a=0;//     const-string v2, " "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     const-string v2, "-"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-le v2, v4, :cond_1
a=0;// 
a=0;//     const-string v2, "-"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     const-string v2, "\n"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-le v2, v4, :cond_2
a=0;// 
a=0;//     const-string v2, "\n"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     const-string v2, "MEID:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-le v3, v4, :cond_3
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0xa
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ge v2, v3, :cond_4
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :cond_4
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Null);v2=(Uninit);v3=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Null);v2=(Uninit);v3=(Uninit);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static o(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/k;->g(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/o;->c(Landroid/content/Context;)Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/net/wifi/WifiManager;);
a=0;//     invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ":"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     :cond_0
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static p(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/o;->b(Landroid/content/Context;)Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/telephony/TelephonyManager;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/b/h/e;->j:Ljava/lang/String;
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/b/h/e;->j:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
}}
