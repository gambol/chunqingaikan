package com.nineoldandroids.animation; class PropertyValuesHolder$IntPropertyValuesHolder { void a() { int a;
a=0;// .class Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;
a=0;// .super Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// .source "PropertyValuesHolder.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/nineoldandroids/animation/PropertyValuesHolder;
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
a=0;// .field mIntKeyframeSet:Lcom/nineoldandroids/animation/IntKeyframeSet;
a=0;// 
a=0;// .field private mIntProperty:Lcom/nineoldandroids/util/IntProperty;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/nineoldandroids/util/Property;Lcom/nineoldandroids/animation/IntKeyframeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "property"    # Lcom/nineoldandroids/util/Property;
a=0;//     .param p2, "keyframeSet"    # Lcom/nineoldandroids/animation/IntKeyframeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 772
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/nineoldandroids/animation/PropertyValuesHolder;-><init>(Lcom/nineoldandroids/util/Property;Lcom/nineoldandroids/animation/PropertyValuesHolder;)V
a=0;// 
a=0;//     .line 773
a=0;//     #p0=(Reference,Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;);
a=0;//     sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     .line 774
a=0;//     iput-object p2, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mKeyframeSet:Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     .line 775
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mKeyframeSet:Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     check-cast v0, Lcom/nineoldandroids/animation/IntKeyframeSet;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mIntKeyframeSet:Lcom/nineoldandroids/animation/IntKeyframeSet;
a=0;// 
a=0;//     .line 776
a=0;//     instance-of v0, p1, Lcom/nineoldandroids/util/IntProperty;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 777
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mProperty:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/util/Property;);
a=0;//     check-cast v0, Lcom/nineoldandroids/util/IntProperty;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mIntProperty:Lcom/nineoldandroids/util/IntProperty;
a=0;// 
a=0;//     .line 779
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public varargs constructor <init>(Lcom/nineoldandroids/util/Property;[I)V
a=0;//     .locals 1
a=0;//     .param p1, "property"    # Lcom/nineoldandroids/util/Property;
a=0;//     .param p2, "values"    # [I
a=0;// 
a=0;//     .prologue
a=0;//     .line 787
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/nineoldandroids/animation/PropertyValuesHolder;-><init>(Lcom/nineoldandroids/util/Property;Lcom/nineoldandroids/animation/PropertyValuesHolder;)V
a=0;// 
a=0;//     .line 788
a=0;//     #p0=(Reference,Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;);
a=0;//     invoke-virtual {p0, p2}, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->setIntValues([I)V
a=0;// 
a=0;//     .line 789
a=0;//     instance-of v0, p1, Lcom/nineoldandroids/util/IntProperty;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 790
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mProperty:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/util/Property;);
a=0;//     check-cast v0, Lcom/nineoldandroids/util/IntProperty;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mIntProperty:Lcom/nineoldandroids/util/IntProperty;
a=0;// 
a=0;//     .line 792
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;Lcom/nineoldandroids/animation/IntKeyframeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "propertyName"    # Ljava/lang/String;
a=0;//     .param p2, "keyframeSet"    # Lcom/nineoldandroids/animation/IntKeyframeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 765
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/nineoldandroids/animation/PropertyValuesHolder;-><init>(Ljava/lang/String;Lcom/nineoldandroids/animation/PropertyValuesHolder;)V
a=0;// 
a=0;//     .line 766
a=0;//     #p0=(Reference,Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;);
a=0;//     sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     .line 767
a=0;//     iput-object p2, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mKeyframeSet:Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     .line 768
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mKeyframeSet:Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     check-cast v0, Lcom/nineoldandroids/animation/IntKeyframeSet;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mIntKeyframeSet:Lcom/nineoldandroids/animation/IntKeyframeSet;
a=0;// 
a=0;//     .line 769
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public varargs constructor <init>(Ljava/lang/String;[I)V
a=0;//     .locals 1
a=0;//     .param p1, "propertyName"    # Ljava/lang/String;
a=0;//     .param p2, "values"    # [I
a=0;// 
a=0;//     .prologue
a=0;//     .line 782
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/nineoldandroids/animation/PropertyValuesHolder;-><init>(Ljava/lang/String;Lcom/nineoldandroids/animation/PropertyValuesHolder;)V
a=0;// 
a=0;//     .line 783
a=0;//     #p0=(Reference,Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;);
a=0;//     invoke-virtual {p0, p2}, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->setIntValues([I)V
a=0;// 
a=0;//     .line 784
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
a=0;//     .line 802
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mIntKeyframeSet:Lcom/nineoldandroids/animation/IntKeyframeSet;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/IntKeyframeSet;);
a=0;//     invoke-virtual {v0, p1}, Lcom/nineoldandroids/animation/IntKeyframeSet;->getIntValue(F)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mIntAnimatedValue:I
a=0;// 
a=0;//     .line 803
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public clone()Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 812
a=0;//     invoke-super {p0}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->clone()Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     check-cast v0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;
a=0;// 
a=0;//     .line 813
a=0;//     .local v0, "newPVH":Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;
a=0;//     iget-object v1, v0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mKeyframeSet:Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     #v1=(Reference,Lcom/nineoldandroids/animation/KeyframeSet;);
a=0;//     check-cast v1, Lcom/nineoldandroids/animation/IntKeyframeSet;
a=0;// 
a=0;//     iput-object v1, v0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mIntKeyframeSet:Lcom/nineoldandroids/animation/IntKeyframeSet;
a=0;// 
a=0;//     .line 814
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic clone()Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0}, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->clone()Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method getAnimatedValue()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 807
a=0;//     iget v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mIntAnimatedValue:I
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
a=0;//     .line 826
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mIntProperty:Lcom/nineoldandroids/util/IntProperty;
a=0;// 
a=0;//     #v1=(Reference,Lcom/nineoldandroids/util/IntProperty;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 827
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mIntProperty:Lcom/nineoldandroids/util/IntProperty;
a=0;// 
a=0;//     iget v2, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mIntAnimatedValue:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, p1, v2}, Lcom/nineoldandroids/util/IntProperty;->setValue(Ljava/lang/Object;I)V
a=0;// 
a=0;//     .line 848
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 830
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mProperty:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 831
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mProperty:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     iget v2, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mIntAnimatedValue:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v1, p1, v2}, Lcom/nineoldandroids/util/Property;->set(Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 838
a=0;//     :cond_2
a=0;//     #v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mSetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 840
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mTmpValueArray:[Ljava/lang/Object;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget v3, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mIntAnimatedValue:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     .line 841
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mSetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mTmpValueArray:[Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 842
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 843
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
a=0;//     .line 844
a=0;//     .end local v0    # "e":Ljava/lang/reflect/InvocationTargetException;
a=0;//     :catch_1
a=0;//     #v0=(Uninit);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 845
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
a=0;//     .line 796
a=0;//     invoke-super {p0, p1}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->setIntValues([I)V
a=0;// 
a=0;//     .line 797
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mKeyframeSet:Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/KeyframeSet;);
a=0;//     check-cast v0, Lcom/nineoldandroids/animation/IntKeyframeSet;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mIntKeyframeSet:Lcom/nineoldandroids/animation/IntKeyframeSet;
a=0;// 
a=0;//     .line 798
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setupSetter(Ljava/lang/Class;)V
a=0;//     .locals 1
a=0;//     .param p1, "targetClass"    # Ljava/lang/Class;
a=0;// 
a=0;//     .prologue
a=0;//     .line 852
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;->mProperty:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/util/Property;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 886
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 884
a=0;//     :cond_0
a=0;//     invoke-super {p0, p1}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->setupSetter(Ljava/lang/Class;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
