package com.twocloo.base.cache.lru; class BMemCache { void a() { int a;
a=0;// .class public Lcom/twocloo/base/cache/lru/BMemCache;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BMemCache.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/twocloo/base/cache/lru/LruCacheFace;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Object;",
a=0;//         "Lcom/twocloo/base/cache/lru/LruCacheFace",
a=0;//         "<",
a=0;//         "Landroid/graphics/Bitmap;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final BYTE:I = 0x1
a=0;// 
a=0;// .field private static final DEFAULT_SIZE:I = 0x1000000
a=0;// 
a=0;// .field private static final KB:I = 0x400
a=0;// 
a=0;// .field private static final MB:I = 0x100000
a=0;// 
a=0;// .field private static final instance:Lcom/twocloo/base/cache/lru/BMemCache;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private lruCache:Landroid/util/LruCache;
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
a=0;// .field private memClass:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     new-instance v0, Lcom/twocloo/base/cache/lru/BMemCache;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/base/cache/lru/BMemCache;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/base/cache/lru/BMemCache;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/cache/lru/BMemCache;);
a=0;//     sput-object v0, Lcom/twocloo/base/cache/lru/BMemCache;->instance:Lcom/twocloo/base/cache/lru/BMemCache;
a=0;// 
a=0;//     .line 28
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Lcom/twocloo/base/cache/lru/BMemCache;);
a=0;//     invoke-direct {p0}, Lcom/twocloo/base/cache/lru/BMemCache;->init()V
a=0;// 
a=0;//     .line 37
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getInstance()Lcom/twocloo/base/cache/lru/BMemCache;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     sget-object v0, Lcom/twocloo/base/cache/lru/BMemCache;->instance:Lcom/twocloo/base/cache/lru/BMemCache;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/cache/lru/BMemCache;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private init()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v3, 0x1000000
a=0;// 
a=0;//     .line 53
a=0;//     #v3=(Integer);
a=0;//     invoke-static {}, Lcom/twocloo/base/util/PhoneUtils;->getSystemVersionCode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-le v1, v2, :cond_0
a=0;// 
a=0;//     .line 55
a=0;//     new-instance v1, Lcom/twocloo/base/cache/lru/BMemCache$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/base/cache/lru/BMemCache$1;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/base/cache/lru/BMemCache$1;-><init>(Lcom/twocloo/base/cache/lru/BMemCache;)V
a=0;// 
a=0;//     .line 62
a=0;//     #v1=(Reference,Lcom/twocloo/base/cache/lru/BMemCache$1;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/base/cache/lru/BMemCache$1;->getMemClass()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/high16 v2, 0x100000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-int/2addr v1, v2
a=0;// 
a=0;//     .line 55
a=0;//     iput v1, p0, Lcom/twocloo/base/cache/lru/BMemCache;->memClass:I
a=0;// 
a=0;//     .line 70
a=0;//     :goto_0
a=0;//     iget v1, p0, Lcom/twocloo/base/cache/lru/BMemCache;->memClass:I
a=0;// 
a=0;//     div-int/lit8 v1, v1, 0x8
a=0;// 
a=0;//     invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 72
a=0;//     .local v0, "cacheSize":I
a=0;//     #v0=(Integer);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "\u5185\u5b58\u7f13\u5b58\u5206\u914d\u7a7a\u95f4\u5b57\u8282\u6570\uff08\u603b\u7a7a\u95f4\u76841/8\uff09\uff1a"
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
a=0;//     .line 74
a=0;//     invoke-direct {p0, v0}, Lcom/twocloo/base/cache/lru/BMemCache;->init(I)V
a=0;// 
a=0;//     .line 76
a=0;//     return-void
a=0;// 
a=0;//     .line 65
a=0;//     .end local v0    # "cacheSize":I
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Integer);v2=(PosByte);
a=0;//     iput v3, p0, Lcom/twocloo/base/cache/lru/BMemCache;->memClass:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private init(I)V
a=0;//     .locals 2
a=0;//     .param p1, "cacheSize"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 97
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 82
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Lcom/twocloo/base/cache/lru/BMemCache$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/base/cache/lru/BMemCache$2;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/twocloo/base/cache/lru/BMemCache$2;-><init>(Lcom/twocloo/base/cache/lru/BMemCache;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/cache/lru/BMemCache$2;);
a=0;//     iput-object v0, p0, Lcom/twocloo/base/cache/lru/BMemCache;->lruCache:Landroid/util/LruCache;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public get(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;//     .locals 1
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     iget-object v0, p0, Lcom/twocloo/base/cache/lru/BMemCache;->lruCache:Landroid/util/LruCache;
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
a=0;// .method public bridge synthetic get(Ljava/lang/String;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/base/cache/lru/BMemCache;->get(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public put(Ljava/lang/String;Landroid/graphics/Bitmap;)V
a=0;//     .locals 1
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;//     .param p2, "bm"    # Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/base/cache/lru/BMemCache;->get(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 42
a=0;//     iget-object v0, p0, Lcom/twocloo/base/cache/lru/BMemCache;->lruCache:Landroid/util/LruCache;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 44
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic put(Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p2, Landroid/graphics/Bitmap;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/twocloo/base/cache/lru/BMemCache;->put(Ljava/lang/String;Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
