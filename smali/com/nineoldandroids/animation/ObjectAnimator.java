package com.nineoldandroids.animation; class ObjectAnimator { void a() { int a;
a=0;// .class public final Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;// .super Lcom/nineoldandroids/animation/ValueAnimator;
a=0;// .source "ObjectAnimator.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DBG:Z
a=0;// 
a=0;// .field private static final PROXY_PROPERTIES:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/nineoldandroids/util/Property;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mProperty:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;// .field private mPropertyName:Ljava/lang/String;
a=0;// 
a=0;// .field private mTarget:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v0, Lcom/nineoldandroids/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     .line 44
a=0;//     sget-object v0, Lcom/nineoldandroids/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     const-string v1, "alpha"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Lcom/nineoldandroids/animation/PreHoneycombCompat;->ALPHA:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     #v2=(Reference,Lcom/nineoldandroids/util/Property;);
a=0;//     invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 45
a=0;//     sget-object v0, Lcom/nineoldandroids/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     const-string v1, "pivotX"
a=0;// 
a=0;//     sget-object v2, Lcom/nineoldandroids/animation/PreHoneycombCompat;->PIVOT_X:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 46
a=0;//     sget-object v0, Lcom/nineoldandroids/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     const-string v1, "pivotY"
a=0;// 
a=0;//     sget-object v2, Lcom/nineoldandroids/animation/PreHoneycombCompat;->PIVOT_Y:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 47
a=0;//     sget-object v0, Lcom/nineoldandroids/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     const-string v1, "translationX"
a=0;// 
a=0;//     sget-object v2, Lcom/nineoldandroids/animation/PreHoneycombCompat;->TRANSLATION_X:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 48
a=0;//     sget-object v0, Lcom/nineoldandroids/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     const-string v1, "translationY"
a=0;// 
a=0;//     sget-object v2, Lcom/nineoldandroids/animation/PreHoneycombCompat;->TRANSLATION_Y:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 49
a=0;//     sget-object v0, Lcom/nineoldandroids/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     const-string v1, "rotation"
a=0;// 
a=0;//     sget-object v2, Lcom/nineoldandroids/animation/PreHoneycombCompat;->ROTATION:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 50
a=0;//     sget-object v0, Lcom/nineoldandroids/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     const-string v1, "rotationX"
a=0;// 
a=0;//     sget-object v2, Lcom/nineoldandroids/animation/PreHoneycombCompat;->ROTATION_X:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 51
a=0;//     sget-object v0, Lcom/nineoldandroids/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     const-string v1, "rotationY"
a=0;// 
a=0;//     sget-object v2, Lcom/nineoldandroids/animation/PreHoneycombCompat;->ROTATION_Y:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 52
a=0;//     sget-object v0, Lcom/nineoldandroids/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     const-string v1, "scaleX"
a=0;// 
a=0;//     sget-object v2, Lcom/nineoldandroids/animation/PreHoneycombCompat;->SCALE_X:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 53
a=0;//     sget-object v0, Lcom/nineoldandroids/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     const-string v1, "scaleY"
a=0;// 
a=0;//     sget-object v2, Lcom/nineoldandroids/animation/PreHoneycombCompat;->SCALE_Y:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 54
a=0;//     sget-object v0, Lcom/nineoldandroids/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     const-string v1, "scrollX"
a=0;// 
a=0;//     sget-object v2, Lcom/nineoldandroids/animation/PreHoneycombCompat;->SCROLL_X:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 55
a=0;//     sget-object v0, Lcom/nineoldandroids/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     const-string v1, "scrollY"
a=0;// 
a=0;//     sget-object v2, Lcom/nineoldandroids/animation/PreHoneycombCompat;->SCROLL_Y:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 56
a=0;//     sget-object v0, Lcom/nineoldandroids/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     const-string v1, "x"
a=0;// 
a=0;//     sget-object v2, Lcom/nineoldandroids/animation/PreHoneycombCompat;->X:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 57
a=0;//     sget-object v0, Lcom/nineoldandroids/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     const-string v1, "y"
a=0;// 
a=0;//     sget-object v2, Lcom/nineoldandroids/animation/PreHoneycombCompat;->Y:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 58
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     invoke-direct {p0}, Lcom/nineoldandroids/animation/ValueAnimator;-><init>()V
a=0;// 
a=0;//     .line 151
a=0;//     #p0=(Reference,Lcom/nineoldandroids/animation/ObjectAnimator;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Ljava/lang/Object;Lcom/nineoldandroids/util/Property;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(TT;",
a=0;//             "Lcom/nineoldandroids/util/Property",
a=0;//             "<TT;*>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 173
a=0;//     .local p1, "target":Ljava/lang/Object;, "TT;"
a=0;//     .local p2, "property":Lcom/nineoldandroids/util/Property;, "Lcom/nineoldandroids/util/Property<TT;*>;"
a=0;//     invoke-direct {p0}, Lcom/nineoldandroids/animation/ValueAnimator;-><init>()V
a=0;// 
a=0;//     .line 174
a=0;//     #p0=(Reference,Lcom/nineoldandroids/animation/ObjectAnimator;);
a=0;//     iput-object p1, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     .line 175
a=0;//     invoke-virtual {p0, p2}, Lcom/nineoldandroids/animation/ObjectAnimator;->setProperty(Lcom/nineoldandroids/util/Property;)V
a=0;// 
a=0;//     .line 176
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Ljava/lang/Object;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "target"    # Ljava/lang/Object;
a=0;//     .param p2, "propertyName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 162
a=0;//     invoke-direct {p0}, Lcom/nineoldandroids/animation/ValueAnimator;-><init>()V
a=0;// 
a=0;//     .line 163
a=0;//     #p0=(Reference,Lcom/nineoldandroids/animation/ObjectAnimator;);
a=0;//     iput-object p1, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     .line 164
a=0;//     invoke-virtual {p0, p2}, Lcom/nineoldandroids/animation/ObjectAnimator;->setPropertyName(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 165
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofFloat(Ljava/lang/Object;Lcom/nineoldandroids/util/Property;[F)Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;//     .locals 1
a=0;//     .param p2, "values"    # [F
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(TT;",
a=0;//             "Lcom/nineoldandroids/util/Property",
a=0;//             "<TT;",
a=0;//             "Ljava/lang/Float;",
a=0;//             ">;[F)",
a=0;//             "Lcom/nineoldandroids/animation/ObjectAnimator;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 250
a=0;//     .local p0, "target":Ljava/lang/Object;, "TT;"
a=0;//     .local p1, "property":Lcom/nineoldandroids/util/Property;, "Lcom/nineoldandroids/util/Property<TT;Ljava/lang/Float;>;"
a=0;//     new-instance v0, Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/nineoldandroids/animation/ObjectAnimator;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/nineoldandroids/animation/ObjectAnimator;-><init>(Ljava/lang/Object;Lcom/nineoldandroids/util/Property;)V
a=0;// 
a=0;//     .line 251
a=0;//     .local v0, "anim":Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/ObjectAnimator;);
a=0;//     invoke-virtual {v0, p2}, Lcom/nineoldandroids/animation/ObjectAnimator;->setFloatValues([F)V
a=0;// 
a=0;//     .line 252
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;//     .locals 1
a=0;//     .param p0, "target"    # Ljava/lang/Object;
a=0;//     .param p1, "propertyName"    # Ljava/lang/String;
a=0;//     .param p2, "values"    # [F
a=0;// 
a=0;//     .prologue
a=0;//     .line 231
a=0;//     new-instance v0, Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/nineoldandroids/animation/ObjectAnimator;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/nineoldandroids/animation/ObjectAnimator;-><init>(Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 232
a=0;//     .local v0, "anim":Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/ObjectAnimator;);
a=0;//     invoke-virtual {v0, p2}, Lcom/nineoldandroids/animation/ObjectAnimator;->setFloatValues([F)V
a=0;// 
a=0;//     .line 233
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofInt(Ljava/lang/Object;Lcom/nineoldandroids/util/Property;[I)Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;//     .locals 1
a=0;//     .param p2, "values"    # [I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(TT;",
a=0;//             "Lcom/nineoldandroids/util/Property",
a=0;//             "<TT;",
a=0;//             "Ljava/lang/Integer;",
a=0;//             ">;[I)",
a=0;//             "Lcom/nineoldandroids/animation/ObjectAnimator;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 211
a=0;//     .local p0, "target":Ljava/lang/Object;, "TT;"
a=0;//     .local p1, "property":Lcom/nineoldandroids/util/Property;, "Lcom/nineoldandroids/util/Property<TT;Ljava/lang/Integer;>;"
a=0;//     new-instance v0, Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/nineoldandroids/animation/ObjectAnimator;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/nineoldandroids/animation/ObjectAnimator;-><init>(Ljava/lang/Object;Lcom/nineoldandroids/util/Property;)V
a=0;// 
a=0;//     .line 212
a=0;//     .local v0, "anim":Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/ObjectAnimator;);
a=0;//     invoke-virtual {v0, p2}, Lcom/nineoldandroids/animation/ObjectAnimator;->setIntValues([I)V
a=0;// 
a=0;//     .line 213
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofInt(Ljava/lang/Object;Ljava/lang/String;[I)Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;//     .locals 1
a=0;//     .param p0, "target"    # Ljava/lang/Object;
a=0;//     .param p1, "propertyName"    # Ljava/lang/String;
a=0;//     .param p2, "values"    # [I
a=0;// 
a=0;//     .prologue
a=0;//     .line 193
a=0;//     new-instance v0, Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/nineoldandroids/animation/ObjectAnimator;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/nineoldandroids/animation/ObjectAnimator;-><init>(Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 194
a=0;//     .local v0, "anim":Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/ObjectAnimator;);
a=0;//     invoke-virtual {v0, p2}, Lcom/nineoldandroids/animation/ObjectAnimator;->setIntValues([I)V
a=0;// 
a=0;//     .line 195
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofObject(Ljava/lang/Object;Lcom/nineoldandroids/util/Property;Lcom/nineoldandroids/animation/TypeEvaluator;[Ljava/lang/Object;)Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;//     .locals 1
a=0;//     .param p3, "values"    # [Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             "V:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(TT;",
a=0;//             "Lcom/nineoldandroids/util/Property",
a=0;//             "<TT;TV;>;",
a=0;//             "Lcom/nineoldandroids/animation/TypeEvaluator",
a=0;//             "<TV;>;[TV;)",
a=0;//             "Lcom/nineoldandroids/animation/ObjectAnimator;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 297
a=0;//     .local p0, "target":Ljava/lang/Object;, "TT;"
a=0;//     .local p1, "property":Lcom/nineoldandroids/util/Property;, "Lcom/nineoldandroids/util/Property<TT;TV;>;"
a=0;//     .local p2, "evaluator":Lcom/nineoldandroids/animation/TypeEvaluator;, "Lcom/nineoldandroids/animation/TypeEvaluator<TV;>;"
a=0;//     new-instance v0, Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/nineoldandroids/animation/ObjectAnimator;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/nineoldandroids/animation/ObjectAnimator;-><init>(Ljava/lang/Object;Lcom/nineoldandroids/util/Property;)V
a=0;// 
a=0;//     .line 298
a=0;//     .local v0, "anim":Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/ObjectAnimator;);
a=0;//     invoke-virtual {v0, p3}, Lcom/nineoldandroids/animation/ObjectAnimator;->setObjectValues([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 299
a=0;//     invoke-virtual {v0, p2}, Lcom/nineoldandroids/animation/ObjectAnimator;->setEvaluator(Lcom/nineoldandroids/animation/TypeEvaluator;)V
a=0;// 
a=0;//     .line 300
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofObject(Ljava/lang/Object;Ljava/lang/String;Lcom/nineoldandroids/animation/TypeEvaluator;[Ljava/lang/Object;)Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;//     .locals 1
a=0;//     .param p0, "target"    # Ljava/lang/Object;
a=0;//     .param p1, "propertyName"    # Ljava/lang/String;
a=0;//     .param p2, "evaluator"    # Lcom/nineoldandroids/animation/TypeEvaluator;
a=0;//     .param p3, "values"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 274
a=0;//     new-instance v0, Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/nineoldandroids/animation/ObjectAnimator;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/nineoldandroids/animation/ObjectAnimator;-><init>(Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 275
a=0;//     .local v0, "anim":Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/ObjectAnimator;);
a=0;//     invoke-virtual {v0, p3}, Lcom/nineoldandroids/animation/ObjectAnimator;->setObjectValues([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 276
a=0;//     invoke-virtual {v0, p2}, Lcom/nineoldandroids/animation/ObjectAnimator;->setEvaluator(Lcom/nineoldandroids/animation/TypeEvaluator;)V
a=0;// 
a=0;//     .line 277
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofPropertyValuesHolder(Ljava/lang/Object;[Lcom/nineoldandroids/animation/PropertyValuesHolder;)Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;//     .locals 1
a=0;//     .param p0, "target"    # Ljava/lang/Object;
a=0;//     .param p1, "values"    # [Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 322
a=0;//     new-instance v0, Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/nineoldandroids/animation/ObjectAnimator;);
a=0;//     invoke-direct {v0}, Lcom/nineoldandroids/animation/ObjectAnimator;-><init>()V
a=0;// 
a=0;//     .line 323
a=0;//     .local v0, "anim":Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/ObjectAnimator;);
a=0;//     iput-object p0, v0, Lcom/nineoldandroids/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     .line 324
a=0;//     invoke-virtual {v0, p1}, Lcom/nineoldandroids/animation/ObjectAnimator;->setValues([Lcom/nineoldandroids/animation/PropertyValuesHolder;)V
a=0;// 
a=0;//     .line 325
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
a=0;//     .line 491
a=0;//     invoke-super {p0, p1}, Lcom/nineoldandroids/animation/ValueAnimator;->animateValue(F)V
a=0;// 
a=0;//     .line 492
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     array-length v1, v2
a=0;// 
a=0;//     .line 493
a=0;//     .local v1, "numValues":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 496
a=0;//     return-void
a=0;// 
a=0;//     .line 494
a=0;//     :cond_0
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     aget-object v2, v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v2, v3}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->setAnimatedValue(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 493
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public clone()Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 500
a=0;//     invoke-super {p0}, Lcom/nineoldandroids/animation/ValueAnimator;->clone()Lcom/nineoldandroids/animation/ValueAnimator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/ValueAnimator;);
a=0;//     check-cast v0, Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     .line 501
a=0;//     .local v0, "anim":Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic clone()Lcom/nineoldandroids/animation/ValueAnimator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0}, Lcom/nineoldandroids/animation/ObjectAnimator;->clone()Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/ObjectAnimator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getPropertyName()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 142
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTarget()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 438
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method initAnimation()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 402
a=0;//     iget-boolean v2, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mInitialized:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 405
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mProperty:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     #v2=(Reference,Lcom/nineoldandroids/util/Property;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     sget-boolean v2, Lcom/nineoldandroids/view/animation/AnimatorProxy;->NEEDS_PROXY:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v2, v2, Landroid/view/View;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     sget-object v2, Lcom/nineoldandroids/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Map;);
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 406
a=0;//     sget-object v2, Lcom/nineoldandroids/animation/ObjectAnimator;->PROXY_PROPERTIES:Ljava/util/Map;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Map;);
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Lcom/nineoldandroids/animation/ObjectAnimator;->setProperty(Lcom/nineoldandroids/util/Property;)V
a=0;// 
a=0;//     .line 408
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     array-length v1, v2
a=0;// 
a=0;//     .line 409
a=0;//     .local v1, "numValues":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v1, :cond_2
a=0;// 
a=0;//     .line 412
a=0;//     invoke-super {p0}, Lcom/nineoldandroids/animation/ValueAnimator;->initAnimation()V
a=0;// 
a=0;//     .line 414
a=0;//     .end local v0    # "i":I
a=0;//     .end local v1    # "numValues":I
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 410
a=0;//     .restart local v0    # "i":I
a=0;//     .restart local v1    # "numValues":I
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Integer);v2=(Reference,[Lcom/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     aget-object v2, v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v2, v3}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->setupSetterAndGetter(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 409
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setDuration(J)Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;//     .locals 0
a=0;//     .param p1, "duration"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 427
a=0;//     invoke-super {p0, p1, p2}, Lcom/nineoldandroids/animation/ValueAnimator;->setDuration(J)Lcom/nineoldandroids/animation/ValueAnimator;
a=0;// 
a=0;//     .line 428
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic setDuration(J)Lcom/nineoldandroids/animation/ValueAnimator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/nineoldandroids/animation/ObjectAnimator;->setDuration(J)Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/ObjectAnimator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public varargs setFloatValues([F)V
a=0;//     .locals 3
a=0;//     .param p1, "values"    # [F
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 345
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 348
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mProperty:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/util/Property;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 349
a=0;//     new-array v0, v1, [Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mProperty:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     #v1=(Reference,Lcom/nineoldandroids/util/Property;);
a=0;//     invoke-static {v1, p1}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->ofFloat(Lcom/nineoldandroids/util/Property;[F)Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     aput-object v1, v0, v2
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/nineoldandroids/animation/ObjectAnimator;->setValues([Lcom/nineoldandroids/animation/PropertyValuesHolder;)V
a=0;// 
a=0;//     .line 356
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 351
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/nineoldandroids/util/Property;);v1=(One);
a=0;//     new-array v0, v1, [Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, p1}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     aput-object v1, v0, v2
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/nineoldandroids/animation/ObjectAnimator;->setValues([Lcom/nineoldandroids/animation/PropertyValuesHolder;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 354
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(One);
a=0;//     invoke-super {p0, p1}, Lcom/nineoldandroids/animation/ValueAnimator;->setFloatValues([F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public varargs setIntValues([I)V
a=0;//     .locals 3
a=0;//     .param p1, "values"    # [I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 330
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 333
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mProperty:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/util/Property;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 334
a=0;//     new-array v0, v1, [Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mProperty:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     #v1=(Reference,Lcom/nineoldandroids/util/Property;);
a=0;//     invoke-static {v1, p1}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->ofInt(Lcom/nineoldandroids/util/Property;[I)Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     aput-object v1, v0, v2
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/nineoldandroids/animation/ObjectAnimator;->setValues([Lcom/nineoldandroids/animation/PropertyValuesHolder;)V
a=0;// 
a=0;//     .line 341
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 336
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/nineoldandroids/util/Property;);v1=(One);
a=0;//     new-array v0, v1, [Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, p1}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->ofInt(Ljava/lang/String;[I)Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     aput-object v1, v0, v2
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/nineoldandroids/animation/ObjectAnimator;->setValues([Lcom/nineoldandroids/animation/PropertyValuesHolder;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 339
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(One);
a=0;//     invoke-super {p0, p1}, Lcom/nineoldandroids/animation/ValueAnimator;->setIntValues([I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public varargs setObjectValues([Ljava/lang/Object;)V
a=0;//     .locals 4
a=0;//     .param p1, "values"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 360
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 363
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mProperty:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/util/Property;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 364
a=0;//     new-array v0, v1, [Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mProperty:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     #v1=(Reference,Lcom/nineoldandroids/util/Property;);
a=0;//     invoke-static {v1, v3, p1}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->ofObject(Lcom/nineoldandroids/util/Property;Lcom/nineoldandroids/animation/TypeEvaluator;[Ljava/lang/Object;)Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     aput-object v1, v0, v2
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/nineoldandroids/animation/ObjectAnimator;->setValues([Lcom/nineoldandroids/animation/PropertyValuesHolder;)V
a=0;// 
a=0;//     .line 371
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 366
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/nineoldandroids/util/Property;);v1=(One);
a=0;//     new-array v0, v1, [Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v3, p1}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->ofObject(Ljava/lang/String;Lcom/nineoldandroids/animation/TypeEvaluator;[Ljava/lang/Object;)Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     aput-object v1, v0, v2
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/nineoldandroids/animation/ObjectAnimator;->setValues([Lcom/nineoldandroids/animation/PropertyValuesHolder;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 369
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(One);
a=0;//     invoke-super {p0, p1}, Lcom/nineoldandroids/animation/ValueAnimator;->setObjectValues([Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setProperty(Lcom/nineoldandroids/util/Property;)V
a=0;//     .locals 5
a=0;//     .param p1, "property"    # Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 118
a=0;//     #v4=(Null);
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 119
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     aget-object v1, v2, v4
a=0;// 
a=0;//     .line 120
a=0;//     .local v1, "valuesHolder":Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->getPropertyName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 121
a=0;//     .local v0, "oldName":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, p1}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->setProperty(Lcom/nineoldandroids/util/Property;)V
a=0;// 
a=0;//     .line 122
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mValuesMap:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 123
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mValuesMap:Ljava/util/HashMap;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 125
a=0;//     .end local v0    # "oldName":Ljava/lang/String;
a=0;//     .end local v1    # "valuesHolder":Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mProperty:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 126
a=0;//     invoke-virtual {p1}, Lcom/nineoldandroids/util/Property;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     .line 128
a=0;//     :cond_1
a=0;//     iput-object p1, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mProperty:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     .line 130
a=0;//     iput-boolean v4, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mInitialized:Z
a=0;// 
a=0;//     .line 131
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPropertyName(Ljava/lang/String;)V
a=0;//     .locals 4
a=0;//     .param p1, "propertyName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 96
a=0;//     #v3=(Null);
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 97
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     aget-object v1, v2, v3
a=0;// 
a=0;//     .line 98
a=0;//     .local v1, "valuesHolder":Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->getPropertyName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 99
a=0;//     .local v0, "oldName":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, p1}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->setPropertyName(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 100
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mValuesMap:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 101
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mValuesMap:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 103
a=0;//     .end local v0    # "oldName":Ljava/lang/String;
a=0;//     .end local v1    # "valuesHolder":Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iput-object p1, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     .line 105
a=0;//     iput-boolean v3, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mInitialized:Z
a=0;// 
a=0;//     .line 106
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTarget(Ljava/lang/Object;)V
a=0;//     .locals 3
a=0;//     .param p1, "target"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 448
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     if-eq v1, p1, :cond_0
a=0;// 
a=0;//     .line 449
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     .line 450
a=0;//     .local v0, "oldTarget":Ljava/lang/Object;
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iput-object p1, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     .line 451
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
a=0;//     .line 457
a=0;//     .end local v0    # "oldTarget":Ljava/lang/Object;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 455
a=0;//     .restart local v0    # "oldTarget":Ljava/lang/Object;
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mInitialized:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setupEndValues()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 470
a=0;//     invoke-virtual {p0}, Lcom/nineoldandroids/animation/ObjectAnimator;->initAnimation()V
a=0;// 
a=0;//     .line 471
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     array-length v1, v2
a=0;// 
a=0;//     .line 472
a=0;//     .local v1, "numValues":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 475
a=0;//     return-void
a=0;// 
a=0;//     .line 473
a=0;//     :cond_0
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     aget-object v2, v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v2, v3}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->setupEndValue(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 472
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setupStartValues()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 461
a=0;//     invoke-virtual {p0}, Lcom/nineoldandroids/animation/ObjectAnimator;->initAnimation()V
a=0;// 
a=0;//     .line 462
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     array-length v1, v2
a=0;// 
a=0;//     .line 463
a=0;//     .local v1, "numValues":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 466
a=0;//     return-void
a=0;// 
a=0;//     .line 464
a=0;//     :cond_0
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     aget-object v2, v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v2, v3}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->setupStartValue(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 463
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public start()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 385
a=0;//     invoke-super {p0}, Lcom/nineoldandroids/animation/ValueAnimator;->start()V
a=0;// 
a=0;//     .line 386
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 506
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
a=0;//     .line 507
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mTarget:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 506
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 508
a=0;//     .local v1, "returnVal":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 509
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v0, v2, :cond_1
a=0;// 
a=0;//     .line 513
a=0;//     .end local v0    # "i":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 510
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
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/animation/ObjectAnimator;->mValues:[Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     aget-object v3, v3, v0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v3}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->toString()Ljava/lang/String;
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
a=0;//     .line 509
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
