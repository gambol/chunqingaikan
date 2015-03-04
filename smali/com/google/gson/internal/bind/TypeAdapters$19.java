package com.google.gson.internal.bind; class TypeAdapters$19 { void a() { int a;
a=0;// .class final Lcom/google/gson/internal/bind/TypeAdapters$19;
a=0;// .super Lcom/google/gson/TypeAdapter;
a=0;// .source "TypeAdapters.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/google/gson/internal/bind/TypeAdapters;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/google/gson/TypeAdapter",
a=0;//         "<",
a=0;//         "Ljava/net/URI;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 458
a=0;//     invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/google/gson/internal/bind/TypeAdapters$19;);
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
a=0;//     .line 458
a=0;//     invoke-virtual {p0, p1}, Lcom/google/gson/internal/bind/TypeAdapters$19;->read(Lcom/google/gson/stream/JsonReader;)Ljava/net/URI;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/URI;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public read(Lcom/google/gson/stream/JsonReader;)Ljava/net/URI;
a=0;//     .locals 5
a=0;//     .param p1, "in"    # Lcom/google/gson/stream/JsonReader;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 461
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     sget-object v4, Lcom/google/gson/stream/JsonToken;->NULL:Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     #v4=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     if-ne v3, v4, :cond_1
a=0;// 
a=0;//     .line 462
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextNull()V
a=0;// 
a=0;//     .line 467
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Reference,Ljava/net/URI;);v3=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 466
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v1=(Uninit);v2=(Null);v3=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 467
a=0;//     .local v1, "nextString":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "null"
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     new-instance v2, Ljava/net/URI;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/net/URI;);
a=0;//     invoke-direct {v2, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     #v2=(Reference,Ljava/net/URI;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 468
a=0;//     .end local v1    # "nextString":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 469
a=0;//     .local v0, "e":Ljava/net/URISyntaxException;
a=0;//     #v0=(Reference,Ljava/net/URISyntaxException;);
a=0;//     new-instance v2, Lcom/google/gson/JsonIOException;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/google/gson/JsonIOException;);
a=0;//     invoke-direct {v2, v0}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/google/gson/JsonIOException;);
a=0;//     throw v2
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
a=0;//     .line 458
a=0;//     check-cast p2, Ljava/net/URI;
a=0;// 
a=0;//     .end local p2    # "x1":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/google/gson/internal/bind/TypeAdapters$19;->write(Lcom/google/gson/stream/JsonWriter;Ljava/net/URI;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public write(Lcom/google/gson/stream/JsonWriter;Ljava/net/URI;)V
a=0;//     .locals 1
a=0;//     .param p1, "out"    # Lcom/google/gson/stream/JsonWriter;
a=0;//     .param p2, "value"    # Ljava/net/URI;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 474
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lcom/google/gson/stream/JsonWriter;->value(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 475
a=0;//     return-void
a=0;// 
a=0;//     .line 474
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-virtual {p2}, Ljava/net/URI;->toASCIIString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
}}
