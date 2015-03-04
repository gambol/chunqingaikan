package com.actionbarsherlock.internal.nineoldandroids.animation; class ObjectAnimator { void a() { int a;
a=0;// .class public final Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// .super Lcom/actionbarsherlock/internal/nineoldandroids/animation/ValueAnimator;
a=0;// .source "ObjectAnimator.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DBG:Z
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mPropertyName:Ljava/lang/String;
a=0;// 
a=0;// .field private mTarget:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 129
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ValueAnimator;-><init>()V
a=0;// 
a=0;//     .line 130
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Ljava/lang/Object;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "target"    # Ljava/lang/Object;
a=0;//     .param p2, "propertyName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 141
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ValueAnimator;-><init>()V
a=0;// 
a=0;//     .line 142
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;);
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     .line 143
a=0;//     invoke-virtual {p0, p2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->setPropertyName(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 144
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;//     .locals 1
a=0;//     .param p0, "target"    # Ljava/lang/Object;
a=0;//     .param p1, "propertyName"    # Ljava/lang/String;
a=0;//     .param p2, "values"    # [F
a=0;// 
a=0;//     .prologue
a=0;//     .line 210
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;-><init>(Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 211
a=0;//     .local v0, "anim":Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;);
a=0;//     invoke-virtual {v0, p2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->setFloatValues([F)V
a=0;// 
a=0;//     .line 212
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofInt(Ljava/lang/Object;Ljava/lang/String;[I)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;//     .locals 1
a=0;//     .param p0, "target"    # Ljava/lang/Object;
a=0;//     .param p1, "propertyName"    # Ljava/lang/String;
a=0;//     .param p2, "values"    # [I
a=0;// 
a=0;//     .prologue
a=0;//     .line 172
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;-><init>(Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 173
a=0;//     .local v0, "anim":Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;);
a=0;//     invoke-virtual {v0, p2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->setIntValues([I)V
a=0;// 
a=0;//     .line 174
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofObject(Ljava/lang/Object;Ljava/lang/String;Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;[Ljava/lang/Object;)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;//     .locals 1
a=0;//     .param p0, "target"    # Ljava/lang/Object;
a=0;//     .param p1, "propertyName"    # Ljava/lang/String;
a=0;//     .param p2, "evaluator"    # Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;
a=0;//     .param p3, "values"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 253
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;-><init>(Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 254
a=0;//     .local v0, "anim":Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;);
a=0;//     invoke-virtual {v0, p3}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->setObjectValues([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 255
a=0;//     invoke-virtual {v0, p2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->setEvaluator(Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;)V
a=0;// 
a=0;//     .line 256
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofPropertyValuesHolder(Ljava/lang/Object;[Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;//     .locals 1
a=0;//     .param p0, "target"    # Ljava/lang/Object;
a=0;//     .param p1, "values"    # [Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 301
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;);
a=0;//     invoke-direct {v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;-><init>()V
a=0;// 
a=0;//     .line 302
a=0;//     .local v0, "anim":Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;);
a=0;//     iput-object p0, v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     .line 303
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->setValues([Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;)V
a=0;// 
a=0;//     .line 304
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method animateValue(F)V
a=0;//     .locals 4
a=0;//     .param p1, "fraction"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 467
a=0;//     invoke-super {p0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ValueAnimator;->animateValue(F)V
a=0;// 
a=0;//     .line 468
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     array-length v1, v2
a=0;// 
a=0;//     .line 469
a=0;//     .local v1, "numValues":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 472
a=0;//     return-void
a=0;// 
a=0;//     .line 470
a=0;//     :cond_0
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     aget-object v2, v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v2, v3}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->setAnimatedValue(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 469
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public clone()Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 476
a=0;//     invoke-super {p0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ValueAnimator;->clone()Lcom/actionbarsherlock/internal/nineoldandroids/animation/ValueAnimator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/ValueAnimator;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     .line 477
a=0;//     .local v0, "anim":Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic clone()Lcom/actionbarsherlock/internal/nineoldandroids/animation/ValueAnimator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->clone()Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getPropertyName()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 121
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTarget()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 414
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method initAnimation()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 381
a=0;//     iget-boolean v2, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mInitialized:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 384
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     array-length v1, v2
a=0;// 
a=0;//     .line 385
a=0;//     .local v1, "numValues":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 388
a=0;//     invoke-super {p0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ValueAnimator;->initAnimation()V
a=0;// 
a=0;//     .line 390
a=0;//     .end local v0    # "i":I
a=0;//     .end local v1    # "numValues":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 386
a=0;//     .restart local v0    # "i":I
a=0;//     .restart local v1    # "numValues":I
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Integer);v2=(Reference,[Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     aget-object v2, v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v2, v3}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->setupSetterAndGetter(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 385
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setDuration(J)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;//     .locals 0
a=0;//     .param p1, "duration"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 403
a=0;//     invoke-super {p0, p1, p2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ValueAnimator;->setDuration(J)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ValueAnimator;
a=0;// 
a=0;//     .line 404
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic setDuration(J)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ValueAnimator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->setDuration(J)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public varargs setFloatValues([F)V
a=0;//     .locals 3
a=0;//     .param p1, "values"    # [F
a=0;// 
a=0;//     .prologue
a=0;//     .line 324
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 330
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->setValues([Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;)V
a=0;// 
a=0;//     .line 335
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 333
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-super {p0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ValueAnimator;->setFloatValues([F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public varargs setIntValues([I)V
a=0;//     .locals 3
a=0;//     .param p1, "values"    # [I
a=0;// 
a=0;//     .prologue
a=0;//     .line 309
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 315
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->ofInt(Ljava/lang/String;[I)Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->setValues([Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;)V
a=0;// 
a=0;//     .line 320
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 318
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-super {p0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ValueAnimator;->setIntValues([I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public varargs setObjectValues([Ljava/lang/Object;)V
a=0;//     .locals 4
a=0;//     .param p1, "values"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 339
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 345
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v2, v3, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->ofObject(Ljava/lang/String;Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;[Ljava/lang/Object;)Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->setValues([Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;)V
a=0;// 
a=0;//     .line 350
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 348
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-super {p0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ValueAnimator;->setObjectValues([Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setPropertyName(Ljava/lang/String;)V
a=0;//     .locals 4
a=0;//     .param p1, "propertyName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 75
a=0;//     #v3=(Null);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 76
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     aget-object v1, v2, v3
a=0;// 
a=0;//     .line 77
a=0;//     .local v1, "valuesHolder":Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->getPropertyName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 78
a=0;//     .local v0, "oldName":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->setPropertyName(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 79
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mValuesMap:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 80
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mValuesMap:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 82
a=0;//     .end local v0    # "oldName":Ljava/lang/String;
a=0;//     .end local v1    # "valuesHolder":Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     .line 84
a=0;//     iput-boolean v3, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mInitialized:Z
a=0;// 
a=0;//     .line 85
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTarget(Ljava/lang/Object;)V
a=0;//     .locals 3
a=0;//     .param p1, "target"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 424
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     if-eq v1, p1, :cond_0
a=0;// 
a=0;//     .line 425
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     .line 426
a=0;//     .local v0, "oldTarget":Ljava/lang/Object;
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     .line 427
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     .line 433
a=0;//     .end local v0    # "oldTarget":Ljava/lang/Object;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 431
a=0;//     .restart local v0    # "oldTarget":Ljava/lang/Object;
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mInitialized:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setupEndValues()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 446
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->initAnimation()V
a=0;// 
a=0;//     .line 447
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     array-length v1, v2
a=0;// 
a=0;//     .line 448
a=0;//     .local v1, "numValues":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 451
a=0;//     return-void
a=0;// 
a=0;//     .line 449
a=0;//     :cond_0
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     aget-object v2, v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v2, v3}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->setupEndValue(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 448
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setupStartValues()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 437
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->initAnimation()V
a=0;// 
a=0;//     .line 438
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     array-length v1, v2
a=0;// 
a=0;//     .line 439
a=0;//     .local v1, "numValues":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 442
a=0;//     return-void
a=0;// 
a=0;//     .line 440
a=0;//     :cond_0
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     aget-object v2, v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v2, v3}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->setupStartValue(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 439
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public start()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 364
a=0;//     invoke-super {p0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ValueAnimator;->start()V
a=0;// 
a=0;//     .line 365
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 482
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "ObjectAnimator@"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ", target "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 483
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 482
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 484
a=0;//     .local v1, "returnVal":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 485
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v0, v2, :cond_1
a=0;// 
a=0;//     .line 489
a=0;//     .end local v0    # "i":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 486
a=0;//     .restart local v0    # "i":I
a=0;//     :cond_1
a=0;//     #v0=(Integer);v2=(Integer);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "\n    "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     aget-object v3, v3, v0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v3}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 485
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
