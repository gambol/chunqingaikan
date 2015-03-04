package com.tencent.b.a; class d { void a() { int a;
a=0;// .class public Lcom/tencent/b/a/d;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Iterable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Object;",
a=0;//         "Ljava/lang/Iterable",
a=0;//         "<",
a=0;//         "Ljava/lang/String;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Ljava/util/concurrent/ConcurrentLinkedQueue;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/concurrent/ConcurrentLinkedQueue",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private b:Ljava/util/concurrent/atomic/AtomicInteger;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 38
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 34
a=0;//     #p0=(Reference,Lcom/tencent/b/a/d;);
a=0;//     iput-object v0, p0, Lcom/tencent/b/a/d;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;
a=0;// 
a=0;//     .line 35
a=0;//     iput-object v0, p0, Lcom/tencent/b/a/d;->b:Ljava/util/concurrent/atomic/AtomicInteger;
a=0;// 
a=0;//     .line 39
a=0;//     new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/ConcurrentLinkedQueue;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ConcurrentLinkedQueue;);
a=0;//     iput-object v0, p0, Lcom/tencent/b/a/d;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;
a=0;// 
a=0;//     .line 40
a=0;//     new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/atomic/AtomicInteger;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicInteger;);
a=0;//     iput-object v0, p0, Lcom/tencent/b/a/d;->b:Ljava/util/concurrent/atomic/AtomicInteger;
a=0;// 
a=0;//     .line 41
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 137
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/d;->b:Ljava/util/concurrent/atomic/AtomicInteger;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicInteger;);
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 54
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/tencent/b/a/d;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/ConcurrentLinkedQueue;);
a=0;//     invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 56
a=0;//     iget-object v1, p0, Lcom/tencent/b/a/d;->b:Ljava/util/concurrent/atomic/AtomicInteger;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/io/Writer;[C)V
a=0;//     .locals 10
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 73
a=0;//     #v2=(Null);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     array-length v0, p2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 128
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 84
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     array-length v4, p2
a=0;// 
a=0;//     .line 88
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/tencent/b/a/d;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/Iterator;);
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v3, v4
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Integer);v3=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);
a=0;//     invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 92
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move v7, v2
a=0;// 
a=0;//     .line 96
a=0;//     :goto_1
a=0;//     #v7=(Integer);
a=0;//     if-lez v6, :cond_2
a=0;// 
a=0;//     .line 99
a=0;//     if-le v3, v6, :cond_3
a=0;// 
a=0;//     move v5, v6
a=0;// 
a=0;//     .line 101
a=0;//     :goto_2
a=0;//     #v5=(Integer);
a=0;//     add-int v9, v7, v5
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v0, v7, v9, p2, v1}, Ljava/lang/String;->getChars(II[CI)V
a=0;// 
a=0;//     .line 103
a=0;//     sub-int/2addr v3, v5
a=0;// 
a=0;//     .line 104
a=0;//     add-int/2addr v1, v5
a=0;// 
a=0;//     .line 106
a=0;//     sub-int/2addr v6, v5
a=0;// 
a=0;//     .line 107
a=0;//     add-int/2addr v5, v7
a=0;// 
a=0;//     .line 109
a=0;//     if-nez v3, :cond_6
a=0;// 
a=0;//     .line 111
a=0;//     invoke-virtual {p1, p2, v2, v4}, Ljava/io/Writer;->write([CII)V
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v3, v4
a=0;// 
a=0;//     move v7, v5
a=0;// 
a=0;//     .line 114
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Integer);v5=(Conflicted);v9=(Conflicted);
a=0;//     move v5, v3
a=0;// 
a=0;//     .line 99
a=0;//     #v5=(Integer);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 121
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-lez v1, :cond_5
a=0;// 
a=0;//     .line 123
a=0;//     invoke-virtual {p1, p2, v2, v1}, Ljava/io/Writer;->write([CII)V
a=0;// 
a=0;//     .line 127
a=0;//     :cond_5
a=0;//     invoke-virtual {p1}, Ljava/io/Writer;->flush()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Reference,Ljava/lang/String;);v5=(Integer);v6=(Integer);v7=(Integer);v9=(Integer);
a=0;//     move v7, v5
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public b()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 145
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/d;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ConcurrentLinkedQueue;);
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V
a=0;// 
a=0;//     .line 147
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/d;->b:Ljava/util/concurrent/atomic/AtomicInteger;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V
a=0;// 
a=0;//     .line 148
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public iterator()Ljava/util/Iterator;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/Iterator",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 156
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/d;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ConcurrentLinkedQueue;);
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
