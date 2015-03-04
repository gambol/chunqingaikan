package com.j256.ormlite.stmt; class StatementExecutor { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// .super Ljava/lang/Object;
a=0;// .source "StatementExecutor.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/j256/ormlite/stmt/GenericRowMapper;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/j256/ormlite/stmt/StatementExecutor$ObjectArrayRowMapper;,
a=0;//         Lcom/j256/ormlite/stmt/StatementExecutor$UserObjectRowMapper;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T:",
a=0;//         "Ljava/lang/Object;",
a=0;//         "ID:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/lang/Object;",
a=0;//         "Lcom/j256/ormlite/stmt/GenericRowMapper",
a=0;//         "<[",
a=0;//         "Ljava/lang/String;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;// .field private static final noFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private countStarQuery:Ljava/lang/String;
a=0;// 
a=0;// .field private final dao:Lcom/j256/ormlite/dao/Dao;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/dao/Dao",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;// .field private ifExistsFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;// .field private ifExistsQuery:Ljava/lang/String;
a=0;// 
a=0;// .field private mappedDelete:Lcom/j256/ormlite/stmt/mapped/MappedDelete;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/stmt/mapped/MappedDelete",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mappedInsert:Lcom/j256/ormlite/stmt/mapped/MappedCreate;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/stmt/mapped/MappedCreate",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mappedQueryForId:Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/stmt/mapped/MappedQueryForId",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mappedRefresh:Lcom/j256/ormlite/stmt/mapped/MappedRefresh;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/stmt/mapped/MappedRefresh",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mappedUpdate:Lcom/j256/ormlite/stmt/mapped/MappedUpdate;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/stmt/mapped/MappedUpdate",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mappedUpdateId:Lcom/j256/ormlite/stmt/mapped/MappedUpdateId;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/stmt/mapped/MappedUpdateId",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private preparedQueryForAll:Lcom/j256/ormlite/stmt/PreparedQuery;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/stmt/PreparedQuery",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private rawRowMapper:Lcom/j256/ormlite/dao/RawRowMapper;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/dao/RawRowMapper",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/table/TableInfo",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     const-class v0, Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0}, Lcom/j256/ormlite/logger/LoggerFactory;->getLogger(Ljava/lang/Class;)Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/j256/ormlite/stmt/StatementExecutor;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     .line 50
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     sput-object v0, Lcom/j256/ormlite/stmt/StatementExecutor;->noFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Lcom/j256/ormlite/dao/Dao;)V
a=0;//     .locals 0
a=0;//     .param p1, "databaseType"    # Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/db/DatabaseType;",
a=0;//             "Lcom/j256/ormlite/table/TableInfo",
a=0;//             "<TT;TID;>;",
a=0;//             "Lcom/j256/ormlite/dao/Dao",
a=0;//             "<TT;TID;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     .local p2, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     .local p3, "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;TID;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 71
a=0;//     #p0=(Reference,Lcom/j256/ormlite/stmt/StatementExecutor;);
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     .line 72
a=0;//     iput-object p2, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     .line 73
a=0;//     iput-object p3, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     .line 74
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private assignStatementArguments(Lcom/j256/ormlite/support/CompiledStatement;[Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p1, "compiledStatement"    # Lcom/j256/ormlite/support/CompiledStatement;
a=0;//     .param p2, "arguments"    # [Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 553
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     array-length v1, p2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 554
a=0;//     aget-object v1, p2, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     sget-object v2, Lcom/j256/ormlite/field/SqlType;->STRING:Lcom/j256/ormlite/field/SqlType;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/field/SqlType;);
a=0;//     invoke-interface {p1, v0, v1, v2}, Lcom/j256/ormlite/support/CompiledStatement;->setObject(ILjava/lang/Object;Lcom/j256/ormlite/field/SqlType;)V
a=0;// 
a=0;//     .line 553
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 556
a=0;//     :cond_0
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private prepareQueryForAll()V
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 559
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->preparedQueryForAll:Lcom/j256/ormlite/stmt/PreparedQuery;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/PreparedQuery;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 560
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/QueryBuilder;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/j256/ormlite/stmt/QueryBuilder;-><init>(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Lcom/j256/ormlite/dao/Dao;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/QueryBuilder;);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/stmt/QueryBuilder;->prepare()Lcom/j256/ormlite/stmt/PreparedQuery;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->preparedQueryForAll:Lcom/j256/ormlite/stmt/PreparedQuery;
a=0;// 
a=0;//     .line 562
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public buildIterator(Lcom/j256/ormlite/dao/BaseDaoImpl;Lcom/j256/ormlite/support/ConnectionSource;ILcom/j256/ormlite/dao/ObjectCache;)Lcom/j256/ormlite/stmt/SelectIterator;
a=0;//     .locals 6
a=0;//     .param p2, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .param p3, "resultFlags"    # I
a=0;//     .param p4, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/dao/BaseDaoImpl",
a=0;//             "<TT;TID;>;",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "I",
a=0;//             "Lcom/j256/ormlite/dao/ObjectCache;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/stmt/SelectIterator",
a=0;//             "<TT;TID;>;"
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
a=0;//     .line 201
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     .local p1, "classDao":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/stmt/StatementExecutor;->prepareQueryForAll()V
a=0;// 
a=0;//     .line 202
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->preparedQueryForAll:Lcom/j256/ormlite/stmt/PreparedQuery;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/stmt/PreparedQuery;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/StatementExecutor;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/BaseDaoImpl;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     move-object v4, p4
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     move v5, p3
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/j256/ormlite/stmt/StatementExecutor;->buildIterator(Lcom/j256/ormlite/dao/BaseDaoImpl;Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/stmt/PreparedStmt;Lcom/j256/ormlite/dao/ObjectCache;I)Lcom/j256/ormlite/stmt/SelectIterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public buildIterator(Lcom/j256/ormlite/dao/BaseDaoImpl;Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/stmt/PreparedStmt;Lcom/j256/ormlite/dao/ObjectCache;I)Lcom/j256/ormlite/stmt/SelectIterator;
a=0;//     .locals 9
a=0;//     .param p2, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .param p4, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .param p5, "resultFlags"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/dao/BaseDaoImpl",
a=0;//             "<TT;TID;>;",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Lcom/j256/ormlite/stmt/PreparedStmt",
a=0;//             "<TT;>;",
a=0;//             "Lcom/j256/ormlite/dao/ObjectCache;",
a=0;//             "I)",
a=0;//             "Lcom/j256/ormlite/stmt/SelectIterator",
a=0;//             "<TT;TID;>;"
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
a=0;//     .line 228
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     .local p1, "classDao":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p3, "preparedStmt":Lcom/j256/ormlite/stmt/PreparedStmt;, "Lcom/j256/ormlite/stmt/PreparedStmt<TT;>;"
a=0;//     invoke-interface {p2}, Lcom/j256/ormlite/support/ConnectionSource;->getReadOnlyConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 229
a=0;//     .local v5, "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     #v5=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 231
a=0;//     .local v6, "compiledStatement":Lcom/j256/ormlite/support/CompiledStatement;
a=0;//     :try_start_0
a=0;//     #v6=(Null);
a=0;//     sget-object v1, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->SELECT:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     invoke-interface {p3, v5, v1, p5}, Lcom/j256/ormlite/stmt/PreparedStmt;->compile(Lcom/j256/ormlite/support/DatabaseConnection;Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;I)Lcom/j256/ormlite/support/CompiledStatement;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 232
a=0;//     #v6=(Reference,Lcom/j256/ormlite/support/CompiledStatement;);
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/SelectIterator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/SelectIterator;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/table/TableInfo;->getDataClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {p3}, Lcom/j256/ormlite/stmt/PreparedStmt;->getStatement()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/dao/BaseDaoImpl;);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/stmt/PreparedStmt;);
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     move-object v8, p4
a=0;// 
a=0;//     #v8=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     invoke-direct/range {v0 .. v8}, Lcom/j256/ormlite/stmt/SelectIterator;-><init>(Ljava/lang/Class;Lcom/j256/ormlite/dao/Dao;Lcom/j256/ormlite/stmt/GenericRowMapper;Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/support/DatabaseConnection;Lcom/j256/ormlite/support/CompiledStatement;Ljava/lang/String;Lcom/j256/ormlite/dao/ObjectCache;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 235
a=0;//     .local v0, "iterator":Lcom/j256/ormlite/stmt/SelectIterator;, "Lcom/j256/ormlite/stmt/SelectIterator<TT;TID;>;"
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/SelectIterator;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 236
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 239
a=0;//     #v6=(Null);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 240
a=0;//     invoke-interface {v6}, Lcom/j256/ormlite/support/CompiledStatement;->close()V
a=0;// 
a=0;//     .line 242
a=0;//     :cond_0
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 243
a=0;//     invoke-interface {p2, v5}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     :cond_1
a=0;//     return-object v0
a=0;// 
a=0;//     .line 239
a=0;//     .end local v0    # "iterator":Lcom/j256/ormlite/stmt/SelectIterator;, "Lcom/j256/ormlite/stmt/SelectIterator<TT;TID;>;"
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);v6=(Reference,Lcom/j256/ormlite/support/CompiledStatement;);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 240
a=0;//     invoke-interface {v6}, Lcom/j256/ormlite/support/CompiledStatement;->close()V
a=0;// 
a=0;//     .line 242
a=0;//     :cond_2
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     .line 243
a=0;//     invoke-interface {p2, v5}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     :cond_3
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public callBatchTasks(Lcom/j256/ormlite/support/DatabaseConnection;ZLjava/util/concurrent/Callable;)Ljava/lang/Object;
a=0;//     .locals 6
a=0;//     .param p1, "connection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p2, "saved"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<CT:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/support/DatabaseConnection;",
a=0;//             "Z",
a=0;//             "Ljava/util/concurrent/Callable",
a=0;//             "<TCT;>;)TCT;"
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
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     .local p3, "callable":Ljava/util/concurrent/Callable;, "Ljava/util/concurrent/Callable<TCT;>;"
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 496
a=0;//     #v5=(One);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     invoke-interface {v2}, Lcom/j256/ormlite/db/DatabaseType;->isBatchUseTransaction()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 497
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     invoke-static {p1, p2, v2, p3}, Lcom/j256/ormlite/misc/TransactionManager;->callInTransaction(Lcom/j256/ormlite/support/DatabaseConnection;ZLcom/j256/ormlite/db/DatabaseType;Ljava/util/concurrent/Callable;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 525
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 499
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 501
a=0;//     .local v0, "autoCommitAtStart":Z
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-interface {p1}, Lcom/j256/ormlite/support/DatabaseConnection;->isAutoCommitSupported()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 502
a=0;//     invoke-interface {p1}, Lcom/j256/ormlite/support/DatabaseConnection;->isAutoCommit()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 503
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 505
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {p1, v2}, Lcom/j256/ormlite/support/DatabaseConnection;->setAutoCommit(Z)V
a=0;// 
a=0;//     .line 506
a=0;//     sget-object v2, Lcom/j256/ormlite/stmt/StatementExecutor;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v3, "disabled auto-commit on table {} before batch tasks"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-virtual {v4}, Lcom/j256/ormlite/table/TableInfo;->getTableName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 510
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {p3}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;
a=0;//     :try_end_1
a=0;//     .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 517
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 524
a=0;//     invoke-interface {p1, v5}, Lcom/j256/ormlite/support/DatabaseConnection;->setAutoCommit(Z)V
a=0;// 
a=0;//     .line 525
a=0;//     sget-object v3, Lcom/j256/ormlite/stmt/StatementExecutor;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v4, "re-enabled auto-commit on table {} after batch tasks"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v5=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-virtual {v5}, Lcom/j256/ormlite/table/TableInfo;->getTableName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v3, v4, v5}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 511
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(One);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 512
a=0;//     .local v1, "e":Ljava/sql/SQLException;
a=0;//     :try_start_2
a=0;//     #v1=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v1
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 517
a=0;//     .end local v1    # "e":Ljava/sql/SQLException;
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 524
a=0;//     invoke-interface {p1, v5}, Lcom/j256/ormlite/support/DatabaseConnection;->setAutoCommit(Z)V
a=0;// 
a=0;//     .line 525
a=0;//     sget-object v3, Lcom/j256/ormlite/stmt/StatementExecutor;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v4, "re-enabled auto-commit on table {} after batch tasks"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v5=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-virtual {v5}, Lcom/j256/ormlite/table/TableInfo;->getTableName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v3, v4, v5}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     throw v2
a=0;// 
a=0;//     .line 513
a=0;//     :catch_1
a=0;//     #v1=(Uninit);v2=(Conflicted);v5=(One);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 514
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     :try_start_3
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v2, "Batch tasks callable threw non-SQL exception"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v1}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     throw v2
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// .end method
a=0;// 
a=0;// .method public create(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)I
a=0;//     .locals 2
a=0;//     .param p1, "databaseConnection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p3, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/DatabaseConnection;",
a=0;//             "TT;",
a=0;//             "Lcom/j256/ormlite/dao/ObjectCache;",
a=0;//             ")I"
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
a=0;//     .line 391
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     .local p2, "data":Ljava/lang/Object;, "TT;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->mappedInsert:Lcom/j256/ormlite/stmt/mapped/MappedCreate;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedCreate;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 392
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-static {v0, v1}, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->build(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;)Lcom/j256/ormlite/stmt/mapped/MappedCreate;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->mappedInsert:Lcom/j256/ormlite/stmt/mapped/MappedCreate;
a=0;// 
a=0;//     .line 394
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->mappedInsert:Lcom/j256/ormlite/stmt/mapped/MappedCreate;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     invoke-virtual {v0, v1, p1, p2, p3}, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->insert(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public delete(Lcom/j256/ormlite/support/DatabaseConnection;Lcom/j256/ormlite/stmt/PreparedDelete;)I
a=0;//     .locals 2
a=0;//     .param p1, "databaseConnection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/DatabaseConnection;",
a=0;//             "Lcom/j256/ormlite/stmt/PreparedDelete",
a=0;//             "<TT;>;)I"
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
a=0;//     .line 483
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     .local p2, "preparedDelete":Lcom/j256/ormlite/stmt/PreparedDelete;, "Lcom/j256/ormlite/stmt/PreparedDelete<TT;>;"
a=0;//     sget-object v1, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->DELETE:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     invoke-interface {p2, p1, v1}, Lcom/j256/ormlite/stmt/PreparedDelete;->compile(Lcom/j256/ormlite/support/DatabaseConnection;Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;)Lcom/j256/ormlite/support/CompiledStatement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 485
a=0;//     .local v0, "stmt":Lcom/j256/ormlite/support/CompiledStatement;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/CompiledStatement;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/support/CompiledStatement;->runUpdate()I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 487
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/support/CompiledStatement;->close()V
a=0;// 
a=0;//     return v1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/support/CompiledStatement;->close()V
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public delete(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)I
a=0;//     .locals 2
a=0;//     .param p1, "databaseConnection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p3, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/DatabaseConnection;",
a=0;//             "TT;",
a=0;//             "Lcom/j256/ormlite/dao/ObjectCache;",
a=0;//             ")I"
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
a=0;//     .line 445
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     .local p2, "data":Ljava/lang/Object;, "TT;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->mappedDelete:Lcom/j256/ormlite/stmt/mapped/MappedDelete;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedDelete;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 446
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-static {v0, v1}, Lcom/j256/ormlite/stmt/mapped/MappedDelete;->build(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;)Lcom/j256/ormlite/stmt/mapped/MappedDelete;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->mappedDelete:Lcom/j256/ormlite/stmt/mapped/MappedDelete;
a=0;// 
a=0;//     .line 448
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->mappedDelete:Lcom/j256/ormlite/stmt/mapped/MappedDelete;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcom/j256/ormlite/stmt/mapped/MappedDelete;->delete(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public deleteById(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)I
a=0;//     .locals 2
a=0;//     .param p1, "databaseConnection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p3, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/DatabaseConnection;",
a=0;//             "TID;",
a=0;//             "Lcom/j256/ormlite/dao/ObjectCache;",
a=0;//             ")I"
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
a=0;//     .line 455
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     .local p2, "id":Ljava/lang/Object;, "TID;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->mappedDelete:Lcom/j256/ormlite/stmt/mapped/MappedDelete;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedDelete;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 456
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-static {v0, v1}, Lcom/j256/ormlite/stmt/mapped/MappedDelete;->build(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;)Lcom/j256/ormlite/stmt/mapped/MappedDelete;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->mappedDelete:Lcom/j256/ormlite/stmt/mapped/MappedDelete;
a=0;// 
a=0;//     .line 458
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->mappedDelete:Lcom/j256/ormlite/stmt/mapped/MappedDelete;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcom/j256/ormlite/stmt/mapped/MappedDelete;->deleteById(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public deleteIds(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/util/Collection;Lcom/j256/ormlite/dao/ObjectCache;)I
a=0;//     .locals 2
a=0;//     .param p1, "databaseConnection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p3, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/DatabaseConnection;",
a=0;//             "Ljava/util/Collection",
a=0;//             "<TID;>;",
a=0;//             "Lcom/j256/ormlite/dao/ObjectCache;",
a=0;//             ")I"
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
a=0;//     .line 476
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     .local p2, "ids":Ljava/util/Collection;, "Ljava/util/Collection<TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-static {v0, v1, p1, p2, p3}, Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection;->deleteIds(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Lcom/j256/ormlite/support/DatabaseConnection;Ljava/util/Collection;Lcom/j256/ormlite/dao/ObjectCache;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public deleteObjects(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/util/Collection;Lcom/j256/ormlite/dao/ObjectCache;)I
a=0;//     .locals 2
a=0;//     .param p1, "databaseConnection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p3, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/DatabaseConnection;",
a=0;//             "Ljava/util/Collection",
a=0;//             "<TT;>;",
a=0;//             "Lcom/j256/ormlite/dao/ObjectCache;",
a=0;//             ")I"
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
a=0;//     .line 467
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     .local p2, "datas":Ljava/util/Collection;, "Ljava/util/Collection<TT;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-static {v0, v1, p1, p2, p3}, Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection;->deleteObjects(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Lcom/j256/ormlite/support/DatabaseConnection;Ljava/util/Collection;Lcom/j256/ormlite/dao/ObjectCache;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public executeRaw(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/String;[Ljava/lang/String;)I
a=0;//     .locals 3
a=0;//     .param p1, "connection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p2, "statement"    # Ljava/lang/String;
a=0;//     .param p3, "arguments"    # [Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 372
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     sget-object v1, Lcom/j256/ormlite/stmt/StatementExecutor;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v2, "running raw execute statement: {}"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, p2}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 373
a=0;//     array-length v1, p3
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 375
a=0;//     sget-object v1, Lcom/j256/ormlite/stmt/StatementExecutor;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v2, "execute arguments: {}"
a=0;// 
a=0;//     invoke-virtual {v1, v2, p3}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 377
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v1, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->EXECUTE:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     sget-object v2, Lcom/j256/ormlite/stmt/StatementExecutor;->noFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     invoke-interface {p1, p2, v1, v2}, Lcom/j256/ormlite/support/DatabaseConnection;->compileStatement(Ljava/lang/String;Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;[Lcom/j256/ormlite/field/FieldType;)Lcom/j256/ormlite/support/CompiledStatement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 380
a=0;//     .local v0, "compiledStatement":Lcom/j256/ormlite/support/CompiledStatement;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/CompiledStatement;);
a=0;//     invoke-direct {p0, v0, p3}, Lcom/j256/ormlite/stmt/StatementExecutor;->assignStatementArguments(Lcom/j256/ormlite/support/CompiledStatement;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 381
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/support/CompiledStatement;->runExecute()I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 383
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/support/CompiledStatement;->close()V
a=0;// 
a=0;//     return v1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/support/CompiledStatement;->close()V
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public executeRawNoArgs(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/String;)I
a=0;//     .locals 2
a=0;//     .param p1, "connection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p2, "statement"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 364
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     sget-object v0, Lcom/j256/ormlite/stmt/StatementExecutor;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v1, "running raw execute statement: {}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p2}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 365
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-interface {p1, p2, v0}, Lcom/j256/ormlite/support/DatabaseConnection;->executeStatement(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getRawRowMapper()Lcom/j256/ormlite/dao/RawRowMapper;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/dao/RawRowMapper",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 217
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->rawRowMapper:Lcom/j256/ormlite/dao/RawRowMapper;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/RawRowMapper;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 218
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/RawRowMapperImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/RawRowMapperImpl;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-direct {v0, v1}, Lcom/j256/ormlite/stmt/RawRowMapperImpl;-><init>(Lcom/j256/ormlite/table/TableInfo;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/RawRowMapperImpl;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->rawRowMapper:Lcom/j256/ormlite/dao/RawRowMapper;
a=0;// 
a=0;//     .line 220
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->rawRowMapper:Lcom/j256/ormlite/dao/RawRowMapper;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getSelectStarRowMapper()Lcom/j256/ormlite/stmt/GenericRowMapper;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/stmt/GenericRowMapper",
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
a=0;//     .line 209
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/stmt/StatementExecutor;->prepareQueryForAll()V
a=0;// 
a=0;//     .line 210
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->preparedQueryForAll:Lcom/j256/ormlite/stmt/PreparedQuery;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/PreparedQuery;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public ifExists(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;)Z
a=0;//     .locals 9
a=0;//     .param p1, "connection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/DatabaseConnection;",
a=0;//             "TID;)Z"
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
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     .local p2, "id":Ljava/lang/Object;, "TID;"
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 540
a=0;//     #v4=(Null);
a=0;//     iget-object v5, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->ifExistsQuery:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     .line 541
a=0;//     new-instance v2, Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/j256/ormlite/stmt/QueryBuilder;);
a=0;//     iget-object v5, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v6=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     iget-object v7, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v7=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-direct {v2, v5, v6, v7}, Lcom/j256/ormlite/stmt/QueryBuilder;-><init>(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Lcom/j256/ormlite/dao/Dao;)V
a=0;// 
a=0;//     .line 542
a=0;//     .local v2, "qb":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     #v2=(Reference,Lcom/j256/ormlite/stmt/QueryBuilder;);
a=0;//     new-array v5, v3, [Ljava/lang/String;
a=0;// 
a=0;//     const-string v6, "COUNT(*)"
a=0;// 
a=0;//     aput-object v6, v5, v4
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Lcom/j256/ormlite/stmt/QueryBuilder;->selectRaw([Ljava/lang/String;)Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     .line 543
a=0;//     invoke-virtual {v2}, Lcom/j256/ormlite/stmt/QueryBuilder;->where()Lcom/j256/ormlite/stmt/Where;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/j256/ormlite/table/TableInfo;->getIdField()Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/j256/ormlite/field/FieldType;->getColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     new-instance v7, Lcom/j256/ormlite/stmt/SelectArg;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/j256/ormlite/stmt/SelectArg;);
a=0;//     invoke-direct {v7}, Lcom/j256/ormlite/stmt/SelectArg;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Lcom/j256/ormlite/stmt/SelectArg;);
a=0;//     invoke-virtual {v5, v6, v7}, Lcom/j256/ormlite/stmt/Where;->eq(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;
a=0;// 
a=0;//     .line 544
a=0;//     invoke-virtual {v2}, Lcom/j256/ormlite/stmt/QueryBuilder;->prepareStatementString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iput-object v5, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->ifExistsQuery:Ljava/lang/String;
a=0;// 
a=0;//     .line 545
a=0;//     new-array v5, v3, [Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/j256/ormlite/table/TableInfo;->getIdField()Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     aput-object v6, v5, v4
a=0;// 
a=0;//     iput-object v5, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->ifExistsFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .line 547
a=0;//     .end local v2    # "qb":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v5, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->ifExistsQuery:Ljava/lang/String;
a=0;// 
a=0;//     new-array v6, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object p2, v6, v4
a=0;// 
a=0;//     iget-object v7, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->ifExistsFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v7=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-interface {p1, v5, v6, v7}, Lcom/j256/ormlite/support/DatabaseConnection;->queryForLong(Ljava/lang/String;[Ljava/lang/Object;[Lcom/j256/ormlite/field/FieldType;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 548
a=0;//     .local v0, "count":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sget-object v5, Lcom/j256/ormlite/stmt/StatementExecutor;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v6, "query of \'{}\' returned {}"
a=0;// 
a=0;//     iget-object v7, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->ifExistsQuery:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v5, v6, v7, v8}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 549
a=0;//     const-wide/16 v5, 0x0
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     cmp-long v5, v0, v5
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Boolean);
a=0;//     return v3
a=0;// 
a=0;//     :cond_1
a=0;//     #v3=(One);
a=0;//     move v3, v4
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic mapRow(Lcom/j256/ormlite/support/DatabaseResults;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "x0"    # Lcom/j256/ormlite/support/DatabaseResults;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     invoke-virtual {p0, p1}, Lcom/j256/ormlite/stmt/StatementExecutor;->mapRow(Lcom/j256/ormlite/support/DatabaseResults;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public mapRow(Lcom/j256/ormlite/support/DatabaseResults;)[Ljava/lang/String;
a=0;//     .locals 4
a=0;//     .param p1, "results"    # Lcom/j256/ormlite/support/DatabaseResults;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 531
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     invoke-interface {p1}, Lcom/j256/ormlite/support/DatabaseResults;->getColumnCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 532
a=0;//     .local v1, "columnN":I
a=0;//     #v1=(Integer);
a=0;//     new-array v2, v1, [Ljava/lang/String;
a=0;// 
a=0;//     .line 533
a=0;//     .local v2, "result":[Ljava/lang/String;
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "colC":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 534
a=0;//     invoke-interface {p1, v0}, Lcom/j256/ormlite/support/DatabaseResults;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v2, v0
a=0;// 
a=0;//     .line 533
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 536
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method public query(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/stmt/PreparedStmt;Lcom/j256/ormlite/dao/ObjectCache;)Ljava/util/List;
a=0;//     .locals 8
a=0;//     .param p1, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .param p3, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Lcom/j256/ormlite/stmt/PreparedStmt",
a=0;//             "<TT;>;",
a=0;//             "Lcom/j256/ormlite/dao/ObjectCache;",
a=0;//             ")",
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
a=0;//     .line 181
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     .local p2, "preparedStmt":Lcom/j256/ormlite/stmt/PreparedStmt;, "Lcom/j256/ormlite/stmt/PreparedStmt<TT;>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/StatementExecutor;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/stmt/PreparedStmt;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/j256/ormlite/stmt/StatementExecutor;->buildIterator(Lcom/j256/ormlite/dao/BaseDaoImpl;Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/stmt/PreparedStmt;Lcom/j256/ormlite/dao/ObjectCache;I)Lcom/j256/ormlite/stmt/SelectIterator;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 185
a=0;//     .local v6, "iterator":Lcom/j256/ormlite/stmt/SelectIterator;, "Lcom/j256/ormlite/stmt/SelectIterator<TT;TID;>;"
a=0;//     :try_start_0
a=0;//     #v6=(Reference,Lcom/j256/ormlite/stmt/SelectIterator;);
a=0;//     new-instance v7, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 186
a=0;//     .local v7, "results":Ljava/util/List;, "Ljava/util/List<TT;>;"
a=0;//     :goto_0
a=0;//     #v7=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v6}, Lcom/j256/ormlite/stmt/SelectIterator;->hasNextThrow()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 187
a=0;//     invoke-virtual {v6}, Lcom/j256/ormlite/stmt/SelectIterator;->nextThrow()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 192
a=0;//     .end local v7    # "results":Ljava/util/List;, "Ljava/util/List<TT;>;"
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/String;);v3=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v6}, Lcom/j256/ormlite/stmt/SelectIterator;->close()V
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 189
a=0;//     .restart local v7    # "results":Ljava/util/List;, "Ljava/util/List<TT;>;"
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);v1=(Null);v3=(Reference,Lcom/j256/ormlite/stmt/PreparedStmt;);v7=(Reference,Ljava/util/ArrayList;);
a=0;//     sget-object v0, Lcom/j256/ormlite/stmt/StatementExecutor;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v1, "query of \'{}\' returned {} results"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p2}, Lcom/j256/ormlite/stmt/PreparedStmt;->getStatement()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v7}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 192
a=0;//     invoke-virtual {v6}, Lcom/j256/ormlite/stmt/SelectIterator;->close()V
a=0;// 
a=0;//     return-object v7
a=0;// .end method
a=0;// 
a=0;// .method public queryForAll(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/dao/ObjectCache;)Ljava/util/List;
a=0;//     .locals 1
a=0;//     .param p1, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .param p2, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Lcom/j256/ormlite/dao/ObjectCache;",
a=0;//             ")",
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
a=0;//     .line 112
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/stmt/StatementExecutor;->prepareQueryForAll()V
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->preparedQueryForAll:Lcom/j256/ormlite/stmt/PreparedQuery;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/PreparedQuery;);
a=0;//     invoke-virtual {p0, p1, v0, p2}, Lcom/j256/ormlite/stmt/StatementExecutor;->query(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/stmt/PreparedStmt;Lcom/j256/ormlite/dao/ObjectCache;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public queryForCountStar(Lcom/j256/ormlite/support/DatabaseConnection;)J
a=0;//     .locals 7
a=0;//     .param p1, "databaseConnection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->countStarQuery:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 121
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v3, 0x40
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 122
a=0;//     .local v2, "sb":Ljava/lang/StringBuilder;
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "SELECT COUNT(*) FROM "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 123
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-virtual {v4}, Lcom/j256/ormlite/table/TableInfo;->getTableName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-interface {v3, v2, v4}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 124
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->countStarQuery:Ljava/lang/String;
a=0;// 
a=0;//     .line 126
a=0;//     .end local v2    # "sb":Ljava/lang/StringBuilder;
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->countStarQuery:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {p1, v3}, Lcom/j256/ormlite/support/DatabaseConnection;->queryForLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 127
a=0;//     .local v0, "count":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sget-object v3, Lcom/j256/ormlite/stmt/StatementExecutor;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v4, "query of \'{}\' returned {}"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->countStarQuery:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v3, v4, v5, v6}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 128
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public queryForFirst(Lcom/j256/ormlite/support/DatabaseConnection;Lcom/j256/ormlite/stmt/PreparedStmt;Lcom/j256/ormlite/dao/ObjectCache;)Ljava/lang/Object;
a=0;//     .locals 5
a=0;//     .param p1, "databaseConnection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p3, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/DatabaseConnection;",
a=0;//             "Lcom/j256/ormlite/stmt/PreparedStmt",
a=0;//             "<TT;>;",
a=0;//             "Lcom/j256/ormlite/dao/ObjectCache;",
a=0;//             ")TT;"
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
a=0;//     .line 92
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     .local p2, "preparedStmt":Lcom/j256/ormlite/stmt/PreparedStmt;, "Lcom/j256/ormlite/stmt/PreparedStmt<TT;>;"
a=0;//     sget-object v2, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->SELECT:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     invoke-interface {p2, p1, v2}, Lcom/j256/ormlite/stmt/PreparedStmt;->compile(Lcom/j256/ormlite/support/DatabaseConnection;Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;)Lcom/j256/ormlite/support/CompiledStatement;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 94
a=0;//     .local v1, "stmt":Lcom/j256/ormlite/support/CompiledStatement;
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/CompiledStatement;);
a=0;//     invoke-interface {v1, p3}, Lcom/j256/ormlite/support/CompiledStatement;->runQuery(Lcom/j256/ormlite/dao/ObjectCache;)Lcom/j256/ormlite/support/DatabaseResults;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 95
a=0;//     .local v0, "results":Lcom/j256/ormlite/support/DatabaseResults;
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseResults;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/support/DatabaseResults;->first()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 96
a=0;//     sget-object v2, Lcom/j256/ormlite/stmt/StatementExecutor;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v3, "query-for-first of \'{}\' returned at least 1 result"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p2}, Lcom/j256/ormlite/stmt/PreparedStmt;->getStatement()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, v4}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 97
a=0;//     invoke-interface {p2, v0}, Lcom/j256/ormlite/stmt/PreparedStmt;->mapRow(Lcom/j256/ormlite/support/DatabaseResults;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 103
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/support/CompiledStatement;->close()V
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v2
a=0;// 
a=0;//     .line 99
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v2=(Boolean);v3=(Uninit);v4=(Uninit);
a=0;//     sget-object v2, Lcom/j256/ormlite/stmt/StatementExecutor;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v3, "query-for-first of \'{}\' returned at 0 results"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p2}, Lcom/j256/ormlite/stmt/PreparedStmt;->getStatement()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, v4}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 100
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 103
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/support/CompiledStatement;->close()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .end local v0    # "results":Lcom/j256/ormlite/support/DatabaseResults;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/support/CompiledStatement;->close()V
a=0;// 
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method public queryForId(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)Ljava/lang/Object;
a=0;//     .locals 3
a=0;//     .param p1, "databaseConnection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p3, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/DatabaseConnection;",
a=0;//             "TID;",
a=0;//             "Lcom/j256/ormlite/dao/ObjectCache;",
a=0;//             ")TT;"
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
a=0;//     .line 81
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     .local p2, "id":Ljava/lang/Object;, "TID;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->mappedQueryForId:Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 82
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v1, v2}, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->build(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Lcom/j256/ormlite/field/FieldType;)Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->mappedQueryForId:Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;
a=0;// 
a=0;//     .line 84
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->mappedQueryForId:Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->execute(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public queryForLong(Lcom/j256/ormlite/support/DatabaseConnection;Lcom/j256/ormlite/stmt/PreparedStmt;)J
a=0;//     .locals 5
a=0;//     .param p1, "databaseConnection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/DatabaseConnection;",
a=0;//             "Lcom/j256/ormlite/stmt/PreparedStmt",
a=0;//             "<TT;>;)J"
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
a=0;//     .line 135
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     .local p2, "preparedStmt":Lcom/j256/ormlite/stmt/PreparedStmt;, "Lcom/j256/ormlite/stmt/PreparedStmt<TT;>;"
a=0;//     sget-object v2, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->SELECT_LONG:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     invoke-interface {p2, p1, v2}, Lcom/j256/ormlite/stmt/PreparedStmt;->compile(Lcom/j256/ormlite/support/DatabaseConnection;Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;)Lcom/j256/ormlite/support/CompiledStatement;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 137
a=0;//     .local v1, "stmt":Lcom/j256/ormlite/support/CompiledStatement;
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/CompiledStatement;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v1, v2}, Lcom/j256/ormlite/support/CompiledStatement;->runQuery(Lcom/j256/ormlite/dao/ObjectCache;)Lcom/j256/ormlite/support/DatabaseResults;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 138
a=0;//     .local v0, "results":Lcom/j256/ormlite/support/DatabaseResults;
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseResults;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/support/DatabaseResults;->first()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 139
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v2}, Lcom/j256/ormlite/support/DatabaseResults;->getLong(I)J
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 144
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/support/CompiledStatement;->close()V
a=0;// 
a=0;//     return-wide v2
a=0;// 
a=0;//     .line 141
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v2=(Boolean);v3=(Uninit);
a=0;//     new-instance v2, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "No result found in queryForLong: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {p2}, Lcom/j256/ormlite/stmt/PreparedStmt;->getStatement()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v2
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 144
a=0;//     .end local v0    # "results":Lcom/j256/ormlite/support/DatabaseResults;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/support/CompiledStatement;->close()V
a=0;// 
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method public queryForLong(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/String;[Ljava/lang/String;)J
a=0;//     .locals 5
a=0;//     .param p1, "databaseConnection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p2, "query"    # Ljava/lang/String;
a=0;//     .param p3, "arguments"    # [Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 153
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     sget-object v2, Lcom/j256/ormlite/stmt/StatementExecutor;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v3, "executing raw query for long: {}"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, p2}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 154
a=0;//     array-length v2, p3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     .line 156
a=0;//     sget-object v2, Lcom/j256/ormlite/stmt/StatementExecutor;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v3, "query arguments: {}"
a=0;// 
a=0;//     invoke-virtual {v2, v3, p3}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 158
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 160
a=0;//     .local v1, "stmt":Lcom/j256/ormlite/support/CompiledStatement;
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     sget-object v2, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->SELECT:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     sget-object v3, Lcom/j256/ormlite/stmt/StatementExecutor;->noFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     invoke-interface {p1, p2, v2, v3}, Lcom/j256/ormlite/support/DatabaseConnection;->compileStatement(Ljava/lang/String;Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;[Lcom/j256/ormlite/field/FieldType;)Lcom/j256/ormlite/support/CompiledStatement;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 161
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/CompiledStatement;);
a=0;//     invoke-direct {p0, v1, p3}, Lcom/j256/ormlite/stmt/StatementExecutor;->assignStatementArguments(Lcom/j256/ormlite/support/CompiledStatement;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 162
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v1, v2}, Lcom/j256/ormlite/support/CompiledStatement;->runQuery(Lcom/j256/ormlite/dao/ObjectCache;)Lcom/j256/ormlite/support/DatabaseResults;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 163
a=0;//     .local v0, "results":Lcom/j256/ormlite/support/DatabaseResults;
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseResults;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/support/DatabaseResults;->first()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 164
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v2}, Lcom/j256/ormlite/support/DatabaseResults;->getLong(I)J
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 169
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 170
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/support/CompiledStatement;->close()V
a=0;// 
a=0;//     :cond_1
a=0;//     return-wide v2
a=0;// 
a=0;//     .line 166
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v2=(Boolean);v3=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     new-instance v2, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "No result found in queryForLong: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v2
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 169
a=0;//     .end local v0    # "results":Lcom/j256/ormlite/support/DatabaseResults;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 170
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/support/CompiledStatement;->close()V
a=0;// 
a=0;//     :cond_3
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method public queryRaw(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/String;Lcom/j256/ormlite/dao/RawRowMapper;[Ljava/lang/String;Lcom/j256/ormlite/dao/ObjectCache;)Lcom/j256/ormlite/dao/GenericRawResults;
a=0;//     .locals 8
a=0;//     .param p1, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .param p2, "query"    # Ljava/lang/String;
a=0;//     .param p4, "arguments"    # [Ljava/lang/String;
a=0;//     .param p5, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<UO:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/j256/ormlite/dao/RawRowMapper",
a=0;//             "<TUO;>;[",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/j256/ormlite/dao/ObjectCache;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/dao/GenericRawResults",
a=0;//             "<TUO;>;"
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
a=0;//     .line 284
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     .local p3, "rowMapper":Lcom/j256/ormlite/dao/RawRowMapper;, "Lcom/j256/ormlite/dao/RawRowMapper<TUO;>;"
a=0;//     sget-object v1, Lcom/j256/ormlite/stmt/StatementExecutor;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v3, "executing raw query for: {}"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3, p2}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 285
a=0;//     array-length v1, p4
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 287
a=0;//     sget-object v1, Lcom/j256/ormlite/stmt/StatementExecutor;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v3, "query arguments: {}"
a=0;// 
a=0;//     invoke-virtual {v1, v3, p4}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 289
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-interface {p1}, Lcom/j256/ormlite/support/ConnectionSource;->getReadOnlyConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 290
a=0;//     .local v2, "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 292
a=0;//     .local v5, "compiledStatement":Lcom/j256/ormlite/support/CompiledStatement;
a=0;//     :try_start_0
a=0;//     #v5=(Null);
a=0;//     sget-object v1, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->SELECT:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     sget-object v3, Lcom/j256/ormlite/stmt/StatementExecutor;->noFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     invoke-interface {v2, p2, v1, v3}, Lcom/j256/ormlite/support/DatabaseConnection;->compileStatement(Ljava/lang/String;Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;[Lcom/j256/ormlite/field/FieldType;)Lcom/j256/ormlite/support/CompiledStatement;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 293
a=0;//     #v5=(Reference,Lcom/j256/ormlite/support/CompiledStatement;);
a=0;//     invoke-direct {p0, v5, p4}, Lcom/j256/ormlite/stmt/StatementExecutor;->assignStatementArguments(Lcom/j256/ormlite/support/CompiledStatement;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 294
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/RawResultsImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/RawResultsImpl;);
a=0;//     const-class v4, [Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     new-instance v6, Lcom/j256/ormlite/stmt/StatementExecutor$UserObjectRowMapper;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/j256/ormlite/stmt/StatementExecutor$UserObjectRowMapper;);
a=0;//     invoke-direct {v6, p3, p0}, Lcom/j256/ormlite/stmt/StatementExecutor$UserObjectRowMapper;-><init>(Lcom/j256/ormlite/dao/RawRowMapper;Lcom/j256/ormlite/stmt/GenericRowMapper;)V
a=0;// 
a=0;//     #v6=(Reference,Lcom/j256/ormlite/stmt/StatementExecutor$UserObjectRowMapper;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     move-object v3, p2
a=0;// 
a=0;//     move-object v7, p5
a=0;// 
a=0;//     #v7=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/stmt/RawResultsImpl;-><init>(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/String;Ljava/lang/Class;Lcom/j256/ormlite/support/CompiledStatement;Lcom/j256/ormlite/stmt/GenericRowMapper;Lcom/j256/ormlite/dao/ObjectCache;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 297
a=0;//     .local v0, "rawResults":Lcom/j256/ormlite/stmt/RawResultsImpl;, "Lcom/j256/ormlite/stmt/RawResultsImpl<TUO;>;"
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/RawResultsImpl;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 298
a=0;//     #v5=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 301
a=0;//     #v2=(Null);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 302
a=0;//     invoke-interface {v5}, Lcom/j256/ormlite/support/CompiledStatement;->close()V
a=0;// 
a=0;//     .line 304
a=0;//     :cond_1
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 305
a=0;//     invoke-interface {p1, v2}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     :cond_2
a=0;//     return-object v0
a=0;// 
a=0;//     .line 301
a=0;//     .end local v0    # "rawResults":Lcom/j256/ormlite/stmt/RawResultsImpl;, "Lcom/j256/ormlite/stmt/RawResultsImpl<TUO;>;"
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);v4=(Conflicted);v5=(Reference,Lcom/j256/ormlite/support/CompiledStatement;);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     .line 302
a=0;//     invoke-interface {v5}, Lcom/j256/ormlite/support/CompiledStatement;->close()V
a=0;// 
a=0;//     .line 304
a=0;//     :cond_3
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 305
a=0;//     invoke-interface {p1, v2}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     :cond_4
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public queryRaw(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/String;[Lcom/j256/ormlite/field/DataType;[Ljava/lang/String;Lcom/j256/ormlite/dao/ObjectCache;)Lcom/j256/ormlite/dao/GenericRawResults;
a=0;//     .locals 8
a=0;//     .param p1, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .param p2, "query"    # Ljava/lang/String;
a=0;//     .param p3, "columnTypes"    # [Lcom/j256/ormlite/field/DataType;
a=0;//     .param p4, "arguments"    # [Ljava/lang/String;
a=0;//     .param p5, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Ljava/lang/String;",
a=0;//             "[",
a=0;//             "Lcom/j256/ormlite/field/DataType;",
a=0;//             "[",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/j256/ormlite/dao/ObjectCache;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/dao/GenericRawResults",
a=0;//             "<[",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;"
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
a=0;//     .line 315
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     sget-object v1, Lcom/j256/ormlite/stmt/StatementExecutor;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v3, "executing raw query for: {}"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3, p2}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 316
a=0;//     array-length v1, p4
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 318
a=0;//     sget-object v1, Lcom/j256/ormlite/stmt/StatementExecutor;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v3, "query arguments: {}"
a=0;// 
a=0;//     invoke-virtual {v1, v3, p4}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 320
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-interface {p1}, Lcom/j256/ormlite/support/ConnectionSource;->getReadOnlyConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 321
a=0;//     .local v2, "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 323
a=0;//     .local v5, "compiledStatement":Lcom/j256/ormlite/support/CompiledStatement;
a=0;//     :try_start_0
a=0;//     #v5=(Null);
a=0;//     sget-object v1, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->SELECT:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     sget-object v3, Lcom/j256/ormlite/stmt/StatementExecutor;->noFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     invoke-interface {v2, p2, v1, v3}, Lcom/j256/ormlite/support/DatabaseConnection;->compileStatement(Ljava/lang/String;Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;[Lcom/j256/ormlite/field/FieldType;)Lcom/j256/ormlite/support/CompiledStatement;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 324
a=0;//     #v5=(Reference,Lcom/j256/ormlite/support/CompiledStatement;);
a=0;//     invoke-direct {p0, v5, p4}, Lcom/j256/ormlite/stmt/StatementExecutor;->assignStatementArguments(Lcom/j256/ormlite/support/CompiledStatement;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 325
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/RawResultsImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/RawResultsImpl;);
a=0;//     const-class v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     new-instance v6, Lcom/j256/ormlite/stmt/StatementExecutor$ObjectArrayRowMapper;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/j256/ormlite/stmt/StatementExecutor$ObjectArrayRowMapper;);
a=0;//     invoke-direct {v6, p3}, Lcom/j256/ormlite/stmt/StatementExecutor$ObjectArrayRowMapper;-><init>([Lcom/j256/ormlite/field/DataType;)V
a=0;// 
a=0;//     #v6=(Reference,Lcom/j256/ormlite/stmt/StatementExecutor$ObjectArrayRowMapper;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     move-object v3, p2
a=0;// 
a=0;//     move-object v7, p5
a=0;// 
a=0;//     #v7=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/stmt/RawResultsImpl;-><init>(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/String;Ljava/lang/Class;Lcom/j256/ormlite/support/CompiledStatement;Lcom/j256/ormlite/stmt/GenericRowMapper;Lcom/j256/ormlite/dao/ObjectCache;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 328
a=0;//     .local v0, "rawResults":Lcom/j256/ormlite/stmt/RawResultsImpl;, "Lcom/j256/ormlite/stmt/RawResultsImpl<[Ljava/lang/Object;>;"
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/RawResultsImpl;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 329
a=0;//     #v5=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 332
a=0;//     #v2=(Null);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 333
a=0;//     invoke-interface {v5}, Lcom/j256/ormlite/support/CompiledStatement;->close()V
a=0;// 
a=0;//     .line 335
a=0;//     :cond_1
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 336
a=0;//     invoke-interface {p1, v2}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     :cond_2
a=0;//     return-object v0
a=0;// 
a=0;//     .line 332
a=0;//     .end local v0    # "rawResults":Lcom/j256/ormlite/stmt/RawResultsImpl;, "Lcom/j256/ormlite/stmt/RawResultsImpl<[Ljava/lang/Object;>;"
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);v4=(Conflicted);v5=(Reference,Lcom/j256/ormlite/support/CompiledStatement;);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     .line 333
a=0;//     invoke-interface {v5}, Lcom/j256/ormlite/support/CompiledStatement;->close()V
a=0;// 
a=0;//     .line 335
a=0;//     :cond_3
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 336
a=0;//     invoke-interface {p1, v2}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     :cond_4
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public queryRaw(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/String;[Ljava/lang/String;Lcom/j256/ormlite/dao/ObjectCache;)Lcom/j256/ormlite/dao/GenericRawResults;
a=0;//     .locals 8
a=0;//     .param p1, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .param p2, "query"    # Ljava/lang/String;
a=0;//     .param p3, "arguments"    # [Ljava/lang/String;
a=0;//     .param p4, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Ljava/lang/String;",
a=0;//             "[",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/j256/ormlite/dao/ObjectCache;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/dao/GenericRawResults",
a=0;//             "<[",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
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
a=0;//     .line 253
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     sget-object v1, Lcom/j256/ormlite/stmt/StatementExecutor;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v3, "executing raw query for: {}"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3, p2}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 254
a=0;//     array-length v1, p3
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 256
a=0;//     sget-object v1, Lcom/j256/ormlite/stmt/StatementExecutor;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v3, "query arguments: {}"
a=0;// 
a=0;//     invoke-virtual {v1, v3, p3}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 258
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-interface {p1}, Lcom/j256/ormlite/support/ConnectionSource;->getReadOnlyConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 259
a=0;//     .local v2, "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 261
a=0;//     .local v5, "compiledStatement":Lcom/j256/ormlite/support/CompiledStatement;
a=0;//     :try_start_0
a=0;//     #v5=(Null);
a=0;//     sget-object v1, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->SELECT:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     sget-object v3, Lcom/j256/ormlite/stmt/StatementExecutor;->noFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     invoke-interface {v2, p2, v1, v3}, Lcom/j256/ormlite/support/DatabaseConnection;->compileStatement(Ljava/lang/String;Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;[Lcom/j256/ormlite/field/FieldType;)Lcom/j256/ormlite/support/CompiledStatement;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 262
a=0;//     #v5=(Reference,Lcom/j256/ormlite/support/CompiledStatement;);
a=0;//     invoke-direct {p0, v5, p3}, Lcom/j256/ormlite/stmt/StatementExecutor;->assignStatementArguments(Lcom/j256/ormlite/support/CompiledStatement;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 263
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/RawResultsImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/RawResultsImpl;);
a=0;//     const-class v4, [Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     move-object v3, p2
a=0;// 
a=0;//     move-object v6, p0
a=0;// 
a=0;//     #v6=(Reference,Lcom/j256/ormlite/stmt/StatementExecutor;);
a=0;//     move-object v7, p4
a=0;// 
a=0;//     #v7=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/stmt/RawResultsImpl;-><init>(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/String;Ljava/lang/Class;Lcom/j256/ormlite/support/CompiledStatement;Lcom/j256/ormlite/stmt/GenericRowMapper;Lcom/j256/ormlite/dao/ObjectCache;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 266
a=0;//     .local v0, "rawResults":Lcom/j256/ormlite/dao/GenericRawResults;, "Lcom/j256/ormlite/dao/GenericRawResults<[Ljava/lang/String;>;"
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/RawResultsImpl;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 267
a=0;//     #v5=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 270
a=0;//     #v2=(Null);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 271
a=0;//     invoke-interface {v5}, Lcom/j256/ormlite/support/CompiledStatement;->close()V
a=0;// 
a=0;//     .line 273
a=0;//     :cond_1
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 274
a=0;//     invoke-interface {p1, v2}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     :cond_2
a=0;//     return-object v0
a=0;// 
a=0;//     .line 270
a=0;//     .end local v0    # "rawResults":Lcom/j256/ormlite/dao/GenericRawResults;, "Lcom/j256/ormlite/dao/GenericRawResults<[Ljava/lang/String;>;"
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);v4=(Conflicted);v5=(Reference,Lcom/j256/ormlite/support/CompiledStatement;);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     .line 271
a=0;//     invoke-interface {v5}, Lcom/j256/ormlite/support/CompiledStatement;->close()V
a=0;// 
a=0;//     .line 273
a=0;//     :cond_3
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 274
a=0;//     invoke-interface {p1, v2}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     :cond_4
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public refresh(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)I
a=0;//     .locals 2
a=0;//     .param p1, "databaseConnection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p3, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/DatabaseConnection;",
a=0;//             "TT;",
a=0;//             "Lcom/j256/ormlite/dao/ObjectCache;",
a=0;//             ")I"
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
a=0;//     .line 435
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     .local p2, "data":Ljava/lang/Object;, "TT;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->mappedRefresh:Lcom/j256/ormlite/stmt/mapped/MappedRefresh;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedRefresh;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 436
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-static {v0, v1}, Lcom/j256/ormlite/stmt/mapped/MappedRefresh;->build(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;)Lcom/j256/ormlite/stmt/mapped/MappedRefresh;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->mappedRefresh:Lcom/j256/ormlite/stmt/mapped/MappedRefresh;
a=0;// 
a=0;//     .line 438
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->mappedRefresh:Lcom/j256/ormlite/stmt/mapped/MappedRefresh;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcom/j256/ormlite/stmt/mapped/MappedRefresh;->executeRefresh(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public update(Lcom/j256/ormlite/support/DatabaseConnection;Lcom/j256/ormlite/stmt/PreparedUpdate;)I
a=0;//     .locals 2
a=0;//     .param p1, "databaseConnection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/DatabaseConnection;",
a=0;//             "Lcom/j256/ormlite/stmt/PreparedUpdate",
a=0;//             "<TT;>;)I"
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
a=0;//     .line 422
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     .local p2, "preparedUpdate":Lcom/j256/ormlite/stmt/PreparedUpdate;, "Lcom/j256/ormlite/stmt/PreparedUpdate<TT;>;"
a=0;//     sget-object v1, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->UPDATE:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     invoke-interface {p2, p1, v1}, Lcom/j256/ormlite/stmt/PreparedUpdate;->compile(Lcom/j256/ormlite/support/DatabaseConnection;Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;)Lcom/j256/ormlite/support/CompiledStatement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 424
a=0;//     .local v0, "stmt":Lcom/j256/ormlite/support/CompiledStatement;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/CompiledStatement;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/support/CompiledStatement;->runUpdate()I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 426
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/support/CompiledStatement;->close()V
a=0;// 
a=0;//     return v1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/support/CompiledStatement;->close()V
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public update(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)I
a=0;//     .locals 2
a=0;//     .param p1, "databaseConnection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p3, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/DatabaseConnection;",
a=0;//             "TT;",
a=0;//             "Lcom/j256/ormlite/dao/ObjectCache;",
a=0;//             ")I"
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
a=0;//     .line 401
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     .local p2, "data":Ljava/lang/Object;, "TT;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->mappedUpdate:Lcom/j256/ormlite/stmt/mapped/MappedUpdate;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedUpdate;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 402
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-static {v0, v1}, Lcom/j256/ormlite/stmt/mapped/MappedUpdate;->build(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;)Lcom/j256/ormlite/stmt/mapped/MappedUpdate;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->mappedUpdate:Lcom/j256/ormlite/stmt/mapped/MappedUpdate;
a=0;// 
a=0;//     .line 404
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->mappedUpdate:Lcom/j256/ormlite/stmt/mapped/MappedUpdate;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcom/j256/ormlite/stmt/mapped/MappedUpdate;->update(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public updateId(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)I
a=0;//     .locals 2
a=0;//     .param p1, "databaseConnection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p4, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/DatabaseConnection;",
a=0;//             "TT;TID;",
a=0;//             "Lcom/j256/ormlite/dao/ObjectCache;",
a=0;//             ")I"
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
a=0;//     .line 412
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     .local p2, "data":Ljava/lang/Object;, "TT;"
a=0;//     .local p3, "newId":Ljava/lang/Object;, "TID;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->mappedUpdateId:Lcom/j256/ormlite/stmt/mapped/MappedUpdateId;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedUpdateId;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 413
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-static {v0, v1}, Lcom/j256/ormlite/stmt/mapped/MappedUpdateId;->build(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;)Lcom/j256/ormlite/stmt/mapped/MappedUpdateId;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->mappedUpdateId:Lcom/j256/ormlite/stmt/mapped/MappedUpdateId;
a=0;// 
a=0;//     .line 415
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor;->mappedUpdateId:Lcom/j256/ormlite/stmt/mapped/MappedUpdateId;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3, p4}, Lcom/j256/ormlite/stmt/mapped/MappedUpdateId;->execute(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public updateRaw(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/String;[Ljava/lang/String;)I
a=0;//     .locals 3
a=0;//     .param p1, "connection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p2, "statement"    # Ljava/lang/String;
a=0;//     .param p3, "arguments"    # [Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 345
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor;, "Lcom/j256/ormlite/stmt/StatementExecutor<TT;TID;>;"
a=0;//     sget-object v1, Lcom/j256/ormlite/stmt/StatementExecutor;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v2, "running raw update statement: {}"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, p2}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 346
a=0;//     array-length v1, p3
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 348
a=0;//     sget-object v1, Lcom/j256/ormlite/stmt/StatementExecutor;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v2, "update arguments: {}"
a=0;// 
a=0;//     invoke-virtual {v1, v2, p3}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 350
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v1, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->UPDATE:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     sget-object v2, Lcom/j256/ormlite/stmt/StatementExecutor;->noFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     invoke-interface {p1, p2, v1, v2}, Lcom/j256/ormlite/support/DatabaseConnection;->compileStatement(Ljava/lang/String;Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;[Lcom/j256/ormlite/field/FieldType;)Lcom/j256/ormlite/support/CompiledStatement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 353
a=0;//     .local v0, "compiledStatement":Lcom/j256/ormlite/support/CompiledStatement;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/CompiledStatement;);
a=0;//     invoke-direct {p0, v0, p3}, Lcom/j256/ormlite/stmt/StatementExecutor;->assignStatementArguments(Lcom/j256/ormlite/support/CompiledStatement;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 354
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/support/CompiledStatement;->runUpdate()I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 356
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/support/CompiledStatement;->close()V
a=0;// 
a=0;//     return v1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/support/CompiledStatement;->close()V
a=0;// 
a=0;//     throw v1
a=0;// .end method
}}
