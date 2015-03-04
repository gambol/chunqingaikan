package com.lidroid.xutils.util.core.compatible; class ArrayDeque { void a() { int a;
a=0;// .class public Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;
a=0;// .super Ljava/util/AbstractCollection;
a=0;// .source "ArrayDeque.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/lidroid/xutils/util/core/compatible/Deque;
a=0;// .implements Ljava/io/Serializable;
a=0;// .implements Ljava/lang/Cloneable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;,
a=0;//         Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DescendingIterator;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<E:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/util/AbstractCollection",
a=0;//         "<TE;>;",
a=0;//         "Lcom/lidroid/xutils/util/core/compatible/Deque",
a=0;//         "<TE;>;",
a=0;//         "Ljava/lang/Cloneable;",
a=0;//         "Ljava/io/Serializable;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final MIN_INITIAL_CAPACITY:I = 0x8
a=0;// 
a=0;// .field private static final serialVersionUID:J = 0x207cda2e240da08bL
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private transient elements:[Ljava/lang/Object;
a=0;// 
a=0;// .field private transient head:I
a=0;// 
a=0;// .field private transient tail:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 157
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V
a=0;// 
a=0;//     .line 158
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;);
a=0;//     const/16 v0, 0x10
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 159
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(I)V
a=0;//     .locals 0
a=0;//     .param p1, "numElements"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 167
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V
a=0;// 
a=0;//     .line 168
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;);
a=0;//     invoke-direct {p0, p1}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->allocateElements(I)V
a=0;// 
a=0;//     .line 169
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/util/Collection;)V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Collection",
a=0;//             "<+TE;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 181
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     .local p1, "c":Ljava/util/Collection;, "Ljava/util/Collection<+TE;>;"
a=0;//     invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V
a=0;// 
a=0;//     .line 182
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;);
a=0;//     invoke-interface {p1}, Ljava/util/Collection;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v0}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->allocateElements(I)V
a=0;// 
a=0;//     .line 183
a=0;//     invoke-virtual {p0, p1}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 184
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     iget v0, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->head:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     iget v0, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->tail:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;)[Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;I)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 505
a=0;//     invoke-direct {p0, p1}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->delete(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private allocateElements(I)V
a=0;//     .locals 2
a=0;//     .param p1, "numElements"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     .line 100
a=0;//     .local v0, "initialCapacity":I
a=0;//     #v0=(PosByte);
a=0;//     if-lt p1, v0, :cond_0
a=0;// 
a=0;//     .line 101
a=0;//     move v0, p1
a=0;// 
a=0;//     .line 102
a=0;//     #v0=(Integer);
a=0;//     ushr-int/lit8 v1, v0, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     .line 103
a=0;//     ushr-int/lit8 v1, v0, 0x2
a=0;// 
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     .line 104
a=0;//     ushr-int/lit8 v1, v0, 0x4
a=0;// 
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     .line 105
a=0;//     ushr-int/lit8 v1, v0, 0x8
a=0;// 
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     .line 106
a=0;//     ushr-int/lit8 v1, v0, 0x10
a=0;// 
a=0;//     #v1=(Char);
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     .line 107
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     .line 109
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     .line 110
a=0;//     ushr-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     .line 112
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     new-array v1, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     iput-object v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 113
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private copyElements([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;//     .locals 5
a=0;//     .param p1, "a"    # [Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">([TT;)[TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 143
a=0;//     #v4=(Null);
a=0;//     iget v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->head:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->tail:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v1, v2, :cond_1
a=0;// 
a=0;//     .line 144
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     iget v2, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->head:I
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v1, v2, p1, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 150
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     return-object p1
a=0;// 
a=0;//     .line 145
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Integer);v3=(Uninit);
a=0;//     iget v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->head:I
a=0;// 
a=0;//     iget v2, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->tail:I
a=0;// 
a=0;//     if-le v1, v2, :cond_0
a=0;// 
a=0;//     .line 146
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->head:I
a=0;// 
a=0;//     sub-int v0, v1, v2
a=0;// 
a=0;//     .line 147
a=0;//     .local v0, "headPortionLen":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     iget v2, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->head:I
a=0;// 
a=0;//     invoke-static {v1, v2, p1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 148
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     iget v2, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->tail:I
a=0;// 
a=0;//     invoke-static {v1, v4, p1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;
a=0;//     .locals 6
a=0;//     .param p0, "original"    # [Ljava/lang/Object;
a=0;//     .param p1, "start"    # I
a=0;//     .param p2, "end"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">([TT;II)[TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 820
a=0;//     array-length v1, p0
a=0;// 
a=0;//     .line 821
a=0;//     .local v1, "originalLength":I
a=0;//     #v1=(Integer);
a=0;//     if-le p1, p2, :cond_0
a=0;// 
a=0;//     .line 822
a=0;//     new-instance v4, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v5, "start > end"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v4
a=0;// 
a=0;//     .line 824
a=0;//     :cond_0
a=0;//     #v4=(Uninit);v5=(Uninit);
a=0;//     if-ltz p1, :cond_1
a=0;// 
a=0;//     if-le p1, v1, :cond_2
a=0;// 
a=0;//     .line 825
a=0;//     :cond_1
a=0;//     new-instance v4, Ljava/lang/ArrayIndexOutOfBoundsException;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/ArrayIndexOutOfBoundsException;);
a=0;//     invoke-direct {v4}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/ArrayIndexOutOfBoundsException;);
a=0;//     throw v4
a=0;// 
a=0;//     .line 827
a=0;//     :cond_2
a=0;//     #v4=(Uninit);
a=0;//     sub-int v3, p2, p1
a=0;// 
a=0;//     .line 828
a=0;//     .local v3, "resultLength":I
a=0;//     #v3=(Integer);
a=0;//     sub-int v4, v1, p1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 829
a=0;//     .local v0, "copyLength":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v4}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4, v3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 830
a=0;//     .local v2, "result":[Ljava/lang/Object;
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {p0, p1, v2, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 831
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method private delete(I)Z
a=0;//     .locals 10
a=0;//     .param p1, "i"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 507
a=0;//     #v6=(Null);
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 508
a=0;//     .local v1, "elements":[Ljava/lang/Object;
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     array-length v8, v1
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     add-int/lit8 v4, v8, -0x1
a=0;// 
a=0;//     .line 509
a=0;//     .local v4, "mask":I
a=0;//     #v4=(Integer);
a=0;//     iget v3, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->head:I
a=0;// 
a=0;//     .line 510
a=0;//     .local v3, "h":I
a=0;//     #v3=(Integer);
a=0;//     iget v5, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->tail:I
a=0;// 
a=0;//     .line 511
a=0;//     .local v5, "t":I
a=0;//     #v5=(Integer);
a=0;//     sub-int v8, p1, v3
a=0;// 
a=0;//     and-int v2, v8, v4
a=0;// 
a=0;//     .line 512
a=0;//     .local v2, "front":I
a=0;//     #v2=(Integer);
a=0;//     sub-int v8, v5, p1
a=0;// 
a=0;//     and-int v0, v8, v4
a=0;// 
a=0;//     .line 515
a=0;//     .local v0, "back":I
a=0;//     #v0=(Integer);
a=0;//     sub-int v8, v5, v3
a=0;// 
a=0;//     and-int/2addr v8, v4
a=0;// 
a=0;//     if-lt v2, v8, :cond_0
a=0;// 
a=0;//     .line 516
a=0;//     new-instance v6, Ljava/util/ConcurrentModificationException;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/util/ConcurrentModificationException;);
a=0;//     invoke-direct {v6}, Ljava/util/ConcurrentModificationException;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/ConcurrentModificationException;);
a=0;//     throw v6
a=0;// 
a=0;//     .line 519
a=0;//     :cond_0
a=0;//     #v6=(Null);
a=0;//     if-ge v2, v0, :cond_2
a=0;// 
a=0;//     .line 520
a=0;//     if-gt v3, p1, :cond_1
a=0;// 
a=0;//     .line 521
a=0;//     add-int/lit8 v7, v3, 0x1
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v1, v3, v1, v7, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 527
a=0;//     :goto_0
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     aput-object v7, v1, v3
a=0;// 
a=0;//     .line 528
a=0;//     add-int/lit8 v7, v3, 0x1
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     and-int/2addr v7, v4
a=0;// 
a=0;//     iput v7, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->head:I
a=0;// 
a=0;//     .line 540
a=0;//     :goto_1
a=0;//     #v6=(Boolean);v9=(Conflicted);
a=0;//     return v6
a=0;// 
a=0;//     .line 523
a=0;//     :cond_1
a=0;//     #v6=(Null);v7=(One);v9=(Uninit);
a=0;//     invoke-static {v1, v6, v1, v7, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 524
a=0;//     aget-object v7, v1, v4
a=0;// 
a=0;//     #v7=(Null);
a=0;//     aput-object v7, v1, v6
a=0;// 
a=0;//     .line 525
a=0;//     add-int/lit8 v7, v3, 0x1
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     sub-int v8, v4, v3
a=0;// 
a=0;//     invoke-static {v1, v3, v1, v7, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 531
a=0;//     :cond_2
a=0;//     #v7=(One);
a=0;//     if-ge p1, v5, :cond_3
a=0;// 
a=0;//     .line 532
a=0;//     add-int/lit8 v6, p1, 0x1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v1, v6, v1, p1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 533
a=0;//     add-int/lit8 v6, v5, -0x1
a=0;// 
a=0;//     iput v6, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->tail:I
a=0;// 
a=0;//     :goto_2
a=0;//     #v9=(Conflicted);
a=0;//     move v6, v7
a=0;// 
a=0;//     .line 540
a=0;//     #v6=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 535
a=0;//     :cond_3
a=0;//     #v6=(Null);v9=(Uninit);
a=0;//     add-int/lit8 v8, p1, 0x1
a=0;// 
a=0;//     sub-int v9, v4, p1
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-static {v1, v8, v1, p1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 536
a=0;//     aget-object v8, v1, v6
a=0;// 
a=0;//     #v8=(Null);
a=0;//     aput-object v8, v1, v4
a=0;// 
a=0;//     .line 537
a=0;//     invoke-static {v1, v7, v1, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 538
a=0;//     add-int/lit8 v6, v5, -0x1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     and-int/2addr v6, v4
a=0;// 
a=0;//     iput v6, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->tail:I
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private doubleCapacity()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 121
a=0;//     #v6=(Null);
a=0;//     iget v3, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->head:I
a=0;// 
a=0;//     .line 122
a=0;//     .local v3, "p":I
a=0;//     #v3=(Integer);
a=0;//     iget-object v5, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     array-length v1, v5
a=0;// 
a=0;//     .line 123
a=0;//     .local v1, "n":I
a=0;//     #v1=(Integer);
a=0;//     sub-int v4, v1, v3
a=0;// 
a=0;//     .line 124
a=0;//     .local v4, "r":I
a=0;//     #v4=(Integer);
a=0;//     shl-int/lit8 v2, v1, 0x1
a=0;// 
a=0;//     .line 125
a=0;//     .local v2, "newCapacity":I
a=0;//     #v2=(Integer);
a=0;//     if-gez v2, :cond_0
a=0;// 
a=0;//     .line 126
a=0;//     new-instance v5, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v6, "Sorry, deque too big"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v5
a=0;// 
a=0;//     .line 127
a=0;//     :cond_0
a=0;//     #v6=(Null);
a=0;//     new-array v0, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 128
a=0;//     .local v0, "a":[Ljava/lang/Object;
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     iget-object v5, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v5, v3, v0, v6, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 129
a=0;//     iget-object v5, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v5, v6, v0, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 130
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 131
a=0;//     iput v6, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->head:I
a=0;// 
a=0;//     .line 132
a=0;//     iput v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->tail:I
a=0;// 
a=0;//     .line 133
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private readObject(Ljava/io/ObjectInputStream;)V
a=0;//     .locals 4
a=0;//     .param p1, "s"    # Ljava/io/ObjectInputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;,
a=0;//             Ljava/lang/ClassNotFoundException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 864
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V
a=0;// 
a=0;//     .line 867
a=0;//     invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 868
a=0;//     .local v1, "size":I
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, v1}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->allocateElements(I)V
a=0;// 
a=0;//     .line 869
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput v2, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->head:I
a=0;// 
a=0;//     .line 870
a=0;//     iput v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->tail:I
a=0;// 
a=0;//     .line 873
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Reference,[Ljava/lang/Object;);v3=(Conflicted);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 875
a=0;//     return-void
a=0;// 
a=0;//     .line 874
a=0;//     :cond_0
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     aput-object v3, v2, v0
a=0;// 
a=0;//     .line 873
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private writeObject(Ljava/io/ObjectOutputStream;)V
a=0;//     .locals 3
a=0;//     .param p1, "s"    # Ljava/io/ObjectOutputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 848
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V
a=0;// 
a=0;//     .line 851
a=0;//     invoke-virtual {p0}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1, v2}, Ljava/io/ObjectOutputStream;->writeInt(I)V
a=0;// 
a=0;//     .line 854
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v1, v2, -0x1
a=0;// 
a=0;//     .line 855
a=0;//     .local v1, "mask":I
a=0;//     #v1=(Integer);
a=0;//     iget v0, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->head:I
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     iget v2, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->tail:I
a=0;// 
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     .line 857
a=0;//     return-void
a=0;// 
a=0;//     .line 856
a=0;//     :cond_0
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     aget-object v2, v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p1, v2}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 855
a=0;//     add-int/lit8 v2, v0, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     and-int v0, v2, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public add(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TE;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 390
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     .local p1, "e":Ljava/lang/Object;, "TE;"
a=0;//     invoke-virtual {p0, p1}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->addLast(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 391
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public addFirst(Ljava/lang/Object;)V
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TE;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 197
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     .local p1, "e":Ljava/lang/Object;, "TE;"
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 198
a=0;//     new-instance v0, Ljava/lang/NullPointerException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/NullPointerException;);
a=0;//     const-string v1, "e == null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/NullPointerException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 199
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     iget v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->head:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     and-int/2addr v1, v2
a=0;// 
a=0;//     iput v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->head:I
a=0;// 
a=0;//     aput-object p1, v0, v1
a=0;// 
a=0;//     .line 200
a=0;//     iget v0, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->head:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->tail:I
a=0;// 
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 201
a=0;//     invoke-direct {p0}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->doubleCapacity()V
a=0;// 
a=0;//     .line 202
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addLast(Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TE;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 213
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     .local p1, "e":Ljava/lang/Object;, "TE;"
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 214
a=0;//     new-instance v0, Ljava/lang/NullPointerException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/NullPointerException;);
a=0;//     const-string v1, "e == null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/NullPointerException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 215
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     iget v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->tail:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aput-object p1, v0, v1
a=0;// 
a=0;//     .line 216
a=0;//     iget v0, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->tail:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     and-int/2addr v0, v1
a=0;// 
a=0;//     iput v0, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->tail:I
a=0;// 
a=0;//     iget v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->head:I
a=0;// 
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 217
a=0;//     invoke-direct {p0}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->doubleCapacity()V
a=0;// 
a=0;//     .line 218
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public clear()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 706
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     iget v0, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->head:I
a=0;// 
a=0;//     .line 707
a=0;//     .local v0, "h":I
a=0;//     #v0=(Integer);
a=0;//     iget v3, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->tail:I
a=0;// 
a=0;//     .line 708
a=0;//     .local v3, "t":I
a=0;//     #v3=(Integer);
a=0;//     if-eq v0, v3, :cond_1
a=0;// 
a=0;//     .line 709
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     iput v4, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->tail:I
a=0;// 
a=0;//     iput v4, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->head:I
a=0;// 
a=0;//     .line 710
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 711
a=0;//     .local v1, "i":I
a=0;//     #v1=(Integer);
a=0;//     iget-object v4, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     array-length v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v2, v4, -0x1
a=0;// 
a=0;//     .line 713
a=0;//     .local v2, "mask":I
a=0;//     :cond_0
a=0;//     #v2=(Integer);v5=(Conflicted);
a=0;//     iget-object v4, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     aput-object v5, v4, v1
a=0;// 
a=0;//     .line 714
a=0;//     add-int/lit8 v4, v1, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     and-int v1, v4, v2
a=0;// 
a=0;//     .line 715
a=0;//     if-ne v1, v3, :cond_0
a=0;// 
a=0;//     .line 717
a=0;//     .end local v1    # "i":I
a=0;//     .end local v2    # "mask":I
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public clone()Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque",
a=0;//             "<TE;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 794
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     :try_start_0
a=0;//     invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;
a=0;// 
a=0;//     .line 795
a=0;//     .local v1, "result":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget-object v4, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     array-length v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v2, v3, v4}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v1, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 796
a=0;//     return-object v1
a=0;// 
a=0;//     .line 798
a=0;//     .end local v1    # "result":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 799
a=0;//     .local v0, "e":Ljava/lang/CloneNotSupportedException;
a=0;//     #v0=(Reference,Ljava/lang/CloneNotSupportedException;);
a=0;//     new-instance v2, Ljava/lang/AssertionError;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/AssertionError;);
a=0;//     invoke-direct {v2}, Ljava/lang/AssertionError;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/AssertionError;);
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic clone()Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/CloneNotSupportedException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->clone()Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public contains(Ljava/lang/Object;)Z
a=0;//     .locals 5
a=0;//     .param p1, "o"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 671
a=0;//     #v3=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 681
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Boolean);v4=(Conflicted);
a=0;//     return v3
a=0;// 
a=0;//     .line 673
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Null);v4=(Uninit);
a=0;//     iget-object v4, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     array-length v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v1, v4, -0x1
a=0;// 
a=0;//     .line 674
a=0;//     .local v1, "mask":I
a=0;//     #v1=(Integer);
a=0;//     iget v0, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->head:I
a=0;// 
a=0;//     .line 676
a=0;//     .local v0, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     iget-object v4, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     aget-object v2, v4, v0
a=0;// 
a=0;//     .local v2, "x":Ljava/lang/Object;
a=0;//     #v2=(Null);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 677
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 678
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 679
a=0;//     :cond_2
a=0;//     #v3=(Null);
a=0;//     add-int/lit8 v4, v0, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     and-int v0, v4, v1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public descendingIterator()Ljava/util/Iterator;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/Iterator",
a=0;//             "<TE;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 577
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     new-instance v0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DescendingIterator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DescendingIterator;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p0, v1}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DescendingIterator;-><init>(Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DescendingIterator;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DescendingIterator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public element()Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TE;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 449
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     invoke-virtual {p0}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->getFirst()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getFirst()Ljava/lang/Object;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TE;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 292
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     iget v2, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->head:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aget-object v0, v1, v2
a=0;// 
a=0;//     .line 293
a=0;//     .local v0, "result":Ljava/lang/Object;, "TE;"
a=0;//     #v0=(Null);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 294
a=0;//     new-instance v1, Ljava/util/NoSuchElementException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/NoSuchElementException;);
a=0;//     invoke-direct {v1}, Ljava/util/NoSuchElementException;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/NoSuchElementException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 295
a=0;//     :cond_0
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getLast()Ljava/lang/Object;
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TE;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 304
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     iget v2, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->tail:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     array-length v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     and-int/2addr v2, v3
a=0;// 
a=0;//     aget-object v0, v1, v2
a=0;// 
a=0;//     .line 305
a=0;//     .local v0, "result":Ljava/lang/Object;, "TE;"
a=0;//     #v0=(Null);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 306
a=0;//     new-instance v1, Ljava/util/NoSuchElementException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/NoSuchElementException;);
a=0;//     invoke-direct {v1}, Ljava/util/NoSuchElementException;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/NoSuchElementException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 307
a=0;//     :cond_0
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public isEmpty()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 561
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     iget v0, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->head:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->tail:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_0
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
a=0;// .method public iterator()Ljava/util/Iterator;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/Iterator",
a=0;//             "<TE;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 573
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     new-instance v0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p0, v1}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;-><init>(Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/compatible/ArrayDeque$DeqIterator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public offer(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TE;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 404
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     .local p1, "e":Ljava/lang/Object;, "TE;"
a=0;//     invoke-virtual {p0, p1}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->offerLast(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public offerFirst(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TE;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 228
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     .local p1, "e":Ljava/lang/Object;, "TE;"
a=0;//     invoke-virtual {p0, p1}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->addFirst(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 229
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public offerLast(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TE;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 240
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     .local p1, "e":Ljava/lang/Object;, "TE;"
a=0;//     invoke-virtual {p0, p1}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->addLast(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 241
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public peek()Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TE;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 462
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     invoke-virtual {p0}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->peekFirst()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public peekFirst()Ljava/lang/Object;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TE;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 311
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     iget v2, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->head:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aget-object v0, v1, v2
a=0;// 
a=0;//     .line 313
a=0;//     .local v0, "result":Ljava/lang/Object;, "TE;"
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public peekLast()Ljava/lang/Object;
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TE;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 318
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     iget v2, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->tail:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     array-length v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     and-int/2addr v2, v3
a=0;// 
a=0;//     aget-object v0, v1, v2
a=0;// 
a=0;//     .line 319
a=0;//     .local v0, "result":Ljava/lang/Object;, "TE;"
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public poll()Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TE;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 434
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     invoke-virtual {p0}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->pollFirst()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public pollFirst()Ljava/lang/Object;
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TE;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 267
a=0;//     #v2=(Null);
a=0;//     iget v0, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->head:I
a=0;// 
a=0;//     .line 268
a=0;//     .local v0, "h":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     aget-object v1, v3, v0
a=0;// 
a=0;//     .line 270
a=0;//     .local v1, "result":Ljava/lang/Object;, "TE;"
a=0;//     #v1=(Null);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 274
a=0;//     .end local v1    # "result":Ljava/lang/Object;, "TE;"
a=0;//     :goto_0
a=0;//     #v2=(Integer);v3=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 272
a=0;//     .restart local v1    # "result":Ljava/lang/Object;, "TE;"
a=0;//     :cond_0
a=0;//     #v2=(Null);v3=(Reference,[Ljava/lang/Object;);
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     aput-object v2, v3, v0
a=0;// 
a=0;//     .line 273
a=0;//     add-int/lit8 v2, v0, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     array-length v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     and-int/2addr v2, v3
a=0;// 
a=0;//     iput v2, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->head:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public pollLast()Ljava/lang/Object;
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TE;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 278
a=0;//     #v2=(Null);
a=0;//     iget v3, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->tail:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     iget-object v4, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     array-length v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v4, v4, -0x1
a=0;// 
a=0;//     and-int v1, v3, v4
a=0;// 
a=0;//     .line 279
a=0;//     .local v1, "t":I
a=0;//     #v1=(Integer);
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     aget-object v0, v3, v1
a=0;// 
a=0;//     .line 280
a=0;//     .local v0, "result":Ljava/lang/Object;, "TE;"
a=0;//     #v0=(Null);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     move-object v0, v2
a=0;// 
a=0;//     .line 284
a=0;//     .end local v0    # "result":Ljava/lang/Object;, "TE;"
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 282
a=0;//     .restart local v0    # "result":Ljava/lang/Object;, "TE;"
a=0;//     :cond_0
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     aput-object v2, v3, v1
a=0;// 
a=0;//     .line 283
a=0;//     iput v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->tail:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public pop()Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TE;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 492
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     invoke-virtual {p0}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->removeFirst()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public push(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TE;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 477
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     .local p1, "e":Ljava/lang/Object;, "TE;"
a=0;//     invoke-virtual {p0, p1}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->addFirst(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 478
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public remove()Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TE;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 420
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     invoke-virtual {p0}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->removeFirst()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public remove(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .param p1, "o"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 698
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     invoke-virtual {p0, p1}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->removeFirstOccurrence(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public removeFirst()Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TE;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 249
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     invoke-virtual {p0}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->pollFirst()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 250
a=0;//     .local v0, "x":Ljava/lang/Object;, "TE;"
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 251
a=0;//     new-instance v1, Ljava/util/NoSuchElementException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/NoSuchElementException;);
a=0;//     invoke-direct {v1}, Ljava/util/NoSuchElementException;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/NoSuchElementException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 252
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public removeFirstOccurrence(Ljava/lang/Object;)Z
a=0;//     .locals 5
a=0;//     .param p1, "o"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 335
a=0;//     #v3=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 347
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Boolean);v4=(Conflicted);
a=0;//     return v3
a=0;// 
a=0;//     .line 337
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Null);v4=(Uninit);
a=0;//     iget-object v4, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     array-length v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v1, v4, -0x1
a=0;// 
a=0;//     .line 338
a=0;//     .local v1, "mask":I
a=0;//     #v1=(Integer);
a=0;//     iget v0, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->head:I
a=0;// 
a=0;//     .line 340
a=0;//     .local v0, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     iget-object v4, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     aget-object v2, v4, v0
a=0;// 
a=0;//     .local v2, "x":Ljava/lang/Object;
a=0;//     #v2=(Null);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 341
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 342
a=0;//     invoke-direct {p0, v0}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->delete(I)Z
a=0;// 
a=0;//     .line 343
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 345
a=0;//     :cond_2
a=0;//     #v3=(Null);
a=0;//     add-int/lit8 v4, v0, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     and-int v0, v4, v1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public removeLast()Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TE;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 260
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     invoke-virtual {p0}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->pollLast()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 261
a=0;//     .local v0, "x":Ljava/lang/Object;, "TE;"
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 262
a=0;//     new-instance v1, Ljava/util/NoSuchElementException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/NoSuchElementException;);
a=0;//     invoke-direct {v1}, Ljava/util/NoSuchElementException;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/NoSuchElementException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 263
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public removeLastOccurrence(Ljava/lang/Object;)Z
a=0;//     .locals 5
a=0;//     .param p1, "o"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 363
a=0;//     #v3=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 375
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Boolean);v4=(Conflicted);
a=0;//     return v3
a=0;// 
a=0;//     .line 365
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Null);v4=(Uninit);
a=0;//     iget-object v4, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     array-length v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v1, v4, -0x1
a=0;// 
a=0;//     .line 366
a=0;//     .local v1, "mask":I
a=0;//     #v1=(Integer);
a=0;//     iget v4, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->tail:I
a=0;// 
a=0;//     add-int/lit8 v4, v4, -0x1
a=0;// 
a=0;//     and-int v0, v4, v1
a=0;// 
a=0;//     .line 368
a=0;//     .local v0, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     iget-object v4, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     aget-object v2, v4, v0
a=0;// 
a=0;//     .local v2, "x":Ljava/lang/Object;
a=0;//     #v2=(Null);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 369
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 370
a=0;//     invoke-direct {p0, v0}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->delete(I)Z
a=0;// 
a=0;//     .line 371
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 373
a=0;//     :cond_2
a=0;//     #v3=(Null);
a=0;//     add-int/lit8 v4, v0, -0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     and-int v0, v4, v1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public size()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 552
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     iget v0, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->tail:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->head:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->elements:[Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     and-int/2addr v0, v1
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public toArray()[Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 733
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     invoke-virtual {p0}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-direct {p0, v0}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->copyElements([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .param p1, "a"    # [Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">([TT;)[TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 774
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;, "Lcom/lidroid/xutils/util/core/compatible/ArrayDeque<TE;>;"
a=0;//     invoke-virtual {p0}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 775
a=0;//     .local v0, "size":I
a=0;//     #v0=(Integer);
a=0;//     array-length v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v1, v0, :cond_0
a=0;// 
a=0;//     .line 777
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 776
a=0;//     invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     .end local p1    # "a":[Ljava/lang/Object;
a=0;//     check-cast p1, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 778
a=0;//     .restart local p1    # "a":[Ljava/lang/Object;
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-direct {p0, p1}, Lcom/lidroid/xutils/util/core/compatible/ArrayDeque;->copyElements([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     .line 779
a=0;//     array-length v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v1, v0, :cond_1
a=0;// 
a=0;//     .line 780
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     aput-object v1, p1, v0
a=0;// 
a=0;//     .line 781
a=0;//     :cond_1
a=0;//     #v1=(Integer);
a=0;//     return-object p1
a=0;// .end method
}}
