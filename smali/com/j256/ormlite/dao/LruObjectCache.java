package com.j256.ormlite.dao; class LruObjectCache { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/dao/LruObjectCache;
a=0;// .super Ljava/lang/Object;
a=0;// .source "LruObjectCache.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/j256/ormlite/dao/LruObjectCache$LimitedLinkedHashMap;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final capacity:I
a=0;// 
a=0;// .field private final classMaps:Ljava/util/concurrent/ConcurrentHashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/concurrent/ConcurrentHashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/Object;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(I)V
a=0;//     .locals 1
a=0;//     .param p1, "capacity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 24
a=0;//     #p0=(Reference,Lcom/j256/ormlite/dao/LruObjectCache;);
a=0;//     new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/dao/LruObjectCache;->classMaps:Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     .line 28
a=0;//     iput p1, p0, Lcom/j256/ormlite/dao/LruObjectCache;->capacity:I
a=0;// 
a=0;//     .line 29
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private getMapForClass(Ljava/lang/Class;)Ljava/util/Map;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;)",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/Object;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 110
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/LruObjectCache;->classMaps:Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map;
a=0;// 
a=0;//     .line 111
a=0;//     .local v0, "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/Object;>;"
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 112
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 114
a=0;//     .end local v0    # "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/Object;>;"
a=0;//     :cond_0
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public clear(Ljava/lang/Class;)V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/dao/LruObjectCache;->getMapForClass(Ljava/lang/Class;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 59
a=0;//     .local v0, "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/Object;>;"
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 60
a=0;//     invoke-interface {v0}, Ljava/util/Map;->clear()V
a=0;// 
a=0;//     .line 62
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public clearAll()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/LruObjectCache;->classMaps:Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "i$":Ljava/util/Iterator;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/Iterator;);v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/util/Map;
a=0;// 
a=0;//     .line 66
a=0;//     .local v1, "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/Object;>;"
a=0;//     invoke-interface {v1}, Ljava/util/Map;->clear()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 68
a=0;//     .end local v1    # "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/Object;>;"
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public get(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             "ID:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;TID;)TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     .local p2, "id":Ljava/lang/Object;, "TID;"
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/dao/LruObjectCache;->getMapForClass(Ljava/lang/Class;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 41
a=0;//     .local v2, "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/Object;>;"
a=0;//     #v2=(Reference,Ljava/util/Map;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 42
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 47
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 44
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     invoke-interface {v2, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 46
a=0;//     .local v1, "obj":Ljava/lang/Object;
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 47
a=0;//     .local v0, "castObj":Ljava/lang/Object;, "TT;"
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public put(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             "ID:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;TID;TT;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     .local p2, "id":Ljava/lang/Object;, "TID;"
a=0;//     .local p3, "data":Ljava/lang/Object;, "TT;"
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/dao/LruObjectCache;->getMapForClass(Ljava/lang/Class;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 52
a=0;//     .local v0, "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/Object;>;"
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 53
a=0;//     invoke-interface {v0, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 55
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized registerClass(Ljava/lang/Class;)V
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/LruObjectCache;->classMaps:Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map;
a=0;// 
a=0;//     .line 33
a=0;//     .local v0, "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/Object;>;"
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 34
a=0;//     new-instance v1, Lcom/j256/ormlite/dao/LruObjectCache$LimitedLinkedHashMap;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/j256/ormlite/dao/LruObjectCache$LimitedLinkedHashMap;);
a=0;//     iget v2, p0, Lcom/j256/ormlite/dao/LruObjectCache;->capacity:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {v1, v2}, Lcom/j256/ormlite/dao/LruObjectCache$LimitedLinkedHashMap;-><init>(I)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/LruObjectCache$LimitedLinkedHashMap;);
a=0;//     invoke-static {v1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 35
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/LruObjectCache;->classMaps:Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     invoke-virtual {v1, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 37
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 32
a=0;//     .end local v0    # "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/Object;>;"
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public remove(Ljava/lang/Class;Ljava/lang/Object;)V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             "ID:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;TID;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     .local p2, "id":Ljava/lang/Object;, "TID;"
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/dao/LruObjectCache;->getMapForClass(Ljava/lang/Class;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 72
a=0;//     .local v0, "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/Object;>;"
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 73
a=0;//     invoke-interface {v0, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 75
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public size(Ljava/lang/Class;)I
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;)I"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/dao/LruObjectCache;->getMapForClass(Ljava/lang/Class;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 94
a=0;//     .local v0, "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/Object;>;"
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 95
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 97
a=0;//     :goto_0
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     invoke-interface {v0}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public sizeAll()I
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 103
a=0;//     .local v2, "size":I
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/LruObjectCache;->classMaps:Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "i$":Ljava/util/Iterator;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/Iterator;);v1=(Conflicted);v2=(Integer);v3=(Conflicted);
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/util/Map;
a=0;// 
a=0;//     .line 104
a=0;//     .local v1, "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/Object;>;"
a=0;//     invoke-interface {v1}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 106
a=0;//     .end local v1    # "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/Object;>;"
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v3=(Boolean);
a=0;//     return v2
a=0;// .end method
a=0;// 
a=0;// .method public updateId(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             "ID:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;TID;TID;)TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     .local p2, "oldId":Ljava/lang/Object;, "TID;"
a=0;//     .local p3, "newId":Ljava/lang/Object;, "TID;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 78
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/dao/LruObjectCache;->getMapForClass(Ljava/lang/Class;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 79
a=0;//     .local v2, "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/Object;>;"
a=0;//     #v2=(Reference,Ljava/util/Map;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 89
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 82
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Uninit);
a=0;//     invoke-interface {v2, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 83
a=0;//     .local v1, "obj":Ljava/lang/Object;
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 86
a=0;//     invoke-interface {v2, p3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 88
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 89
a=0;//     .local v0, "castObj":Ljava/lang/Object;, "TT;"
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     goto :goto_0
a=0;// .end method
}}
