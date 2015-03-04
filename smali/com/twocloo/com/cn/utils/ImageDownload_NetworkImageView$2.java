package com.twocloo.com.cn.utils; class ImageDownload_NetworkImageView$2 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/utils/ImageDownload_NetworkImageView$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ImageDownload_NetworkImageView.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/android/volley/toolbox/ImageLoader$ImageCache;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/utils/ImageDownload_NetworkImageView;->downLoadImage(Lcom/android/volley/RequestQueue;Landroid/content/Context;Ljava/lang/String;Lcom/android/volley/toolbox/NetworkImageView;Landroid/support/v4/util/LruCache;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final synthetic val$lruCache:Landroid/support/v4/util/LruCache;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v4/util/LruCache;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/utils/ImageDownload_NetworkImageView$2;->val$lruCache:Landroid/support/v4/util/LruCache;
a=0;// 
a=0;//     .line 33
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/utils/ImageDownload_NetworkImageView$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;//     .locals 1
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/utils/ImageDownload_NetworkImageView$2;->val$lruCache:Landroid/support/v4/util/LruCache;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/LruCache;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/graphics/Bitmap;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public putBitmap(Ljava/lang/String;Landroid/graphics/Bitmap;)V
a=0;//     .locals 1
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "bitmap"    # Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/utils/ImageDownload_NetworkImageView$2;->val$lruCache:Landroid/support/v4/util/LruCache;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/LruCache;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/support/v4/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 39
a=0;//     return-void
a=0;// .end method
}}
