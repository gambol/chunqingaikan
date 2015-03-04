package com.lidroid.xutils.util.core.compatible; class ArrayDeque$DeqIterator { void a() { int a;
a=0;// .class Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ArrayDeque.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/util/Iterator;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "DeqIterator"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Object;",
a=0;//         "Ljava/util/Iterator",
a=0;//         "<TE;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private cursor:I
a=0;// 
a=0;// .field private fence:I
a=0;// 
a=0;// .field private lastRet:I
a=0;// 
a=0;// .field final synthetic this$0:Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 580
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;->this$0:Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 584
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;);
a=0;//     invoke-static {p1}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->access$1(Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;->cursor:I
a=0;// 
a=0;//     .line 590
a=0;//     invoke-static {p1}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->access$2(Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;->fence:I
a=0;// 
a=0;//     .line 596
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;->lastRet:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 580
a=0;//     invoke-direct {p0, p1}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;-><init>(Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public hasNext()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 599
a=0;//     iget v0, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;->cursor:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;->fence:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public next()Ljava/lang/Object;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TE;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 603
a=0;//     iget v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;->cursor:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;->fence:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     .line 604
a=0;//     new-instance v1, Ljava/util/NoSuchElementException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/NoSuchElementException;);
a=0;//     invoke-direct {v1}, Ljava/util/NoSuchElementException;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/NoSuchElementException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 605
a=0;//     :cond_0
a=0;//     #v1=(Integer);
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;->this$0:Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;);
a=0;//     invoke-static {v1}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->access$3(Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v2, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;->cursor:I
a=0;// 
a=0;//     aget-object v0, v1, v2
a=0;// 
a=0;//     .line 608
a=0;//     .local v0, "result":Ljava/lang/Object;, "TE;"
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;->this$0:Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->access$2(Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;->fence:I
a=0;// 
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 609
a=0;//     :cond_1
a=0;//     new-instance v1, Ljava/util/ConcurrentModificationException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ConcurrentModificationException;);
a=0;//     invoke-direct {v1}, Ljava/util/ConcurrentModificationException;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ConcurrentModificationException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 610
a=0;//     :cond_2
a=0;//     #v1=(Integer);
a=0;//     iget v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;->cursor:I
a=0;// 
a=0;//     iput v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;->lastRet:I
a=0;// 
a=0;//     .line 611
a=0;//     iget v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;->cursor:I
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;->this$0:Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;
a=0;// 
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;);
a=0;//     invoke-static {v2}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->access$3(Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     and-int/2addr v1, v2
a=0;// 
a=0;//     iput v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;->cursor:I
a=0;// 
a=0;//     .line 612
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public remove()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 616
a=0;//     iget v0, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;->lastRet:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     .line 617
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 618
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;->this$0:Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;);
a=0;//     iget v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;->lastRet:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->access$4(Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 619
a=0;//     iget v0, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;->cursor:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;->this$0:Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;);
a=0;//     invoke-static {v1}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->access$3(Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     and-int/2addr v0, v1
a=0;// 
a=0;//     iput v0, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;->cursor:I
a=0;// 
a=0;//     .line 620
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;->this$0:Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;);
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->access$2(Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;->fence:I
a=0;// 
a=0;//     .line 622
a=0;//     :cond_1
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;->lastRet:I
a=0;// 
a=0;//     .line 623
a=0;//     return-void
a=0;// .end method
}}
