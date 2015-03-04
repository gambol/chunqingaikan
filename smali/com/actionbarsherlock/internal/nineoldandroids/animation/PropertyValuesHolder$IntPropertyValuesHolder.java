package com.actionbarsherlock.internal.nineoldandroids.animation; class PropertyValuesHolder$IntPropertyValuesHolder { void a() { int a;
a=0;// .class Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;
a=0;// .super Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// .source "PropertyValuesHolder.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "IntPropertyValuesHolder"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mIntAnimatedValue:I
a=0;// 
a=0;// .field mIntKeyframeSet:Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/String;Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "propertyName"    # Ljava/lang/String;
a=0;//     .param p2, "keyframeSet"    # Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 747
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;-><init>(Ljava/lang/String;Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;)V
a=0;// 
a=0;//     .line 748
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;);
a=0;//     sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     .line 749
a=0;//     iput-object p2, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mKeyframeSet:Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     .line 750
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mKeyframeSet:Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mIntKeyframeSet:Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;
a=0;// 
a=0;//     .line 751
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public varargs constructor <init>(Ljava/lang/String;[I)V
a=0;//     .locals 1
a=0;//     .param p1, "propertyName"    # Ljava/lang/String;
a=0;//     .param p2, "values"    # [I
a=0;// 
a=0;//     .prologue
a=0;//     .line 764
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;-><init>(Ljava/lang/String;Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;)V
a=0;// 
a=0;//     .line 765
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;);
a=0;//     invoke-virtual {p0, p2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->setIntValues([I)V
a=0;// 
a=0;//     .line 766
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method calculateValue(F)V
a=0;//     .locals 1
a=0;//     .param p1, "fraction"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 784
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mIntKeyframeSet:Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;);
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;->getIntValue(F)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mIntAnimatedValue:I
a=0;// 
a=0;//     .line 785
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public clone()Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 794
a=0;//     invoke-super {p0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->clone()Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;
a=0;// 
a=0;//     .line 795
a=0;//     .local v0, "newPVH":Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;
a=0;//     iget-object v1, v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mKeyframeSet:Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;);
a=0;//     check-cast v1, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;
a=0;// 
a=0;//     iput-object v1, v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mIntKeyframeSet:Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;
a=0;// 
a=0;//     .line 796
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic clone()Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->clone()Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method getAnimatedValue()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 789
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mIntAnimatedValue:I
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
a=0;// .method setAnimatedValue(Ljava/lang/Object;)V
a=0;//     .locals 4
a=0;//     .param p1, "target"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 820
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mSetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/reflect/Method;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 822
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mTmpValueArray:[Ljava/lang/Object;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget v3, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mIntAnimatedValue:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     .line 823
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mSetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mTmpValueArray:[Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 830
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 824
a=0;//     :catch_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 825
a=0;//     .local v0, "e":Ljava/lang/reflect/InvocationTargetException;
a=0;//     #v0=(Reference,Ljava/lang/reflect/InvocationTargetException;);
a=0;//     const-string v1, "PropertyValuesHolder"
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 826
a=0;//     .end local v0    # "e":Ljava/lang/reflect/InvocationTargetException;
a=0;//     :catch_1
a=0;//     #v0=(Uninit);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 827
a=0;//     .local v0, "e":Ljava/lang/IllegalAccessException;
a=0;//     #v0=(Reference,Ljava/lang/IllegalAccessException;);
a=0;//     const-string v1, "PropertyValuesHolder"
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public varargs setIntValues([I)V
a=0;//     .locals 1
a=0;//     .param p1, "values"    # [I
a=0;// 
a=0;//     .prologue
a=0;//     .line 778
a=0;//     invoke-super {p0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->setIntValues([I)V
a=0;// 
a=0;//     .line 779
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mKeyframeSet:Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mIntKeyframeSet:Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;
a=0;// 
a=0;//     .line 780
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setupSetter(Ljava/lang/Class;)V
a=0;//     .locals 0
a=0;//     .param p1, "targetClass"    # Ljava/lang/Class;
a=0;// 
a=0;//     .prologue
a=0;//     .line 866
a=0;//     invoke-super {p0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->setupSetter(Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 868
a=0;//     return-void
a=0;// .end method
}}
