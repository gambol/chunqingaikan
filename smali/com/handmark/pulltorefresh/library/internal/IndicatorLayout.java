package com.handmark.pulltorefresh.library.internal; class IndicatorLayout { void a() { int a;
a=0;// .class public Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;
a=0;// .super Landroid/widget/FrameLayout;
a=0;// .source "IndicatorLayout.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/animation/Animation$AnimationListener;
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
a=0;// .field static final DEFAULT_ROTATION_ANIMATION_DURATION:I = 0x96
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mArrowImageView:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private mInAnim:Landroid/view/animation/Animation;
a=0;// 
a=0;// .field private mOutAnim:Landroid/view/animation/Animation;
a=0;// 
a=0;// .field private final mResetRotateAnimation:Landroid/view/animation/Animation;
a=0;// 
a=0;// .field private final mRotateAnimation:Landroid/view/animation/Animation;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static synthetic $SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode()[I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode:[I
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
a=0;//     sput-object v0, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode:[I
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
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;)V
a=0;//     .locals 13
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     .local p2, "mode":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
a=0;//     invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 48
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;);
a=0;//     new-instance v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/ImageView;);
a=0;//     invoke-direct {v0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->mArrowImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 50
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/handmark/pulltorefresh/library/R$drawable;->indicator_arrow:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 51
a=0;//     .local v7, "arrowD":Landroid/graphics/drawable/Drawable;
a=0;//     #v7=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->mArrowImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 53
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/handmark/pulltorefresh/library/R$dimen;->indicator_internal_padding:I
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 54
a=0;//     .local v12, "padding":I
a=0;//     #v12=(Integer);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->mArrowImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, v12, v12, v12, v12}, Landroid/widget/ImageView;->setPadding(IIII)V
a=0;// 
a=0;//     .line 55
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->mArrowImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 58
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode()[I
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     aget v0, v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 72
a=0;//     sget v8, Lcom/handmark/pulltorefresh/library/R$anim;->slide_in_from_top:I
a=0;// 
a=0;//     .line 73
a=0;//     .local v8, "inAnimResId":I
a=0;//     #v8=(Integer);
a=0;//     sget v11, Lcom/handmark/pulltorefresh/library/R$anim;->slide_out_to_top:I
a=0;// 
a=0;//     .line 74
a=0;//     .local v11, "outAnimResId":I
a=0;//     #v11=(Integer);
a=0;//     sget v0, Lcom/handmark/pulltorefresh/library/R$drawable;->indicator_bg_top:I
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 78
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v10=(Conflicted);
a=0;//     invoke-static {p1, v8}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Animation;);
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->mInAnim:Landroid/view/animation/Animation;
a=0;// 
a=0;//     .line 79
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->mInAnim:Landroid/view/animation/Animation;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V
a=0;// 
a=0;//     .line 81
a=0;//     invoke-static {p1, v11}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->mOutAnim:Landroid/view/animation/Animation;
a=0;// 
a=0;//     .line 82
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->mOutAnim:Landroid/view/animation/Animation;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V
a=0;// 
a=0;//     .line 84
a=0;//     new-instance v9, Landroid/view/animation/LinearInterpolator;
a=0;// 
a=0;//     #v9=(UninitRef,Landroid/view/animation/LinearInterpolator;);
a=0;//     invoke-direct {v9}, Landroid/view/animation/LinearInterpolator;-><init>()V
a=0;// 
a=0;//     .line 85
a=0;//     .local v9, "interpolator":Landroid/view/animation/Interpolator;
a=0;//     #v9=(Reference,Landroid/view/animation/LinearInterpolator;);
a=0;//     new-instance v0, Landroid/view/animation/RotateAnimation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/RotateAnimation;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/high16 v2, -0x3ccc0000    # -180.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/high16 v4, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 86
a=0;//     #v5=(One);
a=0;//     const/high16 v6, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-direct/range {v0 .. v6}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V
a=0;// 
a=0;//     .line 85
a=0;//     #v0=(Reference,Landroid/view/animation/RotateAnimation;);
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->mRotateAnimation:Landroid/view/animation/Animation;
a=0;// 
a=0;//     .line 87
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->mRotateAnimation:Landroid/view/animation/Animation;
a=0;// 
a=0;//     invoke-virtual {v0, v9}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 88
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->mRotateAnimation:Landroid/view/animation/Animation;
a=0;// 
a=0;//     const-wide/16 v1, 0x96
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V
a=0;// 
a=0;//     .line 89
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->mRotateAnimation:Landroid/view/animation/Animation;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V
a=0;// 
a=0;//     .line 91
a=0;//     new-instance v0, Landroid/view/animation/RotateAnimation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/RotateAnimation;);
a=0;//     const/high16 v1, -0x3ccc0000    # -180.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     const/high16 v4, 0x3f000000    # 0.5f
a=0;// 
a=0;//     .line 92
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     const/high16 v6, 0x3f000000    # 0.5f
a=0;// 
a=0;//     invoke-direct/range {v0 .. v6}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V
a=0;// 
a=0;//     .line 91
a=0;//     #v0=(Reference,Landroid/view/animation/RotateAnimation;);
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->mResetRotateAnimation:Landroid/view/animation/Animation;
a=0;// 
a=0;//     .line 93
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->mResetRotateAnimation:Landroid/view/animation/Animation;
a=0;// 
a=0;//     invoke-virtual {v0, v9}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 94
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->mResetRotateAnimation:Landroid/view/animation/Animation;
a=0;// 
a=0;//     const-wide/16 v1, 0x96
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V
a=0;// 
a=0;//     .line 95
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->mResetRotateAnimation:Landroid/view/animation/Animation;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V
a=0;// 
a=0;//     .line 97
a=0;//     return-void
a=0;// 
a=0;//     .line 60
a=0;//     .end local v8    # "inAnimResId":I
a=0;//     .end local v9    # "interpolator":Landroid/view/animation/Interpolator;
a=0;//     .end local v11    # "outAnimResId":I
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     sget v8, Lcom/handmark/pulltorefresh/library/R$anim;->slide_in_from_bottom:I
a=0;// 
a=0;//     .line 61
a=0;//     .restart local v8    # "inAnimResId":I
a=0;//     #v8=(Integer);
a=0;//     sget v11, Lcom/handmark/pulltorefresh/library/R$anim;->slide_out_to_bottom:I
a=0;// 
a=0;//     .line 62
a=0;//     .restart local v11    # "outAnimResId":I
a=0;//     #v11=(Integer);
a=0;//     sget v0, Lcom/handmark/pulltorefresh/library/R$drawable;->indicator_bg_bottom:I
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 65
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->mArrowImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     sget-object v1, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageView$ScaleType;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V
a=0;// 
a=0;//     .line 66
a=0;//     new-instance v10, Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v10=(UninitRef,Landroid/graphics/Matrix;);
a=0;//     invoke-direct {v10}, Landroid/graphics/Matrix;-><init>()V
a=0;// 
a=0;//     .line 67
a=0;//     .local v10, "matrix":Landroid/graphics/Matrix;
a=0;//     #v10=(Reference,Landroid/graphics/Matrix;);
a=0;//     const/high16 v0, 0x43340000    # 180.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v7}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     const/high16 v2, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     div-float/2addr v1, v2
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     const/high16 v3, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     div-float/2addr v2, v3
a=0;// 
a=0;//     invoke-virtual {v10, v0, v1, v2}, Landroid/graphics/Matrix;->setRotate(FFF)V
a=0;// 
a=0;//     .line 68
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->mArrowImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v0, v10}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 58
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x3
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public hide()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 109
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->mOutAnim:Landroid/view/animation/Animation;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Animation;);
a=0;//     invoke-virtual {p0, v0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 110
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final isVisible()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 100
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->getAnimation()Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 101
a=0;//     .local v0, "currentAnim":Landroid/view/animation/Animation;
a=0;//     #v0=(Reference,Landroid/view/animation/Animation;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 102
a=0;//     iget-object v3, p0, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->mInAnim:Landroid/view/animation/Animation;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/animation/Animation;);
a=0;//     if-ne v3, v0, :cond_1
a=0;// 
a=0;//     .line 105
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Boolean);v3=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(One);v3=(Reference,Landroid/view/animation/Animation;);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 102
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 105
a=0;//     :cond_2
a=0;//     #v1=(One);v3=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->getVisibility()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onAnimationEnd(Landroid/view/animation/Animation;)V
a=0;//     .locals 1
a=0;//     .param p1, "animation"    # Landroid/view/animation/Animation;
a=0;// 
a=0;//     .prologue
a=0;//     .line 119
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->mOutAnim:Landroid/view/animation/Animation;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Animation;);
a=0;//     if-ne p1, v0, :cond_1
a=0;// 
a=0;//     .line 120
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->mArrowImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V
a=0;// 
a=0;//     .line 121
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 126
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->clearAnimation()V
a=0;// 
a=0;//     .line 127
a=0;//     return-void
a=0;// 
a=0;//     .line 122
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/view/animation/Animation;);
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->mInAnim:Landroid/view/animation/Animation;
a=0;// 
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     .line 123
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onAnimationRepeat(Landroid/view/animation/Animation;)V
a=0;//     .locals 0
a=0;//     .param p1, "animation"    # Landroid/view/animation/Animation;
a=0;// 
a=0;//     .prologue
a=0;//     .line 132
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onAnimationStart(Landroid/view/animation/Animation;)V
a=0;//     .locals 1
a=0;//     .param p1, "animation"    # Landroid/view/animation/Animation;
a=0;// 
a=0;//     .prologue
a=0;//     .line 136
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 137
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public pullToRefresh()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 144
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->mArrowImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->mResetRotateAnimation:Landroid/view/animation/Animation;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/Animation;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 145
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public releaseToRefresh()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 140
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->mArrowImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->mRotateAnimation:Landroid/view/animation/Animation;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/Animation;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 141
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public show()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 113
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->mArrowImageView:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->mInAnim:Landroid/view/animation/Animation;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/handmark/pulltorefresh/library/internal/IndicatorLayout;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 115
a=0;//     return-void
a=0;// .end method
}}
