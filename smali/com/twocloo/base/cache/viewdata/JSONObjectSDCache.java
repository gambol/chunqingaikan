package com.twocloo.base.cache.viewdata; class JSONObjectSDCache { void a() { int a;
a=0;// .class public Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;
a=0;// .super Lcom/twocloo/base/cache/viewdata/AbsViewDataSDCache;
a=0;// .source "JSONObjectSDCache.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/twocloo/base/cache/viewdata/AbsViewDataSDCache",
a=0;//         "<",
a=0;//         "Lorg/json/JSONObject;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static volatile instance:Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final rootPath:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "path"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     invoke-direct {p0}, Lcom/twocloo/base/cache/viewdata/AbsViewDataSDCache;-><init>()V
a=0;// 
a=0;//     .line 25
a=0;//     #p0=(Reference,Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->getRootPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->rootPath:Ljava/lang/String;
a=0;// 
a=0;//     .line 28
a=0;//     invoke-virtual {p0}, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->available()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 29
a=0;//     iget-object v0, p0, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->rootPath:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0}, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->checkPicPath(Ljava/lang/String;)Z
a=0;// 
a=0;//     .line 31
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private checkPicPath(Ljava/lang/String;)Z
a=0;//     .locals 2
a=0;//     .param p1, "picPath"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 188
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 189
a=0;//     .local v0, "file":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 190
a=0;//     invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 191
a=0;//     :cond_0
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method private cleanFolder(Ljava/lang/String;)V
a=0;//     .locals 5
a=0;//     .param p1, "filePath"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 176
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 177
a=0;//     .local v0, "f":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 178
a=0;//     invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 179
a=0;//     .local v2, "files":[Ljava/io/File;
a=0;//     #v2=(Reference,[Ljava/io/File;);
a=0;//     array-length v4, v2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Integer);
a=0;//     if-lt v3, v4, :cond_1
a=0;// 
a=0;//     .line 182
a=0;//     .end local v2    # "files":[Ljava/io/File;
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 179
a=0;//     .restart local v2    # "files":[Ljava/io/File;
a=0;//     :cond_1
a=0;//     #v2=(Reference,[Ljava/io/File;);v4=(Integer);
a=0;//     aget-object v1, v2, v3
a=0;// 
a=0;//     .line 180
a=0;//     .local v1, "file":Ljava/io/File;
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 179
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getInstance(Ljava/lang/String;)Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;
a=0;//     .locals 2
a=0;//     .param p0, "path"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     sget-object v0, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->instance:Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 40
a=0;//     const-class v1, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 41
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->instance:Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 42
a=0;//     new-instance v0, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;);
a=0;//     sput-object v0, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->instance:Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;
a=0;// 
a=0;//     .line 40
a=0;//     :cond_0
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 46
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->instance:Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 40
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
a=0;// .method public delCache(Ljava/lang/String;)V
a=0;//     .locals 5
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     invoke-static {p1}, Lcom/twocloo/base/util/StorageUtils;->convertUrlToFileName(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 162
a=0;//     .local v2, "key":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v4, p0, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->rootPath:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 163
a=0;//     .local v1, "fileFullName":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 165
a=0;//     .local v0, "cacheFile":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "\u6e05\u9664\u9875\u9762\u6570\u636e\u7f13\u5b58|"
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "|"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 167
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 168
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 170
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic get(Ljava/lang/String;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->get(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;J)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0, p1, p2, p3, p4}, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;J)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public get(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;//     .locals 1
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;)Lorg/json/JSONObject;
a=0;//     .locals 2
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "keyCreater"    # Lcom/twocloo/base/cache/KeyCreater;
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     sget-wide v0, Lcom/twocloo/base/util/StorageUtils;->VIEW_DATA_TIME_OUT:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {p0, p1, p2, v0, v1}, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;J)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;J)Lorg/json/JSONObject;
a=0;//     .locals 14
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "keyCreater"    # Lcom/twocloo/base/cache/KeyCreater;
a=0;//     .param p3, "timeOut"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     invoke-virtual {p0}, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->available()Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-nez v11, :cond_0
a=0;// 
a=0;//     .line 64
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 105
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Reference,Lorg/json/JSONObject;);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     return-object v6
a=0;// 
a=0;//     .line 66
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Boolean);v12=(Uninit);v13=(Uninit);
a=0;//     invoke-static {p1}, Lcom/twocloo/base/util/StringUtils;->isBlank(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     if-eqz v11, :cond_1
a=0;// 
a=0;//     .line 67
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 69
a=0;//     :cond_1
a=0;//     #v6=(Uninit);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 71
a=0;//     .local v5, "fileName":Ljava/lang/String;
a=0;//     #v5=(Null);
a=0;//     if-eqz p2, :cond_3
a=0;// 
a=0;//     .line 72
a=0;//     invoke-interface/range {p2 .. p2}, Lcom/twocloo/base/cache/KeyCreater;->create()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 76
a=0;//     :goto_1
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v12, p0, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->rootPath:Ljava/lang/String;
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v12}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 78
a=0;//     .local v4, "fileFullName":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 80
a=0;//     .local v6, "jo":Lorg/json/JSONObject;
a=0;//     #v6=(Null);
a=0;//     invoke-static {v4}, Lcom/twocloo/base/util/StorageUtils;->exists(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 82
a=0;//     .local v3, "exists":Z
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 83
a=0;//     invoke-static {v4}, Lcom/twocloo/base/util/StorageUtils;->laftFileTime(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v8
a=0;// 
a=0;//     .line 84
a=0;//     .local v8, "time":J
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 86
a=0;//     .local v0, "curTime":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v11, 0x0
a=0;// 
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     cmp-long v11, v8, v11
a=0;// 
a=0;//     #v11=(Byte);
a=0;//     if-eqz v11, :cond_4
a=0;// 
a=0;//     sub-long v11, v0, v8
a=0;// 
a=0;//     #v11=(LongLo);
a=0;//     cmp-long v11, v11, p3
a=0;// 
a=0;//     #v11=(Byte);
a=0;//     if-lez v11, :cond_4
a=0;// 
a=0;//     .line 87
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, "ViewDataCache\u7f13\u5b58\u8d85\u65f6\uff0c\u6e05\u7406\uff01"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sub-long v12, v0, v8
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     invoke-virtual {v11, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     const-string v12, "|"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-static {v11}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 88
a=0;//     invoke-static {v4}, Lcom/twocloo/base/util/StorageUtils;->delete(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 100
a=0;//     .end local v0    # "curTime":J
a=0;//     .end local v8    # "time":J
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v6=(Reference,Lorg/json/JSONObject;);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     if-nez v6, :cond_5
a=0;// 
a=0;//     .line 101
a=0;//     const-string v11, "ViewDataCache\u7f13\u5b58\u4e3a\u7a7a\uff0c\u4ece\u7f51\u7edc\u52a0\u8f7d"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v11}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 74
a=0;//     .end local v3    # "exists":Z
a=0;//     .end local v4    # "fileFullName":Ljava/lang/String;
a=0;//     .end local v6    # "jo":Lorg/json/JSONObject;
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Null);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Boolean);v12=(Uninit);v13=(Uninit);
a=0;//     invoke-static {p1}, Lcom/twocloo/base/util/StorageUtils;->convertUrlToFileName(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 90
a=0;//     .restart local v0    # "curTime":J
a=0;//     .restart local v3    # "exists":Z
a=0;//     .restart local v4    # "fileFullName":Ljava/lang/String;
a=0;//     .restart local v6    # "jo":Lorg/json/JSONObject;
a=0;//     .restart local v8    # "time":J
a=0;//     :cond_4
a=0;//     #v0=(LongLo);v1=(LongHi);v3=(Boolean);v4=(Reference,Ljava/lang/String;);v6=(Null);v8=(LongLo);v9=(LongHi);v11=(Byte);v12=(LongHi);
a=0;//     invoke-static {v4}, Lcom/twocloo/base/util/StorageUtils;->read(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 92
a=0;//     .local v10, "viewData":Ljava/lang/String;
a=0;//     :try_start_0
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v10}, Lcom/twocloo/base/util/StringUtils;->isNotBlank(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-eqz v11, :cond_2
a=0;// 
a=0;//     .line 93
a=0;//     new-instance v7, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v7=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v7, v10}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .end local v6    # "jo":Lorg/json/JSONObject;
a=0;//     .local v7, "jo":Lorg/json/JSONObject;
a=0;//     #v7=(Reference,Lorg/json/JSONObject;);
a=0;//     move-object v6, v7
a=0;// 
a=0;//     .line 94
a=0;//     .end local v7    # "jo":Lorg/json/JSONObject;
a=0;//     .restart local v6    # "jo":Lorg/json/JSONObject;
a=0;//     #v6=(Reference,Lorg/json/JSONObject;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_0
a=0;//     #v6=(Null);v7=(Conflicted);v11=(Byte);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 95
a=0;//     .local v2, "e":Lorg/json/JSONException;
a=0;//     #v2=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v2}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v11, v2}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 103
a=0;//     .end local v0    # "curTime":J
a=0;//     .end local v2    # "e":Lorg/json/JSONException;
a=0;//     .end local v8    # "time":J
a=0;//     .end local v10    # "viewData":Ljava/lang/String;
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v6=(Reference,Lorg/json/JSONObject;);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, "ViewDataCache\u4ece\u7f13\u5b58\u53d6|"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v11, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     const-string v12, "|"
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     const-string v12, "|"
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-static {v11}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic put(Ljava/lang/String;Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p2, Lorg/json/JSONObject;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->put(Ljava/lang/String;Lorg/json/JSONObject;)Z
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
a=0;//     check-cast p2, Lorg/json/JSONObject;
a=0;// 
a=0;//     check-cast p3, Lcom/twocloo/base/cache/Filter;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2, p3}, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->put(Ljava/lang/String;Lorg/json/JSONObject;Lcom/twocloo/base/cache/Filter;)Z
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
a=0;//     check-cast p2, Lorg/json/JSONObject;
a=0;// 
a=0;//     check-cast p3, Lcom/twocloo/base/cache/Filter;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2, p3, p4}, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->put(Ljava/lang/String;Lorg/json/JSONObject;Lcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/KeyCreater;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public put(Ljava/lang/String;Lorg/json/JSONObject;)Z
a=0;//     .locals 1
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "viewData"    # Lorg/json/JSONObject;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 112
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, p2, v0, v0}, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->put(Ljava/lang/String;Lorg/json/JSONObject;Lcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/KeyCreater;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public put(Ljava/lang/String;Lorg/json/JSONObject;Lcom/twocloo/base/cache/Filter;)Z
a=0;//     .locals 1
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "viewData"    # Lorg/json/JSONObject;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lorg/json/JSONObject;",
a=0;//             "Lcom/twocloo/base/cache/Filter",
a=0;//             "<",
a=0;//             "Lorg/json/JSONObject;",
a=0;//             ">;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 119
a=0;//     .local p3, "filter":Lcom/twocloo/base/cache/Filter;, "Lcom/twocloo/base/cache/Filter<Lorg/json/JSONObject;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, p2, p3, v0}, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->put(Ljava/lang/String;Lorg/json/JSONObject;Lcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/KeyCreater;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public put(Ljava/lang/String;Lorg/json/JSONObject;Lcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/KeyCreater;)Z
a=0;//     .locals 7
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "viewData"    # Lorg/json/JSONObject;
a=0;//     .param p4, "keyCreater"    # Lcom/twocloo/base/cache/KeyCreater;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lorg/json/JSONObject;",
a=0;//             "Lcom/twocloo/base/cache/Filter",
a=0;//             "<",
a=0;//             "Lorg/json/JSONObject;",
a=0;//             ">;",
a=0;//             "Lcom/twocloo/base/cache/KeyCreater;",
a=0;//             ")Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p3, "filter":Lcom/twocloo/base/cache/Filter;, "Lcom/twocloo/base/cache/Filter<Lorg/json/JSONObject;>;"
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 124
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->available()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 149
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 127
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(Boolean);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-static {p1}, Lcom/twocloo/base/util/StringUtils;->isBlank(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 130
a=0;//     if-eqz p3, :cond_2
a=0;// 
a=0;//     invoke-interface {p3, p2}, Lcom/twocloo/base/cache/Filter;->accept(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 134
a=0;//     :cond_2
a=0;//     const-wide/32 v3, 0xa00000
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->getAvailableMemorySize()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     cmp-long v3, v3, v5
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_3
a=0;// 
a=0;//     .line 135
a=0;//     iget-object v3, p0, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->rootPath:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v3}, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->cleanFolder(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 137
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 139
a=0;//     .local v1, "key":Ljava/lang/String;
a=0;//     #v1=(Null);
a=0;//     if-eqz p4, :cond_4
a=0;// 
a=0;//     .line 140
a=0;//     invoke-interface {p4}, Lcom/twocloo/base/cache/KeyCreater;->create()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 144
a=0;//     :goto_1
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v4, p0, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->rootPath:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 145
a=0;//     .local v0, "fileFullName":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3, v0}, Lcom/twocloo/base/util/StorageUtils;->write(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 147
a=0;//     .local v2, "result":Z
a=0;//     #v2=(Boolean);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "ViewDataCache\u653e\u5165\u7f13\u5b58|"
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "|"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "|"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 142
a=0;//     .end local v0    # "fileFullName":Ljava/lang/String;
a=0;//     .end local v2    # "result":Z
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v1=(Null);v2=(Null);v3=(Conflicted);v4=(LongHi);
a=0;//     invoke-static {p1}, Lcom/twocloo/base/util/StorageUtils;->convertUrlToFileName(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public rename(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 4
a=0;//     .param p1, "fromFileName"    # Ljava/lang/String;
a=0;//     .param p2, "toFileName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 153
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p0, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->rootPath:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 154
a=0;//     .local v0, "fromFile":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 155
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p0, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->rootPath:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 156
a=0;//     .local v1, "toFile":Ljava/io/File;
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
a=0;// 
a=0;//     .line 158
a=0;//     .end local v1    # "toFile":Ljava/io/File;
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
