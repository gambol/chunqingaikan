package com.handmark.pulltorefresh.library; class PullToRefreshAdapterViewBase { void a() { int a;
a=0;// .class public abstract Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;
a=0;// .super Lcom/handmark/pulltorefresh/library/PullToRefreshBase;
a=0;// .source "PullToRefreshAdapterViewBase.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/widget/AbsListView$OnScrollListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T:",
a=0;//         "Landroid/widget/AbsListView;",
a=0;//         ">",
a=0;//         "Lcom/handmark/pulltorefresh/library/PullToRefreshBase",
a=0;//         "<TT;>;",
a=0;//         "Landroid/widget/AbsListView$OnScrollListener;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static synthetic $SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode:[I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mEmptyView:Landroid/view/View;
a=0;// 
a=0;// .field private mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;// .field private mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;// .field private mLastItemVisible:Z
a=0;// 
a=0;// .field private mOnLastItemVisibleListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnLastItemVisibleListener;
a=0;// 
a=0;// .field private mOnScrollListener:Landroid/widget/AbsListView$OnScrollListener;
a=0;// 
a=0;// .field private mScrollEmptyView:Z
a=0;// 
a=0;// .field private mShowIndicator:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static synthetic $SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode()[I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->values()[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Reference,[I);
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->BOTH:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aput v2, v0, v1
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_4
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->DISABLED:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     aput v2, v0, v1
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_3
a=0;// 
a=0;//     :goto_2
a=0;//     :try_start_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->MANUAL_REFRESH_ONLY:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aput v2, v0, v1
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     :goto_3
a=0;//     :try_start_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_END:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aput v2, v0, v1
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_1
a=0;// 
a=0;//     :goto_4
a=0;//     :try_start_4
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_START:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aput v2, v0, v1
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_0
a=0;// 
a=0;//     :goto_5
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sput-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode:[I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NoSuchFieldError;);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NoSuchFieldError;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_2
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NoSuchFieldError;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_3
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NoSuchFieldError;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_4
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NoSuchFieldError;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
a=0;//     invoke-direct {p0, p1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 66
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mScrollEmptyView:Z
a=0;// 
a=0;//     .line 70
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/AbsListView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/AbsListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V
a=0;// 
a=0;//     .line 71
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
a=0;//     invoke-direct {p0, p1, p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 66
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mScrollEmptyView:Z
a=0;// 
a=0;//     .line 75
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/AbsListView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/AbsListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V
a=0;// 
a=0;//     .line 76
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
a=0;//     .local p2, "mode":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
a=0;//     invoke-direct {p0, p1, p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;-><init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;)V
a=0;// 
a=0;//     .line 66
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mScrollEmptyView:Z
a=0;// 
a=0;//     .line 80
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/AbsListView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/AbsListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V
a=0;// 
a=0;//     .line 81
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
a=0;//     .local p2, "mode":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
a=0;//     .local p3, "animStyle":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;"
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;-><init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$AnimationStyle;)V
a=0;// 
a=0;//     .line 66
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mScrollEmptyView:Z
a=0;// 
a=0;//     .line 85
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/AbsListView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/AbsListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V
a=0;// 
a=0;//     .line 86
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private addIndicatorViews()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v6, -0x2
a=0;// 
a=0;//     .line 335
a=0;//     #v6=(Byte);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getMode()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 336
a=0;//     .local v0, "mode":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getRefreshableViewWrapper()Landroid/widget/FrameLayout;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 338
a=0;//     .local v2, "refreshableViewWrapper":Landroid/widget/FrameLayout;
a=0;//     #v2=(Reference,Landroid/widget/FrameLayout;);
a=0;//     invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showHeaderLoadingLayout()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     #v3=(Reference,Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 340
a=0;//     new-instance v3, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     sget-object v5, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_START:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v5=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-direct {v3, v4, v5}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;-><init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;);
a=0;//     iput-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     .line 341
a=0;//     new-instance v1, Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     invoke-direct {v1, v6, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 343
a=0;//     .local v1, "params":Landroid/widget/FrameLayout$LayoutParams;
a=0;//     #v1=(Reference,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sget v4, Lcom/handmark/pulltorefresh/library/R$dimen;->indicator_right_padding:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, v1, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     .line 344
a=0;//     const/16 v3, 0x35
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     iput v3, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 345
a=0;//     iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     #v3=(Reference,Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;);
a=0;//     invoke-virtual {v2, v3, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 353
a=0;//     .end local v1    # "params":Landroid/widget/FrameLayout$LayoutParams;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showFooterLoadingLayout()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     #v3=(Reference,Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;);
a=0;//     if-nez v3, :cond_3
a=0;// 
a=0;//     .line 355
a=0;//     new-instance v3, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     sget-object v5, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_END:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v5=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-direct {v3, v4, v5}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;-><init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;);
a=0;//     iput-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     .line 356
a=0;//     new-instance v1, Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     invoke-direct {v1, v6, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 358
a=0;//     .restart local v1    # "params":Landroid/widget/FrameLayout$LayoutParams;
a=0;//     #v1=(Reference,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sget v4, Lcom/handmark/pulltorefresh/library/R$dimen;->indicator_right_padding:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, v1, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     .line 359
a=0;//     const/16 v3, 0x55
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     iput v3, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 360
a=0;//     iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     #v3=(Reference,Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;);
a=0;//     invoke-virtual {v2, v3, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 367
a=0;//     .end local v1    # "params":Landroid/widget/FrameLayout$LayoutParams;
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 347
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showHeaderLoadingLayout()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     #v3=(Reference,Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 349
a=0;//     iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 350
a=0;//     iput-object v7, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 362
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->showFooterLoadingLayout()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     #v3=(Reference,Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 364
a=0;//     iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 365
a=0;//     iput-object v7, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static convertEmptyViewLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/widget/FrameLayout$LayoutParams;
a=0;//     .locals 2
a=0;//     .param p0, "lp"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 44
a=0;//     .local v0, "newLp":Landroid/widget/FrameLayout$LayoutParams;
a=0;//     #v0=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 45
a=0;//     new-instance v0, Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     .end local v0    # "newLp":Landroid/widget/FrameLayout$LayoutParams;
a=0;//     #v0=(UninitRef,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     invoke-direct {v0, p0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 47
a=0;//     .restart local v0    # "newLp":Landroid/widget/FrameLayout$LayoutParams;
a=0;//     #v0=(Reference,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     instance-of v1, p0, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 48
a=0;//     check-cast p0, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .end local p0    # "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     iget v1, p0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 54
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 50
a=0;//     .restart local p0    # "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     :cond_1
a=0;//     #v1=(Boolean);
a=0;//     const/16 v1, 0x11
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private getShowIndicatorInternal()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 370
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
a=0;//     iget-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mShowIndicator:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->isPullToRefreshEnabled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private isFirstItemVisible()Z
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 374
a=0;//     #v4=(Null);
a=0;//     iget-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/AbsListView;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/AbsListView;->getAdapter()Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 376
a=0;//     .local v0, "adapter":Landroid/widget/Adapter;
a=0;//     #v0=(Reference,Landroid/widget/Adapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/widget/Adapter;->isEmpty()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 378
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "PullToRefresh"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "isFirstItemVisible. Empty View."
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 399
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Boolean);v5=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 391
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v4=(Null);v5=(Uninit);
a=0;//     iget-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/AbsListView;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/AbsListView;->getFirstVisiblePosition()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-gt v2, v3, :cond_3
a=0;// 
a=0;//     .line 392
a=0;//     iget-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/AbsListView;
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Landroid/widget/AbsListView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 393
a=0;//     .local v1, "firstVisibleChild":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 394
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     check-cast v2, Landroid/widget/AbsListView;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/AbsListView;->getTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v5, v2, :cond_2
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Integer);
a=0;//     move v2, v4
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .end local v1    # "firstVisibleChild":Landroid/view/View;
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);v5=(Uninit);
a=0;//     move v2, v4
a=0;// 
a=0;//     .line 399
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private isLastItemVisible()Z
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 403
a=0;//     #v7=(Null);
a=0;//     iget-object v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/widget/AbsListView;
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/widget/AbsListView;->getAdapter()Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 405
a=0;//     .local v0, "adapter":Landroid/widget/Adapter;
a=0;//     #v0=(Reference,Landroid/widget/Adapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/widget/Adapter;->isEmpty()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 407
a=0;//     :cond_0
a=0;//     #v5=(Conflicted);
a=0;//     const-string v5, "PullToRefresh"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, "isLastItemVisible. Empty View."
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move v5, v6
a=0;// 
a=0;//     .line 435
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Boolean);v8=(Conflicted);v9=(Conflicted);
a=0;//     return v5
a=0;// 
a=0;//     .line 411
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v7=(Null);v8=(Uninit);v9=(Uninit);
a=0;//     iget-object v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/widget/AbsListView;
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/widget/AbsListView;->getCount()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/lit8 v2, v5, -0x1
a=0;// 
a=0;//     .line 412
a=0;//     .local v2, "lastItemPosition":I
a=0;//     #v2=(Integer);
a=0;//     iget-object v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/widget/AbsListView;
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/widget/AbsListView;->getLastVisiblePosition()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 415
a=0;//     .local v4, "lastVisiblePosition":I
a=0;//     #v4=(Integer);
a=0;//     const-string v5, "PullToRefresh"
a=0;// 
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "isLastItemVisible. Last Item Position: "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, " Last Visible Pos: "
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 416
a=0;//     invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 415
a=0;//     invoke-static {v5, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 426
a=0;//     add-int/lit8 v5, v2, -0x1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-lt v4, v5, :cond_3
a=0;// 
a=0;//     .line 427
a=0;//     iget-object v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/widget/AbsListView;
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/widget/AbsListView;->getFirstVisiblePosition()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     sub-int v1, v4, v5
a=0;// 
a=0;//     .line 428
a=0;//     .local v1, "childIndex":I
a=0;//     #v1=(Integer);
a=0;//     iget-object v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/widget/AbsListView;
a=0;// 
a=0;//     invoke-virtual {v5, v1}, Landroid/widget/AbsListView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 429
a=0;//     .local v3, "lastVisibleChild":Landroid/view/View;
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 430
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     iget-object v5, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     check-cast v5, Landroid/widget/AbsListView;
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/widget/AbsListView;->getBottom()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-gt v8, v5, :cond_2
a=0;// 
a=0;//     move v5, v6
a=0;// 
a=0;//     #v5=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v5=(Integer);
a=0;//     move v5, v7
a=0;// 
a=0;//     #v5=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .end local v1    # "childIndex":I
a=0;//     .end local v3    # "lastVisibleChild":Landroid/view/View;
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v3=(Conflicted);v5=(Conflicted);v8=(Reference,Ljava/lang/String;);
a=0;//     move v5, v7
a=0;// 
a=0;//     .line 435
a=0;//     #v5=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private removeIndicatorViews()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 439
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 440
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getRefreshableViewWrapper()Landroid/widget/FrameLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 441
a=0;//     iput-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     .line 444
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 445
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getRefreshableViewWrapper()Landroid/widget/FrameLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 446
a=0;//     iput-object v2, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     .line 448
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private updateIndicatorViewsVisibility()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 451
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 452
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->isRefreshing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->isReadyForPullStart()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 453
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;);
a=0;//     invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->isVisible()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 454
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;);
a=0;//     invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->show()V
a=0;// 
a=0;//     .line 463
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 464
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->isRefreshing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->isReadyForPullEnd()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 465
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;);
a=0;//     invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->isVisible()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 466
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;);
a=0;//     invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->show()V
a=0;// 
a=0;//     .line 474
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 457
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;);
a=0;//     invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->isVisible()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 458
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;);
a=0;//     invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->hide()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 469
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;);
a=0;//     invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->isVisible()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 470
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;);
a=0;//     invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->hide()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getShowIndicator()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
a=0;//     iget-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mShowIndicator:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected handleStyledAttributes(Landroid/content/res/TypedArray;)V
a=0;//     .locals 2
a=0;//     .param p1, "a"    # Landroid/content/res/TypedArray;
a=0;// 
a=0;//     .prologue
a=0;//     .line 303
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->isPullToRefreshOverScrollEnabled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mShowIndicator:Z
a=0;// 
a=0;//     .line 304
a=0;//     return-void
a=0;// 
a=0;//     .line 303
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected isReadyForPullEnd()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 311
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
a=0;//     invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->isLastItemVisible()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected isReadyForPullStart()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 307
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
a=0;//     invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->isFirstItemVisible()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onPullToRefresh()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 247
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
a=0;//     invoke-super {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->onPullToRefresh()V
a=0;// 
a=0;//     .line 249
a=0;//     invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getShowIndicatorInternal()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 250
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode()[I
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getCurrentMode()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget v0, v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 262
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 252
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;);
a=0;//     invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->pullToRefresh()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 255
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;);
a=0;//     invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->pullToRefresh()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 250
a=0;//     #v0=(Unknown);v1=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x2
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onRefreshing(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "doScroll"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 265
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
a=0;//     invoke-super {p0, p1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->onRefreshing(Z)V
a=0;// 
a=0;//     .line 267
a=0;//     invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getShowIndicatorInternal()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 268
a=0;//     invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->updateIndicatorViewsVisibility()V
a=0;// 
a=0;//     .line 270
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onReleaseToRefresh()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 274
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
a=0;//     invoke-super {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->onReleaseToRefresh()V
a=0;// 
a=0;//     .line 276
a=0;//     invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getShowIndicatorInternal()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 277
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode()[I
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getCurrentMode()Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget v0, v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 289
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 279
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvBottom:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;);
a=0;//     invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->releaseToRefresh()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 282
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mIndicatorIvTop:Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;);
a=0;//     invoke-virtual {v0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->releaseToRefresh()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 277
a=0;//     #v0=(Unknown);v1=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x2
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onReset()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 293
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
a=0;//     invoke-super {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->onReset()V
a=0;// 
a=0;//     .line 295
a=0;//     invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getShowIndicatorInternal()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 296
a=0;//     invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->updateIndicatorViewsVisibility()V
a=0;// 
a=0;//     .line 298
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final onScroll(Landroid/widget/AbsListView;III)V
a=0;//     .locals 3
a=0;//     .param p1, "view"    # Landroid/widget/AbsListView;
a=0;//     .param p2, "firstVisibleItem"    # I
a=0;//     .param p3, "visibleItemCount"    # I
a=0;//     .param p4, "totalItemCount"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 106
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
a=0;//     const-string v0, "PullToRefresh"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "First Visible: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ". Visible Count: "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 107
a=0;//     const-string v2, ". Total Items:"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 106
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mOnLastItemVisibleListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnLastItemVisibleListener;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 115
a=0;//     if-lez p4, :cond_3
a=0;// 
a=0;//     add-int v0, p2, p3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v1, p4, -0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_3
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     iput-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mLastItemVisible:Z
a=0;// 
a=0;//     .line 119
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getShowIndicatorInternal()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 120
a=0;//     invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->updateIndicatorViewsVisibility()V
a=0;// 
a=0;//     .line 124
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mOnScrollListener:Landroid/widget/AbsListView$OnScrollListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/AbsListView$OnScrollListener;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 125
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mOnScrollListener:Landroid/widget/AbsListView$OnScrollListener;
a=0;// 
a=0;//     invoke-interface {v0, p1, p2, p3, p4}, Landroid/widget/AbsListView$OnScrollListener;->onScroll(Landroid/widget/AbsListView;III)V
a=0;// 
a=0;//     .line 127
a=0;//     :cond_2
a=0;//     return-void
a=0;// 
a=0;//     .line 115
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onScrollChanged(IIII)V
a=0;//     .locals 3
a=0;//     .param p1, "l"    # I
a=0;//     .param p2, "t"    # I
a=0;//     .param p3, "oldl"    # I
a=0;//     .param p4, "oldt"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 316
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->onScrollChanged(IIII)V
a=0;// 
a=0;//     .line 317
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mScrollEmptyView:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 318
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     neg-int v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     neg-int v2, p2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/View;->scrollTo(II)V
a=0;// 
a=0;//     .line 320
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final onScrollStateChanged(Landroid/widget/AbsListView;I)V
a=0;//     .locals 1
a=0;//     .param p1, "view"    # Landroid/widget/AbsListView;
a=0;//     .param p2, "state"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 134
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mOnLastItemVisibleListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnLastItemVisibleListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnLastItemVisibleListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mLastItemVisible:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 135
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mOnLastItemVisibleListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnLastItemVisibleListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnLastItemVisibleListener;);
a=0;//     invoke-interface {v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnLastItemVisibleListener;->onLastItemVisible()V
a=0;// 
a=0;//     .line 138
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mOnScrollListener:Landroid/widget/AbsListView$OnScrollListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/AbsListView$OnScrollListener;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 139
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mOnScrollListener:Landroid/widget/AbsListView$OnScrollListener;
a=0;// 
a=0;//     invoke-interface {v0, p1, p2}, Landroid/widget/AbsListView$OnScrollListener;->onScrollStateChanged(Landroid/widget/AbsListView;I)V
a=0;// 
a=0;//     .line 141
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAdapter(Landroid/widget/ListAdapter;)V
a=0;//     .locals 1
a=0;//     .param p1, "adapter"    # Landroid/widget/ListAdapter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/AdapterView;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/AdapterView;->setAdapter(Landroid/widget/Adapter;)V
a=0;// 
a=0;//     .line 153
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final setEmptyView(Landroid/view/View;)V
a=0;//     .locals 4
a=0;//     .param p1, "newEmptyView"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getRefreshableViewWrapper()Landroid/widget/FrameLayout;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 171
a=0;//     .local v2, "refreshableViewWrapper":Landroid/widget/FrameLayout;
a=0;//     #v2=(Reference,Landroid/widget/FrameLayout;);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 174
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {p1, v3}, Landroid/view/View;->setClickable(Z)V
a=0;// 
a=0;//     .line 176
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 177
a=0;//     .local v1, "newEmptyViewParent":Landroid/view/ViewParent;
a=0;//     #v1=(Reference,Landroid/view/ViewParent;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     instance-of v3, v1, Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 178
a=0;//     check-cast v1, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .end local v1    # "newEmptyViewParent":Landroid/view/ViewParent;
a=0;//     invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 183
a=0;//     :cond_0
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-static {v3}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->convertEmptyViewLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 184
a=0;//     .local v0, "lp":Landroid/widget/FrameLayout$LayoutParams;
a=0;//     #v0=(Reference,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 185
a=0;//     invoke-virtual {v2, p1, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 191
a=0;//     .end local v0    # "lp":Landroid/widget/FrameLayout$LayoutParams;
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     instance-of v3, v3, Lcom/handmark/pulltorefresh/library/internal/EmptyViewMethodAccessor;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 192
a=0;//     iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Lcom/handmark/pulltorefresh/library/internal/EmptyViewMethodAccessor;
a=0;// 
a=0;//     invoke-interface {v3, p1}, Lcom/handmark/pulltorefresh/library/internal/EmptyViewMethodAccessor;->setEmptyViewInternal(Landroid/view/View;)V
a=0;// 
a=0;//     .line 196
a=0;//     :goto_1
a=0;//     iput-object p1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mEmptyView:Landroid/view/View;
a=0;// 
a=0;//     .line 197
a=0;//     return-void
a=0;// 
a=0;//     .line 187
a=0;//     .restart local v0    # "lp":Landroid/widget/FrameLayout$LayoutParams;
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/widget/FrameLayout$LayoutParams;);v1=(Reference,Ujava/lang/Object;);
a=0;//     invoke-virtual {v2, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 194
a=0;//     .end local v0    # "lp":Landroid/widget/FrameLayout$LayoutParams;
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Boolean);
a=0;//     iget-object v3, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/widget/AbsListView;
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Landroid/widget/AbsListView;->setEmptyView(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 208
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
a=0;//     .local p1, "listener":Landroid/widget/AdapterView$OnItemClickListener;, "Landroid/widget/AdapterView$OnItemClickListener;"
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mRefreshableView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/AbsListView;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/AbsListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;// 
a=0;//     .line 209
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final setOnLastItemVisibleListener(Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnLastItemVisibleListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 212
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
a=0;//     .local p1, "listener":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnLastItemVisibleListener;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnLastItemVisibleListener;"
a=0;//     iput-object p1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mOnLastItemVisibleListener:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$OnLastItemVisibleListener;
a=0;// 
a=0;//     .line 213
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Landroid/widget/AbsListView$OnScrollListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 216
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
a=0;//     iput-object p1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mOnScrollListener:Landroid/widget/AbsListView$OnScrollListener;
a=0;// 
a=0;//     .line 217
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final setScrollEmptyView(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "doScroll"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 220
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
a=0;//     iput-boolean p1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mScrollEmptyView:Z
a=0;// 
a=0;//     .line 221
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setShowIndicator(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "showIndicator"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 232
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
a=0;//     iput-boolean p1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->mShowIndicator:Z
a=0;// 
a=0;//     .line 234
a=0;//     invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getShowIndicatorInternal()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 236
a=0;//     invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->addIndicatorViews()V
a=0;// 
a=0;//     .line 241
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 239
a=0;//     :cond_0
a=0;//     invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->removeIndicatorViews()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected updateUIForMode()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 324
a=0;//     .local p0, "this":Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;, "Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase<TT;>;"
a=0;//     invoke-super {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase;->updateUIForMode()V
a=0;// 
a=0;//     .line 327
a=0;//     invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->getShowIndicatorInternal()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 328
a=0;//     invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->addIndicatorViews()V
a=0;// 
a=0;//     .line 332
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 330
a=0;//     :cond_0
a=0;//     invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase;->removeIndicatorViews()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
