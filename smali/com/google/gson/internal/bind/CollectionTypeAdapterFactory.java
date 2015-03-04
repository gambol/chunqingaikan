package com.google.gson.internal.bind; class CollectionTypeAdapterFactory { void a() { int a;
a=0;// .class public final Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory;
a=0;// .super Ljava/lang/Object;
a=0;// .source "CollectionTypeAdapterFactory.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory$Adapter;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final constructorConstructor:Lcom/google/gson/internal/ConstructorConstructor;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/google/gson/internal/ConstructorConstructor;)V
a=0;//     .locals 0
a=0;//     .param p1, "constructorConstructor"    # Lcom/google/gson/internal/ConstructorConstructor;
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 40
a=0;//     #p0=(Reference,Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory;);
a=0;//     iput-object p1, p0, Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory;->constructorConstructor:Lcom/google/gson/internal/ConstructorConstructor;
a=0;// 
a=0;//     .line 41
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
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
a=0;//     .line 44
a=0;//     .local p2, "typeToken":Lcom/google/gson/reflect/TypeToken;, "Lcom/google/gson/reflect/TypeToken<TT;>;"
a=0;//     invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 46
a=0;//     .local v5, "type":Ljava/lang/reflect/Type;
a=0;//     #v5=(Reference,Ljava/lang/reflect/Type;);
a=0;//     invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 47
a=0;//     .local v3, "rawType":Ljava/lang/Class;, "Ljava/lang/Class<-TT;>;"
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     const-class v6, Ljava/util/Collection;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v6, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_0
a=0;// 
a=0;//     .line 48
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 57
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Reference,Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory$Adapter;);v6=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 51
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);v6=(Boolean);
a=0;//     invoke-static {v5, v3}, Lcom/google/gson/internal/$Gson$Types;->getCollectionElementType(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 52
a=0;//     .local v1, "elementType":Ljava/lang/reflect/Type;
a=0;//     #v1=(Reference,Ljava/lang/reflect/Type;);
a=0;//     invoke-static {v1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Lcom/google/gson/reflect/TypeToken;);
a=0;//     invoke-virtual {p1, v6}, Lcom/google/gson/Gson;->getAdapter(Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 53
a=0;//     .local v2, "elementTypeAdapter":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<*>;"
a=0;//     #v2=(Reference,Lcom/google/gson/TypeAdapter;);
a=0;//     iget-object v6, p0, Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory;->constructorConstructor:Lcom/google/gson/internal/ConstructorConstructor;
a=0;// 
a=0;//     invoke-virtual {v6, p2}, Lcom/google/gson/internal/ConstructorConstructor;->get(Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/internal/ObjectConstructor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 56
a=0;//     .local v0, "constructor":Lcom/google/gson/internal/ObjectConstructor;, "Lcom/google/gson/internal/ObjectConstructor<TT;>;"
a=0;//     #v0=(Reference,Lcom/google/gson/internal/ObjectConstructor;);
a=0;//     new-instance v4, Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory$Adapter;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory$Adapter;);
a=0;//     invoke-direct {v4, p1, v1, v2, v0}, Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory$Adapter;-><init>(Lcom/google/gson/Gson;Ljava/lang/reflect/Type;Lcom/google/gson/TypeAdapter;Lcom/google/gson/internal/ObjectConstructor;)V
a=0;// 
a=0;//     .line 57
a=0;//     .local v4, "result":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<TT;>;"
a=0;//     #v4=(Reference,Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory$Adapter;);
a=0;//     goto :goto_0
a=0;// .end method
}}
