package com.google.gson; class TypeAdapter { void a() { int a;
a=0;// .class public abstract Lcom/google/gson/TypeAdapter;
a=0;// .super Ljava/lang/Object;
a=0;// .source "TypeAdapter.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/lang/Object;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 119
a=0;//     .local p0, "this":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<TT;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/google/gson/TypeAdapter;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final fromJson(Ljava/io/Reader;)Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .param p1, "in"    # Ljava/io/Reader;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/io/Reader;",
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
a=0;//     .line 255
a=0;//     .local p0, "this":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<TT;>;"
a=0;//     new-instance v0, Lcom/google/gson/stream/JsonReader;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/stream/JsonReader;);
a=0;//     invoke-direct {v0, p1}, Lcom/google/gson/stream/JsonReader;-><init>(Ljava/io/Reader;)V
a=0;// 
a=0;//     .line 256
a=0;//     .local v0, "reader":Lcom/google/gson/stream/JsonReader;
a=0;//     #v0=(Reference,Lcom/google/gson/stream/JsonReader;);
a=0;//     invoke-virtual {p0, v0}, Lcom/google/gson/TypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public final fromJson(Ljava/lang/String;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "json"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
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
a=0;//     .line 269
a=0;//     .local p0, "this":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<TT;>;"
a=0;//     new-instance v0, Ljava/io/StringReader;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/StringReader;);
a=0;//     invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/StringReader;);
a=0;//     invoke-virtual {p0, v0}, Lcom/google/gson/TypeAdapter;->fromJson(Ljava/io/Reader;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final fromJsonTree(Lcom/google/gson/JsonElement;)Ljava/lang/Object;
a=0;//     .locals 3
a=0;//     .param p1, "jsonTree"    # Lcom/google/gson/JsonElement;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/google/gson/JsonElement;",
a=0;//             ")TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 280
a=0;//     .local p0, "this":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<TT;>;"
a=0;//     :try_start_0
a=0;//     new-instance v1, Lcom/google/gson/internal/bind/JsonTreeReader;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/google/gson/internal/bind/JsonTreeReader;);
a=0;//     invoke-direct {v1, p1}, Lcom/google/gson/internal/bind/JsonTreeReader;-><init>(Lcom/google/gson/JsonElement;)V
a=0;// 
a=0;//     .line 281
a=0;//     .local v1, "jsonReader":Lcom/google/gson/stream/JsonReader;
a=0;//     #v1=(Reference,Lcom/google/gson/internal/bind/JsonTreeReader;);
a=0;//     invoke-virtual {p0, v1}, Lcom/google/gson/TypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 282
a=0;//     .end local v1    # "jsonReader":Lcom/google/gson/stream/JsonReader;
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 283
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
a=0;// .method public final nullSafe()Lcom/google/gson/TypeAdapter;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/google/gson/TypeAdapter",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 186
a=0;//     .local p0, "this":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<TT;>;"
a=0;//     new-instance v0, Lcom/google/gson/TypeAdapter$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/TypeAdapter$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/google/gson/TypeAdapter$1;-><init>(Lcom/google/gson/TypeAdapter;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/TypeAdapter$1;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public abstract read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
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
a=0;// .end method
a=0;// 
a=0;// .method public final toJson(Ljava/lang/Object;)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)",
a=0;//             "Ljava/lang/String;"
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
a=0;//     .line 215
a=0;//     .local p0, "this":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<TT;>;"
a=0;//     .local p1, "value":Ljava/lang/Object;, "TT;"
a=0;//     new-instance v0, Ljava/io/StringWriter;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/StringWriter;);
a=0;//     invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V
a=0;// 
a=0;//     .line 216
a=0;//     .local v0, "stringWriter":Ljava/io/StringWriter;
a=0;//     #v0=(Reference,Ljava/io/StringWriter;);
a=0;//     invoke-virtual {p0, v0, p1}, Lcom/google/gson/TypeAdapter;->toJson(Ljava/io/Writer;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 217
a=0;//     invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public final toJson(Ljava/io/Writer;Ljava/lang/Object;)V
a=0;//     .locals 1
a=0;//     .param p1, "out"    # Ljava/io/Writer;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/io/Writer;",
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
a=0;//     .line 141
a=0;//     .local p0, "this":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<TT;>;"
a=0;//     .local p2, "value":Ljava/lang/Object;, "TT;"
a=0;//     new-instance v0, Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/stream/JsonWriter;);
a=0;//     invoke-direct {v0, p1}, Lcom/google/gson/stream/JsonWriter;-><init>(Ljava/io/Writer;)V
a=0;// 
a=0;//     .line 142
a=0;//     .local v0, "writer":Lcom/google/gson/stream/JsonWriter;
a=0;//     #v0=(Reference,Lcom/google/gson/stream/JsonWriter;);
a=0;//     invoke-virtual {p0, v0, p2}, Lcom/google/gson/TypeAdapter;->write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 143
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final toJsonTree(Ljava/lang/Object;)Lcom/google/gson/JsonElement;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)",
a=0;//             "Lcom/google/gson/JsonElement;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 229
a=0;//     .local p0, "this":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<TT;>;"
a=0;//     .local p1, "value":Ljava/lang/Object;, "TT;"
a=0;//     :try_start_0
a=0;//     new-instance v1, Lcom/google/gson/internal/bind/JsonTreeWriter;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/google/gson/internal/bind/JsonTreeWriter;);
a=0;//     invoke-direct {v1}, Lcom/google/gson/internal/bind/JsonTreeWriter;-><init>()V
a=0;// 
a=0;//     .line 230
a=0;//     .local v1, "jsonWriter":Lcom/google/gson/internal/bind/JsonTreeWriter;
a=0;//     #v1=(Reference,Lcom/google/gson/internal/bind/JsonTreeWriter;);
a=0;//     invoke-virtual {p0, v1, p1}, Lcom/google/gson/TypeAdapter;->write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 231
a=0;//     invoke-virtual {v1}, Lcom/google/gson/internal/bind/JsonTreeWriter;->get()Lcom/google/gson/JsonElement;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/google/gson/JsonElement;);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 232
a=0;//     .end local v1    # "jsonWriter":Lcom/google/gson/internal/bind/JsonTreeWriter;
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 233
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
a=0;// .method public abstract write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
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
a=0;// .end method
}}
