package com.j256.ormlite.table; class DatabaseTableConfig { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/table/DatabaseTableConfig;
a=0;// .super Ljava/lang/Object;
a=0;// .source "DatabaseTableConfig.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/lang/Object;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private constructor:Ljava/lang/reflect/Constructor;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/lang/reflect/Constructor",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private dataClass:Ljava/lang/Class;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private fieldConfigs:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/j256/ormlite/field/DatabaseFieldConfig;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private fieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;// .field private tableName:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     .local p0, "this":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 32
a=0;//     #p0=(Reference,Lcom/j256/ormlite/table/DatabaseTableConfig;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;Ljava/util/List;)V
a=0;//     .locals 0
a=0;//     .param p2, "tableName"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/j256/ormlite/field/DatabaseFieldConfig;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     .local p0, "this":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     .local p1, "dataClass":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     .local p3, "fieldConfigs":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/field/DatabaseFieldConfig;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 46
a=0;//     #p0=(Reference,Lcom/j256/ormlite/table/DatabaseTableConfig;);
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     .line 47
a=0;//     iput-object p2, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->tableName:Ljava/lang/String;
a=0;// 
a=0;//     .line 48
a=0;//     iput-object p3, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->fieldConfigs:Ljava/util/List;
a=0;// 
a=0;//     .line 49
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Ljava/lang/Class;Ljava/lang/String;[Lcom/j256/ormlite/field/FieldType;)V
a=0;//     .locals 0
a=0;//     .param p2, "tableName"    # Ljava/lang/String;
a=0;//     .param p3, "fieldTypes"    # [Lcom/j256/ormlite/field/FieldType;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;",
a=0;//             "Ljava/lang/String;",
a=0;//             "[",
a=0;//             "Lcom/j256/ormlite/field/FieldType;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     .local p0, "this":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     .local p1, "dataClass":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 52
a=0;//     #p0=(Reference,Lcom/j256/ormlite/table/DatabaseTableConfig;);
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     .line 53
a=0;//     iput-object p2, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->tableName:Ljava/lang/String;
a=0;// 
a=0;//     .line 54
a=0;//     iput-object p3, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->fieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .line 55
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/Class;Ljava/util/List;)V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/j256/ormlite/field/DatabaseFieldConfig;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     .local p0, "this":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     .local p1, "dataClass":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     .local p2, "fieldConfigs":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/field/DatabaseFieldConfig;>;"
a=0;//     invoke-static {p1}, Lcom/j256/ormlite/table/DatabaseTableConfig;->extractTableName(Ljava/lang/Class;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, p1, v0, p2}, Lcom/j256/ormlite/table/DatabaseTableConfig;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/util/List;)V
a=0;// 
a=0;//     .line 40
a=0;//     #p0=(Reference,Lcom/j256/ormlite/table/DatabaseTableConfig;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private convertFieldConfigs(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/String;Ljava/util/List;)[Lcom/j256/ormlite/field/FieldType;
a=0;//     .locals 10
a=0;//     .param p1, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .param p2, "tableName"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/j256/ormlite/field/DatabaseFieldConfig;",
a=0;//             ">;)[",
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
a=0;//     .line 223
a=0;//     .local p0, "this":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     .local p3, "fieldConfigs":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/field/DatabaseFieldConfig;>;"
a=0;//     new-instance v8, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 224
a=0;//     .local v8, "fieldTypes":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/field/FieldType;>;"
a=0;//     #v8=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .local v9, "i$":Ljava/util/Iterator;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     .line 225
a=0;//     .local v4, "fieldConfig":Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 227
a=0;//     .local v0, "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v0=(Null);
a=0;//     iget-object v6, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     .local v6, "classWalk":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v6=(Reference,Ljava/lang/Class;);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 230
a=0;//     :try_start_0
a=0;//     invoke-virtual {v4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getFieldName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 235
a=0;//     .local v3, "field":Ljava/lang/reflect/Field;
a=0;//     #v3=(Reference,Ljava/lang/reflect/Field;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 236
a=0;//     new-instance v0, Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .end local v0    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/field/FieldType;);
a=0;//     iget-object v5, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/j256/ormlite/field/FieldType;-><init>(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/String;Ljava/lang/reflect/Field;Lcom/j256/ormlite/field/DatabaseFieldConfig;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 241
a=0;//     .end local v3    # "field":Ljava/lang/reflect/Field;
a=0;//     .restart local v0    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/FieldType;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 242
a=0;//     new-instance v1, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "Could not find declared field with name \'"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getFieldName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v5, "\' for "
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v5, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
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
a=0;//     .line 231
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v7
a=0;// 
a=0;//     .line 227
a=0;//     :cond_1
a=0;//     invoke-virtual {v6}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 245
a=0;//     :cond_2
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 247
a=0;//     .end local v0    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     .end local v4    # "fieldConfig":Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;//     .end local v6    # "classWalk":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Boolean);v4=(Conflicted);v6=(Conflicted);
a=0;//     invoke-interface {v8}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 248
a=0;//     new-instance v1, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "No fields were configured for class "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v5, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
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
a=0;//     .line 250
a=0;//     :cond_4
a=0;//     #v1=(Boolean);v2=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v8}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-array v1, v1, [Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v1=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-interface {v8, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, [Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method private static extractFieldTypes(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;Ljava/lang/String;)[Lcom/j256/ormlite/field/FieldType;
a=0;//     .locals 10
a=0;//     .param p0, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .param p2, "tableName"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;",
a=0;//             "Ljava/lang/String;",
a=0;//             ")[",
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
a=0;//     .line 205
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 206
a=0;//     .local v4, "fieldTypes":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/field/FieldType;>;"
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     .local v1, "classWalk":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/Class;);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 207
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "arr$":[Ljava/lang/reflect/Field;
a=0;//     #v0=(Reference,[Ljava/lang/reflect/Field;);
a=0;//     array-length v6, v0
a=0;// 
a=0;//     .local v6, "len$":I
a=0;//     #v6=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .local v5, "i$":I
a=0;//     :goto_1
a=0;//     #v5=(Integer);
a=0;//     if-ge v5, v6, :cond_1
a=0;// 
a=0;//     aget-object v2, v0, v5
a=0;// 
a=0;//     .line 208
a=0;//     .local v2, "field":Ljava/lang/reflect/Field;
a=0;//     #v2=(Null);
a=0;//     invoke-static {p0, p2, v2, p1}, Lcom/j256/ormlite/field/FieldType;->createFieldType(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/Class;)Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 209
a=0;//     .local v3, "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v3=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 210
a=0;//     invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 207
a=0;//     :cond_0
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 206
a=0;//     .end local v2    # "field":Ljava/lang/reflect/Field;
a=0;//     .end local v3    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 214
a=0;//     .end local v0    # "arr$":[Ljava/lang/reflect/Field;
a=0;//     .end local v5    # "i$":I
a=0;//     .end local v6    # "len$":I
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_3
a=0;// 
a=0;//     .line 215
a=0;//     new-instance v7, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "No fields have a "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-class v9, Lcom/j256/ormlite/field/DatabaseField;
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, " annotation in "
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 218
a=0;//     :cond_3
a=0;//     #v7=(Boolean);v8=(Uninit);v9=(Uninit);
a=0;//     invoke-interface {v4}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     new-array v7, v7, [Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v7=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-interface {v4, v7}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     check-cast v7, [Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     return-object v7
a=0;// .end method
a=0;// 
a=0;// .method public static extractTableName(Ljava/lang/Class;)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 153
a=0;//     .local p0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     const-class v2, Lcom/j256/ormlite/table/DatabaseTable;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v2}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/annotation/Annotation;);
a=0;//     check-cast v0, Lcom/j256/ormlite/table/DatabaseTable;
a=0;// 
a=0;//     .line 154
a=0;//     .local v0, "databaseTable":Lcom/j256/ormlite/table/DatabaseTable;
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 155
a=0;//     .local v1, "name":Ljava/lang/String;
a=0;//     #v1=(Null);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/table/DatabaseTable;->tableName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/table/DatabaseTable;->tableName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_1
a=0;// 
a=0;//     .line 156
a=0;//     invoke-interface {v0}, Lcom/j256/ormlite/table/DatabaseTable;->tableName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 167
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/String;);v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 161
a=0;//     :cond_1
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0}, Lcom/j256/ormlite/misc/JavaxPersistence;->getEntityName(Ljava/lang/Class;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 162
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 164
a=0;//     invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static findNoArgConstructor(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
a=0;//     .locals 10
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;)",
a=0;//             "Ljava/lang/reflect/Constructor",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 177
a=0;//     .local p0, "dataClass":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/reflect/Constructor;);
a=0;//     check-cast v3, [Ljava/lang/reflect/Constructor;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 179
a=0;//     .local v3, "consts":[Ljava/lang/reflect/Constructor;, "[Ljava/lang/reflect/Constructor<TT;>;"
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .line 183
a=0;//     .local v2, "constructors":[Ljava/lang/reflect/Constructor;, "[Ljava/lang/reflect/Constructor<TT;>;"
a=0;//     #v2=(Reference,[Ljava/lang/reflect/Constructor;);
a=0;//     move-object v0, v2
a=0;// 
a=0;//     .local v0, "arr$":[Ljava/lang/reflect/Constructor;
a=0;//     #v0=(Reference,[Ljava/lang/reflect/Constructor;);
a=0;//     array-length v6, v0
a=0;// 
a=0;//     .local v6, "len$":I
a=0;//     #v6=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .local v5, "i$":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v5=(Integer);v7=(Conflicted);
a=0;//     if-ge v5, v6, :cond_2
a=0;// 
a=0;//     aget-object v1, v0, v5
a=0;// 
a=0;//     .line 184
a=0;//     .local v1, "con":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<TT;>;"
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Class;);
a=0;//     array-length v7, v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-nez v7, :cond_1
a=0;// 
a=0;//     .line 185
a=0;//     invoke-virtual {v1}, Ljava/lang/reflect/Constructor;->isAccessible()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_0
a=0;// 
a=0;//     .line 187
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     :try_start_1
a=0;//     #v7=(One);
a=0;//     invoke-virtual {v1, v7}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 192
a=0;//     :cond_0
a=0;//     #v7=(Boolean);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 180
a=0;//     .end local v0    # "arr$":[Ljava/lang/reflect/Constructor;
a=0;//     .end local v1    # "con":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<TT;>;"
a=0;//     .end local v2    # "constructors":[Ljava/lang/reflect/Constructor;, "[Ljava/lang/reflect/Constructor<TT;>;"
a=0;//     .end local v3    # "consts":[Ljava/lang/reflect/Constructor;, "[Ljava/lang/reflect/Constructor<TT;>;"
a=0;//     .end local v5    # "i$":I
a=0;//     .end local v6    # "len$":I
a=0;//     :catch_0
a=0;//     move-exception v4
a=0;// 
a=0;//     .line 181
a=0;//     .local v4, "e":Ljava/lang/Exception;
a=0;//     #v4=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v7, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "Can\'t lookup declared constructors for "
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
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 188
a=0;//     .end local v4    # "e":Ljava/lang/Exception;
a=0;//     .restart local v0    # "arr$":[Ljava/lang/reflect/Constructor;
a=0;//     .restart local v1    # "con":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<TT;>;"
a=0;//     .restart local v2    # "constructors":[Ljava/lang/reflect/Constructor;, "[Ljava/lang/reflect/Constructor<TT;>;"
a=0;//     .restart local v3    # "consts":[Ljava/lang/reflect/Constructor;, "[Ljava/lang/reflect/Constructor<TT;>;"
a=0;//     .restart local v5    # "i$":I
a=0;//     .restart local v6    # "len$":I
a=0;//     :catch_1
a=0;//     #v0=(Reference,[Ljava/lang/reflect/Constructor;);v1=(Null);v2=(Reference,[Ljava/lang/reflect/Constructor;);v3=(Reference,[Ljava/lang/reflect/Constructor;);v4=(Uninit);v5=(Integer);v6=(Integer);v7=(One);v8=(Uninit);v9=(Uninit);
a=0;//     move-exception v4
a=0;// 
a=0;//     .line 189
a=0;//     .local v4, "e":Ljava/lang/SecurityException;
a=0;//     #v4=(Reference,Ljava/lang/SecurityException;);
a=0;//     new-instance v7, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "Could not open access to constructor for "
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
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 183
a=0;//     .end local v4    # "e":Ljava/lang/SecurityException;
a=0;//     :cond_1
a=0;//     #v4=(Uninit);v7=(Integer);v8=(Uninit);v9=(Uninit);
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 195
a=0;//     .end local v1    # "con":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<TT;>;"
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {p0}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Class;);
a=0;//     if-nez v7, :cond_3
a=0;// 
a=0;//     .line 196
a=0;//     new-instance v7, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "Can\'t find a no-arg constructor for "
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
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 198
a=0;//     :cond_3
a=0;//     #v8=(Uninit);v9=(Uninit);
a=0;//     new-instance v7, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "Can\'t find a no-arg constructor for "
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
a=0;//     const-string v9, ".  Missing static on inner class?"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v7
a=0;// .end method
a=0;// 
a=0;// .method public static fromClass(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)Lcom/j256/ormlite/table/DatabaseTableConfig;
a=0;//     .locals 3
a=0;//     .param p0, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;)",
a=0;//             "Lcom/j256/ormlite/table/DatabaseTableConfig",
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
a=0;//     .line 142
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     invoke-static {p1}, Lcom/j256/ormlite/table/DatabaseTableConfig;->extractTableName(Ljava/lang/Class;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 143
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
a=0;//     .line 144
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 146
a=0;//     :cond_0
a=0;//     new-instance v1, Lcom/j256/ormlite/table/DatabaseTableConfig;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/j256/ormlite/table/DatabaseTableConfig;);
a=0;//     invoke-static {p0, p1, v0}, Lcom/j256/ormlite/table/DatabaseTableConfig;->extractFieldTypes(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;Ljava/lang/String;)[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-direct {v1, p1, v0, v2}, Lcom/j256/ormlite/table/DatabaseTableConfig;-><init>(Ljava/lang/Class;Ljava/lang/String;[Lcom/j256/ormlite/field/FieldType;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/table/DatabaseTableConfig;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public extractFieldTypes(Lcom/j256/ormlite/support/ConnectionSource;)V
a=0;//     .locals 2
a=0;//     .param p1, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     .local p0, "this":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->fieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 98
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->fieldConfigs:Ljava/util/List;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 99
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->tableName:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0, v1}, Lcom/j256/ormlite/table/DatabaseTableConfig;->extractFieldTypes(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;Ljava/lang/String;)[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->fieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .line 104
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 101
a=0;//     :cond_1
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->tableName:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->fieldConfigs:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-direct {p0, p1, v0, v1}, Lcom/j256/ormlite/table/DatabaseTableConfig;->convertFieldConfigs(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/String;Ljava/util/List;)[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->fieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     goto :goto_0
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
a=0;//     .line 125
a=0;//     .local p0, "this":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->constructor:Ljava/lang/reflect/Constructor;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Constructor;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 126
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/j256/ormlite/table/DatabaseTableConfig;->findNoArgConstructor(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->constructor:Ljava/lang/reflect/Constructor;
a=0;// 
a=0;//     .line 128
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->constructor:Ljava/lang/reflect/Constructor;
a=0;// 
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
a=0;//     .line 70
a=0;//     .local p0, "this":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getFieldConfigs()Ljava/util/List;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/j256/ormlite/field/DatabaseFieldConfig;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 117
a=0;//     .local p0, "this":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->fieldConfigs:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getFieldTypes(Lcom/j256/ormlite/db/DatabaseType;)[Lcom/j256/ormlite/field/FieldType;
a=0;//     .locals 2
a=0;//     .param p1, "databaseType"    # Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 110
a=0;//     .local p0, "this":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->fieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 111
a=0;//     new-instance v0, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/sql/SQLException;);
a=0;//     const-string v1, "Field types have not been extracted in table config"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 113
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->fieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTableName()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     .local p0, "this":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->tableName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public initialize()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     .local p0, "this":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 62
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "dataClass was never set on "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
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
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 64
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->tableName:Ljava/lang/String;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 65
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/j256/ormlite/table/DatabaseTableConfig;->extractTableName(Ljava/lang/Class;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->tableName:Ljava/lang/String;
a=0;// 
a=0;//     .line 67
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setConstructor(Ljava/lang/reflect/Constructor;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/reflect/Constructor",
a=0;//             "<TT;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 133
a=0;//     .local p0, "this":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     .local p1, "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<TT;>;"
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->constructor:Ljava/lang/reflect/Constructor;
a=0;// 
a=0;//     .line 134
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setDataClass(Ljava/lang/Class;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     .local p0, "this":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     .local p1, "dataClass":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->dataClass:Ljava/lang/Class;
a=0;// 
a=0;//     .line 76
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setFieldConfigs(Ljava/util/List;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/j256/ormlite/field/DatabaseFieldConfig;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     .local p0, "this":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     .local p1, "fieldConfigs":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/field/DatabaseFieldConfig;>;"
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->fieldConfigs:Ljava/util/List;
a=0;// 
a=0;//     .line 91
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTableName(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "tableName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     .local p0, "this":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<TT;>;"
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/table/DatabaseTableConfig;->tableName:Ljava/lang/String;
a=0;// 
a=0;//     .line 87
a=0;//     return-void
a=0;// .end method
}}
