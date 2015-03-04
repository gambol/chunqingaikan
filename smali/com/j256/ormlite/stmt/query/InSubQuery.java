package com.j256.ormlite.stmt.query; class InSubQuery { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/stmt/query/InSubQuery;
a=0;// .super Lcom/j256/ormlite/stmt/query/BaseComparison;
a=0;// .source "InSubQuery.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final in:Z
a=0;// 
a=0;// .field private final subQueryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder$InternalQueryBuilderWrapper;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;Lcom/j256/ormlite/stmt/QueryBuilder$InternalQueryBuilderWrapper;Z)V
a=0;//     .locals 2
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;//     .param p2, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p3, "subQueryBuilder"    # Lcom/j256/ormlite/stmt/QueryBuilder$InternalQueryBuilderWrapper;
a=0;//     .param p4, "in"    # Z
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-direct {p0, p1, p2, v0, v1}, Lcom/j256/ormlite/stmt/query/BaseComparison;-><init>(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;Z)V
a=0;// 
a=0;//     .line 25
a=0;//     #p0=(Reference,Lcom/j256/ormlite/stmt/query/InSubQuery;);
a=0;//     iput-object p3, p0, Lcom/j256/ormlite/stmt/query/InSubQuery;->subQueryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder$InternalQueryBuilderWrapper;
a=0;// 
a=0;//     .line 26
a=0;//     iput-boolean p4, p0, Lcom/j256/ormlite/stmt/query/InSubQuery;->in:Z
a=0;// 
a=0;//     .line 27
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public appendOperation(Ljava/lang/StringBuilder;)V
a=0;//     .locals 1
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     iget-boolean v0, p0, Lcom/j256/ormlite/stmt/query/InSubQuery;->in:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 32
a=0;//     const-string v0, "IN "
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 36
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 34
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "NOT IN "
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic appendSql(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .param p2, "x1"    # Ljava/lang/String;
a=0;//     .param p3, "x2"    # Ljava/lang/StringBuilder;
a=0;//     .param p4, "x3"    # Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Lcom/j256/ormlite/stmt/query/BaseComparison;->appendSql(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public appendValue(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/StringBuilder;Ljava/util/List;)V
a=0;//     .locals 5
a=0;//     .param p1, "databaseType"    # Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .param p2, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/db/DatabaseType;",
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
a=0;//     .local p3, "argList":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/stmt/ArgumentHolder;>;"
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 41
a=0;//     #v4=(Null);
a=0;//     const/16 v1, 0x28
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 42
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/query/InSubQuery;->subQueryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder$InternalQueryBuilderWrapper;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/QueryBuilder$InternalQueryBuilderWrapper;);
a=0;//     invoke-virtual {v1, p2, p3}, Lcom/j256/ormlite/stmt/QueryBuilder$InternalQueryBuilderWrapper;->appendStatementString(Ljava/lang/StringBuilder;Ljava/util/List;)V
a=0;// 
a=0;//     .line 43
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/query/InSubQuery;->subQueryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder$InternalQueryBuilderWrapper;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/stmt/QueryBuilder$InternalQueryBuilderWrapper;->getResultFieldTypes()[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 44
a=0;//     .local v0, "resultFieldTypes":[Lcom/j256/ormlite/field/FieldType;
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     array-length v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-eq v1, v2, :cond_0
a=0;// 
a=0;//     .line 45
a=0;//     new-instance v1, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "There must be only 1 result column in sub-query but we found "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     array-length v3, v0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
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
a=0;//     .line 48
a=0;//     :cond_0
a=0;//     #v1=(Integer);v2=(One);v3=(Uninit);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/query/InSubQuery;->fieldType:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/field/FieldType;->getSqlType()Lcom/j256/ormlite/field/SqlType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     aget-object v2, v0, v4
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v2}, Lcom/j256/ormlite/field/FieldType;->getSqlType()Lcom/j256/ormlite/field/SqlType;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/field/SqlType;);
a=0;//     if-eq v1, v2, :cond_1
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
a=0;//     const-string v3, "Outer column "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/stmt/query/InSubQuery;->fieldType:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " is not the same type as inner column "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     aget-object v3, v0, v4
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
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
a=0;//     .line 52
a=0;//     :cond_1
a=0;//     #v3=(Uninit);
a=0;//     const-string v1, ") "
a=0;// 
a=0;//     invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 53
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic getColumnName()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     invoke-super {p0}, Lcom/j256/ormlite/stmt/query/BaseComparison;->getColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic toString()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     invoke-super {p0}, Lcom/j256/ormlite/stmt/query/BaseComparison;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
}}
