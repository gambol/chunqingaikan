package com.j256.ormlite.dao; class EagerForeignCollection { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/dao/EagerForeignCollection;
a=0;// .super Lcom/j256/ormlite/dao/BaseForeignCollection;
a=0;// .source "EagerForeignCollection.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/j256/ormlite/dao/CloseableWrappedIterable;
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
a=0;//         "Lcom/j256/ormlite/dao/CloseableWrappedIterable",
a=0;//         "<TT;>;",
a=0;//         "Ljava/io/Serializable;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final serialVersionUID:J = -0x2304b05d8755d8d9L
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private results:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/j256/ormlite/dao/Dao;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Z)V
a=0;//     .locals 1
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
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection;, "Lcom/j256/ormlite/dao/EagerForeignCollection<TT;TID;>;"
a=0;//     .local p1, "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;TID;>;"
a=0;//     invoke-direct/range {p0 .. p6}, Lcom/j256/ormlite/dao/BaseForeignCollection;-><init>(Lcom/j256/ormlite/dao/Dao;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Z)V
a=0;// 
a=0;//     .line 28
a=0;//     #p0=(Reference,Lcom/j256/ormlite/dao/EagerForeignCollection;);
a=0;//     if-nez p3, :cond_0
a=0;// 
a=0;//     .line 33
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection;->results:Ljava/util/List;
a=0;// 
a=0;//     .line 38
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 36
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/EagerForeignCollection;->getPreparedQuery()Lcom/j256/ormlite/stmt/PreparedQuery;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/PreparedQuery;);
a=0;//     invoke-interface {p1, v0}, Lcom/j256/ormlite/dao/Dao;->query(Lcom/j256/ormlite/stmt/PreparedQuery;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection;->results:Ljava/util/List;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Lcom/j256/ormlite/dao/EagerForeignCollection;)Ljava/util/List;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Lcom/j256/ormlite/dao/EagerForeignCollection;
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection;->results:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public add(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 178
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection;, "Lcom/j256/ormlite/dao/EagerForeignCollection<TT;TID;>;"
a=0;//     .local p1, "data":Ljava/lang/Object;, "TT;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection;->results:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 179
a=0;//     invoke-super {p0, p1}, Lcom/j256/ormlite/dao/BaseForeignCollection;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 181
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public addAll(Ljava/util/Collection;)Z
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Collection",
a=0;//             "<+TT;>;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 187
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection;, "Lcom/j256/ormlite/dao/EagerForeignCollection<TT;TID;>;"
a=0;//     .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<+TT;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection;->results:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 188
a=0;//     invoke-super {p0, p1}, Lcom/j256/ormlite/dao/BaseForeignCollection;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 190
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public clear()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 228
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection;, "Lcom/j256/ormlite/dao/EagerForeignCollection<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection;->results:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->clear()V
a=0;// 
a=0;//     .line 229
a=0;//     invoke-super {p0}, Lcom/j256/ormlite/dao/BaseForeignCollection;->clear()V
a=0;// 
a=0;//     .line 230
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public close()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 142
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection;, "Lcom/j256/ormlite/dao/EagerForeignCollection<TT;TID;>;"
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public closeLastIterator()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 146
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection;, "Lcom/j256/ormlite/dao/EagerForeignCollection<TT;TID;>;"
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public closeableIterator()Lcom/j256/ormlite/dao/CloseableIterator;
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
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection;, "Lcom/j256/ormlite/dao/EagerForeignCollection<TT;TID;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/EagerForeignCollection;->iteratorThrow()Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/CloseableIterator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public contains(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .param p1, "o"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection;, "Lcom/j256/ormlite/dao/EagerForeignCollection<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection;->results:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public containsAll(Ljava/util/Collection;)Z
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Collection",
a=0;//             "<*>;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 165
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection;, "Lcom/j256/ormlite/dao/EagerForeignCollection<TT;TID;>;"
a=0;//     .local p1, "c":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection;->results:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public equals(Ljava/lang/Object;)Z
a=0;//     .locals 3
a=0;//     .param p1, "obj"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 258
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection;, "Lcom/j256/ormlite/dao/EagerForeignCollection<TT;TID;>;"
a=0;//     instance-of v1, p1, Lcom/j256/ormlite/dao/EagerForeignCollection;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 259
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 263
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     .line 262
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/j256/ormlite/dao/EagerForeignCollection;
a=0;// 
a=0;//     .line 263
a=0;//     .local v0, "other":Lcom/j256/ormlite/dao/EagerForeignCollection;
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/EagerForeignCollection;->results:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     iget-object v2, v0, Lcom/j256/ormlite/dao/EagerForeignCollection;->results:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getWrappedIterable()Lcom/j256/ormlite/dao/CloseableWrappedIterable;
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/dao/CloseableWrappedIterable",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 137
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection;, "Lcom/j256/ormlite/dao/EagerForeignCollection<TT;TID;>;"
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public hashCode()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 271
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection;, "Lcom/j256/ormlite/dao/EagerForeignCollection<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection;->results:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I
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
a=0;//     .line 149
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection;, "Lcom/j256/ormlite/dao/EagerForeignCollection<TT;TID;>;"
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isEmpty()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 157
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection;, "Lcom/j256/ormlite/dao/EagerForeignCollection<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection;->results:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
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
a=0;//     .line 41
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection;, "Lcom/j256/ormlite/dao/EagerForeignCollection<TT;TID;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/EagerForeignCollection;->iteratorThrow()Lcom/j256/ormlite/dao/CloseableIterator;
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
a=0;//     .line 18
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection;, "Lcom/j256/ormlite/dao/EagerForeignCollection<TT;TID;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/EagerForeignCollection;->iterator()Lcom/j256/ormlite/dao/CloseableIterator;
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
a=0;//     .prologue
a=0;//     .line 50
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection;, "Lcom/j256/ormlite/dao/EagerForeignCollection<TT;TID;>;"
a=0;//     new-instance v0, Lcom/j256/ormlite/dao/EagerForeignCollection$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/dao/EagerForeignCollection$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/j256/ormlite/dao/EagerForeignCollection$1;-><init>(Lcom/j256/ormlite/dao/EagerForeignCollection;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/EagerForeignCollection$1;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public refreshAll()I
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 241
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection;, "Lcom/j256/ormlite/dao/EagerForeignCollection<TT;TID;>;"
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 242
a=0;//     .local v2, "updatedC":I
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/EagerForeignCollection;->results:Ljava/util/List;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .local v1, "i$":Ljava/util/Iterator;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);v2=(Integer);v3=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 243
a=0;//     .local v0, "data":Ljava/lang/Object;, "TT;"
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/EagerForeignCollection;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v3, v0}, Lcom/j256/ormlite/dao/Dao;->refresh(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 245
a=0;//     .end local v0    # "data":Ljava/lang/Object;, "TT;"
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v3=(Boolean);
a=0;//     return v2
a=0;// .end method
a=0;// 
a=0;// .method public refreshCollection()I
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 249
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection;, "Lcom/j256/ormlite/dao/EagerForeignCollection<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/dao/EagerForeignCollection;->getPreparedQuery()Lcom/j256/ormlite/stmt/PreparedQuery;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/PreparedQuery;);
a=0;//     invoke-interface {v0, v1}, Lcom/j256/ormlite/dao/Dao;->query(Lcom/j256/ormlite/stmt/PreparedQuery;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection;->results:Ljava/util/List;
a=0;// 
a=0;//     .line 250
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection;->results:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public remove(Ljava/lang/Object;)Z
a=0;//     .locals 5
a=0;//     .param p1, "data"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection;, "Lcom/j256/ormlite/dao/EagerForeignCollection<TT;TID;>;"
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 196
a=0;//     #v3=(Null);
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/dao/EagerForeignCollection;->results:Ljava/util/List;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v4, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/dao/EagerForeignCollection;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 203
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Boolean);
a=0;//     return v2
a=0;// 
a=0;//     .line 201
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v2=(One);v4=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     .line 203
a=0;//     .local v0, "castData":Ljava/lang/Object;, "TT;"
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/dao/EagerForeignCollection;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     invoke-interface {v4, v0}, Lcom/j256/ormlite/dao/Dao;->delete(Ljava/lang/Object;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eq v4, v2, :cond_1
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 204
a=0;//     :catch_0
a=0;//     #v2=(One);v4=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 205
a=0;//     .local v1, "e":Ljava/sql/SQLException;
a=0;//     #v1=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v2, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v3, "Could not delete data element from dao"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v2
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
a=0;//     .line 211
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection;, "Lcom/j256/ormlite/dao/EagerForeignCollection<TT;TID;>;"
a=0;//     .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 212
a=0;//     .local v0, "changed":Z
a=0;//     #v0=(Null);
a=0;//     invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .local v2, "i$":Ljava/util/Iterator;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 213
a=0;//     .local v1, "data":Ljava/lang/Object;
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {p0, v1}, Lcom/j256/ormlite/dao/EagerForeignCollection;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 214
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 217
a=0;//     .end local v1    # "data":Ljava/lang/Object;
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public retainAll(Ljava/util/Collection;)Z
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Collection",
a=0;//             "<*>;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 223
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection;, "Lcom/j256/ormlite/dao/EagerForeignCollection<TT;TID;>;"
a=0;//     .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
a=0;//     invoke-super {p0, p1}, Lcom/j256/ormlite/dao/BaseForeignCollection;->retainAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public size()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 153
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection;, "Lcom/j256/ormlite/dao/EagerForeignCollection<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection;->results:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public toArray()[Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection;, "Lcom/j256/ormlite/dao/EagerForeignCollection<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection;->results:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->toArray()[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<E:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">([TE;)[TE;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 173
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection;, "Lcom/j256/ormlite/dao/EagerForeignCollection<TT;TID;>;"
a=0;//     .local p1, "array":[Ljava/lang/Object;, "[TE;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/EagerForeignCollection;->results:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public updateAll()I
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 233
a=0;//     .local p0, "this":Lcom/j256/ormlite/dao/EagerForeignCollection;, "Lcom/j256/ormlite/dao/EagerForeignCollection<TT;TID;>;"
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 234
a=0;//     .local v2, "updatedC":I
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/EagerForeignCollection;->results:Ljava/util/List;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .local v1, "i$":Ljava/util/Iterator;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);v2=(Integer);v3=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 235
a=0;//     .local v0, "data":Ljava/lang/Object;, "TT;"
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/EagerForeignCollection;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v3, v0}, Lcom/j256/ormlite/dao/Dao;->update(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 237
a=0;//     .end local v0    # "data":Ljava/lang/Object;, "TT;"
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v3=(Boolean);
a=0;//     return v2
a=0;// .end method
}}
