package com.google.gson.internal; class Streams { void a() { int a;
a=0;// .class public final Lcom/google/gson/internal/Streams;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Streams.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/google/gson/internal/Streams$1;,
a=0;//         Lcom/google/gson/internal/Streams$AppendableWriter;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 79
a=0;//     #p0=(Reference,Lcom/google/gson/internal/Streams;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static parse(Lcom/google/gson/stream/JsonReader;)Lcom/google/gson/JsonElement;
a=0;//     .locals 3
a=0;//     .param p0, "reader"    # Lcom/google/gson/stream/JsonReader;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/google/gson/JsonParseException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 42
a=0;//     .local v1, "isEmpty":Z
a=0;//     :try_start_0
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p0}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     .line 43
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 44
a=0;//     #v1=(Null);
a=0;//     sget-object v2, Lcom/google/gson/internal/bind/TypeAdapters;->JSON_ELEMENT:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     #v2=(Reference,Lcom/google/gson/TypeAdapter;);
a=0;//     invoke-virtual {v2, p0}, Lcom/google/gson/TypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Lcom/google/gson/JsonElement;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Lcom/google/gson/stream/MalformedJsonException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
a=0;//     .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_3
a=0;// 
a=0;//     .line 51
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 45
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 50
a=0;//     .local v0, "e":Ljava/io/EOFException;
a=0;//     #v0=(Reference,Ljava/io/EOFException;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 51
a=0;//     sget-object v2, Lcom/google/gson/JsonNull;->INSTANCE:Lcom/google/gson/JsonNull;
a=0;// 
a=0;//     #v2=(Reference,Lcom/google/gson/JsonNull;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 54
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     new-instance v2, Lcom/google/gson/JsonSyntaxException;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/google/gson/JsonSyntaxException;);
a=0;//     invoke-direct {v2, v0}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/google/gson/JsonSyntaxException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 55
a=0;//     .end local v0    # "e":Ljava/io/EOFException;
a=0;//     :catch_1
a=0;//     #v0=(Uninit);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 56
a=0;//     .local v0, "e":Lcom/google/gson/stream/MalformedJsonException;
a=0;//     #v0=(Reference,Lcom/google/gson/stream/MalformedJsonException;);
a=0;//     new-instance v2, Lcom/google/gson/JsonSyntaxException;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/google/gson/JsonSyntaxException;);
a=0;//     invoke-direct {v2, v0}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/google/gson/JsonSyntaxException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 57
a=0;//     .end local v0    # "e":Lcom/google/gson/stream/MalformedJsonException;
a=0;//     :catch_2
a=0;//     #v0=(Uninit);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 58
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     new-instance v2, Lcom/google/gson/JsonIOException;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/google/gson/JsonIOException;);
a=0;//     invoke-direct {v2, v0}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/google/gson/JsonIOException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 59
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     :catch_3
a=0;//     #v0=(Uninit);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 60
a=0;//     .local v0, "e":Ljava/lang/NumberFormatException;
a=0;//     #v0=(Reference,Ljava/lang/NumberFormatException;);
a=0;//     new-instance v2, Lcom/google/gson/JsonSyntaxException;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/google/gson/JsonSyntaxException;);
a=0;//     invoke-direct {v2, v0}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/google/gson/JsonSyntaxException;);
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method public static write(Lcom/google/gson/JsonElement;Lcom/google/gson/stream/JsonWriter;)V
a=0;//     .locals 1
a=0;//     .param p0, "element"    # Lcom/google/gson/JsonElement;
a=0;//     .param p1, "writer"    # Lcom/google/gson/stream/JsonWriter;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     sget-object v0, Lcom/google/gson/internal/bind/TypeAdapters;->JSON_ELEMENT:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/TypeAdapter;);
a=0;//     invoke-virtual {v0, p1, p0}, Lcom/google/gson/TypeAdapter;->write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 69
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static writerForAppendable(Ljava/lang/Appendable;)Ljava/io/Writer;
a=0;//     .locals 2
a=0;//     .param p0, "appendable"    # Ljava/lang/Appendable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 72
a=0;//     instance-of v0, p0, Ljava/io/Writer;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     check-cast p0, Ljava/io/Writer;
a=0;// 
a=0;//     .end local p0    # "appendable":Ljava/lang/Appendable;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .restart local p0    # "appendable":Ljava/lang/Appendable;
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     new-instance v0, Lcom/google/gson/internal/Streams$AppendableWriter;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/Streams$AppendableWriter;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p0, v1}, Lcom/google/gson/internal/Streams$AppendableWriter;-><init>(Ljava/lang/Appendable;Lcom/google/gson/internal/Streams$1;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/Streams$AppendableWriter;);
a=0;//     move-object p0, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
