package com.j256.ormlite.stmt.mapped; class MappedUpdate { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/stmt/mapped/MappedUpdate;
a=0;// .super Lcom/j256/ormlite/stmt/mapped/BaseMappedStatement;
a=0;// .source "MappedUpdate.java"
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
a=0;// # instance fields
a=0;// .field private final versionFieldType:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;// .field private final versionFieldTypeIndex:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/j256/ormlite/table/TableInfo;Ljava/lang/String;[Lcom/j256/ormlite/field/FieldType;Lcom/j256/ormlite/field/FieldType;I)V
a=0;//     .locals 0
a=0;//     .param p2, "statement"    # Ljava/lang/String;
a=0;//     .param p3, "argFieldTypes"    # [Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p4, "versionFieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p5, "versionFieldTypeIndex"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/table/TableInfo",
a=0;//             "<TT;TID;>;",
a=0;//             "Ljava/lang/String;",
a=0;//             "[",
a=0;//             "Lcom/j256/ormlite/field/FieldType;",
a=0;//             "Lcom/j256/ormlite/field/FieldType;",
a=0;//             "I)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/mapped/MappedUpdate;, "Lcom/j256/ormlite/stmt/mapped/MappedUpdate<TT;TID;>;"
a=0;//     .local p1, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/j256/ormlite/stmt/mapped/BaseMappedStatement;-><init>(Lcom/j256/ormlite/table/TableInfo;Ljava/lang/String;[Lcom/j256/ormlite/field/FieldType;)V
a=0;// 
a=0;//     .line 25
a=0;//     #p0=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedUpdate;);
a=0;//     iput-object p4, p0, Lcom/j256/ormlite/stmt/mapped/MappedUpdate;->versionFieldType:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .line 26
a=0;//     iput p5, p0, Lcom/j256/ormlite/stmt/mapped/MappedUpdate;->versionFieldTypeIndex:I
a=0;// 
a=0;//     .line 27
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static build(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;)Lcom/j256/ormlite/stmt/mapped/MappedUpdate;
a=0;//     .locals 15
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
a=0;//             "<TT;TID;>;)",
a=0;//             "Lcom/j256/ormlite/stmt/mapped/MappedUpdate",
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
a=0;//     .line 31
a=0;//     .local p1, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/j256/ormlite/table/TableInfo;->getIdField()Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 32
a=0;//     .local v12, "idField":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v12=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     if-nez v12, :cond_0
a=0;// 
a=0;//     .line 33
a=0;//     new-instance v0, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Cannot update "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/j256/ormlite/table/TableInfo;->getDataClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " because it doesn\'t have an id field"
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
a=0;//     .line 35
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v14, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v0, 0x40
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {v14, v0}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 36
a=0;//     .local v14, "sb":Ljava/lang/StringBuilder;
a=0;//     #v14=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v0, "UPDATE "
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/j256/ormlite/table/TableInfo;->getTableName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v14, v0, v1}, Lcom/j256/ormlite/stmt/mapped/MappedUpdate;->appendTableName(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 37
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     .line 38
a=0;//     .local v10, "first":Z
a=0;//     #v10=(One);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 39
a=0;//     .local v6, "argFieldC":I
a=0;//     #v6=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 40
a=0;//     .local v4, "versionFieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v4=(Null);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     .line 42
a=0;//     .local v5, "versionFieldTypeIndex":I
a=0;//     #v5=(Byte);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypes()[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .local v8, "arr$":[Lcom/j256/ormlite/field/FieldType;
a=0;//     #v8=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     array-length v13, v8
a=0;// 
a=0;//     .local v13, "len$":I
a=0;//     #v13=(Integer);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .local v11, "i$":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v5=(Integer);v6=(Integer);v9=(Conflicted);v11=(Integer);
a=0;//     if-ge v11, v13, :cond_3
a=0;// 
a=0;//     aget-object v9, v8, v11
a=0;// 
a=0;//     .line 43
a=0;//     .local v9, "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v9=(Null);
a=0;//     invoke-static {v9, v12}, Lcom/j256/ormlite/stmt/mapped/MappedUpdate;->isFieldUpdatable(Lcom/j256/ormlite/field/FieldType;Lcom/j256/ormlite/field/FieldType;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 44
a=0;//     invoke-virtual {v9}, Lcom/j256/ormlite/field/FieldType;->isVersion()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 45
a=0;//     move-object v4, v9
a=0;// 
a=0;//     .line 46
a=0;//     move v5, v6
a=0;// 
a=0;//     .line 48
a=0;//     :cond_1
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     .line 42
a=0;//     :cond_2
a=0;//     add-int/lit8 v11, v11, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 52
a=0;//     .end local v9    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v9=(Conflicted);
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     .line 53
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     .line 55
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     .line 57
a=0;//     :cond_4
a=0;//     new-array v3, v6, [Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .line 58
a=0;//     .local v3, "argFieldTypes":[Lcom/j256/ormlite/field/FieldType;
a=0;//     #v3=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 59
a=0;//     #v6=(Null);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypes()[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     array-length v13, v8
a=0;// 
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     move v7, v6
a=0;// 
a=0;//     .end local v6    # "argFieldC":I
a=0;//     .local v7, "argFieldC":I
a=0;//     :goto_1
a=0;//     #v6=(Integer);v7=(Integer);v10=(Boolean);v11=(Integer);
a=0;//     if-ge v11, v13, :cond_7
a=0;// 
a=0;//     aget-object v9, v8, v11
a=0;// 
a=0;//     .line 60
a=0;//     .restart local v9    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v9=(Null);
a=0;//     invoke-static {v9, v12}, Lcom/j256/ormlite/stmt/mapped/MappedUpdate;->isFieldUpdatable(Lcom/j256/ormlite/field/FieldType;Lcom/j256/ormlite/field/FieldType;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     move v6, v7
a=0;// 
a=0;//     .line 59
a=0;//     .end local v7    # "argFieldC":I
a=0;//     .restart local v6    # "argFieldC":I
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);
a=0;//     add-int/lit8 v11, v11, 0x1
a=0;// 
a=0;//     move v7, v6
a=0;// 
a=0;//     .end local v6    # "argFieldC":I
a=0;//     .restart local v7    # "argFieldC":I
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 63
a=0;//     :cond_5
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v10, :cond_6
a=0;// 
a=0;//     .line 64
a=0;//     const-string v0, "SET "
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 65
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 69
a=0;//     :goto_3
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, v14, v9, v0}, Lcom/j256/ormlite/stmt/mapped/MappedUpdate;->appendFieldColumnName(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/util/List;)V
a=0;// 
a=0;//     .line 70
a=0;//     add-int/lit8 v6, v7, 0x1
a=0;// 
a=0;//     .end local v7    # "argFieldC":I
a=0;//     .restart local v6    # "argFieldC":I
a=0;//     aput-object v9, v3, v7
a=0;// 
a=0;//     .line 71
a=0;//     const-string v0, "= ?"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 67
a=0;//     .end local v6    # "argFieldC":I
a=0;//     .restart local v7    # "argFieldC":I
a=0;//     :cond_6
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, ", "
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 73
a=0;//     .end local v9    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_7
a=0;//     #v0=(Conflicted);v9=(Conflicted);
a=0;//     const/16 v0, 0x20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 74
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, v12, v14, v0}, Lcom/j256/ormlite/stmt/mapped/MappedUpdate;->appendWhereFieldEq(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/field/FieldType;Ljava/lang/StringBuilder;Ljava/util/List;)V
a=0;// 
a=0;//     .line 75
a=0;//     add-int/lit8 v6, v7, 0x1
a=0;// 
a=0;//     .end local v7    # "argFieldC":I
a=0;//     .restart local v6    # "argFieldC":I
a=0;//     aput-object v12, v3, v7
a=0;// 
a=0;//     .line 76
a=0;//     if-eqz v4, :cond_8
a=0;// 
a=0;//     .line 77
a=0;//     const-string v0, " AND "
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 78
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, v14, v4, v0}, Lcom/j256/ormlite/stmt/mapped/MappedUpdate;->appendFieldColumnName(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/util/List;)V
a=0;// 
a=0;//     .line 79
a=0;//     const-string v0, "= ?"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 80
a=0;//     add-int/lit8 v7, v6, 0x1
a=0;// 
a=0;//     .end local v6    # "argFieldC":I
a=0;//     .restart local v7    # "argFieldC":I
a=0;//     aput-object v4, v3, v6
a=0;// 
a=0;//     move v6, v7
a=0;// 
a=0;//     .line 82
a=0;//     .end local v7    # "argFieldC":I
a=0;//     .restart local v6    # "argFieldC":I
a=0;//     :cond_8
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/mapped/MappedUpdate;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/mapped/MappedUpdate;);
a=0;//     invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/j256/ormlite/stmt/mapped/MappedUpdate;-><init>(Lcom/j256/ormlite/table/TableInfo;Ljava/lang/String;[Lcom/j256/ormlite/field/FieldType;Lcom/j256/ormlite/field/FieldType;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedUpdate;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static isFieldUpdatable(Lcom/j256/ormlite/field/FieldType;Lcom/j256/ormlite/field/FieldType;)Z
a=0;//     .locals 1
a=0;//     .param p0, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p1, "idField"    # Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .prologue
a=0;//     .line 134
a=0;//     if-eq p0, p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/field/FieldType;->isForeignCollection()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 135
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 137
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public update(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)I
a=0;//     .locals 17
a=0;//     .param p1, "databaseConnection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p3, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/DatabaseConnection;",
a=0;//             "TT;",
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
a=0;//     .line 91
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/mapped/MappedUpdate;, "Lcom/j256/ormlite/stmt/mapped/MappedUpdate<TT;TID;>;"
a=0;//     .local p2, "data":Ljava/lang/Object;, "TT;"
a=0;//     :try_start_0
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedUpdate;);
a=0;//     iget-object v12, v0, Lcom/j256/ormlite/stmt/mapped/MappedUpdate;->argFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v12=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     array-length v12, v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     const/4 v13, 0x1
a=0;// 
a=0;//     #v13=(One);
a=0;//     if-gt v12, v13, :cond_1
a=0;// 
a=0;//     .line 92
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 127
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Integer);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     return v11
a=0;// 
a=0;//     .line 94
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Integer);v13=(One);v14=(Uninit);v15=(Uninit);v16=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, p2
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v0, v1}, Lcom/j256/ormlite/stmt/mapped/MappedUpdate;->getFieldObjects(Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 95
a=0;//     .local v2, "args":[Ljava/lang/Object;
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 96
a=0;//     .local v10, "newVersion":Ljava/lang/Object;
a=0;//     #v10=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v12, v0, Lcom/j256/ormlite/stmt/mapped/MappedUpdate;->versionFieldType:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v12=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     if-eqz v12, :cond_2
a=0;// 
a=0;//     .line 97
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v12, v0, Lcom/j256/ormlite/stmt/mapped/MappedUpdate;->versionFieldType:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v12, v0}, Lcom/j256/ormlite/field/FieldType;->extractJavaFieldValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 98
a=0;//     #v10=(Reference,Ljava/lang/Object;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v12, v0, Lcom/j256/ormlite/stmt/mapped/MappedUpdate;->versionFieldType:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     invoke-virtual {v12, v10}, Lcom/j256/ormlite/field/FieldType;->moveToNextValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 99
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v12, v0, Lcom/j256/ormlite/stmt/mapped/MappedUpdate;->versionFieldTypeIndex:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/j256/ormlite/stmt/mapped/MappedUpdate;->versionFieldType:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v13=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-virtual {v13, v10}, Lcom/j256/ormlite/field/FieldType;->convertJavaFieldToSqlArgValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     aput-object v13, v2, v12
a=0;// 
a=0;//     .line 101
a=0;//     .end local v10    # "newVersion":Ljava/lang/Object;
a=0;//     :cond_2
a=0;//     #v12=(Conflicted);v13=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v12, v0, Lcom/j256/ormlite/stmt/mapped/MappedUpdate;->statement:Ljava/lang/String;
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/j256/ormlite/stmt/mapped/MappedUpdate;->argFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v13=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-interface {v0, v12, v2, v13}, Lcom/j256/ormlite/support/DatabaseConnection;->update(Ljava/lang/String;[Ljava/lang/Object;[Lcom/j256/ormlite/field/FieldType;)I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 102
a=0;//     .local v11, "rowC":I
a=0;//     #v11=(Integer);
a=0;//     if-lez v11, :cond_5
a=0;// 
a=0;//     .line 103
a=0;//     if-eqz v10, :cond_3
a=0;// 
a=0;//     .line 105
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v12, v0, Lcom/j256/ormlite/stmt/mapped/MappedUpdate;->versionFieldType:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v12, v0, v10, v13, v14}, Lcom/j256/ormlite/field/FieldType;->assignField(Ljava/lang/Object;Ljava/lang/Object;ZLcom/j256/ormlite/dao/ObjectCache;)V
a=0;// 
a=0;//     .line 107
a=0;//     :cond_3
a=0;//     #v13=(Reference,[Lcom/j256/ormlite/field/FieldType;);v14=(Conflicted);
a=0;//     if-eqz p3, :cond_5
a=0;// 
a=0;//     .line 109
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v12, v0, Lcom/j256/ormlite/stmt/mapped/MappedUpdate;->idField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v12, v0}, Lcom/j256/ormlite/field/FieldType;->extractJavaFieldValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 110
a=0;//     .local v8, "id":Ljava/lang/Object;
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v12, v0, Lcom/j256/ormlite/stmt/mapped/MappedUpdate;->clazz:Ljava/lang/Class;
a=0;// 
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     invoke-interface {v0, v12, v8}, Lcom/j256/ormlite/dao/ObjectCache;->get(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 111
a=0;//     .local v4, "cachedData":Ljava/lang/Object;, "TT;"
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     if-eq v4, v0, :cond_5
a=0;// 
a=0;//     .line 113
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v12, v0, Lcom/j256/ormlite/stmt/mapped/MappedUpdate;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     invoke-virtual {v12}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypes()[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .local v3, "arr$":[Lcom/j256/ormlite/field/FieldType;
a=0;//     #v3=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     array-length v9, v3
a=0;// 
a=0;//     .local v9, "len$":I
a=0;//     #v9=(Integer);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .local v7, "i$":I
a=0;//     :goto_1
a=0;//     #v6=(Conflicted);v7=(Integer);
a=0;//     if-ge v7, v9, :cond_5
a=0;// 
a=0;//     aget-object v6, v3, v7
a=0;// 
a=0;//     .line 114
a=0;//     .local v6, "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v6=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v12, v0, Lcom/j256/ormlite/stmt/mapped/MappedUpdate;->idField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     if-eq v6, v12, :cond_4
a=0;// 
a=0;//     .line 115
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Lcom/j256/ormlite/field/FieldType;->extractJavaFieldValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     invoke-virtual {v6, v4, v12, v13, v0}, Lcom/j256/ormlite/field/FieldType;->assignField(Ljava/lang/Object;Ljava/lang/Object;ZLcom/j256/ormlite/dao/ObjectCache;)V
a=0;// 
a=0;//     .line 113
a=0;//     :cond_4
a=0;//     #v13=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     add-int/lit8 v7, v7, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 122
a=0;//     .end local v3    # "arr$":[Lcom/j256/ormlite/field/FieldType;
a=0;//     .end local v4    # "cachedData":Ljava/lang/Object;, "TT;"
a=0;//     .end local v6    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     .end local v7    # "i$":I
a=0;//     .end local v8    # "id":Ljava/lang/Object;
a=0;//     .end local v9    # "len$":I
a=0;//     :cond_5
a=0;//     #v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     sget-object v12, Lcom/j256/ormlite/stmt/mapped/MappedUpdate;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v13, "update data with statement \'{}\' and {} args, changed {} rows"
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/j256/ormlite/stmt/mapped/MappedUpdate;->statement:Ljava/lang/String;
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     array-length v15, v2
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual/range {v12 .. v16}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 123
a=0;//     array-length v12, v2
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     if-lez v12, :cond_0
a=0;// 
a=0;//     .line 125
a=0;//     sget-object v12, Lcom/j256/ormlite/stmt/mapped/MappedUpdate;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v12=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v13, "update arguments: {}"
a=0;// 
a=0;//     invoke-virtual {v12, v13, v2}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 128
a=0;//     .end local v2    # "args":[Ljava/lang/Object;
a=0;//     .end local v11    # "rowC":I
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     .line 129
a=0;//     .local v5, "e":Ljava/sql/SQLException;
a=0;//     #v5=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v13, "Unable to run update stmt on object "
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     const-string v13, ": "
a=0;// 
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/j256/ormlite/stmt/mapped/MappedUpdate;->statement:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-static {v12, v5}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     throw v12
a=0;// .end method
}}
