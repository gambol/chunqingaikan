package com.nineoldandroids.animation; class PropertyValuesHolder { void a() { int a;
a=0;// .class public Lcom/nineoldandroids/animation/PropertyValuesHolder;
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
a=0;//         Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;,
a=0;//         Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;
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
a=0;// .field private static final sFloatEvaluator:Lcom/nineoldandroids/animation/TypeEvaluator;
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
a=0;// .field private static final sIntEvaluator:Lcom/nineoldandroids/animation/TypeEvaluator;
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
a=0;// .field private mEvaluator:Lcom/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;// .field private mGetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;// .field mKeyframeSet:Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;// .field protected mProperty:Lcom/nineoldandroids/util/Property;
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
a=0;//     new-instance v0, Lcom/nineoldandroids/animation/IntEvaluator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/nineoldandroids/animation/IntEvaluator;);
a=0;//     invoke-direct {v0}, Lcom/nineoldandroids/animation/IntEvaluator;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/IntEvaluator;);
a=0;//     sput-object v0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->sIntEvaluator:Lcom/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     .line 81
a=0;//     new-instance v0, Lcom/nineoldandroids/animation/FloatEvaluator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/nineoldandroids/animation/FloatEvaluator;);
a=0;//     invoke-direct {v0}, Lcom/nineoldandroids/animation/FloatEvaluator;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/FloatEvaluator;);
a=0;//     sput-object v0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->sFloatEvaluator:Lcom/nineoldandroids/animation/TypeEvaluator;
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
a=0;//     sput-object v0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->FLOAT_VARIANTS:[Ljava/lang/Class;
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
a=0;//     sput-object v0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->INTEGER_VARIANTS:[Ljava/lang/Class;
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
a=0;//     sput-object v0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->DOUBLE_VARIANTS:[Ljava/lang/Class;
a=0;// 
a=0;//     .line 101
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 100
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->sSetterPropertyMap:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 103
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 102
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->sGetterPropertyMap:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 103
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Lcom/nineoldandroids/util/Property;)V
a=0;//     .locals 1
a=0;//     .param p1, "property"    # Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 139
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 56
a=0;//     #p0=(Reference,Lcom/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mSetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     .line 65
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mGetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     .line 76
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     .line 107
a=0;//     new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mPropertyMapLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     .line 110
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mTmpValueArray:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 140
a=0;//     iput-object p1, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mProperty:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     .line 141
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 142
a=0;//     invoke-virtual {p1}, Lcom/nineoldandroids/util/Property;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     .line 144
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/nineoldandroids/util/Property;Lcom/nineoldandroids/animation/PropertyValuesHolder;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 139
a=0;//     invoke-direct {p0, p1}, Lcom/nineoldandroids/animation/PropertyValuesHolder;-><init>(Lcom/nineoldandroids/util/Property;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/nineoldandroids/animation/PropertyValuesHolder;);
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
a=0;//     #p0=(Reference,Lcom/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mSetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     .line 65
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mGetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     .line 76
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     .line 107
a=0;//     new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mPropertyMapLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     .line 110
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mTmpValueArray:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 132
a=0;//     iput-object p1, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     .line 133
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Ljava/lang/String;Lcom/nineoldandroids/animation/PropertyValuesHolder;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     invoke-direct {p0, p1}, Lcom/nineoldandroids/animation/PropertyValuesHolder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static getMethodName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 4
a=0;//     .param p0, "prefix"    # Ljava/lang/String;
a=0;//     .param p1, "propertyName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 744
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 750
a=0;//     .end local p0    # "prefix":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 748
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
a=0;//     .line 749
a=0;//     .local v0, "firstLetter":C
a=0;//     #v0=(Char);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 750
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
a=0;//     .locals 12
a=0;//     .param p1, "targetClass"    # Ljava/lang/Class;
a=0;//     .param p2, "prefix"    # Ljava/lang/String;
a=0;//     .param p3, "valueType"    # Ljava/lang/Class;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     .line 381
a=0;//     #v11=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 382
a=0;//     .local v4, "returnVal":Ljava/lang/reflect/Method;
a=0;//     #v4=(Null);
a=0;//     iget-object v8, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p2, v8}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->getMethodName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 383
a=0;//     .local v3, "methodName":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 384
a=0;//     .local v0, "args":[Ljava/lang/Class;
a=0;//     #v0=(Null);
a=0;//     if-nez p3, :cond_0
a=0;// 
a=0;//     .line 386
a=0;//     :try_start_0
a=0;//     invoke-virtual {p1, v3, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,[Ljava/lang/Class;);v1=(Conflicted);v2=(Conflicted);v4=(Reference,Ljava/lang/reflect/Method;);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Reference,Ljava/lang/String;);v10=(Conflicted);v11=(Conflicted);
a=0;//     move-object v5, v4
a=0;// 
a=0;//     .line 440
a=0;//     .end local v4    # "returnVal":Ljava/lang/reflect/Method;
a=0;//     .local v5, "returnVal":Ljava/lang/reflect/Method;
a=0;//     :goto_1
a=0;//     #v5=(Reference,Ljava/lang/reflect/Method;);
a=0;//     return-object v5
a=0;// 
a=0;//     .line 387
a=0;//     .end local v5    # "returnVal":Ljava/lang/reflect/Method;
a=0;//     .restart local v4    # "returnVal":Ljava/lang/reflect/Method;
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);v4=(Null);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Reference,Ljava/lang/String;);v9=(Null);v10=(Uninit);v11=(One);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 392
a=0;//     .local v1, "e":Ljava/lang/NoSuchMethodException;
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/lang/NoSuchMethodException;);
a=0;//     invoke-virtual {p1, v3, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 393
a=0;//     #v4=(Reference,Ljava/lang/reflect/Method;);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     invoke-virtual {v4, v8}, Ljava/lang/reflect/Method;->setAccessible(Z)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 394
a=0;//     :catch_1
a=0;//     #v8=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 395
a=0;//     .local v2, "e2":Ljava/lang/NoSuchMethodException;
a=0;//     #v2=(Reference,Ljava/lang/NoSuchMethodException;);
a=0;//     const-string v8, "PropertyValuesHolder"
a=0;// 
a=0;//     .line 396
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "Couldn\'t find no-arg method for property "
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v10, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     const-string v10, ": "
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 395
a=0;//     invoke-static {v8, v9}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 400
a=0;//     .end local v1    # "e":Ljava/lang/NoSuchMethodException;
a=0;//     .end local v2    # "e2":Ljava/lang/NoSuchMethodException;
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v4=(Null);v9=(Null);v10=(Uninit);
a=0;//     new-array v0, v11, [Ljava/lang/Class;
a=0;// 
a=0;//     .line 402
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     iget-object v8, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     const-class v10, Ljava/lang/Float;
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v8, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_1
a=0;// 
a=0;//     .line 403
a=0;//     sget-object v7, Lcom/nineoldandroids/animation/PropertyValuesHolder;->FLOAT_VARIANTS:[Ljava/lang/Class;
a=0;// 
a=0;//     .line 412
a=0;//     .local v7, "typeVariants":[Ljava/lang/Class;
a=0;//     :goto_2
a=0;//     #v7=(Reference,[Ljava/lang/Class;);v8=(Conflicted);
a=0;//     array-length v10, v7
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     move v8, v9
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Conflicted);v4=(Reference,Ljava/lang/reflect/Method;);v6=(Conflicted);v8=(Integer);v11=(Conflicted);
a=0;//     if-lt v8, v10, :cond_4
a=0;// 
a=0;//     .line 435
a=0;//     const-string v8, "PropertyValuesHolder"
a=0;// 
a=0;//     .line 436
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "Couldn\'t find setter/getter for property "
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v10, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 437
a=0;//     const-string v10, " with value type "
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     iget-object v10, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 436
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 435
a=0;//     invoke-static {v8, v9}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 404
a=0;//     .end local v7    # "typeVariants":[Ljava/lang/Class;
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v4=(Null);v6=(Uninit);v7=(Uninit);v8=(Boolean);v9=(Null);v11=(One);
a=0;//     iget-object v8, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Class;);
a=0;//     const-class v10, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_2
a=0;// 
a=0;//     .line 405
a=0;//     sget-object v7, Lcom/nineoldandroids/animation/PropertyValuesHolder;->INTEGER_VARIANTS:[Ljava/lang/Class;
a=0;// 
a=0;//     .line 406
a=0;//     .restart local v7    # "typeVariants":[Ljava/lang/Class;
a=0;//     #v7=(Reference,[Ljava/lang/Class;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .end local v7    # "typeVariants":[Ljava/lang/Class;
a=0;//     :cond_2
a=0;//     #v7=(Uninit);
a=0;//     iget-object v8, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Class;);
a=0;//     const-class v10, Ljava/lang/Double;
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_3
a=0;// 
a=0;//     .line 407
a=0;//     sget-object v7, Lcom/nineoldandroids/animation/PropertyValuesHolder;->DOUBLE_VARIANTS:[Ljava/lang/Class;
a=0;// 
a=0;//     .line 408
a=0;//     .restart local v7    # "typeVariants":[Ljava/lang/Class;
a=0;//     #v7=(Reference,[Ljava/lang/Class;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 409
a=0;//     .end local v7    # "typeVariants":[Ljava/lang/Class;
a=0;//     :cond_3
a=0;//     #v7=(Uninit);
a=0;//     new-array v7, v11, [Ljava/lang/Class;
a=0;// 
a=0;//     .line 410
a=0;//     .restart local v7    # "typeVariants":[Ljava/lang/Class;
a=0;//     #v7=(Reference,[Ljava/lang/Class;);
a=0;//     iget-object v8, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v8, v7, v9
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 412
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v4=(Reference,Ljava/lang/reflect/Method;);v6=(Conflicted);v8=(Integer);v10=(Integer);v11=(Conflicted);
a=0;//     aget-object v6, v7, v8
a=0;// 
a=0;//     .line 413
a=0;//     .local v6, "typeVariant":Ljava/lang/Class;
a=0;//     #v6=(Null);
a=0;//     aput-object v6, v0, v9
a=0;// 
a=0;//     .line 415
a=0;//     :try_start_2
a=0;//     invoke-virtual {p1, v3, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 417
a=0;//     iput-object v6, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     move-object v5, v4
a=0;// 
a=0;//     .line 418
a=0;//     .end local v4    # "returnVal":Ljava/lang/reflect/Method;
a=0;//     .restart local v5    # "returnVal":Ljava/lang/reflect/Method;
a=0;//     #v5=(Reference,Ljava/lang/reflect/Method;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 419
a=0;//     .end local v5    # "returnVal":Ljava/lang/reflect/Method;
a=0;//     .restart local v4    # "returnVal":Ljava/lang/reflect/Method;
a=0;//     :catch_2
a=0;//     #v5=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 424
a=0;//     .restart local v1    # "e":Ljava/lang/NoSuchMethodException;
a=0;//     :try_start_3
a=0;//     #v1=(Reference,Ljava/lang/NoSuchMethodException;);
a=0;//     invoke-virtual {p1, v3, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 425
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     #v11=(One);
a=0;//     invoke-virtual {v4, v11}, Ljava/lang/reflect/Method;->setAccessible(Z)V
a=0;// 
a=0;//     .line 427
a=0;//     iput-object v6, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_3
a=0;// 
a=0;//     move-object v5, v4
a=0;// 
a=0;//     .line 428
a=0;//     .end local v4    # "returnVal":Ljava/lang/reflect/Method;
a=0;//     .restart local v5    # "returnVal":Ljava/lang/reflect/Method;
a=0;//     #v5=(Reference,Ljava/lang/reflect/Method;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 429
a=0;//     .end local v5    # "returnVal":Ljava/lang/reflect/Method;
a=0;//     .restart local v4    # "returnVal":Ljava/lang/reflect/Method;
a=0;//     :catch_3
a=0;//     #v5=(Uninit);v11=(Conflicted);
a=0;//     move-exception v11
a=0;// 
a=0;//     .line 412
a=0;//     #v11=(Reference,Ljava/lang/NoSuchMethodException;);
a=0;//     add-int/lit8 v8, v8, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofFloat(Lcom/nineoldandroids/util/Property;[F)Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;//     .locals 1
a=0;//     .param p1, "values"    # [F
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/nineoldandroids/util/Property",
a=0;//             "<*",
a=0;//             "Ljava/lang/Float;",
a=0;//             ">;[F)",
a=0;//             "Lcom/nineoldandroids/animation/PropertyValuesHolder;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 187
a=0;//     .local p0, "property":Lcom/nineoldandroids/util/Property;, "Lcom/nineoldandroids/util/Property<*Ljava/lang/Float;>;"
a=0;//     new-instance v0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;-><init>(Lcom/nineoldandroids/util/Property;[F)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofFloat(Ljava/lang/String;[F)Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;//     .locals 1
a=0;//     .param p0, "propertyName"    # Ljava/lang/String;
a=0;//     .param p1, "values"    # [F
a=0;// 
a=0;//     .prologue
a=0;//     .line 176
a=0;//     new-instance v0, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;-><init>(Ljava/lang/String;[F)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofInt(Lcom/nineoldandroids/util/Property;[I)Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;//     .locals 1
a=0;//     .param p1, "values"    # [I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/nineoldandroids/util/Property",
a=0;//             "<*",
a=0;//             "Ljava/lang/Integer;",
a=0;//             ">;[I)",
a=0;//             "Lcom/nineoldandroids/animation/PropertyValuesHolder;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 165
a=0;//     .local p0, "property":Lcom/nineoldandroids/util/Property;, "Lcom/nineoldandroids/util/Property<*Ljava/lang/Integer;>;"
a=0;//     new-instance v0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;-><init>(Lcom/nineoldandroids/util/Property;[I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofInt(Ljava/lang/String;[I)Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;//     .locals 1
a=0;//     .param p0, "propertyName"    # Ljava/lang/String;
a=0;//     .param p1, "values"    # [I
a=0;// 
a=0;//     .prologue
a=0;//     .line 154
a=0;//     new-instance v0, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;-><init>(Ljava/lang/String;[I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofKeyframe(Lcom/nineoldandroids/util/Property;[Lcom/nineoldandroids/animation/Keyframe;)Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;//     .locals 3
a=0;//     .param p0, "property"    # Lcom/nineoldandroids/util/Property;
a=0;//     .param p1, "values"    # [Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     .prologue
a=0;//     .line 281
a=0;//     invoke-static {p1}, Lcom/nineoldandroids/animation/KeyframeSet;->ofKeyframe([Lcom/nineoldandroids/animation/Keyframe;)Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 282
a=0;//     .local v0, "keyframeSet":Lcom/nineoldandroids/animation/KeyframeSet;
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/KeyframeSet;);
a=0;//     instance-of v2, v0, Lcom/nineoldandroids/animation/IntKeyframeSet;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 283
a=0;//     new-instance v1, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;);
a=0;//     check-cast v0, Lcom/nineoldandroids/animation/IntKeyframeSet;
a=0;// 
a=0;//     .end local v0    # "keyframeSet":Lcom/nineoldandroids/animation/KeyframeSet;
a=0;//     invoke-direct {v1, p0, v0}, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;-><init>(Lcom/nineoldandroids/util/Property;Lcom/nineoldandroids/animation/IntKeyframeSet;)V
a=0;// 
a=0;//     .line 291
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ujava/lang/Object;);v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 284
a=0;//     .restart local v0    # "keyframeSet":Lcom/nineoldandroids/animation/KeyframeSet;
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Boolean);
a=0;//     instance-of v2, v0, Lcom/nineoldandroids/animation/FloatKeyframeSet;
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 285
a=0;//     new-instance v1, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;);
a=0;//     check-cast v0, Lcom/nineoldandroids/animation/FloatKeyframeSet;
a=0;// 
a=0;//     .end local v0    # "keyframeSet":Lcom/nineoldandroids/animation/KeyframeSet;
a=0;//     invoke-direct {v1, p0, v0}, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;-><init>(Lcom/nineoldandroids/util/Property;Lcom/nineoldandroids/animation/FloatKeyframeSet;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 288
a=0;//     .restart local v0    # "keyframeSet":Lcom/nineoldandroids/animation/KeyframeSet;
a=0;//     :cond_1
a=0;//     #v1=(Uninit);
a=0;//     new-instance v1, Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     invoke-direct {v1, p0}, Lcom/nineoldandroids/animation/PropertyValuesHolder;-><init>(Lcom/nineoldandroids/util/Property;)V
a=0;// 
a=0;//     .line 289
a=0;//     .local v1, "pvh":Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;//     #v1=(Reference,Lcom/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     iput-object v0, v1, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     .line 290
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget-object v2, p1, v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/nineoldandroids/animation/Keyframe;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     iput-object v2, v1, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofKeyframe(Ljava/lang/String;[Lcom/nineoldandroids/animation/Keyframe;)Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;//     .locals 3
a=0;//     .param p0, "propertyName"    # Ljava/lang/String;
a=0;//     .param p1, "values"    # [Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     .prologue
a=0;//     .line 250
a=0;//     invoke-static {p1}, Lcom/nineoldandroids/animation/KeyframeSet;->ofKeyframe([Lcom/nineoldandroids/animation/Keyframe;)Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 251
a=0;//     .local v0, "keyframeSet":Lcom/nineoldandroids/animation/KeyframeSet;
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/KeyframeSet;);
a=0;//     instance-of v2, v0, Lcom/nineoldandroids/animation/IntKeyframeSet;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 252
a=0;//     new-instance v1, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;);
a=0;//     check-cast v0, Lcom/nineoldandroids/animation/IntKeyframeSet;
a=0;// 
a=0;//     .end local v0    # "keyframeSet":Lcom/nineoldandroids/animation/KeyframeSet;
a=0;//     invoke-direct {v1, p0, v0}, Lcom/nineoldandroids/animation/PropertyValuesHolder$IntPropertyValuesHolder;-><init>(Ljava/lang/String;Lcom/nineoldandroids/animation/IntKeyframeSet;)V
a=0;// 
a=0;//     .line 260
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ujava/lang/Object;);v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 253
a=0;//     .restart local v0    # "keyframeSet":Lcom/nineoldandroids/animation/KeyframeSet;
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Boolean);
a=0;//     instance-of v2, v0, Lcom/nineoldandroids/animation/FloatKeyframeSet;
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 254
a=0;//     new-instance v1, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;);
a=0;//     check-cast v0, Lcom/nineoldandroids/animation/FloatKeyframeSet;
a=0;// 
a=0;//     .end local v0    # "keyframeSet":Lcom/nineoldandroids/animation/KeyframeSet;
a=0;//     invoke-direct {v1, p0, v0}, Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;-><init>(Ljava/lang/String;Lcom/nineoldandroids/animation/FloatKeyframeSet;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/nineoldandroids/animation/PropertyValuesHolder$FloatPropertyValuesHolder;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 257
a=0;//     .restart local v0    # "keyframeSet":Lcom/nineoldandroids/animation/KeyframeSet;
a=0;//     :cond_1
a=0;//     #v1=(Uninit);
a=0;//     new-instance v1, Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     invoke-direct {v1, p0}, Lcom/nineoldandroids/animation/PropertyValuesHolder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 258
a=0;//     .local v1, "pvh":Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;//     #v1=(Reference,Lcom/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     iput-object v0, v1, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     .line 259
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget-object v2, p1, v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/nineoldandroids/animation/Keyframe;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     iput-object v2, v1, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofObject(Lcom/nineoldandroids/util/Property;Lcom/nineoldandroids/animation/TypeEvaluator;[Ljava/lang/Object;)Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;//     .locals 1
a=0;//     .param p0, "property"    # Lcom/nineoldandroids/util/Property;
a=0;//     .param p2, "values"    # [Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<V:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/nineoldandroids/util/Property;",
a=0;//             "Lcom/nineoldandroids/animation/TypeEvaluator",
a=0;//             "<TV;>;[TV;)",
a=0;//             "Lcom/nineoldandroids/animation/PropertyValuesHolder;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 224
a=0;//     .local p1, "evaluator":Lcom/nineoldandroids/animation/TypeEvaluator;, "Lcom/nineoldandroids/animation/TypeEvaluator<TV;>;"
a=0;//     new-instance v0, Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     invoke-direct {v0, p0}, Lcom/nineoldandroids/animation/PropertyValuesHolder;-><init>(Lcom/nineoldandroids/util/Property;)V
a=0;// 
a=0;//     .line 225
a=0;//     .local v0, "pvh":Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     invoke-virtual {v0, p2}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->setObjectValues([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 226
a=0;//     invoke-virtual {v0, p1}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->setEvaluator(Lcom/nineoldandroids/animation/TypeEvaluator;)V
a=0;// 
a=0;//     .line 227
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs ofObject(Ljava/lang/String;Lcom/nineoldandroids/animation/TypeEvaluator;[Ljava/lang/Object;)Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;//     .locals 1
a=0;//     .param p0, "propertyName"    # Ljava/lang/String;
a=0;//     .param p1, "evaluator"    # Lcom/nineoldandroids/animation/TypeEvaluator;
a=0;//     .param p2, "values"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 204
a=0;//     new-instance v0, Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     invoke-direct {v0, p0}, Lcom/nineoldandroids/animation/PropertyValuesHolder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 205
a=0;//     .local v0, "pvh":Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     invoke-virtual {v0, p2}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->setObjectValues([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 206
a=0;//     invoke-virtual {v0, p1}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->setEvaluator(Lcom/nineoldandroids/animation/TypeEvaluator;)V
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
a=0;//     .line 493
a=0;//     sget-object v0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->sGetterPropertyMap:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "get"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0, p1, v0, v1, v2}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->setupSetterOrGetter(Ljava/lang/Class;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mGetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     .line 494
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
a=0;//     .line 457
a=0;//     .local p2, "propertyMapMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/Class;Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/reflect/Method;>;>;"
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 462
a=0;//     .local v2, "setterOrGetter":Ljava/lang/reflect/Method;
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mPropertyMapLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V
a=0;// 
a=0;//     .line 463
a=0;//     invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/util/HashMap;
a=0;// 
a=0;//     .line 464
a=0;//     .local v1, "propertyMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/reflect/Method;>;"
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 465
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mPropertyName:Ljava/lang/String;
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
a=0;//     .line 467
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/lang/reflect/Method;);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 468
a=0;//     invoke-direct {p0, p1, p3, p4}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->getPropertyFunction(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 469
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 470
a=0;//     new-instance v1, Ljava/util/HashMap;
a=0;// 
a=0;//     .end local v1    # "propertyMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/reflect/Method;>;"
a=0;//     #v1=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 471
a=0;//     .restart local v1    # "propertyMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/reflect/Method;>;"
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {p2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 473
a=0;//     :cond_1
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 476
a=0;//     :cond_2
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mPropertyMapLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V
a=0;// 
a=0;//     .line 478
a=0;//     return-object v2
a=0;// 
a=0;//     .line 475
a=0;//     .end local v1    # "propertyMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/reflect/Method;>;"
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 476
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v4, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mPropertyMapLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/concurrent/locks/ReentrantReadWriteLock;);
a=0;//     invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V
a=0;// 
a=0;//     .line 477
a=0;//     throw v3
a=0;// .end method
a=0;// 
a=0;// .method private setupValue(Ljava/lang/Object;Lcom/nineoldandroids/animation/Keyframe;)V
a=0;//     .locals 4
a=0;//     .param p1, "target"    # Ljava/lang/Object;
a=0;//     .param p2, "kf"    # Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     .prologue
a=0;//     .line 551
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mProperty:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     #v2=(Reference,Lcom/nineoldandroids/util/Property;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 552
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mProperty:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Lcom/nineoldandroids/util/Property;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p2, v2}, Lcom/nineoldandroids/animation/Keyframe;->setValue(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 555
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mGetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 556
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 557
a=0;//     .local v1, "targetClass":Ljava/lang/Class;
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {p0, v1}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->setupGetter(Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 559
a=0;//     .end local v1    # "targetClass":Ljava/lang/Class;
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mGetter:Ljava/lang/reflect/Method;
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
a=0;//     invoke-virtual {p2, v2}, Lcom/nineoldandroids/animation/Keyframe;->setValue(Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 565
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 560
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 561
a=0;//     .local v0, "e":Ljava/lang/reflect/InvocationTargetException;
a=0;//     #v0=(Reference,Ljava/lang/reflect/InvocationTargetException;);
a=0;//     const-string v2, "PropertyValuesHolder"
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 562
a=0;//     .end local v0    # "e":Ljava/lang/reflect/InvocationTargetException;
a=0;//     :catch_1
a=0;//     #v0=(Uninit);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 563
a=0;//     .local v0, "e":Ljava/lang/IllegalAccessException;
a=0;//     #v0=(Reference,Ljava/lang/IllegalAccessException;);
a=0;//     const-string v2, "PropertyValuesHolder"
a=0;// 
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
a=0;//     .line 670
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/KeyframeSet;);
a=0;//     invoke-virtual {v0, p1}, Lcom/nineoldandroids/animation/KeyframeSet;->getValue(F)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mAnimatedValue:Ljava/lang/Object;
a=0;// 
a=0;//     .line 671
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public clone()Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 594
a=0;//     :try_start_0
a=0;//     invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     .line 595
a=0;//     .local v1, "newPVH":Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, v1, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     .line 596
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mProperty:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     iput-object v2, v1, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mProperty:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     .line 597
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/nineoldandroids/animation/KeyframeSet;->clone()Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v1, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     .line 598
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mEvaluator:Lcom/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     iput-object v2, v1, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mEvaluator:Lcom/nineoldandroids/animation/TypeEvaluator;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 602
a=0;//     .end local v1    # "newPVH":Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 600
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 602
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
a=0;//     invoke-virtual {p0}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->clone()Lcom/nineoldandroids/animation/PropertyValuesHolder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/PropertyValuesHolder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method getAnimatedValue()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 722
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mAnimatedValue:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getPropertyName()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 713
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method init()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 634
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mEvaluator:Lcom/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/TypeEvaluator;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 637
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     const-class v1, Ljava/lang/Integer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     sget-object v0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->sIntEvaluator:Lcom/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     :goto_0
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mEvaluator:Lcom/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     .line 641
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mEvaluator:Lcom/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 644
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mEvaluator:Lcom/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     #v1=(Reference,Lcom/nineoldandroids/animation/TypeEvaluator;);
a=0;//     invoke-virtual {v0, v1}, Lcom/nineoldandroids/animation/KeyframeSet;->setEvaluator(Lcom/nineoldandroids/animation/TypeEvaluator;)V
a=0;// 
a=0;//     .line 646
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 638
a=0;//     :cond_2
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     const-class v1, Ljava/lang/Float;
a=0;// 
a=0;//     if-ne v0, v1, :cond_3
a=0;// 
a=0;//     sget-object v0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->sFloatEvaluator:Lcom/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 639
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
a=0;//     .line 614
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mProperty:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     #v1=(Reference,Lcom/nineoldandroids/util/Property;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 615
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mProperty:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->getAnimatedValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v1, p1, v2}, Lcom/nineoldandroids/util/Property;->set(Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 617
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mSetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 619
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mTmpValueArray:[Ljava/lang/Object;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->getAnimatedValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     .line 620
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mSetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mTmpValueArray:[Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 627
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 621
a=0;//     :catch_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 622
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
a=0;//     .line 623
a=0;//     .end local v0    # "e":Ljava/lang/reflect/InvocationTargetException;
a=0;//     :catch_1
a=0;//     #v0=(Uninit);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 624
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
a=0;// .method public setEvaluator(Lcom/nineoldandroids/animation/TypeEvaluator;)V
a=0;//     .locals 1
a=0;//     .param p1, "evaluator"    # Lcom/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 659
a=0;//     iput-object p1, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mEvaluator:Lcom/nineoldandroids/animation/TypeEvaluator;
a=0;// 
a=0;//     .line 660
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/KeyframeSet;);
a=0;//     invoke-virtual {v0, p1}, Lcom/nineoldandroids/animation/KeyframeSet;->setEvaluator(Lcom/nineoldandroids/animation/TypeEvaluator;)V
a=0;// 
a=0;//     .line 661
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
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     .line 328
a=0;//     invoke-static {p1}, Lcom/nineoldandroids/animation/KeyframeSet;->ofFloat([F)Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/nineoldandroids/animation/KeyframeSet;
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
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     .line 310
a=0;//     invoke-static {p1}, Lcom/nineoldandroids/animation/KeyframeSet;->ofInt([I)Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     .line 311
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public varargs setKeyframes([Lcom/nineoldandroids/animation/Keyframe;)V
a=0;//     .locals 4
a=0;//     .param p1, "values"    # [Lcom/nineoldandroids/animation/Keyframe;
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
a=0;//     new-array v1, v3, [Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     .line 339
a=0;//     .local v1, "keyframes":[Lcom/nineoldandroids/animation/Keyframe;
a=0;//     #v1=(Reference,[Lcom/nineoldandroids/animation/Keyframe;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aget-object v3, p1, v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/nineoldandroids/animation/Keyframe;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     iput-object v3, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
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
a=0;//     new-instance v3, Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/nineoldandroids/animation/KeyframeSet;);
a=0;//     invoke-direct {v3, v1}, Lcom/nineoldandroids/animation/KeyframeSet;-><init>([Lcom/nineoldandroids/animation/Keyframe;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/nineoldandroids/animation/KeyframeSet;);
a=0;//     iput-object v3, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/nineoldandroids/animation/KeyframeSet;
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
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     .line 361
a=0;//     invoke-static {p1}, Lcom/nineoldandroids/animation/KeyframeSet;->ofObject([Ljava/lang/Object;)Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     .line 362
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setProperty(Lcom/nineoldandroids/util/Property;)V
a=0;//     .locals 0
a=0;//     .param p1, "property"    # Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     .prologue
a=0;//     .line 701
a=0;//     iput-object p1, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mProperty:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     .line 702
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPropertyName(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "propertyName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 689
a=0;//     iput-object p1, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mPropertyName:Ljava/lang/String;
a=0;// 
a=0;//     .line 690
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setupEndValue(Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;//     .param p1, "target"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 588
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/KeyframeSet;);
a=0;//     iget-object v0, v0, Lcom/nineoldandroids/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     #v1=(Reference,Lcom/nineoldandroids/animation/KeyframeSet;);
a=0;//     iget-object v1, v1, Lcom/nineoldandroids/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
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
a=0;//     check-cast v0, Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     invoke-direct {p0, p1, v0}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->setupValue(Ljava/lang/Object;Lcom/nineoldandroids/animation/Keyframe;)V
a=0;// 
a=0;//     .line 589
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setupSetter(Ljava/lang/Class;)V
a=0;//     .locals 3
a=0;//     .param p1, "targetClass"    # Ljava/lang/Class;
a=0;// 
a=0;//     .prologue
a=0;//     .line 486
a=0;//     sget-object v0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->sSetterPropertyMap:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "set"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mValueType:Ljava/lang/Class;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {p0, p1, v0, v1, v2}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->setupSetterOrGetter(Ljava/lang/Class;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mSetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     .line 487
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setupSetterAndGetter(Ljava/lang/Object;)V
a=0;//     .locals 7
a=0;//     .param p1, "target"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 507
a=0;//     iget-object v4, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mProperty:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     #v4=(Reference,Lcom/nineoldandroids/util/Property;);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 510
a=0;//     :try_start_0
a=0;//     iget-object v4, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mProperty:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     invoke-virtual {v4, p1}, Lcom/nineoldandroids/util/Property;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 511
a=0;//     .local v3, "testValue":Ljava/lang/Object;
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v4, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     iget-object v4, v4, Lcom/nineoldandroids/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_2
a=0;// 
a=0;//     .line 541
a=0;//     .end local v3    # "testValue":Ljava/lang/Object;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 511
a=0;//     .restart local v3    # "testValue":Ljava/lang/Object;
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Reference,Ljava/lang/Object;);v6=(Uninit);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     .line 512
a=0;//     .local v1, "kf":Lcom/nineoldandroids/animation/Keyframe;
a=0;//     invoke-virtual {v1}, Lcom/nineoldandroids/animation/Keyframe;->hasValue()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     .line 513
a=0;//     iget-object v5, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mProperty:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     #v5=(Reference,Lcom/nineoldandroids/util/Property;);
a=0;//     invoke-virtual {v5, p1}, Lcom/nineoldandroids/util/Property;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v1, v5}, Lcom/nineoldandroids/animation/Keyframe;->setValue(Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 517
a=0;//     .end local v1    # "kf":Lcom/nineoldandroids/animation/Keyframe;
a=0;//     .end local v3    # "testValue":Ljava/lang/Object;
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 518
a=0;//     .local v0, "e":Ljava/lang/ClassCastException;
a=0;//     #v0=(Reference,Ljava/lang/ClassCastException;);
a=0;//     const-string v4, "PropertyValuesHolder"
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "No such property ("
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v6, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mProperty:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/nineoldandroids/util/Property;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 519
a=0;//     const-string v6, ") on target object "
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, ". Trying reflection instead"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 518
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 520
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     iput-object v4, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mProperty:Lcom/nineoldandroids/util/Property;
a=0;// 
a=0;//     .line 523
a=0;//     .end local v0    # "e":Ljava/lang/ClassCastException;
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v4=(Reference,Lcom/nineoldandroids/util/Property;);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 524
a=0;//     .local v2, "targetClass":Ljava/lang/Class;
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     iget-object v4, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mSetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     if-nez v4, :cond_4
a=0;// 
a=0;//     .line 525
a=0;//     invoke-virtual {p0, v2}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->setupSetter(Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 527
a=0;//     :cond_4
a=0;//     iget-object v4, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     iget-object v4, v4, Lcom/nineoldandroids/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_1
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/nineoldandroids/animation/Keyframe;
a=0;// 
a=0;//     .line 528
a=0;//     .restart local v1    # "kf":Lcom/nineoldandroids/animation/Keyframe;
a=0;//     invoke-virtual {v1}, Lcom/nineoldandroids/animation/Keyframe;->hasValue()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-nez v5, :cond_5
a=0;// 
a=0;//     .line 529
a=0;//     iget-object v5, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mGetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/reflect/Method;);
a=0;//     if-nez v5, :cond_6
a=0;// 
a=0;//     .line 530
a=0;//     invoke-direct {p0, v2}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->setupGetter(Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 533
a=0;//     :cond_6
a=0;//     :try_start_1
a=0;//     iget-object v5, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mGetter:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     new-array v6, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v5, p1, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v1, v5}, Lcom/nineoldandroids/animation/Keyframe;->setValue(Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 534
a=0;//     :catch_1
a=0;//     #v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 535
a=0;//     .local v0, "e":Ljava/lang/reflect/InvocationTargetException;
a=0;//     #v0=(Reference,Ljava/lang/reflect/InvocationTargetException;);
a=0;//     const-string v5, "PropertyValuesHolder"
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 536
a=0;//     .end local v0    # "e":Ljava/lang/reflect/InvocationTargetException;
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 537
a=0;//     .local v0, "e":Ljava/lang/IllegalAccessException;
a=0;//     #v0=(Reference,Ljava/lang/IllegalAccessException;);
a=0;//     const-string v5, "PropertyValuesHolder"
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method setupStartValue(Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;//     .param p1, "target"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 576
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/KeyframeSet;);
a=0;//     iget-object v0, v0, Lcom/nineoldandroids/animation/KeyframeSet;->mKeyframes:Ljava/util/ArrayList;
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
a=0;//     invoke-direct {p0, p1, v0}, Lcom/nineoldandroids/animation/PropertyValuesHolder;->setupValue(Ljava/lang/Object;Lcom/nineoldandroids/animation/Keyframe;)V
a=0;// 
a=0;//     .line 577
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 727
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mPropertyName:Ljava/lang/String;
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
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/PropertyValuesHolder;->mKeyframeSet:Lcom/nineoldandroids/animation/KeyframeSet;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/nineoldandroids/animation/KeyframeSet;->toString()Ljava/lang/String;
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
