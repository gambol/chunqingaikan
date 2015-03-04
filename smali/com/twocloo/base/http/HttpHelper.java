package com.twocloo.base.http; class HttpHelper { void a() { int a;
a=0;// .class public Lcom/twocloo/base/http/HttpHelper;
a=0;// .super Ljava/lang/Object;
a=0;// .source "HttpHelper.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final TWOCLOO_VIEW_DATA_CACHE_ABS:Ljava/lang/String;
a=0;// 
a=0;// .field public static final cache:Lcom/twocloo/base/cache/lru/DiskLruCache;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/twocloo/base/cache/lru/DiskLruCache",
a=0;//             "<",
a=0;//             "Lorg/json/JSONObject;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "/2cloo/viewdataCache/"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/twocloo/base/http/HttpHelper;->TWOCLOO_VIEW_DATA_CACHE_ABS:Ljava/lang/String;
a=0;// 
a=0;//     .line 29
a=0;//     new-instance v0, Lcom/twocloo/base/cache/lru/JsonDiskLruCache;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/base/cache/lru/JsonDiskLruCache;);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     sget-object v2, Lcom/twocloo/base/http/HttpHelper;->TWOCLOO_VIEW_DATA_CACHE_ABS:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-direct {v0, v1}, Lcom/twocloo/base/cache/lru/JsonDiskLruCache;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/cache/lru/JsonDiskLruCache;);
a=0;//     sput-object v0, Lcom/twocloo/base/http/HttpHelper;->cache:Lcom/twocloo/base/cache/lru/DiskLruCache;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/http/HttpHelper;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static get(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Class;)Ljava/lang/Object;
a=0;//     .locals 3
a=0;//     .param p0, "url"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;)TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     .local p1, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     .local p2, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     invoke-static {p0, p1}, Lcom/twocloo/base/http/HttpHelper;->get(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 61
a=0;//     .local v1, "result":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/twocloo/base/util/StringUtils;->isBlank(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 62
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 66
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 64
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-static {v1, p2}, Lcom/twocloo/base/util/JsonUtils;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 66
a=0;//     .local v0, "obj":Ljava/lang/Object;, "TT;"
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static get(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
a=0;//     .locals 8
a=0;//     .param p0, "url"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p1, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 121
a=0;//     #v5=(Null);
a=0;//     invoke-static {}, Lcom/twocloo/base/common/CommonApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/app/Application;);
a=0;//     invoke-static {v6}, Lcom/twocloo/base/util/NetUtils;->checkNet(Landroid/content/Context;)Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 123
a=0;//     .local v3, "netType":Lcom/twocloo/base/common/NetType;
a=0;//     #v3=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v6, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 124
a=0;//     const-string v6, "\u65e0\u7f51\u7edc\uff0c\u4e0d\u53d1\u9001\u7f51\u7edc\u8bf7\u6c42"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .line 146
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Reference,Ljava/lang/String;);v7=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 128
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);v6=(Boolean);v7=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 129
a=0;//     .local v1, "httpProvider":Lcom/twocloo/base/http/HttpProvider;
a=0;//     #v1=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 132
a=0;//     .local v4, "result":Ljava/lang/String;
a=0;//     :try_start_0
a=0;//     #v4=(Null);
a=0;//     invoke-static {}, Lcom/twocloo/base/http/HttpProvider;->newInstance()Lcom/twocloo/base/http/HttpProvider;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 133
a=0;//     #v1=(Reference,Lcom/twocloo/base/http/HttpProvider;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const-string v7, "utf-8"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, p0, v6, p1, v7}, Lcom/twocloo/base/http/HttpProvider;->get(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)Lcom/twocloo/base/http/HttpResult;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 134
a=0;//     .local v2, "httpResult":Lcom/twocloo/base/http/HttpResult;
a=0;//     #v2=(Reference,Lcom/twocloo/base/http/HttpResult;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/base/http/HttpResult;->httpEntityContent()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 141
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 142
a=0;//     invoke-virtual {v1}, Lcom/twocloo/base/http/HttpProvider;->shutdown()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 138
a=0;//     .end local v2    # "httpResult":Lcom/twocloo/base/http/HttpResult;
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v4=(Null);v6=(Boolean);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 139
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 141
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 142
a=0;//     invoke-virtual {v1}, Lcom/twocloo/base/http/HttpProvider;->shutdown()V
a=0;// 
a=0;//     :cond_2
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .line 146
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 140
a=0;//     .end local v0    # "e":Ljava/lang/Throwable;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     .line 141
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 142
a=0;//     invoke-virtual {v1}, Lcom/twocloo/base/http/HttpProvider;->shutdown()V
a=0;// 
a=0;//     .line 144
a=0;//     :cond_3
a=0;//     throw v5
a=0;// .end method
a=0;// 
a=0;// .method public static getWithCache(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p0, "url"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 111
a=0;//     .local p1, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static post(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Class;)Ljava/lang/Object;
a=0;//     .locals 3
a=0;//     .param p0, "url"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;)TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     .local p1, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     .local p2, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     invoke-static {p0, p1}, Lcom/twocloo/base/http/HttpHelper;->post(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 42
a=0;//     .local v1, "result":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/twocloo/base/util/StringUtils;->isBlank(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 43
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 47
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 45
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-static {v1, p2}, Lcom/twocloo/base/util/JsonUtils;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 47
a=0;//     .local v0, "obj":Ljava/lang/Object;, "TT;"
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static post(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
a=0;//     .locals 8
a=0;//     .param p0, "url"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p1, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 76
a=0;//     #v5=(Null);
a=0;//     invoke-static {}, Lcom/twocloo/base/common/CommonApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/app/Application;);
a=0;//     invoke-static {v6}, Lcom/twocloo/base/util/NetUtils;->checkNet(Landroid/content/Context;)Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 78
a=0;//     .local v3, "netType":Lcom/twocloo/base/common/NetType;
a=0;//     #v3=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v6, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 79
a=0;//     const-string v6, "\u65e0\u7f51\u7edc\uff0c\u4e0d\u53d1\u9001\u7f51\u7edc\u8bf7\u6c42"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .line 101
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Reference,Ljava/lang/String;);v7=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 83
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);v6=(Boolean);v7=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 84
a=0;//     .local v1, "httpProvider":Lcom/twocloo/base/http/HttpProvider;
a=0;//     #v1=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 87
a=0;//     .local v4, "result":Ljava/lang/String;
a=0;//     :try_start_0
a=0;//     #v4=(Null);
a=0;//     invoke-static {}, Lcom/twocloo/base/http/HttpProvider;->newInstance()Lcom/twocloo/base/http/HttpProvider;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 88
a=0;//     #v1=(Reference,Lcom/twocloo/base/http/HttpProvider;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const-string v7, "utf-8"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, p0, v6, p1, v7}, Lcom/twocloo/base/http/HttpProvider;->post(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)Lcom/twocloo/base/http/HttpResult;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 89
a=0;//     .local v2, "httpResult":Lcom/twocloo/base/http/HttpResult;
a=0;//     #v2=(Reference,Lcom/twocloo/base/http/HttpResult;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/base/http/HttpResult;->httpEntityContent()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 96
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 97
a=0;//     invoke-virtual {v1}, Lcom/twocloo/base/http/HttpProvider;->shutdown()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 93
a=0;//     .end local v2    # "httpResult":Lcom/twocloo/base/http/HttpResult;
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v4=(Null);v6=(Boolean);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 94
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 96
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 97
a=0;//     invoke-virtual {v1}, Lcom/twocloo/base/http/HttpProvider;->shutdown()V
a=0;// 
a=0;//     :cond_2
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .line 101
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 95
a=0;//     .end local v0    # "e":Ljava/lang/Throwable;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     .line 96
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 97
a=0;//     invoke-virtual {v1}, Lcom/twocloo/base/http/HttpProvider;->shutdown()V
a=0;// 
a=0;//     .line 99
a=0;//     :cond_3
a=0;//     throw v5
a=0;// .end method
}}
