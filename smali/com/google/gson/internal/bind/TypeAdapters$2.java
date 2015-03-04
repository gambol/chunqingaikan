package com.google.gson.internal.bind; class TypeAdapters$2 { void a() { int a;
a=0;// .class final Lcom/google/gson/internal/bind/TypeAdapters$2;
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
a=0;//         "Ljava/util/BitSet;",
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
a=0;//     .line 84
a=0;//     invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/google/gson/internal/bind/TypeAdapters$2;);
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
a=0;//     .line 84
a=0;//     invoke-virtual {p0, p1}, Lcom/google/gson/internal/bind/TypeAdapters$2;->read(Lcom/google/gson/stream/JsonReader;)Ljava/util/BitSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/BitSet;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public read(Lcom/google/gson/stream/JsonReader;)Ljava/util/BitSet;
a=0;//     .locals 10
a=0;//     .param p1, "in"    # Lcom/google/gson/stream/JsonReader;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 86
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     sget-object v9, Lcom/google/gson/stream/JsonToken;->NULL:Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     #v9=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     if-ne v8, v9, :cond_0
a=0;// 
a=0;//     .line 87
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextNull()V
a=0;// 
a=0;//     .line 88
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 123
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/BitSet;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v9=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 91
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v9=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     new-instance v0, Ljava/util/BitSet;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/BitSet;);
a=0;//     invoke-direct {v0}, Ljava/util/BitSet;-><init>()V
a=0;// 
a=0;//     .line 92
a=0;//     .local v0, "bitset":Ljava/util/BitSet;
a=0;//     #v0=(Reference,Ljava/util/BitSet;);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->beginArray()V
a=0;// 
a=0;//     .line 93
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 94
a=0;//     .local v2, "i":I
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 95
a=0;//     .local v5, "tokenType":Lcom/google/gson/stream/JsonToken;
a=0;//     :goto_1
a=0;//     #v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Reference,Lcom/google/gson/stream/JsonToken;);v8=(Conflicted);v9=(Conflicted);
a=0;//     sget-object v8, Lcom/google/gson/stream/JsonToken;->END_ARRAY:Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     #v8=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     if-eq v5, v8, :cond_4
a=0;// 
a=0;//     .line 97
a=0;//     sget-object v8, Lcom/google/gson/internal/bind/TypeAdapters$32;->$SwitchMap$com$google$gson$stream$JsonToken:[I
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/google/gson/stream/JsonToken;->ordinal()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     aget v8, v8, v9
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     packed-switch v8, :pswitch_data_0
a=0;// 
a=0;//     .line 114
a=0;//     new-instance v6, Lcom/google/gson/JsonSyntaxException;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/google/gson/JsonSyntaxException;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "Invalid bitset value type: "
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v6, v7}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Lcom/google/gson/JsonSyntaxException;);
a=0;//     throw v6
a=0;// 
a=0;//     .line 99
a=0;//     :pswitch_0
a=0;//     #v6=(One);v7=(Null);v8=(Integer);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextInt()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     if-eqz v8, :cond_2
a=0;// 
a=0;//     move v3, v6
a=0;// 
a=0;//     .line 116
a=0;//     .local v3, "set":Z
a=0;//     :goto_2
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 117
a=0;//     invoke-virtual {v0, v2}, Ljava/util/BitSet;->set(I)V
a=0;// 
a=0;//     .line 119
a=0;//     :cond_1
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     .line 120
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 121
a=0;//     goto :goto_1
a=0;// 
a=0;//     .end local v3    # "set":Z
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     move v3, v7
a=0;// 
a=0;//     .line 99
a=0;//     #v3=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 102
a=0;//     :pswitch_1
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextBoolean()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 103
a=0;//     .restart local v3    # "set":Z
a=0;//     #v3=(Boolean);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 105
a=0;//     .end local v3    # "set":Z
a=0;//     :pswitch_2
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 107
a=0;//     .local v4, "stringValue":Ljava/lang/String;
a=0;//     :try_start_0
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     if-eqz v8, :cond_3
a=0;// 
a=0;//     move v3, v6
a=0;// 
a=0;//     .restart local v3    # "set":Z
a=0;//     :goto_3
a=0;//     #v3=(Boolean);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .end local v3    # "set":Z
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);
a=0;//     move v3, v7
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 108
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 109
a=0;//     .local v1, "e":Ljava/lang/NumberFormatException;
a=0;//     #v1=(Reference,Ljava/lang/NumberFormatException;);
a=0;//     new-instance v6, Lcom/google/gson/JsonSyntaxException;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/google/gson/JsonSyntaxException;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "Error: Expecting: bitset number value (1, 0), Found: "
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v6, v7}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Lcom/google/gson/JsonSyntaxException;);
a=0;//     throw v6
a=0;// 
a=0;//     .line 122
a=0;//     .end local v1    # "e":Ljava/lang/NumberFormatException;
a=0;//     .end local v4    # "stringValue":Ljava/lang/String;
a=0;//     :cond_4
a=0;//     #v1=(Uninit);v4=(Conflicted);v6=(One);v7=(Null);v9=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->endArray()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 97
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
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
a=0;//     .line 84
a=0;//     check-cast p2, Ljava/util/BitSet;
a=0;// 
a=0;//     .end local p2    # "x1":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/google/gson/internal/bind/TypeAdapters$2;->write(Lcom/google/gson/stream/JsonWriter;Ljava/util/BitSet;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public write(Lcom/google/gson/stream/JsonWriter;Ljava/util/BitSet;)V
a=0;//     .locals 4
a=0;//     .param p1, "out"    # Lcom/google/gson/stream/JsonWriter;
a=0;//     .param p2, "src"    # Ljava/util/BitSet;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 127
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 128
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->nullValue()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 138
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 132
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->beginArray()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 133
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {p2}, Ljava/util/BitSet;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v0, v2, :cond_2
a=0;// 
a=0;//     .line 134
a=0;//     invoke-virtual {p2, v0}, Ljava/util/BitSet;->get(I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 135
a=0;//     .local v1, "value":I
a=0;//     :goto_2
a=0;//     #v1=(Boolean);
a=0;//     int-to-long v2, v1
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {p1, v2, v3}, Lcom/google/gson/stream/JsonWriter;->value(J)Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 133
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 134
a=0;//     .end local v1    # "value":I
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Boolean);v3=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 137
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Integer);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->endArray()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
