package com.twocloo.base.common; class VersionedGestureDetector$EclairDetector { void a() { int a;
a=0;// .class Lcom/twocloo/base/common/VersionedGestureDetector$EclairDetector;
a=0;// .super Lcom/twocloo/base/common/VersionedGestureDetector$CupcakeDetector;
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
a=0;//     name = "EclairDetector"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final INVALID_POINTER_ID:I = -0x1
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mActivePointerId:I
a=0;// 
a=0;// .field private mActivePointerIndex:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Lcom/twocloo/base/common/VersionedGestureDetector$CupcakeDetector;-><init>(Lcom/twocloo/base/common/VersionedGestureDetector$CupcakeDetector;)V
a=0;// 
a=0;//     .line 105
a=0;//     #p0=(Reference,Lcom/twocloo/base/common/VersionedGestureDetector$EclairDetector;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/twocloo/base/common/VersionedGestureDetector$EclairDetector;->mActivePointerId:I
a=0;// 
a=0;//     .line 106
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/twocloo/base/common/VersionedGestureDetector$EclairDetector;->mActivePointerIndex:I
a=0;// 
a=0;//     .line 103
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/twocloo/base/common/VersionedGestureDetector$EclairDetector;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     invoke-direct {p0}, Lcom/twocloo/base/common/VersionedGestureDetector$EclairDetector;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/common/VersionedGestureDetector$EclairDetector;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/twocloo/base/common/VersionedGestureDetector$EclairDetector;Lcom/twocloo/base/common/VersionedGestureDetector$EclairDetector;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     invoke-direct {p0}, Lcom/twocloo/base/common/VersionedGestureDetector$EclairDetector;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/common/VersionedGestureDetector$EclairDetector;);
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
a=0;//     .line 110
a=0;//     iget v0, p0, Lcom/twocloo/base/common/VersionedGestureDetector$EclairDetector;->mActivePointerIndex:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F
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
a=0;//     .line 115
a=0;//     iget v0, p0, Lcom/twocloo/base/common/VersionedGestureDetector$EclairDetector;->mActivePointerIndex:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 6
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 120
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 121
a=0;//     .local v0, "action":I
a=0;//     #v0=(Integer);
a=0;//     and-int/lit16 v4, v0, 0xff
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     packed-switch v4, :pswitch_data_0
a=0;// 
a=0;//     .line 142
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v1=(Boolean);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     iget v4, p0, Lcom/twocloo/base/common/VersionedGestureDetector$EclairDetector;->mActivePointerId:I
a=0;// 
a=0;//     invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->findPointerIndex(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     iput v4, p0, Lcom/twocloo/base/common/VersionedGestureDetector$EclairDetector;->mActivePointerIndex:I
a=0;// 
a=0;//     .line 143
a=0;//     invoke-super {p0, p1}, Lcom/twocloo/base/common/VersionedGestureDetector$CupcakeDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     return v4
a=0;// 
a=0;//     .line 123
a=0;//     :pswitch_1
a=0;//     #v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Integer);v5=(Uninit);
a=0;//     invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     iput v4, p0, Lcom/twocloo/base/common/VersionedGestureDetector$EclairDetector;->mActivePointerId:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 127
a=0;//     :pswitch_2
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     iput v4, p0, Lcom/twocloo/base/common/VersionedGestureDetector$EclairDetector;->mActivePointerId:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 130
a=0;//     :pswitch_3
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     const v5, 0xff00
a=0;// 
a=0;//     #v5=(Char);
a=0;//     and-int/2addr v4, v5
a=0;// 
a=0;//     shr-int/lit8 v3, v4, 0x8
a=0;// 
a=0;//     .line 131
a=0;//     .local v3, "pointerIndex":I
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 132
a=0;//     .local v2, "pointerId":I
a=0;//     #v2=(Integer);
a=0;//     iget v4, p0, Lcom/twocloo/base/common/VersionedGestureDetector$EclairDetector;->mActivePointerId:I
a=0;// 
a=0;//     if-ne v2, v4, :cond_0
a=0;// 
a=0;//     .line 133
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 134
a=0;//     .local v1, "newPointerIndex":I
a=0;//     :cond_1
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     iput v4, p0, Lcom/twocloo/base/common/VersionedGestureDetector$EclairDetector;->mActivePointerId:I
a=0;// 
a=0;//     .line 136
a=0;//     invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iput v4, p0, Lcom/twocloo/base/common/VersionedGestureDetector$EclairDetector;->mLastTouchX:F
a=0;// 
a=0;//     .line 137
a=0;//     invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     iput v4, p0, Lcom/twocloo/base/common/VersionedGestureDetector$EclairDetector;->mLastTouchY:F
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 121
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// .end method
}}
