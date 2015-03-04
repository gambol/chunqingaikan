package com.twocloo.base.cache.view; class ViewCacheProvider { void a() { int a;
a=0;// .class public Lcom/twocloo/base/cache/view/ViewCacheProvider;
a=0;// .super Lcom/twocloo/base/cache/view/AbsViewCache;
a=0;// .source "ViewCacheProvider.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/twocloo/base/cache/view/AbsViewCache",
a=0;//         "<",
a=0;//         "Landroid/view/View;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final VIEW_CACHE:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/ref/WeakReference",
a=0;//             "<",
a=0;//             "Landroid/view/View;",
a=0;//             ">;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private static final instance:Lcom/twocloo/base/cache/view/ViewCacheProvider;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     new-instance v0, Lcom/twocloo/base/cache/view/ViewCacheProvider;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/base/cache/view/ViewCacheProvider;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/base/cache/view/ViewCacheProvider;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/cache/view/ViewCacheProvider;);
a=0;//     sput-object v0, Lcom/twocloo/base/cache/view/ViewCacheProvider;->instance:Lcom/twocloo/base/cache/view/ViewCacheProvider;
a=0;// 
a=0;//     .line 20
a=0;//     new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     sput-object v0, Lcom/twocloo/base/cache/view/ViewCacheProvider;->VIEW_CACHE:Ljava/util/Map;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     invoke-direct {p0}, Lcom/twocloo/base/cache/view/AbsViewCache;-><init>()V
a=0;// 
a=0;//     .line 23
a=0;//     #p0=(Reference,Lcom/twocloo/base/cache/view/ViewCacheProvider;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getInstance()Lcom/twocloo/base/cache/view/ViewCacheProvider;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     sget-object v0, Lcom/twocloo/base/cache/view/ViewCacheProvider;->instance:Lcom/twocloo/base/cache/view/ViewCacheProvider;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/cache/view/ViewCacheProvider;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public get(Ljava/lang/String;)Landroid/view/View;
a=0;//     .locals 1
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/twocloo/base/cache/view/ViewCacheProvider;->get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;)Landroid/view/View;
a=0;//     .locals 4
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "keyCreater"    # Lcom/twocloo/base/cache/KeyCreater;
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     invoke-static {p1}, Lcom/twocloo/base/util/StringUtils;->isBlank(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 38
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 55
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Landroid/view/View;);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 40
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 41
a=0;//     .local v2, "key":Ljava/lang/String;
a=0;//     #v2=(Null);
a=0;//     if-eqz p2, :cond_2
a=0;// 
a=0;//     .line 42
a=0;//     invoke-interface {p2}, Lcom/twocloo/base/cache/KeyCreater;->create()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 46
a=0;//     :goto_1
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     sget-object v3, Lcom/twocloo/base/cache/view/ViewCacheProvider;->VIEW_CACHE:Ljava/util/Map;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 47
a=0;//     .local v0, "cacheView":Ljava/lang/ref/WeakReference;, "Ljava/lang/ref/WeakReference<Landroid/view/View;>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 49
a=0;//     .local v1, "curView":Landroid/view/View;
a=0;//     #v1=(Null);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 50
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 51
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .end local v1    # "curView":Landroid/view/View;
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/view/View;
a=0;// 
a=0;//     .restart local v1    # "curView":Landroid/view/View;
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 44
a=0;//     .end local v0    # "cacheView":Ljava/lang/ref/WeakReference;, "Ljava/lang/ref/WeakReference<Landroid/view/View;>;"
a=0;//     .end local v1    # "curView":Landroid/view/View;
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(Boolean);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 53
a=0;//     .restart local v0    # "cacheView":Ljava/lang/ref/WeakReference;, "Ljava/lang/ref/WeakReference<Landroid/view/View;>;"
a=0;//     .restart local v1    # "curView":Landroid/view/View;
a=0;//     :cond_3
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);v1=(Null);v3=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v3, Lcom/twocloo/base/cache/view/ViewCacheProvider;->VIEW_CACHE:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v3, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;J)Landroid/view/View;
a=0;//     .locals 1
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;//     .param p2, "keyCreater"    # Lcom/twocloo/base/cache/KeyCreater;
a=0;//     .param p3, "timeOut"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic get(Ljava/lang/String;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/base/cache/view/ViewCacheProvider;->get(Ljava/lang/String;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/twocloo/base/cache/view/ViewCacheProvider;->get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;J)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0, p1, p2, p3, p4}, Lcom/twocloo/base/cache/view/ViewCacheProvider;->get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;J)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public put(Ljava/lang/String;Landroid/view/View;)Z
a=0;//     .locals 4
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;//     .param p2, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 67
a=0;//     #v1=(Null);
a=0;//     invoke-static {p1}, Lcom/twocloo/base/util/StringUtils;->isBlank(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     .line 72
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 70
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Null);v2=(Boolean);v3=(Uninit);
a=0;//     sget-object v2, Lcom/twocloo/base/cache/view/ViewCacheProvider;->VIEW_CACHE:Ljava/util/Map;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Map;);
a=0;//     new-instance v3, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-direct {v3, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-interface {v2, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 72
a=0;//     .local v0, "weakWiew":Ljava/lang/ref/WeakReference;, "Ljava/lang/ref/WeakReference<Landroid/view/View;>;"
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public put(Ljava/lang/String;Landroid/view/View;Lcom/twocloo/base/cache/Filter;)Z
a=0;//     .locals 1
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;//     .param p2, "view"    # Landroid/view/View;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Landroid/view/View;",
a=0;//             "Lcom/twocloo/base/cache/Filter",
a=0;//             "<",
a=0;//             "Landroid/view/View;",
a=0;//             ">;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     .local p3, "filter":Lcom/twocloo/base/cache/Filter;, "Lcom/twocloo/base/cache/Filter<Landroid/view/View;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, p2, p3, v0}, Lcom/twocloo/base/cache/view/ViewCacheProvider;->put(Ljava/lang/String;Landroid/view/View;Lcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/KeyCreater;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public put(Ljava/lang/String;Landroid/view/View;Lcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/KeyCreater;)Z
a=0;//     .locals 1
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;//     .param p2, "view"    # Landroid/view/View;
a=0;//     .param p4, "keyCreater"    # Lcom/twocloo/base/cache/KeyCreater;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Landroid/view/View;",
a=0;//             "Lcom/twocloo/base/cache/Filter",
a=0;//             "<",
a=0;//             "Landroid/view/View;",
a=0;//             ">;",
a=0;//             "Lcom/twocloo/base/cache/KeyCreater;",
a=0;//             ")Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     .local p3, "filter":Lcom/twocloo/base/cache/Filter;, "Lcom/twocloo/base/cache/Filter<Landroid/view/View;>;"
a=0;//     if-eqz p4, :cond_0
a=0;// 
a=0;//     .line 85
a=0;//     invoke-interface {p4}, Lcom/twocloo/base/cache/KeyCreater;->create()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     .line 87
a=0;//     :cond_0
a=0;//     if-eqz p3, :cond_1
a=0;// 
a=0;//     invoke-interface {p3, p2}, Lcom/twocloo/base/cache/Filter;->accept(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 88
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/twocloo/base/cache/view/ViewCacheProvider;->put(Ljava/lang/String;Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 90
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_2
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic put(Ljava/lang/String;Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p2, Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/twocloo/base/cache/view/ViewCacheProvider;->put(Ljava/lang/String;Landroid/view/View;)Z
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
a=0;//     check-cast p2, Landroid/view/View;
a=0;// 
a=0;//     check-cast p3, Lcom/twocloo/base/cache/Filter;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2, p3}, Lcom/twocloo/base/cache/view/ViewCacheProvider;->put(Ljava/lang/String;Landroid/view/View;Lcom/twocloo/base/cache/Filter;)Z
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
a=0;//     check-cast p2, Landroid/view/View;
a=0;// 
a=0;//     check-cast p3, Lcom/twocloo/base/cache/Filter;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2, p3, p4}, Lcom/twocloo/base/cache/view/ViewCacheProvider;->put(Ljava/lang/String;Landroid/view/View;Lcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/KeyCreater;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
