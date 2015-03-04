package com.j256.ormlite.dao; class LazyForeignCollection { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/dao/LazyForeignCollection;
a=0;// .super Lcom/j256/ormlite/dao/BaseForeignCollection;
a=0;// .source "LazyForeignCollection.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/j256/ormlite/dao/ForeignCollection;
a=0;// .implements Ljava/io/Serializable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T:",
a=0;//         "Ljava/lang/Object;",
a=0;//         "ID:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Lcom/j256/ormlite/dao/BaseForeignCollection",
a=0;//         "<TT;TID;>;",
a=0;//         "Lcom/j256/ormlite/dao/ForeignCollection",
a=0;//         "<TT;>;",
a=0;//         "Ljava/io/Serializable;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final serialVersionUID:J = -0x4bc855175671af79L
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private transient lastIterator:Lcom/j256/ormlite/dao/CloseableIterator;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/dao/CloseableIterator",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/j256/ormlite/dao/Dao;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Z)V
a=0;//     .locals 0
a=0;//     .param p2, "parent"    # Ljava/lang/Object;
a=0;//     .param p3, "parentId"    # Ljava/lang/Object;
a=0;//     .param p4, "columnName"    # Ljava/lang/String;
a=0;//     .param p5, "orderColumn"    # Ljava/lang/String;
a=0;//     .param p6, "orderAscending"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/dao/Dao",
a=0;//             "<TT;TID;>;",
a=0;//             "Ljava/lang/Object;",
a=0;//             "Ljava/lang/Object;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Z)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/LazyForeignCollection;, "Lcom/j256/ormlite/dao/LazyForeignCollection<TT;TID;>;"
a=0;//     .local p1, "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;TID;>;"
a=0;//     invoke-direct/range {p0 .. p6}, Lcom/j256/ormlite/dao/BaseForeignCollection;-><init>(Lcom/j256/ormlite/dao/Dao;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Z)V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Lcom/j256/ormlite/dao/LazyForeignCollection;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public closeLastIterator()V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/LazyForeignCollection;, "Lcom/j256/ormlite/dao/LazyForeignCollection<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/LazyForeignCollection;->lastIterator:Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/CloseableIterator;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 95
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/LazyForeignCollection;->lastIterator:Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/CloseableIterator;->close()V
a=0;// 
a=0;//     .line 96
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/dao/LazyForeignCollection;->lastIterator:Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     .line 98
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/CloseableIterator;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public closeableIterator()Lcom/j256/ormlite/dao/CloseableIterator;
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/dao/CloseableIterator",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/LazyForeignCollection;, "Lcom/j256/ormlite/dao/LazyForeignCollection<TT;TID;>;"
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/LazyForeignCollection;->iteratorThrow()Lcom/j256/ormlite/dao/CloseableIterator;
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/CloseableIterator;);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 51
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 52
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Could not build lazy iterator for "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/LazyForeignCollection;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     invoke-interface {v3}, Lcom/j256/ormlite/dao/Dao;->getDataClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public contains(Ljava/lang/Object;)Z
a=0;//     .locals 3
a=0;//     .param p1, "obj"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 136
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/LazyForeignCollection;, "Lcom/j256/ormlite/dao/LazyForeignCollection<TT;TID;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/LazyForeignCollection;->iterator()Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 138
a=0;//     .local v0, "iterator":Lcom/j256/ormlite/dao/CloseableIterator;, "Lcom/j256/ormlite/dao/CloseableIterator<TT;>;"
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/CloseableIterator;);v1=(Conflicted);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/CloseableIterator;->hasNext()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 139
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/CloseableIterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 140
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 146
a=0;//     :try_start_1
a=0;//     #v1=(One);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/CloseableIterator;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 149
a=0;//     :goto_0
a=0;//     #v1=(Boolean);v2=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 143
a=0;//     :cond_1
a=0;//     #v2=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 146
a=0;//     :try_start_2
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/CloseableIterator;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/sql/SQLException; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 147
a=0;//     :catch_0
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/sql/SQLException;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 145
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 146
a=0;//     :try_start_3
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/CloseableIterator;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/sql/SQLException; {:try_start_3 .. :try_end_3} :catch_2
a=0;// 
a=0;//     .line 149
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     throw v1
a=0;// 
a=0;//     .line 147
a=0;//     :catch_1
a=0;//     #v1=(One);v2=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/sql/SQLException;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_2
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);v2=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/sql/SQLException;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public containsAll(Ljava/util/Collection;)Z
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Collection",
a=0;//             "<*>;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 154
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/LazyForeignCollection;, "Lcom/j256/ormlite/dao/LazyForeignCollection<TT;TID;>;"
a=0;//     .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
a=0;//     new-instance v1, Ljava/util/HashSet;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashSet;);
a=0;//     invoke-direct {v1, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V
a=0;// 
a=0;//     .line 155
a=0;//     .local v1, "leftOvers":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/Object;>;"
a=0;//     #v1=(Reference,Ljava/util/HashSet;);
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/LazyForeignCollection;->iterator()Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 157
a=0;//     .local v0, "iterator":Lcom/j256/ormlite/dao/CloseableIterator;, "Lcom/j256/ormlite/dao/CloseableIterator<TT;>;"
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/CloseableIterator;);v2=(Conflicted);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/CloseableIterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 158
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/CloseableIterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 162
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 163
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/CloseableIterator;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 166
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);
a=0;//     throw v2
a=0;// 
a=0;//     .line 160
a=0;//     :cond_0
a=0;//     :try_start_2
a=0;//     #v2=(Boolean);v3=(Uninit);
a=0;//     invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 163
a=0;//     :try_start_3
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/CloseableIterator;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/sql/SQLException; {:try_start_3 .. :try_end_3} :catch_0
a=0;// 
a=0;//     .line 166
a=0;//     :goto_2
a=0;//     #v3=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 164
a=0;//     :catch_0
a=0;//     #v3=(Uninit);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/sql/SQLException;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_1
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);v3=(Uninit);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/sql/SQLException;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public equals(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .param p1, "other"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 290
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/LazyForeignCollection;, "Lcom/j256/ormlite/dao/LazyForeignCollection<TT;TID;>;"
a=0;//     invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getWrappedIterable()Lcom/j256/ormlite/dao/CloseableWrappedIterable;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/dao/CloseableWrappedIterable",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/LazyForeignCollection;, "Lcom/j256/ormlite/dao/LazyForeignCollection<TT;TID;>;"
a=0;//     new-instance v0, Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl;);
a=0;//     new-instance v1, Lcom/j256/ormlite/dao/LazyForeignCollection$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/j256/ormlite/dao/LazyForeignCollection$1;);
a=0;//     invoke-direct {v1, p0}, Lcom/j256/ormlite/dao/LazyForeignCollection$1;-><init>(Lcom/j256/ormlite/dao/LazyForeignCollection;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/LazyForeignCollection$1;);
a=0;//     invoke-direct {v0, v1}, Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl;-><init>(Lcom/j256/ormlite/dao/CloseableIterable;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/CloseableWrappedIterableImpl;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public hashCode()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 303
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/LazyForeignCollection;, "Lcom/j256/ormlite/dao/LazyForeignCollection<TT;TID;>;"
a=0;//     invoke-super {p0}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isEager()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 101
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/LazyForeignCollection;, "Lcom/j256/ormlite/dao/LazyForeignCollection<TT;TID;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isEmpty()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 123
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/LazyForeignCollection;, "Lcom/j256/ormlite/dao/LazyForeignCollection<TT;TID;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/LazyForeignCollection;->iterator()Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 125
a=0;//     .local v0, "iterator":Lcom/j256/ormlite/dao/CloseableIterator;, "Lcom/j256/ormlite/dao/CloseableIterator<TT;>;"
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/CloseableIterator;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/CloseableIterator;->hasNext()Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 128
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/CloseableIterator;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 131
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 125
a=0;//     :cond_0
a=0;//     #v2=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 127
a=0;//     :catchall_0
a=0;//     #v1=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 128
a=0;//     :try_start_2
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/CloseableIterator;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/sql/SQLException; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     .line 131
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);
a=0;//     throw v1
a=0;// 
a=0;//     .line 129
a=0;//     :catch_0
a=0;//     #v1=(Boolean);v2=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/sql/SQLException;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);v2=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/sql/SQLException;);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public iterator()Lcom/j256/ormlite/dao/CloseableIterator;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/dao/CloseableIterator",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/LazyForeignCollection;, "Lcom/j256/ormlite/dao/LazyForeignCollection<TT;TID;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/LazyForeignCollection;->closeableIterator()Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/CloseableIterator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic iterator()Ljava/util/Iterator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/LazyForeignCollection;, "Lcom/j256/ormlite/dao/LazyForeignCollection<TT;TID;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/LazyForeignCollection;->iterator()Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/CloseableIterator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public iteratorThrow()Lcom/j256/ormlite/dao/CloseableIterator;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/dao/CloseableIterator",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/LazyForeignCollection;, "Lcom/j256/ormlite/dao/LazyForeignCollection<TT;TID;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/LazyForeignCollection;->seperateIteratorThrow()Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/CloseableIterator;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/dao/LazyForeignCollection;->lastIterator:Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/LazyForeignCollection;->lastIterator:Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public refreshAll()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 272
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/LazyForeignCollection;, "Lcom/j256/ormlite/dao/LazyForeignCollection<TT;TID;>;"
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     const-string v1, "Cannot call updateAll() on a lazy collection."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public refreshCollection()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 277
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/LazyForeignCollection;, "Lcom/j256/ormlite/dao/LazyForeignCollection<TT;TID;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public remove(Ljava/lang/Object;)Z
a=0;//     .locals 3
a=0;//     .param p1, "data"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 172
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/LazyForeignCollection;, "Lcom/j256/ormlite/dao/LazyForeignCollection<TT;TID;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/LazyForeignCollection;->iterator()Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 174
a=0;//     .local v0, "iterator":Lcom/j256/ormlite/dao/CloseableIterator;, "Lcom/j256/ormlite/dao/CloseableIterator<TT;>;"
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/CloseableIterator;);v1=(Conflicted);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/CloseableIterator;->hasNext()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 175
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/CloseableIterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 176
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/CloseableIterator;->remove()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 177
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 183
a=0;//     :try_start_1
a=0;//     #v1=(One);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/CloseableIterator;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 186
a=0;//     :goto_0
a=0;//     #v1=(Boolean);v2=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 180
a=0;//     :cond_1
a=0;//     #v2=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 183
a=0;//     :try_start_2
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/CloseableIterator;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/sql/SQLException; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 184
a=0;//     :catch_0
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/sql/SQLException;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 182
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 183
a=0;//     :try_start_3
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/CloseableIterator;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/sql/SQLException; {:try_start_3 .. :try_end_3} :catch_2
a=0;// 
a=0;//     .line 186
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     throw v1
a=0;// 
a=0;//     .line 184
a=0;//     :catch_1
a=0;//     #v1=(One);v2=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/sql/SQLException;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_2
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);v2=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/sql/SQLException;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public removeAll(Ljava/util/Collection;)Z
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Collection",
a=0;//             "<*>;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 192
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/LazyForeignCollection;, "Lcom/j256/ormlite/dao/LazyForeignCollection<TT;TID;>;"
a=0;//     .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 193
a=0;//     .local v0, "changed":Z
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/LazyForeignCollection;->iterator()Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 195
a=0;//     .local v1, "iterator":Lcom/j256/ormlite/dao/CloseableIterator;, "Lcom/j256/ormlite/dao/CloseableIterator<TT;>;"
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v0=(Boolean);v1=(Reference,Lcom/j256/ormlite/dao/CloseableIterator;);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/dao/CloseableIterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 196
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/dao/CloseableIterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {p1, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 197
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/dao/CloseableIterator;->remove()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 198
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 204
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/dao/CloseableIterator;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 207
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 203
a=0;//     :catchall_0
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 204
a=0;//     :try_start_2
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/dao/CloseableIterator;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/sql/SQLException; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     .line 207
a=0;//     :goto_2
a=0;//     #v3=(Conflicted);
a=0;//     throw v2
a=0;// 
a=0;//     .line 205
a=0;//     :catch_0
a=0;//     #v2=(Boolean);v3=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/sql/SQLException;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/sql/SQLException;);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public seperateIteratorThrow()Lcom/j256/ormlite/dao/CloseableIterator;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/dao/CloseableIterator",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/LazyForeignCollection;, "Lcom/j256/ormlite/dao/LazyForeignCollection<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/LazyForeignCollection;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 71
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Internal DAO object is null.  Lazy collections cannot be used if they have been deserialized."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 74
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/LazyForeignCollection;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/LazyForeignCollection;->getPreparedQuery()Lcom/j256/ormlite/stmt/PreparedQuery;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/PreparedQuery;);
a=0;//     invoke-interface {v0, v1}, Lcom/j256/ormlite/dao/Dao;->iterator(Lcom/j256/ormlite/stmt/PreparedQuery;)Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public size()I
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 105
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/LazyForeignCollection;, "Lcom/j256/ormlite/dao/LazyForeignCollection<TT;TID;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/LazyForeignCollection;->iterator()Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 108
a=0;//     .local v0, "iterator":Lcom/j256/ormlite/dao/CloseableIterator;, "Lcom/j256/ormlite/dao/CloseableIterator<TT;>;"
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/CloseableIterator;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "sizeC":I
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/CloseableIterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 110
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/CloseableIterator;->moveToNext()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 108
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 115
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/CloseableIterator;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 118
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 114
a=0;//     :catchall_0
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 115
a=0;//     :try_start_2
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/CloseableIterator;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/sql/SQLException; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     .line 118
a=0;//     :goto_2
a=0;//     #v3=(Conflicted);
a=0;//     throw v2
a=0;// 
a=0;//     .line 116
a=0;//     :catch_0
a=0;//     #v2=(Boolean);v3=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/sql/SQLException;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/sql/SQLException;);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public toArray()[Ljava/lang/Object;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 212
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/LazyForeignCollection;, "Lcom/j256/ormlite/dao/LazyForeignCollection<TT;TID;>;"
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 213
a=0;//     .local v0, "items":Ljava/util/List;, "Ljava/util/List<TT;>;"
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/LazyForeignCollection;->iterator()Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 215
a=0;//     .local v1, "iterator":Lcom/j256/ormlite/dao/CloseableIterator;, "Lcom/j256/ormlite/dao/CloseableIterator<TT;>;"
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/CloseableIterator;);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/dao/CloseableIterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 216
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/dao/CloseableIterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 220
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 221
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/dao/CloseableIterator;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 224
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);
a=0;//     throw v2
a=0;// 
a=0;//     .line 218
a=0;//     :cond_0
a=0;//     :try_start_2
a=0;//     #v2=(Boolean);v3=(Uninit);
a=0;//     invoke-interface {v0}, Ljava/util/List;->toArray()[Ljava/lang/Object;
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 221
a=0;//     :try_start_3
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/dao/CloseableIterator;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/sql/SQLException; {:try_start_3 .. :try_end_3} :catch_0
a=0;// 
a=0;//     .line 224
a=0;//     :goto_2
a=0;//     #v3=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 222
a=0;//     :catch_0
a=0;//     #v3=(Uninit);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/sql/SQLException;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_1
a=0;//     #v3=(Uninit);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/sql/SQLException;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;//     .locals 11
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<E:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">([TE;)[TE;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 229
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/LazyForeignCollection;, "Lcom/j256/ormlite/dao/LazyForeignCollection<TT;TID;>;"
a=0;//     .local p1, "array":[Ljava/lang/Object;, "[TE;"
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 230
a=0;//     .local v5, "items":Ljava/util/List;, "Ljava/util/List<TE;>;"
a=0;//     #v5=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 231
a=0;//     .local v4, "itemC":I
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/LazyForeignCollection;->iterator()Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .local v7, "iterator":Lcom/j256/ormlite/dao/CloseableIterator;, "Lcom/j256/ormlite/dao/CloseableIterator<TT;>;"
a=0;//     #v7=(Reference,Lcom/j256/ormlite/dao/CloseableIterator;);
a=0;//     move-object v6, v5
a=0;// 
a=0;//     .line 233
a=0;//     .end local v5    # "items":Ljava/util/List;, "Ljava/util/List<TE;>;"
a=0;//     .local v6, "items":Ljava/util/List;, "Ljava/util/List<TE;>;"
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Integer);v5=(Reference,Ljava/util/ArrayList;);v6=(Reference,Ljava/util/ArrayList;);v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-interface {v7}, Lcom/j256/ormlite/dao/CloseableIterator;->hasNext()Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_3
a=0;// 
a=0;//     .line 235
a=0;//     invoke-interface {v7}, Lcom/j256/ormlite/dao/CloseableIterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 237
a=0;//     .local v2, "castData":Ljava/lang/Object;, "TE;"
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     array-length v9, p1
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-lt v4, v9, :cond_2
a=0;// 
a=0;//     .line 238
a=0;//     if-nez v6, :cond_0
a=0;// 
a=0;//     .line 239
a=0;//     new-instance v5, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 240
a=0;//     .end local v6    # "items":Ljava/util/List;, "Ljava/util/List<TE;>;"
a=0;//     .restart local v5    # "items":Ljava/util/List;, "Ljava/util/List<TE;>;"
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     .local v0, "arr$":[Ljava/lang/Object;
a=0;//     :try_start_1
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     array-length v8, v0
a=0;// 
a=0;//     .local v8, "len$":I
a=0;//     #v8=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i$":I
a=0;//     :goto_1
a=0;//     #v3=(Integer);
a=0;//     if-ge v3, v8, :cond_1
a=0;// 
a=0;//     aget-object v1, v0, v3
a=0;// 
a=0;//     .line 241
a=0;//     .local v1, "arrayData":Ljava/lang/Object;, "TE;"
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v5, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 240
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .end local v0    # "arr$":[Ljava/lang/Object;
a=0;//     .end local v1    # "arrayData":Ljava/lang/Object;, "TE;"
a=0;//     .end local v3    # "i$":I
a=0;//     .end local v5    # "items":Ljava/util/List;, "Ljava/util/List<TE;>;"
a=0;//     .end local v8    # "len$":I
a=0;//     .restart local v6    # "items":Ljava/util/List;, "Ljava/util/List<TE;>;"
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v8=(Conflicted);
a=0;//     move-object v5, v6
a=0;// 
a=0;//     .line 244
a=0;//     .end local v6    # "items":Ljava/util/List;, "Ljava/util/List<TE;>;"
a=0;//     .restart local v5    # "items":Ljava/util/List;, "Ljava/util/List<TE;>;"
a=0;//     :cond_1
a=0;//     invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 248
a=0;//     :goto_2
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     move-object v6, v5
a=0;// 
a=0;//     .line 249
a=0;//     .end local v5    # "items":Ljava/util/List;, "Ljava/util/List<TE;>;"
a=0;//     .restart local v6    # "items":Ljava/util/List;, "Ljava/util/List<TE;>;"
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 246
a=0;//     :cond_2
a=0;//     :try_start_2
a=0;//     aput-object v2, p1, v4
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     move-object v5, v6
a=0;// 
a=0;//     .end local v6    # "items":Ljava/util/List;, "Ljava/util/List<TE;>;"
a=0;//     .restart local v5    # "items":Ljava/util/List;, "Ljava/util/List<TE;>;"
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 252
a=0;//     .end local v2    # "castData":Ljava/lang/Object;, "TE;"
a=0;//     .end local v5    # "items":Ljava/util/List;, "Ljava/util/List<TE;>;"
a=0;//     .restart local v6    # "items":Ljava/util/List;, "Ljava/util/List<TE;>;"
a=0;//     :cond_3
a=0;//     :try_start_3
a=0;//     #v2=(Conflicted);v9=(Boolean);
a=0;//     invoke-interface {v7}, Lcom/j256/ormlite/dao/CloseableIterator;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/sql/SQLException; {:try_start_3 .. :try_end_3} :catch_0
a=0;// 
a=0;//     .line 257
a=0;//     :goto_3
a=0;//     #v9=(Conflicted);
a=0;//     if-nez v6, :cond_5
a=0;// 
a=0;//     .line 258
a=0;//     array-length v9, p1
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     add-int/lit8 v9, v9, -0x1
a=0;// 
a=0;//     if-ge v4, v9, :cond_4
a=0;// 
a=0;//     .line 259
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     aput-object v9, p1, v4
a=0;// 
a=0;//     .line 263
a=0;//     .end local p1    # "array":[Ljava/lang/Object;, "[TE;"
a=0;//     :cond_4
a=0;//     :goto_4
a=0;//     #v9=(Conflicted);
a=0;//     return-object p1
a=0;// 
a=0;//     .line 251
a=0;//     .restart local p1    # "array":[Ljava/lang/Object;, "[TE;"
a=0;//     :catchall_0
a=0;//     #v5=(Conflicted);
a=0;//     move-exception v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v5, v6
a=0;// 
a=0;//     .line 252
a=0;//     .end local v6    # "items":Ljava/util/List;, "Ljava/util/List<TE;>;"
a=0;//     .restart local v5    # "items":Ljava/util/List;, "Ljava/util/List<TE;>;"
a=0;//     :goto_5
a=0;//     :try_start_4
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v7}, Lcom/j256/ormlite/dao/CloseableIterator;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/sql/SQLException; {:try_start_4 .. :try_end_4} :catch_1
a=0;// 
a=0;//     .line 255
a=0;//     :goto_6
a=0;//     #v10=(Conflicted);
a=0;//     throw v9
a=0;// 
a=0;//     .line 263
a=0;//     .end local v5    # "items":Ljava/util/List;, "Ljava/util/List<TE;>;"
a=0;//     .restart local v6    # "items":Ljava/util/List;, "Ljava/util/List<TE;>;"
a=0;//     :cond_5
a=0;//     #v9=(Conflicted);v10=(Uninit);
a=0;//     invoke-interface {v6, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 253
a=0;//     :catch_0
a=0;//     #v9=(Boolean);
a=0;//     move-exception v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/sql/SQLException;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .end local v6    # "items":Ljava/util/List;, "Ljava/util/List<TE;>;"
a=0;//     .restart local v5    # "items":Ljava/util/List;, "Ljava/util/List<TE;>;"
a=0;//     :catch_1
a=0;//     move-exception v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/sql/SQLException;);
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 251
a=0;//     .restart local v2    # "castData":Ljava/lang/Object;, "TE;"
a=0;//     :catchall_1
a=0;//     #v2=(Reference,Ljava/lang/Object;);v9=(Integer);v10=(Uninit);
a=0;//     move-exception v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_5
a=0;// .end method
a=0;// 
a=0;// .method public updateAll()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 268
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/LazyForeignCollection;, "Lcom/j256/ormlite/dao/LazyForeignCollection<TT;TID;>;"
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     const-string v1, "Cannot call updateAll() on a lazy collection."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
}}
