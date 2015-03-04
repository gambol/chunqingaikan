package com.google.gson; class JsonStreamParser { void a() { int a;
a=0;// .class public final Lcom/google/gson/JsonStreamParser;
a=0;// .super Ljava/lang/Object;
a=0;// .source "JsonStreamParser.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/util/Iterator;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Object;",
a=0;//         "Ljava/util/Iterator",
a=0;//         "<",
a=0;//         "Lcom/google/gson/JsonElement;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final lock:Ljava/lang/Object;
a=0;// 
a=0;// .field private final parser:Lcom/google/gson/stream/JsonReader;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/io/Reader;)V
a=0;//     .locals 2
a=0;//     .param p1, "reader"    # Ljava/io/Reader;
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 69
a=0;//     #p0=(Reference,Lcom/google/gson/JsonStreamParser;);
a=0;//     new-instance v0, Lcom/google/gson/stream/JsonReader;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/stream/JsonReader;);
a=0;//     invoke-direct {v0, p1}, Lcom/google/gson/stream/JsonReader;-><init>(Ljava/io/Reader;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/stream/JsonReader;);
a=0;//     iput-object v0, p0, Lcom/google/gson/JsonStreamParser;->parser:Lcom/google/gson/stream/JsonReader;
a=0;// 
a=0;//     .line 70
a=0;//     iget-object v0, p0, Lcom/google/gson/JsonStreamParser;->parser:Lcom/google/gson/stream/JsonReader;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Lcom/google/gson/stream/JsonReader;->setLenient(Z)V
a=0;// 
a=0;//     .line 71
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Lcom/google/gson/JsonStreamParser;->lock:Ljava/lang/Object;
a=0;// 
a=0;//     .line 72
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "json"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     new-instance v0, Ljava/io/StringReader;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/StringReader;);
a=0;//     invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/StringReader;);
a=0;//     invoke-direct {p0, v0}, Lcom/google/gson/JsonStreamParser;-><init>(Ljava/io/Reader;)V
a=0;// 
a=0;//     .line 62
a=0;//     #p0=(Reference,Lcom/google/gson/JsonStreamParser;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public hasNext()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     iget-object v2, p0, Lcom/google/gson/JsonStreamParser;->lock:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 105
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/google/gson/JsonStreamParser;->parser:Lcom/google/gson/stream/JsonReader;
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/stream/JsonReader;);
a=0;//     invoke-virtual {v1}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget-object v3, Lcom/google/gson/stream/JsonToken;->END_DOCUMENT:Lcom/google/gson/stream/JsonToken;
a=0;//     :try_end_0
a=0;//     .catch Lcom/google/gson/stream/MalformedJsonException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v3=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     if-eq v1, v3, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     #v1=(Boolean);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 106
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v3=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 107
a=0;//     .local v0, "e":Lcom/google/gson/stream/MalformedJsonException;
a=0;//     #v0=(Reference,Lcom/google/gson/stream/MalformedJsonException;);
a=0;//     new-instance v1, Lcom/google/gson/JsonSyntaxException;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/google/gson/JsonSyntaxException;);
a=0;//     invoke-direct {v1, v0}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/JsonSyntaxException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 111
a=0;//     .end local v0    # "e":Lcom/google/gson/stream/MalformedJsonException;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v1
a=0;// 
a=0;//     .line 108
a=0;//     :catch_1
a=0;//     #v0=(Uninit);v1=(Conflicted);v3=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 109
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     new-instance v1, Lcom/google/gson/JsonIOException;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/google/gson/JsonIOException;);
a=0;//     invoke-direct {v1, v0}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/JsonIOException;);
a=0;//     throw v1
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// .end method
a=0;// 
a=0;// .method public next()Lcom/google/gson/JsonElement;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/google/gson/JsonParseException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonStreamParser;->hasNext()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 83
a=0;//     new-instance v1, Ljava/util/NoSuchElementException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/NoSuchElementException;);
a=0;//     invoke-direct {v1}, Ljava/util/NoSuchElementException;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/NoSuchElementException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 87
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v1=(Boolean);
a=0;//     iget-object v1, p0, Lcom/google/gson/JsonStreamParser;->parser:Lcom/google/gson/stream/JsonReader;
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/stream/JsonReader;);
a=0;//     invoke-static {v1}, Lcom/google/gson/internal/Streams;->parse(Lcom/google/gson/stream/JsonReader;)Lcom/google/gson/JsonElement;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Lcom/google/gson/JsonParseException; {:try_start_0 .. :try_end_0} :catch_2
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 88
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 89
a=0;//     .local v0, "e":Ljava/lang/StackOverflowError;
a=0;//     #v0=(Reference,Ljava/lang/StackOverflowError;);
a=0;//     new-instance v1, Lcom/google/gson/JsonParseException;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/google/gson/JsonParseException;);
a=0;//     const-string v2, "Failed parsing JSON source to Json"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2, v0}, Lcom/google/gson/JsonParseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/JsonParseException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 90
a=0;//     .end local v0    # "e":Ljava/lang/StackOverflowError;
a=0;//     :catch_1
a=0;//     #v0=(Uninit);v1=(Conflicted);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 91
a=0;//     .local v0, "e":Ljava/lang/OutOfMemoryError;
a=0;//     #v0=(Reference,Ljava/lang/OutOfMemoryError;);
a=0;//     new-instance v1, Lcom/google/gson/JsonParseException;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/google/gson/JsonParseException;);
a=0;//     const-string v2, "Failed parsing JSON source to Json"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2, v0}, Lcom/google/gson/JsonParseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/JsonParseException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 92
a=0;//     .end local v0    # "e":Ljava/lang/OutOfMemoryError;
a=0;//     :catch_2
a=0;//     #v0=(Uninit);v1=(Conflicted);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 93
a=0;//     .local v0, "e":Lcom/google/gson/JsonParseException;
a=0;//     #v0=(Reference,Lcom/google/gson/JsonParseException;);
a=0;//     invoke-virtual {v0}, Lcom/google/gson/JsonParseException;->getCause()Ljava/lang/Throwable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     instance-of v1, v1, Ljava/io/EOFException;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/util/NoSuchElementException;
a=0;// 
a=0;//     .end local v0    # "e":Lcom/google/gson/JsonParseException;
a=0;//     #v0=(UninitRef,Ljava/util/NoSuchElementException;);
a=0;//     invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic next()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonStreamParser;->next()Lcom/google/gson/JsonElement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/JsonElement;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public remove()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
}}
