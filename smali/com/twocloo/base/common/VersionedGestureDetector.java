package com.twocloo.base.common; class VersionedGestureDetector { void a() { int a;
a=0;// .class public abstract Lcom/twocloo/base/common/VersionedGestureDetector;
a=0;// .super Ljava/lang/Object;
a=0;// .source "VersionedGestureDetector.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/base/common/VersionedGestureDetector$CupcakeDetector;,
a=0;//         Lcom/twocloo/base/common/VersionedGestureDetector$EclairDetector;,
a=0;//         Lcom/twocloo/base/common/VersionedGestureDetector$FroyoDetector;,
a=0;//         Lcom/twocloo/base/common/VersionedGestureDetector$OnGestureListener;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final TAG:Ljava/lang/String; = "VersionedGestureDetector"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mLastTouchX:F
a=0;// 
a=0;// .field mLastTouchY:F
a=0;// 
a=0;// .field mListener:Lcom/twocloo/base/common/VersionedGestureDetector$OnGestureListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/common/VersionedGestureDetector;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static newInstance(Landroid/content/Context;Lcom/twocloo/base/common/VersionedGestureDetector$OnGestureListener;)Lcom/twocloo/base/common/VersionedGestureDetector;
a=0;//     .locals 5
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "listener"    # Lcom/twocloo/base/common/VersionedGestureDetector$OnGestureListener;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 33
a=0;//     #v3=(Null);
a=0;//     sget-object v2, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 34
a=0;//     .local v1, "sdkVersion":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 36
a=0;//     .local v0, "detector":Lcom/twocloo/base/common/VersionedGestureDetector;
a=0;//     #v0=(Null);
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ge v1, v2, :cond_0
a=0;// 
a=0;//     .line 38
a=0;//     new-instance v0, Lcom/twocloo/base/common/VersionedGestureDetector$CupcakeDetector;
a=0;// 
a=0;//     .end local v0    # "detector":Lcom/twocloo/base/common/VersionedGestureDetector;
a=0;//     #v0=(UninitRef,Lcom/twocloo/base/common/VersionedGestureDetector$CupcakeDetector;);
a=0;//     invoke-direct {v0, v3, v3}, Lcom/twocloo/base/common/VersionedGestureDetector$CupcakeDetector;-><init>(Lcom/twocloo/base/common/VersionedGestureDetector$CupcakeDetector;Lcom/twocloo/base/common/VersionedGestureDetector$CupcakeDetector;)V
a=0;// 
a=0;//     .line 46
a=0;//     .restart local v0    # "detector":Lcom/twocloo/base/common/VersionedGestureDetector;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     const-string v2, "VersionedGestureDetector"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Created new "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 48
a=0;//     iput-object p1, v0, Lcom/twocloo/base/common/VersionedGestureDetector;->mListener:Lcom/twocloo/base/common/VersionedGestureDetector$OnGestureListener;
a=0;// 
a=0;//     .line 50
a=0;//     return-object v0
a=0;// 
a=0;//     .line 39
a=0;//     :cond_0
a=0;//     #v0=(Null);v2=(PosByte);v3=(Null);v4=(Uninit);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     if-ge v1, v2, :cond_1
a=0;// 
a=0;//     .line 41
a=0;//     new-instance v0, Lcom/twocloo/base/common/VersionedGestureDetector$EclairDetector;
a=0;// 
a=0;//     .end local v0    # "detector":Lcom/twocloo/base/common/VersionedGestureDetector;
a=0;//     #v0=(UninitRef,Lcom/twocloo/base/common/VersionedGestureDetector$EclairDetector;);
a=0;//     invoke-direct {v0, v3, v3}, Lcom/twocloo/base/common/VersionedGestureDetector$EclairDetector;-><init>(Lcom/twocloo/base/common/VersionedGestureDetector$EclairDetector;Lcom/twocloo/base/common/VersionedGestureDetector$EclairDetector;)V
a=0;// 
a=0;//     .restart local v0    # "detector":Lcom/twocloo/base/common/VersionedGestureDetector;
a=0;//     #v0=(Reference,Lcom/twocloo/base/common/VersionedGestureDetector$EclairDetector;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 44
a=0;//     :cond_1
a=0;//     #v0=(Null);
a=0;//     new-instance v0, Lcom/twocloo/base/common/VersionedGestureDetector$FroyoDetector;
a=0;// 
a=0;//     .end local v0    # "detector":Lcom/twocloo/base/common/VersionedGestureDetector;
a=0;//     #v0=(UninitRef,Lcom/twocloo/base/common/VersionedGestureDetector$FroyoDetector;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/base/common/VersionedGestureDetector$FroyoDetector;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .restart local v0    # "detector":Lcom/twocloo/base/common/VersionedGestureDetector;
a=0;//     #v0=(Reference,Lcom/twocloo/base/common/VersionedGestureDetector$FroyoDetector;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public abstract onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// .end method
}}
