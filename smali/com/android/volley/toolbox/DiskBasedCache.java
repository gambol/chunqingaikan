package com.android.volley.toolbox; class DiskBasedCache { void a() { int a;
a=0;// .class public Lcom/android/volley/toolbox/DiskBasedCache;
a=0;// .super Ljava/lang/Object;
a=0;// .source "DiskBasedCache.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/android/volley/Cache;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;,
a=0;//         Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final CACHE_MAGIC:I = 0x20120504
a=0;// 
a=0;// .field private static final DEFAULT_DISK_USAGE_BYTES:I = 0x500000
a=0;// 
a=0;// .field private static final HYSTERESIS_FACTOR:F = 0.9f
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mEntries:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final mMaxCacheSizeInBytes:I
a=0;// 
a=0;// .field private final mRootDirectory:Ljava/io/File;
a=0;// 
a=0;// .field private mTotalSize:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/io/File;)V
a=0;//     .locals 1
a=0;//     .param p1, "rootDirectory"    # Ljava/io/File;
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     const/high16 v0, 0x500000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/android/volley/toolbox/DiskBasedCache;-><init>(Ljava/io/File;I)V
a=0;// 
a=0;//     .line 83
a=0;//     #p0=(Reference,Lcom/android/volley/toolbox/DiskBasedCache;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/io/File;I)V
a=0;//     .locals 4
a=0;//     .param p1, "rootDirectory"    # Ljava/io/File;
a=0;//     .param p2, "maxCacheSizeInBytes"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 46
a=0;//     #p0=(Reference,Lcom/android/volley/toolbox/DiskBasedCache;);
a=0;//     new-instance v0, Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/LinkedHashMap;);
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const/high16 v2, 0x3f400000    # 0.75f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-direct {v0, v1, v2, v3}, Ljava/util/LinkedHashMap;-><init>(IFZ)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedHashMap;);
a=0;//     iput-object v0, p0, Lcom/android/volley/toolbox/DiskBasedCache;->mEntries:Ljava/util/Map;
a=0;// 
a=0;//     .line 49
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/android/volley/toolbox/DiskBasedCache;->mTotalSize:J
a=0;// 
a=0;//     .line 72
a=0;//     iput-object p1, p0, Lcom/android/volley/toolbox/DiskBasedCache;->mRootDirectory:Ljava/io/File;
a=0;// 
a=0;//     .line 73
a=0;//     iput p2, p0, Lcom/android/volley/toolbox/DiskBasedCache;->mMaxCacheSizeInBytes:I
a=0;// 
a=0;//     .line 74
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private getFilenameForKey(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 4
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 232
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     div-int/lit8 v0, v2, 0x2
a=0;// 
a=0;//     .line 233
a=0;//     .local v0, "firstHalfLength":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->hashCode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 234
a=0;//     .local v1, "localFilename":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->hashCode()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 235
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method private pruneIfNeeded(I)V
a=0;//     .locals 14
a=0;//     .param p1, "neededSpace"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 250
a=0;//     iget-wide v9, p0, Lcom/android/volley/toolbox/DiskBasedCache;->mTotalSize:J
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     int-to-long v11, p1
a=0;// 
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     add-long/2addr v9, v11
a=0;// 
a=0;//     iget v11, p0, Lcom/android/volley/toolbox/DiskBasedCache;->mMaxCacheSizeInBytes:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     int-to-long v11, v11
a=0;// 
a=0;//     #v11=(LongLo);
a=0;//     cmp-long v9, v9, v11
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     if-gez v9, :cond_1
a=0;// 
a=0;//     .line 284
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 253
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Byte);v10=(LongHi);v11=(LongLo);v12=(LongHi);v13=(Uninit);
a=0;//     sget-boolean v9, Lcom/android/volley/VolleyLog;->DEBUG:Z
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_2
a=0;// 
a=0;//     .line 254
a=0;//     const-string v9, "Pruning old cache entries."
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     new-array v10, v10, [Ljava/lang/Object;
a=0;// 
a=0;//     #v10=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v9, v10}, Lcom/android/volley/VolleyLog;->v(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 257
a=0;//     :cond_2
a=0;//     #v9=(Conflicted);v10=(Conflicted);
a=0;//     iget-wide v0, p0, Lcom/android/volley/toolbox/DiskBasedCache;->mTotalSize:J
a=0;// 
a=0;//     .line 258
a=0;//     .local v0, "before":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 259
a=0;//     .local v6, "prunedFiles":I
a=0;//     #v6=(Null);
a=0;//     invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     .line 261
a=0;//     .local v7, "startTime":J
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     iget-object v9, p0, Lcom/android/volley/toolbox/DiskBasedCache;->mEntries:Ljava/util/Map;
a=0;// 
a=0;//     #v9=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v9}, Ljava/util/Map;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 262
a=0;//     .local v5, "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/util/Map$Entry<Ljava/lang/String;Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;>;>;"
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Reference,Ljava/util/Iterator;);v6=(Integer);v9=(Conflicted);v11=(Conflicted);
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_4
a=0;// 
a=0;//     .line 280
a=0;//     :goto_1
a=0;//     #v9=(Byte);
a=0;//     sget-boolean v9, Lcom/android/volley/VolleyLog;->DEBUG:Z
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_0
a=0;// 
a=0;//     .line 281
a=0;//     const-string v9, "pruned %d files, %d bytes, %d ms"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const/4 v10, 0x3
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     new-array v10, v10, [Ljava/lang/Object;
a=0;// 
a=0;//     #v10=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 282
a=0;//     #v11=(Null);
a=0;//     invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v12, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     #v11=(One);
a=0;//     iget-wide v12, p0, Lcom/android/volley/toolbox/DiskBasedCache;->mTotalSize:J
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     sub-long/2addr v12, v0
a=0;// 
a=0;//     invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v12, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x2
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
a=0;// 
a=0;//     move-result-wide v12
a=0;// 
a=0;//     #v12=(LongLo);
a=0;//     sub-long/2addr v12, v7
a=0;// 
a=0;//     invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v12, v10, v11
a=0;// 
a=0;//     .line 281
a=0;//     invoke-static {v9, v10}, Lcom/android/volley/VolleyLog;->v(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 263
a=0;//     :cond_4
a=0;//     #v9=(Boolean);v10=(Conflicted);v11=(Conflicted);v12=(LongHi);v13=(Uninit);
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 264
a=0;//     .local v4, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;>;"
a=0;//     invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;
a=0;// 
a=0;//     .line 265
a=0;//     .local v3, "e":Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;
a=0;//     iget-object v9, v3, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->key:Ljava/lang/String;
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v9}, Lcom/android/volley/toolbox/DiskBasedCache;->getFileForKey(Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 266
a=0;//     .local v2, "deleted":Z
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     .line 267
a=0;//     iget-wide v9, p0, Lcom/android/volley/toolbox/DiskBasedCache;->mTotalSize:J
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     iget-wide v11, v3, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->size:J
a=0;// 
a=0;//     #v11=(LongLo);
a=0;//     sub-long/2addr v9, v11
a=0;// 
a=0;//     iput-wide v9, p0, Lcom/android/volley/toolbox/DiskBasedCache;->mTotalSize:J
a=0;// 
a=0;//     .line 272
a=0;//     :goto_2
a=0;//     #v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->remove()V
a=0;// 
a=0;//     .line 273
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     .line 275
a=0;//     iget-wide v9, p0, Lcom/android/volley/toolbox/DiskBasedCache;->mTotalSize:J
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     int-to-long v11, p1
a=0;// 
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     add-long/2addr v9, v11
a=0;// 
a=0;//     long-to-float v9, v9
a=0;// 
a=0;//     #v9=(Float);
a=0;//     iget v10, p0, Lcom/android/volley/toolbox/DiskBasedCache;->mMaxCacheSizeInBytes:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     int-to-float v10, v10
a=0;// 
a=0;//     #v10=(Float);
a=0;//     const v11, 0x3f666666    # 0.9f
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     mul-float/2addr v10, v11
a=0;// 
a=0;//     cmpg-float v9, v9, v10
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     if-gez v9, :cond_3
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 269
a=0;//     :cond_5
a=0;//     #v9=(Reference,Ljava/io/File;);v10=(Conflicted);v11=(Conflicted);
a=0;//     const-string v9, "Could not delete cache entry for key=%s, filename=%s"
a=0;// 
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     new-array v10, v10, [Ljava/lang/Object;
a=0;// 
a=0;//     #v10=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 270
a=0;//     #v11=(Null);
a=0;//     iget-object v12, v3, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->key:Ljava/lang/String;
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     aput-object v12, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     #v11=(One);
a=0;//     iget-object v12, v3, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->key:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {p0, v12}, Lcom/android/volley/toolbox/DiskBasedCache;->getFilenameForKey(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     aput-object v12, v10, v11
a=0;// 
a=0;//     .line 269
a=0;//     invoke-static {v9, v10}, Lcom/android/volley/VolleyLog;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private putEntry(Ljava/lang/String;Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;)V
a=0;//     .locals 7
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;//     .param p2, "entry"    # Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;
a=0;// 
a=0;//     .prologue
a=0;//     .line 292
a=0;//     iget-object v1, p0, Lcom/android/volley/toolbox/DiskBasedCache;->mEntries:Ljava/util/Map;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 293
a=0;//     iget-wide v1, p0, Lcom/android/volley/toolbox/DiskBasedCache;->mTotalSize:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iget-wide v3, p2, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->size:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     add-long/2addr v1, v3
a=0;// 
a=0;//     iput-wide v1, p0, Lcom/android/volley/toolbox/DiskBasedCache;->mTotalSize:J
a=0;// 
a=0;//     .line 298
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/android/volley/toolbox/DiskBasedCache;->mEntries:Ljava/util/Map;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 299
a=0;//     return-void
a=0;// 
a=0;//     .line 295
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v1, p0, Lcom/android/volley/toolbox/DiskBasedCache;->mEntries:Ljava/util/Map;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;
a=0;// 
a=0;//     .line 296
a=0;//     .local v0, "oldEntry":Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;
a=0;//     iget-wide v1, p0, Lcom/android/volley/toolbox/DiskBasedCache;->mTotalSize:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iget-wide v3, p2, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->size:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     iget-wide v5, v0, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->size:J
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     sub-long/2addr v3, v5
a=0;// 
a=0;//     add-long/2addr v1, v3
a=0;// 
a=0;//     iput-wide v1, p0, Lcom/android/volley/toolbox/DiskBasedCache;->mTotalSize:J
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static read(Ljava/io/InputStream;)I
a=0;//     .locals 2
a=0;//     .param p0, "is"    # Ljava/io/InputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 471
a=0;//     invoke-virtual {p0}, Ljava/io/InputStream;->read()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 472
a=0;//     .local v0, "b":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 473
a=0;//     new-instance v1, Ljava/io/EOFException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/EOFException;);
a=0;//     invoke-direct {v1}, Ljava/io/EOFException;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/EOFException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 475
a=0;//     :cond_0
a=0;//     #v1=(Byte);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static readInt(Ljava/io/InputStream;)I
a=0;//     .locals 2
a=0;//     .param p0, "is"    # Ljava/io/InputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 486
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 487
a=0;//     .local v0, "n":I
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0}, Lcom/android/volley/toolbox/DiskBasedCache;->read(Ljava/io/InputStream;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     shl-int/lit8 v1, v1, 0x0
a=0;// 
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     .line 488
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p0}, Lcom/android/volley/toolbox/DiskBasedCache;->read(Ljava/io/InputStream;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     shl-int/lit8 v1, v1, 0x8
a=0;// 
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     .line 489
a=0;//     invoke-static {p0}, Lcom/android/volley/toolbox/DiskBasedCache;->read(Ljava/io/InputStream;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     shl-int/lit8 v1, v1, 0x10
a=0;// 
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     .line 490
a=0;//     invoke-static {p0}, Lcom/android/volley/toolbox/DiskBasedCache;->read(Ljava/io/InputStream;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     shl-int/lit8 v1, v1, 0x18
a=0;// 
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     .line 491
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static readLong(Ljava/io/InputStream;)J
a=0;//     .locals 7
a=0;//     .param p0, "is"    # Ljava/io/InputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v5, 0xff
a=0;// 
a=0;//     .line 506
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     .line 507
a=0;//     .local v0, "n":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {p0}, Lcom/android/volley/toolbox/DiskBasedCache;->read(Ljava/io/InputStream;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-long v2, v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     and-long/2addr v2, v5
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     shl-long/2addr v2, v4
a=0;// 
a=0;//     or-long/2addr v0, v2
a=0;// 
a=0;//     .line 508
a=0;//     invoke-static {p0}, Lcom/android/volley/toolbox/DiskBasedCache;->read(Ljava/io/InputStream;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-long v2, v2
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     and-long/2addr v2, v5
a=0;// 
a=0;//     const/16 v4, 0x8
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     shl-long/2addr v2, v4
a=0;// 
a=0;//     or-long/2addr v0, v2
a=0;// 
a=0;//     .line 509
a=0;//     invoke-static {p0}, Lcom/android/volley/toolbox/DiskBasedCache;->read(Ljava/io/InputStream;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-long v2, v2
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     and-long/2addr v2, v5
a=0;// 
a=0;//     const/16 v4, 0x10
a=0;// 
a=0;//     shl-long/2addr v2, v4
a=0;// 
a=0;//     or-long/2addr v0, v2
a=0;// 
a=0;//     .line 510
a=0;//     invoke-static {p0}, Lcom/android/volley/toolbox/DiskBasedCache;->read(Ljava/io/InputStream;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-long v2, v2
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     and-long/2addr v2, v5
a=0;// 
a=0;//     const/16 v4, 0x18
a=0;// 
a=0;//     shl-long/2addr v2, v4
a=0;// 
a=0;//     or-long/2addr v0, v2
a=0;// 
a=0;//     .line 511
a=0;//     invoke-static {p0}, Lcom/android/volley/toolbox/DiskBasedCache;->read(Ljava/io/InputStream;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-long v2, v2
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     and-long/2addr v2, v5
a=0;// 
a=0;//     const/16 v4, 0x20
a=0;// 
a=0;//     shl-long/2addr v2, v4
a=0;// 
a=0;//     or-long/2addr v0, v2
a=0;// 
a=0;//     .line 512
a=0;//     invoke-static {p0}, Lcom/android/volley/toolbox/DiskBasedCache;->read(Ljava/io/InputStream;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-long v2, v2
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     and-long/2addr v2, v5
a=0;// 
a=0;//     const/16 v4, 0x28
a=0;// 
a=0;//     shl-long/2addr v2, v4
a=0;// 
a=0;//     or-long/2addr v0, v2
a=0;// 
a=0;//     .line 513
a=0;//     invoke-static {p0}, Lcom/android/volley/toolbox/DiskBasedCache;->read(Ljava/io/InputStream;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-long v2, v2
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     and-long/2addr v2, v5
a=0;// 
a=0;//     const/16 v4, 0x30
a=0;// 
a=0;//     shl-long/2addr v2, v4
a=0;// 
a=0;//     or-long/2addr v0, v2
a=0;// 
a=0;//     .line 514
a=0;//     invoke-static {p0}, Lcom/android/volley/toolbox/DiskBasedCache;->read(Ljava/io/InputStream;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-long v2, v2
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     and-long/2addr v2, v5
a=0;// 
a=0;//     const/16 v4, 0x38
a=0;// 
a=0;//     shl-long/2addr v2, v4
a=0;// 
a=0;//     or-long/2addr v0, v2
a=0;// 
a=0;//     .line 515
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method static readString(Ljava/io/InputStream;)Ljava/lang/String;
a=0;//     .locals 4
a=0;//     .param p0, "is"    # Ljava/io/InputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 525
a=0;//     invoke-static {p0}, Lcom/android/volley/toolbox/DiskBasedCache;->readLong(Ljava/io/InputStream;)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     long-to-int v1, v2
a=0;// 
a=0;//     .line 526
a=0;//     .local v1, "n":I
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p0, v1}, Lcom/android/volley/toolbox/DiskBasedCache;->streamToBytes(Ljava/io/InputStream;I)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 527
a=0;//     .local v0, "b":[B
a=0;//     #v0=(Reference,[B);
a=0;//     new-instance v2, Ljava/lang/String;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/String;);
a=0;//     const-string v3, "UTF-8"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v0, v3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method static readStringStringMap(Ljava/io/InputStream;)Ljava/util/Map;
a=0;//     .locals 6
a=0;//     .param p0, "is"    # Ljava/io/InputStream;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/io/InputStream;",
a=0;//             ")",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 543
a=0;//     invoke-static {p0}, Lcom/android/volley/toolbox/DiskBasedCache;->readInt(Ljava/io/InputStream;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 544
a=0;//     .local v3, "size":I
a=0;//     #v3=(Integer);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 545
a=0;//     invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 547
a=0;//     .local v2, "result":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ujava/lang/Object;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Integer);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-lt v0, v3, :cond_1
a=0;// 
a=0;//     .line 552
a=0;//     return-object v2
a=0;// 
a=0;//     .line 546
a=0;//     .end local v0    # "i":I
a=0;//     .end local v2    # "result":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     new-instance v2, Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v2, v3}, Ljava/util/HashMap;-><init>(I)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 548
a=0;//     .restart local v0    # "i":I
a=0;//     .restart local v2    # "result":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-static {p0}, Lcom/android/volley/toolbox/DiskBasedCache;->readString(Ljava/io/InputStream;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 549
a=0;//     .local v1, "key":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0}, Lcom/android/volley/toolbox/DiskBasedCache;->readString(Ljava/io/InputStream;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 550
a=0;//     .local v4, "value":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 547
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private removeEntry(Ljava/lang/String;)V
a=0;//     .locals 5
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 305
a=0;//     iget-object v1, p0, Lcom/android/volley/toolbox/DiskBasedCache;->mEntries:Ljava/util/Map;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;
a=0;// 
a=0;//     .line 306
a=0;//     .local v0, "entry":Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 307
a=0;//     iget-wide v1, p0, Lcom/android/volley/toolbox/DiskBasedCache;->mTotalSize:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iget-wide v3, v0, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->size:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     sub-long/2addr v1, v3
a=0;// 
a=0;//     iput-wide v1, p0, Lcom/android/volley/toolbox/DiskBasedCache;->mTotalSize:J
a=0;// 
a=0;//     .line 308
a=0;//     iget-object v1, p0, Lcom/android/volley/toolbox/DiskBasedCache;->mEntries:Ljava/util/Map;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 310
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static streamToBytes(Ljava/io/InputStream;I)[B
a=0;//     .locals 6
a=0;//     .param p0, "in"    # Ljava/io/InputStream;
a=0;//     .param p1, "length"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 316
a=0;//     new-array v0, p1, [B
a=0;// 
a=0;//     .line 318
a=0;//     .local v0, "bytes":[B
a=0;//     #v0=(Reference,[B);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 319
a=0;//     .local v2, "pos":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Integer);v3=(Conflicted);
a=0;//     if-ge v2, p1, :cond_0
a=0;// 
a=0;//     sub-int v3, p1, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v0, v2, v3}, Ljava/io/InputStream;->read([BII)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .local v1, "count":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-ne v1, v3, :cond_1
a=0;// 
a=0;//     .line 322
a=0;//     .end local v1    # "count":I
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     if-eq v2, p1, :cond_2
a=0;// 
a=0;//     .line 323
a=0;//     new-instance v3, Ljava/io/IOException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/IOException;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "Expected "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, " bytes, read "
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, " bytes"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/IOException;);
a=0;//     throw v3
a=0;// 
a=0;//     .line 320
a=0;//     .restart local v1    # "count":I
a=0;//     :cond_1
a=0;//     #v1=(Integer);v3=(Byte);v4=(Uninit);v5=(Uninit);
a=0;//     add-int/2addr v2, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 325
a=0;//     .end local v1    # "count":I
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static writeInt(Ljava/io/OutputStream;I)V
a=0;//     .locals 1
a=0;//     .param p0, "os"    # Ljava/io/OutputStream;
a=0;//     .param p1, "n"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 479
a=0;//     shr-int/lit8 v0, p1, 0x0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit16 v0, v0, 0xff
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 480
a=0;//     shr-int/lit8 v0, p1, 0x8
a=0;// 
a=0;//     and-int/lit16 v0, v0, 0xff
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 481
a=0;//     shr-int/lit8 v0, p1, 0x10
a=0;// 
a=0;//     #v0=(Short);
a=0;//     and-int/lit16 v0, v0, 0xff
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 482
a=0;//     shr-int/lit8 v0, p1, 0x18
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     and-int/lit16 v0, v0, 0xff
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 483
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static writeLong(Ljava/io/OutputStream;J)V
a=0;//     .locals 2
a=0;//     .param p0, "os"    # Ljava/io/OutputStream;
a=0;//     .param p1, "n"    # J
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 495
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     ushr-long v0, p1, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     long-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 496
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     ushr-long v0, p1, v0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     long-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 497
a=0;//     const/16 v0, 0x10
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     ushr-long v0, p1, v0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     long-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 498
a=0;//     const/16 v0, 0x18
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     ushr-long v0, p1, v0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     long-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 499
a=0;//     const/16 v0, 0x20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     ushr-long v0, p1, v0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     long-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 500
a=0;//     const/16 v0, 0x28
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     ushr-long v0, p1, v0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     long-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 501
a=0;//     const/16 v0, 0x30
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     ushr-long v0, p1, v0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     long-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 502
a=0;//     const/16 v0, 0x38
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     ushr-long v0, p1, v0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     long-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 503
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static writeString(Ljava/io/OutputStream;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p0, "os"    # Ljava/io/OutputStream;
a=0;//     .param p1, "s"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 519
a=0;//     const-string v1, "UTF-8"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 520
a=0;//     .local v0, "b":[B
a=0;//     #v0=(Reference,[B);
a=0;//     array-length v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-long v1, v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {p0, v1, v2}, Lcom/android/volley/toolbox/DiskBasedCache;->writeLong(Ljava/io/OutputStream;J)V
a=0;// 
a=0;//     .line 521
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     array-length v2, v0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v0, v1, v2}, Ljava/io/OutputStream;->write([BII)V
a=0;// 
a=0;//     .line 522
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static writeStringStringMap(Ljava/util/Map;Ljava/io/OutputStream;)V
a=0;//     .locals 3
a=0;//     .param p1, "os"    # Ljava/io/OutputStream;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/io/OutputStream;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 531
a=0;//     .local p0, "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     if-eqz p0, :cond_1
a=0;// 
a=0;//     .line 532
a=0;//     invoke-interface {p0}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p1, v1}, Lcom/android/volley/toolbox/DiskBasedCache;->writeInt(Ljava/io/OutputStream;I)V
a=0;// 
a=0;//     .line 533
a=0;//     invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 540
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 533
a=0;//     :cond_0
a=0;//     #v2=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 534
a=0;//     .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {p1, v1}, Lcom/android/volley/toolbox/DiskBasedCache;->writeString(Ljava/io/OutputStream;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 535
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {p1, v1}, Lcom/android/volley/toolbox/DiskBasedCache;->writeString(Ljava/io/OutputStream;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 538
a=0;//     .end local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p1, v1}, Lcom/android/volley/toolbox/DiskBasedCache;->writeInt(Ljava/io/OutputStream;I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public declared-synchronized clear()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 90
a=0;//     #v2=(Null);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v3, p0, Lcom/android/volley/toolbox/DiskBasedCache;->mRootDirectory:Ljava/io/File;
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->listFiles()[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 91
a=0;//     .local v1, "files":[Ljava/io/File;
a=0;//     #v1=(Reference,[Ljava/io/File;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 92
a=0;//     array-length v3, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Integer);v3=(Integer);
a=0;//     if-lt v2, v3, :cond_1
a=0;// 
a=0;//     .line 96
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/android/volley/toolbox/DiskBasedCache;->mEntries:Ljava/util/Map;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v2}, Ljava/util/Map;->clear()V
a=0;// 
a=0;//     .line 97
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iput-wide v2, p0, Lcom/android/volley/toolbox/DiskBasedCache;->mTotalSize:J
a=0;// 
a=0;//     .line 98
a=0;//     const-string v2, "Cache cleared."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v2, v3}, Lcom/android/volley/VolleyLog;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 99
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 92
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v2=(Integer);v3=(Integer);
a=0;//     aget-object v0, v1, v2
a=0;// 
a=0;//     .line 93
a=0;//     .local v0, "file":Ljava/io/File;
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 92
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 90
a=0;//     .end local v0    # "file":Ljava/io/File;
a=0;//     .end local v1    # "files":[Ljava/io/File;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized get(Ljava/lang/String;)Lcom/android/volley/Cache$Entry;
a=0;//     .locals 12
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 106
a=0;//     #v7=(Null);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v8, p0, Lcom/android/volley/toolbox/DiskBasedCache;->mEntries:Ljava/util/Map;
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v8, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     .line 108
a=0;//     .local v4, "entry":Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 128
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Reference,Lcom/android/volley/Cache$Entry;);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v7
a=0;// 
a=0;//     .line 112
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Null);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     invoke-virtual {p0, p1}, Lcom/android/volley/toolbox/DiskBasedCache;->getFileForKey(Ljava/lang/String;)Ljava/io/File;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 113
a=0;//     .local v5, "file":Ljava/io/File;
a=0;//     #v5=(Reference,Ljava/io/File;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 115
a=0;//     .local v0, "cis":Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;
a=0;//     :try_start_2
a=0;//     #v0=(Null);
a=0;//     new-instance v1, Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;);
a=0;//     new-instance v8, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v8, v5}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/io/FileInputStream;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     invoke-direct {v1, v8, v9}, Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;-><init>(Ljava/io/InputStream;Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 116
a=0;//     .end local v0    # "cis":Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;
a=0;//     .local v1, "cis":Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;
a=0;//     :try_start_3
a=0;//     #v1=(Reference,Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;);
a=0;//     invoke-static {v1}, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->readHeader(Ljava/io/InputStream;)Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;
a=0;// 
a=0;//     .line 117
a=0;//     invoke-virtual {v5}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v8
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     invoke-static {v1}, Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;->access$1(Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     int-to-long v10, v10
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     sub-long/2addr v8, v10
a=0;// 
a=0;//     long-to-int v8, v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v1, v8}, Lcom/android/volley/toolbox/DiskBasedCache;->streamToBytes(Ljava/io/InputStream;I)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 118
a=0;//     .local v2, "data":[B
a=0;//     #v2=(Reference,[B);
a=0;//     invoke-virtual {v4, v2}, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->toCacheEntry([B)Lcom/android/volley/Cache$Entry;
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_2
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 124
a=0;//     #v8=(Reference,Lcom/android/volley/Cache$Entry;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 126
a=0;//     :try_start_4
a=0;//     invoke-virtual {v1}, Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     :cond_2
a=0;//     move-object v7, v8
a=0;// 
a=0;//     .line 118
a=0;//     #v7=(Reference,Lcom/android/volley/Cache$Entry;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 127
a=0;//     :catch_0
a=0;//     #v7=(Null);
a=0;//     move-exception v6
a=0;// 
a=0;//     .line 128
a=0;//     .local v6, "ioe":Ljava/io/IOException;
a=0;//     #v6=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 119
a=0;//     .end local v1    # "cis":Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;
a=0;//     .end local v2    # "data":[B
a=0;//     .end local v6    # "ioe":Ljava/io/IOException;
a=0;//     .restart local v0    # "cis":Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v2=(Uninit);v6=(Uninit);v8=(Conflicted);v9=(Conflicted);v10=(Uninit);v11=(Uninit);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 120
a=0;//     .local v3, "e":Ljava/io/IOException;
a=0;//     :goto_1
a=0;//     :try_start_5
a=0;//     #v0=(Reference,Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;);v2=(Conflicted);v3=(Reference,Ljava/io/IOException;);v10=(Conflicted);v11=(Conflicted);
a=0;//     const-string v8, "%s: %s"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     new-array v9, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     #v9=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     aput-object v11, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     invoke-virtual {v3}, Ljava/io/IOException;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     aput-object v11, v9, v10
a=0;// 
a=0;//     invoke-static {v8, v9}, Lcom/android/volley/VolleyLog;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 121
a=0;//     invoke-virtual {p0, p1}, Lcom/android/volley/toolbox/DiskBasedCache;->remove(Ljava/lang/String;)V
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     .line 124
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 126
a=0;//     :try_start_6
a=0;//     invoke-virtual {v0}, Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 127
a=0;//     :catch_2
a=0;//     move-exception v6
a=0;// 
a=0;//     .line 128
a=0;//     .restart local v6    # "ioe":Ljava/io/IOException;
a=0;//     #v6=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 123
a=0;//     .end local v3    # "e":Ljava/io/IOException;
a=0;//     .end local v6    # "ioe":Ljava/io/IOException;
a=0;//     :catchall_0
a=0;//     #v3=(Conflicted);v6=(Uninit);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v8
a=0;// 
a=0;//     .line 124
a=0;//     :goto_2
a=0;//     #v8=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 126
a=0;//     :try_start_7
a=0;//     invoke-virtual {v0}, Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;->close()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_1
a=0;// 
a=0;//     .line 131
a=0;//     :cond_3
a=0;//     :try_start_8
a=0;//     throw v8
a=0;//     :try_end_8
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_1
a=0;// 
a=0;//     .line 106
a=0;//     .end local v0    # "cis":Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;
a=0;//     .end local v4    # "entry":Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;
a=0;//     .end local v5    # "file":Ljava/io/File;
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v7
a=0;// 
a=0;//     .line 127
a=0;//     .restart local v0    # "cis":Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;
a=0;//     .restart local v4    # "entry":Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;
a=0;//     .restart local v5    # "file":Ljava/io/File;
a=0;//     :catch_3
a=0;//     #v0=(Reference,Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;);v4=(Reference,Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;);v5=(Reference,Ljava/io/File;);v7=(Null);v8=(Reference,Ljava/lang/Throwable;);
a=0;//     move-exception v6
a=0;// 
a=0;//     .line 128
a=0;//     .restart local v6    # "ioe":Ljava/io/IOException;
a=0;//     #v6=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 123
a=0;//     .end local v0    # "cis":Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;
a=0;//     .end local v6    # "ioe":Ljava/io/IOException;
a=0;//     .restart local v1    # "cis":Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;
a=0;//     :catchall_2
a=0;//     #v0=(Null);v1=(Reference,Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;);v3=(Uninit);v6=(Uninit);v8=(Conflicted);
a=0;//     move-exception v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .end local v1    # "cis":Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;
a=0;//     .restart local v0    # "cis":Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;
a=0;//     #v0=(Reference,Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 119
a=0;//     .end local v0    # "cis":Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;
a=0;//     .restart local v1    # "cis":Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;
a=0;//     :catch_4
a=0;//     #v0=(Null);v8=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/IOException;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .end local v1    # "cis":Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;
a=0;//     .restart local v0    # "cis":Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;
a=0;//     #v0=(Reference,Lcom/android/volley/toolbox/DiskBasedCache$CountingInputStream;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public getFileForKey(Ljava/lang/String;)Ljava/io/File;
a=0;//     .locals 3
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 242
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v1, p0, Lcom/android/volley/toolbox/DiskBasedCache;->mRootDirectory:Ljava/io/File;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-direct {p0, p1}, Lcom/android/volley/toolbox/DiskBasedCache;->getFilenameForKey(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized initialize()V
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 140
a=0;//     #v6=(Null);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v7, p0, Lcom/android/volley/toolbox/DiskBasedCache;->mRootDirectory:Ljava/io/File;
a=0;// 
a=0;//     #v7=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v7}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_1
a=0;// 
a=0;//     .line 141
a=0;//     iget-object v6, p0, Lcom/android/volley/toolbox/DiskBasedCache;->mRootDirectory:Ljava/io/File;
a=0;// 
a=0;//     #v6=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_0
a=0;// 
a=0;//     .line 142
a=0;//     const-string v6, "Unable to create cache dir %s"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     new-array v7, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     iget-object v9, p0, Lcom/android/volley/toolbox/DiskBasedCache;->mRootDirectory:Ljava/io/File;
a=0;// 
a=0;//     #v9=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     aput-object v9, v7, v8
a=0;// 
a=0;//     invoke-static {v6, v7}, Lcom/android/volley/VolleyLog;->e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     .line 170
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 147
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Null);v7=(Boolean);v8=(Uninit);v9=(Uninit);
a=0;//     iget-object v7, p0, Lcom/android/volley/toolbox/DiskBasedCache;->mRootDirectory:Ljava/io/File;
a=0;// 
a=0;//     #v7=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v7}, Ljava/io/File;->listFiles()[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 148
a=0;//     .local v3, "files":[Ljava/io/File;
a=0;//     #v3=(Reference,[Ljava/io/File;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 151
a=0;//     array-length v7, v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Integer);v7=(Integer);v8=(Conflicted);v9=(Conflicted);
a=0;//     if-ge v6, v7, :cond_0
a=0;// 
a=0;//     aget-object v2, v3, v6
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 152
a=0;//     .local v2, "file":Ljava/io/File;
a=0;//     #v2=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 154
a=0;//     .local v4, "fis":Ljava/io/FileInputStream;
a=0;//     :try_start_2
a=0;//     #v4=(Null);
a=0;//     new-instance v5, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v5, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 155
a=0;//     .end local v4    # "fis":Ljava/io/FileInputStream;
a=0;//     .local v5, "fis":Ljava/io/FileInputStream;
a=0;//     :try_start_3
a=0;//     #v5=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-static {v5}, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->readHeader(Ljava/io/InputStream;)Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 156
a=0;//     .local v1, "entry":Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;
a=0;//     #v1=(Reference,Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v8
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     iput-wide v8, v1, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->size:J
a=0;// 
a=0;//     .line 157
a=0;//     iget-object v8, v1, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->key:Ljava/lang/String;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v8, v1}, Lcom/android/volley/toolbox/DiskBasedCache;->putEntry(Ljava/lang/String;Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_2
a=0;// 
a=0;//     .line 164
a=0;//     if-eqz v5, :cond_5
a=0;// 
a=0;//     .line 165
a=0;//     :try_start_4
a=0;//     invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .line 151
a=0;//     .end local v1    # "entry":Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;
a=0;//     .end local v5    # "fis":Ljava/io/FileInputStream;
a=0;//     .restart local v4    # "fis":Ljava/io/FileInputStream;
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v4=(Reference,Ljava/io/FileInputStream;);v5=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 158
a=0;//     :catch_0
a=0;//     #v4=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 159
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/io/IOException;);v4=(Reference,Ljava/io/FileInputStream;);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 160
a=0;//     :try_start_5
a=0;//     invoke-virtual {v2}, Ljava/io/File;->delete()Z
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     .line 164
a=0;//     :cond_3
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 165
a=0;//     :try_start_6
a=0;//     invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 167
a=0;//     :catch_1
a=0;//     move-exception v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 162
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v6
a=0;// 
a=0;//     .line 164
a=0;//     :goto_3
a=0;//     #v6=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     .line 165
a=0;//     :try_start_7
a=0;//     invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_1
a=0;// 
a=0;//     .line 168
a=0;//     :cond_4
a=0;//     :goto_4
a=0;//     :try_start_8
a=0;//     #v7=(Conflicted);
a=0;//     throw v6
a=0;//     :try_end_8
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_1
a=0;// 
a=0;//     .line 140
a=0;//     .end local v2    # "file":Ljava/io/File;
a=0;//     .end local v3    # "files":[Ljava/io/File;
a=0;//     .end local v4    # "fis":Ljava/io/FileInputStream;
a=0;//     :catchall_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v6
a=0;// 
a=0;//     .line 167
a=0;//     .restart local v1    # "entry":Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;
a=0;//     .restart local v2    # "file":Ljava/io/File;
a=0;//     .restart local v3    # "files":[Ljava/io/File;
a=0;//     .restart local v5    # "fis":Ljava/io/FileInputStream;
a=0;//     :catch_2
a=0;//     #v1=(Reference,Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;);v2=(Null);v3=(Reference,[Ljava/io/File;);v4=(Null);v5=(Reference,Ljava/io/FileInputStream;);v6=(Integer);v7=(Integer);v8=(Reference,Ljava/lang/String;);v9=(LongHi);
a=0;//     move-exception v8
a=0;// 
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .end local v5    # "fis":Ljava/io/FileInputStream;
a=0;//     .restart local v4    # "fis":Ljava/io/FileInputStream;
a=0;//     #v4=(Reference,Ljava/io/FileInputStream;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .end local v1    # "entry":Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;
a=0;//     :catch_3
a=0;//     #v1=(Conflicted);v5=(Conflicted);v6=(Reference,Ljava/lang/Throwable;);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 162
a=0;//     .end local v4    # "fis":Ljava/io/FileInputStream;
a=0;//     .restart local v5    # "fis":Ljava/io/FileInputStream;
a=0;//     :catchall_2
a=0;//     #v4=(Null);v5=(Reference,Ljava/io/FileInputStream;);v6=(Integer);v7=(Integer);
a=0;//     move-exception v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .end local v5    # "fis":Ljava/io/FileInputStream;
a=0;//     .restart local v4    # "fis":Ljava/io/FileInputStream;
a=0;//     #v4=(Reference,Ljava/io/FileInputStream;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 158
a=0;//     .end local v4    # "fis":Ljava/io/FileInputStream;
a=0;//     .restart local v5    # "fis":Ljava/io/FileInputStream;
a=0;//     :catch_4
a=0;//     #v4=(Null);v6=(Integer);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .end local v5    # "fis":Ljava/io/FileInputStream;
a=0;//     .restart local v4    # "fis":Ljava/io/FileInputStream;
a=0;//     #v4=(Reference,Ljava/io/FileInputStream;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .end local v4    # "fis":Ljava/io/FileInputStream;
a=0;//     .restart local v1    # "entry":Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;
a=0;//     .restart local v5    # "fis":Ljava/io/FileInputStream;
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v1=(Reference,Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;);v4=(Null);v8=(Reference,Ljava/lang/String;);v9=(LongHi);
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .end local v5    # "fis":Ljava/io/FileInputStream;
a=0;//     .restart local v4    # "fis":Ljava/io/FileInputStream;
a=0;//     #v4=(Reference,Ljava/io/FileInputStream;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized invalidate(Ljava/lang/String;Z)V
a=0;//     .locals 3
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;//     .param p2, "fullExpire"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 179
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0, p1}, Lcom/android/volley/toolbox/DiskBasedCache;->get(Ljava/lang/String;)Lcom/android/volley/Cache$Entry;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 180
a=0;//     .local v0, "entry":Lcom/android/volley/Cache$Entry;
a=0;//     #v0=(Reference,Lcom/android/volley/Cache$Entry;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 181
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iput-wide v1, v0, Lcom/android/volley/Cache$Entry;->softTtl:J
a=0;// 
a=0;//     .line 182
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 183
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     iput-wide v1, v0, Lcom/android/volley/Cache$Entry;->ttl:J
a=0;// 
a=0;//     .line 185
a=0;//     :cond_0
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/android/volley/toolbox/DiskBasedCache;->put(Ljava/lang/String;Lcom/android/volley/Cache$Entry;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 188
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 179
a=0;//     .end local v0    # "entry":Lcom/android/volley/Cache$Entry;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized put(Ljava/lang/String;Lcom/android/volley/Cache$Entry;)V
a=0;//     .locals 8
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;//     .param p2, "entry"    # Lcom/android/volley/Cache$Entry;
a=0;// 
a=0;//     .prologue
a=0;//     .line 195
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v4, p2, Lcom/android/volley/Cache$Entry;->data:[B
a=0;// 
a=0;//     #v4=(Reference,[B);
a=0;//     array-length v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct {p0, v4}, Lcom/android/volley/toolbox/DiskBasedCache;->pruneIfNeeded(I)V
a=0;// 
a=0;//     .line 196
a=0;//     invoke-virtual {p0, p1}, Lcom/android/volley/toolbox/DiskBasedCache;->getFileForKey(Ljava/lang/String;)Ljava/io/File;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 198
a=0;//     .local v2, "file":Ljava/io/File;
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     new-instance v3, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v3, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     .line 199
a=0;//     .local v3, "fos":Ljava/io/FileOutputStream;
a=0;//     #v3=(Reference,Ljava/io/FileOutputStream;);
a=0;//     new-instance v1, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;);
a=0;//     invoke-direct {v1, p1, p2}, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;-><init>(Ljava/lang/String;Lcom/android/volley/Cache$Entry;)V
a=0;// 
a=0;//     .line 200
a=0;//     .local v1, "e":Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;
a=0;//     #v1=(Reference,Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;);
a=0;//     invoke-virtual {v1, v3}, Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;->writeHeader(Ljava/io/OutputStream;)Z
a=0;// 
a=0;//     .line 201
a=0;//     iget-object v4, p2, Lcom/android/volley/Cache$Entry;->data:[B
a=0;// 
a=0;//     #v4=(Reference,[B);
a=0;//     invoke-virtual {v3, v4}, Ljava/io/FileOutputStream;->write([B)V
a=0;// 
a=0;//     .line 202
a=0;//     invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
a=0;// 
a=0;//     .line 203
a=0;//     invoke-direct {p0, p1, v1}, Lcom/android/volley/toolbox/DiskBasedCache;->putEntry(Ljava/lang/String;Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 211
a=0;//     .end local v1    # "e":Lcom/android/volley/toolbox/DiskBasedCache$CacheHeader;
a=0;//     .end local v3    # "fos":Ljava/io/FileOutputStream;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 205
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v4=(Conflicted);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     move-exception v4
a=0;// 
a=0;//     .line 207
a=0;//     :try_start_2
a=0;//     #v4=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 208
a=0;//     .local v0, "deleted":Z
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 209
a=0;//     const-string v4, "Could not clean up file %s"
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     aput-object v7, v5, v6
a=0;// 
a=0;//     invoke-static {v4, v5}, Lcom/android/volley/VolleyLog;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 195
a=0;//     .end local v0    # "deleted":Z
a=0;//     .end local v2    # "file":Ljava/io/File;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v4
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized remove(Ljava/lang/String;)V
a=0;//     .locals 5
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 218
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0, p1}, Lcom/android/volley/toolbox/DiskBasedCache;->getFileForKey(Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 219
a=0;//     .local v0, "deleted":Z
a=0;//     #v0=(Boolean);
a=0;//     invoke-direct {p0, p1}, Lcom/android/volley/toolbox/DiskBasedCache;->removeEntry(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 220
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 221
a=0;//     const-string v1, "Could not delete cache entry for key=%s, filename=%s"
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 222
a=0;//     #v3=(Null);
a=0;//     aput-object p1, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-direct {p0, p1}, Lcom/android/volley/toolbox/DiskBasedCache;->getFilenameForKey(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     .line 221
a=0;//     invoke-static {v1, v2}, Lcom/android/volley/VolleyLog;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 224
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 218
a=0;//     .end local v0    # "deleted":Z
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v1
a=0;// .end method
}}
