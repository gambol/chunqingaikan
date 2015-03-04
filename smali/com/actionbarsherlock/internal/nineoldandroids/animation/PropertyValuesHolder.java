package com.actionbarsherlock.internal.nineoldandroids.animation; class PropertyValuesHolder { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// .super Ljava/lang/Object;
a=0;// .source "PropertyValuesHolder.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Cloneable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;,
a=0;//         Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static DOUBLE_VARIANTS:[Ljava/lang/Class;
a=0;// 
a=0;// .field private static FLOAT_VARIANTS:[Ljava/lang/Class;
a=0;// 
a=0;// .field private static INTEGER_VARIANTS:[Ljava/lang/Class;
a=0;// 
a=0;// .field private static final sFloatEvaluator:Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;// .field private static final sGetterPropertyMap:Ljava/util/HashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/Class;",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/reflect/Method;",
a=0;//             ">;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private static final sIntEvaluator:Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;// .field private static final sSetterPropertyMap:Ljava/util/HashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/Class;",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/reflect/Method;",
a=0;//             ">;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAnimatedValue:Ljava/lang/Object;
a=0;// 
a=0;// .field private mEvaluator:Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;// .field private mGetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;// .field mKeyframeSet:Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;// .field final mPropertyMapLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;// .field mPropertyName:Ljava/lang/String;
a=0;// 
a=0;// .field mSetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;// .field final mTmpValueArray:[Ljava/lang/Object;
a=0;// 
a=0;// .field mValueType:Ljava/lang/Class;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x4
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v6, 0x3
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 80
a=0;//     #v3=(Null);
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntEvaluator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntEvaluator;);
a=0;//     invoke-direct {v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntEvaluator;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntEvaluator;);
a=0;//     sput-object v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->sIntEvaluator:Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     .line 81
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/FloatEvaluator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/nineoldandroids/animation/FloatEvaluator;);
a=0;//     invoke-direct {v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/FloatEvaluator;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/FloatEvaluator;);
a=0;//     sput-object v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->sFloatEvaluator:Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     .line 90
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v1, v0, v3
a=0;// 
a=0;//     const-class v1, Ljava/lang/Float;
a=0;// 
a=0;//     aput-object v1, v0, v4
a=0;// 
a=0;//     sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     aput-object v1, v0, v5
a=0;// 
a=0;//     sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     aput-object v1, v0, v6
a=0;// 
a=0;//     .line 91
a=0;//     const-class v1, Ljava/lang/Double;
a=0;// 
a=0;//     aput-object v1, v0, v7
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const-class v2, Ljava/lang/Integer;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     .line 90
a=0;//     sput-object v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->FLOAT_VARIANTS:[Ljava/lang/Class;
a=0;// 
a=0;//     .line 92
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v1, v0, v3
a=0;// 
a=0;//     const-class v1, Ljava/lang/Integer;
a=0;// 
a=0;//     aput-object v1, v0, v4
a=0;// 
a=0;//     sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     aput-object v1, v0, v5
a=0;// 
a=0;//     sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     aput-object v1, v0, v6
a=0;// 
a=0;//     .line 93
a=0;//     const-class v1, Ljava/lang/Float;
a=0;// 
a=0;//     aput-object v1, v0, v7
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const-class v2, Ljava/lang/Double;
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     .line 92
a=0;//     sput-object v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->INTEGER_VARIANTS:[Ljava/lang/Class;
a=0;// 
a=0;//     .line 94
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v1, v0, v3
a=0;// 
a=0;//     const-class v1, Ljava/lang/Double;
a=0;// 
a=0;//     aput-object v1, v0, v4
a=0;// 
a=0;//     sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     aput-object v1, v0, v5
a=0;// 
a=0;//     sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     aput-object v1, v0, v6
a=0;// 
a=0;//     .line 95
a=0;//     const-class v1, Ljava/lang/Float;
a=0;// 
a=0;//     aput-object v1, v0, v7
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const-class v2, Ljava/lang/Integer;
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     .line 94
a=0;//     sput-object v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->DOUBLE_VARIANTS:[Ljava/lang/Class;
a=0;// 
a=0;//     .line 101
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 100
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->sSetterPropertyMap:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 103
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 102
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->sGetterPropertyMap:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 103
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "propertyName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 131
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 56
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mSetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     .line 65
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mGetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     .line 76
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     .line 107
a=0;//     new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mPropertyMapLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     .line 110
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mTmpValueArray:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 132
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     .line 133
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Ljava/lang/String;Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     invoke-direct {p0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static getMethodName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 4
a=0;//     .param p0, "prefix"    # Ljava/lang/String;
a=0;//     .param p1, "propertyName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 726
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 732
a=0;//     .end local p0    # "prefix":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 730
a=0;//     .restart local p0    # "prefix":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Integer);v3=(Uninit);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Char);
a=0;//     invoke-static {v2}, Ljava/lang/Character;->toUpperCase(C)C
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 731
a=0;//     .local v0, "firstLetter":C
a=0;//     #v0=(Char);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 732
a=0;//     .local v1, "theRest":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private getPropertyFunction(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;//     .locals 11
a=0;//     .param p1, "targetClass"    # Ljava/lang/Class;
a=0;//     .param p2, "prefix"    # Ljava/lang/String;
a=0;//     .param p3, "valueType"    # Ljava/lang/Class;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 381
a=0;//     #v8=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 382
a=0;//     .local v3, "returnVal":Ljava/lang/reflect/Method;
a=0;//     #v3=(Null);
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p2, v7}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->getMethodName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 383
a=0;//     .local v2, "methodName":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 384
a=0;//     .local v0, "args":[Ljava/lang/Class;
a=0;//     #v0=(Null);
a=0;//     if-nez p3, :cond_0
a=0;// 
a=0;//     .line 386
a=0;//     :try_start_0
a=0;//     invoke-virtual {p1, v2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,[Ljava/lang/Class;);v1=(Conflicted);v3=(Reference,Ljava/lang/reflect/Method;);v5=(Conflicted);v6=(Conflicted);v8=(Reference,Ljava/lang/String;);v9=(Conflicted);v10=(Conflicted);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     .line 422
a=0;//     .end local v3    # "returnVal":Ljava/lang/reflect/Method;
a=0;//     .local v4, "returnVal":Ljava/lang/reflect/Method;
a=0;//     :goto_1
a=0;//     #v4=(Reference,Ljava/lang/reflect/Method;);v7=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 387
a=0;//     .end local v4    # "returnVal":Ljava/lang/reflect/Method;
a=0;//     .restart local v3    # "returnVal":Ljava/lang/reflect/Method;
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Uninit);v3=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Reference,Ljava/lang/String;);v8=(Null);v9=(Uninit);v10=(One);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 388
a=0;//     .local v1, "e":Ljava/lang/NoSuchMethodException;
a=0;//     #v1=(Reference,Ljava/lang/NoSuchMethodException;);
a=0;//     const-string v7, "PropertyValuesHolder"
a=0;// 
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, " - "
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 389
a=0;//     const-string v9, "Couldn\'t find no-arg method for property "
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     iget-object v9, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, ": "
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 388
a=0;//     invoke-static {v7, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 392
a=0;//     .end local v1    # "e":Ljava/lang/NoSuchMethodException;
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v8=(Null);v9=(Uninit);
a=0;//     new-array v0, v10, [Ljava/lang/Class;
a=0;// 
a=0;//     .line 394
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     const-class v9, Ljava/lang/Float;
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v7, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     .line 395
a=0;//     sget-object v6, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->FLOAT_VARIANTS:[Ljava/lang/Class;
a=0;// 
a=0;//     .line 404
a=0;//     .local v6, "typeVariants":[Ljava/lang/Class;
a=0;//     :goto_2
a=0;//     #v6=(Reference,[Ljava/lang/Class;);v7=(Conflicted);
a=0;//     array-length v9, v6
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     move v7, v8
a=0;// 
a=0;//     :goto_3
a=0;//     #v3=(Reference,Ljava/lang/reflect/Method;);v5=(Conflicted);v7=(Integer);v10=(Conflicted);
a=0;//     if-lt v7, v9, :cond_4
a=0;// 
a=0;//     .line 416
a=0;//     const-string v7, "PropertyValuesHolder"
a=0;// 
a=0;//     .line 417
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "Couldn\'t find "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "ter property "
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     iget-object v9, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 418
a=0;//     const-string v9, " for "
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 419
a=0;//     const-string v9, " with value type "
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     iget-object v9, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 417
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 416
a=0;//     invoke-static {v7, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 396
a=0;//     .end local v6    # "typeVariants":[Ljava/lang/Class;
a=0;//     :cond_1
a=0;//     #v3=(Null);v5=(Uninit);v6=(Uninit);v7=(Boolean);v8=(Null);v10=(One);
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Class;);
a=0;//     const-class v9, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v7, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_2
a=0;// 
a=0;//     .line 397
a=0;//     sget-object v6, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->INTEGER_VARIANTS:[Ljava/lang/Class;
a=0;// 
a=0;//     .line 398
a=0;//     .restart local v6    # "typeVariants":[Ljava/lang/Class;
a=0;//     #v6=(Reference,[Ljava/lang/Class;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .end local v6    # "typeVariants":[Ljava/lang/Class;
a=0;//     :cond_2
a=0;//     #v6=(Uninit);
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Class;);
a=0;//     const-class v9, Ljava/lang/Double;
a=0;// 
a=0;//     invoke-virtual {v7, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_3
a=0;// 
a=0;//     .line 399
a=0;//     sget-object v6, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->DOUBLE_VARIANTS:[Ljava/lang/Class;
a=0;// 
a=0;//     .line 400
a=0;//     .restart local v6    # "typeVariants":[Ljava/lang/Class;
a=0;//     #v6=(Reference,[Ljava/lang/Class;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 401
a=0;//     .end local v6    # "typeVariants":[Ljava/lang/Class;
a=0;//     :cond_3
a=0;//     #v6=(Uninit);
a=0;//     new-array v6, v10, [Ljava/lang/Class;
a=0;// 
a=0;//     .line 402
a=0;//     .restart local v6    # "typeVariants":[Ljava/lang/Class;
a=0;//     #v6=(Reference,[Ljava/lang/Class;);
a=0;//     iget-object v7, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v7, v6, v8
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 404
a=0;//     :cond_4
a=0;//     #v3=(Reference,Ljava/lang/reflect/Method;);v5=(Conflicted);v7=(Integer);v9=(Integer);v10=(Conflicted);
a=0;//     aget-object v5, v6, v7
a=0;// 
a=0;//     .line 405
a=0;//     .local v5, "typeVariant":Ljava/lang/Class;
a=0;//     #v5=(Null);
a=0;//     aput-object v5, v0, v8
a=0;// 
a=0;//     .line 407
a=0;//     :try_start_1
a=0;//     invoke-virtual {p1, v2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 409
a=0;//     iput-object v5, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-object v4, v3
a=0;// 
a=0;//     .line 410
a=0;//     .end local v3    # "returnVal":Ljava/lang/reflect/Method;
a=0;//     .restart local v4    # "returnVal":Ljava/lang/reflect/Method;
a=0;//     #v4=(Reference,Ljava/lang/reflect/Method;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 411
a=0;//     .end local v4    # "returnVal":Ljava/lang/reflect/Method;
a=0;//     .restart local v3    # "returnVal":Ljava/lang/reflect/Method;
a=0;//     :catch_1
a=0;//     #v4=(Uninit);
a=0;//     move-exception v10
a=0;// 
a=0;//     .line 404
a=0;//     #v10=(Reference,Ljava/lang/NoSuchMethodException;);
a=0;//     add-int/lit8 v7, v7, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofFloat(Ljava/lang/String;[F)Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;//     .locals 1
a=0;//     .param p0, "propertyName"    # Ljava/lang/String;
a=0;//     .param p1, "values"    # [F
a=0;// 
a=0;//     .prologue
a=0;//     .line 176
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;-><init>(Ljava/lang/String;[F)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofInt(Ljava/lang/String;[I)Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;//     .locals 1
a=0;//     .param p0, "propertyName"    # Ljava/lang/String;
a=0;//     .param p1, "values"    # [I
a=0;// 
a=0;//     .prologue
a=0;//     .line 154
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;-><init>(Ljava/lang/String;[I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofKeyframe(Ljava/lang/String;[Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe;)Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;//     .locals 3
a=0;//     .param p0, "propertyName"    # Ljava/lang/String;
a=0;//     .param p1, "values"    # [Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     .prologue
a=0;//     .line 250
a=0;//     invoke-static {p1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;->ofKeyframe([Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe;)Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 251
a=0;//     .local v0, "keyframeSet":Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;);
a=0;//     instance-of v2, v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 252
a=0;//     new-instance v1, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;
a=0;// 
a=0;//     .end local v0    # "keyframeSet":Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;//     invoke-direct {v1, p0, v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;-><init>(Ljava/lang/String;Lcom/actionbarsherlock/internal/nineoldandroids/animation/IntKeyframeSet;)V
a=0;// 
a=0;//     .line 260
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ujava/lang/Object;);v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 253
a=0;//     .restart local v0    # "keyframeSet":Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Boolean);
a=0;//     instance-of v2, v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/FloatKeyframeSet;
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 254
a=0;//     new-instance v1, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/FloatKeyframeSet;
a=0;// 
a=0;//     .end local v0    # "keyframeSet":Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;//     invoke-direct {v1, p0, v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;-><init>(Ljava/lang/String;Lcom/actionbarsherlock/internal/nineoldandroids/animation/FloatKeyframeSet;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 257
a=0;//     .restart local v0    # "keyframeSet":Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;//     :cond_1
a=0;//     #v1=(Uninit);
a=0;//     new-instance v1, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     invoke-direct {v1, p0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 258
a=0;//     .local v1, "pvh":Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     iput-object v0, v1, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     .line 259
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget-object v2, p1, v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     iput-object v2, v1, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofObject(Ljava/lang/String;Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;[Ljava/lang/Object;)Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;//     .locals 1
a=0;//     .param p0, "propertyName"    # Ljava/lang/String;
a=0;//     .param p1, "evaluator"    # Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;
a=0;//     .param p2, "values"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 204
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     invoke-direct {v0, p0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 205
a=0;//     .local v0, "pvh":Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     invoke-virtual {v0, p2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->setObjectValues([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 206
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->setEvaluator(Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;)V
a=0;// 
a=0;//     .line 207
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private setupGetter(Ljava/lang/Class;)V
a=0;//     .locals 3
a=0;//     .param p1, "targetClass"    # Ljava/lang/Class;
a=0;// 
a=0;//     .prologue
a=0;//     .line 475
a=0;//     sget-object v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->sGetterPropertyMap:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "get"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0, p1, v0, v1, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->setupSetterOrGetter(Ljava/lang/Class;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mGetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     .line 476
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setupSetterOrGetter(Ljava/lang/Class;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;//     .locals 5
a=0;//     .param p1, "targetClass"    # Ljava/lang/Class;
a=0;//     .param p3, "prefix"    # Ljava/lang/String;
a=0;//     .param p4, "valueType"    # Ljava/lang/Class;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class;",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/Class;",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/reflect/Method;",
a=0;//             ">;>;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Class;",
a=0;//             ")",
a=0;//             "Ljava/lang/reflect/Method;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 439
a=0;//     .local p2, "propertyMapMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/Class;Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/reflect/Method;>;>;"
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 444
a=0;//     .local v2, "setterOrGetter":Ljava/lang/reflect/Method;
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mPropertyMapLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V
a=0;// 
a=0;//     .line 445
a=0;//     invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/util/HashMap;
a=0;// 
a=0;//     .line 446
a=0;//     .local v1, "propertyMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/reflect/Method;>;"
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 447
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object v0, v3
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-object v2, v0
a=0;// 
a=0;//     .line 449
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/lang/reflect/Method;);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 450
a=0;//     invoke-direct {p0, p1, p3, p4}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->getPropertyFunction(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 451
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 452
a=0;//     new-instance v1, Ljava/util/HashMap;
a=0;// 
a=0;//     .end local v1    # "propertyMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/reflect/Method;>;"
a=0;//     #v1=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 453
a=0;//     .restart local v1    # "propertyMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/reflect/Method;>;"
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {p2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 455
a=0;//     :cond_1
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 458
a=0;//     :cond_2
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mPropertyMapLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V
a=0;// 
a=0;//     .line 460
a=0;//     return-object v2
a=0;// 
a=0;//     .line 457
a=0;//     .end local v1    # "propertyMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/reflect/Method;>;"
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 458
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mPropertyMapLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V
a=0;// 
a=0;//     .line 459
a=0;//     throw v3
a=0;// .end method
a=0;// 
a=0;// .method private setupValue(Ljava/lang/Object;Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe;)V
a=0;//     .locals 4
a=0;//     .param p1, "target"    # Ljava/lang/Object;
a=0;//     .param p2, "kf"    # Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     .prologue
a=0;//     .line 537
a=0;//     :try_start_0
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mGetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/reflect/Method;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 538
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 539
a=0;//     .local v1, "targetClass":Ljava/lang/Class;
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {p0, v1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->setupGetter(Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 541
a=0;//     .end local v1    # "targetClass":Ljava/lang/Class;
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mGetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v2, p1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p2, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe;->setValue(Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 547
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 542
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 543
a=0;//     .local v0, "e":Ljava/lang/reflect/InvocationTargetException;
a=0;//     #v0=(Reference,Ljava/lang/reflect/InvocationTargetException;);
a=0;//     const-string v2, "PropertyValuesHolder"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 544
a=0;//     .end local v0    # "e":Ljava/lang/reflect/InvocationTargetException;
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 545
a=0;//     .local v0, "e":Ljava/lang/IllegalAccessException;
a=0;//     #v0=(Reference,Ljava/lang/IllegalAccessException;);
a=0;//     const-string v2, "PropertyValuesHolder"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method calculateValue(F)V
a=0;//     .locals 1
a=0;//     .param p1, "fraction"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 652
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;);
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;->getValue(F)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mAnimatedValue:Ljava/lang/Object;
a=0;// 
a=0;//     .line 653
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public clone()Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 576
a=0;//     :try_start_0
a=0;//     invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     .line 577
a=0;//     .local v1, "newPVH":Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, v1, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     .line 579
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;->clone()Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v1, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     .line 580
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mEvaluator:Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     iput-object v2, v1, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mEvaluator:Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 584
a=0;//     .end local v1    # "newPVH":Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 582
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 584
a=0;//     .local v0, "e":Ljava/lang/CloneNotSupportedException;
a=0;//     #v0=(Reference,Ljava/lang/CloneNotSupportedException;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
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
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->clone()Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method getAnimatedValue()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 704
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mAnimatedValue:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getPropertyName()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 695
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method init()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 616
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mEvaluator:Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 619
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     const-class v1, Ljava/lang/Integer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     sget-object v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->sIntEvaluator:Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     :goto_0
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mEvaluator:Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     .line 623
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mEvaluator:Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 626
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mEvaluator:Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;->setEvaluator(Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;)V
a=0;// 
a=0;//     .line 628
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 620
a=0;//     :cond_2
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     const-class v1, Ljava/lang/Float;
a=0;// 
a=0;//     if-ne v0, v1, :cond_3
a=0;// 
a=0;//     sget-object v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->sFloatEvaluator:Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 621
a=0;//     :cond_3
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method setAnimatedValue(Ljava/lang/Object;)V
a=0;//     .locals 4
a=0;//     .param p1, "target"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 599
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mSetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/reflect/Method;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 601
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mTmpValueArray:[Ljava/lang/Object;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->getAnimatedValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     .line 602
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mSetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mTmpValueArray:[Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 609
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 603
a=0;//     :catch_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 604
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
a=0;//     .line 605
a=0;//     .end local v0    # "e":Ljava/lang/reflect/InvocationTargetException;
a=0;//     :catch_1
a=0;//     #v0=(Uninit);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 606
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
a=0;// .method public setEvaluator(Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;)V
a=0;//     .locals 1
a=0;//     .param p1, "evaluator"    # Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 641
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mEvaluator:Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     .line 642
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;);
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;->setEvaluator(Lcom/actionbarsherlock/internal/nineoldandroids/animation/TypeEvaluator;)V
a=0;// 
a=0;//     .line 643
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public varargs setFloatValues([F)V
a=0;//     .locals 1
a=0;//     .param p1, "values"    # [F
a=0;// 
a=0;//     .prologue
a=0;//     .line 327
a=0;//     sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     .line 328
a=0;//     invoke-static {p1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;->ofFloat([F)Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     .line 329
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public varargs setIntValues([I)V
a=0;//     .locals 1
a=0;//     .param p1, "values"    # [I
a=0;// 
a=0;//     .prologue
a=0;//     .line 309
a=0;//     sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     .line 310
a=0;//     invoke-static {p1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;->ofInt([I)Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     .line 311
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public varargs setKeyframes([Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe;)V
a=0;//     .locals 4
a=0;//     .param p1, "values"    # [Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     .prologue
a=0;//     .line 337
a=0;//     array-length v2, p1
a=0;// 
a=0;//     .line 338
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
a=0;//     new-array v1, v3, [Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     .line 339
a=0;//     .local v1, "keyframes":[Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe;
a=0;//     #v1=(Reference,[Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aget-object v3, p1, v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     iput-object v3, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     .line 340
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     .line 343
a=0;//     new-instance v3, Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;);
a=0;//     invoke-direct {v3, v1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;-><init>([Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;);
a=0;//     iput-object v3, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     .line 344
a=0;//     return-void
a=0;// 
a=0;//     .line 341
a=0;//     :cond_0
a=0;//     aget-object v3, p1, v0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object v3, v1, v0
a=0;// 
a=0;//     .line 340
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public varargs setObjectValues([Ljava/lang/Object;)V
a=0;//     .locals 1
a=0;//     .param p1, "values"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 360
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     aget-object v0, p1, v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     .line 361
a=0;//     invoke-static {p1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;->ofObject([Ljava/lang/Object;)Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     .line 362
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPropertyName(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "propertyName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 671
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     .line 672
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setupEndValue(Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;//     .param p1, "target"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 570
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;);
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;);
a=0;//     iget-object v1, v1, Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     invoke-direct {p0, p1, v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->setupValue(Ljava/lang/Object;Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe;)V
a=0;// 
a=0;//     .line 571
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setupSetter(Ljava/lang/Class;)V
a=0;//     .locals 3
a=0;//     .param p1, "targetClass"    # Ljava/lang/Class;
a=0;// 
a=0;//     .prologue
a=0;//     .line 468
a=0;//     sget-object v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->sSetterPropertyMap:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "set"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {p0, p1, v0, v1, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->setupSetterOrGetter(Ljava/lang/Class;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mSetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     .line 469
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setupSetterAndGetter(Ljava/lang/Object;)V
a=0;//     .locals 6
a=0;//     .param p1, "target"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 505
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 506
a=0;//     .local v2, "targetClass":Ljava/lang/Class;
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mSetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/reflect/Method;);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 507
a=0;//     invoke-virtual {p0, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->setupSetter(Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 509
a=0;//     :cond_0
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     iget-object v3, v3, Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     .line 523
a=0;//     return-void
a=0;// 
a=0;//     .line 509
a=0;//     :cond_2
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     .line 510
a=0;//     .local v1, "kf":Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe;
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe;->hasValue()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 511
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mGetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/reflect/Method;);
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     .line 512
a=0;//     invoke-direct {p0, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->setupGetter(Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 515
a=0;//     :cond_3
a=0;//     :try_start_0
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mGetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v4, p1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe;->setValue(Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 516
a=0;//     :catch_0
a=0;//     #v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 517
a=0;//     .local v0, "e":Ljava/lang/reflect/InvocationTargetException;
a=0;//     #v0=(Reference,Ljava/lang/reflect/InvocationTargetException;);
a=0;//     const-string v4, "PropertyValuesHolder"
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 518
a=0;//     .end local v0    # "e":Ljava/lang/reflect/InvocationTargetException;
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 519
a=0;//     .local v0, "e":Ljava/lang/IllegalAccessException;
a=0;//     #v0=(Reference,Ljava/lang/IllegalAccessException;);
a=0;//     const-string v4, "PropertyValuesHolder"
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method setupStartValue(Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;//     .param p1, "target"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 558
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;);
a=0;//     iget-object v0, v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     invoke-direct {p0, p1, v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->setupValue(Ljava/lang/Object;Lcom/actionbarsherlock/internal/nineoldandroids/animation/Keyframe;)V
a=0;// 
a=0;//     .line 559
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 709
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, ": "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/KeyframeSet;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
