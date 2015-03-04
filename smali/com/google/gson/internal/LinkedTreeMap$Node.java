package com.google.gson.internal; class LinkedTreeMap$Node { void a() { int a;
a=0;// .class final Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// .super Ljava/lang/Object;
a=0;// .source "LinkedTreeMap.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/util/Map$Entry;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/google/gson/internal/LinkedTreeMap;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x18
a=0;//     name = "Node"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<K:",
a=0;//         "Ljava/lang/Object;",
a=0;//         "V:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/lang/Object;",
a=0;//         "Ljava/util/Map$Entry",
a=0;//         "<TK;TV;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field height:I
a=0;// 
a=0;// .field final key:Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "TK;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field left:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/google/gson/internal/LinkedTreeMap$Node",
a=0;//             "<TK;TV;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field next:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/google/gson/internal/LinkedTreeMap$Node",
a=0;//             "<TK;TV;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field parent:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/google/gson/internal/LinkedTreeMap$Node",
a=0;//             "<TK;TV;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field prev:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/google/gson/internal/LinkedTreeMap$Node",
a=0;//             "<TK;TV;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field right:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/google/gson/internal/LinkedTreeMap$Node",
a=0;//             "<TK;TV;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field value:Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "TV;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 450
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 451
a=0;//     #p0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap$Node;->key:Ljava/lang/Object;
a=0;// 
a=0;//     .line 452
a=0;//     iput-object p0, p0, Lcom/google/gson/internal/LinkedTreeMap$Node;->prev:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     iput-object p0, p0, Lcom/google/gson/internal/LinkedTreeMap$Node;->next:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 453
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Lcom/google/gson/internal/LinkedTreeMap$Node;Ljava/lang/Object;Lcom/google/gson/internal/LinkedTreeMap$Node;Lcom/google/gson/internal/LinkedTreeMap$Node;)V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/google/gson/internal/LinkedTreeMap$Node",
a=0;//             "<TK;TV;>;TK;",
a=0;//             "Lcom/google/gson/internal/LinkedTreeMap$Node",
a=0;//             "<TK;TV;>;",
a=0;//             "Lcom/google/gson/internal/LinkedTreeMap$Node",
a=0;//             "<TK;TV;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 456
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     .local p1, "parent":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     .local p2, "key":Ljava/lang/Object;, "TK;"
a=0;//     .local p3, "next":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     .local p4, "prev":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 457
a=0;//     #p0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     iput-object p1, p0, Lcom/google/gson/internal/LinkedTreeMap$Node;->parent:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 458
a=0;//     iput-object p2, p0, Lcom/google/gson/internal/LinkedTreeMap$Node;->key:Ljava/lang/Object;
a=0;// 
a=0;//     .line 459
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lcom/google/gson/internal/LinkedTreeMap$Node;->height:I
a=0;// 
a=0;//     .line 460
a=0;//     iput-object p3, p0, Lcom/google/gson/internal/LinkedTreeMap$Node;->next:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 461
a=0;//     iput-object p4, p0, Lcom/google/gson/internal/LinkedTreeMap$Node;->prev:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 462
a=0;//     iput-object p0, p4, Lcom/google/gson/internal/LinkedTreeMap$Node;->next:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 463
a=0;//     iput-object p0, p3, Lcom/google/gson/internal/LinkedTreeMap$Node;->prev:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 464
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public equals(Ljava/lang/Object;)Z
a=0;//     .locals 4
a=0;//     .param p1, "o"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 482
a=0;//     #v1=(Null);
a=0;//     instance-of v2, p1, Ljava/util/Map$Entry;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     move-object v0, p1
a=0;// 
a=0;//     .line 483
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 484
a=0;//     .local v0, "other":Ljava/util/Map$Entry;
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/LinkedTreeMap$Node;->key:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/LinkedTreeMap$Node;->value:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 487
a=0;//     .end local v0    # "other":Ljava/util/Map$Entry;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     .line 484
a=0;//     .restart local v0    # "other":Ljava/util/Map$Entry;
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/util/Map$Entry;);v1=(Null);v2=(Reference,Ljava/lang/Object;);v3=(Uninit);
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/LinkedTreeMap$Node;->key:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Reference,Ljava/lang/Object;);v3=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/LinkedTreeMap$Node;->value:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public first()Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/google/gson/internal/LinkedTreeMap$Node",
a=0;//             "<TK;TV;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 503
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     move-object v1, p0
a=0;// 
a=0;//     .line 504
a=0;//     .local v1, "node":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     #v1=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     iget-object v0, v1, Lcom/google/gson/internal/LinkedTreeMap$Node;->left:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 505
a=0;//     .local v0, "child":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 506
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 507
a=0;//     iget-object v0, v1, Lcom/google/gson/internal/LinkedTreeMap$Node;->left:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 509
a=0;//     :cond_0
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public getKey()Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TK;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 467
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap$Node;->key:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getValue()Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TV;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 471
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap$Node;->value:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public hashCode()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 491
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap$Node;->key:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Lcom/google/gson/internal/LinkedTreeMap$Node;->value:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Integer);
a=0;//     xor-int/2addr v0, v1
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);v1=(Null);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap$Node;->key:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/LinkedTreeMap$Node;->value:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public last()Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/google/gson/internal/LinkedTreeMap$Node",
a=0;//             "<TK;TV;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 516
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     move-object v1, p0
a=0;// 
a=0;//     .line 517
a=0;//     .local v1, "node":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     #v1=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     iget-object v0, v1, Lcom/google/gson/internal/LinkedTreeMap$Node;->right:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 518
a=0;//     .local v0, "child":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 519
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 520
a=0;//     iget-object v0, v1, Lcom/google/gson/internal/LinkedTreeMap$Node;->right:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 522
a=0;//     :cond_0
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public setValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TV;)TV;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 475
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     .local p1, "value":Ljava/lang/Object;, "TV;"
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap$Node;->value:Ljava/lang/Object;
a=0;// 
a=0;//     .line 476
a=0;//     .local v0, "oldValue":Ljava/lang/Object;, "TV;"
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iput-object p1, p0, Lcom/google/gson/internal/LinkedTreeMap$Node;->value:Ljava/lang/Object;
a=0;// 
a=0;//     .line 477
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 496
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/LinkedTreeMap$Node;->key:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "="
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/LinkedTreeMap$Node;->value:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
