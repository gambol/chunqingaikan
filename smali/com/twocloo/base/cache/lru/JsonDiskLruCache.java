package com.twocloo.base.cache.lru; class JsonDiskLruCache { void a() { int a;
a=0;// .class public Lcom/twocloo/base/cache/lru/JsonDiskLruCache;
a=0;// .super Lcom/twocloo/base/cache/lru/DiskLruCache;
a=0;// .source "JsonDiskLruCache.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/twocloo/base/cache/lru/DiskLruCache",
a=0;//         "<",
a=0;//         "Lorg/json/JSONObject;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/io/File;)V
a=0;//     .locals 0
a=0;//     .param p1, "cacheDir"    # Ljava/io/File;
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/base/cache/lru/DiskLruCache;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     .line 21
a=0;//     #p0=(Reference,Lcom/twocloo/base/cache/lru/JsonDiskLruCache;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/io/File;I)V
a=0;//     .locals 2
a=0;//     .param p1, "cacheDir"    # Ljava/io/File;
a=0;//     .param p2, "maxItemSize"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     int-to-long v0, p2
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-direct {p0, p1, v0, v1}, Lcom/twocloo/base/cache/lru/DiskLruCache;-><init>(Ljava/io/File;J)V
a=0;// 
a=0;//     .line 29
a=0;//     #p0=(Reference,Lcom/twocloo/base/cache/lru/JsonDiskLruCache;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/io/File;J)V
a=0;//     .locals 0
a=0;//     .param p1, "cacheDir"    # Ljava/io/File;
a=0;//     .param p2, "maxByteSize"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/twocloo/base/cache/lru/DiskLruCache;-><init>(Ljava/io/File;J)V
a=0;// 
a=0;//     .line 25
a=0;//     #p0=(Reference,Lcom/twocloo/base/cache/lru/JsonDiskLruCache;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/io/File;JI)V
a=0;//     .locals 2
a=0;//     .param p1, "cacheDir"    # Ljava/io/File;
a=0;//     .param p2, "maxByteSize"    # J
a=0;//     .param p4, "maxItemSize"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     int-to-long v0, p4
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-direct {p0, p1, v0, v1}, Lcom/twocloo/base/cache/lru/DiskLruCache;-><init>(Ljava/io/File;J)V
a=0;// 
a=0;//     .line 33
a=0;//     #p0=(Reference,Lcom/twocloo/base/cache/lru/JsonDiskLruCache;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected bridge synthetic readFromFile(Ljava/lang/String;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Throwable;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/base/cache/lru/JsonDiskLruCache;->readFromFile(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected readFromFile(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;//     .locals 4
a=0;//     .param p1, "file"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Throwable;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 54
a=0;//     .local v1, "reader":Ljava/io/Reader;
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     new-instance v2, Ljava/io/FileReader;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileReader;);
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-direct {v2, v3}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 55
a=0;//     .end local v1    # "reader":Ljava/io/Reader;
a=0;//     .local v2, "reader":Ljava/io/Reader;
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Ljava/io/FileReader;);
a=0;//     invoke-static {v2}, Lcom/twocloo/base/util/FileUtils;->readString(Ljava/io/Reader;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 57
a=0;//     .local v0, "json":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v3, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 59
a=0;//     #v3=(Reference,Lorg/json/JSONObject;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 60
a=0;//     invoke-virtual {v2}, Ljava/io/Reader;->close()V
a=0;// 
a=0;//     .line 57
a=0;//     :cond_0
a=0;//     return-object v3
a=0;// 
a=0;//     .line 58
a=0;//     .end local v0    # "json":Ljava/lang/String;
a=0;//     .end local v2    # "reader":Ljava/io/Reader;
a=0;//     .restart local v1    # "reader":Ljava/io/Reader;
a=0;//     :catchall_0
a=0;//     #v0=(Uninit);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 59
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/io/FileReader;);v3=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 60
a=0;//     invoke-virtual {v1}, Ljava/io/Reader;->close()V
a=0;// 
a=0;//     .line 62
a=0;//     :cond_1
a=0;//     throw v3
a=0;// 
a=0;//     .line 58
a=0;//     .end local v1    # "reader":Ljava/io/Reader;
a=0;//     .restart local v2    # "reader":Ljava/io/Reader;
a=0;//     :catchall_1
a=0;//     #v1=(Null);v2=(Reference,Ljava/io/FileReader;);v3=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .end local v2    # "reader":Ljava/io/Reader;
a=0;//     .restart local v1    # "reader":Ljava/io/Reader;
a=0;//     #v1=(Reference,Ljava/io/FileReader;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected bridge synthetic writeToFile(Ljava/lang/Object;Ljava/lang/String;)Z
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Throwable;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Lorg/json/JSONObject;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/twocloo/base/cache/lru/JsonDiskLruCache;->writeToFile(Lorg/json/JSONObject;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected writeToFile(Lorg/json/JSONObject;Ljava/lang/String;)Z
a=0;//     .locals 2
a=0;//     .param p1, "obj"    # Lorg/json/JSONObject;
a=0;//     .param p2, "file"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Throwable;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 40
a=0;//     .local v0, "out":Ljava/io/Writer;
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Lcom/twocloo/base/util/FileUtils;->write(Ljava/lang/String;Ljava/io/Writer;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 43
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 44
a=0;//     invoke-virtual {v0}, Ljava/io/Writer;->close()V
a=0;// 
a=0;//     .line 41
a=0;//     :cond_0
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     return v1
a=0;// 
a=0;//     .line 42
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 43
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 44
a=0;//     invoke-virtual {v0}, Ljava/io/Writer;->close()V
a=0;// 
a=0;//     .line 45
a=0;//     :cond_1
a=0;//     throw v1
a=0;// .end method
}}
