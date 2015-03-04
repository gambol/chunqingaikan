package com.google.gson.internal.bind; class MapTypeAdapterFactory { void a() { int a;
a=0;// .class public final Lcom/google/gson/internal/bind/MapTypeAdapterFactory;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MapTypeAdapterFactory.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final complexMapKeySerialization:Z
a=0;// 
a=0;// .field private final constructorConstructor:Lcom/google/gson/internal/ConstructorConstructor;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/google/gson/internal/ConstructorConstructor;Z)V
a=0;//     .locals 0
a=0;//     .param p1, "constructorConstructor"    # Lcom/google/gson/internal/ConstructorConstructor;
a=0;//     .param p2, "complexMapKeySerialization"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 110
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 111
a=0;//     #p0=(Reference,Lcom/google/gson/internal/bind/MapTypeAdapterFactory;);
a=0;//     iput-object p1, p0, Lcom/google/gson/internal/bind/MapTypeAdapterFactory;->constructorConstructor:Lcom/google/gson/internal/ConstructorConstructor;
a=0;// 
a=0;//     .line 112
a=0;//     iput-boolean p2, p0, Lcom/google/gson/internal/bind/MapTypeAdapterFactory;->complexMapKeySerialization:Z
a=0;// 
a=0;//     .line 113
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Lcom/google/gson/internal/bind/MapTypeAdapterFactory;)Z
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Lcom/google/gson/internal/bind/MapTypeAdapterFactory;
a=0;// 
a=0;//     .prologue
a=0;//     .line 105
a=0;//     iget-boolean v0, p0, Lcom/google/gson/internal/bind/MapTypeAdapterFactory;->complexMapKeySerialization:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private getKeyAdapter(Lcom/google/gson/Gson;Ljava/lang/reflect/Type;)Lcom/google/gson/TypeAdapter;
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Lcom/google/gson/Gson;
a=0;//     .param p2, "keyType"    # Ljava/lang/reflect/Type;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/google/gson/Gson;",
a=0;//             "Ljava/lang/reflect/Type;",
a=0;//             ")",
a=0;//             "Lcom/google/gson/TypeAdapter",
a=0;//             "<*>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 140
a=0;//     sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     if-eq p2, v0, :cond_0
a=0;// 
a=0;//     const-class v0, Ljava/lang/Boolean;
a=0;// 
a=0;//     if-ne p2, v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Lcom/google/gson/internal/bind/TypeAdapters;->BOOLEAN_AS_STRING:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-static {p2}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lcom/google/gson/Gson;->getAdapter(Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public create(Lcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
a=0;//     .locals 12
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
a=0;//     .local p2, "typeToken":Lcom/google/gson/reflect/TypeToken;, "Lcom/google/gson/reflect/TypeToken<TT;>;"
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 116
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 118
a=0;//     .local v11, "type":Ljava/lang/reflect/Type;
a=0;//     #v11=(Reference,Ljava/lang/reflect/Type;);
a=0;//     invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 119
a=0;//     .local v9, "rawType":Ljava/lang/Class;, "Ljava/lang/Class<-TT;>;"
a=0;//     #v9=(Reference,Ljava/lang/Class;);
a=0;//     const-class v1, Ljava/util/Map;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 120
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 133
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;);v1=(Conflicted);v2=(Reference,Lcom/google/gson/Gson;);v3=(Conflicted);v4=(Conflicted);v5=(Boolean);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v10=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 123
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Boolean);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(One);v6=(Uninit);v7=(Uninit);v8=(Uninit);v10=(Uninit);
a=0;//     invoke-static {v11}, Lcom/google/gson/internal/$Gson$Types;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 124
a=0;//     .local v10, "rawTypeOfSrc":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     #v10=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v11, v10}, Lcom/google/gson/internal/$Gson$Types;->getMapKeyAndValueTypes(Ljava/lang/reflect/Type;Ljava/lang/Class;)[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 125
a=0;//     .local v8, "keyAndValueTypes":[Ljava/lang/reflect/Type;
a=0;//     #v8=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     aget-object v1, v8, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, p1, v1}, Lcom/google/gson/internal/bind/MapTypeAdapterFactory;->getKeyAdapter(Lcom/google/gson/Gson;Ljava/lang/reflect/Type;)Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 126
a=0;//     .local v4, "keyAdapter":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<*>;"
a=0;//     #v4=(Reference,Lcom/google/gson/TypeAdapter;);
a=0;//     aget-object v1, v8, v5
a=0;// 
a=0;//     invoke-static {v1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/reflect/TypeToken;);
a=0;//     invoke-virtual {p1, v1}, Lcom/google/gson/Gson;->getAdapter(Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 127
a=0;//     .local v6, "valueAdapter":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<*>;"
a=0;//     #v6=(Reference,Lcom/google/gson/TypeAdapter;);
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/bind/MapTypeAdapterFactory;->constructorConstructor:Lcom/google/gson/internal/ConstructorConstructor;
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Lcom/google/gson/internal/ConstructorConstructor;->get(Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/internal/ObjectConstructor;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 131
a=0;//     .local v7, "constructor":Lcom/google/gson/internal/ObjectConstructor;, "Lcom/google/gson/internal/ObjectConstructor<TT;>;"
a=0;//     #v7=(Reference,Lcom/google/gson/internal/ObjectConstructor;);
a=0;//     new-instance v0, Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;);
a=0;//     aget-object v3, v8, v2
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aget-object v5, v8, v5
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Lcom/google/gson/Gson;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;-><init>(Lcom/google/gson/internal/bind/MapTypeAdapterFactory;Lcom/google/gson/Gson;Ljava/lang/reflect/Type;Lcom/google/gson/TypeAdapter;Ljava/lang/reflect/Type;Lcom/google/gson/TypeAdapter;Lcom/google/gson/internal/ObjectConstructor;)V
a=0;// 
a=0;//     .line 133
a=0;//     .local v0, "result":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<TT;>;"
a=0;//     #v0=(Reference,Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;);
a=0;//     goto :goto_0
a=0;// .end method
}}
