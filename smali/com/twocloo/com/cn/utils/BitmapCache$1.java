package com.twocloo.com.cn.utils; class BitmapCache$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/utils/BitmapCache$1;
a=0;// .super Landroid/util/LruCache;
a=0;// .source "BitmapCache.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/utils/BitmapCache;-><init>()V
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
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/utils/BitmapCache;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/utils/BitmapCache;I)V
a=0;//     .locals 0
a=0;//     .param p2, "$anonymous0"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/utils/BitmapCache$1;->this$0:Lcom/twocloo/com/cn/utils/BitmapCache;
a=0;// 
a=0;//     .line 22
a=0;//     invoke-direct {p0, p2}, Landroid/util/LruCache;-><init>(I)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/utils/BitmapCache$1;);
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
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/twocloo/com/cn/utils/BitmapCache$1;->sizeOf(Ljava/lang/String;Landroid/graphics/Bitmap;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected sizeOf(Ljava/lang/String;Landroid/graphics/Bitmap;)I
a=0;//     .locals 2
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;//     .param p2, "value"    # Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     invoke-virtual {p2}, Landroid/graphics/Bitmap;->getRowBytes()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-int/2addr v0, v1
a=0;// 
a=0;//     return v0
a=0;// .end method
}}
