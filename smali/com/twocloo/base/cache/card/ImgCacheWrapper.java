package com.twocloo.base.cache.card; class ImgCacheWrapper { void a() { int a;
a=0;// .class public Lcom/twocloo/base/cache/card/ImgCacheWrapper;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ImgCacheWrapper.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/twocloo/base/cache/Cache;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Object;",
a=0;//         "Lcom/twocloo/base/cache/Cache",
a=0;//         "<",
a=0;//         "Landroid/graphics/Bitmap;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static volatile instance:Lcom/twocloo/base/cache/card/ImgCacheWrapper;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final caches:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<+",
a=0;//             "Lcom/twocloo/base/cache/Cache",
a=0;//             "<",
a=0;//             "Landroid/graphics/Bitmap;",
a=0;//             ">;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p1, "picPath"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 16
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 17
a=0;//     #p0=(Reference,Lcom/twocloo/base/cache/card/ImgCacheWrapper;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [Lcom/twocloo/base/cache/card/ImgSDCache;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/twocloo/base/cache/card/ImgSDCache;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-instance v2, Lcom/twocloo/base/cache/card/ImgSDCache;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/base/cache/card/ImgSDCache;);
a=0;//     invoke-direct {v2, p1}, Lcom/twocloo/base/cache/card/ImgSDCache;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/cache/card/ImgSDCache;);
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/base/cache/card/ImgCacheWrapper;->caches:Ljava/util/List;
a=0;// 
a=0;//     .line 18
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getInstance(Ljava/lang/String;)Lcom/twocloo/base/cache/card/ImgCacheWrapper;
a=0;//     .locals 2
a=0;//     .param p0, "picPath"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     sget-object v0, Lcom/twocloo/base/cache/card/ImgCacheWrapper;->instance:Lcom/twocloo/base/cache/card/ImgCacheWrapper;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/cache/card/ImgCacheWrapper;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 27
a=0;//     const-class v1, Lcom/twocloo/base/cache/card/ImgCacheWrapper;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 28
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/twocloo/base/cache/card/ImgCacheWrapper;->instance:Lcom/twocloo/base/cache/card/ImgCacheWrapper;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 29
a=0;//     new-instance v0, Lcom/twocloo/base/cache/card/ImgCacheWrapper;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/base/cache/card/ImgCacheWrapper;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/base/cache/card/ImgCacheWrapper;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/cache/card/ImgCacheWrapper;);
a=0;//     sput-object v0, Lcom/twocloo/base/cache/card/ImgCacheWrapper;->instance:Lcom/twocloo/base/cache/card/ImgCacheWrapper;
a=0;// 
a=0;//     .line 27
a=0;//     :cond_0
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 34
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/twocloo/base/cache/card/ImgCacheWrapper;->instance:Lcom/twocloo/base/cache/card/ImgCacheWrapper;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 27
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
a=0;// 
a=0;// # virtual methods
a=0;// .method public available()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     iget-object v1, p0, Lcom/twocloo/base/cache/card/ImgCacheWrapper;->caches:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/base/cache/Cache;
a=0;// 
a=0;//     .line 52
a=0;//     .local v0, "cache":Lcom/twocloo/base/cache/Cache;, "Lcom/twocloo/base/cache/Cache<Landroid/graphics/Bitmap;>;"
a=0;//     invoke-interface {v0}, Lcom/twocloo/base/cache/Cache;->available()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 55
a=0;//     .end local v0    # "cache":Lcom/twocloo/base/cache/Cache;, "Lcom/twocloo/base/cache/Cache<Landroid/graphics/Bitmap;>;"
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Reference,Ljava/util/Iterator;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public get(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;//     .locals 4
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 104
a=0;//     .local v0, "bm":Landroid/graphics/Bitmap;
a=0;//     #v0=(Null);
a=0;//     iget-object v2, p0, Lcom/twocloo/base/cache/card/ImgCacheWrapper;->caches:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 111
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 104
a=0;//     :cond_1
a=0;//     #v0=(Null);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/twocloo/base/cache/Cache;
a=0;// 
a=0;//     .line 105
a=0;//     .local v1, "cache":Lcom/twocloo/base/cache/Cache;, "Lcom/twocloo/base/cache/Cache<Landroid/graphics/Bitmap;>;"
a=0;//     invoke-interface {v1}, Lcom/twocloo/base/cache/Cache;->available()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 106
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v1, p1, v2}, Lcom/twocloo/base/cache/Cache;->get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .end local v0    # "bm":Landroid/graphics/Bitmap;
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 107
a=0;//     .restart local v0    # "bm":Landroid/graphics/Bitmap;
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;)Landroid/graphics/Bitmap;
a=0;//     .locals 4
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;//     .param p2, "keyCreater"    # Lcom/twocloo/base/cache/KeyCreater;
a=0;// 
a=0;//     .prologue
a=0;//     .line 116
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 118
a=0;//     .local v0, "bm":Landroid/graphics/Bitmap;
a=0;//     #v0=(Null);
a=0;//     iget-object v2, p0, Lcom/twocloo/base/cache/card/ImgCacheWrapper;->caches:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 125
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 118
a=0;//     :cond_1
a=0;//     #v0=(Null);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/twocloo/base/cache/Cache;
a=0;// 
a=0;//     .line 119
a=0;//     .local v1, "cache":Lcom/twocloo/base/cache/Cache;, "Lcom/twocloo/base/cache/Cache<Landroid/graphics/Bitmap;>;"
a=0;//     invoke-interface {v1}, Lcom/twocloo/base/cache/Cache;->available()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 120
a=0;//     invoke-interface {v1, p1, p2}, Lcom/twocloo/base/cache/Cache;->get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .end local v0    # "bm":Landroid/graphics/Bitmap;
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 121
a=0;//     .restart local v0    # "bm":Landroid/graphics/Bitmap;
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;J)Landroid/graphics/Bitmap;
a=0;//     .locals 4
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;//     .param p2, "keyCreater"    # Lcom/twocloo/base/cache/KeyCreater;
a=0;//     .param p3, "timeOut"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 130
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 132
a=0;//     .local v0, "bm":Landroid/graphics/Bitmap;
a=0;//     #v0=(Null);
a=0;//     iget-object v2, p0, Lcom/twocloo/base/cache/card/ImgCacheWrapper;->caches:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 139
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 132
a=0;//     :cond_1
a=0;//     #v0=(Null);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/twocloo/base/cache/Cache;
a=0;// 
a=0;//     .line 133
a=0;//     .local v1, "cache":Lcom/twocloo/base/cache/Cache;, "Lcom/twocloo/base/cache/Cache<Landroid/graphics/Bitmap;>;"
a=0;//     invoke-interface {v1}, Lcom/twocloo/base/cache/Cache;->available()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 134
a=0;//     invoke-interface {v1, p1, p2, p3, p4}, Lcom/twocloo/base/cache/Cache;->get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;J)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .end local v0    # "bm":Landroid/graphics/Bitmap;
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 135
a=0;//     .restart local v0    # "bm":Landroid/graphics/Bitmap;
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic get(Ljava/lang/String;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/base/cache/card/ImgCacheWrapper;->get(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/twocloo/base/cache/card/ImgCacheWrapper;->get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;J)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0, p1, p2, p3, p4}, Lcom/twocloo/base/cache/card/ImgCacheWrapper;->get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;J)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getAvailableMemorySize()J
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 154
a=0;//     iget-object v1, p0, Lcom/twocloo/base/cache/card/ImgCacheWrapper;->caches:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 159
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     return-wide v1
a=0;// 
a=0;//     .line 154
a=0;//     :cond_1
a=0;//     #v1=(Reference,Ljava/util/Iterator;);v2=(Boolean);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/base/cache/Cache;
a=0;// 
a=0;//     .line 155
a=0;//     .local v0, "cache":Lcom/twocloo/base/cache/Cache;, "Lcom/twocloo/base/cache/Cache<Landroid/graphics/Bitmap;>;"
a=0;//     invoke-interface {v0}, Lcom/twocloo/base/cache/Cache;->available()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 156
a=0;//     invoke-interface {v0}, Lcom/twocloo/base/cache/Cache;->getAvailableMemorySize()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getRootPath()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     iget-object v1, p0, Lcom/twocloo/base/cache/card/ImgCacheWrapper;->caches:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 45
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v1
a=0;// 
a=0;//     .line 40
a=0;//     :cond_1
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/base/cache/Cache;
a=0;// 
a=0;//     .line 41
a=0;//     .local v0, "cache":Lcom/twocloo/base/cache/Cache;, "Lcom/twocloo/base/cache/Cache<Landroid/graphics/Bitmap;>;"
a=0;//     invoke-interface {v0}, Lcom/twocloo/base/cache/Cache;->available()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 42
a=0;//     invoke-interface {v0}, Lcom/twocloo/base/cache/Cache;->getRootPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getTotalMemorySize()J
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 144
a=0;//     iget-object v1, p0, Lcom/twocloo/base/cache/card/ImgCacheWrapper;->caches:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 149
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     return-wide v1
a=0;// 
a=0;//     .line 144
a=0;//     :cond_1
a=0;//     #v1=(Reference,Ljava/util/Iterator;);v2=(Boolean);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/base/cache/Cache;
a=0;// 
a=0;//     .line 145
a=0;//     .local v0, "cache":Lcom/twocloo/base/cache/Cache;, "Lcom/twocloo/base/cache/Cache<Landroid/graphics/Bitmap;>;"
a=0;//     invoke-interface {v0}, Lcom/twocloo/base/cache/Cache;->available()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 146
a=0;//     invoke-interface {v0}, Lcom/twocloo/base/cache/Cache;->getTotalMemorySize()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public put(Ljava/lang/String;Landroid/graphics/Bitmap;)Z
a=0;//     .locals 4
a=0;//     .param p1, "imageUrl"    # Ljava/lang/String;
a=0;//     .param p2, "bm"    # Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 62
a=0;//     .local v1, "result":Z
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcom/twocloo/base/cache/card/ImgCacheWrapper;->caches:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 69
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     .line 62
a=0;//     :cond_1
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/base/cache/Cache;
a=0;// 
a=0;//     .line 63
a=0;//     .local v0, "cache":Lcom/twocloo/base/cache/Cache;, "Lcom/twocloo/base/cache/Cache<Landroid/graphics/Bitmap;>;"
a=0;//     invoke-interface {v0}, Lcom/twocloo/base/cache/Cache;->available()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 64
a=0;//     invoke-interface {v0, p1, p2}, Lcom/twocloo/base/cache/Cache;->put(Ljava/lang/String;Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 65
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public put(Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/twocloo/base/cache/Filter;)Z
a=0;//     .locals 4
a=0;//     .param p1, "imageUrl"    # Ljava/lang/String;
a=0;//     .param p2, "bm"    # Landroid/graphics/Bitmap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Landroid/graphics/Bitmap;",
a=0;//             "Lcom/twocloo/base/cache/Filter",
a=0;//             "<",
a=0;//             "Landroid/graphics/Bitmap;",
a=0;//             ">;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     .local p3, "filter":Lcom/twocloo/base/cache/Filter;, "Lcom/twocloo/base/cache/Filter<Landroid/graphics/Bitmap;>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 76
a=0;//     .local v1, "result":Z
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcom/twocloo/base/cache/card/ImgCacheWrapper;->caches:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 83
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     .line 76
a=0;//     :cond_1
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/base/cache/Cache;
a=0;// 
a=0;//     .line 77
a=0;//     .local v0, "cache":Lcom/twocloo/base/cache/Cache;, "Lcom/twocloo/base/cache/Cache<Landroid/graphics/Bitmap;>;"
a=0;//     invoke-interface {v0}, Lcom/twocloo/base/cache/Cache;->available()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 78
a=0;//     invoke-interface {v0, p1, p2, p3}, Lcom/twocloo/base/cache/Cache;->put(Ljava/lang/String;Ljava/lang/Object;Lcom/twocloo/base/cache/Filter;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 79
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public put(Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/KeyCreater;)Z
a=0;//     .locals 4
a=0;//     .param p1, "imageUrl"    # Ljava/lang/String;
a=0;//     .param p2, "bm"    # Landroid/graphics/Bitmap;
a=0;//     .param p4, "keyCreater"    # Lcom/twocloo/base/cache/KeyCreater;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Landroid/graphics/Bitmap;",
a=0;//             "Lcom/twocloo/base/cache/Filter",
a=0;//             "<",
a=0;//             "Landroid/graphics/Bitmap;",
a=0;//             ">;",
a=0;//             "Lcom/twocloo/base/cache/KeyCreater;",
a=0;//             ")Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     .local p3, "filter":Lcom/twocloo/base/cache/Filter;, "Lcom/twocloo/base/cache/Filter<Landroid/graphics/Bitmap;>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 90
a=0;//     .local v1, "result":Z
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcom/twocloo/base/cache/card/ImgCacheWrapper;->caches:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 97
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     .line 90
a=0;//     :cond_1
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/base/cache/Cache;
a=0;// 
a=0;//     .line 91
a=0;//     .local v0, "cache":Lcom/twocloo/base/cache/Cache;, "Lcom/twocloo/base/cache/Cache<Landroid/graphics/Bitmap;>;"
a=0;//     invoke-interface {v0}, Lcom/twocloo/base/cache/Cache;->available()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 92
a=0;//     invoke-interface {v0, p1, p2, p3, p4}, Lcom/twocloo/base/cache/Cache;->put(Ljava/lang/String;Ljava/lang/Object;Lcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/KeyCreater;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 93
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic put(Ljava/lang/String;Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p2, Landroid/graphics/Bitmap;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/twocloo/base/cache/card/ImgCacheWrapper;->put(Ljava/lang/String;Landroid/graphics/Bitmap;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic put(Ljava/lang/String;Ljava/lang/Object;Lcom/twocloo/base/cache/Filter;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p2, Landroid/graphics/Bitmap;
a=0;// 
a=0;//     check-cast p3, Lcom/twocloo/base/cache/Filter;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2, p3}, Lcom/twocloo/base/cache/card/ImgCacheWrapper;->put(Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/twocloo/base/cache/Filter;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic put(Ljava/lang/String;Ljava/lang/Object;Lcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/KeyCreater;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p2, Landroid/graphics/Bitmap;
a=0;// 
a=0;//     check-cast p3, Lcom/twocloo/base/cache/Filter;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2, p3, p4}, Lcom/twocloo/base/cache/card/ImgCacheWrapper;->put(Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/KeyCreater;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
