package com.twocloo.com.cn.utils; class BitmapCache { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/utils/BitmapCache;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BitmapCache.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/android/volley/toolbox/ImageLoader$ImageCache;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation build Landroid/annotation/TargetApi;
a=0;//     value = 0xc
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mCache:Landroid/util/LruCache;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Landroid/util/LruCache",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Landroid/graphics/Bitmap;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 21
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/utils/BitmapCache;);
a=0;//     const/high16 v0, 0xa00000
a=0;// 
a=0;//     .line 22
a=0;//     .local v0, "maxSize":I
a=0;//     #v0=(Integer);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/utils/BitmapCache$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/utils/BitmapCache$1;);
a=0;//     invoke-direct {v1, p0, v0}, Lcom/twocloo/com/cn/utils/BitmapCache$1;-><init>(Lcom/twocloo/com/cn/utils/BitmapCache;I)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/utils/BitmapCache$1;);
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/utils/BitmapCache;->mCache:Landroid/util/LruCache;
a=0;// 
a=0;//     .line 29
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
a=0;//     .line 33
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/utils/BitmapCache;->mCache:Landroid/util/LruCache;
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/LruCache;);
a=0;//     invoke-virtual {v0, p1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;
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
a=0;//     .line 38
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/utils/BitmapCache;->mCache:Landroid/util/LruCache;
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/LruCache;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 39
a=0;//     return-void
a=0;// .end method
}}
