package net.slidingmenu.tools.os.d.b; class f { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/os/d/b/f;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(Landroid/content/Context;Lnet/slidingmenu/tools/os/slidingbfxc;)V
a=0;//     .locals 4
a=0;// 
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/os/slidingbuxc;->sliezsd()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0}, Lnet/slidingmenu/tools/b/b/k/j;->b(Landroid/content/Context;Ljava/lang/String;)Lnet/slidingmenu/tools/b/b/k/a;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/b/b/k/a;);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/o;->f(Landroid/content/Context;)Landroid/app/ActivityManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const v2, 0x7fffffff
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/app/ActivityManager;->getRunningTasks(I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
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
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-static {p0, p1, v1}, Lnet/slidingmenu/tools/os/d/b/f;->b(Landroid/content/Context;Lnet/slidingmenu/tools/os/slidingbfxc;Lnet/slidingmenu/tools/b/b/k/a;)V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/b/k/a;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/os/slidingbuxc;->slieysd()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {p0, v0}, Lnet/slidingmenu/tools/b/b/k/j;->b(Landroid/content/Context;Ljava/lang/String;)Lnet/slidingmenu/tools/b/b/k/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_3
a=0;//     invoke-static {p0, p1, v0}, Lnet/slidingmenu/tools/os/d/b/f;->a(Landroid/content/Context;Lnet/slidingmenu/tools/os/slidingbfxc;Lnet/slidingmenu/tools/b/b/k/a;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(Reference,Lnet/slidingmenu/tools/b/b/k/a;);v2=(Reference,Ljava/lang/String;);v3=(Uninit);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/a/g/g/b;->a(Landroid/content/Context;)Lnet/slidingmenu/tools/b/a/g/g/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/g/g/b;);
a=0;//     new-instance v2, Lnet/slidingmenu/tools/b/a/g/g/c;
a=0;// 
a=0;//     #v2=(UninitRef,Lnet/slidingmenu/tools/b/a/g/g/c;);
a=0;//     invoke-direct {v2}, Lnet/slidingmenu/tools/b/a/g/g/c;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lnet/slidingmenu/tools/b/a/g/g/c;);
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/os/slidingbfxc;->getOrderID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Lnet/slidingmenu/tools/b/a/g/g/c;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/os/slidingbfxc;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lnet/slidingmenu/tools/b/a/g/g/c;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lnet/slidingmenu/tools/b/a/g/g/b;->a(Lnet/slidingmenu/tools/b/a/g/g/c;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static a(Landroid/content/Context;Lnet/slidingmenu/tools/os/slidingbfxc;Lnet/slidingmenu/tools/b/b/k/a;)V
a=0;//     .locals 7
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/os/slidingbfxc;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/os/slidingbfxc;->getOrderID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/o;->a(Landroid/content/Context;)Landroid/app/NotificationManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/NotificationManager;);
a=0;//     new-instance v3, Landroid/app/Notification;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/app/Notification;);
a=0;//     invoke-direct {v3}, Landroid/app/Notification;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Notification;);
a=0;//     const/16 v4, 0x10
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     iput v4, v3, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     invoke-virtual {p2}, Lnet/slidingmenu/tools/b/b/k/a;->c()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, v3, Landroid/app/Notification;->icon:I
a=0;// 
a=0;//     new-instance v4, Landroid/content/Intent;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/os/slidingbvxc;->slidrsd(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v5, 0x8000000
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {p0, v0, v4, v5}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p2}, Lnet/slidingmenu/tools/b/b/k/a;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/a/h/a;->A()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v3, p0, v5, v1, v4}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     invoke-virtual {v2, v0, v3}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Ljava/lang/String;);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     new-instance v0, Ljava/util/Random;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Random;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-direct {v0, v2, v3}, Ljava/util/Random;-><init>(J)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Random;);
a=0;//     invoke-virtual {v0}, Ljava/util/Random;->nextInt()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static b(Landroid/content/Context;Lnet/slidingmenu/tools/os/slidingbfxc;Lnet/slidingmenu/tools/b/b/k/a;)V
a=0;//     .locals 6
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/os/slidingbfxc;->getMessage()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Reference,Ljava/lang/String;);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/f;->a(Landroid/content/Context;)Lnet/slidingmenu/tools/b/b/k/f;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lnet/slidingmenu/tools/b/b/k/f;);
a=0;//     invoke-virtual {v2}, Lnet/slidingmenu/tools/b/b/k/f;->b()I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-double v2, v0
a=0;// 
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     const-wide v4, 0x3fe999999999999aL    # 0.8
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     mul-double/2addr v2, v4
a=0;// 
a=0;//     double-to-int v0, v2
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     new-instance v2, Lnet/slidingmenu/tools/os/d/b/g;
a=0;// 
a=0;//     #v2=(UninitRef,Lnet/slidingmenu/tools/os/d/b/g;);
a=0;//     const/16 v3, 0xdac
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-direct {v2, p0, v1, v3, v0}, Lnet/slidingmenu/tools/os/d/b/g;-><init>(Landroid/content/Context;Ljava/lang/String;II)V
a=0;// 
a=0;//     #v2=(Reference,Lnet/slidingmenu/tools/os/d/b/g;);
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/b/k/m;->a()Lnet/slidingmenu/tools/b/b/k/m;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/b/k/m;);
a=0;//     invoke-virtual {v0, v2}, Lnet/slidingmenu/tools/b/b/k/m;->a(Ljava/lang/Runnable;)Z
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Null);v1=(Reference,Ljava/lang/String;);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_1
a=0;// .end method
}}
