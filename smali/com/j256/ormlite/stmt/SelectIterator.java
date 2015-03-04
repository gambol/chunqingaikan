package com.j256.ormlite.stmt; class SelectIterator { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/stmt/SelectIterator;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SelectIterator.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/j256/ormlite/dao/CloseableIterator;
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
a=0;//         "Lcom/j256/ormlite/dao/CloseableIterator",
a=0;//         "<TT;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private alreadyMoved:Z
a=0;// 
a=0;// .field private final classDao:Lcom/j256/ormlite/dao/Dao;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/dao/Dao",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private closed:Z
a=0;// 
a=0;// .field private final compiledStmt:Lcom/j256/ormlite/support/CompiledStatement;
a=0;// 
a=0;// .field private final connection:Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;// .field private final connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;// .field private final dataClass:Ljava/lang/Class;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private first:Z
a=0;// 
a=0;// .field private last:Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final results:Lcom/j256/ormlite/support/DatabaseResults;
a=0;// 
a=0;// .field private rowC:I
a=0;// 
a=0;// .field private final rowMapper:Lcom/j256/ormlite/stmt/GenericRowMapper;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/stmt/GenericRowMapper",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final statement:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     const-class v0, Lcom/j256/ormlite/stmt/SelectIterator;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0}, Lcom/j256/ormlite/logger/LoggerFactory;->getLogger(Ljava/lang/Class;)Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/j256/ormlite/stmt/SelectIterator;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/Class;Lcom/j256/ormlite/dao/Dao;Lcom/j256/ormlite/stmt/GenericRowMapper;Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/support/DatabaseConnection;Lcom/j256/ormlite/support/CompiledStatement;Ljava/lang/String;Lcom/j256/ormlite/dao/ObjectCache;)V
a=0;//     .locals 3
a=0;//     .param p4, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .param p5, "connection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p6, "compiledStmt"    # Lcom/j256/ormlite/support/CompiledStatement;
a=0;//     .param p7, "statement"    # Ljava/lang/String;
a=0;//     .param p8, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;",
a=0;//             "Lcom/j256/ormlite/dao/Dao",
a=0;//             "<TT;TID;>;",
a=0;//             "Lcom/j256/ormlite/stmt/GenericRowMapper",
a=0;//             "<TT;>;",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Lcom/j256/ormlite/support/DatabaseConnection;",
a=0;//             "Lcom/j256/ormlite/support/CompiledStatement;",
a=0;//             "Ljava/lang/String;",
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
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/SelectIterator;, "Lcom/j256/ormlite/stmt/SelectIterator<TT;TID;>;"
a=0;//     .local p1, "dataClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     .local p2, "classDao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;TID;>;"
a=0;//     .local p3, "rowMapper":Lcom/j256/ormlite/stmt/GenericRowMapper;, "Lcom/j256/ormlite/stmt/GenericRowMapper<TT;>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 48
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 37
a=0;//     #p0=(Reference,Lcom/j256/ormlite/stmt/SelectIterator;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/j256/ormlite/stmt/SelectIterator;->first:Z
a=0;// 
a=0;//     .line 38
a=0;//     iput-boolean v1, p0, Lcom/j256/ormlite/stmt/SelectIterator;->closed:Z
a=0;// 
a=0;//     .line 39
a=0;//     iput-boolean v1, p0, Lcom/j256/ormlite/stmt/SelectIterator;->alreadyMoved:Z
a=0;// 
a=0;//     .line 40
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/SelectIterator;->last:Ljava/lang/Object;
a=0;// 
a=0;//     .line 41
a=0;//     iput v1, p0, Lcom/j256/ormlite/stmt/SelectIterator;->rowC:I
a=0;// 
a=0;//     .line 49
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/stmt/SelectIterator;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     .line 50
a=0;//     iput-object p2, p0, Lcom/j256/ormlite/stmt/SelectIterator;->classDao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     .line 51
a=0;//     iput-object p3, p0, Lcom/j256/ormlite/stmt/SelectIterator;->rowMapper:Lcom/j256/ormlite/stmt/GenericRowMapper;
a=0;// 
a=0;//     .line 52
a=0;//     iput-object p4, p0, Lcom/j256/ormlite/stmt/SelectIterator;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     .line 53
a=0;//     iput-object p5, p0, Lcom/j256/ormlite/stmt/SelectIterator;->connection:Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     .line 54
a=0;//     iput-object p6, p0, Lcom/j256/ormlite/stmt/SelectIterator;->compiledStmt:Lcom/j256/ormlite/support/CompiledStatement;
a=0;// 
a=0;//     .line 55
a=0;//     invoke-interface {p6, p8}, Lcom/j256/ormlite/support/CompiledStatement;->runQuery(Lcom/j256/ormlite/dao/ObjectCache;)Lcom/j256/ormlite/support/DatabaseResults;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseResults;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/SelectIterator;->results:Lcom/j256/ormlite/support/DatabaseResults;
a=0;// 
a=0;//     .line 56
a=0;//     iput-object p7, p0, Lcom/j256/ormlite/stmt/SelectIterator;->statement:Ljava/lang/String;
a=0;// 
a=0;//     .line 57
a=0;//     if-eqz p7, :cond_0
a=0;// 
a=0;//     .line 58
a=0;//     sget-object v0, Lcom/j256/ormlite/stmt/SelectIterator;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v1, "starting iterator @{} for \'{}\'"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1, v2, p7}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 60
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private getCurrent()Ljava/lang/Object;
a=0;//     .locals 2
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
a=0;//     .line 270
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/SelectIterator;, "Lcom/j256/ormlite/stmt/SelectIterator<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/SelectIterator;->rowMapper:Lcom/j256/ormlite/stmt/GenericRowMapper;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/GenericRowMapper;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/SelectIterator;->results:Lcom/j256/ormlite/support/DatabaseResults;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/DatabaseResults;);
a=0;//     invoke-interface {v0, v1}, Lcom/j256/ormlite/stmt/GenericRowMapper;->mapRow(Lcom/j256/ormlite/support/DatabaseResults;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/SelectIterator;->last:Ljava/lang/Object;
a=0;// 
a=0;//     .line 271
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/j256/ormlite/stmt/SelectIterator;->alreadyMoved:Z
a=0;// 
a=0;//     .line 272
a=0;//     iget v0, p0, Lcom/j256/ormlite/stmt/SelectIterator;->rowC:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, p0, Lcom/j256/ormlite/stmt/SelectIterator;->rowC:I
a=0;// 
a=0;//     .line 273
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/SelectIterator;->last:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public close()V
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 240
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/SelectIterator;, "Lcom/j256/ormlite/stmt/SelectIterator<TT;TID;>;"
a=0;//     iget-boolean v0, p0, Lcom/j256/ormlite/stmt/SelectIterator;->closed:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 241
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/SelectIterator;->compiledStmt:Lcom/j256/ormlite/support/CompiledStatement;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/CompiledStatement;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/support/CompiledStatement;->close()V
a=0;// 
a=0;//     .line 242
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/j256/ormlite/stmt/SelectIterator;->closed:Z
a=0;// 
a=0;//     .line 243
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/SelectIterator;->last:Ljava/lang/Object;
a=0;// 
a=0;//     .line 244
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/SelectIterator;->statement:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 245
a=0;//     sget-object v0, Lcom/j256/ormlite/stmt/SelectIterator;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v1, "closed iterator @{} after {} rows"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     iget v3, p0, Lcom/j256/ormlite/stmt/SelectIterator;->rowC:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 247
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/SelectIterator;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/SelectIterator;->connection:Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     invoke-interface {v0, v1}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     .line 249
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public closeQuietly()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 253
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/SelectIterator;, "Lcom/j256/ormlite/stmt/SelectIterator<TT;TID;>;"
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/stmt/SelectIterator;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 257
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 254
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public current()Ljava/lang/Object;
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
a=0;//     .line 132
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/SelectIterator;, "Lcom/j256/ormlite/stmt/SelectIterator<TT;TID;>;"
a=0;//     iget-boolean v0, p0, Lcom/j256/ormlite/stmt/SelectIterator;->closed:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 133
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 138
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 135
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     iget-boolean v0, p0, Lcom/j256/ormlite/stmt/SelectIterator;->first:Z
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 136
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/stmt/SelectIterator;->first()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 138
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/stmt/SelectIterator;->getCurrent()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public first()Ljava/lang/Object;
a=0;//     .locals 2
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
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/SelectIterator;, "Lcom/j256/ormlite/stmt/SelectIterator<TT;TID;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 108
a=0;//     #v0=(Null);
a=0;//     iget-boolean v1, p0, Lcom/j256/ormlite/stmt/SelectIterator;->closed:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 115
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 111
a=0;//     :cond_1
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, p0, Lcom/j256/ormlite/stmt/SelectIterator;->first:Z
a=0;// 
a=0;//     .line 112
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/SelectIterator;->results:Lcom/j256/ormlite/support/DatabaseResults;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/DatabaseResults;);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/support/DatabaseResults;->first()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 113
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/stmt/SelectIterator;->getCurrent()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getRawResults()Lcom/j256/ormlite/support/DatabaseResults;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 260
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/SelectIterator;, "Lcom/j256/ormlite/stmt/SelectIterator<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/SelectIterator;->results:Lcom/j256/ormlite/support/DatabaseResults;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseResults;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public hasNext()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 98
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/SelectIterator;, "Lcom/j256/ormlite/stmt/SelectIterator<TT;TID;>;"
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/stmt/SelectIterator;->hasNextThrow()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     .line 99
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 100
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-object v1, p0, Lcom/j256/ormlite/stmt/SelectIterator;->last:Ljava/lang/Object;
a=0;// 
a=0;//     .line 101
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/stmt/SelectIterator;->closeQuietly()V
a=0;// 
a=0;//     .line 103
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Errors getting more results of "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/stmt/SelectIterator;->dataClass:Ljava/lang/Class;
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
a=0;// .method public hasNextThrow()Z
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/SelectIterator;, "Lcom/j256/ormlite/stmt/SelectIterator<TT;TID;>;"
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 69
a=0;//     #v0=(Null);
a=0;//     iget-boolean v2, p0, Lcom/j256/ormlite/stmt/SelectIterator;->closed:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 87
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 72
a=0;//     :cond_0
a=0;//     #v0=(Null);v2=(Boolean);
a=0;//     iget-boolean v2, p0, Lcom/j256/ormlite/stmt/SelectIterator;->alreadyMoved:Z
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 74
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 77
a=0;//     :cond_1
a=0;//     #v0=(Null);
a=0;//     iget-boolean v2, p0, Lcom/j256/ormlite/stmt/SelectIterator;->first:Z
a=0;// 
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 78
a=0;//     iput-boolean v0, p0, Lcom/j256/ormlite/stmt/SelectIterator;->first:Z
a=0;// 
a=0;//     .line 79
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/stmt/SelectIterator;->results:Lcom/j256/ormlite/support/DatabaseResults;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/DatabaseResults;);
a=0;//     invoke-interface {v2}, Lcom/j256/ormlite/support/DatabaseResults;->first()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 83
a=0;//     .local v0, "result":Z
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 84
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/stmt/SelectIterator;->close()V
a=0;// 
a=0;//     .line 86
a=0;//     :cond_2
a=0;//     iput-boolean v1, p0, Lcom/j256/ormlite/stmt/SelectIterator;->alreadyMoved:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 81
a=0;//     .end local v0    # "result":Z
a=0;//     :cond_3
a=0;//     #v0=(Null);v2=(Boolean);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/stmt/SelectIterator;->results:Lcom/j256/ormlite/support/DatabaseResults;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/DatabaseResults;);
a=0;//     invoke-interface {v2}, Lcom/j256/ormlite/support/DatabaseResults;->next()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .restart local v0    # "result":Z
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public moveRelative(I)Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .param p1, "offset"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(I)TT;"
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
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/SelectIterator;, "Lcom/j256/ormlite/stmt/SelectIterator<TT;TID;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 187
a=0;//     #v0=(Null);
a=0;//     iget-boolean v1, p0, Lcom/j256/ormlite/stmt/SelectIterator;->closed:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 194
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 190
a=0;//     :cond_1
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, p0, Lcom/j256/ormlite/stmt/SelectIterator;->first:Z
a=0;// 
a=0;//     .line 191
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/SelectIterator;->results:Lcom/j256/ormlite/support/DatabaseResults;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/DatabaseResults;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/support/DatabaseResults;->moveRelative(I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 192
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/stmt/SelectIterator;->getCurrent()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public moveToNext()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/SelectIterator;, "Lcom/j256/ormlite/stmt/SelectIterator<TT;TID;>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 264
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/SelectIterator;->last:Ljava/lang/Object;
a=0;// 
a=0;//     .line 265
a=0;//     iput-boolean v1, p0, Lcom/j256/ormlite/stmt/SelectIterator;->first:Z
a=0;// 
a=0;//     .line 266
a=0;//     iput-boolean v1, p0, Lcom/j256/ormlite/stmt/SelectIterator;->alreadyMoved:Z
a=0;// 
a=0;//     .line 267
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public next()Ljava/lang/Object;
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 171
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/SelectIterator;, "Lcom/j256/ormlite/stmt/SelectIterator<TT;TID;>;"
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 173
a=0;//     .local v2, "sqlException":Ljava/sql/SQLException;
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/stmt/SelectIterator;->nextThrow()Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 174
a=0;//     .local v1, "result":Ljava/lang/Object;, "TT;"
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 175
a=0;//     return-object v1
a=0;// 
a=0;//     .line 177
a=0;//     .end local v1    # "result":Ljava/lang/Object;, "TT;"
a=0;//     :catch_0
a=0;//     #v1=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 178
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     .line 181
a=0;//     .end local v0    # "e":Ljava/sql/SQLException;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Ljava/sql/SQLException;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iput-object v3, p0, Lcom/j256/ormlite/stmt/SelectIterator;->last:Ljava/lang/Object;
a=0;// 
a=0;//     .line 182
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/stmt/SelectIterator;->closeQuietly()V
a=0;// 
a=0;//     .line 183
a=0;//     new-instance v3, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "Could not get next result for "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, p0, Lcom/j256/ormlite/stmt/SelectIterator;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v3
a=0;// .end method
a=0;// 
a=0;// .method public nextThrow()Ljava/lang/Object;
a=0;//     .locals 4
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
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/SelectIterator;, "Lcom/j256/ormlite/stmt/SelectIterator<TT;TID;>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 143
a=0;//     #v3=(Null);
a=0;//     iget-boolean v2, p0, Lcom/j256/ormlite/stmt/SelectIterator;->closed:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 161
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/Object;);v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 146
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Null);v2=(Boolean);
a=0;//     iget-boolean v2, p0, Lcom/j256/ormlite/stmt/SelectIterator;->alreadyMoved:Z
a=0;// 
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 148
a=0;//     iget-boolean v2, p0, Lcom/j256/ormlite/stmt/SelectIterator;->first:Z
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 149
a=0;//     iput-boolean v3, p0, Lcom/j256/ormlite/stmt/SelectIterator;->first:Z
a=0;// 
a=0;//     .line 150
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/stmt/SelectIterator;->results:Lcom/j256/ormlite/support/DatabaseResults;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/DatabaseResults;);
a=0;//     invoke-interface {v2}, Lcom/j256/ormlite/support/DatabaseResults;->first()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 155
a=0;//     .local v0, "hasResult":Z
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 156
a=0;//     iput-boolean v3, p0, Lcom/j256/ormlite/stmt/SelectIterator;->first:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 152
a=0;//     .end local v0    # "hasResult":Z
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(Boolean);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/stmt/SelectIterator;->results:Lcom/j256/ormlite/support/DatabaseResults;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/DatabaseResults;);
a=0;//     invoke-interface {v2}, Lcom/j256/ormlite/support/DatabaseResults;->next()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .restart local v0    # "hasResult":Z
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 160
a=0;//     .end local v0    # "hasResult":Z
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     iput-boolean v3, p0, Lcom/j256/ormlite/stmt/SelectIterator;->first:Z
a=0;// 
a=0;//     .line 161
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/stmt/SelectIterator;->getCurrent()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public previous()Ljava/lang/Object;
a=0;//     .locals 2
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
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/SelectIterator;, "Lcom/j256/ormlite/stmt/SelectIterator<TT;TID;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 120
a=0;//     #v0=(Null);
a=0;//     iget-boolean v1, p0, Lcom/j256/ormlite/stmt/SelectIterator;->closed:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 127
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 123
a=0;//     :cond_1
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, p0, Lcom/j256/ormlite/stmt/SelectIterator;->first:Z
a=0;// 
a=0;//     .line 124
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/SelectIterator;->results:Lcom/j256/ormlite/support/DatabaseResults;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/DatabaseResults;);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/support/DatabaseResults;->previous()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 125
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/stmt/SelectIterator;->getCurrent()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public remove()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 231
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/SelectIterator;, "Lcom/j256/ormlite/stmt/SelectIterator<TT;TID;>;"
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/stmt/SelectIterator;->removeThrow()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 237
a=0;//     return-void
a=0;// 
a=0;//     .line 232
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 233
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/stmt/SelectIterator;->closeQuietly()V
a=0;// 
a=0;//     .line 235
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Could not delete "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/stmt/SelectIterator;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " object "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/stmt/SelectIterator;->last:Ljava/lang/Object;
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
a=0;// .method public removeThrow()V
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/SelectIterator;, "Lcom/j256/ormlite/stmt/SelectIterator<TT;TID;>;"
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 207
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/SelectIterator;->last:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 208
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "No last "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/stmt/SelectIterator;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " object to remove. Must be called after a call to next."
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 211
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Null);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/SelectIterator;->classDao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 213
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Cannot remove "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/stmt/SelectIterator;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " object because classDao not initialized"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 216
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v1=(Uninit);v2=(Null);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/SelectIterator;->classDao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/SelectIterator;->last:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0, v1}, Lcom/j256/ormlite/dao/Dao;->delete(Ljava/lang/Object;)I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 219
a=0;//     iput-object v2, p0, Lcom/j256/ormlite/stmt/SelectIterator;->last:Ljava/lang/Object;
a=0;// 
a=0;//     .line 221
a=0;//     return-void
a=0;// 
a=0;//     .line 219
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     iput-object v2, p0, Lcom/j256/ormlite/stmt/SelectIterator;->last:Ljava/lang/Object;
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
