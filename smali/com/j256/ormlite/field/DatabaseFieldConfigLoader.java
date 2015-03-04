package com.j256.ormlite.field; class DatabaseFieldConfigLoader { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/field/DatabaseFieldConfigLoader;
a=0;// .super Ljava/lang/Object;
a=0;// .source "DatabaseFieldConfigLoader.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final CONFIG_FILE_END_MARKER:Ljava/lang/String; = "# --field-end--"
a=0;// 
a=0;// .field private static final CONFIG_FILE_START_MARKER:Ljava/lang/String; = "# --field-start--"
a=0;// 
a=0;// .field private static final DEFAULT_DATA_PERSISTER:Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;// .field private static final DEFAULT_MAX_EAGER_FOREIGN_COLLECTION_LEVEL:I = 0x1
a=0;// 
a=0;// .field private static final FIELD_NAME_ALLOW_GENERATED_ID_INSERT:Ljava/lang/String; = "allowGeneratedIdInsert"
a=0;// 
a=0;// .field private static final FIELD_NAME_CAN_BE_NULL:Ljava/lang/String; = "canBeNull"
a=0;// 
a=0;// .field private static final FIELD_NAME_COLUMN_DEFINITION:Ljava/lang/String; = "columnDefinition"
a=0;// 
a=0;// .field private static final FIELD_NAME_COLUMN_NAME:Ljava/lang/String; = "columnName"
a=0;// 
a=0;// .field private static final FIELD_NAME_DATA_PERSISTER:Ljava/lang/String; = "dataPersister"
a=0;// 
a=0;// .field private static final FIELD_NAME_DEFAULT_VALUE:Ljava/lang/String; = "defaultValue"
a=0;// 
a=0;// .field private static final FIELD_NAME_FIELD_NAME:Ljava/lang/String; = "fieldName"
a=0;// 
a=0;// .field private static final FIELD_NAME_FOREIGN:Ljava/lang/String; = "foreign"
a=0;// 
a=0;// .field private static final FIELD_NAME_FOREIGN_AUTO_CREATE:Ljava/lang/String; = "foreignAutoCreate"
a=0;// 
a=0;// .field private static final FIELD_NAME_FOREIGN_AUTO_REFRESH:Ljava/lang/String; = "foreignAutoRefresh"
a=0;// 
a=0;// .field private static final FIELD_NAME_FOREIGN_COLLECTION:Ljava/lang/String; = "foreignCollection"
a=0;// 
a=0;// .field private static final FIELD_NAME_FOREIGN_COLLECTION_COLUMN_NAME:Ljava/lang/String; = "foreignCollectionColumnName"
a=0;// 
a=0;// .field private static final FIELD_NAME_FOREIGN_COLLECTION_EAGER:Ljava/lang/String; = "foreignCollectionEager"
a=0;// 
a=0;// .field private static final FIELD_NAME_FOREIGN_COLLECTION_FOREIGN_FIELD_NAME:Ljava/lang/String; = "foreignCollectionForeignFieldName"
a=0;// 
a=0;// .field private static final FIELD_NAME_FOREIGN_COLLECTION_FOREIGN_FIELD_NAME_OLD:Ljava/lang/String; = "foreignCollectionForeignColumnName"
a=0;// 
a=0;// .field private static final FIELD_NAME_FOREIGN_COLLECTION_ORDER_ASCENDING:Ljava/lang/String; = "foreignCollectionOrderAscending"
a=0;// 
a=0;// .field private static final FIELD_NAME_FOREIGN_COLLECTION_ORDER_COLUMN_NAME:Ljava/lang/String; = "foreignCollectionOrderColumnName"
a=0;// 
a=0;// .field private static final FIELD_NAME_FOREIGN_COLLECTION_ORDER_COLUMN_NAME_OLD:Ljava/lang/String; = "foreignCollectionOrderColumn"
a=0;// 
a=0;// .field private static final FIELD_NAME_FORMAT:Ljava/lang/String; = "format"
a=0;// 
a=0;// .field private static final FIELD_NAME_GENERATED_ID:Ljava/lang/String; = "generatedId"
a=0;// 
a=0;// .field private static final FIELD_NAME_GENERATED_ID_SEQUENCE:Ljava/lang/String; = "generatedIdSequence"
a=0;// 
a=0;// .field private static final FIELD_NAME_ID:Ljava/lang/String; = "id"
a=0;// 
a=0;// .field private static final FIELD_NAME_INDEX:Ljava/lang/String; = "index"
a=0;// 
a=0;// .field private static final FIELD_NAME_INDEX_NAME:Ljava/lang/String; = "indexName"
a=0;// 
a=0;// .field private static final FIELD_NAME_MAX_EAGER_FOREIGN_COLLECTION_LEVEL:Ljava/lang/String; = "foreignCollectionMaxEagerLevel"
a=0;// 
a=0;// .field private static final FIELD_NAME_MAX_EAGER_FOREIGN_COLLECTION_LEVEL_OLD:Ljava/lang/String; = "maxEagerForeignCollectionLevel"
a=0;// 
a=0;// .field private static final FIELD_NAME_MAX_FOREIGN_AUTO_REFRESH_LEVEL:Ljava/lang/String; = "maxForeignAutoRefreshLevel"
a=0;// 
a=0;// .field private static final FIELD_NAME_PERSISTER_CLASS:Ljava/lang/String; = "persisterClass"
a=0;// 
a=0;// .field private static final FIELD_NAME_THROW_IF_NULL:Ljava/lang/String; = "throwIfNull"
a=0;// 
a=0;// .field private static final FIELD_NAME_UNIQUE:Ljava/lang/String; = "unique"
a=0;// 
a=0;// .field private static final FIELD_NAME_UNIQUE_COMBO:Ljava/lang/String; = "uniqueCombo"
a=0;// 
a=0;// .field private static final FIELD_NAME_UNIQUE_INDEX:Ljava/lang/String; = "uniqueIndex"
a=0;// 
a=0;// .field private static final FIELD_NAME_UNIQUE_INDEX_NAME:Ljava/lang/String; = "uniqueIndexName"
a=0;// 
a=0;// .field private static final FIELD_NAME_UNKNOWN_ENUM_VALUE:Ljava/lang/String; = "unknownEnumValue"
a=0;// 
a=0;// .field private static final FIELD_NAME_USE_GET_SET:Ljava/lang/String; = "useGetSet"
a=0;// 
a=0;// .field private static final FIELD_NAME_VERSION:Ljava/lang/String; = "version"
a=0;// 
a=0;// .field private static final FIELD_NAME_WIDTH:Ljava/lang/String; = "width"
a=0;// 
a=0;// .field private static final FOREIGN_COLUMN_NAME:Ljava/lang/String; = "foreignColumnName"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     sget-object v0, Lcom/j256/ormlite/field/DatabaseFieldConfig;->DEFAULT_DATA_TYPE:Lcom/j256/ormlite/field/DataType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/DataType;);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/field/DataType;->getDataPersister()Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/j256/ormlite/field/DatabaseFieldConfigLoader;->DEFAULT_DATA_PERSISTER:Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfigLoader;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static fromReader(Ljava/io/BufferedReader;)Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;//     .locals 8
a=0;//     .param p0, "reader"    # Ljava/io/BufferedReader;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     new-instance v1, Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     invoke-direct {v1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;-><init>()V
a=0;// 
a=0;//     .line 31
a=0;//     .local v1, "config":Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 35
a=0;//     .local v0, "anything":Z
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 39
a=0;//     .local v3, "line":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 58
a=0;//     :cond_1
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 62
a=0;//     .end local v1    # "config":Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;//     :goto_1
a=0;//     return-object v1
a=0;// 
a=0;//     .line 36
a=0;//     .end local v3    # "line":Ljava/lang/String;
a=0;//     .restart local v1    # "config":Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 37
a=0;//     .local v2, "e":Ljava/io/IOException;
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     const-string v5, "Could not read DatabaseFieldConfig from stream"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v2}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     throw v5
a=0;// 
a=0;//     .line 43
a=0;//     .end local v2    # "e":Ljava/io/IOException;
a=0;//     .restart local v3    # "line":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v2=(Uninit);v3=(Reference,Ljava/lang/String;);v5=(Conflicted);
a=0;//     const-string v5, "# --field-end--"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 47
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     const-string v5, "#"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     const-string v5, "# --field-start--"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     .line 50
a=0;//     const-string v5, "="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, -0x2
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     invoke-virtual {v3, v5, v6}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 51
a=0;//     .local v4, "parts":[Ljava/lang/String;
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     array-length v5, v4
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     if-eq v5, v6, :cond_3
a=0;// 
a=0;//     .line 52
a=0;//     new-instance v5, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "DatabaseFieldConfig reading from stream cannot parse line: "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
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
a=0;// 
a=0;//     .line 54
a=0;//     :cond_3
a=0;//     #v5=(Integer);v6=(PosByte);v7=(Uninit);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     aget-object v5, v4, v5
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     aget-object v6, v4, v6
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {v1, v5, v6}, Lcom/j256/ormlite/field/DatabaseFieldConfigLoader;->readField(Lcom/j256/ormlite/field/DatabaseFieldConfig;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 55
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 56
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 62
a=0;//     .end local v4    # "parts":[Ljava/lang/String;
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static readField(Lcom/j256/ormlite/field/DatabaseFieldConfig;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 15
a=0;//     .param p0, "config"    # Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;//     .param p1, "field"    # Ljava/lang/String;
a=0;//     .param p2, "value"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 299
a=0;//     const-string v12, "fieldName"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_1
a=0;// 
a=0;//     .line 300
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setFieldName(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 414
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 301
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Boolean);v13=(Uninit);
a=0;//     const-string v12, "columnName"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_2
a=0;// 
a=0;//     .line 302
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setColumnName(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 303
a=0;//     :cond_2
a=0;//     const-string v12, "dataPersister"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_3
a=0;// 
a=0;//     .line 304
a=0;//     invoke-static/range {p2 .. p2}, Lcom/j256/ormlite/field/DataType;->valueOf(Ljava/lang/String;)Lcom/j256/ormlite/field/DataType;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Lcom/j256/ormlite/field/DataType;);
a=0;//     invoke-virtual {v12}, Lcom/j256/ormlite/field/DataType;->getDataPersister()Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {p0, v12}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setDataPersister(Lcom/j256/ormlite/field/DataPersister;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 305
a=0;//     :cond_3
a=0;//     #v12=(Boolean);
a=0;//     const-string v12, "defaultValue"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_4
a=0;// 
a=0;//     .line 306
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setDefaultValue(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 307
a=0;//     :cond_4
a=0;//     const-string v12, "width"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_5
a=0;// 
a=0;//     .line 308
a=0;//     invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     invoke-virtual {p0, v12}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setWidth(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 309
a=0;//     :cond_5
a=0;//     #v12=(Boolean);
a=0;//     const-string v12, "canBeNull"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_6
a=0;// 
a=0;//     .line 310
a=0;//     invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     invoke-virtual {p0, v12}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setCanBeNull(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 311
a=0;//     :cond_6
a=0;//     const-string v12, "id"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_7
a=0;// 
a=0;//     .line 312
a=0;//     invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     invoke-virtual {p0, v12}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setId(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 313
a=0;//     :cond_7
a=0;//     const-string v12, "generatedId"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_8
a=0;// 
a=0;//     .line 314
a=0;//     invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     invoke-virtual {p0, v12}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setGeneratedId(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 315
a=0;//     :cond_8
a=0;//     const-string v12, "generatedIdSequence"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_9
a=0;// 
a=0;//     .line 316
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setGeneratedIdSequence(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 317
a=0;//     :cond_9
a=0;//     const-string v12, "foreign"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_a
a=0;// 
a=0;//     .line 318
a=0;//     invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     invoke-virtual {p0, v12}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setForeign(Z)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 319
a=0;//     :cond_a
a=0;//     const-string v12, "useGetSet"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_b
a=0;// 
a=0;//     .line 320
a=0;//     invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     invoke-virtual {p0, v12}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setUseGetSet(Z)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 321
a=0;//     :cond_b
a=0;//     const-string v12, "unknownEnumValue"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_10
a=0;// 
a=0;//     .line 322
a=0;//     const-string v12, "#"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     const/4 v13, -0x2
a=0;// 
a=0;//     #v13=(Byte);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v0, v12, v13}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 323
a=0;//     .local v11, "parts":[Ljava/lang/String;
a=0;//     #v11=(Reference,[Ljava/lang/String;);
a=0;//     array-length v12, v11
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     const/4 v13, 0x2
a=0;// 
a=0;//     #v13=(PosByte);
a=0;//     if-eq v12, v13, :cond_c
a=0;// 
a=0;//     .line 324
a=0;//     new-instance v12, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v13, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v14, "Invalid value for unknownEnumValue which should be in class#name format: "
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-direct {v12, v13}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v12
a=0;// 
a=0;//     .line 329
a=0;//     :cond_c
a=0;//     #v12=(Integer);v13=(PosByte);v14=(Uninit);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v12=(Null);
a=0;//     aget-object v12, v11, v12
a=0;// 
a=0;//     invoke-static {v12}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 333
a=0;//     .local v5, "enumClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v5}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 334
a=0;//     .local v3, "consts":[Ljava/lang/Object;
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     if-nez v3, :cond_d
a=0;// 
a=0;//     .line 335
a=0;//     new-instance v12, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v13, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v14, "Invalid class is not an Enum for unknownEnumValue: "
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-direct {v12, v13}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v12
a=0;// 
a=0;//     .line 330
a=0;//     .end local v3    # "consts":[Ljava/lang/Object;
a=0;//     .end local v5    # "enumClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     :catch_0
a=0;//     #v3=(Uninit);v5=(Uninit);v12=(Null);v13=(PosByte);v14=(Uninit);
a=0;//     move-exception v4
a=0;// 
a=0;//     .line 331
a=0;//     .local v4, "e":Ljava/lang/ClassNotFoundException;
a=0;//     #v4=(Reference,Ljava/lang/ClassNotFoundException;);
a=0;//     new-instance v12, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v13, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v14, "Unknown class specified for unknownEnumValue: "
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-direct {v12, v13}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v12
a=0;// 
a=0;//     .line 338
a=0;//     .end local v4    # "e":Ljava/lang/ClassNotFoundException;
a=0;//     .restart local v3    # "consts":[Ljava/lang/Object;
a=0;//     .restart local v5    # "enumClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     :cond_d
a=0;//     #v3=(Reference,[Ljava/lang/Object;);v4=(Uninit);v5=(Reference,Ljava/lang/Class;);v12=(Null);v13=(PosByte);v14=(Uninit);
a=0;//     check-cast v3, [Ljava/lang/Enum;
a=0;// 
a=0;//     .end local v3    # "consts":[Ljava/lang/Object;
a=0;//     move-object v6, v3
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Enum;);
a=0;//     check-cast v6, [Ljava/lang/Enum;
a=0;// 
a=0;//     .line 339
a=0;//     .local v6, "enumConstants":[Ljava/lang/Enum;
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 340
a=0;//     .local v8, "found":Z
a=0;//     #v8=(Null);
a=0;//     move-object v1, v6
a=0;// 
a=0;//     .local v1, "arr$":[Ljava/lang/Enum;
a=0;//     #v1=(Reference,[Ljava/lang/Enum;);
a=0;//     array-length v10, v1
a=0;// 
a=0;//     .local v10, "len$":I
a=0;//     #v10=(Integer);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .local v9, "i$":I
a=0;//     :goto_1
a=0;//     #v7=(Conflicted);v8=(Boolean);v9=(Integer);v12=(Boolean);
a=0;//     if-ge v9, v10, :cond_f
a=0;// 
a=0;//     aget-object v7, v1, v9
a=0;// 
a=0;//     .line 341
a=0;//     .local v7, "enumInstance":Ljava/lang/Enum;, "Ljava/lang/Enum<*>;"
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     const/4 v13, 0x1
a=0;// 
a=0;//     #v13=(One);
a=0;//     aget-object v13, v11, v13
a=0;// 
a=0;//     #v13=(Null);
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_e
a=0;// 
a=0;//     .line 342
a=0;//     invoke-virtual {p0, v7}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setUnknownEnumValue(Ljava/lang/Enum;)V
a=0;// 
a=0;//     .line 343
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     .line 340
a=0;//     :cond_e
a=0;//     add-int/lit8 v9, v9, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 346
a=0;//     .end local v7    # "enumInstance":Ljava/lang/Enum;, "Ljava/lang/Enum<*>;"
a=0;//     :cond_f
a=0;//     #v7=(Conflicted);v13=(PosByte);
a=0;//     if-nez v8, :cond_0
a=0;// 
a=0;//     .line 347
a=0;//     new-instance v12, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v13, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v14, "Invalid enum value name for unknownEnumvalue: "
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-direct {v12, v13}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v12
a=0;// 
a=0;//     .line 349
a=0;//     .end local v1    # "arr$":[Ljava/lang/Enum;
a=0;//     .end local v5    # "enumClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     .end local v6    # "enumConstants":[Ljava/lang/Enum;
a=0;//     .end local v8    # "found":Z
a=0;//     .end local v9    # "i$":I
a=0;//     .end local v10    # "len$":I
a=0;//     .end local v11    # "parts":[Ljava/lang/String;
a=0;//     :cond_10
a=0;//     #v1=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Boolean);v13=(Uninit);v14=(Uninit);
a=0;//     const-string v12, "throwIfNull"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_11
a=0;// 
a=0;//     .line 350
a=0;//     invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     invoke-virtual {p0, v12}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setThrowIfNull(Z)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 351
a=0;//     :cond_11
a=0;//     const-string v12, "format"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_12
a=0;// 
a=0;//     .line 352
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setFormat(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 353
a=0;//     :cond_12
a=0;//     const-string v12, "unique"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_13
a=0;// 
a=0;//     .line 354
a=0;//     invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     invoke-virtual {p0, v12}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setUnique(Z)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 355
a=0;//     :cond_13
a=0;//     const-string v12, "uniqueCombo"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_14
a=0;// 
a=0;//     .line 356
a=0;//     invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     invoke-virtual {p0, v12}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setUniqueCombo(Z)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 357
a=0;//     :cond_14
a=0;//     const-string v12, "index"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_15
a=0;// 
a=0;//     .line 358
a=0;//     invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     invoke-virtual {p0, v12}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setIndex(Z)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 359
a=0;//     :cond_15
a=0;//     const-string v12, "indexName"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_16
a=0;// 
a=0;//     .line 360
a=0;//     const/4 v12, 0x1
a=0;// 
a=0;//     #v12=(One);
a=0;//     invoke-virtual {p0, v12}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setIndex(Z)V
a=0;// 
a=0;//     .line 361
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setIndexName(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 362
a=0;//     :cond_16
a=0;//     #v12=(Boolean);
a=0;//     const-string v12, "uniqueIndex"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_17
a=0;// 
a=0;//     .line 363
a=0;//     invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     invoke-virtual {p0, v12}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setUniqueIndex(Z)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 364
a=0;//     :cond_17
a=0;//     const-string v12, "uniqueIndexName"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_18
a=0;// 
a=0;//     .line 365
a=0;//     const/4 v12, 0x1
a=0;// 
a=0;//     #v12=(One);
a=0;//     invoke-virtual {p0, v12}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setUniqueIndex(Z)V
a=0;// 
a=0;//     .line 366
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setUniqueIndexName(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 367
a=0;//     :cond_18
a=0;//     #v12=(Boolean);
a=0;//     const-string v12, "foreignAutoRefresh"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_19
a=0;// 
a=0;//     .line 368
a=0;//     invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     invoke-virtual {p0, v12}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setForeignAutoRefresh(Z)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 369
a=0;//     :cond_19
a=0;//     const-string v12, "maxForeignAutoRefreshLevel"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_1a
a=0;// 
a=0;//     .line 370
a=0;//     invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     invoke-virtual {p0, v12}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setMaxForeignAutoRefreshLevel(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 371
a=0;//     :cond_1a
a=0;//     #v12=(Boolean);
a=0;//     const-string v12, "persisterClass"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_1b
a=0;// 
a=0;//     .line 374
a=0;//     :try_start_1
a=0;//     invoke-static/range {p2 .. p2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 375
a=0;//     .local v2, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/j256/ormlite/field/DataPersister;>;"
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setPersisterClass(Ljava/lang/Class;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 376
a=0;//     .end local v2    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/j256/ormlite/field/DataPersister;>;"
a=0;//     :catch_1
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     .line 377
a=0;//     .restart local v4    # "e":Ljava/lang/ClassNotFoundException;
a=0;//     #v4=(Reference,Ljava/lang/ClassNotFoundException;);
a=0;//     new-instance v12, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v13, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v14, "Could not find persisterClass: "
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-direct {v12, v13}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v12
a=0;// 
a=0;//     .line 379
a=0;//     .end local v4    # "e":Ljava/lang/ClassNotFoundException;
a=0;//     :cond_1b
a=0;//     #v2=(Uninit);v4=(Uninit);v12=(Boolean);v13=(Uninit);v14=(Uninit);
a=0;//     const-string v12, "allowGeneratedIdInsert"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_1c
a=0;// 
a=0;//     .line 380
a=0;//     invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     invoke-virtual {p0, v12}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setAllowGeneratedIdInsert(Z)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 381
a=0;//     :cond_1c
a=0;//     const-string v12, "columnDefinition"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_1d
a=0;// 
a=0;//     .line 382
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setColumnDefinition(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 383
a=0;//     :cond_1d
a=0;//     const-string v12, "foreignAutoCreate"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_1e
a=0;// 
a=0;//     .line 384
a=0;//     invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     invoke-virtual {p0, v12}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setForeignAutoCreate(Z)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 385
a=0;//     :cond_1e
a=0;//     const-string v12, "version"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_1f
a=0;// 
a=0;//     .line 386
a=0;//     invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     invoke-virtual {p0, v12}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setVersion(Z)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 387
a=0;//     :cond_1f
a=0;//     const-string v12, "foreignColumnName"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_20
a=0;// 
a=0;//     .line 388
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setForeignColumnName(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 393
a=0;//     :cond_20
a=0;//     const-string v12, "foreignCollection"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_21
a=0;// 
a=0;//     .line 394
a=0;//     invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     invoke-virtual {p0, v12}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setForeignCollection(Z)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 395
a=0;//     :cond_21
a=0;//     const-string v12, "foreignCollectionEager"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_22
a=0;// 
a=0;//     .line 396
a=0;//     invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     invoke-virtual {p0, v12}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setForeignCollectionEager(Z)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 397
a=0;//     :cond_22
a=0;//     const-string v12, "maxEagerForeignCollectionLevel"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_23
a=0;// 
a=0;//     .line 398
a=0;//     invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     invoke-virtual {p0, v12}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setForeignCollectionMaxEagerLevel(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 399
a=0;//     :cond_23
a=0;//     #v12=(Boolean);
a=0;//     const-string v12, "foreignCollectionMaxEagerLevel"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_24
a=0;// 
a=0;//     .line 400
a=0;//     invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     invoke-virtual {p0, v12}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setForeignCollectionMaxEagerLevel(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 401
a=0;//     :cond_24
a=0;//     #v12=(Boolean);
a=0;//     const-string v12, "foreignCollectionColumnName"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_25
a=0;// 
a=0;//     .line 402
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setForeignCollectionColumnName(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 403
a=0;//     :cond_25
a=0;//     const-string v12, "foreignCollectionOrderColumn"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_26
a=0;// 
a=0;//     .line 404
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setForeignCollectionOrderColumnName(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 405
a=0;//     :cond_26
a=0;//     const-string v12, "foreignCollectionOrderColumnName"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_27
a=0;// 
a=0;//     .line 406
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setForeignCollectionOrderColumnName(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 407
a=0;//     :cond_27
a=0;//     const-string v12, "foreignCollectionOrderAscending"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_28
a=0;// 
a=0;//     .line 408
a=0;//     invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     invoke-virtual {p0, v12}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setForeignCollectionOrderAscending(Z)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 409
a=0;//     :cond_28
a=0;//     const-string v12, "foreignCollectionForeignColumnName"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_29
a=0;// 
a=0;//     .line 410
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setForeignCollectionForeignFieldName(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 411
a=0;//     :cond_29
a=0;//     const-string v12, "foreignCollectionForeignFieldName"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_0
a=0;// 
a=0;//     .line 412
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setForeignCollectionForeignFieldName(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static write(Ljava/io/BufferedWriter;Lcom/j256/ormlite/field/DatabaseFieldConfig;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p0, "writer"    # Ljava/io/BufferedWriter;
a=0;//     .param p1, "config"    # Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;//     .param p2, "tableName"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     :try_start_0
a=0;//     invoke-static {p0, p1, p2}, Lcom/j256/ormlite/field/DatabaseFieldConfigLoader;->writeConfig(Ljava/io/BufferedWriter;Lcom/j256/ormlite/field/DatabaseFieldConfig;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 75
a=0;//     return-void
a=0;// 
a=0;//     .line 72
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 73
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     const-string v1, "Could not write config to writer"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public static writeConfig(Ljava/io/BufferedWriter;Lcom/j256/ormlite/field/DatabaseFieldConfig;Ljava/lang/String;)V
a=0;//     .locals 12
a=0;//     .param p0, "writer"    # Ljava/io/BufferedWriter;
a=0;//     .param p1, "config"    # Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;//     .param p2, "tableName"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     #v11=(One);
a=0;//     const/16 v10, 0x3d
a=0;// 
a=0;//     .line 123
a=0;//     #v10=(PosByte);
a=0;//     const-string v8, "# --field-start--"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 124
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 125
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getFieldName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     .line 126
a=0;//     const-string v8, "fieldName"
a=0;// 
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getFieldName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 127
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 129
a=0;//     :cond_0
a=0;//     #v9=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     if-eqz v8, :cond_1
a=0;// 
a=0;//     .line 130
a=0;//     const-string v8, "columnName"
a=0;// 
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 131
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 133
a=0;//     :cond_1
a=0;//     #v9=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getDataPersister()Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     sget-object v9, Lcom/j256/ormlite/field/DatabaseFieldConfigLoader;->DEFAULT_DATA_PERSISTER:Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     #v9=(Reference,Lcom/j256/ormlite/field/DataPersister;);
a=0;//     if-eq v8, v9, :cond_4
a=0;// 
a=0;//     .line 134
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 135
a=0;//     .local v3, "found":Z
a=0;//     #v3=(Null);
a=0;//     invoke-static {}, Lcom/j256/ormlite/field/DataType;->values()[Lcom/j256/ormlite/field/DataType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "arr$":[Lcom/j256/ormlite/field/DataType;
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/field/DataType;);
a=0;//     array-length v6, v0
a=0;// 
a=0;//     .local v6, "len$":I
a=0;//     #v6=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .local v4, "i$":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v4=(Integer);
a=0;//     if-ge v4, v6, :cond_2
a=0;// 
a=0;//     aget-object v1, v0, v4
a=0;// 
a=0;//     .line 136
a=0;//     .local v1, "dataType":Lcom/j256/ormlite/field/DataType;
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/field/DataType;->getDataPersister()Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getDataPersister()Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     if-ne v8, v9, :cond_3
a=0;// 
a=0;//     .line 137
a=0;//     const-string v8, "dataPersister"
a=0;// 
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/field/DataType;->name()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 138
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 139
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 143
a=0;//     .end local v1    # "dataType":Lcom/j256/ormlite/field/DataType;
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v3=(Boolean);
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     .line 144
a=0;//     new-instance v8, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "Unknown data persister field: "
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getDataPersister()Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-direct {v8, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v8
a=0;// 
a=0;//     .line 135
a=0;//     .restart local v1    # "dataType":Lcom/j256/ormlite/field/DataType;
a=0;//     :cond_3
a=0;//     #v1=(Null);v3=(Null);v10=(PosByte);
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 147
a=0;//     .end local v0    # "arr$":[Lcom/j256/ormlite/field/DataType;
a=0;//     .end local v1    # "dataType":Lcom/j256/ormlite/field/DataType;
a=0;//     .end local v3    # "found":Z
a=0;//     .end local v4    # "i$":I
a=0;//     .end local v6    # "len$":I
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getDefaultValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     if-eqz v8, :cond_5
a=0;// 
a=0;//     .line 148
a=0;//     const-string v8, "defaultValue"
a=0;// 
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getDefaultValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 149
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 151
a=0;//     :cond_5
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getWidth()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-eqz v8, :cond_6
a=0;// 
a=0;//     .line 152
a=0;//     const-string v8, "width"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getWidth()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-static {v9}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 153
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 155
a=0;//     :cond_6
a=0;//     #v8=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isCanBeNull()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eq v8, v11, :cond_7
a=0;// 
a=0;//     .line 156
a=0;//     const-string v8, "canBeNull"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isCanBeNull()Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     invoke-static {v9}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 157
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 159
a=0;//     :cond_7
a=0;//     #v8=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isId()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_8
a=0;// 
a=0;//     .line 160
a=0;//     const-string v8, "id"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "true"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 161
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 163
a=0;//     :cond_8
a=0;//     #v8=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isGeneratedId()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_9
a=0;// 
a=0;//     .line 164
a=0;//     const-string v8, "generatedId"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "true"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 165
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 167
a=0;//     :cond_9
a=0;//     #v8=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getGeneratedIdSequence()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v8, :cond_a
a=0;// 
a=0;//     .line 168
a=0;//     const-string v8, "generatedIdSequence"
a=0;// 
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getGeneratedIdSequence()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 169
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 171
a=0;//     :cond_a
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeign()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_b
a=0;// 
a=0;//     .line 172
a=0;//     const-string v8, "foreign"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "true"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 173
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 175
a=0;//     :cond_b
a=0;//     #v8=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isUseGetSet()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_c
a=0;// 
a=0;//     .line 176
a=0;//     const-string v8, "useGetSet"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "true"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 177
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 179
a=0;//     :cond_c
a=0;//     #v8=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getUnknownEnumValue()Ljava/lang/Enum;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Enum;);
a=0;//     if-eqz v8, :cond_d
a=0;// 
a=0;//     .line 180
a=0;//     const-string v8, "unknownEnumValue"
a=0;// 
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getUnknownEnumValue()Ljava/lang/Enum;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "#"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getUnknownEnumValue()Ljava/lang/Enum;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 185
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 187
a=0;//     :cond_d
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isThrowIfNull()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_e
a=0;// 
a=0;//     .line 188
a=0;//     const-string v8, "throwIfNull"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "true"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 189
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 191
a=0;//     :cond_e
a=0;//     #v8=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getFormat()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v8, :cond_f
a=0;// 
a=0;//     .line 192
a=0;//     const-string v8, "format"
a=0;// 
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getFormat()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 193
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 195
a=0;//     :cond_f
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isUnique()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_10
a=0;// 
a=0;//     .line 196
a=0;//     const-string v8, "unique"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "true"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 197
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 199
a=0;//     :cond_10
a=0;//     #v8=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isUniqueCombo()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_11
a=0;// 
a=0;//     .line 200
a=0;//     const-string v8, "uniqueCombo"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "true"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 201
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 203
a=0;//     :cond_11
a=0;//     #v8=(Conflicted);
a=0;//     invoke-virtual {p1, p2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getIndexName(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 204
a=0;//     .local v5, "indexName":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v5, :cond_12
a=0;// 
a=0;//     .line 205
a=0;//     const-string v8, "indexName"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v5}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 206
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 208
a=0;//     :cond_12
a=0;//     #v8=(Conflicted);
a=0;//     invoke-virtual {p1, p2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getUniqueIndexName(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 209
a=0;//     .local v7, "uniqueIndexName":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v7, :cond_13
a=0;// 
a=0;//     .line 210
a=0;//     const-string v8, "uniqueIndexName"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v7}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 211
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 213
a=0;//     :cond_13
a=0;//     #v8=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeignAutoRefresh()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_14
a=0;// 
a=0;//     .line 214
a=0;//     const-string v8, "foreignAutoRefresh"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "true"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 215
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 217
a=0;//     :cond_14
a=0;//     #v8=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getMaxForeignAutoRefreshLevel()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const/4 v9, -0x1
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     if-eq v8, v9, :cond_15
a=0;// 
a=0;//     .line 218
a=0;//     const-string v8, "maxForeignAutoRefreshLevel"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getMaxForeignAutoRefreshLevel()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-static {v9}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 221
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 223
a=0;//     :cond_15
a=0;//     #v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getPersisterClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Class;);
a=0;//     sget-object v9, Lcom/j256/ormlite/field/DatabaseFieldConfig;->DEFAULT_PERSISTER_CLASS:Ljava/lang/Class;
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Class;);
a=0;//     if-eq v8, v9, :cond_16
a=0;// 
a=0;//     .line 224
a=0;//     const-string v8, "persisterClass"
a=0;// 
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getPersisterClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 225
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 227
a=0;//     :cond_16
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isAllowGeneratedIdInsert()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_17
a=0;// 
a=0;//     .line 228
a=0;//     const-string v8, "allowGeneratedIdInsert"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "true"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 229
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 231
a=0;//     :cond_17
a=0;//     #v8=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getColumnDefinition()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v8, :cond_18
a=0;// 
a=0;//     .line 232
a=0;//     const-string v8, "columnDefinition"
a=0;// 
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getColumnDefinition()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 233
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 235
a=0;//     :cond_18
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeignAutoCreate()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_19
a=0;// 
a=0;//     .line 236
a=0;//     const-string v8, "foreignAutoCreate"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "true"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 237
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 239
a=0;//     :cond_19
a=0;//     #v8=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isVersion()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_1a
a=0;// 
a=0;//     .line 240
a=0;//     const-string v8, "version"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "true"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 241
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 243
a=0;//     :cond_1a
a=0;//     #v8=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getForeignColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 244
a=0;//     .local v2, "foreignColumnName":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_1b
a=0;// 
a=0;//     .line 245
a=0;//     const-string v8, "foreignColumnName"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v2}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 246
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 252
a=0;//     :cond_1b
a=0;//     #v8=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeignCollection()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_1c
a=0;// 
a=0;//     .line 253
a=0;//     const-string v8, "foreignCollection"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "true"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 254
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 256
a=0;//     :cond_1c
a=0;//     #v8=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeignCollectionEager()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_1d
a=0;// 
a=0;//     .line 257
a=0;//     const-string v8, "foreignCollectionEager"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "true"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 258
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 260
a=0;//     :cond_1d
a=0;//     #v8=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getForeignCollectionMaxEagerLevel()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-eq v8, v11, :cond_1e
a=0;// 
a=0;//     .line 261
a=0;//     const-string v8, "foreignCollectionMaxEagerLevel"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getForeignCollectionMaxEagerLevel()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-static {v9}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 264
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 266
a=0;//     :cond_1e
a=0;//     #v8=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getForeignCollectionColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v8, :cond_1f
a=0;// 
a=0;//     .line 267
a=0;//     const-string v8, "foreignCollectionColumnName"
a=0;// 
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getForeignCollectionColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 270
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 272
a=0;//     :cond_1f
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getForeignCollectionOrderColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     if-eqz v8, :cond_20
a=0;// 
a=0;//     .line 273
a=0;//     const-string v8, "foreignCollectionOrderColumnName"
a=0;// 
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getForeignCollectionOrderColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 276
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 278
a=0;//     :cond_20
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeignCollectionOrderAscending()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eq v8, v11, :cond_21
a=0;// 
a=0;//     .line 279
a=0;//     const-string v8, "foreignCollectionOrderAscending"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isForeignCollectionOrderAscending()Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     invoke-static {v9}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 282
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 284
a=0;//     :cond_21
a=0;//     #v8=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getForeignCollectionForeignFieldName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v8, :cond_22
a=0;// 
a=0;//     .line 285
a=0;//     const-string v8, "foreignCollectionForeignFieldName"
a=0;// 
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v10}, Ljava/io/Writer;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getForeignCollectionForeignFieldName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 288
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 291
a=0;//     :cond_22
a=0;//     const-string v8, "# --field-end--"
a=0;// 
a=0;//     invoke-virtual {p0, v8}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 292
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 293
a=0;//     return-void
a=0;// .end method
}}
