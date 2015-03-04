package com.actionbarsherlock.internal.nineoldandroids.animation; class Keyframe$ObjectKeyframe { void a() { int a;
a=0;// .class Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$ObjectKeyframe;
a=0;// .super Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe;
a=0;// .source "Keyframe.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "ObjectKeyframe"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mValue:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(FLjava/lang/Object;)V
a=0;//     .locals 1
a=0;//     .param p1, "fraction"    # F
a=0;//     .param p2, "value"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 249
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe;-><init>()V
a=0;// 
a=0;//     .line 250
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$ObjectKeyframe;);
a=0;//     iput p1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$ObjectKeyframe;->mFraction:F
a=0;// 
a=0;//     .line 251
a=0;//     iput-object p2, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$ObjectKeyframe;->mValue:Ljava/lang/Object;
a=0;// 
a=0;//     .line 252
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$ObjectKeyframe;->mHasValue:Z
a=0;// 
a=0;//     .line 253
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$ObjectKeyframe;->mHasValue:Z
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$ObjectKeyframe;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     .line 254
a=0;//     return-void
a=0;// 
a=0;//     .line 252
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 253
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     const-class v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public clone()Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$ObjectKeyframe;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 267
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$ObjectKeyframe;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$ObjectKeyframe;);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$ObjectKeyframe;->getFraction()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$ObjectKeyframe;->mValue:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$ObjectKeyframe;-><init>(FLjava/lang/Object;)V
a=0;// 
a=0;//     .line 268
a=0;//     .local v0, "kfClone":Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$ObjectKeyframe;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$ObjectKeyframe;);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$ObjectKeyframe;->getInterpolator()Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$ObjectKeyframe;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 269
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic clone()Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$ObjectKeyframe;->clone()Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$ObjectKeyframe;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$ObjectKeyframe;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getValue()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 257
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$ObjectKeyframe;->mValue:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setValue(Ljava/lang/Object;)V
a=0;//     .locals 1
a=0;//     .param p1, "value"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 261
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$ObjectKeyframe;->mValue:Ljava/lang/Object;
a=0;// 
a=0;//     .line 262
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe$ObjectKeyframe;->mHasValue:Z
a=0;// 
a=0;//     .line 263
a=0;//     return-void
a=0;// 
a=0;//     .line 262
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
