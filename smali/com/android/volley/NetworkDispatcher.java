package com.android.volley; class NetworkDispatcher { void a() { int a;
a=0;// .class public Lcom/android/volley/NetworkDispatcher;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "NetworkDispatcher.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mCache:Lcom/android/volley/Cache;
a=0;// 
a=0;// .field private final mDelivery:Lcom/android/volley/ResponseDelivery;
a=0;// 
a=0;// .field private final mNetwork:Lcom/android/volley/Network;
a=0;// 
a=0;// .field private final mQueue:Ljava/util/concurrent/BlockingQueue;
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
a=0;// .method public constructor <init>(Ljava/util/concurrent/BlockingQueue;Lcom/android/volley/Network;Lcom/android/volley/Cache;Lcom/android/volley/ResponseDelivery;)V
a=0;//     .locals 1
a=0;//     .param p2, "network"    # Lcom/android/volley/Network;
a=0;//     .param p3, "cache"    # Lcom/android/volley/Cache;
a=0;//     .param p4, "delivery"    # Lcom/android/volley/ResponseDelivery;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/concurrent/BlockingQueue",
a=0;//             "<",
a=0;//             "Lcom/android/volley/Request;",
a=0;//             ">;",
a=0;//             "Lcom/android/volley/Network;",
a=0;//             "Lcom/android/volley/Cache;",
a=0;//             "Lcom/android/volley/ResponseDelivery;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     .local p1, "queue":Ljava/util/concurrent/BlockingQueue;, "Ljava/util/concurrent/BlockingQueue<Lcom/android/volley/Request;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 44
a=0;//     #p0=(Reference,Lcom/android/volley/NetworkDispatcher;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/android/volley/NetworkDispatcher;->mQuit:Z
a=0;// 
a=0;//     .line 58
a=0;//     iput-object p1, p0, Lcom/android/volley/NetworkDispatcher;->mQueue:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     .line 59
a=0;//     iput-object p2, p0, Lcom/android/volley/NetworkDispatcher;->mNetwork:Lcom/android/volley/Network;
a=0;// 
a=0;//     .line 60
a=0;//     iput-object p3, p0, Lcom/android/volley/NetworkDispatcher;->mCache:Lcom/android/volley/Cache;
a=0;// 
a=0;//     .line 61
a=0;//     iput-object p4, p0, Lcom/android/volley/NetworkDispatcher;->mDelivery:Lcom/android/volley/ResponseDelivery;
a=0;// 
a=0;//     .line 62
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private parseAndDeliverNetworkError(Lcom/android/volley/Request;Lcom/android/volley/VolleyError;)V
a=0;//     .locals 1
a=0;//     .param p2, "error"    # Lcom/android/volley/VolleyError;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/android/volley/Request",
a=0;//             "<*>;",
a=0;//             "Lcom/android/volley/VolleyError;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 139
a=0;//     .local p1, "request":Lcom/android/volley/Request;, "Lcom/android/volley/Request<*>;"
a=0;//     invoke-virtual {p1, p2}, Lcom/android/volley/Request;->parseNetworkError(Lcom/android/volley/VolleyError;)Lcom/android/volley/VolleyError;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 140
a=0;//     iget-object v0, p0, Lcom/android/volley/NetworkDispatcher;->mDelivery:Lcom/android/volley/ResponseDelivery;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/ResponseDelivery;);
a=0;//     invoke-interface {v0, p1, p2}, Lcom/android/volley/ResponseDelivery;->postError(Lcom/android/volley/Request;Lcom/android/volley/VolleyError;)V
a=0;// 
a=0;//     .line 141
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public quit()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/android/volley/NetworkDispatcher;->mQuit:Z
a=0;// 
a=0;//     .line 70
a=0;//     invoke-virtual {p0}, Lcom/android/volley/NetworkDispatcher;->interrupt()V
a=0;// 
a=0;//     .line 71
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public run()V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     const/16 v5, 0xa
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-static {v5}, Landroid/os/Process;->setThreadPriority(I)V
a=0;// 
a=0;//     .line 80
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v5, p0, Lcom/android/volley/NetworkDispatcher;->mQueue:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/concurrent/BlockingQueue;);
a=0;//     invoke-interface {v5}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/android/volley/Request;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 90
a=0;//     .local v2, "request":Lcom/android/volley/Request;
a=0;//     :try_start_1
a=0;//     const-string v5, "network-queue-take"
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Lcom/android/volley/Request;->addMarker(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 94
a=0;//     invoke-virtual {v2}, Lcom/android/volley/Request;->isCanceled()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 95
a=0;//     const-string v5, "network-discard-cancelled"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5}, Lcom/android/volley/Request;->finish(Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Lcom/android/volley/VolleyError; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 129
a=0;//     :catch_0
a=0;//     #v5=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     .line 130
a=0;//     .local v4, "volleyError":Lcom/android/volley/VolleyError;
a=0;//     #v4=(Reference,Lcom/android/volley/VolleyError;);
a=0;//     invoke-direct {p0, v2, v4}, Lcom/android/volley/NetworkDispatcher;->parseAndDeliverNetworkError(Lcom/android/volley/Request;Lcom/android/volley/VolleyError;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 81
a=0;//     .end local v2    # "request":Lcom/android/volley/Request;
a=0;//     .end local v4    # "volleyError":Lcom/android/volley/VolleyError;
a=0;//     :catch_1
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 83
a=0;//     .local v0, "e":Ljava/lang/InterruptedException;
a=0;//     #v0=(Reference,Ljava/lang/InterruptedException;);
a=0;//     iget-boolean v5, p0, Lcom/android/volley/NetworkDispatcher;->mQuit:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 84
a=0;//     return-void
a=0;// 
a=0;//     .line 100
a=0;//     .end local v0    # "e":Ljava/lang/InterruptedException;
a=0;//     .restart local v2    # "request":Lcom/android/volley/Request;
a=0;//     :cond_1
a=0;//     :try_start_2
a=0;//     #v0=(Conflicted);v2=(Reference,Lcom/android/volley/Request;);
a=0;//     sget v5, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/16 v6, 0xe
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     if-lt v5, v6, :cond_2
a=0;// 
a=0;//     .line 101
a=0;//     invoke-virtual {v2}, Lcom/android/volley/Request;->getTrafficStatsTag()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     invoke-static {v5}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V
a=0;// 
a=0;//     .line 105
a=0;//     :cond_2
a=0;//     iget-object v5, p0, Lcom/android/volley/NetworkDispatcher;->mNetwork:Lcom/android/volley/Network;
a=0;// 
a=0;//     #v5=(Reference,Lcom/android/volley/Network;);
a=0;//     invoke-interface {v5, v2}, Lcom/android/volley/Network;->performRequest(Lcom/android/volley/Request;)Lcom/android/volley/NetworkResponse;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 106
a=0;//     .local v1, "networkResponse":Lcom/android/volley/NetworkResponse;
a=0;//     #v1=(Reference,Lcom/android/volley/NetworkResponse;);
a=0;//     const-string v5, "network-http-complete"
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Lcom/android/volley/Request;->addMarker(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 110
a=0;//     iget-boolean v5, v1, Lcom/android/volley/NetworkResponse;->notModified:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/android/volley/Request;->hasHadResponseDelivered()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     .line 111
a=0;//     const-string v5, "not-modified"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5}, Lcom/android/volley/Request;->finish(Ljava/lang/String;)V
a=0;//     :try_end_2
a=0;//     .catch Lcom/android/volley/VolleyError; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 131
a=0;//     .end local v1    # "networkResponse":Lcom/android/volley/NetworkResponse;
a=0;//     :catch_2
a=0;//     #v1=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 132
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v5, "Unhandled exception %s"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     new-array v6, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     aput-object v8, v6, v7
a=0;// 
a=0;//     invoke-static {v0, v5, v6}, Lcom/android/volley/VolleyLog;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 133
a=0;//     iget-object v5, p0, Lcom/android/volley/NetworkDispatcher;->mDelivery:Lcom/android/volley/ResponseDelivery;
a=0;// 
a=0;//     new-instance v6, Lcom/android/volley/VolleyError;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/android/volley/VolleyError;);
a=0;//     invoke-direct {v6, v0}, Lcom/android/volley/VolleyError;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v6=(Reference,Lcom/android/volley/VolleyError;);
a=0;//     invoke-interface {v5, v2, v6}, Lcom/android/volley/ResponseDelivery;->postError(Lcom/android/volley/Request;Lcom/android/volley/VolleyError;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 116
a=0;//     .end local v0    # "e":Ljava/lang/Exception;
a=0;//     .restart local v1    # "networkResponse":Lcom/android/volley/NetworkResponse;
a=0;//     :cond_3
a=0;//     :try_start_3
a=0;//     #v0=(Conflicted);v1=(Reference,Lcom/android/volley/NetworkResponse;);v5=(Boolean);v6=(PosByte);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-virtual {v2, v1}, Lcom/android/volley/Request;->parseNetworkResponse(Lcom/android/volley/NetworkResponse;)Lcom/android/volley/Response;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 117
a=0;//     .local v3, "response":Lcom/android/volley/Response;, "Lcom/android/volley/Response<*>;"
a=0;//     #v3=(Reference,Lcom/android/volley/Response;);
a=0;//     const-string v5, "network-parse-complete"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5}, Lcom/android/volley/Request;->addMarker(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 121
a=0;//     invoke-virtual {v2}, Lcom/android/volley/Request;->shouldCache()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_4
a=0;// 
a=0;//     iget-object v5, v3, Lcom/android/volley/Response;->cacheEntry:Lcom/android/volley/Cache$Entry;
a=0;// 
a=0;//     #v5=(Reference,Lcom/android/volley/Cache$Entry;);
a=0;//     if-eqz v5, :cond_4
a=0;// 
a=0;//     .line 122
a=0;//     iget-object v5, p0, Lcom/android/volley/NetworkDispatcher;->mCache:Lcom/android/volley/Cache;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/android/volley/Request;->getCacheKey()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     iget-object v7, v3, Lcom/android/volley/Response;->cacheEntry:Lcom/android/volley/Cache$Entry;
a=0;// 
a=0;//     #v7=(Reference,Lcom/android/volley/Cache$Entry;);
a=0;//     invoke-interface {v5, v6, v7}, Lcom/android/volley/Cache;->put(Ljava/lang/String;Lcom/android/volley/Cache$Entry;)V
a=0;// 
a=0;//     .line 123
a=0;//     const-string v5, "network-cache-written"
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Lcom/android/volley/Request;->addMarker(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 127
a=0;//     :cond_4
a=0;//     #v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v2}, Lcom/android/volley/Request;->markDelivered()V
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v5, p0, Lcom/android/volley/NetworkDispatcher;->mDelivery:Lcom/android/volley/ResponseDelivery;
a=0;// 
a=0;//     #v5=(Reference,Lcom/android/volley/ResponseDelivery;);
a=0;//     invoke-interface {v5, v2, v3}, Lcom/android/volley/ResponseDelivery;->postResponse(Lcom/android/volley/Request;Lcom/android/volley/Response;)V
a=0;//     :try_end_3
a=0;//     .catch Lcom/android/volley/VolleyError; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
