package com.google.gson.internal.bind; class ReflectiveTypeAdapterFactory { void a() { int a;
a=0;// .class public final Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ReflectiveTypeAdapterFactory.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$Adapter;,
a=0;//         Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final constructorConstructor:Lcom/google/gson/internal/ConstructorConstructor;
a=0;// 
a=0;// .field private final excluder:Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;// .field private final fieldNamingPolicy:Lcom/google/gson/FieldNamingStrategy;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/google/gson/internal/ConstructorConstructor;Lcom/google/gson/FieldNamingStrategy;Lcom/google/gson/internal/Excluder;)V
a=0;//     .locals 0
a=0;//     .param p1, "constructorConstructor"    # Lcom/google/gson/internal/ConstructorConstructor;
a=0;//     .param p2, "fieldNamingPolicy"    # Lcom/google/gson/FieldNamingStrategy;
a=0;//     .param p3, "excluder"    # Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 50
a=0;//     #p0=(Reference,Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;);
a=0;//     iput-object p1, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->constructorConstructor:Lcom/google/gson/internal/ConstructorConstructor;
a=0;// 
a=0;//     .line 51
a=0;//     iput-object p2, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->fieldNamingPolicy:Lcom/google/gson/FieldNamingStrategy;
a=0;// 
a=0;//     .line 52
a=0;//     iput-object p3, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->excluder:Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     .line 53
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private createBoundField(Lcom/google/gson/Gson;Ljava/lang/reflect/Field;Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;ZZ)Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;
a=0;//     .locals 9
a=0;//     .param p1, "context"    # Lcom/google/gson/Gson;
a=0;//     .param p2, "field"    # Ljava/lang/reflect/Field;
a=0;//     .param p3, "name"    # Ljava/lang/String;
a=0;//     .param p5, "serialize"    # Z
a=0;//     .param p6, "deserialize"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/google/gson/Gson;",
a=0;//             "Ljava/lang/reflect/Field;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/google/gson/reflect/TypeToken",
a=0;//             "<*>;ZZ)",
a=0;//             "Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     .local p4, "fieldType":Lcom/google/gson/reflect/TypeToken;, "Lcom/google/gson/reflect/TypeToken<*>;"
a=0;//     invoke-virtual {p4}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0}, Lcom/google/gson/internal/Primitives;->isPrimitive(Ljava/lang/reflect/Type;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 81
a=0;//     .local v8, "isPrimitive":Z
a=0;//     #v8=(Boolean);
a=0;//     new-instance v0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;);
a=0;//     move-object v2, p3
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move v3, p5
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     move v4, p6
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     move-object v5, p1
a=0;// 
a=0;//     #v5=(Reference,Lcom/google/gson/Gson;);
a=0;//     move-object v6, p4
a=0;// 
a=0;//     #v6=(Reference,Lcom/google/gson/reflect/TypeToken;);
a=0;//     move-object v7, p2
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/reflect/Field;);
a=0;//     invoke-direct/range {v0 .. v8}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;-><init>(Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;Ljava/lang/String;ZZLcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;Ljava/lang/reflect/Field;Z)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private getBoundFields(Lcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;Ljava/lang/Class;)Ljava/util/Map;
a=0;//     .locals 17
a=0;//     .param p1, "context"    # Lcom/google/gson/Gson;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/google/gson/Gson;",
a=0;//             "Lcom/google/gson/reflect/TypeToken",
a=0;//             "<*>;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;)",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     .local p2, "type":Lcom/google/gson/reflect/TypeToken;, "Lcom/google/gson/reflect/TypeToken<*>;"
a=0;//     .local p3, "raw":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     new-instance v16, Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     #v16=(UninitRef,Ljava/util/LinkedHashMap;);
a=0;//     invoke-direct/range {v16 .. v16}, Ljava/util/LinkedHashMap;-><init>()V
a=0;// 
a=0;//     .line 103
a=0;//     .local v16, "result":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;>;"
a=0;//     #v16=(Reference,Ljava/util/LinkedHashMap;);
a=0;//     invoke-virtual/range {p3 .. p3}, Ljava/lang/Class;->isInterface()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 129
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     return-object v16
a=0;// 
a=0;//     .line 107
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);
a=0;//     invoke-virtual/range {p2 .. p2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 108
a=0;//     .local v10, "declaredType":Ljava/lang/reflect/Type;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Reference,Ljava/lang/reflect/Type;);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     const-class v1, Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 109
a=0;//     invoke-virtual/range {p3 .. p3}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 110
a=0;//     .local v12, "fields":[Ljava/lang/reflect/Field;
a=0;//     #v12=(Reference,[Ljava/lang/reflect/Field;);
a=0;//     move-object v8, v12
a=0;// 
a=0;//     .local v8, "arr$":[Ljava/lang/reflect/Field;
a=0;//     #v8=(Reference,[Ljava/lang/reflect/Field;);
a=0;//     array-length v14, v8
a=0;// 
a=0;//     .local v14, "len$":I
a=0;//     #v14=(Integer);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     .local v13, "i$":I
a=0;//     :goto_1
a=0;//     #v13=(Integer);
a=0;//     if-ge v13, v14, :cond_4
a=0;// 
a=0;//     aget-object v3, v8, v13
a=0;// 
a=0;//     .line 111
a=0;//     .local v3, "field":Ljava/lang/reflect/Field;
a=0;//     #v3=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v3, v1}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->excludeField(Ljava/lang/reflect/Field;Z)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 112
a=0;//     .local v6, "serialize":Z
a=0;//     #v6=(Boolean);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v3, v1}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->excludeField(Ljava/lang/reflect/Field;Z)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 113
a=0;//     .local v7, "deserialize":Z
a=0;//     #v7=(Boolean);
a=0;//     if-nez v6, :cond_3
a=0;// 
a=0;//     if-nez v7, :cond_3
a=0;// 
a=0;//     .line 110
a=0;//     :cond_2
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     add-int/lit8 v13, v13, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 116
a=0;//     :cond_3
a=0;//     #v1=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V
a=0;// 
a=0;//     .line 117
a=0;//     invoke-virtual/range {p2 .. p2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/reflect/Type;);
a=0;//     invoke-virtual {v3}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/reflect/Type;);
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     invoke-static {v1, v0, v2}, Lcom/google/gson/internal/$Gson$Types;->resolve(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 118
a=0;//     .local v11, "fieldType":Ljava/lang/reflect/Type;
a=0;//     #v11=(Reference,Ljava/lang/reflect/Type;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v0, v3}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->getFieldName(Ljava/lang/reflect/Field;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v11}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lcom/google/gson/reflect/TypeToken;);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     move-object/from16 v2, p1
a=0;// 
a=0;//     invoke-direct/range {v1 .. v7}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->createBoundField(Lcom/google/gson/Gson;Ljava/lang/reflect/Field;Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;ZZ)Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 120
a=0;//     .local v9, "boundField":Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;
a=0;//     #v9=(Reference,Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;);
a=0;//     iget-object v1, v9, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;->name:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-interface {v0, v1, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v15, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;
a=0;// 
a=0;//     .line 121
a=0;//     .local v15, "previous":Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;
a=0;//     if-eqz v15, :cond_2
a=0;// 
a=0;//     .line 122
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v4, " declares multiple JSON fields named "
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v4, v15, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;->name:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 126
a=0;//     .end local v3    # "field":Ljava/lang/reflect/Field;
a=0;//     .end local v6    # "serialize":Z
a=0;//     .end local v7    # "deserialize":Z
a=0;//     .end local v9    # "boundField":Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;
a=0;//     .end local v11    # "fieldType":Ljava/lang/reflect/Type;
a=0;//     .end local v15    # "previous":Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);v11=(Conflicted);v15=(Conflicted);
a=0;//     invoke-virtual/range {p2 .. p2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual/range {p3 .. p3}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/reflect/Type;);
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     invoke-static {v1, v0, v2}, Lcom/google/gson/internal/$Gson$Types;->resolve(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 127
a=0;//     invoke-virtual/range {p2 .. p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object p3
a=0;// 
a=0;//     .line 128
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private getFieldName(Ljava/lang/reflect/Field;)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p1, "f"    # Ljava/lang/reflect/Field;
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     const-class v1, Lcom/google/gson/annotations/SerializedName;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p1, v1}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/annotation/Annotation;);
a=0;//     check-cast v0, Lcom/google/gson/annotations/SerializedName;
a=0;// 
a=0;//     .line 61
a=0;//     .local v0, "serializedName":Lcom/google/gson/annotations/SerializedName;
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->fieldNamingPolicy:Lcom/google/gson/FieldNamingStrategy;
a=0;// 
a=0;//     invoke-interface {v1, p1}, Lcom/google/gson/FieldNamingStrategy;->translateName(Ljava/lang/reflect/Field;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-interface {v0}, Lcom/google/gson/annotations/SerializedName;->value()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public create(Lcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
a=0;//     .locals 5
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
a=0;//     .local p2, "type":Lcom/google/gson/reflect/TypeToken;, "Lcom/google/gson/reflect/TypeToken<TT;>;"
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 65
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 67
a=0;//     .local v1, "raw":Ljava/lang/Class;, "Ljava/lang/Class<-TT;>;"
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     const-class v3, Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 72
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Reference,Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$Adapter;);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 71
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Null);v3=(Boolean);v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->constructorConstructor:Lcom/google/gson/internal/ConstructorConstructor;
a=0;// 
a=0;//     #v3=(Reference,Lcom/google/gson/internal/ConstructorConstructor;);
a=0;//     invoke-virtual {v3, p2}, Lcom/google/gson/internal/ConstructorConstructor;->get(Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/internal/ObjectConstructor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 72
a=0;//     .local v0, "constructor":Lcom/google/gson/internal/ObjectConstructor;, "Lcom/google/gson/internal/ObjectConstructor<TT;>;"
a=0;//     #v0=(Reference,Lcom/google/gson/internal/ObjectConstructor;);
a=0;//     new-instance v3, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$Adapter;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$Adapter;);
a=0;//     invoke-direct {p0, p1, p2, v1}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->getBoundFields(Lcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;Ljava/lang/Class;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/Map;);
a=0;//     invoke-direct {v3, v0, v4, v2}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$Adapter;-><init>(Lcom/google/gson/internal/ObjectConstructor;Ljava/util/Map;Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$Adapter;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Reference,Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$Adapter;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public excludeField(Ljava/lang/reflect/Field;Z)Z
a=0;//     .locals 2
a=0;//     .param p1, "f"    # Ljava/lang/reflect/Field;
a=0;//     .param p2, "serialize"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->excluder:Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/Excluder;);
a=0;//     invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, v1, p2}, Lcom/google/gson/internal/Excluder;->excludeClass(Ljava/lang/Class;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->excluder:Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/Excluder;);
a=0;//     invoke-virtual {v0, p1, p2}, Lcom/google/gson/internal/Excluder;->excludeField(Ljava/lang/reflect/Field;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
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
}}
