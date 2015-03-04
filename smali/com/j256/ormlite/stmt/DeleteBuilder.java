package com.j256.ormlite.stmt; class DeleteBuilder { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/stmt/DeleteBuilder;
a=0;// .super Lcom/j256/ormlite/stmt/StatementBuilder;
a=0;// .source "DeleteBuilder.java"
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
a=0;//     .line 25
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/DeleteBuilder;, "Lcom/j256/ormlite/stmt/DeleteBuilder<TT;TID;>;"
a=0;//     .local p2, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     .local p3, "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;TID;>;"
a=0;//     sget-object v0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->DELETE:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     invoke-direct {p0, p1, p2, p3, v0}, Lcom/j256/ormlite/stmt/StatementBuilder;-><init>(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Lcom/j256/ormlite/dao/Dao;Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;)V
a=0;// 
a=0;//     .line 26
a=0;//     #p0=(Reference,Lcom/j256/ormlite/stmt/DeleteBuilder;);
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
a=0;//     .line 59
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/DeleteBuilder;, "Lcom/j256/ormlite/stmt/DeleteBuilder<TT;TID;>;"
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected appendStatementStart(Ljava/lang/StringBuilder;Ljava/util/List;)V
a=0;//     .locals 2
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
a=0;//     .prologue
a=0;//     .line 51
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/DeleteBuilder;, "Lcom/j256/ormlite/stmt/DeleteBuilder<TT;TID;>;"
a=0;//     .local p2, "argList":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/stmt/ArgumentHolder;>;"
a=0;//     const-string v0, "DELETE FROM "
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 52
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/DeleteBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/DeleteBuilder;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/table/TableInfo;->getTableName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, p1, v1}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 53
a=0;//     const/16 v0, 0x20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 54
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public clear()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/DeleteBuilder;, "Lcom/j256/ormlite/stmt/DeleteBuilder<TT;TID;>;"
a=0;//     invoke-super {p0}, Lcom/j256/ormlite/stmt/StatementBuilder;->clear()V
a=0;// 
a=0;//     .line 47
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public delete()I
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/DeleteBuilder;, "Lcom/j256/ormlite/stmt/DeleteBuilder<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/DeleteBuilder;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/stmt/DeleteBuilder;->prepare()Lcom/j256/ormlite/stmt/PreparedDelete;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/PreparedDelete;);
a=0;//     invoke-interface {v0, v1}, Lcom/j256/ormlite/dao/Dao;->delete(Lcom/j256/ormlite/stmt/PreparedDelete;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public prepare()Lcom/j256/ormlite/stmt/PreparedDelete;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/stmt/PreparedDelete",
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
a=0;//     .line 33
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/DeleteBuilder;, "Lcom/j256/ormlite/stmt/DeleteBuilder<TT;TID;>;"
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
}}
