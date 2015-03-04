package com.j256.ormlite.dao; class BaseForeignCollection { void a() { int a;
a=0;// .class public abstract Lcom/j256/ormlite/dao/BaseForeignCollection;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BaseForeignCollection.java"
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
a=0;//         "Ljava/lang/Object;",
a=0;//         "Lcom/j256/ormlite/dao/ForeignCollection",
a=0;//         "<TT;>;",
a=0;//         "Ljava/io/Serializable;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final serialVersionUID:J = -0x4797e276d525d695L
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final transient columnName:Ljava/lang/String;
a=0;// 
a=0;// .field protected final transient dao:Lcom/j256/ormlite/dao/Dao;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/dao/Dao",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final transient orderAscending:Z
a=0;// 
a=0;// .field private final transient orderColumn:Ljava/lang/String;
a=0;// 
a=0;// .field private final transient parent:Ljava/lang/Object;
a=0;// 
a=0;// .field private final transient parentId:Ljava/lang/Object;
a=0;// 
a=0;// .field private transient preparedQuery:Lcom/j256/ormlite/stmt/PreparedQuery;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/stmt/PreparedQuery",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method protected constructor <init>(Lcom/j256/ormlite/dao/Dao;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Z)V
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
a=0;//     .line 37
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseForeignCollection;, "Lcom/j256/ormlite/dao/BaseForeignCollection<TT;TID;>;"
a=0;//     .local p1, "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;TID;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 38
a=0;//     #p0=(Reference,Lcom/j256/ormlite/dao/BaseForeignCollection;);
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/dao/BaseForeignCollection;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     .line 39
a=0;//     iput-object p4, p0, Lcom/j256/ormlite/dao/BaseForeignCollection;->columnName:Ljava/lang/String;
a=0;// 
a=0;//     .line 40
a=0;//     iput-object p3, p0, Lcom/j256/ormlite/dao/BaseForeignCollection;->parentId:Ljava/lang/Object;
a=0;// 
a=0;//     .line 41
a=0;//     iput-object p5, p0, Lcom/j256/ormlite/dao/BaseForeignCollection;->orderColumn:Ljava/lang/String;
a=0;// 
a=0;//     .line 42
a=0;//     iput-boolean p6, p0, Lcom/j256/ormlite/dao/BaseForeignCollection;->orderAscending:Z
a=0;// 
a=0;//     .line 43
a=0;//     iput-object p2, p0, Lcom/j256/ormlite/dao/BaseForeignCollection;->parent:Ljava/lang/Object;
a=0;// 
a=0;//     .line 44
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public add(Ljava/lang/Object;)Z
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseForeignCollection;, "Lcom/j256/ormlite/dao/BaseForeignCollection<TT;TID;>;"
a=0;//     .local p1, "data":Ljava/lang/Object;, "TT;"
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseForeignCollection;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 53
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 57
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     .line 56
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseForeignCollection;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/dao/Dao;->create(Ljava/lang/Object;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 57
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 58
a=0;//     :catch_0
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 59
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v2, "Could not create data element in dao"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public addAll(Ljava/util/Collection;)Z
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Collection",
a=0;//             "<+TT;>;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseForeignCollection;, "Lcom/j256/ormlite/dao/BaseForeignCollection<TT;TID;>;"
a=0;//     .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<+TT;>;"
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/dao/BaseForeignCollection;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 70
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 81
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 72
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 73
a=0;//     .local v0, "changed":Z
a=0;//     #v0=(Null);
a=0;//     invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .local v3, "i$":Ljava/util/Iterator;
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v3=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 75
a=0;//     .local v1, "data":Ljava/lang/Object;, "TT;"
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/dao/BaseForeignCollection;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v4, v1}, Lcom/j256/ormlite/dao/Dao;->create(Ljava/lang/Object;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 76
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 77
a=0;//     :catch_0
a=0;//     #v0=(Boolean);v4=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 78
a=0;//     .local v2, "e":Ljava/sql/SQLException;
a=0;//     #v2=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v4, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v5, "Could not create data elements in dao"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v4
a=0;// .end method
a=0;// 
a=0;// .method public clear()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 138
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseForeignCollection;, "Lcom/j256/ormlite/dao/BaseForeignCollection<TT;TID;>;"
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseForeignCollection;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 154
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 141
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseForeignCollection;->closeableIterator()Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 143
a=0;//     .local v0, "iterator":Lcom/j256/ormlite/dao/CloseableIterator;, "Lcom/j256/ormlite/dao/CloseableIterator<TT;>;"
a=0;//     :goto_1
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/CloseableIterator;);v1=(Conflicted);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/CloseableIterator;->hasNext()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 144
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/CloseableIterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     .line 145
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/CloseableIterator;->remove()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 148
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 149
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/CloseableIterator;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 152
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);
a=0;//     throw v1
a=0;// 
a=0;//     .line 149
a=0;//     :cond_1
a=0;//     :try_start_2
a=0;//     #v1=(Boolean);v2=(Uninit);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/CloseableIterator;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/sql/SQLException; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 150
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/sql/SQLException;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/sql/SQLException;);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method protected getPreparedQuery()Lcom/j256/ormlite/stmt/PreparedQuery;
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/stmt/PreparedQuery",
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
a=0;//     .line 173
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseForeignCollection;, "Lcom/j256/ormlite/dao/BaseForeignCollection<TT;TID;>;"
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/BaseForeignCollection;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 174
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 190
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 176
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/BaseForeignCollection;->preparedQuery:Lcom/j256/ormlite/stmt/PreparedQuery;
a=0;// 
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 177
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/SelectArg;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/SelectArg;);
a=0;//     invoke-direct {v0}, Lcom/j256/ormlite/stmt/SelectArg;-><init>()V
a=0;// 
a=0;//     .line 178
a=0;//     .local v0, "fieldArg":Lcom/j256/ormlite/stmt/SelectArg;
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/SelectArg;);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/BaseForeignCollection;->parentId:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Lcom/j256/ormlite/stmt/SelectArg;->setValue(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 179
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/BaseForeignCollection;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     invoke-interface {v3}, Lcom/j256/ormlite/dao/Dao;->queryBuilder()Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 180
a=0;//     .local v2, "qb":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     #v2=(Reference,Lcom/j256/ormlite/stmt/QueryBuilder;);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/BaseForeignCollection;->orderColumn:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 181
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/BaseForeignCollection;->orderColumn:Ljava/lang/String;
a=0;// 
a=0;//     iget-boolean v4, p0, Lcom/j256/ormlite/dao/BaseForeignCollection;->orderAscending:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     invoke-virtual {v2, v3, v4}, Lcom/j256/ormlite/stmt/QueryBuilder;->orderBy(Ljava/lang/String;Z)Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     .line 183
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual {v2}, Lcom/j256/ormlite/stmt/QueryBuilder;->where()Lcom/j256/ormlite/stmt/Where;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/dao/BaseForeignCollection;->columnName:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4, v0}, Lcom/j256/ormlite/stmt/Where;->eq(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/j256/ormlite/stmt/Where;->prepare()Lcom/j256/ormlite/stmt/PreparedQuery;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, p0, Lcom/j256/ormlite/dao/BaseForeignCollection;->preparedQuery:Lcom/j256/ormlite/stmt/PreparedQuery;
a=0;// 
a=0;//     .line 184
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/BaseForeignCollection;->preparedQuery:Lcom/j256/ormlite/stmt/PreparedQuery;
a=0;// 
a=0;//     instance-of v3, v3, Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 186
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseForeignCollection;->preparedQuery:Lcom/j256/ormlite/stmt/PreparedQuery;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/PreparedQuery;);
a=0;//     check-cast v1, Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;
a=0;// 
a=0;//     .line 187
a=0;//     .local v1, "mappedStmt":Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;, "Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt<TT;Ljava/lang/Object;>;"
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/BaseForeignCollection;->parent:Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/dao/BaseForeignCollection;->parentId:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {v1, v3, v4}, Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;->setParentInformation(Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 190
a=0;//     .end local v0    # "fieldArg":Lcom/j256/ormlite/stmt/SelectArg;
a=0;//     .end local v1    # "mappedStmt":Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;, "Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt<TT;Ljava/lang/Object;>;"
a=0;//     .end local v2    # "qb":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/BaseForeignCollection;->preparedQuery:Lcom/j256/ormlite/stmt/PreparedQuery;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/stmt/PreparedQuery;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public refresh(Ljava/lang/Object;)I
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)I"
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
a=0;//     .line 165
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseForeignCollection;, "Lcom/j256/ormlite/dao/BaseForeignCollection<TT;TID;>;"
a=0;//     .local p1, "data":Ljava/lang/Object;, "TT;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseForeignCollection;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 166
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 168
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseForeignCollection;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Lcom/j256/ormlite/dao/Dao;->refresh(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public abstract remove(Ljava/lang/Object;)Z
a=0;// .end method
a=0;// 
a=0;// .method public abstract removeAll(Ljava/util/Collection;)Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Collection",
a=0;//             "<*>;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public retainAll(Ljava/util/Collection;)Z
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Collection",
a=0;//             "<*>;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 109
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseForeignCollection;, "Lcom/j256/ormlite/dao/BaseForeignCollection<TT;TID;>;"
a=0;//     .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/BaseForeignCollection;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 110
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 128
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 112
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 113
a=0;//     .local v0, "changed":Z
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/BaseForeignCollection;->closeableIterator()Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 115
a=0;//     .local v2, "iterator":Lcom/j256/ormlite/dao/CloseableIterator;, "Lcom/j256/ormlite/dao/CloseableIterator<TT;>;"
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     :try_start_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Reference,Lcom/j256/ormlite/dao/CloseableIterator;);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Lcom/j256/ormlite/dao/CloseableIterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 116
a=0;//     invoke-interface {v2}, Lcom/j256/ormlite/dao/CloseableIterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 117
a=0;//     .local v1, "data":Ljava/lang/Object;, "TT;"
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {p1, v1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 118
a=0;//     invoke-interface {v2}, Lcom/j256/ormlite/dao/CloseableIterator;->remove()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 119
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 125
a=0;//     .end local v1    # "data":Ljava/lang/Object;, "TT;"
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     invoke-interface {v2}, Lcom/j256/ormlite/dao/CloseableIterator;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 126
a=0;//     :catch_0
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/sql/SQLException;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 124
a=0;//     :catchall_0
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 125
a=0;//     :try_start_2
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-interface {v2}, Lcom/j256/ormlite/dao/CloseableIterator;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/sql/SQLException; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     .line 128
a=0;//     :goto_2
a=0;//     #v4=(Conflicted);
a=0;//     throw v3
a=0;// 
a=0;//     .line 126
a=0;//     :catch_1
a=0;//     #v4=(Uninit);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/sql/SQLException;);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public update(Ljava/lang/Object;)I
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)I"
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
a=0;//     .line 157
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/BaseForeignCollection;, "Lcom/j256/ormlite/dao/BaseForeignCollection<TT;TID;>;"
a=0;//     .local p1, "data":Ljava/lang/Object;, "TT;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseForeignCollection;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 158
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 160
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseForeignCollection;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Lcom/j256/ormlite/dao/Dao;->update(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
}}
