package com.google.gson; class JsonParser { void a() { int a;
a=0;// .class public final Lcom/google/gson/JsonParser;
a=0;// .super Ljava/lang/Object;
a=0;// .source "JsonParser.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/google/gson/JsonParser;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public parse(Lcom/google/gson/stream/JsonReader;)Lcom/google/gson/JsonElement;
a=0;//     .locals 5
a=0;//     .param p1, "json"    # Lcom/google/gson/stream/JsonReader;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/google/gson/JsonIOException;,
a=0;//             Lcom/google/gson/JsonSyntaxException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->isLenient()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 82
a=0;//     .local v1, "lenient":Z
a=0;//     #v1=(Boolean);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {p1, v2}, Lcom/google/gson/stream/JsonReader;->setLenient(Z)V
a=0;// 
a=0;//     .line 84
a=0;//     :try_start_0
a=0;//     invoke-static {p1}, Lcom/google/gson/internal/Streams;->parse(Lcom/google/gson/stream/JsonReader;)Lcom/google/gson/JsonElement;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 90
a=0;//     #v2=(Reference,Lcom/google/gson/JsonElement;);
a=0;//     invoke-virtual {p1, v1}, Lcom/google/gson/stream/JsonReader;->setLenient(Z)V
a=0;// 
a=0;//     return-object v2
a=0;// 
a=0;//     .line 85
a=0;//     :catch_0
a=0;//     #v2=(One);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 86
a=0;//     .local v0, "e":Ljava/lang/StackOverflowError;
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/StackOverflowError;);
a=0;//     new-instance v2, Lcom/google/gson/JsonParseException;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/google/gson/JsonParseException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Failed parsing JSON source: "
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
a=0;//     const-string v4, " to Json"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3, v0}, Lcom/google/gson/JsonParseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/google/gson/JsonParseException;);
a=0;//     throw v2
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 90
a=0;//     .end local v0    # "e":Ljava/lang/StackOverflowError;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {p1, v1}, Lcom/google/gson/stream/JsonReader;->setLenient(Z)V
a=0;// 
a=0;//     throw v2
a=0;// 
a=0;//     .line 87
a=0;//     :catch_1
a=0;//     #v0=(Uninit);v2=(One);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 88
a=0;//     .local v0, "e":Ljava/lang/OutOfMemoryError;
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/lang/OutOfMemoryError;);
a=0;//     new-instance v2, Lcom/google/gson/JsonParseException;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/google/gson/JsonParseException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Failed parsing JSON source: "
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
a=0;//     const-string v4, " to Json"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3, v0}, Lcom/google/gson/JsonParseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/google/gson/JsonParseException;);
a=0;//     throw v2
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// .end method
a=0;// 
a=0;// .method public parse(Ljava/io/Reader;)Lcom/google/gson/JsonElement;
a=0;//     .locals 5
a=0;//     .param p1, "json"    # Ljava/io/Reader;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/google/gson/JsonIOException;,
a=0;//             Lcom/google/gson/JsonSyntaxException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     :try_start_0
a=0;//     new-instance v2, Lcom/google/gson/stream/JsonReader;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/google/gson/stream/JsonReader;);
a=0;//     invoke-direct {v2, p1}, Lcom/google/gson/stream/JsonReader;-><init>(Ljava/io/Reader;)V
a=0;// 
a=0;//     .line 59
a=0;//     .local v2, "jsonReader":Lcom/google/gson/stream/JsonReader;
a=0;//     #v2=(Reference,Lcom/google/gson/stream/JsonReader;);
a=0;//     invoke-virtual {p0, v2}, Lcom/google/gson/JsonParser;->parse(Lcom/google/gson/stream/JsonReader;)Lcom/google/gson/JsonElement;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 60
a=0;//     .local v1, "element":Lcom/google/gson/JsonElement;
a=0;//     #v1=(Reference,Lcom/google/gson/JsonElement;);
a=0;//     invoke-virtual {v1}, Lcom/google/gson/JsonElement;->isJsonNull()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     sget-object v4, Lcom/google/gson/stream/JsonToken;->END_DOCUMENT:Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     #v4=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     if-eq v3, v4, :cond_0
a=0;// 
a=0;//     .line 61
a=0;//     new-instance v3, Lcom/google/gson/JsonSyntaxException;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/google/gson/JsonSyntaxException;);
a=0;//     const-string v4, "Did not consume the entire document."
a=0;// 
a=0;//     invoke-direct {v3, v4}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/google/gson/JsonSyntaxException;);
a=0;//     throw v3
a=0;//     :try_end_0
a=0;//     .catch Lcom/google/gson/stream/MalformedJsonException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_2
a=0;// 
a=0;//     .line 64
a=0;//     .end local v1    # "element":Lcom/google/gson/JsonElement;
a=0;//     .end local v2    # "jsonReader":Lcom/google/gson/stream/JsonReader;
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 65
a=0;//     .local v0, "e":Lcom/google/gson/stream/MalformedJsonException;
a=0;//     #v0=(Reference,Lcom/google/gson/stream/MalformedJsonException;);
a=0;//     new-instance v3, Lcom/google/gson/JsonSyntaxException;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/google/gson/JsonSyntaxException;);
a=0;//     invoke-direct {v3, v0}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/google/gson/JsonSyntaxException;);
a=0;//     throw v3
a=0;// 
a=0;//     .line 66
a=0;//     .end local v0    # "e":Lcom/google/gson/stream/MalformedJsonException;
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 67
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     new-instance v3, Lcom/google/gson/JsonIOException;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/google/gson/JsonIOException;);
a=0;//     invoke-direct {v3, v0}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/google/gson/JsonIOException;);
a=0;//     throw v3
a=0;// 
a=0;//     .line 68
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 69
a=0;//     .local v0, "e":Ljava/lang/NumberFormatException;
a=0;//     #v0=(Reference,Ljava/lang/NumberFormatException;);
a=0;//     new-instance v3, Lcom/google/gson/JsonSyntaxException;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/google/gson/JsonSyntaxException;);
a=0;//     invoke-direct {v3, v0}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/google/gson/JsonSyntaxException;);
a=0;//     throw v3
a=0;// 
a=0;//     .line 63
a=0;//     .end local v0    # "e":Ljava/lang/NumberFormatException;
a=0;//     .restart local v1    # "element":Lcom/google/gson/JsonElement;
a=0;//     .restart local v2    # "jsonReader":Lcom/google/gson/stream/JsonReader;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Reference,Lcom/google/gson/JsonElement;);v2=(Reference,Lcom/google/gson/stream/JsonReader;);v3=(Conflicted);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public parse(Ljava/lang/String;)Lcom/google/gson/JsonElement;
a=0;//     .locals 1
a=0;//     .param p1, "json"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/google/gson/JsonSyntaxException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     new-instance v0, Ljava/io/StringReader;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/StringReader;);
a=0;//     invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/StringReader;);
a=0;//     invoke-virtual {p0, v0}, Lcom/google/gson/JsonParser;->parse(Ljava/io/Reader;)Lcom/google/gson/JsonElement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
