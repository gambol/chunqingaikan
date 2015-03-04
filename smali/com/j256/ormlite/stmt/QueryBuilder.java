package com.j256.ormlite.stmt; class QueryBuilder { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// .super Lcom/j256/ormlite/stmt/StatementBuilder;
a=0;// .source "QueryBuilder.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/j256/ormlite/stmt/QueryBuilder$InternalQueryBuilderWrapper;
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
a=0;//         "Lcom/j256/ormlite/stmt/StatementBuilder",
a=0;//         "<TT;TID;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private countOf:Z
a=0;// 
a=0;// .field private distinct:Z
a=0;// 
a=0;// .field private groupByList:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private groupByRaw:Ljava/lang/String;
a=0;// 
a=0;// .field private having:Ljava/lang/String;
a=0;// 
a=0;// .field private final idField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;// .field private isInnerQuery:Z
a=0;// 
a=0;// .field private joinType:Ljava/lang/String;
a=0;// 
a=0;// .field private joinedQueryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/stmt/QueryBuilder",
a=0;//             "<**>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private limit:Ljava/lang/Long;
a=0;// 
a=0;// .field private localJoinedField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;// .field private offset:Ljava/lang/Long;
a=0;// 
a=0;// .field private orderByList:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/j256/ormlite/stmt/query/OrderBy;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private orderByRaw:Ljava/lang/String;
a=0;// 
a=0;// .field private remoteJoinedField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;// .field private resultFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;// .field private selectColumnList:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private selectIdColumn:Z
a=0;// 
a=0;// .field private selectRawList:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
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
a=0;//     .line 58
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     .local p2, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     .local p3, "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;TID;>;"
a=0;//     sget-object v0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->SELECT:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     invoke-direct {p0, p1, p2, p3, v0}, Lcom/j256/ormlite/stmt/StatementBuilder;-><init>(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Lcom/j256/ormlite/dao/Dao;Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;)V
a=0;// 
a=0;//     .line 38
a=0;//     #p0=(Reference,Lcom/j256/ormlite/stmt/QueryBuilder;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectIdColumn:Z
a=0;// 
a=0;//     .line 59
a=0;//     invoke-virtual {p2}, Lcom/j256/ormlite/table/TableInfo;->getIdField()Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->idField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .line 60
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Lcom/j256/ormlite/stmt/QueryBuilder;)[Lcom/j256/ormlite/field/FieldType;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->resultFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private addSelectColumnToList(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 454
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     invoke-virtual {p0, p1}, Lcom/j256/ormlite/stmt/QueryBuilder;->verifyColumnName(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .line 455
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectColumnList:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 456
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private appendColumnName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p2, "columnName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 657
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     iget-boolean v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->addTableName:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 658
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->tableName:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, p1, v1}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 659
a=0;//     const/16 v0, 0x2e
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 661
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     invoke-interface {v0, p1, p2}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 662
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private appendColumns(Ljava/lang/StringBuilder;)V
a=0;//     .locals 8
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     const/16 v7, 0x2c
a=0;// 
a=0;//     .line 491
a=0;//     #v7=(PosByte);
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectColumnList:Ljava/util/List;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/List;);
a=0;//     if-nez v6, :cond_1
a=0;// 
a=0;//     .line 492
a=0;//     iget-boolean v6, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->addTableName:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 493
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     #v6=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     iget-object v7, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->tableName:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v6, p1, v7}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 494
a=0;//     const/16 v6, 0x2e
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 496
a=0;//     :cond_0
a=0;//     #v7=(Conflicted);
a=0;//     const-string v6, "* "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 497
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypes()[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iput-object v6, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->resultFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .line 540
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 501
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(PosByte);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 503
a=0;//     .local v3, "first":Z
a=0;//     #v3=(One);
a=0;//     iget-boolean v6, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->isInnerQuery:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     .line 504
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 508
a=0;//     .local v4, "hasId":Z
a=0;//     :goto_1
a=0;//     #v4=(Boolean);
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectColumnList:Ljava/util/List;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v6}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     .line 509
a=0;//     .local v2, "fieldTypeList":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/field/FieldType;>;"
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectColumnList:Ljava/util/List;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .local v5, "i$":Ljava/util/Iterator;
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Boolean);v5=(Reference,Ljava/util/Iterator;);v6=(Conflicted);
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_6
a=0;// 
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 510
a=0;//     .local v0, "columnName":Ljava/lang/String;
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v6=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-virtual {v6, v0}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypeByColumnName(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 515
a=0;//     .local v1, "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/field/FieldType;->isForeignCollection()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     .line 516
a=0;//     invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 506
a=0;//     .end local v0    # "columnName":Ljava/lang/String;
a=0;//     .end local v1    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     .end local v2    # "fieldTypeList":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/field/FieldType;>;"
a=0;//     .end local v4    # "hasId":Z
a=0;//     .end local v5    # "i$":Ljava/util/Iterator;
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(One);v4=(Uninit);v5=(Uninit);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .restart local v4    # "hasId":Z
a=0;//     #v4=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 519
a=0;//     .restart local v0    # "columnName":Ljava/lang/String;
a=0;//     .restart local v1    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     .restart local v2    # "fieldTypeList":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/field/FieldType;>;"
a=0;//     .restart local v5    # "i$":Ljava/util/Iterator;
a=0;//     :cond_4
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Lcom/j256/ormlite/field/FieldType;);v2=(Reference,Ljava/util/ArrayList;);v3=(Boolean);v4=(Boolean);v5=(Reference,Ljava/util/Iterator;);
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     .line 520
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 524
a=0;//     :goto_3
a=0;//     invoke-direct {p0, p1, v1, v2}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendFieldColumnName(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/util/List;)V
a=0;// 
a=0;//     .line 525
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->idField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v6=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     if-ne v1, v6, :cond_2
a=0;// 
a=0;//     .line 526
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 522
a=0;//     :cond_5
a=0;//     #v4=(Boolean);v6=(Boolean);
a=0;//     invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 531
a=0;//     .end local v0    # "columnName":Ljava/lang/String;
a=0;//     .end local v1    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     if-nez v4, :cond_8
a=0;// 
a=0;//     iget-boolean v6, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectIdColumn:Z
a=0;// 
a=0;//     if-eqz v6, :cond_8
a=0;// 
a=0;//     .line 532
a=0;//     if-nez v3, :cond_7
a=0;// 
a=0;//     .line 533
a=0;//     invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 535
a=0;//     :cond_7
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->idField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v6=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-direct {p0, p1, v6, v2}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendFieldColumnName(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/util/List;)V
a=0;// 
a=0;//     .line 537
a=0;//     :cond_8
a=0;//     #v6=(Conflicted);
a=0;//     const/16 v6, 0x20
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 539
a=0;//     invoke-interface {v2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     new-array v6, v6, [Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v6=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-interface {v2, v6}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     check-cast v6, [Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     iput-object v6, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->resultFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private appendFieldColumnName(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/util/List;)V
a=0;//     .locals 1
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p2, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/StringBuilder;",
a=0;//             "Lcom/j256/ormlite/field/FieldType;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/j256/ormlite/field/FieldType;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 543
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     .local p3, "fieldTypeList":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/field/FieldType;>;"
a=0;//     invoke-virtual {p2}, Lcom/j256/ormlite/field/FieldType;->getColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendColumnName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 544
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     .line 545
a=0;//     invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 547
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private appendGroupBys(Ljava/lang/StringBuilder;)V
a=0;//     .locals 2
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 569
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 570
a=0;//     .local v0, "first":Z
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/stmt/QueryBuilder;->hasGroupStuff()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 571
a=0;//     invoke-direct {p0, p1, v0}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendGroupBys(Ljava/lang/StringBuilder;Z)V
a=0;// 
a=0;//     .line 572
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 578
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->joinedQueryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/QueryBuilder;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->joinedQueryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     invoke-direct {v1}, Lcom/j256/ormlite/stmt/QueryBuilder;->hasGroupStuff()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 579
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->joinedQueryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/QueryBuilder;);
a=0;//     invoke-direct {v1, p1, v0}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendGroupBys(Ljava/lang/StringBuilder;Z)V
a=0;// 
a=0;//     .line 581
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private appendGroupBys(Ljava/lang/StringBuilder;Z)V
a=0;//     .locals 4
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p2, "first"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     const/16 v3, 0x2c
a=0;// 
a=0;//     .line 588
a=0;//     #v3=(PosByte);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 589
a=0;//     const-string v2, "GROUP BY "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 591
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->groupByRaw:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 592
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     .line 593
a=0;//     invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 595
a=0;//     :cond_1
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->groupByRaw:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 606
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     const/16 v2, 0x20
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 607
a=0;//     return-void
a=0;// 
a=0;//     .line 597
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->groupByList:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .local v1, "i$":Ljava/util/Iterator;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 598
a=0;//     .local v0, "columnName":Ljava/lang/String;
a=0;//     if-eqz p2, :cond_4
a=0;// 
a=0;//     .line 599
a=0;//     const/4 p2, 0x0
a=0;// 
a=0;//     .line 603
a=0;//     :goto_1
a=0;//     invoke-direct {p0, p1, v0}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendColumnName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 601
a=0;//     :cond_4
a=0;//     invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private appendHaving(Ljava/lang/StringBuilder;)V
a=0;//     .locals 2
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 665
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->having:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 666
a=0;//     const-string v0, "HAVING "
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->having:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v1, 0x20
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 668
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private appendJoinSql(Ljava/lang/StringBuilder;)V
a=0;//     .locals 3
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     const/16 v2, 0x2e
a=0;// 
a=0;//     .line 459
a=0;//     #v2=(PosByte);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->joinType:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, " JOIN "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 460
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->joinedQueryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/j256/ormlite/stmt/QueryBuilder;->tableName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v0, p1, v1}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 461
a=0;//     const-string v0, " ON "
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 462
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->tableName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v0, p1, v1}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 463
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 464
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->localJoinedField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/field/FieldType;->getColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, p1, v1}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 465
a=0;//     const-string v0, " = "
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 466
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->joinedQueryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/j256/ormlite/stmt/QueryBuilder;->tableName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v0, p1, v1}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 467
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 468
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->remoteJoinedField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/field/FieldType;->getColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, p1, v1}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 469
a=0;//     const/16 v0, 0x20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 471
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->joinedQueryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/QueryBuilder;);
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/stmt/QueryBuilder;->joinedQueryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 472
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->joinedQueryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     invoke-direct {v0, p1}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendJoinSql(Ljava/lang/StringBuilder;)V
a=0;// 
a=0;//     .line 474
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private appendLimit(Ljava/lang/StringBuilder;)V
a=0;//     .locals 4
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 550
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->limit:Ljava/lang/Long;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Long;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/db/DatabaseType;->isLimitSqlSupported()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 551
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->limit:Ljava/lang/Long;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->offset:Ljava/lang/Long;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Long;);
a=0;//     invoke-interface {v0, p1, v1, v2, v3}, Lcom/j256/ormlite/db/DatabaseType;->appendLimitValue(Ljava/lang/StringBuilder;JLjava/lang/Long;)V
a=0;// 
a=0;//     .line 553
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private appendOffset(Ljava/lang/StringBuilder;)V
a=0;//     .locals 3
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 556
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->offset:Ljava/lang/Long;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Long;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 566
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 559
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/db/DatabaseType;->isOffsetLimitArgument()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 560
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->limit:Ljava/lang/Long;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Long;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 561
a=0;//     new-instance v0, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/sql/SQLException;);
a=0;//     const-string v1, "If the offset is specified, limit must also be specified with this database"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 564
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->offset:Ljava/lang/Long;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-interface {v0, p1, v1, v2}, Lcom/j256/ormlite/db/DatabaseType;->appendOffsetValue(Ljava/lang/StringBuilder;J)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private appendOrderBys(Ljava/lang/StringBuilder;)V
a=0;//     .locals 2
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 610
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 611
a=0;//     .local v0, "first":Z
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/stmt/QueryBuilder;->hasOrderStuff()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 612
a=0;//     invoke-direct {p0, p1, v0}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendOrderBys(Ljava/lang/StringBuilder;Z)V
a=0;// 
a=0;//     .line 613
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 619
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->joinedQueryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/QueryBuilder;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->joinedQueryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     invoke-direct {v1}, Lcom/j256/ormlite/stmt/QueryBuilder;->hasOrderStuff()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 620
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->joinedQueryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/QueryBuilder;);
a=0;//     invoke-direct {v1, p1, v0}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendOrderBys(Ljava/lang/StringBuilder;Z)V
a=0;// 
a=0;//     .line 622
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private appendOrderBys(Ljava/lang/StringBuilder;Z)V
a=0;//     .locals 4
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p2, "first"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     const/16 v3, 0x2c
a=0;// 
a=0;//     .line 629
a=0;//     #v3=(PosByte);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 630
a=0;//     const-string v2, "ORDER BY "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 632
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->orderByRaw:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 633
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     .line 634
a=0;//     invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 636
a=0;//     :cond_1
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->orderByRaw:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 653
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     const/16 v2, 0x20
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 654
a=0;//     return-void
a=0;// 
a=0;//     .line 638
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->orderByList:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "i$":Ljava/util/Iterator;
a=0;//     :cond_4
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/Iterator;);v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/j256/ormlite/stmt/query/OrderBy;
a=0;// 
a=0;//     .line 639
a=0;//     .local v1, "orderBy":Lcom/j256/ormlite/stmt/query/OrderBy;
a=0;//     if-eqz p2, :cond_5
a=0;// 
a=0;//     .line 640
a=0;//     const/4 p2, 0x0
a=0;// 
a=0;//     .line 644
a=0;//     :goto_1
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/stmt/query/OrderBy;->getColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, p1, v2}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendColumnName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 645
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/stmt/query/OrderBy;->isAscending()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_4
a=0;// 
a=0;//     .line 649
a=0;//     const-string v2, " DESC"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 642
a=0;//     :cond_5
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private appendSelectRaw(Ljava/lang/StringBuilder;)V
a=0;//     .locals 4
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 477
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 478
a=0;//     .local v1, "first":Z
a=0;//     #v1=(One);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectRawList:Ljava/util/List;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .local v2, "i$":Ljava/util/Iterator;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 479
a=0;//     .local v0, "column":Ljava/lang/String;
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 480
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 484
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 482
a=0;//     :cond_0
a=0;//     #v3=(Boolean);
a=0;//     const-string v3, ", "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 486
a=0;//     .end local v0    # "column":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v3=(Boolean);
a=0;//     const/16 v3, 0x20
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 487
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private hasGroupStuff()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 584
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->groupByList:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->groupByList:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->groupByRaw:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private hasOrderStuff()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 625
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->orderByList:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->orderByList:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->orderByRaw:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private matchJoinedFields(Lcom/j256/ormlite/stmt/QueryBuilder;)V
a=0;//     .locals 8
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/stmt/QueryBuilder",
a=0;//             "<**>;)V"
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
a=0;//     .line 431
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     .local p1, "joinedQueryBuilder":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<**>;"
a=0;//     iget-object v5, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v5=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-virtual {v5}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypes()[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "arr$":[Lcom/j256/ormlite/field/FieldType;
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     array-length v4, v0
a=0;// 
a=0;//     .local v4, "len$":I
a=0;//     #v4=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i$":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Integer);v5=(Conflicted);
a=0;//     if-ge v3, v4, :cond_1
a=0;// 
a=0;//     aget-object v1, v0, v3
a=0;// 
a=0;//     .line 433
a=0;//     .local v1, "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/field/FieldType;->getForeignIdField()Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 434
a=0;//     .local v2, "foreignIdField":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v2=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/field/FieldType;->isForeign()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     iget-object v5, p1, Lcom/j256/ormlite/stmt/QueryBuilder;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v5=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-virtual {v5}, Lcom/j256/ormlite/table/TableInfo;->getIdField()Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     if-ne v2, v5, :cond_0
a=0;// 
a=0;//     .line 435
a=0;//     iput-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->localJoinedField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .line 436
a=0;//     iput-object v2, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->remoteJoinedField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .line 445
a=0;//     .end local v2    # "foreignIdField":Lcom/j256/ormlite/field/FieldType;
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 431
a=0;//     .restart local v2    # "foreignIdField":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_0
a=0;//     #v2=(Reference,Lcom/j256/ormlite/field/FieldType;);v5=(Conflicted);v6=(Uninit);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 441
a=0;//     .end local v1    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     .end local v2    # "foreignIdField":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v5, p1, Lcom/j256/ormlite/stmt/QueryBuilder;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v5=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-virtual {v5}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypes()[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     array-length v4, v0
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :goto_2
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     if-ge v3, v4, :cond_3
a=0;// 
a=0;//     aget-object v1, v0, v3
a=0;// 
a=0;//     .line 442
a=0;//     .restart local v1    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/field/FieldType;->isForeign()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/field/FieldType;->getForeignIdField()Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->idField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v6=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     if-ne v5, v6, :cond_2
a=0;// 
a=0;//     .line 443
a=0;//     iget-object v5, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->idField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     iput-object v5, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->localJoinedField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .line 444
a=0;//     iput-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->remoteJoinedField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 441
a=0;//     :cond_2
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 449
a=0;//     .end local v1    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v5, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "Could not find a foreign "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v7, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/j256/ormlite/table/TableInfo;->getDataClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, " field in "
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v7, p1, Lcom/j256/ormlite/stmt/QueryBuilder;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/j256/ormlite/table/TableInfo;->getDataClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, " or vice versa"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v5
a=0;// .end method
a=0;// 
a=0;// .method private setAddTableName(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "addTableName"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 421
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     iput-boolean p1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->addTableName:Z
a=0;// 
a=0;//     .line 422
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->joinedQueryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/QueryBuilder;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 423
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->joinedQueryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     invoke-direct {v0, p1}, Lcom/j256/ormlite/stmt/QueryBuilder;->setAddTableName(Z)V
a=0;// 
a=0;//     .line 425
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected appendStatementEnd(Ljava/lang/StringBuilder;)V
a=0;//     .locals 1
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 404
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendGroupBys(Ljava/lang/StringBuilder;)V
a=0;// 
a=0;//     .line 405
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendOrderBys(Ljava/lang/StringBuilder;)V
a=0;// 
a=0;//     .line 406
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendHaving(Ljava/lang/StringBuilder;)V
a=0;// 
a=0;//     .line 407
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/db/DatabaseType;->isLimitAfterSelect()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 408
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendLimit(Ljava/lang/StringBuilder;)V
a=0;// 
a=0;//     .line 410
a=0;//     :cond_0
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendOffset(Ljava/lang/StringBuilder;)V
a=0;// 
a=0;//     .line 412
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/QueryBuilder;->setAddTableName(Z)V
a=0;// 
a=0;//     .line 413
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
a=0;//     .line 354
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     .local p2, "argList":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/stmt/ArgumentHolder;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->joinedQueryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/QueryBuilder;);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 355
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/QueryBuilder;->setAddTableName(Z)V
a=0;// 
a=0;//     .line 359
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "SELECT "
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 360
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/db/DatabaseType;->isLimitAfterSelect()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 361
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendLimit(Ljava/lang/StringBuilder;)V
a=0;// 
a=0;//     .line 363
a=0;//     :cond_0
a=0;//     iget-boolean v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->distinct:Z
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 364
a=0;//     const-string v0, "DISTINCT "
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 366
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     iget-boolean v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->countOf:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 367
a=0;//     sget-object v0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->SELECT_LONG:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->type:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     .line 368
a=0;//     const-string v0, "COUNT(*) "
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 376
a=0;//     :goto_1
a=0;//     const-string v0, "FROM "
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 377
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->tableName:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, p1, v1}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 378
a=0;//     const/16 v0, 0x20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 379
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->joinedQueryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/QueryBuilder;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 380
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendJoinSql(Ljava/lang/StringBuilder;)V
a=0;// 
a=0;//     .line 382
a=0;//     :cond_2
a=0;//     return-void
a=0;// 
a=0;//     .line 357
a=0;//     :cond_3
a=0;//     #v1=(Uninit);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/QueryBuilder;->setAddTableName(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 369
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectRawList:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectRawList:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     .line 370
a=0;//     sget-object v0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->SELECT_RAW:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->type:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     .line 371
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendSelectRaw(Ljava/lang/StringBuilder;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 373
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);
a=0;//     sget-object v0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->SELECT:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->type:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     .line 374
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendColumns(Ljava/lang/StringBuilder;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected appendWhereStatement(Ljava/lang/StringBuilder;Ljava/util/List;Z)V
a=0;//     .locals 1
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
a=0;//     .line 392
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     .local p2, "argList":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/stmt/ArgumentHolder;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->where:Lcom/j256/ormlite/stmt/Where;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/Where;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 393
a=0;//     invoke-super {p0, p1, p2, p3}, Lcom/j256/ormlite/stmt/StatementBuilder;->appendWhereStatement(Ljava/lang/StringBuilder;Ljava/util/List;Z)V
a=0;// 
a=0;//     .line 394
a=0;//     const/4 p3, 0x0
a=0;// 
a=0;//     .line 396
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->joinedQueryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 397
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->joinedQueryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendWhereStatement(Ljava/lang/StringBuilder;Ljava/util/List;Z)V
a=0;// 
a=0;//     .line 399
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public clear()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 332
a=0;//     #v1=(Null);
a=0;//     invoke-super {p0}, Lcom/j256/ormlite/stmt/StatementBuilder;->clear()V
a=0;// 
a=0;//     .line 333
a=0;//     iput-boolean v2, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->distinct:Z
a=0;// 
a=0;//     .line 334
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectIdColumn:Z
a=0;// 
a=0;//     .line 335
a=0;//     iput-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectColumnList:Ljava/util/List;
a=0;// 
a=0;//     .line 336
a=0;//     iput-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectRawList:Ljava/util/List;
a=0;// 
a=0;//     .line 337
a=0;//     iput-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->orderByList:Ljava/util/List;
a=0;// 
a=0;//     .line 338
a=0;//     iput-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->orderByRaw:Ljava/lang/String;
a=0;// 
a=0;//     .line 339
a=0;//     iput-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->groupByList:Ljava/util/List;
a=0;// 
a=0;//     .line 340
a=0;//     iput-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->groupByRaw:Ljava/lang/String;
a=0;// 
a=0;//     .line 341
a=0;//     iput-boolean v2, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->isInnerQuery:Z
a=0;// 
a=0;//     .line 342
a=0;//     iput-boolean v2, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->countOf:Z
a=0;// 
a=0;//     .line 343
a=0;//     iput-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->having:Ljava/lang/String;
a=0;// 
a=0;//     .line 344
a=0;//     iput-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->limit:Ljava/lang/Long;
a=0;// 
a=0;//     .line 345
a=0;//     iput-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->offset:Ljava/lang/Long;
a=0;// 
a=0;//     .line 346
a=0;//     iput-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->joinedQueryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     .line 347
a=0;//     iput-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->localJoinedField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .line 348
a=0;//     iput-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->remoteJoinedField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .line 349
a=0;//     iput-boolean v2, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->addTableName:Z
a=0;// 
a=0;//     .line 350
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public distinct()Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/stmt/QueryBuilder",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 211
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->distinct:Z
a=0;// 
a=0;//     .line 212
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectIdColumn:Z
a=0;// 
a=0;//     .line 213
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method enableInnerQuery()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->isInnerQuery:Z
a=0;// 
a=0;//     .line 70
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected getResultFieldTypes()[Lcom/j256/ormlite/field/FieldType;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 386
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->resultFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method getSelectColumnCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectColumnList:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 77
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 79
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectColumnList:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method getSelectColumns()Ljava/util/List;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectColumnList:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 88
a=0;//     invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 90
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectColumnList:Ljava/util/List;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public groupBy(Ljava/lang/String;)Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;//     .locals 4
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/stmt/QueryBuilder",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 159
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     invoke-virtual {p0, p1}, Lcom/j256/ormlite/stmt/QueryBuilder;->verifyColumnName(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 160
a=0;//     .local v0, "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/field/FieldType;->isForeignCollection()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 161
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Can\'t groupBy foreign colletion field: "
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
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 163
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->groupByList:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 164
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->groupByList:Ljava/util/List;
a=0;// 
a=0;//     .line 166
a=0;//     :cond_1
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->groupByList:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 167
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectIdColumn:Z
a=0;// 
a=0;//     .line 168
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public groupByRaw(Ljava/lang/String;)Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;//     .locals 0
a=0;//     .param p1, "rawSql"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/stmt/QueryBuilder",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 175
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->groupByRaw:Ljava/lang/String;
a=0;// 
a=0;//     .line 176
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public having(Ljava/lang/String;)Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;//     .locals 0
a=0;//     .param p1, "having"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/stmt/QueryBuilder",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 271
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->having:Ljava/lang/String;
a=0;// 
a=0;//     .line 272
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public iterator()Lcom/j256/ormlite/dao/CloseableIterator;
a=0;//     .locals 2
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
a=0;//     .line 327
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/stmt/QueryBuilder;->prepare()Lcom/j256/ormlite/stmt/PreparedQuery;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/PreparedQuery;);
a=0;//     invoke-interface {v0, v1}, Lcom/j256/ormlite/dao/Dao;->iterator(Lcom/j256/ormlite/stmt/PreparedQuery;)Lcom/j256/ormlite/dao/CloseableIterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public join(Lcom/j256/ormlite/stmt/QueryBuilder;)Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/stmt/QueryBuilder",
a=0;//             "<**>;)",
a=0;//             "Lcom/j256/ormlite/stmt/QueryBuilder",
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
a=0;//     .line 281
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     .local p1, "joinedQueryBuilder":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<**>;"
a=0;//     const-string v0, "INNER"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->joinType:Ljava/lang/String;
a=0;// 
a=0;//     .line 282
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->joinedQueryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     .line 283
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/QueryBuilder;->matchJoinedFields(Lcom/j256/ormlite/stmt/QueryBuilder;)V
a=0;// 
a=0;//     .line 284
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public leftJoin(Lcom/j256/ormlite/stmt/QueryBuilder;)Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/stmt/QueryBuilder",
a=0;//             "<**>;)",
a=0;//             "Lcom/j256/ormlite/stmt/QueryBuilder",
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
a=0;//     .line 296
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     .local p1, "joinedQueryBuilder":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<**>;"
a=0;//     const-string v0, "LEFT"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->joinType:Ljava/lang/String;
a=0;// 
a=0;//     .line 297
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->joinedQueryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     .line 298
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/QueryBuilder;->matchJoinedFields(Lcom/j256/ormlite/stmt/QueryBuilder;)V
a=0;// 
a=0;//     .line 299
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public limit(I)Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;//     .locals 2
a=0;//     .param p1, "maxRows"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(I)",
a=0;//             "Lcom/j256/ormlite/stmt/QueryBuilder",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation runtime Ljava/lang/Deprecated;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 221
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     int-to-long v0, p1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {p0, v0}, Lcom/j256/ormlite/stmt/QueryBuilder;->limit(Ljava/lang/Long;)Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public limit(Ljava/lang/Long;)Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;//     .locals 0
a=0;//     .param p1, "maxRows"    # Ljava/lang/Long;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Long;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/stmt/QueryBuilder",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 228
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->limit:Ljava/lang/Long;
a=0;// 
a=0;//     .line 229
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public offset(I)Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;//     .locals 2
a=0;//     .param p1, "startRow"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(I)",
a=0;//             "Lcom/j256/ormlite/stmt/QueryBuilder",
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
a=0;//     .annotation runtime Ljava/lang/Deprecated;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 237
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     int-to-long v0, p1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {p0, v0}, Lcom/j256/ormlite/stmt/QueryBuilder;->offset(Ljava/lang/Long;)Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public offset(Ljava/lang/Long;)Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;//     .locals 2
a=0;//     .param p1, "startRow"    # Ljava/lang/Long;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Long;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/stmt/QueryBuilder",
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
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/db/DatabaseType;->isOffsetSqlSupported()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 252
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->offset:Ljava/lang/Long;
a=0;// 
a=0;//     .line 253
a=0;//     return-object p0
a=0;// 
a=0;//     .line 255
a=0;//     :cond_0
a=0;//     new-instance v0, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/sql/SQLException;);
a=0;//     const-string v1, "Offset is not supported by this database"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public orderBy(Ljava/lang/String;Z)Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;//     .locals 4
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;//     .param p2, "ascending"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Z)",
a=0;//             "Lcom/j256/ormlite/stmt/QueryBuilder",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 183
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     invoke-virtual {p0, p1}, Lcom/j256/ormlite/stmt/QueryBuilder;->verifyColumnName(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 184
a=0;//     .local v0, "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/field/FieldType;->isForeignCollection()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 185
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Can\'t orderBy foreign colletion field: "
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
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 187
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->orderByList:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 188
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->orderByList:Ljava/util/List;
a=0;// 
a=0;//     .line 190
a=0;//     :cond_1
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->orderByList:Ljava/util/List;
a=0;// 
a=0;//     new-instance v2, Lcom/j256/ormlite/stmt/query/OrderBy;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/j256/ormlite/stmt/query/OrderBy;);
a=0;//     invoke-direct {v2, p1, p2}, Lcom/j256/ormlite/stmt/query/OrderBy;-><init>(Ljava/lang/String;Z)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/stmt/query/OrderBy;);
a=0;//     invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 191
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public orderByRaw(Ljava/lang/String;)Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;//     .locals 0
a=0;//     .param p1, "rawSql"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/stmt/QueryBuilder",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 198
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->orderByRaw:Ljava/lang/String;
a=0;// 
a=0;//     .line 199
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public prepare()Lcom/j256/ormlite/stmt/PreparedQuery;
a=0;//     .locals 1
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
a=0;//     .line 100
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->limit:Ljava/lang/Long;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Long;);
a=0;//     invoke-super {p0, v0}, Lcom/j256/ormlite/stmt/StatementBuilder;->prepareStatement(Ljava/lang/Long;)Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public query()Ljava/util/List;
a=0;//     .locals 2
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
a=0;//     .line 306
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/stmt/QueryBuilder;->prepare()Lcom/j256/ormlite/stmt/PreparedQuery;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/PreparedQuery;);
a=0;//     invoke-interface {v0, v1}, Lcom/j256/ormlite/dao/Dao;->query(Lcom/j256/ormlite/stmt/PreparedQuery;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public queryForFirst()Ljava/lang/Object;
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
a=0;//     .line 313
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/stmt/QueryBuilder;->prepare()Lcom/j256/ormlite/stmt/PreparedQuery;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/PreparedQuery;);
a=0;//     invoke-interface {v0, v1}, Lcom/j256/ormlite/dao/Dao;->queryForFirst(Lcom/j256/ormlite/stmt/PreparedQuery;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public queryRawFirst()[Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 320
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/stmt/QueryBuilder;->prepareStatementString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v2}, Lcom/j256/ormlite/dao/Dao;->queryRaw(Ljava/lang/String;[Ljava/lang/String;)Lcom/j256/ormlite/dao/GenericRawResults;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/dao/GenericRawResults;->getFirstResult()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, [Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public selectColumns(Ljava/lang/Iterable;)Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Iterable",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)",
a=0;//             "Lcom/j256/ormlite/stmt/QueryBuilder",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 127
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     .local p1, "columns":Ljava/lang/Iterable;, "Ljava/lang/Iterable<Ljava/lang/String;>;"
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectColumnList:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 128
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v2, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectColumnList:Ljava/util/List;
a=0;// 
a=0;//     .line 130
a=0;//     :cond_0
a=0;//     invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .local v1, "i$":Ljava/util/Iterator;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 131
a=0;//     .local v0, "column":Ljava/lang/String;
a=0;//     invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/QueryBuilder;->addSelectColumnToList(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 133
a=0;//     .end local v0    # "column":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public varargs selectColumns([Ljava/lang/String;)Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;//     .locals 5
a=0;//     .param p1, "columns"    # [Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "([",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/stmt/QueryBuilder",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 113
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectColumnList:Ljava/util/List;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/List;);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 114
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v4, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectColumnList:Ljava/util/List;
a=0;// 
a=0;//     .line 116
a=0;//     :cond_0
a=0;//     move-object v0, p1
a=0;// 
a=0;//     .local v0, "arr$":[Ljava/lang/String;
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     array-length v3, v0
a=0;// 
a=0;//     .local v3, "len$":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i$":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Integer);
a=0;//     if-ge v2, v3, :cond_1
a=0;// 
a=0;//     aget-object v1, v0, v2
a=0;// 
a=0;//     .line 117
a=0;//     .local v1, "column":Ljava/lang/String;
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, v1}, Lcom/j256/ormlite/stmt/QueryBuilder;->addSelectColumnToList(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 116
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 119
a=0;//     .end local v1    # "column":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public varargs selectRaw([Ljava/lang/String;)Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;//     .locals 5
a=0;//     .param p1, "columns"    # [Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "([",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Lcom/j256/ormlite/stmt/QueryBuilder",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 141
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectRawList:Ljava/util/List;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/List;);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 142
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v4, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectRawList:Ljava/util/List;
a=0;// 
a=0;//     .line 144
a=0;//     :cond_0
a=0;//     move-object v0, p1
a=0;// 
a=0;//     .local v0, "arr$":[Ljava/lang/String;
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     array-length v3, v0
a=0;// 
a=0;//     .local v3, "len$":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i$":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Integer);
a=0;//     if-ge v2, v3, :cond_1
a=0;// 
a=0;//     aget-object v1, v0, v2
a=0;// 
a=0;//     .line 145
a=0;//     .local v1, "column":Ljava/lang/String;
a=0;//     #v1=(Null);
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectRawList:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 144
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 147
a=0;//     .end local v1    # "column":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setCountOf(Z)Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;//     .locals 0
a=0;//     .param p1, "countOf"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(Z)",
a=0;//             "Lcom/j256/ormlite/stmt/QueryBuilder",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 263
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     iput-boolean p1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->countOf:Z
a=0;// 
a=0;//     .line 264
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method protected shouldPrependTableNameToColumns()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 417
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->joinedQueryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/QueryBuilder;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/QueryBuilder;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
