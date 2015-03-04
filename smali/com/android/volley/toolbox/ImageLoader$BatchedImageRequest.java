package com.android.volley.toolbox; class ImageLoader$BatchedImageRequest { void a() { int a;
a=0;// .class Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ImageLoader.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/android/volley/toolbox/ImageLoader;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "BatchedImageRequest"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mContainers:Ljava/util/LinkedList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/LinkedList",
a=0;//             "<",
a=0;//             "Lcom/android/volley/toolbox/ImageLoader$ImageContainer;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mError:Lcom/android/volley/VolleyError;
a=0;// 
a=0;// .field private final mRequest:Lcom/android/volley/Request;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/android/volley/Request",
a=0;//             "<*>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mResponseBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;// .field final synthetic this$0:Lcom/android/volley/toolbox/ImageLoader;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/android/volley/toolbox/ImageLoader;Lcom/android/volley/Request;Lcom/android/volley/toolbox/ImageLoader$ImageContainer;)V
a=0;//     .locals 1
a=0;//     .param p3, "container"    # Lcom/android/volley/toolbox/ImageLoader$ImageContainer;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/android/volley/Request",
a=0;//             "<*>;",
a=0;//             "Lcom/android/volley/toolbox/ImageLoader$ImageContainer;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 411
a=0;//     .local p2, "request":Lcom/android/volley/Request;, "Lcom/android/volley/Request<*>;"
a=0;//     iput-object p1, p0, Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;->this$0:Lcom/android/volley/toolbox/ImageLoader;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 401
a=0;//     #p0=(Reference,Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;);
a=0;//     new-instance v0, Ljava/util/LinkedList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/LinkedList;);
a=0;//     invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     iput-object v0, p0, Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;->mContainers:Ljava/util/LinkedList;
a=0;// 
a=0;//     .line 412
a=0;//     iput-object p2, p0, Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;->mRequest:Lcom/android/volley/Request;
a=0;// 
a=0;//     .line 413
a=0;//     iget-object v0, p0, Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;->mContainers:Ljava/util/LinkedList;
a=0;// 
a=0;//     invoke-virtual {v0, p3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 414
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;)Ljava/util/LinkedList;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 401
a=0;//     iget-object v0, p0, Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;->mContainers:Ljava/util/LinkedList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;Landroid/graphics/Bitmap;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 395
a=0;//     iput-object p1, p0, Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;->mResponseBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;)Landroid/graphics/Bitmap;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 395
a=0;//     iget-object v0, p0, Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;->mResponseBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addContainer(Lcom/android/volley/toolbox/ImageLoader$ImageContainer;)V
a=0;//     .locals 1
a=0;//     .param p1, "container"    # Lcom/android/volley/toolbox/ImageLoader$ImageContainer;
a=0;// 
a=0;//     .prologue
a=0;//     .line 435
a=0;//     iget-object v0, p0, Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;->mContainers:Ljava/util/LinkedList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 436
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getError()Lcom/android/volley/VolleyError;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 427
a=0;//     iget-object v0, p0, Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;->mError:Lcom/android/volley/VolleyError;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/VolleyError;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public removeContainerAndCancelIfNecessary(Lcom/android/volley/toolbox/ImageLoader$ImageContainer;)Z
a=0;//     .locals 1
a=0;//     .param p1, "container"    # Lcom/android/volley/toolbox/ImageLoader$ImageContainer;
a=0;// 
a=0;//     .prologue
a=0;//     .line 447
a=0;//     iget-object v0, p0, Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;->mContainers:Ljava/util/LinkedList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 448
a=0;//     iget-object v0, p0, Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;->mContainers:Ljava/util/LinkedList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/LinkedList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 449
a=0;//     iget-object v0, p0, Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;->mRequest:Lcom/android/volley/Request;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/Request;);
a=0;//     invoke-virtual {v0}, Lcom/android/volley/Request;->cancel()V
a=0;// 
a=0;//     .line 450
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 452
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setError(Lcom/android/volley/VolleyError;)V
a=0;//     .locals 0
a=0;//     .param p1, "error"    # Lcom/android/volley/VolleyError;
a=0;// 
a=0;//     .prologue
a=0;//     .line 420
a=0;//     iput-object p1, p0, Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;->mError:Lcom/android/volley/VolleyError;
a=0;// 
a=0;//     .line 421
a=0;//     return-void
a=0;// .end method
}}
