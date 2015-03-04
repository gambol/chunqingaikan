package net.slidingmenu.tools.os; class d { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/os/d;
a=0;// .super Lnet/slidingmenu/tools/os/slidingbvxc;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/os/slidingbvxc;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/os/d;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected sliflsd(Landroid/content/Context;Lnet/slidingmenu/tools/os/slidingbgxc;)V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected slifxsd(Landroid/content/Context;)V
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-static {p1}, Lnet/slidingmenu/tools/b/b/k/o;->f(Landroid/content/Context;)Landroid/app/ActivityManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ActivityManager;);
a=0;//     const v2, 0x7fffffff
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/app/ActivityManager;->getRunningTasks(I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/List;);
a=0;//     move v2, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v2, v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/app/ActivityManager$RunningTaskInfo;
a=0;// 
a=0;//     iget-object v4, v0, Landroid/app/ActivityManager$RunningTaskInfo;->baseActivity:Landroid/content/ComponentName;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/ComponentName;);
a=0;//     iget-object v0, v0, Landroid/app/ActivityManager$RunningTaskInfo;->topActivity:Landroid/content/ComponentName;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {p1}, Lnet/slidingmenu/tools/os/slidingboxc;->getInstance(Landroid/content/Context;)Lnet/slidingmenu/tools/os/slidingboxc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/os/slidingboxc;);
a=0;//     const/high16 v1, 0x30020000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lnet/slidingmenu/tools/os/slidingboxc;->a(II)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Null);v2=(Integer);v3=(Reference,Ljava/util/List;);v4=(Reference,Ljava/lang/String;);
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Null);v2=(Integer);v3=(Reference,Ljava/util/List;);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
}}
