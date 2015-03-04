package com.handmark.pulltorefresh.library; class PullToRefreshHorizontalScrollView$InternalHorizontalScrollViewSDK9 { void a() { int a;
a=0;// .class final Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView$InternalHorizontalScrollViewSDK9;
a=0;// .super Landroid/widget/HorizontalScrollView;
a=0;// .source "PullToRefreshHorizontalScrollView.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation build Landroid/annotation/TargetApi;
a=0;//     value = 0x9
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x10
a=0;//     name = "InternalHorizontalScrollViewSDK9"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView;Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 0
a=0;//     .param p2, "context"    # Landroid/content/Context;
a=0;//     .param p3, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     iput-object p1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView$InternalHorizontalScrollViewSDK9;->this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView;
a=0;// 
a=0;//     .line 81
a=0;//     invoke-direct {p0, p2, p3}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 82
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView$InternalHorizontalScrollViewSDK9;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private getScrollRange()I
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 102
a=0;//     #v5=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 103
a=0;//     .local v1, "scrollRange":I
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView$InternalHorizontalScrollViewSDK9;->getChildCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     .line 104
a=0;//     invoke-virtual {p0, v5}, Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView$InternalHorizontalScrollViewSDK9;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 105
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView$InternalHorizontalScrollViewSDK9;->getWidth()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView$InternalHorizontalScrollViewSDK9;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int/2addr v3, v4
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView$InternalHorizontalScrollViewSDK9;->getPaddingRight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     sub-int/2addr v3, v4
a=0;// 
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 107
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected overScrollBy(IIIIIIIIZ)Z
a=0;//     .locals 8
a=0;//     .param p1, "deltaX"    # I
a=0;//     .param p2, "deltaY"    # I
a=0;//     .param p3, "scrollX"    # I
a=0;//     .param p4, "scrollY"    # I
a=0;//     .param p5, "scrollRangeX"    # I
a=0;//     .param p6, "scrollRangeY"    # I
a=0;//     .param p7, "maxOverScrollX"    # I
a=0;//     .param p8, "maxOverScrollY"    # I
a=0;//     .param p9, "isTouchEvent"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     invoke-super/range {p0 .. p9}, Landroid/widget/HorizontalScrollView;->overScrollBy(IIIIIIIIZ)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 92
a=0;//     .local v7, "returnValue":Z
a=0;//     #v7=(Boolean);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView$InternalHorizontalScrollViewSDK9;->this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView;
a=0;// 
a=0;//     .line 93
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView;);
a=0;//     invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshHorizontalScrollView$InternalHorizontalScrollViewSDK9;->getScrollRange()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, p3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v3, p2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, p4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move/from16 v6, p9
a=0;// 
a=0;//     .line 92
a=0;//     #v6=(Boolean);
a=0;//     invoke-static/range {v0 .. v6}, Lcom/handmark/pulltorefresh/library/OverscrollHelper;->overScrollBy(Lcom/handmark/pulltorefresh/library/PullToRefreshBase;IIIIIZ)V
a=0;// 
a=0;//     .line 95
a=0;//     return v7
a=0;// .end method
}}
