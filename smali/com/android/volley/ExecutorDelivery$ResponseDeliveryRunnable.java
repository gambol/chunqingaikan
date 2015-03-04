package com.android.volley; class ExecutorDelivery$ResponseDeliveryRunnable { void a() { int a;
a=0;// .class Lcom/android/volley/ExecutorDelivery$ResponseDeliveryRunnable;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ExecutorDelivery.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/android/volley/ExecutorDelivery;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "ResponseDeliveryRunnable"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mRequest:Lcom/android/volley/Request;
a=0;// 
a=0;// .field private final mResponse:Lcom/android/volley/Response;
a=0;// 
a=0;// .field private final mRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;// .field final synthetic this$0:Lcom/android/volley/ExecutorDelivery;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/android/volley/ExecutorDelivery;Lcom/android/volley/Request;Lcom/android/volley/Response;Ljava/lang/Runnable;)V
a=0;//     .locals 0
a=0;//     .param p2, "request"    # Lcom/android/volley/Request;
a=0;//     .param p3, "response"    # Lcom/android/volley/Response;
a=0;//     .param p4, "runnable"    # Ljava/lang/Runnable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     iput-object p1, p0, Lcom/android/volley/ExecutorDelivery$ResponseDeliveryRunnable;->this$0:Lcom/android/volley/ExecutorDelivery;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 83
a=0;//     #p0=(Reference,Lcom/android/volley/ExecutorDelivery$ResponseDeliveryRunnable;);
a=0;//     iput-object p2, p0, Lcom/android/volley/ExecutorDelivery$ResponseDeliveryRunnable;->mRequest:Lcom/android/volley/Request;
a=0;// 
a=0;//     .line 84
a=0;//     iput-object p3, p0, Lcom/android/volley/ExecutorDelivery$ResponseDeliveryRunnable;->mResponse:Lcom/android/volley/Response;
a=0;// 
a=0;//     .line 85
a=0;//     iput-object p4, p0, Lcom/android/volley/ExecutorDelivery$ResponseDeliveryRunnable;->mRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 86
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     iget-object v0, p0, Lcom/android/volley/ExecutorDelivery$ResponseDeliveryRunnable;->mRequest:Lcom/android/volley/Request;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/Request;);
a=0;//     invoke-virtual {v0}, Lcom/android/volley/Request;->isCanceled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 93
a=0;//     iget-object v0, p0, Lcom/android/volley/ExecutorDelivery$ResponseDeliveryRunnable;->mRequest:Lcom/android/volley/Request;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/Request;);
a=0;//     const-string v1, "canceled-at-delivery"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/android/volley/Request;->finish(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 116
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 98
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/android/volley/ExecutorDelivery$ResponseDeliveryRunnable;->mResponse:Lcom/android/volley/Response;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/Response;);
a=0;//     invoke-virtual {v0}, Lcom/android/volley/Response;->isSuccess()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 99
a=0;//     iget-object v0, p0, Lcom/android/volley/ExecutorDelivery$ResponseDeliveryRunnable;->mRequest:Lcom/android/volley/Request;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/Request;);
a=0;//     iget-object v1, p0, Lcom/android/volley/ExecutorDelivery$ResponseDeliveryRunnable;->mResponse:Lcom/android/volley/Response;
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/volley/Response;);
a=0;//     iget-object v1, v1, Lcom/android/volley/Response;->result:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/android/volley/Request;->deliverResponse(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 106
a=0;//     :goto_1
a=0;//     iget-object v0, p0, Lcom/android/volley/ExecutorDelivery$ResponseDeliveryRunnable;->mResponse:Lcom/android/volley/Response;
a=0;// 
a=0;//     iget-boolean v0, v0, Lcom/android/volley/Response;->intermediate:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 107
a=0;//     iget-object v0, p0, Lcom/android/volley/ExecutorDelivery$ResponseDeliveryRunnable;->mRequest:Lcom/android/volley/Request;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/Request;);
a=0;//     const-string v1, "intermediate-response"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/android/volley/Request;->addMarker(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 113
a=0;//     :goto_2
a=0;//     iget-object v0, p0, Lcom/android/volley/ExecutorDelivery$ResponseDeliveryRunnable;->mRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v0, p0, Lcom/android/volley/ExecutorDelivery$ResponseDeliveryRunnable;->mRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/lang/Runnable;->run()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 101
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/android/volley/ExecutorDelivery$ResponseDeliveryRunnable;->mRequest:Lcom/android/volley/Request;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/Request;);
a=0;//     iget-object v1, p0, Lcom/android/volley/ExecutorDelivery$ResponseDeliveryRunnable;->mResponse:Lcom/android/volley/Response;
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/volley/Response;);
a=0;//     iget-object v1, v1, Lcom/android/volley/Response;->error:Lcom/android/volley/VolleyError;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/android/volley/Request;->deliverError(Lcom/android/volley/VolleyError;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 109
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/android/volley/ExecutorDelivery$ResponseDeliveryRunnable;->mRequest:Lcom/android/volley/Request;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/Request;);
a=0;//     const-string v1, "done"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/android/volley/Request;->finish(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
}}
