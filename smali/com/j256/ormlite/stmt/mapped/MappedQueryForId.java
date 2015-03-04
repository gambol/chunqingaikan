package com.j256.ormlite.stmt.mapped; class MappedQueryForId { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;
a=0;// .super Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;
a=0;// .source "MappedQueryForId.java"
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
a=0;//         "Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery",
a=0;//         "<TT;TID;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final label:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method protected constructor <init>(Lcom/j256/ormlite/table/TableInfo;Ljava/lang/String;[Lcom/j256/ormlite/field/FieldType;[Lcom/j256/ormlite/field/FieldType;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p2, "statement"    # Ljava/lang/String;
a=0;//     .param p3, "argFieldTypes"    # [Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p4, "resultsFieldTypes"    # [Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p5, "label"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/table/TableInfo",
a=0;//             "<TT;TID;>;",
a=0;//             "Ljava/lang/String;",
a=0;//             "[",
a=0;//             "Lcom/j256/ormlite/field/FieldType;",
a=0;//             "[",
a=0;//             "Lcom/j256/ormlite/field/FieldType;",
a=0;//             "Ljava/lang/String;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;, "Lcom/j256/ormlite/stmt/mapped/MappedQueryForId<TT;TID;>;"
a=0;//     .local p1, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     invoke-direct {p0, p1, p2, p3, p4}, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;-><init>(Lcom/j256/ormlite/table/TableInfo;Ljava/lang/String;[Lcom/j256/ormlite/field/FieldType;[Lcom/j256/ormlite/field/FieldType;)V
a=0;// 
a=0;//     .line 23
a=0;//     #p0=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;);
a=0;//     iput-object p5, p0, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->label:Ljava/lang/String;
a=0;// 
a=0;//     .line 24
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static build(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Lcom/j256/ormlite/field/FieldType;)Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;
a=0;//     .locals 6
a=0;//     .param p0, "databaseType"    # Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .param p2, "idFieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             "ID:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/db/DatabaseType;",
a=0;//             "Lcom/j256/ormlite/table/TableInfo",
a=0;//             "<TT;TID;>;",
a=0;//             "Lcom/j256/ormlite/field/FieldType;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/stmt/mapped/MappedQueryForId",
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
a=0;//     .line 56
a=0;//     .local p1, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 57
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getIdField()Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 58
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 59
a=0;//     new-instance v0, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Cannot query-for-id with "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getDataClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, " because it doesn\'t have an id field"
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 63
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);
a=0;//     invoke-static {p0, p1, p2}, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->buildStatement(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Lcom/j256/ormlite/field/FieldType;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 64
a=0;//     .local v2, "statement":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v3, v1, [Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v3=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     aput-object p2, v3, v1
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypes()[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     const-string v5, "query-for-id"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;-><init>(Lcom/j256/ormlite/table/TableInfo;Ljava/lang/String;[Lcom/j256/ormlite/field/FieldType;[Lcom/j256/ormlite/field/FieldType;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected static buildStatement(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Lcom/j256/ormlite/field/FieldType;)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .param p0, "databaseType"    # Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .param p2, "idFieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             "ID:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/db/DatabaseType;",
a=0;//             "Lcom/j256/ormlite/table/TableInfo",
a=0;//             "<TT;TID;>;",
a=0;//             "Lcom/j256/ormlite/field/FieldType;",
a=0;//             ")",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     .local p1, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v1, 0x40
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 72
a=0;//     .local v0, "sb":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "SELECT * FROM "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getTableName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0, v1, v2}, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->appendTableName(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 73
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0, p2, v0, v1}, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->appendWhereFieldEq(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/field/FieldType;Ljava/lang/StringBuilder;Ljava/util/List;)V
a=0;// 
a=0;//     .line 74
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method private logArgs([Ljava/lang/Object;)V
a=0;//     .locals 3
a=0;//     .param p1, "args"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;, "Lcom/j256/ormlite/stmt/mapped/MappedQueryForId<TT;TID;>;"
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 80
a=0;//     sget-object v0, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v1, "{} arguments: {}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->label:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2, p1}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 82
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public execute(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)Ljava/lang/Object;
a=0;//     .locals 9
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
a=0;//     .line 30
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;, "Lcom/j256/ormlite/stmt/mapped/MappedQueryForId<TT;TID;>;"
a=0;//     .local p2, "id":Ljava/lang/Object;, "TID;"
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     .line 31
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->clazz:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-interface {p3, v0, p2}, Lcom/j256/ormlite/dao/ObjectCache;->get(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 32
a=0;//     .local v8, "result":Ljava/lang/Object;, "TT;"
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     .line 51
a=0;//     .end local v8    # "result":Ljava/lang/Object;, "TT;"
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v8
a=0;// 
a=0;//     .line 36
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v2, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p2}, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->convertIdToFieldObject(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     aput-object v1, v2, v0
a=0;// 
a=0;//     .line 38
a=0;//     .local v2, "args":[Ljava/lang/Object;
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->statement:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->argFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v3=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     move-object v4, p0
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;);
a=0;//     move-object v5, p3
a=0;// 
a=0;//     #v5=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     invoke-interface/range {v0 .. v5}, Lcom/j256/ormlite/support/DatabaseConnection;->queryForOne(Ljava/lang/String;[Ljava/lang/Object;[Lcom/j256/ormlite/field/FieldType;Lcom/j256/ormlite/stmt/GenericRowMapper;Lcom/j256/ormlite/dao/ObjectCache;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 39
a=0;//     .local v7, "result":Ljava/lang/Object;
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v7, :cond_1
a=0;// 
a=0;//     .line 40
a=0;//     sget-object v0, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v1, "{} using \'{}\' and {} args, got no results"
a=0;// 
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->label:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->statement:Ljava/lang/String;
a=0;// 
a=0;//     array-length v5, v2
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1, v3, v4, v5}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 48
a=0;//     :goto_1
a=0;//     invoke-direct {p0, v2}, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->logArgs([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 50
a=0;//     move-object v6, v7
a=0;// 
a=0;//     .local v6, "castResult":Ljava/lang/Object;, "TT;"
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v8, v6
a=0;// 
a=0;//     .line 51
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 41
a=0;//     .end local v6    # "castResult":Ljava/lang/Object;, "TT;"
a=0;//     :cond_1
a=0;//     #v6=(Uninit);v8=(Conflicted);
a=0;//     sget-object v0, Lcom/j256/ormlite/support/DatabaseConnection;->MORE_THAN_ONE:Ljava/lang/Object;
a=0;// 
a=0;//     if-ne v7, v0, :cond_2
a=0;// 
a=0;//     .line 42
a=0;//     sget-object v0, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v1, "{} using \'{}\' and {} args, got >1 results"
a=0;// 
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->label:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->statement:Ljava/lang/String;
a=0;// 
a=0;//     array-length v5, v2
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1, v3, v4, v5}, Lcom/j256/ormlite/logger/Logger;->error(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 43
a=0;//     invoke-direct {p0, v2}, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->logArgs([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 44
a=0;//     new-instance v0, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->label:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, " got more than 1 result: "
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->statement:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 46
a=0;//     :cond_2
a=0;//     sget-object v0, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v1, "{} using \'{}\' and {} args, got 1 result"
a=0;// 
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->label:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->statement:Ljava/lang/String;
a=0;// 
a=0;//     array-length v5, v2
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1, v3, v4, v5}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
