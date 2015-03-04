package com.twocloooo; class s { void a() { int a;
a=0;// .class Lcom/twocloooo/s;
a=0;// .super Ljava/util/TimerTask;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:J
a=0;// 
a=0;// .field final synthetic b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloooo/DevNativeService;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloooo/s;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {}, Lcom/twocloooo/DevNativeService;->e()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-wide v3, p0, Lcom/twocloooo/s;->a:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     sub-long/2addr v0, v3
a=0;// 
a=0;//     const-wide/32 v3, 0xea60
a=0;// 
a=0;//     cmp-long v0, v0, v3
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloooo/DevNativeService;->a(Z)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->a(Lcom/twocloooo/DevNativeService;)Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloooo/DevNativeService;->e()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     iget-object v0, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->a(Lcom/twocloooo/DevNativeService;)Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/LinkedList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v1, v0, :cond_4
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     const-string v1, "activity"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloooo/DevNativeService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/ActivityManager;
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Landroid/app/ActivityManager;->getRunningTasks(I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/ActivityManager$RunningTaskInfo;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/app/ActivityManager$RunningTaskInfo;->topActivity:Landroid/content/ComponentName;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->d(Lcom/twocloooo/DevNativeService;)Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     move v3, v2
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Integer);v3=(Integer);
a=0;//     iget-object v0, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->d(Lcom/twocloooo/DevNativeService;)Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/LinkedList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v3, v0, :cond_6
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/DevNativeService;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "android.permission.SYSTEM_ALERT_WINDOW"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-virtual {v3}, Lcom/twocloooo/DevNativeService;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v2, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->i(Lcom/twocloooo/DevNativeService;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->j(Lcom/twocloooo/DevNativeService;)V
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Integer);v1=(Integer);v3=(Conflicted);v5=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->a(Lcom/twocloooo/DevNativeService;)Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/twocloooo/au;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/au;->i()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "0"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     iput-wide v3, p0, Lcom/twocloooo/s;->a:J
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloooo/be;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v0, "/download"
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v0, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->a(Lcom/twocloooo/DevNativeService;)Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/twocloooo/au;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/au;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v0, ".apk"
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v3, v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v6}, Lcom/twocloooo/DevNativeService;->a(Z)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->a(Lcom/twocloooo/DevNativeService;)Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/twocloooo/au;
a=0;// 
a=0;//     sget-object v4, Lcom/twocloooo/bb;->I:Ljava/lang/String;
a=0;// 
a=0;//     const-string v5, "1"
a=0;// 
a=0;//     invoke-virtual {v0, v4, v5}, Lcom/twocloooo/au;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/DevNativeService;->a()V
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->a(Lcom/twocloooo/DevNativeService;)Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/twocloooo/au;
a=0;// 
a=0;//     invoke-static {v4, v3, v0}, Lcom/twocloooo/DevNativeService;->a(Lcom/twocloooo/DevNativeService;Ljava/io/File;Lcom/twocloooo/au;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v4=(Conflicted);v5=(Uninit);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v1=(Reference,Ljava/lang/String;);v3=(Integer);v5=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->d(Lcom/twocloooo/DevNativeService;)Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/twocloooo/au;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/au;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_15
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/au;->o()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_7
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/au;->n()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-gez v1, :cond_7
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-static {v1, v0}, Lcom/twocloooo/DevNativeService;->c(Lcom/twocloooo/DevNativeService;Lcom/twocloooo/au;)V
a=0;// 
a=0;//     :cond_7
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-static {v1}, Lcom/twocloooo/DevNativeService;->d(Lcom/twocloooo/DevNativeService;)Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lcom/twocloooo/au;
a=0;// 
a=0;//     sget-object v4, Lcom/twocloooo/bb;->J:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "1"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4, v5}, Lcom/twocloooo/au;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloooo/DevNativeService;->a(Z)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloooo/DevNativeService;->a()V
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/au;->m()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v6, :cond_c
a=0;// 
a=0;//     iget v1, v0, Lcom/twocloooo/au;->c:I
a=0;// 
a=0;//     if-nez v1, :cond_8
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/au;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v1, v4}, Lcom/twocloooo/bm;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v4, ""
a=0;// 
a=0;//     if-eq v1, v4, :cond_8
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/au;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v1, v4}, Lcom/twocloooo/bm;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lcom/twocloooo/au;->c:I
a=0;// 
a=0;//     :cond_8
a=0;//     #v1=(Conflicted);
a=0;//     iget v1, v0, Lcom/twocloooo/au;->c:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v4, v1, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, v0, Lcom/twocloooo/au;->c:I
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/au;->n()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     mul-int/lit8 v4, v4, 0x3c
a=0;// 
a=0;//     if-lt v1, v4, :cond_b
a=0;// 
a=0;//     iget v1, v0, Lcom/twocloooo/au;->a:I
a=0;// 
a=0;//     if-nez v1, :cond_9
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     iget-object v4, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-static {v1, v0, v4}, Lcom/twocloooo/DevNativeService;->a(Lcom/twocloooo/DevNativeService;Lcom/twocloooo/au;Landroid/content/Context;)V
a=0;// 
a=0;//     :cond_9
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     iget v1, v0, Lcom/twocloooo/au;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v6, :cond_a
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/au;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloooo/at;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_a
a=0;//     invoke-static {v2}, Lcom/twocloooo/DevNativeService;->a(Z)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->d(Lcom/twocloooo/DevNativeService;)Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/DevNativeService;->a()V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_b
a=0;//     #v4=(Integer);
a=0;//     iget v1, v0, Lcom/twocloooo/au;->c:I
a=0;// 
a=0;//     rem-int/lit8 v1, v1, 0x3c
a=0;// 
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/au;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget v0, v0, Lcom/twocloooo/au;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v3, v0}, Lcom/twocloooo/bm;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_c
a=0;//     #v1=(Integer);v3=(Integer);v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/au;->m()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-ne v1, v4, :cond_f
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/au;->q()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-gtz v1, :cond_f
a=0;// 
a=0;//     iget v1, v0, Lcom/twocloooo/au;->c:I
a=0;// 
a=0;//     add-int/lit8 v4, v1, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, v0, Lcom/twocloooo/au;->c:I
a=0;// 
a=0;//     const/16 v4, 0xa
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-lt v1, v4, :cond_2
a=0;// 
a=0;//     iget v1, v0, Lcom/twocloooo/au;->a:I
a=0;// 
a=0;//     if-nez v1, :cond_d
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     iget-object v4, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-static {v1, v0, v4}, Lcom/twocloooo/DevNativeService;->a(Lcom/twocloooo/DevNativeService;Lcom/twocloooo/au;Landroid/content/Context;)V
a=0;// 
a=0;//     :cond_d
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     iget v1, v0, Lcom/twocloooo/au;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v6, :cond_e
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/au;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloooo/at;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_e
a=0;//     invoke-static {v2}, Lcom/twocloooo/DevNativeService;->a(Z)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->d(Lcom/twocloooo/DevNativeService;)Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/DevNativeService;->a()V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_f
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/au;->m()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_12
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/au;->q()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-gtz v1, :cond_12
a=0;// 
a=0;//     iget v1, v0, Lcom/twocloooo/au;->c:I
a=0;// 
a=0;//     add-int/lit8 v4, v1, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, v0, Lcom/twocloooo/au;->c:I
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/au;->n()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     mul-int/lit8 v4, v4, 0x3c
a=0;// 
a=0;//     if-lt v1, v4, :cond_2
a=0;// 
a=0;//     iget v1, v0, Lcom/twocloooo/au;->a:I
a=0;// 
a=0;//     if-nez v1, :cond_10
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     iget-object v4, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-static {v1, v0, v4}, Lcom/twocloooo/DevNativeService;->a(Lcom/twocloooo/DevNativeService;Lcom/twocloooo/au;Landroid/content/Context;)V
a=0;// 
a=0;//     :cond_10
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     iget v1, v0, Lcom/twocloooo/au;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v6, :cond_11
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/au;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloooo/at;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_11
a=0;//     invoke-static {v2}, Lcom/twocloooo/DevNativeService;->a(Z)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->d(Lcom/twocloooo/DevNativeService;)Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/DevNativeService;->a()V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_12
a=0;//     #v4=(PosByte);
a=0;//     iget v1, v0, Lcom/twocloooo/au;->c:I
a=0;// 
a=0;//     add-int/lit8 v4, v1, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, v0, Lcom/twocloooo/au;->c:I
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/au;->l()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-lt v1, v4, :cond_2
a=0;// 
a=0;//     iget v1, v0, Lcom/twocloooo/au;->a:I
a=0;// 
a=0;//     if-nez v1, :cond_13
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     iget-object v4, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-static {v1, v0, v4}, Lcom/twocloooo/DevNativeService;->a(Lcom/twocloooo/DevNativeService;Lcom/twocloooo/au;Landroid/content/Context;)V
a=0;// 
a=0;//     :cond_13
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     iget v1, v0, Lcom/twocloooo/au;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v6, :cond_14
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/au;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloooo/at;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_14
a=0;//     invoke-static {v2}, Lcom/twocloooo/DevNativeService;->a(Z)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->d(Lcom/twocloooo/DevNativeService;)Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/s;->b:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/DevNativeService;->a()V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_15
a=0;//     #v1=(Reference,Ljava/lang/String;);v4=(Boolean);v5=(Conflicted);
a=0;//     add-int/lit8 v0, v3, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v3, v0
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// .end method
}}
