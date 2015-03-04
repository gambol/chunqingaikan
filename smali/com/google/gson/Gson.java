package com.google.gson; class Gson { void a() { int a;
a=0;// .class public final Lcom/google/gson/Gson;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Gson.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/google/gson/Gson$FutureTypeAdapter;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final DEFAULT_JSON_NON_EXECUTABLE:Z = false
a=0;// 
a=0;// .field private static final JSON_NON_EXECUTABLE_PREFIX:Ljava/lang/String; = ")]}\'\n"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final calls:Ljava/lang/ThreadLocal;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/lang/ThreadLocal",
a=0;//             "<",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Lcom/google/gson/reflect/TypeToken",
a=0;//             "<*>;",
a=0;//             "Lcom/google/gson/Gson$FutureTypeAdapter",
a=0;//             "<*>;>;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final constructorConstructor:Lcom/google/gson/internal/ConstructorConstructor;
a=0;// 
a=0;// .field final deserializationContext:Lcom/google/gson/JsonDeserializationContext;
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
a=0;// .field private final generateNonExecutableJson:Z
a=0;// 
a=0;// .field private final htmlSafe:Z
a=0;// 
a=0;// .field private final prettyPrinting:Z
a=0;// 
a=0;// .field final serializationContext:Lcom/google/gson/JsonSerializationContext;
a=0;// 
a=0;// .field private final serializeNulls:Z
a=0;// 
a=0;// .field private final typeTokenCache:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Lcom/google/gson/reflect/TypeToken",
a=0;//             "<*>;",
a=0;//             "Lcom/google/gson/TypeAdapter",
a=0;//             "<*>;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 174
a=0;//     #v4=(Null);
a=0;//     sget-object v1, Lcom/google/gson/internal/Excluder;->DEFAULT:Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/internal/Excluder;);
a=0;//     sget-object v2, Lcom/google/gson/FieldNamingPolicy;->IDENTITY:Lcom/google/gson/FieldNamingPolicy;
a=0;// 
a=0;//     #v2=(Reference,Lcom/google/gson/FieldNamingPolicy;);
a=0;//     invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Map;);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     sget-object v10, Lcom/google/gson/LongSerializationPolicy;->DEFAULT:Lcom/google/gson/LongSerializationPolicy;
a=0;// 
a=0;//     #v10=(Reference,Lcom/google/gson/LongSerializationPolicy;);
a=0;//     invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/util/List;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(UninitThis,Lcom/google/gson/Gson;);
a=0;//     move v5, v4
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move v6, v4
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move v8, v4
a=0;// 
a=0;//     #v8=(Null);
a=0;//     move v9, v4
a=0;// 
a=0;//     #v9=(Null);
a=0;//     invoke-direct/range {v0 .. v11}, Lcom/google/gson/Gson;-><init>(Lcom/google/gson/internal/Excluder;Lcom/google/gson/FieldNamingStrategy;Ljava/util/Map;ZZZZZZLcom/google/gson/LongSerializationPolicy;Ljava/util/List;)V
a=0;// 
a=0;//     .line 178
a=0;//     #v0=(Reference,Lcom/google/gson/Gson;);p0=(Reference,Lcom/google/gson/Gson;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Lcom/google/gson/internal/Excluder;Lcom/google/gson/FieldNamingStrategy;Ljava/util/Map;ZZZZZZLcom/google/gson/LongSerializationPolicy;Ljava/util/List;)V
a=0;//     .locals 4
a=0;//     .param p1, "excluder"    # Lcom/google/gson/internal/Excluder;
a=0;//     .param p2, "fieldNamingPolicy"    # Lcom/google/gson/FieldNamingStrategy;
a=0;//     .param p4, "serializeNulls"    # Z
a=0;//     .param p5, "complexMapKeySerialization"    # Z
a=0;//     .param p6, "generateNonExecutableGson"    # Z
a=0;//     .param p7, "htmlSafe"    # Z
a=0;//     .param p8, "prettyPrinting"    # Z
a=0;//     .param p9, "serializeSpecialFloatingPointValues"    # Z
a=0;//     .param p10, "longSerializationPolicy"    # Lcom/google/gson/LongSerializationPolicy;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/google/gson/internal/Excluder;",
a=0;//             "Lcom/google/gson/FieldNamingStrategy;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/reflect/Type;",
a=0;//             "Lcom/google/gson/InstanceCreator",
a=0;//             "<*>;>;ZZZZZZ",
a=0;//             "Lcom/google/gson/LongSerializationPolicy;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/google/gson/TypeAdapterFactory;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 185
a=0;//     .local p3, "instanceCreators":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/reflect/Type;Lcom/google/gson/InstanceCreator<*>;>;"
a=0;//     .local p11, "typeAdapterFactories":Ljava/util/List;, "Ljava/util/List<Lcom/google/gson/TypeAdapterFactory;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 109
a=0;//     #p0=(Reference,Lcom/google/gson/Gson;);
a=0;//     new-instance v1, Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/ThreadLocal;);
a=0;//     invoke-direct {v1}, Ljava/lang/ThreadLocal;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     iput-object v1, p0, Lcom/google/gson/Gson;->calls:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     .line 112
a=0;//     new-instance v1, Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-static {v1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/google/gson/Gson;->typeTokenCache:Ljava/util/Map;
a=0;// 
a=0;//     .line 123
a=0;//     new-instance v1, Lcom/google/gson/Gson$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/google/gson/Gson$1;);
a=0;//     invoke-direct {v1, p0}, Lcom/google/gson/Gson$1;-><init>(Lcom/google/gson/Gson;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/Gson$1;);
a=0;//     iput-object v1, p0, Lcom/google/gson/Gson;->deserializationContext:Lcom/google/gson/JsonDeserializationContext;
a=0;// 
a=0;//     .line 130
a=0;//     new-instance v1, Lcom/google/gson/Gson$2;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/google/gson/Gson$2;);
a=0;//     invoke-direct {v1, p0}, Lcom/google/gson/Gson$2;-><init>(Lcom/google/gson/Gson;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/Gson$2;);
a=0;//     iput-object v1, p0, Lcom/google/gson/Gson;->serializationContext:Lcom/google/gson/JsonSerializationContext;
a=0;// 
a=0;//     .line 186
a=0;//     new-instance v1, Lcom/google/gson/internal/ConstructorConstructor;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/google/gson/internal/ConstructorConstructor;);
a=0;//     invoke-direct {v1, p3}, Lcom/google/gson/internal/ConstructorConstructor;-><init>(Ljava/util/Map;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/internal/ConstructorConstructor;);
a=0;//     iput-object v1, p0, Lcom/google/gson/Gson;->constructorConstructor:Lcom/google/gson/internal/ConstructorConstructor;
a=0;// 
a=0;//     .line 187
a=0;//     iput-boolean p4, p0, Lcom/google/gson/Gson;->serializeNulls:Z
a=0;// 
a=0;//     .line 188
a=0;//     iput-boolean p6, p0, Lcom/google/gson/Gson;->generateNonExecutableJson:Z
a=0;// 
a=0;//     .line 189
a=0;//     iput-boolean p7, p0, Lcom/google/gson/Gson;->htmlSafe:Z
a=0;// 
a=0;//     .line 190
a=0;//     iput-boolean p8, p0, Lcom/google/gson/Gson;->prettyPrinting:Z
a=0;// 
a=0;//     .line 192
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 195
a=0;//     .local v0, "factories":Ljava/util/List;, "Ljava/util/List<Lcom/google/gson/TypeAdapterFactory;>;"
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->JSON_ELEMENT_FACTORY:Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 196
a=0;//     sget-object v1, Lcom/google/gson/internal/bind/ObjectTypeAdapter;->FACTORY:Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 199
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 202
a=0;//     invoke-interface {v0, p11}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 205
a=0;//     sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->STRING_FACTORY:Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 206
a=0;//     sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->INTEGER_FACTORY:Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 207
a=0;//     sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->BOOLEAN_FACTORY:Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 208
a=0;//     sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->BYTE_FACTORY:Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 209
a=0;//     sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->SHORT_FACTORY:Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 210
a=0;//     sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     const-class v2, Ljava/lang/Long;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {p0, p10}, Lcom/google/gson/Gson;->longAdapter(Lcom/google/gson/LongSerializationPolicy;)Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/google/gson/TypeAdapter;);
a=0;//     invoke-static {v1, v2, v3}, Lcom/google/gson/internal/bind/TypeAdapters;->newFactory(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/gson/TypeAdapter;)Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 212
a=0;//     sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     const-class v2, Ljava/lang/Double;
a=0;// 
a=0;//     invoke-direct {p0, p9}, Lcom/google/gson/Gson;->doubleAdapter(Z)Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v1, v2, v3}, Lcom/google/gson/internal/bind/TypeAdapters;->newFactory(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/gson/TypeAdapter;)Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 214
a=0;//     sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     const-class v2, Ljava/lang/Float;
a=0;// 
a=0;//     invoke-direct {p0, p9}, Lcom/google/gson/Gson;->floatAdapter(Z)Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v1, v2, v3}, Lcom/google/gson/internal/bind/TypeAdapters;->newFactory(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/gson/TypeAdapter;)Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 216
a=0;//     sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->NUMBER_FACTORY:Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 217
a=0;//     sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->CHARACTER_FACTORY:Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 218
a=0;//     sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->STRING_BUILDER_FACTORY:Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 219
a=0;//     sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->STRING_BUFFER_FACTORY:Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 220
a=0;//     const-class v1, Ljava/math/BigDecimal;
a=0;// 
a=0;//     sget-object v2, Lcom/google/gson/internal/bind/TypeAdapters;->BIG_DECIMAL:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/google/gson/internal/bind/TypeAdapters;->newFactory(Ljava/lang/Class;Lcom/google/gson/TypeAdapter;)Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 221
a=0;//     const-class v1, Ljava/math/BigInteger;
a=0;// 
a=0;//     sget-object v2, Lcom/google/gson/internal/bind/TypeAdapters;->BIG_INTEGER:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/google/gson/internal/bind/TypeAdapters;->newFactory(Ljava/lang/Class;Lcom/google/gson/TypeAdapter;)Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 222
a=0;//     sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->URL_FACTORY:Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 223
a=0;//     sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->URI_FACTORY:Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 224
a=0;//     sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->UUID_FACTORY:Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 225
a=0;//     sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->LOCALE_FACTORY:Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 226
a=0;//     sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->INET_ADDRESS_FACTORY:Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 227
a=0;//     sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->BIT_SET_FACTORY:Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 228
a=0;//     sget-object v1, Lcom/google/gson/internal/bind/DateTypeAdapter;->FACTORY:Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 229
a=0;//     sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->CALENDAR_FACTORY:Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 230
a=0;//     sget-object v1, Lcom/google/gson/internal/bind/TimeTypeAdapter;->FACTORY:Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 231
a=0;//     sget-object v1, Lcom/google/gson/internal/bind/SqlDateTypeAdapter;->FACTORY:Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 232
a=0;//     sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->TIMESTAMP_FACTORY:Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 233
a=0;//     sget-object v1, Lcom/google/gson/internal/bind/ArrayTypeAdapter;->FACTORY:Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 234
a=0;//     sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->ENUM_FACTORY:Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 235
a=0;//     sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->CLASS_FACTORY:Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 238
a=0;//     new-instance v1, Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory;);
a=0;//     iget-object v2, p0, Lcom/google/gson/Gson;->constructorConstructor:Lcom/google/gson/internal/ConstructorConstructor;
a=0;// 
a=0;//     invoke-direct {v1, v2}, Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory;-><init>(Lcom/google/gson/internal/ConstructorConstructor;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 239
a=0;//     new-instance v1, Lcom/google/gson/internal/bind/MapTypeAdapterFactory;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/google/gson/internal/bind/MapTypeAdapterFactory;);
a=0;//     iget-object v2, p0, Lcom/google/gson/Gson;->constructorConstructor:Lcom/google/gson/internal/ConstructorConstructor;
a=0;// 
a=0;//     invoke-direct {v1, v2, p5}, Lcom/google/gson/internal/bind/MapTypeAdapterFactory;-><init>(Lcom/google/gson/internal/ConstructorConstructor;Z)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/internal/bind/MapTypeAdapterFactory;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 240
a=0;//     new-instance v1, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;);
a=0;//     iget-object v2, p0, Lcom/google/gson/Gson;->constructorConstructor:Lcom/google/gson/internal/ConstructorConstructor;
a=0;// 
a=0;//     invoke-direct {v1, v2, p2, p1}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;-><init>(Lcom/google/gson/internal/ConstructorConstructor;Lcom/google/gson/FieldNamingStrategy;Lcom/google/gson/internal/Excluder;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 243
a=0;//     invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/google/gson/Gson;->factories:Ljava/util/List;
a=0;// 
a=0;//     .line 244
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Lcom/google/gson/Gson;D)V
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Lcom/google/gson/Gson;
a=0;//     .param p1, "x1"    # D
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     invoke-direct {p0, p1, p2}, Lcom/google/gson/Gson;->checkValidFloatingPoint(D)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static assertFullConsumption(Ljava/lang/Object;Lcom/google/gson/stream/JsonReader;)V
a=0;//     .locals 3
a=0;//     .param p0, "obj"    # Ljava/lang/Object;
a=0;//     .param p1, "reader"    # Lcom/google/gson/stream/JsonReader;
a=0;// 
a=0;//     .prologue
a=0;//     .line 775
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     sget-object v2, Lcom/google/gson/stream/JsonToken;->END_DOCUMENT:Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     #v2=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     if-eq v1, v2, :cond_0
a=0;// 
a=0;//     .line 776
a=0;//     new-instance v1, Lcom/google/gson/JsonIOException;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/google/gson/JsonIOException;);
a=0;//     const-string v2, "JSON document was not fully consumed."
a=0;// 
a=0;//     invoke-direct {v1, v2}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/JsonIOException;);
a=0;//     throw v1
a=0;//     :try_end_0
a=0;//     .catch Lcom/google/gson/stream/MalformedJsonException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 778
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 779
a=0;//     .local v0, "e":Lcom/google/gson/stream/MalformedJsonException;
a=0;//     #v0=(Reference,Lcom/google/gson/stream/MalformedJsonException;);
a=0;//     new-instance v1, Lcom/google/gson/JsonSyntaxException;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/google/gson/JsonSyntaxException;);
a=0;//     invoke-direct {v1, v0}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/JsonSyntaxException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 780
a=0;//     .end local v0    # "e":Lcom/google/gson/stream/MalformedJsonException;
a=0;//     :catch_1
a=0;//     #v0=(Uninit);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 781
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     new-instance v1, Lcom/google/gson/JsonIOException;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/google/gson/JsonIOException;);
a=0;//     invoke-direct {v1, v0}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/JsonIOException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 783
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private checkValidFloatingPoint(D)V
a=0;//     .locals 3
a=0;//     .param p1, "value"    # D
a=0;// 
a=0;//     .prologue
a=0;//     .line 295
a=0;//     invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {p1, p2}, Ljava/lang/Double;->isInfinite(D)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 296
a=0;//     :cond_0
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " is not a valid double value as per JSON specification. To override this"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method."
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 300
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private doubleAdapter(Z)Lcom/google/gson/TypeAdapter;
a=0;//     .locals 1
a=0;//     .param p1, "serializeSpecialFloatingPointValues"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(Z)",
a=0;//             "Lcom/google/gson/TypeAdapter",
a=0;//             "<",
a=0;//             "Ljava/lang/Number;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 247
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 248
a=0;//     sget-object v0, Lcom/google/gson/internal/bind/TypeAdapters;->DOUBLE:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     .line 250
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     new-instance v0, Lcom/google/gson/Gson$3;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/Gson$3;);
a=0;//     invoke-direct {v0, p0}, Lcom/google/gson/Gson$3;-><init>(Lcom/google/gson/Gson;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/Gson$3;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private floatAdapter(Z)Lcom/google/gson/TypeAdapter;
a=0;//     .locals 1
a=0;//     .param p1, "serializeSpecialFloatingPointValues"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(Z)",
a=0;//             "Lcom/google/gson/TypeAdapter",
a=0;//             "<",
a=0;//             "Ljava/lang/Number;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 271
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 272
a=0;//     sget-object v0, Lcom/google/gson/internal/bind/TypeAdapters;->FLOAT:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     .line 274
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     new-instance v0, Lcom/google/gson/Gson$4;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/Gson$4;);
a=0;//     invoke-direct {v0, p0}, Lcom/google/gson/Gson$4;-><init>(Lcom/google/gson/Gson;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/Gson$4;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private longAdapter(Lcom/google/gson/LongSerializationPolicy;)Lcom/google/gson/TypeAdapter;
a=0;//     .locals 1
a=0;//     .param p1, "longSerializationPolicy"    # Lcom/google/gson/LongSerializationPolicy;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/google/gson/LongSerializationPolicy;",
a=0;//             ")",
a=0;//             "Lcom/google/gson/TypeAdapter",
a=0;//             "<",
a=0;//             "Ljava/lang/Number;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 303
a=0;//     sget-object v0, Lcom/google/gson/LongSerializationPolicy;->DEFAULT:Lcom/google/gson/LongSerializationPolicy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/LongSerializationPolicy;);
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     .line 304
a=0;//     sget-object v0, Lcom/google/gson/internal/bind/TypeAdapters;->LONG:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     .line 306
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     new-instance v0, Lcom/google/gson/Gson$5;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/Gson$5;);
a=0;//     invoke-direct {v0, p0}, Lcom/google/gson/Gson$5;-><init>(Lcom/google/gson/Gson;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/Gson$5;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private newJsonWriter(Ljava/io/Writer;)Lcom/google/gson/stream/JsonWriter;
a=0;//     .locals 2
a=0;//     .param p1, "writer"    # Ljava/io/Writer;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 638
a=0;//     iget-boolean v1, p0, Lcom/google/gson/Gson;->generateNonExecutableJson:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 639
a=0;//     const-string v1, ")]}\'\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 641
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v0, Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/stream/JsonWriter;);
a=0;//     invoke-direct {v0, p1}, Lcom/google/gson/stream/JsonWriter;-><init>(Ljava/io/Writer;)V
a=0;// 
a=0;//     .line 642
a=0;//     .local v0, "jsonWriter":Lcom/google/gson/stream/JsonWriter;
a=0;//     #v0=(Reference,Lcom/google/gson/stream/JsonWriter;);
a=0;//     iget-boolean v1, p0, Lcom/google/gson/Gson;->prettyPrinting:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 643
a=0;//     const-string v1, "  "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/google/gson/stream/JsonWriter;->setIndent(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 645
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-boolean v1, p0, Lcom/google/gson/Gson;->serializeNulls:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v0, v1}, Lcom/google/gson/stream/JsonWriter;->setSerializeNulls(Z)V
a=0;// 
a=0;//     .line 646
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .param p1, "json"    # Lcom/google/gson/JsonElement;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/google/gson/JsonElement;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;)TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/google/gson/JsonSyntaxException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 841
a=0;//     .local p2, "classOfT":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 842
a=0;//     .local v0, "object":Ljava/lang/Object;
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     invoke-static {p2}, Lcom/google/gson/internal/Primitives;->wrap(Ljava/lang/Class;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public fromJson(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "json"    # Lcom/google/gson/JsonElement;
a=0;//     .param p2, "typeOfT"    # Ljava/lang/reflect/Type;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/google/gson/JsonElement;",
a=0;//             "Ljava/lang/reflect/Type;",
a=0;//             ")TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/google/gson/JsonSyntaxException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 865
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 866
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 868
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     new-instance v0, Lcom/google/gson/internal/bind/JsonTreeReader;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/bind/JsonTreeReader;);
a=0;//     invoke-direct {v0, p1}, Lcom/google/gson/internal/bind/JsonTreeReader;-><init>(Lcom/google/gson/JsonElement;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/bind/JsonTreeReader;);
a=0;//     invoke-virtual {p0, v0, p2}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/stream/JsonReader;Ljava/lang/reflect/Type;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public fromJson(Lcom/google/gson/stream/JsonReader;Ljava/lang/reflect/Type;)Ljava/lang/Object;
a=0;//     .locals 7
a=0;//     .param p1, "reader"    # Lcom/google/gson/stream/JsonReader;
a=0;//     .param p2, "typeOfT"    # Ljava/lang/reflect/Type;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/google/gson/stream/JsonReader;",
a=0;//             "Ljava/lang/reflect/Type;",
a=0;//             ")TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/google/gson/JsonIOException;,
a=0;//             Lcom/google/gson/JsonSyntaxException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 795
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 796
a=0;//     .local v1, "isEmpty":Z
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->isLenient()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 797
a=0;//     .local v3, "oldLenient":Z
a=0;//     #v3=(Boolean);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-virtual {p1, v6}, Lcom/google/gson/stream/JsonReader;->setLenient(Z)V
a=0;// 
a=0;//     .line 799
a=0;//     :try_start_0
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     .line 800
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 801
a=0;//     #v1=(Null);
a=0;//     invoke-static {p2}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 802
a=0;//     .local v5, "typeToken":Lcom/google/gson/reflect/TypeToken;, "Lcom/google/gson/reflect/TypeToken<TT;>;"
a=0;//     #v5=(Reference,Lcom/google/gson/reflect/TypeToken;);
a=0;//     invoke-virtual {p0, v5}, Lcom/google/gson/Gson;->getAdapter(Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 803
a=0;//     .local v4, "typeAdapter":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<TT;>;"
a=0;//     #v4=(Reference,Lcom/google/gson/TypeAdapter;);
a=0;//     invoke-virtual {v4, p1}, Lcom/google/gson/TypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 820
a=0;//     .local v2, "object":Ljava/lang/Object;, "TT;"
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {p1, v3}, Lcom/google/gson/stream/JsonReader;->setLenient(Z)V
a=0;// 
a=0;//     .end local v2    # "object":Ljava/lang/Object;, "TT;"
a=0;//     .end local v4    # "typeAdapter":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<TT;>;"
a=0;//     .end local v5    # "typeToken":Lcom/google/gson/reflect/TypeToken;, "Lcom/google/gson/reflect/TypeToken<TT;>;"
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 805
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 810
a=0;//     .local v0, "e":Ljava/io/EOFException;
a=0;//     #v0=(Reference,Ljava/io/EOFException;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 811
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 820
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p1, v3}, Lcom/google/gson/stream/JsonReader;->setLenient(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 813
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v2=(Uninit);
a=0;//     new-instance v6, Lcom/google/gson/JsonSyntaxException;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/google/gson/JsonSyntaxException;);
a=0;//     invoke-direct {v6, v0}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v6=(Reference,Lcom/google/gson/JsonSyntaxException;);
a=0;//     throw v6
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 820
a=0;//     .end local v0    # "e":Ljava/io/EOFException;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {p1, v3}, Lcom/google/gson/stream/JsonReader;->setLenient(Z)V
a=0;// 
a=0;//     throw v6
a=0;// 
a=0;//     .line 814
a=0;//     :catch_1
a=0;//     #v0=(Uninit);v6=(One);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 815
a=0;//     .local v0, "e":Ljava/lang/IllegalStateException;
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v6, Lcom/google/gson/JsonSyntaxException;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/google/gson/JsonSyntaxException;);
a=0;//     invoke-direct {v6, v0}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v6=(Reference,Lcom/google/gson/JsonSyntaxException;);
a=0;//     throw v6
a=0;// 
a=0;//     .line 816
a=0;//     .end local v0    # "e":Ljava/lang/IllegalStateException;
a=0;//     :catch_2
a=0;//     #v0=(Uninit);v6=(One);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 818
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     new-instance v6, Lcom/google/gson/JsonSyntaxException;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/google/gson/JsonSyntaxException;);
a=0;//     invoke-direct {v6, v0}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v6=(Reference,Lcom/google/gson/JsonSyntaxException;);
a=0;//     throw v6
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// .end method
a=0;// 
a=0;// .method public fromJson(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;
a=0;//     .locals 3
a=0;//     .param p1, "json"    # Ljava/io/Reader;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/io/Reader;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;)TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/google/gson/JsonSyntaxException;,
a=0;//             Lcom/google/gson/JsonIOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 740
a=0;//     .local p2, "classOfT":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     new-instance v0, Lcom/google/gson/stream/JsonReader;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/stream/JsonReader;);
a=0;//     invoke-direct {v0, p1}, Lcom/google/gson/stream/JsonReader;-><init>(Ljava/io/Reader;)V
a=0;// 
a=0;//     .line 741
a=0;//     .local v0, "jsonReader":Lcom/google/gson/stream/JsonReader;
a=0;//     #v0=(Reference,Lcom/google/gson/stream/JsonReader;);
a=0;//     invoke-virtual {p0, v0, p2}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/stream/JsonReader;Ljava/lang/reflect/Type;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 742
a=0;//     .local v1, "object":Ljava/lang/Object;
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-static {v1, v0}, Lcom/google/gson/Gson;->assertFullConsumption(Ljava/lang/Object;Lcom/google/gson/stream/JsonReader;)V
a=0;// 
a=0;//     .line 743
a=0;//     invoke-static {p2}, Lcom/google/gson/internal/Primitives;->wrap(Ljava/lang/Class;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method public fromJson(Ljava/io/Reader;Ljava/lang/reflect/Type;)Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .param p1, "json"    # Ljava/io/Reader;
a=0;//     .param p2, "typeOfT"    # Ljava/lang/reflect/Type;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/io/Reader;",
a=0;//             "Ljava/lang/reflect/Type;",
a=0;//             ")TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/google/gson/JsonIOException;,
a=0;//             Lcom/google/gson/JsonSyntaxException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 767
a=0;//     new-instance v0, Lcom/google/gson/stream/JsonReader;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/stream/JsonReader;);
a=0;//     invoke-direct {v0, p1}, Lcom/google/gson/stream/JsonReader;-><init>(Ljava/io/Reader;)V
a=0;// 
a=0;//     .line 768
a=0;//     .local v0, "jsonReader":Lcom/google/gson/stream/JsonReader;
a=0;//     #v0=(Reference,Lcom/google/gson/stream/JsonReader;);
a=0;//     invoke-virtual {p0, v0, p2}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/stream/JsonReader;Ljava/lang/reflect/Type;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 769
a=0;//     .local v1, "object":Ljava/lang/Object;, "TT;"
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-static {v1, v0}, Lcom/google/gson/Gson;->assertFullConsumption(Ljava/lang/Object;Lcom/google/gson/stream/JsonReader;)V
a=0;// 
a=0;//     .line 770
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .param p1, "json"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;)TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/google/gson/JsonSyntaxException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 689
a=0;//     .local p2, "classOfT":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 690
a=0;//     .local v0, "object":Ljava/lang/Object;
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     invoke-static {p2}, Lcom/google/gson/internal/Primitives;->wrap(Ljava/lang/Class;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .param p1, "json"    # Ljava/lang/String;
a=0;//     .param p2, "typeOfT"    # Ljava/lang/reflect/Type;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/reflect/Type;",
a=0;//             ")TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/google/gson/JsonSyntaxException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 713
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 714
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 718
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/Object;);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 716
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     new-instance v0, Ljava/io/StringReader;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/StringReader;);
a=0;//     invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 717
a=0;//     .local v0, "reader":Ljava/io/StringReader;
a=0;//     #v0=(Reference,Ljava/io/StringReader;);
a=0;//     invoke-virtual {p0, v0, p2}, Lcom/google/gson/Gson;->fromJson(Ljava/io/Reader;Ljava/lang/reflect/Type;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 718
a=0;//     .local v1, "target":Ljava/lang/Object;, "TT;"
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getAdapter(Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
a=0;//     .locals 11
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/google/gson/reflect/TypeToken",
a=0;//             "<TT;>;)",
a=0;//             "Lcom/google/gson/TypeAdapter",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 332
a=0;//     .local p1, "type":Lcom/google/gson/reflect/TypeToken;, "Lcom/google/gson/reflect/TypeToken<TT;>;"
a=0;//     iget-object v8, p0, Lcom/google/gson/Gson;->typeTokenCache:Ljava/util/Map;
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v8, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     .line 333
a=0;//     .local v0, "cached":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<*>;"
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 368
a=0;//     .end local v0    # "cached":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<*>;"
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 337
a=0;//     .restart local v0    # "cached":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<*>;"
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v8, p0, Lcom/google/gson/Gson;->calls:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Ljava/util/Map;
a=0;// 
a=0;//     .line 338
a=0;//     .local v7, "threadCalls":Ljava/util/Map;, "Ljava/util/Map<Lcom/google/gson/reflect/TypeToken<*>;Lcom/google/gson/Gson$FutureTypeAdapter<*>;>;"
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 339
a=0;//     .local v6, "requiresThreadLocalCleanup":Z
a=0;//     #v6=(Null);
a=0;//     if-nez v7, :cond_1
a=0;// 
a=0;//     .line 340
a=0;//     new-instance v7, Ljava/util/HashMap;
a=0;// 
a=0;//     .end local v7    # "threadCalls":Ljava/util/Map;, "Ljava/util/Map<Lcom/google/gson/reflect/TypeToken<*>;Lcom/google/gson/Gson$FutureTypeAdapter<*>;>;"
a=0;//     #v7=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v7}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 341
a=0;//     .restart local v7    # "threadCalls":Ljava/util/Map;, "Ljava/util/Map<Lcom/google/gson/reflect/TypeToken<*>;Lcom/google/gson/Gson$FutureTypeAdapter<*>;>;"
a=0;//     #v7=(Reference,Ljava/util/HashMap;);
a=0;//     iget-object v8, p0, Lcom/google/gson/Gson;->calls:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     invoke-virtual {v8, v7}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 342
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 346
a=0;//     :cond_1
a=0;//     #v6=(Boolean);
a=0;//     invoke-interface {v7, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v5, Lcom/google/gson/Gson$FutureTypeAdapter;
a=0;// 
a=0;//     .line 347
a=0;//     .local v5, "ongoingCall":Lcom/google/gson/Gson$FutureTypeAdapter;, "Lcom/google/gson/Gson$FutureTypeAdapter<TT;>;"
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     move-object v0, v5
a=0;// 
a=0;//     .line 348
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 352
a=0;//     :cond_2
a=0;//     :try_start_0
a=0;//     new-instance v1, Lcom/google/gson/Gson$FutureTypeAdapter;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/google/gson/Gson$FutureTypeAdapter;);
a=0;//     invoke-direct {v1}, Lcom/google/gson/Gson$FutureTypeAdapter;-><init>()V
a=0;// 
a=0;//     .line 353
a=0;//     .local v1, "call":Lcom/google/gson/Gson$FutureTypeAdapter;, "Lcom/google/gson/Gson$FutureTypeAdapter<TT;>;"
a=0;//     #v1=(Reference,Lcom/google/gson/Gson$FutureTypeAdapter;);
a=0;//     invoke-interface {v7, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 355
a=0;//     iget-object v8, p0, Lcom/google/gson/Gson;->factories:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .local v4, "i$":Ljava/util/Iterator;
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Reference,Ljava/util/Iterator;);v8=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_5
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     .line 356
a=0;//     .local v3, "factory":Lcom/google/gson/TypeAdapterFactory;
a=0;//     invoke-interface {v3, p0, p1}, Lcom/google/gson/TypeAdapterFactory;->create(Lcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 357
a=0;//     .local v2, "candidate":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<TT;>;"
a=0;//     #v2=(Reference,Lcom/google/gson/TypeAdapter;);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 358
a=0;//     invoke-virtual {v1, v2}, Lcom/google/gson/Gson$FutureTypeAdapter;->setDelegate(Lcom/google/gson/TypeAdapter;)V
a=0;// 
a=0;//     .line 359
a=0;//     iget-object v8, p0, Lcom/google/gson/Gson;->typeTokenCache:Ljava/util/Map;
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v8, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 365
a=0;//     invoke-interface {v7, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 367
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     .line 368
a=0;//     iget-object v8, p0, Lcom/google/gson/Gson;->calls:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/ThreadLocal;->remove()V
a=0;// 
a=0;//     :cond_4
a=0;//     move-object v0, v2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 363
a=0;//     .end local v2    # "candidate":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<TT;>;"
a=0;//     .end local v3    # "factory":Lcom/google/gson/TypeAdapterFactory;
a=0;//     :cond_5
a=0;//     :try_start_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v8=(Boolean);
a=0;//     new-instance v8, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "GSON cannot handle "
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-direct {v8, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v8
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 365
a=0;//     .end local v1    # "call":Lcom/google/gson/Gson$FutureTypeAdapter;, "Lcom/google/gson/Gson$FutureTypeAdapter<TT;>;"
a=0;//     .end local v4    # "i$":Ljava/util/Iterator;
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v4=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     move-exception v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-interface {v7, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 367
a=0;//     if-eqz v6, :cond_6
a=0;// 
a=0;//     .line 368
a=0;//     iget-object v9, p0, Lcom/google/gson/Gson;->calls:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     invoke-virtual {v9}, Ljava/lang/ThreadLocal;->remove()V
a=0;// 
a=0;//     :cond_6
a=0;//     #v9=(Conflicted);
a=0;//     throw v8
a=0;// .end method
a=0;// 
a=0;// .method public getAdapter(Ljava/lang/Class;)Lcom/google/gson/TypeAdapter;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;)",
a=0;//             "Lcom/google/gson/TypeAdapter",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 445
a=0;//     .local p1, "type":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     invoke-static {p1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/Class;)Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/reflect/TypeToken;);
a=0;//     invoke-virtual {p0, v0}, Lcom/google/gson/Gson;->getAdapter(Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getDelegateAdapter(Lcom/google/gson/TypeAdapterFactory;Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
a=0;//     .locals 7
a=0;//     .param p1, "skipPast"    # Lcom/google/gson/TypeAdapterFactory;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/google/gson/TypeAdapterFactory;",
a=0;//             "Lcom/google/gson/reflect/TypeToken",
a=0;//             "<TT;>;)",
a=0;//             "Lcom/google/gson/TypeAdapter",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 420
a=0;//     .local p2, "type":Lcom/google/gson/reflect/TypeToken;, "Lcom/google/gson/reflect/TypeToken<TT;>;"
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 422
a=0;//     .local v3, "skipPastFound":Z
a=0;//     #v3=(Null);
a=0;//     iget-object v4, p0, Lcom/google/gson/Gson;->factories:Ljava/util/List;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .local v2, "i$":Ljava/util/Iterator;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Ljava/util/Iterator;);v3=(Boolean);v4=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     .line 423
a=0;//     .local v1, "factory":Lcom/google/gson/TypeAdapterFactory;
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 424
a=0;//     if-ne v1, p1, :cond_0
a=0;// 
a=0;//     .line 425
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 430
a=0;//     :cond_1
a=0;//     #v3=(Boolean);
a=0;//     invoke-interface {v1, p0, p2}, Lcom/google/gson/TypeAdapterFactory;->create(Lcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 431
a=0;//     .local v0, "candidate":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<TT;>;"
a=0;//     #v0=(Reference,Lcom/google/gson/TypeAdapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 432
a=0;//     return-object v0
a=0;// 
a=0;//     .line 435
a=0;//     .end local v0    # "candidate":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<TT;>;"
a=0;//     .end local v1    # "factory":Lcom/google/gson/TypeAdapterFactory;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     new-instance v4, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "GSON cannot serialize "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v4
a=0;// .end method
a=0;// 
a=0;// .method public toJson(Lcom/google/gson/JsonElement;)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p1, "jsonElement"    # Lcom/google/gson/JsonElement;
a=0;// 
a=0;//     .prologue
a=0;//     .line 611
a=0;//     new-instance v0, Ljava/io/StringWriter;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/StringWriter;);
a=0;//     invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V
a=0;// 
a=0;//     .line 612
a=0;//     .local v0, "writer":Ljava/io/StringWriter;
a=0;//     #v0=(Reference,Ljava/io/StringWriter;);
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/google/gson/Gson;->toJson(Lcom/google/gson/JsonElement;Ljava/lang/Appendable;)V
a=0;// 
a=0;//     .line 613
a=0;//     invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public toJson(Ljava/lang/Object;)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p1, "src"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 504
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 505
a=0;//     sget-object v0, Lcom/google/gson/JsonNull;->INSTANCE:Lcom/google/gson/JsonNull;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/JsonNull;);
a=0;//     invoke-virtual {p0, v0}, Lcom/google/gson/Gson;->toJson(Lcom/google/gson/JsonElement;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 507
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p1, "src"    # Ljava/lang/Object;
a=0;//     .param p2, "typeOfSrc"    # Ljava/lang/reflect/Type;
a=0;// 
a=0;//     .prologue
a=0;//     .line 526
a=0;//     new-instance v0, Ljava/io/StringWriter;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/StringWriter;);
a=0;//     invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V
a=0;// 
a=0;//     .line 527
a=0;//     .local v0, "writer":Ljava/io/StringWriter;
a=0;//     #v0=(Reference,Ljava/io/StringWriter;);
a=0;//     invoke-virtual {p0, p1, p2, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Appendable;)V
a=0;// 
a=0;//     .line 528
a=0;//     invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public toJson(Lcom/google/gson/JsonElement;Lcom/google/gson/stream/JsonWriter;)V
a=0;//     .locals 5
a=0;//     .param p1, "jsonElement"    # Lcom/google/gson/JsonElement;
a=0;//     .param p2, "writer"    # Lcom/google/gson/stream/JsonWriter;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/google/gson/JsonIOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 654
a=0;//     invoke-virtual {p2}, Lcom/google/gson/stream/JsonWriter;->isLenient()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 655
a=0;//     .local v2, "oldLenient":Z
a=0;//     #v2=(Boolean);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {p2, v4}, Lcom/google/gson/stream/JsonWriter;->setLenient(Z)V
a=0;// 
a=0;//     .line 656
a=0;//     invoke-virtual {p2}, Lcom/google/gson/stream/JsonWriter;->isHtmlSafe()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 657
a=0;//     .local v1, "oldHtmlSafe":Z
a=0;//     #v1=(Boolean);
a=0;//     iget-boolean v4, p0, Lcom/google/gson/Gson;->htmlSafe:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     invoke-virtual {p2, v4}, Lcom/google/gson/stream/JsonWriter;->setHtmlSafe(Z)V
a=0;// 
a=0;//     .line 658
a=0;//     invoke-virtual {p2}, Lcom/google/gson/stream/JsonWriter;->getSerializeNulls()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 659
a=0;//     .local v3, "oldSerializeNulls":Z
a=0;//     #v3=(Boolean);
a=0;//     iget-boolean v4, p0, Lcom/google/gson/Gson;->serializeNulls:Z
a=0;// 
a=0;//     invoke-virtual {p2, v4}, Lcom/google/gson/stream/JsonWriter;->setSerializeNulls(Z)V
a=0;// 
a=0;//     .line 661
a=0;//     :try_start_0
a=0;//     invoke-static {p1, p2}, Lcom/google/gson/internal/Streams;->write(Lcom/google/gson/JsonElement;Lcom/google/gson/stream/JsonWriter;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 665
a=0;//     invoke-virtual {p2, v2}, Lcom/google/gson/stream/JsonWriter;->setLenient(Z)V
a=0;// 
a=0;//     .line 666
a=0;//     invoke-virtual {p2, v1}, Lcom/google/gson/stream/JsonWriter;->setHtmlSafe(Z)V
a=0;// 
a=0;//     .line 667
a=0;//     invoke-virtual {p2, v3}, Lcom/google/gson/stream/JsonWriter;->setSerializeNulls(Z)V
a=0;// 
a=0;//     .line 669
a=0;//     return-void
a=0;// 
a=0;//     .line 662
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 663
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     new-instance v4, Lcom/google/gson/JsonIOException;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/google/gson/JsonIOException;);
a=0;//     invoke-direct {v4, v0}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/google/gson/JsonIOException;);
a=0;//     throw v4
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 665
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {p2, v2}, Lcom/google/gson/stream/JsonWriter;->setLenient(Z)V
a=0;// 
a=0;//     .line 666
a=0;//     invoke-virtual {p2, v1}, Lcom/google/gson/stream/JsonWriter;->setHtmlSafe(Z)V
a=0;// 
a=0;//     .line 667
a=0;//     invoke-virtual {p2, v3}, Lcom/google/gson/stream/JsonWriter;->setSerializeNulls(Z)V
a=0;// 
a=0;//     throw v4
a=0;// .end method
a=0;// 
a=0;// .method public toJson(Lcom/google/gson/JsonElement;Ljava/lang/Appendable;)V
a=0;//     .locals 3
a=0;//     .param p1, "jsonElement"    # Lcom/google/gson/JsonElement;
a=0;//     .param p2, "writer"    # Ljava/lang/Appendable;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/google/gson/JsonIOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 626
a=0;//     :try_start_0
a=0;//     invoke-static {p2}, Lcom/google/gson/internal/Streams;->writerForAppendable(Ljava/lang/Appendable;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/Writer;);
a=0;//     invoke-direct {p0, v2}, Lcom/google/gson/Gson;->newJsonWriter(Ljava/io/Writer;)Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 627
a=0;//     .local v1, "jsonWriter":Lcom/google/gson/stream/JsonWriter;
a=0;//     #v1=(Reference,Lcom/google/gson/stream/JsonWriter;);
a=0;//     invoke-virtual {p0, p1, v1}, Lcom/google/gson/Gson;->toJson(Lcom/google/gson/JsonElement;Lcom/google/gson/stream/JsonWriter;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 631
a=0;//     return-void
a=0;// 
a=0;//     .line 628
a=0;//     .end local v1    # "jsonWriter":Lcom/google/gson/stream/JsonWriter;
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 629
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     new-instance v2, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method public toJson(Ljava/lang/Object;Ljava/lang/Appendable;)V
a=0;//     .locals 1
a=0;//     .param p1, "src"    # Ljava/lang/Object;
a=0;//     .param p2, "writer"    # Ljava/lang/Appendable;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/google/gson/JsonIOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 546
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 547
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, p1, v0, p2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Appendable;)V
a=0;// 
a=0;//     .line 551
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 549
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     sget-object v0, Lcom/google/gson/JsonNull;->INSTANCE:Lcom/google/gson/JsonNull;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/JsonNull;);
a=0;//     invoke-virtual {p0, v0, p2}, Lcom/google/gson/Gson;->toJson(Lcom/google/gson/JsonElement;Ljava/lang/Appendable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/google/gson/stream/JsonWriter;)V
a=0;//     .locals 6
a=0;//     .param p1, "src"    # Ljava/lang/Object;
a=0;//     .param p2, "typeOfSrc"    # Ljava/lang/reflect/Type;
a=0;//     .param p3, "writer"    # Lcom/google/gson/stream/JsonWriter;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/google/gson/JsonIOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 585
a=0;//     invoke-static {p2}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lcom/google/gson/reflect/TypeToken;);
a=0;//     invoke-virtual {p0, v5}, Lcom/google/gson/Gson;->getAdapter(Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 586
a=0;//     .local v0, "adapter":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<*>;"
a=0;//     #v0=(Reference,Lcom/google/gson/TypeAdapter;);
a=0;//     invoke-virtual {p3}, Lcom/google/gson/stream/JsonWriter;->isLenient()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 587
a=0;//     .local v3, "oldLenient":Z
a=0;//     #v3=(Boolean);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-virtual {p3, v5}, Lcom/google/gson/stream/JsonWriter;->setLenient(Z)V
a=0;// 
a=0;//     .line 588
a=0;//     invoke-virtual {p3}, Lcom/google/gson/stream/JsonWriter;->isHtmlSafe()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 589
a=0;//     .local v2, "oldHtmlSafe":Z
a=0;//     #v2=(Boolean);
a=0;//     iget-boolean v5, p0, Lcom/google/gson/Gson;->htmlSafe:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     invoke-virtual {p3, v5}, Lcom/google/gson/stream/JsonWriter;->setHtmlSafe(Z)V
a=0;// 
a=0;//     .line 590
a=0;//     invoke-virtual {p3}, Lcom/google/gson/stream/JsonWriter;->getSerializeNulls()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 591
a=0;//     .local v4, "oldSerializeNulls":Z
a=0;//     #v4=(Boolean);
a=0;//     iget-boolean v5, p0, Lcom/google/gson/Gson;->serializeNulls:Z
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Lcom/google/gson/stream/JsonWriter;->setSerializeNulls(Z)V
a=0;// 
a=0;//     .line 593
a=0;//     :try_start_0
a=0;//     invoke-virtual {v0, p3, p1}, Lcom/google/gson/TypeAdapter;->write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 597
a=0;//     invoke-virtual {p3, v3}, Lcom/google/gson/stream/JsonWriter;->setLenient(Z)V
a=0;// 
a=0;//     .line 598
a=0;//     invoke-virtual {p3, v2}, Lcom/google/gson/stream/JsonWriter;->setHtmlSafe(Z)V
a=0;// 
a=0;//     .line 599
a=0;//     invoke-virtual {p3, v4}, Lcom/google/gson/stream/JsonWriter;->setSerializeNulls(Z)V
a=0;// 
a=0;//     .line 601
a=0;//     return-void
a=0;// 
a=0;//     .line 594
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 595
a=0;//     .local v1, "e":Ljava/io/IOException;
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     new-instance v5, Lcom/google/gson/JsonIOException;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/google/gson/JsonIOException;);
a=0;//     invoke-direct {v5, v1}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v5=(Reference,Lcom/google/gson/JsonIOException;);
a=0;//     throw v5
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 597
a=0;//     .end local v1    # "e":Ljava/io/IOException;
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {p3, v3}, Lcom/google/gson/stream/JsonWriter;->setLenient(Z)V
a=0;// 
a=0;//     .line 598
a=0;//     invoke-virtual {p3, v2}, Lcom/google/gson/stream/JsonWriter;->setHtmlSafe(Z)V
a=0;// 
a=0;//     .line 599
a=0;//     invoke-virtual {p3, v4}, Lcom/google/gson/stream/JsonWriter;->setSerializeNulls(Z)V
a=0;// 
a=0;//     throw v5
a=0;// .end method
a=0;// 
a=0;// .method public toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Appendable;)V
a=0;//     .locals 3
a=0;//     .param p1, "src"    # Ljava/lang/Object;
a=0;//     .param p2, "typeOfSrc"    # Ljava/lang/reflect/Type;
a=0;//     .param p3, "writer"    # Ljava/lang/Appendable;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/google/gson/JsonIOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 571
a=0;//     :try_start_0
a=0;//     invoke-static {p3}, Lcom/google/gson/internal/Streams;->writerForAppendable(Ljava/lang/Appendable;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/Writer;);
a=0;//     invoke-direct {p0, v2}, Lcom/google/gson/Gson;->newJsonWriter(Ljava/io/Writer;)Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 572
a=0;//     .local v1, "jsonWriter":Lcom/google/gson/stream/JsonWriter;
a=0;//     #v1=(Reference,Lcom/google/gson/stream/JsonWriter;);
a=0;//     invoke-virtual {p0, p1, p2, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/google/gson/stream/JsonWriter;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 576
a=0;//     return-void
a=0;// 
a=0;//     .line 573
a=0;//     .end local v1    # "jsonWriter":Lcom/google/gson/stream/JsonWriter;
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 574
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     new-instance v2, Lcom/google/gson/JsonIOException;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/google/gson/JsonIOException;);
a=0;//     invoke-direct {v2, v0}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/google/gson/JsonIOException;);
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method public toJsonTree(Ljava/lang/Object;)Lcom/google/gson/JsonElement;
a=0;//     .locals 1
a=0;//     .param p1, "src"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 462
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 463
a=0;//     sget-object v0, Lcom/google/gson/JsonNull;->INSTANCE:Lcom/google/gson/JsonNull;
a=0;// 
a=0;//     .line 465
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/google/gson/Gson;->toJsonTree(Ljava/lang/Object;Ljava/lang/reflect/Type;)Lcom/google/gson/JsonElement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public toJsonTree(Ljava/lang/Object;Ljava/lang/reflect/Type;)Lcom/google/gson/JsonElement;
a=0;//     .locals 2
a=0;//     .param p1, "src"    # Ljava/lang/Object;
a=0;//     .param p2, "typeOfSrc"    # Ljava/lang/reflect/Type;
a=0;// 
a=0;//     .prologue
a=0;//     .line 485
a=0;//     new-instance v0, Lcom/google/gson/internal/bind/JsonTreeWriter;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/bind/JsonTreeWriter;);
a=0;//     invoke-direct {v0}, Lcom/google/gson/internal/bind/JsonTreeWriter;-><init>()V
a=0;// 
a=0;//     .line 486
a=0;//     .local v0, "writer":Lcom/google/gson/internal/bind/JsonTreeWriter;
a=0;//     #v0=(Reference,Lcom/google/gson/internal/bind/JsonTreeWriter;);
a=0;//     invoke-virtual {p0, p1, p2, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/google/gson/stream/JsonWriter;)V
a=0;// 
a=0;//     .line 487
a=0;//     invoke-virtual {v0}, Lcom/google/gson/internal/bind/JsonTreeWriter;->get()Lcom/google/gson/JsonElement;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/JsonElement;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 898
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "{serializeNulls:"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-boolean v1, p0, Lcom/google/gson/Gson;->serializeNulls:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "factories:"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/google/gson/Gson;->factories:Ljava/util/List;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ",instanceCreators:"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/google/gson/Gson;->constructorConstructor:Lcom/google/gson/internal/ConstructorConstructor;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "}"
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
