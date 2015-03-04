package com.twocloo.base.cache.lru; class DiskLruCache { void a() { int a;
a=0;// .class public abstract Lcom/twocloo/base/cache/lru/DiskLruCache;
a=0;// .super Ljava/lang/Object;
a=0;// .source "DiskLruCache.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/lang/Object;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DEF_MAX_CACHE_BYTE_SIZE:J = 0x500000L
a=0;// 
a=0;// .field private static final DEF_MAX_CACHE_ITEM_SIZE:I = 0x40
a=0;// 
a=0;// .field private static final INITIAL_CAPACITY:I = 0x20
a=0;// 
a=0;// .field private static final LOAD_FACTOR:F = 0.75f
a=0;// 
a=0;// .field private static final MAX_REMOVALS:I = 0x4
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private cacheByteSize:I
a=0;// 
a=0;// .field private cacheSize:I
a=0;// 
a=0;// .field private final mCacheDir:Ljava/io/File;
a=0;// 
a=0;// .field private final mLinkedHashMap:Ljava/util/Map;
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
a=0;// .field private maxCacheByteSize:J
a=0;// 
a=0;// .field private final maxCacheItemSize:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/io/File;)V
a=0;//     .locals 4
a=0;//     .param p1, "cacheDir"    # Ljava/io/File;
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     .local p0, "this":Lcom/twocloo/base/cache/lru/DiskLruCache;, "Lcom/twocloo/base/cache/lru/DiskLruCache<TT;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 44
a=0;//     #p0=(Reference,Lcom/twocloo/base/cache/lru/DiskLruCache;);
a=0;//     const/16 v0, 0x40
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/twocloo/base/cache/lru/DiskLruCache;->maxCacheItemSize:I
a=0;// 
a=0;//     .line 45
a=0;//     const-wide/32 v0, 0x500000
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/twocloo/base/cache/lru/DiskLruCache;->maxCacheByteSize:J
a=0;// 
a=0;//     .line 47
a=0;//     new-instance v0, Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/LinkedHashMap;);
a=0;//     const/16 v1, 0x20
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const/high16 v2, 0x3f400000    # 0.75f
a=0;// 
a=0;//     .line 48
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-direct {v0, v1, v2, v3}, Ljava/util/LinkedHashMap;-><init>(IFZ)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedHashMap;);
a=0;//     invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/base/cache/lru/DiskLruCache;->mLinkedHashMap:Ljava/util/Map;
a=0;// 
a=0;//     .line 58
a=0;//     iput-object p1, p0, Lcom/twocloo/base/cache/lru/DiskLruCache;->mCacheDir:Ljava/io/File;
a=0;// 
a=0;//     .line 59
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/io/File;J)V
a=0;//     .locals 4
a=0;//     .param p1, "cacheDir"    # Ljava/io/File;
a=0;//     .param p2, "maxByteSize"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     .local p0, "this":Lcom/twocloo/base/cache/lru/DiskLruCache;, "Lcom/twocloo/base/cache/lru/DiskLruCache<TT;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 44
a=0;//     #p0=(Reference,Lcom/twocloo/base/cache/lru/DiskLruCache;);
a=0;//     const/16 v0, 0x40
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/twocloo/base/cache/lru/DiskLruCache;->maxCacheItemSize:I
a=0;// 
a=0;//     .line 45
a=0;//     const-wide/32 v0, 0x500000
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/twocloo/base/cache/lru/DiskLruCache;->maxCacheByteSize:J
a=0;// 
a=0;//     .line 47
a=0;//     new-instance v0, Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/LinkedHashMap;);
a=0;//     const/16 v1, 0x20
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const/high16 v2, 0x3f400000    # 0.75f
a=0;// 
a=0;//     .line 48
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-direct {v0, v1, v2, v3}, Ljava/util/LinkedHashMap;-><init>(IFZ)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedHashMap;);
a=0;//     invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/base/cache/lru/DiskLruCache;->mLinkedHashMap:Ljava/util/Map;
a=0;// 
a=0;//     .line 69
a=0;//     iput-object p1, p0, Lcom/twocloo/base/cache/lru/DiskLruCache;->mCacheDir:Ljava/io/File;
a=0;// 
a=0;//     .line 70
a=0;//     iput-wide p2, p0, Lcom/twocloo/base/cache/lru/DiskLruCache;->maxCacheByteSize:J
a=0;// 
a=0;//     .line 71
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static clearCache(Ljava/io/File;)V
a=0;//     .locals 3
a=0;//     .param p0, "cacheDir"    # Ljava/io/File;
a=0;// 
a=0;//     .prologue
a=0;//     .line 175
a=0;//     invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 176
a=0;//     .local v0, "files":[Ljava/io/File;
a=0;//     #v0=(Reference,[Ljava/io/File;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     array-length v2, v0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v1, v2, :cond_0
a=0;// 
a=0;//     .line 179
a=0;//     return-void
a=0;// 
a=0;//     .line 177
a=0;//     :cond_0
a=0;//     aget-object v2, v0, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 176
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static createFilePath(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p0, "cacheDir"    # Ljava/io/File;
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 163
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private flushCache()V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     .line 195
a=0;//     .local p0, "this":Lcom/twocloo/base/cache/lru/DiskLruCache;, "Lcom/twocloo/base/cache/lru/DiskLruCache<TT;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 197
a=0;//     .local v0, "count":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     const/4 v5, 0x4
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-ge v0, v5, :cond_0
a=0;// 
a=0;//     iget v5, p0, Lcom/twocloo/base/cache/lru/DiskLruCache;->cacheSize:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/16 v6, 0x40
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     if-gt v5, v6, :cond_1
a=0;// 
a=0;//     iget v5, p0, Lcom/twocloo/base/cache/lru/DiskLruCache;->cacheByteSize:I
a=0;// 
a=0;//     int-to-long v5, v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     iget-wide v7, p0, Lcom/twocloo/base/cache/lru/DiskLruCache;->maxCacheByteSize:J
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     cmp-long v5, v5, v7
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-gtz v5, :cond_1
a=0;// 
a=0;//     .line 207
a=0;//     :cond_0
a=0;//     #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 198
a=0;//     :cond_1
a=0;//     #v5=(Integer);
a=0;//     iget-object v5, p0, Lcom/twocloo/base/cache/lru/DiskLruCache;->mLinkedHashMap:Ljava/util/Map;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 199
a=0;//     .local v1, "eldestEntry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     check-cast v5, Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v2, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 200
a=0;//     .local v2, "eldestFile":Ljava/io/File;
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     .line 201
a=0;//     .local v3, "eldestFileSize":J
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     iget-object v5, p0, Lcom/twocloo/base/cache/lru/DiskLruCache;->mLinkedHashMap:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v5, v6}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 202
a=0;//     invoke-virtual {v2}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 203
a=0;//     iget-object v5, p0, Lcom/twocloo/base/cache/lru/DiskLruCache;->mLinkedHashMap:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v5}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iput v5, p0, Lcom/twocloo/base/cache/lru/DiskLruCache;->cacheSize:I
a=0;// 
a=0;//     .line 204
a=0;//     iget v5, p0, Lcom/twocloo/base/cache/lru/DiskLruCache;->cacheByteSize:I
a=0;// 
a=0;//     int-to-long v5, v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     sub-long/2addr v5, v3
a=0;// 
a=0;//     long-to-int v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iput v5, p0, Lcom/twocloo/base/cache/lru/DiskLruCache;->cacheByteSize:I
a=0;// 
a=0;//     .line 205
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private put(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 4
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;//     .param p2, "file"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 182
a=0;//     .local p0, "this":Lcom/twocloo/base/cache/lru/DiskLruCache;, "Lcom/twocloo/base/cache/lru/DiskLruCache<TT;>;"
a=0;//     iget-object v0, p0, Lcom/twocloo/base/cache/lru/DiskLruCache;->mLinkedHashMap:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 183
a=0;//     iget-object v0, p0, Lcom/twocloo/base/cache/lru/DiskLruCache;->mLinkedHashMap:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/base/cache/lru/DiskLruCache;->cacheSize:I
a=0;// 
a=0;//     .line 184
a=0;//     iget v0, p0, Lcom/twocloo/base/cache/lru/DiskLruCache;->cacheByteSize:I
a=0;// 
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v2, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     add-long/2addr v0, v2
a=0;// 
a=0;//     long-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloo/base/cache/lru/DiskLruCache;->cacheByteSize:I
a=0;// 
a=0;//     .line 185
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public clearCache()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 128
a=0;//     .local p0, "this":Lcom/twocloo/base/cache/lru/DiskLruCache;, "Lcom/twocloo/base/cache/lru/DiskLruCache<TT;>;"
a=0;//     iget-object v0, p0, Lcom/twocloo/base/cache/lru/DiskLruCache;->mCacheDir:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v0}, Lcom/twocloo/base/cache/lru/DiskLruCache;->clearCache(Ljava/io/File;)V
a=0;// 
a=0;//     .line 129
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public get(Ljava/lang/String;)Ljava/lang/Object;
a=0;//     .locals 5
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             ")TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 105
a=0;//     .local p0, "this":Lcom/twocloo/base/cache/lru/DiskLruCache;, "Lcom/twocloo/base/cache/lru/DiskLruCache<TT;>;"
a=0;//     iget-object v4, p0, Lcom/twocloo/base/cache/lru/DiskLruCache;->mLinkedHashMap:Ljava/util/Map;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/Map;);
a=0;//     monitor-enter v4
a=0;// 
a=0;//     .line 107
a=0;//     :try_start_0
a=0;//     iget-object v3, p0, Lcom/twocloo/base/cache/lru/DiskLruCache;->mLinkedHashMap:Ljava/util/Map;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Ljava/lang/String;
a=0;// 
a=0;//     .line 108
a=0;//     .local v2, "file":Ljava/lang/String;
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 109
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/base/cache/lru/DiskLruCache;->readFromFile(Ljava/lang/String;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :try_start_1
a=0;//     monitor-exit v4
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 120
a=0;//     .end local v2    # "file":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 111
a=0;//     .restart local v2    # "file":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     :try_start_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/twocloo/base/cache/lru/DiskLruCache;->mCacheDir:Ljava/io/File;
a=0;// 
a=0;//     invoke-static {v3, p1}, Lcom/twocloo/base/cache/lru/DiskLruCache;->createFilePath(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 112
a=0;//     .local v1, "existingFile":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v3, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 113
a=0;//     invoke-direct {p0, p1, v1}, Lcom/twocloo/base/cache/lru/DiskLruCache;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 114
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/base/cache/lru/DiskLruCache;->readFromFile(Ljava/lang/String;)Ljava/lang/Object;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :try_start_3
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     monitor-exit v4
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 105
a=0;//     .end local v1    # "existingFile":Ljava/lang/String;
a=0;//     .end local v2    # "file":Ljava/lang/String;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v4
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     throw v3
a=0;// 
a=0;//     .line 117
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 118
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     :try_start_4
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 120
a=0;//     .end local v0    # "e":Ljava/lang/Throwable;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     monitor-exit v4
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public put(Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     .locals 4
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "TT;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     .local p0, "this":Lcom/twocloo/base/cache/lru/DiskLruCache;, "Lcom/twocloo/base/cache/lru/DiskLruCache<TT;>;"
a=0;//     .local p2, "obj":Ljava/lang/Object;, "TT;"
a=0;//     iget-object v3, p0, Lcom/twocloo/base/cache/lru/DiskLruCache;->mLinkedHashMap:Ljava/util/Map;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Map;);
a=0;//     monitor-enter v3
a=0;// 
a=0;//     .line 83
a=0;//     :try_start_0
a=0;//     iget-object v2, p0, Lcom/twocloo/base/cache/lru/DiskLruCache;->mLinkedHashMap:Ljava/util/Map;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 85
a=0;//     :try_start_1
a=0;//     iget-object v2, p0, Lcom/twocloo/base/cache/lru/DiskLruCache;->mCacheDir:Ljava/io/File;
a=0;// 
a=0;//     invoke-static {v2, p1}, Lcom/twocloo/base/cache/lru/DiskLruCache;->createFilePath(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 86
a=0;//     .local v1, "file":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, p2, v1}, Lcom/twocloo/base/cache/lru/DiskLruCache;->writeToFile(Ljava/lang/Object;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 87
a=0;//     invoke-direct {p0, p1, v1}, Lcom/twocloo/base/cache/lru/DiskLruCache;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 88
a=0;//     invoke-direct {p0}, Lcom/twocloo/base/cache/lru/DiskLruCache;->flushCache()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 82
a=0;//     .end local v1    # "file":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :try_start_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     monitor-exit v3
a=0;// 
a=0;//     .line 95
a=0;//     return-void
a=0;// 
a=0;//     .line 90
a=0;//     :catch_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 91
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 82
a=0;//     .end local v0    # "e":Ljava/lang/Throwable;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v3
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method protected abstract readFromFile(Ljava/lang/String;)Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             ")TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Throwable;
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method protected abstract writeToFile(Ljava/lang/Object;Ljava/lang/String;)Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;",
a=0;//             "Ljava/lang/String;",
a=0;//             ")Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Throwable;
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
}}
