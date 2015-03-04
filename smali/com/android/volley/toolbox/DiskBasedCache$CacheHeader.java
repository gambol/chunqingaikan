package com.android.volley.toolbox; class DiskBasedCache$CacheHeader { void a() { int a;
a=0;// .class Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;
a=0;// .super Ljava/lang/Object;
a=0;// .source "DiskBasedCache.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/android/volley/toolbox/DiskBasedCache;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "CacheHeader"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public etag:Ljava/lang/String;
a=0;// 
a=0;// .field public key:Ljava/lang/String;
a=0;// 
a=0;// .field public responseHeaders:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field public serverDate:J
a=0;// 
a=0;// .field public size:J
a=0;// 
a=0;// .field public softTtl:J
a=0;// 
a=0;// .field public ttl:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 355
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;Lcom/android/volley/Cache$Entry;)V
a=0;//     .locals 2
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;//     .param p2, "entry"    # Lcom/android/volley/Cache$Entry;
a=0;// 
a=0;//     .prologue
a=0;//     .line 362
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 363
a=0;//     #p0=(Reference,Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;);
a=0;//     iput-object p1, p0, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->key:Ljava/lang/String;
a=0;// 
a=0;//     .line 364
a=0;//     iget-object v0, p2, Lcom/android/volley/Cache$Entry;->data:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->size:J
a=0;// 
a=0;//     .line 365
a=0;//     iget-object v0, p2, Lcom/android/volley/Cache$Entry;->etag:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->etag:Ljava/lang/String;
a=0;// 
a=0;//     .line 366
a=0;//     iget-wide v0, p2, Lcom/android/volley/Cache$Entry;->serverDate:J
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     iput-wide v0, p0, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->serverDate:J
a=0;// 
a=0;//     .line 367
a=0;//     iget-wide v0, p2, Lcom/android/volley/Cache$Entry;->ttl:J
a=0;// 
a=0;//     iput-wide v0, p0, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->ttl:J
a=0;// 
a=0;//     .line 368
a=0;//     iget-wide v0, p2, Lcom/android/volley/Cache$Entry;->softTtl:J
a=0;// 
a=0;//     iput-wide v0, p0, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->softTtl:J
a=0;// 
a=0;//     .line 369
a=0;//     iget-object v0, p2, Lcom/android/volley/Cache$Entry;->responseHeaders:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     iput-object v0, p0, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->responseHeaders:Ljava/util/Map;
a=0;// 
a=0;//     .line 370
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static readHeader(Ljava/io/InputStream;)Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;
a=0;//     .locals 4
a=0;//     .param p0, "is"    # Ljava/io/InputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 378
a=0;//     new-instance v0, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;);
a=0;//     invoke-direct {v0}, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;-><init>()V
a=0;// 
a=0;//     .line 379
a=0;//     .local v0, "entry":Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;
a=0;//     #v0=(Reference,Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;);
a=0;//     invoke-static {p0}, Lcom/android/volley/toolbox/DiskBasedCache;->readInt(Ljava/io/InputStream;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 380
a=0;//     .local v1, "magic":I
a=0;//     #v1=(Integer);
a=0;//     const v2, 0x20120504
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eq v1, v2, :cond_0
a=0;// 
a=0;//     .line 382
a=0;//     new-instance v2, Ljava/io/IOException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/IOException;);
a=0;//     invoke-direct {v2}, Ljava/io/IOException;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 384
a=0;//     :cond_0
a=0;//     #v2=(Integer);
a=0;//     invoke-static {p0}, Lcom/android/volley/toolbox/DiskBasedCache;->readString(Ljava/io/InputStream;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, v0, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->key:Ljava/lang/String;
a=0;// 
a=0;//     .line 385
a=0;//     invoke-static {p0}, Lcom/android/volley/toolbox/DiskBasedCache;->readString(Ljava/io/InputStream;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->etag:Ljava/lang/String;
a=0;// 
a=0;//     .line 386
a=0;//     iget-object v2, v0, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->etag:Ljava/lang/String;
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 387
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput-object v2, v0, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->etag:Ljava/lang/String;
a=0;// 
a=0;//     .line 389
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     invoke-static {p0}, Lcom/android/volley/toolbox/DiskBasedCache;->readLong(Ljava/io/InputStream;)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iput-wide v2, v0, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->serverDate:J
a=0;// 
a=0;//     .line 390
a=0;//     invoke-static {p0}, Lcom/android/volley/toolbox/DiskBasedCache;->readLong(Ljava/io/InputStream;)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     iput-wide v2, v0, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->ttl:J
a=0;// 
a=0;//     .line 391
a=0;//     invoke-static {p0}, Lcom/android/volley/toolbox/DiskBasedCache;->readLong(Ljava/io/InputStream;)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     iput-wide v2, v0, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->softTtl:J
a=0;// 
a=0;//     .line 392
a=0;//     invoke-static {p0}, Lcom/android/volley/toolbox/DiskBasedCache;->readStringStringMap(Ljava/io/InputStream;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Map;);
a=0;//     iput-object v2, v0, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->responseHeaders:Ljava/util/Map;
a=0;// 
a=0;//     .line 393
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public toCacheEntry([B)Lcom/android/volley/Cache$Entry;
a=0;//     .locals 3
a=0;//     .param p1, "data"    # [B
a=0;// 
a=0;//     .prologue
a=0;//     .line 400
a=0;//     new-instance v0, Lcom/android/volley/Cache$Entry;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/volley/Cache$Entry;);
a=0;//     invoke-direct {v0}, Lcom/android/volley/Cache$Entry;-><init>()V
a=0;// 
a=0;//     .line 401
a=0;//     .local v0, "e":Lcom/android/volley/Cache$Entry;
a=0;//     #v0=(Reference,Lcom/android/volley/Cache$Entry;);
a=0;//     iput-object p1, v0, Lcom/android/volley/Cache$Entry;->data:[B
a=0;// 
a=0;//     .line 402
a=0;//     iget-object v1, p0, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->etag:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Lcom/android/volley/Cache$Entry;->etag:Ljava/lang/String;
a=0;// 
a=0;//     .line 403
a=0;//     iget-wide v1, p0, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->serverDate:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iput-wide v1, v0, Lcom/android/volley/Cache$Entry;->serverDate:J
a=0;// 
a=0;//     .line 404
a=0;//     iget-wide v1, p0, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->ttl:J
a=0;// 
a=0;//     iput-wide v1, v0, Lcom/android/volley/Cache$Entry;->ttl:J
a=0;// 
a=0;//     .line 405
a=0;//     iget-wide v1, p0, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->softTtl:J
a=0;// 
a=0;//     iput-wide v1, v0, Lcom/android/volley/Cache$Entry;->softTtl:J
a=0;// 
a=0;//     .line 406
a=0;//     iget-object v1, p0, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->responseHeaders:Ljava/util/Map;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     iput-object v1, v0, Lcom/android/volley/Cache$Entry;->responseHeaders:Ljava/util/Map;
a=0;// 
a=0;//     .line 407
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public writeHeader(Ljava/io/OutputStream;)Z
a=0;//     .locals 5
a=0;//     .param p1, "os"    # Ljava/io/OutputStream;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 416
a=0;//     #v2=(Null);
a=0;//     const v3, 0x20120504
a=0;// 
a=0;//     :try_start_0
a=0;//     #v3=(Integer);
a=0;//     invoke-static {p1, v3}, Lcom/android/volley/toolbox/DiskBasedCache;->writeInt(Ljava/io/OutputStream;I)V
a=0;// 
a=0;//     .line 417
a=0;//     iget-object v3, p0, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->key:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v3}, Lcom/android/volley/toolbox/DiskBasedCache;->writeString(Ljava/io/OutputStream;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 418
a=0;//     iget-object v3, p0, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->etag:Ljava/lang/String;
a=0;// 
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-static {p1, v3}, Lcom/android/volley/toolbox/DiskBasedCache;->writeString(Ljava/io/OutputStream;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 419
a=0;//     iget-wide v3, p0, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->serverDate:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-static {p1, v3, v4}, Lcom/android/volley/toolbox/DiskBasedCache;->writeLong(Ljava/io/OutputStream;J)V
a=0;// 
a=0;//     .line 420
a=0;//     iget-wide v3, p0, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->ttl:J
a=0;// 
a=0;//     invoke-static {p1, v3, v4}, Lcom/android/volley/toolbox/DiskBasedCache;->writeLong(Ljava/io/OutputStream;J)V
a=0;// 
a=0;//     .line 421
a=0;//     iget-wide v3, p0, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->softTtl:J
a=0;// 
a=0;//     invoke-static {p1, v3, v4}, Lcom/android/volley/toolbox/DiskBasedCache;->writeLong(Ljava/io/OutputStream;J)V
a=0;// 
a=0;//     .line 422
a=0;//     iget-object v3, p0, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->responseHeaders:Ljava/util/Map;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Map;);
a=0;//     invoke-static {v3, p1}, Lcom/android/volley/toolbox/DiskBasedCache;->writeStringStringMap(Ljava/util/Map;Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 423
a=0;//     invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
a=0;// 
a=0;//     .line 427
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Boolean);v4=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 418
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(One);v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->etag:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 425
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 426
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     const-string v3, "%s"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v1, v2
a=0;// 
a=0;//     invoke-static {v3, v1}, Lcom/android/volley/VolleyLog;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 427
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// .end method
}}
