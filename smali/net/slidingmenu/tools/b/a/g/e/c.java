package net.slidingmenu.tools.b.a.g.e; class c { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/a/g/e/c;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static final a(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/b/a/g/e/f;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/b/a/g/e/f;);
a=0;//     invoke-direct {v0, p0}, Lnet/slidingmenu/tools/b/a/g/e/f;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/g/e/f;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/c/a;->a(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static final a(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/b/a/g/e/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/b/a/g/e/d;);
a=0;//     invoke-direct {v0, p0, p1}, Lnet/slidingmenu/tools/b/a/g/e/d;-><init>(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/g/e/d;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/c/a;->a(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static final a(Landroid/content/Context;Ljava/util/List;)V
a=0;//     .locals 3
a=0;// 
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ge v1, v0, :cond_1
a=0;// 
a=0;//     invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     if-eq v1, v0, :cond_0
a=0;// 
a=0;//     const-string v0, "|"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Lnet/slidingmenu/tools/b/a/g/e/e;
a=0;// 
a=0;//     #v1=(UninitRef,Lnet/slidingmenu/tools/b/a/g/e/e;);
a=0;//     invoke-direct {v1, p0, v0}, Lnet/slidingmenu/tools/b/a/g/e/e;-><init>(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/b/a/g/e/e;);
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/b/c/a;->a(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static final b(Landroid/content/Context;)V
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     new-instance v0, Landroid/text/format/Time;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/text/format/Time;);
a=0;//     invoke-direct {v0}, Landroid/text/format/Time;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/text/format/Time;);
a=0;//     invoke-virtual {v0}, Landroid/text/format/Time;->setToNow()V
a=0;// 
a=0;//     const-string v1, "%Y-%m-%d"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/text/format/Time;->format(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "x34knSd6OxP"
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v1, v3}, Lnet/slidingmenu/tools/b/b/c/f;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Boolean);v2=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     const-string v1, "x34knSd6OxP"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-wide/32 v3, 0x5265c00
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-static {p0, v1, v0, v3, v4}, Lnet/slidingmenu/tools/b/b/c/f;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_3
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/a/g/e/b;->a(Landroid/content/Context;)Lnet/slidingmenu/tools/b/a/g/e/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/a/g/e/b;->a()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Reference,Ujava/lang/Object;);
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     :try_start_1
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v0, v5}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v2=(Integer);v5=(Reference,Ljava/util/List;);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {v5}, Ljava/util/List;->size()I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v2, v0, :cond_4
a=0;// 
a=0;//     :try_start_2
a=0;//     invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     iget-object v6, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     iget-object v7, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/pm/ApplicationInfo;);
a=0;//     iget v7, v7, Landroid/content/pm/ApplicationInfo;->flags:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     and-int/lit8 v7, v7, 0x1
a=0;// 
a=0;//     if-nez v7, :cond_3
a=0;// 
a=0;//     invoke-interface {v1, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_3
a=0;// 
a=0;//     iget-object v0, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-interface {v5}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     if-eq v2, v0, :cond_2
a=0;// 
a=0;//     const-string v0, "|"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_4
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :cond_4
a=0;//     :try_start_3
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/b/b/e;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/b/a/g/e/h;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/b/a/g/e/h;);
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-direct {v0, p0, v1, v2}, Lnet/slidingmenu/tools/b/a/g/e/h;-><init>(Landroid/content/Context;Ljava/lang/String;I)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/g/e/h;);
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/a/g/e/h;->a()V
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v2=(Integer);
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/a/g/e/b;->a(Landroid/content/Context;)Lnet/slidingmenu/tools/b/a/g/e/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/g/e/b;);
a=0;//     invoke-virtual {v0, v3}, Lnet/slidingmenu/tools/b/a/g/e/b;->a(Ljava/util/List;)Z
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_1
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v5=(Reference,Ljava/util/List;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Null);v3=(Conflicted);v4=(Conflicted);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static c(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Lnet/slidingmenu/tools/b/a/g/e/j;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/b/a/g/e/j;);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/a/g/e/c;->d(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, p0, v1}, Lnet/slidingmenu/tools/b/a/g/e/j;-><init>(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/g/e/j;);
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/a/g/e/j;->a()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static d(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 9
a=0;// 
a=0;//     const/16 v1, 0x9
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     const-string v0, "activity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/ActivityManager;
a=0;// 
a=0;//     const/4 v5, 0x5
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v0, v5, v6}, Landroid/app/ActivityManager;->getRecentTasks(II)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/List;);
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v6, "android.intent.action.MAIN"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v6, "android.intent.category.HOME"
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v0, v4, v6}, Landroid/content/Intent;->resolveActivityInfo(Landroid/content/pm/PackageManager;I)Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/pm/ActivityInfo;);
a=0;//     invoke-interface {v5}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, v1, :cond_2
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Integer);v7=(Conflicted);v8=(Conflicted);
a=0;//     if-ge v2, v1, :cond_4
a=0;// 
a=0;//     invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/app/ActivityManager$RecentTaskInfo;
a=0;// 
a=0;//     new-instance v7, Landroid/content/Intent;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v8, v0, Landroid/app/ActivityManager$RecentTaskInfo;->baseIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v8=(Reference,Landroid/content/Intent;);
a=0;//     invoke-direct {v7, v8}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v8, v0, Landroid/app/ActivityManager$RecentTaskInfo;->origActivity:Landroid/content/ComponentName;
a=0;// 
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/app/ActivityManager$RecentTaskInfo;->origActivity:Landroid/content/ComponentName;
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;// 
a=0;//     :cond_0
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     iget-object v0, v6, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, v6, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v8=(Conflicted);
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(PosByte);v2=(Null);v7=(Uninit);v8=(Uninit);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v2=(Integer);v7=(Reference,Landroid/content/Intent;);v8=(Reference,Ujava/lang/Object;);
a=0;//     invoke-virtual {v7}, Landroid/content/Intent;->getFlags()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const v8, -0x200001
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     and-int/2addr v0, v8
a=0;// 
a=0;//     const/high16 v8, 0x10000000
a=0;// 
a=0;//     or-int/2addr v0, v8
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v4, v7, v0}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/ResolveInfo;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     add-int/lit8 v0, v1, -0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v2, v0, :cond_1
a=0;// 
a=0;//     const-string v0, "|"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :cond_4
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
}}
