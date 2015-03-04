package com.android.volley; class RequestQueue { void a() { int a;
a=0;// .class public Lcom/android/volley/RequestQueue;
a=0;// .super Ljava/lang/Object;
a=0;// .source "RequestQueue.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/android/volley/RequestQueue$RequestFilter;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DEFAULT_NETWORK_THREAD_POOL_SIZE:I = 0x4
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mCache:Lcom/android/volley/Cache;
a=0;// 
a=0;// .field private mCacheDispatcher:Lcom/android/volley/CacheDispatcher;
a=0;// 
a=0;// .field private final mCacheQueue:Ljava/util/concurrent/PriorityBlockingQueue;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/concurrent/PriorityBlockingQueue",
a=0;//             "<",
a=0;//             "Lcom/android/volley/Request;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final mCurrentRequests:Ljava/util/Set;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Set",
a=0;//             "<",
a=0;//             "Lcom/android/volley/Request;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final mDelivery:Lcom/android/volley/ResponseDelivery;
a=0;// 
a=0;// .field private mDispatchers:[Lcom/android/volley/NetworkDispatcher;
a=0;// 
a=0;// .field private final mNetwork:Lcom/android/volley/Network;
a=0;// 
a=0;// .field private final mNetworkQueue:Ljava/util/concurrent/PriorityBlockingQueue;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/concurrent/PriorityBlockingQueue",
a=0;//             "<",
a=0;//             "Lcom/android/volley/Request;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mSequenceGenerator:Ljava/util/concurrent/atomic/AtomicInteger;
a=0;// 
a=0;// .field private final mWaitingRequests:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/Queue",
a=0;//             "<",
a=0;//             "Lcom/android/volley/Request;",
a=0;//             ">;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/android/volley/Cache;Lcom/android/volley/Network;)V
a=0;//     .locals 1
a=0;//     .param p1, "cache"    # Lcom/android/volley/Cache;
a=0;//     .param p2, "network"    # Lcom/android/volley/Network;
a=0;// 
a=0;//     .prologue
a=0;//     .line 125
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, p1, p2, v0}, Lcom/android/volley/RequestQueue;-><init>(Lcom/android/volley/Cache;Lcom/android/volley/Network;I)V
a=0;// 
a=0;//     .line 126
a=0;//     #p0=(Reference,Lcom/android/volley/RequestQueue;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/android/volley/Cache;Lcom/android/volley/Network;I)V
a=0;//     .locals 3
a=0;//     .param p1, "cache"    # Lcom/android/volley/Cache;
a=0;//     .param p2, "network"    # Lcom/android/volley/Network;
a=0;//     .param p3, "threadPoolSize"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     .line 115
a=0;//     new-instance v0, Lcom/android/volley/ExecutorDelivery;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/volley/ExecutorDelivery;);
a=0;//     new-instance v1, Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Looper;);
a=0;//     invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-direct {v0, v1}, Lcom/android/volley/ExecutorDelivery;-><init>(Landroid/os/Handler;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/ExecutorDelivery;);
a=0;//     invoke-direct {p0, p1, p2, p3, v0}, Lcom/android/volley/RequestQueue;-><init>(Lcom/android/volley/Cache;Lcom/android/volley/Network;ILcom/android/volley/ResponseDelivery;)V
a=0;// 
a=0;//     .line 116
a=0;//     #p0=(Reference,Lcom/android/volley/RequestQueue;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/android/volley/Cache;Lcom/android/volley/Network;ILcom/android/volley/ResponseDelivery;)V
a=0;//     .locals 1
a=0;//     .param p1, "cache"    # Lcom/android/volley/Cache;
a=0;//     .param p2, "network"    # Lcom/android/volley/Network;
a=0;//     .param p3, "threadPoolSize"    # I
a=0;//     .param p4, "delivery"    # Lcom/android/volley/ResponseDelivery;
a=0;// 
a=0;//     .prologue
a=0;//     .line 98
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 42
a=0;//     #p0=(Reference,Lcom/android/volley/RequestQueue;);
a=0;//     new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/atomic/AtomicInteger;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicInteger;);
a=0;//     iput-object v0, p0, Lcom/android/volley/RequestQueue;->mSequenceGenerator:Ljava/util/concurrent/atomic/AtomicInteger;
a=0;// 
a=0;//     .line 55
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/android/volley/RequestQueue;->mWaitingRequests:Ljava/util/Map;
a=0;// 
a=0;//     .line 62
a=0;//     new-instance v0, Ljava/util/HashSet;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashSet;);
a=0;//     invoke-direct {v0}, Ljava/util/HashSet;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashSet;);
a=0;//     iput-object v0, p0, Lcom/android/volley/RequestQueue;->mCurrentRequests:Ljava/util/Set;
a=0;// 
a=0;//     .line 66
a=0;//     new-instance v0, Ljava/util/concurrent/PriorityBlockingQueue;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/PriorityBlockingQueue;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/PriorityBlockingQueue;);
a=0;//     iput-object v0, p0, Lcom/android/volley/RequestQueue;->mCacheQueue:Ljava/util/concurrent/PriorityBlockingQueue;
a=0;// 
a=0;//     .line 70
a=0;//     new-instance v0, Ljava/util/concurrent/PriorityBlockingQueue;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/PriorityBlockingQueue;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/PriorityBlockingQueue;);
a=0;//     iput-object v0, p0, Lcom/android/volley/RequestQueue;->mNetworkQueue:Ljava/util/concurrent/PriorityBlockingQueue;
a=0;// 
a=0;//     .line 100
a=0;//     iput-object p1, p0, Lcom/android/volley/RequestQueue;->mCache:Lcom/android/volley/Cache;
a=0;// 
a=0;//     .line 101
a=0;//     iput-object p2, p0, Lcom/android/volley/RequestQueue;->mNetwork:Lcom/android/volley/Network;
a=0;// 
a=0;//     .line 102
a=0;//     new-array v0, p3, [Lcom/android/volley/NetworkDispatcher;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/android/volley/RequestQueue;->mDispatchers:[Lcom/android/volley/NetworkDispatcher;
a=0;// 
a=0;//     .line 103
a=0;//     iput-object p4, p0, Lcom/android/volley/RequestQueue;->mDelivery:Lcom/android/volley/ResponseDelivery;
a=0;// 
a=0;//     .line 104
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public add(Lcom/android/volley/Request;)Lcom/android/volley/Request;
a=0;//     .locals 6
a=0;//     .param p1, "request"    # Lcom/android/volley/Request;
a=0;// 
a=0;//     .prologue
a=0;//     .line 219
a=0;//     invoke-virtual {p1, p0}, Lcom/android/volley/Request;->setRequestQueue(Lcom/android/volley/RequestQueue;)V
a=0;// 
a=0;//     .line 220
a=0;//     iget-object v3, p0, Lcom/android/volley/RequestQueue;->mCurrentRequests:Ljava/util/Set;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Set;);
a=0;//     monitor-enter v3
a=0;// 
a=0;//     .line 221
a=0;//     :try_start_0
a=0;//     iget-object v2, p0, Lcom/android/volley/RequestQueue;->mCurrentRequests:Ljava/util/Set;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 220
a=0;//     monitor-exit v3
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 225
a=0;//     invoke-virtual {p0}, Lcom/android/volley/RequestQueue;->getSequenceNumber()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1, v2}, Lcom/android/volley/Request;->setSequence(I)V
a=0;// 
a=0;//     .line 226
a=0;//     const-string v2, "add-to-queue"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Lcom/android/volley/Request;->addMarker(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 229
a=0;//     invoke-virtual {p1}, Lcom/android/volley/Request;->shouldCache()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 230
a=0;//     iget-object v2, p0, Lcom/android/volley/RequestQueue;->mNetworkQueue:Ljava/util/concurrent/PriorityBlockingQueue;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/concurrent/PriorityBlockingQueue;);
a=0;//     invoke-virtual {v2, p1}, Ljava/util/concurrent/PriorityBlockingQueue;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 254
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object p1
a=0;// 
a=0;//     .line 220
a=0;//     :catchall_0
a=0;//     #v0=(Uninit);v1=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v3
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v2
a=0;// 
a=0;//     .line 235
a=0;//     :cond_0
a=0;//     #v2=(Boolean);
a=0;//     iget-object v3, p0, Lcom/android/volley/RequestQueue;->mWaitingRequests:Ljava/util/Map;
a=0;// 
a=0;//     monitor-enter v3
a=0;// 
a=0;//     .line 236
a=0;//     :try_start_2
a=0;//     invoke-virtual {p1}, Lcom/android/volley/Request;->getCacheKey()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 237
a=0;//     .local v0, "cacheKey":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/android/volley/RequestQueue;->mWaitingRequests:Ljava/util/Map;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 239
a=0;//     iget-object v2, p0, Lcom/android/volley/RequestQueue;->mWaitingRequests:Ljava/util/Map;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/util/Queue;
a=0;// 
a=0;//     .line 240
a=0;//     .local v1, "stagedRequests":Ljava/util/Queue;, "Ljava/util/Queue<Lcom/android/volley/Request;>;"
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 241
a=0;//     new-instance v1, Ljava/util/LinkedList;
a=0;// 
a=0;//     .end local v1    # "stagedRequests":Ljava/util/Queue;, "Ljava/util/Queue<Lcom/android/volley/Request;>;"
a=0;//     #v1=(UninitRef,Ljava/util/LinkedList;);
a=0;//     invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V
a=0;// 
a=0;//     .line 243
a=0;//     .restart local v1    # "stagedRequests":Ljava/util/Queue;, "Ljava/util/Queue<Lcom/android/volley/Request;>;"
a=0;//     :cond_1
a=0;//     #v1=(Reference,Ujava/lang/Object;);
a=0;//     invoke-interface {v1, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 244
a=0;//     iget-object v2, p0, Lcom/android/volley/RequestQueue;->mWaitingRequests:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 245
a=0;//     sget-boolean v2, Lcom/android/volley/VolleyLog;->DEBUG:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 246
a=0;//     const-string v2, "Request for cacheKey=%s is in flight, putting on hold."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     aput-object v0, v4, v5
a=0;// 
a=0;//     invoke-static {v2, v4}, Lcom/android/volley/VolleyLog;->v(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 254
a=0;//     .end local v1    # "stagedRequests":Ljava/util/Queue;, "Ljava/util/Queue<Lcom/android/volley/Request;>;"
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     monitor-exit v3
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 235
a=0;//     .end local v0    # "cacheKey":Ljava/lang/String;
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v3
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     throw v2
a=0;// 
a=0;//     .line 251
a=0;//     .restart local v0    # "cacheKey":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Uninit);v2=(Boolean);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v2, p0, Lcom/android/volley/RequestQueue;->mWaitingRequests:Ljava/util/Map;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Map;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-interface {v2, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 252
a=0;//     iget-object v2, p0, Lcom/android/volley/RequestQueue;->mCacheQueue:Ljava/util/concurrent/PriorityBlockingQueue;
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/util/concurrent/PriorityBlockingQueue;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public cancelAll(Lcom/android/volley/RequestQueue$RequestFilter;)V
a=0;//     .locals 4
a=0;//     .param p1, "filter"    # Lcom/android/volley/RequestQueue$RequestFilter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 187
a=0;//     iget-object v2, p0, Lcom/android/volley/RequestQueue;->mCurrentRequests:Ljava/util/Set;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Set;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 188
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/android/volley/RequestQueue;->mCurrentRequests:Ljava/util/Set;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 187
a=0;//     monitor-exit v2
a=0;// 
a=0;//     .line 194
a=0;//     return-void
a=0;// 
a=0;//     .line 188
a=0;//     :cond_1
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/volley/Request;
a=0;// 
a=0;//     .line 189
a=0;//     .local v0, "request":Lcom/android/volley/Request;, "Lcom/android/volley/Request<*>;"
a=0;//     invoke-interface {p1, v0}, Lcom/android/volley/RequestQueue$RequestFilter;->apply(Lcom/android/volley/Request;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 190
a=0;//     invoke-virtual {v0}, Lcom/android/volley/Request;->cancel()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 187
a=0;//     .end local v0    # "request":Lcom/android/volley/Request;, "Lcom/android/volley/Request<*>;"
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public cancelAll(Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;//     .param p1, "tag"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 201
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 202
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "Cannot cancelAll with a null tag"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 204
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     new-instance v0, Lcom/android/volley/RequestQueue$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/volley/RequestQueue$1;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/android/volley/RequestQueue$1;-><init>(Lcom/android/volley/RequestQueue;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/RequestQueue$1;);
a=0;//     invoke-virtual {p0, v0}, Lcom/android/volley/RequestQueue;->cancelAll(Lcom/android/volley/RequestQueue$RequestFilter;)V
a=0;// 
a=0;//     .line 210
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method finish(Lcom/android/volley/Request;)V
a=0;//     .locals 7
a=0;//     .param p1, "request"    # Lcom/android/volley/Request;
a=0;// 
a=0;//     .prologue
a=0;//     .line 267
a=0;//     iget-object v3, p0, Lcom/android/volley/RequestQueue;->mCurrentRequests:Ljava/util/Set;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Set;);
a=0;//     monitor-enter v3
a=0;// 
a=0;//     .line 268
a=0;//     :try_start_0
a=0;//     iget-object v2, p0, Lcom/android/volley/RequestQueue;->mCurrentRequests:Ljava/util/Set;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v2, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 267
a=0;//     monitor-exit v3
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 271
a=0;//     invoke-virtual {p1}, Lcom/android/volley/Request;->shouldCache()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 272
a=0;//     iget-object v3, p0, Lcom/android/volley/RequestQueue;->mWaitingRequests:Ljava/util/Map;
a=0;// 
a=0;//     monitor-enter v3
a=0;// 
a=0;//     .line 273
a=0;//     :try_start_1
a=0;//     invoke-virtual {p1}, Lcom/android/volley/Request;->getCacheKey()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 274
a=0;//     .local v0, "cacheKey":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/android/volley/RequestQueue;->mWaitingRequests:Ljava/util/Map;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/util/Queue;
a=0;// 
a=0;//     .line 275
a=0;//     .local v1, "waitingRequests":Ljava/util/Queue;, "Ljava/util/Queue<Lcom/android/volley/Request;>;"
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 276
a=0;//     sget-boolean v2, Lcom/android/volley/VolleyLog;->DEBUG:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 277
a=0;//     const-string v2, "Releasing %d waiting requests for cacheKey=%s."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 278
a=0;//     #v5=(Null);
a=0;//     invoke-interface {v1}, Ljava/util/Queue;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     aput-object v0, v4, v5
a=0;// 
a=0;//     .line 277
a=0;//     invoke-static {v2, v4}, Lcom/android/volley/VolleyLog;->v(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 282
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/android/volley/RequestQueue;->mCacheQueue:Ljava/util/concurrent/PriorityBlockingQueue;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/concurrent/PriorityBlockingQueue;);
a=0;//     invoke-virtual {v2, v1}, Ljava/util/concurrent/PriorityBlockingQueue;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 272
a=0;//     :cond_1
a=0;//     monitor-exit v3
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 286
a=0;//     .end local v0    # "cacheKey":Ljava/lang/String;
a=0;//     .end local v1    # "waitingRequests":Ljava/util/Queue;, "Ljava/util/Queue<Lcom/android/volley/Request;>;"
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 267
a=0;//     :catchall_0
a=0;//     #v0=(Uninit);v1=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     :try_start_2
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v3
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     throw v2
a=0;// 
a=0;//     .line 272
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     :try_start_3
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v3
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method public getCache()Lcom/android/volley/Cache;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 171
a=0;//     iget-object v0, p0, Lcom/android/volley/RequestQueue;->mCache:Lcom/android/volley/Cache;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/Cache;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getSequenceNumber()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 164
a=0;//     iget-object v0, p0, Lcom/android/volley/RequestQueue;->mSequenceGenerator:Ljava/util/concurrent/atomic/AtomicInteger;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicInteger;);
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public start()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 132
a=0;//     invoke-virtual {p0}, Lcom/android/volley/RequestQueue;->stop()V
a=0;// 
a=0;//     .line 134
a=0;//     new-instance v2, Lcom/android/volley/CacheDispatcher;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/android/volley/CacheDispatcher;);
a=0;//     iget-object v3, p0, Lcom/android/volley/RequestQueue;->mCacheQueue:Ljava/util/concurrent/PriorityBlockingQueue;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/concurrent/PriorityBlockingQueue;);
a=0;//     iget-object v4, p0, Lcom/android/volley/RequestQueue;->mNetworkQueue:Ljava/util/concurrent/PriorityBlockingQueue;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/concurrent/PriorityBlockingQueue;);
a=0;//     iget-object v5, p0, Lcom/android/volley/RequestQueue;->mCache:Lcom/android/volley/Cache;
a=0;// 
a=0;//     #v5=(Reference,Lcom/android/volley/Cache;);
a=0;//     iget-object v6, p0, Lcom/android/volley/RequestQueue;->mDelivery:Lcom/android/volley/ResponseDelivery;
a=0;// 
a=0;//     #v6=(Reference,Lcom/android/volley/ResponseDelivery;);
a=0;//     invoke-direct {v2, v3, v4, v5, v6}, Lcom/android/volley/CacheDispatcher;-><init>(Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/BlockingQueue;Lcom/android/volley/Cache;Lcom/android/volley/ResponseDelivery;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/android/volley/CacheDispatcher;);
a=0;//     iput-object v2, p0, Lcom/android/volley/RequestQueue;->mCacheDispatcher:Lcom/android/volley/CacheDispatcher;
a=0;// 
a=0;//     .line 135
a=0;//     iget-object v2, p0, Lcom/android/volley/RequestQueue;->mCacheDispatcher:Lcom/android/volley/CacheDispatcher;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/android/volley/CacheDispatcher;->start()V
a=0;// 
a=0;//     .line 138
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/android/volley/RequestQueue;->mDispatchers:[Lcom/android/volley/NetworkDispatcher;
a=0;// 
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     .line 144
a=0;//     return-void
a=0;// 
a=0;//     .line 139
a=0;//     :cond_0
a=0;//     new-instance v1, Lcom/android/volley/NetworkDispatcher;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/android/volley/NetworkDispatcher;);
a=0;//     iget-object v2, p0, Lcom/android/volley/RequestQueue;->mNetworkQueue:Ljava/util/concurrent/PriorityBlockingQueue;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/concurrent/PriorityBlockingQueue;);
a=0;//     iget-object v3, p0, Lcom/android/volley/RequestQueue;->mNetwork:Lcom/android/volley/Network;
a=0;// 
a=0;//     .line 140
a=0;//     iget-object v4, p0, Lcom/android/volley/RequestQueue;->mCache:Lcom/android/volley/Cache;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/android/volley/RequestQueue;->mDelivery:Lcom/android/volley/ResponseDelivery;
a=0;// 
a=0;//     .line 139
a=0;//     invoke-direct {v1, v2, v3, v4, v5}, Lcom/android/volley/NetworkDispatcher;-><init>(Ljava/util/concurrent/BlockingQueue;Lcom/android/volley/Network;Lcom/android/volley/Cache;Lcom/android/volley/ResponseDelivery;)V
a=0;// 
a=0;//     .line 141
a=0;//     .local v1, "networkDispatcher":Lcom/android/volley/NetworkDispatcher;
a=0;//     #v1=(Reference,Lcom/android/volley/NetworkDispatcher;);
a=0;//     iget-object v2, p0, Lcom/android/volley/RequestQueue;->mDispatchers:[Lcom/android/volley/NetworkDispatcher;
a=0;// 
a=0;//     aput-object v1, v2, v0
a=0;// 
a=0;//     .line 142
a=0;//     invoke-virtual {v1}, Lcom/android/volley/NetworkDispatcher;->start()V
a=0;// 
a=0;//     .line 138
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public stop()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     iget-object v1, p0, Lcom/android/volley/RequestQueue;->mCacheDispatcher:Lcom/android/volley/CacheDispatcher;
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/volley/CacheDispatcher;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 151
a=0;//     iget-object v1, p0, Lcom/android/volley/RequestQueue;->mCacheDispatcher:Lcom/android/volley/CacheDispatcher;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/android/volley/CacheDispatcher;->quit()V
a=0;// 
a=0;//     .line 153
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/android/volley/RequestQueue;->mDispatchers:[Lcom/android/volley/NetworkDispatcher;
a=0;// 
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 158
a=0;//     return-void
a=0;// 
a=0;//     .line 154
a=0;//     :cond_1
a=0;//     iget-object v1, p0, Lcom/android/volley/RequestQueue;->mDispatchers:[Lcom/android/volley/NetworkDispatcher;
a=0;// 
a=0;//     #v1=(Reference,[Lcom/android/volley/NetworkDispatcher;);
a=0;//     aget-object v1, v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 155
a=0;//     iget-object v1, p0, Lcom/android/volley/RequestQueue;->mDispatchers:[Lcom/android/volley/NetworkDispatcher;
a=0;// 
a=0;//     #v1=(Reference,[Lcom/android/volley/NetworkDispatcher;);
a=0;//     aget-object v1, v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Lcom/android/volley/NetworkDispatcher;->quit()V
a=0;// 
a=0;//     .line 153
a=0;//     :cond_2
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
