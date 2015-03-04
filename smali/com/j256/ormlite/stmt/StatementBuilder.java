package com.j256.ormlite.stmt; class StatementBuilder { void a() { int a;
a=0;// .class public abstract Lcom/j256/ormlite/stmt/StatementBuilder;
a=0;// .super Ljava/lang/Object;
a=0;// .source "StatementBuilder.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
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
a=0;//         "Ljava/lang/Object;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected addTableName:Z
a=0;// 
a=0;// .field protected final dao:Lcom/j256/ormlite/dao/Dao;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/dao/Dao",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field protected final databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;// .field protected final tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/table/TableInfo",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field protected final tableName:Ljava/lang/String;
a=0;// 
a=0;// .field protected type:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;// .field protected where:Lcom/j256/ormlite/stmt/Where;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/stmt/Where",
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
a=0;//     .line 27
a=0;//     const-class v0, Lcom/j256/ormlite/stmt/StatementBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0}, Lcom/j256/ormlite/logger/LoggerFactory;->getLogger(Ljava/lang/Class;)Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/j256/ormlite/stmt/StatementBuilder;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Lcom/j256/ormlite/dao/Dao;Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;)V
a=0;//     .locals 3
a=0;//     .param p1, "databaseType"    # Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .param p4, "type"    # Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/db/DatabaseType;",
a=0;//             "Lcom/j256/ormlite/table/TableInfo",
a=0;//             "<TT;TID;>;",
a=0;//             "Lcom/j256/ormlite/dao/Dao",
a=0;//             "<TT;TID;>;",
a=0;//             "Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementBuilder;, "Lcom/j256/ormlite/stmt/StatementBuilder<TT;TID;>;"
a=0;//     .local p2, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     .local p3, "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;TID;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/StatementBuilder;->where:Lcom/j256/ormlite/stmt/Where;
a=0;// 
a=0;//     .line 40
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/stmt/StatementBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     .line 41
a=0;//     iput-object p2, p0, Lcom/j256/ormlite/stmt/StatementBuilder;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     .line 42
a=0;//     invoke-virtual {p2}, Lcom/j256/ormlite/table/TableInfo;->getTableName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/StatementBuilder;->tableName:Ljava/lang/String;
a=0;// 
a=0;//     .line 43
a=0;//     iput-object p3, p0, Lcom/j256/ormlite/stmt/StatementBuilder;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     .line 44
a=0;//     iput-object p4, p0, Lcom/j256/ormlite/stmt/StatementBuilder;->type:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     .line 45
a=0;//     invoke-virtual {p4}, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->isOkForStatementBuilder()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 46
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Building a statement from a "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " statement is not allowed"
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
a=0;//     .line 48
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private buildStatementString(Ljava/util/List;)Ljava/lang/String;
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/j256/ormlite/stmt/ArgumentHolder;",
a=0;//             ">;)",
a=0;//             "Ljava/lang/String;"
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
a=0;//     .line 105
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementBuilder;, "Lcom/j256/ormlite/stmt/StatementBuilder<TT;TID;>;"
a=0;//     .local p1, "argList":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/stmt/ArgumentHolder;>;"
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v2, 0x80
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 106
a=0;//     .local v0, "sb":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0, v0, p1}, Lcom/j256/ormlite/stmt/StatementBuilder;->appendStatementString(Ljava/lang/StringBuilder;Ljava/util/List;)V
a=0;// 
a=0;//     .line 107
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 108
a=0;//     .local v1, "statement":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Lcom/j256/ormlite/stmt/StatementBuilder;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v3, "built statement {}"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, v1}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 109
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected abstract appendStatementEnd(Ljava/lang/StringBuilder;)V
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method protected abstract appendStatementStart(Ljava/lang/StringBuilder;Ljava/util/List;)V
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/StringBuilder;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/j256/ormlite/stmt/ArgumentHolder;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method protected appendStatementString(Ljava/lang/StringBuilder;Ljava/util/List;)V
a=0;//     .locals 1
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/StringBuilder;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/j256/ormlite/stmt/ArgumentHolder;",
a=0;//             ">;)V"
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
a=0;//     .line 122
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementBuilder;, "Lcom/j256/ormlite/stmt/StatementBuilder<TT;TID;>;"
a=0;//     .local p2, "argList":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/stmt/ArgumentHolder;>;"
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/j256/ormlite/stmt/StatementBuilder;->appendStatementStart(Ljava/lang/StringBuilder;Ljava/util/List;)V
a=0;// 
a=0;//     .line 123
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, p1, p2, v0}, Lcom/j256/ormlite/stmt/StatementBuilder;->appendWhereStatement(Ljava/lang/StringBuilder;Ljava/util/List;Z)V
a=0;// 
a=0;//     .line 124
a=0;//     invoke-virtual {p0, p1}, Lcom/j256/ormlite/stmt/StatementBuilder;->appendStatementEnd(Ljava/lang/StringBuilder;)V
a=0;// 
a=0;//     .line 125
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected appendWhereStatement(Ljava/lang/StringBuilder;Ljava/util/List;Z)V
a=0;//     .locals 2
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p3, "first"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/StringBuilder;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/j256/ormlite/stmt/ArgumentHolder;",
a=0;//             ">;Z)V"
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
a=0;//     .line 137
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementBuilder;, "Lcom/j256/ormlite/stmt/StatementBuilder<TT;TID;>;"
a=0;//     .local p2, "argList":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/stmt/ArgumentHolder;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementBuilder;->where:Lcom/j256/ormlite/stmt/Where;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/Where;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 149
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 140
a=0;//     :cond_1
a=0;//     #v1=(Uninit);
a=0;//     if-eqz p3, :cond_2
a=0;// 
a=0;//     .line 141
a=0;//     const-string v0, "WHERE "
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 145
a=0;//     :goto_1
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/StatementBuilder;->where:Lcom/j256/ormlite/stmt/Where;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/Where;);
a=0;//     iget-boolean v0, p0, Lcom/j256/ormlite/stmt/StatementBuilder;->addTableName:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementBuilder;->tableName:Ljava/lang/String;
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0, p1, p2}, Lcom/j256/ormlite/stmt/Where;->appendSql(Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V
a=0;// 
a=0;//     .line 146
a=0;//     if-nez p3, :cond_0
a=0;// 
a=0;//     .line 147
a=0;//     const-string v0, ") "
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 143
a=0;//     :cond_2
a=0;//     #v1=(Uninit);
a=0;//     const-string v0, "AND ("
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 145
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(Reference,Lcom/j256/ormlite/stmt/Where;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public clear()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 101
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementBuilder;, "Lcom/j256/ormlite/stmt/StatementBuilder<TT;TID;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/StatementBuilder;->where:Lcom/j256/ormlite/stmt/Where;
a=0;// 
a=0;//     .line 102
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected getResultFieldTypes()[Lcom/j256/ormlite/field/FieldType;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 168
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementBuilder;, "Lcom/j256/ormlite/stmt/StatementBuilder<TT;TID;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method getType()Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 185
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementBuilder;, "Lcom/j256/ormlite/stmt/StatementBuilder<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementBuilder;->type:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected prepareStatement(Ljava/lang/Long;)Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;
a=0;//     .locals 10
a=0;//     .param p1, "limit"    # Ljava/lang/Long;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Long;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt",
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
a=0;//     .line 73
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementBuilder;, "Lcom/j256/ormlite/stmt/StatementBuilder<TT;TID;>;"
a=0;//     new-instance v8, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 74
a=0;//     .local v8, "argList":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/stmt/ArgumentHolder;>;"
a=0;//     #v8=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-direct {p0, v8}, Lcom/j256/ormlite/stmt/StatementBuilder;->buildStatementString(Ljava/util/List;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 75
a=0;//     .local v2, "statement":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v8}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v0, v0, [Lcom/j256/ormlite/stmt/ArgumentHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/stmt/ArgumentHolder;);
a=0;//     invoke-interface {v8, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     check-cast v5, [Lcom/j256/ormlite/stmt/ArgumentHolder;
a=0;// 
a=0;//     .line 76
a=0;//     .local v5, "selectArgs":[Lcom/j256/ormlite/stmt/ArgumentHolder;
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/stmt/StatementBuilder;->getResultFieldTypes()[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 77
a=0;//     .local v4, "resultFieldTypes":[Lcom/j256/ormlite/field/FieldType;
a=0;//     #v4=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-interface {v8}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v3, v0, [Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .line 78
a=0;//     .local v3, "argFieldTypes":[Lcom/j256/ormlite/field/FieldType;
a=0;//     #v3=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .local v9, "selectC":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v9=(Integer);
a=0;//     array-length v0, v5
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v9, v0, :cond_0
a=0;// 
a=0;//     .line 79
a=0;//     aget-object v0, v5, v9
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/stmt/ArgumentHolder;->getFieldType()Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     aput-object v0, v3, v9
a=0;// 
a=0;//     .line 78
a=0;//     add-int/lit8 v9, v9, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 81
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementBuilder;->type:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->isOkForStatementBuilder()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 82
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "Building a statement from a "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/stmt/StatementBuilder;->type:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v6, " statement is not allowed"
a=0;// 
a=0;//     invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
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
a=0;//     .line 84
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v6=(Uninit);
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/StatementBuilder;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/stmt/StatementBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     #v6=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     invoke-interface {v6}, Lcom/j256/ormlite/db/DatabaseType;->isLimitSqlSupported()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v6=(Reference,Ljava/lang/Long;);
a=0;//     iget-object v7, p0, Lcom/j256/ormlite/stmt/StatementBuilder;->type:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v7=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;-><init>(Lcom/j256/ormlite/table/TableInfo;Ljava/lang/String;[Lcom/j256/ormlite/field/FieldType;[Lcom/j256/ormlite/field/FieldType;[Lcom/j256/ormlite/stmt/ArgumentHolder;Ljava/lang/Long;Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;);v6=(Boolean);v7=(Uninit);
a=0;//     move-object v6, p1
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Long;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public prepareStatementString()Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementBuilder;, "Lcom/j256/ormlite/stmt/StatementBuilder<TT;TID;>;"
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 94
a=0;//     .local v0, "argList":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/stmt/ArgumentHolder;>;"
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/StatementBuilder;->buildStatementString(Ljava/util/List;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public setWhere(Lcom/j256/ormlite/stmt/Where;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
a=0;//             "<TT;TID;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementBuilder;, "Lcom/j256/ormlite/stmt/StatementBuilder<TT;TID;>;"
a=0;//     .local p1, "where":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/stmt/StatementBuilder;->where:Lcom/j256/ormlite/stmt/Where;
a=0;// 
a=0;//     .line 64
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected shouldPrependTableNameToColumns()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 160
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementBuilder;, "Lcom/j256/ormlite/stmt/StatementBuilder<TT;TID;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected verifyColumnName(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;
a=0;//     .locals 1
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 178
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementBuilder;, "Lcom/j256/ormlite/stmt/StatementBuilder<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementBuilder;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-virtual {v0, p1}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypeByColumnName(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public where()Lcom/j256/ormlite/stmt/Where;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementBuilder;, "Lcom/j256/ormlite/stmt/StatementBuilder<TT;TID;>;"
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/Where;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/Where;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/StatementBuilder;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/stmt/StatementBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     invoke-direct {v0, v1, p0, v2}, Lcom/j256/ormlite/stmt/Where;-><init>(Lcom/j256/ormlite/table/TableInfo;Lcom/j256/ormlite/stmt/StatementBuilder;Lcom/j256/ormlite/db/DatabaseType;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/Where;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/StatementBuilder;->where:Lcom/j256/ormlite/stmt/Where;
a=0;// 
a=0;//     .line 56
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementBuilder;->where:Lcom/j256/ormlite/stmt/Where;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
