package net.slidingmenu.tools.b.a.g.e; class g { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/a/g/e/g;
a=0;// .super Landroid/content/BroadcastReceiver;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Lnet/slidingmenu/tools/b/a/g/e/g;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private b:Landroid/content/IntentFilter;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/a/g/e/g;);
a=0;//     new-instance v0, Landroid/content/IntentFilter;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/IntentFilter;);
a=0;//     invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/IntentFilter;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/g/e/g;->b:Landroid/content/IntentFilter;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/e/g;->b:Landroid/content/IntentFilter;
a=0;// 
a=0;//     const-string v1, "android.intent.action.PACKAGE_REMOVED"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/e/g;->b:Landroid/content/IntentFilter;
a=0;// 
a=0;//     const-string v1, "android.intent.action.PACKAGE_ADDED"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/e/g;->b:Landroid/content/IntentFilter;
a=0;// 
a=0;//     const-string v1, "android.intent.action.PACKAGE_REPLACED"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/e/g;->b:Landroid/content/IntentFilter;
a=0;// 
a=0;//     const-string v1, "package"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized a(Landroid/content/Context;)V
a=0;//     .locals 3
a=0;// 
a=0;//     const-class v1, Lnet/slidingmenu/tools/b/a/g/e/g;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/a/g/e/g;->a:Lnet/slidingmenu/tools/b/a/g/e/g;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/g/e/g;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v2=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v2, Lnet/slidingmenu/tools/b/a/g/e/g;
a=0;// 
a=0;//     #v2=(UninitRef,Lnet/slidingmenu/tools/b/a/g/e/g;);
a=0;//     invoke-direct {v2}, Lnet/slidingmenu/tools/b/a/g/e/g;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lnet/slidingmenu/tools/b/a/g/e/g;);
a=0;//     sput-object v2, Lnet/slidingmenu/tools/b/a/g/e/g;->a:Lnet/slidingmenu/tools/b/a/g/e/g;
a=0;// 
a=0;//     sget-object v2, Lnet/slidingmenu/tools/b/a/g/e/g;->a:Lnet/slidingmenu/tools/b/a/g/e/g;
a=0;// 
a=0;//     invoke-direct {v2, v0}, Lnet/slidingmenu/tools/b/a/g/e/g;->b(Landroid/content/Context;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
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
a=0;// 
a=0;// .method private b(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/g/e/g;->b:Landroid/content/IntentFilter;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/IntentFilter;);
a=0;//     invoke-virtual {v0, p0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
a=0;//     .locals 3
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/net/Uri;);
a=0;//     invoke-virtual {v1}, Landroid/net/Uri;->getSchemeSpecificPart()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "android.intent.action.PACKAGE_REMOVED"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {p1, v1}, Lnet/slidingmenu/tools/b/b/k/j;->a(Landroid/content/Context;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {p1, v1}, Lnet/slidingmenu/tools/b/a/g/e/c;->a(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {p1}, Lnet/slidingmenu/tools/b/a/g/e/a/b;->a(Landroid/content/Context;)Lnet/slidingmenu/tools/b/a/g/e/a/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/g/e/a/b;);
a=0;//     invoke-virtual {v0, v1}, Lnet/slidingmenu/tools/b/a/g/e/a/b;->a(Ljava/lang/String;)V
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
