package com.google.gson.internal.bind; class TypeAdapters$24 { void a() { int a;
a=0;// .class final Lcom/google/gson/internal/bind/TypeAdapters$24;
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
a=0;//         "Ljava/util/Locale;",
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
a=0;//     .line 605
a=0;//     invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/google/gson/internal/bind/TypeAdapters$24;);
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
a=0;//     .line 605
a=0;//     invoke-virtual {p0, p1}, Lcom/google/gson/internal/bind/TypeAdapters$24;->read(Lcom/google/gson/stream/JsonReader;)Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Locale;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public read(Lcom/google/gson/stream/JsonReader;)Ljava/util/Locale;
a=0;//     .locals 7
a=0;//     .param p1, "in"    # Lcom/google/gson/stream/JsonReader;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 608
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     sget-object v6, Lcom/google/gson/stream/JsonToken;->NULL:Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     #v6=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     if-ne v5, v6, :cond_0
a=0;// 
a=0;//     .line 609
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextNull()V
a=0;// 
a=0;//     .line 610
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 631
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v5
a=0;// 
a=0;//     .line 612
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 613
a=0;//     .local v2, "locale":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/util/StringTokenizer;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/StringTokenizer;);
a=0;//     const-string v5, "_"
a=0;// 
a=0;//     invoke-direct {v3, v2, v5}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 614
a=0;//     .local v3, "tokenizer":Ljava/util/StringTokenizer;
a=0;//     #v3=(Reference,Ljava/util/StringTokenizer;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 615
a=0;//     .local v1, "language":Ljava/lang/String;
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 616
a=0;//     .local v0, "country":Ljava/lang/String;
a=0;//     #v0=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 617
a=0;//     .local v4, "variant":Ljava/lang/String;
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v3}, Ljava/util/StringTokenizer;->hasMoreElements()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 618
a=0;//     invoke-virtual {v3}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 620
a=0;//     :cond_1
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Ljava/util/StringTokenizer;->hasMoreElements()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 621
a=0;//     invoke-virtual {v3}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 623
a=0;//     :cond_2
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Ljava/util/StringTokenizer;->hasMoreElements()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     .line 624
a=0;//     invoke-virtual {v3}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 626
a=0;//     :cond_3
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     if-nez v4, :cond_4
a=0;// 
a=0;//     .line 627
a=0;//     new-instance v5, Ljava/util/Locale;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/Locale;);
a=0;//     invoke-direct {v5, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/Locale;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 628
a=0;//     :cond_4
a=0;//     #v5=(Boolean);
a=0;//     if-nez v4, :cond_5
a=0;// 
a=0;//     .line 629
a=0;//     new-instance v5, Ljava/util/Locale;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/Locale;);
a=0;//     invoke-direct {v5, v1, v0}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/Locale;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 631
a=0;//     :cond_5
a=0;//     #v5=(Boolean);
a=0;//     new-instance v5, Ljava/util/Locale;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/Locale;);
a=0;//     invoke-direct {v5, v1, v0, v4}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/Locale;);
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
a=0;//     .line 605
a=0;//     check-cast p2, Ljava/util/Locale;
a=0;// 
a=0;//     .end local p2    # "x1":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/google/gson/internal/bind/TypeAdapters$24;->write(Lcom/google/gson/stream/JsonWriter;Ljava/util/Locale;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public write(Lcom/google/gson/stream/JsonWriter;Ljava/util/Locale;)V
a=0;//     .locals 1
a=0;//     .param p1, "out"    # Lcom/google/gson/stream/JsonWriter;
a=0;//     .param p2, "value"    # Ljava/util/Locale;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 636
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lcom/google/gson/stream/JsonWriter;->value(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 637
a=0;//     return-void
a=0;// 
a=0;//     .line 636
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-virtual {p2}, Ljava/util/Locale;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
}}
