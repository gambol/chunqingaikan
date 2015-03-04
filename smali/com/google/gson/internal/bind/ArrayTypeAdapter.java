package com.google.gson.internal.bind; class ArrayTypeAdapter { void a() { int a;
a=0;// .class public final Lcom/google/gson/internal/bind/ArrayTypeAdapter;
a=0;// .super Lcom/google/gson/TypeAdapter;
a=0;// .source "ArrayTypeAdapter.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<E:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Lcom/google/gson/TypeAdapter",
a=0;//         "<",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final FACTORY:Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final componentType:Ljava/lang/Class;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/lang/Class",
a=0;//             "<TE;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final componentTypeAdapter:Lcom/google/gson/TypeAdapter;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/google/gson/TypeAdapter",
a=0;//             "<TE;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     new-instance v0, Lcom/google/gson/internal/bind/ArrayTypeAdapter$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/bind/ArrayTypeAdapter$1;);
a=0;//     invoke-direct {v0}, Lcom/google/gson/internal/bind/ArrayTypeAdapter$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/bind/ArrayTypeAdapter$1;);
a=0;//     sput-object v0, Lcom/google/gson/internal/bind/ArrayTypeAdapter;->FACTORY:Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/google/gson/Gson;Lcom/google/gson/TypeAdapter;Ljava/lang/Class;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Lcom/google/gson/Gson;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/google/gson/Gson;",
a=0;//             "Lcom/google/gson/TypeAdapter",
a=0;//             "<TE;>;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TE;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     .local p0, "this":Lcom/google/gson/internal/bind/ArrayTypeAdapter;, "Lcom/google/gson/internal/bind/ArrayTypeAdapter<TE;>;"
a=0;//     .local p2, "componentTypeAdapter":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<TE;>;"
a=0;//     .local p3, "componentType":Ljava/lang/Class;, "Ljava/lang/Class<TE;>;"
a=0;//     invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V
a=0;// 
a=0;//     .line 58
a=0;//     #p0=(Reference,Lcom/google/gson/internal/bind/ArrayTypeAdapter;);
a=0;//     new-instance v0, Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;);
a=0;//     invoke-direct {v0, p1, p2, p3}, Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;-><init>(Lcom/google/gson/Gson;Lcom/google/gson/TypeAdapter;Ljava/lang/reflect/Type;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;);
a=0;//     iput-object v0, p0, Lcom/google/gson/internal/bind/ArrayTypeAdapter;->componentTypeAdapter:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     .line 60
a=0;//     iput-object p3, p0, Lcom/google/gson/internal/bind/ArrayTypeAdapter;->componentType:Ljava/lang/Class;
a=0;// 
a=0;//     .line 61
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
a=0;//     .locals 6
a=0;//     .param p1, "in"    # Lcom/google/gson/stream/JsonReader;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     .local p0, "this":Lcom/google/gson/internal/bind/ArrayTypeAdapter;, "Lcom/google/gson/internal/bind/ArrayTypeAdapter<TE;>;"
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     sget-object v5, Lcom/google/gson/stream/JsonToken;->NULL:Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     #v5=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     if-ne v4, v5, :cond_1
a=0;// 
a=0;//     .line 65
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextNull()V
a=0;// 
a=0;//     .line 66
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 80
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 69
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Reference,Lcom/google/gson/stream/JsonToken;);v5=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 70
a=0;//     .local v3, "list":Ljava/util/List;, "Ljava/util/List<TE;>;"
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->beginArray()V
a=0;// 
a=0;//     .line 71
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->hasNext()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 72
a=0;//     iget-object v4, p0, Lcom/google/gson/internal/bind/ArrayTypeAdapter;->componentTypeAdapter:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     #v4=(Reference,Lcom/google/gson/TypeAdapter;);
a=0;//     invoke-virtual {v4, p1}, Lcom/google/gson/TypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 73
a=0;//     .local v2, "instance":Ljava/lang/Object;, "TE;"
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 75
a=0;//     .end local v2    # "instance":Ljava/lang/Object;, "TE;"
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v4=(Boolean);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->endArray()V
a=0;// 
a=0;//     .line 76
a=0;//     iget-object v4, p0, Lcom/google/gson/internal/bind/ArrayTypeAdapter;->componentType:Ljava/lang/Class;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v4, v5}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 77
a=0;//     .local v0, "array":Ljava/lang/Object;
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_1
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ge v1, v4, :cond_0
a=0;// 
a=0;//     .line 78
a=0;//     invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1, v4}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 77
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
a=0;//     .locals 4
a=0;//     .param p1, "out"    # Lcom/google/gson/stream/JsonWriter;
a=0;//     .param p2, "array"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     .local p0, "this":Lcom/google/gson/internal/bind/ArrayTypeAdapter;, "Lcom/google/gson/internal/bind/ArrayTypeAdapter<TE;>;"
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 86
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->nullValue()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 96
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 90
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->beginArray()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 91
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     #v0=(Null);
a=0;//     invoke-static {p2}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .local v1, "length":I
a=0;//     :goto_1
a=0;//     #v0=(Integer);v1=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     if-ge v0, v1, :cond_1
a=0;// 
a=0;//     .line 92
a=0;//     invoke-static {p2, v0}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 93
a=0;//     .local v2, "value":Ljava/lang/Object;, "TE;"
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v3, p0, Lcom/google/gson/internal/bind/ArrayTypeAdapter;->componentTypeAdapter:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     #v3=(Reference,Lcom/google/gson/TypeAdapter;);
a=0;//     invoke-virtual {v3, p1, v2}, Lcom/google/gson/TypeAdapter;->write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 91
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 95
a=0;//     .end local v2    # "value":Ljava/lang/Object;, "TE;"
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->endArray()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
