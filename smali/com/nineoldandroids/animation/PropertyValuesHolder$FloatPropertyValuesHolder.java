package com.nineoldandroids.animation; class PropertyValuesHolder$FloatPropertyValuesHolder { void a() { int a;
a=0;// .class Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;
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
a=0;//     name = "FloatPropertyValuesHolder"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mFloatAnimatedValue:F
a=0;// 
a=0;// .field mFloatKeyframeSet:Lcom/nineoldandroids/animation/FloatKeyframeSet;
a=0;// 
a=0;// .field private mFloatProperty:Lcom/nineoldandroids/util/FloatProperty;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/nineoldandroids/util/Property;Lcom/nineoldandroids/animation/FloatKeyframeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "property"    # Lcom/nineoldandroids/util/Property;
a=0;//     .param p2, "keyframeSet"    # Lcom/nineoldandroids/animation/FloatKeyframeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 908
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/nineoldandroids/animation/PropertyValuesHolder;-><init>(Lcom/nineoldandroids/util/Property;Lcom/nineoldandroids/animation/PropertyValuesHolder;)V
a=0;// 
a=0;//     .line 909
a=0;//     #p0=(Reference,Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;);
a=0;//     sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     .line 910
a=0;//     iput-object p2, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->mKeyframeSet:Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     .line 911
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->mKeyframeSet:Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     check-cast v0, Lcom/nineoldandroids/animation/FloatKeyframeSet;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->mFloatKeyframeSet:Lcom/nineoldandroids/animation/FloatKeyframeSet;
a=0;// 
a=0;//     .line 912
a=0;//     instance-of v0, p1, Lcom/nineoldandroids/util/FloatProperty;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 913
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->mProperty:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/util/Property;);
a=0;//     check-cast v0, Lcom/nineoldandroids/util/FloatProperty;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->mFloatProperty:Lcom/nineoldandroids/util/FloatProperty;
a=0;// 
a=0;//     .line 915
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public varargs constructor <init>(Lcom/nineoldandroids/util/Property;[F)V
a=0;//     .locals 1
a=0;//     .param p1, "property"    # Lcom/nineoldandroids/util/Property;
a=0;//     .param p2, "values"    # [F
a=0;// 
a=0;//     .prologue
a=0;//     .line 923
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/nineoldandroids/animation/PropertyValuesHolder;-><init>(Lcom/nineoldandroids/util/Property;Lcom/nineoldandroids/animation/PropertyValuesHolder;)V
a=0;// 
a=0;//     .line 924
a=0;//     #p0=(Reference,Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;);
a=0;//     invoke-virtual {p0, p2}, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->setFloatValues([F)V
a=0;// 
a=0;//     .line 925
a=0;//     instance-of v0, p1, Lcom/nineoldandroids/util/FloatProperty;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 926
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->mProperty:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/util/Property;);
a=0;//     check-cast v0, Lcom/nineoldandroids/util/FloatProperty;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->mFloatProperty:Lcom/nineoldandroids/util/FloatProperty;
a=0;// 
a=0;//     .line 928
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;Lcom/nineoldandroids/animation/FloatKeyframeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "propertyName"    # Ljava/lang/String;
a=0;//     .param p2, "keyframeSet"    # Lcom/nineoldandroids/animation/FloatKeyframeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 901
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/nineoldandroids/animation/PropertyValuesHolder;-><init>(Ljava/lang/String;Lcom/nineoldandroids/animation/PropertyValuesHolder;)V
a=0;// 
a=0;//     .line 902
a=0;//     #p0=(Reference,Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;);
a=0;//     sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     .line 903
a=0;//     iput-object p2, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->mKeyframeSet:Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     .line 904
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->mKeyframeSet:Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     check-cast v0, Lcom/nineoldandroids/animation/FloatKeyframeSet;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->mFloatKeyframeSet:Lcom/nineoldandroids/animation/FloatKeyframeSet;
a=0;// 
a=0;//     .line 905
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public varargs constructor <init>(Ljava/lang/String;[F)V
a=0;//     .locals 1
a=0;//     .param p1, "propertyName"    # Ljava/lang/String;
a=0;//     .param p2, "values"    # [F
a=0;// 
a=0;//     .prologue
a=0;//     .line 918
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/nineoldandroids/animation/PropertyValuesHolder;-><init>(Ljava/lang/String;Lcom/nineoldandroids/animation/PropertyValuesHolder;)V
a=0;// 
a=0;//     .line 919
a=0;//     #p0=(Reference,Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;);
a=0;//     invoke-virtual {p0, p2}, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->setFloatValues([F)V
a=0;// 
a=0;//     .line 920
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
a=0;//     .line 938
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->mFloatKeyframeSet:Lcom/nineoldandroids/animation/FloatKeyframeSet;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/FloatKeyframeSet;);
a=0;//     invoke-virtual {v0, p1}, Lcom/nineoldandroids/animation/FloatKeyframeSet;->getFloatValue(F)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->mFloatAnimatedValue:F
a=0;// 
a=0;//     .line 939
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public clone()Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 948
a=0;//     invoke-super {p0}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->clone()Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     check-cast v0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;
a=0;// 
a=0;//     .line 949
a=0;//     .local v0, "newPVH":Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;
a=0;//     iget-object v1, v0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->mKeyframeSet:Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     #v1=(Reference,Lcom/nineoldandroids/animation/KeyframeSet;);
a=0;//     check-cast v1, Lcom/nineoldandroids/animation/FloatKeyframeSet;
a=0;// 
a=0;//     iput-object v1, v0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->mFloatKeyframeSet:Lcom/nineoldandroids/animation/FloatKeyframeSet;
a=0;// 
a=0;//     .line 950
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic clone()Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0}, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->clone()Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method getAnimatedValue()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 943
a=0;//     iget v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->mFloatAnimatedValue:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Float;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method setAnimatedValue(Ljava/lang/Object;)V
a=0;//     .locals 4
a=0;//     .param p1, "target"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 962
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->mFloatProperty:Lcom/nineoldandroids/util/FloatProperty;
a=0;// 
a=0;//     #v1=(Reference,Lcom/nineoldandroids/util/FloatProperty;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 963
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->mFloatProperty:Lcom/nineoldandroids/util/FloatProperty;
a=0;// 
a=0;//     iget v2, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->mFloatAnimatedValue:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, p1, v2}, Lcom/nineoldandroids/util/FloatProperty;->setValue(Ljava/lang/Object;F)V
a=0;// 
a=0;//     .line 984
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 966
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->mProperty:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 967
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->mProperty:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     iget v2, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->mFloatAnimatedValue:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Float;);
a=0;//     invoke-virtual {v1, p1, v2}, Lcom/nineoldandroids/util/Property;->set(Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 974
a=0;//     :cond_2
a=0;//     #v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->mSetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 976
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->mTmpValueArray:[Ljava/lang/Object;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget v3, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->mFloatAnimatedValue:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Float;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     .line 977
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->mSetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->mTmpValueArray:[Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 978
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 979
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
a=0;//     .line 980
a=0;//     .end local v0    # "e":Ljava/lang/reflect/InvocationTargetException;
a=0;//     :catch_1
a=0;//     #v0=(Uninit);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 981
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
a=0;// .method public varargs setFloatValues([F)V
a=0;//     .locals 1
a=0;//     .param p1, "values"    # [F
a=0;// 
a=0;//     .prologue
a=0;//     .line 932
a=0;//     invoke-super {p0, p1}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->setFloatValues([F)V
a=0;// 
a=0;//     .line 933
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->mKeyframeSet:Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/KeyframeSet;);
a=0;//     check-cast v0, Lcom/nineoldandroids/animation/FloatKeyframeSet;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->mFloatKeyframeSet:Lcom/nineoldandroids/animation/FloatKeyframeSet;
a=0;// 
a=0;//     .line 934
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setupSetter(Ljava/lang/Class;)V
a=0;//     .locals 1
a=0;//     .param p1, "targetClass"    # Ljava/lang/Class;
a=0;// 
a=0;//     .prologue
a=0;//     .line 988
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;->mProperty:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/util/Property;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1022
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 1020
a=0;//     :cond_0
a=0;//     invoke-super {p0, p1}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->setupSetter(Ljava/lang/Class;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
