package com.slidingmenu.lib; class CustomViewAbove { void a() { int a;
a=0;// .class public Lcom/slidingmenu/lib/CustomViewAbove;
a=0;// .super Landroid/view/ViewGroup;
a=0;// .source "CustomViewAbove.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/slidingmenu/lib/CustomViewAbove$OnPageChangeListener;,
a=0;//         Lcom/slidingmenu/lib/CustomViewAbove$SimpleOnPageChangeListener;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DEBUG:Z = false
a=0;// 
a=0;// .field private static final INVALID_POINTER:I = -0x1
a=0;// 
a=0;// .field private static final MAX_SETTLE_DURATION:I = 0x258
a=0;// 
a=0;// .field private static final MIN_DISTANCE_FOR_FLING:I = 0x19
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "CustomViewAbove"
a=0;// 
a=0;// .field private static final USE_CACHE:Z
a=0;// 
a=0;// .field private static final sInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected mActivePointerId:I
a=0;// 
a=0;// .field private mClosedListener:Lcom/slidingmenu/lib/SlidingMenu$OnClosedListener;
a=0;// 
a=0;// .field private mContent:Landroid/view/View;
a=0;// 
a=0;// .field private mCurItem:I
a=0;// 
a=0;// .field private mEnabled:Z
a=0;// 
a=0;// .field private mFlingDistance:I
a=0;// 
a=0;// .field private mIgnoredViews:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Landroid/view/View;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mInitialMotionX:F
a=0;// 
a=0;// .field private mInternalPageChangeListener:Lcom/slidingmenu/lib/CustomViewAbove$OnPageChangeListener;
a=0;// 
a=0;// .field private mIsBeingDragged:Z
a=0;// 
a=0;// .field private mIsUnableToDrag:Z
a=0;// 
a=0;// .field private mLastMotionX:F
a=0;// 
a=0;// .field private mLastMotionY:F
a=0;// 
a=0;// .field protected mMaximumVelocity:I
a=0;// 
a=0;// .field private mMinimumVelocity:I
a=0;// 
a=0;// .field private mOnPageChangeListener:Lcom/slidingmenu/lib/CustomViewAbove$OnPageChangeListener;
a=0;// 
a=0;// .field private mOpenedListener:Lcom/slidingmenu/lib/SlidingMenu$OnOpenedListener;
a=0;// 
a=0;// .field private mQuickReturn:Z
a=0;// 
a=0;// .field private mScrollX:F
a=0;// 
a=0;// .field private mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;// .field private mScrolling:Z
a=0;// 
a=0;// .field private mScrollingCacheEnabled:Z
a=0;// 
a=0;// .field protected mTouchMode:I
a=0;// 
a=0;// .field private mTouchSlop:I
a=0;// 
a=0;// .field protected mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;// .field private mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     new-instance v0, Lcom/slidingmenu/lib/CustomViewAbove$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/slidingmenu/lib/CustomViewAbove$1;);
a=0;//     invoke-direct {v0}, Lcom/slidingmenu/lib/CustomViewAbove$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove$1;);
a=0;//     sput-object v0, Lcom/slidingmenu/lib/CustomViewAbove;->sInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .line 78
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/slidingmenu/lib/CustomViewAbove;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 153
a=0;//     #p0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 156
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 73
a=0;//     #p0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mActivePointerId:I
a=0;// 
a=0;//     .line 90
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mEnabled:Z
a=0;// 
a=0;//     .line 100
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mIgnoredViews:Ljava/util/List;
a=0;// 
a=0;//     .line 565
a=0;//     iput v1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mTouchMode:I
a=0;// 
a=0;//     .line 611
a=0;//     iput-boolean v1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mQuickReturn:Z
a=0;// 
a=0;//     .line 839
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mScrollX:F
a=0;// 
a=0;//     .line 157
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->initCustomViewAbove()V
a=0;// 
a=0;//     .line 158
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/slidingmenu/lib/CustomViewAbove;)Lcom/slidingmenu/lib/CustomViewBehind;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private completeScroll()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 542
a=0;//     #v6=(Null);
a=0;//     iget-boolean v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mScrolling:Z
a=0;// 
a=0;//     .line 543
a=0;//     .local v0, "needPopulate":Z
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 545
a=0;//     invoke-direct {p0, v6}, Lcom/slidingmenu/lib/CustomViewAbove;->setScrollingCacheEnabled(Z)V
a=0;// 
a=0;//     .line 546
a=0;//     iget-object v5, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v5}, Landroid/widget/Scroller;->abortAnimation()V
a=0;// 
a=0;//     .line 547
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->getScrollX()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 548
a=0;//     .local v1, "oldX":I
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->getScrollY()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 549
a=0;//     .local v2, "oldY":I
a=0;//     #v2=(Integer);
a=0;//     iget-object v5, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/widget/Scroller;->getCurrX()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 550
a=0;//     .local v3, "x":I
a=0;//     #v3=(Integer);
a=0;//     iget-object v5, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/widget/Scroller;->getCurrY()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 551
a=0;//     .local v4, "y":I
a=0;//     #v4=(Integer);
a=0;//     if-ne v1, v3, :cond_0
a=0;// 
a=0;//     if-eq v2, v4, :cond_1
a=0;// 
a=0;//     .line 552
a=0;//     :cond_0
a=0;//     invoke-virtual {p0, v3, v4}, Lcom/slidingmenu/lib/CustomViewAbove;->scrollTo(II)V
a=0;// 
a=0;//     .line 554
a=0;//     :cond_1
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->isMenuOpen()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     .line 555
a=0;//     iget-object v5, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mOpenedListener:Lcom/slidingmenu/lib/SlidingMenu$OnOpenedListener;
a=0;// 
a=0;//     #v5=(Reference,Lcom/slidingmenu/lib/SlidingMenu$OnOpenedListener;);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 556
a=0;//     iget-object v5, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mOpenedListener:Lcom/slidingmenu/lib/SlidingMenu$OnOpenedListener;
a=0;// 
a=0;//     invoke-interface {v5}, Lcom/slidingmenu/lib/SlidingMenu$OnOpenedListener;->onOpened()V
a=0;// 
a=0;//     .line 562
a=0;//     .end local v1    # "oldX":I
a=0;//     .end local v2    # "oldY":I
a=0;//     .end local v3    # "x":I
a=0;//     .end local v4    # "y":I
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iput-boolean v6, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mScrolling:Z
a=0;// 
a=0;//     .line 563
a=0;//     return-void
a=0;// 
a=0;//     .line 558
a=0;//     .restart local v1    # "oldX":I
a=0;//     .restart local v2    # "oldY":I
a=0;//     .restart local v3    # "x":I
a=0;//     .restart local v4    # "y":I
a=0;//     :cond_3
a=0;//     #v1=(Integer);v2=(Integer);v3=(Integer);v4=(Integer);v5=(Boolean);
a=0;//     iget-object v5, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mClosedListener:Lcom/slidingmenu/lib/SlidingMenu$OnClosedListener;
a=0;// 
a=0;//     #v5=(Reference,Lcom/slidingmenu/lib/SlidingMenu$OnClosedListener;);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 559
a=0;//     iget-object v5, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mClosedListener:Lcom/slidingmenu/lib/SlidingMenu$OnClosedListener;
a=0;// 
a=0;//     invoke-interface {v5}, Lcom/slidingmenu/lib/SlidingMenu$OnClosedListener;->onClosed()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private determineDrag(Landroid/view/MotionEvent;)V
a=0;//     .locals 10
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     .line 781
a=0;//     #v9=(One);
a=0;//     iget v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mActivePointerId:I
a=0;// 
a=0;//     .line 782
a=0;//     .local v0, "activePointerId":I
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/slidingmenu/lib/CustomViewAbove;->getPointerIndex(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 783
a=0;//     .local v3, "pointerIndex":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v8, -0x1
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     if-ne v0, v8, :cond_1
a=0;// 
a=0;//     .line 800
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 785
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-static {p1, v3}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 786
a=0;//     .local v4, "x":F
a=0;//     #v4=(Float);
a=0;//     iget v8, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mLastMotionX:F
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     sub-float v1, v4, v8
a=0;// 
a=0;//     .line 787
a=0;//     .local v1, "dx":F
a=0;//     #v1=(Float);
a=0;//     invoke-static {v1}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 788
a=0;//     .local v5, "xDiff":F
a=0;//     #v5=(Float);
a=0;//     invoke-static {p1, v3}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 789
a=0;//     .local v6, "y":F
a=0;//     #v6=(Float);
a=0;//     iget v8, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mLastMotionY:F
a=0;// 
a=0;//     sub-float v2, v6, v8
a=0;// 
a=0;//     .line 790
a=0;//     .local v2, "dy":F
a=0;//     #v2=(Float);
a=0;//     invoke-static {v2}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 791
a=0;//     .local v7, "yDiff":F
a=0;//     #v7=(Float);
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->isMenuOpen()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_2
a=0;// 
a=0;//     iget v8, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mTouchSlop:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     div-int/lit8 v8, v8, 0x2
a=0;// 
a=0;//     :goto_1
a=0;//     int-to-float v8, v8
a=0;// 
a=0;//     #v8=(Float);
a=0;//     cmpl-float v8, v5, v8
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     if-lez v8, :cond_3
a=0;// 
a=0;//     cmpl-float v8, v5, v7
a=0;// 
a=0;//     if-lez v8, :cond_3
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcom/slidingmenu/lib/CustomViewAbove;->thisSlideAllowed(F)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_3
a=0;// 
a=0;//     .line 792
a=0;//     invoke-direct {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->startDrag()V
a=0;// 
a=0;//     .line 793
a=0;//     iput v4, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mLastMotionX:F
a=0;// 
a=0;//     .line 794
a=0;//     iput v6, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mLastMotionY:F
a=0;// 
a=0;//     .line 795
a=0;//     invoke-direct {p0, v9}, Lcom/slidingmenu/lib/CustomViewAbove;->setScrollingCacheEnabled(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 791
a=0;//     :cond_2
a=0;//     iget v8, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mTouchSlop:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 797
a=0;//     :cond_3
a=0;//     #v8=(Byte);
a=0;//     iget v8, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mTouchSlop:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     int-to-float v8, v8
a=0;// 
a=0;//     #v8=(Float);
a=0;//     cmpl-float v8, v5, v8
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     if-lez v8, :cond_0
a=0;// 
a=0;//     .line 798
a=0;//     iput-boolean v9, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mIsUnableToDrag:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private determineTargetPage(FII)I
a=0;//     .locals 3
a=0;//     .param p1, "pageOffset"    # F
a=0;//     .param p2, "velocity"    # I
a=0;//     .param p3, "deltaX"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 812
a=0;//     iget v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mCurItem:I
a=0;// 
a=0;//     .line 813
a=0;//     .local v0, "targetPage":I
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p3}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mFlingDistance:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-le v1, v2, :cond_2
a=0;// 
a=0;//     invoke-static {p2}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iget v2, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mMinimumVelocity:I
a=0;// 
a=0;//     if-le v1, v2, :cond_2
a=0;// 
a=0;//     .line 814
a=0;//     if-lez p2, :cond_1
a=0;// 
a=0;//     if-lez p3, :cond_1
a=0;// 
a=0;//     .line 815
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     .line 822
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     .line 816
a=0;//     :cond_1
a=0;//     if-gez p2, :cond_0
a=0;// 
a=0;//     if-gez p3, :cond_0
a=0;// 
a=0;//     .line 817
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     .line 819
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 820
a=0;//     :cond_2
a=0;//     iget v1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mCurItem:I
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     add-float/2addr v1, p1
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Math;->round(F)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private endDrag()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 863
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mQuickReturn:Z
a=0;// 
a=0;//     .line 864
a=0;//     iput-boolean v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mIsBeingDragged:Z
a=0;// 
a=0;//     .line 865
a=0;//     iput-boolean v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mIsUnableToDrag:Z
a=0;// 
a=0;//     .line 866
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mActivePointerId:I
a=0;// 
a=0;//     .line 868
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 869
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V
a=0;// 
a=0;//     .line 870
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     .line 872
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private getLeftBound()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 318
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1}, Lcom/slidingmenu/lib/CustomViewBehind;->getAbsLeftBound(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private getPointerIndex(Landroid/view/MotionEvent;I)I
a=0;//     .locals 2
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;//     .param p2, "id"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 605
a=0;//     #v1=(Byte);
a=0;//     invoke-static {p1, p2}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 606
a=0;//     .local v0, "activePointerIndex":I
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 607
a=0;//     iput v1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mActivePointerId:I
a=0;// 
a=0;//     .line 608
a=0;//     :cond_0
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private getRightBound()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 322
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1}, Lcom/slidingmenu/lib/CustomViewBehind;->getAbsRightBound(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private isInIgnoredView(Landroid/view/MotionEvent;)Z
a=0;//     .locals 5
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 334
a=0;//     new-instance v0, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     .line 335
a=0;//     .local v0, "rect":Landroid/graphics/Rect;
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     iget-object v2, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mIgnoredViews:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 339
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     return v2
a=0;// 
a=0;//     .line 335
a=0;//     :cond_1
a=0;//     #v2=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/view/View;
a=0;// 
a=0;//     .line 336
a=0;//     .local v1, "v":Landroid/view/View;
a=0;//     invoke-virtual {v1, v0}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V
a=0;// 
a=0;//     .line 337
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     float-to-int v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v3, v4}, Landroid/graphics/Rect;->contains(II)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private onSecondaryPointerUp(Landroid/view/MotionEvent;)V
a=0;//     .locals 4
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 843
a=0;//     invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 844
a=0;//     .local v2, "pointerIndex":I
a=0;//     #v2=(Integer);
a=0;//     invoke-static {p1, v2}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 845
a=0;//     .local v1, "pointerId":I
a=0;//     #v1=(Integer);
a=0;//     iget v3, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mActivePointerId:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v1, v3, :cond_0
a=0;// 
a=0;//     .line 848
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 849
a=0;//     .local v0, "newPointerIndex":I
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iput v3, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mLastMotionX:F
a=0;// 
a=0;//     .line 850
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mActivePointerId:I
a=0;// 
a=0;//     .line 851
a=0;//     iget-object v3, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/VelocityTracker;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 852
a=0;//     iget-object v3, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/view/VelocityTracker;->clear()V
a=0;// 
a=0;//     .line 855
a=0;//     .end local v0    # "newPointerIndex":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 848
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v3=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private pageScrolled(I)V
a=0;//     .locals 6
a=0;//     .param p1, "xpos"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 512
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->getWidth()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 513
a=0;//     .local v3, "widthWithMargin":I
a=0;//     #v3=(Integer);
a=0;//     div-int v2, p1, v3
a=0;// 
a=0;//     .line 514
a=0;//     .local v2, "position":I
a=0;//     #v2=(Integer);
a=0;//     rem-int v1, p1, v3
a=0;// 
a=0;//     .line 515
a=0;//     .local v1, "offsetPixels":I
a=0;//     #v1=(Integer);
a=0;//     int-to-float v4, v1
a=0;// 
a=0;//     #v4=(Float);
a=0;//     int-to-float v5, v3
a=0;// 
a=0;//     #v5=(Float);
a=0;//     div-float v0, v4, v5
a=0;// 
a=0;//     .line 517
a=0;//     .local v0, "offset":F
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p0, v2, v0, v1}, Lcom/slidingmenu/lib/CustomViewAbove;->onPageScrolled(IFI)V
a=0;// 
a=0;//     .line 518
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setScrollingCacheEnabled(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "enabled"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 875
a=0;//     iget-boolean v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mScrollingCacheEnabled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eq v0, p1, :cond_0
a=0;// 
a=0;//     .line 876
a=0;//     iput-boolean p1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mScrollingCacheEnabled:Z
a=0;// 
a=0;//     .line 887
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private startDrag()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 858
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mIsBeingDragged:Z
a=0;// 
a=0;//     .line 859
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mQuickReturn:Z
a=0;// 
a=0;//     .line 860
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private thisSlideAllowed(F)Z
a=0;//     .locals 2
a=0;//     .param p1, "dx"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 593
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 594
a=0;//     .local v0, "allowed":Z
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->isMenuOpen()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 595
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v1=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     invoke-virtual {v1, p1}, Lcom/slidingmenu/lib/CustomViewBehind;->menuOpenSlideAllowed(F)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 601
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 597
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Boolean);
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v1=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     invoke-virtual {v1, p1}, Lcom/slidingmenu/lib/CustomViewBehind;->menuClosedSlideAllowed(F)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private thisTouchAllowed(Landroid/view/MotionEvent;)Z
a=0;//     .locals 5
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 576
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget v3, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mScrollX:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-float/2addr v2, v3
a=0;// 
a=0;//     float-to-int v0, v2
a=0;// 
a=0;//     .line 577
a=0;//     .local v0, "x":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->isMenuOpen()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 578
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v1=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     iget-object v2, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     iget v3, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mCurItem:I
a=0;// 
a=0;//     int-to-float v4, v0
a=0;// 
a=0;//     #v4=(Float);
a=0;//     invoke-virtual {v1, v2, v3, v4}, Lcom/slidingmenu/lib/CustomViewBehind;->menuOpenTouchAllowed(Landroid/view/View;IF)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 589
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v1=(Boolean);v2=(Conflicted);v4=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 580
a=0;//     :cond_1
a=0;//     #v1=(Null);v2=(Boolean);v4=(Uninit);
a=0;//     iget v2, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mTouchMode:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     packed-switch v2, :pswitch_data_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 586
a=0;//     :pswitch_1
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v1=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     iget-object v2, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1, v2, v0}, Lcom/slidingmenu/lib/CustomViewBehind;->marginTouchAllowed(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 582
a=0;//     :pswitch_2
a=0;//     #v1=(Null);v2=(Integer);
a=0;//     invoke-direct {p0, p1}, Lcom/slidingmenu/lib/CustomViewAbove;->isInIgnoredView(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 580
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addIgnoredView(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 283
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mIgnoredViews:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 284
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mIgnoredViews:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 286
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public arrowScroll(I)Z
a=0;//     .locals 6
a=0;//     .param p1, "direction"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v5, 0x42
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/16 v4, 0x11
a=0;// 
a=0;//     .line 963
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->findFocus()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 964
a=0;//     .local v0, "currentFocused":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-ne v0, p0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 966
a=0;//     :cond_0
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 968
a=0;//     .local v1, "handled":Z
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/FocusFinder;);
a=0;//     invoke-virtual {v3, p0, v0, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 970
a=0;//     .local v2, "nextFocused":Landroid/view/View;
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     if-eq v2, v0, :cond_5
a=0;// 
a=0;//     .line 971
a=0;//     if-ne p1, v4, :cond_3
a=0;// 
a=0;//     .line 972
a=0;//     invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 989
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Boolean);v3=(Conflicted);v4=(Integer);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 990
a=0;//     invoke-static {p1}, Landroid/view/SoundEffectConstants;->getContantForFocusDirection(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v3}, Lcom/slidingmenu/lib/CustomViewAbove;->playSoundEffect(I)V
a=0;// 
a=0;//     .line 992
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 973
a=0;//     :cond_3
a=0;//     #v1=(Null);v3=(Reference,Landroid/view/FocusFinder;);v4=(PosByte);
a=0;//     if-ne p1, v5, :cond_1
a=0;// 
a=0;//     .line 976
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-gt v3, v4, :cond_4
a=0;// 
a=0;//     .line 977
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->pageRight()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 978
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 979
a=0;//     :cond_4
a=0;//     #v1=(Null);v3=(Conflicted);
a=0;//     invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 982
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Null);v3=(Reference,Landroid/view/FocusFinder;);v4=(PosByte);
a=0;//     if-eq p1, v4, :cond_6
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     if-ne p1, v3, :cond_7
a=0;// 
a=0;//     .line 984
a=0;//     :cond_6
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->pageLeft()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 985
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_7
a=0;//     #v1=(Null);v3=(One);
a=0;//     if-eq p1, v5, :cond_8
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne p1, v3, :cond_1
a=0;// 
a=0;//     .line 987
a=0;//     :cond_8
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->pageRight()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected canScroll(Landroid/view/View;ZIII)Z
a=0;//     .locals 11
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;//     .param p2, "checkV"    # Z
a=0;//     .param p3, "dx"    # I
a=0;//     .param p4, "x"    # I
a=0;//     .param p5, "y"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 901
a=0;//     instance-of v0, p1, Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move-object v7, p1
a=0;// 
a=0;//     .line 902
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     check-cast v7, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 903
a=0;//     .local v7, "group":Landroid/view/ViewGroup;
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getScrollX()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 904
a=0;//     .local v9, "scrollX":I
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getScrollY()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 905
a=0;//     .local v10, "scrollY":I
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual {v7}, Landroid/view/ViewGroup;->getChildCount()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 907
a=0;//     .local v6, "count":I
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v8, v6, -0x1
a=0;// 
a=0;//     .local v8, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Integer);
a=0;//     if-gez v8, :cond_1
a=0;// 
a=0;//     .line 918
a=0;//     .end local v6    # "count":I
a=0;//     .end local v7    # "group":Landroid/view/ViewGroup;
a=0;//     .end local v8    # "i":I
a=0;//     .end local v9    # "scrollX":I
a=0;//     .end local v10    # "scrollY":I
a=0;//     :cond_0
a=0;//     #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     if-eqz p2, :cond_3
a=0;// 
a=0;//     neg-int v0, p3
a=0;// 
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/ViewCompat;->canScrollHorizontally(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     return v0
a=0;// 
a=0;//     .line 908
a=0;//     .restart local v6    # "count":I
a=0;//     .restart local v7    # "group":Landroid/view/ViewGroup;
a=0;//     .restart local v8    # "i":I
a=0;//     .restart local v9    # "scrollX":I
a=0;//     .restart local v10    # "scrollY":I
a=0;//     :cond_1
a=0;//     #v0=(Integer);v6=(Integer);v7=(Reference,Landroid/view/ViewGroup;);v8=(Integer);v9=(Integer);v10=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 909
a=0;//     .local v1, "child":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     add-int v0, p4, v9
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v0, v2, :cond_2
a=0;// 
a=0;//     add-int v0, p4, v9
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-ge v0, v2, :cond_2
a=0;// 
a=0;//     .line 910
a=0;//     add-int v0, p5, v10
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-lt v0, v2, :cond_2
a=0;// 
a=0;//     add-int v0, p5, v10
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-ge v0, v2, :cond_2
a=0;// 
a=0;//     .line 911
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     add-int v0, p4, v9
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int v4, v0, v3
a=0;// 
a=0;//     .line 912
a=0;//     #v4=(Integer);
a=0;//     add-int v0, p5, v10
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     sub-int v5, v0, v3
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     move v3, p3
a=0;// 
a=0;//     .line 911
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/slidingmenu/lib/CustomViewAbove;->canScroll(Landroid/view/View;ZIII)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 912
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 913
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 907
a=0;//     :cond_2
a=0;//     #v0=(Integer);v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     add-int/lit8 v8, v8, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 918
a=0;//     .end local v1    # "child":Landroid/view/View;
a=0;//     .end local v6    # "count":I
a=0;//     .end local v7    # "group":Landroid/view/ViewGroup;
a=0;//     .end local v8    # "i":I
a=0;//     .end local v9    # "scrollX":I
a=0;//     .end local v10    # "scrollY":I
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public clearIgnoredViews()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 293
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mIgnoredViews:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->clear()V
a=0;// 
a=0;//     .line 294
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public computeScroll()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 489
a=0;//     iget-object v4, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v4}, Landroid/widget/Scroller;->isFinished()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     .line 490
a=0;//     iget-object v4, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v4}, Landroid/widget/Scroller;->computeScrollOffset()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 491
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->getScrollX()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 492
a=0;//     .local v0, "oldX":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->getScrollY()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 493
a=0;//     .local v1, "oldY":I
a=0;//     #v1=(Integer);
a=0;//     iget-object v4, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v4}, Landroid/widget/Scroller;->getCurrX()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 494
a=0;//     .local v2, "x":I
a=0;//     #v2=(Integer);
a=0;//     iget-object v4, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/widget/Scroller;->getCurrY()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 496
a=0;//     .local v3, "y":I
a=0;//     #v3=(Integer);
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     if-eq v1, v3, :cond_1
a=0;// 
a=0;//     .line 497
a=0;//     :cond_0
a=0;//     invoke-virtual {p0, v2, v3}, Lcom/slidingmenu/lib/CustomViewAbove;->scrollTo(II)V
a=0;// 
a=0;//     .line 498
a=0;//     invoke-direct {p0, v2}, Lcom/slidingmenu/lib/CustomViewAbove;->pageScrolled(I)V
a=0;// 
a=0;//     .line 502
a=0;//     :cond_1
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->invalidate()V
a=0;// 
a=0;//     .line 509
a=0;//     .end local v0    # "oldX":I
a=0;//     .end local v1    # "oldY":I
a=0;//     .end local v2    # "x":I
a=0;//     .end local v3    # "y":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 508
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Boolean);
a=0;//     invoke-direct {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->completeScroll()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected dispatchDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 3
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     .line 831
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 833
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/slidingmenu/lib/CustomViewBehind;->drawShadow(Landroid/view/View;Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 834
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mContent:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->getPercentOpen()F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-virtual {v0, v1, p1, v2}, Lcom/slidingmenu/lib/CustomViewBehind;->drawFade(Landroid/view/View;Landroid/graphics/Canvas;F)V
a=0;// 
a=0;//     .line 835
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mContent:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->getPercentOpen()F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1, v2}, Lcom/slidingmenu/lib/CustomViewBehind;->drawSelector(Landroid/view/View;Landroid/graphics/Canvas;F)V
a=0;// 
a=0;//     .line 836
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 925
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/slidingmenu/lib/CustomViewAbove;->executeKeyEvent(Landroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_0
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
a=0;// 
a=0;// .method distanceInfluenceForSnapDuration(F)F
a=0;//     .locals 4
a=0;//     .param p1, "f"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 301
a=0;//     const/high16 v0, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-float/2addr p1, v0
a=0;// 
a=0;//     .line 302
a=0;//     float-to-double v0, p1
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     const-wide v2, 0x3fde28c7460698c7L    # 0.4712389167638204
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     mul-double/2addr v0, v2
a=0;// 
a=0;//     double-to-float p1, v0
a=0;// 
a=0;//     .line 303
a=0;//     invoke-static {p1}, Landroid/util/FloatMath;->sin(F)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public executeKeyEvent(Landroid/view/KeyEvent;)Z
a=0;//     .locals 4
a=0;//     .param p1, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 937
a=0;//     #v3=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 938
a=0;//     .local v0, "handled":Z
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 939
a=0;//     invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     sparse-switch v1, :sswitch_data_0
a=0;// 
a=0;//     .line 959
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 941
a=0;//     :sswitch_0
a=0;//     #v0=(Null);v2=(Uninit);
a=0;//     const/16 v1, 0x11
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p0, v1}, Lcom/slidingmenu/lib/CustomViewAbove;->arrowScroll(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 942
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 944
a=0;//     :sswitch_1
a=0;//     #v0=(Null);v1=(Integer);
a=0;//     const/16 v1, 0x42
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p0, v1}, Lcom/slidingmenu/lib/CustomViewAbove;->arrowScroll(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 945
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 947
a=0;//     :sswitch_2
a=0;//     #v0=(Null);v1=(Integer);
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v2, 0xb
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_0
a=0;// 
a=0;//     .line 950
a=0;//     invoke-static {p1}, Landroid/support/v4/view/KeyEventCompat;->hasNoModifiers(Landroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 951
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p0, v1}, Lcom/slidingmenu/lib/CustomViewAbove;->arrowScroll(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 952
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Boolean);
a=0;//     invoke-static {p1, v3}, Landroid/support/v4/view/KeyEventCompat;->hasModifiers(Landroid/view/KeyEvent;I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 953
a=0;//     invoke-virtual {p0, v3}, Lcom/slidingmenu/lib/CustomViewAbove;->arrowScroll(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 939
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x15 -> :sswitch_0
a=0;//         0x16 -> :sswitch_1
a=0;//         0x3d -> :sswitch_2
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method public getBehindWidth()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 343
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 344
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 346
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/slidingmenu/lib/CustomViewBehind;->getBehindWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getChildWidth(I)I
a=0;//     .locals 1
a=0;//     .param p1, "i"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 351
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     .line 357
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     .line 353
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->getBehindWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 355
a=0;//     :pswitch_1
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 351
a=0;//     #v0=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public getContent()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 440
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getContentLeft()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 326
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getCurrentItem()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 212
a=0;//     iget v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getDestScrollX(I)I
a=0;//     .locals 2
a=0;//     .param p1, "page"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 307
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     .line 314
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 310
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/slidingmenu/lib/CustomViewBehind;->getMenuLeft(Landroid/view/View;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 312
a=0;//     :pswitch_1
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 307
a=0;//     #v0=(Unknown);v1=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method protected getPercentOpen()F
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 826
a=0;//     iget v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mScrollX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     sub-float/2addr v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-static {v0}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->getBehindWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     div-float/2addr v0, v1
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getTouchMode()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 572
a=0;//     iget v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mTouchMode:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method initCustomViewAbove()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p0, v3}, Lcom/slidingmenu/lib/CustomViewAbove;->setWillNotDraw(Z)V
a=0;// 
a=0;//     .line 162
a=0;//     const/high16 v3, 0x40000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v3}, Lcom/slidingmenu/lib/CustomViewAbove;->setDescendantFocusability(I)V
a=0;// 
a=0;//     .line 163
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {p0, v3}, Lcom/slidingmenu/lib/CustomViewAbove;->setFocusable(Z)V
a=0;// 
a=0;//     .line 164
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 165
a=0;//     .local v1, "context":Landroid/content/Context;
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     new-instance v3, Landroid/widget/Scroller;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/widget/Scroller;);
a=0;//     sget-object v4, Lcom/slidingmenu/lib/CustomViewAbove;->sInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     invoke-direct {v3, v1, v4}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/Scroller;);
a=0;//     iput-object v3, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     .line 166
a=0;//     invoke-static {v1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 167
a=0;//     .local v0, "configuration":Landroid/view/ViewConfiguration;
a=0;//     #v0=(Reference,Landroid/view/ViewConfiguration;);
a=0;//     invoke-static {v0}, Landroid/support/v4/view/ViewConfigurationCompat;->getScaledPagingTouchSlop(Landroid/view/ViewConfiguration;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mTouchSlop:I
a=0;// 
a=0;//     .line 168
a=0;//     invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     iput v3, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mMinimumVelocity:I
a=0;// 
a=0;//     .line 169
a=0;//     invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     iput v3, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mMaximumVelocity:I
a=0;// 
a=0;//     .line 170
a=0;//     new-instance v3, Lcom/slidingmenu/lib/CustomViewAbove$2;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/slidingmenu/lib/CustomViewAbove$2;);
a=0;//     invoke-direct {v3, p0}, Lcom/slidingmenu/lib/CustomViewAbove$2;-><init>(Lcom/slidingmenu/lib/CustomViewAbove;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/slidingmenu/lib/CustomViewAbove$2;);
a=0;//     invoke-virtual {p0, v3}, Lcom/slidingmenu/lib/CustomViewAbove;->setInternalPageChangeListener(Lcom/slidingmenu/lib/CustomViewAbove$OnPageChangeListener;)Lcom/slidingmenu/lib/CustomViewAbove$OnPageChangeListener;
a=0;// 
a=0;//     .line 186
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget v2, v3, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     .line 187
a=0;//     .local v2, "density":F
a=0;//     #v2=(Integer);
a=0;//     const/high16 v3, 0x41c80000    # 25.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-float/2addr v3, v2
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mFlingDistance:I
a=0;// 
a=0;//     .line 188
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public isMenuOpen()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 330
a=0;//     iget v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mCurItem:I
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isSlidingEnabled()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 362
a=0;//     iget-boolean v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mEnabled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 9
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 616
a=0;//     #v2=(Null);
a=0;//     iget-boolean v4, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mEnabled:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 663
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v4=(PosByte);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 619
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Null);v4=(Boolean);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     and-int/lit16 v0, v4, 0xff
a=0;// 
a=0;//     .line 625
a=0;//     .local v0, "action":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-eq v0, v4, :cond_2
a=0;// 
a=0;//     if-eq v0, v3, :cond_2
a=0;// 
a=0;//     .line 626
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-boolean v4, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mIsUnableToDrag:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 627
a=0;//     :cond_2
a=0;//     #v4=(PosByte);
a=0;//     invoke-direct {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->endDrag()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 631
a=0;//     :cond_3
a=0;//     sparse-switch v0, :sswitch_data_0
a=0;// 
a=0;//     .line 657
a=0;//     :cond_4
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v4=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget-boolean v4, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_6
a=0;// 
a=0;//     .line 658
a=0;//     iget-object v4, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/VelocityTracker;);
a=0;//     if-nez v4, :cond_5
a=0;// 
a=0;//     .line 659
a=0;//     invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     .line 661
a=0;//     :cond_5
a=0;//     iget-object v4, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     invoke-virtual {v4, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     .line 663
a=0;//     :cond_6
a=0;//     #v4=(Conflicted);
a=0;//     iget-boolean v4, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_7
a=0;// 
a=0;//     iget-boolean v4, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mQuickReturn:Z
a=0;// 
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     :cond_7
a=0;//     move v2, v3
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 633
a=0;//     :sswitch_0
a=0;//     #v1=(Uninit);v2=(Null);v4=(PosByte);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     invoke-direct {p0, p1}, Lcom/slidingmenu/lib/CustomViewAbove;->determineDrag(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 636
a=0;//     :sswitch_1
a=0;//     invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 637
a=0;//     .local v1, "index":I
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p1, v1}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mActivePointerId:I
a=0;// 
a=0;//     .line 638
a=0;//     iget v4, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mActivePointerId:I
a=0;// 
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-eq v4, v5, :cond_4
a=0;// 
a=0;//     .line 640
a=0;//     invoke-static {p1, v1}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iput v4, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mInitialMotionX:F
a=0;// 
a=0;//     iput v4, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mLastMotionX:F
a=0;// 
a=0;//     .line 641
a=0;//     invoke-static {p1, v1}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     iput v4, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mLastMotionY:F
a=0;// 
a=0;//     .line 642
a=0;//     invoke-direct {p0, p1}, Lcom/slidingmenu/lib/CustomViewAbove;->thisTouchAllowed(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_8
a=0;// 
a=0;//     .line 643
a=0;//     iput-boolean v2, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mIsBeingDragged:Z
a=0;// 
a=0;//     .line 644
a=0;//     iput-boolean v2, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mIsUnableToDrag:Z
a=0;// 
a=0;//     .line 645
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->isMenuOpen()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     iget-object v4, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v4=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     iget-object v5, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     iget v6, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mCurItem:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Float);
a=0;//     iget v8, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mScrollX:F
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     add-float/2addr v7, v8
a=0;// 
a=0;//     invoke-virtual {v4, v5, v6, v7}, Lcom/slidingmenu/lib/CustomViewBehind;->menuTouchInQuickReturn(Landroid/view/View;IF)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     .line 646
a=0;//     iput-boolean v3, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mQuickReturn:Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 649
a=0;//     :cond_8
a=0;//     #v5=(Byte);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     iput-boolean v3, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mIsUnableToDrag:Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 653
a=0;//     .end local v1    # "index":I
a=0;//     :sswitch_2
a=0;//     #v1=(Uninit);v4=(PosByte);v5=(Uninit);
a=0;//     invoke-direct {p0, p1}, Lcom/slidingmenu/lib/CustomViewAbove;->onSecondaryPointerUp(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 631
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x0 -> :sswitch_1
a=0;//         0x2 -> :sswitch_0
a=0;//         0x6 -> :sswitch_2
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onLayout(ZIIII)V
a=0;//     .locals 4
a=0;//     .param p1, "changed"    # Z
a=0;//     .param p2, "l"    # I
a=0;//     .param p3, "t"    # I
a=0;//     .param p4, "r"    # I
a=0;//     .param p5, "b"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 474
a=0;//     #v3=(Null);
a=0;//     sub-int v1, p4, p2
a=0;// 
a=0;//     .line 475
a=0;//     .local v1, "width":I
a=0;//     #v1=(Integer);
a=0;//     sub-int v0, p5, p3
a=0;// 
a=0;//     .line 476
a=0;//     .local v0, "height":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v2, v3, v3, v1, v0}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     .line 477
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 5
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 450
a=0;//     #v4=(Null);
a=0;//     invoke-static {v4, p1}, Lcom/slidingmenu/lib/CustomViewAbove;->getDefaultSize(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 451
a=0;//     .local v3, "width":I
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v4, p2}, Lcom/slidingmenu/lib/CustomViewAbove;->getDefaultSize(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 452
a=0;//     .local v2, "height":I
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v3, v2}, Lcom/slidingmenu/lib/CustomViewAbove;->setMeasuredDimension(II)V
a=0;// 
a=0;//     .line 454
a=0;//     invoke-static {p1, v4, v3}, Lcom/slidingmenu/lib/CustomViewAbove;->getChildMeasureSpec(III)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 455
a=0;//     .local v1, "contentWidth":I
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p2, v4, v2}, Lcom/slidingmenu/lib/CustomViewAbove;->getChildMeasureSpec(III)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 456
a=0;//     .local v0, "contentHeight":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v4, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v4, v1, v0}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 457
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPageScrolled(IFI)V
a=0;//     .locals 1
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "offset"    # F
a=0;//     .param p3, "offsetPixels"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 533
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mOnPageChangeListener:Lcom/slidingmenu/lib/CustomViewAbove$OnPageChangeListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove$OnPageChangeListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 534
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mOnPageChangeListener:Lcom/slidingmenu/lib/CustomViewAbove$OnPageChangeListener;
a=0;// 
a=0;//     invoke-interface {v0, p1, p2, p3}, Lcom/slidingmenu/lib/CustomViewAbove$OnPageChangeListener;->onPageScrolled(IFI)V
a=0;// 
a=0;//     .line 536
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mInternalPageChangeListener:Lcom/slidingmenu/lib/CustomViewAbove$OnPageChangeListener;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 537
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mInternalPageChangeListener:Lcom/slidingmenu/lib/CustomViewAbove$OnPageChangeListener;
a=0;// 
a=0;//     invoke-interface {v0, p1, p2, p3}, Lcom/slidingmenu/lib/CustomViewAbove$OnPageChangeListener;->onPageScrolled(IFI)V
a=0;// 
a=0;//     .line 539
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onSizeChanged(IIII)V
a=0;//     .locals 2
a=0;//     .param p1, "w"    # I
a=0;//     .param p2, "h"    # I
a=0;//     .param p3, "oldw"    # I
a=0;//     .param p4, "oldh"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 461
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->onSizeChanged(IIII)V
a=0;// 
a=0;//     .line 463
a=0;//     if-eq p1, p3, :cond_0
a=0;// 
a=0;//     .line 467
a=0;//     invoke-direct {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->completeScroll()V
a=0;// 
a=0;//     .line 468
a=0;//     iget v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/slidingmenu/lib/CustomViewAbove;->getDestScrollX(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->getScrollY()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/slidingmenu/lib/CustomViewAbove;->scrollTo(II)V
a=0;// 
a=0;//     .line 470
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 25
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 670
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     iget-boolean v0, v0, Lcom/slidingmenu/lib/CustomViewAbove;->mEnabled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     #v20=(Boolean);
a=0;//     if-nez v20, :cond_0
a=0;// 
a=0;//     .line 671
a=0;//     const/16 v20, 0x0
a=0;// 
a=0;//     .line 777
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);
a=0;//     return v20
a=0;// 
a=0;//     .line 673
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Uninit);v24=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     iget-boolean v0, v0, Lcom/slidingmenu/lib/CustomViewAbove;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     if-nez v20, :cond_1
a=0;// 
a=0;//     invoke-direct/range {p0 .. p1}, Lcom/slidingmenu/lib/CustomViewAbove;->thisTouchAllowed(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     if-nez v20, :cond_1
a=0;// 
a=0;//     .line 674
a=0;//     const/16 v20, 0x0
a=0;// 
a=0;//     #v20=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 679
a=0;//     :cond_1
a=0;//     #v20=(Boolean);
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 681
a=0;//     .local v4, "action":I
a=0;//     #v4=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     iget-object v0, v0, Lcom/slidingmenu/lib/CustomViewAbove;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     move-object/from16 v20, v0
a=0;// 
a=0;//     #v20=(Reference,Landroid/view/VelocityTracker;);
a=0;//     if-nez v20, :cond_2
a=0;// 
a=0;//     .line 682
a=0;//     invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     iput-object v0, v1, Lcom/slidingmenu/lib/CustomViewAbove;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     .line 684
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/slidingmenu/lib/CustomViewAbove;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     move-object/from16 v20, v0
a=0;// 
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/MotionEvent;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     .line 686
a=0;//     and-int/lit16 v0, v4, 0xff
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     packed-switch v20, :pswitch_data_0
a=0;// 
a=0;//     .line 777
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);
a=0;//     const/16 v20, 0x1
a=0;// 
a=0;//     #v20=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 692
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Reference,Landroid/view/MotionEvent;);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Integer);v21=(Uninit);v22=(Uninit);v23=(Uninit);v24=(Uninit);
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/slidingmenu/lib/CustomViewAbove;->completeScroll()V
a=0;// 
a=0;//     .line 695
a=0;//     invoke-static/range {p1 .. p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 696
a=0;//     .local v7, "index":I
a=0;//     #v7=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MotionEvent;);
a=0;//     invoke-static {v0, v7}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput v0, v1, Lcom/slidingmenu/lib/CustomViewAbove;->mActivePointerId:I
a=0;// 
a=0;//     .line 697
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     #v20=(Float);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput v0, v1, Lcom/slidingmenu/lib/CustomViewAbove;->mInitialMotionX:F
a=0;// 
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput v0, v1, Lcom/slidingmenu/lib/CustomViewAbove;->mLastMotionX:F
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 700
a=0;//     .end local v7    # "index":I
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);v7=(Uninit);v20=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     iget-boolean v0, v0, Lcom/slidingmenu/lib/CustomViewAbove;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     #v20=(Boolean);
a=0;//     if-nez v20, :cond_4
a=0;// 
a=0;//     .line 701
a=0;//     invoke-direct/range {p0 .. p1}, Lcom/slidingmenu/lib/CustomViewAbove;->determineDrag(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     .line 702
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     iget-boolean v0, v0, Lcom/slidingmenu/lib/CustomViewAbove;->mIsUnableToDrag:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     if-eqz v20, :cond_4
a=0;// 
a=0;//     .line 703
a=0;//     const/16 v20, 0x0
a=0;// 
a=0;//     #v20=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 705
a=0;//     :cond_4
a=0;//     #v20=(Boolean);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     iget-boolean v0, v0, Lcom/slidingmenu/lib/CustomViewAbove;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     if-eqz v20, :cond_3
a=0;// 
a=0;//     .line 707
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     iget v0, v0, Lcom/slidingmenu/lib/CustomViewAbove;->mActivePointerId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     move/from16 v2, v20
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/slidingmenu/lib/CustomViewAbove;->getPointerIndex(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 708
a=0;//     .local v5, "activePointerIndex":I
a=0;//     #v5=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Lcom/slidingmenu/lib/CustomViewAbove;->mActivePointerId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     const/16 v21, -0x1
a=0;// 
a=0;//     #v21=(Byte);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-eq v0, v1, :cond_3
a=0;// 
a=0;//     .line 710
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MotionEvent;);
a=0;//     invoke-static {v0, v5}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     .line 711
a=0;//     .local v19, "x":F
a=0;//     #v19=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Lcom/slidingmenu/lib/CustomViewAbove;->mLastMotionX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     sub-float v6, v20, v19
a=0;// 
a=0;//     .line 712
a=0;//     .local v6, "deltaX":F
a=0;//     #v6=(Float);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     iput v0, v1, Lcom/slidingmenu/lib/CustomViewAbove;->mLastMotionX:F
a=0;// 
a=0;//     .line 713
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/slidingmenu/lib/CustomViewAbove;->getScrollX()I
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v12, v0
a=0;// 
a=0;//     .line 714
a=0;//     .local v12, "oldScrollX":F
a=0;//     #v12=(Float);
a=0;//     add-float v16, v12, v6
a=0;// 
a=0;//     .line 715
a=0;//     .local v16, "scrollX":F
a=0;//     #v16=(Float);
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/slidingmenu/lib/CustomViewAbove;->getLeftBound()I
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     int-to-float v10, v0
a=0;// 
a=0;//     .line 716
a=0;//     .local v10, "leftBound":F
a=0;//     #v10=(Float);
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/slidingmenu/lib/CustomViewAbove;->getRightBound()I
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     int-to-float v15, v0
a=0;// 
a=0;//     .line 717
a=0;//     .local v15, "rightBound":F
a=0;//     #v15=(Float);
a=0;//     cmpg-float v20, v16, v10
a=0;// 
a=0;//     #v20=(Byte);
a=0;//     if-gez v20, :cond_6
a=0;// 
a=0;//     .line 718
a=0;//     move/from16 v16, v10
a=0;// 
a=0;//     .line 723
a=0;//     :cond_5
a=0;//     :goto_2
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     iget v0, v0, Lcom/slidingmenu/lib/CustomViewAbove;->mLastMotionX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     #v21=(Float);
a=0;//     sub-float v21, v16, v21
a=0;// 
a=0;//     add-float v20, v20, v21
a=0;// 
a=0;//     #v20=(Float);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput v0, v1, Lcom/slidingmenu/lib/CustomViewAbove;->mLastMotionX:F
a=0;// 
a=0;//     .line 724
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/slidingmenu/lib/CustomViewAbove;->getScrollY()I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v21
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/slidingmenu/lib/CustomViewAbove;->scrollTo(II)V
a=0;// 
a=0;//     .line 725
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcom/slidingmenu/lib/CustomViewAbove;->pageScrolled(I)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 719
a=0;//     :cond_6
a=0;//     #v0=(Integer);v1=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);v20=(Byte);v21=(Byte);
a=0;//     cmpl-float v20, v16, v15
a=0;// 
a=0;//     if-lez v20, :cond_5
a=0;// 
a=0;//     .line 720
a=0;//     move/from16 v16, v15
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 729
a=0;//     .end local v5    # "activePointerIndex":I
a=0;//     .end local v6    # "deltaX":F
a=0;//     .end local v10    # "leftBound":F
a=0;//     .end local v12    # "oldScrollX":F
a=0;//     .end local v15    # "rightBound":F
a=0;//     .end local v16    # "scrollX":F
a=0;//     .end local v19    # "x":F
a=0;//     :pswitch_3
a=0;//     #v2=(Uninit);v5=(Uninit);v6=(Uninit);v10=(Uninit);v12=(Uninit);v15=(Uninit);v16=(Uninit);v19=(Uninit);v20=(Integer);v21=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     iget-boolean v0, v0, Lcom/slidingmenu/lib/CustomViewAbove;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     #v20=(Boolean);
a=0;//     if-eqz v20, :cond_8
a=0;// 
a=0;//     .line 730
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     iget-object v0, v0, Lcom/slidingmenu/lib/CustomViewAbove;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     .line 731
a=0;//     .local v18, "velocityTracker":Landroid/view/VelocityTracker;
a=0;//     #v18=(Reference,Landroid/view/VelocityTracker;);
a=0;//     const/16 v20, 0x3e8
a=0;// 
a=0;//     #v20=(PosShort);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Lcom/slidingmenu/lib/CustomViewAbove;->mMaximumVelocity:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     #v21=(Float);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     move/from16 v2, v21
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V
a=0;// 
a=0;//     .line 733
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Lcom/slidingmenu/lib/CustomViewAbove;->mActivePointerId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     .line 732
a=0;//     #v20=(Integer);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/view/VelocityTrackerCompat;->getXVelocity(Landroid/view/VelocityTracker;I)F
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     #v20=(Float);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v9, v0
a=0;// 
a=0;//     .line 734
a=0;//     .local v9, "initialVelocity":I
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/slidingmenu/lib/CustomViewAbove;->getScrollX()I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     .line 738
a=0;//     .local v16, "scrollX":I
a=0;//     #v16=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     iget v0, v0, Lcom/slidingmenu/lib/CustomViewAbove;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/slidingmenu/lib/CustomViewAbove;->getDestScrollX(I)I
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     sub-int v20, v16, v20
a=0;// 
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     #v20=(Float);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/slidingmenu/lib/CustomViewAbove;->getBehindWidth()I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     #v21=(Float);
a=0;//     div-float v13, v20, v21
a=0;// 
a=0;//     .line 739
a=0;//     .local v13, "pageOffset":F
a=0;//     #v13=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     iget v0, v0, Lcom/slidingmenu/lib/CustomViewAbove;->mActivePointerId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/MotionEvent;);
a=0;//     move/from16 v2, v20
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/slidingmenu/lib/CustomViewAbove;->getPointerIndex(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 740
a=0;//     .restart local v5    # "activePointerIndex":I
a=0;//     #v5=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Lcom/slidingmenu/lib/CustomViewAbove;->mActivePointerId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     const/16 v21, -0x1
a=0;// 
a=0;//     #v21=(Byte);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-eq v0, v1, :cond_7
a=0;// 
a=0;//     .line 741
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MotionEvent;);
a=0;//     invoke-static {v0, v5}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     .line 742
a=0;//     .restart local v19    # "x":F
a=0;//     #v19=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Lcom/slidingmenu/lib/CustomViewAbove;->mInitialMotionX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     sub-float v20, v19, v20
a=0;// 
a=0;//     #v20=(Float);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     .line 743
a=0;//     .local v17, "totalDelta":I
a=0;//     #v17=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     move/from16 v1, v17
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v0, v13, v9, v1}, Lcom/slidingmenu/lib/CustomViewAbove;->determineTargetPage(FII)I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 744
a=0;//     .local v11, "nextPage":I
a=0;//     #v11=(Integer);
a=0;//     const/16 v20, 0x1
a=0;// 
a=0;//     #v20=(One);
a=0;//     const/16 v21, 0x1
a=0;// 
a=0;//     #v21=(One);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(One);
a=0;//     move/from16 v2, v21
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v11, v1, v2, v9}, Lcom/slidingmenu/lib/CustomViewAbove;->setCurrentItemInternal(IZZI)V
a=0;// 
a=0;//     .line 748
a=0;//     .end local v11    # "nextPage":I
a=0;//     .end local v17    # "totalDelta":I
a=0;//     .end local v19    # "x":F
a=0;//     :goto_3
a=0;//     #v1=(Integer);v3=(Conflicted);v11=(Conflicted);v17=(Conflicted);v19=(Conflicted);v20=(Integer);v22=(Conflicted);
a=0;//     const/16 v20, -0x1
a=0;// 
a=0;//     #v20=(Byte);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     iput v0, v1, Lcom/slidingmenu/lib/CustomViewAbove;->mActivePointerId:I
a=0;// 
a=0;//     .line 749
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/slidingmenu/lib/CustomViewAbove;->endDrag()V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 746
a=0;//     :cond_7
a=0;//     #v0=(Integer);v1=(Byte);v2=(Integer);v3=(Uninit);v11=(Uninit);v17=(Uninit);v19=(Uninit);v20=(Integer);v21=(Byte);v22=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     iget v0, v0, Lcom/slidingmenu/lib/CustomViewAbove;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     const/16 v21, 0x1
a=0;// 
a=0;//     #v21=(One);
a=0;//     const/16 v22, 0x1
a=0;// 
a=0;//     #v22=(One);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v21
a=0;// 
a=0;//     #v2=(One);
a=0;//     move/from16 v3, v22
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v0, v1, v2, v3, v9}, Lcom/slidingmenu/lib/CustomViewAbove;->setCurrentItemInternal(IZZI)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 750
a=0;//     .end local v5    # "activePointerIndex":I
a=0;//     .end local v9    # "initialVelocity":I
a=0;//     .end local v13    # "pageOffset":F
a=0;//     .end local v16    # "scrollX":I
a=0;//     .end local v18    # "velocityTracker":Landroid/view/VelocityTracker;
a=0;//     :cond_8
a=0;//     #v0=(Boolean);v1=(Reference,Landroid/view/MotionEvent;);v2=(Uninit);v3=(Uninit);v5=(Uninit);v9=(Uninit);v13=(Uninit);v16=(Uninit);v18=(Uninit);v20=(Boolean);v21=(Uninit);v22=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     iget-boolean v0, v0, Lcom/slidingmenu/lib/CustomViewAbove;->mQuickReturn:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     if-eqz v20, :cond_3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     iget-object v0, v0, Lcom/slidingmenu/lib/CustomViewAbove;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     move-object/from16 v20, v0
a=0;// 
a=0;//     #v20=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/slidingmenu/lib/CustomViewAbove;->mContent:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v21, v0
a=0;// 
a=0;//     #v21=(Reference,Landroid/view/View;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Lcom/slidingmenu/lib/CustomViewAbove;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     #v23=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     iget v0, v0, Lcom/slidingmenu/lib/CustomViewAbove;->mScrollX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     #v24=(Integer);
a=0;//     add-float v23, v23, v24
a=0;// 
a=0;//     invoke-virtual/range {v20 .. v23}, Lcom/slidingmenu/lib/CustomViewBehind;->menuTouchInQuickReturn(Landroid/view/View;IF)Z
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     #v20=(Boolean);
a=0;//     if-eqz v20, :cond_3
a=0;// 
a=0;//     .line 752
a=0;//     const/16 v20, 0x1
a=0;// 
a=0;//     #v20=(One);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Lcom/slidingmenu/lib/CustomViewAbove;->setCurrentItem(I)V
a=0;// 
a=0;//     .line 753
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/slidingmenu/lib/CustomViewAbove;->endDrag()V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 757
a=0;//     :pswitch_4
a=0;//     #v0=(Integer);v1=(Reference,Landroid/view/MotionEvent;);v20=(Integer);v21=(Uninit);v22=(Uninit);v23=(Uninit);v24=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     iget-boolean v0, v0, Lcom/slidingmenu/lib/CustomViewAbove;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     #v20=(Boolean);
a=0;//     if-eqz v20, :cond_3
a=0;// 
a=0;//     .line 758
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     iget v0, v0, Lcom/slidingmenu/lib/CustomViewAbove;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     const/16 v21, 0x1
a=0;// 
a=0;//     #v21=(One);
a=0;//     const/16 v22, 0x1
a=0;// 
a=0;//     #v22=(One);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v21
a=0;// 
a=0;//     #v2=(One);
a=0;//     move/from16 v3, v22
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lcom/slidingmenu/lib/CustomViewAbove;->setCurrentItemInternal(IZZ)V
a=0;// 
a=0;//     .line 759
a=0;//     const/16 v20, -0x1
a=0;// 
a=0;//     #v20=(Byte);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     iput v0, v1, Lcom/slidingmenu/lib/CustomViewAbove;->mActivePointerId:I
a=0;// 
a=0;//     .line 760
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/slidingmenu/lib/CustomViewAbove;->endDrag()V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 764
a=0;//     :pswitch_5
a=0;//     #v0=(Integer);v2=(Uninit);v3=(Uninit);v20=(Integer);v21=(Uninit);v22=(Uninit);
a=0;//     invoke-static/range {p1 .. p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 765
a=0;//     .local v8, "indexx":I
a=0;//     #v8=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MotionEvent;);
a=0;//     invoke-static {v0, v8}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     #v20=(Float);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput v0, v1, Lcom/slidingmenu/lib/CustomViewAbove;->mLastMotionX:F
a=0;// 
a=0;//     .line 766
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MotionEvent;);
a=0;//     invoke-static {v0, v8}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput v0, v1, Lcom/slidingmenu/lib/CustomViewAbove;->mActivePointerId:I
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 770
a=0;//     .end local v8    # "indexx":I
a=0;//     :pswitch_6
a=0;//     #v8=(Uninit);
a=0;//     invoke-direct/range {p0 .. p1}, Lcom/slidingmenu/lib/CustomViewAbove;->onSecondaryPointerUp(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     .line 771
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     iget v0, v0, Lcom/slidingmenu/lib/CustomViewAbove;->mActivePointerId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     move/from16 v2, v20
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/slidingmenu/lib/CustomViewAbove;->getPointerIndex(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 772
a=0;//     .local v14, "pointerIndex":I
a=0;//     #v14=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Lcom/slidingmenu/lib/CustomViewAbove;->mActivePointerId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     const/16 v21, -0x1
a=0;// 
a=0;//     #v21=(Byte);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-eq v0, v1, :cond_3
a=0;// 
a=0;//     .line 774
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MotionEvent;);
a=0;//     invoke-static {v0, v14}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     #v20=(Float);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/slidingmenu/lib/CustomViewAbove;);
a=0;//     iput v0, v1, Lcom/slidingmenu/lib/CustomViewAbove;->mLastMotionX:F
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 686
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_3
a=0;//         :pswitch_2
a=0;//         :pswitch_4
a=0;//         :pswitch_0
a=0;//         :pswitch_5
a=0;//         :pswitch_6
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method pageLeft()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 996
a=0;//     #v0=(One);
a=0;//     iget v1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mCurItem:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 997
a=0;//     iget v1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mCurItem:I
a=0;// 
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     invoke-virtual {p0, v1, v0}, Lcom/slidingmenu/lib/CustomViewAbove;->setCurrentItem(IZ)V
a=0;// 
a=0;//     .line 1000
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method pageRight()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 1004
a=0;//     #v0=(One);
a=0;//     iget v1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mCurItem:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v1, v0, :cond_0
a=0;// 
a=0;//     .line 1005
a=0;//     iget v1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mCurItem:I
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     invoke-virtual {p0, v1, v0}, Lcom/slidingmenu/lib/CustomViewAbove;->setCurrentItem(IZ)V
a=0;// 
a=0;//     .line 1008
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public removeIgnoredView(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 289
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mIgnoredViews:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 290
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public scrollTo(II)V
a=0;//     .locals 2
a=0;//     .param p1, "x"    # I
a=0;//     .param p2, "y"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 804
a=0;//     invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->scrollTo(II)V
a=0;// 
a=0;//     .line 805
a=0;//     int-to-float v0, p1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mScrollX:F
a=0;// 
a=0;//     .line 806
a=0;//     iget-boolean v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mEnabled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 807
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/slidingmenu/lib/CustomViewBehind;->scrollBehindTo(Landroid/view/View;II)V
a=0;// 
a=0;//     .line 808
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewParent;);
a=0;//     check-cast v0, Lcom/slidingmenu/lib/SlidingMenu;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->getPercentOpen()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {v0, v1}, Lcom/slidingmenu/lib/SlidingMenu;->manageLayers(F)V
a=0;// 
a=0;//     .line 809
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAboveOffset(I)V
a=0;//     .locals 4
a=0;//     .param p1, "i"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 482
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 483
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getPaddingRight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 482
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, p1, v1, v2, v3}, Landroid/view/View;->setPadding(IIII)V
a=0;// 
a=0;//     .line 484
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setContent(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 433
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 434
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mContent:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/slidingmenu/lib/CustomViewAbove;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 435
a=0;//     :cond_0
a=0;//     iput-object p1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mContent:Landroid/view/View;
a=0;// 
a=0;//     .line 436
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mContent:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/slidingmenu/lib/CustomViewAbove;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 437
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setCurrentItem(I)V
a=0;//     .locals 2
a=0;//     .param p1, "item"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 198
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, p1, v0, v1}, Lcom/slidingmenu/lib/CustomViewAbove;->setCurrentItemInternal(IZZ)V
a=0;// 
a=0;//     .line 199
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setCurrentItem(IZ)V
a=0;//     .locals 1
a=0;//     .param p1, "item"    # I
a=0;//     .param p2, "smoothScroll"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 208
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, p2, v0}, Lcom/slidingmenu/lib/CustomViewAbove;->setCurrentItemInternal(IZZ)V
a=0;// 
a=0;//     .line 209
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setCurrentItemInternal(IZZ)V
a=0;//     .locals 1
a=0;//     .param p1, "item"    # I
a=0;//     .param p2, "smoothScroll"    # Z
a=0;//     .param p3, "always"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 216
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, p2, p3, v0}, Lcom/slidingmenu/lib/CustomViewAbove;->setCurrentItemInternal(IZZI)V
a=0;// 
a=0;//     .line 217
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setCurrentItemInternal(IZZI)V
a=0;//     .locals 4
a=0;//     .param p1, "item"    # I
a=0;//     .param p2, "smoothScroll"    # Z
a=0;//     .param p3, "always"    # Z
a=0;//     .param p4, "velocity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 220
a=0;//     #v2=(Null);
a=0;//     if-nez p3, :cond_0
a=0;// 
a=0;//     iget v3, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mCurItem:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, p1, :cond_0
a=0;// 
a=0;//     .line 221
a=0;//     invoke-direct {p0, v2}, Lcom/slidingmenu/lib/CustomViewAbove;->setScrollingCacheEnabled(Z)V
a=0;// 
a=0;//     .line 242
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 225
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iget-object v3, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     #v3=(Reference,Lcom/slidingmenu/lib/CustomViewBehind;);
a=0;//     invoke-virtual {v3, p1}, Lcom/slidingmenu/lib/CustomViewBehind;->getMenuPage(I)I
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     .line 227
a=0;//     iget v3, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mCurItem:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eq v3, p1, :cond_3
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 228
a=0;//     .local v1, "dispatchSelected":Z
a=0;//     :goto_1
a=0;//     #v1=(Boolean);
a=0;//     iput p1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mCurItem:I
a=0;// 
a=0;//     .line 229
a=0;//     iget v3, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mCurItem:I
a=0;// 
a=0;//     invoke-virtual {p0, v3}, Lcom/slidingmenu/lib/CustomViewAbove;->getDestScrollX(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 230
a=0;//     .local v0, "destX":I
a=0;//     #v0=(Integer);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v3, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mOnPageChangeListener:Lcom/slidingmenu/lib/CustomViewAbove$OnPageChangeListener;
a=0;// 
a=0;//     #v3=(Reference,Lcom/slidingmenu/lib/CustomViewAbove$OnPageChangeListener;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 231
a=0;//     iget-object v3, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mOnPageChangeListener:Lcom/slidingmenu/lib/CustomViewAbove$OnPageChangeListener;
a=0;// 
a=0;//     invoke-interface {v3, p1}, Lcom/slidingmenu/lib/CustomViewAbove$OnPageChangeListener;->onPageSelected(I)V
a=0;// 
a=0;//     .line 233
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mInternalPageChangeListener:Lcom/slidingmenu/lib/CustomViewAbove$OnPageChangeListener;
a=0;// 
a=0;//     #v3=(Reference,Lcom/slidingmenu/lib/CustomViewAbove$OnPageChangeListener;);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 234
a=0;//     iget-object v3, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mInternalPageChangeListener:Lcom/slidingmenu/lib/CustomViewAbove$OnPageChangeListener;
a=0;// 
a=0;//     invoke-interface {v3, p1}, Lcom/slidingmenu/lib/CustomViewAbove$OnPageChangeListener;->onPageSelected(I)V
a=0;// 
a=0;//     .line 236
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     if-eqz p2, :cond_4
a=0;// 
a=0;//     .line 237
a=0;//     invoke-virtual {p0, v0, v2, p4}, Lcom/slidingmenu/lib/CustomViewAbove;->smoothScrollTo(III)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .end local v0    # "destX":I
a=0;//     .end local v1    # "dispatchSelected":Z
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Integer);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 227
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 239
a=0;//     .restart local v0    # "destX":I
a=0;//     .restart local v1    # "dispatchSelected":Z
a=0;//     :cond_4
a=0;//     #v0=(Integer);v1=(Boolean);v3=(Conflicted);
a=0;//     invoke-direct {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->completeScroll()V
a=0;// 
a=0;//     .line 240
a=0;//     invoke-virtual {p0, v0, v2}, Lcom/slidingmenu/lib/CustomViewAbove;->scrollTo(II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setCustomViewBehind(Lcom/slidingmenu/lib/CustomViewBehind;)V
a=0;//     .locals 0
a=0;//     .param p1, "cvb"    # Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     .prologue
a=0;//     .line 444
a=0;//     iput-object p1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mViewBehind:Lcom/slidingmenu/lib/CustomViewBehind;
a=0;// 
a=0;//     .line 445
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setInternalPageChangeListener(Lcom/slidingmenu/lib/CustomViewAbove$OnPageChangeListener;)Lcom/slidingmenu/lib/CustomViewAbove$OnPageChangeListener;
a=0;//     .locals 1
a=0;//     .param p1, "listener"    # Lcom/slidingmenu/lib/CustomViewAbove$OnPageChangeListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 277
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mInternalPageChangeListener:Lcom/slidingmenu/lib/CustomViewAbove$OnPageChangeListener;
a=0;// 
a=0;//     .line 278
a=0;//     .local v0, "oldListener":Lcom/slidingmenu/lib/CustomViewAbove$OnPageChangeListener;
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/CustomViewAbove$OnPageChangeListener;);
a=0;//     iput-object p1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mInternalPageChangeListener:Lcom/slidingmenu/lib/CustomViewAbove$OnPageChangeListener;
a=0;// 
a=0;//     .line 279
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setOnClosedListener(Lcom/slidingmenu/lib/SlidingMenu$OnClosedListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "l"    # Lcom/slidingmenu/lib/SlidingMenu$OnClosedListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 267
a=0;//     iput-object p1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mClosedListener:Lcom/slidingmenu/lib/SlidingMenu$OnClosedListener;
a=0;// 
a=0;//     .line 268
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnOpenedListener(Lcom/slidingmenu/lib/SlidingMenu$OnOpenedListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "l"    # Lcom/slidingmenu/lib/SlidingMenu$OnOpenedListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 263
a=0;//     iput-object p1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mOpenedListener:Lcom/slidingmenu/lib/SlidingMenu$OnOpenedListener;
a=0;// 
a=0;//     .line 264
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnPageChangeListener(Lcom/slidingmenu/lib/CustomViewAbove$OnPageChangeListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Lcom/slidingmenu/lib/CustomViewAbove$OnPageChangeListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 251
a=0;//     iput-object p1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mOnPageChangeListener:Lcom/slidingmenu/lib/CustomViewAbove$OnPageChangeListener;
a=0;// 
a=0;//     .line 252
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSlidingEnabled(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "b"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 366
a=0;//     iput-boolean p1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mEnabled:Z
a=0;// 
a=0;//     .line 367
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTouchMode(I)V
a=0;//     .locals 0
a=0;//     .param p1, "i"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 568
a=0;//     iput p1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mTouchMode:I
a=0;// 
a=0;//     .line 569
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method smoothScrollTo(II)V
a=0;//     .locals 1
a=0;//     .param p1, "x"    # I
a=0;//     .param p2, "y"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 376
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, p2, v0}, Lcom/slidingmenu/lib/CustomViewAbove;->smoothScrollTo(III)V
a=0;// 
a=0;//     .line 377
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method smoothScrollTo(III)V
a=0;//     .locals 14
a=0;//     .param p1, "x"    # I
a=0;//     .param p2, "y"    # I
a=0;//     .param p3, "velocity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 387
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 389
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, v1}, Lcom/slidingmenu/lib/CustomViewAbove;->setScrollingCacheEnabled(Z)V
a=0;// 
a=0;//     .line 430
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ujava/lang/Object;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 392
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->getScrollX()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 393
a=0;//     .local v2, "sx":I
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->getScrollY()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 394
a=0;//     .local v3, "sy":I
a=0;//     #v3=(Integer);
a=0;//     sub-int v4, p1, v2
a=0;// 
a=0;//     .line 395
a=0;//     .local v4, "dx":I
a=0;//     #v4=(Integer);
a=0;//     sub-int v5, p2, v3
a=0;// 
a=0;//     .line 396
a=0;//     .local v5, "dy":I
a=0;//     #v5=(Integer);
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     if-nez v5, :cond_3
a=0;// 
a=0;//     .line 397
a=0;//     invoke-direct {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->completeScroll()V
a=0;// 
a=0;//     .line 398
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->isMenuOpen()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 399
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mOpenedListener:Lcom/slidingmenu/lib/SlidingMenu$OnOpenedListener;
a=0;// 
a=0;//     #v1=(Reference,Lcom/slidingmenu/lib/SlidingMenu$OnOpenedListener;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 400
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mOpenedListener:Lcom/slidingmenu/lib/SlidingMenu$OnOpenedListener;
a=0;// 
a=0;//     invoke-interface {v1}, Lcom/slidingmenu/lib/SlidingMenu$OnOpenedListener;->onOpened()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 402
a=0;//     :cond_2
a=0;//     #v1=(Boolean);
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mClosedListener:Lcom/slidingmenu/lib/SlidingMenu$OnClosedListener;
a=0;// 
a=0;//     #v1=(Reference,Lcom/slidingmenu/lib/SlidingMenu$OnClosedListener;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 403
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mClosedListener:Lcom/slidingmenu/lib/SlidingMenu$OnClosedListener;
a=0;// 
a=0;//     invoke-interface {v1}, Lcom/slidingmenu/lib/SlidingMenu$OnClosedListener;->onClosed()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 408
a=0;//     :cond_3
a=0;//     #v1=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-direct {p0, v1}, Lcom/slidingmenu/lib/CustomViewAbove;->setScrollingCacheEnabled(Z)V
a=0;// 
a=0;//     .line 409
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     iput-boolean v1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mScrolling:Z
a=0;// 
a=0;//     .line 411
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->getBehindWidth()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 412
a=0;//     .local v11, "width":I
a=0;//     #v11=(Integer);
a=0;//     div-int/lit8 v9, v11, 0x2
a=0;// 
a=0;//     .line 413
a=0;//     .local v9, "halfWidth":I
a=0;//     #v9=(Integer);
a=0;//     const/high16 v1, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/high16 v12, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     int-to-float v13, v13
a=0;// 
a=0;//     #v13=(Float);
a=0;//     mul-float/2addr v12, v13
a=0;// 
a=0;//     #v12=(Float);
a=0;//     int-to-float v13, v11
a=0;// 
a=0;//     div-float/2addr v12, v13
a=0;// 
a=0;//     invoke-static {v1, v12}, Ljava/lang/Math;->min(FF)F
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 414
a=0;//     .local v8, "distanceRatio":F
a=0;//     #v8=(Float);
a=0;//     int-to-float v1, v9
a=0;// 
a=0;//     #v1=(Float);
a=0;//     int-to-float v12, v9
a=0;// 
a=0;//     .line 415
a=0;//     invoke-virtual {p0, v8}, Lcom/slidingmenu/lib/CustomViewAbove;->distanceInfluenceForSnapDuration(F)F
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     mul-float/2addr v12, v13
a=0;// 
a=0;//     .line 414
a=0;//     add-float v7, v1, v12
a=0;// 
a=0;//     .line 417
a=0;//     .local v7, "distance":F
a=0;//     #v7=(Float);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 418
a=0;//     .local v6, "duration":I
a=0;//     #v6=(Null);
a=0;//     invoke-static/range {p3 .. p3}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result p3
a=0;// 
a=0;//     .line 419
a=0;//     if-lez p3, :cond_4
a=0;// 
a=0;//     .line 420
a=0;//     const/high16 v1, 0x447a0000    # 1000.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v0, p3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v12, v0
a=0;// 
a=0;//     div-float v12, v7, v12
a=0;// 
a=0;//     invoke-static {v12}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     mul-float/2addr v1, v12
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-static {v1}, Ljava/lang/Math;->round(F)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-int/lit8 v6, v1, 0x4
a=0;// 
a=0;//     .line 426
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v6=(Integer);v10=(Conflicted);v12=(Integer);
a=0;//     const/16 v1, 0x258
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-static {v6, v1}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 428
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/CustomViewAbove;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual/range {v1 .. v6}, Landroid/widget/Scroller;->startScroll(IIIII)V
a=0;// 
a=0;//     .line 429
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/CustomViewAbove;->invalidate()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 422
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v1=(Float);v6=(Null);v10=(Uninit);v12=(Float);
a=0;//     invoke-static {v4}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     int-to-float v12, v11
a=0;// 
a=0;//     div-float v10, v1, v12
a=0;// 
a=0;//     .line 423
a=0;//     .local v10, "pageDelta":F
a=0;//     #v10=(Float);
a=0;//     const/high16 v1, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-float/2addr v1, v10
a=0;// 
a=0;//     #v1=(Float);
a=0;//     const/high16 v12, 0x42c80000    # 100.0f
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     mul-float/2addr v1, v12
a=0;// 
a=0;//     float-to-int v6, v1
a=0;// 
a=0;//     .line 424
a=0;//     #v6=(Integer);
a=0;//     const/16 v6, 0x258
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     goto :goto_1
a=0;// .end method
}}
