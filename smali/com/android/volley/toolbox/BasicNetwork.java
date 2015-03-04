package com.android.volley.toolbox; class BasicNetwork { void a() { int a;
a=0;// .class public Lcom/android/volley/toolbox/BasicNetwork;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BasicNetwork.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/android/volley/Network;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field protected static final DEBUG:Z
a=0;// 
a=0;// .field private static DEFAULT_POOL_SIZE:I
a=0;// 
a=0;// .field private static SLOW_REQUEST_THRESHOLD_MS:I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected final mHttpStack:Lcom/android/volley/toolbox/HttpStack;
a=0;// 
a=0;// .field protected final mPool:Lcom/android/volley/toolbox/ByteArrayPool;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     sget-boolean v0, Lcom/android/volley/VolleyLog;->DEBUG:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     sput-boolean v0, Lcom/android/volley/toolbox/BasicNetwork;->DEBUG:Z
a=0;// 
a=0;//     .line 56
a=0;//     const/16 v0, 0xbb8
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     sput v0, Lcom/android/volley/toolbox/BasicNetwork;->SLOW_REQUEST_THRESHOLD_MS:I
a=0;// 
a=0;//     .line 58
a=0;//     const/16 v0, 0x1000
a=0;// 
a=0;//     sput v0, Lcom/android/volley/toolbox/BasicNetwork;->DEFAULT_POOL_SIZE:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/android/volley/toolbox/HttpStack;)V
a=0;//     .locals 2
a=0;//     .param p1, "httpStack"    # Lcom/android/volley/toolbox/HttpStack;
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     new-instance v0, Lcom/android/volley/toolbox/ByteArrayPool;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/volley/toolbox/ByteArrayPool;);
a=0;//     sget v1, Lcom/android/volley/toolbox/BasicNetwork;->DEFAULT_POOL_SIZE:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v0, v1}, Lcom/android/volley/toolbox/ByteArrayPool;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/toolbox/ByteArrayPool;);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/android/volley/toolbox/BasicNetwork;-><init>(Lcom/android/volley/toolbox/HttpStack;Lcom/android/volley/toolbox/ByteArrayPool;)V
a=0;// 
a=0;//     .line 71
a=0;//     #p0=(Reference,Lcom/android/volley/toolbox/BasicNetwork;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/android/volley/toolbox/HttpStack;Lcom/android/volley/toolbox/ByteArrayPool;)V
a=0;//     .locals 0
a=0;//     .param p1, "httpStack"    # Lcom/android/volley/toolbox/HttpStack;
a=0;//     .param p2, "pool"    # Lcom/android/volley/toolbox/ByteArrayPool;
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 78
a=0;//     #p0=(Reference,Lcom/android/volley/toolbox/BasicNetwork;);
a=0;//     iput-object p1, p0, Lcom/android/volley/toolbox/BasicNetwork;->mHttpStack:Lcom/android/volley/toolbox/HttpStack;
a=0;// 
a=0;//     .line 79
a=0;//     iput-object p2, p0, Lcom/android/volley/toolbox/BasicNetwork;->mPool:Lcom/android/volley/toolbox/ByteArrayPool;
a=0;// 
a=0;//     .line 80
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private addCacheHeaders(Ljava/util/Map;Lcom/android/volley/Cache$Entry;)V
a=0;//     .locals 5
a=0;//     .param p2, "entry"    # Lcom/android/volley/Cache$Entry;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Lcom/android/volley/Cache$Entry;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 189
a=0;//     .local p1, "headers":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     .line 201
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 193
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v1, p2, Lcom/android/volley/Cache$Entry;->etag:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 194
a=0;//     const-string v1, "If-None-Match"
a=0;// 
a=0;//     iget-object v2, p2, Lcom/android/volley/Cache$Entry;->etag:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 197
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);
a=0;//     iget-wide v1, p2, Lcom/android/volley/Cache$Entry;->serverDate:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmp-long v1, v1, v3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 198
a=0;//     new-instance v0, Ljava/util/Date;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Date;);
a=0;//     iget-wide v1, p2, Lcom/android/volley/Cache$Entry;->serverDate:J
a=0;// 
a=0;//     #v1=(LongLo);
a=0;//     invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V
a=0;// 
a=0;//     .line 199
a=0;//     .local v0, "refTime":Ljava/util/Date;
a=0;//     #v0=(Reference,Ljava/util/Date;);
a=0;//     const-string v1, "If-Modified-Since"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lorg/apache/http/impl/cookie/DateUtils;->formatDate(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static attemptRetryOnException(Ljava/lang/String;Lcom/android/volley/Request;Lcom/android/volley/VolleyError;)V
a=0;//     .locals 7
a=0;//     .param p0, "logPrefix"    # Ljava/lang/String;
a=0;//     .param p2, "exception"    # Lcom/android/volley/VolleyError;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/android/volley/Request",
a=0;//             "<*>;",
a=0;//             "Lcom/android/volley/VolleyError;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/android/volley/VolleyError;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p1, "request":Lcom/android/volley/Request;, "Lcom/android/volley/Request<*>;"
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 174
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {p1}, Lcom/android/volley/Request;->getRetryPolicy()Lcom/android/volley/RetryPolicy;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 175
a=0;//     .local v2, "retryPolicy":Lcom/android/volley/RetryPolicy;
a=0;//     #v2=(Reference,Lcom/android/volley/RetryPolicy;);
a=0;//     invoke-virtual {p1}, Lcom/android/volley/Request;->getTimeoutMs()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 178
a=0;//     .local v1, "oldTimeout":I
a=0;//     :try_start_0
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v2, p2}, Lcom/android/volley/RetryPolicy;->retry(Lcom/android/volley/VolleyError;)V
a=0;//     :try_end_0
a=0;//     .catch Lcom/android/volley/VolleyError; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 184
a=0;//     const-string v3, "%s-retry [timeout=%s]"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object p0, v4, v5
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v4, v6
a=0;// 
a=0;//     invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {p1, v3}, Lcom/android/volley/Request;->addMarker(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 185
a=0;//     return-void
a=0;// 
a=0;//     .line 179
a=0;//     :catch_0
a=0;//     #v3=(Uninit);v4=(PosByte);v5=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 181
a=0;//     .local v0, "e":Lcom/android/volley/VolleyError;
a=0;//     #v0=(Reference,Lcom/android/volley/VolleyError;);
a=0;//     const-string v3, "%s-timeout-giveup [timeout=%s]"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object p0, v4, v5
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v4, v6
a=0;// 
a=0;//     invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 180
a=0;//     invoke-virtual {p1, v3}, Lcom/android/volley/Request;->addMarker(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 182
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private static convertHeaders([Lorg/apache/http/Header;)Ljava/util/Map;
a=0;//     .locals 4
a=0;//     .param p0, "headers"    # [Lorg/apache/http/Header;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "([",
a=0;//             "Lorg/apache/http/Header;",
a=0;//             ")",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 242
a=0;//     new-instance v1, Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 243
a=0;//     .local v1, "result":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     .line 246
a=0;//     return-object v1
a=0;// 
a=0;//     .line 244
a=0;//     :cond_0
a=0;//     aget-object v2, p0, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v2}, Lorg/apache/http/Header;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     aget-object v3, p0, v0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-interface {v3}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 243
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private entityToBytes(Lorg/apache/http/HttpEntity;)[B
a=0;//     .locals 9
a=0;//     .param p1, "entity"    # Lorg/apache/http/HttpEntity;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;,
a=0;//             Lcom/android/volley/ServerError;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 211
a=0;//     #v8=(Null);
a=0;//     new-instance v1, Lcom/android/volley/toolbox/PoolingByteArrayOutputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/android/volley/toolbox/PoolingByteArrayOutputStream;);
a=0;//     iget-object v5, p0, Lcom/android/volley/toolbox/BasicNetwork;->mPool:Lcom/android/volley/toolbox/ByteArrayPool;
a=0;// 
a=0;//     #v5=(Reference,Lcom/android/volley/toolbox/ByteArrayPool;);
a=0;//     invoke-interface {p1}, Lorg/apache/http/HttpEntity;->getContentLength()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     long-to-int v6, v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-direct {v1, v5, v6}, Lcom/android/volley/toolbox/PoolingByteArrayOutputStream;-><init>(Lcom/android/volley/toolbox/ByteArrayPool;I)V
a=0;// 
a=0;//     .line 212
a=0;//     .local v1, "bytes":Lcom/android/volley/toolbox/PoolingByteArrayOutputStream;
a=0;//     #v1=(Reference,Lcom/android/volley/toolbox/PoolingByteArrayOutputStream;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 214
a=0;//     .local v0, "buffer":[B
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-interface {p1}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 215
a=0;//     .local v4, "in":Ljava/io/InputStream;
a=0;//     #v4=(Reference,Ljava/io/InputStream;);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 216
a=0;//     new-instance v5, Lcom/android/volley/ServerError;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/android/volley/ServerError;);
a=0;//     invoke-direct {v5}, Lcom/android/volley/ServerError;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Lcom/android/volley/ServerError;);
a=0;//     throw v5
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 224
a=0;//     .end local v4    # "in":Ljava/io/InputStream;
a=0;//     :catchall_0
a=0;//     #v0=(Reference,[B);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     .line 227
a=0;//     :try_start_1
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-interface {p1}, Lorg/apache/http/HttpEntity;->consumeContent()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 233
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v6, p0, Lcom/android/volley/toolbox/BasicNetwork;->mPool:Lcom/android/volley/toolbox/ByteArrayPool;
a=0;// 
a=0;//     #v6=(Reference,Lcom/android/volley/toolbox/ByteArrayPool;);
a=0;//     invoke-virtual {v6, v0}, Lcom/android/volley/toolbox/ByteArrayPool;->returnBuf([B)V
a=0;// 
a=0;//     .line 234
a=0;//     invoke-virtual {v1}, Lcom/android/volley/toolbox/PoolingByteArrayOutputStream;->close()V
a=0;// 
a=0;//     .line 235
a=0;//     throw v5
a=0;// 
a=0;//     .line 218
a=0;//     .restart local v4    # "in":Ljava/io/InputStream;
a=0;//     :cond_0
a=0;//     :try_start_2
a=0;//     #v0=(Null);v2=(Uninit);v3=(Uninit);v4=(Reference,Ljava/io/InputStream;);v6=(Integer);v7=(LongHi);
a=0;//     iget-object v5, p0, Lcom/android/volley/toolbox/BasicNetwork;->mPool:Lcom/android/volley/toolbox/ByteArrayPool;
a=0;// 
a=0;//     const/16 v6, 0x400
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     invoke-virtual {v5, v6}, Lcom/android/volley/toolbox/ByteArrayPool;->getBuf(I)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 220
a=0;//     :goto_1
a=0;//     #v0=(Reference,[B);v2=(Conflicted);
a=0;//     invoke-virtual {v4, v0}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .local v2, "count":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-ne v2, v5, :cond_1
a=0;// 
a=0;//     .line 223
a=0;//     invoke-virtual {v1}, Lcom/android/volley/toolbox/PoolingByteArrayOutputStream;->toByteArray()[B
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 227
a=0;//     :try_start_3
a=0;//     #v5=(Reference,[B);
a=0;//     invoke-interface {p1}, Lorg/apache/http/HttpEntity;->consumeContent()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
a=0;// 
a=0;//     .line 233
a=0;//     :goto_2
a=0;//     #v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v6, p0, Lcom/android/volley/toolbox/BasicNetwork;->mPool:Lcom/android/volley/toolbox/ByteArrayPool;
a=0;// 
a=0;//     #v6=(Reference,Lcom/android/volley/toolbox/ByteArrayPool;);
a=0;//     invoke-virtual {v6, v0}, Lcom/android/volley/toolbox/ByteArrayPool;->returnBuf([B)V
a=0;// 
a=0;//     .line 234
a=0;//     invoke-virtual {v1}, Lcom/android/volley/toolbox/PoolingByteArrayOutputStream;->close()V
a=0;// 
a=0;//     .line 223
a=0;//     return-object v5
a=0;// 
a=0;//     .line 221
a=0;//     :cond_1
a=0;//     #v3=(Uninit);v5=(Byte);v6=(PosShort);v7=(LongHi);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     :try_start_4
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v1, v0, v5, v2}, Lcom/android/volley/toolbox/PoolingByteArrayOutputStream;->write([BII)V
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 228
a=0;//     :catch_0
a=0;//     #v5=(Reference,[B);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 231
a=0;//     .local v3, "e":Ljava/io/IOException;
a=0;//     #v3=(Reference,Ljava/io/IOException;);
a=0;//     const-string v6, "Error occured when calling consumingContent"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     new-array v7, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v6, v7}, Lcom/android/volley/VolleyLog;->v(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 228
a=0;//     .end local v2    # "count":I
a=0;//     .end local v3    # "e":Ljava/io/IOException;
a=0;//     .end local v4    # "in":Ljava/io/InputStream;
a=0;//     :catch_1
a=0;//     #v2=(Conflicted);v3=(Uninit);v4=(Conflicted);v6=(Integer);v7=(LongHi);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 231
a=0;//     .restart local v3    # "e":Ljava/io/IOException;
a=0;//     #v3=(Reference,Ljava/io/IOException;);
a=0;//     const-string v6, "Error occured when calling consumingContent"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     new-array v7, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v6, v7}, Lcom/android/volley/VolleyLog;->v(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private logSlowRequests(JLcom/android/volley/Request;[BLorg/apache/http/StatusLine;)V
a=0;//     .locals 4
a=0;//     .param p1, "requestLifetime"    # J
a=0;//     .param p4, "responseContents"    # [B
a=0;//     .param p5, "statusLine"    # Lorg/apache/http/StatusLine;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(J",
a=0;//             "Lcom/android/volley/Request",
a=0;//             "<*>;[B",
a=0;//             "Lorg/apache/http/StatusLine;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 159
a=0;//     .local p3, "request":Lcom/android/volley/Request;, "Lcom/android/volley/Request<*>;"
a=0;//     sget-boolean v0, Lcom/android/volley/toolbox/BasicNetwork;->DEBUG:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     sget v0, Lcom/android/volley/toolbox/BasicNetwork;->SLOW_REQUEST_THRESHOLD_MS:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmp-long v0, p1, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     .line 160
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const-string v1, "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v2, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 161
a=0;//     #v0=(Null);
a=0;//     aput-object p3, v2, v0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v3, v2, v0
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     .line 162
a=0;//     #v3=(PosByte);
a=0;//     if-eqz p4, :cond_2
a=0;// 
a=0;//     array-length v0, p4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     aput-object v0, v2, v3
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     .line 163
a=0;//     #v0=(PosByte);
a=0;//     invoke-interface {p5}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v3, v2, v0
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     invoke-virtual {p3}, Lcom/android/volley/Request;->getRetryPolicy()Lcom/android/volley/RetryPolicy;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v3}, Lcom/android/volley/RetryPolicy;->getCurrentRetryCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v3, v2, v0
a=0;// 
a=0;//     .line 160
a=0;//     invoke-static {v1, v2}, Lcom/android/volley/VolleyLog;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 165
a=0;//     :cond_1
a=0;//     #v0=(Byte);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 162
a=0;//     :cond_2
a=0;//     #v0=(One);v1=(Reference,Ljava/lang/String;);v2=(Reference,[Ljava/lang/Object;);v3=(PosByte);
a=0;//     const-string v0, "null"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected logError(Ljava/lang/String;Ljava/lang/String;J)V
a=0;//     .locals 7
a=0;//     .param p1, "what"    # Ljava/lang/String;
a=0;//     .param p2, "url"    # Ljava/lang/String;
a=0;//     .param p3, "start"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 204
a=0;//     invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 205
a=0;//     .local v0, "now":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-string v2, "HTTP ERROR(%s) %d ms to fetch %s"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aput-object p1, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     sub-long v5, v0, p3
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     aput-object p2, v3, v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/android/volley/VolleyLog;->v(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 206
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public performRequest(Lcom/android/volley/Request;)Lcom/android/volley/NetworkResponse;
a=0;//     .locals 17
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/android/volley/Request",
a=0;//             "<*>;)",
a=0;//             "Lcom/android/volley/NetworkResponse;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/android/volley/VolleyError;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     .local p1, "request":Lcom/android/volley/Request;, "Lcom/android/volley/Request<*>;"
a=0;//     invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
a=0;// 
a=0;//     move-result-wide v11
a=0;// 
a=0;//     .line 86
a=0;//     .local v11, "requestStart":J
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(LongLo);v12=(LongHi);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 87
a=0;//     .local v9, "httpResponse":Lorg/apache/http/HttpResponse;
a=0;//     #v9=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 88
a=0;//     .local v5, "responseContents":[B
a=0;//     #v5=(Null);
a=0;//     new-instance v13, Ljava/util/HashMap;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v13}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 91
a=0;//     .local v13, "responseHeaders":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     :try_start_0
a=0;//     #v13=(Reference,Ljava/util/HashMap;);
a=0;//     new-instance v8, Ljava/util/HashMap;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v8}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 92
a=0;//     .local v8, "headers":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     #v8=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/android/volley/Request;->getCacheEntry()Lcom/android/volley/Cache$Entry;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/volley/Cache$Entry;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/toolbox/BasicNetwork;);
a=0;//     invoke-direct {v0, v8, v1}, Lcom/android/volley/toolbox/BasicNetwork;->addCacheHeaders(Ljava/util/Map;Lcom/android/volley/Cache$Entry;)V
a=0;// 
a=0;//     .line 93
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/android/volley/toolbox/BasicNetwork;->mHttpStack:Lcom/android/volley/toolbox/HttpStack;
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-interface {v1, v0, v8}, Lcom/android/volley/toolbox/HttpStack;->performRequest(Lcom/android/volley/Request;Ljava/util/Map;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 94
a=0;//     #v9=(Reference,Lorg/apache/http/HttpResponse;);
a=0;//     invoke-interface {v9}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 95
a=0;//     .local v6, "statusLine":Lorg/apache/http/StatusLine;
a=0;//     #v6=(Reference,Lorg/apache/http/StatusLine;);
a=0;//     invoke-interface {v6}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 97
a=0;//     .local v14, "statusCode":I
a=0;//     #v14=(Integer);
a=0;//     invoke-interface {v9}, Lorg/apache/http/HttpResponse;->getAllHeaders()[Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/android/volley/toolbox/BasicNetwork;->convertHeaders([Lorg/apache/http/Header;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 99
a=0;//     const/16 v1, 0x130
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     if-ne v14, v1, :cond_0
a=0;// 
a=0;//     .line 100
a=0;//     new-instance v1, Lcom/android/volley/NetworkResponse;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/android/volley/NetworkResponse;);
a=0;//     const/16 v4, 0x130
a=0;// 
a=0;//     .line 101
a=0;//     #v4=(PosShort);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/android/volley/Request;->getCacheEntry()Lcom/android/volley/Cache$Entry;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     #v15=(Reference,Lcom/android/volley/Cache$Entry;);
a=0;//     iget-object v15, v15, Lcom/android/volley/Cache$Entry;->data:[B
a=0;// 
a=0;//     const/16 v16, 0x1
a=0;// 
a=0;//     .line 100
a=0;//     #v16=(One);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {v1, v4, v15, v13, v0}, Lcom/android/volley/NetworkResponse;-><init>(I[BLjava/util/Map;Z)V
a=0;// 
a=0;//     .line 120
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Reference,Lcom/android/volley/NetworkResponse;);v5=(Reference,[B);v15=(Conflicted);v16=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 105
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/android/volley/Request;);v1=(PosShort);v4=(Conflicted);v5=(Null);
a=0;//     invoke-interface {v9}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 106
a=0;//     invoke-interface {v9}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcom/android/volley/toolbox/BasicNetwork;->entityToBytes(Lorg/apache/http/HttpEntity;)[B
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 114
a=0;//     :goto_2
a=0;//     #v5=(Reference,[B);
a=0;//     invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
a=0;// 
a=0;//     move-result-wide v15
a=0;// 
a=0;//     #v15=(LongLo);v16=(LongHi);
a=0;//     sub-long v2, v15, v11
a=0;// 
a=0;//     .local v2, "requestLifetime":J
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     move-object/from16 v4, p1
a=0;// 
a=0;//     .line 115
a=0;//     #v4=(Reference,Lcom/android/volley/Request;);
a=0;//     invoke-direct/range {v1 .. v6}, Lcom/android/volley/toolbox/BasicNetwork;->logSlowRequests(JLcom/android/volley/Request;[BLorg/apache/http/StatusLine;)V
a=0;// 
a=0;//     .line 117
a=0;//     const/16 v1, 0xc8
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     if-lt v14, v1, :cond_1
a=0;// 
a=0;//     const/16 v1, 0x12b
a=0;// 
a=0;//     if-le v14, v1, :cond_3
a=0;// 
a=0;//     .line 118
a=0;//     :cond_1
a=0;//     new-instance v1, Ljava/io/IOException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/IOException;);
a=0;//     invoke-direct {v1}, Ljava/io/IOException;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     throw v1
a=0;//     :try_end_0
a=0;//     .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_2
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
a=0;// 
a=0;//     .line 121
a=0;//     .end local v2    # "requestLifetime":J
a=0;//     .end local v6    # "statusLine":Lorg/apache/http/StatusLine;
a=0;//     .end local v8    # "headers":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     .end local v14    # "statusCode":I
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v8=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     move-exception v7
a=0;// 
a=0;//     .line 122
a=0;//     .local v7, "e":Ljava/net/SocketTimeoutException;
a=0;//     #v7=(Reference,Ljava/net/SocketTimeoutException;);
a=0;//     const-string v1, "socket"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Lcom/android/volley/TimeoutError;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/android/volley/TimeoutError;);
a=0;//     invoke-direct {v4}, Lcom/android/volley/TimeoutError;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Lcom/android/volley/TimeoutError;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/Request;);
a=0;//     invoke-static {v1, v0, v4}, Lcom/android/volley/toolbox/BasicNetwork;->attemptRetryOnException(Ljava/lang/String;Lcom/android/volley/Request;Lcom/android/volley/VolleyError;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 110
a=0;//     .end local v7    # "e":Ljava/net/SocketTimeoutException;
a=0;//     .restart local v6    # "statusLine":Lorg/apache/http/StatusLine;
a=0;//     .restart local v8    # "headers":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     .restart local v14    # "statusCode":I
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);v5=(Null);v6=(Reference,Lorg/apache/http/StatusLine;);v7=(Conflicted);v8=(Reference,Ljava/util/HashMap;);v14=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v1=(Null);
a=0;//     new-array v5, v1, [B
a=0;// 
a=0;//     #v5=(Reference,[B);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 120
a=0;//     .restart local v2    # "requestLifetime":J
a=0;//     :cond_3
a=0;//     #v1=(PosShort);v2=(LongLo);v3=(LongHi);v4=(Reference,Lcom/android/volley/Request;);v15=(LongLo);v16=(LongHi);
a=0;//     new-instance v1, Lcom/android/volley/NetworkResponse;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/android/volley/NetworkResponse;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-direct {v1, v14, v5, v13, v4}, Lcom/android/volley/NetworkResponse;-><init>(I[BLjava/util/Map;Z)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_2
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/volley/NetworkResponse;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 123
a=0;//     .end local v2    # "requestLifetime":J
a=0;//     .end local v6    # "statusLine":Lorg/apache/http/StatusLine;
a=0;//     .end local v8    # "headers":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     .end local v14    # "statusCode":I
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v8=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     move-exception v7
a=0;// 
a=0;//     .line 124
a=0;//     .local v7, "e":Lorg/apache/http/conn/ConnectTimeoutException;
a=0;//     #v7=(Reference,Lorg/apache/http/conn/ConnectTimeoutException;);
a=0;//     const-string v1, "connection"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Lcom/android/volley/TimeoutError;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/android/volley/TimeoutError;);
a=0;//     invoke-direct {v4}, Lcom/android/volley/TimeoutError;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Lcom/android/volley/TimeoutError;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/Request;);
a=0;//     invoke-static {v1, v0, v4}, Lcom/android/volley/toolbox/BasicNetwork;->attemptRetryOnException(Ljava/lang/String;Lcom/android/volley/Request;Lcom/android/volley/VolleyError;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 125
a=0;//     .end local v7    # "e":Lorg/apache/http/conn/ConnectTimeoutException;
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v7
a=0;// 
a=0;//     .line 126
a=0;//     .local v7, "e":Ljava/net/MalformedURLException;
a=0;//     #v7=(Reference,Ljava/net/MalformedURLException;);
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v15, "Bad URL "
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/android/volley/Request;->getUrl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v1, v4, v7}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 127
a=0;//     .end local v7    # "e":Ljava/net/MalformedURLException;
a=0;//     :catch_3
a=0;//     #v1=(Conflicted);v4=(Conflicted);v7=(Conflicted);v15=(Conflicted);
a=0;//     move-exception v7
a=0;// 
a=0;//     .line 128
a=0;//     .local v7, "e":Ljava/io/IOException;
a=0;//     #v7=(Reference,Ljava/io/IOException;);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     .line 129
a=0;//     .restart local v14    # "statusCode":I
a=0;//     #v14=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 130
a=0;//     .local v10, "networkResponse":Lcom/android/volley/NetworkResponse;
a=0;//     #v10=(Null);
a=0;//     if-eqz v9, :cond_5
a=0;// 
a=0;//     .line 131
a=0;//     invoke-interface {v9}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/StatusLine;);
a=0;//     invoke-interface {v1}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 135
a=0;//     #v14=(Integer);
a=0;//     const-string v1, "Unexpected response code %d for %s"
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     #v15=(Null);
a=0;//     invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v16, v4, v15
a=0;// 
a=0;//     const/4 v15, 0x1
a=0;// 
a=0;//     #v15=(One);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/android/volley/Request;->getUrl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     aput-object v16, v4, v15
a=0;// 
a=0;//     invoke-static {v1, v4}, Lcom/android/volley/VolleyLog;->e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 136
a=0;//     if-eqz v5, :cond_7
a=0;// 
a=0;//     .line 137
a=0;//     new-instance v10, Lcom/android/volley/NetworkResponse;
a=0;// 
a=0;//     .line 138
a=0;//     .end local v10    # "networkResponse":Lcom/android/volley/NetworkResponse;
a=0;//     #v10=(UninitRef,Lcom/android/volley/NetworkResponse;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 137
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v10, v14, v5, v13, v1}, Lcom/android/volley/NetworkResponse;-><init>(I[BLjava/util/Map;Z)V
a=0;// 
a=0;//     .line 139
a=0;//     .restart local v10    # "networkResponse":Lcom/android/volley/NetworkResponse;
a=0;//     #v10=(Reference,Lcom/android/volley/NetworkResponse;);
a=0;//     const/16 v1, 0x191
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     if-eq v14, v1, :cond_4
a=0;// 
a=0;//     .line 140
a=0;//     const/16 v1, 0x193
a=0;// 
a=0;//     if-ne v14, v1, :cond_6
a=0;// 
a=0;//     .line 141
a=0;//     :cond_4
a=0;//     const-string v1, "auth"
a=0;// 
a=0;//     .line 142
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Lcom/android/volley/AuthFailureError;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/android/volley/AuthFailureError;);
a=0;//     invoke-direct {v4, v10}, Lcom/android/volley/AuthFailureError;-><init>(Lcom/android/volley/NetworkResponse;)V
a=0;// 
a=0;//     .line 141
a=0;//     #v4=(Reference,Lcom/android/volley/AuthFailureError;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/Request;);
a=0;//     invoke-static {v1, v0, v4}, Lcom/android/volley/toolbox/BasicNetwork;->attemptRetryOnException(Ljava/lang/String;Lcom/android/volley/Request;Lcom/android/volley/VolleyError;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 133
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v10=(Null);v14=(Null);v15=(Conflicted);v16=(Conflicted);
a=0;//     new-instance v1, Lcom/android/volley/NoConnectionError;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/android/volley/NoConnectionError;);
a=0;//     invoke-direct {v1, v7}, Lcom/android/volley/NoConnectionError;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/volley/NoConnectionError;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 145
a=0;//     :cond_6
a=0;//     #v1=(PosShort);v4=(Reference,[Ljava/lang/Object;);v10=(Reference,Lcom/android/volley/NetworkResponse;);v14=(Integer);v15=(One);v16=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Lcom/android/volley/ServerError;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/android/volley/ServerError;);
a=0;//     invoke-direct {v1, v10}, Lcom/android/volley/ServerError;-><init>(Lcom/android/volley/NetworkResponse;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/volley/ServerError;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 148
a=0;//     :cond_7
a=0;//     #v10=(Null);
a=0;//     new-instance v1, Lcom/android/volley/NetworkError;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/android/volley/NetworkError;);
a=0;//     invoke-direct {v1, v10}, Lcom/android/volley/NetworkError;-><init>(Lcom/android/volley/NetworkResponse;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/volley/NetworkError;);
a=0;//     throw v1
a=0;// .end method
}}
