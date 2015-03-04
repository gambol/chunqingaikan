package com.google.gson.internal.bind; class TimeTypeAdapter { void a() { int a;
a=0;// .class public final Lcom/google/gson/internal/bind/TimeTypeAdapter;
a=0;// .super Lcom/google/gson/TypeAdapter;
a=0;// .source "TimeTypeAdapter.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/google/gson/TypeAdapter",
a=0;//         "<",
a=0;//         "Ljava/sql/Time;",
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
a=0;// .field private final format:Ljava/text/DateFormat;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     new-instance v0, Lcom/google/gson/internal/bind/TimeTypeAdapter$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/bind/TimeTypeAdapter$1;);
a=0;//     invoke-direct {v0}, Lcom/google/gson/internal/bind/TimeTypeAdapter$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/bind/TimeTypeAdapter$1;);
a=0;//     sput-object v0, Lcom/google/gson/internal/bind/TimeTypeAdapter;->FACTORY:Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V
a=0;// 
a=0;//     .line 48
a=0;//     #p0=(Reference,Lcom/google/gson/internal/bind/TimeTypeAdapter;);
a=0;//     new-instance v0, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v1, "hh:mm:ss a"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     iput-object v0, p0, Lcom/google/gson/internal/bind/TimeTypeAdapter;->format:Ljava/text/DateFormat;
a=0;// 
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
a=0;//     .line 40
a=0;//     invoke-virtual {p0, p1}, Lcom/google/gson/internal/bind/TimeTypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Ljava/sql/Time;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/sql/Time;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized read(Lcom/google/gson/stream/JsonReader;)Ljava/sql/Time;
a=0;//     .locals 5
a=0;//     .param p1, "in"    # Lcom/google/gson/stream/JsonReader;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
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
a=0;//     .line 52
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextNull()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 53
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 57
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v2
a=0;// 
a=0;//     .line 56
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v3=(Reference,Lcom/google/gson/stream/JsonToken;);v4=(Uninit);
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/bind/TimeTypeAdapter;->format:Ljava/text/DateFormat;
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 57
a=0;//     .local v0, "date":Ljava/util/Date;
a=0;//     #v0=(Reference,Ljava/util/Date;);
a=0;//     new-instance v2, Ljava/sql/Time;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/sql/Time;);
a=0;//     invoke-virtual {v0}, Ljava/util/Date;->getTime()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-direct {v2, v3, v4}, Ljava/sql/Time;-><init>(J)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     #v2=(Reference,Ljava/sql/Time;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 58
a=0;//     .end local v0    # "date":Ljava/util/Date;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 59
a=0;//     .local v1, "e":Ljava/text/ParseException;
a=0;//     :try_start_2
a=0;//     #v1=(Reference,Ljava/text/ParseException;);
a=0;//     new-instance v2, Lcom/google/gson/JsonSyntaxException;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/google/gson/JsonSyntaxException;);
a=0;//     invoke-direct {v2, v1}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/google/gson/JsonSyntaxException;);
a=0;//     throw v2
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 51
a=0;//     .end local v1    # "e":Ljava/text/ParseException;
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
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
a=0;//     .line 40
a=0;//     check-cast p2, Ljava/sql/Time;
a=0;// 
a=0;//     .end local p2    # "x1":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/google/gson/internal/bind/TimeTypeAdapter;->write(Lcom/google/gson/stream/JsonWriter;Ljava/sql/Time;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized write(Lcom/google/gson/stream/JsonWriter;Ljava/sql/Time;)V
a=0;//     .locals 1
a=0;//     .param p1, "out"    # Lcom/google/gson/stream/JsonWriter;
a=0;//     .param p2, "value"    # Ljava/sql/Time;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     monitor-enter p0
a=0;// 
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lcom/google/gson/stream/JsonWriter;->value(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 65
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 64
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/bind/TimeTypeAdapter;->format:Ljava/text/DateFormat;
a=0;// 
a=0;//     #v0=(Reference,Ljava/text/DateFormat;);
a=0;//     invoke-virtual {v0, p2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
