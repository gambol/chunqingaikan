package com.google.gson; class GsonBuilder { void a() { int a;
a=0;// .class public final Lcom/google/gson/GsonBuilder;
a=0;// .super Ljava/lang/Object;
a=0;// .source "GsonBuilder.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private complexMapKeySerialization:Z
a=0;// 
a=0;// .field private datePattern:Ljava/lang/String;
a=0;// 
a=0;// .field private dateStyle:I
a=0;// 
a=0;// .field private escapeHtmlChars:Z
a=0;// 
a=0;// .field private excluder:Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;// .field private final factories:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/google/gson/TypeAdapterFactory;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private fieldNamingPolicy:Lcom/google/gson/FieldNamingStrategy;
a=0;// 
a=0;// .field private generateNonExecutableJson:Z
a=0;// 
a=0;// .field private final hierarchyFactories:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/google/gson/TypeAdapterFactory;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final instanceCreators:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/reflect/Type;",
a=0;//             "Lcom/google/gson/InstanceCreator",
a=0;//             "<*>;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private longSerializationPolicy:Lcom/google/gson/LongSerializationPolicy;
a=0;// 
a=0;// .field private prettyPrinting:Z
a=0;// 
a=0;// .field private serializeNulls:Z
a=0;// 
a=0;// .field private serializeSpecialFloatingPointValues:Z
a=0;// 
a=0;// .field private timeStyle:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     .line 93
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 69
a=0;//     #p0=(Reference,Lcom/google/gson/GsonBuilder;);
a=0;//     sget-object v0, Lcom/google/gson/internal/Excluder;->DEFAULT:Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/Excluder;);
a=0;//     iput-object v0, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     .line 70
a=0;//     sget-object v0, Lcom/google/gson/LongSerializationPolicy;->DEFAULT:Lcom/google/gson/LongSerializationPolicy;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/google/gson/GsonBuilder;->longSerializationPolicy:Lcom/google/gson/LongSerializationPolicy;
a=0;// 
a=0;//     .line 71
a=0;//     sget-object v0, Lcom/google/gson/FieldNamingPolicy;->IDENTITY:Lcom/google/gson/FieldNamingPolicy;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/google/gson/GsonBuilder;->fieldNamingPolicy:Lcom/google/gson/FieldNamingStrategy;
a=0;// 
a=0;//     .line 72
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/google/gson/GsonBuilder;->instanceCreators:Ljava/util/Map;
a=0;// 
a=0;//     .line 74
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/google/gson/GsonBuilder;->factories:Ljava/util/List;
a=0;// 
a=0;//     .line 76
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/google/gson/GsonBuilder;->hierarchyFactories:Ljava/util/List;
a=0;// 
a=0;//     .line 79
a=0;//     iput v1, p0, Lcom/google/gson/GsonBuilder;->dateStyle:I
a=0;// 
a=0;//     .line 80
a=0;//     iput v1, p0, Lcom/google/gson/GsonBuilder;->timeStyle:I
a=0;// 
a=0;//     .line 83
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/google/gson/GsonBuilder;->escapeHtmlChars:Z
a=0;// 
a=0;//     .line 94
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private addTypeAdaptersForDate(Ljava/lang/String;IILjava/util/List;)V
a=0;//     .locals 4
a=0;//     .param p1, "datePattern"    # Ljava/lang/String;
a=0;//     .param p2, "dateStyle"    # I
a=0;//     .param p3, "timeStyle"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "II",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/google/gson/TypeAdapterFactory;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p4, "factories":Ljava/util/List;, "Ljava/util/List<Lcom/google/gson/TypeAdapterFactory;>;"
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     .line 554
a=0;//     #v3=(PosByte);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 555
a=0;//     new-instance v0, Lcom/google/gson/DefaultDateTypeAdapter;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/DefaultDateTypeAdapter;);
a=0;//     invoke-direct {v0, p1}, Lcom/google/gson/DefaultDateTypeAdapter;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 562
a=0;//     .local v0, "dateTypeAdapter":Lcom/google/gson/DefaultDateTypeAdapter;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/google/gson/DefaultDateTypeAdapter;);v1=(Conflicted);v2=(Conflicted);
a=0;//     const-class v1, Ljava/util/Date;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/Class;)Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/google/gson/TreeTypeAdapter;->newFactory(Lcom/google/gson/reflect/TypeToken;Ljava/lang/Object;)Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {p4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 563
a=0;//     const-class v1, Ljava/sql/Timestamp;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/Class;)Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/google/gson/TreeTypeAdapter;->newFactory(Lcom/google/gson/reflect/TypeToken;Ljava/lang/Object;)Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {p4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 564
a=0;//     const-class v1, Ljava/sql/Date;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/Class;)Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/google/gson/TreeTypeAdapter;->newFactory(Lcom/google/gson/reflect/TypeToken;Ljava/lang/Object;)Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {p4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 565
a=0;//     .end local v0    # "dateTypeAdapter":Lcom/google/gson/DefaultDateTypeAdapter;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 556
a=0;//     :cond_1
a=0;//     #v0=(Uninit);
a=0;//     if-eq p2, v3, :cond_0
a=0;// 
a=0;//     if-eq p3, v3, :cond_0
a=0;// 
a=0;//     .line 557
a=0;//     new-instance v0, Lcom/google/gson/DefaultDateTypeAdapter;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/DefaultDateTypeAdapter;);
a=0;//     invoke-direct {v0, p2, p3}, Lcom/google/gson/DefaultDateTypeAdapter;-><init>(II)V
a=0;// 
a=0;//     .restart local v0    # "dateTypeAdapter":Lcom/google/gson/DefaultDateTypeAdapter;
a=0;//     #v0=(Reference,Lcom/google/gson/DefaultDateTypeAdapter;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addDeserializationExclusionStrategy(Lcom/google/gson/ExclusionStrategy;)Lcom/google/gson/GsonBuilder;
a=0;//     .locals 3
a=0;//     .param p1, "strategy"    # Lcom/google/gson/ExclusionStrategy;
a=0;// 
a=0;//     .prologue
a=0;//     .line 339
a=0;//     iget-object v0, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/Excluder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, p1, v1, v2}, Lcom/google/gson/internal/Excluder;->withExclusionStrategy(Lcom/google/gson/ExclusionStrategy;ZZ)Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     .line 340
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public addSerializationExclusionStrategy(Lcom/google/gson/ExclusionStrategy;)Lcom/google/gson/GsonBuilder;
a=0;//     .locals 3
a=0;//     .param p1, "strategy"    # Lcom/google/gson/ExclusionStrategy;
a=0;// 
a=0;//     .prologue
a=0;//     .line 322
a=0;//     iget-object v0, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/Excluder;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, p1, v1, v2}, Lcom/google/gson/internal/Excluder;->withExclusionStrategy(Lcom/google/gson/ExclusionStrategy;ZZ)Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     .line 323
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public create()Lcom/google/gson/Gson;
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     .line 539
a=0;//     new-instance v11, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 540
a=0;//     .local v11, "factories":Ljava/util/List;, "Ljava/util/List<Lcom/google/gson/TypeAdapterFactory;>;"
a=0;//     #v11=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v0, p0, Lcom/google/gson/GsonBuilder;->factories:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v11, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 541
a=0;//     invoke-static {v11}, Ljava/util/Collections;->reverse(Ljava/util/List;)V
a=0;// 
a=0;//     .line 542
a=0;//     iget-object v0, p0, Lcom/google/gson/GsonBuilder;->hierarchyFactories:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v11, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 543
a=0;//     iget-object v0, p0, Lcom/google/gson/GsonBuilder;->datePattern:Ljava/lang/String;
a=0;// 
a=0;//     iget v1, p0, Lcom/google/gson/GsonBuilder;->dateStyle:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/google/gson/GsonBuilder;->timeStyle:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {p0, v0, v1, v2, v11}, Lcom/google/gson/GsonBuilder;->addTypeAdaptersForDate(Ljava/lang/String;IILjava/util/List;)V
a=0;// 
a=0;//     .line 545
a=0;//     new-instance v0, Lcom/google/gson/Gson;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/Gson;);
a=0;//     iget-object v1, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/internal/Excluder;);
a=0;//     iget-object v2, p0, Lcom/google/gson/GsonBuilder;->fieldNamingPolicy:Lcom/google/gson/FieldNamingStrategy;
a=0;// 
a=0;//     #v2=(Reference,Lcom/google/gson/FieldNamingStrategy;);
a=0;//     iget-object v3, p0, Lcom/google/gson/GsonBuilder;->instanceCreators:Ljava/util/Map;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Map;);
a=0;//     iget-boolean v4, p0, Lcom/google/gson/GsonBuilder;->serializeNulls:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     iget-boolean v5, p0, Lcom/google/gson/GsonBuilder;->complexMapKeySerialization:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     iget-boolean v6, p0, Lcom/google/gson/GsonBuilder;->generateNonExecutableJson:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     iget-boolean v7, p0, Lcom/google/gson/GsonBuilder;->escapeHtmlChars:Z
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     iget-boolean v8, p0, Lcom/google/gson/GsonBuilder;->prettyPrinting:Z
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     iget-boolean v9, p0, Lcom/google/gson/GsonBuilder;->serializeSpecialFloatingPointValues:Z
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     iget-object v10, p0, Lcom/google/gson/GsonBuilder;->longSerializationPolicy:Lcom/google/gson/LongSerializationPolicy;
a=0;// 
a=0;//     #v10=(Reference,Lcom/google/gson/LongSerializationPolicy;);
a=0;//     invoke-direct/range {v0 .. v11}, Lcom/google/gson/Gson;-><init>(Lcom/google/gson/internal/Excluder;Lcom/google/gson/FieldNamingStrategy;Ljava/util/Map;ZZZZZZLcom/google/gson/LongSerializationPolicy;Ljava/util/List;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/Gson;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public disableHtmlEscaping()Lcom/google/gson/GsonBuilder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 362
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/google/gson/GsonBuilder;->escapeHtmlChars:Z
a=0;// 
a=0;//     .line 363
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public disableInnerClassSerialization()Lcom/google/gson/GsonBuilder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 249
a=0;//     iget-object v0, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/Excluder;);
a=0;//     invoke-virtual {v0}, Lcom/google/gson/internal/Excluder;->disableInnerClassSerialization()Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     .line 250
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public enableComplexMapKeySerialization()Lcom/google/gson/GsonBuilder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 238
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/google/gson/GsonBuilder;->complexMapKeySerialization:Z
a=0;// 
a=0;//     .line 239
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public varargs excludeFieldsWithModifiers([I)Lcom/google/gson/GsonBuilder;
a=0;//     .locals 1
a=0;//     .param p1, "modifiers"    # [I
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     iget-object v0, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/Excluder;);
a=0;//     invoke-virtual {v0, p1}, Lcom/google/gson/internal/Excluder;->withModifiers([I)Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     .line 121
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public excludeFieldsWithoutExposeAnnotation()Lcom/google/gson/GsonBuilder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 145
a=0;//     iget-object v0, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/Excluder;);
a=0;//     invoke-virtual {v0}, Lcom/google/gson/internal/Excluder;->excludeFieldsWithoutExposeAnnotation()Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     .line 146
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public generateNonExecutableJson()Lcom/google/gson/GsonBuilder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 134
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/google/gson/GsonBuilder;->generateNonExecutableJson:Z
a=0;// 
a=0;//     .line 135
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;
a=0;//     .locals 3
a=0;//     .param p1, "type"    # Ljava/lang/reflect/Type;
a=0;//     .param p2, "typeAdapter"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 448
a=0;//     instance-of v1, p2, Lcom/google/gson/JsonSerializer;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     instance-of v1, p2, Lcom/google/gson/JsonDeserializer;
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     instance-of v1, p2, Lcom/google/gson/InstanceCreator;
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     instance-of v1, p2, Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-static {v1}, Lcom/google/gson/internal/$Gson$Preconditions;->checkArgument(Z)V
a=0;// 
a=0;//     .line 452
a=0;//     instance-of v1, p2, Lcom/google/gson/InstanceCreator;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 453
a=0;//     iget-object v2, p0, Lcom/google/gson/GsonBuilder;->instanceCreators:Ljava/util/Map;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Map;);
a=0;//     move-object v1, p2
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/google/gson/InstanceCreator;
a=0;// 
a=0;//     invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 455
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     instance-of v1, p2, Lcom/google/gson/JsonSerializer;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     instance-of v1, p2, Lcom/google/gson/JsonDeserializer;
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 456
a=0;//     :cond_2
a=0;//     invoke-static {p1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 457
a=0;//     .local v0, "typeToken":Lcom/google/gson/reflect/TypeToken;, "Lcom/google/gson/reflect/TypeToken<*>;"
a=0;//     #v0=(Reference,Lcom/google/gson/reflect/TypeToken;);
a=0;//     iget-object v1, p0, Lcom/google/gson/GsonBuilder;->factories:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-static {v0, p2}, Lcom/google/gson/TreeTypeAdapter;->newFactoryWithMatchRawType(Lcom/google/gson/reflect/TypeToken;Ljava/lang/Object;)Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/google/gson/TypeAdapterFactory;);
a=0;//     invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 459
a=0;//     .end local v0    # "typeToken":Lcom/google/gson/reflect/TypeToken;, "Lcom/google/gson/reflect/TypeToken<*>;"
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     instance-of v1, p2, Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 460
a=0;//     iget-object v1, p0, Lcom/google/gson/GsonBuilder;->factories:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-static {p1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/google/gson/reflect/TypeToken;);
a=0;//     check-cast p2, Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     .end local p2    # "typeAdapter":Ljava/lang/Object;
a=0;//     invoke-static {v2, p2}, Lcom/google/gson/internal/bind/TypeAdapters;->newFactory(Lcom/google/gson/reflect/TypeToken;Lcom/google/gson/TypeAdapter;)Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 462
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 448
a=0;//     .restart local p2    # "typeAdapter":Ljava/lang/Object;
a=0;//     :cond_5
a=0;//     #v0=(Uninit);v1=(Boolean);v2=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public registerTypeAdapterFactory(Lcom/google/gson/TypeAdapterFactory;)Lcom/google/gson/GsonBuilder;
a=0;//     .locals 1
a=0;//     .param p1, "factory"    # Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     .prologue
a=0;//     .line 474
a=0;//     iget-object v0, p0, Lcom/google/gson/GsonBuilder;->factories:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 475
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public registerTypeHierarchyAdapter(Ljava/lang/Class;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;
a=0;//     .locals 3
a=0;//     .param p2, "typeAdapter"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")",
a=0;//             "Lcom/google/gson/GsonBuilder;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p1, "baseType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 494
a=0;//     #v1=(Null);
a=0;//     instance-of v0, p2, Lcom/google/gson/JsonSerializer;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     instance-of v0, p2, Lcom/google/gson/JsonDeserializer;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     instance-of v0, p2, Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-static {v0}, Lcom/google/gson/internal/$Gson$Preconditions;->checkArgument(Z)V
a=0;// 
a=0;//     .line 497
a=0;//     instance-of v0, p2, Lcom/google/gson/JsonDeserializer;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     instance-of v0, p2, Lcom/google/gson/JsonSerializer;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 498
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lcom/google/gson/GsonBuilder;->hierarchyFactories:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-static {p1, p2}, Lcom/google/gson/TreeTypeAdapter;->newTypeHierarchyFactory(Ljava/lang/Class;Ljava/lang/Object;)Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/google/gson/TypeAdapterFactory;);
a=0;//     invoke-interface {v0, v1, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 501
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     instance-of v0, p2, Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 502
a=0;//     iget-object v0, p0, Lcom/google/gson/GsonBuilder;->factories:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     check-cast p2, Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     .end local p2    # "typeAdapter":Ljava/lang/Object;
a=0;//     invoke-static {p1, p2}, Lcom/google/gson/internal/bind/TypeAdapters;->newTypeHierarchyFactory(Ljava/lang/Class;Lcom/google/gson/TypeAdapter;)Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/TypeAdapterFactory;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 504
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .restart local p2    # "typeAdapter":Ljava/lang/Object;
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(Null);v2=(Uninit);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 494
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public serializeNulls()Lcom/google/gson/GsonBuilder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 157
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/google/gson/GsonBuilder;->serializeNulls:Z
a=0;// 
a=0;//     .line 158
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public serializeSpecialFloatingPointValues()Lcom/google/gson/GsonBuilder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 528
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/google/gson/GsonBuilder;->serializeSpecialFloatingPointValues:Z
a=0;// 
a=0;//     .line 529
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setDateFormat(I)Lcom/google/gson/GsonBuilder;
a=0;//     .locals 1
a=0;//     .param p1, "style"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 403
a=0;//     iput p1, p0, Lcom/google/gson/GsonBuilder;->dateStyle:I
a=0;// 
a=0;//     .line 404
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/google/gson/GsonBuilder;->datePattern:Ljava/lang/String;
a=0;// 
a=0;//     .line 405
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setDateFormat(II)Lcom/google/gson/GsonBuilder;
a=0;//     .locals 1
a=0;//     .param p1, "dateStyle"    # I
a=0;//     .param p2, "timeStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 424
a=0;//     iput p1, p0, Lcom/google/gson/GsonBuilder;->dateStyle:I
a=0;// 
a=0;//     .line 425
a=0;//     iput p2, p0, Lcom/google/gson/GsonBuilder;->timeStyle:I
a=0;// 
a=0;//     .line 426
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/google/gson/GsonBuilder;->datePattern:Ljava/lang/String;
a=0;// 
a=0;//     .line 427
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setDateFormat(Ljava/lang/String;)Lcom/google/gson/GsonBuilder;
a=0;//     .locals 0
a=0;//     .param p1, "pattern"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 384
a=0;//     iput-object p1, p0, Lcom/google/gson/GsonBuilder;->datePattern:Ljava/lang/String;
a=0;// 
a=0;//     .line 385
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public varargs setExclusionStrategies([Lcom/google/gson/ExclusionStrategy;)Lcom/google/gson/GsonBuilder;
a=0;//     .locals 6
a=0;//     .param p1, "strategies"    # [Lcom/google/gson/ExclusionStrategy;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 303
a=0;//     #v5=(One);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     .local v0, "arr$":[Lcom/google/gson/ExclusionStrategy;
a=0;//     #v0=(Reference,[Lcom/google/gson/ExclusionStrategy;);
a=0;//     array-length v2, v0
a=0;// 
a=0;//     .local v2, "len$":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i$":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-ge v1, v2, :cond_0
a=0;// 
a=0;//     aget-object v3, v0, v1
a=0;// 
a=0;//     .line 304
a=0;//     .local v3, "strategy":Lcom/google/gson/ExclusionStrategy;
a=0;//     #v3=(Null);
a=0;//     iget-object v4, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     #v4=(Reference,Lcom/google/gson/internal/Excluder;);
a=0;//     invoke-virtual {v4, v3, v5, v5}, Lcom/google/gson/internal/Excluder;->withExclusionStrategy(Lcom/google/gson/ExclusionStrategy;ZZ)Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     .line 303
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 306
a=0;//     .end local v3    # "strategy":Lcom/google/gson/ExclusionStrategy;
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setFieldNamingPolicy(Lcom/google/gson/FieldNamingPolicy;)Lcom/google/gson/GsonBuilder;
a=0;//     .locals 0
a=0;//     .param p1, "namingConvention"    # Lcom/google/gson/FieldNamingPolicy;
a=0;// 
a=0;//     .prologue
a=0;//     .line 275
a=0;//     iput-object p1, p0, Lcom/google/gson/GsonBuilder;->fieldNamingPolicy:Lcom/google/gson/FieldNamingStrategy;
a=0;// 
a=0;//     .line 276
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setFieldNamingStrategy(Lcom/google/gson/FieldNamingStrategy;)Lcom/google/gson/GsonBuilder;
a=0;//     .locals 0
a=0;//     .param p1, "fieldNamingStrategy"    # Lcom/google/gson/FieldNamingStrategy;
a=0;// 
a=0;//     .prologue
a=0;//     .line 288
a=0;//     iput-object p1, p0, Lcom/google/gson/GsonBuilder;->fieldNamingPolicy:Lcom/google/gson/FieldNamingStrategy;
a=0;// 
a=0;//     .line 289
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setLongSerializationPolicy(Lcom/google/gson/LongSerializationPolicy;)Lcom/google/gson/GsonBuilder;
a=0;//     .locals 0
a=0;//     .param p1, "serializationPolicy"    # Lcom/google/gson/LongSerializationPolicy;
a=0;// 
a=0;//     .prologue
a=0;//     .line 262
a=0;//     iput-object p1, p0, Lcom/google/gson/GsonBuilder;->longSerializationPolicy:Lcom/google/gson/LongSerializationPolicy;
a=0;// 
a=0;//     .line 263
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setPrettyPrinting()Lcom/google/gson/GsonBuilder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 350
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/google/gson/GsonBuilder;->prettyPrinting:Z
a=0;// 
a=0;//     .line 351
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setVersion(D)Lcom/google/gson/GsonBuilder;
a=0;//     .locals 1
a=0;//     .param p1, "ignoreVersionsAfter"    # D
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     iget-object v0, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/Excluder;);
a=0;//     invoke-virtual {v0, p1, p2}, Lcom/google/gson/internal/Excluder;->withVersion(D)Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     .line 105
a=0;//     return-object p0
a=0;// .end method
}}
