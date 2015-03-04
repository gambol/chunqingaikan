package com.google.gson.internal.bind; class CollectionTypeAdapterFactory$Adapter { void a() { int a;
a=0;// .class final Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory$Adapter;
a=0;// .super Lcom/google/gson/TypeAdapter;
a=0;// .source "CollectionTypeAdapterFactory.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x1a
a=0;//     name = "Adapter"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<E:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Lcom/google/gson/TypeAdapter",
a=0;//         "<",
a=0;//         "Ljava/util/Collection",
a=0;//         "<TE;>;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final constructor:Lcom/google/gson/internal/ObjectConstructor;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/google/gson/internal/ObjectConstructor",
a=0;//             "<+",
a=0;//             "Ljava/util/Collection",
a=0;//             "<TE;>;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final elementTypeAdapter:Lcom/google/gson/TypeAdapter;
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
a=0;// .method public constructor <init>(Lcom/google/gson/Gson;Ljava/lang/reflect/Type;Lcom/google/gson/TypeAdapter;Lcom/google/gson/internal/ObjectConstructor;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Lcom/google/gson/Gson;
a=0;//     .param p2, "elementType"    # Ljava/lang/reflect/Type;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/google/gson/Gson;",
a=0;//             "Ljava/lang/reflect/Type;",
a=0;//             "Lcom/google/gson/TypeAdapter",
a=0;//             "<TE;>;",
a=0;//             "Lcom/google/gson/internal/ObjectConstructor",
a=0;//             "<+",
a=0;//             "Ljava/util/Collection",
a=0;//             "<TE;>;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     .local p0, "this":Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory$Adapter;, "Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory$Adapter<TE;>;"
a=0;//     .local p3, "elementTypeAdapter":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<TE;>;"
a=0;//     .local p4, "constructor":Lcom/google/gson/internal/ObjectConstructor;, "Lcom/google/gson/internal/ObjectConstructor<+Ljava/util/Collection<TE;>;>;"
a=0;//     invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V
a=0;// 
a=0;//     .line 67
a=0;//     #p0=(Reference,Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory$Adapter;);
a=0;//     new-instance v0, Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;);
a=0;//     invoke-direct {v0, p1, p3, p2}, Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;-><init>(Lcom/google/gson/Gson;Lcom/google/gson/TypeAdapter;Ljava/lang/reflect/Type;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;);
a=0;//     iput-object v0, p0, Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory$Adapter;->elementTypeAdapter:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     .line 69
a=0;//     iput-object p4, p0, Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory$Adapter;->constructor:Lcom/google/gson/internal/ObjectConstructor;
a=0;// 
a=0;//     .line 70
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public bridge synthetic read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "x0"    # Lcom/google/gson/stream/JsonReader;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     .local p0, "this":Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory$Adapter;, "Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory$Adapter<TE;>;"
a=0;//     invoke-virtual {p0, p1}, Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory$Adapter;->read(Lcom/google/gson/stream/JsonReader;)Ljava/util/Collection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Collection;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public read(Lcom/google/gson/stream/JsonReader;)Ljava/util/Collection;
a=0;//     .locals 4
a=0;//     .param p1, "in"    # Lcom/google/gson/stream/JsonReader;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/google/gson/stream/JsonReader;",
a=0;//             ")",
a=0;//             "Ljava/util/Collection",
a=0;//             "<TE;>;"
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
a=0;//     .line 73
a=0;//     .local p0, "this":Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory$Adapter;, "Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory$Adapter<TE;>;"
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     sget-object v3, Lcom/google/gson/stream/JsonToken;->NULL:Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     #v3=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     if-ne v2, v3, :cond_0
a=0;// 
a=0;//     .line 74
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextNull()V
a=0;// 
a=0;//     .line 75
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 85
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/Collection;);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 78
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory$Adapter;->constructor:Lcom/google/gson/internal/ObjectConstructor;
a=0;// 
a=0;//     invoke-interface {v2}, Lcom/google/gson/internal/ObjectConstructor;->construct()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Collection;
a=0;// 
a=0;//     .line 79
a=0;//     .local v0, "collection":Ljava/util/Collection;, "Ljava/util/Collection<TE;>;"
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->beginArray()V
a=0;// 
a=0;//     .line 80
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 81
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory$Adapter;->elementTypeAdapter:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     #v2=(Reference,Lcom/google/gson/TypeAdapter;);
a=0;//     invoke-virtual {v2, p1}, Lcom/google/gson/TypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 82
a=0;//     .local v1, "instance":Ljava/lang/Object;, "TE;"
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 84
a=0;//     .end local v1    # "instance":Ljava/lang/Object;, "TE;"
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Boolean);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->endArray()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Lcom/google/gson/stream/JsonWriter;
a=0;//     .param p2, "x1"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     .local p0, "this":Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory$Adapter;, "Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory$Adapter<TE;>;"
a=0;//     check-cast p2, Ljava/util/Collection;
a=0;// 
a=0;//     .end local p2    # "x1":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory$Adapter;->write(Lcom/google/gson/stream/JsonWriter;Ljava/util/Collection;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public write(Lcom/google/gson/stream/JsonWriter;Ljava/util/Collection;)V
a=0;//     .locals 3
a=0;//     .param p1, "out"    # Lcom/google/gson/stream/JsonWriter;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/google/gson/stream/JsonWriter;",
a=0;//             "Ljava/util/Collection",
a=0;//             "<TE;>;)V"
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
a=0;//     .line 89
a=0;//     .local p0, "this":Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory$Adapter;, "Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory$Adapter<TE;>;"
a=0;//     .local p2, "collection":Ljava/util/Collection;, "Ljava/util/Collection<TE;>;"
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 90
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->nullValue()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 99
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 94
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->beginArray()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 95
a=0;//     invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .local v1, "i$":Ljava/util/Iterator;
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 96
a=0;//     .local v0, "element":Ljava/lang/Object;, "TE;"
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory$Adapter;->elementTypeAdapter:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     #v2=(Reference,Lcom/google/gson/TypeAdapter;);
a=0;//     invoke-virtual {v2, p1, v0}, Lcom/google/gson/TypeAdapter;->write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 98
a=0;//     .end local v0    # "element":Ljava/lang/Object;, "TE;"
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Boolean);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->endArray()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
