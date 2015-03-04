package com.j256.ormlite.table; class TableUtils { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/table/TableUtils;
a=0;// .super Ljava/lang/Object;
a=0;// .source "TableUtils.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;// .field private static final noFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     const-class v0, Lcom/j256/ormlite/table/TableUtils;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0}, Lcom/j256/ormlite/logger/LoggerFactory;->getLogger(Ljava/lang/Class;)Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/j256/ormlite/table/TableUtils;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     .line 35
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     sput-object v0, Lcom/j256/ormlite/table/TableUtils;->noFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 41
a=0;//     #p0=(Reference,Lcom/j256/ormlite/table/TableUtils;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static addCreateIndexStatements(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Ljava/util/List;ZZ)V
a=0;//     .locals 17
a=0;//     .param p0, "databaseType"    # Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .param p3, "ifNotExists"    # Z
a=0;//     .param p4, "unique"    # Z
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
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;ZZ)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 362
a=0;//     .local p1, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     .local p2, "statements":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     new-instance v9, Ljava/util/HashMap;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v9}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 363
a=0;//     .local v9, "indexMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
a=0;//     #v9=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypes()[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .local v1, "arr$":[Lcom/j256/ormlite/field/FieldType;
a=0;//     #v1=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     array-length v11, v1
a=0;// 
a=0;//     .local v11, "len$":I
a=0;//     #v11=(Integer);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .local v6, "i$":I
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);v6=(Integer);v10=(Conflicted);v13=(Conflicted);
a=0;//     if-ge v6, v11, :cond_3
a=0;// 
a=0;//     aget-object v4, v1, v6
a=0;// 
a=0;//     .line 365
a=0;//     .local v4, "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v4=(Null);
a=0;//     if-eqz p4, :cond_0
a=0;// 
a=0;//     .line 366
a=0;//     invoke-virtual {v4}, Lcom/j256/ormlite/field/FieldType;->getUniqueIndexName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 370
a=0;//     .local v10, "indexName":Ljava/lang/String;
a=0;//     :goto_1
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     if-nez v10, :cond_1
a=0;// 
a=0;//     .line 363
a=0;//     :goto_2
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 368
a=0;//     .end local v10    # "indexName":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v10=(Conflicted);
a=0;//     invoke-virtual {v4}, Lcom/j256/ormlite/field/FieldType;->getIndexName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .restart local v10    # "indexName":Ljava/lang/String;
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 374
a=0;//     :cond_1
a=0;//     invoke-interface {v9, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Ljava/util/List;
a=0;// 
a=0;//     .line 375
a=0;//     .local v2, "columnList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 376
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     .end local v2    # "columnList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 377
a=0;//     .restart local v2    # "columnList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v9, v10, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 379
a=0;//     :cond_2
a=0;//     invoke-virtual {v4}, Lcom/j256/ormlite/field/FieldType;->getColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 382
a=0;//     .end local v2    # "columnList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     .end local v4    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     .end local v10    # "indexName":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);v4=(Conflicted);v10=(Conflicted);v13=(Conflicted);
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v13, 0x80
a=0;// 
a=0;//     #v13=(PosShort);
a=0;//     invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 383
a=0;//     .local v12, "sb":Ljava/lang/StringBuilder;
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {v9}, Ljava/util/Map;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v13}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .end local v6    # "i$":I
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Reference,Ljava/util/Iterator;);v7=(Conflicted);v8=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-eqz v13, :cond_8
a=0;// 
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v8, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 384
a=0;//     .local v8, "indexEntry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
a=0;//     sget-object v13, Lcom/j256/ormlite/table/TableUtils;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v13=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v14, "creating index \'{}\' for table \'{}"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/j256/ormlite/table/TableInfo;->getTableName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v13 .. v16}, Lcom/j256/ormlite/logger/Logger;->info(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 385
a=0;//     const-string v13, "CREATE "
a=0;// 
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 386
a=0;//     if-eqz p4, :cond_4
a=0;// 
a=0;//     .line 387
a=0;//     const-string v13, "UNIQUE "
a=0;// 
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 389
a=0;//     :cond_4
a=0;//     const-string v13, "INDEX "
a=0;// 
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 390
a=0;//     if-eqz p3, :cond_5
a=0;// 
a=0;//     invoke-interface/range {p0 .. p0}, Lcom/j256/ormlite/db/DatabaseType;->isCreateIndexIfNotExistsSupported()Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-eqz v13, :cond_5
a=0;// 
a=0;//     .line 391
a=0;//     const-string v13, "IF NOT EXISTS "
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 393
a=0;//     :cond_5
a=0;//     #v13=(Conflicted);
a=0;//     invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v13, Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     invoke-interface {v0, v12, v13}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 394
a=0;//     const-string v13, " ON "
a=0;// 
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 395
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/j256/ormlite/table/TableInfo;->getTableName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-interface {v0, v12, v13}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 396
a=0;//     const-string v13, " ( "
a=0;// 
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 397
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 398
a=0;//     .local v5, "first":Z
a=0;//     #v5=(One);
a=0;//     invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     check-cast v13, Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .local v7, "i$":Ljava/util/Iterator;
a=0;//     :goto_4
a=0;//     #v5=(Boolean);v7=(Reference,Ljava/util/Iterator;);v13=(Conflicted);
a=0;//     invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-eqz v13, :cond_7
a=0;// 
a=0;//     invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Ljava/lang/String;
a=0;// 
a=0;//     .line 399
a=0;//     .local v3, "columnName":Ljava/lang/String;
a=0;//     if-eqz v5, :cond_6
a=0;// 
a=0;//     .line 400
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 404
a=0;//     :goto_5
a=0;//     #v13=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-interface {v0, v12, v3}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 402
a=0;//     :cond_6
a=0;//     #v13=(Boolean);
a=0;//     const-string v13, ", "
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 406
a=0;//     .end local v3    # "columnName":Ljava/lang/String;
a=0;//     :cond_7
a=0;//     #v3=(Conflicted);v13=(Boolean);
a=0;//     const-string v13, " )"
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 407
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-interface {v0, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 408
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->setLength(I)V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 410
a=0;//     .end local v5    # "first":Z
a=0;//     .end local v7    # "i$":Ljava/util/Iterator;
a=0;//     .end local v8    # "indexEntry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
a=0;//     :cond_8
a=0;//     #v0=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v13=(Boolean);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static addCreateTableStatements(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/TableInfo;Z)Ljava/util/List;
a=0;//     .locals 3
a=0;//     .param p0, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .param p2, "ifNotExists"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             "ID:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Lcom/j256/ormlite/table/TableInfo",
a=0;//             "<TT;TID;>;Z)",
a=0;//             "Ljava/util/List",
a=0;//             "<",
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
a=0;//     .line 517
a=0;//     .local p1, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 518
a=0;//     .local v1, "statements":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 519
a=0;//     .local v0, "queriesAfter":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {p0}, Lcom/j256/ormlite/support/ConnectionSource;->getDatabaseType()Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     invoke-static {v2, p1, v1, v0, p2}, Lcom/j256/ormlite/table/TableUtils;->addCreateTableStatements(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Ljava/util/List;Ljava/util/List;Z)V
a=0;// 
a=0;//     .line 520
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method private static addCreateTableStatements(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Ljava/util/List;Ljava/util/List;Z)V
a=0;//     .locals 23
a=0;//     .param p0, "databaseType"    # Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .param p4, "ifNotExists"    # Z
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
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
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
a=0;//     .line 308
a=0;//     .local p1, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     .local p2, "statements":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     .local p3, "queriesAfter":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v4, 0x100
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 309
a=0;//     .local v6, "sb":Ljava/lang/StringBuilder;
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "CREATE TABLE "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 310
a=0;//     if-eqz p4, :cond_0
a=0;// 
a=0;//     invoke-interface/range {p0 .. p0}, Lcom/j256/ormlite/db/DatabaseType;->isCreateIfNotExistsSupported()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 311
a=0;//     const-string v4, "IF NOT EXISTS "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 313
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/j256/ormlite/table/TableInfo;->getTableName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     invoke-interface {v0, v6, v4}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 314
a=0;//     const-string v4, " ("
a=0;// 
a=0;//     invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 315
a=0;//     new-instance v8, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 316
a=0;//     .local v8, "additionalArgs":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     #v8=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v9, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 317
a=0;//     .local v9, "statementsBefore":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     #v9=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v10, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 319
a=0;//     .local v10, "statementsAfter":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     #v10=(Reference,Ljava/util/ArrayList;);
a=0;//     const/16 v20, 0x1
a=0;// 
a=0;//     .line 320
a=0;//     .local v20, "first":Z
a=0;//     #v20=(One);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypes()[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     .local v18, "arr$":[Lcom/j256/ormlite/field/FieldType;
a=0;//     #v18=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     .local v22, "len$":I
a=0;//     #v22=(Integer);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     .local v21, "i$":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v11=(Conflicted);v19=(Conflicted);v20=(Boolean);v21=(Integer);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_4
a=0;// 
a=0;//     aget-object v7, v18, v21
a=0;// 
a=0;//     .line 322
a=0;//     .local v7, "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v7}, Lcom/j256/ormlite/field/FieldType;->isForeignCollection()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 320
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     add-int/lit8 v21, v21, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 324
a=0;//     :cond_1
a=0;//     #v0=(Integer);v4=(Boolean);
a=0;//     if-eqz v20, :cond_2
a=0;// 
a=0;//     .line 325
a=0;//     const/16 v20, 0x0
a=0;// 
a=0;//     .line 329
a=0;//     :goto_2
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual {v7}, Lcom/j256/ormlite/field/FieldType;->getColumnDefinition()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     .line 330
a=0;//     .local v19, "columnDefinition":Ljava/lang/String;
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     if-nez v19, :cond_3
a=0;// 
a=0;//     .line 332
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/j256/ormlite/table/TableInfo;->getTableName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v4, p0
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     move-object/from16 v11, p3
a=0;// 
a=0;//     #v11=(Reference,Ljava/util/List;);
a=0;//     invoke-interface/range {v4 .. v11}, Lcom/j256/ormlite/db/DatabaseType;->appendColumnArg(Ljava/lang/String;Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 327
a=0;//     .end local v19    # "columnDefinition":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v4=(Boolean);v5=(Conflicted);v11=(Conflicted);v19=(Conflicted);
a=0;//     const-string v4, ", "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 336
a=0;//     .restart local v19    # "columnDefinition":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     #v4=(Conflicted);v19=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7}, Lcom/j256/ormlite/field/FieldType;->getColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     invoke-interface {v0, v6, v4}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 337
a=0;//     const/16 v4, 0x20
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/16 v5, 0x20
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 341
a=0;//     .end local v7    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     .end local v19    # "columnDefinition":Ljava/lang/String;
a=0;//     :cond_4
a=0;//     #v0=(Integer);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v19=(Conflicted);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypes()[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     move-object/from16 v11, p0
a=0;// 
a=0;//     #v11=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     move-object v13, v8
a=0;// 
a=0;//     #v13=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object v14, v9
a=0;// 
a=0;//     #v14=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object v15, v10
a=0;// 
a=0;//     #v15=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object/from16 v16, p3
a=0;// 
a=0;//     #v16=(Reference,Ljava/util/List;);
a=0;//     invoke-interface/range {v11 .. v16}, Lcom/j256/ormlite/db/DatabaseType;->addPrimaryKeySql([Lcom/j256/ormlite/field/FieldType;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
a=0;// 
a=0;//     .line 344
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypes()[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     move-object/from16 v11, p0
a=0;// 
a=0;//     move-object v13, v8
a=0;// 
a=0;//     move-object v14, v9
a=0;// 
a=0;//     move-object v15, v10
a=0;// 
a=0;//     move-object/from16 v16, p3
a=0;// 
a=0;//     invoke-interface/range {v11 .. v16}, Lcom/j256/ormlite/db/DatabaseType;->addUniqueComboSql([Lcom/j256/ormlite/field/FieldType;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
a=0;// 
a=0;//     .line 346
a=0;//     invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v21
a=0;// 
a=0;//     .local v21, "i$":Ljava/util/Iterator;
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v17=(Conflicted);v21=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v17, Ljava/lang/String;
a=0;// 
a=0;//     .line 348
a=0;//     .local v17, "arg":Ljava/lang/String;
a=0;//     const-string v4, ", "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 350
a=0;//     .end local v17    # "arg":Ljava/lang/String;
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v4=(Boolean);v17=(Conflicted);
a=0;//     const-string v4, ") "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 351
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     invoke-interface {v0, v6}, Lcom/j256/ormlite/db/DatabaseType;->appendCreateTableSuffix(Ljava/lang/StringBuilder;)V
a=0;// 
a=0;//     .line 352
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-interface {v0, v9}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 353
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 354
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-interface {v0, v10}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 355
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     move-object/from16 v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     move/from16 v3, p4
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     invoke-static {v0, v1, v2, v3, v4}, Lcom/j256/ormlite/table/TableUtils;->addCreateIndexStatements(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Ljava/util/List;ZZ)V
a=0;// 
a=0;//     .line 356
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     move-object/from16 v2, p2
a=0;// 
a=0;//     move/from16 v3, p4
a=0;// 
a=0;//     invoke-static {v0, v1, v2, v3, v4}, Lcom/j256/ormlite/table/TableUtils;->addCreateIndexStatements(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Ljava/util/List;ZZ)V
a=0;// 
a=0;//     .line 357
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static addDropIndexStatements(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Ljava/util/List;)V
a=0;//     .locals 11
a=0;//     .param p0, "databaseType"    # Lcom/j256/ormlite/db/DatabaseType;
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
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 281
a=0;//     .local p1, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     .local p2, "statements":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     new-instance v4, Ljava/util/HashSet;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/HashSet;);
a=0;//     invoke-direct {v4}, Ljava/util/HashSet;-><init>()V
a=0;// 
a=0;//     .line 282
a=0;//     .local v4, "indexSet":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
a=0;//     #v4=(Reference,Ljava/util/HashSet;);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypes()[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "arr$":[Lcom/j256/ormlite/field/FieldType;
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     array-length v5, v0
a=0;// 
a=0;//     .local v5, "len$":I
a=0;//     #v5=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i$":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Integer);v3=(Conflicted);v7=(Conflicted);
a=0;//     if-ge v2, v5, :cond_2
a=0;// 
a=0;//     aget-object v1, v0, v2
a=0;// 
a=0;//     .line 283
a=0;//     .local v1, "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/field/FieldType;->getIndexName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 284
a=0;//     .local v3, "indexName":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 285
a=0;//     invoke-interface {v4, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 287
a=0;//     :cond_0
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/field/FieldType;->getUniqueIndexName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 288
a=0;//     .local v7, "uniqueIndexName":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     .line 289
a=0;//     invoke-interface {v4, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 282
a=0;//     :cond_1
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 293
a=0;//     .end local v1    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     .end local v3    # "indexName":Ljava/lang/String;
a=0;//     .end local v7    # "uniqueIndexName":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v3=(Conflicted);v7=(Conflicted);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v8, 0x30
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 294
a=0;//     .local v6, "sb":Ljava/lang/StringBuilder;
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .local v2, "i$":Ljava/util/Iterator;
a=0;//     :goto_1
a=0;//     #v2=(Reference,Ljava/util/Iterator;);v9=(Conflicted);v10=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_3
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Ljava/lang/String;
a=0;// 
a=0;//     .line 295
a=0;//     .restart local v3    # "indexName":Ljava/lang/String;
a=0;//     sget-object v8, Lcom/j256/ormlite/table/TableUtils;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v8=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v9, "dropping index \'{}\' for table \'{}"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getTableName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9, v3, v10}, Lcom/j256/ormlite/logger/Logger;->info(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 296
a=0;//     const-string v8, "DROP INDEX "
a=0;// 
a=0;//     invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 297
a=0;//     invoke-interface {p0, v6, v3}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 298
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-interface {p2, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 299
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->setLength(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 301
a=0;//     .end local v3    # "indexName":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);v8=(Boolean);v9=(Conflicted);v10=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static addDropTableStatements(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Ljava/util/List;)V
a=0;//     .locals 8
a=0;//     .param p0, "databaseType"    # Lcom/j256/ormlite/db/DatabaseType;
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
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 417
a=0;//     .local p1, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     .local p2, "statements":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     new-instance v6, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 418
a=0;//     .local v6, "statementsBefore":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v5, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 419
a=0;//     .local v5, "statementsAfter":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypes()[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "arr$":[Lcom/j256/ormlite/field/FieldType;
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     array-length v3, v0
a=0;// 
a=0;//     .local v3, "len$":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i$":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Integer);
a=0;//     if-ge v2, v3, :cond_0
a=0;// 
a=0;//     aget-object v1, v0, v2
a=0;// 
a=0;//     .line 420
a=0;//     .local v1, "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v1=(Null);
a=0;//     invoke-interface {p0, v1, v6, v5}, Lcom/j256/ormlite/db/DatabaseType;->dropColumnArg(Lcom/j256/ormlite/field/FieldType;Ljava/util/List;Ljava/util/List;)V
a=0;// 
a=0;//     .line 419
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 422
a=0;//     .end local v1    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v7, 0x40
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 423
a=0;//     .local v4, "sb":Ljava/lang/StringBuilder;
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "DROP TABLE "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 424
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getTableName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-interface {p0, v4, v7}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 425
a=0;//     const/16 v7, 0x20
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 426
a=0;//     invoke-interface {p2, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 427
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 428
a=0;//     invoke-interface {p2, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 429
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static clearTable(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/DatabaseTableConfig;)I
a=0;//     .locals 1
a=0;//     .param p0, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Lcom/j256/ormlite/table/DatabaseTableConfig",
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
a=0;//     .line 213
a=0;//     .local p1, "tableConfig":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/table/DatabaseTableConfig;->getTableName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0}, Lcom/j256/ormlite/table/TableUtils;->clearTable(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static clearTable(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)I
a=0;//     .locals 2
a=0;//     .param p0, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Ljava/lang/Class",
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
a=0;//     .line 196
a=0;//     .local p1, "dataClass":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     invoke-static {p1}, Lcom/j256/ormlite/table/DatabaseTableConfig;->extractTableName(Ljava/lang/Class;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 197
a=0;//     .local v0, "tableName":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p0}, Lcom/j256/ormlite/support/ConnectionSource;->getDatabaseType()Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     invoke-interface {v1}, Lcom/j256/ormlite/db/DatabaseType;->isEntityNamesMustBeUpCase()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 198
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 200
a=0;//     :cond_0
a=0;//     invoke-static {p0, v0}, Lcom/j256/ormlite/table/TableUtils;->clearTable(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method private static clearTable(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/String;)I
a=0;//     .locals 7
a=0;//     .param p0, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .param p1, "tableName"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Ljava/lang/String;",
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
a=0;//     .line 240
a=0;//     invoke-interface {p0}, Lcom/j256/ormlite/support/ConnectionSource;->getDatabaseType()Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 241
a=0;//     .local v2, "databaseType":Lcom/j256/ormlite/db/DatabaseType;
a=0;//     #v2=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v5, 0x30
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 242
a=0;//     .local v3, "sb":Ljava/lang/StringBuilder;
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {v2}, Lcom/j256/ormlite/db/DatabaseType;->isTruncateSupported()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 243
a=0;//     const-string v5, "TRUNCATE TABLE "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 247
a=0;//     :goto_0
a=0;//     invoke-interface {v2, v3, p1}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 248
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 249
a=0;//     .local v4, "statement":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     sget-object v5, Lcom/j256/ormlite/table/TableUtils;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v6, "clearing table \'{}\' with \'{}"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6, p1, v4}, Lcom/j256/ormlite/logger/Logger;->info(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 250
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 251
a=0;//     .local v0, "compiledStmt":Lcom/j256/ormlite/support/CompiledStatement;
a=0;//     #v0=(Null);
a=0;//     invoke-interface {p0}, Lcom/j256/ormlite/support/ConnectionSource;->getReadWriteConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 253
a=0;//     .local v1, "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     sget-object v5, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->EXECUTE:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     sget-object v6, Lcom/j256/ormlite/table/TableUtils;->noFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     invoke-interface {v1, v4, v5, v6}, Lcom/j256/ormlite/support/DatabaseConnection;->compileStatement(Ljava/lang/String;Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;[Lcom/j256/ormlite/field/FieldType;)Lcom/j256/ormlite/support/CompiledStatement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 254
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/CompiledStatement;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/support/CompiledStatement;->runExecute()I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 256
a=0;//     #v5=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 257
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/support/CompiledStatement;->close()V
a=0;// 
a=0;//     .line 259
a=0;//     :cond_0
a=0;//     invoke-interface {p0, v1}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     return v5
a=0;// 
a=0;//     .line 245
a=0;//     .end local v0    # "compiledStmt":Lcom/j256/ormlite/support/CompiledStatement;
a=0;//     .end local v1    # "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .end local v4    # "statement":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v4=(Uninit);v5=(Boolean);v6=(Uninit);
a=0;//     const-string v5, "DELETE FROM "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 256
a=0;//     .restart local v0    # "compiledStmt":Lcom/j256/ormlite/support/CompiledStatement;
a=0;//     .restart local v1    # "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .restart local v4    # "statement":Ljava/lang/String;
a=0;//     :catchall_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/CompiledStatement;);v1=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);v4=(Reference,Ljava/lang/String;);v6=(Reference,Ljava/lang/Object;);
a=0;//     move-exception v5
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 257
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/support/CompiledStatement;->close()V
a=0;// 
a=0;//     .line 259
a=0;//     :cond_2
a=0;//     invoke-interface {p0, v1}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     throw v5
a=0;// .end method
a=0;// 
a=0;// .method public static createTable(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/DatabaseTableConfig;)I
a=0;//     .locals 1
a=0;//     .param p0, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Lcom/j256/ormlite/table/DatabaseTableConfig",
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
a=0;//     .line 76
a=0;//     .local p1, "tableConfig":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, p1, v0}, Lcom/j256/ormlite/table/TableUtils;->createTable(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/DatabaseTableConfig;Z)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private static createTable(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/DatabaseTableConfig;Z)I
a=0;//     .locals 4
a=0;//     .param p0, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .param p2, "ifNotExists"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             "ID:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Lcom/j256/ormlite/table/DatabaseTableConfig",
a=0;//             "<TT;>;Z)I"
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
a=0;//     .line 229
a=0;//     .local p1, "tableConfig":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     invoke-static {p0, p1}, Lcom/j256/ormlite/dao/DaoManager;->createDao(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/DatabaseTableConfig;)Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 230
a=0;//     .local v0, "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;TID;>;"
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     instance-of v2, v0, Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 231
a=0;//     check-cast v0, Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     .end local v0    # "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;TID;>;"
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->getTableInfo()Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-static {p0, v2, p2}, Lcom/j256/ormlite/table/TableUtils;->doCreateTable(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/TableInfo;Z)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 235
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Integer);v3=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 233
a=0;//     .restart local v0    # "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;TID;>;"
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Boolean);v3=(Uninit);
a=0;//     invoke-virtual {p1, p0}, Lcom/j256/ormlite/table/DatabaseTableConfig;->extractFieldTypes(Lcom/j256/ormlite/support/ConnectionSource;)V
a=0;// 
a=0;//     .line 234
a=0;//     new-instance v1, Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-interface {p0}, Lcom/j256/ormlite/support/ConnectionSource;->getDatabaseType()Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-direct {v1, v2, v3, p1}, Lcom/j256/ormlite/table/TableInfo;-><init>(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/dao/BaseDaoImpl;Lcom/j256/ormlite/table/DatabaseTableConfig;)V
a=0;// 
a=0;//     .line 235
a=0;//     .local v1, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     #v1=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-static {p0, v1, p2}, Lcom/j256/ormlite/table/TableUtils;->doCreateTable(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/TableInfo;Z)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static createTable(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)I
a=0;//     .locals 1
a=0;//     .param p0, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Ljava/lang/Class",
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
a=0;//     .line 53
a=0;//     .local p1, "dataClass":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, p1, v0}, Lcom/j256/ormlite/table/TableUtils;->createTable(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;Z)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private static createTable(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;Z)I
a=0;//     .locals 3
a=0;//     .param p0, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .param p2, "ifNotExists"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             "ID:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;Z)I"
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
a=0;//     .line 218
a=0;//     .local p1, "dataClass":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     invoke-static {p0, p1}, Lcom/j256/ormlite/dao/DaoManager;->createDao(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 219
a=0;//     .local v0, "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;TID;>;"
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     instance-of v2, v0, Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 220
a=0;//     check-cast v0, Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     .end local v0    # "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;TID;>;"
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->getTableInfo()Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-static {p0, v2, p2}, Lcom/j256/ormlite/table/TableUtils;->doCreateTable(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/TableInfo;Z)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 223
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Integer);
a=0;//     return v2
a=0;// 
a=0;//     .line 222
a=0;//     .restart local v0    # "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;TID;>;"
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Boolean);
a=0;//     new-instance v1, Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {v1, p0, v2, p1}, Lcom/j256/ormlite/table/TableInfo;-><init>(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/dao/BaseDaoImpl;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 223
a=0;//     .local v1, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     #v1=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-static {p0, v1, p2}, Lcom/j256/ormlite/table/TableUtils;->doCreateTable(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/TableInfo;Z)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static createTableIfNotExists(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/DatabaseTableConfig;)I
a=0;//     .locals 1
a=0;//     .param p0, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Lcom/j256/ormlite/table/DatabaseTableConfig",
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
a=0;//     .line 84
a=0;//     .local p1, "tableConfig":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {p0, p1, v0}, Lcom/j256/ormlite/table/TableUtils;->createTable(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/DatabaseTableConfig;Z)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static createTableIfNotExists(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)I
a=0;//     .locals 1
a=0;//     .param p0, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Ljava/lang/Class",
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
a=0;//     .line 61
a=0;//     .local p1, "dataClass":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {p0, p1, v0}, Lcom/j256/ormlite/table/TableUtils;->createTable(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;Z)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private static doCreateTable(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/TableInfo;Z)I
a=0;//     .locals 9
a=0;//     .param p0, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .param p2, "ifNotExists"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             "ID:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Lcom/j256/ormlite/table/TableInfo",
a=0;//             "<TT;TID;>;Z)I"
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
a=0;//     .line 433
a=0;//     .local p1, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     invoke-interface {p0}, Lcom/j256/ormlite/support/ConnectionSource;->getDatabaseType()Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 434
a=0;//     .local v6, "databaseType":Lcom/j256/ormlite/db/DatabaseType;
a=0;//     #v6=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     sget-object v1, Lcom/j256/ormlite/table/TableUtils;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v3, "creating table \'{}\'"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getTableName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3, v4}, Lcom/j256/ormlite/logger/Logger;->info(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 435
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 436
a=0;//     .local v2, "statements":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v7, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 437
a=0;//     .local v7, "queriesAfter":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     #v7=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-static {v6, p1, v2, v7, p2}, Lcom/j256/ormlite/table/TableUtils;->addCreateTableStatements(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Ljava/util/List;Ljava/util/List;Z)V
a=0;// 
a=0;//     .line 438
a=0;//     invoke-interface {p0}, Lcom/j256/ormlite/support/ConnectionSource;->getReadWriteConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 440
a=0;//     .local v0, "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     const-string v1, "create"
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-interface {v6}, Lcom/j256/ormlite/db/DatabaseType;->isCreateTableReturnsNegative()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     invoke-interface {v6}, Lcom/j256/ormlite/db/DatabaseType;->isCreateTableReturnsZero()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/j256/ormlite/table/TableUtils;->doStatements(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/String;Ljava/util/Collection;ZZZ)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 443
a=0;//     .local v8, "stmtC":I
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v0, v6, v7}, Lcom/j256/ormlite/table/TableUtils;->doCreateTestQueries(Lcom/j256/ormlite/support/DatabaseConnection;Lcom/j256/ormlite/db/DatabaseType;Ljava/util/List;)I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v8, v1
a=0;// 
a=0;//     .line 446
a=0;//     invoke-interface {p0, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     return v8
a=0;// 
a=0;//     .end local v8    # "stmtC":I
a=0;//     :catchall_0
a=0;//     #v1=(Reference,Ujava/lang/Object;);v3=(Reference,Ljava/lang/String;);v4=(Conflicted);v5=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-interface {p0, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method private static doCreateTestQueries(Lcom/j256/ormlite/support/DatabaseConnection;Lcom/j256/ormlite/db/DatabaseType;Ljava/util/List;)I
a=0;//     .locals 11
a=0;//     .param p0, "connection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p1, "databaseType"    # Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/DatabaseConnection;",
a=0;//             "Lcom/j256/ormlite/db/DatabaseType;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)I"
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
a=0;//     .line 487
a=0;//     .local p2, "queriesAfter":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 489
a=0;//     .local v7, "stmtC":I
a=0;//     #v7=(Null);
a=0;//     invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .local v2, "i$":Ljava/util/Iterator;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Integer);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_3
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Ljava/lang/String;
a=0;// 
a=0;//     .line 490
a=0;//     .local v4, "query":Ljava/lang/String;
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 492
a=0;//     .local v0, "compiledStmt":Lcom/j256/ormlite/support/CompiledStatement;
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     sget-object v8, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->SELECT:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v8=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     sget-object v9, Lcom/j256/ormlite/table/TableUtils;->noFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v9=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-interface {p0, v4, v8, v9}, Lcom/j256/ormlite/support/DatabaseConnection;->compileStatement(Ljava/lang/String;Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;[Lcom/j256/ormlite/field/FieldType;)Lcom/j256/ormlite/support/CompiledStatement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 494
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/CompiledStatement;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-interface {v0, v8}, Lcom/j256/ormlite/support/CompiledStatement;->runQuery(Lcom/j256/ormlite/dao/ObjectCache;)Lcom/j256/ormlite/support/DatabaseResults;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 495
a=0;//     .local v5, "results":Lcom/j256/ormlite/support/DatabaseResults;
a=0;//     #v5=(Reference,Lcom/j256/ormlite/support/DatabaseResults;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 497
a=0;//     .local v6, "rowC":I
a=0;//     #v6=(Null);
a=0;//     invoke-interface {v5}, Lcom/j256/ormlite/support/DatabaseResults;->first()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .local v3, "isThereMore":Z
a=0;//     :goto_1
a=0;//     #v3=(Boolean);v6=(Integer);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 498
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     .line 497
a=0;//     invoke-interface {v5}, Lcom/j256/ormlite/support/DatabaseResults;->next()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 500
a=0;//     :cond_0
a=0;//     sget-object v8, Lcom/j256/ormlite/table/TableUtils;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v8=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v9, "executing create table after-query got {} results: {}"
a=0;// 
a=0;//     invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v8, v9, v10, v4}, Lcom/j256/ormlite/logger/Logger;->info(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 506
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 507
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/support/CompiledStatement;->close()V
a=0;// 
a=0;//     .line 510
a=0;//     :cond_1
a=0;//     add-int/lit8 v7, v7, 0x1
a=0;// 
a=0;//     .line 511
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 501
a=0;//     .end local v3    # "isThereMore":Z
a=0;//     .end local v5    # "results":Lcom/j256/ormlite/support/DatabaseResults;
a=0;//     .end local v6    # "rowC":I
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 503
a=0;//     .local v1, "e":Ljava/sql/SQLException;
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "executing create table after-query failed: "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8, v1}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     throw v8
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 506
a=0;//     .end local v1    # "e":Ljava/sql/SQLException;
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 507
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/support/CompiledStatement;->close()V
a=0;// 
a=0;//     :cond_2
a=0;//     throw v8
a=0;// 
a=0;//     .line 512
a=0;//     .end local v0    # "compiledStmt":Lcom/j256/ormlite/support/CompiledStatement;
a=0;//     .end local v4    # "query":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Uninit);v4=(Conflicted);v8=(Boolean);
a=0;//     return v7
a=0;// .end method
a=0;// 
a=0;// .method private static doDropTable(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/TableInfo;Z)I
a=0;//     .locals 6
a=0;//     .param p0, "databaseType"    # Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .param p1, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .param p3, "ignoreErrors"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             "ID:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/db/DatabaseType;",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Lcom/j256/ormlite/table/TableInfo",
a=0;//             "<TT;TID;>;Z)I"
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
a=0;//     .line 265
a=0;//     .local p2, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     sget-object v1, Lcom/j256/ormlite/table/TableUtils;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v3, "dropping table \'{}\'"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2}, Lcom/j256/ormlite/table/TableInfo;->getTableName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3, v4}, Lcom/j256/ormlite/logger/Logger;->info(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 266
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 267
a=0;//     .local v2, "statements":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-static {p0, p2, v2}, Lcom/j256/ormlite/table/TableUtils;->addDropIndexStatements(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Ljava/util/List;)V
a=0;// 
a=0;//     .line 268
a=0;//     invoke-static {p0, p2, v2}, Lcom/j256/ormlite/table/TableUtils;->addDropTableStatements(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Ljava/util/List;)V
a=0;// 
a=0;//     .line 269
a=0;//     invoke-interface {p1}, Lcom/j256/ormlite/support/ConnectionSource;->getReadWriteConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 271
a=0;//     .local v0, "connection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     const-string v1, "drop"
a=0;// 
a=0;//     invoke-interface {p0}, Lcom/j256/ormlite/db/DatabaseType;->isCreateTableReturnsNegative()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move v3, p3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/j256/ormlite/table/TableUtils;->doStatements(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/String;Ljava/util/Collection;ZZZ)I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 274
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {p1, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     return v1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Reference,Ujava/lang/Object;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-interface {p1, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method private static doStatements(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/String;Ljava/util/Collection;ZZZ)I
a=0;//     .locals 9
a=0;//     .param p0, "connection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p1, "label"    # Ljava/lang/String;
a=0;//     .param p3, "ignoreErrors"    # Z
a=0;//     .param p4, "returnsNegative"    # Z
a=0;//     .param p5, "expectingZero"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/DatabaseConnection;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/Collection",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;ZZZ)I"
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
a=0;//     .line 452
a=0;//     .local p2, "statements":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 453
a=0;//     .local v5, "stmtC":I
a=0;//     #v5=(Null);
a=0;//     invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .local v2, "i$":Ljava/util/Iterator;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);v4=(Conflicted);v5=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_5
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Ljava/lang/String;
a=0;// 
a=0;//     .line 454
a=0;//     .local v4, "statement":Ljava/lang/String;
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 455
a=0;//     .local v3, "rowC":I
a=0;//     #v3=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 457
a=0;//     .local v0, "compiledStmt":Lcom/j256/ormlite/support/CompiledStatement;
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     sget-object v6, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->EXECUTE:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;
a=0;// 
a=0;//     #v6=(Reference,Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;);
a=0;//     sget-object v7, Lcom/j256/ormlite/table/TableUtils;->noFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v7=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-interface {p0, v4, v6, v7}, Lcom/j256/ormlite/support/DatabaseConnection;->compileStatement(Ljava/lang/String;Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;[Lcom/j256/ormlite/field/FieldType;)Lcom/j256/ormlite/support/CompiledStatement;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 458
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/CompiledStatement;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/support/CompiledStatement;->runExecute()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 459
a=0;//     #v3=(Integer);
a=0;//     sget-object v6, Lcom/j256/ormlite/table/TableUtils;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v7, "executed {} table statement changed {} rows: {}"
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v6, v7, p1, v8, v4}, Lcom/j256/ormlite/logger/Logger;->info(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 467
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 468
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/support/CompiledStatement;->close()V
a=0;// 
a=0;//     .line 472
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v8=(Conflicted);
a=0;//     if-gez v3, :cond_3
a=0;// 
a=0;//     .line 473
a=0;//     if-nez p4, :cond_4
a=0;// 
a=0;//     .line 474
a=0;//     new-instance v6, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "SQL statement "
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, " updated "
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, " rows, we were expecting >= 0"
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v6
a=0;// 
a=0;//     .line 460
a=0;//     :catch_0
a=0;//     #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 461
a=0;//     .local v1, "e":Ljava/sql/SQLException;
a=0;//     #v1=(Reference,Ljava/sql/SQLException;);
a=0;//     if-eqz p3, :cond_1
a=0;// 
a=0;//     .line 462
a=0;//     :try_start_1
a=0;//     sget-object v6, Lcom/j256/ormlite/table/TableUtils;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v6=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v7, "ignoring {} error \'{}\' for statement: {}"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7, p1, v1, v4}, Lcom/j256/ormlite/logger/Logger;->info(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 467
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 468
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/support/CompiledStatement;->close()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 464
a=0;//     :cond_1
a=0;//     :try_start_2
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "SQL statement failed: "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6, v1}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     throw v6
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 467
a=0;//     .end local v1    # "e":Ljava/sql/SQLException;
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 468
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/support/CompiledStatement;->close()V
a=0;// 
a=0;//     :cond_2
a=0;//     throw v6
a=0;// 
a=0;//     .line 477
a=0;//     :cond_3
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     if-lez v3, :cond_4
a=0;// 
a=0;//     if-eqz p5, :cond_4
a=0;// 
a=0;//     .line 478
a=0;//     new-instance v6, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "SQL statement updated "
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, " rows, we were expecting == 0: "
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v6
a=0;// 
a=0;//     .line 480
a=0;//     :cond_4
a=0;//     #v8=(Conflicted);
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     .line 481
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 482
a=0;//     .end local v0    # "compiledStmt":Lcom/j256/ormlite/support/CompiledStatement;
a=0;//     .end local v3    # "rowC":I
a=0;//     .end local v4    # "statement":Ljava/lang/String;
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Boolean);v7=(Conflicted);
a=0;//     return v5
a=0;// .end method
a=0;// 
a=0;// .method public static dropTable(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/DatabaseTableConfig;Z)I
a=0;//     .locals 4
a=0;//     .param p0, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .param p2, "ignoreErrors"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             "ID:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Lcom/j256/ormlite/table/DatabaseTableConfig",
a=0;//             "<TT;>;Z)I"
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
a=0;//     .line 176
a=0;//     .local p1, "tableConfig":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     invoke-interface {p0}, Lcom/j256/ormlite/support/ConnectionSource;->getDatabaseType()Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 177
a=0;//     .local v1, "databaseType":Lcom/j256/ormlite/db/DatabaseType;
a=0;//     #v1=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     invoke-static {p0, p1}, Lcom/j256/ormlite/dao/DaoManager;->createDao(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/DatabaseTableConfig;)Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 178
a=0;//     .local v0, "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;TID;>;"
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     instance-of v3, v0, Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 179
a=0;//     check-cast v0, Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     .end local v0    # "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;TID;>;"
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->getTableInfo()Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-static {v1, p0, v3, p2}, Lcom/j256/ormlite/table/TableUtils;->doDropTable(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/TableInfo;Z)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 183
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Integer);
a=0;//     return v3
a=0;// 
a=0;//     .line 181
a=0;//     .restart local v0    # "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;TID;>;"
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Boolean);
a=0;//     invoke-virtual {p1, p0}, Lcom/j256/ormlite/table/DatabaseTableConfig;->extractFieldTypes(Lcom/j256/ormlite/support/ConnectionSource;)V
a=0;// 
a=0;//     .line 182
a=0;//     new-instance v2, Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-direct {v2, v1, v3, p1}, Lcom/j256/ormlite/table/TableInfo;-><init>(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/dao/BaseDaoImpl;Lcom/j256/ormlite/table/DatabaseTableConfig;)V
a=0;// 
a=0;//     .line 183
a=0;//     .local v2, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     #v2=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-static {v1, p0, v2, p2}, Lcom/j256/ormlite/table/TableUtils;->doDropTable(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/TableInfo;Z)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static dropTable(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;Z)I
a=0;//     .locals 4
a=0;//     .param p0, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .param p2, "ignoreErrors"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             "ID:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;Z)I"
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
a=0;//     .line 148
a=0;//     .local p1, "dataClass":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     invoke-interface {p0}, Lcom/j256/ormlite/support/ConnectionSource;->getDatabaseType()Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 149
a=0;//     .local v1, "databaseType":Lcom/j256/ormlite/db/DatabaseType;
a=0;//     #v1=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     invoke-static {p0, p1}, Lcom/j256/ormlite/dao/DaoManager;->createDao(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 150
a=0;//     .local v0, "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;TID;>;"
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     instance-of v3, v0, Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 151
a=0;//     check-cast v0, Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     .end local v0    # "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;TID;>;"
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->getTableInfo()Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-static {v1, p0, v3, p2}, Lcom/j256/ormlite/table/TableUtils;->doDropTable(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/TableInfo;Z)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 154
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Integer);
a=0;//     return v3
a=0;// 
a=0;//     .line 153
a=0;//     .restart local v0    # "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;TID;>;"
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Boolean);
a=0;//     new-instance v2, Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-direct {v2, p0, v3, p1}, Lcom/j256/ormlite/table/TableInfo;-><init>(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/dao/BaseDaoImpl;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 154
a=0;//     .local v2, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     #v2=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-static {v1, p0, v2, p2}, Lcom/j256/ormlite/table/TableUtils;->doDropTable(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/TableInfo;Z)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getCreateTableStatements(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/DatabaseTableConfig;)Ljava/util/List;
a=0;//     .locals 5
a=0;//     .param p0, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             "ID:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Lcom/j256/ormlite/table/DatabaseTableConfig",
a=0;//             "<TT;>;)",
a=0;//             "Ljava/util/List",
a=0;//             "<",
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
a=0;//     .local p1, "tableConfig":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 121
a=0;//     #v4=(Null);
a=0;//     invoke-static {p0, p1}, Lcom/j256/ormlite/dao/DaoManager;->createDao(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/DatabaseTableConfig;)Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 122
a=0;//     .local v0, "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;TID;>;"
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     instance-of v2, v0, Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 123
a=0;//     check-cast v0, Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     .end local v0    # "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;TID;>;"
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->getTableInfo()Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-static {p0, v2, v4}, Lcom/j256/ormlite/table/TableUtils;->addCreateTableStatements(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/TableInfo;Z)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 127
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 125
a=0;//     .restart local v0    # "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;TID;>;"
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Boolean);v3=(Uninit);
a=0;//     invoke-virtual {p1, p0}, Lcom/j256/ormlite/table/DatabaseTableConfig;->extractFieldTypes(Lcom/j256/ormlite/support/ConnectionSource;)V
a=0;// 
a=0;//     .line 126
a=0;//     new-instance v1, Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-interface {p0}, Lcom/j256/ormlite/support/ConnectionSource;->getDatabaseType()Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-direct {v1, v2, v3, p1}, Lcom/j256/ormlite/table/TableInfo;-><init>(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/dao/BaseDaoImpl;Lcom/j256/ormlite/table/DatabaseTableConfig;)V
a=0;// 
a=0;//     .line 127
a=0;//     .local v1, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     #v1=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-static {p0, v1, v4}, Lcom/j256/ormlite/table/TableUtils;->addCreateTableStatements(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/TableInfo;Z)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getCreateTableStatements(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)Ljava/util/List;
a=0;//     .locals 4
a=0;//     .param p0, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             "ID:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;)",
a=0;//             "Ljava/util/List",
a=0;//             "<",
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
a=0;//     .local p1, "dataClass":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 99
a=0;//     #v3=(Null);
a=0;//     invoke-static {p0, p1}, Lcom/j256/ormlite/dao/DaoManager;->createDao(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 100
a=0;//     .local v0, "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;TID;>;"
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     instance-of v2, v0, Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 101
a=0;//     check-cast v0, Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     .end local v0    # "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;TID;>;"
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/dao/BaseDaoImpl;->getTableInfo()Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-static {p0, v2, v3}, Lcom/j256/ormlite/table/TableUtils;->addCreateTableStatements(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/TableInfo;Z)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 104
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 103
a=0;//     .restart local v0    # "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;TID;>;"
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Boolean);
a=0;//     new-instance v1, Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {v1, p0, v2, p1}, Lcom/j256/ormlite/table/TableInfo;-><init>(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/dao/BaseDaoImpl;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 104
a=0;//     .local v1, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     #v1=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-static {p0, v1, v3}, Lcom/j256/ormlite/table/TableUtils;->addCreateTableStatements(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/TableInfo;Z)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     goto :goto_0
a=0;// .end method
}}
