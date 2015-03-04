package com.android.volley.toolbox; class PoolingByteArrayOutputStream { void a() { int a;
a=0;// .class public Lcom/android/volley/toolbox/PoolingByteArrayOutputStream;
a=0;// .super Ljava/io/ByteArrayOutputStream;
a=0;// .source "PoolingByteArrayOutputStream.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DEFAULT_SIZE:I = 0x100
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mPool:Lcom/android/volley/toolbox/ByteArrayPool;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/android/volley/toolbox/ByteArrayPool;)V
a=0;//     .locals 1
a=0;//     .param p1, "pool"    # Lcom/android/volley/toolbox/ByteArrayPool;
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     const/16 v0, 0x100
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/android/volley/toolbox/PoolingByteArrayOutputStream;-><init>(Lcom/android/volley/toolbox/ByteArrayPool;I)V
a=0;// 
a=0;//     .line 41
a=0;//     #p0=(Reference,Lcom/android/volley/toolbox/PoolingByteArrayOutputStream;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/android/volley/toolbox/ByteArrayPool;I)V
a=0;//     .locals 2
a=0;//     .param p1, "pool"    # Lcom/android/volley/toolbox/ByteArrayPool;
a=0;//     .param p2, "size"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     invoke-direct {p0}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 52
a=0;//     #p0=(Reference,Lcom/android/volley/toolbox/PoolingByteArrayOutputStream;);
a=0;//     iput-object p1, p0, Lcom/android/volley/toolbox/PoolingByteArrayOutputStream;->mPool:Lcom/android/volley/toolbox/ByteArrayPool;
a=0;// 
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/android/volley/toolbox/PoolingByteArrayOutputStream;->mPool:Lcom/android/volley/toolbox/ByteArrayPool;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/toolbox/ByteArrayPool;);
a=0;//     const/16 v1, 0x100
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-static {p2, v1}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/android/volley/toolbox/ByteArrayPool;->getBuf(I)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/android/volley/toolbox/PoolingByteArrayOutputStream;->buf:[B
a=0;// 
a=0;//     .line 54
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private expand(I)V
a=0;//     .locals 4
a=0;//     .param p1, "i"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 73
a=0;//     #v3=(Null);
a=0;//     iget v1, p0, Lcom/android/volley/toolbox/PoolingByteArrayOutputStream;->count:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v1, p1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/android/volley/toolbox/PoolingByteArrayOutputStream;->buf:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-gt v1, v2, :cond_0
a=0;// 
a=0;//     .line 80
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 76
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Integer);v2=(Integer);
a=0;//     iget-object v1, p0, Lcom/android/volley/toolbox/PoolingByteArrayOutputStream;->mPool:Lcom/android/volley/toolbox/ByteArrayPool;
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/volley/toolbox/ByteArrayPool;);
a=0;//     iget v2, p0, Lcom/android/volley/toolbox/PoolingByteArrayOutputStream;->count:I
a=0;// 
a=0;//     add-int/2addr v2, p1
a=0;// 
a=0;//     mul-int/lit8 v2, v2, 0x2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/android/volley/toolbox/ByteArrayPool;->getBuf(I)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 77
a=0;//     .local v0, "newbuf":[B
a=0;//     #v0=(Reference,[B);
a=0;//     iget-object v1, p0, Lcom/android/volley/toolbox/PoolingByteArrayOutputStream;->buf:[B
a=0;// 
a=0;//     iget v2, p0, Lcom/android/volley/toolbox/PoolingByteArrayOutputStream;->count:I
a=0;// 
a=0;//     invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 78
a=0;//     iget-object v1, p0, Lcom/android/volley/toolbox/PoolingByteArrayOutputStream;->mPool:Lcom/android/volley/toolbox/ByteArrayPool;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/android/volley/toolbox/PoolingByteArrayOutputStream;->buf:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     invoke-virtual {v1, v2}, Lcom/android/volley/toolbox/ByteArrayPool;->returnBuf([B)V
a=0;// 
a=0;//     .line 79
a=0;//     iput-object v0, p0, Lcom/android/volley/toolbox/PoolingByteArrayOutputStream;->buf:[B
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public close()V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     iget-object v0, p0, Lcom/android/volley/toolbox/PoolingByteArrayOutputStream;->mPool:Lcom/android/volley/toolbox/ByteArrayPool;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/toolbox/ByteArrayPool;);
a=0;//     iget-object v1, p0, Lcom/android/volley/toolbox/PoolingByteArrayOutputStream;->buf:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     invoke-virtual {v0, v1}, Lcom/android/volley/toolbox/ByteArrayPool;->returnBuf([B)V
a=0;// 
a=0;//     .line 59
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/android/volley/toolbox/PoolingByteArrayOutputStream;->buf:[B
a=0;// 
a=0;//     .line 60
a=0;//     invoke-super {p0}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     .line 61
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public finalize()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     iget-object v0, p0, Lcom/android/volley/toolbox/PoolingByteArrayOutputStream;->mPool:Lcom/android/volley/toolbox/ByteArrayPool;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/toolbox/ByteArrayPool;);
a=0;//     iget-object v1, p0, Lcom/android/volley/toolbox/PoolingByteArrayOutputStream;->buf:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     invoke-virtual {v0, v1}, Lcom/android/volley/toolbox/ByteArrayPool;->returnBuf([B)V
a=0;// 
a=0;//     .line 66
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized write(I)V
a=0;//     .locals 1
a=0;//     .param p1, "oneByte"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     monitor-enter p0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0}, Lcom/android/volley/toolbox/PoolingByteArrayOutputStream;->expand(I)V
a=0;// 
a=0;//     .line 91
a=0;//     invoke-super {p0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 92
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 90
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized write([BII)V
a=0;//     .locals 1
a=0;//     .param p1, "buffer"    # [B
a=0;//     .param p2, "offset"    # I
a=0;//     .param p3, "len"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-direct {p0, p3}, Lcom/android/volley/toolbox/PoolingByteArrayOutputStream;->expand(I)V
a=0;// 
a=0;//     .line 85
a=0;//     invoke-super {p0, p1, p2, p3}, Ljava/io/ByteArrayOutputStream;->write([BII)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 86
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 84
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
