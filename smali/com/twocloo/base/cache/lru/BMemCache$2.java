package com.twocloo.base.cache.lru; class BMemCache$2 { void a() { int a;
a=0;// .class Lcom/twocloo/base/cache/lru/BMemCache$2;
a=0;// .super Landroid/util/LruCache;
a=0;// .source "BMemCache.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/base/cache/lru/BMemCache;->init(I)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Landroid/util/LruCache",
a=0;//         "<",
a=0;//         "Ljava/lang/String;",
a=0;//         "Landroid/graphics/Bitmap;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/base/cache/lru/BMemCache;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/base/cache/lru/BMemCache;I)V
a=0;//     .locals 0
a=0;//     .param p2, "$anonymous0"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/base/cache/lru/BMemCache$2;->this$0:Lcom/twocloo/base/cache/lru/BMemCache;
a=0;// 
a=0;//     .line 82
a=0;//     invoke-direct {p0, p2}, Landroid/util/LruCache;-><init>(I)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/cache/lru/BMemCache$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected bridge synthetic sizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Ljava/lang/String;
a=0;// 
a=0;//     check-cast p2, Landroid/graphics/Bitmap;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/twocloo/base/cache/lru/BMemCache$2;->sizeOf(Ljava/lang/String;Landroid/graphics/Bitmap;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected sizeOf(Ljava/lang/String;Landroid/graphics/Bitmap;)I
a=0;//     .locals 3
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;//     .param p2, "bitmap"    # Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     invoke-virtual {p2}, Landroid/graphics/Bitmap;->getRowBytes()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-int v0, v1, v2
a=0;// 
a=0;//     .line 90
a=0;//     .local v0, "byteCount":I
a=0;//     #v0=(Integer);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "\u5f53\u524d\u56fe\u7247\u5927\u5c0f|"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 92
a=0;//     return v0
a=0;// .end method
}}
