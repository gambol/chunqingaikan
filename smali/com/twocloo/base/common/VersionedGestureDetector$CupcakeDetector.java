package com.twocloo.base.common; class VersionedGestureDetector$CupcakeDetector { void a() { int a;
a=0;// .class Lcom/twocloo/base/common/VersionedGestureDetector$CupcakeDetector;
a=0;// .super Lcom/twocloo/base/common/VersionedGestureDetector;
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
a=0;//     name = "CupcakeDetector"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     invoke-direct {p0}, Lcom/twocloo/base/common/VersionedGestureDetector;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/common/VersionedGestureDetector$CupcakeDetector;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/twocloo/base/common/VersionedGestureDetector$CupcakeDetector;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     invoke-direct {p0}, Lcom/twocloo/base/common/VersionedGestureDetector$CupcakeDetector;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/common/VersionedGestureDetector$CupcakeDetector;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/twocloo/base/common/VersionedGestureDetector$CupcakeDetector;Lcom/twocloo/base/common/VersionedGestureDetector$CupcakeDetector;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     invoke-direct {p0}, Lcom/twocloo/base/common/VersionedGestureDetector$CupcakeDetector;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/common/VersionedGestureDetector$CupcakeDetector;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method getActiveX(Landroid/view/MotionEvent;)F
a=0;//     .locals 1
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method getActiveY(Landroid/view/MotionEvent;)F
a=0;//     .locals 1
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 5
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     packed-switch v2, :pswitch_data_0
a=0;// 
a=0;//     .line 96
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     return v2
a=0;// 
a=0;//     .line 79
a=0;//     :pswitch_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Integer);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/base/common/VersionedGestureDetector$CupcakeDetector;->getActiveX(Landroid/view/MotionEvent;)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iput v2, p0, Lcom/twocloo/base/common/VersionedGestureDetector$CupcakeDetector;->mLastTouchX:F
a=0;// 
a=0;//     .line 80
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/base/common/VersionedGestureDetector$CupcakeDetector;->getActiveY(Landroid/view/MotionEvent;)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     iput v2, p0, Lcom/twocloo/base/common/VersionedGestureDetector$CupcakeDetector;->mLastTouchY:F
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 84
a=0;//     :pswitch_2
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/base/common/VersionedGestureDetector$CupcakeDetector;->getActiveX(Landroid/view/MotionEvent;)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 85
a=0;//     .local v0, "x":F
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/base/common/VersionedGestureDetector$CupcakeDetector;->getActiveY(Landroid/view/MotionEvent;)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 87
a=0;//     .local v1, "y":F
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/base/common/VersionedGestureDetector$CupcakeDetector;->shouldDrag()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 88
a=0;//     iget-object v2, p0, Lcom/twocloo/base/common/VersionedGestureDetector$CupcakeDetector;->mListener:Lcom/twocloo/base/common/VersionedGestureDetector$OnGestureListener;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/common/VersionedGestureDetector$OnGestureListener;);
a=0;//     iget v3, p0, Lcom/twocloo/base/common/VersionedGestureDetector$CupcakeDetector;->mLastTouchX:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-float v3, v0, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iget v4, p0, Lcom/twocloo/base/common/VersionedGestureDetector$CupcakeDetector;->mLastTouchY:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-float v4, v1, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     invoke-interface {v2, v3, v4}, Lcom/twocloo/base/common/VersionedGestureDetector$OnGestureListener;->onDrag(FF)V
a=0;// 
a=0;//     .line 91
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iput v0, p0, Lcom/twocloo/base/common/VersionedGestureDetector$CupcakeDetector;->mLastTouchX:F
a=0;// 
a=0;//     .line 92
a=0;//     iput v1, p0, Lcom/twocloo/base/common/VersionedGestureDetector$CupcakeDetector;->mLastTouchY:F
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 77
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method shouldDrag()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 72
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
}}
