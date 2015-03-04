package net.slidingmenu.tools.os; class slidingboxc { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/os/slidingboxc;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final STYLE_SPOT_CENTER:I = 0x0
a=0;// 
a=0;// .field public static final STYLE_SPOT_TOP_DOWN_REVERSE:I = 0x1
a=0;// 
a=0;// .field private static c:Lnet/slidingmenu/tools/os/slidingboxc;
a=0;// 
a=0;// .field private static d:Z
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Lnet/slidingmenu/tools/os/d;
a=0;// 
a=0;// .field private b:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Lnet/slidingmenu/tools/os/slidingboxc;->d:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/os/slidingboxc;);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/os/slidingboxc;->b:Landroid/content/Context;
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/os/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/os/d;);
a=0;//     invoke-direct {v0}, Lnet/slidingmenu/tools/os/d;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/os/d;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/os/slidingboxc;->a:Lnet/slidingmenu/tools/os/d;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lnet/slidingmenu/tools/os/slidingboxc;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/os/slidingboxc;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a()V
a=0;//     .locals 3
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/os/slidingboxc;->a:Lnet/slidingmenu/tools/os/d;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/os/d;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/os/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/os/d;);
a=0;//     invoke-direct {v0}, Lnet/slidingmenu/tools/os/d;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/os/d;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/os/slidingboxc;->a:Lnet/slidingmenu/tools/os/d;
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/os/slidingboxc;->a:Lnet/slidingmenu/tools/os/d;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Landroid/content/IntentFilter;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/IntentFilter;);
a=0;//     invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/IntentFilter;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/os/slidingboxc;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/os/slidingbvxc;->slidrsd(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/os/slidingboxc;->b:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/os/slidingboxc;->a:Lnet/slidingmenu/tools/os/d;
a=0;// 
a=0;//     #v2=(Reference,Lnet/slidingmenu/tools/os/d;);
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Z)Z
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/os/slidingboxc;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v3, p0, Lnet/slidingmenu/tools/os/slidingboxc;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v3}, Lnet/slidingmenu/tools/os/slidingbvxc;->slidqsd(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager;);v2=(One);v3=(Reference,Ljava/lang/String;);v4=(Uninit);v5=(Uninit);
a=0;//     new-instance v4, Landroid/content/Intent;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v4, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Intent;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v4, v3}, Landroid/content/pm/PackageManager;->queryBroadcastReceivers(Landroid/content/Intent;I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     move v3, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v3=(Integer);v5=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v3, v0, :cond_7
a=0;// 
a=0;//     invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v5, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/pm/ActivityInfo;);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     :try_start_1
a=0;//     iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-class v5, Lnet/slidingmenu/tools/os/slidingbvxc;
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-class v5, Lnet/slidingmenu/tools/os/d;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v5=(Conflicted);
a=0;//     add-int/lit8 v0, v3, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v3, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v5=(Reference,Ljava/lang/String;);
a=0;//     move v0, v2
a=0;// 
a=0;//     :goto_3
a=0;//     #v5=(Conflicted);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     if-eqz p1, :cond_5
a=0;// 
a=0;//     :try_start_2
a=0;//     const-string v0, "Check Ad Componet Failure , There Is Not Class Found Which Extends %s"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-class v4, Lnet/slidingmenu/tools/os/slidingbvxc;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-static {v0, v2}, Lnet/slidingmenu/tools/b/c/b/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz p1, :cond_6
a=0;// 
a=0;//     :try_start_3
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/c/b/a;->a(Ljava/lang/Throwable;)V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     :cond_6
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     throw v0
a=0;// 
a=0;//     :catch_1
a=0;//     #v2=(One);v3=(Integer);v4=(Reference,Ljava/util/List;);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method private b()V
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/os/slidingboxc;->a:Lnet/slidingmenu/tools/os/d;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/os/d;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/os/slidingboxc;->b:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/os/slidingboxc;->a:Lnet/slidingmenu/tools/os/d;
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/os/d;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/os/slidingboxc;->a:Lnet/slidingmenu/tools/os/d;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized getInstance(Landroid/content/Context;)Lnet/slidingmenu/tools/os/slidingboxc;
a=0;//     .locals 3
a=0;// 
a=0;//     const-class v1, Lnet/slidingmenu/tools/os/slidingboxc;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/lang/NullPointerException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/NullPointerException;);
a=0;//     const-string v2, "Context must not be null"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/NullPointerException;);
a=0;//     throw v0
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     sget-object v0, Lnet/slidingmenu/tools/os/slidingboxc;->c:Lnet/slidingmenu/tools/os/slidingboxc;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/os/slidingboxc;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/os/slidingboxc;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/os/slidingboxc;);
a=0;//     invoke-direct {v0, p0}, Lnet/slidingmenu/tools/os/slidingboxc;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/os/slidingboxc;);
a=0;//     sput-object v0, Lnet/slidingmenu/tools/os/slidingboxc;->c:Lnet/slidingmenu/tools/os/slidingboxc;
a=0;// 
a=0;//     :cond_1
a=0;//     sget-object v0, Lnet/slidingmenu/tools/os/slidingboxc;->c:Lnet/slidingmenu/tools/os/slidingboxc;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static slifcsd()Z
a=0;//     .locals 1
a=0;// 
a=0;//     sget-boolean v0, Lnet/slidingmenu/tools/os/slidingboxc;->d:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static sligpsd(Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     sput-boolean p0, Lnet/slidingmenu/tools/os/slidingboxc;->d:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method a(II)Landroid/content/Intent;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/os/slidingboxc;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0, p1, p2}, Lnet/slidingmenu/tools/os/e/a;->a(Landroid/content/Context;II)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public slidpsd()Z
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/os/slidingboxc;->slidpsd(Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public slidpsd(Z)Z
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/os/slidingboxc;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/os/a/a;->a(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(One);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lnet/slidingmenu/tools/os/slidingboxc;->a(Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public sliefsd()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/os/slidingboxc;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/c/c/a;->c(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public slieqsd(I)Landroid/content/Intent;
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, v0}, Lnet/slidingmenu/tools/os/slidingboxc;->a(II)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public slifgsd()V
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/os/slidingboxc;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/os/d/b/h;->b(Landroid/content/Context;)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Lnet/slidingmenu/tools/os/slidingboxc;->a(Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/os/slidingboxc;->b()V
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/listener/a;->a()Lnet/slidingmenu/tools/listener/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/listener/a;);
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/listener/a;->d()V
a=0;// 
a=0;//     sget-boolean v0, Lnet/slidingmenu/tools/os/f/a;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/a/i/a/b/g;->a()Lnet/slidingmenu/tools/b/a/i/a/b/g;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/i/a/b/g;);
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/a/i/a/b/g;->f()V
a=0;// 
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/a/j/a/b;->a()Lnet/slidingmenu/tools/b/a/j/a/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/a/j/a/b;->b()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/c/b/a;->a(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public slifhsd()V
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-boolean v0, Lnet/slidingmenu/tools/os/f/a;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/os/slidingboxc;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/os/f/b;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/os/slidingboxc;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/os/d/b/h;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Lnet/slidingmenu/tools/os/slidingboxc;->a(Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/os/slidingboxc;->a()V
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/os/slidingboxc;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/b/i/k;->b(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x64
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/os/slidingboxc;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/b/i/k;->b(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x67
a=0;// 
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     :cond_3
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/os/slidingboxc;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/os/d/c/a;->a(Landroid/content/Context;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/c/b/a;->a(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public sligfsd(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/os/g;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/os/g;);
a=0;//     invoke-direct {v0, p0, p1}, Lnet/slidingmenu/tools/os/g;-><init>(Lnet/slidingmenu/tools/os/slidingboxc;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/os/g;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/c/a;->a(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public sligqsd()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/os/slidingboxc;->sligqsd(Lnet/slidingmenu/tools/listener/slidingbkxc;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public sligqsd(Lnet/slidingmenu/tools/listener/slidingbkxc;)V
a=0;//     .locals 3
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-boolean v0, Lnet/slidingmenu/tools/os/f/a;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/os/slidingboxc;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/os/f/b;->b(Landroid/content/Context;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x9
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-le v1, v2, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     add-int/lit8 v1, v1, -0x9
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     const/high16 v1, 0x10000000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1, v0}, Lnet/slidingmenu/tools/os/slidingboxc;->a(II)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/listener/a;->a()Lnet/slidingmenu/tools/listener/a;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lnet/slidingmenu/tools/listener/a;);
a=0;//     invoke-virtual {v2, v0, p1}, Lnet/slidingmenu/tools/listener/a;->a(ILnet/slidingmenu/tools/listener/slidingbkxc;)V
a=0;// 
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/os/slidingboxc;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/os/slidingboxc;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/os/d/b/h;->a(Landroid/content/Context;)V
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
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/c/b/a;->a(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public sligqsdDialog(Landroid/app/Activity;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, v0}, Lnet/slidingmenu/tools/os/slidingboxc;->sligqsdDialog(Landroid/app/Activity;Lnet/slidingmenu/tools/os/slidingbqxc;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public sligqsdDialog(Landroid/app/Activity;DD)V
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/os/slidingboxc;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     move-wide v2, p2
a=0;// 
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     move-wide v4, p4
a=0;// 
a=0;//     #v4=(DoubleLo);v5=(DoubleHi);
a=0;//     invoke-virtual/range {v0 .. v6}, Lnet/slidingmenu/tools/os/slidingboxc;->sligqsdDialog(Landroid/app/Activity;DDLnet/slidingmenu/tools/os/slidingbqxc;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public sligqsdDialog(Landroid/app/Activity;DDLnet/slidingmenu/tools/os/slidingbqxc;)V
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static/range {p1 .. p6}, Lnet/slidingmenu/tools/os/e/a;->a(Landroid/content/Context;DDLnet/slidingmenu/tools/os/slidingbqxc;)Z
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/os/slidingboxc;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/os/d/b/h;->a(Landroid/content/Context;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/c/b/a;->a(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public sligqsdDialog(Landroid/app/Activity;II)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, p2, p3, v0}, Lnet/slidingmenu/tools/os/slidingboxc;->sligqsdDialog(Landroid/app/Activity;IILnet/slidingmenu/tools/os/slidingbqxc;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public sligqsdDialog(Landroid/app/Activity;IILnet/slidingmenu/tools/os/slidingbqxc;)V
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {p1, p2, p3, p4}, Lnet/slidingmenu/tools/os/e/a;->a(Landroid/content/Context;IILnet/slidingmenu/tools/os/slidingbqxc;)Z
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/os/slidingboxc;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/os/d/b/h;->a(Landroid/content/Context;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/c/b/a;->a(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public sligqsdDialog(Landroid/app/Activity;Lnet/slidingmenu/tools/os/slidingbqxc;)V
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {p1, p2}, Lnet/slidingmenu/tools/os/e/a;->a(Landroid/content/Context;Lnet/slidingmenu/tools/os/slidingbqxc;)Z
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/os/slidingboxc;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/os/d/b/h;->a(Landroid/content/Context;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/c/b/a;->a(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
