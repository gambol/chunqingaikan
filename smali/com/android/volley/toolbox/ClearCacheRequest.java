package com.android.volley.toolbox; class ClearCacheRequest { void a() { int a;
a=0;// .class public Lcom/android/volley/toolbox/ClearCacheRequest;
a=0;// .super Lcom/android/volley/Request;
a=0;// .source "ClearCacheRequest.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/android/volley/Request",
a=0;//         "<",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mCache:Lcom/android/volley/Cache;
a=0;// 
a=0;// .field private final mCallback:Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/android/volley/Cache;Ljava/lang/Runnable;)V
a=0;//     .locals 2
a=0;//     .param p1, "cache"    # Lcom/android/volley/Cache;
a=0;//     .param p2, "callback"    # Ljava/lang/Runnable;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 41
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0, v1, v1}, Lcom/android/volley/Request;-><init>(ILjava/lang/String;Lcom/android/volley/Response$ErrorListener;)V
a=0;// 
a=0;//     .line 42
a=0;//     #p0=(Reference,Lcom/android/volley/toolbox/ClearCacheRequest;);
a=0;//     iput-object p1, p0, Lcom/android/volley/toolbox/ClearCacheRequest;->mCache:Lcom/android/volley/Cache;
a=0;// 
a=0;//     .line 43
a=0;//     iput-object p2, p0, Lcom/android/volley/toolbox/ClearCacheRequest;->mCallback:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 44
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected deliverResponse(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;//     .param p1, "response"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getPriority()Lcom/android/volley/Request$Priority;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     sget-object v0, Lcom/android/volley/Request$Priority;->IMMEDIATE:Lcom/android/volley/Request$Priority;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/Request$Priority;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public isCanceled()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     iget-object v1, p0, Lcom/android/volley/toolbox/ClearCacheRequest;->mCache:Lcom/android/volley/Cache;
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/volley/Cache;);
a=0;//     invoke-interface {v1}, Lcom/android/volley/Cache;->clear()V
a=0;// 
a=0;//     .line 50
a=0;//     iget-object v1, p0, Lcom/android/volley/toolbox/ClearCacheRequest;->mCallback:Ljava/lang/Runnable;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 51
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
a=0;// 
a=0;//     .line 52
a=0;//     .local v0, "handler":Landroid/os/Handler;
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iget-object v1, p0, Lcom/android/volley/toolbox/ClearCacheRequest;->mCallback:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 54
a=0;//     .end local v0    # "handler":Landroid/os/Handler;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method protected parseNetworkResponse(Lcom/android/volley/NetworkResponse;)Lcom/android/volley/Response;
a=0;//     .locals 1
a=0;//     .param p1, "response"    # Lcom/android/volley/NetworkResponse;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/android/volley/NetworkResponse;",
a=0;//             ")",
a=0;//             "Lcom/android/volley/Response",
a=0;//             "<",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
}}
