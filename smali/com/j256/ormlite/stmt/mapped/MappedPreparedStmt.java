package com.j256.ormlite.stmt.mapped; class MappedPreparedStmt { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;
a=0;// .super Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;
a=0;// .source "MappedPreparedStmt.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/j256/ormlite/stmt/PreparedDelete;
a=0;// .implements Lcom/j256/ormlite/stmt/PreparedQuery;
a=0;// .implements Lcom/j256/ormlite/stmt/PreparedUpdate;
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
a=0;//         "<TT;TID;>;",
a=0;//         "Lcom/j256/ormlite/stmt/PreparedQuery",
a=0;//         "<TT;>;",
a=0;//         "Lcom/j256/ormlite/stmt/PreparedDelete",
a=0;//         "<TT;>;",
a=0;//         "Lcom/j256/ormlite/stmt/PreparedUpdate",
a=0;//         "<TT;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final argHolders:[Lcom/j256/ormlite/stmt/ArgumentHolder;
a=0;// 
a=0;// .field private final limit:Ljava/lang/Long;
a=0;// 
a=0;// .field private final type:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/j256/ormlite/table/TableInfo;Ljava/lang/String;[Lcom/j256/ormlite/field/FieldType;[Lcom/j256/ormlite/field/FieldType;[Lcom/j256/ormlite/stmt/ArgumentHolder;Ljava/lang/Long;Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;)V
a=0;//     .locals 0
a=0;//     .param p2, "statement"    # Ljava/lang/String;
a=0;//     .param p3, "argFieldTypes"    # [Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p4, "resultFieldTypes"    # [Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p5, "argHolders"    # [Lcom/j256/ormlite/stmt/ArgumentHolder;
a=0;//     .param p6, "limit"    # Ljava/lang/Long;
a=0;//     .param p7, "type"    # Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
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
a=0;//             "[",
a=0;//             "Lcom/j256/ormlite/stmt/ArgumentHolder;",
a=0;//             "Ljava/lang/Long;",
a=0;//             "Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;, "Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt<TT;TID;>;"
a=0;//     .local p1, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     invoke-direct {p0, p1, p2, p3, p4}, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;-><init>(Lcom/j256/ormlite/table/TableInfo;Ljava/lang/String;[Lcom/j256/ormlite/field/FieldType;[Lcom/j256/ormlite/field/FieldType;)V
a=0;// 
a=0;//     .line 33
a=0;//     #p0=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;);
a=0;//     iput-object p5, p0, Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;->argHolders:[Lcom/j256/ormlite/stmt/ArgumentHolder;
a=0;// 
a=0;//     .line 35
a=0;//     iput-object p6, p0, Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;->limit:Ljava/lang/Long;
a=0;// 
a=0;//     .line 36
a=0;//     iput-object p7, p0, Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;->type:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     .line 37
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private assignStatementArguments(Lcom/j256/ormlite/support/CompiledStatement;)Lcom/j256/ormlite/support/CompiledStatement;
a=0;//     .locals 10
a=0;//     .param p1, "stmt"    # Lcom/j256/ormlite/support/CompiledStatement;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;, "Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt<TT;TID;>;"
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 82
a=0;//     .local v4, "ok":Z
a=0;//     :try_start_0
a=0;//     #v4=(Null);
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;->limit:Ljava/lang/Long;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Long;);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 84
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;->limit:Ljava/lang/Long;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/Long;->intValue()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-interface {p1, v6}, Lcom/j256/ormlite/support/CompiledStatement;->setMaxRows(I)V
a=0;// 
a=0;//     .line 87
a=0;//     :cond_0
a=0;//     #v6=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 88
a=0;//     .local v1, "argValues":[Ljava/lang/Object;
a=0;//     #v1=(Null);
a=0;//     sget-object v6, Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v6=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     sget-object v7, Lcom/j256/ormlite/logger/Log$Level;->TRACE:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v7=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     invoke-virtual {v6, v7}, Lcom/j256/ormlite/logger/Logger;->isLevelEnabled(Lcom/j256/ormlite/logger/Log$Level;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;->argHolders:[Lcom/j256/ormlite/stmt/ArgumentHolder;
a=0;// 
a=0;//     #v6=(Reference,[Lcom/j256/ormlite/stmt/ArgumentHolder;);
a=0;//     array-length v6, v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lez v6, :cond_1
a=0;// 
a=0;//     .line 89
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;->argHolders:[Lcom/j256/ormlite/stmt/ArgumentHolder;
a=0;// 
a=0;//     #v6=(Reference,[Lcom/j256/ormlite/stmt/ArgumentHolder;);
a=0;//     array-length v6, v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     new-array v1, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 91
a=0;//     :cond_1
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;->argHolders:[Lcom/j256/ormlite/stmt/ArgumentHolder;
a=0;// 
a=0;//     #v6=(Reference,[Lcom/j256/ormlite/stmt/ArgumentHolder;);
a=0;//     array-length v6, v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ge v3, v6, :cond_4
a=0;// 
a=0;//     .line 92
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;->argHolders:[Lcom/j256/ormlite/stmt/ArgumentHolder;
a=0;// 
a=0;//     #v6=(Reference,[Lcom/j256/ormlite/stmt/ArgumentHolder;);
a=0;//     aget-object v6, v6, v3
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-interface {v6}, Lcom/j256/ormlite/stmt/ArgumentHolder;->getSqlArgValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 93
a=0;//     .local v0, "argValue":Ljava/lang/Object;
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;->argFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v6=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     aget-object v2, v6, v3
a=0;// 
a=0;//     .line 95
a=0;//     .local v2, "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v2=(Null);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     .line 96
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;->argHolders:[Lcom/j256/ormlite/stmt/ArgumentHolder;
a=0;// 
a=0;//     aget-object v6, v6, v3
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-interface {v6}, Lcom/j256/ormlite/stmt/ArgumentHolder;->getSqlType()Lcom/j256/ormlite/field/SqlType;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 100
a=0;//     .local v5, "sqlType":Lcom/j256/ormlite/field/SqlType;
a=0;//     :goto_1
a=0;//     #v5=(Reference,Lcom/j256/ormlite/field/SqlType;);v6=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-interface {p1, v3, v0, v5}, Lcom/j256/ormlite/support/CompiledStatement;->setObject(ILjava/lang/Object;Lcom/j256/ormlite/field/SqlType;)V
a=0;// 
a=0;//     .line 101
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 102
a=0;//     aput-object v0, v1, v3
a=0;// 
a=0;//     .line 91
a=0;//     :cond_2
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 98
a=0;//     .end local v5    # "sqlType":Lcom/j256/ormlite/field/SqlType;
a=0;//     :cond_3
a=0;//     #v5=(Conflicted);
a=0;//     invoke-virtual {v2}, Lcom/j256/ormlite/field/FieldType;->getSqlType()Lcom/j256/ormlite/field/SqlType;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .restart local v5    # "sqlType":Lcom/j256/ormlite/field/SqlType;
a=0;//     #v5=(Reference,Lcom/j256/ormlite/field/SqlType;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 105
a=0;//     .end local v0    # "argValue":Ljava/lang/Object;
a=0;//     .end local v2    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     .end local v5    # "sqlType":Lcom/j256/ormlite/field/SqlType;
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v2=(Conflicted);v5=(Conflicted);v6=(Integer);
a=0;//     sget-object v6, Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v6=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v7, "prepared statement \'{}\' with {} args"
a=0;// 
a=0;//     iget-object v8, p0, Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;->statement:Ljava/lang/String;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     iget-object v9, p0, Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;->argHolders:[Lcom/j256/ormlite/stmt/ArgumentHolder;
a=0;// 
a=0;//     #v9=(Reference,[Lcom/j256/ormlite/stmt/ArgumentHolder;);
a=0;//     array-length v9, v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v6, v7, v8, v9}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 106
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 108
a=0;//     sget-object v6, Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v7, "prepared statement arguments: {}"
a=0;// 
a=0;//     invoke-virtual {v6, v7, v1}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 110
a=0;//     :cond_5
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 113
a=0;//     #v4=(One);
a=0;//     if-nez v4, :cond_6
a=0;// 
a=0;//     .line 114
a=0;//     invoke-interface {p1}, Lcom/j256/ormlite/support/CompiledStatement;->close()V
a=0;// 
a=0;//     :cond_6
a=0;//     return-object p1
a=0;// 
a=0;//     .line 113
a=0;//     .end local v1    # "argValues":[Ljava/lang/Object;
a=0;//     .end local v3    # "i":I
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Null);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Throwable;);
a=0;//     if-nez v4, :cond_7
a=0;// 
a=0;//     .line 114
a=0;//     invoke-interface {p1}, Lcom/j256/ormlite/support/CompiledStatement;->close()V
a=0;// 
a=0;//     :cond_7
a=0;//     throw v6
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public compile(Lcom/j256/ormlite/support/DatabaseConnection;Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;)Lcom/j256/ormlite/support/CompiledStatement;
a=0;//     .locals 1
a=0;//     .param p1, "databaseConnection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p2, "type"    # Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;, "Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt<TT;TID;>;"
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {p0, p1, p2, v0}, Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;->compile(Lcom/j256/ormlite/support/DatabaseConnection;Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;I)Lcom/j256/ormlite/support/CompiledStatement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/CompiledStatement;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public compile(Lcom/j256/ormlite/support/DatabaseConnection;Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;I)Lcom/j256/ormlite/support/CompiledStatement;
a=0;//     .locals 4
a=0;//     .param p1, "databaseConnection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p2, "type"    # Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;//     .param p3, "resultFlags"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;, "Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt<TT;TID;>;"
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;->type:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     if-eq v1, p2, :cond_0
a=0;// 
a=0;//     .line 46
a=0;//     new-instance v1, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Could not compile this "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;->type:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " statement since the caller is expecting a "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " statement.  Check your QueryBuilder methods."
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 50
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;->statement:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;->argFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-interface {p1, v1, p2, v2, p3}, Lcom/j256/ormlite/support/DatabaseConnection;->compileStatement(Ljava/lang/String;Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;[Lcom/j256/ormlite/field/FieldType;I)Lcom/j256/ormlite/support/CompiledStatement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 52
a=0;//     .local v0, "stmt":Lcom/j256/ormlite/support/CompiledStatement;
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/CompiledStatement;);
a=0;//     invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;->assignStatementArguments(Lcom/j256/ormlite/support/CompiledStatement;)Lcom/j256/ormlite/support/CompiledStatement;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public getStatement()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;, "Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;->statement:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getType()Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;, "Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;->type:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setArgumentHolderValue(ILjava/lang/Object;)V
a=0;//     .locals 3
a=0;//     .param p1, "index"    # I
a=0;//     .param p2, "value"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;, "Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt<TT;TID;>;"
a=0;//     if-gez p1, :cond_0
a=0;// 
a=0;//     .line 65
a=0;//     new-instance v0, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "argument holder index "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " must be >= 0"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
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
a=0;//     .line 67
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;->argHolders:[Lcom/j256/ormlite/stmt/ArgumentHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/stmt/ArgumentHolder;);
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gt v0, p1, :cond_1
a=0;// 
a=0;//     .line 68
a=0;//     new-instance v0, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "argument holder index "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " not valid, only "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;->argHolders:[Lcom/j256/ormlite/stmt/ArgumentHolder;
a=0;// 
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " in statement"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
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
a=0;//     .line 71
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;->argHolders:[Lcom/j256/ormlite/stmt/ArgumentHolder;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/stmt/ArgumentHolder;);
a=0;//     aget-object v0, v0, p1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-interface {v0, p2}, Lcom/j256/ormlite/stmt/ArgumentHolder;->setValue(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 72
a=0;//     return-void
a=0;// .end method
}}
