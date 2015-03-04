package com.twocloo.base.http; class LoadImgProvider { void a() { int a;
a=0;// .class public Lcom/twocloo/base/http/LoadImgProvider;
a=0;// .super Ljava/lang/Object;
a=0;// .source "LoadImgProvider.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DELAY_TIME:I = 0x3e8
a=0;// 
a=0;// .field private static final HANDER:Landroid/os/Handler;
a=0;// 
a=0;// .field private static final THREAD_WORKER:Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;// .field private static final THREAD_WORKER_COUNT:I = 0x3
a=0;// 
a=0;// .field private static volatile instance:Lcom/twocloo/base/http/LoadImgProvider;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final cache:Lcom/twocloo/base/cache/Cache;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/twocloo/base/cache/Cache",
a=0;//             "<",
a=0;//             "Landroid/graphics/Bitmap;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final urlCache:Ljava/util/Set;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Set",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ExecutorService;);
a=0;//     sput-object v0, Lcom/twocloo/base/http/LoadImgProvider;->THREAD_WORKER:Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     .line 32
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-direct {v0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     sput-object v0, Lcom/twocloo/base/http/LoadImgProvider;->HANDER:Landroid/os/Handler;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "picPath"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 38
a=0;//     #p0=(Reference,Lcom/twocloo/base/http/LoadImgProvider;);
a=0;//     invoke-static {p1}, Lcom/twocloo/base/cache/card/ImgCacheProvider;->getInstance(Ljava/lang/String;)Lcom/twocloo/base/cache/card/ImgCacheProvider;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/cache/card/ImgCacheProvider;);
a=0;//     iput-object v0, p0, Lcom/twocloo/base/http/LoadImgProvider;->cache:Lcom/twocloo/base/cache/Cache;
a=0;// 
a=0;//     .line 39
a=0;//     new-instance v0, Ljava/util/HashSet;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashSet;);
a=0;//     invoke-direct {v0}, Ljava/util/HashSet;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashSet;);
a=0;//     iput-object v0, p0, Lcom/twocloo/base/http/LoadImgProvider;->urlCache:Ljava/util/Set;
a=0;// 
a=0;//     .line 40
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/base/http/LoadImgProvider;)Lcom/twocloo/base/cache/Cache;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     iget-object v0, p0, Lcom/twocloo/base/http/LoadImgProvider;->cache:Lcom/twocloo/base/cache/Cache;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/cache/Cache;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1()Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     sget-object v0, Lcom/twocloo/base/http/LoadImgProvider;->HANDER:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/base/http/LoadImgProvider;)Ljava/util/Set;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     iget-object v0, p0, Lcom/twocloo/base/http/LoadImgProvider;->urlCache:Ljava/util/Set;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Set;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private doLoadImageAsyn(Ljava/lang/String;Landroid/widget/ImageView;Landroid/widget/ImageView$ScaleType;Z)V
a=0;//     .locals 2
a=0;//     .param p1, "imageUrl"    # Ljava/lang/String;
a=0;//     .param p2, "imageView"    # Landroid/widget/ImageView;
a=0;//     .param p3, "scaleType"    # Landroid/widget/ImageView$ScaleType;
a=0;//     .param p4, "isDownloadIcon"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 151
a=0;//     monitor-enter p0
a=0;// 
a=0;//     .line 152
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/twocloo/base/http/LoadImgProvider;->urlCache:Ljava/util/Set;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 153
a=0;//     monitor-exit p0
a=0;// 
a=0;//     .line 188
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 154
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/base/http/LoadImgProvider;->urlCache:Ljava/util/Set;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 151
a=0;//     monitor-exit p0
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 157
a=0;//     sget-object v0, Lcom/twocloo/base/http/LoadImgProvider;->THREAD_WORKER:Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/base/http/LoadImgProvider$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/base/http/LoadImgProvider$1;);
a=0;//     invoke-direct {v1, p0, p2, p1, p3}, Lcom/twocloo/base/http/LoadImgProvider$1;-><init>(Lcom/twocloo/base/http/LoadImgProvider;Landroid/widget/ImageView;Ljava/lang/String;Landroid/widget/ImageView$ScaleType;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/http/LoadImgProvider$1;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 151
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private doLoadImageSync(Landroid/graphics/Bitmap;Landroid/widget/ImageView;Landroid/widget/ImageView$ScaleType;Z)V
a=0;//     .locals 0
a=0;//     .param p1, "bm"    # Landroid/graphics/Bitmap;
a=0;//     .param p2, "imageView"    # Landroid/widget/ImageView;
a=0;//     .param p3, "scaleType"    # Landroid/widget/ImageView$ScaleType;
a=0;//     .param p4, "isDownloadIcon"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 133
a=0;//     invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V
a=0;// 
a=0;//     .line 135
a=0;//     invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 139
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getInstance(Ljava/lang/String;)Lcom/twocloo/base/http/LoadImgProvider;
a=0;//     .locals 2
a=0;//     .param p0, "picPath"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     sget-object v0, Lcom/twocloo/base/http/LoadImgProvider;->instance:Lcom/twocloo/base/http/LoadImgProvider;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/http/LoadImgProvider;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 50
a=0;//     const-class v1, Lcom/twocloo/base/http/LoadImgProvider;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 51
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/twocloo/base/http/LoadImgProvider;->instance:Lcom/twocloo/base/http/LoadImgProvider;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 52
a=0;//     new-instance v0, Lcom/twocloo/base/http/LoadImgProvider;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/base/http/LoadImgProvider;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/base/http/LoadImgProvider;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/http/LoadImgProvider;);
a=0;//     sput-object v0, Lcom/twocloo/base/http/LoadImgProvider;->instance:Lcom/twocloo/base/http/LoadImgProvider;
a=0;// 
a=0;//     .line 50
a=0;//     :cond_0
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 58
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/twocloo/base/http/LoadImgProvider;->instance:Lcom/twocloo/base/http/LoadImgProvider;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 50
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/Class;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public static shutdown()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     sget-object v0, Lcom/twocloo/base/http/LoadImgProvider;->THREAD_WORKER:Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ExecutorService;);
a=0;//     invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V
a=0;// 
a=0;//     .line 116
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public load(Ljava/lang/String;Landroid/widget/ImageView;Z)V
a=0;//     .locals 6
a=0;//     .param p1, "imageUrl"    # Ljava/lang/String;
a=0;//     .param p2, "imageView"    # Landroid/widget/ImageView;
a=0;//     .param p3, "isDownloadIcon"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 72
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     sget-object v4, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/ImageView$ScaleType;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/http/LoadImgProvider;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/ImageView;);
a=0;//     move v5, p3
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/twocloo/base/http/LoadImgProvider;->load(Ljava/lang/String;Landroid/widget/ImageView;ZLandroid/widget/ImageView$ScaleType;Z)V
a=0;// 
a=0;//     .line 74
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public load(Ljava/lang/String;Landroid/widget/ImageView;ZLandroid/widget/ImageView$ScaleType;Z)V
a=0;//     .locals 3
a=0;//     .param p1, "imageUrl"    # Ljava/lang/String;
a=0;//     .param p2, "imageView"    # Landroid/widget/ImageView;
a=0;//     .param p3, "hasDefIcon"    # Z
a=0;//     .param p4, "scaleType"    # Landroid/widget/ImageView$ScaleType;
a=0;//     .param p5, "isDownloadIcon"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     .line 91
a=0;//     if-eqz p5, :cond_2
a=0;// 
a=0;//     .line 92
a=0;//     sget v1, Lcom/twocloo/base/R$drawable;->download:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 97
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {p2}, Landroid/widget/ImageView;->getVisibility()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 98
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 100
a=0;//     :cond_1
a=0;//     #v1=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/base/http/LoadImgProvider;->cache:Lcom/twocloo/base/cache/Cache;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/cache/Cache;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v1, p1, v2}, Lcom/twocloo/base/cache/Cache;->get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 102
a=0;//     .local v0, "bm":Landroid/graphics/Bitmap;
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 103
a=0;//     invoke-direct {p0, v0, p2, p4, p5}, Lcom/twocloo/base/http/LoadImgProvider;->doLoadImageSync(Landroid/graphics/Bitmap;Landroid/widget/ImageView;Landroid/widget/ImageView$ScaleType;Z)V
a=0;// 
a=0;//     .line 104
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 109
a=0;//     :goto_1
a=0;//     return-void
a=0;// 
a=0;//     .line 94
a=0;//     .end local v0    # "bm":Landroid/graphics/Bitmap;
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     sget v1, Lcom/twocloo/base/R$drawable;->usercentericon_nan:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 106
a=0;//     .restart local v0    # "bm":Landroid/graphics/Bitmap;
a=0;//     :cond_3
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);v1=(Reference,Lcom/twocloo/base/cache/Cache;);v2=(Null);
a=0;//     invoke-direct {p0, p1, p2, p4, p5}, Lcom/twocloo/base/http/LoadImgProvider;->doLoadImageAsyn(Ljava/lang/String;Landroid/widget/ImageView;Landroid/widget/ImageView$ScaleType;Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
