package com.nineoldandroids.animation; class Keyframe$IntKeyframe { void a() { int a;
a=0;// .class Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;// .super Lcom/nineoldandroids/animation/Keyframe;
a=0;// .source "Keyframe.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/nineoldandroids/animation/Keyframe;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "IntKeyframe"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mValue:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(F)V
a=0;//     .locals 1
a=0;//     .param p1, "fraction"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 289
a=0;//     invoke-direct {p0}, Lcom/nineoldandroids/animation/Keyframe;-><init>()V
a=0;// 
a=0;//     .line 290
a=0;//     #p0=(Reference,Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;);
a=0;//     iput p1, p0, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;->mFraction:F
a=0;// 
a=0;//     .line 291
a=0;//     sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     .line 292
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(FI)V
a=0;//     .locals 1
a=0;//     .param p1, "fraction"    # F
a=0;//     .param p2, "value"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 282
a=0;//     invoke-direct {p0}, Lcom/nineoldandroids/animation/Keyframe;-><init>()V
a=0;// 
a=0;//     .line 283
a=0;//     #p0=(Reference,Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;);
a=0;//     iput p1, p0, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;->mFraction:F
a=0;// 
a=0;//     .line 284
a=0;//     iput p2, p0, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;->mValue:I
a=0;// 
a=0;//     .line 285
a=0;//     sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     .line 286
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;->mHasValue:Z
a=0;// 
a=0;//     .line 287
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public clone()Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 311
a=0;//     new-instance v0, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;);
a=0;//     invoke-virtual {p0}, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;->getFraction()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v2, p0, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;->mValue:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;-><init>(FI)V
a=0;// 
a=0;//     .line 312
a=0;//     .local v0, "kfClone":Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;);
a=0;//     invoke-virtual {p0}, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;->getInterpolator()Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     invoke-virtual {v0, v1}, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 313
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic clone()Lcom/nineoldandroids/animation/Keyframe;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0}, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;->clone()Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getIntValue()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 295
a=0;//     iget v0, p0, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;->mValue:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getValue()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 299
a=0;//     iget v0, p0, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;->mValue:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setValue(Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;//     .param p1, "value"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 303
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     const-class v1, Ljava/lang/Integer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 304
a=0;//     check-cast p1, Ljava/lang/Integer;
a=0;// 
a=0;//     .end local p1    # "value":Ljava/lang/Object;
a=0;//     invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;->mValue:I
a=0;// 
a=0;//     .line 305
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;->mHasValue:Z
a=0;// 
a=0;//     .line 307
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
