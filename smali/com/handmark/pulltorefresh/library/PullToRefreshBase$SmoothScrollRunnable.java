package com.handmark.pulltorefresh.library; class PullToRefreshBase$SmoothScrollRunnable { void a() { int a;
a=0;// .class final Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;
a=0;// .super Ljava/lang/Object;
a=0;// .source "PullToRefreshBase.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/handmark/pulltorefresh/library/PullToRefreshBase;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x10
a=0;//     name = "SmoothScrollRunnable"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mContinueRunning:Z
a=0;// 
a=0;// .field private mCurrentY:I
a=0;// 
a=0;// .field private final mDuration:J
a=0;// 
a=0;// .field private final mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;// .field private mListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;
a=0;// 
a=0;// .field private final mScrollFromY:I
a=0;// 
a=0;// .field private final mScrollToY:I
a=0;// 
a=0;// .field private mStartTime:J
a=0;// 
a=0;// .field final synthetic this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshBase;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/handmark/pulltorefresh/library/PullToRefreshBase;IIJLcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;)V
a=0;//     .locals 2
a=0;//     .param p2, "fromY"    # I
a=0;//     .param p3, "toY"    # I
a=0;//     .param p4, "duration"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 1599
a=0;//     .local p6, "listener":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;"
a=0;//     iput-object p1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshBase;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 1595
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mContinueRunning:Z
a=0;// 
a=0;//     .line 1596
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mStartTime:J
a=0;// 
a=0;//     .line 1597
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mCurrentY:I
a=0;// 
a=0;//     .line 1600
a=0;//     iput p2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mScrollFromY:I
a=0;// 
a=0;//     .line 1601
a=0;//     iput p3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mScrollToY:I
a=0;// 
a=0;//     .line 1602
a=0;//     invoke-static {p1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->access$0(Lcom/handmark/pulltorefresh/library/PullToRefreshBase;)Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .line 1603
a=0;//     iput-wide p4, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mDuration:J
a=0;// 
a=0;//     .line 1604
a=0;//     iput-object p6, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;
a=0;// 
a=0;//     .line 1605
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v7, 0x3e8
a=0;// 
a=0;//     .line 1614
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     iget-wide v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mStartTime:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const-wide/16 v5, -0x1
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     cmp-long v3, v3, v5
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 1615
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);
a=0;//     iput-wide v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mStartTime:J
a=0;// 
a=0;//     .line 1633
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-boolean v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mContinueRunning:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     iget v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mScrollToY:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mCurrentY:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eq v3, v4, :cond_2
a=0;// 
a=0;//     .line 1634
a=0;//     iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshBase;
a=0;// 
a=0;//     #v3=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase;);
a=0;//     invoke-static {v3, p0}, Lcom/handmark/pulltorefresh/library/internal/ViewCompat;->postOnAnimation(Landroid/view/View;Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 1640
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1623
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Byte);v4=(LongHi);v5=(LongLo);v6=(LongHi);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);
a=0;//     iget-wide v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mStartTime:J
a=0;// 
a=0;//     sub-long/2addr v3, v5
a=0;// 
a=0;//     mul-long/2addr v3, v7
a=0;// 
a=0;//     iget-wide v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mDuration:J
a=0;// 
a=0;//     div-long v1, v3, v5
a=0;// 
a=0;//     .line 1624
a=0;//     .local v1, "normalizedTime":J
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {v1, v2, v7, v8}, Ljava/lang/Math;->min(JJ)J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     const-wide/16 v5, 0x0
a=0;// 
a=0;//     invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     .line 1626
a=0;//     iget v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mScrollFromY:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mScrollToY:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int/2addr v3, v4
a=0;// 
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     .line 1627
a=0;//     #v3=(Float);
a=0;//     iget-object v4, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     long-to-float v5, v1
a=0;// 
a=0;//     #v5=(Float);
a=0;//     const/high16 v6, 0x447a0000    # 1000.0f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     div-float/2addr v5, v6
a=0;// 
a=0;//     invoke-interface {v4, v5}, Landroid/view/animation/Interpolator;->getInterpolation(F)F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 1626
a=0;//     #v4=(Float);
a=0;//     mul-float/2addr v3, v4
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Math;->round(F)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1628
a=0;//     .local v0, "deltaY":I
a=0;//     #v0=(Integer);
a=0;//     iget v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mScrollFromY:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v3, v0
a=0;// 
a=0;//     iput v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mCurrentY:I
a=0;// 
a=0;//     .line 1629
a=0;//     iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshBase;
a=0;// 
a=0;//     #v3=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase;);
a=0;//     iget v4, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mCurrentY:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->setHeaderScroll(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1636
a=0;//     .end local v0    # "deltaY":I
a=0;//     .end local v1    # "normalizedTime":J
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;
a=0;// 
a=0;//     #v3=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 1637
a=0;//     iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;
a=0;// 
a=0;//     invoke-interface {v3}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnSmoothScrollFinishedListener;->onSmoothScrollFinished()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public stop()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1643
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->mContinueRunning:Z
a=0;// 
a=0;//     .line 1644
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$SmoothScrollRunnable;->this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshBase;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase;);
a=0;//     invoke-virtual {v0, p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 1645
a=0;//     return-void
a=0;// .end method
}}
