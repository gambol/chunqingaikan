package com.handmark.pulltorefresh.library.internal; class LoadingLayout { void a() { int a;
a=0;// .class public abstract Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// .super Landroid/widget/FrameLayout;
a=0;// .source "LoadingLayout.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/handmark/pulltorefresh/library/ILoadingLayout;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation build Landroid/annotation/SuppressLint;
a=0;//     value = {
a=0;//         "ViewConstructor"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static synthetic $SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode:[I = null
a=0;// 
a=0;// .field private static synthetic $SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Orientation:[I = null
a=0;// 
a=0;// .field static final ANIMATION_INTERPOLATOR:Landroid/view/animation/Interpolator;
a=0;// 
a=0;// .field static final LOG_TAG:Ljava/lang/String; = "PullToRefresh-LoadingLayout"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected final mHeaderImage:Landroid/widget/ImageView;
a=0;// 
a=0;// .field protected final mHeaderProgress:Landroid/widget/ProgressBar;
a=0;// 
a=0;// .field private final mHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;// .field private mInnerLayout:Landroid/widget/FrameLayout;
a=0;// 
a=0;// .field protected final mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;// .field private mPullLabel:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field private mRefreshingLabel:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field private mReleaseLabel:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field protected final mScrollDirection:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;// 
a=0;// .field private final mSubHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;// .field private mUseIntrinsicAnimation:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static synthetic $SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode()[I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode:[I
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
a=0;//     sput-object v0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode:[I
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
a=0;// .method static synthetic $SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Orientation()[I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Orientation:[I
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
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->values()[Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
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
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->HORIZONTAL:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aput v2, v0, v1
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->VERTICAL:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     aput v2, v0, v1
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sput-object v0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Orientation:[I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NoSuchFieldError;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NoSuchFieldError;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     new-instance v0, Landroid/view/animation/LinearInterpolator;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/LinearInterpolator;);
a=0;//     invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/LinearInterpolator;);
a=0;//     sput-object v0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->ANIMATION_INTERPOLATOR:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;Landroid/content/res/TypedArray;)V
a=0;//     .locals 7
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p4, "attrs"    # Landroid/content/res/TypedArray;
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     .local p2, "mode":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
a=0;//     .local p3, "scrollDirection":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;"
a=0;//     invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 69
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;);
a=0;//     iput-object p2, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     .line 70
a=0;//     iput-object p3, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mScrollDirection:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;// 
a=0;//     .line 72
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Orientation()[I
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     invoke-virtual {p3}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->ordinal()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     aget v5, v5, v6
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     packed-switch v5, :pswitch_data_0
a=0;// 
a=0;//     .line 78
a=0;//     invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/LayoutInflater;);
a=0;//     sget v6, Lcom/handmark/pulltorefresh/library/R$layout;->pull_to_refresh_header_vertical:I
a=0;// 
a=0;//     invoke-virtual {v5, v6, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     .line 82
a=0;//     :goto_0
a=0;//     sget v5, Lcom/handmark/pulltorefresh/library/R$id;->fl_inner:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p0, v5}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/widget/FrameLayout;
a=0;// 
a=0;//     iput-object v5, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mInnerLayout:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     .line 83
a=0;//     iget-object v5, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mInnerLayout:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     sget v6, Lcom/handmark/pulltorefresh/library/R$id;->pull_to_refresh_text:I
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     check-cast v5, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v5, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 84
a=0;//     iget-object v5, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mInnerLayout:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     sget v6, Lcom/handmark/pulltorefresh/library/R$id;->pull_to_refresh_progress:I
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     check-cast v5, Landroid/widget/ProgressBar;
a=0;// 
a=0;//     iput-object v5, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mHeaderProgress:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     .line 85
a=0;//     iget-object v5, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mInnerLayout:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     sget v6, Lcom/handmark/pulltorefresh/library/R$id;->pull_to_refresh_sub_text:I
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     check-cast v5, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v5, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mSubHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 86
a=0;//     iget-object v5, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mInnerLayout:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     sget v6, Lcom/handmark/pulltorefresh/library/R$id;->pull_to_refresh_image:I
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     check-cast v5, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v5, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mHeaderImage:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 88
a=0;//     iget-object v5, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mInnerLayout:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v3, Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     .line 90
a=0;//     .local v3, "lp":Landroid/widget/FrameLayout$LayoutParams;
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode()[I
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ordinal()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     aget v5, v5, v6
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     packed-switch v5, :pswitch_data_1
a=0;// 
a=0;//     .line 102
a=0;//     sget-object v5, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->VERTICAL:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;// 
a=0;//     #v5=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;);
a=0;//     if-ne p3, v5, :cond_9
a=0;// 
a=0;//     const/16 v5, 0x50
a=0;// 
a=0;//     :goto_1
a=0;//     #v5=(PosByte);
a=0;//     iput v5, v3, Landroid/widget/FrameLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 105
a=0;//     sget v5, Lcom/handmark/pulltorefresh/library/R$string;->pull_to_refresh_pull_label:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iput-object v5, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mPullLabel:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 106
a=0;//     sget v5, Lcom/handmark/pulltorefresh/library/R$string;->pull_to_refresh_refreshing_label:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iput-object v5, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mRefreshingLabel:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 107
a=0;//     sget v5, Lcom/handmark/pulltorefresh/library/R$string;->pull_to_refresh_release_label:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iput-object v5, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mReleaseLabel:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 111
a=0;//     :goto_2
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-virtual {p4, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 112
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-virtual {p4, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 113
a=0;//     .local v0, "background":Landroid/graphics/drawable/Drawable;
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 114
a=0;//     invoke-static {p0, v0}, Lcom/handmark/pulltorefresh/library/internal/ViewCompat;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 118
a=0;//     .end local v0    # "background":Landroid/graphics/drawable/Drawable;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v5=(Boolean);
a=0;//     const/16 v5, 0xa
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {p4, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 119
a=0;//     new-instance v4, Landroid/util/TypedValue;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/util/TypedValue;);
a=0;//     invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V
a=0;// 
a=0;//     .line 120
a=0;//     .local v4, "styleID":Landroid/util/TypedValue;
a=0;//     #v4=(Reference,Landroid/util/TypedValue;);
a=0;//     const/16 v5, 0xa
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {p4, v5, v4}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z
a=0;// 
a=0;//     .line 121
a=0;//     iget v5, v4, Landroid/util/TypedValue;->data:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-direct {p0, v5}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->setTextAppearance(I)V
a=0;// 
a=0;//     .line 123
a=0;//     .end local v4    # "styleID":Landroid/util/TypedValue;
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     const/16 v5, 0xb
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {p4, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 124
a=0;//     new-instance v4, Landroid/util/TypedValue;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/util/TypedValue;);
a=0;//     invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V
a=0;// 
a=0;//     .line 125
a=0;//     .restart local v4    # "styleID":Landroid/util/TypedValue;
a=0;//     #v4=(Reference,Landroid/util/TypedValue;);
a=0;//     const/16 v5, 0xb
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {p4, v5, v4}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z
a=0;// 
a=0;//     .line 126
a=0;//     iget v5, v4, Landroid/util/TypedValue;->data:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-direct {p0, v5}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->setSubTextAppearance(I)V
a=0;// 
a=0;//     .line 130
a=0;//     .end local v4    # "styleID":Landroid/util/TypedValue;
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {p4, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     .line 131
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {p4, v5}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 132
a=0;//     .local v1, "colors":Landroid/content/res/ColorStateList;
a=0;//     #v1=(Reference,Landroid/content/res/ColorStateList;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 133
a=0;//     invoke-direct {p0, v1}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->setTextColor(Landroid/content/res/ColorStateList;)V
a=0;// 
a=0;//     .line 136
a=0;//     .end local v1    # "colors":Landroid/content/res/ColorStateList;
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v5, 0x3
a=0;// 
a=0;//     invoke-virtual {p4, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_4
a=0;// 
a=0;//     .line 137
a=0;//     const/4 v5, 0x3
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {p4, v5}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 138
a=0;//     .restart local v1    # "colors":Landroid/content/res/ColorStateList;
a=0;//     #v1=(Reference,Landroid/content/res/ColorStateList;);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 139
a=0;//     invoke-direct {p0, v1}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->setSubTextColor(Landroid/content/res/ColorStateList;)V
a=0;// 
a=0;//     .line 144
a=0;//     .end local v1    # "colors":Landroid/content/res/ColorStateList;
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 145
a=0;//     .local v2, "imageDrawable":Landroid/graphics/drawable/Drawable;
a=0;//     #v2=(Null);
a=0;//     const/4 v5, 0x6
a=0;// 
a=0;//     invoke-virtual {p4, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_5
a=0;// 
a=0;//     .line 146
a=0;//     const/4 v5, 0x6
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {p4, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 151
a=0;//     :cond_5
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode()[I
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     invoke-virtual {p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ordinal()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     aget v5, v5, v6
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     packed-switch v5, :pswitch_data_2
a=0;// 
a=0;//     .line 154
a=0;//     const/4 v5, 0x7
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {p4, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_a
a=0;// 
a=0;//     .line 155
a=0;//     const/4 v5, 0x7
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {p4, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 173
a=0;//     :cond_6
a=0;//     :goto_3
a=0;//     #v6=(Conflicted);
a=0;//     if-nez v2, :cond_7
a=0;// 
a=0;//     .line 174
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->getDefaultDrawableResId()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 178
a=0;//     :cond_7
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {p0, v2}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->setLoadingDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 180
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->reset()V
a=0;// 
a=0;//     .line 181
a=0;//     return-void
a=0;// 
a=0;//     .line 74
a=0;//     .end local v2    # "imageDrawable":Landroid/graphics/drawable/Drawable;
a=0;//     .end local v3    # "lp":Landroid/widget/FrameLayout$LayoutParams;
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Integer);v6=(Integer);
a=0;//     invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/LayoutInflater;);
a=0;//     sget v6, Lcom/handmark/pulltorefresh/library/R$layout;->pull_to_refresh_header_horizontal:I
a=0;// 
a=0;//     invoke-virtual {v5, v6, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 92
a=0;//     .restart local v3    # "lp":Landroid/widget/FrameLayout$LayoutParams;
a=0;//     :pswitch_1
a=0;//     #v3=(Reference,Landroid/widget/FrameLayout$LayoutParams;);v5=(Integer);
a=0;//     sget-object v5, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->VERTICAL:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;// 
a=0;//     #v5=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;);
a=0;//     if-ne p3, v5, :cond_8
a=0;// 
a=0;//     const/16 v5, 0x30
a=0;// 
a=0;//     :goto_4
a=0;//     #v5=(PosByte);
a=0;//     iput v5, v3, Landroid/widget/FrameLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 95
a=0;//     sget v5, Lcom/handmark/pulltorefresh/library/R$string;->pull_to_refresh_from_bottom_pull_label:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iput-object v5, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mPullLabel:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 96
a=0;//     sget v5, Lcom/handmark/pulltorefresh/library/R$string;->pull_to_refresh_from_bottom_refreshing_label:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iput-object v5, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mRefreshingLabel:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 97
a=0;//     sget v5, Lcom/handmark/pulltorefresh/library/R$string;->pull_to_refresh_from_bottom_release_label:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iput-object v5, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mReleaseLabel:Ljava/lang/CharSequence;
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 92
a=0;//     :cond_8
a=0;//     const/4 v5, 0x3
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 102
a=0;//     :cond_9
a=0;//     #v5=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;);
a=0;//     const/4 v5, 0x5
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 156
a=0;//     .restart local v2    # "imageDrawable":Landroid/graphics/drawable/Drawable;
a=0;//     :cond_a
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Landroid/graphics/drawable/Drawable;);v4=(Conflicted);v5=(Boolean);
a=0;//     const/16 v5, 0x11
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {p4, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_6
a=0;// 
a=0;//     .line 157
a=0;//     const-string v5, "ptrDrawableTop"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "ptrDrawableStart"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v6}, Lcom/handmark/pulltorefresh/library/internal/Utils;->warnDeprecation(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 158
a=0;//     const/16 v5, 0x11
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {p4, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 160
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 163
a=0;//     :pswitch_2
a=0;//     #v5=(Integer);v6=(Integer);
a=0;//     const/16 v5, 0x8
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {p4, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_b
a=0;// 
a=0;//     .line 164
a=0;//     const/16 v5, 0x8
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {p4, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 165
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_b
a=0;//     #v5=(Boolean);
a=0;//     const/16 v5, 0x12
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {p4, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_6
a=0;// 
a=0;//     .line 166
a=0;//     const-string v5, "ptrDrawableBottom"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "ptrDrawableEnd"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v6}, Lcom/handmark/pulltorefresh/library/internal/Utils;->warnDeprecation(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 167
a=0;//     const/16 v5, 0x12
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {p4, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 72
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x2
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// 
a=0;//     .line 90
a=0;//     :pswitch_data_1
a=0;//     .packed-switch 0x3
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// 
a=0;//     .line 151
a=0;//     :pswitch_data_2
a=0;//     .packed-switch 0x3
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private setSubHeaderText(Ljava/lang/CharSequence;)V
a=0;//     .locals 2
a=0;//     .param p1, "label"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     .line 348
a=0;//     #v1=(PosByte);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mSubHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 349
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 350
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mSubHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 361
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 352
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mSubHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 356
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mSubHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v1, v0, :cond_0
a=0;// 
a=0;//     .line 357
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mSubHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private setSubTextAppearance(I)V
a=0;//     .locals 2
a=0;//     .param p1, "value"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 364
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mSubHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 365
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mSubHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 367
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setSubTextColor(Landroid/content/res/ColorStateList;)V
a=0;//     .locals 1
a=0;//     .param p1, "color"    # Landroid/content/res/ColorStateList;
a=0;// 
a=0;//     .prologue
a=0;//     .line 370
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mSubHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 371
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mSubHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V
a=0;// 
a=0;//     .line 373
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setTextAppearance(I)V
a=0;//     .locals 2
a=0;//     .param p1, "value"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 376
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 377
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 379
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mSubHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 380
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mSubHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 382
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setTextColor(Landroid/content/res/ColorStateList;)V
a=0;//     .locals 1
a=0;//     .param p1, "color"    # Landroid/content/res/ColorStateList;
a=0;// 
a=0;//     .prologue
a=0;//     .line 385
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 386
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V
a=0;// 
a=0;//     .line 388
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mSubHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 389
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mSubHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V
a=0;// 
a=0;//     .line 391
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final getContentSize()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 196
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Orientation()[I
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mScrollDirection:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;);
a=0;//     invoke-virtual {v1}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget v0, v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 201
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mInnerLayout:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/FrameLayout;);
a=0;//     invoke-virtual {v0}, Landroid/widget/FrameLayout;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     .line 198
a=0;//     :pswitch_0
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mInnerLayout:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/FrameLayout;);
a=0;//     invoke-virtual {v0}, Landroid/widget/FrameLayout;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 196
a=0;//     #v0=(Unknown);v1=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x2
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method protected abstract getDefaultDrawableResId()I
a=0;// .end method
a=0;// 
a=0;// .method public final hideAllViews()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     .line 206
a=0;//     #v1=(PosByte);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 207
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 209
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mHeaderProgress:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ProgressBar;);
a=0;//     invoke-virtual {v0}, Landroid/widget/ProgressBar;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 210
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mHeaderProgress:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ProgressBar;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     .line 212
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mHeaderImage:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 213
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mHeaderImage:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 215
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mSubHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 216
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mSubHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 218
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected abstract onLoadingDrawableSet(Landroid/graphics/drawable/Drawable;)V
a=0;// .end method
a=0;// 
a=0;// .method public final onPull(F)V
a=0;//     .locals 1
a=0;//     .param p1, "scaleOfLayout"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 221
a=0;//     iget-boolean v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mUseIntrinsicAnimation:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 222
a=0;//     invoke-virtual {p0, p1}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->onPullImpl(F)V
a=0;// 
a=0;//     .line 224
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected abstract onPullImpl(F)V
a=0;// .end method
a=0;// 
a=0;// .method public final pullToRefresh()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 227
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 228
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mPullLabel:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 232
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->pullToRefreshImpl()V
a=0;// 
a=0;//     .line 233
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected abstract pullToRefreshImpl()V
a=0;// .end method
a=0;// 
a=0;// .method public final refreshing()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 236
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 237
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mRefreshingLabel:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 240
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-boolean v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mUseIntrinsicAnimation:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 241
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mHeaderImage:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/graphics/drawable/AnimationDrawable;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V
a=0;// 
a=0;//     .line 247
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mSubHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 248
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mSubHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 250
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 244
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->refreshingImpl()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected abstract refreshingImpl()V
a=0;// .end method
a=0;// 
a=0;// .method public final releaseToRefresh()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 253
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 254
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mReleaseLabel:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 258
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->releaseToRefreshImpl()V
a=0;// 
a=0;//     .line 259
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected abstract releaseToRefreshImpl()V
a=0;// .end method
a=0;// 
a=0;// .method public final reset()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 262
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 263
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mPullLabel:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 265
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mHeaderImage:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 267
a=0;//     iget-boolean v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mUseIntrinsicAnimation:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 268
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mHeaderImage:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/graphics/drawable/AnimationDrawable;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V
a=0;// 
a=0;//     .line 274
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mSubHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 275
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mSubHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 276
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mSubHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 281
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 271
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->resetImpl()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 278
a=0;//     :cond_3
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mSubHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected abstract resetImpl()V
a=0;// .end method
a=0;// 
a=0;// .method public final setHeight(I)V
a=0;//     .locals 1
a=0;//     .param p1, "height"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 184
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 185
a=0;//     .local v0, "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     .line 186
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->requestLayout()V
a=0;// 
a=0;//     .line 187
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setLastUpdatedLabel(Ljava/lang/CharSequence;)V
a=0;//     .locals 0
a=0;//     .param p1, "label"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 285
a=0;//     invoke-direct {p0, p1}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->setSubHeaderText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 286
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final setLoadingDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 1
a=0;//     .param p1, "imageDrawable"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 290
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mHeaderImage:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 291
a=0;//     instance-of v0, p1, Landroid/graphics/drawable/AnimationDrawable;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mUseIntrinsicAnimation:Z
a=0;// 
a=0;//     .line 294
a=0;//     invoke-virtual {p0, p1}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->onLoadingDrawableSet(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 295
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPullLabel(Ljava/lang/CharSequence;)V
a=0;//     .locals 0
a=0;//     .param p1, "pullLabel"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 298
a=0;//     iput-object p1, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mPullLabel:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 299
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setRefreshingLabel(Ljava/lang/CharSequence;)V
a=0;//     .locals 0
a=0;//     .param p1, "refreshingLabel"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 302
a=0;//     iput-object p1, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mRefreshingLabel:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 303
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setReleaseLabel(Ljava/lang/CharSequence;)V
a=0;//     .locals 0
a=0;//     .param p1, "releaseLabel"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 306
a=0;//     iput-object p1, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mReleaseLabel:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 307
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTextTypeface(Landroid/graphics/Typeface;)V
a=0;//     .locals 1
a=0;//     .param p1, "tf"    # Landroid/graphics/Typeface;
a=0;// 
a=0;//     .prologue
a=0;//     .line 311
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V
a=0;// 
a=0;//     .line 312
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final setWidth(I)V
a=0;//     .locals 1
a=0;//     .param p1, "width"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 190
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 191
a=0;//     .local v0, "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     .line 192
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->requestLayout()V
a=0;// 
a=0;//     .line 193
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final showInvisibleViews()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 315
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v2, v0, :cond_0
a=0;// 
a=0;//     .line 316
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 318
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mHeaderProgress:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ProgressBar;);
a=0;//     invoke-virtual {v0}, Landroid/widget/ProgressBar;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v2, v0, :cond_1
a=0;// 
a=0;//     .line 319
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mHeaderProgress:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ProgressBar;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     .line 321
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mHeaderImage:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v2, v0, :cond_2
a=0;// 
a=0;//     .line 322
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mHeaderImage:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 324
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mSubHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v2, v0, :cond_3
a=0;// 
a=0;//     .line 325
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->mSubHeaderText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 327
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
