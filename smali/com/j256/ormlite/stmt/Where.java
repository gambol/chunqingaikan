package com.j256.ormlite.stmt; class Where { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/stmt/Where;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Where.java"
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
a=0;//         "Ljava/lang/Object;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final START_CLAUSE_SIZE:I = 0x4
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private clauseStack:[Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;// .field private clauseStackLevel:I
a=0;// 
a=0;// .field private final databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;// .field private final idColumnName:Ljava/lang/String;
a=0;// 
a=0;// .field private final idFieldType:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;// .field private needsFuture:Lcom/j256/ormlite/stmt/query/NeedsFutureClause;
a=0;// 
a=0;// .field private final statementBuilder:Lcom/j256/ormlite/stmt/StatementBuilder;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/stmt/StatementBuilder",
a=0;//             "<TT;TID;>;"
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
a=0;// .method constructor <init>(Lcom/j256/ormlite/table/TableInfo;Lcom/j256/ormlite/stmt/StatementBuilder;Lcom/j256/ormlite/db/DatabaseType;)V
a=0;//     .locals 2
a=0;//     .param p3, "databaseType"    # Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/table/TableInfo",
a=0;//             "<TT;TID;>;",
a=0;//             "Lcom/j256/ormlite/stmt/StatementBuilder",
a=0;//             "<TT;TID;>;",
a=0;//             "Lcom/j256/ormlite/db/DatabaseType;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     .local p1, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     .local p2, "statementBuilder":Lcom/j256/ormlite/stmt/StatementBuilder;, "Lcom/j256/ormlite/stmt/StatementBuilder<TT;TID;>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 135
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 131
a=0;//     #p0=(Reference,Lcom/j256/ormlite/stmt/Where;);
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/stmt/query/Clause;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/Where;->clauseStack:[Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     .line 132
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/j256/ormlite/stmt/Where;->clauseStackLevel:I
a=0;// 
a=0;//     .line 133
a=0;//     iput-object v1, p0, Lcom/j256/ormlite/stmt/Where;->needsFuture:Lcom/j256/ormlite/stmt/query/NeedsFutureClause;
a=0;// 
a=0;//     .line 137
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/stmt/Where;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     .line 138
a=0;//     iput-object p2, p0, Lcom/j256/ormlite/stmt/Where;->statementBuilder:Lcom/j256/ormlite/stmt/StatementBuilder;
a=0;// 
a=0;//     .line 139
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getIdField()Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/Where;->idFieldType:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .line 140
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/Where;->idFieldType:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 141
a=0;//     iput-object v1, p0, Lcom/j256/ormlite/stmt/Where;->idColumnName:Ljava/lang/String;
a=0;// 
a=0;//     .line 145
a=0;//     :goto_0
a=0;//     iput-object p3, p0, Lcom/j256/ormlite/stmt/Where;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     .line 146
a=0;//     return-void
a=0;// 
a=0;//     .line 143
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/Where;->idFieldType:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/field/FieldType;->getColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/Where;->idColumnName:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private addClause(Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;//     .locals 1
a=0;//     .param p1, "clause"    # Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     .prologue
a=0;//     .line 601
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/Where;->needsFuture:Lcom/j256/ormlite/stmt/query/NeedsFutureClause;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/query/NeedsFutureClause;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 602
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/Where;->push(Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;// 
a=0;//     .line 608
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 605
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/Where;->needsFuture:Lcom/j256/ormlite/stmt/query/NeedsFutureClause;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Lcom/j256/ormlite/stmt/query/NeedsFutureClause;->setMissingClause(Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;// 
a=0;//     .line 606
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/Where;->needsFuture:Lcom/j256/ormlite/stmt/query/NeedsFutureClause;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private addNeedsFuture(Lcom/j256/ormlite/stmt/query/NeedsFutureClause;)V
a=0;//     .locals 3
a=0;//     .param p1, "clause"    # Lcom/j256/ormlite/stmt/query/NeedsFutureClause;
a=0;// 
a=0;//     .prologue
a=0;//     .line 592
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/Where;->needsFuture:Lcom/j256/ormlite/stmt/query/NeedsFutureClause;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/query/NeedsFutureClause;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 593
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/stmt/Where;->needsFuture:Lcom/j256/ormlite/stmt/query/NeedsFutureClause;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/stmt/query/NeedsFutureClause;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " is already waiting for a future clause, can\'t add: "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
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
a=0;//     .line 596
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/stmt/Where;->needsFuture:Lcom/j256/ormlite/stmt/query/NeedsFutureClause;
a=0;// 
a=0;//     .line 597
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/Where;->push(Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;// 
a=0;//     .line 598
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private buildClauseArray([Lcom/j256/ormlite/stmt/Where;Ljava/lang/String;)[Lcom/j256/ormlite/stmt/query/Clause;
a=0;//     .locals 3
a=0;//     .param p2, "label"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "([",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
a=0;//             "<TT;TID;>;",
a=0;//             "Ljava/lang/String;",
a=0;//             ")[",
a=0;//             "Lcom/j256/ormlite/stmt/query/Clause;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 579
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     .local p1, "others":[Lcom/j256/ormlite/stmt/Where;, "[Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     array-length v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 580
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 588
a=0;//     .local v0, "clauses":[Lcom/j256/ormlite/stmt/query/Clause;
a=0;//     :cond_0
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/stmt/query/Clause;);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 582
a=0;//     .end local v0    # "clauses":[Lcom/j256/ormlite/stmt/query/Clause;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Integer);
a=0;//     array-length v2, p1
a=0;// 
a=0;//     new-array v0, v2, [Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     .line 584
a=0;//     .restart local v0    # "clauses":[Lcom/j256/ormlite/stmt/query/Clause;
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/stmt/query/Clause;);
a=0;//     array-length v2, p1
a=0;// 
a=0;//     add-int/lit8 v1, v2, -0x1
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     if-ltz v1, :cond_0
a=0;// 
a=0;//     .line 585
a=0;//     invoke-direct {p0, p2}, Lcom/j256/ormlite/stmt/Where;->pop(Ljava/lang/String;)Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/stmt/query/Clause;);
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     .line 584
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private findColumnFieldType(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;
a=0;//     .locals 1
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 611
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/Where;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-virtual {v0, p1}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypeByColumnName(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private in(ZLjava/lang/String;Lcom/j256/ormlite/stmt/QueryBuilder;)Lcom/j256/ormlite/stmt/Where;
a=0;//     .locals 4
a=0;//     .param p1, "in"    # Z
a=0;//     .param p2, "columnName"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(Z",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/j256/ormlite/stmt/QueryBuilder",
a=0;//             "<**>;)",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
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
a=0;//     .line 565
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     .local p3, "subQueryBuilder":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<**>;"
a=0;//     invoke-virtual {p3}, Lcom/j256/ormlite/stmt/QueryBuilder;->getSelectColumnCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 566
a=0;//     new-instance v0, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Inner query must have only 1 select column specified instead of "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p3}, Lcom/j256/ormlite/stmt/QueryBuilder;->getSelectColumnCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ": "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p3}, Lcom/j256/ormlite/stmt/QueryBuilder;->getSelectColumns()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-array v3, v3, [Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/String;);
a=0;//     invoke-interface {v2, v3}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
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
a=0;//     .line 571
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(One);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {p3}, Lcom/j256/ormlite/stmt/QueryBuilder;->enableInnerQuery()V
a=0;// 
a=0;//     .line 572
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/query/InSubQuery;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/query/InSubQuery;);
a=0;//     invoke-direct {p0, p2}, Lcom/j256/ormlite/stmt/Where;->findColumnFieldType(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     new-instance v2, Lcom/j256/ormlite/stmt/QueryBuilder$InternalQueryBuilderWrapper;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/j256/ormlite/stmt/QueryBuilder$InternalQueryBuilderWrapper;);
a=0;//     invoke-direct {v2, p3}, Lcom/j256/ormlite/stmt/QueryBuilder$InternalQueryBuilderWrapper;-><init>(Lcom/j256/ormlite/stmt/QueryBuilder;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/stmt/QueryBuilder$InternalQueryBuilderWrapper;);
a=0;//     invoke-direct {v0, p2, v1, v2, p1}, Lcom/j256/ormlite/stmt/query/InSubQuery;-><init>(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;Lcom/j256/ormlite/stmt/QueryBuilder$InternalQueryBuilderWrapper;Z)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/query/InSubQuery;);
a=0;//     invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->addClause(Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;// 
a=0;//     .line 574
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method private varargs in(ZLjava/lang/String;[Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;
a=0;//     .locals 3
a=0;//     .param p1, "in"    # Z
a=0;//     .param p2, "columnName"    # Ljava/lang/String;
a=0;//     .param p3, "objects"    # [Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(Z",
a=0;//             "Ljava/lang/String;",
a=0;//             "[",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
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
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 551
a=0;//     #v2=(Null);
a=0;//     array-length v0, p3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 552
a=0;//     aget-object v0, p3, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 553
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "Object argument to IN seems to be an array within an array"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 555
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(One);
a=0;//     aget-object v0, p3, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     const-class v1, Lcom/j256/ormlite/stmt/Where;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 556
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "Object argument to IN seems to be a Where.class instead of a QueryBuilder.class"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 560
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/query/In;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/query/In;);
a=0;//     invoke-direct {p0, p2}, Lcom/j256/ormlite/stmt/Where;->findColumnFieldType(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-direct {v0, p2, v1, p3, p1}, Lcom/j256/ormlite/stmt/query/In;-><init>(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;[Ljava/lang/Object;Z)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/query/In;);
a=0;//     invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->addClause(Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;// 
a=0;//     .line 561
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method private peek()Lcom/j256/ormlite/stmt/query/Clause;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 642
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/Where;->clauseStack:[Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/stmt/query/Clause;);
a=0;//     iget v1, p0, Lcom/j256/ormlite/stmt/Where;->clauseStackLevel:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     aget-object v0, v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private pop(Ljava/lang/String;)Lcom/j256/ormlite/stmt/query/Clause;
a=0;//     .locals 4
a=0;//     .param p1, "label"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 631
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     iget v1, p0, Lcom/j256/ormlite/stmt/Where;->clauseStackLevel:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 632
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Expecting there to be a clause already defined for \'"
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
a=0;//     const-string v3, "\' operation"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 635
a=0;//     :cond_0
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/Where;->clauseStack:[Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     #v1=(Reference,[Lcom/j256/ormlite/stmt/query/Clause;);
a=0;//     iget v2, p0, Lcom/j256/ormlite/stmt/Where;->clauseStackLevel:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     iput v2, p0, Lcom/j256/ormlite/stmt/Where;->clauseStackLevel:I
a=0;// 
a=0;//     aget-object v0, v1, v2
a=0;// 
a=0;//     .line 637
a=0;//     .local v0, "clause":Lcom/j256/ormlite/stmt/query/Clause;
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/Where;->clauseStack:[Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     iget v2, p0, Lcom/j256/ormlite/stmt/Where;->clauseStackLevel:I
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     .line 638
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private push(Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;//     .locals 5
a=0;//     .param p1, "clause"    # Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     .prologue
a=0;//     .line 616
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     iget v2, p0, Lcom/j256/ormlite/stmt/Where;->clauseStackLevel:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/stmt/Where;->clauseStack:[Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     #v3=(Reference,[Lcom/j256/ormlite/stmt/query/Clause;);
a=0;//     array-length v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v2, v3, :cond_1
a=0;// 
a=0;//     .line 618
a=0;//     iget v2, p0, Lcom/j256/ormlite/stmt/Where;->clauseStackLevel:I
a=0;// 
a=0;//     mul-int/lit8 v2, v2, 0x2
a=0;// 
a=0;//     new-array v1, v2, [Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     .line 620
a=0;//     .local v1, "newStack":[Lcom/j256/ormlite/stmt/query/Clause;
a=0;//     #v1=(Reference,[Lcom/j256/ormlite/stmt/query/Clause;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     iget v2, p0, Lcom/j256/ormlite/stmt/Where;->clauseStackLevel:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     .line 621
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/stmt/Where;->clauseStack:[Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/j256/ormlite/stmt/query/Clause;);
a=0;//     aget-object v2, v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aput-object v2, v1, v0
a=0;// 
a=0;//     .line 623
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/stmt/Where;->clauseStack:[Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/j256/ormlite/stmt/query/Clause;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object v3, v2, v0
a=0;// 
a=0;//     .line 620
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 625
a=0;//     :cond_0
a=0;//     #v2=(Integer);v3=(Integer);
a=0;//     iput-object v1, p0, Lcom/j256/ormlite/stmt/Where;->clauseStack:[Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     .line 627
a=0;//     .end local v0    # "i":I
a=0;//     .end local v1    # "newStack":[Lcom/j256/ormlite/stmt/query/Clause;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/stmt/Where;->clauseStack:[Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/j256/ormlite/stmt/query/Clause;);
a=0;//     iget v3, p0, Lcom/j256/ormlite/stmt/Where;->clauseStackLevel:I
a=0;// 
a=0;//     add-int/lit8 v4, v3, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, p0, Lcom/j256/ormlite/stmt/Where;->clauseStackLevel:I
a=0;// 
a=0;//     aput-object p1, v2, v3
a=0;// 
a=0;//     .line 628
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public and()Lcom/j256/ormlite/stmt/Where;
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
a=0;//     .line 152
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/query/ManyClause;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/query/ManyClause;);
a=0;//     const-string v1, "AND"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v1}, Lcom/j256/ormlite/stmt/Where;->pop(Ljava/lang/String;)Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "AND"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/j256/ormlite/stmt/query/ManyClause;-><init>(Lcom/j256/ormlite/stmt/query/Clause;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/query/ManyClause;);
a=0;//     invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->addNeedsFuture(Lcom/j256/ormlite/stmt/query/NeedsFutureClause;)V
a=0;// 
a=0;//     .line 153
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public and(I)Lcom/j256/ormlite/stmt/Where;
a=0;//     .locals 4
a=0;//     .param p1, "numClauses"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(I)",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 185
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 186
a=0;//     new-instance v2, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v3, "Must have at least one clause in and(numClauses)"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 188
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     new-array v0, p1, [Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     .line 189
a=0;//     .local v0, "clauses":[Lcom/j256/ormlite/stmt/query/Clause;
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/stmt/query/Clause;);
a=0;//     add-int/lit8 v1, p1, -0x1
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     if-ltz v1, :cond_1
a=0;// 
a=0;//     .line 190
a=0;//     const-string v2, "AND"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v2}, Lcom/j256/ormlite/stmt/Where;->pop(Ljava/lang/String;)Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     .line 189
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 192
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     new-instance v2, Lcom/j256/ormlite/stmt/query/ManyClause;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/j256/ormlite/stmt/query/ManyClause;);
a=0;//     const-string v3, "AND"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v0, v3}, Lcom/j256/ormlite/stmt/query/ManyClause;-><init>([Lcom/j256/ormlite/stmt/query/Clause;Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/stmt/query/ManyClause;);
a=0;//     invoke-direct {p0, v2}, Lcom/j256/ormlite/stmt/Where;->addClause(Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;// 
a=0;//     .line 193
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public varargs and(Lcom/j256/ormlite/stmt/Where;Lcom/j256/ormlite/stmt/Where;[Lcom/j256/ormlite/stmt/Where;)Lcom/j256/ormlite/stmt/Where;
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
a=0;//             "<TT;TID;>;",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
a=0;//             "<TT;TID;>;[",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
a=0;//             "<TT;TID;>;)",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 168
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     .local p1, "first":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     .local p2, "second":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     .local p3, "others":[Lcom/j256/ormlite/stmt/Where;, "[Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     const-string v3, "AND"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, p3, v3}, Lcom/j256/ormlite/stmt/Where;->buildClauseArray([Lcom/j256/ormlite/stmt/Where;Ljava/lang/String;)[Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 169
a=0;//     .local v0, "clauses":[Lcom/j256/ormlite/stmt/query/Clause;
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/stmt/query/Clause;);
a=0;//     const-string v3, "AND"
a=0;// 
a=0;//     invoke-direct {p0, v3}, Lcom/j256/ormlite/stmt/Where;->pop(Ljava/lang/String;)Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 170
a=0;//     .local v2, "secondClause":Lcom/j256/ormlite/stmt/query/Clause;
a=0;//     #v2=(Reference,Lcom/j256/ormlite/stmt/query/Clause;);
a=0;//     const-string v3, "AND"
a=0;// 
a=0;//     invoke-direct {p0, v3}, Lcom/j256/ormlite/stmt/Where;->pop(Ljava/lang/String;)Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 171
a=0;//     .local v1, "firstClause":Lcom/j256/ormlite/stmt/query/Clause;
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/query/Clause;);
a=0;//     new-instance v3, Lcom/j256/ormlite/stmt/query/ManyClause;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/j256/ormlite/stmt/query/ManyClause;);
a=0;//     const-string v4, "AND"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v1, v2, v0, v4}, Lcom/j256/ormlite/stmt/query/ManyClause;-><init>(Lcom/j256/ormlite/stmt/query/Clause;Lcom/j256/ormlite/stmt/query/Clause;[Lcom/j256/ormlite/stmt/query/Clause;Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/stmt/query/ManyClause;);
a=0;//     invoke-direct {p0, v3}, Lcom/j256/ormlite/stmt/Where;->addClause(Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;// 
a=0;//     .line 172
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method appendSql(Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V
a=0;//     .locals 2
a=0;//     .param p1, "tableName"    # Ljava/lang/String;
a=0;//     .param p2, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
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
a=0;//     .line 528
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     .local p3, "columnArgList":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/stmt/ArgumentHolder;>;"
a=0;//     iget v0, p0, Lcom/j256/ormlite/stmt/Where;->clauseStackLevel:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 529
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "No where clauses defined.  Did you miss a where operation?"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 531
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget v0, p0, Lcom/j256/ormlite/stmt/Where;->clauseStackLevel:I
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-eq v0, v1, :cond_1
a=0;// 
a=0;//     .line 532
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Both the \"left-hand\" and \"right-hand\" clauses have been defined.  Did you miss an AND or OR?"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 537
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(One);
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/stmt/Where;->peek()Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/query/Clause;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/Where;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     invoke-interface {v0, v1, p1, p2, p3}, Lcom/j256/ormlite/stmt/query/Clause;->appendSql(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V
a=0;// 
a=0;//     .line 538
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public between(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;
a=0;//     .locals 2
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;//     .param p2, "low"    # Ljava/lang/Object;
a=0;//     .param p3, "high"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
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
a=0;//     .line 200
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/query/Between;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/query/Between;);
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/Where;->findColumnFieldType(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-direct {v0, p1, v1, p2, p3}, Lcom/j256/ormlite/stmt/query/Between;-><init>(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/query/Between;);
a=0;//     invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->addClause(Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;// 
a=0;//     .line 201
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public clear()Lcom/j256/ormlite/stmt/Where;
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
a=0;//     .line 504
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget v1, p0, Lcom/j256/ormlite/stmt/Where;->clauseStackLevel:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 506
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/Where;->clauseStack:[Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     #v1=(Reference,[Lcom/j256/ormlite/stmt/query/Clause;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aput-object v2, v1, v0
a=0;// 
a=0;//     .line 504
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 508
a=0;//     :cond_0
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput v1, p0, Lcom/j256/ormlite/stmt/Where;->clauseStackLevel:I
a=0;// 
a=0;//     .line 509
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public eq(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;
a=0;//     .locals 3
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;//     .param p2, "value"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
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
a=0;//     .line 208
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/query/SimpleComparison;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/query/SimpleComparison;);
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/Where;->findColumnFieldType(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     const-string v2, "="
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, p1, v1, p2, v2}, Lcom/j256/ormlite/stmt/query/SimpleComparison;-><init>(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/query/SimpleComparison;);
a=0;//     invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->addClause(Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;// 
a=0;//     .line 210
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public exists(Lcom/j256/ormlite/stmt/QueryBuilder;)Lcom/j256/ormlite/stmt/Where;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/stmt/QueryBuilder",
a=0;//             "<**>;)",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 291
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     .local p1, "subQueryBuilder":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<**>;"
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/stmt/QueryBuilder;->enableInnerQuery()V
a=0;// 
a=0;//     .line 292
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/query/Exists;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/query/Exists;);
a=0;//     new-instance v1, Lcom/j256/ormlite/stmt/QueryBuilder$InternalQueryBuilderWrapper;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/j256/ormlite/stmt/QueryBuilder$InternalQueryBuilderWrapper;);
a=0;//     invoke-direct {v1, p1}, Lcom/j256/ormlite/stmt/QueryBuilder$InternalQueryBuilderWrapper;-><init>(Lcom/j256/ormlite/stmt/QueryBuilder;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/QueryBuilder$InternalQueryBuilderWrapper;);
a=0;//     invoke-direct {v0, v1}, Lcom/j256/ormlite/stmt/query/Exists;-><init>(Lcom/j256/ormlite/stmt/QueryBuilder$InternalQueryBuilderWrapper;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/query/Exists;);
a=0;//     invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->addClause(Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;// 
a=0;//     .line 293
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public ge(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;
a=0;//     .locals 3
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;//     .param p2, "value"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
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
a=0;//     .line 217
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/query/SimpleComparison;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/query/SimpleComparison;);
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/Where;->findColumnFieldType(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     const-string v2, ">="
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, p1, v1, p2, v2}, Lcom/j256/ormlite/stmt/query/SimpleComparison;-><init>(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/query/SimpleComparison;);
a=0;//     invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->addClause(Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;// 
a=0;//     .line 219
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public getStatement()Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 516
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 517
a=0;//     .local v0, "sb":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {p0, v1, v0, v2}, Lcom/j256/ormlite/stmt/Where;->appendSql(Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V
a=0;// 
a=0;//     .line 518
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public gt(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;
a=0;//     .locals 3
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;//     .param p2, "value"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
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
a=0;//     .line 226
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/query/SimpleComparison;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/query/SimpleComparison;);
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/Where;->findColumnFieldType(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     const-string v2, ">"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, p1, v1, p2, v2}, Lcom/j256/ormlite/stmt/query/SimpleComparison;-><init>(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/query/SimpleComparison;);
a=0;//     invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->addClause(Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;// 
a=0;//     .line 228
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public idEq(Lcom/j256/ormlite/dao/Dao;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<OD:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/dao/Dao",
a=0;//             "<TOD;*>;TOD;)",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
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
a=0;//     .line 427
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     .local p1, "dataDao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TOD;*>;"
a=0;//     .local p2, "data":Ljava/lang/Object;, "TOD;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/Where;->idColumnName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 428
a=0;//     new-instance v0, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/sql/SQLException;);
a=0;//     const-string v1, "Object has no id column specified"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 430
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/query/SimpleComparison;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/query/SimpleComparison;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/Where;->idColumnName:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/stmt/Where;->idFieldType:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-interface {p1, p2}, Lcom/j256/ormlite/dao/Dao;->extractId(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     const-string v4, "="
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2, v3, v4}, Lcom/j256/ormlite/stmt/query/SimpleComparison;-><init>(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/query/SimpleComparison;);
a=0;//     invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->addClause(Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;// 
a=0;//     .line 432
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public idEq(Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TID;)",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
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
a=0;//     .line 416
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     .local p1, "id":Ljava/lang/Object;, "TID;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/Where;->idColumnName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 417
a=0;//     new-instance v0, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/sql/SQLException;);
a=0;//     const-string v1, "Object has no id column specified"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 419
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/query/SimpleComparison;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/query/SimpleComparison;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/Where;->idColumnName:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/stmt/Where;->idFieldType:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     const-string v3, "="
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2, p1, v3}, Lcom/j256/ormlite/stmt/query/SimpleComparison;-><init>(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/query/SimpleComparison;);
a=0;//     invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->addClause(Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;// 
a=0;//     .line 420
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public in(Ljava/lang/String;Lcom/j256/ormlite/stmt/QueryBuilder;)Lcom/j256/ormlite/stmt/Where;
a=0;//     .locals 1
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/j256/ormlite/stmt/QueryBuilder",
a=0;//             "<**>;)",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
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
a=0;//     .line 272
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     .local p2, "subQueryBuilder":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<**>;"
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0, p1, p2}, Lcom/j256/ormlite/stmt/Where;->in(ZLjava/lang/String;Lcom/j256/ormlite/stmt/QueryBuilder;)Lcom/j256/ormlite/stmt/Where;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/Where;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public in(Ljava/lang/String;Ljava/lang/Iterable;)Lcom/j256/ormlite/stmt/Where;
a=0;//     .locals 3
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Iterable",
a=0;//             "<*>;)",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
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
a=0;//     .line 235
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     .local p2, "objects":Ljava/lang/Iterable;, "Ljava/lang/Iterable<*>;"
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/query/In;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/query/In;);
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/Where;->findColumnFieldType(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-direct {v0, p1, v1, p2, v2}, Lcom/j256/ormlite/stmt/query/In;-><init>(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;Ljava/lang/Iterable;Z)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/query/In;);
a=0;//     invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->addClause(Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;// 
a=0;//     .line 236
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public varargs in(Ljava/lang/String;[Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;
a=0;//     .locals 1
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;//     .param p2, "objects"    # [Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "[",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
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
a=0;//     .line 251
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0, p1, p2}, Lcom/j256/ormlite/stmt/Where;->in(ZLjava/lang/String;[Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/Where;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public isNotNull(Ljava/lang/String;)Lcom/j256/ormlite/stmt/Where;
a=0;//     .locals 2
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
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
a=0;//     .line 308
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/query/IsNotNull;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/query/IsNotNull;);
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/Where;->findColumnFieldType(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-direct {v0, p1, v1}, Lcom/j256/ormlite/stmt/query/IsNotNull;-><init>(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/query/IsNotNull;);
a=0;//     invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->addClause(Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;// 
a=0;//     .line 309
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public isNull(Ljava/lang/String;)Lcom/j256/ormlite/stmt/Where;
a=0;//     .locals 2
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
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
a=0;//     .line 300
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/query/IsNull;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/query/IsNull;);
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/Where;->findColumnFieldType(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-direct {v0, p1, v1}, Lcom/j256/ormlite/stmt/query/IsNull;-><init>(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/query/IsNull;);
a=0;//     invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->addClause(Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;// 
a=0;//     .line 301
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public iterator()Lcom/j256/ormlite/dao/CloseableIterator;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/dao/CloseableIterator",
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
a=0;//     .line 493
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/Where;->statementBuilder:Lcom/j256/ormlite/stmt/StatementBuilder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder;);
a=0;//     instance-of v0, v0, Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 494
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/Where;->statementBuilder:Lcom/j256/ormlite/stmt/StatementBuilder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder;);
a=0;//     check-cast v0, Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/stmt/QueryBuilder;->iterator()Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 496
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     new-instance v0, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Cannot call iterator on a statement of type "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/stmt/Where;->statementBuilder:Lcom/j256/ormlite/stmt/StatementBuilder;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/j256/ormlite/stmt/StatementBuilder;->getType()Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
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
a=0;// .end method
a=0;// 
a=0;// .method public le(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;
a=0;//     .locals 3
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;//     .param p2, "value"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
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
a=0;//     .line 316
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/query/SimpleComparison;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/query/SimpleComparison;);
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/Where;->findColumnFieldType(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     const-string v2, "<="
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, p1, v1, p2, v2}, Lcom/j256/ormlite/stmt/query/SimpleComparison;-><init>(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/query/SimpleComparison;);
a=0;//     invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->addClause(Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;// 
a=0;//     .line 318
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public like(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;
a=0;//     .locals 3
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;//     .param p2, "value"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
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
a=0;//     .line 334
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/query/SimpleComparison;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/query/SimpleComparison;);
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/Where;->findColumnFieldType(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     const-string v2, "LIKE"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, p1, v1, p2, v2}, Lcom/j256/ormlite/stmt/query/SimpleComparison;-><init>(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/query/SimpleComparison;);
a=0;//     invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->addClause(Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;// 
a=0;//     .line 336
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public lt(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;
a=0;//     .locals 3
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;//     .param p2, "value"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
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
a=0;//     .line 325
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/query/SimpleComparison;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/query/SimpleComparison;);
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/Where;->findColumnFieldType(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     const-string v2, "<"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, p1, v1, p2, v2}, Lcom/j256/ormlite/stmt/query/SimpleComparison;-><init>(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/query/SimpleComparison;);
a=0;//     invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->addClause(Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;// 
a=0;//     .line 327
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public ne(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;
a=0;//     .locals 3
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;//     .param p2, "value"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
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
a=0;//     .line 343
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/query/SimpleComparison;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/query/SimpleComparison;);
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/Where;->findColumnFieldType(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     const-string v2, "<>"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, p1, v1, p2, v2}, Lcom/j256/ormlite/stmt/query/SimpleComparison;-><init>(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/query/SimpleComparison;);
a=0;//     invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->addClause(Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;// 
a=0;//     .line 345
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public not()Lcom/j256/ormlite/stmt/Where;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 352
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/query/Not;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/query/Not;);
a=0;//     invoke-direct {v0}, Lcom/j256/ormlite/stmt/query/Not;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/query/Not;);
a=0;//     invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->addNeedsFuture(Lcom/j256/ormlite/stmt/query/NeedsFutureClause;)V
a=0;// 
a=0;//     .line 353
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public not(Lcom/j256/ormlite/stmt/Where;)Lcom/j256/ormlite/stmt/Where;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
a=0;//             "<TT;TID;>;)",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 360
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     .local p1, "comparison":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/query/Not;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/query/Not;);
a=0;//     const-string v1, "NOT"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v1}, Lcom/j256/ormlite/stmt/Where;->pop(Ljava/lang/String;)Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcom/j256/ormlite/stmt/query/Not;-><init>(Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/query/Not;);
a=0;//     invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->addClause(Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;// 
a=0;//     .line 361
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public notIn(Ljava/lang/String;Lcom/j256/ormlite/stmt/QueryBuilder;)Lcom/j256/ormlite/stmt/Where;
a=0;//     .locals 1
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/j256/ormlite/stmt/QueryBuilder",
a=0;//             "<**>;)",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
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
a=0;//     .line 279
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     .local p2, "subQueryBuilder":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<**>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0, p1, p2}, Lcom/j256/ormlite/stmt/Where;->in(ZLjava/lang/String;Lcom/j256/ormlite/stmt/QueryBuilder;)Lcom/j256/ormlite/stmt/Where;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/Where;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public notIn(Ljava/lang/String;Ljava/lang/Iterable;)Lcom/j256/ormlite/stmt/Where;
a=0;//     .locals 3
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Iterable",
a=0;//             "<*>;)",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
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
a=0;//     .line 243
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     .local p2, "objects":Ljava/lang/Iterable;, "Ljava/lang/Iterable<*>;"
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/query/In;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/query/In;);
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/Where;->findColumnFieldType(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {v0, p1, v1, p2, v2}, Lcom/j256/ormlite/stmt/query/In;-><init>(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;Ljava/lang/Iterable;Z)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/query/In;);
a=0;//     invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->addClause(Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;// 
a=0;//     .line 244
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public varargs notIn(Ljava/lang/String;[Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;
a=0;//     .locals 1
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;//     .param p2, "objects"    # [Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "[",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
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
a=0;//     .line 258
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0, p1, p2}, Lcom/j256/ormlite/stmt/Where;->in(ZLjava/lang/String;[Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/Where;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public or()Lcom/j256/ormlite/stmt/Where;
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
a=0;//     .line 368
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/query/ManyClause;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/query/ManyClause;);
a=0;//     const-string v1, "OR"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v1}, Lcom/j256/ormlite/stmt/Where;->pop(Ljava/lang/String;)Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "OR"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/j256/ormlite/stmt/query/ManyClause;-><init>(Lcom/j256/ormlite/stmt/query/Clause;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/query/ManyClause;);
a=0;//     invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->addNeedsFuture(Lcom/j256/ormlite/stmt/query/NeedsFutureClause;)V
a=0;// 
a=0;//     .line 369
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public or(I)Lcom/j256/ormlite/stmt/Where;
a=0;//     .locals 4
a=0;//     .param p1, "numClauses"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(I)",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 401
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 402
a=0;//     new-instance v2, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v3, "Must have at least one clause in or(numClauses)"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 404
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     new-array v0, p1, [Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     .line 405
a=0;//     .local v0, "clauses":[Lcom/j256/ormlite/stmt/query/Clause;
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/stmt/query/Clause;);
a=0;//     add-int/lit8 v1, p1, -0x1
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     if-ltz v1, :cond_1
a=0;// 
a=0;//     .line 406
a=0;//     const-string v2, "OR"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v2}, Lcom/j256/ormlite/stmt/Where;->pop(Ljava/lang/String;)Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     .line 405
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 408
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     new-instance v2, Lcom/j256/ormlite/stmt/query/ManyClause;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/j256/ormlite/stmt/query/ManyClause;);
a=0;//     const-string v3, "OR"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v0, v3}, Lcom/j256/ormlite/stmt/query/ManyClause;-><init>([Lcom/j256/ormlite/stmt/query/Clause;Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/stmt/query/ManyClause;);
a=0;//     invoke-direct {p0, v2}, Lcom/j256/ormlite/stmt/Where;->addClause(Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;// 
a=0;//     .line 409
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public varargs or(Lcom/j256/ormlite/stmt/Where;Lcom/j256/ormlite/stmt/Where;[Lcom/j256/ormlite/stmt/Where;)Lcom/j256/ormlite/stmt/Where;
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
a=0;//             "<TT;TID;>;",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
a=0;//             "<TT;TID;>;[",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
a=0;//             "<TT;TID;>;)",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 384
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     .local p1, "left":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     .local p2, "right":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     .local p3, "others":[Lcom/j256/ormlite/stmt/Where;, "[Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     const-string v3, "OR"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, p3, v3}, Lcom/j256/ormlite/stmt/Where;->buildClauseArray([Lcom/j256/ormlite/stmt/Where;Ljava/lang/String;)[Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 385
a=0;//     .local v0, "clauses":[Lcom/j256/ormlite/stmt/query/Clause;
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/stmt/query/Clause;);
a=0;//     const-string v3, "OR"
a=0;// 
a=0;//     invoke-direct {p0, v3}, Lcom/j256/ormlite/stmt/Where;->pop(Ljava/lang/String;)Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 386
a=0;//     .local v2, "secondClause":Lcom/j256/ormlite/stmt/query/Clause;
a=0;//     #v2=(Reference,Lcom/j256/ormlite/stmt/query/Clause;);
a=0;//     const-string v3, "OR"
a=0;// 
a=0;//     invoke-direct {p0, v3}, Lcom/j256/ormlite/stmt/Where;->pop(Ljava/lang/String;)Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 387
a=0;//     .local v1, "firstClause":Lcom/j256/ormlite/stmt/query/Clause;
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/query/Clause;);
a=0;//     new-instance v3, Lcom/j256/ormlite/stmt/query/ManyClause;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/j256/ormlite/stmt/query/ManyClause;);
a=0;//     const-string v4, "OR"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v1, v2, v0, v4}, Lcom/j256/ormlite/stmt/query/ManyClause;-><init>(Lcom/j256/ormlite/stmt/query/Clause;Lcom/j256/ormlite/stmt/query/Clause;[Lcom/j256/ormlite/stmt/query/Clause;Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/stmt/query/ManyClause;);
a=0;//     invoke-direct {p0, v3}, Lcom/j256/ormlite/stmt/Where;->addClause(Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;// 
a=0;//     .line 388
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public prepare()Lcom/j256/ormlite/stmt/PreparedQuery;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/stmt/PreparedQuery",
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
a=0;//     .line 475
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/Where;->statementBuilder:Lcom/j256/ormlite/stmt/StatementBuilder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Lcom/j256/ormlite/stmt/StatementBuilder;->prepareStatement(Ljava/lang/Long;)Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public query()Ljava/util/List;
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
a=0;//     .line 482
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/Where;->statementBuilder:Lcom/j256/ormlite/stmt/StatementBuilder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder;);
a=0;//     instance-of v0, v0, Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 483
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/Where;->statementBuilder:Lcom/j256/ormlite/stmt/StatementBuilder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder;);
a=0;//     check-cast v0, Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/stmt/QueryBuilder;->query()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 485
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     new-instance v0, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Cannot call query on a statement of type "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/stmt/Where;->statementBuilder:Lcom/j256/ormlite/stmt/StatementBuilder;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/j256/ormlite/stmt/StatementBuilder;->getType()Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
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
a=0;// .end method
a=0;// 
a=0;// .method public varargs raw(Ljava/lang/String;[Lcom/j256/ormlite/stmt/ArgumentHolder;)Lcom/j256/ormlite/stmt/Where;
a=0;//     .locals 7
a=0;//     .param p1, "rawStatement"    # Ljava/lang/String;
a=0;//     .param p2, "args"    # [Lcom/j256/ormlite/stmt/ArgumentHolder;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "[",
a=0;//             "Lcom/j256/ormlite/stmt/ArgumentHolder;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 448
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     move-object v1, p2
a=0;// 
a=0;//     .local v1, "arr$":[Lcom/j256/ormlite/stmt/ArgumentHolder;
a=0;//     #v1=(Reference,[Lcom/j256/ormlite/stmt/ArgumentHolder;);
a=0;//     array-length v4, v1
a=0;// 
a=0;//     .local v4, "len$":I
a=0;//     #v4=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i$":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Integer);v5=(Conflicted);
a=0;//     if-ge v3, v4, :cond_2
a=0;// 
a=0;//     aget-object v0, v1, v3
a=0;// 
a=0;//     .line 449
a=0;//     .local v0, "arg":Lcom/j256/ormlite/stmt/ArgumentHolder;
a=0;//     #v0=(Null);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/stmt/ArgumentHolder;->getColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 450
a=0;//     .local v2, "columnName":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 451
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/stmt/ArgumentHolder;->getSqlType()Lcom/j256/ormlite/field/SqlType;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lcom/j256/ormlite/field/SqlType;);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 452
a=0;//     new-instance v5, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v6, "Either the column name or SqlType must be set on each argument"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v5
a=0;// 
a=0;//     .line 455
a=0;//     :cond_0
a=0;//     #v5=(Conflicted);v6=(Uninit);
a=0;//     invoke-direct {p0, v2}, Lcom/j256/ormlite/stmt/Where;->findColumnFieldType(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-interface {v0, v5}, Lcom/j256/ormlite/stmt/ArgumentHolder;->setMetaInfo(Lcom/j256/ormlite/field/FieldType;)V
a=0;// 
a=0;//     .line 448
a=0;//     :cond_1
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 458
a=0;//     .end local v0    # "arg":Lcom/j256/ormlite/stmt/ArgumentHolder;
a=0;//     .end local v2    # "columnName":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v5=(Conflicted);
a=0;//     new-instance v5, Lcom/j256/ormlite/stmt/query/Raw;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/j256/ormlite/stmt/query/Raw;);
a=0;//     invoke-direct {v5, p1, p2}, Lcom/j256/ormlite/stmt/query/Raw;-><init>(Ljava/lang/String;[Lcom/j256/ormlite/stmt/ArgumentHolder;)V
a=0;// 
a=0;//     #v5=(Reference,Lcom/j256/ormlite/stmt/query/Raw;);
a=0;//     invoke-direct {p0, v5}, Lcom/j256/ormlite/stmt/Where;->addClause(Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;// 
a=0;//     .line 459
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public rawComparison(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;
a=0;//     .locals 2
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;//     .param p2, "rawOperator"    # Ljava/lang/String;
a=0;//     .param p3, "value"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/stmt/Where",
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
a=0;//     .line 467
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/query/SimpleComparison;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/query/SimpleComparison;);
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/Where;->findColumnFieldType(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-direct {v0, p1, v1, p3, p2}, Lcom/j256/ormlite/stmt/query/SimpleComparison;-><init>(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/query/SimpleComparison;);
a=0;//     invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->addClause(Lcom/j256/ormlite/stmt/query/Clause;)V
a=0;// 
a=0;//     .line 468
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 542
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/Where;, "Lcom/j256/ormlite/stmt/Where<TT;TID;>;"
a=0;//     iget v1, p0, Lcom/j256/ormlite/stmt/Where;->clauseStackLevel:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 543
a=0;//     const-string v1, "empty where clause"
a=0;// 
a=0;//     .line 546
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/String;);v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 545
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Integer);v2=(Uninit);
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/stmt/Where;->peek()Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 546
a=0;//     .local v0, "clause":Lcom/j256/ormlite/stmt/query/Clause;
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/query/Clause;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "where clause: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
