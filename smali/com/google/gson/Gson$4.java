package com.google.gson; class Gson$4 { void a() { int a;
a=0;// .class Lcom/google/gson/Gson$4;
a=0;// .super Lcom/google/gson/TypeAdapter;
a=0;// .source "Gson.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/google/gson/Gson;->floatAdapter(Z)Lcom/google/gson/TypeAdapter;
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
a=0;//         "<",
a=0;//         "Ljava/lang/Number;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/google/gson/Gson;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/google/gson/Gson;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 274
a=0;//     iput-object p1, p0, Lcom/google/gson/Gson$4;->this$0:Lcom/google/gson/Gson;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/google/gson/Gson$4;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Float;
a=0;//     .locals 2
a=0;//     .param p1, "in"    # Lcom/google/gson/stream/JsonReader;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 276
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
a=0;//     .line 277
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextNull()V
a=0;// 
a=0;//     .line 278
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 280
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Reference,Lcom/google/gson/stream/JsonToken;);
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextDouble()D
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     double-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Float;);
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
a=0;//     .line 274
a=0;//     invoke-virtual {p0, p1}, Lcom/google/gson/Gson$4;->read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Float;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Float;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Number;)V
a=0;//     .locals 4
a=0;//     .param p1, "out"    # Lcom/google/gson/stream/JsonWriter;
a=0;//     .param p2, "value"    # Ljava/lang/Number;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 283
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 284
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->nullValue()Lcom/google/gson/stream/JsonWriter;
a=0;// 
a=0;//     .line 290
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 287
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 288
a=0;//     .local v0, "floatValue":F
a=0;//     #v0=(Float);
a=0;//     iget-object v1, p0, Lcom/google/gson/Gson$4;->this$0:Lcom/google/gson/Gson;
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/Gson;);
a=0;//     float-to-double v2, v0
a=0;// 
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     invoke-static {v1, v2, v3}, Lcom/google/gson/Gson;->access$000(Lcom/google/gson/Gson;D)V
a=0;// 
a=0;//     .line 289
a=0;//     invoke-virtual {p1, p2}, Lcom/google/gson/stream/JsonWriter;->value(Ljava/lang/Number;)Lcom/google/gson/stream/JsonWriter;
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
a=0;//     .line 274
a=0;//     check-cast p2, Ljava/lang/Number;
a=0;// 
a=0;//     .end local p2    # "x1":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/google/gson/Gson$4;->write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Number;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
