package com.j256.ormlite.stmt.mapped; class MappedCreate { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/stmt/mapped/MappedCreate;
a=0;// .super Lcom/j256/ormlite/stmt/mapped/BaseMappedStatement;
a=0;// .source "MappedCreate.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/j256/ormlite/stmt/mapped/MappedCreate$1;,
a=0;//         Lcom/j256/ormlite/stmt/mapped/MappedCreate$KeyHolder;
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
a=0;//         "Lcom/j256/ormlite/stmt/mapped/BaseMappedStatement",
a=0;//         "<TT;TID;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private dataClassName:Ljava/lang/String;
a=0;// 
a=0;// .field private final queryNextSequenceStmt:Ljava/lang/String;
a=0;// 
a=0;// .field private versionFieldTypeIndex:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/j256/ormlite/table/TableInfo;Ljava/lang/String;[Lcom/j256/ormlite/field/FieldType;Ljava/lang/String;I)V
a=0;//     .locals 1
a=0;//     .param p2, "statement"    # Ljava/lang/String;
a=0;//     .param p3, "argFieldTypes"    # [Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p4, "queryNextSequenceStmt"    # Ljava/lang/String;
a=0;//     .param p5, "versionFieldTypeIndex"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/table/TableInfo",
a=0;//             "<TT;TID;>;",
a=0;//             "Ljava/lang/String;",
a=0;//             "[",
a=0;//             "Lcom/j256/ormlite/field/FieldType;",
a=0;//             "Ljava/lang/String;",
a=0;//             "I)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/mapped/MappedCreate;, "Lcom/j256/ormlite/stmt/mapped/MappedCreate<TT;TID;>;"
a=0;//     .local p1, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/j256/ormlite/stmt/mapped/BaseMappedStatement;-><init>(Lcom/j256/ormlite/table/TableInfo;Ljava/lang/String;[Lcom/j256/ormlite/field/FieldType;)V
a=0;// 
a=0;//     .line 28
a=0;//     #p0=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedCreate;);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getDataClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->dataClassName:Ljava/lang/String;
a=0;// 
a=0;//     .line 29
a=0;//     iput-object p4, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->queryNextSequenceStmt:Ljava/lang/String;
a=0;// 
a=0;//     .line 30
a=0;//     iput p5, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->versionFieldTypeIndex:I
a=0;// 
a=0;//     .line 31
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private assignIdValue(Ljava/lang/Object;Ljava/lang/Number;Ljava/lang/String;Lcom/j256/ormlite/dao/ObjectCache;)V
a=0;//     .locals 5
a=0;//     .param p2, "val"    # Ljava/lang/Number;
a=0;//     .param p3, "label"    # Ljava/lang/String;
a=0;//     .param p4, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;",
a=0;//             "Ljava/lang/Number;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/j256/ormlite/dao/ObjectCache;",
a=0;//             ")V"
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
a=0;//     .line 230
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/mapped/MappedCreate;, "Lcom/j256/ormlite/stmt/mapped/MappedCreate<TT;TID;>;"
a=0;//     .local p1, "data":Ljava/lang/Object;, "TT;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->idField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-virtual {v0, p1, p2, p4}, Lcom/j256/ormlite/field/FieldType;->assignIdValue(Ljava/lang/Object;Ljava/lang/Number;Lcom/j256/ormlite/dao/ObjectCache;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 231
a=0;//     sget-object v0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->DEBUG:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     invoke-virtual {v0, v1}, Lcom/j256/ormlite/logger/Logger;->isLevelEnabled(Lcom/j256/ormlite/logger/Log$Level;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 232
a=0;//     sget-object v0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v1, "assigned id \'{}\' from {} to \'{}\' in {} object"
a=0;// 
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object p2, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     aput-object p3, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->idField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-virtual {v4}, Lcom/j256/ormlite/field/FieldType;->getFieldName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->dataClassName:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 235
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private assignSequenceId(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)V
a=0;//     .locals 6
a=0;//     .param p1, "databaseConnection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p3, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/DatabaseConnection;",
a=0;//             "TT;",
a=0;//             "Lcom/j256/ormlite/dao/ObjectCache;",
a=0;//             ")V"
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
a=0;//     .line 219
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/mapped/MappedCreate;, "Lcom/j256/ormlite/stmt/mapped/MappedCreate<TT;TID;>;"
a=0;//     .local p2, "data":Ljava/lang/Object;, "TT;"
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->queryNextSequenceStmt:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v2}, Lcom/j256/ormlite/support/DatabaseConnection;->queryForLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 220
a=0;//     .local v0, "seqVal":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sget-object v2, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v3, "queried for sequence {} using stmt: {}"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Long;);
a=0;//     iget-object v5, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->queryNextSequenceStmt:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, v4, v5}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 221
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v2, v0, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 223
a=0;//     new-instance v2, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Should not have returned 0 for stmt: "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->queryNextSequenceStmt:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 225
a=0;//     :cond_0
a=0;//     #v2=(Byte);v3=(LongHi);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Long;);
a=0;//     const-string v3, "sequence"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, p2, v2, v3, p3}, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->assignIdValue(Ljava/lang/Object;Ljava/lang/Number;Ljava/lang/String;Lcom/j256/ormlite/dao/ObjectCache;)V
a=0;// 
a=0;//     .line 226
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static build(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;)Lcom/j256/ormlite/stmt/mapped/MappedCreate;
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
a=0;//             "Lcom/j256/ormlite/stmt/mapped/MappedCreate",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 129
a=0;//     .local p1, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     new-instance v14, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v0, 0x80
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-direct {v14, v0}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 130
a=0;//     .local v14, "sb":Ljava/lang/StringBuilder;
a=0;//     #v14=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v0, "INSERT INTO "
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/j256/ormlite/table/TableInfo;->getTableName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v14, v0, v1}, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->appendTableName(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 131
a=0;//     const/16 v0, 0x28
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 132
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 133
a=0;//     .local v6, "argFieldC":I
a=0;//     #v6=(Null);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     .line 135
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
a=0;//     #v5=(Integer);v6=(Integer);v9=(Conflicted);v11=(Integer);
a=0;//     if-ge v11, v13, :cond_2
a=0;// 
a=0;//     aget-object v9, v8, v11
a=0;// 
a=0;//     .line 136
a=0;//     .local v9, "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v9=(Null);
a=0;//     invoke-static {p0, v9}, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->isFieldCreatable(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/field/FieldType;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 137
a=0;//     invoke-virtual {v9}, Lcom/j256/ormlite/field/FieldType;->isVersion()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 138
a=0;//     move v5, v6
a=0;// 
a=0;//     .line 140
a=0;//     :cond_0
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     .line 135
a=0;//     :cond_1
a=0;//     add-int/lit8 v11, v11, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 143
a=0;//     .end local v9    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_2
a=0;//     #v0=(PosByte);v9=(Conflicted);
a=0;//     new-array v3, v6, [Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .line 144
a=0;//     .local v3, "argFieldTypes":[Lcom/j256/ormlite/field/FieldType;
a=0;//     #v3=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 145
a=0;//     #v6=(Null);
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     .line 146
a=0;//     .local v10, "first":Z
a=0;//     #v10=(One);
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
a=0;//     if-ge v11, v13, :cond_5
a=0;// 
a=0;//     aget-object v9, v8, v11
a=0;// 
a=0;//     .line 147
a=0;//     .restart local v9    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v9=(Null);
a=0;//     invoke-static {p0, v9}, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->isFieldCreatable(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/field/FieldType;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     move v6, v7
a=0;// 
a=0;//     .line 146
a=0;//     .end local v7    # "argFieldC":I
a=0;//     .restart local v6    # "argFieldC":I
a=0;//     :goto_2
a=0;//     add-int/lit8 v11, v11, 0x1
a=0;// 
a=0;//     move v7, v6
a=0;// 
a=0;//     .end local v6    # "argFieldC":I
a=0;//     .restart local v7    # "argFieldC":I
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 150
a=0;//     :cond_3
a=0;//     if-eqz v10, :cond_4
a=0;// 
a=0;//     .line 151
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 155
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, v14, v9, v0}, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->appendFieldColumnName(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/util/List;)V
a=0;// 
a=0;//     .line 156
a=0;//     add-int/lit8 v6, v7, 0x1
a=0;// 
a=0;//     .end local v7    # "argFieldC":I
a=0;//     .restart local v6    # "argFieldC":I
a=0;//     aput-object v9, v3, v7
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 153
a=0;//     .end local v6    # "argFieldC":I
a=0;//     .restart local v7    # "argFieldC":I
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, ","
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 158
a=0;//     .end local v9    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_5
a=0;//     #v0=(PosByte);v9=(Conflicted);
a=0;//     const-string v0, ") VALUES ("
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 159
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     .line 160
a=0;//     #v10=(One);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypes()[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     array-length v13, v8
a=0;// 
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);v10=(Boolean);
a=0;//     if-ge v11, v13, :cond_8
a=0;// 
a=0;//     aget-object v9, v8, v11
a=0;// 
a=0;//     .line 161
a=0;//     .restart local v9    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v9=(Null);
a=0;//     invoke-static {p0, v9}, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->isFieldCreatable(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/field/FieldType;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     .line 160
a=0;//     :goto_5
a=0;//     #v0=(Conflicted);
a=0;//     add-int/lit8 v11, v11, 0x1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 164
a=0;//     :cond_6
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v10, :cond_7
a=0;// 
a=0;//     .line 165
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 169
a=0;//     :goto_6
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "?"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 167
a=0;//     :cond_7
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, ","
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 171
a=0;//     .end local v9    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_8
a=0;//     #v0=(Conflicted);v9=(Conflicted);
a=0;//     const-string v0, ")"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 172
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/j256/ormlite/table/TableInfo;->getIdField()Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 173
a=0;//     .local v12, "idField":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v12=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-static {p0, v12}, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->buildQueryNextSequence(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/field/FieldType;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 174
a=0;//     .local v4, "queryNext":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/stmt/mapped/MappedCreate;);
a=0;//     invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/j256/ormlite/stmt/mapped/MappedCreate;-><init>(Lcom/j256/ormlite/table/TableInfo;Ljava/lang/String;[Lcom/j256/ormlite/field/FieldType;Ljava/lang/String;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedCreate;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static buildQueryNextSequence(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/field/FieldType;)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .param p0, "databaseType"    # Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .param p1, "idField"    # Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 203
a=0;//     #v2=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 212
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Ljava/lang/String;);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 206
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Null);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/FieldType;->getGeneratedIdSequence()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 207
a=0;//     .local v1, "seqName":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 210
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v2, 0x40
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 211
a=0;//     .local v0, "sb":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {p0, v0, v1}, Lcom/j256/ormlite/db/DatabaseType;->appendSelectNextValFromSequence(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 212
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private foreignCollectionsAreAssigned([Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;)Z
a=0;//     .locals 5
a=0;//     .param p1, "foreignCollections"    # [Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p2, "data"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 178
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/mapped/MappedCreate;, "Lcom/j256/ormlite/stmt/mapped/MappedCreate<TT;TID;>;"
a=0;//     move-object v0, p1
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
a=0;//     #v1=(Conflicted);v2=(Integer);v4=(Conflicted);
a=0;//     if-ge v2, v3, :cond_1
a=0;// 
a=0;//     aget-object v1, v0, v2
a=0;// 
a=0;//     .line 179
a=0;//     .local v1, "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1, p2}, Lcom/j256/ormlite/field/FieldType;->extractJavaFieldValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 180
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 183
a=0;//     .end local v1    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v4=(Boolean);
a=0;//     return v4
a=0;// 
a=0;//     .line 178
a=0;//     .restart local v1    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_0
a=0;//     #v1=(Null);v4=(Reference,Ljava/lang/Object;);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 183
a=0;//     .end local v1    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static isFieldCreatable(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/field/FieldType;)Z
a=0;//     .locals 3
a=0;//     .param p0, "databaseType"    # Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .param p1, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 188
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/FieldType;->isForeignCollection()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 198
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 191
a=0;//     :cond_1
a=0;//     #v0=(Null);
a=0;//     invoke-interface {p0}, Lcom/j256/ormlite/db/DatabaseType;->isIdSequenceNeeded()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     invoke-interface {p0}, Lcom/j256/ormlite/db/DatabaseType;->isSelectSequenceBeforeInsert()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 193
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 194
a=0;//     :cond_2
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/FieldType;->isGeneratedId()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/FieldType;->isSelfGeneratedId()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/FieldType;->isAllowGeneratedIdInsert()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     :cond_3
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 198
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public insert(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)I
a=0;//     .locals 24
a=0;//     .param p1, "databaseType"    # Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .param p2, "databaseConnection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p4, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/db/DatabaseType;",
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
a=0;//     .line 38
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/mapped/MappedCreate;, "Lcom/j256/ormlite/stmt/mapped/MappedCreate<TT;TID;>;"
a=0;//     .local p3, "data":Ljava/lang/Object;, "TT;"
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     .line 39
a=0;//     .local v14, "keyHolder":Lcom/j256/ormlite/stmt/mapped/MappedCreate$KeyHolder;
a=0;//     #v14=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedCreate;);
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->idField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     if-eqz v19, :cond_0
a=0;// 
a=0;//     .line 41
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->idField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     invoke-virtual/range {v19 .. v19}, Lcom/j256/ormlite/field/FieldType;->isAllowGeneratedIdInsert()Z
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Boolean);
a=0;//     if-eqz v19, :cond_2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->idField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     move-object/from16 v1, p3
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v0, v1}, Lcom/j256/ormlite/field/FieldType;->isObjectsFieldValueDefault(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Boolean);
a=0;//     if-nez v19, :cond_2
a=0;// 
a=0;//     .line 42
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 46
a=0;//     .local v7, "assignId":Z
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v7=(Boolean);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->idField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-virtual/range {v19 .. v19}, Lcom/j256/ormlite/field/FieldType;->isSelfGeneratedId()Z
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Boolean);
a=0;//     if-eqz v19, :cond_3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->idField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-virtual/range {v19 .. v19}, Lcom/j256/ormlite/field/FieldType;->isGeneratedId()Z
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Boolean);
a=0;//     if-eqz v19, :cond_3
a=0;// 
a=0;//     .line 47
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     .line 48
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->idField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->idField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-object/from16 v20, v0
a=0;// 
a=0;//     #v20=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-virtual/range {v20 .. v20}, Lcom/j256/ormlite/field/FieldType;->generateId()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     move-object/from16 v1, p3
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     move-object/from16 v2, v20
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     move/from16 v3, v21
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object/from16 v4, p4
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Lcom/j256/ormlite/field/FieldType;->assignField(Ljava/lang/Object;Ljava/lang/Object;ZLcom/j256/ormlite/dao/ObjectCache;)V
a=0;// 
a=0;//     .line 66
a=0;//     .end local v7    # "assignId":Z
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     :try_start_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);v14=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedCreate$KeyHolder;);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-virtual/range {v19 .. v19}, Lcom/j256/ormlite/table/TableInfo;->isForeignAutoCreate()Z
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Boolean);
a=0;//     if-eqz v19, :cond_6
a=0;// 
a=0;//     .line 67
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-virtual/range {v19 .. v19}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypes()[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .local v6, "arr$":[Lcom/j256/ormlite/field/FieldType;
a=0;//     #v6=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     array-length v15, v6
a=0;// 
a=0;//     .local v15, "len$":I
a=0;//     #v15=(Integer);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .local v11, "i$":I
a=0;//     :goto_2
a=0;//     #v9=(Conflicted);v10=(Conflicted);v11=(Integer);v19=(Conflicted);
a=0;//     if-ge v11, v15, :cond_6
a=0;// 
a=0;//     aget-object v9, v6, v11
a=0;// 
a=0;//     .line 68
a=0;//     .local v9, "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v9=(Null);
a=0;//     invoke-virtual {v9}, Lcom/j256/ormlite/field/FieldType;->isForeignAutoCreate()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Boolean);
a=0;//     if-nez v19, :cond_5
a=0;// 
a=0;//     .line 67
a=0;//     :cond_1
a=0;//     :goto_3
a=0;//     add-int/lit8 v11, v11, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 44
a=0;//     .end local v6    # "arr$":[Lcom/j256/ormlite/field/FieldType;
a=0;//     .end local v9    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     .end local v11    # "i$":I
a=0;//     .end local v15    # "len$":I
a=0;//     :cond_2
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v14=(Null);v15=(Uninit);v20=(Uninit);v21=(Uninit);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .restart local v7    # "assignId":Z
a=0;//     #v7=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 50
a=0;//     :cond_3
a=0;//     #v7=(Boolean);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->idField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-virtual/range {v19 .. v19}, Lcom/j256/ormlite/field/FieldType;->isGeneratedIdSequence()Z
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Boolean);
a=0;//     if-eqz v19, :cond_4
a=0;// 
a=0;//     invoke-interface/range {p1 .. p1}, Lcom/j256/ormlite/db/DatabaseType;->isSelectSequenceBeforeInsert()Z
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     if-eqz v19, :cond_4
a=0;// 
a=0;//     .line 51
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     .line 52
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, p2
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     move-object/from16 v2, p3
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     move-object/from16 v3, p4
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->assignSequenceId(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 54
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v2=(Uninit);v3=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->idField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-virtual/range {v19 .. v19}, Lcom/j256/ormlite/field/FieldType;->isGeneratedId()Z
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Boolean);
a=0;//     if-eqz v19, :cond_0
a=0;// 
a=0;//     .line 55
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     .line 57
a=0;//     new-instance v14, Lcom/j256/ormlite/stmt/mapped/MappedCreate$KeyHolder;
a=0;// 
a=0;//     .end local v14    # "keyHolder":Lcom/j256/ormlite/stmt/mapped/MappedCreate$KeyHolder;
a=0;//     #v14=(UninitRef,Lcom/j256/ormlite/stmt/mapped/MappedCreate$KeyHolder;);
a=0;//     const/16 v19, 0x0
a=0;// 
a=0;//     #v19=(Null);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {v14, v0}, Lcom/j256/ormlite/stmt/mapped/MappedCreate$KeyHolder;-><init>(Lcom/j256/ormlite/stmt/mapped/MappedCreate$1;)V
a=0;// 
a=0;//     .restart local v14    # "keyHolder":Lcom/j256/ormlite/stmt/mapped/MappedCreate$KeyHolder;
a=0;//     #v14=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedCreate$KeyHolder;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 72
a=0;//     .end local v7    # "assignId":Z
a=0;//     .restart local v6    # "arr$":[Lcom/j256/ormlite/field/FieldType;
a=0;//     .restart local v9    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     .restart local v11    # "i$":I
a=0;//     .restart local v15    # "len$":I
a=0;//     :cond_5
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Object;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Reference,[Lcom/j256/ormlite/field/FieldType;);v7=(Conflicted);v9=(Null);v10=(Conflicted);v11=(Integer);v15=(Integer);v19=(Boolean);v20=(Conflicted);v21=(Conflicted);
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     invoke-virtual {v9, v0}, Lcom/j256/ormlite/field/FieldType;->extractRawJavaFieldValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 73
a=0;//     .local v10, "foreignObj":Ljava/lang/Object;
a=0;//     #v10=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v10, :cond_1
a=0;// 
a=0;//     invoke-virtual {v9}, Lcom/j256/ormlite/field/FieldType;->getForeignIdField()Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     #v19=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v0, v10}, Lcom/j256/ormlite/field/FieldType;->isObjectsFieldValueDefault(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Boolean);
a=0;//     if-eqz v19, :cond_1
a=0;// 
a=0;//     .line 74
a=0;//     invoke-virtual {v9, v10}, Lcom/j256/ormlite/field/FieldType;->createWithForeignDao(Ljava/lang/Object;)I
a=0;//     :try_end_1
a=0;//     .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 123
a=0;//     .end local v6    # "arr$":[Lcom/j256/ormlite/field/FieldType;
a=0;//     .end local v9    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     .end local v10    # "foreignObj":Ljava/lang/Object;
a=0;//     .end local v11    # "i$":I
a=0;//     .end local v15    # "len$":I
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v5=(Conflicted);v6=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v22=(Conflicted);v23=(Conflicted);
a=0;//     move-exception v8
a=0;// 
a=0;//     .line 124
a=0;//     .local v8, "e":Ljava/sql/SQLException;
a=0;//     #v8=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v19, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v19=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct/range {v19 .. v19}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v20, "Unable to run insert stmt on object "
a=0;// 
a=0;//     #v20=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v1, p3
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     const-string v20, ": "
a=0;// 
a=0;//     invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->statement:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v20, v0
a=0;// 
a=0;//     invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-static {v0, v8}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     throw v19
a=0;// 
a=0;//     .line 79
a=0;//     .end local v8    # "e":Ljava/sql/SQLException;
a=0;//     :cond_6
a=0;//     :try_start_2
a=0;//     #v1=(Conflicted);v5=(Uninit);v8=(Uninit);v12=(Uninit);v13=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Conflicted);v20=(Conflicted);v22=(Uninit);v23=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, p3
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v0, v1}, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->getFieldObjects(Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 80
a=0;//     .local v5, "args":[Ljava/lang/Object;
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     const/16 v17, 0x0
a=0;// 
a=0;//     .line 82
a=0;//     .local v17, "versionDefaultValue":Ljava/lang/Object;
a=0;//     #v17=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->versionFieldTypeIndex:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     if-ltz v19, :cond_7
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedCreate;);
a=0;//     iget v0, v0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->versionFieldTypeIndex:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     aget-object v19, v5, v19
a=0;// 
a=0;//     #v19=(Null);
a=0;//     if-nez v19, :cond_7
a=0;// 
a=0;//     .line 84
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedCreate;);
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->argFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->versionFieldTypeIndex:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     aget-object v18, v19, v20
a=0;// 
a=0;//     .line 85
a=0;//     .local v18, "versionFieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v18=(Null);
a=0;//     const/16 v19, 0x0
a=0;// 
a=0;//     #v19=(Null);
a=0;//     invoke-virtual/range {v18 .. v19}, Lcom/j256/ormlite/field/FieldType;->moveToNextValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     .line 86
a=0;//     #v17=(Reference,Ljava/lang/Object;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedCreate;);
a=0;//     iget v0, v0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->versionFieldTypeIndex:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object/from16 v1, v17
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/j256/ormlite/field/FieldType;->convertJavaFieldToSqlArgValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     #v20=(Reference,Ljava/lang/Object;);
a=0;//     aput-object v20, v5, v19
a=0;// 
a=0;//     .line 89
a=0;//     .end local v17    # "versionDefaultValue":Ljava/lang/Object;
a=0;//     .end local v18    # "versionFieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_7
a=0;//     #v0=(Integer);v18=(Conflicted);v20=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedCreate;);
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->statement:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->argFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-object/from16 v20, v0
a=0;// 
a=0;//     #v20=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     move-object/from16 v1, v19
a=0;// 
a=0;//     move-object/from16 v2, v20
a=0;// 
a=0;//     #v2=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-interface {v0, v1, v5, v2, v14}, Lcom/j256/ormlite/support/DatabaseConnection;->insert(Ljava/lang/String;[Ljava/lang/Object;[Lcom/j256/ormlite/field/FieldType;Lcom/j256/ormlite/support/GeneratedKeyHolder;)I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     .line 90
a=0;//     .local v16, "rowC":I
a=0;//     #v16=(Integer);
a=0;//     sget-object v19, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     const-string v20, "insert data with statement \'{}\' and {} args, changed {} rows"
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->statement:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v21, v0
a=0;// 
a=0;//     #v21=(Reference,Ljava/lang/String;);
a=0;//     array-length v0, v5
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     #v22=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     #v23=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual/range {v19 .. v23}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 91
a=0;//     array-length v0, v5
a=0;// 
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     if-lez v19, :cond_8
a=0;// 
a=0;//     .line 93
a=0;//     sget-object v19, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v19=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v20, "insert arguments: {}"
a=0;// 
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object/from16 v1, v20
a=0;// 
a=0;//     invoke-virtual {v0, v1, v5}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 95
a=0;//     :cond_8
a=0;//     #v0=(Conflicted);v19=(Conflicted);
a=0;//     if-lez v16, :cond_d
a=0;// 
a=0;//     .line 96
a=0;//     if-eqz v17, :cond_9
a=0;// 
a=0;//     .line 97
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedCreate;);
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->argFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->versionFieldTypeIndex:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     aget-object v19, v19, v20
a=0;// 
a=0;//     #v19=(Null);
a=0;//     const/16 v20, 0x0
a=0;// 
a=0;//     #v20=(Null);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object/from16 v1, p3
a=0;// 
a=0;//     move-object/from16 v2, v17
a=0;// 
a=0;//     move/from16 v3, v20
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object/from16 v4, v21
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Lcom/j256/ormlite/field/FieldType;->assignField(Ljava/lang/Object;Ljava/lang/Object;ZLcom/j256/ormlite/dao/ObjectCache;)V
a=0;// 
a=0;//     .line 99
a=0;//     :cond_9
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v19=(Conflicted);v20=(Reference,Ljava/lang/String;);v21=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v14, :cond_c
a=0;// 
a=0;//     .line 101
a=0;//     invoke-virtual {v14}, Lcom/j256/ormlite/stmt/mapped/MappedCreate$KeyHolder;->getKey()Ljava/lang/Number;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 102
a=0;//     .local v13, "key":Ljava/lang/Number;
a=0;//     #v13=(Reference,Ljava/lang/Number;);
a=0;//     if-nez v13, :cond_a
a=0;// 
a=0;//     .line 104
a=0;//     new-instance v19, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v19=(UninitRef,Ljava/sql/SQLException;);
a=0;//     const-string v20, "generated-id key was not set by the update call"
a=0;// 
a=0;//     invoke-direct/range {v19 .. v20}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v19=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v19
a=0;// 
a=0;//     .line 106
a=0;//     :cond_a
a=0;//     #v19=(Conflicted);
a=0;//     invoke-virtual {v13}, Ljava/lang/Number;->longValue()J
a=0;// 
a=0;//     move-result-wide v19
a=0;// 
a=0;//     #v19=(LongLo);v20=(LongHi);
a=0;//     const-wide/16 v21, 0x0
a=0;// 
a=0;//     #v21=(LongLo);v22=(LongHi);
a=0;//     cmp-long v19, v19, v21
a=0;// 
a=0;//     #v19=(Byte);
a=0;//     if-nez v19, :cond_b
a=0;// 
a=0;//     .line 108
a=0;//     new-instance v19, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v19=(UninitRef,Ljava/sql/SQLException;);
a=0;//     const-string v20, "generated-id key must not be 0 value"
a=0;// 
a=0;//     #v20=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v19 .. v20}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v19=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v19
a=0;// 
a=0;//     .line 110
a=0;//     :cond_b
a=0;//     #v19=(Byte);v20=(LongHi);
a=0;//     const-string v19, "keyholder"
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedCreate;);
a=0;//     move-object/from16 v1, p3
a=0;// 
a=0;//     move-object/from16 v2, v19
a=0;// 
a=0;//     move-object/from16 v3, p4
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     invoke-direct {v0, v1, v13, v2, v3}, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->assignIdValue(Ljava/lang/Object;Ljava/lang/Number;Ljava/lang/String;Lcom/j256/ormlite/dao/ObjectCache;)V
a=0;// 
a=0;//     .line 116
a=0;//     .end local v13    # "key":Ljava/lang/Number;
a=0;//     :cond_c
a=0;//     #v0=(Conflicted);v3=(Conflicted);v13=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);
a=0;//     if-eqz p4, :cond_d
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedCreate;);
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-virtual/range {v19 .. v19}, Lcom/j256/ormlite/table/TableInfo;->getForeignCollections()[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v19
a=0;// 
a=0;//     move-object/from16 v2, p3
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->foreignCollectionsAreAssigned([Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Boolean);
a=0;//     if-eqz v19, :cond_d
a=0;// 
a=0;//     .line 117
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->idField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     move-object/from16 v1, p3
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/j256/ormlite/field/FieldType;->extractJavaFieldValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 118
a=0;//     .local v12, "id":Ljava/lang/Object;
a=0;//     #v12=(Reference,Ljava/lang/Object;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->clazz:Ljava/lang/Class;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     move-object/from16 v0, p4
a=0;// 
a=0;//     move-object/from16 v1, v19
a=0;// 
a=0;//     move-object/from16 v2, p3
a=0;// 
a=0;//     invoke-interface {v0, v1, v12, v2}, Lcom/j256/ormlite/dao/ObjectCache;->put(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/sql/SQLException; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     .line 122
a=0;//     .end local v12    # "id":Ljava/lang/Object;
a=0;//     :cond_d
a=0;//     #v0=(Conflicted);v12=(Conflicted);v19=(Conflicted);
a=0;//     return v16
a=0;// .end method
}}
