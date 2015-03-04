package com.j256.ormlite.stmt.mapped; class MappedDeleteCollection { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection;
a=0;// .super Lcom/j256/ormlite/stmt/mapped/BaseMappedStatement;
a=0;// .source "MappedDeleteCollection.java"
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
a=0;//         "<TT;TID;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/j256/ormlite/table/TableInfo;Ljava/lang/String;[Lcom/j256/ormlite/field/FieldType;)V
a=0;//     .locals 0
a=0;//     .param p2, "statement"    # Ljava/lang/String;
a=0;//     .param p3, "argFieldTypes"    # [Lcom/j256/ormlite/field/FieldType;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/table/TableInfo",
a=0;//             "<TT;TID;>;",
a=0;//             "Ljava/lang/String;",
a=0;//             "[",
a=0;//             "Lcom/j256/ormlite/field/FieldType;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection;, "Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection<TT;TID;>;"
a=0;//     .local p1, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/j256/ormlite/stmt/mapped/BaseMappedStatement;-><init>(Lcom/j256/ormlite/table/TableInfo;Ljava/lang/String;[Lcom/j256/ormlite/field/FieldType;)V
a=0;// 
a=0;//     .line 22
a=0;//     #p0=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static appendWhereIds(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/field/FieldType;Ljava/lang/StringBuilder;I[Lcom/j256/ormlite/field/FieldType;)V
a=0;//     .locals 3
a=0;//     .param p0, "databaseType"    # Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .param p1, "idField"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p2, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p3, "numDatas"    # I
a=0;//     .param p4, "fieldTypes"    # [Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     const-string v2, "WHERE "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 101
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/FieldType;->getColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {p0, p2, v2}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 102
a=0;//     const-string v2, " IN ("
a=0;// 
a=0;//     invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 103
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 104
a=0;//     .local v0, "first":Z
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Integer);v2=(Conflicted);
a=0;//     if-ge v1, p3, :cond_2
a=0;// 
a=0;//     .line 105
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 106
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 110
a=0;//     :goto_1
a=0;//     const/16 v2, 0x3f
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 111
a=0;//     if-eqz p4, :cond_0
a=0;// 
a=0;//     .line 112
a=0;//     aput-object p1, p4, v1
a=0;// 
a=0;//     .line 104
a=0;//     :cond_0
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 108
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     const/16 v2, 0x2c
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 115
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, ") "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 116
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static build(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;I)Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection;
a=0;//     .locals 6
a=0;//     .param p0, "databaseType"    # Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .param p2, "dataSize"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             "ID:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/db/DatabaseType;",
a=0;//             "Lcom/j256/ormlite/table/TableInfo",
a=0;//             "<TT;TID;>;I)",
a=0;//             "Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection",
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
a=0;//     .line 65
a=0;//     .local p1, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getIdField()Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 66
a=0;//     .local v1, "idField":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 67
a=0;//     new-instance v3, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "Cannot delete "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getDataClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, " because it doesn\'t have an id field defined"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v3
a=0;// 
a=0;//     .line 70
a=0;//     :cond_0
a=0;//     #v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v3, 0x80
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 71
a=0;//     .local v2, "sb":Ljava/lang/StringBuilder;
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "DELETE FROM "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getTableName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v2, v3, v4}, Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection;->appendTableName(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 72
a=0;//     new-array v0, p2, [Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .line 73
a=0;//     .local v0, "argFieldTypes":[Lcom/j256/ormlite/field/FieldType;
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-static {p0, v1, v2, p2, v0}, Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection;->appendWhereIds(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/field/FieldType;Ljava/lang/StringBuilder;I[Lcom/j256/ormlite/field/FieldType;)V
a=0;// 
a=0;//     .line 74
a=0;//     new-instance v3, Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection;);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, p1, v4, v0}, Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection;-><init>(Lcom/j256/ormlite/table/TableInfo;Ljava/lang/String;[Lcom/j256/ormlite/field/FieldType;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection;);
a=0;//     return-object v3
a=0;// .end method
a=0;// 
a=0;// .method public static deleteIds(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Lcom/j256/ormlite/support/DatabaseConnection;Ljava/util/Collection;Lcom/j256/ormlite/dao/ObjectCache;)I
a=0;//     .locals 7
a=0;//     .param p0, "databaseType"    # Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .param p2, "databaseConnection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p4, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
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
a=0;//             "Lcom/j256/ormlite/support/DatabaseConnection;",
a=0;//             "Ljava/util/Collection",
a=0;//             "<TID;>;",
a=0;//             "Lcom/j256/ormlite/dao/ObjectCache;",
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
a=0;//     .line 48
a=0;//     .local p1, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     .local p3, "ids":Ljava/util/Collection;, "Ljava/util/Collection<TID;>;"
a=0;//     invoke-interface {p3}, Ljava/util/Collection;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {p0, p1, v6}, Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection;->build(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;I)Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 50
a=0;//     .local v0, "deleteCollection":Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection;, "Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection<TT;TID;>;"
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection;);
a=0;//     invoke-interface {p3}, Ljava/util/Collection;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     new-array v1, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 51
a=0;//     .local v1, "fieldObjects":[Ljava/lang/Object;
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getIdField()Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 52
a=0;//     .local v4, "idField":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v4=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 53
a=0;//     .local v5, "objC":I
a=0;//     #v5=(Null);
a=0;//     invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .local v2, "i$":Ljava/util/Iterator;
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);v5=(Integer);v6=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 54
a=0;//     .local v3, "id":Ljava/lang/Object;, "TID;"
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v4, v3}, Lcom/j256/ormlite/field/FieldType;->convertJavaFieldToSqlArgValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     aput-object v6, v1, v5
a=0;// 
a=0;//     .line 55
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 57
a=0;//     .end local v3    # "id":Ljava/lang/Object;, "TID;"
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v6=(Boolean);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getDataClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {p2, v6, v0, v1, p4}, Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection;->updateRows(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Class;Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection;[Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     return v6
a=0;// .end method
a=0;// 
a=0;// .method public static deleteObjects(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Lcom/j256/ormlite/support/DatabaseConnection;Ljava/util/Collection;Lcom/j256/ormlite/dao/ObjectCache;)I
a=0;//     .locals 7
a=0;//     .param p0, "databaseType"    # Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .param p2, "databaseConnection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p4, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
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
a=0;//             "Lcom/j256/ormlite/support/DatabaseConnection;",
a=0;//             "Ljava/util/Collection",
a=0;//             "<TT;>;",
a=0;//             "Lcom/j256/ormlite/dao/ObjectCache;",
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
a=0;//     .line 30
a=0;//     .local p1, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     .local p3, "datas":Ljava/util/Collection;, "Ljava/util/Collection<TT;>;"
a=0;//     invoke-interface {p3}, Ljava/util/Collection;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {p0, p1, v6}, Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection;->build(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;I)Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 32
a=0;//     .local v1, "deleteCollection":Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection;, "Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection<TT;TID;>;"
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection;);
a=0;//     invoke-interface {p3}, Ljava/util/Collection;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     new-array v2, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 33
a=0;//     .local v2, "fieldObjects":[Ljava/lang/Object;
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getIdField()Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 34
a=0;//     .local v4, "idField":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v4=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 35
a=0;//     .local v5, "objC":I
a=0;//     #v5=(Null);
a=0;//     invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .local v3, "i$":Ljava/util/Iterator;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Reference,Ljava/util/Iterator;);v5=(Integer);v6=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 36
a=0;//     .local v0, "data":Ljava/lang/Object;, "TT;"
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v4, v0}, Lcom/j256/ormlite/field/FieldType;->extractJavaFieldToSqlArgValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     aput-object v6, v2, v5
a=0;// 
a=0;//     .line 37
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 39
a=0;//     .end local v0    # "data":Ljava/lang/Object;, "TT;"
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v6=(Boolean);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getDataClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {p2, v6, v1, v2, p4}, Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection;->updateRows(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Class;Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection;[Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     return v6
a=0;// .end method
a=0;// 
a=0;// .method private static updateRows(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Class;Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection;[Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)I
a=0;//     .locals 11
a=0;//     .param p0, "databaseConnection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p3, "args"    # [Ljava/lang/Object;
a=0;//     .param p4, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             "ID:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/support/DatabaseConnection;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;",
a=0;//             "Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection",
a=0;//             "<TT;TID;>;[",
a=0;//             "Ljava/lang/Object;",
a=0;//             "Lcom/j256/ormlite/dao/ObjectCache;",
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
a=0;//     .line 80
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     .local p2, "deleteCollection":Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection;, "Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection<TT;TID;>;"
a=0;//     :try_start_0
a=0;//     iget-object v6, p2, Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection;->statement:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     iget-object v7, p2, Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection;->argFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v7=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-interface {p0, v6, p3, v7}, Lcom/j256/ormlite/support/DatabaseConnection;->delete(Ljava/lang/String;[Ljava/lang/Object;[Lcom/j256/ormlite/field/FieldType;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 81
a=0;//     .local v5, "rowC":I
a=0;//     #v5=(Integer);
a=0;//     if-lez v5, :cond_0
a=0;// 
a=0;//     if-eqz p4, :cond_0
a=0;// 
a=0;//     .line 82
a=0;//     move-object v0, p3
a=0;// 
a=0;//     .local v0, "arr$":[Ljava/lang/Object;
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     array-length v4, v0
a=0;// 
a=0;//     .local v4, "len$":I
a=0;//     #v4=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i$":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);v3=(Conflicted);
a=0;//     if-ge v2, v4, :cond_0
a=0;// 
a=0;//     aget-object v3, v0, v2
a=0;// 
a=0;//     .line 83
a=0;//     .local v3, "id":Ljava/lang/Object;
a=0;//     #v3=(Null);
a=0;//     invoke-interface {p4, p1, v3}, Lcom/j256/ormlite/dao/ObjectCache;->remove(Ljava/lang/Class;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 82
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 86
a=0;//     .end local v0    # "arr$":[Ljava/lang/Object;
a=0;//     .end local v2    # "i$":I
a=0;//     .end local v3    # "id":Ljava/lang/Object;
a=0;//     .end local v4    # "len$":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     sget-object v6, Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v7, "delete-collection with statement \'{}\' and {} args, changed {} rows"
a=0;// 
a=0;//     iget-object v8, p2, Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection;->statement:Ljava/lang/String;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     array-length v9, p3
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v6, v7, v8, v9, v10}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 88
a=0;//     array-length v6, p3
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lez v6, :cond_1
a=0;// 
a=0;//     .line 90
a=0;//     sget-object v6, Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v6=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v7, "delete-collection arguments: {}"
a=0;// 
a=0;//     invoke-virtual {v6, v7, p3}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 92
a=0;//     :cond_1
a=0;//     #v6=(Conflicted);
a=0;//     return v5
a=0;// 
a=0;//     .line 93
a=0;//     .end local v5    # "rowC":I
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 94
a=0;//     .local v1, "e":Ljava/sql/SQLException;
a=0;//     #v1=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "Unable to run delete collection stmt: "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v7, p2, Lcom/j256/ormlite/stmt/mapped/MappedDeleteCollection;->statement:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
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
a=0;// .end method
}}
