package com.google.gson.internal.bind; class ObjectTypeAdapter { void a() { int a;
a=0;// .class public final Lcom/google/gson/internal/bind/ObjectTypeAdapter;
a=0;// .super Lcom/google/gson/TypeAdapter;
a=0;// .source "ObjectTypeAdapter.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/google/gson/internal/bind/ObjectTypeAdapter$2;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
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
a=0;// .field private final gson:Lcom/google/gson/Gson;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     new-instance v0, Lcom/google/gson/internal/bind/ObjectTypeAdapter$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/bind/ObjectTypeAdapter$1;);
a=0;//     invoke-direct {v0}, Lcom/google/gson/internal/bind/ObjectTypeAdapter$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/bind/ObjectTypeAdapter$1;);
a=0;//     sput-object v0, Lcom/google/gson/internal/bind/ObjectTypeAdapter;->FACTORY:Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Lcom/google/gson/Gson;)V
a=0;//     .locals 0
a=0;//     .param p1, "gson"    # Lcom/google/gson/Gson;
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V
a=0;// 
a=0;//     .line 51
a=0;//     #p0=(Reference,Lcom/google/gson/internal/bind/ObjectTypeAdapter;);
a=0;//     iput-object p1, p0, Lcom/google/gson/internal/bind/ObjectTypeAdapter;->gson:Lcom/google/gson/Gson;
a=0;// 
a=0;//     .line 52
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/google/gson/Gson;Lcom/google/gson/internal/bind/ObjectTypeAdapter$1;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Lcom/google/gson/Gson;
a=0;//     .param p2, "x1"    # Lcom/google/gson/internal/bind/ObjectTypeAdapter$1;
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     invoke-direct {p0, p1}, Lcom/google/gson/internal/bind/ObjectTypeAdapter;-><init>(Lcom/google/gson/Gson;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/google/gson/internal/bind/ObjectTypeAdapter;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
a=0;//     .locals 5
a=0;//     .param p1, "in"    # Lcom/google/gson/stream/JsonReader;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 56
a=0;//     .local v2, "token":Lcom/google/gson/stream/JsonToken;
a=0;//     #v2=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     sget-object v3, Lcom/google/gson/internal/bind/ObjectTypeAdapter$2;->$SwitchMap$com$google$gson$stream$JsonToken:[I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     invoke-virtual {v2}, Lcom/google/gson/stream/JsonToken;->ordinal()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     aget v3, v3, v4
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     packed-switch v3, :pswitch_data_0
a=0;// 
a=0;//     .line 89
a=0;//     new-instance v3, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     invoke-direct {v3}, Ljava/lang/IllegalStateException;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v3
a=0;// 
a=0;//     .line 58
a=0;//     :pswitch_0
a=0;//     #v3=(Integer);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 59
a=0;//     .local v0, "list":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Object;>;"
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->beginArray()V
a=0;// 
a=0;//     .line 60
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 61
a=0;//     invoke-virtual {p0, p1}, Lcom/google/gson/internal/bind/ObjectTypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 63
a=0;//     :cond_0
a=0;//     #v3=(Boolean);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->endArray()V
a=0;// 
a=0;//     .line 86
a=0;//     .end local v0    # "list":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Object;>;"
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 67
a=0;//     :pswitch_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Integer);v4=(Integer);
a=0;//     new-instance v1, Lcom/google/gson/internal/LinkedTreeMap;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/google/gson/internal/LinkedTreeMap;);
a=0;//     invoke-direct {v1}, Lcom/google/gson/internal/LinkedTreeMap;-><init>()V
a=0;// 
a=0;//     .line 68
a=0;//     .local v1, "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     #v1=(Reference,Lcom/google/gson/internal/LinkedTreeMap;);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->beginObject()V
a=0;// 
a=0;//     .line 69
a=0;//     :goto_2
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 70
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, p1}, Lcom/google/gson/internal/bind/ObjectTypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 72
a=0;//     :cond_1
a=0;//     #v3=(Boolean);v4=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->endObject()V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 73
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 76
a=0;//     .end local v1    # "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     :pswitch_2
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Integer);v4=(Integer);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 79
a=0;//     :pswitch_3
a=0;//     #v0=(Uninit);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextDouble()D
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Double;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 82
a=0;//     :pswitch_4
a=0;//     #v0=(Uninit);v3=(Integer);v4=(Integer);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextBoolean()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 85
a=0;//     :pswitch_5
a=0;//     #v0=(Uninit);v3=(Integer);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextNull()V
a=0;// 
a=0;//     .line 86
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 56
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
a=0;//     .locals 3
a=0;//     .param p1, "out"    # Lcom/google/gson/stream/JsonWriter;
a=0;//     .param p2, "value"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 95
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 96
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->nullValue()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 108
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 100
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/bind/ObjectTypeAdapter;->gson:Lcom/google/gson/Gson;
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/Gson;);
a=0;//     invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1, v2}, Lcom/google/gson/Gson;->getAdapter(Ljava/lang/Class;)Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 101
a=0;//     .local v0, "typeAdapter":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<Ljava/lang/Object;>;"
a=0;//     #v0=(Reference,Lcom/google/gson/TypeAdapter;);
a=0;//     instance-of v1, v0, Lcom/google/gson/internal/bind/ObjectTypeAdapter;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 102
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->beginObject()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 103
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->endObject()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 107
a=0;//     :cond_1
a=0;//     invoke-virtual {v0, p1, p2}, Lcom/google/gson/TypeAdapter;->write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
