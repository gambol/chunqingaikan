package com.tencent.tauth; class SosoLocationListener { void a() { int a;
a=0;// .class public Lcom/tencent/tauth/SosoLocationListener;
a=0;// .super Lcom/tencent/a/a/a/b;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private listener:Lcom/tencent/tauth/LbsAgent$OnGetLocationListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/tencent/tauth/LbsAgent$OnGetLocationListener;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 15
a=0;//     #v2=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {p0, v0, v2, v2, v1}, Lcom/tencent/a/a/a/b;-><init>(IIII)V
a=0;// 
a=0;//     .line 17
a=0;//     #p0=(Reference,Lcom/tencent/tauth/SosoLocationListener;);
a=0;//     iput-object p1, p0, Lcom/tencent/tauth/SosoLocationListener;->listener:Lcom/tencent/tauth/LbsAgent$OnGetLocationListener;
a=0;// 
a=0;//     .line 18
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onLocationDataUpdate([BI)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     invoke-super {p0, p1, p2}, Lcom/tencent/a/a/a/b;->onLocationDataUpdate([BI)V
a=0;// 
a=0;//     .line 23
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "location: onLocationDataUpdate = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->c(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 25
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onLocationUpdate(Lcom/tencent/a/a/a/d;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "location: onLocationUpdate = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->c(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 31
a=0;//     invoke-super {p0, p1}, Lcom/tencent/a/a/a/b;->onLocationUpdate(Lcom/tencent/a/a/a/d;)V
a=0;// 
a=0;//     .line 33
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 41
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 35
a=0;//     :cond_1
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Landroid/location/Location;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/location/Location;);
a=0;//     const-string v1, "passive"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/location/Location;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 36
a=0;//     #v0=(Reference,Landroid/location/Location;);
a=0;//     iget-wide v1, p1, Lcom/tencent/a/a/a/d;->b:D
a=0;// 
a=0;//     #v1=(DoubleLo);v2=(DoubleHi);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/location/Location;->setLatitude(D)V
a=0;// 
a=0;//     .line 37
a=0;//     iget-wide v1, p1, Lcom/tencent/a/a/a/d;->c:D
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/location/Location;->setLongitude(D)V
a=0;// 
a=0;//     .line 39
a=0;//     iget-object v1, p0, Lcom/tencent/tauth/SosoLocationListener;->listener:Lcom/tencent/tauth/LbsAgent$OnGetLocationListener;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/tauth/LbsAgent$OnGetLocationListener;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 40
a=0;//     iget-object v1, p0, Lcom/tencent/tauth/SosoLocationListener;->listener:Lcom/tencent/tauth/LbsAgent$OnGetLocationListener;
a=0;// 
a=0;//     invoke-interface {v1, v0}, Lcom/tencent/tauth/LbsAgent$OnGetLocationListener;->onLocationUpdate(Landroid/location/Location;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onStatusUpdate(I)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "location: onStatusUpdate = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->c(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 47
a=0;//     invoke-super {p0, p1}, Lcom/tencent/a/a/a/b;->onStatusUpdate(I)V
a=0;// 
a=0;//     .line 48
a=0;//     return-void
a=0;// .end method
}}
