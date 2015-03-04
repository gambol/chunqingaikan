package com.android.volley.toolbox; class ImageLoader$4 { void a() { int a;
a=0;// .class Lcom/android/volley/toolbox/ImageLoader$4;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ImageLoader.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/android/volley/toolbox/ImageLoader;->batchResponse(Ljava/lang/String;Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/android/volley/toolbox/ImageLoader;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/android/volley/toolbox/ImageLoader;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/android/volley/toolbox/ImageLoader$4;->this$0:Lcom/android/volley/toolbox/ImageLoader;
a=0;// 
a=0;//     .line 471
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/android/volley/toolbox/ImageLoader$4;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 474
a=0;//     iget-object v2, p0, Lcom/android/volley/toolbox/ImageLoader$4;->this$0:Lcom/android/volley/toolbox/ImageLoader;
a=0;// 
a=0;//     #v2=(Reference,Lcom/android/volley/toolbox/ImageLoader;);
a=0;//     invoke-static {v2}, Lcom/android/volley/toolbox/ImageLoader;->access$1(Lcom/android/volley/toolbox/ImageLoader;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 490
a=0;//     iget-object v2, p0, Lcom/android/volley/toolbox/ImageLoader$4;->this$0:Lcom/android/volley/toolbox/ImageLoader;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/android/volley/toolbox/ImageLoader;->access$1(Lcom/android/volley/toolbox/ImageLoader;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/HashMap;->clear()V
a=0;// 
a=0;//     .line 491
a=0;//     iget-object v2, p0, Lcom/android/volley/toolbox/ImageLoader$4;->this$0:Lcom/android/volley/toolbox/ImageLoader;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v2, v3}, Lcom/android/volley/toolbox/ImageLoader;->access$4(Lcom/android/volley/toolbox/ImageLoader;Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 492
a=0;//     return-void
a=0;// 
a=0;//     .line 474
a=0;//     :cond_1
a=0;//     #v3=(Boolean);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;
a=0;// 
a=0;//     .line 475
a=0;//     .local v0, "bir":Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;
a=0;//     invoke-static {v0}, Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;->access$0(Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;)Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/LinkedList;);
a=0;//     invoke-virtual {v3}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/android/volley/toolbox/ImageLoader$ImageContainer;
a=0;// 
a=0;//     .line 479
a=0;//     .local v1, "container":Lcom/android/volley/toolbox/ImageLoader$ImageContainer;
a=0;//     invoke-static {v1}, Lcom/android/volley/toolbox/ImageLoader$ImageContainer;->access$0(Lcom/android/volley/toolbox/ImageLoader$ImageContainer;)Lcom/android/volley/toolbox/ImageLoader$ImageListener;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/android/volley/toolbox/ImageLoader$ImageListener;);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 482
a=0;//     invoke-virtual {v0}, Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;->getError()Lcom/android/volley/VolleyError;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     .line 483
a=0;//     invoke-static {v0}, Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;->access$2(Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v1, v4}, Lcom/android/volley/toolbox/ImageLoader$ImageContainer;->access$1(Lcom/android/volley/toolbox/ImageLoader$ImageContainer;Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 484
a=0;//     invoke-static {v1}, Lcom/android/volley/toolbox/ImageLoader$ImageContainer;->access$0(Lcom/android/volley/toolbox/ImageLoader$ImageContainer;)Lcom/android/volley/toolbox/ImageLoader$ImageListener;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-interface {v4, v1, v5}, Lcom/android/volley/toolbox/ImageLoader$ImageListener;->onResponse(Lcom/android/volley/toolbox/ImageLoader$ImageContainer;Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 486
a=0;//     :cond_3
a=0;//     #v5=(Conflicted);
a=0;//     invoke-static {v1}, Lcom/android/volley/toolbox/ImageLoader$ImageContainer;->access$0(Lcom/android/volley/toolbox/ImageLoader$ImageContainer;)Lcom/android/volley/toolbox/ImageLoader$ImageListener;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;->getError()Lcom/android/volley/VolleyError;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lcom/android/volley/VolleyError;);
a=0;//     invoke-interface {v4, v5}, Lcom/android/volley/toolbox/ImageLoader$ImageListener;->onErrorResponse(Lcom/android/volley/VolleyError;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
