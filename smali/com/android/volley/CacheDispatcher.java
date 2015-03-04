package com.android.volley; class CacheDispatcher { void a() { int a;
a=0;// .class public Lcom/android/volley/CacheDispatcher;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "CacheDispatcher.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DEBUG:Z
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mCache:Lcom/android/volley/Cache;
a=0;// 
a=0;// .field private final mCacheQueue:Ljava/util/concurrent/BlockingQueue;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/concurrent/BlockingQueue",
a=0;//             "<",
a=0;//             "Lcom/android/volley/Request;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final mDelivery:Lcom/android/volley/ResponseDelivery;
a=0;// 
a=0;// .field private final mNetworkQueue:Ljava/util/concurrent/BlockingQueue;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/concurrent/BlockingQueue",
a=0;//             "<",
a=0;//             "Lcom/android/volley/Request;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private volatile mQuit:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     sget-boolean v0, Lcom/android/volley/VolleyLog;->DEBUG:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     sput-boolean v0, Lcom/android/volley/CacheDispatcher;->DEBUG:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/BlockingQueue;Lcom/android/volley/Cache;Lcom/android/volley/ResponseDelivery;)V
a=0;//     .locals 1
a=0;//     .param p3, "cache"    # Lcom/android/volley/Cache;
a=0;//     .param p4, "delivery"    # Lcom/android/volley/ResponseDelivery;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/concurrent/BlockingQueue",
a=0;//             "<",
a=0;//             "Lcom/android/volley/Request;",
a=0;//             ">;",
a=0;//             "Ljava/util/concurrent/BlockingQueue",
a=0;//             "<",
a=0;//             "Lcom/android/volley/Request;",
a=0;//             ">;",
a=0;//             "Lcom/android/volley/Cache;",
a=0;//             "Lcom/android/volley/ResponseDelivery;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     .local p1, "cacheQueue":Ljava/util/concurrent/BlockingQueue;, "Ljava/util/concurrent/BlockingQueue<Lcom/android/volley/Request;>;"
a=0;//     .local p2, "networkQueue":Ljava/util/concurrent/BlockingQueue;, "Ljava/util/concurrent/BlockingQueue<Lcom/android/volley/Request;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 50
a=0;//     #p0=(Reference,Lcom/android/volley/CacheDispatcher;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/android/volley/CacheDispatcher;->mQuit:Z
a=0;// 
a=0;//     .line 64
a=0;//     iput-object p1, p0, Lcom/android/volley/CacheDispatcher;->mCacheQueue:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     .line 65
a=0;//     iput-object p2, p0, Lcom/android/volley/CacheDispatcher;->mNetworkQueue:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     .line 66
a=0;//     iput-object p3, p0, Lcom/android/volley/CacheDispatcher;->mCache:Lcom/android/volley/Cache;
a=0;// 
a=0;//     .line 67
a=0;//     iput-object p4, p0, Lcom/android/volley/CacheDispatcher;->mDelivery:Lcom/android/volley/ResponseDelivery;
a=0;// 
a=0;//     .line 68
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/android/volley/CacheDispatcher;)Ljava/util/concurrent/BlockingQueue;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iget-object v0, p0, Lcom/android/volley/CacheDispatcher;->mNetworkQueue:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/BlockingQueue;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public quit()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/android/volley/CacheDispatcher;->mQuit:Z
a=0;// 
a=0;//     .line 76
a=0;//     invoke-virtual {p0}, Lcom/android/volley/CacheDispatcher;->interrupt()V
a=0;// 
a=0;//     .line 77
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public run()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     sget-boolean v4, Lcom/android/volley/CacheDispatcher;->DEBUG:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     const-string v4, "start new dispatcher"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v4, v5}, Lcom/android/volley/VolleyLog;->v(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 82
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     const/16 v4, 0xa
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-static {v4}, Landroid/os/Process;->setThreadPriority(I)V
a=0;// 
a=0;//     .line 85
a=0;//     iget-object v4, p0, Lcom/android/volley/CacheDispatcher;->mCache:Lcom/android/volley/Cache;
a=0;// 
a=0;//     #v4=(Reference,Lcom/android/volley/Cache;);
a=0;//     invoke-interface {v4}, Lcom/android/volley/Cache;->initialize()V
a=0;// 
a=0;//     .line 91
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v4, p0, Lcom/android/volley/CacheDispatcher;->mCacheQueue:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/concurrent/BlockingQueue;);
a=0;//     invoke-interface {v4}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/android/volley/Request;
a=0;// 
a=0;//     .line 92
a=0;//     .local v2, "request":Lcom/android/volley/Request;
a=0;//     const-string v4, "cache-queue-take"
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Lcom/android/volley/Request;->addMarker(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 95
a=0;//     invoke-virtual {v2}, Lcom/android/volley/Request;->isCanceled()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 96
a=0;//     const-string v4, "cache-discard-canceled"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Lcom/android/volley/Request;->finish(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 150
a=0;//     .end local v2    # "request":Lcom/android/volley/Request;
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 152
a=0;//     .local v0, "e":Ljava/lang/InterruptedException;
a=0;//     #v0=(Reference,Ljava/lang/InterruptedException;);
a=0;//     iget-boolean v4, p0, Lcom/android/volley/CacheDispatcher;->mQuit:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 153
a=0;//     return-void
a=0;// 
a=0;//     .line 101
a=0;//     .end local v0    # "e":Ljava/lang/InterruptedException;
a=0;//     .restart local v2    # "request":Lcom/android/volley/Request;
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Conflicted);v2=(Reference,Lcom/android/volley/Request;);
a=0;//     iget-object v4, p0, Lcom/android/volley/CacheDispatcher;->mCache:Lcom/android/volley/Cache;
a=0;// 
a=0;//     #v4=(Reference,Lcom/android/volley/Cache;);
a=0;//     invoke-virtual {v2}, Lcom/android/volley/Request;->getCacheKey()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v4, v5}, Lcom/android/volley/Cache;->get(Ljava/lang/String;)Lcom/android/volley/Cache$Entry;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 102
a=0;//     .local v1, "entry":Lcom/android/volley/Cache$Entry;
a=0;//     #v1=(Reference,Lcom/android/volley/Cache$Entry;);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 103
a=0;//     const-string v4, "cache-miss"
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Lcom/android/volley/Request;->addMarker(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 105
a=0;//     iget-object v4, p0, Lcom/android/volley/CacheDispatcher;->mNetworkQueue:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     invoke-interface {v4, v2}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 110
a=0;//     :cond_3
a=0;//     invoke-virtual {v1}, Lcom/android/volley/Cache$Entry;->isExpired()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     .line 111
a=0;//     const-string v4, "cache-hit-expired"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Lcom/android/volley/Request;->addMarker(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 112
a=0;//     invoke-virtual {v2, v1}, Lcom/android/volley/Request;->setCacheEntry(Lcom/android/volley/Cache$Entry;)V
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v4, p0, Lcom/android/volley/CacheDispatcher;->mNetworkQueue:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     invoke-interface {v4, v2}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 118
a=0;//     :cond_4
a=0;//     #v4=(Boolean);
a=0;//     const-string v4, "cache-hit"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Lcom/android/volley/Request;->addMarker(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 120
a=0;//     new-instance v4, Lcom/android/volley/NetworkResponse;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/android/volley/NetworkResponse;);
a=0;//     iget-object v5, v1, Lcom/android/volley/Cache$Entry;->data:[B
a=0;// 
a=0;//     iget-object v6, v1, Lcom/android/volley/Cache$Entry;->responseHeaders:Ljava/util/Map;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/Map;);
a=0;//     invoke-direct {v4, v5, v6}, Lcom/android/volley/NetworkResponse;-><init>([BLjava/util/Map;)V
a=0;// 
a=0;//     .line 119
a=0;//     #v4=(Reference,Lcom/android/volley/NetworkResponse;);
a=0;//     invoke-virtual {v2, v4}, Lcom/android/volley/Request;->parseNetworkResponse(Lcom/android/volley/NetworkResponse;)Lcom/android/volley/Response;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 121
a=0;//     .local v3, "response":Lcom/android/volley/Response;, "Lcom/android/volley/Response<*>;"
a=0;//     #v3=(Reference,Lcom/android/volley/Response;);
a=0;//     const-string v4, "cache-hit-parsed"
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Lcom/android/volley/Request;->addMarker(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 123
a=0;//     invoke-virtual {v1}, Lcom/android/volley/Cache$Entry;->refreshNeeded()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_5
a=0;// 
a=0;//     .line 125
a=0;//     iget-object v4, p0, Lcom/android/volley/CacheDispatcher;->mDelivery:Lcom/android/volley/ResponseDelivery;
a=0;// 
a=0;//     #v4=(Reference,Lcom/android/volley/ResponseDelivery;);
a=0;//     invoke-interface {v4, v2, v3}, Lcom/android/volley/ResponseDelivery;->postResponse(Lcom/android/volley/Request;Lcom/android/volley/Response;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 130
a=0;//     :cond_5
a=0;//     #v4=(Boolean);
a=0;//     const-string v4, "cache-hit-refresh-needed"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Lcom/android/volley/Request;->addMarker(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 131
a=0;//     invoke-virtual {v2, v1}, Lcom/android/volley/Request;->setCacheEntry(Lcom/android/volley/Cache$Entry;)V
a=0;// 
a=0;//     .line 134
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     iput-boolean v4, v3, Lcom/android/volley/Response;->intermediate:Z
a=0;// 
a=0;//     .line 138
a=0;//     iget-object v4, p0, Lcom/android/volley/CacheDispatcher;->mDelivery:Lcom/android/volley/ResponseDelivery;
a=0;// 
a=0;//     #v4=(Reference,Lcom/android/volley/ResponseDelivery;);
a=0;//     new-instance v5, Lcom/android/volley/CacheDispatcher$1;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/android/volley/CacheDispatcher$1;);
a=0;//     invoke-direct {v5, p0, v2}, Lcom/android/volley/CacheDispatcher$1;-><init>(Lcom/android/volley/CacheDispatcher;Lcom/android/volley/Request;)V
a=0;// 
a=0;//     #v5=(Reference,Lcom/android/volley/CacheDispatcher$1;);
a=0;//     invoke-interface {v4, v2, v3, v5}, Lcom/android/volley/ResponseDelivery;->postResponse(Lcom/android/volley/Request;Lcom/android/volley/Response;Ljava/lang/Runnable;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
