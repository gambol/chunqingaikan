package com.android.volley.toolbox; class ImageLoader { void a() { int a;
a=0;// .class public Lcom/android/volley/toolbox/ImageLoader;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ImageLoader.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;,
a=0;//         Lcom/android/volley/toolbox/ImageLoader$ImageCache;,
a=0;//         Lcom/android/volley/toolbox/ImageLoader$ImageContainer;,
a=0;//         Lcom/android/volley/toolbox/ImageLoader$ImageListener;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mBatchResponseDelayMs:I
a=0;// 
a=0;// .field private final mBatchedResponses:Ljava/util/HashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final mCache:Lcom/android/volley/toolbox/ImageLoader$ImageCache;
a=0;// 
a=0;// .field private final mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private final mInFlightRequests:Ljava/util/HashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final mRequestQueue:Lcom/android/volley/RequestQueue;
a=0;// 
a=0;// .field private mRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/android/volley/RequestQueue;Lcom/android/volley/toolbox/ImageLoader$ImageCache;)V
a=0;//     .locals 2
a=0;//     .param p1, "queue"    # Lcom/android/volley/RequestQueue;
a=0;//     .param p2, "imageCache"    # Lcom/android/volley/toolbox/ImageLoader$ImageCache;
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 46
a=0;//     #p0=(Reference,Lcom/android/volley/toolbox/ImageLoader;);
a=0;//     const/16 v0, 0x64
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/android/volley/toolbox/ImageLoader;->mBatchResponseDelayMs:I
a=0;// 
a=0;//     .line 55
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/android/volley/toolbox/ImageLoader;->mInFlightRequests:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 58
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/android/volley/toolbox/ImageLoader;->mBatchedResponses:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 61
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Looper;);
a=0;//     invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v0, p0, Lcom/android/volley/toolbox/ImageLoader;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 86
a=0;//     iput-object p1, p0, Lcom/android/volley/toolbox/ImageLoader;->mRequestQueue:Lcom/android/volley/RequestQueue;
a=0;// 
a=0;//     .line 87
a=0;//     iput-object p2, p0, Lcom/android/volley/toolbox/ImageLoader;->mCache:Lcom/android/volley/toolbox/ImageLoader$ImageCache;
a=0;// 
a=0;//     .line 88
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/android/volley/toolbox/ImageLoader;)Ljava/util/HashMap;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     iget-object v0, p0, Lcom/android/volley/toolbox/ImageLoader;->mInFlightRequests:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/android/volley/toolbox/ImageLoader;)Ljava/util/HashMap;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     iget-object v0, p0, Lcom/android/volley/toolbox/ImageLoader;->mBatchedResponses:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/android/volley/toolbox/ImageLoader;Ljava/lang/String;Landroid/graphics/Bitmap;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 274
a=0;//     invoke-direct {p0, p1, p2}, Lcom/android/volley/toolbox/ImageLoader;->onGetImageSuccess(Ljava/lang/String;Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/android/volley/toolbox/ImageLoader;Ljava/lang/String;Lcom/android/volley/VolleyError;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 296
a=0;//     invoke-direct {p0, p1, p2}, Lcom/android/volley/toolbox/ImageLoader;->onGetImageError(Ljava/lang/String;Lcom/android/volley/VolleyError;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/android/volley/toolbox/ImageLoader;Ljava/lang/Runnable;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     iput-object p1, p0, Lcom/android/volley/toolbox/ImageLoader;->mRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private batchResponse(Ljava/lang/String;Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;)V
a=0;//     .locals 4
a=0;//     .param p1, "cacheKey"    # Ljava/lang/String;
a=0;//     .param p2, "request"    # Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;
a=0;// 
a=0;//     .prologue
a=0;//     .line 467
a=0;//     iget-object v0, p0, Lcom/android/volley/toolbox/ImageLoader;->mBatchedResponses:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 470
a=0;//     iget-object v0, p0, Lcom/android/volley/toolbox/ImageLoader;->mRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 471
a=0;//     new-instance v0, Lcom/android/volley/toolbox/ImageLoader$4;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/volley/toolbox/ImageLoader$4;);
a=0;//     invoke-direct {v0, p0}, Lcom/android/volley/toolbox/ImageLoader$4;-><init>(Lcom/android/volley/toolbox/ImageLoader;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/toolbox/ImageLoader$4;);
a=0;//     iput-object v0, p0, Lcom/android/volley/toolbox/ImageLoader;->mRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 496
a=0;//     iget-object v0, p0, Lcom/android/volley/toolbox/ImageLoader;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/android/volley/toolbox/ImageLoader;->mRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Runnable;);
a=0;//     iget v2, p0, Lcom/android/volley/toolbox/ImageLoader;->mBatchResponseDelayMs:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-long v2, v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     .line 498
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static getCacheKey(Ljava/lang/String;II)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p0, "url"    # Ljava/lang/String;
a=0;//     .param p1, "maxWidth"    # I
a=0;//     .param p2, "maxHeight"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 517
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, 0xc
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "#W"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "#H"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getImageListener(Landroid/widget/ImageView;IIZ)Lcom/android/volley/toolbox/ImageLoader$ImageListener;
a=0;//     .locals 1
a=0;//     .param p0, "view"    # Landroid/widget/ImageView;
a=0;//     .param p1, "defaultImageResId"    # I
a=0;//     .param p2, "errorImageResId"    # I
a=0;//     .param p3, "isDownCover"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     new-instance v0, Lcom/android/volley/toolbox/ImageLoader$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/volley/toolbox/ImageLoader$1;);
a=0;//     invoke-direct {v0, p2, p0, p1}, Lcom/android/volley/toolbox/ImageLoader$1;-><init>(ILandroid/widget/ImageView;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/toolbox/ImageLoader$1;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private onGetImageError(Ljava/lang/String;Lcom/android/volley/VolleyError;)V
a=0;//     .locals 2
a=0;//     .param p1, "cacheKey"    # Ljava/lang/String;
a=0;//     .param p2, "error"    # Lcom/android/volley/VolleyError;
a=0;// 
a=0;//     .prologue
a=0;//     .line 299
a=0;//     iget-object v1, p0, Lcom/android/volley/toolbox/ImageLoader;->mInFlightRequests:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;
a=0;// 
a=0;//     .line 302
a=0;//     .local v0, "request":Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;
a=0;//     invoke-virtual {v0, p2}, Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;->setError(Lcom/android/volley/VolleyError;)V
a=0;// 
a=0;//     .line 304
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 306
a=0;//     invoke-direct {p0, p1, v0}, Lcom/android/volley/toolbox/ImageLoader;->batchResponse(Ljava/lang/String;Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;)V
a=0;// 
a=0;//     .line 308
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private onGetImageSuccess(Ljava/lang/String;Landroid/graphics/Bitmap;)V
a=0;//     .locals 2
a=0;//     .param p1, "cacheKey"    # Ljava/lang/String;
a=0;//     .param p2, "response"    # Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .prologue
a=0;//     .line 276
a=0;//     iget-object v1, p0, Lcom/android/volley/toolbox/ImageLoader;->mCache:Lcom/android/volley/toolbox/ImageLoader$ImageCache;
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/volley/toolbox/ImageLoader$ImageCache;);
a=0;//     invoke-interface {v1, p1, p2}, Lcom/android/volley/toolbox/ImageLoader$ImageCache;->putBitmap(Ljava/lang/String;Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 279
a=0;//     iget-object v1, p0, Lcom/android/volley/toolbox/ImageLoader;->mInFlightRequests:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;
a=0;// 
a=0;//     .line 281
a=0;//     .local v0, "request":Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 283
a=0;//     invoke-static {v0, p2}, Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;->access$1(Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 286
a=0;//     invoke-direct {p0, p1, v0}, Lcom/android/volley/toolbox/ImageLoader;->batchResponse(Ljava/lang/String;Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;)V
a=0;// 
a=0;//     .line 288
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private throwIfNotOnMainThread()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 501
a=0;//     invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Looper;);
a=0;//     invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Looper;);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 502
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "ImageLoader must be invoked from the main thread."
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 504
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public get(Ljava/lang/String;Lcom/android/volley/toolbox/ImageLoader$ImageListener;)Lcom/android/volley/toolbox/ImageLoader$ImageContainer;
a=0;//     .locals 1
a=0;//     .param p1, "requestUrl"    # Ljava/lang/String;
a=0;//     .param p2, "listener"    # Lcom/android/volley/toolbox/ImageLoader$ImageListener;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 187
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, p2, v0, v0}, Lcom/android/volley/toolbox/ImageLoader;->get(Ljava/lang/String;Lcom/android/volley/toolbox/ImageLoader$ImageListener;II)Lcom/android/volley/toolbox/ImageLoader$ImageContainer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/toolbox/ImageLoader$ImageContainer;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public get(Ljava/lang/String;Lcom/android/volley/toolbox/ImageLoader$ImageListener;II)Lcom/android/volley/toolbox/ImageLoader$ImageContainer;
a=0;//     .locals 19
a=0;//     .param p1, "requestUrl"    # Ljava/lang/String;
a=0;//     .param p2, "imageListener"    # Lcom/android/volley/toolbox/ImageLoader$ImageListener;
a=0;//     .param p3, "maxWidth"    # I
a=0;//     .param p4, "maxHeight"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 209
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/android/volley/toolbox/ImageLoader;->throwIfNotOnMainThread()V
a=0;// 
a=0;//     .line 211
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move/from16 v1, p3
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, p4
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0, v1, v2}, Lcom/android/volley/toolbox/ImageLoader;->getCacheKey(Ljava/lang/String;II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 214
a=0;//     .local v10, "cacheKey":Ljava/lang/String;
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/android/volley/toolbox/ImageLoader;->mCache:Lcom/android/volley/toolbox/ImageLoader$ImageCache;
a=0;// 
a=0;//     #v4=(Reference,Lcom/android/volley/toolbox/ImageLoader$ImageCache;);
a=0;//     invoke-interface {v4, v10}, Lcom/android/volley/toolbox/ImageLoader$ImageCache;->getBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 215
a=0;//     .local v5, "cachedBitmap":Landroid/graphics/Bitmap;
a=0;//     #v5=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 217
a=0;//     new-instance v3, Lcom/android/volley/toolbox/ImageLoader$ImageContainer;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/android/volley/toolbox/ImageLoader$ImageContainer;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     move-object/from16 v4, p0
a=0;// 
a=0;//     move-object/from16 v6, p1
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v3 .. v8}, Lcom/android/volley/toolbox/ImageLoader$ImageContainer;-><init>(Lcom/android/volley/toolbox/ImageLoader;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Lcom/android/volley/toolbox/ImageLoader$ImageListener;)V
a=0;// 
a=0;//     .line 218
a=0;//     .local v3, "container":Lcom/android/volley/toolbox/ImageLoader$ImageContainer;
a=0;//     #v3=(Reference,Lcom/android/volley/toolbox/ImageLoader$ImageContainer;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-interface {v0, v3, v4}, Lcom/android/volley/toolbox/ImageLoader$ImageListener;->onResponse(Lcom/android/volley/toolbox/ImageLoader$ImageContainer;Z)V
a=0;// 
a=0;//     move-object v6, v3
a=0;// 
a=0;//     .line 252
a=0;//     .end local v3    # "container":Lcom/android/volley/toolbox/ImageLoader$ImageContainer;
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v7=(Reference,Ujava/lang/Object;);v9=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);
a=0;//     return-object v6
a=0;// 
a=0;//     .line 223
a=0;//     :cond_0
a=0;//     #v1=(Integer);v3=(Uninit);v4=(Reference,Lcom/android/volley/toolbox/ImageLoader$ImageCache;);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);
a=0;//     new-instance v6, Lcom/android/volley/toolbox/ImageLoader$ImageContainer;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/android/volley/toolbox/ImageLoader$ImageContainer;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     move-object/from16 v7, p0
a=0;// 
a=0;//     #v7=(Reference,Lcom/android/volley/toolbox/ImageLoader;);
a=0;//     move-object/from16 v9, p1
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v11, p2
a=0;// 
a=0;//     #v11=(Reference,Lcom/android/volley/toolbox/ImageLoader$ImageListener;);
a=0;//     invoke-direct/range {v6 .. v11}, Lcom/android/volley/toolbox/ImageLoader$ImageContainer;-><init>(Lcom/android/volley/toolbox/ImageLoader;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Lcom/android/volley/toolbox/ImageLoader$ImageListener;)V
a=0;// 
a=0;//     .line 226
a=0;//     .local v6, "imageContainer":Lcom/android/volley/toolbox/ImageLoader$ImageContainer;
a=0;//     #v6=(Reference,Lcom/android/volley/toolbox/ImageLoader$ImageContainer;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-interface {v0, v6, v4}, Lcom/android/volley/toolbox/ImageLoader$ImageListener;->onResponse(Lcom/android/volley/toolbox/ImageLoader$ImageContainer;Z)V
a=0;// 
a=0;//     .line 229
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/android/volley/toolbox/ImageLoader;->mInFlightRequests:Ljava/util/HashMap;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v4, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v18, Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;
a=0;// 
a=0;//     .line 230
a=0;//     .local v18, "request":Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;
a=0;//     if-eqz v18, :cond_1
a=0;// 
a=0;//     .line 232
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;->addContainer(Lcom/android/volley/toolbox/ImageLoader$ImageContainer;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 238
a=0;//     :cond_1
a=0;//     new-instance v11, Lcom/android/volley/toolbox/ImageRequest;
a=0;// 
a=0;//     #v11=(UninitRef,Lcom/android/volley/toolbox/ImageRequest;);
a=0;//     new-instance v13, Lcom/android/volley/toolbox/ImageLoader$2;
a=0;// 
a=0;//     #v13=(UninitRef,Lcom/android/volley/toolbox/ImageLoader$2;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v13, v0, v10}, Lcom/android/volley/toolbox/ImageLoader$2;-><init>(Lcom/android/volley/toolbox/ImageLoader;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 243
a=0;//     #v13=(Reference,Lcom/android/volley/toolbox/ImageLoader$2;);
a=0;//     sget-object v16, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     #v16=(Reference,Landroid/graphics/Bitmap$Config;);
a=0;//     new-instance v17, Lcom/android/volley/toolbox/ImageLoader$3;
a=0;// 
a=0;//     #v17=(UninitRef,Lcom/android/volley/toolbox/ImageLoader$3;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/volley/toolbox/ImageLoader$3;);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/volley/toolbox/ImageLoader;);
a=0;//     invoke-direct {v0, v1, v10}, Lcom/android/volley/toolbox/ImageLoader$3;-><init>(Lcom/android/volley/toolbox/ImageLoader;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/toolbox/ImageLoader$3;);v17=(Reference,Lcom/android/volley/toolbox/ImageLoader$3;);
a=0;//     move-object/from16 v12, p1
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move/from16 v14, p3
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     move/from16 v15, p4
a=0;// 
a=0;//     .line 238
a=0;//     #v15=(Integer);
a=0;//     invoke-direct/range {v11 .. v17}, Lcom/android/volley/toolbox/ImageRequest;-><init>(Ljava/lang/String;Lcom/android/volley/Response$Listener;IILandroid/graphics/Bitmap$Config;Lcom/android/volley/Response$ErrorListener;)V
a=0;// 
a=0;//     .line 250
a=0;//     .local v11, "newRequest":Lcom/android/volley/Request;, "Lcom/android/volley/Request<*>;"
a=0;//     #v11=(Reference,Lcom/android/volley/toolbox/ImageRequest;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/android/volley/toolbox/ImageLoader;->mRequestQueue:Lcom/android/volley/RequestQueue;
a=0;// 
a=0;//     invoke-virtual {v4, v11}, Lcom/android/volley/RequestQueue;->add(Lcom/android/volley/Request;)Lcom/android/volley/Request;
a=0;// 
a=0;//     .line 251
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/android/volley/toolbox/ImageLoader;->mInFlightRequests:Ljava/util/HashMap;
a=0;// 
a=0;//     new-instance v7, Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v7, v0, v11, v6}, Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;-><init>(Lcom/android/volley/toolbox/ImageLoader;Lcom/android/volley/Request;Lcom/android/volley/toolbox/ImageLoader$ImageContainer;)V
a=0;// 
a=0;//     #v7=(Reference,Lcom/android/volley/toolbox/ImageLoader$BatchedImageRequest;);
a=0;//     invoke-virtual {v4, v10, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isCached(Ljava/lang/String;II)Z
a=0;//     .locals 2
a=0;//     .param p1, "requestUrl"    # Ljava/lang/String;
a=0;//     .param p2, "maxWidth"    # I
a=0;//     .param p3, "maxHeight"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 168
a=0;//     invoke-direct {p0}, Lcom/android/volley/toolbox/ImageLoader;->throwIfNotOnMainThread()V
a=0;// 
a=0;//     .line 170
a=0;//     invoke-static {p1, p2, p3}, Lcom/android/volley/toolbox/ImageLoader;->getCacheKey(Ljava/lang/String;II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 171
a=0;//     .local v0, "cacheKey":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/android/volley/toolbox/ImageLoader;->mCache:Lcom/android/volley/toolbox/ImageLoader$ImageCache;
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/volley/toolbox/ImageLoader$ImageCache;);
a=0;//     invoke-interface {v1, v0}, Lcom/android/volley/toolbox/ImageLoader$ImageCache;->getBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setBatchedResponseDelay(I)V
a=0;//     .locals 0
a=0;//     .param p1, "newBatchedResponseDelayMs"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 263
a=0;//     iput p1, p0, Lcom/android/volley/toolbox/ImageLoader;->mBatchResponseDelayMs:I
a=0;// 
a=0;//     .line 264
a=0;//     return-void
a=0;// .end method
}}
