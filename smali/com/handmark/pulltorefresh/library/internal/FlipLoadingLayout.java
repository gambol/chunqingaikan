package com.handmark.pulltorefresh.library.internal; class FlipLoadingLayout { void a() { int a;
a=0;// .class public Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;
a=0;// .super Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// .source "FlipLoadingLayout.java"
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
a=0;// .field static final FLIP_ANIMATION_DURATION:I = 0x96
a=0;// 
a=0;// 
a=0;// # instance fields
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
a=0;//     .line 34
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode:[I
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
a=0;//     sput-object v0, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode:[I
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
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;Landroid/content/res/TypedArray;)V
a=0;//     .locals 8
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p4, "attrs"    # Landroid/content/res/TypedArray;
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     .local p2, "mode":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
a=0;//     .local p3, "scrollDirection":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;"
a=0;//     invoke-direct {p0, p1, p2, p3, p4}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;-><init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;Landroid/content/res/TypedArray;)V
a=0;// 
a=0;//     .line 43
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;);
a=0;//     sget-object v0, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_START:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     if-ne p2, v0, :cond_0
a=0;// 
a=0;//     const/16 v7, -0xb4
a=0;// 
a=0;//     .line 45
a=0;//     .local v7, "rotateAngle":I
a=0;//     :goto_0
a=0;//     #v7=(Short);
a=0;//     new-instance v0, Landroid/view/animation/RotateAnimation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/RotateAnimation;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     int-to-float v2, v7
a=0;// 
a=0;//     #v2=(Float);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/high16 v4, 0x3f000000    # 0.5f
a=0;// 
a=0;//     .line 46
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/high16 v6, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-direct/range {v0 .. v6}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V
a=0;// 
a=0;//     .line 45
a=0;//     #v0=(Reference,Landroid/view/animation/RotateAnimation;);
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;->mRotateAnimation:Landroid/view/animation/Animation;
a=0;// 
a=0;//     .line 47
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;->mRotateAnimation:Landroid/view/animation/Animation;
a=0;// 
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;->ANIMATION_INTERPOLATOR:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 48
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;->mRotateAnimation:Landroid/view/animation/Animation;
a=0;// 
a=0;//     const-wide/16 v1, 0x96
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V
a=0;// 
a=0;//     .line 49
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;->mRotateAnimation:Landroid/view/animation/Animation;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V
a=0;// 
a=0;//     .line 51
a=0;//     new-instance v0, Landroid/view/animation/RotateAnimation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/RotateAnimation;);
a=0;//     int-to-float v1, v7
a=0;// 
a=0;//     #v1=(Float);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     const/high16 v4, 0x3f000000    # 0.5f
a=0;// 
a=0;//     .line 52
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     const/high16 v6, 0x3f000000    # 0.5f
a=0;// 
a=0;//     invoke-direct/range {v0 .. v6}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V
a=0;// 
a=0;//     .line 51
a=0;//     #v0=(Reference,Landroid/view/animation/RotateAnimation;);
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;->mResetRotateAnimation:Landroid/view/animation/Animation;
a=0;// 
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;->mResetRotateAnimation:Landroid/view/animation/Animation;
a=0;// 
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;->ANIMATION_INTERPOLATOR:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 54
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;->mResetRotateAnimation:Landroid/view/animation/Animation;
a=0;// 
a=0;//     const-wide/16 v1, 0x96
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V
a=0;// 
a=0;//     .line 55
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;->mResetRotateAnimation:Landroid/view/animation/Animation;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V
a=0;// 
a=0;//     .line 56
a=0;//     return-void
a=0;// 
a=0;//     .line 43
a=0;//     .end local v7    # "rotateAngle":I
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     const/16 v7, 0xb4
a=0;// 
a=0;//     #v7=(PosShort);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private getDrawableRotationAngle()F
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 123
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 124
a=0;//     .local v0, "angle":F
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;->$SWITCH_TABLE$com$handmark$pulltorefresh$library$PullToRefreshBase$Mode()[I
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     iget-object v2, p0, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;->mMode:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;
a=0;// 
a=0;//     #v2=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;);
a=0;//     invoke-virtual {v2}, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aget v1, v1, v2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     .line 143
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 126
a=0;//     :pswitch_0
a=0;//     #v0=(Null);v1=(Integer);v2=(Integer);
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;->mScrollDirection:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;);
a=0;//     sget-object v2, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->HORIZONTAL:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;// 
a=0;//     #v2=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;);
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     .line 127
a=0;//     const/high16 v0, 0x42b40000    # 90.0f
a=0;// 
a=0;//     .line 128
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 129
a=0;//     :cond_1
a=0;//     #v0=(Null);
a=0;//     const/high16 v0, 0x43340000    # 180.0f
a=0;// 
a=0;//     .line 131
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 134
a=0;//     :pswitch_1
a=0;//     #v0=(Null);v1=(Integer);v2=(Integer);
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;->mScrollDirection:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;// 
a=0;//     #v1=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;);
a=0;//     sget-object v2, Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;->HORIZONTAL:Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;
a=0;// 
a=0;//     #v2=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     .line 135
a=0;//     const/high16 v0, 0x43870000    # 270.0f
a=0;// 
a=0;//     .line 137
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 124
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x2
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected getDefaultDrawableResId()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 119
a=0;//     sget v0, Lcom/handmark/pulltorefresh/library/R$drawable;->default_ptr_flip:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onLoadingDrawableSet(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 8
a=0;//     .param p1, "imageDrawable"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v7, 0x40000000    # 2.0f
a=0;// 
a=0;//     .line 60
a=0;//     #v7=(Integer);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 61
a=0;//     invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 62
a=0;//     .local v0, "dHeight":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 69
a=0;//     .local v1, "dWidth":I
a=0;//     #v1=(Integer);
a=0;//     iget-object v4, p0, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;->mHeaderImage:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v4}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 70
a=0;//     .local v2, "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     #v2=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, v2, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     iput v4, v2, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     .line 71
a=0;//     iget-object v4, p0, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;->mHeaderImage:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v4}, Landroid/widget/ImageView;->requestLayout()V
a=0;// 
a=0;//     .line 77
a=0;//     iget-object v4, p0, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;->mHeaderImage:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget-object v5, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/ImageView$ScaleType;);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V
a=0;// 
a=0;//     .line 78
a=0;//     new-instance v3, Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/graphics/Matrix;);
a=0;//     invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V
a=0;// 
a=0;//     .line 79
a=0;//     .local v3, "matrix":Landroid/graphics/Matrix;
a=0;//     #v3=(Reference,Landroid/graphics/Matrix;);
a=0;//     iget v4, v2, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int/2addr v4, v1
a=0;// 
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     div-float/2addr v4, v7
a=0;// 
a=0;//     iget v5, v2, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     sub-int/2addr v5, v0
a=0;// 
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     div-float/2addr v5, v7
a=0;// 
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z
a=0;// 
a=0;//     .line 80
a=0;//     invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;->getDrawableRotationAngle()F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     iget v5, v2, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     div-float/2addr v5, v7
a=0;// 
a=0;//     iget v6, v2, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     div-float/2addr v6, v7
a=0;// 
a=0;//     invoke-virtual {v3, v4, v5, v6}, Landroid/graphics/Matrix;->postRotate(FFF)Z
a=0;// 
a=0;//     .line 81
a=0;//     iget-object v4, p0, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;->mHeaderImage:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v4, v3}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V
a=0;// 
a=0;//     .line 83
a=0;//     .end local v0    # "dHeight":I
a=0;//     .end local v1    # "dWidth":I
a=0;//     .end local v2    # "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     .end local v3    # "matrix":Landroid/graphics/Matrix;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPullImpl(F)V
a=0;//     .locals 0
a=0;//     .param p1, "scaleOfLayout"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected pullToRefreshImpl()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;->mRotateAnimation:Landroid/view/animation/Animation;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Animation;);
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;->mHeaderImage:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v1}, Landroid/widget/ImageView;->getAnimation()Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 94
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;->mHeaderImage:Landroid/widget/ImageView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;->mResetRotateAnimation:Landroid/view/animation/Animation;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 96
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected refreshingImpl()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;->mHeaderImage:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V
a=0;// 
a=0;//     .line 101
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;->mHeaderImage:Landroid/widget/ImageView;
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 102
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;->mHeaderProgress:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     .line 103
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected releaseToRefreshImpl()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 107
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;->mHeaderImage:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;->mRotateAnimation:Landroid/view/animation/Animation;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/Animation;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 108
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected resetImpl()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;->mHeaderImage:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;->mHeaderProgress:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/FlipLoadingLayout;->mHeaderImage:Landroid/widget/ImageView;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 115
a=0;//     return-void
a=0;// .end method
}}
