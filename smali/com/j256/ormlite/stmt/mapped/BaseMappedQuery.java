package com.j256.ormlite.stmt.mapped; class BaseMappedQuery { void a() { int a;
a=0;// .class public abstract Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;
a=0;// .super Lcom/j256/ormlite/stmt/mapped/BaseMappedStatement;
a=0;// .source "BaseMappedQuery.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/j256/ormlite/stmt/GenericRowMapper;
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
a=0;//         "Lcom/j256/ormlite/stmt/mapped/BaseMappedStatement",
a=0;//         "<TT;TID;>;",
a=0;//         "Lcom/j256/ormlite/stmt/GenericRowMapper",
a=0;//         "<TT;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private columnPositions:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Integer;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private parent:Ljava/lang/Object;
a=0;// 
a=0;// .field private parentId:Ljava/lang/Object;
a=0;// 
a=0;// .field protected final resultsFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method protected constructor <init>(Lcom/j256/ormlite/table/TableInfo;Ljava/lang/String;[Lcom/j256/ormlite/field/FieldType;[Lcom/j256/ormlite/field/FieldType;)V
a=0;//     .locals 1
a=0;//     .param p2, "statement"    # Ljava/lang/String;
a=0;//     .param p3, "argFieldTypes"    # [Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p4, "resultsFieldTypes"    # [Lcom/j256/ormlite/field/FieldType;
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
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;, "Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery<TT;TID;>;"
a=0;//     .local p1, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 29
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/j256/ormlite/stmt/mapped/BaseMappedStatement;-><init>(Lcom/j256/ormlite/table/TableInfo;Ljava/lang/String;[Lcom/j256/ormlite/field/FieldType;)V
a=0;// 
a=0;//     .line 23
a=0;//     #p0=(Reference,Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->columnPositions:Ljava/util/Map;
a=0;// 
a=0;//     .line 24
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->parent:Ljava/lang/Object;
a=0;// 
a=0;//     .line 25
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->parentId:Ljava/lang/Object;
a=0;// 
a=0;//     .line 30
a=0;//     iput-object p4, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->resultsFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .line 31
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public mapRow(Lcom/j256/ormlite/support/DatabaseResults;)Ljava/lang/Object;
a=0;//     .locals 14
a=0;//     .param p1, "results"    # Lcom/j256/ormlite/support/DatabaseResults;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/DatabaseResults;",
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
a=0;//     .line 35
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;, "Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery<TT;TID;>;"
a=0;//     iget-object v12, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->columnPositions:Ljava/util/Map;
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/Map;);
a=0;//     if-nez v12, :cond_0
a=0;// 
a=0;//     .line 36
a=0;//     new-instance v2, Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 41
a=0;//     .local v2, "colPosMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ujava/lang/Object;);
a=0;//     invoke-interface {p1}, Lcom/j256/ormlite/support/DatabaseResults;->getObjectCache()Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 42
a=0;//     .local v10, "objectCache":Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     #v10=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     if-eqz v10, :cond_1
a=0;// 
a=0;//     .line 43
a=0;//     iget-object v12, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->idField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     invoke-virtual {v12, p1, v2}, Lcom/j256/ormlite/field/FieldType;->resultToJava(Lcom/j256/ormlite/support/DatabaseResults;Ljava/util/Map;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 44
a=0;//     .local v7, "id":Ljava/lang/Object;
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v12, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->clazz:Ljava/lang/Class;
a=0;// 
a=0;//     invoke-interface {v10, v12, v7}, Lcom/j256/ormlite/dao/ObjectCache;->get(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 45
a=0;//     .local v1, "cachedInstance":Ljava/lang/Object;, "TT;"
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 96
a=0;//     .end local v1    # "cachedInstance":Ljava/lang/Object;, "TT;"
a=0;//     .end local v7    # "id":Ljava/lang/Object;
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);v11=(Conflicted);v13=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 38
a=0;//     .end local v2    # "colPosMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
a=0;//     .end local v10    # "objectCache":Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v13=(Uninit);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->columnPositions:Ljava/util/Map;
a=0;// 
a=0;//     .restart local v2    # "colPosMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
a=0;//     #v2=(Reference,Ljava/util/Map;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 52
a=0;//     .restart local v10    # "objectCache":Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v7=(Conflicted);v10=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     iget-object v12, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     invoke-virtual {v12}, Lcom/j256/ormlite/table/TableInfo;->createObject()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 54
a=0;//     .local v8, "instance":Ljava/lang/Object;, "TT;"
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 55
a=0;//     .restart local v7    # "id":Ljava/lang/Object;
a=0;//     #v7=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 56
a=0;//     .local v5, "foreignCollections":Z
a=0;//     #v5=(Null);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->resultsFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .local v0, "arr$":[Lcom/j256/ormlite/field/FieldType;
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     array-length v9, v0
a=0;// 
a=0;//     .local v9, "len$":I
a=0;//     #v9=(Integer);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .end local v7    # "id":Ljava/lang/Object;
a=0;//     .local v6, "i$":I
a=0;//     :goto_2
a=0;//     #v4=(Conflicted);v5=(Boolean);v6=(Integer);v7=(Reference,Ljava/lang/Object;);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     if-ge v6, v9, :cond_5
a=0;// 
a=0;//     aget-object v4, v0, v6
a=0;// 
a=0;//     .line 57
a=0;//     .local v4, "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v4}, Lcom/j256/ormlite/field/FieldType;->isForeignCollection()Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_3
a=0;// 
a=0;//     .line 58
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 56
a=0;//     :cond_2
a=0;//     :goto_3
a=0;//     #v12=(Conflicted);
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 60
a=0;//     :cond_3
a=0;//     #v12=(Boolean);
a=0;//     invoke-virtual {v4, p1, v2}, Lcom/j256/ormlite/field/FieldType;->resultToJava(Lcom/j256/ormlite/support/DatabaseResults;Ljava/util/Map;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 67
a=0;//     .local v11, "val":Ljava/lang/Object;
a=0;//     #v11=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v11, :cond_4
a=0;// 
a=0;//     iget-object v12, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->parent:Ljava/lang/Object;
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v12, :cond_4
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/j256/ormlite/field/FieldType;->getField()Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     iget-object v13, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->parent:Ljava/lang/Object;
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     if-ne v12, v13, :cond_4
a=0;// 
a=0;//     iget-object v12, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->parentId:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_4
a=0;// 
a=0;//     .line 69
a=0;//     iget-object v12, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->parent:Ljava/lang/Object;
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v13, 0x1
a=0;// 
a=0;//     #v13=(One);
a=0;//     invoke-virtual {v4, v8, v12, v13, v10}, Lcom/j256/ormlite/field/FieldType;->assignField(Ljava/lang/Object;Ljava/lang/Object;ZLcom/j256/ormlite/dao/ObjectCache;)V
a=0;// 
a=0;//     .line 73
a=0;//     :goto_4
a=0;//     #v13=(Conflicted);
a=0;//     iget-object v12, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->idField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     if-ne v4, v12, :cond_2
a=0;// 
a=0;//     .line 74
a=0;//     move-object v7, v11
a=0;// 
a=0;//     .restart local v7    # "id":Ljava/lang/Object;
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 71
a=0;//     .end local v7    # "id":Ljava/lang/Object;
a=0;//     :cond_4
a=0;//     #v12=(Conflicted);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     invoke-virtual {v4, v8, v11, v12, v10}, Lcom/j256/ormlite/field/FieldType;->assignField(Ljava/lang/Object;Ljava/lang/Object;ZLcom/j256/ormlite/dao/ObjectCache;)V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 78
a=0;//     .end local v4    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     .end local v11    # "val":Ljava/lang/Object;
a=0;//     :cond_5
a=0;//     #v4=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     if-eqz v5, :cond_7
a=0;// 
a=0;//     .line 80
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->resultsFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     array-length v9, v0
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     :goto_5
a=0;//     #v3=(Conflicted);
a=0;//     if-ge v6, v9, :cond_7
a=0;// 
a=0;//     aget-object v4, v0, v6
a=0;// 
a=0;//     .line 81
a=0;//     .restart local v4    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v4}, Lcom/j256/ormlite/field/FieldType;->isForeignCollection()Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_6
a=0;// 
a=0;//     .line 82
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     invoke-virtual {v4, v8, v7, v12}, Lcom/j256/ormlite/field/FieldType;->buildForeignCollection(Ljava/lang/Object;Ljava/lang/Object;Z)Lcom/j256/ormlite/dao/BaseForeignCollection;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 83
a=0;//     .local v3, "collection":Lcom/j256/ormlite/dao/BaseForeignCollection;, "Lcom/j256/ormlite/dao/BaseForeignCollection<**>;"
a=0;//     #v3=(Reference,Lcom/j256/ormlite/dao/BaseForeignCollection;);
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     .line 84
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     invoke-virtual {v4, v8, v3, v12, v10}, Lcom/j256/ormlite/field/FieldType;->assignField(Ljava/lang/Object;Ljava/lang/Object;ZLcom/j256/ormlite/dao/ObjectCache;)V
a=0;// 
a=0;//     .line 80
a=0;//     .end local v3    # "collection":Lcom/j256/ormlite/dao/BaseForeignCollection;, "Lcom/j256/ormlite/dao/BaseForeignCollection<**>;"
a=0;//     :cond_6
a=0;//     #v3=(Conflicted);v12=(Boolean);
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 90
a=0;//     .end local v4    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_7
a=0;//     #v4=(Conflicted);v12=(Conflicted);
a=0;//     if-eqz v10, :cond_8
a=0;// 
a=0;//     if-eqz v7, :cond_8
a=0;// 
a=0;//     .line 91
a=0;//     iget-object v12, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->clazz:Ljava/lang/Class;
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/Class;);
a=0;//     invoke-interface {v10, v12, v7, v8}, Lcom/j256/ormlite/dao/ObjectCache;->put(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 93
a=0;//     :cond_8
a=0;//     #v12=(Conflicted);
a=0;//     iget-object v12, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->columnPositions:Ljava/util/Map;
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/Map;);
a=0;//     if-nez v12, :cond_9
a=0;// 
a=0;//     .line 94
a=0;//     iput-object v2, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->columnPositions:Ljava/util/Map;
a=0;// 
a=0;//     :cond_9
a=0;//     move-object v1, v8
a=0;// 
a=0;//     .line 96
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public setParentInformation(Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;//     .param p1, "parent"    # Ljava/lang/Object;
a=0;//     .param p2, "parentId"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;, "Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery<TT;TID;>;"
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->parent:Ljava/lang/Object;
a=0;// 
a=0;//     .line 104
a=0;//     iput-object p2, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->parentId:Ljava/lang/Object;
a=0;// 
a=0;//     .line 105
a=0;//     return-void
a=0;// .end method
}}
