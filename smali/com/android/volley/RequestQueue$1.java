package com.android.volley; class RequestQueue$1 { void a() { int a;
a=0;// .class Lcom/android/volley/RequestQueue$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "RequestQueue.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/android/volley/RequestQueue$RequestFilter;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/android/volley/RequestQueue;->cancelAll(Ljava/lang/Object;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/android/volley/RequestQueue;
a=0;// 
a=0;// .field private final synthetic val$tag:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/android/volley/RequestQueue;Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/android/volley/RequestQueue$1;->this$0:Lcom/android/volley/RequestQueue;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/android/volley/RequestQueue$1;->val$tag:Ljava/lang/Object;
a=0;// 
a=0;//     .line 204
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/android/volley/RequestQueue$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public apply(Lcom/android/volley/Request;)Z
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/android/volley/Request",
a=0;//             "<*>;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 207
a=0;//     .local p1, "request":Lcom/android/volley/Request;, "Lcom/android/volley/Request<*>;"
a=0;//     invoke-virtual {p1}, Lcom/android/volley/Request;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v1, p0, Lcom/android/volley/RequestQueue$1;->val$tag:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
