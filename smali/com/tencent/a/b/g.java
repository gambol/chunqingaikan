package com.tencent.a.b; class g { void a() { int a;
a=0;// .class public final Lcom/tencent/a/b/g;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/tencent/a/b/g$c;,
a=0;//         Lcom/tencent/a/b/g$b;,
a=0;//         Lcom/tencent/a/b/g$a;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/content/Context;
a=0;// 
a=0;// .field private b:Landroid/net/wifi/WifiManager;
a=0;// 
a=0;// .field private c:Lcom/tencent/a/b/g$a;
a=0;// 
a=0;// .field private d:Landroid/os/Handler;
a=0;// 
a=0;// .field private e:Ljava/lang/Runnable;
a=0;// 
a=0;// .field private f:I
a=0;// 
a=0;// .field private g:Lcom/tencent/a/b/g$c;
a=0;// 
a=0;// .field private h:Lcom/tencent/a/b/g$b;
a=0;// 
a=0;// .field private i:Z
a=0;// 
a=0;// .field private j:[B
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/a/b/g;);
a=0;//     iput-object v1, p0, Lcom/tencent/a/b/g;->a:Landroid/content/Context;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/tencent/a/b/g;->b:Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/tencent/a/b/g;->c:Lcom/tencent/a/b/g$a;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/tencent/a/b/g;->d:Landroid/os/Handler;
a=0;// 
a=0;//     new-instance v0, Lcom/tencent/a/b/g$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/a/b/g$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/tencent/a/b/g$1;-><init>(Lcom/tencent/a/b/g;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/g$1;);
a=0;//     iput-object v0, p0, Lcom/tencent/a/b/g;->e:Ljava/lang/Runnable;
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lcom/tencent/a/b/g;->f:I
a=0;// 
a=0;//     iput-object v1, p0, Lcom/tencent/a/b/g;->g:Lcom/tencent/a/b/g$c;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/tencent/a/b/g;->h:Lcom/tencent/a/b/g$b;
a=0;// 
a=0;//     iput-boolean v2, p0, Lcom/tencent/a/b/g;->i:Z
a=0;// 
a=0;//     new-array v0, v2, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iput-object v0, p0, Lcom/tencent/a/b/g;->j:[B
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/a/b/g;Lcom/tencent/a/b/g$b;)Lcom/tencent/a/b/g$b;
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/tencent/a/b/g;->h:Lcom/tencent/a/b/g$b;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/a/b/g;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/g;->b:Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/net/wifi/WifiManager;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/g;->b:Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/g;->b:Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/net/wifi/WifiManager;);
a=0;//     invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->startScan()Z
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/tencent/a/b/g;)Lcom/tencent/a/b/g$c;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/g;->g:Lcom/tencent/a/b/g$c;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/g$c;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcom/tencent/a/b/g;)Landroid/net/wifi/WifiManager;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/g;->b:Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/net/wifi/WifiManager;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d(Lcom/tencent/a/b/g;)Lcom/tencent/a/b/g$b;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/g;->h:Lcom/tencent/a/b/g$b;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/g$b;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic e(Lcom/tencent/a/b/g;)I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lcom/tencent/a/b/g;->f:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()V
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/a/b/g;->j:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-boolean v0, p0, Lcom/tencent/a/b/g;->i:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/g;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/g;->c:Lcom/tencent/a/b/g$a;
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     goto :goto_0
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
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/g;->a:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/a/b/g;->c:Lcom/tencent/a/b/g$a;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/a/b/g$a;);
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/g;->d:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/a/b/g;->e:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/tencent/a/b/g;->i:Z
a=0;// 
a=0;//     monitor-exit v1
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final a(J)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/g;->d:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/tencent/a/b/g;->i:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/g;->d:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iget-object v1, p0, Lcom/tencent/a/b/g;->e:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/g;->d:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/a/b/g;->e:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a(Landroid/content/Context;Lcom/tencent/a/b/g$c;I)Z
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcom/tencent/a/b/g;->j:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-boolean v3, p0, Lcom/tencent/a/b/g;->i:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     monitor-exit v2
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);v1=(Null);v3=(Boolean);v4=(Uninit);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     if-nez p2, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     monitor-exit v2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(One);
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Looper;);
a=0;//     invoke-direct {v0, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v0, p0, Lcom/tencent/a/b/g;->d:Landroid/os/Handler;
a=0;// 
a=0;//     iput-object p1, p0, Lcom/tencent/a/b/g;->a:Landroid/content/Context;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/tencent/a/b/g;->g:Lcom/tencent/a/b/g$c;
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lcom/tencent/a/b/g;->f:I
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     :try_start_2
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/g;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v3, "wifi"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/a/b/g;->b:Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     new-instance v0, Landroid/content/IntentFilter;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/IntentFilter;);
a=0;//     invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/IntentFilter;);
a=0;//     new-instance v3, Lcom/tencent/a/b/g$a;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/tencent/a/b/g$a;);
a=0;//     invoke-direct {v3, p0}, Lcom/tencent/a/b/g$a;-><init>(Lcom/tencent/a/b/g;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/a/b/g$a;);
a=0;//     iput-object v3, p0, Lcom/tencent/a/b/g;->c:Lcom/tencent/a/b/g$a;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/tencent/a/b/g;->b:Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     iget-object v3, p0, Lcom/tencent/a/b/g;->c:Lcom/tencent/a/b/g$a;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     :cond_3
a=0;//     :try_start_3
a=0;//     monitor-exit v2
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     :try_start_4
a=0;//     #v0=(Reference,Landroid/content/IntentFilter;);
a=0;//     const-string v3, "android.net.wifi.WIFI_STATE_CHANGED"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v3, "android.net.wifi.SCAN_RESULTS"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v3, p0, Lcom/tencent/a/b/g;->a:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/tencent/a/b/g;->c:Lcom/tencent/a/b/g$a;
a=0;// 
a=0;//     #v4=(Reference,Lcom/tencent/a/b/g$a;);
a=0;//     invoke-virtual {v3, v4, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     :try_start_5
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/tencent/a/b/g;->a(J)V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/tencent/a/b/g;->i:Z
a=0;// 
a=0;//     monitor-exit v2
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/tencent/a/b/g;->i:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Null);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_6
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     monitor-exit v2
a=0;//     :try_end_6
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final b()Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/tencent/a/b/g;->i:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final c()Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/g;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/g;->b:Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/net/wifi/WifiManager;);
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/g;->b:Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
}}
