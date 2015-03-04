package net.slidingmenu.tools.b.a.g.c; class h { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/a/g/c/h;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Lnet/slidingmenu/tools/slidingahxc;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static declared-synchronized a(Landroid/content/Context;)V
a=0;//     .locals 5
a=0;// 
a=0;//     const-class v1, Lnet/slidingmenu/tools/b/a/g/c/h;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-class v2, Lnet/slidingmenu/tools/slidingahxc;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0, v2}, Lnet/slidingmenu/tools/b/b/k/c;->c(Landroid/content/Context;Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     sget-object v2, Lnet/slidingmenu/tools/b/a/g/c/h;->a:Lnet/slidingmenu/tools/slidingahxc;
a=0;// 
a=0;//     #v2=(Reference,Lnet/slidingmenu/tools/slidingahxc;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     new-instance v2, Lnet/slidingmenu/tools/slidingahxc;
a=0;// 
a=0;//     #v2=(UninitRef,Lnet/slidingmenu/tools/slidingahxc;);
a=0;//     invoke-direct {v2}, Lnet/slidingmenu/tools/slidingahxc;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lnet/slidingmenu/tools/slidingahxc;);
a=0;//     new-instance v3, Landroid/content/IntentFilter;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/content/IntentFilter;);
a=0;//     const-string v4, "android.intent.action.PACKAGE_ADDED"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/IntentFilter;);
a=0;//     const-string v4, "package"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
a=0;// 
a=0;//     sput-object v2, Lnet/slidingmenu/tools/b/a/g/c/h;->a:Lnet/slidingmenu/tools/slidingahxc;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
