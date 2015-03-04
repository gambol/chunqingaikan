package com.google.gson.internal.bind; class ArrayTypeAdapter$1 { void a() { int a;
a=0;// .class final Lcom/google/gson/internal/bind/ArrayTypeAdapter$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ArrayTypeAdapter.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/google/gson/internal/bind/ArrayTypeAdapter;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/google/gson/internal/bind/ArrayTypeAdapter$1;);
a=0;//     return-void
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
a=0;//     .line 42
a=0;//     .local p2, "typeToken":Lcom/google/gson/reflect/TypeToken;, "Lcom/google/gson/reflect/TypeToken<TT;>;"
a=0;//     invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 43
a=0;//     .local v2, "type":Ljava/lang/reflect/Type;
a=0;//     #v2=(Reference,Ljava/lang/reflect/Type;);
a=0;//     instance-of v3, v2, Ljava/lang/reflect/GenericArrayType;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     instance-of v3, v2, Ljava/lang/Class;
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     move-object v3, v2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/reflect/Type;);
a=0;//     check-cast v3, Ljava/lang/Class;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/Class;->isArray()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 44
a=0;//     :cond_0
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 49
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Reference,Lcom/google/gson/internal/bind/ArrayTypeAdapter;);v4=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 47
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Boolean);v4=(Uninit);
a=0;//     invoke-static {v2}, Lcom/google/gson/internal/$Gson$Types;->getArrayComponentType(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 48
a=0;//     .local v0, "componentType":Ljava/lang/reflect/Type;
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     invoke-static {v0}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/google/gson/reflect/TypeToken;);
a=0;//     invoke-virtual {p1, v3}, Lcom/google/gson/Gson;->getAdapter(Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 49
a=0;//     .local v1, "componentTypeAdapter":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<*>;"
a=0;//     #v1=(Reference,Lcom/google/gson/TypeAdapter;);
a=0;//     new-instance v3, Lcom/google/gson/internal/bind/ArrayTypeAdapter;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/google/gson/internal/bind/ArrayTypeAdapter;);
a=0;//     invoke-static {v0}, Lcom/google/gson/internal/$Gson$Types;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v3, p1, v1, v4}, Lcom/google/gson/internal/bind/ArrayTypeAdapter;-><init>(Lcom/google/gson/Gson;Lcom/google/gson/TypeAdapter;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/google/gson/internal/bind/ArrayTypeAdapter;);
a=0;//     goto :goto_0
a=0;// .end method
}}
