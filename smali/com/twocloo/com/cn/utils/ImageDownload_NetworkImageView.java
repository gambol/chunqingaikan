package com.twocloo.com.cn.utils; class ImageDownload_NetworkImageView { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/utils/ImageDownload_NetworkImageView;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ImageDownload_NetworkImageView.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/utils/ImageDownload_NetworkImageView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static downLoadImage(Lcom/android/volley/RequestQueue;Landroid/content/Context;Ljava/lang/String;Lcom/android/volley/toolbox/NetworkImageView;Landroid/support/v4/util/LruCache;)V
a=0;//     .locals 2
a=0;//     .param p0, "queue"    # Lcom/android/volley/RequestQueue;
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "path"    # Ljava/lang/String;
a=0;//     .param p3, "imageView"    # Lcom/android/volley/toolbox/NetworkImageView;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/android/volley/RequestQueue;",
a=0;//             "Landroid/content/Context;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/android/volley/toolbox/NetworkImageView;",
a=0;//             "Landroid/support/v4/util/LruCache",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Landroid/graphics/Bitmap;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     .local p4, "lruCache":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<Ljava/lang/String;Landroid/graphics/Bitmap;>;"
a=0;//     new-instance v0, Lcom/twocloo/com/cn/utils/ImageDownload_NetworkImageView$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/utils/ImageDownload_NetworkImageView$2;);
a=0;//     invoke-direct {v0, p4}, Lcom/twocloo/com/cn/utils/ImageDownload_NetworkImageView$2;-><init>(Landroid/support/v4/util/LruCache;)V
a=0;// 
a=0;//     .line 48
a=0;//     .local v0, "imageCache":Lcom/android/volley/toolbox/ImageLoader$ImageCache;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/utils/ImageDownload_NetworkImageView$2;);
a=0;//     new-instance v1, Lcom/android/volley/toolbox/ImageLoader;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/android/volley/toolbox/ImageLoader;);
a=0;//     invoke-direct {v1, p0, v0}, Lcom/android/volley/toolbox/ImageLoader;-><init>(Lcom/android/volley/RequestQueue;Lcom/android/volley/toolbox/ImageLoader$ImageCache;)V
a=0;// 
a=0;//     .line 49
a=0;//     .local v1, "imageLoader":Lcom/android/volley/toolbox/ImageLoader;
a=0;//     #v1=(Reference,Lcom/android/volley/toolbox/ImageLoader;);
a=0;//     invoke-virtual {p3, p2}, Lcom/android/volley/toolbox/NetworkImageView;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 50
a=0;//     invoke-virtual {p3, p2, v1}, Lcom/android/volley/toolbox/NetworkImageView;->setImageUrl(Ljava/lang/String;Lcom/android/volley/toolbox/ImageLoader;)V
a=0;// 
a=0;//     .line 51
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getLruCache(Landroid/content/Context;)Landroid/support/v4/util/LruCache;
a=0;//     .locals 3
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             ")",
a=0;//             "Landroid/support/v4/util/LruCache",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Landroid/graphics/Bitmap;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 19
a=0;//     .local v0, "lruCache":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<Ljava/lang/String;Landroid/graphics/Bitmap;>;"
a=0;//     #v0=(Null);
a=0;//     const-string v2, "activity"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/app/ActivityManager;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/app/ActivityManager;->getMemoryClass()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     div-int/lit8 v1, v2, 0x8
a=0;// 
a=0;//     .line 20
a=0;//     .local v1, "maxSize":I
a=0;//     #v1=(Integer);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/utils/ImageDownload_NetworkImageView$1;
a=0;// 
a=0;//     .end local v0    # "lruCache":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<Ljava/lang/String;Landroid/graphics/Bitmap;>;"
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/utils/ImageDownload_NetworkImageView$1;);
a=0;//     invoke-direct {v0, v1}, Lcom/twocloo/com/cn/utils/ImageDownload_NetworkImageView$1;-><init>(I)V
a=0;// 
a=0;//     .line 26
a=0;//     .restart local v0    # "lruCache":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<Ljava/lang/String;Landroid/graphics/Bitmap;>;"
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/utils/ImageDownload_NetworkImageView$1;);
a=0;//     return-object v0
a=0;// .end method
}}
