package com.tencent.a.b; class g$a { void a() { int a;
a=0;// .class public final Lcom/tencent/a/b/g$a;
a=0;// .super Landroid/content/BroadcastReceiver;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/a/b/g;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x1
a=0;//     name = "a"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:I
a=0;// 
a=0;// .field private b:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Landroid/net/wifi/ScanResult;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private c:Z
a=0;// 
a=0;// .field private synthetic d:Lcom/tencent/a/b/g;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/tencent/a/b/g;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iput-object p1, p0, Lcom/tencent/a/b/g$a;->d:Lcom/tencent/a/b/g;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/a/b/g$a;);
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/tencent/a/b/g$a;->a:I
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/tencent/a/b/g$a;->b:Ljava/util/List;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-boolean v0, p0, Lcom/tencent/a/b/g$a;->c:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/util/List;)V
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Landroid/net/wifi/ScanResult;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-boolean v0, p0, Lcom/tencent/a/b/g$a;->c:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/g$a;->b:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/tencent/a/b/g$a;->b:Ljava/util/List;
a=0;// 
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/g$a;->b:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Reference,Ljava/util/Iterator;);v5=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/net/wifi/ScanResult;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v2, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Integer);v2=(Integer);
a=0;//     if-ge v2, v3, :cond_3
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/a/b/g$a;->b:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/net/wifi/ScanResult;
a=0;// 
a=0;//     iget-object v1, v1, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v5, v0, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/a/b/g$a;->b:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v1, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/tencent/a/b/g$a;->b:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Boolean);v5=(Reference,Ljava/lang/String;);
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/g$a;->b:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/tencent/a/b/g$a;->b:Ljava/util/List;
a=0;// 
a=0;//     :goto_2
a=0;//     invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Reference,Ljava/util/Iterator;);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/net/wifi/ScanResult;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/a/b/g$a;->b:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_6
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/g$a;->b:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->clear()V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "android.net.wifi.WIFI_STATE_CHANGED"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, "wifi_state"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/tencent/a/b/g$a;->a:I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/g$a;->d:Lcom/tencent/a/b/g;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/g;);
a=0;//     invoke-static {v0}, Lcom/tencent/a/b/g;->b(Lcom/tencent/a/b/g;)Lcom/tencent/a/b/g$c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/g$a;->d:Lcom/tencent/a/b/g;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/a/b/g;->b(Lcom/tencent/a/b/g;)Lcom/tencent/a/b/g$c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Lcom/tencent/a/b/g$a;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v0, v1}, Lcom/tencent/a/b/g$c;->b(I)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "android.net.wifi.SCAN_RESULTS"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "android.net.wifi.WIFI_STATE_CHANGED"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/tencent/a/b/g$a;->d:Lcom/tencent/a/b/g;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/a/b/g;->c(Lcom/tencent/a/b/g;)Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/g$a;->d:Lcom/tencent/a/b/g;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/g;);
a=0;//     invoke-static {v0}, Lcom/tencent/a/b/g;->c(Lcom/tencent/a/b/g;)Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getScanResults()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_2
a=0;//     invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "android.net.wifi.WIFI_STATE_CHANGED"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Reference,Ljava/util/List;);v1=(Integer);v2=(Reference,Ljava/lang/String;);v3=(PosByte);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     iget-boolean v1, p0, Lcom/tencent/a/b/g$a;->c:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_5
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/a/b/g$a;->b:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/a/b/g$a;->b:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v1, v3, :cond_5
a=0;// 
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-gt v1, v2, :cond_5
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/tencent/a/b/g$a;->a(Ljava/util/List;)V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/tencent/a/b/g$a;->c:Z
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/g$a;->d:Lcom/tencent/a/b/g;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/g;);
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/tencent/a/b/g;->a(J)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-direct {p0, v0}, Lcom/tencent/a/b/g$a;->a(Ljava/util/List;)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/tencent/a/b/g$a;->c:Z
a=0;// 
a=0;//     iget-object v6, p0, Lcom/tencent/a/b/g$a;->d:Lcom/tencent/a/b/g;
a=0;// 
a=0;//     #v6=(Reference,Lcom/tencent/a/b/g;);
a=0;//     new-instance v0, Lcom/tencent/a/b/g$b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/a/b/g$b;);
a=0;//     iget-object v1, p0, Lcom/tencent/a/b/g$a;->d:Lcom/tencent/a/b/g;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/a/b/g;);
a=0;//     iget-object v2, p0, Lcom/tencent/a/b/g$a;->b:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     iget v5, p0, Lcom/tencent/a/b/g$a;->a:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/tencent/a/b/g$b;-><init>(Lcom/tencent/a/b/g;Ljava/util/List;JI)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/g$b;);
a=0;//     invoke-static {v6, v0}, Lcom/tencent/a/b/g;->a(Lcom/tencent/a/b/g;Lcom/tencent/a/b/g$b;)Lcom/tencent/a/b/g$b;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/g$a;->d:Lcom/tencent/a/b/g;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/a/b/g;->b(Lcom/tencent/a/b/g;)Lcom/tencent/a/b/g$c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/g$a;->d:Lcom/tencent/a/b/g;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/a/b/g;->b(Lcom/tencent/a/b/g;)Lcom/tencent/a/b/g$c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/a/b/g$a;->d:Lcom/tencent/a/b/g;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/a/b/g;->d(Lcom/tencent/a/b/g;)Lcom/tencent/a/b/g$b;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Lcom/tencent/a/b/g$c;->a(Lcom/tencent/a/b/g$b;)V
a=0;// 
a=0;//     :cond_6
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/g$a;->d:Lcom/tencent/a/b/g;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/a/b/g$a;->d:Lcom/tencent/a/b/g;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/a/b/g;->e(Lcom/tencent/a/b/g;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-long v1, v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const-wide/16 v3, 0x4e20
a=0;// 
a=0;//     mul-long/2addr v1, v3
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/tencent/a/b/g;->a(J)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
