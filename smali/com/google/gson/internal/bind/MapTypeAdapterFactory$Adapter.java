package com.google.gson.internal.bind; class MapTypeAdapterFactory$Adapter { void a() { int a;
a=0;// .class final Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;
a=0;// .super Lcom/google/gson/TypeAdapter;
a=0;// .source "MapTypeAdapterFactory.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/google/gson/internal/bind/MapTypeAdapterFactory;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x12
a=0;//     name = "Adapter"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<K:",
a=0;//         "Ljava/lang/Object;",
a=0;//         "V:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Lcom/google/gson/TypeAdapter",
a=0;//         "<",
a=0;//         "Ljava/util/Map",
a=0;//         "<TK;TV;>;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final constructor:Lcom/google/gson/internal/ObjectConstructor;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/google/gson/internal/ObjectConstructor",
a=0;//             "<+",
a=0;//             "Ljava/util/Map",
a=0;//             "<TK;TV;>;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final keyTypeAdapter:Lcom/google/gson/TypeAdapter;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/google/gson/TypeAdapter",
a=0;//             "<TK;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field final synthetic this$0:Lcom/google/gson/internal/bind/MapTypeAdapterFactory;
a=0;// 
a=0;// .field private final valueTypeAdapter:Lcom/google/gson/TypeAdapter;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/google/gson/TypeAdapter",
a=0;//             "<TV;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/google/gson/internal/bind/MapTypeAdapterFactory;Lcom/google/gson/Gson;Ljava/lang/reflect/Type;Lcom/google/gson/TypeAdapter;Ljava/lang/reflect/Type;Lcom/google/gson/TypeAdapter;Lcom/google/gson/internal/ObjectConstructor;)V
a=0;//     .locals 1
a=0;//     .param p2, "context"    # Lcom/google/gson/Gson;
a=0;//     .param p3, "keyType"    # Ljava/lang/reflect/Type;
a=0;//     .param p5, "valueType"    # Ljava/lang/reflect/Type;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/google/gson/Gson;",
a=0;//             "Ljava/lang/reflect/Type;",
a=0;//             "Lcom/google/gson/TypeAdapter",
a=0;//             "<TK;>;",
a=0;//             "Ljava/lang/reflect/Type;",
a=0;//             "Lcom/google/gson/TypeAdapter",
a=0;//             "<TV;>;",
a=0;//             "Lcom/google/gson/internal/ObjectConstructor",
a=0;//             "<+",
a=0;//             "Ljava/util/Map",
a=0;//             "<TK;TV;>;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     .local p0, "this":Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;, "Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter<TK;TV;>;"
a=0;//     .local p4, "keyTypeAdapter":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<TK;>;"
a=0;//     .local p6, "valueTypeAdapter":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<TV;>;"
a=0;//     .local p7, "constructor":Lcom/google/gson/internal/ObjectConstructor;, "Lcom/google/gson/internal/ObjectConstructor<+Ljava/util/Map<TK;TV;>;>;"
a=0;//     iput-object p1, p0, Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->this$0:Lcom/google/gson/internal/bind/MapTypeAdapterFactory;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V
a=0;// 
a=0;//     .line 153
a=0;//     #p0=(Reference,Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;);
a=0;//     new-instance v0, Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;);
a=0;//     invoke-direct {v0, p2, p4, p3}, Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;-><init>(Lcom/google/gson/Gson;Lcom/google/gson/TypeAdapter;Ljava/lang/reflect/Type;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;);
a=0;//     iput-object v0, p0, Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->keyTypeAdapter:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     .line 155
a=0;//     new-instance v0, Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;);
a=0;//     invoke-direct {v0, p2, p6, p5}, Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;-><init>(Lcom/google/gson/Gson;Lcom/google/gson/TypeAdapter;Ljava/lang/reflect/Type;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;);
a=0;//     iput-object v0, p0, Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->valueTypeAdapter:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     .line 157
a=0;//     iput-object p7, p0, Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->constructor:Lcom/google/gson/internal/ObjectConstructor;
a=0;// 
a=0;//     .line 158
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private keyToString(Lcom/google/gson/JsonElement;)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p1, "keyElement"    # Lcom/google/gson/JsonElement;
a=0;// 
a=0;//     .prologue
a=0;//     .line 246
a=0;//     .local p0, "this":Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;, "Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter<TK;TV;>;"
a=0;//     invoke-virtual {p1}, Lcom/google/gson/JsonElement;->isJsonPrimitive()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 247
a=0;//     invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsJsonPrimitive()Lcom/google/gson/JsonPrimitive;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 248
a=0;//     .local v0, "primitive":Lcom/google/gson/JsonPrimitive;
a=0;//     #v0=(Reference,Lcom/google/gson/JsonPrimitive;);
a=0;//     invoke-virtual {v0}, Lcom/google/gson/JsonPrimitive;->isNumber()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 249
a=0;//     invoke-virtual {v0}, Lcom/google/gson/JsonPrimitive;->getAsNumber()Ljava/lang/Number;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Number;);
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 258
a=0;//     .end local v0    # "primitive":Lcom/google/gson/JsonPrimitive;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 250
a=0;//     .restart local v0    # "primitive":Lcom/google/gson/JsonPrimitive;
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/google/gson/JsonPrimitive;);v1=(Boolean);
a=0;//     invoke-virtual {v0}, Lcom/google/gson/JsonPrimitive;->isBoolean()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 251
a=0;//     invoke-virtual {v0}, Lcom/google/gson/JsonPrimitive;->getAsBoolean()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 252
a=0;//     :cond_1
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v0}, Lcom/google/gson/JsonPrimitive;->isString()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 253
a=0;//     invoke-virtual {v0}, Lcom/google/gson/JsonPrimitive;->getAsString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 255
a=0;//     :cond_2
a=0;//     #v1=(Boolean);
a=0;//     new-instance v1, Ljava/lang/AssertionError;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/AssertionError;);
a=0;//     invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/AssertionError;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 257
a=0;//     .end local v0    # "primitive":Lcom/google/gson/JsonPrimitive;
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Boolean);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/JsonElement;->isJsonNull()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 258
a=0;//     const-string v1, "null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 260
a=0;//     :cond_4
a=0;//     #v1=(Boolean);
a=0;//     new-instance v1, Ljava/lang/AssertionError;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/AssertionError;);
a=0;//     invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/AssertionError;);
a=0;//     throw v1
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
a=0;//     .line 145
a=0;//     .local p0, "this":Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;, "Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter<TK;TV;>;"
a=0;//     invoke-virtual {p0, p1}, Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->read(Lcom/google/gson/stream/JsonReader;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public read(Lcom/google/gson/stream/JsonReader;)Ljava/util/Map;
a=0;//     .locals 8
a=0;//     .param p1, "in"    # Lcom/google/gson/stream/JsonReader;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/google/gson/stream/JsonReader;",
a=0;//             ")",
a=0;//             "Ljava/util/Map",
a=0;//             "<TK;TV;>;"
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
a=0;//     .line 161
a=0;//     .local p0, "this":Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;, "Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter<TK;TV;>;"
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 162
a=0;//     .local v2, "peek":Lcom/google/gson/stream/JsonToken;
a=0;//     #v2=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     sget-object v5, Lcom/google/gson/stream/JsonToken;->NULL:Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     #v5=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     if-ne v2, v5, :cond_0
a=0;// 
a=0;//     .line 163
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextNull()V
a=0;// 
a=0;//     .line 164
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 195
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Map;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 167
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     iget-object v5, p0, Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->constructor:Lcom/google/gson/internal/ObjectConstructor;
a=0;// 
a=0;//     invoke-interface {v5}, Lcom/google/gson/internal/ObjectConstructor;->construct()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/util/Map;
a=0;// 
a=0;//     .line 169
a=0;//     .local v1, "map":Ljava/util/Map;, "Ljava/util/Map<TK;TV;>;"
a=0;//     sget-object v5, Lcom/google/gson/stream/JsonToken;->BEGIN_ARRAY:Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     if-ne v2, v5, :cond_3
a=0;// 
a=0;//     .line 170
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->beginArray()V
a=0;// 
a=0;//     .line 171
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->hasNext()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 172
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->beginArray()V
a=0;// 
a=0;//     .line 173
a=0;//     iget-object v5, p0, Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->keyTypeAdapter:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     #v5=(Reference,Lcom/google/gson/TypeAdapter;);
a=0;//     invoke-virtual {v5, p1}, Lcom/google/gson/TypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 174
a=0;//     .local v0, "key":Ljava/lang/Object;, "TK;"
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v5, p0, Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->valueTypeAdapter:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     invoke-virtual {v5, p1}, Lcom/google/gson/TypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 175
a=0;//     .local v4, "value":Ljava/lang/Object;, "TV;"
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 176
a=0;//     .local v3, "replaced":Ljava/lang/Object;, "TV;"
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 177
a=0;//     new-instance v5, Lcom/google/gson/JsonSyntaxException;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/google/gson/JsonSyntaxException;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "duplicate key: "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v5, v6}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Lcom/google/gson/JsonSyntaxException;);
a=0;//     throw v5
a=0;// 
a=0;//     .line 179
a=0;//     :cond_1
a=0;//     #v6=(Uninit);v7=(Uninit);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->endArray()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 181
a=0;//     .end local v0    # "key":Ljava/lang/Object;, "TK;"
a=0;//     .end local v3    # "replaced":Ljava/lang/Object;, "TV;"
a=0;//     .end local v4    # "value":Ljava/lang/Object;, "TV;"
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Boolean);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->endArray()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 183
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->beginObject()V
a=0;// 
a=0;//     .line 184
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->hasNext()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_5
a=0;// 
a=0;//     .line 185
a=0;//     sget-object v5, Lcom/google/gson/internal/JsonReaderInternalAccess;->INSTANCE:Lcom/google/gson/internal/JsonReaderInternalAccess;
a=0;// 
a=0;//     #v5=(Reference,Lcom/google/gson/internal/JsonReaderInternalAccess;);
a=0;//     invoke-virtual {v5, p1}, Lcom/google/gson/internal/JsonReaderInternalAccess;->promoteNameToValue(Lcom/google/gson/stream/JsonReader;)V
a=0;// 
a=0;//     .line 186
a=0;//     iget-object v5, p0, Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->keyTypeAdapter:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     invoke-virtual {v5, p1}, Lcom/google/gson/TypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 187
a=0;//     .restart local v0    # "key":Ljava/lang/Object;, "TK;"
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v5, p0, Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->valueTypeAdapter:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     invoke-virtual {v5, p1}, Lcom/google/gson/TypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 188
a=0;//     .restart local v4    # "value":Ljava/lang/Object;, "TV;"
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 189
a=0;//     .restart local v3    # "replaced":Ljava/lang/Object;, "TV;"
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 190
a=0;//     new-instance v5, Lcom/google/gson/JsonSyntaxException;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/google/gson/JsonSyntaxException;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "duplicate key: "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v5, v6}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Lcom/google/gson/JsonSyntaxException;);
a=0;//     throw v5
a=0;// 
a=0;//     .line 193
a=0;//     .end local v0    # "key":Ljava/lang/Object;, "TK;"
a=0;//     .end local v3    # "replaced":Ljava/lang/Object;, "TV;"
a=0;//     .end local v4    # "value":Ljava/lang/Object;, "TV;"
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Boolean);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->endObject()V
a=0;// 
a=0;//     goto/16 :goto_0
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
a=0;//     .line 145
a=0;//     .local p0, "this":Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;, "Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter<TK;TV;>;"
a=0;//     check-cast p2, Ljava/util/Map;
a=0;// 
a=0;//     .end local p2    # "x1":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->write(Lcom/google/gson/stream/JsonWriter;Ljava/util/Map;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public write(Lcom/google/gson/stream/JsonWriter;Ljava/util/Map;)V
a=0;//     .locals 9
a=0;//     .param p1, "out"    # Lcom/google/gson/stream/JsonWriter;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/google/gson/stream/JsonWriter;",
a=0;//             "Ljava/util/Map",
a=0;//             "<TK;TV;>;)V"
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
a=0;//     .line 199
a=0;//     .local p0, "this":Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;, "Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter<TK;TV;>;"
a=0;//     .local p2, "map":Ljava/util/Map;, "Ljava/util/Map<TK;TV;>;"
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 200
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->nullValue()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 243
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 204
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     iget-object v7, p0, Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->this$0:Lcom/google/gson/internal/bind/MapTypeAdapterFactory;
a=0;// 
a=0;//     #v7=(Reference,Lcom/google/gson/internal/bind/MapTypeAdapterFactory;);
a=0;//     invoke-static {v7}, Lcom/google/gson/internal/bind/MapTypeAdapterFactory;->access$000(Lcom/google/gson/internal/bind/MapTypeAdapterFactory;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_2
a=0;// 
a=0;//     .line 205
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->beginObject()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 206
a=0;//     invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .local v3, "i$":Ljava/util/Iterator;
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v3=(Reference,Ljava/util/Iterator;);v8=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 207
a=0;//     .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<TK;TV;>;"
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {p1, v7}, Lcom/google/gson/stream/JsonWriter;->name(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 208
a=0;//     iget-object v7, p0, Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->valueTypeAdapter:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v7, p1, v8}, Lcom/google/gson/TypeAdapter;->write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 210
a=0;//     .end local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<TK;TV;>;"
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v7=(Boolean);v8=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->endObject()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 214
a=0;//     .end local v3    # "i$":Ljava/util/Iterator;
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v3=(Uninit);v8=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 215
a=0;//     .local v1, "hasComplexKeys":Z
a=0;//     #v1=(Null);
a=0;//     new-instance v5, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-interface {p2}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     .line 217
a=0;//     .local v5, "keys":Ljava/util/List;, "Ljava/util/List<Lcom/google/gson/JsonElement;>;"
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v6, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-interface {p2}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     .line 218
a=0;//     .local v6, "values":Ljava/util/List;, "Ljava/util/List<TV;>;"
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .restart local v3    # "i$":Ljava/util/Iterator;
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Boolean);v3=(Reference,Ljava/util/Iterator;);v4=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_5
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 219
a=0;//     .restart local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<TK;TV;>;"
a=0;//     iget-object v7, p0, Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->keyTypeAdapter:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     #v7=(Reference,Lcom/google/gson/TypeAdapter;);
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v7, v8}, Lcom/google/gson/TypeAdapter;->toJsonTree(Ljava/lang/Object;)Lcom/google/gson/JsonElement;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 220
a=0;//     .local v4, "keyElement":Lcom/google/gson/JsonElement;
a=0;//     #v4=(Reference,Lcom/google/gson/JsonElement;);
a=0;//     invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 221
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 222
a=0;//     invoke-virtual {v4}, Lcom/google/gson/JsonElement;->isJsonArray()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_3
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/google/gson/JsonElement;->isJsonObject()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     if-eqz v7, :cond_4
a=0;// 
a=0;//     :cond_3
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     :goto_3
a=0;//     or-int/2addr v1, v7
a=0;// 
a=0;//     .line 223
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 222
a=0;//     :cond_4
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 225
a=0;//     .end local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<TK;TV;>;"
a=0;//     .end local v4    # "keyElement":Lcom/google/gson/JsonElement;
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v4=(Conflicted);v7=(Boolean);v8=(Conflicted);
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     .line 226
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->beginArray()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 227
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_4
a=0;//     #v2=(Integer);v7=(Conflicted);
a=0;//     invoke-interface {v5}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ge v2, v7, :cond_6
a=0;// 
a=0;//     .line 228
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->beginArray()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 229
a=0;//     invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Lcom/google/gson/JsonElement;
a=0;// 
a=0;//     invoke-static {v7, p1}, Lcom/google/gson/internal/Streams;->write(Lcom/google/gson/JsonElement;Lcom/google/gson/stream/JsonWriter;)V
a=0;// 
a=0;//     .line 230
a=0;//     iget-object v7, p0, Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->valueTypeAdapter:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v7, p1, v8}, Lcom/google/gson/TypeAdapter;->write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 231
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->endArray()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 227
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 233
a=0;//     :cond_6
a=0;//     #v7=(Integer);v8=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->endArray()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 235
a=0;//     .end local v2    # "i":I
a=0;//     :cond_7
a=0;//     #v2=(Uninit);v7=(Boolean);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->beginObject()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 236
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .restart local v2    # "i":I
a=0;//     :goto_5
a=0;//     #v2=(Integer);v7=(Conflicted);
a=0;//     invoke-interface {v5}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ge v2, v7, :cond_8
a=0;// 
a=0;//     .line 237
a=0;//     invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Lcom/google/gson/JsonElement;
a=0;// 
a=0;//     .line 238
a=0;//     .restart local v4    # "keyElement":Lcom/google/gson/JsonElement;
a=0;//     invoke-direct {p0, v4}, Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->keyToString(Lcom/google/gson/JsonElement;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v7}, Lcom/google/gson/stream/JsonWriter;->name(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 239
a=0;//     iget-object v7, p0, Lcom/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->valueTypeAdapter:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v7, p1, v8}, Lcom/google/gson/TypeAdapter;->write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 236
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 241
a=0;//     .end local v4    # "keyElement":Lcom/google/gson/JsonElement;
a=0;//     :cond_8
a=0;//     #v4=(Conflicted);v7=(Integer);v8=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->endObject()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
