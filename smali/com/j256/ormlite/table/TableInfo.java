package com.j256.ormlite.table; class TableInfo { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/table/TableInfo;
a=0;// .super Ljava/lang/Object;
a=0;// .source "TableInfo.java"
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
a=0;// .field private static final NO_FOREIGN_COLLECTIONS:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final baseDaoImpl:Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/dao/BaseDaoImpl",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final constructor:Ljava/lang/reflect/Constructor;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/lang/reflect/Constructor",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final dataClass:Ljava/lang/Class;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private fieldNameMap:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/j256/ormlite/field/FieldType;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final fieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;// .field private final foreignAutoCreate:Z
a=0;// 
a=0;// .field private final foreignCollections:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;// .field private final idField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;// .field private final tableName:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     sput-object v0, Lcom/j256/ormlite/table/TableInfo;->NO_FOREIGN_COLLECTIONS:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/dao/BaseDaoImpl;Lcom/j256/ormlite/table/DatabaseTableConfig;)V
a=0;//     .locals 10
a=0;//     .param p1, "databaseType"    # Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/db/DatabaseType;",
a=0;//             "Lcom/j256/ormlite/dao/BaseDaoImpl",
a=0;//             "<TT;TID;>;",
a=0;//             "Lcom/j256/ormlite/table/DatabaseTableConfig",
a=0;//             "<TT;>;)V"
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
a=0;//     .line 68
a=0;//     .local p0, "this":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     .local p2, "baseDaoImpl":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p3, "tableConfig":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 69
a=0;//     #p0=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     iput-object p2, p0, Lcom/j256/ormlite/table/TableInfo;->baseDaoImpl:Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     .line 70
a=0;//     invoke-virtual {p3}, Lcom/j256/ormlite/table/DatabaseTableConfig;->getDataClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Class;);
a=0;//     iput-object v7, p0, Lcom/j256/ormlite/table/TableInfo;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     .line 71
a=0;//     invoke-virtual {p3}, Lcom/j256/ormlite/table/DatabaseTableConfig;->getTableName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iput-object v7, p0, Lcom/j256/ormlite/table/TableInfo;->tableName:Ljava/lang/String;
a=0;// 
a=0;//     .line 72
a=0;//     invoke-virtual {p3, p1}, Lcom/j256/ormlite/table/DatabaseTableConfig;->getFieldTypes(Lcom/j256/ormlite/db/DatabaseType;)[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iput-object v7, p0, Lcom/j256/ormlite/table/TableInfo;->fieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .line 74
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 75
a=0;//     .local v2, "findIdFieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 76
a=0;//     .local v3, "foreignAutoCreate":Z
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 77
a=0;//     .local v4, "foreignCollectionCount":I
a=0;//     #v4=(Null);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/table/TableInfo;->fieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .local v0, "arr$":[Lcom/j256/ormlite/field/FieldType;
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     array-length v6, v0
a=0;// 
a=0;//     .local v6, "len$":I
a=0;//     #v6=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .local v5, "i$":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Boolean);v4=(Integer);v5=(Integer);v7=(Conflicted);
a=0;//     if-ge v5, v6, :cond_5
a=0;// 
a=0;//     aget-object v1, v0, v5
a=0;// 
a=0;//     .line 78
a=0;//     .local v1, "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/field/FieldType;->isId()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/field/FieldType;->isGeneratedId()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     if-nez v7, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/field/FieldType;->isGeneratedIdSequence()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     if-eqz v7, :cond_2
a=0;// 
a=0;//     .line 79
a=0;//     :cond_0
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 80
a=0;//     new-instance v7, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "More than 1 idField configured for class "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     iget-object v9, p0, Lcom/j256/ormlite/table/TableInfo;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, " ("
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, ","
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, ")"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 83
a=0;//     :cond_1
a=0;//     #v7=(Boolean);v8=(Uninit);v9=(Uninit);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     .line 85
a=0;//     :cond_2
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/field/FieldType;->isForeignAutoCreate()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     if-eqz v7, :cond_3
a=0;// 
a=0;//     .line 86
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 88
a=0;//     :cond_3
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/field/FieldType;->isForeignCollection()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     if-eqz v7, :cond_4
a=0;// 
a=0;//     .line 89
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     .line 77
a=0;//     :cond_4
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 93
a=0;//     .end local v1    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);v7=(Conflicted);
a=0;//     iput-object v2, p0, Lcom/j256/ormlite/table/TableInfo;->idField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .line 94
a=0;//     invoke-virtual {p3}, Lcom/j256/ormlite/table/DatabaseTableConfig;->getConstructor()Ljava/lang/reflect/Constructor;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/reflect/Constructor;);
a=0;//     iput-object v7, p0, Lcom/j256/ormlite/table/TableInfo;->constructor:Ljava/lang/reflect/Constructor;
a=0;// 
a=0;//     .line 95
a=0;//     iput-boolean v3, p0, Lcom/j256/ormlite/table/TableInfo;->foreignAutoCreate:Z
a=0;// 
a=0;//     .line 96
a=0;//     if-nez v4, :cond_7
a=0;// 
a=0;//     .line 97
a=0;//     sget-object v7, Lcom/j256/ormlite/table/TableInfo;->NO_FOREIGN_COLLECTIONS:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     iput-object v7, p0, Lcom/j256/ormlite/table/TableInfo;->foreignCollections:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .line 108
a=0;//     :cond_6
a=0;//     #v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 99
a=0;//     :cond_7
a=0;//     #v7=(Reference,Ljava/lang/reflect/Constructor;);
a=0;//     new-array v7, v4, [Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     iput-object v7, p0, Lcom/j256/ormlite/table/TableInfo;->foreignCollections:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .line 100
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 101
a=0;//     #v4=(Null);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/table/TableInfo;->fieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     array-length v6, v0
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Integer);v7=(Conflicted);
a=0;//     if-ge v5, v6, :cond_6
a=0;// 
a=0;//     aget-object v1, v0, v5
a=0;// 
a=0;//     .line 102
a=0;//     .restart local v1    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/field/FieldType;->isForeignCollection()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_8
a=0;// 
a=0;//     .line 103
a=0;//     iget-object v7, p0, Lcom/j256/ormlite/table/TableInfo;->foreignCollections:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v7=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     aput-object v1, v7, v4
a=0;// 
a=0;//     .line 104
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     .line 101
a=0;//     :cond_8
a=0;//     #v7=(Conflicted);
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/dao/BaseDaoImpl;Ljava/lang/Class;)V
a=0;//     .locals 2
a=0;//     .param p1, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Lcom/j256/ormlite/dao/BaseDaoImpl",
a=0;//             "<TT;TID;>;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;)V"
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
a=0;//     .local p0, "this":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     .local p2, "baseDaoImpl":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p3, "dataClass":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     invoke-interface {p1}, Lcom/j256/ormlite/support/ConnectionSource;->getDatabaseType()Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     invoke-static {p1, p3}, Lcom/j256/ormlite/table/DatabaseTableConfig;->fromClass(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)Lcom/j256/ormlite/table/DatabaseTableConfig;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/table/DatabaseTableConfig;);
a=0;//     invoke-direct {p0, v0, p2, v1}, Lcom/j256/ormlite/table/TableInfo;-><init>(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/dao/BaseDaoImpl;Lcom/j256/ormlite/table/DatabaseTableConfig;)V
a=0;// 
a=0;//     .line 55
a=0;//     #p0=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static wireNewInstance(Lcom/j256/ormlite/dao/BaseDaoImpl;Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             "ID:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/dao/BaseDaoImpl",
a=0;//             "<TT;TID;>;TT;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 244
a=0;//     .local p0, "baseDaoImpl":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<TT;TID;>;"
a=0;//     .local p1, "instance":Ljava/lang/Object;, "TT;"
a=0;//     instance-of v1, p1, Lcom/j256/ormlite/misc/BaseDaoEnabled;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     move-object v0, p1
a=0;// 
a=0;//     .line 246
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/j256/ormlite/misc/BaseDaoEnabled;
a=0;// 
a=0;//     .line 247
a=0;//     .local v0, "daoEnabled":Lcom/j256/ormlite/misc/BaseDaoEnabled;, "Lcom/j256/ormlite/misc/BaseDaoEnabled<TT;TID;>;"
a=0;//     invoke-virtual {v0, p0}, Lcom/j256/ormlite/misc/BaseDaoEnabled;->setDao(Lcom/j256/ormlite/dao/Dao;)V
a=0;// 
a=0;//     .line 249
a=0;//     .end local v0    # "daoEnabled":Lcom/j256/ormlite/misc/BaseDaoEnabled;, "Lcom/j256/ormlite/misc/BaseDaoEnabled<TT;TID;>;"
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public createObject()Ljava/lang/Object;
a=0;//     .locals 5
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
a=0;//     .line 192
a=0;//     .local p0, "this":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 193
a=0;//     .local v1, "factory":Lcom/j256/ormlite/table/ObjectFactory;, "Lcom/j256/ormlite/table/ObjectFactory<TT;>;"
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/table/TableInfo;->baseDaoImpl:Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/dao/BaseDaoImpl;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 194
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/table/TableInfo;->baseDaoImpl:Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/j256/ormlite/dao/BaseDaoImpl;->getObjectFactory()Lcom/j256/ormlite/table/ObjectFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 196
a=0;//     :cond_0
a=0;//     #v1=(Reference,Lcom/j256/ormlite/table/ObjectFactory;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 197
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/table/TableInfo;->constructor:Ljava/lang/reflect/Constructor;
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 201
a=0;//     .local v2, "instance":Ljava/lang/Object;, "TT;"
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/table/TableInfo;->baseDaoImpl:Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     invoke-static {v3, v2}, Lcom/j256/ormlite/table/TableInfo;->wireNewInstance(Lcom/j256/ormlite/dao/BaseDaoImpl;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 202
a=0;//     return-object v2
a=0;// 
a=0;//     .line 199
a=0;//     .end local v2    # "instance":Ljava/lang/Object;, "TT;"
a=0;//     :cond_1
a=0;//     #v2=(Uninit);v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/table/TableInfo;->constructor:Ljava/lang/reflect/Constructor;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/table/TableInfo;->baseDaoImpl:Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/dao/BaseDaoImpl;);
a=0;//     invoke-virtual {v4}, Lcom/j256/ormlite/dao/BaseDaoImpl;->getDataClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-interface {v1, v3, v4}, Lcom/j256/ormlite/table/ObjectFactory;->createObject(Ljava/lang/reflect/Constructor;Ljava/lang/Class;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .restart local v2    # "instance":Ljava/lang/Object;, "TT;"
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 203
a=0;//     .end local v2    # "instance":Ljava/lang/Object;, "TT;"
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 204
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Could not create object for "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/table/TableInfo;->constructor:Ljava/lang/reflect/Constructor;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3, v0}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     throw v3
a=0;// .end method
a=0;// 
a=0;// .method public getConstructor()Ljava/lang/reflect/Constructor;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/lang/reflect/Constructor",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 166
a=0;//     .local p0, "this":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/table/TableInfo;->constructor:Ljava/lang/reflect/Constructor;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Constructor;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getDataClass()Ljava/lang/Class;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     .local p0, "this":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/table/TableInfo;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getFieldTypeByColumnName(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;
a=0;//     .locals 9
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 135
a=0;//     .local p0, "this":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/table/TableInfo;->fieldNameMap:Ljava/util/Map;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/Map;);
a=0;//     if-nez v6, :cond_1
a=0;// 
a=0;//     .line 137
a=0;//     new-instance v5, Ljava/util/HashMap;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v5}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 138
a=0;//     .local v5, "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;>;"
a=0;//     #v5=(Reference,Ljava/util/HashMap;);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/table/TableInfo;->fieldTypes:[Lcom/j256/ormlite/field/FieldType;
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
a=0;//     #v1=(Conflicted);v3=(Integer);
a=0;//     if-ge v3, v4, :cond_0
a=0;// 
a=0;//     aget-object v1, v0, v3
a=0;// 
a=0;//     .line 139
a=0;//     .local v1, "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/field/FieldType;->getColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-interface {v5, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 138
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 141
a=0;//     .end local v1    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iput-object v5, p0, Lcom/j256/ormlite/table/TableInfo;->fieldNameMap:Ljava/util/Map;
a=0;// 
a=0;//     .line 143
a=0;//     .end local v0    # "arr$":[Lcom/j256/ormlite/field/FieldType;
a=0;//     .end local v3    # "i$":I
a=0;//     .end local v4    # "len$":I
a=0;//     .end local v5    # "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;>;"
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/table/TableInfo;->fieldNameMap:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v6, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .line 145
a=0;//     .restart local v1    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 146
a=0;//     return-object v1
a=0;// 
a=0;//     .line 149
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/table/TableInfo;->fieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .restart local v0    # "arr$":[Lcom/j256/ormlite/field/FieldType;
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     array-length v4, v0
a=0;// 
a=0;//     .restart local v4    # "len$":I
a=0;//     #v4=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .restart local v3    # "i$":I
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Integer);v6=(Conflicted);
a=0;//     if-ge v3, v4, :cond_4
a=0;// 
a=0;//     aget-object v2, v0, v3
a=0;// 
a=0;//     .line 150
a=0;//     .local v2, "fieldType2":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v2}, Lcom/j256/ormlite/field/FieldType;->getFieldName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     .line 151
a=0;//     new-instance v6, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "You should use columnName \'"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/j256/ormlite/field/FieldType;->getColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, "\' for table "
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-object v8, p0, Lcom/j256/ormlite/table/TableInfo;->tableName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, " instead of fieldName \'"
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/j256/ormlite/field/FieldType;->getFieldName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, "\'"
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v6
a=0;// 
a=0;//     .line 149
a=0;//     :cond_3
a=0;//     #v6=(Boolean);v7=(Uninit);v8=(Uninit);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 155
a=0;//     .end local v2    # "fieldType2":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);v6=(Conflicted);
a=0;//     new-instance v6, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "Unknown column name \'"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, "\' in table "
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-object v8, p0, Lcom/j256/ormlite/table/TableInfo;->tableName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v6
a=0;// .end method
a=0;// 
a=0;// .method public getFieldTypes()[Lcom/j256/ormlite/field/FieldType;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 128
a=0;//     .local p0, "this":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/table/TableInfo;->fieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getForeignCollections()[Lcom/j256/ormlite/field/FieldType;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 227
a=0;//     .local p0, "this":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/table/TableInfo;->foreignCollections:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getIdField()Lcom/j256/ormlite/field/FieldType;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 162
a=0;//     .local p0, "this":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/table/TableInfo;->idField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTableName()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 121
a=0;//     .local p0, "this":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/table/TableInfo;->tableName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public hasColumnName(Ljava/lang/String;)Z
a=0;//     .locals 5
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 235
a=0;//     .local p0, "this":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/table/TableInfo;->fieldTypes:[Lcom/j256/ormlite/field/FieldType;
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
a=0;//     .line 236
a=0;//     .local v1, "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/field/FieldType;->getColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 237
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 240
a=0;//     .end local v1    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     return v4
a=0;// 
a=0;//     .line 235
a=0;//     .restart local v1    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_0
a=0;//     #v1=(Null);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 240
a=0;//     .end local v1    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public isForeignAutoCreate()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 220
a=0;//     .local p0, "this":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     iget-boolean v0, p0, Lcom/j256/ormlite/table/TableInfo;->foreignAutoCreate:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isUpdatable()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 213
a=0;//     #v0=(One);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/table/TableInfo;->idField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/table/TableInfo;->fieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v1, v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public objectToString(Ljava/lang/Object;)Ljava/lang/String;
a=0;//     .locals 9
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 173
a=0;//     .local p0, "this":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     .local p1, "object":Ljava/lang/Object;, "TT;"
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v6, 0x40
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 174
a=0;//     .local v5, "sb":Ljava/lang/StringBuilder;
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 175
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/table/TableInfo;->fieldTypes:[Lcom/j256/ormlite/field/FieldType;
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
a=0;//     #v2=(Conflicted);v3=(Integer);v7=(Conflicted);
a=0;//     if-ge v3, v4, :cond_0
a=0;// 
a=0;//     aget-object v2, v0, v3
a=0;// 
a=0;//     .line 176
a=0;//     .local v2, "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v2=(Null);
a=0;//     const/16 v6, 0x20
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2}, Lcom/j256/ormlite/field/FieldType;->getColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "="
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 178
a=0;//     :try_start_0
a=0;//     invoke-virtual {v2, p1}, Lcom/j256/ormlite/field/FieldType;->extractJavaFieldValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 175
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 179
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 180
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v6, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "Could not generate toString of field "
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v6, v7, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v6
a=0;// 
a=0;//     .line 183
a=0;//     .end local v1    # "e":Ljava/lang/Exception;
a=0;//     .end local v2    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Conflicted);v7=(Conflicted);v8=(Uninit);
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     return-object v6
a=0;// .end method
}}
