package com.google.gson.stream; class JsonReader$1 { void a() { int a;
a=0;// .class final Lcom/google/gson/stream/JsonReader$1;
a=0;// .super Lcom/google/gson/internal/JsonReaderInternalAccess;
a=0;// .source "JsonReader.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/google/gson/stream/JsonReader;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1532
a=0;//     invoke-direct {p0}, Lcom/google/gson/internal/JsonReaderInternalAccess;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/google/gson/stream/JsonReader$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public promoteNameToValue(Lcom/google/gson/stream/JsonReader;)V
a=0;//     .locals 4
a=0;//     .param p1, "reader"    # Lcom/google/gson/stream/JsonReader;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1534
a=0;//     instance-of v1, p1, Lcom/google/gson/internal/bind/JsonTreeReader;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 1535
a=0;//     check-cast p1, Lcom/google/gson/internal/bind/JsonTreeReader;
a=0;// 
a=0;//     .end local p1    # "reader":Lcom/google/gson/stream/JsonReader;
a=0;//     invoke-virtual {p1}, Lcom/google/gson/internal/bind/JsonTreeReader;->promoteNameToValue()V
a=0;// 
a=0;//     .line 1552
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(PosByte);
a=0;//     return-void
a=0;// 
a=0;//     .line 1538
a=0;//     .restart local p1    # "reader":Lcom/google/gson/stream/JsonReader;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Boolean);
a=0;//     invoke-static {p1}, Lcom/google/gson/stream/JsonReader;->access$000(Lcom/google/gson/stream/JsonReader;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1539
a=0;//     .local v0, "p":I
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 1540
a=0;//     invoke-static {p1}, Lcom/google/gson/stream/JsonReader;->access$100(Lcom/google/gson/stream/JsonReader;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1542
a=0;//     :cond_1
a=0;//     const/16 v1, 0xd
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     .line 1543
a=0;//     const/16 v1, 0x9
a=0;// 
a=0;//     invoke-static {p1, v1}, Lcom/google/gson/stream/JsonReader;->access$002(Lcom/google/gson/stream/JsonReader;I)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1544
a=0;//     :cond_2
a=0;//     const/16 v1, 0xc
a=0;// 
a=0;//     if-ne v0, v1, :cond_3
a=0;// 
a=0;//     .line 1545
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     invoke-static {p1, v1}, Lcom/google/gson/stream/JsonReader;->access$002(Lcom/google/gson/stream/JsonReader;I)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1546
a=0;//     :cond_3
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     if-ne v0, v1, :cond_4
a=0;// 
a=0;//     .line 1547
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     invoke-static {p1, v1}, Lcom/google/gson/stream/JsonReader;->access$002(Lcom/google/gson/stream/JsonReader;I)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1549
a=0;//     :cond_4
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Expected a name but was "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " at line "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {p1}, Lcom/google/gson/stream/JsonReader;->access$200(Lcom/google/gson/stream/JsonReader;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " column "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {p1}, Lcom/google/gson/stream/JsonReader;->access$300(Lcom/google/gson/stream/JsonReader;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v1
a=0;// .end method
}}
