package com.google.gson.internal; class Excluder$1 { void a() { int a;
a=0;// .class Lcom/google/gson/internal/Excluder$1;
a=0;// .super Lcom/google/gson/TypeAdapter;
a=0;// .source "Excluder.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/google/gson/internal/Excluder;->create(Lcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
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
a=0;// .field final synthetic this$0:Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;// .field final synthetic val$gson:Lcom/google/gson/Gson;
a=0;// 
a=0;// .field final synthetic val$skipDeserialize:Z
a=0;// 
a=0;// .field final synthetic val$skipSerialize:Z
a=0;// 
a=0;// .field final synthetic val$type:Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/google/gson/internal/Excluder;ZZLcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     iput-object p1, p0, Lcom/google/gson/internal/Excluder$1;->this$0:Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     iput-boolean p2, p0, Lcom/google/gson/internal/Excluder$1;->val$skipDeserialize:Z
a=0;// 
a=0;//     iput-boolean p3, p0, Lcom/google/gson/internal/Excluder$1;->val$skipSerialize:Z
a=0;// 
a=0;//     iput-object p4, p0, Lcom/google/gson/internal/Excluder$1;->val$gson:Lcom/google/gson/Gson;
a=0;// 
a=0;//     iput-object p5, p0, Lcom/google/gson/internal/Excluder$1;->val$type:Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/google/gson/internal/Excluder$1;);
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
a=0;//     .line 141
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/Excluder$1;->delegate:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     .line 142
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
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/Excluder$1;->val$gson:Lcom/google/gson/Gson;
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/Gson;);
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/Excluder$1;->this$0:Lcom/google/gson/internal/Excluder;
a=0;// 
a=0;//     #v2=(Reference,Lcom/google/gson/internal/Excluder;);
a=0;//     iget-object v3, p0, Lcom/google/gson/internal/Excluder$1;->val$type:Lcom/google/gson/reflect/TypeToken;
a=0;// 
a=0;//     #v3=(Reference,Lcom/google/gson/reflect/TypeToken;);
a=0;//     invoke-virtual {v1, v2, v3}, Lcom/google/gson/Gson;->getDelegateAdapter(Lcom/google/gson/TypeAdapterFactory;Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .end local v0    # "d":Lcom/google/gson/TypeAdapter;, "Lcom/google/gson/TypeAdapter<TT;>;"
a=0;//     iput-object v0, p0, Lcom/google/gson/internal/Excluder$1;->delegate:Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
a=0;//     .locals 1
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
a=0;//     .line 125
a=0;//     iget-boolean v0, p0, Lcom/google/gson/internal/Excluder$1;->val$skipDeserialize:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 126
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->skipValue()V
a=0;// 
a=0;//     .line 127
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 129
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-direct {p0}, Lcom/google/gson/internal/Excluder$1;->delegate()Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/TypeAdapter;);
a=0;//     invoke-virtual {v0, p1}, Lcom/google/gson/TypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
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
a=0;//     .line 133
a=0;//     .local p2, "value":Ljava/lang/Object;, "TT;"
a=0;//     iget-boolean v0, p0, Lcom/google/gson/internal/Excluder$1;->val$skipSerialize:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 134
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->nullValue()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 138
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 137
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-direct {p0}, Lcom/google/gson/internal/Excluder$1;->delegate()Lcom/google/gson/TypeAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/TypeAdapter;);
a=0;//     invoke-virtual {v0, p1, p2}, Lcom/google/gson/TypeAdapter;->write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
