package com.tencent.a.b; class e$a { void a() { int a;
a=0;// .class final Lcom/tencent/a/b/e$a;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/location/GpsStatus$Listener;
a=0;// .implements Landroid/location/LocationListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/a/b/e;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = "a"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private synthetic a:Lcom/tencent/a/b/e;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/tencent/a/b/e;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/tencent/a/b/e$a;->a:Lcom/tencent/a/b/e;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/a/b/e$a;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/tencent/a/b/e;B)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/a/b/e$a;-><init>(Lcom/tencent/a/b/e;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/a/b/e$a;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final onGpsStatusChanged(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/e$a;->a:Lcom/tencent/a/b/e;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/e;);
a=0;//     invoke-static {v0}, Lcom/tencent/a/b/e;->a(Lcom/tencent/a/b/e;)V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/e$a;->a:Lcom/tencent/a/b/e;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/e;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/a/b/e;->a(Lcom/tencent/a/b/e;I)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/e$a;->a:Lcom/tencent/a/b/e;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/e;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/a/b/e;->a(Lcom/tencent/a/b/e;I)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/e$a;->a:Lcom/tencent/a/b/e;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/e;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/a/b/e;->a(Lcom/tencent/a/b/e;I)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public final onLocationChanged(Landroid/location/Location;)V
a=0;//     .locals 9
a=0;// 
a=0;//     const-wide v7, 0x3e45798ee2308c3aL    # 1.0E-8
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(DoubleLo);v2=(DoubleHi);
a=0;//     invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     const-wide v5, 0x403dffffe2000000L    # 29.999998211860657
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     cmpl-double v5, v1, v5
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     const-wide v5, 0x4059fffffc800000L    # 103.99999916553497
a=0;// 
a=0;//     #v5=(LongLo);
a=0;//     cmpl-double v5, v3, v5
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-nez v5, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(LongHi);v5=(Conflicted);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Null);v1=(DoubleLo);v2=(DoubleHi);v3=(DoubleLo);v4=(DoubleHi);v5=(Byte);v6=(LongHi);v7=(LongLo);v8=(LongHi);
a=0;//     invoke-static {v1, v2}, Ljava/lang/Math;->abs(D)D
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(DoubleLo);v6=(DoubleHi);
a=0;//     cmpg-double v5, v5, v7
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-ltz v5, :cond_0
a=0;// 
a=0;//     invoke-static {v3, v4}, Ljava/lang/Math;->abs(D)D
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(DoubleLo);
a=0;//     cmpg-double v5, v5, v7
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-ltz v5, :cond_0
a=0;// 
a=0;//     const-wide v5, -0x3fa9800000000000L    # -90.0
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     cmpg-double v5, v1, v5
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-ltz v5, :cond_0
a=0;// 
a=0;//     const-wide v5, 0x4056800000000000L    # 90.0
a=0;// 
a=0;//     #v5=(LongLo);
a=0;//     cmpl-double v1, v1, v5
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gtz v1, :cond_0
a=0;// 
a=0;//     const-wide v1, -0x3f99800000000000L    # -180.0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     cmpg-double v1, v3, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-ltz v1, :cond_0
a=0;// 
a=0;//     const-wide v1, 0x4066800000000000L    # 180.0
a=0;// 
a=0;//     #v1=(LongLo);
a=0;//     cmpl-double v1, v3, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gtz v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/e$a;->a:Lcom/tencent/a/b/e;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/e;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);
a=0;//     invoke-static {v0, v1, v2}, Lcom/tencent/a/b/e;->a(Lcom/tencent/a/b/e;J)J
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/e$a;->a:Lcom/tencent/a/b/e;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/a/b/e;->a(Lcom/tencent/a/b/e;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/e$a;->a:Lcom/tencent/a/b/e;
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/a/b/e;->a(Lcom/tencent/a/b/e;I)I
a=0;// 
a=0;//     iget-object v8, p0, Lcom/tencent/a/b/e$a;->a:Lcom/tencent/a/b/e;
a=0;// 
a=0;//     #v8=(Reference,Lcom/tencent/a/b/e;);
a=0;//     new-instance v0, Lcom/tencent/a/b/e$b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/a/b/e$b;);
a=0;//     iget-object v1, p0, Lcom/tencent/a/b/e$a;->a:Lcom/tencent/a/b/e;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/a/b/e;);
a=0;//     iget-object v2, p0, Lcom/tencent/a/b/e$a;->a:Lcom/tencent/a/b/e;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/a/b/e;);
a=0;//     invoke-static {v2}, Lcom/tencent/a/b/e;->b(Lcom/tencent/a/b/e;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v2, p0, Lcom/tencent/a/b/e$a;->a:Lcom/tencent/a/b/e;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/tencent/a/b/e;->c(Lcom/tencent/a/b/e;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v2, p0, Lcom/tencent/a/b/e$a;->a:Lcom/tencent/a/b/e;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/tencent/a/b/e;->d(Lcom/tencent/a/b/e;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget-object v2, p0, Lcom/tencent/a/b/e$a;->a:Lcom/tencent/a/b/e;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/tencent/a/b/e;->e(Lcom/tencent/a/b/e;)J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/tencent/a/b/e$b;-><init>(Lcom/tencent/a/b/e;Landroid/location/Location;IIIJ)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/e$b;);
a=0;//     invoke-static {v8, v0}, Lcom/tencent/a/b/e;->a(Lcom/tencent/a/b/e;Lcom/tencent/a/b/e$b;)Lcom/tencent/a/b/e$b;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/e$a;->a:Lcom/tencent/a/b/e;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/a/b/e;->f(Lcom/tencent/a/b/e;)Lcom/tencent/a/b/e$c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/e$a;->a:Lcom/tencent/a/b/e;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/a/b/e;->f(Lcom/tencent/a/b/e;)Lcom/tencent/a/b/e$c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/a/b/e$a;->a:Lcom/tencent/a/b/e;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/a/b/e;->g(Lcom/tencent/a/b/e;)Lcom/tencent/a/b/e$b;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Lcom/tencent/a/b/e$c;->a(Lcom/tencent/a/b/e$b;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final onProviderDisabled(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "gps"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/e$a;->a:Lcom/tencent/a/b/e;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/e;);
a=0;//     iget-object v1, p0, Lcom/tencent/a/b/e$a;->a:Lcom/tencent/a/b/e;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/a/b/e;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/a/b/e;->c(Lcom/tencent/a/b/e;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/a/b/e;->b(Lcom/tencent/a/b/e;I)I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/e$a;->a:Lcom/tencent/a/b/e;
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/tencent/a/b/e;->d(Lcom/tencent/a/b/e;I)I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/e$a;->a:Lcom/tencent/a/b/e;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/a/b/e;->f(Lcom/tencent/a/b/e;)Lcom/tencent/a/b/e$c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/e$a;->a:Lcom/tencent/a/b/e;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/a/b/e;->f(Lcom/tencent/a/b/e;)Lcom/tencent/a/b/e$c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/a/b/e$a;->a:Lcom/tencent/a/b/e;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/a/b/e;);
a=0;//     invoke-static {v1}, Lcom/tencent/a/b/e;->d(Lcom/tencent/a/b/e;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v0, v1}, Lcom/tencent/a/b/e$c;->a(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final onProviderEnabled(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "gps"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/e$a;->a:Lcom/tencent/a/b/e;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/e;);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/a/b/e;->d(Lcom/tencent/a/b/e;I)I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/e$a;->a:Lcom/tencent/a/b/e;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/a/b/e;->f(Lcom/tencent/a/b/e;)Lcom/tencent/a/b/e$c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/e$a;->a:Lcom/tencent/a/b/e;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/a/b/e;->f(Lcom/tencent/a/b/e;)Lcom/tencent/a/b/e$c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/a/b/e$a;->a:Lcom/tencent/a/b/e;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/a/b/e;);
a=0;//     invoke-static {v1}, Lcom/tencent/a/b/e;->d(Lcom/tencent/a/b/e;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v0, v1}, Lcom/tencent/a/b/e$c;->a(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
