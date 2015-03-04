package com.google.gson.internal; class LinkedTreeMap$EntrySet { void a() { int a;
a=0;// .class Lcom/google/gson/internal/LinkedTreeMap$EntrySet;
a=0;// .super Ljava/util/AbstractSet;
a=0;// .source "LinkedTreeMap.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/google/gson/internal/LinkedTreeMap;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = "EntrySet"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/util/AbstractSet",
a=0;//         "<",
a=0;//         "Ljava/util/Map$Entry",
a=0;//         "<TK;TV;>;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/google/gson/internal/LinkedTreeMap;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/google/gson/internal/LinkedTreeMap;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 557
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap$EntrySet;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>.EntrySet;"
a=0;//     iput-object p1, p0, Lcom/google/gson/internal/LinkedTreeMap$EntrySet;->this$0:Lcom/google/gson/internal/LinkedTreeMap;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$EntrySet;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public clear()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 588
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap$EntrySet;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>.EntrySet;"
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap$EntrySet;->this$0:Lcom/google/gson/internal/LinkedTreeMap;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap;);
a=0;//     invoke-virtual {v0}, Lcom/google/gson/internal/LinkedTreeMap;->clear()V
a=0;// 
a=0;//     .line 589
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public contains(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .param p1, "o"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 571
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap$EntrySet;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>.EntrySet;"
a=0;//     instance-of v0, p1, Ljava/util/Map$Entry;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap$EntrySet;->this$0:Lcom/google/gson/internal/LinkedTreeMap;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap;);
a=0;//     check-cast p1, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .end local p1    # "o":Ljava/lang/Object;
a=0;//     invoke-virtual {v0, p1}, Lcom/google/gson/internal/LinkedTreeMap;->findByEntry(Ljava/util/Map$Entry;)Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public iterator()Ljava/util/Iterator;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/Iterator",
a=0;//             "<",
a=0;//             "Ljava/util/Map$Entry",
a=0;//             "<TK;TV;>;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 563
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap$EntrySet;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>.EntrySet;"
a=0;//     new-instance v0, Lcom/google/gson/internal/LinkedTreeMap$EntrySet$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/google/gson/internal/LinkedTreeMap$EntrySet$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/google/gson/internal/LinkedTreeMap$EntrySet$1;-><init>(Lcom/google/gson/internal/LinkedTreeMap$EntrySet;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$EntrySet$1;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public remove(Ljava/lang/Object;)Z
a=0;//     .locals 4
a=0;//     .param p1, "o"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap$EntrySet;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>.EntrySet;"
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 575
a=0;//     #v1=(Null);
a=0;//     instance-of v3, p1, Ljava/util/Map$Entry;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 584
a=0;//     .end local p1    # "o":Ljava/lang/Object;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v3=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 579
a=0;//     .restart local p1    # "o":Ljava/lang/Object;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Null);v3=(Boolean);
a=0;//     iget-object v3, p0, Lcom/google/gson/internal/LinkedTreeMap$EntrySet;->this$0:Lcom/google/gson/internal/LinkedTreeMap;
a=0;// 
a=0;//     #v3=(Reference,Lcom/google/gson/internal/LinkedTreeMap;);
a=0;//     check-cast p1, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .end local p1    # "o":Ljava/lang/Object;
a=0;//     invoke-virtual {v3, p1}, Lcom/google/gson/internal/LinkedTreeMap;->findByEntry(Ljava/util/Map$Entry;)Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 580
a=0;//     .local v0, "node":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 583
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/LinkedTreeMap$EntrySet;->this$0:Lcom/google/gson/internal/LinkedTreeMap;
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/internal/LinkedTreeMap;);
a=0;//     invoke-virtual {v1, v0, v2}, Lcom/google/gson/internal/LinkedTreeMap;->removeInternal(Lcom/google/gson/internal/LinkedTreeMap$Node;Z)V
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 584
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public size()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 559
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap$EntrySet;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>.EntrySet;"
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap$EntrySet;->this$0:Lcom/google/gson/internal/LinkedTreeMap;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap;);
a=0;//     iget v0, v0, Lcom/google/gson/internal/LinkedTreeMap;->size:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}
