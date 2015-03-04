package com.google.gson.internal.bind; class ReflectiveTypeAdapterFactory$Adapter { void a() { int a;
a=0;// .class public final Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$Adapter;
a=0;// .super Lcom/google/gson/TypeAdapter;
a=0;// .source "ReflectiveTypeAdapterFactory.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x19
a=0;//     name = "Adapter"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Lcom/google/gson/TypeAdapter",
a=0;//         "<TT;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final boundFields:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final constructor:Lcom/google/gson/internal/ObjectConstructor;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/google/gson/internal/ObjectConstructor",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/google/gson/internal/ObjectConstructor;Ljava/util/Map;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/google/gson/internal/ObjectConstructor",
a=0;//             "<TT;>;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 151
a=0;//     .local p0, "this":Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$Adapter;, "Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$Adapter<TT;>;"
a=0;//     .local p1, "constructor":Lcom/google/gson/internal/ObjectConstructor;, "Lcom/google/gson/internal/ObjectConstructor<TT;>;"
a=0;//     .local p2, "boundFields":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;>;"
a=0;//     invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V
a=0;// 
a=0;//     .line 152
a=0;//     #p0=(Reference,Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$Adapter;);
a=0;//     iput-object p1, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$Adapter;->constructor:Lcom/google/gson/internal/ObjectConstructor;
a=0;// 
a=0;//     .line 153
a=0;//     iput-object p2, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$Adapter;->boundFields:Ljava/util/Map;
a=0;// 
a=0;//     .line 154
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/google/gson/internal/ObjectConstructor;Ljava/util/Map;Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Lcom/google/gson/internal/ObjectConstructor;
a=0;//     .param p2, "x1"    # Ljava/util/Map;
a=0;//     .param p3, "x2"    # Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;
a=0;// 
a=0;//     .prologue
a=0;//     .line 147
a=0;//     .local p0, "this":Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$Adapter;, "Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$Adapter<TT;>;"
a=0;//     invoke-direct {p0, p1, p2}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$Adapter;-><init>(Lcom/google/gson/internal/ObjectConstructor;Ljava/util/Map;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$Adapter;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
a=0;//     .locals 6
a=0;//     .param p1, "in"    # Lcom/google/gson/stream/JsonReader;
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
a=0;// 
a=0;//     .prologue
a=0;//     .line 157
a=0;//     .local p0, "this":Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$Adapter;, "Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$Adapter<TT;>;"
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     sget-object v5, Lcom/google/gson/stream/JsonToken;->NULL:Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     #v5=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     if-ne v4, v5, :cond_0
a=0;// 
a=0;//     .line 158
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextNull()V
a=0;// 
a=0;//     .line 159
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 181
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Reference,Ljava/lang/Object;);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 162
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     iget-object v4, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$Adapter;->constructor:Lcom/google/gson/internal/ObjectConstructor;
a=0;// 
a=0;//     invoke-interface {v4}, Lcom/google/gson/internal/ObjectConstructor;->construct()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 165
a=0;//     .local v2, "instance":Ljava/lang/Object;, "TT;"
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->beginObject()V
a=0;// 
a=0;//     .line 166
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->hasNext()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 167
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 168
a=0;//     .local v3, "name":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$Adapter;->boundFields:Ljava/util/Map;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;
a=0;// 
a=0;//     .line 169
a=0;//     .local v1, "field":Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-boolean v4, v1, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;->deserialized:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     .line 170
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->skipValue()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 175
a=0;//     .end local v1    # "field":Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;
a=0;//     .end local v3    # "name":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 176
a=0;//     .local v0, "e":Ljava/lang/IllegalStateException;
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v4, Lcom/google/gson/JsonSyntaxException;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/google/gson/JsonSyntaxException;);
a=0;//     invoke-direct {v4, v0}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/google/gson/JsonSyntaxException;);
a=0;//     throw v4
a=0;// 
a=0;//     .line 172
a=0;//     .end local v0    # "e":Ljava/lang/IllegalStateException;
a=0;//     .restart local v1    # "field":Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;
a=0;//     .restart local v3    # "name":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v1=(Reference,Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;);v3=(Reference,Ljava/lang/String;);v4=(Boolean);
a=0;//     invoke-virtual {v1, p1, v2}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;->read(Lcom/google/gson/stream/JsonReader;Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 177
a=0;//     .end local v1    # "field":Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;
a=0;//     .end local v3    # "name":Ljava/lang/String;
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 178
a=0;//     .local v0, "e":Ljava/lang/IllegalAccessException;
a=0;//     #v0=(Reference,Ljava/lang/IllegalAccessException;);
a=0;//     new-instance v4, Ljava/lang/AssertionError;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/AssertionError;);
a=0;//     invoke-direct {v4, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/AssertionError;);
a=0;//     throw v4
a=0;// 
a=0;//     .line 180
a=0;//     .end local v0    # "e":Ljava/lang/IllegalAccessException;
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v4=(Boolean);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->endObject()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
a=0;//     .locals 4
a=0;//     .param p1, "out"    # Lcom/google/gson/stream/JsonWriter;
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
a=0;// 
a=0;//     .prologue
a=0;//     .line 185
a=0;//     .local p0, "this":Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$Adapter;, "Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$Adapter<TT;>;"
a=0;//     .local p2, "value":Ljava/lang/Object;, "TT;"
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 186
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->nullValue()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 202
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 190
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->beginObject()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 192
a=0;//     :try_start_0
a=0;//     iget-object v3, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$Adapter;->boundFields:Ljava/util/Map;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .local v2, "i$":Ljava/util/Iterator;
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;
a=0;// 
a=0;//     .line 193
a=0;//     .local v0, "boundField":Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;
a=0;//     iget-boolean v3, v0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;->serialized:Z
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 194
a=0;//     iget-object v3, v0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;->name:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v3}, Lcom/google/gson/stream/JsonWriter;->name(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 195
a=0;//     invoke-virtual {v0, p1, p2}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;->write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 198
a=0;//     .end local v0    # "boundField":Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;
a=0;//     .end local v2    # "i$":Ljava/util/Iterator;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 199
a=0;//     .local v1, "e":Ljava/lang/IllegalAccessException;
a=0;//     #v1=(Reference,Ljava/lang/IllegalAccessException;);
a=0;//     new-instance v3, Ljava/lang/AssertionError;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/AssertionError;);
a=0;//     invoke-direct {v3}, Ljava/lang/AssertionError;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/AssertionError;);
a=0;//     throw v3
a=0;// 
a=0;//     .line 201
a=0;//     .end local v1    # "e":Ljava/lang/IllegalAccessException;
a=0;//     .restart local v2    # "i$":Ljava/util/Iterator;
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v2=(Reference,Ljava/util/Iterator;);v3=(Boolean);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->endObject()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
