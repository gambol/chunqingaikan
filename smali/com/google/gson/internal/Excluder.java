package com.google.gson.internal; class Excluder { void a() { int a;
a=0;// .class public final Lcom/google/gson/internal/Excluder;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Excluder.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/google/gson/TypeAdapterFactory;
a=0;// .implements Ljava/lang/Cloneable;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final DEFAULT:Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;// .field private static final IGNORE_VERSIONS:D = -1.0
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private deserializationStrategies:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/google/gson/ExclusionStrategy;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private modifiers:I
a=0;// 
a=0;// .field private requireExpose:Z
a=0;// 
a=0;// .field private serializationStrategies:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/google/gson/ExclusionStrategy;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private serializeInnerClasses:Z
a=0;// 
a=0;// .field private version:D
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     new-instance v0, Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/Excluder;);
a=0;//     invoke-direct {v0}, Lcom/google/gson/internal/Excluder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/Excluder;);
a=0;//     sput-object v0, Lcom/google/gson/internal/Excluder;->DEFAULT:Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 54
a=0;//     #p0=(Reference,Lcom/google/gson/internal/Excluder;);
a=0;//     const-wide/high16 v0, -0x4010000000000000L    # -1.0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/google/gson/internal/Excluder;->version:D
a=0;// 
a=0;//     .line 55
a=0;//     const/16 v0, 0x88
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     iput v0, p0, Lcom/google/gson/internal/Excluder;->modifiers:I
a=0;// 
a=0;//     .line 56
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/google/gson/internal/Excluder;->serializeInnerClasses:Z
a=0;// 
a=0;//     .line 58
a=0;//     invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     iput-object v0, p0, Lcom/google/gson/internal/Excluder;->serializationStrategies:Ljava/util/List;
a=0;// 
a=0;//     .line 59
a=0;//     invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/google/gson/internal/Excluder;->deserializationStrategies:Ljava/util/List;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private isAnonymousOrLocal(Ljava/lang/Class;)Z
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 216
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     const-class v0, Ljava/lang/Enum;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Class;->isAnonymousClass()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Class;->isLocalClass()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private isInnerClass(Ljava/lang/Class;)Z
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 221
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     invoke-virtual {p1}, Ljava/lang/Class;->isMemberClass()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/google/gson/internal/Excluder;->isStatic(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private isStatic(Ljava/lang/Class;)Z
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 225
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     invoke-virtual {p1}, Ljava/lang/Class;->getModifiers()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x8
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private isValidSince(Lcom/google/gson/annotations/Since;)Z
a=0;//     .locals 4
a=0;//     .param p1, "annotation"    # Lcom/google/gson/annotations/Since;
a=0;// 
a=0;//     .prologue
a=0;//     .line 233
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 234
a=0;//     invoke-interface {p1}, Lcom/google/gson/annotations/Since;->value()D
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 235
a=0;//     .local v0, "annotationVersion":D
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     iget-wide v2, p0, Lcom/google/gson/internal/Excluder;->version:D
a=0;// 
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     cmpl-double v2, v0, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     .line 236
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 239
a=0;//     .end local v0    # "annotationVersion":D
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private isValidUntil(Lcom/google/gson/annotations/Until;)Z
a=0;//     .locals 4
a=0;//     .param p1, "annotation"    # Lcom/google/gson/annotations/Until;
a=0;// 
a=0;//     .prologue
a=0;//     .line 243
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 244
a=0;//     invoke-interface {p1}, Lcom/google/gson/annotations/Until;->value()D
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 245
a=0;//     .local v0, "annotationVersion":D
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     iget-wide v2, p0, Lcom/google/gson/internal/Excluder;->version:D
a=0;// 
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     cmpg-double v2, v0, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gtz v2, :cond_0
a=0;// 
a=0;//     .line 246
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 249
a=0;//     .end local v0    # "annotationVersion":D
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private isValidVersion(Lcom/google/gson/annotations/Since;Lcom/google/gson/annotations/Until;)Z
a=0;//     .locals 1
a=0;//     .param p1, "since"    # Lcom/google/gson/annotations/Since;
a=0;//     .param p2, "until"    # Lcom/google/gson/annotations/Until;
a=0;// 
a=0;//     .prologue
a=0;//     .line 229
a=0;//     invoke-direct {p0, p1}, Lcom/google/gson/internal/Excluder;->isValidSince(Lcom/google/gson/annotations/Since;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-direct {p0, p2}, Lcom/google/gson/internal/Excluder;->isValidUntil(Lcom/google/gson/annotations/Until;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected clone()Lcom/google/gson/internal/Excluder;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     :try_start_0
a=0;//     invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/google/gson/internal/Excluder;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 64
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 65
a=0;//     .local v0, "e":Ljava/lang/CloneNotSupportedException;
a=0;//     #v0=(Reference,Ljava/lang/CloneNotSupportedException;);
a=0;//     new-instance v1, Ljava/lang/AssertionError;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/AssertionError;);
a=0;//     invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/AssertionError;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method protected bridge synthetic clone()Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/CloneNotSupportedException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     invoke-virtual {p0}, Lcom/google/gson/internal/Excluder;->clone()Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/Excluder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public create(Lcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
a=0;//     .locals 7
a=0;//     .param p1, "gson"    # Lcom/google/gson/Gson;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/google/gson/Gson;",
a=0;//             "Lcom/google/gson/reflect/TypeToken",
a=0;//             "<TT;>;)",
a=0;//             "Lcom/google/gson/TypeAdapter",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     .local p2, "type":Lcom/google/gson/reflect/TypeToken;, "Lcom/google/gson/reflect/TypeToken<TT;>;"
a=0;//     invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 113
a=0;//     .local v6, "rawType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     #v6=(Reference,Ljava/lang/Class;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v6, v0}, Lcom/google/gson/internal/Excluder;->excludeClass(Ljava/lang/Class;Z)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 114
a=0;//     .local v3, "skipSerialize":Z
a=0;//     #v3=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v6, v0}, Lcom/google/gson/internal/Excluder;->excludeClass(Ljava/lang/Class;Z)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 116
a=0;//     .local v2, "skipDeserialize":Z
a=0;//     #v2=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 117
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 120
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/google/gson/internal/Excluder$1;);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     new-instance v0, Lcom/google/gson/internal/Excluder$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/Excluder$1;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/internal/Excluder;);
a=0;//     move-object v4, p1
a=0;// 
a=0;//     #v4=(Reference,Lcom/google/gson/Gson;);
a=0;//     move-object v5, p2
a=0;// 
a=0;//     #v5=(Reference,Lcom/google/gson/reflect/TypeToken;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/google/gson/internal/Excluder$1;-><init>(Lcom/google/gson/internal/Excluder;ZZLcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/Excluder$1;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public disableInnerClassSerialization()Lcom/google/gson/internal/Excluder;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     invoke-virtual {p0}, Lcom/google/gson/internal/Excluder;->clone()Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 86
a=0;//     .local v0, "result":Lcom/google/gson/internal/Excluder;
a=0;//     #v0=(Reference,Lcom/google/gson/internal/Excluder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, v0, Lcom/google/gson/internal/Excluder;->serializeInnerClasses:Z
a=0;// 
a=0;//     .line 87
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public excludeClass(Ljava/lang/Class;Z)Z
a=0;//     .locals 8
a=0;//     .param p2, "serialize"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;Z)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 192
a=0;//     #v5=(One);
a=0;//     iget-wide v3, p0, Lcom/google/gson/internal/Excluder;->version:D
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     const-wide/high16 v6, -0x4010000000000000L    # -1.0
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     cmpl-double v3, v3, v6
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     const-class v3, Lcom/google/gson/annotations/Since;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p1, v3}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     check-cast v3, Lcom/google/gson/annotations/Since;
a=0;// 
a=0;//     const-class v4, Lcom/google/gson/annotations/Until;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p1, v4}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Lcom/google/gson/annotations/Until;
a=0;// 
a=0;//     invoke-direct {p0, v3, v4}, Lcom/google/gson/internal/Excluder;->isValidVersion(Lcom/google/gson/annotations/Since;Lcom/google/gson/annotations/Until;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     move v3, v5
a=0;// 
a=0;//     .line 212
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     return v3
a=0;// 
a=0;//     .line 197
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Byte);
a=0;//     iget-boolean v3, p0, Lcom/google/gson/internal/Excluder;->serializeInnerClasses:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/google/gson/internal/Excluder;->isInnerClass(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     move v3, v5
a=0;// 
a=0;//     .line 198
a=0;//     #v3=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 201
a=0;//     :cond_1
a=0;//     #v3=(Boolean);
a=0;//     invoke-direct {p0, p1}, Lcom/google/gson/internal/Excluder;->isAnonymousOrLocal(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     move v3, v5
a=0;// 
a=0;//     .line 202
a=0;//     #v3=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 205
a=0;//     :cond_2
a=0;//     #v3=(Boolean);
a=0;//     if-eqz p2, :cond_4
a=0;// 
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/Excluder;->serializationStrategies:Ljava/util/List;
a=0;// 
a=0;//     .line 206
a=0;//     .local v2, "list":Ljava/util/List;, "Ljava/util/List<Lcom/google/gson/ExclusionStrategy;>;"
a=0;//     :goto_1
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .local v1, "i$":Ljava/util/Iterator;
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/google/gson/ExclusionStrategy;
a=0;// 
a=0;//     .line 207
a=0;//     .local v0, "exclusionStrategy":Lcom/google/gson/ExclusionStrategy;
a=0;//     invoke-interface {v0, p1}, Lcom/google/gson/ExclusionStrategy;->shouldSkipClass(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     move v3, v5
a=0;// 
a=0;//     .line 208
a=0;//     #v3=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 205
a=0;//     .end local v0    # "exclusionStrategy":Lcom/google/gson/ExclusionStrategy;
a=0;//     .end local v1    # "i$":Ljava/util/Iterator;
a=0;//     .end local v2    # "list":Ljava/util/List;, "Ljava/util/List<Lcom/google/gson/ExclusionStrategy;>;"
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/Excluder;->deserializationStrategies:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 212
a=0;//     .restart local v1    # "i$":Ljava/util/Iterator;
a=0;//     .restart local v2    # "list":Ljava/util/List;, "Ljava/util/List<Lcom/google/gson/ExclusionStrategy;>;"
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public excludeField(Ljava/lang/reflect/Field;Z)Z
a=0;//     .locals 10
a=0;//     .param p1, "field"    # Ljava/lang/reflect/Field;
a=0;//     .param p2, "serialize"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 150
a=0;//     #v7=(One);
a=0;//     iget v5, p0, Lcom/google/gson/internal/Excluder;->modifiers:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     and-int/2addr v5, v6
a=0;// 
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     move v5, v7
a=0;// 
a=0;//     .line 188
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Boolean);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return v5
a=0;// 
a=0;//     .line 154
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Integer);v6=(Integer);v8=(Uninit);v9=(Uninit);
a=0;//     iget-wide v5, p0, Lcom/google/gson/internal/Excluder;->version:D
a=0;// 
a=0;//     #v5=(DoubleLo);v6=(DoubleHi);
a=0;//     const-wide/high16 v8, -0x4010000000000000L    # -1.0
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     cmpl-double v5, v5, v8
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     const-class v5, Lcom/google/gson/annotations/Since;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p1, v5}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     check-cast v5, Lcom/google/gson/annotations/Since;
a=0;// 
a=0;//     const-class v6, Lcom/google/gson/annotations/Until;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p1, v6}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     check-cast v6, Lcom/google/gson/annotations/Until;
a=0;// 
a=0;//     invoke-direct {p0, v5, v6}, Lcom/google/gson/internal/Excluder;->isValidVersion(Lcom/google/gson/annotations/Since;Lcom/google/gson/annotations/Until;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     move v5, v7
a=0;// 
a=0;//     .line 156
a=0;//     #v5=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 159
a=0;//     :cond_1
a=0;//     #v5=(Byte);v6=(Conflicted);
a=0;//     invoke-virtual {p1}, Ljava/lang/reflect/Field;->isSynthetic()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     move v5, v7
a=0;// 
a=0;//     .line 160
a=0;//     #v5=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 163
a=0;//     :cond_2
a=0;//     #v5=(Boolean);
a=0;//     iget-boolean v5, p0, Lcom/google/gson/internal/Excluder;->requireExpose:Z
a=0;// 
a=0;//     if-eqz v5, :cond_5
a=0;// 
a=0;//     .line 164
a=0;//     const-class v5, Lcom/google/gson/annotations/Expose;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p1, v5}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/annotation/Annotation;);
a=0;//     check-cast v0, Lcom/google/gson/annotations/Expose;
a=0;// 
a=0;//     .line 165
a=0;//     .local v0, "annotation":Lcom/google/gson/annotations/Expose;
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     if-eqz p2, :cond_4
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/google/gson/annotations/Expose;->serialize()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_5
a=0;// 
a=0;//     :cond_3
a=0;//     #v5=(Conflicted);
a=0;//     move v5, v7
a=0;// 
a=0;//     .line 166
a=0;//     #v5=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 165
a=0;//     :cond_4
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     invoke-interface {v0}, Lcom/google/gson/annotations/Expose;->deserialize()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     .line 170
a=0;//     .end local v0    # "annotation":Lcom/google/gson/annotations/Expose;
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);
a=0;//     iget-boolean v5, p0, Lcom/google/gson/internal/Excluder;->serializeInnerClasses:Z
a=0;// 
a=0;//     if-nez v5, :cond_6
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {p0, v5}, Lcom/google/gson/internal/Excluder;->isInnerClass(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_6
a=0;// 
a=0;//     move v5, v7
a=0;// 
a=0;//     .line 171
a=0;//     #v5=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 174
a=0;//     :cond_6
a=0;//     #v5=(Boolean);
a=0;//     invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {p0, v5}, Lcom/google/gson/internal/Excluder;->isAnonymousOrLocal(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_7
a=0;// 
a=0;//     move v5, v7
a=0;// 
a=0;//     .line 175
a=0;//     #v5=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 178
a=0;//     :cond_7
a=0;//     #v5=(Boolean);
a=0;//     if-eqz p2, :cond_9
a=0;// 
a=0;//     iget-object v4, p0, Lcom/google/gson/internal/Excluder;->serializationStrategies:Ljava/util/List;
a=0;// 
a=0;//     .line 179
a=0;//     .local v4, "list":Ljava/util/List;, "Ljava/util/List<Lcom/google/gson/ExclusionStrategy;>;"
a=0;//     :goto_1
a=0;//     #v4=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v4}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-nez v5, :cond_a
a=0;// 
a=0;//     .line 180
a=0;//     new-instance v2, Lcom/google/gson/FieldAttributes;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/google/gson/FieldAttributes;);
a=0;//     invoke-direct {v2, p1}, Lcom/google/gson/FieldAttributes;-><init>(Ljava/lang/reflect/Field;)V
a=0;// 
a=0;//     .line 181
a=0;//     .local v2, "fieldAttributes":Lcom/google/gson/FieldAttributes;
a=0;//     #v2=(Reference,Lcom/google/gson/FieldAttributes;);
a=0;//     invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .local v3, "i$":Ljava/util/Iterator;
a=0;//     :cond_8
a=0;//     #v1=(Conflicted);v3=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-eqz v5, :cond_a
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/google/gson/ExclusionStrategy;
a=0;// 
a=0;//     .line 182
a=0;//     .local v1, "exclusionStrategy":Lcom/google/gson/ExclusionStrategy;
a=0;//     invoke-interface {v1, v2}, Lcom/google/gson/ExclusionStrategy;->shouldSkipField(Lcom/google/gson/FieldAttributes;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-eqz v5, :cond_8
a=0;// 
a=0;//     move v5, v7
a=0;// 
a=0;//     .line 183
a=0;//     #v5=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 178
a=0;//     .end local v1    # "exclusionStrategy":Lcom/google/gson/ExclusionStrategy;
a=0;//     .end local v2    # "fieldAttributes":Lcom/google/gson/FieldAttributes;
a=0;//     .end local v3    # "i$":Ljava/util/Iterator;
a=0;//     .end local v4    # "list":Ljava/util/List;, "Ljava/util/List<Lcom/google/gson/ExclusionStrategy;>;"
a=0;//     :cond_9
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Boolean);
a=0;//     iget-object v4, p0, Lcom/google/gson/internal/Excluder;->deserializationStrategies:Ljava/util/List;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/List;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 188
a=0;//     .restart local v4    # "list":Ljava/util/List;, "Ljava/util/List<Lcom/google/gson/ExclusionStrategy;>;"
a=0;//     :cond_a
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public excludeFieldsWithoutExposeAnnotation()Lcom/google/gson/internal/Excluder;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     invoke-virtual {p0}, Lcom/google/gson/internal/Excluder;->clone()Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 92
a=0;//     .local v0, "result":Lcom/google/gson/internal/Excluder;
a=0;//     #v0=(Reference,Lcom/google/gson/internal/Excluder;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, v0, Lcom/google/gson/internal/Excluder;->requireExpose:Z
a=0;// 
a=0;//     .line 93
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public withExclusionStrategy(Lcom/google/gson/ExclusionStrategy;ZZ)Lcom/google/gson/internal/Excluder;
a=0;//     .locals 3
a=0;//     .param p1, "exclusionStrategy"    # Lcom/google/gson/ExclusionStrategy;
a=0;//     .param p2, "serialization"    # Z
a=0;//     .param p3, "deserialization"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 98
a=0;//     invoke-virtual {p0}, Lcom/google/gson/internal/Excluder;->clone()Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 99
a=0;//     .local v0, "result":Lcom/google/gson/internal/Excluder;
a=0;//     #v0=(Reference,Lcom/google/gson/internal/Excluder;);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 100
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/Excluder;->serializationStrategies:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v1, v0, Lcom/google/gson/internal/Excluder;->serializationStrategies:Ljava/util/List;
a=0;// 
a=0;//     .line 101
a=0;//     iget-object v1, v0, Lcom/google/gson/internal/Excluder;->serializationStrategies:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 103
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     if-eqz p3, :cond_1
a=0;// 
a=0;//     .line 104
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/Excluder;->deserializationStrategies:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v1, v0, Lcom/google/gson/internal/Excluder;->deserializationStrategies:Ljava/util/List;
a=0;// 
a=0;//     .line 106
a=0;//     iget-object v1, v0, Lcom/google/gson/internal/Excluder;->deserializationStrategies:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 108
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public varargs withModifiers([I)Lcom/google/gson/internal/Excluder;
a=0;//     .locals 6
a=0;//     .param p1, "modifiers"    # [I
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     invoke-virtual {p0}, Lcom/google/gson/internal/Excluder;->clone()Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 77
a=0;//     .local v4, "result":Lcom/google/gson/internal/Excluder;
a=0;//     #v4=(Reference,Lcom/google/gson/internal/Excluder;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     iput v5, v4, Lcom/google/gson/internal/Excluder;->modifiers:I
a=0;// 
a=0;//     .line 78
a=0;//     move-object v0, p1
a=0;// 
a=0;//     .local v0, "arr$":[I
a=0;//     #v0=(Reference,[I);
a=0;//     array-length v2, v0
a=0;// 
a=0;//     .local v2, "len$":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i$":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v3=(Conflicted);v5=(Integer);
a=0;//     if-ge v1, v2, :cond_0
a=0;// 
a=0;//     aget v3, v0, v1
a=0;// 
a=0;//     .line 79
a=0;//     .local v3, "modifier":I
a=0;//     #v3=(Integer);
a=0;//     iget v5, v4, Lcom/google/gson/internal/Excluder;->modifiers:I
a=0;// 
a=0;//     or-int/2addr v5, v3
a=0;// 
a=0;//     iput v5, v4, Lcom/google/gson/internal/Excluder;->modifiers:I
a=0;// 
a=0;//     .line 78
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 81
a=0;//     .end local v3    # "modifier":I
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     return-object v4
a=0;// .end method
a=0;// 
a=0;// .method public withVersion(D)Lcom/google/gson/internal/Excluder;
a=0;//     .locals 1
a=0;//     .param p1, "ignoreVersionsAfter"    # D
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     invoke-virtual {p0}, Lcom/google/gson/internal/Excluder;->clone()Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 71
a=0;//     .local v0, "result":Lcom/google/gson/internal/Excluder;
a=0;//     #v0=(Reference,Lcom/google/gson/internal/Excluder;);
a=0;//     iput-wide p1, v0, Lcom/google/gson/internal/Excluder;->version:D
a=0;// 
a=0;//     .line 72
a=0;//     return-object v0
a=0;// .end method
}}
