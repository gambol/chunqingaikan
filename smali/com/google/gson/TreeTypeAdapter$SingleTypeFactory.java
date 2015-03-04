package com.google.gson; class TreeTypeAdapter$SingleTypeFactory { void a() { int a;
a=0;// .class Lcom/google/gson/TreeTypeAdapter$SingleTypeFactory;
a=0;// .super Ljava/lang/Object;
a=0;// .source "TreeTypeAdapter.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/google/gson/TypeAdapterFactory;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/google/gson/TreeTypeAdapter;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "SingleTypeFactory"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final deserializer:Lcom/google/gson/JsonDeserializer;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/google/gson/JsonDeserializer",
a=0;//             "<*>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final exactType:Lcom/google/gson/reflect/TypeToken;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/google/gson/reflect/TypeToken",
a=0;//             "<*>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final hierarchyType:Ljava/lang/Class;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final matchRawType:Z
a=0;// 
a=0;// .field private final serializer:Lcom/google/gson/JsonSerializer;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/google/gson/JsonSerializer",
a=0;//             "<*>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Ljava/lang/Object;Lcom/google/gson/reflect/TypeToken;ZLjava/lang/Class;)V
a=0;//     .locals 2
a=0;//     .param p1, "typeAdapter"    # Ljava/lang/Object;
a=0;//     .param p3, "matchRawType"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Object;",
a=0;//             "Lcom/google/gson/reflect/TypeToken",
a=0;//             "<*>;Z",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p2, "exactType":Lcom/google/gson/reflect/TypeToken;, "Lcom/google/gson/reflect/TypeToken<*>;"
a=0;//     .local p4, "hierarchyType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 116
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 117
a=0;//     #p0=(Reference,Lcom/google/gson/TreeTypeAdapter$SingleTypeFactory;);
a=0;//     instance-of v0, p1, Lcom/google/gson/JsonSerializer;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/google/gson/JsonSerializer;
a=0;// 
a=0;//     :goto_0
a=0;//     iput-object v0, p0, Lcom/google/gson/TreeTypeAdapter$SingleTypeFactory;->serializer:Lcom/google/gson/JsonSerializer;
a=0;// 
a=0;//     .line 120
a=0;//     instance-of v0, p1, Lcom/google/gson/JsonDeserializer;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     check-cast p1, Lcom/google/gson/JsonDeserializer;
a=0;// 
a=0;//     .end local p1    # "typeAdapter":Ljava/lang/Object;
a=0;//     :goto_1
a=0;//     iput-object p1, p0, Lcom/google/gson/TreeTypeAdapter$SingleTypeFactory;->deserializer:Lcom/google/gson/JsonDeserializer;
a=0;// 
a=0;//     .line 123
a=0;//     iget-object v0, p0, Lcom/google/gson/TreeTypeAdapter$SingleTypeFactory;->serializer:Lcom/google/gson/JsonSerializer;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/JsonSerializer;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/google/gson/TreeTypeAdapter$SingleTypeFactory;->deserializer:Lcom/google/gson/JsonDeserializer;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {v0}, Lcom/google/gson/internal/$Gson$Preconditions;->checkArgument(Z)V
a=0;// 
a=0;//     .line 124
a=0;//     iput-object p2, p0, Lcom/google/gson/TreeTypeAdapter$SingleTypeFactory;->exactType:Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     .line 125
a=0;//     iput-boolean p3, p0, Lcom/google/gson/TreeTypeAdapter$SingleTypeFactory;->matchRawType:Z
a=0;// 
a=0;//     .line 126
a=0;//     iput-object p4, p0, Lcom/google/gson/TreeTypeAdapter$SingleTypeFactory;->hierarchyType:Ljava/lang/Class;
a=0;// 
a=0;//     .line 127
a=0;//     return-void
a=0;// 
a=0;//     .restart local p1    # "typeAdapter":Ljava/lang/Object;
a=0;//     :cond_1
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 117
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     move-object p1, v1
a=0;// 
a=0;//     .line 120
a=0;//     #p1=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 123
a=0;//     .end local p1    # "typeAdapter":Ljava/lang/Object;
a=0;//     :cond_3
a=0;//     #v0=(Reference,Lcom/google/gson/JsonDeserializer;);p1=(Reference,Lcom/google/gson/JsonDeserializer;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Ljava/lang/Object;Lcom/google/gson/reflect/TypeToken;ZLjava/lang/Class;Lcom/google/gson/TreeTypeAdapter$1;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Ljava/lang/Object;
a=0;//     .param p2, "x1"    # Lcom/google/gson/reflect/TypeToken;
a=0;//     .param p3, "x2"    # Z
a=0;//     .param p4, "x3"    # Ljava/lang/Class;
a=0;//     .param p5, "x4"    # Lcom/google/gson/TreeTypeAdapter$1;
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/gson/TreeTypeAdapter$SingleTypeFactory;-><init>(Ljava/lang/Object;Lcom/google/gson/reflect/TypeToken;ZLjava/lang/Class;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/google/gson/TreeTypeAdapter$SingleTypeFactory;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public create(Lcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
a=0;//     .locals 8
a=0;//     .param p1, "gson"    # Lcom/google/gson/Gson;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/google/gson/Gson;",
a=0;//             "Lcom/google/gson/reflect/TypeToken",
a=0;//             "<TT;>;)",
a=0;//             "Lcom/google/gson/TypeAdapter",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p2, "type":Lcom/google/gson/reflect/TypeToken;, "Lcom/google/gson/reflect/TypeToken<TT;>;"
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 131
a=0;//     #v6=(Null);
a=0;//     iget-object v0, p0, Lcom/google/gson/TreeTypeAdapter$SingleTypeFactory;->exactType:Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/reflect/TypeToken;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/google/gson/TreeTypeAdapter$SingleTypeFactory;->exactType:Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Lcom/google/gson/reflect/TypeToken;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/google/gson/TreeTypeAdapter$SingleTypeFactory;->matchRawType:Z
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/google/gson/TreeTypeAdapter$SingleTypeFactory;->exactType:Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/reflect/TypeToken;);
a=0;//     invoke-virtual {v0}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 134
a=0;//     .local v7, "matches":Z
a=0;//     :goto_0
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_3
a=0;// 
a=0;//     new-instance v0, Lcom/google/gson/TreeTypeAdapter;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/TreeTypeAdapter;);
a=0;//     iget-object v1, p0, Lcom/google/gson/TreeTypeAdapter$SingleTypeFactory;->serializer:Lcom/google/gson/JsonSerializer;
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/JsonSerializer;);
a=0;//     iget-object v2, p0, Lcom/google/gson/TreeTypeAdapter$SingleTypeFactory;->deserializer:Lcom/google/gson/JsonDeserializer;
a=0;// 
a=0;//     #v2=(Reference,Lcom/google/gson/JsonDeserializer;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Lcom/google/gson/Gson;);
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Lcom/google/gson/reflect/TypeToken;);
a=0;//     move-object v5, p0
a=0;// 
a=0;//     #v5=(Reference,Lcom/google/gson/TreeTypeAdapter$SingleTypeFactory;);
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/google/gson/TreeTypeAdapter;-><init>(Lcom/google/gson/JsonSerializer;Lcom/google/gson/JsonDeserializer;Lcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;Lcom/google/gson/TypeAdapterFactory;Lcom/google/gson/TreeTypeAdapter$1;)V
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,Lcom/google/gson/TreeTypeAdapter;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 131
a=0;//     .end local v7    # "matches":Z
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Reference,Lcom/google/gson/reflect/TypeToken;);v1=(Uninit);v7=(Uninit);
a=0;//     iget-object v0, p0, Lcom/google/gson/TreeTypeAdapter$SingleTypeFactory;->hierarchyType:Ljava/lang/Class;
a=0;// 
a=0;//     invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .restart local v7    # "matches":Z
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-object v0, v6
a=0;// 
a=0;//     .line 134
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
}}
