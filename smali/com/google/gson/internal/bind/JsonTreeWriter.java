package com.google.gson.internal.bind; class JsonTreeWriter { void a() { int a;
a=0;// .class public final Lcom/google/gson/internal/bind/JsonTreeWriter;
a=0;// .super Lcom/google/gson/stream/JsonWriter;
a=0;// .source "JsonTreeWriter.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final SENTINEL_CLOSED:Lcom/google/gson/JsonPrimitive;
a=0;// 
a=0;// .field private static final UNWRITABLE_WRITER:Ljava/io/Writer;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private pendingName:Ljava/lang/String;
a=0;// 
a=0;// .field private product:Lcom/google/gson/JsonElement;
a=0;// 
a=0;// .field private final stack:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/google/gson/JsonElement;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     new-instance v0, Lcom/google/gson/internal/bind/JsonTreeWriter$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/bind/JsonTreeWriter$1;);
a=0;//     invoke-direct {v0}, Lcom/google/gson/internal/bind/JsonTreeWriter$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/bind/JsonTreeWriter$1;);
a=0;//     sput-object v0, Lcom/google/gson/internal/bind/JsonTreeWriter;->UNWRITABLE_WRITER:Ljava/io/Writer;
a=0;// 
a=0;//     .line 46
a=0;//     new-instance v0, Lcom/google/gson/JsonPrimitive;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/JsonPrimitive;);
a=0;//     const-string v1, "closed"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/JsonPrimitive;);
a=0;//     sput-object v0, Lcom/google/gson/internal/bind/JsonTreeWriter;->SENTINEL_CLOSED:Lcom/google/gson/JsonPrimitive;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     sget-object v0, Lcom/google/gson/internal/bind/JsonTreeWriter;->UNWRITABLE_WRITER:Ljava/io/Writer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/Writer;);
a=0;//     invoke-direct {p0, v0}, Lcom/google/gson/stream/JsonWriter;-><init>(Ljava/io/Writer;)V
a=0;// 
a=0;//     .line 49
a=0;//     #p0=(Reference,Lcom/google/gson/internal/bind/JsonTreeWriter;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/google/gson/internal/bind/JsonTreeWriter;->stack:Ljava/util/List;
a=0;// 
a=0;//     .line 55
a=0;//     sget-object v0, Lcom/google/gson/JsonNull;->INSTANCE:Lcom/google/gson/JsonNull;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/google/gson/internal/bind/JsonTreeWriter;->product:Lcom/google/gson/JsonElement;
a=0;// 
a=0;//     .line 59
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private peek()Lcom/google/gson/JsonElement;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 72
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/bind/JsonTreeWriter;->stack:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/bind/JsonTreeWriter;->stack:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/google/gson/JsonElement;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private put(Lcom/google/gson/JsonElement;)V
a=0;//     .locals 3
a=0;//     .param p1, "value"    # Lcom/google/gson/JsonElement;
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/bind/JsonTreeWriter;->pendingName:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 77
a=0;//     invoke-virtual {p1}, Lcom/google/gson/JsonElement;->isJsonNull()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/google/gson/internal/bind/JsonTreeWriter;->getSerializeNulls()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 78
a=0;//     :cond_0
a=0;//     invoke-direct {p0}, Lcom/google/gson/internal/bind/JsonTreeWriter;->peek()Lcom/google/gson/JsonElement;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/JsonElement;);
a=0;//     check-cast v1, Lcom/google/gson/JsonObject;
a=0;// 
a=0;//     .line 79
a=0;//     .local v1, "object":Lcom/google/gson/JsonObject;
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/bind/JsonTreeWriter;->pendingName:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, p1}, Lcom/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/google/gson/JsonElement;)V
a=0;// 
a=0;//     .line 81
a=0;//     .end local v1    # "object":Lcom/google/gson/JsonObject;
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput-object v2, p0, Lcom/google/gson/internal/bind/JsonTreeWriter;->pendingName:Ljava/lang/String;
a=0;// 
a=0;//     .line 92
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Boolean);
a=0;//     return-void
a=0;// 
a=0;//     .line 82
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/bind/JsonTreeWriter;->stack:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 83
a=0;//     iput-object p1, p0, Lcom/google/gson/internal/bind/JsonTreeWriter;->product:Lcom/google/gson/JsonElement;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 85
a=0;//     :cond_3
a=0;//     invoke-direct {p0}, Lcom/google/gson/internal/bind/JsonTreeWriter;->peek()Lcom/google/gson/JsonElement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 86
a=0;//     .local v0, "element":Lcom/google/gson/JsonElement;
a=0;//     #v0=(Reference,Lcom/google/gson/JsonElement;);
a=0;//     instance-of v2, v0, Lcom/google/gson/JsonArray;
a=0;// 
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 87
a=0;//     check-cast v0, Lcom/google/gson/JsonArray;
a=0;// 
a=0;//     .end local v0    # "element":Lcom/google/gson/JsonElement;
a=0;//     invoke-virtual {v0, p1}, Lcom/google/gson/JsonArray;->add(Lcom/google/gson/JsonElement;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 89
a=0;//     .restart local v0    # "element":Lcom/google/gson/JsonElement;
a=0;//     :cond_4
a=0;//     new-instance v2, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     invoke-direct {v2}, Ljava/lang/IllegalStateException;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public beginArray()Lcom/google/gson/stream/JsonWriter;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 95
a=0;//     new-instance v0, Lcom/google/gson/JsonArray;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/JsonArray;);
a=0;//     invoke-direct {v0}, Lcom/google/gson/JsonArray;-><init>()V
a=0;// 
a=0;//     .line 96
a=0;//     .local v0, "array":Lcom/google/gson/JsonArray;
a=0;//     #v0=(Reference,Lcom/google/gson/JsonArray;);
a=0;//     invoke-direct {p0, v0}, Lcom/google/gson/internal/bind/JsonTreeWriter;->put(Lcom/google/gson/JsonElement;)V
a=0;// 
a=0;//     .line 97
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/bind/JsonTreeWriter;->stack:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 98
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public beginObject()Lcom/google/gson/stream/JsonWriter;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     new-instance v0, Lcom/google/gson/JsonObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/JsonObject;);
a=0;//     invoke-direct {v0}, Lcom/google/gson/JsonObject;-><init>()V
a=0;// 
a=0;//     .line 115
a=0;//     .local v0, "object":Lcom/google/gson/JsonObject;
a=0;//     #v0=(Reference,Lcom/google/gson/JsonObject;);
a=0;//     invoke-direct {p0, v0}, Lcom/google/gson/internal/bind/JsonTreeWriter;->put(Lcom/google/gson/JsonElement;)V
a=0;// 
a=0;//     .line 116
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/bind/JsonTreeWriter;->stack:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 117
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public close()V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 195
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/bind/JsonTreeWriter;->stack:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 196
a=0;//     new-instance v0, Ljava/io/IOException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/IOException;);
a=0;//     const-string v1, "Incomplete document"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 198
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/bind/JsonTreeWriter;->stack:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     sget-object v1, Lcom/google/gson/internal/bind/JsonTreeWriter;->SENTINEL_CLOSED:Lcom/google/gson/JsonPrimitive;
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/JsonPrimitive;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 199
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public endArray()Lcom/google/gson/stream/JsonWriter;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/bind/JsonTreeWriter;->stack:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v1}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/bind/JsonTreeWriter;->pendingName:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 103
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 105
a=0;//     :cond_1
a=0;//     invoke-direct {p0}, Lcom/google/gson/internal/bind/JsonTreeWriter;->peek()Lcom/google/gson/JsonElement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 106
a=0;//     .local v0, "element":Lcom/google/gson/JsonElement;
a=0;//     #v0=(Reference,Lcom/google/gson/JsonElement;);
a=0;//     instance-of v1, v0, Lcom/google/gson/JsonArray;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 107
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/bind/JsonTreeWriter;->stack:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/bind/JsonTreeWriter;->stack:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     invoke-interface {v1, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     .line 108
a=0;//     return-object p0
a=0;// 
a=0;//     .line 110
a=0;//     :cond_2
a=0;//     #v1=(Boolean);v2=(Uninit);
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public endObject()Lcom/google/gson/stream/JsonWriter;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 121
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/bind/JsonTreeWriter;->stack:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v1}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/bind/JsonTreeWriter;->pendingName:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 122
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 124
a=0;//     :cond_1
a=0;//     invoke-direct {p0}, Lcom/google/gson/internal/bind/JsonTreeWriter;->peek()Lcom/google/gson/JsonElement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 125
a=0;//     .local v0, "element":Lcom/google/gson/JsonElement;
a=0;//     #v0=(Reference,Lcom/google/gson/JsonElement;);
a=0;//     instance-of v1, v0, Lcom/google/gson/JsonObject;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 126
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/bind/JsonTreeWriter;->stack:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/bind/JsonTreeWriter;->stack:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     invoke-interface {v1, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     .line 127
a=0;//     return-object p0
a=0;// 
a=0;//     .line 129
a=0;//     :cond_2
a=0;//     #v1=(Boolean);v2=(Uninit);
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public flush()V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 192
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public get()Lcom/google/gson/JsonElement;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/bind/JsonTreeWriter;->stack:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 66
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Expected one JSON element but was "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/bind/JsonTreeWriter;->stack:Ljava/util/List;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 68
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/bind/JsonTreeWriter;->product:Lcom/google/gson/JsonElement;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/JsonElement;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public name(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;
a=0;//     .locals 2
a=0;//     .param p1, "name"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 133
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/bind/JsonTreeWriter;->stack:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v1}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/bind/JsonTreeWriter;->pendingName:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 134
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 136
a=0;//     :cond_1
a=0;//     invoke-direct {p0}, Lcom/google/gson/internal/bind/JsonTreeWriter;->peek()Lcom/google/gson/JsonElement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 137
a=0;//     .local v0, "element":Lcom/google/gson/JsonElement;
a=0;//     #v0=(Reference,Lcom/google/gson/JsonElement;);
a=0;//     instance-of v1, v0, Lcom/google/gson/JsonObject;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 138
a=0;//     iput-object p1, p0, Lcom/google/gson/internal/bind/JsonTreeWriter;->pendingName:Ljava/lang/String;
a=0;// 
a=0;//     .line 139
a=0;//     return-object p0
a=0;// 
a=0;//     .line 141
a=0;//     :cond_2
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public nullValue()Lcom/google/gson/stream/JsonWriter;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 153
a=0;//     sget-object v0, Lcom/google/gson/JsonNull;->INSTANCE:Lcom/google/gson/JsonNull;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/JsonNull;);
a=0;//     invoke-direct {p0, v0}, Lcom/google/gson/internal/bind/JsonTreeWriter;->put(Lcom/google/gson/JsonElement;)V
a=0;// 
a=0;//     .line 154
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public value(D)Lcom/google/gson/stream/JsonWriter;
a=0;//     .locals 3
a=0;//     .param p1, "value"    # D
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 163
a=0;//     invoke-virtual {p0}, Lcom/google/gson/internal/bind/JsonTreeWriter;->isLenient()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {p1, p2}, Ljava/lang/Double;->isInfinite(D)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 164
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
a=0;//     const-string v2, "JSON forbids NaN and infinities: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
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
a=0;//     .line 166
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v0, Lcom/google/gson/JsonPrimitive;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/JsonPrimitive;);
a=0;//     invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Double;);
a=0;//     invoke-direct {v0, v1}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/JsonPrimitive;);
a=0;//     invoke-direct {p0, v0}, Lcom/google/gson/internal/bind/JsonTreeWriter;->put(Lcom/google/gson/JsonElement;)V
a=0;// 
a=0;//     .line 167
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public value(J)Lcom/google/gson/stream/JsonWriter;
a=0;//     .locals 2
a=0;//     .param p1, "value"    # J
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 171
a=0;//     new-instance v0, Lcom/google/gson/JsonPrimitive;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/JsonPrimitive;);
a=0;//     invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Long;);
a=0;//     invoke-direct {v0, v1}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/JsonPrimitive;);
a=0;//     invoke-direct {p0, v0}, Lcom/google/gson/internal/bind/JsonTreeWriter;->put(Lcom/google/gson/JsonElement;)V
a=0;// 
a=0;//     .line 172
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public value(Ljava/lang/Number;)Lcom/google/gson/stream/JsonWriter;
a=0;//     .locals 5
a=0;//     .param p1, "value"    # Ljava/lang/Number;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 176
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 177
a=0;//     invoke-virtual {p0}, Lcom/google/gson/internal/bind/JsonTreeWriter;->nullValue()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     .line 188
a=0;//     .end local p0    # "this":Lcom/google/gson/internal/bind/JsonTreeWriter;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 180
a=0;//     .restart local p0    # "this":Lcom/google/gson/internal/bind/JsonTreeWriter;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/google/gson/internal/bind/JsonTreeWriter;->isLenient()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 181
a=0;//     invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 182
a=0;//     .local v0, "d":D
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 183
a=0;//     :cond_1
a=0;//     new-instance v2, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "JSON forbids NaN and infinities: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 187
a=0;//     .end local v0    # "d":D
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Uninit);v4=(Uninit);
a=0;//     new-instance v2, Lcom/google/gson/JsonPrimitive;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/google/gson/JsonPrimitive;);
a=0;//     invoke-direct {v2, p1}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/google/gson/JsonPrimitive;);
a=0;//     invoke-direct {p0, v2}, Lcom/google/gson/internal/bind/JsonTreeWriter;->put(Lcom/google/gson/JsonElement;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public value(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;
a=0;//     .locals 1
a=0;//     .param p1, "value"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 145
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 146
a=0;//     invoke-virtual {p0}, Lcom/google/gson/internal/bind/JsonTreeWriter;->nullValue()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     .line 149
a=0;//     .end local p0    # "this":Lcom/google/gson/internal/bind/JsonTreeWriter;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 148
a=0;//     .restart local p0    # "this":Lcom/google/gson/internal/bind/JsonTreeWriter;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     new-instance v0, Lcom/google/gson/JsonPrimitive;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/JsonPrimitive;);
a=0;//     invoke-direct {v0, p1}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/JsonPrimitive;);
a=0;//     invoke-direct {p0, v0}, Lcom/google/gson/internal/bind/JsonTreeWriter;->put(Lcom/google/gson/JsonElement;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public value(Z)Lcom/google/gson/stream/JsonWriter;
a=0;//     .locals 2
a=0;//     .param p1, "value"    # Z
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 158
a=0;//     new-instance v0, Lcom/google/gson/JsonPrimitive;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/JsonPrimitive;);
a=0;//     invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-direct {v0, v1}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Boolean;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/JsonPrimitive;);
a=0;//     invoke-direct {p0, v0}, Lcom/google/gson/internal/bind/JsonTreeWriter;->put(Lcom/google/gson/JsonElement;)V
a=0;// 
a=0;//     .line 159
a=0;//     return-object p0
a=0;// .end method
}}
