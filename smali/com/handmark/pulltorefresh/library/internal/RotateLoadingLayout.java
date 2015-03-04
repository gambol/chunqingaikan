package com.handmark.pulltorefresh.library.internal; class RotateLoadingLayout { void a() { int a;
a=0;// .class public Lcom/handmark/pulltorefresh/library/internal/RotateLoadingLayout;
a=0;// .super Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// .source "RotateLoadingLayout.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final ROTATION_ANIMATION_DURATION:I = 0x4b0
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mHeaderImageMatrix:Landroid/graphics/Matrix;
a=0;// 
a=0;// .field private final mRotateAnimation:Landroid/view/animation/Animation;
a=0;// 
a=0;// .field private final mRotateDrawableWhilePulling:Z
a=0;// 
a=0;// .field private mRotationPivotX:F
a=0;// 
a=0;// .field private mRotationPivotY:F
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;Landroid/content/res/TypedArray;)V
a=0;//     .locals 7
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p4, "attrs"    # Landroid/content/res/TypedArray;
a=0;// 
a=0;//     .prologue
a=0;//     .local p2, "mode":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;"
a=0;//     .local p3, "scrollDirection":Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;, "Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;"
a=0;//     const/high16 v4, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 42
a=0;//     #v3=(One);
a=0;//     invoke-direct {p0, p1, p2, p3, p4}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;-><init>(Landroid/content/Context;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Mode;Lcom/handmark/pulltorefresh/library/PullToRefreshBase$Orientation;Landroid/content/res/TypedArray;)V
a=0;// 
a=0;//     .line 44
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/internal/RotateLoadingLayout;);
a=0;//     const/16 v0, 0xf
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p4, v0, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcom/handmark/pulltorefresh/library/internal/RotateLoadingLayout;->mRotateDrawableWhilePulling:Z
a=0;// 
a=0;//     .line 46
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/RotateLoadingLayout;->mHeaderImage:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     sget-object v1, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageView$ScaleType;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V
a=0;// 
a=0;//     .line 47
a=0;//     new-instance v0, Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Matrix;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Matrix;);
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/RotateLoadingLayout;->mHeaderImageMatrix:Landroid/graphics/Matrix;
a=0;// 
a=0;//     .line 48
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/RotateLoadingLayout;->mHeaderImage:Landroid/widget/ImageView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/internal/RotateLoadingLayout;->mHeaderImageMatrix:Landroid/graphics/Matrix;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V
a=0;// 
a=0;//     .line 50
a=0;//     new-instance v0, Landroid/view/animation/RotateAnimation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/RotateAnimation;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/high16 v2, 0x44340000    # 720.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v5, v3
a=0;// 
a=0;//     #v5=(One);
a=0;//     move v6, v4
a=0;// 
a=0;//     .line 51
a=0;//     #v6=(Integer);
a=0;//     invoke-direct/range {v0 .. v6}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V
a=0;// 
a=0;//     .line 50
a=0;//     #v0=(Reference,Landroid/view/animation/RotateAnimation;);
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/RotateLoadingLayout;->mRotateAnimation:Landroid/view/animation/Animation;
a=0;// 
a=0;//     .line 52
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/RotateLoadingLayout;->mRotateAnimation:Landroid/view/animation/Animation;
a=0;// 
a=0;//     sget-object v1, Lcom/handmark/pulltorefresh/library/internal/RotateLoadingLayout;->ANIMATION_INTERPOLATOR:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/RotateLoadingLayout;->mRotateAnimation:Landroid/view/animation/Animation;
a=0;// 
a=0;//     const-wide/16 v1, 0x4b0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V
a=0;// 
a=0;//     .line 54
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/RotateLoadingLayout;->mRotateAnimation:Landroid/view/animation/Animation;
a=0;// 
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setRepeatCount(I)V
a=0;// 
a=0;//     .line 55
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/RotateLoadingLayout;->mRotateAnimation:Landroid/view/animation/Animation;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/view/animation/Animation;->setRepeatMode(I)V
a=0;// 
a=0;//     .line 56
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private resetImageRotation()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/RotateLoadingLayout;->mHeaderImageMatrix:Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Matrix;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 90
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/RotateLoadingLayout;->mHeaderImageMatrix:Landroid/graphics/Matrix;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V
a=0;// 
a=0;//     .line 91
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/RotateLoadingLayout;->mHeaderImage:Landroid/widget/ImageView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/internal/RotateLoadingLayout;->mHeaderImageMatrix:Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V
a=0;// 
a=0;//     .line 93
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected getDefaultDrawableResId()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 107
a=0;//     sget v0, Lcom/handmark/pulltorefresh/library/R$drawable;->default_ptr_rotate:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onLoadingDrawableSet(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 2
a=0;//     .param p1, "imageDrawable"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v1, 0x40000000    # 2.0f
a=0;// 
a=0;//     .line 59
a=0;//     #v1=(Integer);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 60
a=0;//     invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     div-float/2addr v0, v1
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Math;->round(F)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Lcom/handmark/pulltorefresh/library/internal/RotateLoadingLayout;->mRotationPivotX:F
a=0;// 
a=0;//     .line 61
a=0;//     invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     div-float/2addr v0, v1
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Math;->round(F)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Lcom/handmark/pulltorefresh/library/internal/RotateLoadingLayout;->mRotationPivotY:F
a=0;// 
a=0;//     .line 63
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPullImpl(F)V
a=0;//     .locals 4
a=0;//     .param p1, "scaleOfLayout"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v3, 0x43340000    # 180.0f
a=0;// 
a=0;//     .line 67
a=0;//     #v3=(Integer);
a=0;//     iget-boolean v1, p0, Lcom/handmark/pulltorefresh/library/internal/RotateLoadingLayout;->mRotateDrawableWhilePulling:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 68
a=0;//     const/high16 v1, 0x42b40000    # 90.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-float v0, p1, v1
a=0;// 
a=0;//     .line 73
a=0;//     .local v0, "angle":F
a=0;//     :goto_0
a=0;//     #v0=(Float);v2=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/internal/RotateLoadingLayout;->mHeaderImageMatrix:Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Matrix;);
a=0;//     iget v2, p0, Lcom/handmark/pulltorefresh/library/internal/RotateLoadingLayout;->mRotationPivotX:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Lcom/handmark/pulltorefresh/library/internal/RotateLoadingLayout;->mRotationPivotY:F
a=0;// 
a=0;//     invoke-virtual {v1, v0, v2, v3}, Landroid/graphics/Matrix;->setRotate(FFF)V
a=0;// 
a=0;//     .line 74
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/internal/RotateLoadingLayout;->mHeaderImage:Landroid/widget/ImageView;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/handmark/pulltorefresh/library/internal/RotateLoadingLayout;->mHeaderImageMatrix:Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V
a=0;// 
a=0;//     .line 75
a=0;//     return-void
a=0;// 
a=0;//     .line 70
a=0;//     .end local v0    # "angle":F
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Boolean);v2=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/high16 v2, 0x43b40000    # 360.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-float/2addr v2, p1
a=0;// 
a=0;//     #v2=(Float);
a=0;//     sub-float/2addr v2, v3
a=0;// 
a=0;//     invoke-static {v3, v2}, Ljava/lang/Math;->min(FF)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .restart local v0    # "angle":F
a=0;//     #v0=(Float);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected pullToRefreshImpl()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 98
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected refreshingImpl()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/RotateLoadingLayout;->mHeaderImage:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/internal/RotateLoadingLayout;->mRotateAnimation:Landroid/view/animation/Animation;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/Animation;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 80
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected releaseToRefreshImpl()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected resetImpl()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/internal/RotateLoadingLayout;->mHeaderImage:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V
a=0;// 
a=0;//     .line 85
a=0;//     invoke-direct {p0}, Lcom/handmark/pulltorefresh/library/internal/RotateLoadingLayout;->resetImageRotation()V
a=0;// 
a=0;//     .line 86
a=0;//     return-void
a=0;// .end method
}}
