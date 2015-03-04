package com.j256.ormlite.field; class FieldType { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/field/FieldType;
a=0;// .super Ljava/lang/Object;
a=0;// .source "FieldType.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/j256/ormlite/field/FieldType$LevelCounters;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static DEFAULT_VALUE_BOOLEAN:Z = false
a=0;// 
a=0;// .field private static DEFAULT_VALUE_BYTE:B = 0x0t
a=0;// 
a=0;// .field private static DEFAULT_VALUE_CHAR:C = '\u0000'
a=0;// 
a=0;// .field private static DEFAULT_VALUE_DOUBLE:D = 0.0
a=0;// 
a=0;// .field private static DEFAULT_VALUE_FLOAT:F = 0.0f
a=0;// 
a=0;// .field private static DEFAULT_VALUE_INT:I = 0x0
a=0;// 
a=0;// .field private static DEFAULT_VALUE_LONG:J = 0x0L
a=0;// 
a=0;// .field private static DEFAULT_VALUE_SHORT:S = 0x0s
a=0;// 
a=0;// .field public static final FOREIGN_ID_FIELD_SUFFIX:Ljava/lang/String; = "_id"
a=0;// 
a=0;// .field private static final threadLevelCounters:Ljava/lang/ThreadLocal;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/lang/ThreadLocal",
a=0;//             "<",
a=0;//             "Lcom/j256/ormlite/field/FieldType$LevelCounters;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final columnName:Ljava/lang/String;
a=0;// 
a=0;// .field private final connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;// .field private dataPersister:Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;// .field private dataTypeConfigObj:Ljava/lang/Object;
a=0;// 
a=0;// .field private defaultValue:Ljava/lang/Object;
a=0;// 
a=0;// .field private final field:Ljava/lang/reflect/Field;
a=0;// 
a=0;// .field private final fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;// .field private fieldConverter:Lcom/j256/ormlite/field/FieldConverter;
a=0;// 
a=0;// .field private final fieldGetMethod:Ljava/lang/reflect/Method;
a=0;// 
a=0;// .field private final fieldSetMethod:Ljava/lang/reflect/Method;
a=0;// 
a=0;// .field private foreignDao:Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/dao/BaseDaoImpl",
a=0;//             "<**>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private foreignFieldType:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;// .field private foreignIdField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;// .field private foreignTableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/table/TableInfo",
a=0;//             "<**>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final generatedIdSequence:Ljava/lang/String;
a=0;// 
a=0;// .field private final isGeneratedId:Z
a=0;// 
a=0;// .field private final isId:Z
a=0;// 
a=0;// .field private mappedQueryForId:Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/stmt/mapped/MappedQueryForId",
a=0;//             "<",
a=0;//             "Ljava/lang/Object;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final tableName:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     new-instance v0, Lcom/j256/ormlite/field/FieldType$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/field/FieldType$1;);
a=0;//     invoke-direct {v0}, Lcom/j256/ormlite/field/FieldType$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/FieldType$1;);
a=0;//     sput-object v0, Lcom/j256/ormlite/field/FieldType;->threadLevelCounters:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/String;Ljava/lang/reflect/Field;Lcom/j256/ormlite/field/DatabaseFieldConfig;Ljava/lang/Class;)V
a=0;//     .locals 17
a=0;//     .param p1, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .param p2, "tableName"    # Ljava/lang/String;
a=0;//     .param p3, "field"    # Ljava/lang/reflect/Field;
a=0;//     .param p4, "fieldConfig"    # Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/reflect/Field;",
a=0;//             "Lcom/j256/ormlite/field/DatabaseFieldConfig;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;)V"
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
a=0;//     .line 89
a=0;//     .local p5, "parentClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 90
a=0;//     #p0=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     iput-object v0, v1, Lcom/j256/ormlite/field/FieldType;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     .line 91
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput-object v0, v1, Lcom/j256/ormlite/field/FieldType;->tableName:Ljava/lang/String;
a=0;// 
a=0;//     .line 92
a=0;//     invoke-interface/range {p1 .. p1}, Lcom/j256/ormlite/support/ConnectionSource;->getDatabaseType()Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 93
a=0;//     .local v4, "databaseType":Lcom/j256/ormlite/db/DatabaseType;
a=0;//     #v4=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput-object v0, v1, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     .line 96
a=0;//     invoke-virtual/range {p4 .. p4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->postProcess()V
a=0;// 
a=0;//     .line 98
a=0;//     invoke-virtual/range {p3 .. p3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 100
a=0;//     .local v2, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual/range {p4 .. p4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getDataPersister()Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Lcom/j256/ormlite/field/DataPersister;);
a=0;//     if-nez v14, :cond_5
a=0;// 
a=0;//     .line 101
a=0;//     invoke-virtual/range {p4 .. p4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getPersisterClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 102
a=0;//     .local v10, "persisterClass":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/j256/ormlite/field/DataPersister;>;"
a=0;//     #v10=(Reference,Ljava/lang/Class;);
a=0;//     if-eqz v10, :cond_0
a=0;// 
a=0;//     const-class v14, Lcom/j256/ormlite/field/types/VoidType;
a=0;// 
a=0;//     if-ne v10, v14, :cond_3
a=0;// 
a=0;//     .line 103
a=0;//     :cond_0
a=0;//     invoke-static/range {p3 .. p3}, Lcom/j256/ormlite/field/DataPersisterManager;->lookupForField(Ljava/lang/reflect/Field;)Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 140
a=0;//     .end local v10    # "persisterClass":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/j256/ormlite/field/DataPersister;>;"
a=0;//     .local v3, "dataPersister":Lcom/j256/ormlite/field/DataPersister;
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v3=(Reference,Lcom/j256/ormlite/field/DataPersister;);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     invoke-virtual/range {p4 .. p4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getForeignColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 141
a=0;//     .local v7, "foreignColumnName":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {p3 .. p3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 142
a=0;//     .local v5, "defaultFieldName":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {p4 .. p4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeign()Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-nez v14, :cond_2
a=0;// 
a=0;//     invoke-virtual/range {p4 .. p4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeignAutoRefresh()Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     if-nez v14, :cond_2
a=0;// 
a=0;//     if-eqz v7, :cond_8
a=0;// 
a=0;//     .line 143
a=0;//     :cond_2
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     invoke-interface {v3}, Lcom/j256/ormlite/field/DataPersister;->isPrimitive()Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     if-eqz v14, :cond_6
a=0;// 
a=0;//     .line 144
a=0;//     new-instance v14, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "Field "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, " is a primitive class "
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, " but marked as foreign"
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-direct {v14, v15}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v14
a=0;// 
a=0;//     .line 107
a=0;//     .end local v3    # "dataPersister":Lcom/j256/ormlite/field/DataPersister;
a=0;//     .end local v5    # "defaultFieldName":Ljava/lang/String;
a=0;//     .end local v7    # "foreignColumnName":Ljava/lang/String;
a=0;//     .restart local v10    # "persisterClass":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/j256/ormlite/field/DataPersister;>;"
a=0;//     :cond_3
a=0;//     :try_start_0
a=0;//     #v3=(Uninit);v5=(Uninit);v7=(Uninit);v9=(Uninit);v10=(Reference,Ljava/lang/Class;);v11=(Uninit);v15=(Uninit);v16=(Uninit);
a=0;//     const-string v14, "getSingleton"
a=0;// 
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     #v15=(Null);
a=0;//     new-array v15, v15, [Ljava/lang/Class;
a=0;// 
a=0;//     #v15=(Reference,[Ljava/lang/Class;);
a=0;//     invoke-virtual {v10, v14, v15}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 114
a=0;//     .local v9, "method":Ljava/lang/reflect/Method;
a=0;//     #v9=(Reference,Ljava/lang/reflect/Method;);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v15=(Null);
a=0;//     new-array v15, v15, [Ljava/lang/Object;
a=0;// 
a=0;//     #v15=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v9, v14, v15}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 121
a=0;//     .local v11, "result":Ljava/lang/Object;
a=0;//     #v11=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v11, :cond_4
a=0;// 
a=0;//     .line 122
a=0;//     new-instance v14, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "Static getSingleton method should not return null on class "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-direct {v14, v15}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v14
a=0;// 
a=0;//     .line 108
a=0;//     .end local v9    # "method":Ljava/lang/reflect/Method;
a=0;//     .end local v11    # "result":Ljava/lang/Object;
a=0;//     :catch_0
a=0;//     #v9=(Uninit);v11=(Uninit);v15=(Conflicted);v16=(Uninit);
a=0;//     move-exception v6
a=0;// 
a=0;//     .line 109
a=0;//     .local v6, "e":Ljava/lang/Exception;
a=0;//     #v6=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v14, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v15, "Could not find getSingleton static method on class "
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-static {v14, v6}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     throw v14
a=0;// 
a=0;//     .line 115
a=0;//     .end local v6    # "e":Ljava/lang/Exception;
a=0;//     .restart local v9    # "method":Ljava/lang/reflect/Method;
a=0;//     :catch_1
a=0;//     #v6=(Uninit);v9=(Reference,Ljava/lang/reflect/Method;);v14=(Null);
a=0;//     move-exception v6
a=0;// 
a=0;//     .line 116
a=0;//     .local v6, "e":Ljava/lang/reflect/InvocationTargetException;
a=0;//     #v6=(Reference,Ljava/lang/reflect/InvocationTargetException;);
a=0;//     new-instance v14, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v15, "Could not run getSingleton method on class "
a=0;// 
a=0;//     invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-static {v14, v15}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     throw v14
a=0;// 
a=0;//     .line 118
a=0;//     .end local v6    # "e":Ljava/lang/reflect/InvocationTargetException;
a=0;//     :catch_2
a=0;//     #v6=(Uninit);v14=(Null);
a=0;//     move-exception v6
a=0;// 
a=0;//     .line 119
a=0;//     .local v6, "e":Ljava/lang/Exception;
a=0;//     #v6=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v14, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v15, "Could not run getSingleton method on class "
a=0;// 
a=0;//     invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-static {v14, v6}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     throw v14
a=0;// 
a=0;//     .line 126
a=0;//     .end local v6    # "e":Ljava/lang/Exception;
a=0;//     .restart local v11    # "result":Ljava/lang/Object;
a=0;//     :cond_4
a=0;//     :try_start_2
a=0;//     #v6=(Uninit);v11=(Reference,Ljava/lang/Object;);v14=(Null);
a=0;//     move-object v0, v11
a=0;// 
a=0;//     check-cast v0, Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     move-object v3, v0
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
a=0;// 
a=0;//     .restart local v3    # "dataPersister":Lcom/j256/ormlite/field/DataPersister;
a=0;//     #v3=(Reference,Lcom/j256/ormlite/field/DataPersister;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 127
a=0;//     .end local v3    # "dataPersister":Lcom/j256/ormlite/field/DataPersister;
a=0;//     :catch_3
a=0;//     #v3=(Uninit);
a=0;//     move-exception v6
a=0;// 
a=0;//     .line 128
a=0;//     .restart local v6    # "e":Ljava/lang/Exception;
a=0;//     #v6=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v14, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v15, "Could not cast result of static getSingleton method to DataPersister from class "
a=0;// 
a=0;//     invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-static {v14, v6}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     throw v14
a=0;// 
a=0;//     .line 134
a=0;//     .end local v6    # "e":Ljava/lang/Exception;
a=0;//     .end local v9    # "method":Ljava/lang/reflect/Method;
a=0;//     .end local v10    # "persisterClass":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/j256/ormlite/field/DataPersister;>;"
a=0;//     .end local v11    # "result":Ljava/lang/Object;
a=0;//     :cond_5
a=0;//     #v6=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v15=(Uninit);
a=0;//     invoke-virtual/range {p4 .. p4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getDataPersister()Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 135
a=0;//     .restart local v3    # "dataPersister":Lcom/j256/ormlite/field/DataPersister;
a=0;//     #v3=(Reference,Lcom/j256/ormlite/field/DataPersister;);
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     invoke-interface {v3, v0}, Lcom/j256/ormlite/field/DataPersister;->isValidForField(Ljava/lang/reflect/Field;)Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-nez v14, :cond_1
a=0;// 
a=0;//     .line 136
a=0;//     new-instance v14, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "Field class "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, " for field "
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, " is not valid for data persister "
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-direct {v14, v15}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v14
a=0;// 
a=0;//     .line 147
a=0;//     .restart local v5    # "defaultFieldName":Ljava/lang/String;
a=0;//     .restart local v7    # "foreignColumnName":Ljava/lang/String;
a=0;//     :cond_6
a=0;//     #v5=(Reference,Ljava/lang/String;);v7=(Reference,Ljava/lang/String;);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v14=(Boolean);v15=(Conflicted);v16=(Uninit);
a=0;//     if-nez v7, :cond_7
a=0;// 
a=0;//     .line 148
a=0;//     new-instance v14, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     const-string v15, "_id"
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 152
a=0;//     :goto_1
a=0;//     const-class v14, Lcom/j256/ormlite/dao/ForeignCollection;
a=0;// 
a=0;//     invoke-virtual {v14, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-eqz v14, :cond_e
a=0;// 
a=0;//     .line 153
a=0;//     new-instance v14, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "Field \'"
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual/range {p3 .. p3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "\' in class "
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "\' should use the @"
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-class v16, Lcom/j256/ormlite/field/ForeignCollectionField;
a=0;// 
a=0;//     invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, " annotation not foreign=true"
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-direct {v14, v15}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v14
a=0;// 
a=0;//     .line 150
a=0;//     :cond_7
a=0;//     #v14=(Boolean);v15=(Conflicted);v16=(Uninit);
a=0;//     new-instance v14, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     const-string v15, "_"
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 156
a=0;//     :cond_8
a=0;//     #v14=(Boolean);v15=(Conflicted);
a=0;//     invoke-virtual/range {p4 .. p4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeignCollection()Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     if-eqz v14, :cond_b
a=0;// 
a=0;//     .line 157
a=0;//     const-class v14, Ljava/util/Collection;
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/Class;);
a=0;//     if-eq v2, v14, :cond_9
a=0;// 
a=0;//     const-class v14, Lcom/j256/ormlite/dao/ForeignCollection;
a=0;// 
a=0;//     invoke-virtual {v14, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-nez v14, :cond_9
a=0;// 
a=0;//     .line 158
a=0;//     new-instance v14, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "Field class for \'"
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual/range {p3 .. p3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "\' must be of class "
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-class v16, Lcom/j256/ormlite/dao/ForeignCollection;
a=0;// 
a=0;//     invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, " or Collection."
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-direct {v14, v15}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v14
a=0;// 
a=0;//     .line 161
a=0;//     :cond_9
a=0;//     #v14=(Conflicted);v15=(Conflicted);v16=(Uninit);
a=0;//     invoke-virtual/range {p3 .. p3}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 162
a=0;//     .local v13, "type":Ljava/lang/reflect/Type;
a=0;//     #v13=(Reference,Ljava/lang/reflect/Type;);
a=0;//     instance-of v14, v13, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-nez v14, :cond_a
a=0;// 
a=0;//     .line 163
a=0;//     new-instance v14, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "Field class for \'"
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual/range {p3 .. p3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "\' must be a parameterized Collection."
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-direct {v14, v15}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v14
a=0;// 
a=0;//     .line 165
a=0;//     :cond_a
a=0;//     #v14=(Boolean);v15=(Conflicted);v16=(Uninit);
a=0;//     check-cast v13, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     .end local v13    # "type":Ljava/lang/reflect/Type;
a=0;//     invoke-interface {v13}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 166
a=0;//     .local v8, "genericArguments":[Ljava/lang/reflect/Type;
a=0;//     #v8=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     array-length v14, v8
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     if-nez v14, :cond_e
a=0;// 
a=0;//     .line 168
a=0;//     new-instance v14, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "Field class for \'"
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual/range {p3 .. p3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "\' must be a parameterized Collection with at least 1 type."
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-direct {v14, v15}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v14
a=0;// 
a=0;//     .line 171
a=0;//     .end local v8    # "genericArguments":[Ljava/lang/reflect/Type;
a=0;//     :cond_b
a=0;//     #v8=(Uninit);v13=(Uninit);v14=(Boolean);v15=(Conflicted);v16=(Uninit);
a=0;//     if-nez v3, :cond_e
a=0;// 
a=0;//     invoke-virtual/range {p4 .. p4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeignCollection()Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     if-nez v14, :cond_e
a=0;// 
a=0;//     .line 172
a=0;//     const-class v14, [B
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v14, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-eqz v14, :cond_c
a=0;// 
a=0;//     .line 173
a=0;//     new-instance v14, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "ORMLite can\'t store unknown class "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, " for field \'"
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual/range {p3 .. p3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "\'. byte[] fields must specify dataType=DataType.BYTE_ARRAY or SERIALIZABLE"
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-direct {v14, v15}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v14
a=0;// 
a=0;//     .line 175
a=0;//     :cond_c
a=0;//     #v14=(Boolean);v15=(Conflicted);v16=(Uninit);
a=0;//     const-class v14, Ljava/io/Serializable;
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v14, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-eqz v14, :cond_d
a=0;// 
a=0;//     .line 176
a=0;//     new-instance v14, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "ORMLite can\'t store unknown class "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, " for field \'"
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual/range {p3 .. p3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "\'. Serializable fields must specify dataType=DataType.SERIALIZABLE"
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-direct {v14, v15}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v14
a=0;// 
a=0;//     .line 179
a=0;//     :cond_d
a=0;//     #v14=(Boolean);v15=(Conflicted);v16=(Uninit);
a=0;//     new-instance v14, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "ORMLite does not know how to store field class "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, " for field "
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-direct {v14, v15}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v14
a=0;// 
a=0;//     .line 183
a=0;//     :cond_e
a=0;//     #v8=(Conflicted);v13=(Conflicted);v14=(Integer);v15=(Conflicted);v16=(Uninit);
a=0;//     invoke-virtual/range {p4 .. p4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     if-nez v14, :cond_10
a=0;// 
a=0;//     .line 184
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v5, v0, Lcom/j256/ormlite/field/FieldType;->columnName:Ljava/lang/String;
a=0;// 
a=0;//     .line 188
a=0;//     :goto_2
a=0;//     move-object/from16 v0, p4
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput-object v0, v1, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     .line 189
a=0;//     invoke-virtual/range {p4 .. p4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isId()Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-eqz v14, :cond_13
a=0;// 
a=0;//     .line 190
a=0;//     invoke-virtual/range {p4 .. p4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isGeneratedId()Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     if-nez v14, :cond_f
a=0;// 
a=0;//     invoke-virtual/range {p4 .. p4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getGeneratedIdSequence()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v14, :cond_11
a=0;// 
a=0;//     .line 191
a=0;//     :cond_f
a=0;//     #v14=(Conflicted);
a=0;//     new-instance v14, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "Must specify one of id, generatedId, and generatedIdSequence with "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual/range {p3 .. p3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-direct {v14, v15}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v14
a=0;// 
a=0;//     .line 186
a=0;//     :cond_10
a=0;//     #v15=(Conflicted);v16=(Uninit);
a=0;//     invoke-virtual/range {p4 .. p4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v14, v0, Lcom/j256/ormlite/field/FieldType;->columnName:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 194
a=0;//     :cond_11
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     #v14=(One);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-boolean v14, v0, Lcom/j256/ormlite/field/FieldType;->isId:Z
a=0;// 
a=0;//     .line 195
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-boolean v14, v0, Lcom/j256/ormlite/field/FieldType;->isGeneratedId:Z
a=0;// 
a=0;//     .line 196
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v14, v0, Lcom/j256/ormlite/field/FieldType;->generatedIdSequence:Ljava/lang/String;
a=0;// 
a=0;//     .line 222
a=0;//     :goto_3
a=0;//     #v12=(Conflicted);v14=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v14, v0, Lcom/j256/ormlite/field/FieldType;->isId:Z
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-eqz v14, :cond_19
a=0;// 
a=0;//     invoke-virtual/range {p4 .. p4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeign()Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     if-nez v14, :cond_12
a=0;// 
a=0;//     invoke-virtual/range {p4 .. p4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeignAutoRefresh()Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     if-eqz v14, :cond_19
a=0;// 
a=0;//     .line 223
a=0;//     :cond_12
a=0;//     new-instance v14, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "Id field "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual/range {p3 .. p3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, " cannot also be a foreign object"
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-direct {v14, v15}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v14
a=0;// 
a=0;//     .line 197
a=0;//     :cond_13
a=0;//     #v12=(Uninit);v14=(Boolean);v15=(Conflicted);v16=(Uninit);
a=0;//     invoke-virtual/range {p4 .. p4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isGeneratedId()Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     if-eqz v14, :cond_16
a=0;// 
a=0;//     .line 198
a=0;//     invoke-virtual/range {p4 .. p4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getGeneratedIdSequence()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v14, :cond_14
a=0;// 
a=0;//     .line 199
a=0;//     new-instance v14, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "Must specify one of id, generatedId, and generatedIdSequence with "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual/range {p3 .. p3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-direct {v14, v15}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v14
a=0;// 
a=0;//     .line 202
a=0;//     :cond_14
a=0;//     #v15=(Conflicted);v16=(Uninit);
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     #v14=(One);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-boolean v14, v0, Lcom/j256/ormlite/field/FieldType;->isId:Z
a=0;// 
a=0;//     .line 203
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-boolean v14, v0, Lcom/j256/ormlite/field/FieldType;->isGeneratedId:Z
a=0;// 
a=0;//     .line 204
a=0;//     invoke-interface {v4}, Lcom/j256/ormlite/db/DatabaseType;->isIdSequenceNeeded()Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-eqz v14, :cond_15
a=0;// 
a=0;//     .line 205
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     invoke-interface {v4, v0, v1}, Lcom/j256/ormlite/db/DatabaseType;->generateIdSequenceName(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v14, v0, Lcom/j256/ormlite/field/FieldType;->generatedIdSequence:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 207
a=0;//     :cond_15
a=0;//     #v14=(Boolean);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v14, v0, Lcom/j256/ormlite/field/FieldType;->generatedIdSequence:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 209
a=0;//     :cond_16
a=0;//     #v14=(Boolean);
a=0;//     invoke-virtual/range {p4 .. p4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getGeneratedIdSequence()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v14, :cond_18
a=0;// 
a=0;//     .line 210
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     #v14=(One);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-boolean v14, v0, Lcom/j256/ormlite/field/FieldType;->isId:Z
a=0;// 
a=0;//     .line 211
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-boolean v14, v0, Lcom/j256/ormlite/field/FieldType;->isGeneratedId:Z
a=0;// 
a=0;//     .line 212
a=0;//     invoke-virtual/range {p4 .. p4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getGeneratedIdSequence()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 213
a=0;//     .local v12, "seqName":Ljava/lang/String;
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v4}, Lcom/j256/ormlite/db/DatabaseType;->isEntityNamesMustBeUpCase()Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-eqz v14, :cond_17
a=0;// 
a=0;//     .line 214
a=0;//     invoke-virtual {v12}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 216
a=0;//     :cond_17
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v12, v0, Lcom/j256/ormlite/field/FieldType;->generatedIdSequence:Ljava/lang/String;
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 218
a=0;//     .end local v12    # "seqName":Ljava/lang/String;
a=0;//     :cond_18
a=0;//     #v12=(Uninit);v14=(Reference,Ljava/lang/String;);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-boolean v14, v0, Lcom/j256/ormlite/field/FieldType;->isId:Z
a=0;// 
a=0;//     .line 219
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-boolean v14, v0, Lcom/j256/ormlite/field/FieldType;->isGeneratedId:Z
a=0;// 
a=0;//     .line 220
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v14, v0, Lcom/j256/ormlite/field/FieldType;->generatedIdSequence:Ljava/lang/String;
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 225
a=0;//     :cond_19
a=0;//     #v12=(Conflicted);v14=(Boolean);
a=0;//     invoke-virtual/range {p4 .. p4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isUseGetSet()Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     if-eqz v14, :cond_1a
a=0;// 
a=0;//     .line 226
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     #v14=(One);
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     invoke-static {v0, v14}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->findGetMethod(Ljava/lang/reflect/Field;Z)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/reflect/Method;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v14, v0, Lcom/j256/ormlite/field/FieldType;->fieldGetMethod:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     .line 227
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     #v14=(One);
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     invoke-static {v0, v14}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->findSetMethod(Ljava/lang/reflect/Field;Z)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/reflect/Method;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v14, v0, Lcom/j256/ormlite/field/FieldType;->fieldSetMethod:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     .line 240
a=0;//     :goto_4
a=0;//     invoke-virtual/range {p4 .. p4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isAllowGeneratedIdInsert()Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-eqz v14, :cond_1c
a=0;// 
a=0;//     invoke-virtual/range {p4 .. p4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isGeneratedId()Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     if-nez v14, :cond_1c
a=0;// 
a=0;//     .line 241
a=0;//     new-instance v14, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "Field "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual/range {p3 .. p3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, " must be a generated-id if allowGeneratedIdInsert = true"
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-direct {v14, v15}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v14
a=0;// 
a=0;//     .line 229
a=0;//     :cond_1a
a=0;//     #v14=(Boolean);v15=(Conflicted);v16=(Uninit);
a=0;//     invoke-virtual/range {p3 .. p3}, Ljava/lang/reflect/Field;->isAccessible()Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     if-nez v14, :cond_1b
a=0;// 
a=0;//     .line 231
a=0;//     :try_start_3
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/reflect/Field;);
a=0;//     const/4 v15, 0x1
a=0;// 
a=0;//     #v15=(One);
a=0;//     invoke-virtual {v14, v15}, Ljava/lang/reflect/Field;->setAccessible(Z)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_4
a=0;// 
a=0;//     .line 237
a=0;//     :cond_1b
a=0;//     #v14=(Conflicted);v15=(Conflicted);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v14, v0, Lcom/j256/ormlite/field/FieldType;->fieldGetMethod:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     .line 238
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v14, v0, Lcom/j256/ormlite/field/FieldType;->fieldSetMethod:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 232
a=0;//     :catch_4
a=0;//     #v14=(Conflicted);
a=0;//     move-exception v6
a=0;// 
a=0;//     .line 233
a=0;//     .local v6, "e":Ljava/lang/SecurityException;
a=0;//     #v6=(Reference,Ljava/lang/SecurityException;);
a=0;//     new-instance v14, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "Could not open access to field "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual/range {p3 .. p3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, ".  You may have to set useGetSet=true to fix."
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-direct {v14, v15}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v14
a=0;// 
a=0;//     .line 244
a=0;//     .end local v6    # "e":Ljava/lang/SecurityException;
a=0;//     :cond_1c
a=0;//     #v6=(Uninit);v14=(Boolean);v15=(Conflicted);v16=(Uninit);
a=0;//     invoke-virtual/range {p4 .. p4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeignAutoRefresh()Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     if-eqz v14, :cond_1d
a=0;// 
a=0;//     invoke-virtual/range {p4 .. p4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeign()Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     if-nez v14, :cond_1d
a=0;// 
a=0;//     .line 245
a=0;//     new-instance v14, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "Field "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual/range {p3 .. p3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, " must have foreign = true if foreignAutoRefresh = true"
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-direct {v14, v15}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v14
a=0;// 
a=0;//     .line 248
a=0;//     :cond_1d
a=0;//     #v14=(Boolean);v15=(Conflicted);v16=(Uninit);
a=0;//     invoke-virtual/range {p4 .. p4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeignAutoCreate()Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     if-eqz v14, :cond_1e
a=0;// 
a=0;//     invoke-virtual/range {p4 .. p4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeign()Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     if-nez v14, :cond_1e
a=0;// 
a=0;//     .line 249
a=0;//     new-instance v14, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "Field "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual/range {p3 .. p3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, " must have foreign = true if foreignAutoCreate = true"
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-direct {v14, v15}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v14
a=0;// 
a=0;//     .line 252
a=0;//     :cond_1e
a=0;//     #v14=(Boolean);v15=(Conflicted);v16=(Uninit);
a=0;//     invoke-virtual/range {p4 .. p4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getForeignColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v14, :cond_1f
a=0;// 
a=0;//     invoke-virtual/range {p4 .. p4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeign()Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-nez v14, :cond_1f
a=0;// 
a=0;//     .line 253
a=0;//     new-instance v14, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "Field "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual/range {p3 .. p3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, " must have foreign = true if foreignColumnName is set"
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-direct {v14, v15}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v14
a=0;// 
a=0;//     .line 256
a=0;//     :cond_1f
a=0;//     #v14=(Conflicted);v15=(Conflicted);v16=(Uninit);
a=0;//     invoke-virtual/range {p4 .. p4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isVersion()Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-eqz v14, :cond_21
a=0;// 
a=0;//     if-eqz v3, :cond_20
a=0;// 
a=0;//     invoke-interface {v3}, Lcom/j256/ormlite/field/DataPersister;->isValidForVersion()Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     if-nez v14, :cond_21
a=0;// 
a=0;//     .line 257
a=0;//     :cond_20
a=0;//     new-instance v14, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "Field "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual/range {p3 .. p3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, " is not a valid type to be a version field"
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-direct {v14, v15}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v14
a=0;// 
a=0;//     .line 260
a=0;//     :cond_21
a=0;//     #v14=(Boolean);v15=(Conflicted);v16=(Uninit);
a=0;//     invoke-virtual/range {p4 .. p4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getMaxForeignAutoRefreshLevel()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     if-lez v14, :cond_22
a=0;// 
a=0;//     invoke-virtual/range {p4 .. p4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeignAutoRefresh()Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-nez v14, :cond_22
a=0;// 
a=0;//     .line 261
a=0;//     new-instance v14, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "Field "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual/range {p3 .. p3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, " has maxForeignAutoRefreshLevel set but not foreignAutoRefresh is false"
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-direct {v14, v15}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v14
a=0;// 
a=0;//     .line 264
a=0;//     :cond_22
a=0;//     #v14=(Integer);v15=(Conflicted);v16=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v0, v4, v3}, Lcom/j256/ormlite/field/FieldType;->assignDataType(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/field/DataPersister;)V
a=0;// 
a=0;//     .line 265
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private assignDataType(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/field/DataPersister;)V
a=0;//     .locals 10
a=0;//     .param p1, "databaseType"    # Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .param p2, "dataPersister"    # Lcom/j256/ormlite/field/DataPersister;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 995
a=0;//     iput-object p2, p0, Lcom/j256/ormlite/field/FieldType;->dataPersister:Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     .line 996
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 997
a=0;//     iget-object v7, p0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     #v7=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     invoke-virtual {v7}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeign()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_7
a=0;// 
a=0;//     iget-object v7, p0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     #v7=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     invoke-virtual {v7}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeignCollection()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_7
a=0;// 
a=0;//     .line 999
a=0;//     new-instance v7, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "Data persister for field "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, " is null but the field is not a foreign or foreignCollection"
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
a=0;//     .line 1004
a=0;//     :cond_0
a=0;//     #v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     invoke-interface {p1, p2}, Lcom/j256/ormlite/db/DatabaseType;->getFieldConverter(Lcom/j256/ormlite/field/DataPersister;)Lcom/j256/ormlite/field/FieldConverter;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Lcom/j256/ormlite/field/FieldConverter;);
a=0;//     iput-object v7, p0, Lcom/j256/ormlite/field/FieldType;->fieldConverter:Lcom/j256/ormlite/field/FieldConverter;
a=0;// 
a=0;//     .line 1005
a=0;//     iget-boolean v7, p0, Lcom/j256/ormlite/field/FieldType;->isGeneratedId:Z
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_3
a=0;// 
a=0;//     invoke-interface {p2}, Lcom/j256/ormlite/field/DataPersister;->isValidGeneratedType()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     if-nez v7, :cond_3
a=0;// 
a=0;//     .line 1006
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 1007
a=0;//     .local v6, "sb":Ljava/lang/StringBuilder;
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "Generated-id field \'"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-object v8, p0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/reflect/Field;);
a=0;//     invoke-virtual {v8}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 1008
a=0;//     const-string v7, "\' in "
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-object v8, p0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 1009
a=0;//     const-string v7, " can\'t be type "
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-object v8, p0, Lcom/j256/ormlite/field/FieldType;->dataPersister:Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     invoke-interface {v8}, Lcom/j256/ormlite/field/DataPersister;->getSqlType()Lcom/j256/ormlite/field/SqlType;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 1010
a=0;//     const-string v7, ".  Must be one of: "
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 1011
a=0;//     invoke-static {}, Lcom/j256/ormlite/field/DataType;->values()[Lcom/j256/ormlite/field/DataType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "arr$":[Lcom/j256/ormlite/field/DataType;
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/field/DataType;);
a=0;//     array-length v4, v0
a=0;// 
a=0;//     .local v4, "len$":I
a=0;//     #v4=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i$":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Integer);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     if-ge v3, v4, :cond_2
a=0;// 
a=0;//     aget-object v1, v0, v3
a=0;// 
a=0;//     .line 1012
a=0;//     .local v1, "dataType":Lcom/j256/ormlite/field/DataType;
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/field/DataType;->getDataPersister()Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1013
a=0;//     .local v5, "persister":Lcom/j256/ormlite/field/DataPersister;
a=0;//     #v5=(Reference,Lcom/j256/ormlite/field/DataPersister;);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     invoke-interface {v5}, Lcom/j256/ormlite/field/DataPersister;->isValidGeneratedType()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     .line 1014
a=0;//     invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/16 v8, 0x20
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 1011
a=0;//     :cond_1
a=0;//     #v7=(Conflicted);v8=(Conflicted);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1017
a=0;//     .end local v1    # "dataType":Lcom/j256/ormlite/field/DataType;
a=0;//     .end local v5    # "persister":Lcom/j256/ormlite/field/DataPersister;
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v5=(Conflicted);
a=0;//     new-instance v7, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 1019
a=0;//     .end local v0    # "arr$":[Lcom/j256/ormlite/field/DataType;
a=0;//     .end local v3    # "i$":I
a=0;//     .end local v4    # "len$":I
a=0;//     .end local v6    # "sb":Ljava/lang/StringBuilder;
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Boolean);v8=(Uninit);
a=0;//     iget-object v7, p0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     #v7=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     invoke-virtual {v7}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isThrowIfNull()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_4
a=0;// 
a=0;//     invoke-interface {p2}, Lcom/j256/ormlite/field/DataPersister;->isPrimitive()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     if-nez v7, :cond_4
a=0;// 
a=0;//     .line 1020
a=0;//     new-instance v7, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "Field "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     iget-object v9, p0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, " must be a primitive if set with throwIfNull"
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
a=0;//     .line 1022
a=0;//     :cond_4
a=0;//     #v7=(Boolean);v8=(Uninit);v9=(Uninit);
a=0;//     iget-boolean v7, p0, Lcom/j256/ormlite/field/FieldType;->isId:Z
a=0;// 
a=0;//     if-eqz v7, :cond_5
a=0;// 
a=0;//     invoke-interface {p2}, Lcom/j256/ormlite/field/DataPersister;->isAppropriateId()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     if-nez v7, :cond_5
a=0;// 
a=0;//     .line 1023
a=0;//     new-instance v7, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "Field \'"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     iget-object v9, p0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "\' is of data type "
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, " which cannot be the ID field"
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
a=0;//     .line 1026
a=0;//     :cond_5
a=0;//     #v7=(Boolean);v8=(Uninit);v9=(Uninit);
a=0;//     invoke-interface {p2, p0}, Lcom/j256/ormlite/field/DataPersister;->makeConfigObject(Lcom/j256/ormlite/field/FieldType;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     iput-object v7, p0, Lcom/j256/ormlite/field/FieldType;->dataTypeConfigObj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 1027
a=0;//     iget-object v7, p0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getDefaultValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1028
a=0;//     .local v2, "defaultStr":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     const-string v7, ""
a=0;// 
a=0;//     invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_8
a=0;// 
a=0;//     .line 1029
a=0;//     :cond_6
a=0;//     #v7=(Conflicted);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     iput-object v7, p0, Lcom/j256/ormlite/field/FieldType;->defaultValue:Ljava/lang/Object;
a=0;// 
a=0;//     .line 1036
a=0;//     .end local v2    # "defaultStr":Ljava/lang/String;
a=0;//     :cond_7
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1030
a=0;//     .restart local v2    # "defaultStr":Ljava/lang/String;
a=0;//     :cond_8
a=0;//     #v2=(Reference,Ljava/lang/String;);v7=(Boolean);
a=0;//     iget-boolean v7, p0, Lcom/j256/ormlite/field/FieldType;->isGeneratedId:Z
a=0;// 
a=0;//     if-eqz v7, :cond_9
a=0;// 
a=0;//     .line 1031
a=0;//     new-instance v7, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "Field \'"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     iget-object v9, p0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "\' cannot be a generatedId and have a default value \'"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "\'"
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
a=0;//     .line 1034
a=0;//     :cond_9
a=0;//     #v7=(Boolean);v8=(Uninit);v9=(Uninit);
a=0;//     iget-object v7, p0, Lcom/j256/ormlite/field/FieldType;->fieldConverter:Lcom/j256/ormlite/field/FieldConverter;
a=0;// 
a=0;//     #v7=(Reference,Lcom/j256/ormlite/field/FieldConverter;);
a=0;//     invoke-interface {v7, p0, v2}, Lcom/j256/ormlite/field/FieldConverter;->parseDefaultString(Lcom/j256/ormlite/field/FieldType;Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iput-object v7, p0, Lcom/j256/ormlite/field/FieldType;->defaultValue:Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static createFieldType(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/Class;)Lcom/j256/ormlite/field/FieldType;
a=0;//     .locals 7
a=0;//     .param p0, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .param p1, "tableName"    # Ljava/lang/String;
a=0;//     .param p2, "field"    # Ljava/lang/reflect/Field;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/reflect/Field;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;)",
a=0;//             "Lcom/j256/ormlite/field/FieldType;"
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
a=0;//     .line 920
a=0;//     .local p3, "parentClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     invoke-interface {p0}, Lcom/j256/ormlite/support/ConnectionSource;->getDatabaseType()Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 921
a=0;//     .local v6, "databaseType":Lcom/j256/ormlite/db/DatabaseType;
a=0;//     #v6=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     invoke-static {v6, p1, p2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->fromField(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/String;Ljava/lang/reflect/Field;)Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 922
a=0;//     .local v4, "fieldConfig":Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;//     #v4=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 923
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 925
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/FieldType;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);
a=0;//     new-instance v0, Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/field/FieldType;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/reflect/Field;);
a=0;//     move-object v5, p3
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/j256/ormlite/field/FieldType;-><init>(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/String;Ljava/lang/reflect/Field;Lcom/j256/ormlite/field/DatabaseFieldConfig;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private findForeignFieldType(Ljava/lang/Class;Ljava/lang/Class;Lcom/j256/ormlite/dao/BaseDaoImpl;)Lcom/j256/ormlite/field/FieldType;
a=0;//     .locals 9
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;",
a=0;//             "Lcom/j256/ormlite/dao/BaseDaoImpl",
a=0;//             "<**>;)",
a=0;//             "Lcom/j256/ormlite/field/FieldType;"
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
a=0;//     .line 967
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     .local p2, "foreignClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     .local p3, "foreignDao":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<**>;"
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     #v6=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     invoke-virtual {v6}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getForeignCollectionForeignFieldName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 968
a=0;//     .local v2, "foreignColumnName":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3}, Lcom/j256/ormlite/dao/BaseDaoImpl;->getTableInfo()Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypes()[Lcom/j256/ormlite/field/FieldType;
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
a=0;//     #v1=(Conflicted);v3=(Integer);v6=(Conflicted);
a=0;//     if-ge v3, v4, :cond_2
a=0;// 
a=0;//     aget-object v1, v0, v3
a=0;// 
a=0;//     .line 969
a=0;//     .local v1, "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/field/FieldType;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Class;);
a=0;//     if-ne v6, p2, :cond_1
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/field/FieldType;->getField()Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 971
a=0;//     :cond_0
a=0;//     #v6=(Conflicted);
a=0;//     iget-object v6, v1, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     #v6=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     invoke-virtual {v6}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeign()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_4
a=0;// 
a=0;//     iget-object v6, v1, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     #v6=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     invoke-virtual {v6}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeignAutoRefresh()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_4
a=0;// 
a=0;//     .line 973
a=0;//     new-instance v6, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "Foreign collection object "
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, " for field \'"
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-object v8, p0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, "\' contains a field of class "
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, " but it\'s not foreign"
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
a=0;//     .line 968
a=0;//     :cond_1
a=0;//     #v6=(Conflicted);v7=(Uninit);v8=(Uninit);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 980
a=0;//     .end local v1    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 981
a=0;//     .local v5, "sb":Ljava/lang/StringBuilder;
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "Foreign collection class "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 982
a=0;//     const-string v6, " for field \'"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v7, p0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "\' column-name does not contain a foreign field"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 983
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 984
a=0;//     const-string v6, " named \'"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const/16 v7, 0x27
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 986
a=0;//     :cond_3
a=0;//     #v7=(Conflicted);
a=0;//     const-string v6, " of class "
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 987
a=0;//     new-instance v6, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/sql/SQLException;);
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v6
a=0;// 
a=0;//     .line 976
a=0;//     .end local v5    # "sb":Ljava/lang/StringBuilder;
a=0;//     .restart local v1    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_4
a=0;//     #v1=(Null);v5=(Uninit);v6=(Boolean);v7=(Uninit);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method private isFieldValueDefault(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .param p1, "fieldValue"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 954
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 955
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 957
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/field/FieldType;->getJavaDefaultValueDefault()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public assignField(Ljava/lang/Object;Ljava/lang/Object;ZLcom/j256/ormlite/dao/ObjectCache;)V
a=0;//     .locals 9
a=0;//     .param p1, "data"    # Ljava/lang/Object;
a=0;//     .param p2, "val"    # Ljava/lang/Object;
a=0;//     .param p3, "parentObject"    # Z
a=0;//     .param p4, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 491
a=0;//     #v8=(Null);
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/field/FieldType;->foreignIdField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v6=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     if-eqz p2, :cond_2
a=0;// 
a=0;//     .line 493
a=0;//     invoke-virtual {p0, p1}, Lcom/j256/ormlite/field/FieldType;->extractJavaFieldValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 499
a=0;//     .local v3, "foreignId":Ljava/lang/Object;
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     invoke-virtual {v3, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 562
a=0;//     .end local v3    # "foreignId":Ljava/lang/Object;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     return-void
a=0;// 
a=0;//     .line 502
a=0;//     .restart local v3    # "foreignId":Ljava/lang/Object;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Reference,Ljava/lang/Object;);v4=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Null);
a=0;//     if-nez p3, :cond_2
a=0;// 
a=0;//     .line 504
a=0;//     sget-object v6, Lcom/j256/ormlite/field/FieldType;->threadLevelCounters:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     invoke-virtual {v6}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v5, Lcom/j256/ormlite/field/FieldType$LevelCounters;
a=0;// 
a=0;//     .line 506
a=0;//     .local v5, "levelCounters":Lcom/j256/ormlite/field/FieldType$LevelCounters;
a=0;//     iget v6, v5, Lcom/j256/ormlite/field/FieldType$LevelCounters;->autoRefreshLevel:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-nez v6, :cond_1
a=0;// 
a=0;//     .line 507
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     #v6=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     invoke-virtual {v6}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getMaxForeignAutoRefreshLevel()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iput v6, v5, Lcom/j256/ormlite/field/FieldType$LevelCounters;->autoRefreshLevelMax:I
a=0;// 
a=0;//     .line 510
a=0;//     :cond_1
a=0;//     iget v6, v5, Lcom/j256/ormlite/field/FieldType$LevelCounters;->autoRefreshLevel:I
a=0;// 
a=0;//     iget v7, v5, Lcom/j256/ormlite/field/FieldType$LevelCounters;->autoRefreshLevelMax:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-lt v6, v7, :cond_3
a=0;// 
a=0;//     .line 512
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/field/FieldType;->foreignTableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v6=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-virtual {v6}, Lcom/j256/ormlite/table/TableInfo;->createObject()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 513
a=0;//     .local v4, "foreignObject":Ljava/lang/Object;
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/field/FieldType;->foreignIdField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     invoke-virtual {v6, v4, p2, v8, p4}, Lcom/j256/ormlite/field/FieldType;->assignField(Ljava/lang/Object;Ljava/lang/Object;ZLcom/j256/ormlite/dao/ObjectCache;)V
a=0;// 
a=0;//     .line 542
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     move-object p2, v4
a=0;// 
a=0;//     .line 546
a=0;//     .end local v3    # "foreignId":Ljava/lang/Object;
a=0;//     .end local v4    # "foreignObject":Ljava/lang/Object;
a=0;//     .end local v5    # "levelCounters":Lcom/j256/ormlite/field/FieldType$LevelCounters;
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/field/FieldType;->fieldSetMethod:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/reflect/Method;);
a=0;//     if-nez v6, :cond_5
a=0;// 
a=0;//     .line 548
a=0;//     :try_start_0
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v6, p1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 549
a=0;//     :catch_0
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 550
a=0;//     .local v2, "e":Ljava/lang/IllegalArgumentException;
a=0;//     #v2=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "Could not assign object \'"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "\' to field "
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6, v2}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     throw v6
a=0;// 
a=0;//     .line 520
a=0;//     .end local v2    # "e":Ljava/lang/IllegalArgumentException;
a=0;//     .restart local v3    # "foreignId":Ljava/lang/Object;
a=0;//     .restart local v5    # "levelCounters":Lcom/j256/ormlite/field/FieldType$LevelCounters;
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Reference,Ljava/lang/Object;);v4=(Uninit);v5=(Reference,Lcom/j256/ormlite/field/FieldType$LevelCounters;);v6=(Integer);v7=(Integer);v8=(Null);
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/field/FieldType;->mappedQueryForId:Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;
a=0;// 
a=0;//     #v6=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;);
a=0;//     if-nez v6, :cond_4
a=0;// 
a=0;//     .line 522
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/field/FieldType;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     invoke-interface {v6}, Lcom/j256/ormlite/support/ConnectionSource;->getDatabaseType()Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v7, p0, Lcom/j256/ormlite/field/FieldType;->foreignDao:Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     #v7=(Reference,Lcom/j256/ormlite/dao/BaseDaoImpl;);
a=0;//     invoke-virtual {v7}, Lcom/j256/ormlite/dao/BaseDaoImpl;->getTableInfo()Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-object v8, p0, Lcom/j256/ormlite/field/FieldType;->foreignIdField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v8=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-static {v6, v7, v8}, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->build(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Lcom/j256/ormlite/field/FieldType;)Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 526
a=0;//     .local v0, "castMappedQueryForId":Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;, "Lcom/j256/ormlite/stmt/mapped/MappedQueryForId<Ljava/lang/Object;Ljava/lang/Object;>;"
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/field/FieldType;->mappedQueryForId:Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;
a=0;// 
a=0;//     .line 528
a=0;//     .end local v0    # "castMappedQueryForId":Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;, "Lcom/j256/ormlite/stmt/mapped/MappedQueryForId<Ljava/lang/Object;Ljava/lang/Object;>;"
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v7=(Conflicted);
a=0;//     iget v6, v5, Lcom/j256/ormlite/field/FieldType$LevelCounters;->autoRefreshLevel:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     iput v6, v5, Lcom/j256/ormlite/field/FieldType$LevelCounters;->autoRefreshLevel:I
a=0;// 
a=0;//     .line 530
a=0;//     :try_start_1
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/field/FieldType;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v6=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v6}, Lcom/j256/ormlite/support/ConnectionSource;->getReadOnlyConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 533
a=0;//     .local v1, "databaseConnection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :try_start_2
a=0;//     #v1=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/field/FieldType;->mappedQueryForId:Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;
a=0;// 
a=0;//     invoke-virtual {v6, v1, p2, p4}, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->execute(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)Ljava/lang/Object;
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 535
a=0;//     .restart local v4    # "foreignObject":Ljava/lang/Object;
a=0;//     :try_start_3
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/field/FieldType;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     invoke-interface {v6, v1}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     .line 538
a=0;//     iget v6, v5, Lcom/j256/ormlite/field/FieldType$LevelCounters;->autoRefreshLevel:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v6, v6, -0x1
a=0;// 
a=0;//     iput v6, v5, Lcom/j256/ormlite/field/FieldType$LevelCounters;->autoRefreshLevel:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 535
a=0;//     .end local v4    # "foreignObject":Ljava/lang/Object;
a=0;//     :catchall_0
a=0;//     #v4=(Uninit);v6=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v6
a=0;// 
a=0;//     :try_start_4
a=0;//     iget-object v7, p0, Lcom/j256/ormlite/field/FieldType;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v7=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-interface {v7, v1}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     throw v6
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_1
a=0;// 
a=0;//     .line 538
a=0;//     .end local v1    # "databaseConnection":Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     :catchall_1
a=0;//     #v1=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Throwable;);
a=0;//     iget v7, v5, Lcom/j256/ormlite/field/FieldType$LevelCounters;->autoRefreshLevel:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     add-int/lit8 v7, v7, -0x1
a=0;// 
a=0;//     iput v7, v5, Lcom/j256/ormlite/field/FieldType$LevelCounters;->autoRefreshLevel:I
a=0;// 
a=0;//     throw v6
a=0;// 
a=0;//     .line 551
a=0;//     .end local v3    # "foreignId":Ljava/lang/Object;
a=0;//     .end local v5    # "levelCounters":Lcom/j256/ormlite/field/FieldType$LevelCounters;
a=0;//     :catch_1
a=0;//     #v3=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 552
a=0;//     .local v2, "e":Ljava/lang/IllegalAccessException;
a=0;//     #v2=(Reference,Ljava/lang/IllegalAccessException;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "Could not assign object \'"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "\' to field "
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6, v2}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     throw v6
a=0;// 
a=0;//     .line 556
a=0;//     .end local v2    # "e":Ljava/lang/IllegalAccessException;
a=0;//     :cond_5
a=0;//     :try_start_5
a=0;//     #v2=(Uninit);v7=(Conflicted);
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/field/FieldType;->fieldSetMethod:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     new-array v7, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     aput-object p2, v7, v8
a=0;// 
a=0;//     invoke-virtual {v6, p1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 557
a=0;//     :catch_2
a=0;//     #v7=(Conflicted);v8=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 558
a=0;//     .local v2, "e":Ljava/lang/Exception;
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "Could not call "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v7, p0, Lcom/j256/ormlite/field/FieldType;->fieldSetMethod:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, " on object with \'"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "\' for "
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6, v2}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     throw v6
a=0;// .end method
a=0;// 
a=0;// .method public assignIdValue(Ljava/lang/Object;Ljava/lang/Number;Lcom/j256/ormlite/dao/ObjectCache;)Ljava/lang/Object;
a=0;//     .locals 4
a=0;//     .param p1, "data"    # Ljava/lang/Object;
a=0;//     .param p2, "val"    # Ljava/lang/Number;
a=0;//     .param p3, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 568
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/field/FieldType;->dataPersister:Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/DataPersister;);
a=0;//     invoke-interface {v1, p2}, Lcom/j256/ormlite/field/DataPersister;->convertIdNumber(Ljava/lang/Number;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 569
a=0;//     .local v0, "idVal":Ljava/lang/Object;
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 570
a=0;//     new-instance v1, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Invalid class "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/field/FieldType;->dataPersister:Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " for sequence-id "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
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
a=0;//     .line 572
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, p1, v0, v1, p3}, Lcom/j256/ormlite/field/FieldType;->assignField(Ljava/lang/Object;Ljava/lang/Object;ZLcom/j256/ormlite/dao/ObjectCache;)V
a=0;// 
a=0;//     .line 573
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public buildForeignCollection(Ljava/lang/Object;Ljava/lang/Object;Z)Lcom/j256/ormlite/dao/BaseForeignCollection;
a=0;//     .locals 8
a=0;//     .param p3, "forceEager"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<FT:",
a=0;//             "Ljava/lang/Object;",
a=0;//             "FID:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(TFT;TFID;Z)",
a=0;//             "Lcom/j256/ormlite/dao/BaseForeignCollection",
a=0;//             "<TFT;TFID;>;"
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
a=0;//     .line 754
a=0;//     .local p1, "parent":Ljava/lang/Object;, "TFT;"
a=0;//     .local p2, "id":Ljava/lang/Object;, "TFID;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->foreignFieldType:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 755
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 780
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 758
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/field/FieldType;->foreignDao:Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     .line 759
a=0;//     .local v1, "castDao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TFT;TFID;>;"
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/BaseDaoImpl;);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeignCollectionEager()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     if-nez p3, :cond_1
a=0;// 
a=0;//     .line 761
a=0;//     new-instance v0, Lcom/j256/ormlite/dao/LazyForeignCollection;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/dao/LazyForeignCollection;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/field/FieldType;->foreignFieldType:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     iget-object v4, v2, Lcom/j256/ormlite/field/FieldType;->columnName:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getForeignCollectionOrderColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeignCollectionOrderAscending()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/j256/ormlite/dao/LazyForeignCollection;-><init>(Lcom/j256/ormlite/dao/Dao;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Z)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/LazyForeignCollection;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 765
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     sget-object v0, Lcom/j256/ormlite/field/FieldType;->threadLevelCounters:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Lcom/j256/ormlite/field/FieldType$LevelCounters;
a=0;// 
a=0;//     .line 766
a=0;//     .local v7, "levelCounters":Lcom/j256/ormlite/field/FieldType$LevelCounters;
a=0;//     iget v0, v7, Lcom/j256/ormlite/field/FieldType$LevelCounters;->foreignCollectionLevel:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 767
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getForeignCollectionMaxEagerLevel()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v7, Lcom/j256/ormlite/field/FieldType$LevelCounters;->foreignCollectionLevelMax:I
a=0;// 
a=0;//     .line 770
a=0;//     :cond_2
a=0;//     iget v0, v7, Lcom/j256/ormlite/field/FieldType$LevelCounters;->foreignCollectionLevel:I
a=0;// 
a=0;//     iget v2, v7, Lcom/j256/ormlite/field/FieldType$LevelCounters;->foreignCollectionLevelMax:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v0, v2, :cond_3
a=0;// 
a=0;//     .line 772
a=0;//     new-instance v0, Lcom/j256/ormlite/dao/LazyForeignCollection;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/dao/LazyForeignCollection;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/field/FieldType;->foreignFieldType:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     iget-object v4, v2, Lcom/j256/ormlite/field/FieldType;->columnName:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getForeignCollectionOrderColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeignCollectionOrderAscending()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/j256/ormlite/dao/LazyForeignCollection;-><init>(Lcom/j256/ormlite/dao/Dao;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Z)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/LazyForeignCollection;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 775
a=0;//     :cond_3
a=0;//     #v0=(Integer);v2=(Integer);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     iget v0, v7, Lcom/j256/ormlite/field/FieldType$LevelCounters;->foreignCollectionLevel:I
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, v7, Lcom/j256/ormlite/field/FieldType$LevelCounters;->foreignCollectionLevel:I
a=0;// 
a=0;//     .line 777
a=0;//     :try_start_0
a=0;//     new-instance v0, Lcom/j256/ormlite/dao/EagerForeignCollection;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/dao/EagerForeignCollection;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/field/FieldType;->foreignFieldType:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     iget-object v4, v2, Lcom/j256/ormlite/field/FieldType;->columnName:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getForeignCollectionOrderColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeignCollectionOrderAscending()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/j256/ormlite/dao/EagerForeignCollection;-><init>(Lcom/j256/ormlite/dao/Dao;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Z)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 780
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/EagerForeignCollection;);
a=0;//     iget v2, v7, Lcom/j256/ormlite/field/FieldType$LevelCounters;->foreignCollectionLevel:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     iput v2, v7, Lcom/j256/ormlite/field/FieldType$LevelCounters;->foreignCollectionLevel:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     iget v2, v7, Lcom/j256/ormlite/field/FieldType$LevelCounters;->foreignCollectionLevel:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     iput v2, v7, Lcom/j256/ormlite/field/FieldType$LevelCounters;->foreignCollectionLevel:I
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public configDaoInformation(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)V
a=0;//     .locals 20
a=0;//     .param p1, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;)V"
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
a=0;//     .line 274
a=0;//     .local p2, "parentClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/reflect/Field;);
a=0;//     invoke-virtual/range {v17 .. v17}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 275
a=0;//     .local v6, "fieldClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     #v6=(Reference,Ljava/lang/Class;);
a=0;//     invoke-interface/range {p1 .. p1}, Lcom/j256/ormlite/support/ConnectionSource;->getDatabaseType()Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 282
a=0;//     .local v5, "databaseType":Lcom/j256/ormlite/db/DatabaseType;
a=0;//     #v5=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     invoke-virtual/range {v17 .. v17}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getForeignColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 283
a=0;//     .local v7, "foreignColumnName":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     invoke-virtual/range {v17 .. v17}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeignAutoRefresh()Z
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     #v17=(Boolean);
a=0;//     if-nez v17, :cond_0
a=0;// 
a=0;//     if-eqz v7, :cond_5
a=0;// 
a=0;//     .line 284
a=0;//     :cond_0
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     invoke-virtual/range {v17 .. v17}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getForeignTableConfig()Lcom/j256/ormlite/table/DatabaseTableConfig;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 285
a=0;//     .local v15, "tableConfig":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<*>;"
a=0;//     #v15=(Reference,Lcom/j256/ormlite/table/DatabaseTableConfig;);
a=0;//     if-nez v15, :cond_1
a=0;// 
a=0;//     .line 287
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-static {v0, v6}, Lcom/j256/ormlite/dao/DaoManager;->createDao(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     check-cast v8, Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     .line 288
a=0;//     .local v8, "foreignDao":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<**>;"
a=0;//     invoke-virtual {v8}, Lcom/j256/ormlite/dao/BaseDaoImpl;->getTableInfo()Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 295
a=0;//     .local v11, "foreignTableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<**>;"
a=0;//     :goto_0
a=0;//     #v11=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     if-nez v7, :cond_2
a=0;// 
a=0;//     .line 296
a=0;//     invoke-virtual {v11}, Lcom/j256/ormlite/table/TableInfo;->getIdField()Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 297
a=0;//     .local v10, "foreignIdField":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v10=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     if-nez v10, :cond_3
a=0;// 
a=0;//     .line 298
a=0;//     new-instance v17, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v17=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v18, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v18=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v19, "Foreign field "
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     const-string v19, " does not have id field"
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-direct/range {v17 .. v18}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v17
a=0;// 
a=0;//     .line 290
a=0;//     .end local v8    # "foreignDao":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<**>;"
a=0;//     .end local v10    # "foreignIdField":Lcom/j256/ormlite/field/FieldType;
a=0;//     .end local v11    # "foreignTableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<**>;"
a=0;//     :cond_1
a=0;//     #v8=(Uninit);v10=(Uninit);v11=(Uninit);v18=(Uninit);v19=(Uninit);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v15, v0}, Lcom/j256/ormlite/table/DatabaseTableConfig;->extractFieldTypes(Lcom/j256/ormlite/support/ConnectionSource;)V
a=0;// 
a=0;//     .line 292
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-static {v0, v15}, Lcom/j256/ormlite/dao/DaoManager;->createDao(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/DatabaseTableConfig;)Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     check-cast v8, Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     .line 293
a=0;//     .restart local v8    # "foreignDao":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<**>;"
a=0;//     invoke-virtual {v8}, Lcom/j256/ormlite/dao/BaseDaoImpl;->getTableInfo()Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .restart local v11    # "foreignTableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<**>;"
a=0;//     #v11=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 301
a=0;//     :cond_2
a=0;//     invoke-virtual {v11, v7}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypeByColumnName(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 302
a=0;//     .restart local v10    # "foreignIdField":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v10=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     if-nez v10, :cond_3
a=0;// 
a=0;//     .line 303
a=0;//     new-instance v17, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v17=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v18, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v18=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v19, "Foreign field "
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     const-string v19, " does not have field named \'"
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     const-string v19, "\'"
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-direct/range {v17 .. v18}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v17
a=0;// 
a=0;//     .line 308
a=0;//     :cond_3
a=0;//     #v18=(Uninit);v19=(Uninit);
a=0;//     invoke-static {v5, v11, v10}, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->build(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Lcom/j256/ormlite/field/FieldType;)Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 311
a=0;//     .local v3, "castMappedQueryForId":Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;, "Lcom/j256/ormlite/stmt/mapped/MappedQueryForId<Ljava/lang/Object;Ljava/lang/Object;>;"
a=0;//     #v3=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;);
a=0;//     move-object v14, v3
a=0;// 
a=0;//     .line 312
a=0;//     .local v14, "mappedQueryForId":Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;, "Lcom/j256/ormlite/stmt/mapped/MappedQueryForId<Ljava/lang/Object;Ljava/lang/Object;>;"
a=0;//     #v14=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 387
a=0;//     .end local v3    # "castMappedQueryForId":Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;, "Lcom/j256/ormlite/stmt/mapped/MappedQueryForId<Ljava/lang/Object;Ljava/lang/Object;>;"
a=0;//     .end local v15    # "tableConfig":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<*>;"
a=0;//     .local v9, "foreignFieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v9=(Reference,Lcom/j256/ormlite/field/FieldType;);v12=(Conflicted);v13=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v14, v0, Lcom/j256/ormlite/field/FieldType;->mappedQueryForId:Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;
a=0;// 
a=0;//     .line 388
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v11, v0, Lcom/j256/ormlite/field/FieldType;->foreignTableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     .line 389
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v9, v0, Lcom/j256/ormlite/field/FieldType;->foreignFieldType:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .line 390
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v8, v0, Lcom/j256/ormlite/field/FieldType;->foreignDao:Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     .line 391
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v10, v0, Lcom/j256/ormlite/field/FieldType;->foreignIdField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .line 394
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/field/FieldType;->foreignIdField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     if-eqz v17, :cond_4
a=0;// 
a=0;//     .line 395
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/field/FieldType;->foreignIdField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     invoke-virtual/range {v17 .. v17}, Lcom/j256/ormlite/field/FieldType;->getDataPersister()Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v17
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/DataPersister;);
a=0;//     invoke-direct {v0, v5, v1}, Lcom/j256/ormlite/field/FieldType;->assignDataType(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/field/DataPersister;)V
a=0;// 
a=0;//     .line 397
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 313
a=0;//     .end local v8    # "foreignDao":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<**>;"
a=0;//     .end local v9    # "foreignFieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     .end local v10    # "foreignIdField":Lcom/j256/ormlite/field/FieldType;
a=0;//     .end local v11    # "foreignTableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<**>;"
a=0;//     .end local v14    # "mappedQueryForId":Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;, "Lcom/j256/ormlite/stmt/mapped/MappedQueryForId<Ljava/lang/Object;Ljava/lang/Object;>;"
a=0;//     :cond_5
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Boolean);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     invoke-virtual/range {v17 .. v17}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeign()Z
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     #v17=(Boolean);
a=0;//     if-eqz v17, :cond_a
a=0;// 
a=0;//     .line 314
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/field/FieldType;->dataPersister:Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Lcom/j256/ormlite/field/DataPersister;);
a=0;//     if-eqz v17, :cond_6
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/field/FieldType;->dataPersister:Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     invoke-interface/range {v17 .. v17}, Lcom/j256/ormlite/field/DataPersister;->isPrimitive()Z
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     #v17=(Boolean);
a=0;//     if-eqz v17, :cond_6
a=0;// 
a=0;//     .line 315
a=0;//     new-instance v17, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v17=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v18, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v18=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v19, "Field "
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     const-string v19, " is a primitive class "
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     const-string v19, " but marked as foreign"
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-direct/range {v17 .. v18}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v17
a=0;// 
a=0;//     .line 318
a=0;//     :cond_6
a=0;//     #v1=(Uninit);v17=(Conflicted);v18=(Uninit);v19=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     invoke-virtual/range {v17 .. v17}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getForeignTableConfig()Lcom/j256/ormlite/table/DatabaseTableConfig;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 319
a=0;//     .restart local v15    # "tableConfig":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<*>;"
a=0;//     #v15=(Reference,Lcom/j256/ormlite/table/DatabaseTableConfig;);
a=0;//     if-eqz v15, :cond_7
a=0;// 
a=0;//     .line 320
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v15, v0}, Lcom/j256/ormlite/table/DatabaseTableConfig;->extractFieldTypes(Lcom/j256/ormlite/support/ConnectionSource;)V
a=0;// 
a=0;//     .line 322
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-static {v0, v15}, Lcom/j256/ormlite/dao/DaoManager;->createDao(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/DatabaseTableConfig;)Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     check-cast v8, Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     .line 333
a=0;//     .restart local v8    # "foreignDao":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<**>;"
a=0;//     :goto_2
a=0;//     invoke-virtual {v8}, Lcom/j256/ormlite/dao/BaseDaoImpl;->getTableInfo()Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 334
a=0;//     .restart local v11    # "foreignTableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<**>;"
a=0;//     #v11=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-virtual {v11}, Lcom/j256/ormlite/table/TableInfo;->getIdField()Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 335
a=0;//     .restart local v10    # "foreignIdField":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v10=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     if-nez v10, :cond_8
a=0;// 
a=0;//     .line 336
a=0;//     new-instance v17, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v17=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v18, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v18=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v19, "Foreign field "
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     const-string v19, " does not have id field"
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-direct/range {v17 .. v18}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v17
a=0;// 
a=0;//     .line 331
a=0;//     .end local v8    # "foreignDao":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<**>;"
a=0;//     .end local v10    # "foreignIdField":Lcom/j256/ormlite/field/FieldType;
a=0;//     .end local v11    # "foreignTableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<**>;"
a=0;//     :cond_7
a=0;//     #v8=(Uninit);v10=(Uninit);v11=(Uninit);v18=(Uninit);v19=(Uninit);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-static {v0, v6}, Lcom/j256/ormlite/dao/DaoManager;->createDao(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     check-cast v8, Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     .restart local v8    # "foreignDao":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<**>;"
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 338
a=0;//     .restart local v10    # "foreignIdField":Lcom/j256/ormlite/field/FieldType;
a=0;//     .restart local v11    # "foreignTableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<**>;"
a=0;//     :cond_8
a=0;//     #v10=(Reference,Lcom/j256/ormlite/field/FieldType;);v11=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/j256/ormlite/field/FieldType;->isForeignAutoCreate()Z
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     #v17=(Boolean);
a=0;//     if-eqz v17, :cond_9
a=0;// 
a=0;//     invoke-virtual {v10}, Lcom/j256/ormlite/field/FieldType;->isGeneratedId()Z
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     if-nez v17, :cond_9
a=0;// 
a=0;//     .line 339
a=0;//     new-instance v17, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v17=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v18, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v18=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v19, "Field "
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     invoke-virtual/range {v19 .. v19}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     const-string v19, ", if foreignAutoCreate = true then class "
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     const-string v19, " must have id field with generatedId = true"
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-direct/range {v17 .. v18}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v17
a=0;// 
a=0;//     .line 343
a=0;//     :cond_9
a=0;//     #v17=(Boolean);v18=(Uninit);v19=(Uninit);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 344
a=0;//     .restart local v9    # "foreignFieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v9=(Null);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     .line 345
a=0;//     .restart local v14    # "mappedQueryForId":Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;, "Lcom/j256/ormlite/stmt/mapped/MappedQueryForId<Ljava/lang/Object;Ljava/lang/Object;>;"
a=0;//     #v14=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .end local v8    # "foreignDao":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<**>;"
a=0;//     .end local v9    # "foreignFieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     .end local v10    # "foreignIdField":Lcom/j256/ormlite/field/FieldType;
a=0;//     .end local v11    # "foreignTableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<**>;"
a=0;//     .end local v14    # "mappedQueryForId":Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;, "Lcom/j256/ormlite/stmt/mapped/MappedQueryForId<Ljava/lang/Object;Ljava/lang/Object;>;"
a=0;//     .end local v15    # "tableConfig":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<*>;"
a=0;//     :cond_a
a=0;//     #v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v14=(Uninit);v15=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     invoke-virtual/range {v17 .. v17}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeignCollection()Z
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     #v17=(Boolean);
a=0;//     if-eqz v17, :cond_f
a=0;// 
a=0;//     .line 346
a=0;//     const-class v17, Ljava/util/Collection;
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/Class;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     if-eq v6, v0, :cond_b
a=0;// 
a=0;//     const-class v17, Lcom/j256/ormlite/dao/ForeignCollection;
a=0;// 
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     #v17=(Boolean);
a=0;//     if-nez v17, :cond_b
a=0;// 
a=0;//     .line 347
a=0;//     new-instance v17, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v17=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v18, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v18=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v19, "Field class for \'"
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     invoke-virtual/range {v19 .. v19}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     const-string v19, "\' must be of class "
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     const-class v19, Lcom/j256/ormlite/dao/ForeignCollection;
a=0;// 
a=0;//     invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     const-string v19, " or Collection."
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-direct/range {v17 .. v18}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v17=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v17
a=0;// 
a=0;//     .line 350
a=0;//     :cond_b
a=0;//     #v17=(Conflicted);v18=(Uninit);v19=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/reflect/Field;);
a=0;//     invoke-virtual/range {v17 .. v17}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     .line 351
a=0;//     .local v16, "type":Ljava/lang/reflect/Type;
a=0;//     #v16=(Reference,Ljava/lang/reflect/Type;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     instance-of v0, v0, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Boolean);
a=0;//     if-nez v17, :cond_c
a=0;// 
a=0;//     .line 352
a=0;//     new-instance v17, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v17=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v18, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v18=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v19, "Field class for \'"
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     invoke-virtual/range {v19 .. v19}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     const-string v19, "\' must be a parameterized Collection."
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-direct/range {v17 .. v18}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v17=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v17
a=0;// 
a=0;//     .line 354
a=0;//     :cond_c
a=0;//     #v0=(Boolean);v17=(Boolean);v18=(Uninit);v19=(Uninit);
a=0;//     check-cast v16, Ljava/lang/reflect/ParameterizedType;
a=0;// 
a=0;//     .end local v16    # "type":Ljava/lang/reflect/Type;
a=0;//     invoke-interface/range {v16 .. v16}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 355
a=0;//     .local v13, "genericArguments":[Ljava/lang/reflect/Type;
a=0;//     #v13=(Reference,[Ljava/lang/reflect/Type;);
a=0;//     array-length v0, v13
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     if-nez v17, :cond_d
a=0;// 
a=0;//     .line 357
a=0;//     new-instance v17, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v17=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v18, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v18=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v19, "Field class for \'"
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     invoke-virtual/range {v19 .. v19}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     const-string v19, "\' must be a parameterized Collection with at least 1 type."
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-direct/range {v17 .. v18}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v17=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v17
a=0;// 
a=0;//     .line 360
a=0;//     :cond_d
a=0;//     #v0=(Integer);v17=(Integer);v18=(Uninit);v19=(Uninit);
a=0;//     const/16 v17, 0x0
a=0;// 
a=0;//     #v17=(Null);
a=0;//     aget-object v4, v13, v17
a=0;// 
a=0;//     #v4=(Null);
a=0;//     check-cast v4, Ljava/lang/Class;
a=0;// 
a=0;//     .line 361
a=0;//     .local v4, "collectionClazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     iget-object v0, v0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     invoke-virtual/range {v17 .. v17}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getForeignTableConfig()Lcom/j256/ormlite/table/DatabaseTableConfig;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 363
a=0;//     .restart local v15    # "tableConfig":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<*>;"
a=0;//     #v15=(Reference,Lcom/j256/ormlite/table/DatabaseTableConfig;);
a=0;//     if-nez v15, :cond_e
a=0;// 
a=0;//     .line 365
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-static {v0, v4}, Lcom/j256/ormlite/dao/DaoManager;->createDao(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     check-cast v2, Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     .line 367
a=0;//     .local v2, "castDao":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<Ljava/lang/Object;Ljava/lang/Object;>;"
a=0;//     move-object v12, v2
a=0;// 
a=0;//     .line 374
a=0;//     .local v12, "foundDao":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<Ljava/lang/Object;Ljava/lang/Object;>;"
a=0;//     :goto_3
a=0;//     #v12=(Reference,Lcom/j256/ormlite/dao/BaseDaoImpl;);
a=0;//     move-object v8, v12
a=0;// 
a=0;//     .line 375
a=0;//     .restart local v8    # "foreignDao":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<**>;"
a=0;//     #v8=(Reference,Lcom/j256/ormlite/dao/BaseDaoImpl;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, p2
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, v4, v1, v12}, Lcom/j256/ormlite/field/FieldType;->findForeignFieldType(Ljava/lang/Class;Ljava/lang/Class;Lcom/j256/ormlite/dao/BaseDaoImpl;)Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 376
a=0;//     .restart local v9    # "foreignFieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v9=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 377
a=0;//     .restart local v10    # "foreignIdField":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v10=(Null);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 378
a=0;//     .restart local v11    # "foreignTableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<**>;"
a=0;//     #v11=(Null);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     .line 379
a=0;//     .restart local v14    # "mappedQueryForId":Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;, "Lcom/j256/ormlite/stmt/mapped/MappedQueryForId<Ljava/lang/Object;Ljava/lang/Object;>;"
a=0;//     #v14=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 370
a=0;//     .end local v2    # "castDao":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<Ljava/lang/Object;Ljava/lang/Object;>;"
a=0;//     .end local v8    # "foreignDao":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<**>;"
a=0;//     .end local v9    # "foreignFieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     .end local v10    # "foreignIdField":Lcom/j256/ormlite/field/FieldType;
a=0;//     .end local v11    # "foreignTableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<**>;"
a=0;//     .end local v12    # "foundDao":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<Ljava/lang/Object;Ljava/lang/Object;>;"
a=0;//     .end local v14    # "mappedQueryForId":Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;, "Lcom/j256/ormlite/stmt/mapped/MappedQueryForId<Ljava/lang/Object;Ljava/lang/Object;>;"
a=0;//     :cond_e
a=0;//     #v1=(Uninit);v2=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v14=(Uninit);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-static {v0, v15}, Lcom/j256/ormlite/dao/DaoManager;->createDao(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/DatabaseTableConfig;)Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     check-cast v2, Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     .line 372
a=0;//     .restart local v2    # "castDao":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<Ljava/lang/Object;Ljava/lang/Object;>;"
a=0;//     move-object v12, v2
a=0;// 
a=0;//     .restart local v12    # "foundDao":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<Ljava/lang/Object;Ljava/lang/Object;>;"
a=0;//     #v12=(Reference,Lcom/j256/ormlite/dao/BaseDaoImpl;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 380
a=0;//     .end local v2    # "castDao":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<Ljava/lang/Object;Ljava/lang/Object;>;"
a=0;//     .end local v4    # "collectionClazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     .end local v12    # "foundDao":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<Ljava/lang/Object;Ljava/lang/Object;>;"
a=0;//     .end local v13    # "genericArguments":[Ljava/lang/reflect/Type;
a=0;//     .end local v15    # "tableConfig":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<*>;"
a=0;//     :cond_f
a=0;//     #v2=(Uninit);v4=(Uninit);v12=(Uninit);v13=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Boolean);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 381
a=0;//     .restart local v11    # "foreignTableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<**>;"
a=0;//     #v11=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 382
a=0;//     .restart local v10    # "foreignIdField":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v10=(Null);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 383
a=0;//     .restart local v9    # "foreignFieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v9=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 384
a=0;//     .restart local v8    # "foreignDao":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<**>;"
a=0;//     #v8=(Null);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     .restart local v14    # "mappedQueryForId":Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;, "Lcom/j256/ormlite/stmt/mapped/MappedQueryForId<Ljava/lang/Object;Ljava/lang/Object;>;"
a=0;//     #v14=(Null);
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public convertJavaFieldToSqlArgValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "fieldVal"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 629
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 630
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 632
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->fieldConverter:Lcom/j256/ormlite/field/FieldConverter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/FieldConverter;);
a=0;//     invoke-interface {v0, p0, p1}, Lcom/j256/ormlite/field/FieldConverter;->javaToSqlArg(Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public convertStringToJavaField(Ljava/lang/String;I)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "value"    # Ljava/lang/String;
a=0;//     .param p2, "columnPos"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 640
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 641
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 643
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->fieldConverter:Lcom/j256/ormlite/field/FieldConverter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/FieldConverter;);
a=0;//     invoke-interface {v0, p0, p1, p2}, Lcom/j256/ormlite/field/FieldConverter;->resultStringToJava(Lcom/j256/ormlite/field/FieldType;Ljava/lang/String;I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public createWithForeignDao(Ljava/lang/Object;)I
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(TT;)I"
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
a=0;//     .line 911
a=0;//     .local p1, "foreignData":Ljava/lang/Object;, "TT;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->foreignDao:Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     .line 912
a=0;//     .local v0, "castDao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;*>;"
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/BaseDaoImpl;);
a=0;//     invoke-interface {v0, p1}, Lcom/j256/ormlite/dao/Dao;->create(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method public equals(Ljava/lang/Object;)Z
a=0;//     .locals 3
a=0;//     .param p1, "arg"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 931
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     if-eq v1, v2, :cond_1
a=0;// 
a=0;//     .line 932
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 935
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Reference,Ljava/lang/Class;);v2=(Reference,Ljava/lang/Class;);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     .line 934
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .line 935
a=0;//     .local v0, "other":Lcom/j256/ormlite/field/FieldType;
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     iget-object v2, v0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public extractJavaFieldToSqlArgValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "object"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 622
a=0;//     invoke-virtual {p0, p1}, Lcom/j256/ormlite/field/FieldType;->extractJavaFieldValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {p0, v0}, Lcom/j256/ormlite/field/FieldType;->convertJavaFieldToSqlArgValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public extractJavaFieldValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .param p1, "object"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 608
a=0;//     invoke-virtual {p0, p1}, Lcom/j256/ormlite/field/FieldType;->extractRawJavaFieldValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 611
a=0;//     .local v0, "val":Ljava/lang/Object;
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/field/FieldType;->foreignIdField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 612
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/field/FieldType;->foreignIdField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/j256/ormlite/field/FieldType;->extractRawJavaFieldValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 615
a=0;//     :cond_0
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public extractRawJavaFieldValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 5
a=0;//     .param p1, "object"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<FV:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")TFV;"
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
a=0;//     .line 582
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/field/FieldType;->fieldGetMethod:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/reflect/Method;);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 585
a=0;//     :try_start_0
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 598
a=0;//     .local v2, "val":Ljava/lang/Object;
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/lang/Object;);v4=(Conflicted);
a=0;//     move-object v0, v2
a=0;// 
a=0;//     .line 599
a=0;//     .local v0, "converted":Ljava/lang/Object;, "TFV;"
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 586
a=0;//     .end local v0    # "converted":Ljava/lang/Object;, "TFV;"
a=0;//     .end local v2    # "val":Ljava/lang/Object;
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v2=(Uninit);v4=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 587
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Could not get field value for "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3, v1}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     throw v3
a=0;// 
a=0;//     .line 591
a=0;//     .end local v1    # "e":Ljava/lang/Exception;
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v1=(Uninit);v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/field/FieldType;->fieldGetMethod:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v3, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .restart local v2    # "val":Ljava/lang/Object;
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 592
a=0;//     .end local v2    # "val":Ljava/lang/Object;
a=0;//     :catch_1
a=0;//     #v2=(Uninit);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 593
a=0;//     .restart local v1    # "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Could not call "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/field/FieldType;->fieldGetMethod:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " for "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3, v1}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     throw v3
a=0;// .end method
a=0;// 
a=0;// .method public generateId()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 855
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->dataPersister:Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/DataPersister;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/field/DataPersister;->generateId()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getColumnDefinition()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 834
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getColumnDefinition()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getColumnName()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 419
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->columnName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getDataPersister()Lcom/j256/ormlite/field/DataPersister;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 423
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->dataPersister:Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/DataPersister;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getDataTypeConfigObj()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 427
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->dataTypeConfigObj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getDefaultValue()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 438
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->defaultValue:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getField()Ljava/lang/reflect/Field;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 400
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Field;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getFieldName()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 408
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Field;);
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getFieldValueIfNotDefault(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .param p1, "object"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<FV:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")TFV;"
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
a=0;//     .line 864
a=0;//     invoke-virtual {p0, p1}, Lcom/j256/ormlite/field/FieldType;->extractJavaFieldValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 865
a=0;//     .local v0, "fieldValue":Ljava/lang/Object;, "TFV;"
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     invoke-direct {p0, v0}, Lcom/j256/ormlite/field/FieldType;->isFieldValueDefault(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 866
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 868
a=0;//     .end local v0    # "fieldValue":Ljava/lang/Object;, "TFV;"
a=0;//     :cond_0
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getForeignIdField()Lcom/j256/ormlite/field/FieldType;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 662
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->foreignIdField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getFormat()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 680
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getFormat()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getGeneratedIdSequence()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 479
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->generatedIdSequence:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getIndexName()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 692
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/field/FieldType;->tableName:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getIndexName(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getJavaDefaultValueDefault()Ljava/lang/Object;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 885
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Field;);
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 886
a=0;//     sget-boolean v0, Lcom/j256/ormlite/field/FieldType;->DEFAULT_VALUE_BOOLEAN:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 902
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 887
a=0;//     :cond_0
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     if-eq v0, v1, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-class v1, Ljava/lang/Byte;
a=0;// 
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     .line 888
a=0;//     :cond_1
a=0;//     sget-byte v0, Lcom/j256/ormlite/field/FieldType;->DEFAULT_VALUE_BYTE:B
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Byte;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 889
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     if-eq v0, v1, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-class v1, Ljava/lang/Character;
a=0;// 
a=0;//     if-ne v0, v1, :cond_4
a=0;// 
a=0;//     .line 890
a=0;//     :cond_3
a=0;//     sget-char v0, Lcom/j256/ormlite/field/FieldType;->DEFAULT_VALUE_CHAR:C
a=0;// 
a=0;//     #v0=(Char);
a=0;//     invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Character;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 891
a=0;//     :cond_4
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     if-eq v0, v1, :cond_5
a=0;// 
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-class v1, Ljava/lang/Short;
a=0;// 
a=0;//     if-ne v0, v1, :cond_6
a=0;// 
a=0;//     .line 892
a=0;//     :cond_5
a=0;//     sget-short v0, Lcom/j256/ormlite/field/FieldType;->DEFAULT_VALUE_SHORT:S
a=0;// 
a=0;//     #v0=(Short);
a=0;//     invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Short;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 893
a=0;//     :cond_6
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     if-eq v0, v1, :cond_7
a=0;// 
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-class v1, Ljava/lang/Integer;
a=0;// 
a=0;//     if-ne v0, v1, :cond_8
a=0;// 
a=0;//     .line 894
a=0;//     :cond_7
a=0;//     sget v0, Lcom/j256/ormlite/field/FieldType;->DEFAULT_VALUE_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 895
a=0;//     :cond_8
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     if-eq v0, v1, :cond_9
a=0;// 
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-class v1, Ljava/lang/Long;
a=0;// 
a=0;//     if-ne v0, v1, :cond_a
a=0;// 
a=0;//     .line 896
a=0;//     :cond_9
a=0;//     sget-wide v0, Lcom/j256/ormlite/field/FieldType;->DEFAULT_VALUE_LONG:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Long;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 897
a=0;//     :cond_a
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     if-eq v0, v1, :cond_b
a=0;// 
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-class v1, Ljava/lang/Float;
a=0;// 
a=0;//     if-ne v0, v1, :cond_c
a=0;// 
a=0;//     .line 898
a=0;//     :cond_b
a=0;//     sget v0, Lcom/j256/ormlite/field/FieldType;->DEFAULT_VALUE_FLOAT:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Float;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 899
a=0;//     :cond_c
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     if-eq v0, v1, :cond_d
a=0;// 
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-class v1, Ljava/lang/Double;
a=0;// 
a=0;//     if-ne v0, v1, :cond_e
a=0;// 
a=0;//     .line 900
a=0;//     :cond_d
a=0;//     sget-wide v0, Lcom/j256/ormlite/field/FieldType;->DEFAULT_VALUE_DOUBLE:D
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Double;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 902
a=0;//     :cond_e
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getSqlType()Lcom/j256/ormlite/field/SqlType;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 431
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->fieldConverter:Lcom/j256/ormlite/field/FieldConverter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/FieldConverter;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/field/FieldConverter;->getSqlType()Lcom/j256/ormlite/field/SqlType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTableName()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 404
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->tableName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getType()Ljava/lang/Class;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 415
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Field;);
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getUniqueIndexName()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 696
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/field/FieldType;->tableName:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getUniqueIndexName(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getUnknownEnumVal()Ljava/lang/Enum;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/lang/Enum",
a=0;//             "<*>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 673
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getUnknownEnumValue()Ljava/lang/Enum;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getWidth()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 442
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public hashCode()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 940
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Field;);
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/Field;->hashCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isAllowGeneratedIdInsert()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 827
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isAllowGeneratedIdInsert()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isArgumentHolderRequired()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 729
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->dataPersister:Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/DataPersister;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/field/DataPersister;->isArgumentHolderRequired()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isCanBeNull()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 446
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isCanBeNull()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isComparable()Z
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 710
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeignCollection()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 711
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 721
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     .line 717
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->dataPersister:Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/DataPersister;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 718
a=0;//     new-instance v0, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Internal error.  Data-persister is not configured for field.  Please post _full_ exception with associated data objects to mailing list: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
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
a=0;//     .line 721
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->dataPersister:Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/field/DataPersister;->isComparable()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isEscapedDefaultValue()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 703
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->dataPersister:Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/DataPersister;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/field/DataPersister;->isEscapedDefaultValue()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isEscapedValue()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 669
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->dataPersister:Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/DataPersister;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/field/DataPersister;->isEscapedValue()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isForeign()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 483
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeign()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isForeignAutoCreate()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 841
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeignAutoCreate()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isForeignCollection()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 736
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeignCollection()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isGeneratedId()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 462
a=0;//     iget-boolean v0, p0, Lcom/j256/ormlite/field/FieldType;->isGeneratedId:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isGeneratedIdSequence()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 472
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->generatedIdSequence:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isId()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 454
a=0;//     iget-boolean v0, p0, Lcom/j256/ormlite/field/FieldType;->isId:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isObjectsFieldValueDefault(Ljava/lang/Object;)Z
a=0;//     .locals 2
a=0;//     .param p1, "object"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 876
a=0;//     invoke-virtual {p0, p1}, Lcom/j256/ormlite/field/FieldType;->extractJavaFieldValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 877
a=0;//     .local v0, "fieldValue":Ljava/lang/Object;
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     invoke-direct {p0, v0}, Lcom/j256/ormlite/field/FieldType;->isFieldValueDefault(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method public isSelfGeneratedId()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 820
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->dataPersister:Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/DataPersister;);
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/field/DataPersister;->isSelfGeneratedId()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isUnique()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 684
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isUnique()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isUniqueCombo()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 688
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isUniqueCombo()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isVersion()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 848
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isVersion()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public moveToNextValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "val"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 651
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->dataPersister:Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/DataPersister;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 652
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 654
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/field/FieldType;->dataPersister:Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Lcom/j256/ormlite/field/DataPersister;->moveToNextValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public resultToJava(Lcom/j256/ormlite/support/DatabaseResults;Ljava/util/Map;)Ljava/lang/Object;
a=0;//     .locals 5
a=0;//     .param p1, "results"    # Lcom/j256/ormlite/support/DatabaseResults;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/support/DatabaseResults;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Integer;",
a=0;//             ">;)TT;"
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
a=0;//     .local p2, "columnPositions":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 788
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/field/FieldType;->columnName:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/lang/Integer;
a=0;// 
a=0;//     .line 789
a=0;//     .local v1, "dbColumnPos":Ljava/lang/Integer;
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 790
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/field/FieldType;->columnName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {p1, v3}, Lcom/j256/ormlite/support/DatabaseResults;->findColumn(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 791
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/field/FieldType;->columnName:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 794
a=0;//     :cond_0
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/field/FieldType;->fieldConverter:Lcom/j256/ormlite/field/FieldConverter;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-interface {v3, p0, p1, v4}, Lcom/j256/ormlite/field/FieldConverter;->resultToJava(Lcom/j256/ormlite/field/FieldType;Lcom/j256/ormlite/support/DatabaseResults;I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 795
a=0;//     .local v0, "converted":Ljava/lang/Object;, "TT;"
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeign()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 801
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {p1, v3}, Lcom/j256/ormlite/support/DatabaseResults;->wasNull(I)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     move-object v0, v2
a=0;// 
a=0;//     .line 813
a=0;//     .end local v0    # "converted":Ljava/lang/Object;, "TT;"
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 804
a=0;//     .restart local v0    # "converted":Ljava/lang/Object;, "TT;"
a=0;//     :cond_2
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/field/FieldType;->dataPersister:Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/field/DataPersister;);
a=0;//     invoke-interface {v3}, Lcom/j256/ormlite/field/DataPersister;->isPrimitive()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 805
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/field/FieldType;->fieldConfig:Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     invoke-virtual {v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isThrowIfNull()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {p1, v2}, Lcom/j256/ormlite/support/DatabaseResults;->wasNull(I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 806
a=0;//     new-instance v2, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Results value for primitive field \'"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "\' was an invalid null value"
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
a=0;//     .line 809
a=0;//     :cond_3
a=0;//     #v2=(Null);v3=(Boolean);v4=(Integer);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/field/FieldType;->fieldConverter:Lcom/j256/ormlite/field/FieldConverter;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/field/FieldConverter;);
a=0;//     invoke-interface {v3}, Lcom/j256/ormlite/field/FieldConverter;->isStreamType()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {p1, v3}, Lcom/j256/ormlite/support/DatabaseResults;->wasNull(I)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     move-object v0, v2
a=0;// 
a=0;//     .line 811
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 945
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ":name="
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ",class="
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/field/FieldType;->field:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
