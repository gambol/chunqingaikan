package com.google.gson.internal.bind; class TypeAdapterRuntimeTypeWrapper { void a() { int a;
a=0;// .class final Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;
a=0;// .super Lcom/google/gson/TypeAdapter;
a=0;// .source "TypeAdapterRuntimeTypeWrapper.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Lcom/google/gson/TypeAdapter",
a=0;//         "<TT;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final context:Lcom/google/gson/Gson;
a=0;// 
a=0;// .field private final delegate:Lcom/google/gson/TypeAdapter;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/google/gson/TypeAdapter",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final type:Ljava/lang/reflect/Type;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/google/gson/Gson;Lcom/google/gson/TypeAdapter;Ljava/lang/reflect/Type;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Lcom/google/gson/Gson;
a=0;//     .param p3, "type"    # Ljava/lang/reflect/Type;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/google/gson/Gson;",
a=0;//             "Lcom/google/gson/TypeAdapter",
a=0;//             "<TT;>;",
a=0;//             "Ljava/lang/reflect/Type;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     .local p0, "this":Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;, "Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper<TT;>;"
a=0;//     .local p2, "delegate":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<TT;>;"
a=0;//     invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V
a=0;// 
a=0;//     .line 33
a=0;//     #p0=(Reference,Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;);
a=0;//     iput-object p1, p0, Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;->context:Lcom/google/gson/Gson;
a=0;// 
a=0;//     .line 34
a=0;//     iput-object p2, p0, Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;->delegate:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     .line 35
a=0;//     iput-object p3, p0, Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;->type:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     .line 36
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private getRuntimeTypeIfMoreSpecific(Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/reflect/Type;
a=0;//     .locals 1
a=0;//     .param p1, "type"    # Ljava/lang/reflect/Type;
a=0;//     .param p2, "value"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     .local p0, "this":Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;, "Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper<TT;>;"
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     const-class v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     instance-of v0, p1, Ljava/lang/reflect/TypeVariable;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     instance-of v0, p1, Ljava/lang/Class;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 77
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     .line 79
a=0;//     :cond_1
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "in"    # Lcom/google/gson/stream/JsonReader;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/google/gson/stream/JsonReader;",
a=0;//             ")TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     .local p0, "this":Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;, "Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper<TT;>;"
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;->delegate:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/TypeAdapter;);
a=0;//     invoke-virtual {v0, p1}, Lcom/google/gson/TypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
a=0;//     .locals 5
a=0;//     .param p1, "out"    # Lcom/google/gson/stream/JsonWriter;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/google/gson/stream/JsonWriter;",
a=0;//             "TT;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     .local p0, "this":Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;, "Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper<TT;>;"
a=0;//     .local p2, "value":Ljava/lang/Object;, "TT;"
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;->delegate:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     .line 53
a=0;//     .local v0, "chosen":Lcom/google/gson/TypeAdapter;
a=0;//     #v0=(Reference,Lcom/google/gson/TypeAdapter;);
a=0;//     iget-object v3, p0, Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;->type:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/reflect/Type;);
a=0;//     invoke-direct {p0, v3, p2}, Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;->getRuntimeTypeIfMoreSpecific(Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 54
a=0;//     .local v1, "runtimeType":Ljava/lang/reflect/Type;
a=0;//     #v1=(Reference,Ljava/lang/reflect/Type;);
a=0;//     iget-object v3, p0, Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;->type:Ljava/lang/reflect/Type;
a=0;// 
a=0;//     if-eq v1, v3, :cond_0
a=0;// 
a=0;//     .line 55
a=0;//     iget-object v3, p0, Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;->context:Lcom/google/gson/Gson;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/google/gson/reflect/TypeToken;);
a=0;//     invoke-virtual {v3, v4}, Lcom/google/gson/Gson;->getAdapter(Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 56
a=0;//     .local v2, "runtimeTypeAdapter":Lcom/google/gson/TypeAdapter;
a=0;//     #v2=(Reference,Lcom/google/gson/TypeAdapter;);
a=0;//     instance-of v3, v2, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$Adapter;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 58
a=0;//     move-object v0, v2
a=0;// 
a=0;//     .line 68
a=0;//     .end local v2    # "runtimeTypeAdapter":Lcom/google/gson/TypeAdapter;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v0, p1, p2}, Lcom/google/gson/TypeAdapter;->write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 69
a=0;//     return-void
a=0;// 
a=0;//     .line 59
a=0;//     .restart local v2    # "runtimeTypeAdapter":Lcom/google/gson/TypeAdapter;
a=0;//     :cond_1
a=0;//     #v2=(Reference,Lcom/google/gson/TypeAdapter;);v3=(Boolean);v4=(Reference,Lcom/google/gson/reflect/TypeToken;);
a=0;//     iget-object v3, p0, Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;->delegate:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     #v3=(Reference,Lcom/google/gson/TypeAdapter;);
a=0;//     instance-of v3, v3, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$Adapter;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 62
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;->delegate:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 65
a=0;//     :cond_2
a=0;//     move-object v0, v2
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
