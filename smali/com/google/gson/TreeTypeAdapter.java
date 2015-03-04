package com.google.gson; class TreeTypeAdapter { void a() { int a;
a=0;// .class final Lcom/google/gson/TreeTypeAdapter;
a=0;// .super Lcom/google/gson/TypeAdapter;
a=0;// .source "TreeTypeAdapter.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/google/gson/TreeTypeAdapter$1;,
a=0;//         Lcom/google/gson/TreeTypeAdapter$SingleTypeFactory;
a=0;//     }
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
a=0;// .field private delegate:Lcom/google/gson/TypeAdapter;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/google/gson/TypeAdapter",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final deserializer:Lcom/google/gson/JsonDeserializer;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/google/gson/JsonDeserializer",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final gson:Lcom/google/gson/Gson;
a=0;// 
a=0;// .field private final serializer:Lcom/google/gson/JsonSerializer;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/google/gson/JsonSerializer",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final skipPast:Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;// .field private final typeToken:Lcom/google/gson/reflect/TypeToken;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/google/gson/reflect/TypeToken",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/google/gson/JsonSerializer;Lcom/google/gson/JsonDeserializer;Lcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;Lcom/google/gson/TypeAdapterFactory;)V
a=0;//     .locals 0
a=0;//     .param p3, "gson"    # Lcom/google/gson/Gson;
a=0;//     .param p5, "skipPast"    # Lcom/google/gson/TypeAdapterFactory;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/google/gson/JsonSerializer",
a=0;//             "<TT;>;",
a=0;//             "Lcom/google/gson/JsonDeserializer",
a=0;//             "<TT;>;",
a=0;//             "Lcom/google/gson/Gson;",
a=0;//             "Lcom/google/gson/reflect/TypeToken",
a=0;//             "<TT;>;",
a=0;//             "Lcom/google/gson/TypeAdapterFactory;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     .local p0, "this":Lcom/google/gson/TreeTypeAdapter;, "Lcom/google/gson/TreeTypeAdapter<TT;>;"
a=0;//     .local p1, "serializer":Lcom/google/gson/JsonSerializer;, "Lcom/google/gson/JsonSerializer<TT;>;"
a=0;//     .local p2, "deserializer":Lcom/google/gson/JsonDeserializer;, "Lcom/google/gson/JsonDeserializer<TT;>;"
a=0;//     .local p4, "typeToken":Lcom/google/gson/reflect/TypeToken;, "Lcom/google/gson/reflect/TypeToken<TT;>;"
a=0;//     invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V
a=0;// 
a=0;//     .line 43
a=0;//     #p0=(Reference,Lcom/google/gson/TreeTypeAdapter;);
a=0;//     iput-object p1, p0, Lcom/google/gson/TreeTypeAdapter;->serializer:Lcom/google/gson/JsonSerializer;
a=0;// 
a=0;//     .line 44
a=0;//     iput-object p2, p0, Lcom/google/gson/TreeTypeAdapter;->deserializer:Lcom/google/gson/JsonDeserializer;
a=0;// 
a=0;//     .line 45
a=0;//     iput-object p3, p0, Lcom/google/gson/TreeTypeAdapter;->gson:Lcom/google/gson/Gson;
a=0;// 
a=0;//     .line 46
a=0;//     iput-object p4, p0, Lcom/google/gson/TreeTypeAdapter;->typeToken:Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     .line 47
a=0;//     iput-object p5, p0, Lcom/google/gson/TreeTypeAdapter;->skipPast:Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     .line 48
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/google/gson/JsonSerializer;Lcom/google/gson/JsonDeserializer;Lcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;Lcom/google/gson/TypeAdapterFactory;Lcom/google/gson/TreeTypeAdapter$1;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Lcom/google/gson/JsonSerializer;
a=0;//     .param p2, "x1"    # Lcom/google/gson/JsonDeserializer;
a=0;//     .param p3, "x2"    # Lcom/google/gson/Gson;
a=0;//     .param p4, "x3"    # Lcom/google/gson/reflect/TypeToken;
a=0;//     .param p5, "x4"    # Lcom/google/gson/TypeAdapterFactory;
a=0;//     .param p6, "x5"    # Lcom/google/gson/TreeTypeAdapter$1;
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     .local p0, "this":Lcom/google/gson/TreeTypeAdapter;, "Lcom/google/gson/TreeTypeAdapter<TT;>;"
a=0;//     invoke-direct/range {p0 .. p5}, Lcom/google/gson/TreeTypeAdapter;-><init>(Lcom/google/gson/JsonSerializer;Lcom/google/gson/JsonDeserializer;Lcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;Lcom/google/gson/TypeAdapterFactory;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/google/gson/TreeTypeAdapter;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private delegate()Lcom/google/gson/TypeAdapter;
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/google/gson/TypeAdapter",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     .local p0, "this":Lcom/google/gson/TreeTypeAdapter;, "Lcom/google/gson/TreeTypeAdapter<TT;>;"
a=0;//     iget-object v0, p0, Lcom/google/gson/TreeTypeAdapter;->delegate:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     .line 76
a=0;//     .local v0, "d":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<TT;>;"
a=0;//     #v0=(Reference,Lcom/google/gson/TypeAdapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .end local v0    # "d":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<TT;>;"
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .restart local v0    # "d":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<TT;>;"
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v1, p0, Lcom/google/gson/TreeTypeAdapter;->gson:Lcom/google/gson/Gson;
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/Gson;);
a=0;//     iget-object v2, p0, Lcom/google/gson/TreeTypeAdapter;->skipPast:Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;//     #v2=(Reference,Lcom/google/gson/TypeAdapterFactory;);
a=0;//     iget-object v3, p0, Lcom/google/gson/TreeTypeAdapter;->typeToken:Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     #v3=(Reference,Lcom/google/gson/reflect/TypeToken;);
a=0;//     invoke-virtual {v1, v2, v3}, Lcom/google/gson/Gson;->getDelegateAdapter(Lcom/google/gson/TypeAdapterFactory;Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .end local v0    # "d":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<TT;>;"
a=0;//     iput-object v0, p0, Lcom/google/gson/TreeTypeAdapter;->delegate:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static newFactory(Lcom/google/gson/reflect/TypeToken;Ljava/lang/Object;)Lcom/google/gson/TypeAdapterFactory;
a=0;//     .locals 6
a=0;//     .param p1, "typeAdapter"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/google/gson/reflect/TypeToken",
a=0;//             "<*>;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")",
a=0;//             "Lcom/google/gson/TypeAdapterFactory;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "exactType":Lcom/google/gson/reflect/TypeToken;, "Lcom/google/gson/reflect/TypeToken<*>;"
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 85
a=0;//     #v4=(Null);
a=0;//     new-instance v0, Lcom/google/gson/TreeTypeAdapter$SingleTypeFactory;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/TreeTypeAdapter$SingleTypeFactory;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     move-object v2, p0
a=0;// 
a=0;//     #v2=(Reference,Lcom/google/gson/reflect/TypeToken;);
a=0;//     move-object v5, v4
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/google/gson/TreeTypeAdapter$SingleTypeFactory;-><init>(Ljava/lang/Object;Lcom/google/gson/reflect/TypeToken;ZLjava/lang/Class;Lcom/google/gson/TreeTypeAdapter$1;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/TreeTypeAdapter$SingleTypeFactory;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static newFactoryWithMatchRawType(Lcom/google/gson/reflect/TypeToken;Ljava/lang/Object;)Lcom/google/gson/TypeAdapterFactory;
a=0;//     .locals 6
a=0;//     .param p1, "typeAdapter"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/google/gson/reflect/TypeToken",
a=0;//             "<*>;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")",
a=0;//             "Lcom/google/gson/TypeAdapterFactory;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "exactType":Lcom/google/gson/reflect/TypeToken;, "Lcom/google/gson/reflect/TypeToken<*>;"
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 95
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p0}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Type;);
a=0;//     invoke-virtual {p0}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 96
a=0;//     .local v3, "matchRawType":Z
a=0;//     :goto_0
a=0;//     #v3=(Boolean);
a=0;//     new-instance v0, Lcom/google/gson/TreeTypeAdapter$SingleTypeFactory;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/TreeTypeAdapter$SingleTypeFactory;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     move-object v2, p0
a=0;// 
a=0;//     #v2=(Reference,Lcom/google/gson/reflect/TypeToken;);
a=0;//     move-object v5, v4
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/google/gson/TreeTypeAdapter$SingleTypeFactory;-><init>(Ljava/lang/Object;Lcom/google/gson/reflect/TypeToken;ZLjava/lang/Class;Lcom/google/gson/TreeTypeAdapter$1;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/TreeTypeAdapter$SingleTypeFactory;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 95
a=0;//     .end local v3    # "matchRawType":Z
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Uninit);v5=(Uninit);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static newTypeHierarchyFactory(Ljava/lang/Class;Ljava/lang/Object;)Lcom/google/gson/TypeAdapterFactory;
a=0;//     .locals 6
a=0;//     .param p1, "typeAdapter"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")",
a=0;//             "Lcom/google/gson/TypeAdapterFactory;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "hierarchyType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 105
a=0;//     #v2=(Null);
a=0;//     new-instance v0, Lcom/google/gson/TreeTypeAdapter$SingleTypeFactory;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/TreeTypeAdapter$SingleTypeFactory;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     move-object v4, p0
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     move-object v5, v2
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/google/gson/TreeTypeAdapter$SingleTypeFactory;-><init>(Ljava/lang/Object;Lcom/google/gson/reflect/TypeToken;ZLjava/lang/Class;Lcom/google/gson/TreeTypeAdapter$1;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/TreeTypeAdapter$SingleTypeFactory;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
a=0;//     .locals 4
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
a=0;//     .line 51
a=0;//     .local p0, "this":Lcom/google/gson/TreeTypeAdapter;, "Lcom/google/gson/TreeTypeAdapter<TT;>;"
a=0;//     iget-object v1, p0, Lcom/google/gson/TreeTypeAdapter;->deserializer:Lcom/google/gson/JsonDeserializer;
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/JsonDeserializer;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 52
a=0;//     invoke-direct {p0}, Lcom/google/gson/TreeTypeAdapter;->delegate()Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Lcom/google/gson/TypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 58
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 54
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-static {p1}, Lcom/google/gson/internal/Streams;->parse(Lcom/google/gson/stream/JsonReader;)Lcom/google/gson/JsonElement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 55
a=0;//     .local v0, "value":Lcom/google/gson/JsonElement;
a=0;//     #v0=(Reference,Lcom/google/gson/JsonElement;);
a=0;//     invoke-virtual {v0}, Lcom/google/gson/JsonElement;->isJsonNull()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 56
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 58
a=0;//     :cond_1
a=0;//     #v1=(Boolean);
a=0;//     iget-object v1, p0, Lcom/google/gson/TreeTypeAdapter;->deserializer:Lcom/google/gson/JsonDeserializer;
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/JsonDeserializer;);
a=0;//     iget-object v2, p0, Lcom/google/gson/TreeTypeAdapter;->typeToken:Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     #v2=(Reference,Lcom/google/gson/reflect/TypeToken;);
a=0;//     invoke-virtual {v2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/google/gson/TreeTypeAdapter;->gson:Lcom/google/gson/Gson;
a=0;// 
a=0;//     #v3=(Reference,Lcom/google/gson/Gson;);
a=0;//     iget-object v3, v3, Lcom/google/gson/Gson;->deserializationContext:Lcom/google/gson/JsonDeserializationContext;
a=0;// 
a=0;//     invoke-interface {v1, v0, v2, v3}, Lcom/google/gson/JsonDeserializer;->deserialize(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
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
a=0;//     .line 62
a=0;//     .local p0, "this":Lcom/google/gson/TreeTypeAdapter;, "Lcom/google/gson/TreeTypeAdapter<TT;>;"
a=0;//     .local p2, "value":Ljava/lang/Object;, "TT;"
a=0;//     iget-object v1, p0, Lcom/google/gson/TreeTypeAdapter;->serializer:Lcom/google/gson/JsonSerializer;
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/JsonSerializer;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 63
a=0;//     invoke-direct {p0}, Lcom/google/gson/TreeTypeAdapter;->delegate()Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1, p2}, Lcom/google/gson/TypeAdapter;->write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 72
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 66
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     .line 67
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->nullValue()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 70
a=0;//     :cond_1
a=0;//     iget-object v1, p0, Lcom/google/gson/TreeTypeAdapter;->serializer:Lcom/google/gson/JsonSerializer;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/google/gson/TreeTypeAdapter;->typeToken:Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     #v2=(Reference,Lcom/google/gson/reflect/TypeToken;);
a=0;//     invoke-virtual {v2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/google/gson/TreeTypeAdapter;->gson:Lcom/google/gson/Gson;
a=0;// 
a=0;//     #v3=(Reference,Lcom/google/gson/Gson;);
a=0;//     iget-object v3, v3, Lcom/google/gson/Gson;->serializationContext:Lcom/google/gson/JsonSerializationContext;
a=0;// 
a=0;//     invoke-interface {v1, p2, v2, v3}, Lcom/google/gson/JsonSerializer;->serialize(Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonElement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 71
a=0;//     .local v0, "tree":Lcom/google/gson/JsonElement;
a=0;//     #v0=(Reference,Lcom/google/gson/JsonElement;);
a=0;//     invoke-static {v0, p1}, Lcom/google/gson/internal/Streams;->write(Lcom/google/gson/JsonElement;Lcom/google/gson/stream/JsonWriter;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
