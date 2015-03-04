package com.lidroid.xutils.http; class HttpCache { void a() { int a;
a=0;// .class public Lcom/lidroid/xutils/http/HttpCache;
a=0;// .super Ljava/lang/Object;
a=0;// .source "HttpCache.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DEFAULT_CACHE_SIZE:I = 0x19000
a=0;// 
a=0;// .field private static final DEFAULT_EXPIRY_TIME:J = 0xea60L
a=0;// 
a=0;// .field private static defaultExpiryTime:J
a=0;// 
a=0;// .field private static final httpMethod_enabled_map:Ljava/util/concurrent/ConcurrentHashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/concurrent/ConcurrentHashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Boolean;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private cacheSize:I
a=0;// 
a=0;// .field private final mMemoryCache:Lcom/lidroid/xutils/util/core/LruMemoryCache;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/lidroid/xutils/util/core/LruMemoryCache",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     const-wide/32 v0, 0xea60
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sput-wide v0, Lcom/lidroid/xutils/http/HttpCache;->defaultExpiryTime:J
a=0;// 
a=0;//     .line 115
a=0;//     new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     sput-object v0, Lcom/lidroid/xutils/http/HttpCache;->httpMethod_enabled_map:Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     .line 116
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/HttpCache;->httpMethod_enabled_map:Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;->GET:Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;);
a=0;//     invoke-virtual {v1}, Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 29
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     const v0, 0x19000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const-wide/32 v1, 0xea60
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-direct {p0, v0, v1, v2}, Lcom/lidroid/xutils/http/HttpCache;-><init>(IJ)V
a=0;// 
a=0;//     .line 49
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/HttpCache;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(IJ)V
a=0;//     .locals 2
a=0;//     .param p1, "strLength"    # I
a=0;//     .param p2, "defaultExpiryTime"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 40
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/HttpCache;);
a=0;//     const v0, 0x19000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/lidroid/xutils/http/HttpCache;->cacheSize:I
a=0;// 
a=0;//     .line 52
a=0;//     iput p1, p0, Lcom/lidroid/xutils/http/HttpCache;->cacheSize:I
a=0;// 
a=0;//     .line 53
a=0;//     sput-wide p2, Lcom/lidroid/xutils/http/HttpCache;->defaultExpiryTime:J
a=0;// 
a=0;//     .line 55
a=0;//     new-instance v0, Lcom/lidroid/xutils/http/HttpCache$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/http/HttpCache$1;);
a=0;//     iget v1, p0, Lcom/lidroid/xutils/http/HttpCache;->cacheSize:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v0, p0, v1}, Lcom/lidroid/xutils/http/HttpCache$1;-><init>(Lcom/lidroid/xutils/http/HttpCache;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/HttpCache$1;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/HttpCache;->mMemoryCache:Lcom/lidroid/xutils/util/core/LruMemoryCache;
a=0;// 
a=0;//     .line 62
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getDefaultExpiryTime()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     sget-wide v0, Lcom/lidroid/xutils/http/HttpCache;->defaultExpiryTime:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public static setDefaultExpiryTime(J)V
a=0;//     .locals 0
a=0;//     .param p0, "defaultExpiryTime"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     sput-wide p0, Lcom/lidroid/xutils/http/HttpCache;->defaultExpiryTime:J
a=0;// 
a=0;//     .line 70
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public clear()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/HttpCache;->mMemoryCache:Lcom/lidroid/xutils/util/core/LruMemoryCache;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/LruMemoryCache;);
a=0;//     invoke-virtual {v0}, Lcom/lidroid/xutils/util/core/LruMemoryCache;->evictAll()V
a=0;// 
a=0;//     .line 92
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public get(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/HttpCache;->mMemoryCache:Lcom/lidroid/xutils/util/core/LruMemoryCache;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/LruMemoryCache;);
a=0;//     invoke-virtual {v0, p1}, Lcom/lidroid/xutils/util/core/LruMemoryCache;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isEnabled(Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;)Z
a=0;//     .locals 4
a=0;//     .param p1, "method"    # Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 95
a=0;//     #v1=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 98
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 97
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Null);v2=(Uninit);v3=(Uninit);
a=0;//     sget-object v2, Lcom/lidroid/xutils/http/HttpCache;->httpMethod_enabled_map:Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     invoke-virtual {p1}, Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/Boolean;
a=0;// 
a=0;//     .line 98
a=0;//     .local v0, "enabled":Ljava/lang/Boolean;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isEnabled(Ljava/lang/String;)Z
a=0;//     .locals 4
a=0;//     .param p1, "method"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 102
a=0;//     #v1=(Null);
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 105
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 104
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Null);v2=(Boolean);v3=(Uninit);
a=0;//     sget-object v2, Lcom/lidroid/xutils/http/HttpCache;->httpMethod_enabled_map:Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/Boolean;
a=0;// 
a=0;//     .line 105
a=0;//     .local v0, "enabled":Ljava/lang/Boolean;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public put(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "result"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     sget-wide v0, Lcom/lidroid/xutils/http/HttpCache;->defaultExpiryTime:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {p0, p1, p2, v0, v1}, Lcom/lidroid/xutils/http/HttpCache;->put(Ljava/lang/String;Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 78
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public put(Ljava/lang/String;Ljava/lang/String;J)V
a=0;//     .locals 3
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "result"    # Ljava/lang/String;
a=0;//     .param p3, "expiry"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     const-wide/16 v0, 0x1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmp-long v0, p3, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_1
a=0;// 
a=0;//     .line 84
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 83
a=0;//     :cond_1
a=0;//     #v0=(Byte);v1=(LongHi);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/HttpCache;->mMemoryCache:Lcom/lidroid/xutils/util/core/LruMemoryCache;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/LruMemoryCache;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     add-long/2addr v1, p3
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, v1, v2}, Lcom/lidroid/xutils/util/core/LruMemoryCache;->put(Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setCacheSize(I)V
a=0;//     .locals 1
a=0;//     .param p1, "strLength"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/HttpCache;->mMemoryCache:Lcom/lidroid/xutils/util/core/LruMemoryCache;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/LruMemoryCache;);
a=0;//     invoke-virtual {v0, p1}, Lcom/lidroid/xutils/util/core/LruMemoryCache;->setMaxSize(I)V
a=0;// 
a=0;//     .line 66
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setEnabled(Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;Z)V
a=0;//     .locals 3
a=0;//     .param p1, "method"    # Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;
a=0;//     .param p2, "enabled"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 109
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/HttpCache;->httpMethod_enabled_map:Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     invoke-virtual {p1}, Lcom/lidroid/xutils/http/client/HttpRequest$HttpMethod;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 110
a=0;//     return-void
a=0;// .end method
}}
