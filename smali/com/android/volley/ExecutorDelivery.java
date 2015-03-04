package com.android.volley; class ExecutorDelivery { void a() { int a;
a=0;// .class public Lcom/android/volley/ExecutorDelivery;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ExecutorDelivery.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/android/volley/ResponseDelivery;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/android/volley/ExecutorDelivery$ResponseDeliveryRunnable;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mResponsePoster:Ljava/util/concurrent/Executor;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/os/Handler;)V
a=0;//     .locals 1
a=0;//     .param p1, "handler"    # Landroid/os/Handler;
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Lcom/android/volley/ExecutorDelivery;);
a=0;//     new-instance v0, Lcom/android/volley/ExecutorDelivery$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/volley/ExecutorDelivery$1;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/android/volley/ExecutorDelivery$1;-><init>(Lcom/android/volley/ExecutorDelivery;Landroid/os/Handler;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/ExecutorDelivery$1;);
a=0;//     iput-object v0, p0, Lcom/android/volley/ExecutorDelivery;->mResponsePoster:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     .line 42
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/util/concurrent/Executor;)V
a=0;//     .locals 0
a=0;//     .param p1, "executor"    # Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 50
a=0;//     #p0=(Reference,Lcom/android/volley/ExecutorDelivery;);
a=0;//     iput-object p1, p0, Lcom/android/volley/ExecutorDelivery;->mResponsePoster:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     .line 51
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public postError(Lcom/android/volley/Request;Lcom/android/volley/VolleyError;)V
a=0;//     .locals 4
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
a=0;//     .line 67
a=0;//     .local p1, "request":Lcom/android/volley/Request;, "Lcom/android/volley/Request<*>;"
a=0;//     const-string v1, "post-error"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v1}, Lcom/android/volley/Request;->addMarker(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 68
a=0;//     invoke-static {p2}, Lcom/android/volley/Response;->error(Lcom/android/volley/VolleyError;)Lcom/android/volley/Response;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 69
a=0;//     .local v0, "response":Lcom/android/volley/Response;, "Lcom/android/volley/Response<*>;"
a=0;//     #v0=(Reference,Lcom/android/volley/Response;);
a=0;//     iget-object v1, p0, Lcom/android/volley/ExecutorDelivery;->mResponsePoster:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     new-instance v2, Lcom/android/volley/ExecutorDelivery$ResponseDeliveryRunnable;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/android/volley/ExecutorDelivery$ResponseDeliveryRunnable;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-direct {v2, p0, p1, v0, v3}, Lcom/android/volley/ExecutorDelivery$ResponseDeliveryRunnable;-><init>(Lcom/android/volley/ExecutorDelivery;Lcom/android/volley/Request;Lcom/android/volley/Response;Ljava/lang/Runnable;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/android/volley/ExecutorDelivery$ResponseDeliveryRunnable;);
a=0;//     invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 70
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public postResponse(Lcom/android/volley/Request;Lcom/android/volley/Response;)V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/android/volley/Request",
a=0;//             "<*>;",
a=0;//             "Lcom/android/volley/Response",
a=0;//             "<*>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     .local p1, "request":Lcom/android/volley/Request;, "Lcom/android/volley/Request<*>;"
a=0;//     .local p2, "response":Lcom/android/volley/Response;, "Lcom/android/volley/Response<*>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, p2, v0}, Lcom/android/volley/ExecutorDelivery;->postResponse(Lcom/android/volley/Request;Lcom/android/volley/Response;Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 56
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public postResponse(Lcom/android/volley/Request;Lcom/android/volley/Response;Ljava/lang/Runnable;)V
a=0;//     .locals 2
a=0;//     .param p3, "runnable"    # Ljava/lang/Runnable;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/android/volley/Request",
a=0;//             "<*>;",
a=0;//             "Lcom/android/volley/Response",
a=0;//             "<*>;",
a=0;//             "Ljava/lang/Runnable;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     .local p1, "request":Lcom/android/volley/Request;, "Lcom/android/volley/Request<*>;"
a=0;//     .local p2, "response":Lcom/android/volley/Response;, "Lcom/android/volley/Response<*>;"
a=0;//     invoke-virtual {p1}, Lcom/android/volley/Request;->markDelivered()V
a=0;// 
a=0;//     .line 61
a=0;//     const-string v0, "post-response"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lcom/android/volley/Request;->addMarker(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 62
a=0;//     iget-object v0, p0, Lcom/android/volley/ExecutorDelivery;->mResponsePoster:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     new-instance v1, Lcom/android/volley/ExecutorDelivery$ResponseDeliveryRunnable;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/android/volley/ExecutorDelivery$ResponseDeliveryRunnable;);
a=0;//     invoke-direct {v1, p0, p1, p2, p3}, Lcom/android/volley/ExecutorDelivery$ResponseDeliveryRunnable;-><init>(Lcom/android/volley/ExecutorDelivery;Lcom/android/volley/Request;Lcom/android/volley/Response;Ljava/lang/Runnable;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/volley/ExecutorDelivery$ResponseDeliveryRunnable;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 63
a=0;//     return-void
a=0;// .end method
}}
