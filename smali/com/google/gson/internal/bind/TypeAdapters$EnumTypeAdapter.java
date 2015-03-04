package com.google.gson.internal.bind; class TypeAdapters$EnumTypeAdapter { void a() { int a;
a=0;// .class final Lcom/google/gson/internal/bind/TypeAdapters$EnumTypeAdapter;
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
a=0;//     accessFlags = 0x1a
a=0;//     name = "EnumTypeAdapter"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T:",
a=0;//         "Ljava/lang/Enum",
a=0;//         "<TT;>;>",
a=0;//         "Lcom/google/gson/TypeAdapter",
a=0;//         "<TT;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final constantToName:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<TT;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final nameToConstant:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/Class;)V
a=0;//     .locals 9
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 721
a=0;//     .local p0, "this":Lcom/google/gson/internal/bind/TypeAdapters$EnumTypeAdapter;, "Lcom/google/gson/internal/bind/TypeAdapters$EnumTypeAdapter<TT;>;"
a=0;//     .local p1, "classOfT":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V
a=0;// 
a=0;//     .line 718
a=0;//     #p0=(Reference,Lcom/google/gson/internal/bind/TypeAdapters$EnumTypeAdapter;);
a=0;//     new-instance v7, Ljava/util/HashMap;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v7}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v7, p0, Lcom/google/gson/internal/bind/TypeAdapters$EnumTypeAdapter;->nameToConstant:Ljava/util/Map;
a=0;// 
a=0;//     .line 719
a=0;//     new-instance v7, Ljava/util/HashMap;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v7}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v7, p0, Lcom/google/gson/internal/bind/TypeAdapters$EnumTypeAdapter;->constantToName:Ljava/util/Map;
a=0;// 
a=0;//     .line 723
a=0;//     :try_start_0
a=0;//     invoke-virtual {p1}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     check-cast v1, [Ljava/lang/Enum;
a=0;// 
a=0;//     .local v1, "arr$":[Ljava/lang/Enum;
a=0;//     array-length v5, v1
a=0;// 
a=0;//     .local v5, "len$":I
a=0;//     #v5=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .local v4, "i$":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Integer);v6=(Conflicted);v8=(Conflicted);
a=0;//     if-ge v4, v5, :cond_1
a=0;// 
a=0;//     aget-object v2, v1, v4
a=0;// 
a=0;//     .line 724
a=0;//     .local v2, "constant":Ljava/lang/Enum;, "TT;"
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 725
a=0;//     .local v6, "name":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v6}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-class v8, Lcom/google/gson/annotations/SerializedName;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/annotation/Annotation;);
a=0;//     check-cast v0, Lcom/google/gson/annotations/SerializedName;
a=0;// 
a=0;//     .line 726
a=0;//     .local v0, "annotation":Lcom/google/gson/annotations/SerializedName;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 727
a=0;//     invoke-interface {v0}, Lcom/google/gson/annotations/SerializedName;->value()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 729
a=0;//     :cond_0
a=0;//     iget-object v7, p0, Lcom/google/gson/internal/bind/TypeAdapters$EnumTypeAdapter;->nameToConstant:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v7, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 730
a=0;//     iget-object v7, p0, Lcom/google/gson/internal/bind/TypeAdapters$EnumTypeAdapter;->constantToName:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v7, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 723
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 732
a=0;//     .end local v0    # "annotation":Lcom/google/gson/annotations/SerializedName;
a=0;//     .end local v1    # "arr$":[Ljava/lang/Enum;
a=0;//     .end local v2    # "constant":Ljava/lang/Enum;, "TT;"
a=0;//     .end local v4    # "i$":I
a=0;//     .end local v5    # "len$":I
a=0;//     .end local v6    # "name":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 733
a=0;//     .local v3, "e":Ljava/lang/NoSuchFieldException;
a=0;//     #v3=(Reference,Ljava/lang/NoSuchFieldException;);
a=0;//     new-instance v7, Ljava/lang/AssertionError;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/AssertionError;);
a=0;//     invoke-direct {v7}, Ljava/lang/AssertionError;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/AssertionError;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 735
a=0;//     .end local v3    # "e":Ljava/lang/NoSuchFieldException;
a=0;//     .restart local v1    # "arr$":[Ljava/lang/Enum;
a=0;//     .restart local v4    # "i$":I
a=0;//     .restart local v5    # "len$":I
a=0;//     :cond_1
a=0;//     #v1=(Reference,[Ljava/lang/Enum;);v3=(Uninit);v4=(Integer);v5=(Integer);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Enum;
a=0;//     .locals 2
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
a=0;//     .line 737
a=0;//     .local p0, "this":Lcom/google/gson/internal/bind/TypeAdapters$EnumTypeAdapter;, "Lcom/google/gson/internal/bind/TypeAdapters$EnumTypeAdapter<TT;>;"
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     sget-object v1, Lcom/google/gson/stream/JsonToken;->NULL:Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 738
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextNull()V
a=0;// 
a=0;//     .line 739
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 741
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/bind/TypeAdapters$EnumTypeAdapter;->nameToConstant:Ljava/util/Map;
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Enum;
a=0;// 
a=0;//     goto :goto_0
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
a=0;//     .line 717
a=0;//     .local p0, "this":Lcom/google/gson/internal/bind/TypeAdapters$EnumTypeAdapter;, "Lcom/google/gson/internal/bind/TypeAdapters$EnumTypeAdapter<TT;>;"
a=0;//     invoke-virtual {p0, p1}, Lcom/google/gson/internal/bind/TypeAdapters$EnumTypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Enum;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Enum;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Enum;)V
a=0;//     .locals 1
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
a=0;//     .line 745
a=0;//     .local p0, "this":Lcom/google/gson/internal/bind/TypeAdapters$EnumTypeAdapter;, "Lcom/google/gson/internal/bind/TypeAdapters$EnumTypeAdapter<TT;>;"
a=0;//     .local p2, "value":Ljava/lang/Enum;, "TT;"
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lcom/google/gson/stream/JsonWriter;->value(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 746
a=0;//     return-void
a=0;// 
a=0;//     .line 745
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/bind/TypeAdapters$EnumTypeAdapter;->constantToName:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
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
a=0;//     .line 717
a=0;//     .local p0, "this":Lcom/google/gson/internal/bind/TypeAdapters$EnumTypeAdapter;, "Lcom/google/gson/internal/bind/TypeAdapters$EnumTypeAdapter<TT;>;"
a=0;//     check-cast p2, Ljava/lang/Enum;
a=0;// 
a=0;//     .end local p2    # "x1":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/google/gson/internal/bind/TypeAdapters$EnumTypeAdapter;->write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Enum;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
