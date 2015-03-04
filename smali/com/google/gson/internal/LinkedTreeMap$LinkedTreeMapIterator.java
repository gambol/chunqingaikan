package com.google.gson.internal; class LinkedTreeMap$LinkedTreeMapIterator { void a() { int a;
a=0;// .class abstract Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;
a=0;// .super Ljava/lang/Object;
a=0;// .source "LinkedTreeMap.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/util/Iterator;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/google/gson/internal/LinkedTreeMap;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x402
a=0;//     name = "LinkedTreeMapIterator"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/lang/Object;",
a=0;//         "Ljava/util/Iterator",
a=0;//         "<TT;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field expectedModCount:I
a=0;// 
a=0;// .field lastReturned:Lcom/google/gson/internal/LinkedTreeMap$Node;
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
a=0;// .field final synthetic this$0:Lcom/google/gson/internal/LinkedTreeMap;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/google/gson/internal/LinkedTreeMap;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 526
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>.LinkedTreeMapIterator<TT;>;"
a=0;//     iput-object p1, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->this$0:Lcom/google/gson/internal/LinkedTreeMap;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 527
a=0;//     #p0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;);
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->this$0:Lcom/google/gson/internal/LinkedTreeMap;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap;);
a=0;//     iget-object v0, v0, Lcom/google/gson/internal/LinkedTreeMap;->header:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->next:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->next:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 528
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->lastReturned:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 529
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->this$0:Lcom/google/gson/internal/LinkedTreeMap;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap;);
a=0;//     iget v0, v0, Lcom/google/gson/internal/LinkedTreeMap;->modCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->expectedModCount:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/google/gson/internal/LinkedTreeMap;Lcom/google/gson/internal/LinkedTreeMap$1;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Lcom/google/gson/internal/LinkedTreeMap;
a=0;//     .param p2, "x1"    # Lcom/google/gson/internal/LinkedTreeMap$1;
a=0;// 
a=0;//     .prologue
a=0;//     .line 526
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>.LinkedTreeMapIterator<TT;>;"
a=0;//     invoke-direct {p0, p1}, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;-><init>(Lcom/google/gson/internal/LinkedTreeMap;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final hasNext()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 532
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>.LinkedTreeMapIterator<TT;>;"
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->next:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->this$0:Lcom/google/gson/internal/LinkedTreeMap;
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/internal/LinkedTreeMap;);
a=0;//     iget-object v1, v1, Lcom/google/gson/internal/LinkedTreeMap;->header:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method final nextNode()Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/google/gson/internal/LinkedTreeMap$Node",
a=0;//             "<TK;TV;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 536
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>.LinkedTreeMapIterator<TT;>;"
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->next:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 537
a=0;//     .local v0, "e":Lcom/google/gson/internal/LinkedTreeMap$Node;, "Lcom/google/gson/internal/LinkedTreeMap$Node<TK;TV;>;"
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->this$0:Lcom/google/gson/internal/LinkedTreeMap;
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/internal/LinkedTreeMap;);
a=0;//     iget-object v1, v1, Lcom/google/gson/internal/LinkedTreeMap;->header:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 538
a=0;//     new-instance v1, Ljava/util/NoSuchElementException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/NoSuchElementException;);
a=0;//     invoke-direct {v1}, Ljava/util/NoSuchElementException;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/NoSuchElementException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 540
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->this$0:Lcom/google/gson/internal/LinkedTreeMap;
a=0;// 
a=0;//     iget v1, v1, Lcom/google/gson/internal/LinkedTreeMap;->modCount:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->expectedModCount:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eq v1, v2, :cond_1
a=0;// 
a=0;//     .line 541
a=0;//     new-instance v1, Ljava/util/ConcurrentModificationException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ConcurrentModificationException;);
a=0;//     invoke-direct {v1}, Ljava/util/ConcurrentModificationException;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ConcurrentModificationException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 543
a=0;//     :cond_1
a=0;//     #v1=(Integer);
a=0;//     iget-object v1, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->next:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     iput-object v1, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->next:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 544
a=0;//     iput-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->lastReturned:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final remove()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 548
a=0;//     .local p0, "this":Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;, "Lcom/google/gson/internal/LinkedTreeMap<TK;TV;>.LinkedTreeMapIterator<TT;>;"
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->lastReturned:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 549
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 551
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->this$0:Lcom/google/gson/internal/LinkedTreeMap;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->lastReturned:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/internal/LinkedTreeMap$Node;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/google/gson/internal/LinkedTreeMap;->removeInternal(Lcom/google/gson/internal/LinkedTreeMap$Node;Z)V
a=0;// 
a=0;//     .line 552
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->lastReturned:Lcom/google/gson/internal/LinkedTreeMap$Node;
a=0;// 
a=0;//     .line 553
a=0;//     iget-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->this$0:Lcom/google/gson/internal/LinkedTreeMap;
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/internal/LinkedTreeMap;);
a=0;//     iget v0, v0, Lcom/google/gson/internal/LinkedTreeMap;->modCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->expectedModCount:I
a=0;// 
a=0;//     .line 554
a=0;//     return-void
a=0;// .end method
}}
