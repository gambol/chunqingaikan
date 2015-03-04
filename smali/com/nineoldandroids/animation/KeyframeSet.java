package com.nineoldandroids.animation; class KeyframeSet { void a() { int a;
a=0;// .class Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// .super Ljava/lang/Object;
a=0;// .source "KeyframeSet.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mEvaluator:Lcom/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;// .field mFirstKeyframe:Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;// .field mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;// .field mKeyframes:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/nineoldandroids/animation/Keyframe;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field mLastKeyframe:Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;// .field mNumKeyframes:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public varargs constructor <init>([Lcom/nineoldandroids/animation/Keyframe;)V
a=0;//     .locals 2
a=0;//     .param p1, "keyframes"    # [Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 45
a=0;//     #p0=(Reference,Lcom/nineoldandroids/animation/KeyframeSet;);
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mNumKeyframes:I
a=0;// 
a=0;//     .line 46
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 47
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 48
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mFirstKeyframe:Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     .line 49
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget v1, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mNumKeyframes:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mLastKeyframe:Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mLastKeyframe:Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/nineoldandroids/animation/Keyframe;->getInterpolator()Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .line 51
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofFloat([F)Lcom/nineoldandroids/animation/KeyframeSet;
a=0;//     .locals 7
a=0;//     .param p0, "values"    # [F
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 69
a=0;//     #v4=(Null);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     .line 70
a=0;//     .local v2, "numKeyframes":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     new-array v1, v3, [Lcom/nineoldandroids/animation/Keyframe$FloatKeyframe;
a=0;// 
a=0;//     .line 71
a=0;//     .local v1, "keyframes":[Lcom/nineoldandroids/animation/Keyframe$FloatKeyframe;
a=0;//     #v1=(Reference,[Lcom/nineoldandroids/animation/Keyframe$FloatKeyframe;);
a=0;//     if-ne v2, v6, :cond_1
a=0;// 
a=0;//     .line 72
a=0;//     invoke-static {v5}, Lcom/nineoldandroids/animation/Keyframe;->ofFloat(F)Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/nineoldandroids/animation/Keyframe;);
a=0;//     check-cast v3, Lcom/nineoldandroids/animation/Keyframe$FloatKeyframe;
a=0;// 
a=0;//     aput-object v3, v1, v4
a=0;// 
a=0;//     .line 73
a=0;//     const/high16 v3, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     aget v4, p0, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v4}, Lcom/nineoldandroids/animation/Keyframe;->ofFloat(FF)Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/nineoldandroids/animation/Keyframe;);
a=0;//     check-cast v3, Lcom/nineoldandroids/animation/Keyframe$FloatKeyframe;
a=0;// 
a=0;//     aput-object v3, v1, v6
a=0;// 
a=0;//     .line 80
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v3, Lcom/nineoldandroids/animation/FloatKeyframeSet;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/nineoldandroids/animation/FloatKeyframeSet;);
a=0;//     invoke-direct {v3, v1}, Lcom/nineoldandroids/animation/FloatKeyframeSet;-><init>([Lcom/nineoldandroids/animation/Keyframe$FloatKeyframe;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/nineoldandroids/animation/FloatKeyframeSet;);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 75
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v3=(Integer);v4=(Null);
a=0;//     aget v3, p0, v4
a=0;// 
a=0;//     invoke-static {v5, v3}, Lcom/nineoldandroids/animation/Keyframe;->ofFloat(FF)Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/nineoldandroids/animation/Keyframe;);
a=0;//     check-cast v3, Lcom/nineoldandroids/animation/Keyframe$FloatKeyframe;
a=0;// 
a=0;//     aput-object v3, v1, v4
a=0;// 
a=0;//     .line 76
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v4=(Integer);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     .line 77
a=0;//     int-to-float v3, v0
a=0;// 
a=0;//     #v3=(Float);
a=0;//     add-int/lit8 v4, v2, -0x1
a=0;// 
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     div-float/2addr v3, v4
a=0;// 
a=0;//     aget v4, p0, v0
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v4}, Lcom/nineoldandroids/animation/Keyframe;->ofFloat(FF)Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/nineoldandroids/animation/Keyframe;);
a=0;//     check-cast v3, Lcom/nineoldandroids/animation/Keyframe$FloatKeyframe;
a=0;// 
a=0;//     aput-object v3, v1, v0
a=0;// 
a=0;//     .line 76
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofInt([I)Lcom/nineoldandroids/animation/KeyframeSet;
a=0;//     .locals 7
a=0;//     .param p0, "values"    # [I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 54
a=0;//     #v4=(Null);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     .line 55
a=0;//     .local v2, "numKeyframes":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     new-array v1, v3, [Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     .line 56
a=0;//     .local v1, "keyframes":[Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;//     #v1=(Reference,[Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;);
a=0;//     if-ne v2, v6, :cond_1
a=0;// 
a=0;//     .line 57
a=0;//     invoke-static {v5}, Lcom/nineoldandroids/animation/Keyframe;->ofInt(F)Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/nineoldandroids/animation/Keyframe;);
a=0;//     check-cast v3, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     aput-object v3, v1, v4
a=0;// 
a=0;//     .line 58
a=0;//     const/high16 v3, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     aget v4, p0, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v4}, Lcom/nineoldandroids/animation/Keyframe;->ofInt(FI)Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/nineoldandroids/animation/Keyframe;);
a=0;//     check-cast v3, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     aput-object v3, v1, v6
a=0;// 
a=0;//     .line 65
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v3, Lcom/nineoldandroids/animation/IntKeyframeSet;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/nineoldandroids/animation/IntKeyframeSet;);
a=0;//     invoke-direct {v3, v1}, Lcom/nineoldandroids/animation/IntKeyframeSet;-><init>([Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/nineoldandroids/animation/IntKeyframeSet;);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 60
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v3=(Integer);v4=(Null);
a=0;//     aget v3, p0, v4
a=0;// 
a=0;//     invoke-static {v5, v3}, Lcom/nineoldandroids/animation/Keyframe;->ofInt(FI)Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/nineoldandroids/animation/Keyframe;);
a=0;//     check-cast v3, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     aput-object v3, v1, v4
a=0;// 
a=0;//     .line 61
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v4=(Integer);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     .line 62
a=0;//     int-to-float v3, v0
a=0;// 
a=0;//     #v3=(Float);
a=0;//     add-int/lit8 v4, v2, -0x1
a=0;// 
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     div-float/2addr v3, v4
a=0;// 
a=0;//     aget v4, p0, v0
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v4}, Lcom/nineoldandroids/animation/Keyframe;->ofInt(FI)Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/nineoldandroids/animation/Keyframe;);
a=0;//     check-cast v3, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     aput-object v3, v1, v0
a=0;// 
a=0;//     .line 61
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofKeyframe([Lcom/nineoldandroids/animation/Keyframe;)Lcom/nineoldandroids/animation/KeyframeSet;
a=0;//     .locals 8
a=0;//     .param p0, "keyframes"    # [Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     array-length v6, p0
a=0;// 
a=0;//     .line 86
a=0;//     .local v6, "numKeyframes":I
a=0;//     #v6=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 87
a=0;//     .local v1, "hasFloat":Z
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 88
a=0;//     .local v2, "hasInt":Z
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 89
a=0;//     .local v3, "hasOther":Z
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .local v4, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Boolean);v2=(Boolean);v3=(Boolean);v4=(Integer);v7=(Conflicted);
a=0;//     if-lt v4, v6, :cond_0
a=0;// 
a=0;//     .line 98
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     if-nez v2, :cond_4
a=0;// 
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     .line 99
a=0;//     new-array v0, v6, [Lcom/nineoldandroids/animation/Keyframe$FloatKeyframe;
a=0;// 
a=0;//     .line 100
a=0;//     .local v0, "floatKeyframes":[Lcom/nineoldandroids/animation/Keyframe$FloatKeyframe;
a=0;//     #v0=(Reference,[Lcom/nineoldandroids/animation/Keyframe$FloatKeyframe;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     if-lt v4, v6, :cond_3
a=0;// 
a=0;//     .line 103
a=0;//     new-instance v7, Lcom/nineoldandroids/animation/FloatKeyframeSet;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/nineoldandroids/animation/FloatKeyframeSet;);
a=0;//     invoke-direct {v7, v0}, Lcom/nineoldandroids/animation/FloatKeyframeSet;-><init>([Lcom/nineoldandroids/animation/Keyframe$FloatKeyframe;)V
a=0;// 
a=0;//     .line 111
a=0;//     .end local v0    # "floatKeyframes":[Lcom/nineoldandroids/animation/Keyframe$FloatKeyframe;
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v5=(Conflicted);v7=(Reference,Ujava/lang/Object;);
a=0;//     return-object v7
a=0;// 
a=0;//     .line 90
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v5=(Uninit);v7=(Conflicted);
a=0;//     aget-object v7, p0, v4
a=0;// 
a=0;//     #v7=(Null);
a=0;//     instance-of v7, v7, Lcom/nineoldandroids/animation/Keyframe$FloatKeyframe;
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     .line 91
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 89
a=0;//     :goto_3
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 92
a=0;//     :cond_1
a=0;//     aget-object v7, p0, v4
a=0;// 
a=0;//     #v7=(Null);
a=0;//     instance-of v7, v7, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_2
a=0;// 
a=0;//     .line 93
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 94
a=0;//     #v2=(One);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 95
a=0;//     :cond_2
a=0;//     #v2=(Boolean);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 101
a=0;//     .restart local v0    # "floatKeyframes":[Lcom/nineoldandroids/animation/Keyframe$FloatKeyframe;
a=0;//     :cond_3
a=0;//     #v0=(Reference,[Lcom/nineoldandroids/animation/Keyframe$FloatKeyframe;);v3=(Boolean);v7=(Conflicted);
a=0;//     aget-object v7, p0, v4
a=0;// 
a=0;//     #v7=(Null);
a=0;//     check-cast v7, Lcom/nineoldandroids/animation/Keyframe$FloatKeyframe;
a=0;// 
a=0;//     #v7=(Reference,Lcom/nineoldandroids/animation/Keyframe$FloatKeyframe;);
a=0;//     aput-object v7, v0, v4
a=0;// 
a=0;//     .line 100
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 104
a=0;//     .end local v0    # "floatKeyframes":[Lcom/nineoldandroids/animation/Keyframe$FloatKeyframe;
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v7=(Conflicted);
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     if-nez v1, :cond_6
a=0;// 
a=0;//     if-nez v3, :cond_6
a=0;// 
a=0;//     .line 105
a=0;//     new-array v5, v6, [Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     .line 106
a=0;//     .local v5, "intKeyframes":[Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;//     #v5=(Reference,[Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     :goto_4
a=0;//     if-lt v4, v6, :cond_5
a=0;// 
a=0;//     .line 109
a=0;//     new-instance v7, Lcom/nineoldandroids/animation/IntKeyframeSet;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/nineoldandroids/animation/IntKeyframeSet;);
a=0;//     invoke-direct {v7, v5}, Lcom/nineoldandroids/animation/IntKeyframeSet;-><init>([Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;)V
a=0;// 
a=0;//     #v7=(Reference,Lcom/nineoldandroids/animation/IntKeyframeSet;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 107
a=0;//     :cond_5
a=0;//     #v7=(Conflicted);
a=0;//     aget-object v7, p0, v4
a=0;// 
a=0;//     #v7=(Null);
a=0;//     check-cast v7, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     #v7=(Reference,Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;);
a=0;//     aput-object v7, v5, v4
a=0;// 
a=0;//     .line 106
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 111
a=0;//     .end local v5    # "intKeyframes":[Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;//     :cond_6
a=0;//     #v5=(Uninit);v7=(Conflicted);
a=0;//     new-instance v7, Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/nineoldandroids/animation/KeyframeSet;);
a=0;//     invoke-direct {v7, p0}, Lcom/nineoldandroids/animation/KeyframeSet;-><init>([Lcom/nineoldandroids/animation/Keyframe;)V
a=0;// 
a=0;//     #v7=(Reference,Lcom/nineoldandroids/animation/KeyframeSet;);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofObject([Ljava/lang/Object;)Lcom/nineoldandroids/animation/KeyframeSet;
a=0;//     .locals 7
a=0;//     .param p0, "values"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 116
a=0;//     #v4=(Null);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     .line 117
a=0;//     .local v2, "numKeyframes":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     new-array v1, v3, [Lcom/nineoldandroids/animation/Keyframe$ObjectKeyframe;
a=0;// 
a=0;//     .line 118
a=0;//     .local v1, "keyframes":[Lcom/nineoldandroids/animation/Keyframe$ObjectKeyframe;
a=0;//     #v1=(Reference,[Lcom/nineoldandroids/animation/Keyframe$ObjectKeyframe;);
a=0;//     if-ne v2, v6, :cond_1
a=0;// 
a=0;//     .line 119
a=0;//     invoke-static {v5}, Lcom/nineoldandroids/animation/Keyframe;->ofObject(F)Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/nineoldandroids/animation/Keyframe;);
a=0;//     check-cast v3, Lcom/nineoldandroids/animation/Keyframe$ObjectKeyframe;
a=0;// 
a=0;//     aput-object v3, v1, v4
a=0;// 
a=0;//     .line 120
a=0;//     const/high16 v3, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     aget-object v4, p0, v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcom/nineoldandroids/animation/Keyframe;->ofObject(FLjava/lang/Object;)Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/nineoldandroids/animation/Keyframe;);
a=0;//     check-cast v3, Lcom/nineoldandroids/animation/Keyframe$ObjectKeyframe;
a=0;// 
a=0;//     aput-object v3, v1, v6
a=0;// 
a=0;//     .line 127
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v3, Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/nineoldandroids/animation/KeyframeSet;);
a=0;//     invoke-direct {v3, v1}, Lcom/nineoldandroids/animation/KeyframeSet;-><init>([Lcom/nineoldandroids/animation/Keyframe;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/nineoldandroids/animation/KeyframeSet;);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 122
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v3=(Integer);
a=0;//     aget-object v3, p0, v4
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v5, v3}, Lcom/nineoldandroids/animation/Keyframe;->ofObject(FLjava/lang/Object;)Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/nineoldandroids/animation/Keyframe;);
a=0;//     check-cast v3, Lcom/nineoldandroids/animation/Keyframe$ObjectKeyframe;
a=0;// 
a=0;//     aput-object v3, v1, v4
a=0;// 
a=0;//     .line 123
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     .line 124
a=0;//     int-to-float v3, v0
a=0;// 
a=0;//     #v3=(Float);
a=0;//     add-int/lit8 v4, v2, -0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     div-float/2addr v3, v4
a=0;// 
a=0;//     aget-object v4, p0, v0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v3, v4}, Lcom/nineoldandroids/animation/Keyframe;->ofObject(FLjava/lang/Object;)Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/nineoldandroids/animation/Keyframe;);
a=0;//     check-cast v3, Lcom/nineoldandroids/animation/Keyframe$ObjectKeyframe;
a=0;// 
a=0;//     aput-object v3, v1, v0
a=0;// 
a=0;//     .line 123
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public clone()Lcom/nineoldandroids/animation/KeyframeSet;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 144
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 145
a=0;//     .local v1, "keyframes":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/Keyframe;>;"
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v5, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 146
a=0;//     .local v4, "numKeyframes":I
a=0;//     #v4=(Integer);
a=0;//     new-array v2, v4, [Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     .line 147
a=0;//     .local v2, "newKeyframes":[Lcom/nineoldandroids/animation/Keyframe;
a=0;//     #v2=(Reference,[Lcom/nineoldandroids/animation/Keyframe;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v4, :cond_0
a=0;// 
a=0;//     .line 150
a=0;//     new-instance v3, Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/nineoldandroids/animation/KeyframeSet;);
a=0;//     invoke-direct {v3, v2}, Lcom/nineoldandroids/animation/KeyframeSet;-><init>([Lcom/nineoldandroids/animation/Keyframe;)V
a=0;// 
a=0;//     .line 151
a=0;//     .local v3, "newSet":Lcom/nineoldandroids/animation/KeyframeSet;
a=0;//     #v3=(Reference,Lcom/nineoldandroids/animation/KeyframeSet;);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 148
a=0;//     .end local v3    # "newSet":Lcom/nineoldandroids/animation/KeyframeSet;
a=0;//     :cond_0
a=0;//     #v3=(Uninit);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     check-cast v5, Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/nineoldandroids/animation/Keyframe;->clone()Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v2, v0
a=0;// 
a=0;//     .line 147
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic clone()Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/CloneNotSupportedException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0}, Lcom/nineoldandroids/animation/KeyframeSet;->clone()Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/KeyframeSet;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getValue(F)Ljava/lang/Object;
a=0;//     .locals 9
a=0;//     .param p1, "fraction"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     iget v6, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mNumKeyframes:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-ne v6, v7, :cond_1
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v6, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 171
a=0;//     iget-object v6, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     invoke-interface {v6, p1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     .line 173
a=0;//     :cond_0
a=0;//     iget-object v6, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mEvaluator:Lcom/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     iget-object v7, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mFirstKeyframe:Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     #v7=(Reference,Lcom/nineoldandroids/animation/Keyframe;);
a=0;//     invoke-virtual {v7}, Lcom/nineoldandroids/animation/Keyframe;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 174
a=0;//     iget-object v8, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mLastKeyframe:Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     #v8=(Reference,Lcom/nineoldandroids/animation/Keyframe;);
a=0;//     invoke-virtual {v8}, Lcom/nineoldandroids/animation/Keyframe;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 173
a=0;//     invoke-interface {v6, p1, v7, v8}, Lcom/nineoldandroids/animation/TypeEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 216
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-object v6
a=0;// 
a=0;//     .line 176
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Integer);v7=(PosByte);v8=(Uninit);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     cmpg-float v6, p1, v6
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-gtz v6, :cond_3
a=0;// 
a=0;//     .line 177
a=0;//     iget-object v6, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     .line 178
a=0;//     .local v3, "nextKeyframe":Lcom/nineoldandroids/animation/Keyframe;
a=0;//     invoke-virtual {v3}, Lcom/nineoldandroids/animation/Keyframe;->getInterpolator()Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 179
a=0;//     .local v1, "interpolator":Landroid/view/animation/Interpolator;
a=0;//     #v1=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 180
a=0;//     invoke-interface {v1, p1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     .line 182
a=0;//     :cond_2
a=0;//     iget-object v6, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mFirstKeyframe:Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/nineoldandroids/animation/Keyframe;->getFraction()F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 183
a=0;//     .local v4, "prevFraction":F
a=0;//     #v4=(Float);
a=0;//     sub-float v6, p1, v4
a=0;// 
a=0;//     .line 184
a=0;//     #v6=(Float);
a=0;//     invoke-virtual {v3}, Lcom/nineoldandroids/animation/Keyframe;->getFraction()F
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Float);
a=0;//     sub-float/2addr v7, v4
a=0;// 
a=0;//     .line 183
a=0;//     div-float v2, v6, v7
a=0;// 
a=0;//     .line 185
a=0;//     .local v2, "intervalFraction":F
a=0;//     #v2=(Float);
a=0;//     iget-object v6, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mEvaluator:Lcom/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     #v6=(Reference,Lcom/nineoldandroids/animation/TypeEvaluator;);
a=0;//     iget-object v7, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mFirstKeyframe:Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     #v7=(Reference,Lcom/nineoldandroids/animation/Keyframe;);
a=0;//     invoke-virtual {v7}, Lcom/nineoldandroids/animation/Keyframe;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 186
a=0;//     invoke-virtual {v3}, Lcom/nineoldandroids/animation/Keyframe;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 185
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v6, v2, v7, v8}, Lcom/nineoldandroids/animation/TypeEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 187
a=0;//     .end local v1    # "interpolator":Landroid/view/animation/Interpolator;
a=0;//     .end local v2    # "intervalFraction":F
a=0;//     .end local v3    # "nextKeyframe":Lcom/nineoldandroids/animation/Keyframe;
a=0;//     .end local v4    # "prevFraction":F
a=0;//     :cond_3
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Byte);v7=(PosByte);v8=(Uninit);
a=0;//     const/high16 v6, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     cmpl-float v6, p1, v6
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-ltz v6, :cond_5
a=0;// 
a=0;//     .line 188
a=0;//     iget-object v6, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     iget v7, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mNumKeyframes:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     add-int/lit8 v7, v7, -0x2
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v5, Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     .line 189
a=0;//     .local v5, "prevKeyframe":Lcom/nineoldandroids/animation/Keyframe;
a=0;//     iget-object v6, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mLastKeyframe:Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/nineoldandroids/animation/Keyframe;->getInterpolator()Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 190
a=0;//     .restart local v1    # "interpolator":Landroid/view/animation/Interpolator;
a=0;//     #v1=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 191
a=0;//     invoke-interface {v1, p1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     .line 193
a=0;//     :cond_4
a=0;//     invoke-virtual {v5}, Lcom/nineoldandroids/animation/Keyframe;->getFraction()F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 194
a=0;//     .restart local v4    # "prevFraction":F
a=0;//     #v4=(Float);
a=0;//     sub-float v6, p1, v4
a=0;// 
a=0;//     .line 195
a=0;//     #v6=(Float);
a=0;//     iget-object v7, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mLastKeyframe:Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     #v7=(Reference,Lcom/nineoldandroids/animation/Keyframe;);
a=0;//     invoke-virtual {v7}, Lcom/nineoldandroids/animation/Keyframe;->getFraction()F
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Float);
a=0;//     sub-float/2addr v7, v4
a=0;// 
a=0;//     .line 194
a=0;//     div-float v2, v6, v7
a=0;// 
a=0;//     .line 196
a=0;//     .restart local v2    # "intervalFraction":F
a=0;//     #v2=(Float);
a=0;//     iget-object v6, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mEvaluator:Lcom/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     #v6=(Reference,Lcom/nineoldandroids/animation/TypeEvaluator;);
a=0;//     invoke-virtual {v5}, Lcom/nineoldandroids/animation/Keyframe;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 197
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v8, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mLastKeyframe:Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     #v8=(Reference,Lcom/nineoldandroids/animation/Keyframe;);
a=0;//     invoke-virtual {v8}, Lcom/nineoldandroids/animation/Keyframe;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 196
a=0;//     invoke-interface {v6, v2, v7, v8}, Lcom/nineoldandroids/animation/TypeEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 199
a=0;//     .end local v1    # "interpolator":Landroid/view/animation/Interpolator;
a=0;//     .end local v2    # "intervalFraction":F
a=0;//     .end local v4    # "prevFraction":F
a=0;//     .end local v5    # "prevKeyframe":Lcom/nineoldandroids/animation/Keyframe;
a=0;//     :cond_5
a=0;//     #v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Byte);v7=(PosByte);v8=(Uninit);
a=0;//     iget-object v5, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mFirstKeyframe:Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     .line 200
a=0;//     .restart local v5    # "prevKeyframe":Lcom/nineoldandroids/animation/Keyframe;
a=0;//     #v5=(Reference,Lcom/nineoldandroids/animation/Keyframe;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     iget v6, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mNumKeyframes:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lt v0, v6, :cond_6
a=0;// 
a=0;//     .line 216
a=0;//     iget-object v6, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mLastKeyframe:Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     #v6=(Reference,Lcom/nineoldandroids/animation/Keyframe;);
a=0;//     invoke-virtual {v6}, Lcom/nineoldandroids/animation/Keyframe;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 201
a=0;//     :cond_6
a=0;//     #v6=(Integer);
a=0;//     iget-object v6, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     .line 202
a=0;//     .restart local v3    # "nextKeyframe":Lcom/nineoldandroids/animation/Keyframe;
a=0;//     invoke-virtual {v3}, Lcom/nineoldandroids/animation/Keyframe;->getFraction()F
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     cmpg-float v6, p1, v6
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-gez v6, :cond_8
a=0;// 
a=0;//     .line 203
a=0;//     invoke-virtual {v3}, Lcom/nineoldandroids/animation/Keyframe;->getInterpolator()Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 204
a=0;//     .restart local v1    # "interpolator":Landroid/view/animation/Interpolator;
a=0;//     #v1=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     .line 205
a=0;//     invoke-interface {v1, p1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F
a=0;// 
a=0;//     move-result p1
a=0;// 
a=0;//     .line 207
a=0;//     :cond_7
a=0;//     invoke-virtual {v5}, Lcom/nineoldandroids/animation/Keyframe;->getFraction()F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 208
a=0;//     .restart local v4    # "prevFraction":F
a=0;//     #v4=(Float);
a=0;//     sub-float v6, p1, v4
a=0;// 
a=0;//     .line 209
a=0;//     #v6=(Float);
a=0;//     invoke-virtual {v3}, Lcom/nineoldandroids/animation/Keyframe;->getFraction()F
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Float);
a=0;//     sub-float/2addr v7, v4
a=0;// 
a=0;//     .line 208
a=0;//     div-float v2, v6, v7
a=0;// 
a=0;//     .line 210
a=0;//     .restart local v2    # "intervalFraction":F
a=0;//     #v2=(Float);
a=0;//     iget-object v6, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mEvaluator:Lcom/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     #v6=(Reference,Lcom/nineoldandroids/animation/TypeEvaluator;);
a=0;//     invoke-virtual {v5}, Lcom/nineoldandroids/animation/Keyframe;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 211
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v3}, Lcom/nineoldandroids/animation/Keyframe;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 210
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v6, v2, v7, v8}, Lcom/nineoldandroids/animation/TypeEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 213
a=0;//     .end local v1    # "interpolator":Landroid/view/animation/Interpolator;
a=0;//     .end local v2    # "intervalFraction":F
a=0;//     .end local v4    # "prevFraction":F
a=0;//     :cond_8
a=0;//     #v1=(Uninit);v2=(Uninit);v4=(Uninit);v6=(Byte);v7=(PosByte);v8=(Uninit);
a=0;//     move-object v5, v3
a=0;// 
a=0;//     .line 200
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public setEvaluator(Lcom/nineoldandroids/animation/TypeEvaluator;)V
a=0;//     .locals 0
a=0;//     .param p1, "evaluator"    # Lcom/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 139
a=0;//     iput-object p1, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mEvaluator:Lcom/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     .line 140
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 221
a=0;//     const-string v1, " "
a=0;// 
a=0;//     .line 222
a=0;//     .local v1, "returnVal":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget v2, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mNumKeyframes:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     .line 225
a=0;//     return-object v1
a=0;// 
a=0;//     .line 223
a=0;//     :cond_0
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/nineoldandroids/animation/Keyframe;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "  "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 222
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
