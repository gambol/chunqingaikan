package com.lidroid.xutils.util.core; class KeyExpiryMap { void a() { int a;
a=0;// .class public Lcom/lidroid/xutils/util/core/KeyExpiryMap;
a=0;// .super Ljava/util/concurrent/ConcurrentHashMap;
a=0;// .source "KeyExpiryMap.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<K:",
a=0;//         "Ljava/lang/Object;",
a=0;//         "V:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/util/concurrent/ConcurrentHashMap",
a=0;//         "<TK;",
a=0;//         "Ljava/lang/Long;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DEFAULT_CONCURRENCY_LEVEL:I = 0x10
a=0;// 
a=0;// .field private static final serialVersionUID:J = 0x1L
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/KeyExpiryMap;, "Lcom/lidroid/xutils/util/core/KeyExpiryMap<TK;TV;>;"
a=0;//     invoke-direct {p0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V
a=0;// 
a=0;//     .line 48
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/util/core/KeyExpiryMap;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(I)V
a=0;//     .locals 0
a=0;//     .param p1, "initialCapacity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/KeyExpiryMap;, "Lcom/lidroid/xutils/util/core/KeyExpiryMap<TK;TV;>;"
a=0;//     invoke-direct {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V
a=0;// 
a=0;//     .line 44
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/util/core/KeyExpiryMap;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(IF)V
a=0;//     .locals 1
a=0;//     .param p1, "initialCapacity"    # I
a=0;//     .param p2, "loadFactor"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/KeyExpiryMap;, "Lcom/lidroid/xutils/util/core/KeyExpiryMap<TK;TV;>;"
a=0;//     const/16 v0, 0x10
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, p1, p2, v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V
a=0;// 
a=0;//     .line 40
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/util/core/KeyExpiryMap;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(IFI)V
a=0;//     .locals 0
a=0;//     .param p1, "initialCapacity"    # I
a=0;//     .param p2, "loadFactor"    # F
a=0;//     .param p3, "concurrencyLevel"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/KeyExpiryMap;, "Lcom/lidroid/xutils/util/core/KeyExpiryMap<TK;TV;>;"
a=0;//     invoke-direct {p0, p1, p2, p3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/util/core/KeyExpiryMap;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public declared-synchronized clear()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/KeyExpiryMap;, "Lcom/lidroid/xutils/util/core/KeyExpiryMap<TK;TV;>;"
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-super {p0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 88
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 87
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized containsKey(Ljava/lang/Object;)Z
a=0;//     .locals 6
a=0;//     .param p1, "key"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/KeyExpiryMap;, "Lcom/lidroid/xutils/util/core/KeyExpiryMap<TK;TV;>;"
a=0;//     monitor-enter p0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 70
a=0;//     .local v0, "result":Z
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-super {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 71
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-super {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/lang/Long;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Long;->longValue()J
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v1, v2, v4
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gez v1, :cond_1
a=0;// 
a=0;//     .line 72
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 77
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     .line 74
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v0=(Null);v2=(LongLo);v3=(LongHi);v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual {p0, p1}, Lcom/lidroid/xutils/util/core/KeyExpiryMap;->remove(Ljava/lang/Object;)Ljava/lang/Long;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 69
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized get(Ljava/lang/Object;)Ljava/lang/Long;
a=0;//     .locals 1
a=0;//     .param p1, "key"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/KeyExpiryMap;, "Lcom/lidroid/xutils/util/core/KeyExpiryMap<TK;TV;>;"
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0, p1}, Lcom/lidroid/xutils/util/core/KeyExpiryMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 53
a=0;//     invoke-super {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/Long;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 55
a=0;//     :goto_0
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 52
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0, p1}, Lcom/lidroid/xutils/util/core/KeyExpiryMap;->get(Ljava/lang/Object;)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Long;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized put(Ljava/lang/Object;Ljava/lang/Long;)Ljava/lang/Long;
a=0;//     .locals 1
a=0;//     .param p2, "expiryTimestamp"    # Ljava/lang/Long;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TK;",
a=0;//             "Ljava/lang/Long;",
a=0;//             ")",
a=0;//             "Ljava/lang/Long;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/KeyExpiryMap;, "Lcom/lidroid/xutils/util/core/KeyExpiryMap<TK;TV;>;"
a=0;//     .local p1, "key":Ljava/lang/Object;, "TK;"
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0, p1}, Lcom/lidroid/xutils/util/core/KeyExpiryMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 62
a=0;//     invoke-virtual {p0, p1}, Lcom/lidroid/xutils/util/core/KeyExpiryMap;->remove(Ljava/lang/Object;)Ljava/lang/Long;
a=0;// 
a=0;//     .line 64
a=0;//     :cond_0
a=0;//     invoke-super {p0, p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/Long;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 61
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Ljava/lang/Object;
a=0;// 
a=0;//     check-cast p2, Ljava/lang/Long;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/lidroid/xutils/util/core/KeyExpiryMap;->put(Ljava/lang/Object;Ljava/lang/Long;)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Long;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized remove(Ljava/lang/Object;)Ljava/lang/Long;
a=0;//     .locals 1
a=0;//     .param p1, "key"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/KeyExpiryMap;, "Lcom/lidroid/xutils/util/core/KeyExpiryMap<TK;TV;>;"
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-super {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/Long;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0, p1}, Lcom/lidroid/xutils/util/core/KeyExpiryMap;->remove(Ljava/lang/Object;)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Long;);
a=0;//     return-object v0
a=0;// .end method
}}
