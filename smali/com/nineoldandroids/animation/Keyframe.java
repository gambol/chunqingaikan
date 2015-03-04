package com.nineoldandroids.animation; class Keyframe { void a() { int a;
a=0;// .class public abstract Lcom/nineoldandroids/animation/Keyframe;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Keyframe.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Cloneable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/nineoldandroids/animation/Keyframe$FloatKeyframe;,
a=0;//         Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;,
a=0;//         Lcom/nineoldandroids/animation/Keyframe$ObjectKeyframe;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mFraction:F
a=0;// 
a=0;// .field mHasValue:Z
a=0;// 
a=0;// .field private mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;// .field mValueType:Ljava/lang/Class;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 54
a=0;//     #p0=(Reference,Lcom/nineoldandroids/animation/Keyframe;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/Keyframe;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .line 61
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-boolean v0, p0, Lcom/nineoldandroids/animation/Keyframe;->mHasValue:Z
a=0;// 
a=0;//     .line 38
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static ofFloat(F)Lcom/nineoldandroids/animation/Keyframe;
a=0;//     .locals 1
a=0;//     .param p0, "fraction"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 124
a=0;//     new-instance v0, Lcom/nineoldandroids/animation/Keyframe$FloatKeyframe;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/nineoldandroids/animation/Keyframe$FloatKeyframe;);
a=0;//     invoke-direct {v0, p0}, Lcom/nineoldandroids/animation/Keyframe$FloatKeyframe;-><init>(F)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/Keyframe$FloatKeyframe;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static ofFloat(FF)Lcom/nineoldandroids/animation/Keyframe;
a=0;//     .locals 1
a=0;//     .param p0, "fraction"    # F
a=0;//     .param p1, "value"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     new-instance v0, Lcom/nineoldandroids/animation/Keyframe$FloatKeyframe;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/nineoldandroids/animation/Keyframe$FloatKeyframe;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/nineoldandroids/animation/Keyframe$FloatKeyframe;-><init>(FF)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/Keyframe$FloatKeyframe;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static ofInt(F)Lcom/nineoldandroids/animation/Keyframe;
a=0;//     .locals 1
a=0;//     .param p0, "fraction"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     new-instance v0, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;);
a=0;//     invoke-direct {v0, p0}, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;-><init>(F)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static ofInt(FI)Lcom/nineoldandroids/animation/Keyframe;
a=0;//     .locals 1
a=0;//     .param p0, "fraction"    # F
a=0;//     .param p1, "value"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     new-instance v0, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;-><init>(FI)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/Keyframe$IntKeyframe;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static ofObject(F)Lcom/nineoldandroids/animation/Keyframe;
a=0;//     .locals 2
a=0;//     .param p0, "fraction"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 156
a=0;//     new-instance v0, Lcom/nineoldandroids/animation/Keyframe$ObjectKeyframe;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/nineoldandroids/animation/Keyframe$ObjectKeyframe;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p0, v1}, Lcom/nineoldandroids/animation/Keyframe$ObjectKeyframe;-><init>(FLjava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/Keyframe$ObjectKeyframe;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static ofObject(FLjava/lang/Object;)Lcom/nineoldandroids/animation/Keyframe;
a=0;//     .locals 1
a=0;//     .param p0, "fraction"    # F
a=0;//     .param p1, "value"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 140
a=0;//     new-instance v0, Lcom/nineoldandroids/animation/Keyframe$ObjectKeyframe;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/nineoldandroids/animation/Keyframe$ObjectKeyframe;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/nineoldandroids/animation/Keyframe$ObjectKeyframe;-><init>(FLjava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/Keyframe$ObjectKeyframe;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public abstract clone()Lcom/nineoldandroids/animation/Keyframe;
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
a=0;//     invoke-virtual {p0}, Lcom/nineoldandroids/animation/Keyframe;->clone()Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/Keyframe;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getFraction()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 191
a=0;//     iget v0, p0, Lcom/nineoldandroids/animation/Keyframe;->mFraction:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getInterpolator()Landroid/view/animation/Interpolator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 211
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/Keyframe;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getType()Ljava/lang/Class;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 232
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/Keyframe;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public abstract getValue()Ljava/lang/Object;
a=0;// .end method
a=0;// 
a=0;// .method public hasValue()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 167
a=0;//     iget-boolean v0, p0, Lcom/nineoldandroids/animation/Keyframe;->mHasValue:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public setFraction(F)V
a=0;//     .locals 0
a=0;//     .param p1, "fraction"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 201
a=0;//     iput p1, p0, Lcom/nineoldandroids/animation/Keyframe;->mFraction:F
a=0;// 
a=0;//     .line 202
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;//     .locals 0
a=0;//     .param p1, "interpolator"    # Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 221
a=0;//     iput-object p1, p0, Lcom/nineoldandroids/animation/Keyframe;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .line 222
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public abstract setValue(Ljava/lang/Object;)V
a=0;// .end method
}}
