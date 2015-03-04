package com.actionbarsherlock.internal.nineoldandroids.animation; class IntKeyframeSet { void a() { int a;
a=0;// .class Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;
a=0;// .super Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;// .source "IntKeyframeSet.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private deltaValue:I
a=0;// 
a=0;// .field private firstTime:Z
a=0;// 
a=0;// .field private firstValue:I
a=0;// 
a=0;// .field private lastValue:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public varargs constructor <init>([Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;)V
a=0;//     .locals 1
a=0;//     .param p1, "keyframes"    # [Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     invoke-direct {p0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;-><init>([Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe;)V
a=0;// 
a=0;//     .line 39
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->firstTime:Z
a=0;// 
a=0;//     .line 43
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public clone()Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 53
a=0;//     .local v1, "keyframes":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe;>;"
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 54
a=0;//     .local v4, "numKeyframes":I
a=0;//     #v4=(Integer);
a=0;//     new-array v2, v4, [Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     .line 55
a=0;//     .local v2, "newKeyframes":[Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;//     #v2=(Reference,[Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v4, :cond_0
a=0;// 
a=0;//     .line 58
a=0;//     new-instance v3, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;);
a=0;//     invoke-direct {v3, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;-><init>([Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;)V
a=0;// 
a=0;//     .line 59
a=0;//     .local v3, "newSet":Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 56
a=0;//     .end local v3    # "newSet":Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;
a=0;//     :cond_0
a=0;//     #v3=(Uninit);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     check-cast v5, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe;->clone()Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     check-cast v5, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     aput-object v5, v2, v0
a=0;// 
a=0;//     .line 55
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic clone()Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->clone()Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getIntValue(F)I
a=0;//     .locals 13
a=0;//     .param p1, "fraction"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v12, 0x1
a=0;// 
a=0;//     #v12=(One);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 63
a=0;//     #v11=(Null);
a=0;//     iget v9, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->mNumKeyframes:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     if-ne v9, v10, :cond_3
a=0;// 
a=0;//     .line 64
a=0;//     iget-boolean v9, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->firstTime:Z
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_0
a=0;// 
a=0;//     .line 65
a=0;//     iput-boolean v11, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->firstTime:Z
a=0;// 
a=0;//     .line 66
a=0;//     iget-object v9, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v9=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     check-cast v9, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     invoke-virtual {v9}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;->getIntValue()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     iput v9, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->firstValue:I
a=0;// 
a=0;//     .line 67
a=0;//     iget-object v9, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v9=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v9, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     check-cast v9, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     invoke-virtual {v9}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;->getIntValue()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     iput v9, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->lastValue:I
a=0;// 
a=0;//     .line 68
a=0;//     iget v9, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->lastValue:I
a=0;// 
a=0;//     iget v10, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->firstValue:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     sub-int/2addr v9, v10
a=0;// 
a=0;//     iput v9, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->deltaValue:I
a=0;// 
a=0;//     .line 70
a=0;//     :cond_0
a=0;//     iget-object v9, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v9=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     if-eqz v9, :cond_1
a=0;// 
a=0;//     .line 71
a=0;//     iget-object v9, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     invoke-interface {v9, p1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     .line 73
a=0;//     :cond_1
a=0;//     iget-object v9, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->mEvaluator:Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     if-nez v9, :cond_2
a=0;// 
a=0;//     .line 74
a=0;//     iget v9, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->firstValue:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     iget v10, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->deltaValue:I
a=0;// 
a=0;//     int-to-float v10, v10
a=0;// 
a=0;//     #v10=(Float);
a=0;//     mul-float/2addr v10, p1
a=0;// 
a=0;//     float-to-int v10, v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     add-int/2addr v9, v10
a=0;// 
a=0;//     .line 131
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     return v9
a=0;// 
a=0;//     .line 76
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;);v10=(Integer);v11=(Null);
a=0;//     iget-object v9, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->mEvaluator:Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     iget v10, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->firstValue:I
a=0;// 
a=0;//     invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Integer;);
a=0;//     iget v11, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->lastValue:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v9, p1, v10, v11}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     check-cast v9, Ljava/lang/Number;
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/Number;->intValue()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 79
a=0;//     :cond_3
a=0;//     #v10=(PosByte);v11=(Null);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     cmpg-float v9, p1, v9
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     if-gtz v9, :cond_6
a=0;// 
a=0;//     .line 80
a=0;//     iget-object v9, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v9=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     .line 81
a=0;//     .local v7, "prevKeyframe":Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;//     iget-object v9, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v9, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     .line 82
a=0;//     .local v4, "nextKeyframe":Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;//     invoke-virtual {v7}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;->getIntValue()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 83
a=0;//     .local v8, "prevValue":I
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v4}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;->getIntValue()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 84
a=0;//     .local v5, "nextValue":I
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v7}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;->getFraction()F
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 85
a=0;//     .local v6, "prevFraction":F
a=0;//     #v6=(Float);
a=0;//     invoke-virtual {v4}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;->getFraction()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 86
a=0;//     .local v3, "nextFraction":F
a=0;//     #v3=(Float);
a=0;//     invoke-virtual {v4}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;->getInterpolator()Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 87
a=0;//     .local v1, "interpolator":Landroid/view/animation/Interpolator;
a=0;//     #v1=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 88
a=0;//     invoke-interface {v1, p1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     .line 90
a=0;//     :cond_4
a=0;//     sub-float v9, p1, v6
a=0;// 
a=0;//     #v9=(Float);
a=0;//     sub-float v10, v3, v6
a=0;// 
a=0;//     #v10=(Float);
a=0;//     div-float v2, v9, v10
a=0;// 
a=0;//     .line 91
a=0;//     .local v2, "intervalFraction":F
a=0;//     #v2=(Float);
a=0;//     iget-object v9, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->mEvaluator:Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     #v9=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;);
a=0;//     if-nez v9, :cond_5
a=0;// 
a=0;//     .line 92
a=0;//     sub-int v9, v5, v8
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     int-to-float v9, v9
a=0;// 
a=0;//     #v9=(Float);
a=0;//     mul-float/2addr v9, v2
a=0;// 
a=0;//     float-to-int v9, v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     add-int/2addr v9, v8
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 93
a=0;//     :cond_5
a=0;//     #v9=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;);
a=0;//     iget-object v9, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->mEvaluator:Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v9, v2, v10, v11}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     check-cast v9, Ljava/lang/Number;
a=0;// 
a=0;//     .line 94
a=0;//     invoke-virtual {v9}, Ljava/lang/Number;->intValue()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 95
a=0;//     .end local v1    # "interpolator":Landroid/view/animation/Interpolator;
a=0;//     .end local v2    # "intervalFraction":F
a=0;//     .end local v3    # "nextFraction":F
a=0;//     .end local v4    # "nextKeyframe":Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;//     .end local v5    # "nextValue":I
a=0;//     .end local v6    # "prevFraction":F
a=0;//     .end local v7    # "prevKeyframe":Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;//     .end local v8    # "prevValue":I
a=0;//     :cond_6
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Byte);v10=(PosByte);v11=(Null);
a=0;//     const/high16 v9, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     cmpl-float v9, p1, v9
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     if-ltz v9, :cond_9
a=0;// 
a=0;//     .line 96
a=0;//     iget-object v9, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v9=(Reference,Ljava/util/ArrayList;);
a=0;//     iget v10, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->mNumKeyframes:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     add-int/lit8 v10, v10, -0x2
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     .line 97
a=0;//     .restart local v7    # "prevKeyframe":Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;//     iget-object v9, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget v10, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->mNumKeyframes:I
a=0;// 
a=0;//     add-int/lit8 v10, v10, -0x1
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     .line 98
a=0;//     .restart local v4    # "nextKeyframe":Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;//     invoke-virtual {v7}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;->getIntValue()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 99
a=0;//     .restart local v8    # "prevValue":I
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v4}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;->getIntValue()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 100
a=0;//     .restart local v5    # "nextValue":I
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v7}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;->getFraction()F
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 101
a=0;//     .restart local v6    # "prevFraction":F
a=0;//     #v6=(Float);
a=0;//     invoke-virtual {v4}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;->getFraction()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 102
a=0;//     .restart local v3    # "nextFraction":F
a=0;//     #v3=(Float);
a=0;//     invoke-virtual {v4}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;->getInterpolator()Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 103
a=0;//     .restart local v1    # "interpolator":Landroid/view/animation/Interpolator;
a=0;//     #v1=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     .line 104
a=0;//     invoke-interface {v1, p1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     .line 106
a=0;//     :cond_7
a=0;//     sub-float v9, p1, v6
a=0;// 
a=0;//     #v9=(Float);
a=0;//     sub-float v10, v3, v6
a=0;// 
a=0;//     #v10=(Float);
a=0;//     div-float v2, v9, v10
a=0;// 
a=0;//     .line 107
a=0;//     .restart local v2    # "intervalFraction":F
a=0;//     #v2=(Float);
a=0;//     iget-object v9, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->mEvaluator:Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     #v9=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;);
a=0;//     if-nez v9, :cond_8
a=0;// 
a=0;//     .line 108
a=0;//     sub-int v9, v5, v8
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     int-to-float v9, v9
a=0;// 
a=0;//     #v9=(Float);
a=0;//     mul-float/2addr v9, v2
a=0;// 
a=0;//     float-to-int v9, v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     add-int/2addr v9, v8
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 109
a=0;//     :cond_8
a=0;//     #v9=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;);
a=0;//     iget-object v9, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->mEvaluator:Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v9, v2, v10, v11}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     check-cast v9, Ljava/lang/Number;
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/Number;->intValue()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 111
a=0;//     .end local v1    # "interpolator":Landroid/view/animation/Interpolator;
a=0;//     .end local v2    # "intervalFraction":F
a=0;//     .end local v3    # "nextFraction":F
a=0;//     .end local v4    # "nextKeyframe":Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;//     .end local v5    # "nextValue":I
a=0;//     .end local v6    # "prevFraction":F
a=0;//     .end local v7    # "prevKeyframe":Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;//     .end local v8    # "prevValue":I
a=0;//     :cond_9
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Byte);v10=(PosByte);v11=(Null);
a=0;//     iget-object v9, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v9=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     .line 112
a=0;//     .restart local v7    # "prevKeyframe":Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Integer);v4=(Conflicted);v9=(Conflicted);
a=0;//     iget v9, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->mNumKeyframes:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-lt v0, v9, :cond_a
a=0;// 
a=0;//     .line 131
a=0;//     iget-object v9, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v9=(Reference,Ljava/util/ArrayList;);
a=0;//     iget v10, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->mNumKeyframes:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     add-int/lit8 v10, v10, -0x1
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     check-cast v9, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     invoke-virtual {v9}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     check-cast v9, Ljava/lang/Number;
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/Number;->intValue()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 113
a=0;//     :cond_a
a=0;//     #v10=(PosByte);
a=0;//     iget-object v9, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v9=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v9, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     .line 114
a=0;//     .restart local v4    # "nextKeyframe":Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;//     invoke-virtual {v4}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;->getFraction()F
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Float);
a=0;//     cmpg-float v9, p1, v9
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     if-gez v9, :cond_d
a=0;// 
a=0;//     .line 115
a=0;//     invoke-virtual {v4}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;->getInterpolator()Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 116
a=0;//     .restart local v1    # "interpolator":Landroid/view/animation/Interpolator;
a=0;//     #v1=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     if-eqz v1, :cond_b
a=0;// 
a=0;//     .line 117
a=0;//     invoke-interface {v1, p1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     .line 119
a=0;//     :cond_b
a=0;//     invoke-virtual {v7}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;->getFraction()F
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Float);
a=0;//     sub-float v9, p1, v9
a=0;// 
a=0;//     .line 120
a=0;//     invoke-virtual {v4}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;->getFraction()F
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Float);
a=0;//     invoke-virtual {v7}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;->getFraction()F
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Float);
a=0;//     sub-float/2addr v10, v11
a=0;// 
a=0;//     .line 119
a=0;//     div-float v2, v9, v10
a=0;// 
a=0;//     .line 121
a=0;//     .restart local v2    # "intervalFraction":F
a=0;//     #v2=(Float);
a=0;//     invoke-virtual {v7}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;->getIntValue()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 122
a=0;//     .restart local v8    # "prevValue":I
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v4}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$IntKeyframe;->getIntValue()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 123
a=0;//     .restart local v5    # "nextValue":I
a=0;//     #v5=(Integer);
a=0;//     iget-object v9, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->mEvaluator:Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     #v9=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;);
a=0;//     if-nez v9, :cond_c
a=0;// 
a=0;//     .line 124
a=0;//     sub-int v9, v5, v8
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     int-to-float v9, v9
a=0;// 
a=0;//     #v9=(Float);
a=0;//     mul-float/2addr v9, v2
a=0;// 
a=0;//     float-to-int v9, v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     add-int/2addr v9, v8
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 125
a=0;//     :cond_c
a=0;//     #v9=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;);
a=0;//     iget-object v9, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->mEvaluator:Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v9, v2, v10, v11}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     check-cast v9, Ljava/lang/Number;
a=0;// 
a=0;//     .line 126
a=0;//     invoke-virtual {v9}, Ljava/lang/Number;->intValue()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 128
a=0;//     .end local v1    # "interpolator":Landroid/view/animation/Interpolator;
a=0;//     .end local v2    # "intervalFraction":F
a=0;//     .end local v5    # "nextValue":I
a=0;//     .end local v8    # "prevValue":I
a=0;//     :cond_d
a=0;//     #v1=(Uninit);v2=(Uninit);v5=(Uninit);v8=(Uninit);v9=(Byte);v10=(PosByte);v11=(Null);
a=0;//     move-object v7, v4
a=0;// 
a=0;//     .line 112
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public getValue(F)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "fraction"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->getIntValue(F)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     return-object v0
a=0;// .end method
}}
