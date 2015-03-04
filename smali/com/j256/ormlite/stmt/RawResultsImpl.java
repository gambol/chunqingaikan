package com.j256.ormlite.stmt; class RawResultsImpl { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/stmt/RawResultsImpl;
a=0;// .super Ljava/lang/Object;
a=0;// .source "RawResultsImpl.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/j256/ormlite/dao/GenericRawResults;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/lang/Object;",
a=0;//         "Lcom/j256/ormlite/dao/GenericRawResults",
a=0;//         "<TT;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final columnNames:[Ljava/lang/String;
a=0;// 
a=0;// .field private iterator:Lcom/j256/ormlite/stmt/SelectIterator;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/stmt/SelectIterator",
a=0;//             "<TT;",
a=0;//             "Ljava/lang/Void;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/String;Ljava/lang/Class;Lcom/j256/ormlite/support/CompiledStatement;Lcom/j256/ormlite/stmt/GenericRowMapper;Lcom/j256/ormlite/dao/ObjectCache;)V
a=0;//     .locals 9
a=0;//     .param p1, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .param p2, "connection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p3, "query"    # Ljava/lang/String;
a=0;//     .param p5, "compiledStmt"    # Lcom/j256/ormlite/support/CompiledStatement;
a=0;//     .param p7, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Lcom/j256/ormlite/support/DatabaseConnection;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;",
a=0;//             "Lcom/j256/ormlite/support/CompiledStatement;",
a=0;//             "Lcom/j256/ormlite/stmt/GenericRowMapper",
a=0;//             "<TT;>;",
a=0;//             "Lcom/j256/ormlite/dao/ObjectCache;",
a=0;//             ")V"
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
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/RawResultsImpl;, "Lcom/j256/ormlite/stmt/RawResultsImpl<TT;>;"
a=0;//     .local p4, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     .local p6, "rowMapper":Lcom/j256/ormlite/stmt/GenericRowMapper;, "Lcom/j256/ormlite/stmt/GenericRowMapper<TT;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 28
a=0;//     #p0=(Reference,Lcom/j256/ormlite/stmt/RawResultsImpl;);
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/SelectIterator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/SelectIterator;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v1, p4
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     move-object v3, p6
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/stmt/GenericRowMapper;);
a=0;//     move-object v4, p1
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     move-object v5, p2
a=0;// 
a=0;//     #v5=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     move-object v6, p5
a=0;// 
a=0;//     #v6=(Reference,Lcom/j256/ormlite/support/CompiledStatement;);
a=0;//     move-object v7, p3
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v8, p7
a=0;// 
a=0;//     #v8=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     invoke-direct/range {v0 .. v8}, Lcom/j256/ormlite/stmt/SelectIterator;-><init>(Ljava/lang/Class;Lcom/j256/ormlite/dao/Dao;Lcom/j256/ormlite/stmt/GenericRowMapper;Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/support/DatabaseConnection;Lcom/j256/ormlite/support/CompiledStatement;Ljava/lang/String;Lcom/j256/ormlite/dao/ObjectCache;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/SelectIterator;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/RawResultsImpl;->iterator:Lcom/j256/ormlite/stmt/SelectIterator;
a=0;// 
a=0;//     .line 34
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/RawResultsImpl;->iterator:Lcom/j256/ormlite/stmt/SelectIterator;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/stmt/SelectIterator;->getRawResults()Lcom/j256/ormlite/support/DatabaseResults;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/support/DatabaseResults;->getColumnNames()[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/RawResultsImpl;->columnNames:[Ljava/lang/String;
a=0;// 
a=0;//     .line 35
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public close()V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/RawResultsImpl;, "Lcom/j256/ormlite/stmt/RawResultsImpl<TT;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/RawResultsImpl;->iterator:Lcom/j256/ormlite/stmt/SelectIterator;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/SelectIterator;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 79
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/RawResultsImpl;->iterator:Lcom/j256/ormlite/stmt/SelectIterator;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/stmt/SelectIterator;->close()V
a=0;// 
a=0;//     .line 80
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/RawResultsImpl;->iterator:Lcom/j256/ormlite/stmt/SelectIterator;
a=0;// 
a=0;//     .line 82
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/SelectIterator;);
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
a=0;//     .line 74
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/RawResultsImpl;, "Lcom/j256/ormlite/stmt/RawResultsImpl<TT;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/RawResultsImpl;->iterator:Lcom/j256/ormlite/stmt/SelectIterator;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/SelectIterator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getColumnNames()[Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/RawResultsImpl;, "Lcom/j256/ormlite/stmt/RawResultsImpl<TT;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/RawResultsImpl;->columnNames:[Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getFirstResult()Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TT;"
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
a=0;//     .line 59
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/RawResultsImpl;, "Lcom/j256/ormlite/stmt/RawResultsImpl<TT;>;"
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/RawResultsImpl;->iterator:Lcom/j256/ormlite/stmt/SelectIterator;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/SelectIterator;);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/stmt/SelectIterator;->hasNextThrow()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 60
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/RawResultsImpl;->iterator:Lcom/j256/ormlite/stmt/SelectIterator;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/SelectIterator;);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/stmt/SelectIterator;->nextThrow()Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 65
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/stmt/RawResultsImpl;->close()V
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 62
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 65
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/stmt/RawResultsImpl;->close()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/stmt/RawResultsImpl;->close()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public getNumberColumns()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/RawResultsImpl;, "Lcom/j256/ormlite/stmt/RawResultsImpl<TT;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/RawResultsImpl;->columnNames:[Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getResults()Ljava/util/List;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/List",
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
a=0;//     .line 46
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/RawResultsImpl;, "Lcom/j256/ormlite/stmt/RawResultsImpl<TT;>;"
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 48
a=0;//     .local v0, "results":Ljava/util/List;, "Ljava/util/List<TT;>;"
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/RawResultsImpl;->iterator:Lcom/j256/ormlite/stmt/SelectIterator;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/SelectIterator;);
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/stmt/SelectIterator;->hasNext()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 49
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/RawResultsImpl;->iterator:Lcom/j256/ormlite/stmt/SelectIterator;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/SelectIterator;);
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/stmt/SelectIterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 53
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/stmt/RawResultsImpl;->iterator:Lcom/j256/ormlite/stmt/SelectIterator;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/stmt/SelectIterator;);
a=0;//     invoke-virtual {v2}, Lcom/j256/ormlite/stmt/SelectIterator;->close()V
a=0;// 
a=0;//     throw v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/RawResultsImpl;->iterator:Lcom/j256/ormlite/stmt/SelectIterator;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/SelectIterator;);
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/stmt/SelectIterator;->close()V
a=0;// 
a=0;//     return-object v0
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
a=0;//     .line 70
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/RawResultsImpl;, "Lcom/j256/ormlite/stmt/RawResultsImpl<TT;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/RawResultsImpl;->iterator:Lcom/j256/ormlite/stmt/SelectIterator;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/SelectIterator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic iterator()Ljava/util/Iterator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/RawResultsImpl;, "Lcom/j256/ormlite/stmt/RawResultsImpl<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/stmt/RawResultsImpl;->iterator()Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/CloseableIterator;);
a=0;//     return-object v0
a=0;// .end method
}}
