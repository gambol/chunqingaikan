package com.twocloo.com.cn.view; class Rotate3dAnimation { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/view/Rotate3dAnimation;
a=0;// .super Landroid/view/animation/Animation;
a=0;// .source "Rotate3dAnimation.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mCamera:Landroid/graphics/Camera;
a=0;// 
a=0;// .field private final mCenterX:F
a=0;// 
a=0;// .field private final mCenterY:F
a=0;// 
a=0;// .field private final mDepthZ:F
a=0;// 
a=0;// .field private final mFromDegrees:F
a=0;// 
a=0;// .field private final mReverse:Z
a=0;// 
a=0;// .field private final mToDegrees:F
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(FFFFFZ)V
a=0;//     .locals 0
a=0;//     .param p1, "fromDegrees"    # F
a=0;//     .param p2, "toDegrees"    # F
a=0;//     .param p3, "centerX"    # F
a=0;//     .param p4, "centerY"    # F
a=0;//     .param p5, "depthZ"    # F
a=0;//     .param p6, "reverse"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V
a=0;// 
a=0;//     .line 54
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/Rotate3dAnimation;);
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/view/Rotate3dAnimation;->mFromDegrees:F
a=0;// 
a=0;//     .line 55
a=0;//     iput p2, p0, Lcom/twocloo/com/cn/view/Rotate3dAnimation;->mToDegrees:F
a=0;// 
a=0;//     .line 56
a=0;//     iput p3, p0, Lcom/twocloo/com/cn/view/Rotate3dAnimation;->mCenterX:F
a=0;// 
a=0;//     .line 57
a=0;//     iput p4, p0, Lcom/twocloo/com/cn/view/Rotate3dAnimation;->mCenterY:F
a=0;// 
a=0;//     .line 58
a=0;//     iput p5, p0, Lcom/twocloo/com/cn/view/Rotate3dAnimation;->mDepthZ:F
a=0;// 
a=0;//     .line 59
a=0;//     iput-boolean p6, p0, Lcom/twocloo/com/cn/view/Rotate3dAnimation;->mReverse:Z
a=0;// 
a=0;//     .line 60
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected applyTransformation(FLandroid/view/animation/Transformation;)V
a=0;//     .locals 9
a=0;//     .param p1, "interpolatedTime"    # F
a=0;//     .param p2, "t"    # Landroid/view/animation/Transformation;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 70
a=0;//     #v8=(Null);
a=0;//     iget v4, p0, Lcom/twocloo/com/cn/view/Rotate3dAnimation;->mFromDegrees:F
a=0;// 
a=0;//     .line 71
a=0;//     .local v4, "fromDegrees":F
a=0;//     #v4=(Integer);
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/view/Rotate3dAnimation;->mToDegrees:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-float/2addr v6, v4
a=0;// 
a=0;//     #v6=(Float);
a=0;//     mul-float/2addr v6, p1
a=0;// 
a=0;//     add-float v3, v4, v6
a=0;// 
a=0;//     .line 73
a=0;//     .local v3, "degrees":F
a=0;//     #v3=(Float);
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/Rotate3dAnimation;->mCenterX:F
a=0;// 
a=0;//     .line 74
a=0;//     .local v1, "centerX":F
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/Rotate3dAnimation;->mCenterY:F
a=0;// 
a=0;//     .line 75
a=0;//     .local v2, "centerY":F
a=0;//     #v2=(Integer);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/Rotate3dAnimation;->mCamera:Landroid/graphics/Camera;
a=0;// 
a=0;//     .line 77
a=0;//     .local v0, "camera":Landroid/graphics/Camera;
a=0;//     #v0=(Reference,Landroid/graphics/Camera;);
a=0;//     invoke-virtual {p2}, Landroid/view/animation/Transformation;->getMatrix()Landroid/graphics/Matrix;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 79
a=0;//     .local v5, "matrix":Landroid/graphics/Matrix;
a=0;//     #v5=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {v0}, Landroid/graphics/Camera;->save()V
a=0;// 
a=0;//     .line 80
a=0;//     iget-boolean v6, p0, Lcom/twocloo/com/cn/view/Rotate3dAnimation;->mReverse:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 81
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/view/Rotate3dAnimation;->mDepthZ:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     mul-float/2addr v6, p1
a=0;// 
a=0;//     #v6=(Float);
a=0;//     invoke-virtual {v0, v8, v8, v6}, Landroid/graphics/Camera;->translate(FFF)V
a=0;// 
a=0;//     .line 85
a=0;//     :goto_0
a=0;//     #v7=(Conflicted);
a=0;//     invoke-virtual {v0, v3}, Landroid/graphics/Camera;->rotateY(F)V
a=0;// 
a=0;//     .line 86
a=0;//     invoke-virtual {v0, v5}, Landroid/graphics/Camera;->getMatrix(Landroid/graphics/Matrix;)V
a=0;// 
a=0;//     .line 87
a=0;//     invoke-virtual {v0}, Landroid/graphics/Camera;->restore()V
a=0;// 
a=0;//     .line 89
a=0;//     neg-float v6, v1
a=0;// 
a=0;//     neg-float v7, v2
a=0;// 
a=0;//     #v7=(Float);
a=0;//     invoke-virtual {v5, v6, v7}, Landroid/graphics/Matrix;->preTranslate(FF)Z
a=0;// 
a=0;//     .line 90
a=0;//     invoke-virtual {v5, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z
a=0;// 
a=0;//     .line 91
a=0;//     return-void
a=0;// 
a=0;//     .line 83
a=0;//     :cond_0
a=0;//     #v6=(Boolean);v7=(Uninit);
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/view/Rotate3dAnimation;->mDepthZ:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/high16 v7, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     sub-float/2addr v7, p1
a=0;// 
a=0;//     #v7=(Float);
a=0;//     mul-float/2addr v6, v7
a=0;// 
a=0;//     #v6=(Float);
a=0;//     invoke-virtual {v0, v8, v8, v6}, Landroid/graphics/Camera;->translate(FFF)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public initialize(IIII)V
a=0;//     .locals 1
a=0;//     .param p1, "width"    # I
a=0;//     .param p2, "height"    # I
a=0;//     .param p3, "parentWidth"    # I
a=0;//     .param p4, "parentHeight"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/view/animation/Animation;->initialize(IIII)V
a=0;// 
a=0;//     .line 65
a=0;//     new-instance v0, Landroid/graphics/Camera;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Camera;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Camera;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Camera;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/view/Rotate3dAnimation;->mCamera:Landroid/graphics/Camera;
a=0;// 
a=0;//     .line 66
a=0;//     return-void
a=0;// .end method
}}
