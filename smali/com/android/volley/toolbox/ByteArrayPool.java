package com.android.volley.toolbox; class ByteArrayPool { void a() { int a;
a=0;// .class public Lcom/android/volley/toolbox/ByteArrayPool;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ByteArrayPool.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field protected static final BUF_COMPARATOR:Ljava/util/Comparator;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Comparator",
a=0;//             "<[B>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mBuffersByLastUse:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<[B>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mBuffersBySize:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<[B>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mCurrentSize:I
a=0;// 
a=0;// .field private final mSizeLimit:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     new-instance v0, Lcom/android/volley/toolbox/ByteArrayPool$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/volley/toolbox/ByteArrayPool$1;);
a=0;//     invoke-direct {v0}, Lcom/android/volley/toolbox/ByteArrayPool$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/toolbox/ByteArrayPool$1;);
a=0;//     sput-object v0, Lcom/android/volley/toolbox/ByteArrayPool;->BUF_COMPARATOR:Ljava/util/Comparator;
a=0;// 
a=0;//     .line 74
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(I)V
a=0;//     .locals 2
a=0;//     .param p1, "sizeLimit"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 56
a=0;//     #p0=(Reference,Lcom/android/volley/toolbox/ByteArrayPool;);
a=0;//     new-instance v0, Ljava/util/LinkedList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/LinkedList;);
a=0;//     invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     iput-object v0, p0, Lcom/android/volley/toolbox/ByteArrayPool;->mBuffersByLastUse:Ljava/util/List;
a=0;// 
a=0;//     .line 57
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     const/16 v1, 0x40
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/android/volley/toolbox/ByteArrayPool;->mBuffersBySize:Ljava/util/List;
a=0;// 
a=0;//     .line 60
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/android/volley/toolbox/ByteArrayPool;->mCurrentSize:I
a=0;// 
a=0;//     .line 80
a=0;//     iput p1, p0, Lcom/android/volley/toolbox/ByteArrayPool;->mSizeLimit:I
a=0;// 
a=0;//     .line 81
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized trim()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 128
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget v1, p0, Lcom/android/volley/toolbox/ByteArrayPool;->mCurrentSize:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/android/volley/toolbox/ByteArrayPool;->mSizeLimit:I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-gt v1, v2, :cond_0
a=0;// 
a=0;//     .line 133
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 129
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     iget-object v1, p0, Lcom/android/volley/toolbox/ByteArrayPool;->mBuffersByLastUse:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v1, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, [B
a=0;// 
a=0;//     .line 130
a=0;//     .local v0, "buf":[B
a=0;//     iget-object v1, p0, Lcom/android/volley/toolbox/ByteArrayPool;->mBuffersBySize:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 131
a=0;//     iget v1, p0, Lcom/android/volley/toolbox/ByteArrayPool;->mCurrentSize:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     array-length v2, v0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int/2addr v1, v2
a=0;// 
a=0;//     iput v1, p0, Lcom/android/volley/toolbox/ByteArrayPool;->mCurrentSize:I
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 128
a=0;//     .end local v0    # "buf":[B
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public declared-synchronized getBuf(I)[B
a=0;//     .locals 4
a=0;//     .param p1, "len"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     monitor-enter p0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/android/volley/toolbox/ByteArrayPool;->mBuffersBySize:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v1, v2, :cond_0
a=0;// 
a=0;//     .line 101
a=0;//     new-array v0, p1, [B
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,[B);v2=(Conflicted);v3=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 93
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Conflicted);v2=(Integer);v3=(Uninit);
a=0;//     iget-object v2, p0, Lcom/android/volley/toolbox/ByteArrayPool;->mBuffersBySize:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, [B
a=0;// 
a=0;//     .line 94
a=0;//     .local v0, "buf":[B
a=0;//     array-length v2, v0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v2, p1, :cond_1
a=0;// 
a=0;//     .line 95
a=0;//     iget v2, p0, Lcom/android/volley/toolbox/ByteArrayPool;->mCurrentSize:I
a=0;// 
a=0;//     array-length v3, v0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     iput v2, p0, Lcom/android/volley/toolbox/ByteArrayPool;->mCurrentSize:I
a=0;// 
a=0;//     .line 96
a=0;//     iget-object v2, p0, Lcom/android/volley/toolbox/ByteArrayPool;->mBuffersBySize:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v2, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     .line 97
a=0;//     iget-object v2, p0, Lcom/android/volley/toolbox/ByteArrayPool;->mBuffersByLastUse:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v2, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 92
a=0;//     .end local v0    # "buf":[B
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v2
a=0;// 
a=0;//     .restart local v0    # "buf":[B
a=0;//     :cond_1
a=0;//     #v0=(Reference,[B);v2=(Integer);v3=(Uninit);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized returnBuf([B)V
a=0;//     .locals 3
a=0;//     .param p1, "buf"    # [B
a=0;// 
a=0;//     .prologue
a=0;//     .line 111
a=0;//     monitor-enter p0
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     array-length v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/android/volley/toolbox/ByteArrayPool;->mSizeLimit:I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-le v1, v2, :cond_1
a=0;// 
a=0;//     .line 122
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 114
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v1=(Integer);v2=(Integer);
a=0;//     iget-object v1, p0, Lcom/android/volley/toolbox/ByteArrayPool;->mBuffersByLastUse:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 115
a=0;//     iget-object v1, p0, Lcom/android/volley/toolbox/ByteArrayPool;->mBuffersBySize:Ljava/util/List;
a=0;// 
a=0;//     sget-object v2, Lcom/android/volley/toolbox/ByteArrayPool;->BUF_COMPARATOR:Ljava/util/Comparator;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Comparator;);
a=0;//     invoke-static {v1, p1, v2}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 116
a=0;//     .local v0, "pos":I
a=0;//     #v0=(Integer);
a=0;//     if-gez v0, :cond_2
a=0;// 
a=0;//     .line 117
a=0;//     neg-int v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v0, v1, -0x1
a=0;// 
a=0;//     .line 119
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/android/volley/toolbox/ByteArrayPool;->mBuffersBySize:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v1, v0, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 120
a=0;//     iget v1, p0, Lcom/android/volley/toolbox/ByteArrayPool;->mCurrentSize:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     array-length v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     iput v1, p0, Lcom/android/volley/toolbox/ByteArrayPool;->mCurrentSize:I
a=0;// 
a=0;//     .line 121
a=0;//     invoke-direct {p0}, Lcom/android/volley/toolbox/ByteArrayPool;->trim()V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 111
a=0;//     .end local v0    # "pos":I
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v1
a=0;// .end method
}}
