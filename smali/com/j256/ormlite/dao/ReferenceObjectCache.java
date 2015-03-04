package com.j256.ormlite.dao; class ReferenceObjectCache { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/dao/ReferenceObjectCache;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ReferenceObjectCache.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;// 
a=0;// # instance fields
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
a=0;//             "Ljava/lang/ref/Reference",
a=0;//             "<",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;>;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final useWeak:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "useWeak"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 20
a=0;//     #p0=(Reference,Lcom/j256/ormlite/dao/ReferenceObjectCache;);
a=0;//     new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/dao/ReferenceObjectCache;->classMaps:Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     .line 30
a=0;//     iput-boolean p1, p0, Lcom/j256/ormlite/dao/ReferenceObjectCache;->useWeak:Z
a=0;// 
a=0;//     .line 31
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private cleanMap(Ljava/util/Map;)V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/Object;",
a=0;//             "Ljava/lang/ref/Reference",
a=0;//             "<",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 158
a=0;//     .local p1, "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/ref/Reference<Ljava/lang/Object;>;>;"
a=0;//     invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 159
a=0;//     .local v0, "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/util/Map$Entry<Ljava/lang/Object;Ljava/lang/ref/Reference<Ljava/lang/Object;>;>;>;"
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 160
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/util/Map$Entry;
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/ref/Reference;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 161
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->remove()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 164
a=0;//     :cond_1
a=0;//     #v1=(Boolean);
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
a=0;//             "Ljava/lang/ref/Reference",
a=0;//             "<",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 167
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/ReferenceObjectCache;->classMaps:Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map;
a=0;// 
a=0;//     .line 168
a=0;//     .local v0, "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/ref/Reference<Ljava/lang/Object;>;>;"
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 169
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 171
a=0;//     .end local v0    # "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/ref/Reference<Ljava/lang/Object;>;>;"
a=0;//     :cond_0
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static makeSoftCache()Lcom/j256/ormlite/dao/ReferenceObjectCache;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     new-instance v0, Lcom/j256/ormlite/dao/ReferenceObjectCache;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/dao/ReferenceObjectCache;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, v1}, Lcom/j256/ormlite/dao/ReferenceObjectCache;-><init>(Z)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/ReferenceObjectCache;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static makeWeakCache()Lcom/j256/ormlite/dao/ReferenceObjectCache;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     new-instance v0, Lcom/j256/ormlite/dao/ReferenceObjectCache;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/dao/ReferenceObjectCache;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-direct {v0, v1}, Lcom/j256/ormlite/dao/ReferenceObjectCache;-><init>(Z)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/ReferenceObjectCache;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public cleanNullReferences(Ljava/lang/Class;)V
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
a=0;//     .line 142
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/dao/ReferenceObjectCache;->getMapForClass(Ljava/lang/Class;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 143
a=0;//     .local v0, "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/ref/Reference<Ljava/lang/Object;>;>;"
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 144
a=0;//     invoke-direct {p0, v0}, Lcom/j256/ormlite/dao/ReferenceObjectCache;->cleanMap(Ljava/util/Map;)V
a=0;// 
a=0;//     .line 146
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public cleanNullReferencesAll()V
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">()V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/ReferenceObjectCache;->classMaps:Ljava/util/concurrent/ConcurrentHashMap;
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
a=0;//     .line 153
a=0;//     .local v1, "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/ref/Reference<Ljava/lang/Object;>;>;"
a=0;//     invoke-direct {p0, v1}, Lcom/j256/ormlite/dao/ReferenceObjectCache;->cleanMap(Ljava/util/Map;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 155
a=0;//     .end local v1    # "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/ref/Reference<Ljava/lang/Object;>;>;"
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
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
a=0;//     .line 87
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/dao/ReferenceObjectCache;->getMapForClass(Ljava/lang/Class;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 88
a=0;//     .local v0, "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/ref/Reference<Ljava/lang/Object;>;>;"
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 89
a=0;//     invoke-interface {v0}, Ljava/util/Map;->clear()V
a=0;// 
a=0;//     .line 91
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public clearAll()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/ReferenceObjectCache;->classMaps:Ljava/util/concurrent/ConcurrentHashMap;
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
a=0;//     .line 95
a=0;//     .local v1, "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/ref/Reference<Ljava/lang/Object;>;>;"
a=0;//     invoke-interface {v1}, Ljava/util/Map;->clear()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 97
a=0;//     .end local v1    # "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/ref/Reference<Ljava/lang/Object;>;>;"
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public get(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 4
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
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     .local p2, "id":Ljava/lang/Object;, "TID;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 56
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/dao/ReferenceObjectCache;->getMapForClass(Ljava/lang/Class;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 57
a=0;//     .local v2, "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/ref/Reference<Ljava/lang/Object;>;>;"
a=0;//     #v2=(Reference,Ljava/util/Map;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 71
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);v1=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 60
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Uninit);v3=(Uninit);
a=0;//     invoke-interface {v2, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Ljava/lang/ref/Reference;
a=0;// 
a=0;//     .line 61
a=0;//     .local v3, "ref":Ljava/lang/ref/Reference;, "Ljava/lang/ref/Reference<Ljava/lang/Object;>;"
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 64
a=0;//     invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 65
a=0;//     .local v1, "obj":Ljava/lang/Object;
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 66
a=0;//     invoke-interface {v2, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 70
a=0;//     :cond_2
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 71
a=0;//     .local v0, "castObj":Ljava/lang/Object;, "TT;"
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public put(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 2
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
a=0;//     .line 76
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     .local p2, "id":Ljava/lang/Object;, "TID;"
a=0;//     .local p3, "data":Ljava/lang/Object;, "TT;"
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/dao/ReferenceObjectCache;->getMapForClass(Ljava/lang/Class;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 77
a=0;//     .local v0, "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/ref/Reference<Ljava/lang/Object;>;>;"
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 78
a=0;//     iget-boolean v1, p0, Lcom/j256/ormlite/dao/ReferenceObjectCache;->useWeak:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 79
a=0;//     new-instance v1, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-direct {v1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-interface {v0, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 84
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 81
a=0;//     :cond_1
a=0;//     #v1=(Boolean);
a=0;//     new-instance v1, Ljava/lang/ref/SoftReference;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/ref/SoftReference;);
a=0;//     invoke-direct {v1, p3}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ref/SoftReference;);
a=0;//     invoke-interface {v0, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized registerClass(Ljava/lang/Class;)V
a=0;//     .locals 2
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
a=0;//     .line 48
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/ReferenceObjectCache;->classMaps:Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map;
a=0;// 
a=0;//     .line 49
a=0;//     .local v0, "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/ref/Reference<Ljava/lang/Object;>;>;"
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 50
a=0;//     new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     .end local v0    # "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/ref/Reference<Ljava/lang/Object;>;>;"
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V
a=0;// 
a=0;//     .line 51
a=0;//     .restart local v0    # "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/ref/Reference<Ljava/lang/Object;>;>;"
a=0;//     #v0=(Reference,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/ReferenceObjectCache;->classMaps:Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     invoke-virtual {v1, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 53
a=0;//     :cond_0
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 48
a=0;//     .end local v0    # "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/ref/Reference<Ljava/lang/Object;>;>;"
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
a=0;//     .line 100
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     .local p2, "id":Ljava/lang/Object;, "TID;"
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/dao/ReferenceObjectCache;->getMapForClass(Ljava/lang/Class;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 101
a=0;//     .local v0, "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/ref/Reference<Ljava/lang/Object;>;>;"
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 102
a=0;//     invoke-interface {v0, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 104
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
a=0;//     .line 122
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/dao/ReferenceObjectCache;->getMapForClass(Ljava/lang/Class;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 123
a=0;//     .local v0, "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/ref/Reference<Ljava/lang/Object;>;>;"
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 124
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 126
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
a=0;//     .line 131
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 132
a=0;//     .local v2, "size":I
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/ReferenceObjectCache;->classMaps:Ljava/util/concurrent/ConcurrentHashMap;
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
a=0;//     .line 133
a=0;//     .local v1, "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/ref/Reference<Ljava/lang/Object;>;>;"
a=0;//     invoke-interface {v1}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 135
a=0;//     .end local v1    # "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/ref/Reference<Ljava/lang/Object;>;>;"
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
a=0;//     .line 107
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/dao/ReferenceObjectCache;->getMapForClass(Ljava/lang/Class;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 108
a=0;//     .local v1, "objectMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/ref/Reference<Ljava/lang/Object;>;>;"
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 118
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 111
a=0;//     :cond_1
a=0;//     #v0=(Null);v2=(Uninit);
a=0;//     invoke-interface {v1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Ljava/lang/ref/Reference;
a=0;// 
a=0;//     .line 112
a=0;//     .local v2, "ref":Ljava/lang/ref/Reference;, "Ljava/lang/ref/Reference<Ljava/lang/Object;>;"
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 115
a=0;//     invoke-interface {v1, p3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 117
a=0;//     invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 118
a=0;//     .local v0, "castObj":Ljava/lang/Object;, "TT;"
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     goto :goto_0
a=0;// .end method
}}
