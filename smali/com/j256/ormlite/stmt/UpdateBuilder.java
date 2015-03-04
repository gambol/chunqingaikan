package com.j256.ormlite.stmt; class UpdateBuilder { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/stmt/UpdateBuilder;
a=0;// .super Lcom/j256/ormlite/stmt/StatementBuilder;
a=0;// .source "UpdateBuilder.java"
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
a=0;//         "Lcom/j256/ormlite/stmt/StatementBuilder",
a=0;//         "<TT;TID;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private updateClauseList:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/j256/ormlite/stmt/query/Clause;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Lcom/j256/ormlite/dao/Dao;)V
a=0;//     .locals 1
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
a=0;//     .line 31
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/UpdateBuilder;, "Lcom/j256/ormlite/stmt/UpdateBuilder<TT;TID;>;"
a=0;//     .local p2, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     .local p3, "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;TID;>;"
a=0;//     sget-object v0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->UPDATE:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     invoke-direct {p0, p1, p2, p3, v0}, Lcom/j256/ormlite/stmt/StatementBuilder;-><init>(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Lcom/j256/ormlite/dao/Dao;Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;)V
a=0;// 
a=0;//     .line 27
a=0;//     #p0=(Reference,Lcom/j256/ormlite/stmt/UpdateBuilder;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/UpdateBuilder;->updateClauseList:Ljava/util/List;
a=0;// 
a=0;//     .line 32
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private addUpdateColumnToList(Ljava/lang/String;Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;//     .locals 1
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;//     .param p2, "clause"    # Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     .prologue
a=0;//     .line 151
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/UpdateBuilder;, "Lcom/j256/ormlite/stmt/UpdateBuilder<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/UpdateBuilder;->updateClauseList:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 152
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/UpdateBuilder;->updateClauseList:Ljava/util/List;
a=0;// 
a=0;//     .line 154
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/UpdateBuilder;->updateClauseList:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 155
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected appendStatementEnd(Ljava/lang/StringBuilder;)V
a=0;//     .locals 0
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 148
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/UpdateBuilder;, "Lcom/j256/ormlite/stmt/UpdateBuilder<TT;TID;>;"
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected appendStatementStart(Ljava/lang/StringBuilder;Ljava/util/List;)V
a=0;//     .locals 5
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
a=0;//     .line 128
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/UpdateBuilder;, "Lcom/j256/ormlite/stmt/UpdateBuilder<TT;TID;>;"
a=0;//     .local p2, "argList":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/stmt/ArgumentHolder;>;"
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/stmt/UpdateBuilder;->updateClauseList:Ljava/util/List;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/List;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/stmt/UpdateBuilder;->updateClauseList:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 129
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     new-instance v3, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v4, "UPDATE statements must have at least one SET column"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v3
a=0;// 
a=0;//     .line 131
a=0;//     :cond_1
a=0;//     #v3=(Boolean);v4=(Uninit);
a=0;//     const-string v3, "UPDATE "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 132
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/stmt/UpdateBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/stmt/UpdateBuilder;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-virtual {v4}, Lcom/j256/ormlite/table/TableInfo;->getTableName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-interface {v3, p1, v4}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 133
a=0;//     const-string v3, " SET "
a=0;// 
a=0;//     invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 134
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 135
a=0;//     .local v1, "first":Z
a=0;//     #v1=(One);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/stmt/UpdateBuilder;->updateClauseList:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .local v2, "i$":Ljava/util/Iterator;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     .line 136
a=0;//     .local v0, "clause":Lcom/j256/ormlite/stmt/query/Clause;
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 137
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 141
a=0;//     :goto_1
a=0;//     #v3=(PosByte);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/stmt/UpdateBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-interface {v0, v3, v4, p1, p2}, Lcom/j256/ormlite/stmt/query/Clause;->appendSql(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 139
a=0;//     :cond_2
a=0;//     #v3=(Boolean);v4=(Reference,Ljava/lang/String;);
a=0;//     const/16 v3, 0x2c
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 143
a=0;//     .end local v0    # "clause":Lcom/j256/ormlite/stmt/query/Clause;
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v3=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public clear()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 122
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/UpdateBuilder;, "Lcom/j256/ormlite/stmt/UpdateBuilder<TT;TID;>;"
a=0;//     invoke-super {p0}, Lcom/j256/ormlite/stmt/StatementBuilder;->clear()V
a=0;// 
a=0;//     .line 123
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/UpdateBuilder;->updateClauseList:Ljava/util/List;
a=0;// 
a=0;//     .line 124
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public escapeColumnName(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/UpdateBuilder;, "Lcom/j256/ormlite/stmt/UpdateBuilder<TT;TID;>;"
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, 0x4
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 89
a=0;//     .local v0, "sb":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/UpdateBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     invoke-interface {v1, v0, p1}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 90
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public escapeColumnName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p2, "columnName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/UpdateBuilder;, "Lcom/j256/ormlite/stmt/UpdateBuilder<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/UpdateBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     invoke-interface {v0, p1, p2}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 81
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public escapeValue(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p1, "value"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/UpdateBuilder;, "Lcom/j256/ormlite/stmt/UpdateBuilder<TT;TID;>;"
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, 0x4
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 109
a=0;//     .local v0, "sb":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/UpdateBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     invoke-interface {v1, v0, p1}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedWord(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 110
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public escapeValue(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p2, "value"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/UpdateBuilder;, "Lcom/j256/ormlite/stmt/UpdateBuilder<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/UpdateBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     invoke-interface {v0, p1, p2}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedWord(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 100
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public prepare()Lcom/j256/ormlite/stmt/PreparedUpdate;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/stmt/PreparedUpdate",
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
a=0;//     .line 39
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/UpdateBuilder;, "Lcom/j256/ormlite/stmt/UpdateBuilder<TT;TID;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-super {p0, v0}, Lcom/j256/ormlite/stmt/StatementBuilder;->prepareStatement(Ljava/lang/Long;)Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public update()I
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 117
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/UpdateBuilder;, "Lcom/j256/ormlite/stmt/UpdateBuilder<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/UpdateBuilder;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/stmt/UpdateBuilder;->prepare()Lcom/j256/ormlite/stmt/PreparedUpdate;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/PreparedUpdate;);
a=0;//     invoke-interface {v0, v1}, Lcom/j256/ormlite/dao/Dao;->update(Lcom/j256/ormlite/stmt/PreparedUpdate;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public updateColumnExpression(Ljava/lang/String;Ljava/lang/String;)Lcom/j256/ormlite/stmt/StatementBuilder;
a=0;//     .locals 4
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;//     .param p2, "expression"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/stmt/StatementBuilder",
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
a=0;//     .line 66
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/UpdateBuilder;, "Lcom/j256/ormlite/stmt/UpdateBuilder<TT;TID;>;"
a=0;//     invoke-virtual {p0, p1}, Lcom/j256/ormlite/stmt/UpdateBuilder;->verifyColumnName(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 67
a=0;//     .local v0, "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/field/FieldType;->isForeignCollection()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 68
a=0;//     new-instance v1, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Can\'t update foreign colletion field: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
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
a=0;//     .line 70
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     new-instance v1, Lcom/j256/ormlite/stmt/query/SetExpression;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/j256/ormlite/stmt/query/SetExpression;);
a=0;//     invoke-direct {v1, p1, v0, p2}, Lcom/j256/ormlite/stmt/query/SetExpression;-><init>(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/query/SetExpression;);
a=0;//     invoke-direct {p0, p1, v1}, Lcom/j256/ormlite/stmt/UpdateBuilder;->addUpdateColumnToList(Ljava/lang/String;Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;// 
a=0;//     .line 71
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public updateColumnValue(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/StatementBuilder;
a=0;//     .locals 4
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;//     .param p2, "value"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/stmt/StatementBuilder",
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
a=0;//     .line 47
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/UpdateBuilder;, "Lcom/j256/ormlite/stmt/UpdateBuilder<TT;TID;>;"
a=0;//     invoke-virtual {p0, p1}, Lcom/j256/ormlite/stmt/UpdateBuilder;->verifyColumnName(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 48
a=0;//     .local v0, "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/field/FieldType;->isForeignCollection()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 49
a=0;//     new-instance v1, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Can\'t update foreign colletion field: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
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
a=0;//     .line 51
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     new-instance v1, Lcom/j256/ormlite/stmt/query/SetValue;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/j256/ormlite/stmt/query/SetValue;);
a=0;//     invoke-direct {v1, p1, v0, p2}, Lcom/j256/ormlite/stmt/query/SetValue;-><init>(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/query/SetValue;);
a=0;//     invoke-direct {p0, p1, v1}, Lcom/j256/ormlite/stmt/UpdateBuilder;->addUpdateColumnToList(Ljava/lang/String;Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;// 
a=0;//     .line 52
a=0;//     return-object p0
a=0;// .end method
}}
