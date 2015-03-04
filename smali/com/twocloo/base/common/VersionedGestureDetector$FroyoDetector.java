package com.twocloo.base.common; class VersionedGestureDetector$FroyoDetector { void a() { int a;
a=0;// .class Lcom/twocloo/base/common/VersionedGestureDetector$FroyoDetector;
a=0;// .super Lcom/twocloo/base/common/VersionedGestureDetector$EclairDetector;
a=0;// .source "VersionedGestureDetector.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/base/common/VersionedGestureDetector;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "FroyoDetector"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mDetector:Landroid/view/ScaleGestureDetector;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 153
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Lcom/twocloo/base/common/VersionedGestureDetector$EclairDetector;-><init>(Lcom/twocloo/base/common/VersionedGestureDetector$EclairDetector;)V
a=0;// 
a=0;//     .line 154
a=0;//     #p0=(Reference,Lcom/twocloo/base/common/VersionedGestureDetector$FroyoDetector;);
a=0;//     new-instance v0, Landroid/view/ScaleGestureDetector;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/ScaleGestureDetector;);
a=0;//     new-instance v1, Lcom/twocloo/base/common/VersionedGestureDetector$FroyoDetector$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/base/common/VersionedGestureDetector$FroyoDetector$1;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/base/common/VersionedGestureDetector$FroyoDetector$1;-><init>(Lcom/twocloo/base/common/VersionedGestureDetector$FroyoDetector;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/common/VersionedGestureDetector$FroyoDetector$1;);
a=0;//     invoke-direct {v0, p1, v1}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ScaleGestureDetector;);
a=0;//     iput-object v0, p0, Lcom/twocloo/base/common/VersionedGestureDetector$FroyoDetector;->mDetector:Landroid/view/ScaleGestureDetector;
a=0;// 
a=0;//     .line 161
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 170
a=0;//     iget-object v0, p0, Lcom/twocloo/base/common/VersionedGestureDetector$FroyoDetector;->mDetector:Landroid/view/ScaleGestureDetector;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ScaleGestureDetector;);
a=0;//     invoke-virtual {v0, p1}, Landroid/view/ScaleGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     .line 171
a=0;//     invoke-super {p0, p1}, Lcom/twocloo/base/common/VersionedGestureDetector$EclairDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method shouldDrag()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 165
a=0;//     iget-object v0, p0, Lcom/twocloo/base/common/VersionedGestureDetector$FroyoDetector;->mDetector:Landroid/view/ScaleGestureDetector;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ScaleGestureDetector;);
a=0;//     invoke-virtual {v0}, Landroid/view/ScaleGestureDetector;->isInProgress()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
}}
