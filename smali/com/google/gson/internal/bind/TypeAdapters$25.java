package com.google.gson.internal.bind; class TypeAdapters$25 { void a() { int a;
a=0;// .class final Lcom/google/gson/internal/bind/TypeAdapters$25;
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
a=0;//         "Lcom/google/gson/JsonElement;",
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
a=0;//     .line 642
a=0;//     invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/google/gson/internal/bind/TypeAdapters$25;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public read(Lcom/google/gson/stream/JsonReader;)Lcom/google/gson/JsonElement;
a=0;//     .locals 5
a=0;//     .param p1, "in"    # Lcom/google/gson/stream/JsonReader;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 644
a=0;//     sget-object v3, Lcom/google/gson/internal/bind/TypeAdapters$32;->$SwitchMap$com$google$gson$stream$JsonToken:[I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     invoke-virtual {v4}, Lcom/google/gson/stream/JsonToken;->ordinal()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     aget v3, v3, v4
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     packed-switch v3, :pswitch_data_0
a=0;// 
a=0;//     .line 676
a=0;//     new-instance v3, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     invoke-direct {v3}, Ljava/lang/IllegalArgumentException;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v3
a=0;// 
a=0;//     .line 646
a=0;//     :pswitch_0
a=0;//     #v3=(Integer);
a=0;//     new-instance v0, Lcom/google/gson/JsonPrimitive;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/JsonPrimitive;);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v3}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 670
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 648
a=0;//     :pswitch_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Integer);v4=(Integer);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 649
a=0;//     .local v1, "number":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Lcom/google/gson/JsonPrimitive;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/JsonPrimitive;);
a=0;//     new-instance v3, Lcom/google/gson/internal/LazilyParsedNumber;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/google/gson/internal/LazilyParsedNumber;);
a=0;//     invoke-direct {v3, v1}, Lcom/google/gson/internal/LazilyParsedNumber;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/google/gson/internal/LazilyParsedNumber;);
a=0;//     invoke-direct {v0, v3}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/JsonPrimitive;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 651
a=0;//     .end local v1    # "number":Ljava/lang/String;
a=0;//     :pswitch_2
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Integer);
a=0;//     new-instance v0, Lcom/google/gson/JsonPrimitive;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/JsonPrimitive;);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextBoolean()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-direct {v0, v3}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Boolean;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/JsonPrimitive;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 653
a=0;//     :pswitch_3
a=0;//     #v0=(Uninit);v3=(Integer);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextNull()V
a=0;// 
a=0;//     .line 654
a=0;//     sget-object v0, Lcom/google/gson/JsonNull;->INSTANCE:Lcom/google/gson/JsonNull;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/JsonNull;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 656
a=0;//     :pswitch_4
a=0;//     #v0=(Uninit);
a=0;//     new-instance v0, Lcom/google/gson/JsonArray;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/JsonArray;);
a=0;//     invoke-direct {v0}, Lcom/google/gson/JsonArray;-><init>()V
a=0;// 
a=0;//     .line 657
a=0;//     .local v0, "array":Lcom/google/gson/JsonArray;
a=0;//     #v0=(Reference,Lcom/google/gson/JsonArray;);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->beginArray()V
a=0;// 
a=0;//     .line 658
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 659
a=0;//     invoke-virtual {p0, p1}, Lcom/google/gson/internal/bind/TypeAdapters$25;->read(Lcom/google/gson/stream/JsonReader;)Lcom/google/gson/JsonElement;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/google/gson/JsonElement;);
a=0;//     invoke-virtual {v0, v3}, Lcom/google/gson/JsonArray;->add(Lcom/google/gson/JsonElement;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 661
a=0;//     :cond_0
a=0;//     #v3=(Boolean);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->endArray()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 664
a=0;//     .end local v0    # "array":Lcom/google/gson/JsonArray;
a=0;//     :pswitch_5
a=0;//     #v0=(Uninit);v3=(Integer);
a=0;//     new-instance v2, Lcom/google/gson/JsonObject;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/google/gson/JsonObject;);
a=0;//     invoke-direct {v2}, Lcom/google/gson/JsonObject;-><init>()V
a=0;// 
a=0;//     .line 665
a=0;//     .local v2, "object":Lcom/google/gson/JsonObject;
a=0;//     #v2=(Reference,Lcom/google/gson/JsonObject;);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->beginObject()V
a=0;// 
a=0;//     .line 666
a=0;//     :goto_2
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 667
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, p1}, Lcom/google/gson/internal/bind/TypeAdapters$25;->read(Lcom/google/gson/stream/JsonReader;)Lcom/google/gson/JsonElement;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/google/gson/JsonElement;);
a=0;//     invoke-virtual {v2, v3, v4}, Lcom/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/google/gson/JsonElement;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 669
a=0;//     :cond_1
a=0;//     #v3=(Boolean);v4=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->endObject()V
a=0;// 
a=0;//     move-object v0, v2
a=0;// 
a=0;//     .line 670
a=0;//     #v0=(Reference,Lcom/google/gson/JsonObject;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 644
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_0
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
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
a=0;//     .line 642
a=0;//     invoke-virtual {p0, p1}, Lcom/google/gson/internal/bind/TypeAdapters$25;->read(Lcom/google/gson/stream/JsonReader;)Lcom/google/gson/JsonElement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/JsonElement;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public write(Lcom/google/gson/stream/JsonWriter;Lcom/google/gson/JsonElement;)V
a=0;//     .locals 7
a=0;//     .param p1, "out"    # Lcom/google/gson/stream/JsonWriter;
a=0;//     .param p2, "value"    # Lcom/google/gson/JsonElement;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 681
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     invoke-virtual {p2}, Lcom/google/gson/JsonElement;->isJsonNull()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 682
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->nullValue()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 711
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 683
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Boolean);
a=0;//     invoke-virtual {p2}, Lcom/google/gson/JsonElement;->isJsonPrimitive()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     .line 684
a=0;//     invoke-virtual {p2}, Lcom/google/gson/JsonElement;->getAsJsonPrimitive()Lcom/google/gson/JsonPrimitive;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 685
a=0;//     .local v3, "primitive":Lcom/google/gson/JsonPrimitive;
a=0;//     #v3=(Reference,Lcom/google/gson/JsonPrimitive;);
a=0;//     invoke-virtual {v3}, Lcom/google/gson/JsonPrimitive;->isNumber()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 686
a=0;//     invoke-virtual {v3}, Lcom/google/gson/JsonPrimitive;->getAsNumber()Ljava/lang/Number;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Number;);
a=0;//     invoke-virtual {p1, v4}, Lcom/google/gson/stream/JsonWriter;->value(Ljava/lang/Number;)Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 687
a=0;//     :cond_2
a=0;//     #v4=(Boolean);
a=0;//     invoke-virtual {v3}, Lcom/google/gson/JsonPrimitive;->isBoolean()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 688
a=0;//     invoke-virtual {v3}, Lcom/google/gson/JsonPrimitive;->getAsBoolean()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-virtual {p1, v4}, Lcom/google/gson/stream/JsonWriter;->value(Z)Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 690
a=0;//     :cond_3
a=0;//     invoke-virtual {v3}, Lcom/google/gson/JsonPrimitive;->getAsString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v4}, Lcom/google/gson/stream/JsonWriter;->value(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 693
a=0;//     .end local v3    # "primitive":Lcom/google/gson/JsonPrimitive;
a=0;//     :cond_4
a=0;//     #v3=(Uninit);v4=(Boolean);
a=0;//     invoke-virtual {p2}, Lcom/google/gson/JsonElement;->isJsonArray()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-eqz v4, :cond_6
a=0;// 
a=0;//     .line 694
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->beginArray()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 695
a=0;//     invoke-virtual {p2}, Lcom/google/gson/JsonElement;->getAsJsonArray()Lcom/google/gson/JsonArray;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/google/gson/JsonArray;);
a=0;//     invoke-virtual {v4}, Lcom/google/gson/JsonArray;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .local v2, "i$":Ljava/util/Iterator;
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/util/Iterator;);v4=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/google/gson/JsonElement;
a=0;// 
a=0;//     .line 696
a=0;//     .local v0, "e":Lcom/google/gson/JsonElement;
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/google/gson/internal/bind/TypeAdapters$25;->write(Lcom/google/gson/stream/JsonWriter;Lcom/google/gson/JsonElement;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 698
a=0;//     .end local v0    # "e":Lcom/google/gson/JsonElement;
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->endArray()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 700
a=0;//     .end local v2    # "i$":Ljava/util/Iterator;
a=0;//     :cond_6
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     invoke-virtual {p2}, Lcom/google/gson/JsonElement;->isJsonObject()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-eqz v4, :cond_8
a=0;// 
a=0;//     .line 701
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->beginObject()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 702
a=0;//     invoke-virtual {p2}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/google/gson/JsonObject;);
a=0;//     invoke-virtual {v4}, Lcom/google/gson/JsonObject;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .restart local v2    # "i$":Ljava/util/Iterator;
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_7
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 703
a=0;//     .local v1, "e":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Lcom/google/gson/JsonElement;>;"
a=0;//     invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1, v4}, Lcom/google/gson/stream/JsonWriter;->name(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 704
a=0;//     invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Lcom/google/gson/JsonElement;
a=0;// 
a=0;//     invoke-virtual {p0, p1, v4}, Lcom/google/gson/internal/bind/TypeAdapters$25;->write(Lcom/google/gson/stream/JsonWriter;Lcom/google/gson/JsonElement;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 706
a=0;//     .end local v1    # "e":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Lcom/google/gson/JsonElement;>;"
a=0;//     :cond_7
a=0;//     #v1=(Conflicted);v4=(Boolean);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->endObject()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 709
a=0;//     .end local v2    # "i$":Ljava/util/Iterator;
a=0;//     :cond_8
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v4, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "Couldn\'t write "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v4
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
a=0;//     .line 642
a=0;//     check-cast p2, Lcom/google/gson/JsonElement;
a=0;// 
a=0;//     .end local p2    # "x1":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/google/gson/internal/bind/TypeAdapters$25;->write(Lcom/google/gson/stream/JsonWriter;Lcom/google/gson/JsonElement;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
