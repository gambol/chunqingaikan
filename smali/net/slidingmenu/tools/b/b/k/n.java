package net.slidingmenu.tools.b.b.k; class n { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/b/k/n;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a()Z
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "mounted"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const-string v1, "mounted_ro"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "mounted"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/k;->a(Landroid/content/Context;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;J)Z
a=0;//     .locals 4
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/n;->a(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Landroid/os/StatFs;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/StatFs;);
a=0;//     invoke-direct {v1, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/StatFs;);
a=0;//     invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSize()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v2, v0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v1}, Landroid/os/StatFs;->getAvailableBlocks()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     mul-long/2addr v0, v2
a=0;// 
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     cmp-long v2, v0, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gez v2, :cond_0
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     :cond_0
a=0;//     cmp-long v0, v0, p1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ltz v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static b()J
a=0;//     .locals 6
a=0;// 
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Landroid/os/StatFs;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/StatFs;);
a=0;//     invoke-direct {v1, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/StatFs;);
a=0;//     invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSize()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v4, v0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual {v1}, Landroid/os/StatFs;->getBlockCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     mul-long/2addr v0, v4
a=0;// 
a=0;//     cmp-long v4, v0, v2
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-gez v4, :cond_0
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     return-wide v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-wide v0, v2
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static b(Landroid/content/Context;)J
a=0;//     .locals 6
a=0;// 
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/n;->a(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Landroid/os/StatFs;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/StatFs;);
a=0;//     invoke-direct {v1, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/StatFs;);
a=0;//     invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSize()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v4, v0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual {v1}, Landroid/os/StatFs;->getAvailableBlocks()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     mul-long/2addr v0, v4
a=0;// 
a=0;//     cmp-long v4, v0, v2
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-gez v4, :cond_0
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     return-wide v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :cond_1
a=0;//     move-wide v0, v2
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static c()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
