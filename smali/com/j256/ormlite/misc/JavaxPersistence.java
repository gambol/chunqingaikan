package com.j256.ormlite.misc; class JavaxPersistence { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/misc/JavaxPersistence;
a=0;// .super Ljava/lang/Object;
a=0;// .source "JavaxPersistence.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/j256/ormlite/misc/JavaxPersistence;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static createFieldConfig(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/reflect/Field;)Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;//     .locals 28
a=0;//     .param p0, "databaseType"    # Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .param p1, "field"    # Ljava/lang/reflect/Field;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 29
a=0;//     .local v5, "columnAnnotation":Ljava/lang/annotation/Annotation;
a=0;//     #v5=(Null);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     .line 30
a=0;//     .local v14, "idAnnotation":Ljava/lang/annotation/Annotation;
a=0;//     #v14=(Null);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     .line 31
a=0;//     .local v12, "generatedValueAnnotation":Ljava/lang/annotation/Annotation;
a=0;//     #v12=(Null);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     .line 32
a=0;//     .local v21, "oneToOneAnnotation":Ljava/lang/annotation/Annotation;
a=0;//     #v21=(Null);
a=0;//     const/16 v17, 0x0
a=0;// 
a=0;//     .line 33
a=0;//     .local v17, "manyToOneAnnotation":Ljava/lang/annotation/Annotation;
a=0;//     #v17=(Null);
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     .line 34
a=0;//     .local v15, "joinColumnAnnotation":Ljava/lang/annotation/Annotation;
a=0;//     #v15=(Null);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 35
a=0;//     .local v9, "enumeratedAnnotation":Ljava/lang/annotation/Annotation;
a=0;//     #v9=(Null);
a=0;//     const/16 v24, 0x0
a=0;// 
a=0;//     .line 37
a=0;//     .local v24, "versionAnnotation":Ljava/lang/annotation/Annotation;
a=0;//     #v24=(Null);
a=0;//     invoke-virtual/range {p1 .. p1}, Ljava/lang/reflect/Field;->getAnnotations()[Ljava/lang/annotation/Annotation;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .local v4, "arr$":[Ljava/lang/annotation/Annotation;
a=0;//     #v4=(Reference,[Ljava/lang/annotation/Annotation;);
a=0;//     array-length v0, v4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     .local v16, "len$":I
a=0;//     #v16=(Integer);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     .local v13, "i$":I
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v13=(Integer);v25=(Conflicted);v26=(Conflicted);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     if-ge v13, v0, :cond_8
a=0;// 
a=0;//     aget-object v2, v4, v13
a=0;// 
a=0;//     .line 38
a=0;//     .local v2, "annotation":Ljava/lang/annotation/Annotation;
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v2}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 39
a=0;//     .local v3, "annotationClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/String;);
a=0;//     const-string v26, "javax.persistence.Column"
a=0;// 
a=0;//     #v26=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v25 .. v26}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     #v25=(Boolean);
a=0;//     if-eqz v25, :cond_0
a=0;// 
a=0;//     .line 40
a=0;//     move-object v5, v2
a=0;// 
a=0;//     .line 42
a=0;//     :cond_0
a=0;//     invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/String;);
a=0;//     const-string v26, "javax.persistence.Id"
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v26}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     #v25=(Boolean);
a=0;//     if-eqz v25, :cond_1
a=0;// 
a=0;//     .line 43
a=0;//     move-object v14, v2
a=0;// 
a=0;//     .line 45
a=0;//     :cond_1
a=0;//     invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/String;);
a=0;//     const-string v26, "javax.persistence.GeneratedValue"
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v26}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     #v25=(Boolean);
a=0;//     if-eqz v25, :cond_2
a=0;// 
a=0;//     .line 46
a=0;//     move-object v12, v2
a=0;// 
a=0;//     .line 48
a=0;//     :cond_2
a=0;//     invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/String;);
a=0;//     const-string v26, "javax.persistence.OneToOne"
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v26}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     #v25=(Boolean);
a=0;//     if-eqz v25, :cond_3
a=0;// 
a=0;//     .line 49
a=0;//     move-object/from16 v21, v2
a=0;// 
a=0;//     .line 51
a=0;//     :cond_3
a=0;//     invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/String;);
a=0;//     const-string v26, "javax.persistence.ManyToOne"
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v26}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     #v25=(Boolean);
a=0;//     if-eqz v25, :cond_4
a=0;// 
a=0;//     .line 52
a=0;//     move-object/from16 v17, v2
a=0;// 
a=0;//     .line 54
a=0;//     :cond_4
a=0;//     invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/String;);
a=0;//     const-string v26, "javax.persistence.JoinColumn"
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v26}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     #v25=(Boolean);
a=0;//     if-eqz v25, :cond_5
a=0;// 
a=0;//     .line 55
a=0;//     move-object v15, v2
a=0;// 
a=0;//     .line 57
a=0;//     :cond_5
a=0;//     invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/String;);
a=0;//     const-string v26, "javax.persistence.Enumerated"
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v26}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     #v25=(Boolean);
a=0;//     if-eqz v25, :cond_6
a=0;// 
a=0;//     .line 58
a=0;//     move-object v9, v2
a=0;// 
a=0;//     .line 60
a=0;//     :cond_6
a=0;//     invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/String;);
a=0;//     const-string v26, "javax.persistence.Version"
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v26}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     #v25=(Boolean);
a=0;//     if-eqz v25, :cond_7
a=0;// 
a=0;//     .line 61
a=0;//     move-object/from16 v24, v2
a=0;// 
a=0;//     .line 37
a=0;//     :cond_7
a=0;//     add-int/lit8 v13, v13, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 65
a=0;//     .end local v2    # "annotation":Ljava/lang/annotation/Annotation;
a=0;//     .end local v3    # "annotationClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     :cond_8
a=0;//     #v2=(Conflicted);v3=(Conflicted);v25=(Conflicted);v26=(Conflicted);
a=0;//     if-nez v5, :cond_9
a=0;// 
a=0;//     if-nez v14, :cond_9
a=0;// 
a=0;//     if-nez v21, :cond_9
a=0;// 
a=0;//     if-nez v17, :cond_9
a=0;// 
a=0;//     if-nez v9, :cond_9
a=0;// 
a=0;//     if-nez v24, :cond_9
a=0;// 
a=0;//     .line 67
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 186
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v6=(Conflicted);v7=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);v10=(Conflicted);v11=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v22=(Conflicted);v23=(Conflicted);v27=(Conflicted);
a=0;//     return-object v7
a=0;// 
a=0;//     .line 70
a=0;//     :cond_9
a=0;//     #v1=(Uninit);v6=(Uninit);v7=(Uninit);v10=(Uninit);v11=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v22=(Uninit);v23=(Uninit);v27=(Uninit);
a=0;//     new-instance v7, Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     invoke-direct {v7}, Lcom/j256/ormlite/field/DatabaseFieldConfig;-><init>()V
a=0;// 
a=0;//     .line 71
a=0;//     .local v7, "config":Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;//     #v7=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     invoke-virtual/range {p1 .. p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 72
a=0;//     .local v11, "fieldName":Ljava/lang/String;
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface/range {p0 .. p0}, Lcom/j256/ormlite/db/DatabaseType;->isEntityNamesMustBeUpCase()Z
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     #v25=(Boolean);
a=0;//     if-eqz v25, :cond_a
a=0;// 
a=0;//     .line 73
a=0;//     invoke-virtual {v11}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 75
a=0;//     :cond_a
a=0;//     invoke-virtual {v7, v11}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setFieldName(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 77
a=0;//     if-eqz v5, :cond_e
a=0;// 
a=0;//     .line 79
a=0;//     :try_start_0
a=0;//     invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/Class;);
a=0;//     const-string v26, "name"
a=0;// 
a=0;//     #v26=(Reference,Ljava/lang/String;);
a=0;//     const/16 v27, 0x0
a=0;// 
a=0;//     #v27=(Null);
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,[Ljava/lang/Class;);
a=0;//     invoke-virtual/range {v25 .. v27}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     .line 80
a=0;//     .local v18, "method":Ljava/lang/reflect/Method;
a=0;//     #v18=(Reference,Ljava/lang/reflect/Method;);
a=0;//     const/16 v25, 0x0
a=0;// 
a=0;//     #v25=(Null);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     move-object/from16 v25, v0
a=0;// 
a=0;//     #v25=(Reference,[Ljava/lang/Object;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     move-object/from16 v1, v25
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v0, v5, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v19, Ljava/lang/String;
a=0;// 
a=0;//     .line 81
a=0;//     .local v19, "name":Ljava/lang/String;
a=0;//     if-eqz v19, :cond_b
a=0;// 
a=0;//     invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     #v25=(Integer);
a=0;//     if-lez v25, :cond_b
a=0;// 
a=0;//     .line 82
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setColumnName(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 84
a=0;//     :cond_b
a=0;//     #v25=(Conflicted);
a=0;//     invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/Class;);
a=0;//     const-string v26, "columnDefinition"
a=0;// 
a=0;//     const/16 v27, 0x0
a=0;// 
a=0;//     #v27=(Null);
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,[Ljava/lang/Class;);
a=0;//     invoke-virtual/range {v25 .. v27}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     .line 85
a=0;//     const/16 v25, 0x0
a=0;// 
a=0;//     #v25=(Null);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     move-object/from16 v25, v0
a=0;// 
a=0;//     #v25=(Reference,[Ljava/lang/Object;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     move-object/from16 v1, v25
a=0;// 
a=0;//     invoke-virtual {v0, v5, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v6, Ljava/lang/String;
a=0;// 
a=0;//     .line 86
a=0;//     .local v6, "columnDefinition":Ljava/lang/String;
a=0;//     if-eqz v6, :cond_c
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     #v25=(Integer);
a=0;//     if-lez v25, :cond_c
a=0;// 
a=0;//     .line 87
a=0;//     invoke-virtual {v7, v6}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setColumnDefinition(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 89
a=0;//     :cond_c
a=0;//     #v25=(Conflicted);
a=0;//     invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/Class;);
a=0;//     const-string v26, "length"
a=0;// 
a=0;//     const/16 v27, 0x0
a=0;// 
a=0;//     #v27=(Null);
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,[Ljava/lang/Class;);
a=0;//     invoke-virtual/range {v25 .. v27}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     .line 90
a=0;//     const/16 v25, 0x0
a=0;// 
a=0;//     #v25=(Null);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     move-object/from16 v25, v0
a=0;// 
a=0;//     #v25=(Reference,[Ljava/lang/Object;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     move-object/from16 v1, v25
a=0;// 
a=0;//     invoke-virtual {v0, v5, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     check-cast v25, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v25}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     #v25=(Integer);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v7, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setWidth(I)V
a=0;// 
a=0;//     .line 91
a=0;//     invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/Class;);
a=0;//     const-string v26, "nullable"
a=0;// 
a=0;//     const/16 v27, 0x0
a=0;// 
a=0;//     #v27=(Null);
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,[Ljava/lang/Class;);
a=0;//     invoke-virtual/range {v25 .. v27}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     .line 92
a=0;//     const/16 v25, 0x0
a=0;// 
a=0;//     #v25=(Null);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     move-object/from16 v25, v0
a=0;// 
a=0;//     #v25=(Reference,[Ljava/lang/Object;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     move-object/from16 v1, v25
a=0;// 
a=0;//     invoke-virtual {v0, v5, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     #v20=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v20, Ljava/lang/Boolean;
a=0;// 
a=0;//     .line 93
a=0;//     .local v20, "nullable":Ljava/lang/Boolean;
a=0;//     if-eqz v20, :cond_d
a=0;// 
a=0;//     .line 94
a=0;//     invoke-virtual/range {v20 .. v20}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     #v25=(Boolean);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v7, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setCanBeNull(Z)V
a=0;// 
a=0;//     .line 96
a=0;//     :cond_d
a=0;//     #v0=(Conflicted);v25=(Conflicted);
a=0;//     invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/Class;);
a=0;//     const-string v26, "unique"
a=0;// 
a=0;//     const/16 v27, 0x0
a=0;// 
a=0;//     #v27=(Null);
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,[Ljava/lang/Class;);
a=0;//     invoke-virtual/range {v25 .. v27}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     .line 97
a=0;//     const/16 v25, 0x0
a=0;// 
a=0;//     #v25=(Null);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     move-object/from16 v25, v0
a=0;// 
a=0;//     #v25=(Reference,[Ljava/lang/Object;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     move-object/from16 v1, v25
a=0;// 
a=0;//     invoke-virtual {v0, v5, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     #v23=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v23, Ljava/lang/Boolean;
a=0;// 
a=0;//     .line 98
a=0;//     .local v23, "unique":Ljava/lang/Boolean;
a=0;//     if-eqz v23, :cond_e
a=0;// 
a=0;//     .line 99
a=0;//     invoke-virtual/range {v23 .. v23}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     #v25=(Boolean);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v7, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setUnique(Z)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 106
a=0;//     .end local v6    # "columnDefinition":Ljava/lang/String;
a=0;//     .end local v18    # "method":Ljava/lang/reflect/Method;
a=0;//     .end local v19    # "name":Ljava/lang/String;
a=0;//     .end local v20    # "nullable":Ljava/lang/Boolean;
a=0;//     .end local v23    # "unique":Ljava/lang/Boolean;
a=0;//     :cond_e
a=0;//     #v0=(Conflicted);v1=(Conflicted);v6=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v23=(Conflicted);v25=(Conflicted);v26=(Conflicted);v27=(Conflicted);
a=0;//     if-eqz v14, :cond_f
a=0;// 
a=0;//     .line 107
a=0;//     if-nez v12, :cond_17
a=0;// 
a=0;//     .line 108
a=0;//     const/16 v25, 0x1
a=0;// 
a=0;//     #v25=(One);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {v7, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setId(Z)V
a=0;// 
a=0;//     .line 114
a=0;//     :cond_f
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v25=(Conflicted);
a=0;//     if-nez v21, :cond_10
a=0;// 
a=0;//     if-eqz v17, :cond_13
a=0;// 
a=0;//     .line 116
a=0;//     :cond_10
a=0;//     const-class v25, Ljava/util/Collection;
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual/range {p1 .. p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v26
a=0;// 
a=0;//     #v26=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual/range {v25 .. v26}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     #v25=(Boolean);
a=0;//     if-nez v25, :cond_11
a=0;// 
a=0;//     const-class v25, Lcom/j256/ormlite/dao/ForeignCollection;
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual/range {p1 .. p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v26
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v26}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     #v25=(Boolean);
a=0;//     if-eqz v25, :cond_18
a=0;// 
a=0;//     .line 118
a=0;//     :cond_11
a=0;//     const/16 v25, 0x1
a=0;// 
a=0;//     #v25=(One);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {v7, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setForeignCollection(Z)V
a=0;// 
a=0;//     .line 119
a=0;//     if-eqz v15, :cond_13
a=0;// 
a=0;//     .line 121
a=0;//     :try_start_1
a=0;//     invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/Class;);
a=0;//     const-string v26, "name"
a=0;// 
a=0;//     const/16 v27, 0x0
a=0;// 
a=0;//     #v27=(Null);
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,[Ljava/lang/Class;);
a=0;//     invoke-virtual/range {v25 .. v27}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     .line 122
a=0;//     .restart local v18    # "method":Ljava/lang/reflect/Method;
a=0;//     #v18=(Reference,Ljava/lang/reflect/Method;);
a=0;//     const/16 v25, 0x0
a=0;// 
a=0;//     #v25=(Null);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     move-object/from16 v25, v0
a=0;// 
a=0;//     #v25=(Reference,[Ljava/lang/Object;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     move-object/from16 v1, v25
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v0, v15, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v19, Ljava/lang/String;
a=0;// 
a=0;//     .line 123
a=0;//     .restart local v19    # "name":Ljava/lang/String;
a=0;//     if-eqz v19, :cond_12
a=0;// 
a=0;//     invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     #v25=(Integer);
a=0;//     if-lez v25, :cond_12
a=0;// 
a=0;//     .line 124
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setForeignCollectionColumnName(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 126
a=0;//     :cond_12
a=0;//     #v25=(Conflicted);
a=0;//     invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/Class;);
a=0;//     const-string v26, "fetch"
a=0;// 
a=0;//     const/16 v27, 0x0
a=0;// 
a=0;//     #v27=(Null);
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,[Ljava/lang/Class;);
a=0;//     invoke-virtual/range {v25 .. v27}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     .line 127
a=0;//     const/16 v25, 0x0
a=0;// 
a=0;//     #v25=(Null);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     move-object/from16 v25, v0
a=0;// 
a=0;//     #v25=(Reference,[Ljava/lang/Object;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     move-object/from16 v1, v25
a=0;// 
a=0;//     invoke-virtual {v0, v15, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 128
a=0;//     .local v10, "fetchType":Ljava/lang/Object;
a=0;//     #v10=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v10, :cond_13
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     const-string v26, "EAGER"
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v26}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     #v25=(Boolean);
a=0;//     if-eqz v25, :cond_13
a=0;// 
a=0;//     .line 129
a=0;//     const/16 v25, 0x1
a=0;// 
a=0;//     #v25=(One);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {v7, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setForeignCollectionEager(Z)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 163
a=0;//     .end local v10    # "fetchType":Ljava/lang/Object;
a=0;//     .end local v18    # "method":Ljava/lang/reflect/Method;
a=0;//     .end local v19    # "name":Ljava/lang/String;
a=0;//     :cond_13
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v10=(Conflicted);v18=(Conflicted);v19=(Conflicted);v25=(Conflicted);v26=(Conflicted);v27=(Conflicted);
a=0;//     if-eqz v9, :cond_14
a=0;// 
a=0;//     .line 165
a=0;//     :try_start_2
a=0;//     invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/Class;);
a=0;//     const-string v26, "value"
a=0;// 
a=0;//     #v26=(Reference,Ljava/lang/String;);
a=0;//     const/16 v27, 0x0
a=0;// 
a=0;//     #v27=(Null);
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,[Ljava/lang/Class;);
a=0;//     invoke-virtual/range {v25 .. v27}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     .line 166
a=0;//     .restart local v18    # "method":Ljava/lang/reflect/Method;
a=0;//     #v18=(Reference,Ljava/lang/reflect/Method;);
a=0;//     const/16 v25, 0x0
a=0;// 
a=0;//     #v25=(Null);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     move-object/from16 v25, v0
a=0;// 
a=0;//     #v25=(Reference,[Ljava/lang/Object;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     move-object/from16 v1, v25
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v0, v9, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     .line 167
a=0;//     .local v22, "typeValue":Ljava/lang/Object;
a=0;//     #v22=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v22, :cond_1b
a=0;// 
a=0;//     invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     const-string v26, "STRING"
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v26}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     #v25=(Boolean);
a=0;//     if-eqz v25, :cond_1b
a=0;// 
a=0;//     .line 168
a=0;//     sget-object v25, Lcom/j256/ormlite/field/DataType;->ENUM_STRING:Lcom/j256/ormlite/field/DataType;
a=0;// 
a=0;//     #v25=(Reference,Lcom/j256/ormlite/field/DataType;);
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setDataType(Lcom/j256/ormlite/field/DataType;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
a=0;// 
a=0;//     .line 177
a=0;//     .end local v18    # "method":Ljava/lang/reflect/Method;
a=0;//     .end local v22    # "typeValue":Ljava/lang/Object;
a=0;//     :cond_14
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v18=(Conflicted);v22=(Conflicted);v25=(Conflicted);v26=(Conflicted);v27=(Conflicted);
a=0;//     if-eqz v24, :cond_15
a=0;// 
a=0;//     .line 179
a=0;//     const/16 v25, 0x1
a=0;// 
a=0;//     #v25=(One);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {v7, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setVersion(Z)V
a=0;// 
a=0;//     .line 181
a=0;//     :cond_15
a=0;//     #v0=(Conflicted);v25=(Conflicted);
a=0;//     invoke-virtual {v7}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->getDataPersister()Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     #v25=(Reference,Lcom/j256/ormlite/field/DataPersister;);
a=0;//     if-nez v25, :cond_16
a=0;// 
a=0;//     .line 182
a=0;//     invoke-static/range {p1 .. p1}, Lcom/j256/ormlite/field/DataPersisterManager;->lookupForField(Ljava/lang/reflect/Field;)Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/DataPersister;);
a=0;//     invoke-virtual {v7, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setDataPersister(Lcom/j256/ormlite/field/DataPersister;)V
a=0;// 
a=0;//     .line 184
a=0;//     :cond_16
a=0;//     #v0=(Conflicted);
a=0;//     const/16 v25, 0x0
a=0;// 
a=0;//     #v25=(Null);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/reflect/Field;);
a=0;//     move/from16 v1, v25
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->findGetMethod(Ljava/lang/reflect/Field;Z)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/reflect/Method;);
a=0;//     if-eqz v25, :cond_1c
a=0;// 
a=0;//     const/16 v25, 0x0
a=0;// 
a=0;//     #v25=(Null);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     move/from16 v1, v25
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->findSetMethod(Ljava/lang/reflect/Field;Z)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/reflect/Method;);
a=0;//     if-eqz v25, :cond_1c
a=0;// 
a=0;//     const/16 v25, 0x1
a=0;// 
a=0;//     :goto_5
a=0;//     #v25=(Boolean);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v7, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setUseGetSet(Z)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 101
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v10=(Uninit);v22=(Uninit);v25=(Conflicted);
a=0;//     move-exception v8
a=0;// 
a=0;//     .line 102
a=0;//     .local v8, "e":Ljava/lang/Exception;
a=0;//     #v8=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v25, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v25=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v26, "Problem accessing fields from the @Column annotation for field "
a=0;// 
a=0;//     #v26=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/reflect/Field;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     invoke-static {v0, v8}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     throw v25
a=0;// 
a=0;//     .line 111
a=0;//     .end local v8    # "e":Ljava/lang/Exception;
a=0;//     :cond_17
a=0;//     #v0=(Conflicted);v1=(Conflicted);v8=(Uninit);v25=(Conflicted);v26=(Conflicted);
a=0;//     const/16 v25, 0x1
a=0;// 
a=0;//     #v25=(One);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {v7, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setGeneratedId(Z)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 131
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v10=(Conflicted);v25=(Conflicted);v26=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v8
a=0;// 
a=0;//     .line 132
a=0;//     .restart local v8    # "e":Ljava/lang/Exception;
a=0;//     #v8=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v25, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v25=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v26, "Problem accessing fields from the @JoinColumn annotation for field "
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/reflect/Field;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     invoke-static {v0, v8}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     throw v25
a=0;// 
a=0;//     .line 138
a=0;//     .end local v8    # "e":Ljava/lang/Exception;
a=0;//     :cond_18
a=0;//     #v0=(Conflicted);v1=(Conflicted);v8=(Uninit);v10=(Uninit);v25=(Boolean);
a=0;//     const/16 v25, 0x1
a=0;// 
a=0;//     #v25=(One);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {v7, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setForeign(Z)V
a=0;// 
a=0;//     .line 139
a=0;//     if-eqz v15, :cond_13
a=0;// 
a=0;//     .line 141
a=0;//     :try_start_3
a=0;//     invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/Class;);
a=0;//     const-string v26, "name"
a=0;// 
a=0;//     const/16 v27, 0x0
a=0;// 
a=0;//     #v27=(Null);
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,[Ljava/lang/Class;);
a=0;//     invoke-virtual/range {v25 .. v27}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     .line 142
a=0;//     .restart local v18    # "method":Ljava/lang/reflect/Method;
a=0;//     #v18=(Reference,Ljava/lang/reflect/Method;);
a=0;//     const/16 v25, 0x0
a=0;// 
a=0;//     #v25=(Null);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     move-object/from16 v25, v0
a=0;// 
a=0;//     #v25=(Reference,[Ljava/lang/Object;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     move-object/from16 v1, v25
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v0, v15, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v19, Ljava/lang/String;
a=0;// 
a=0;//     .line 143
a=0;//     .restart local v19    # "name":Ljava/lang/String;
a=0;//     if-eqz v19, :cond_19
a=0;// 
a=0;//     invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     #v25=(Integer);
a=0;//     if-lez v25, :cond_19
a=0;// 
a=0;//     .line 144
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setColumnName(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 146
a=0;//     :cond_19
a=0;//     #v25=(Conflicted);
a=0;//     invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/Class;);
a=0;//     const-string v26, "nullable"
a=0;// 
a=0;//     const/16 v27, 0x0
a=0;// 
a=0;//     #v27=(Null);
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,[Ljava/lang/Class;);
a=0;//     invoke-virtual/range {v25 .. v27}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     .line 147
a=0;//     const/16 v25, 0x0
a=0;// 
a=0;//     #v25=(Null);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     move-object/from16 v25, v0
a=0;// 
a=0;//     #v25=(Reference,[Ljava/lang/Object;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     move-object/from16 v1, v25
a=0;// 
a=0;//     invoke-virtual {v0, v15, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     #v20=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v20, Ljava/lang/Boolean;
a=0;// 
a=0;//     .line 148
a=0;//     .restart local v20    # "nullable":Ljava/lang/Boolean;
a=0;//     if-eqz v20, :cond_1a
a=0;// 
a=0;//     .line 149
a=0;//     invoke-virtual/range {v20 .. v20}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     #v25=(Boolean);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v7, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setCanBeNull(Z)V
a=0;// 
a=0;//     .line 151
a=0;//     :cond_1a
a=0;//     #v0=(Conflicted);v25=(Conflicted);
a=0;//     invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/Class;);
a=0;//     const-string v26, "unique"
a=0;// 
a=0;//     const/16 v27, 0x0
a=0;// 
a=0;//     #v27=(Null);
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,[Ljava/lang/Class;);
a=0;//     invoke-virtual/range {v25 .. v27}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     .line 152
a=0;//     const/16 v25, 0x0
a=0;// 
a=0;//     #v25=(Null);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     move-object/from16 v25, v0
a=0;// 
a=0;//     #v25=(Reference,[Ljava/lang/Object;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     move-object/from16 v1, v25
a=0;// 
a=0;//     invoke-virtual {v0, v15, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     #v23=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v23, Ljava/lang/Boolean;
a=0;// 
a=0;//     .line 153
a=0;//     .restart local v23    # "unique":Ljava/lang/Boolean;
a=0;//     if-eqz v23, :cond_13
a=0;// 
a=0;//     .line 154
a=0;//     invoke-virtual/range {v23 .. v23}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     #v25=(Boolean);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v7, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setUnique(Z)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 156
a=0;//     .end local v18    # "method":Ljava/lang/reflect/Method;
a=0;//     .end local v19    # "name":Ljava/lang/String;
a=0;//     .end local v20    # "nullable":Ljava/lang/Boolean;
a=0;//     .end local v23    # "unique":Ljava/lang/Boolean;
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v23=(Conflicted);v25=(Conflicted);v27=(Conflicted);
a=0;//     move-exception v8
a=0;// 
a=0;//     .line 157
a=0;//     .restart local v8    # "e":Ljava/lang/Exception;
a=0;//     #v8=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v25, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v25=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v26, "Problem accessing fields from the @JoinColumn annotation for field "
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/reflect/Field;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     invoke-static {v0, v8}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     throw v25
a=0;// 
a=0;//     .line 170
a=0;//     .end local v8    # "e":Ljava/lang/Exception;
a=0;//     .restart local v18    # "method":Ljava/lang/reflect/Method;
a=0;//     .restart local v22    # "typeValue":Ljava/lang/Object;
a=0;//     :cond_1b
a=0;//     :try_start_4
a=0;//     #v8=(Uninit);v10=(Conflicted);v18=(Reference,Ljava/lang/reflect/Method;);v22=(Reference,Ljava/lang/Object;);v25=(Conflicted);v27=(Reference,[Ljava/lang/Class;);
a=0;//     sget-object v25, Lcom/j256/ormlite/field/DataType;->ENUM_INTEGER:Lcom/j256/ormlite/field/DataType;
a=0;// 
a=0;//     #v25=(Reference,Lcom/j256/ormlite/field/DataType;);
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setDataType(Lcom/j256/ormlite/field/DataType;)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 172
a=0;//     .end local v18    # "method":Ljava/lang/reflect/Method;
a=0;//     .end local v22    # "typeValue":Ljava/lang/Object;
a=0;//     :catch_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v18=(Conflicted);v22=(Conflicted);v25=(Conflicted);v26=(Conflicted);v27=(Conflicted);
a=0;//     move-exception v8
a=0;// 
a=0;//     .line 173
a=0;//     .restart local v8    # "e":Ljava/lang/Exception;
a=0;//     #v8=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v25, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v25=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v26, "Problem accessing fields from the @Enumerated annotation for field "
a=0;// 
a=0;//     #v26=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/reflect/Field;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     invoke-static {v0, v8}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     throw v25
a=0;// 
a=0;//     .line 184
a=0;//     .end local v8    # "e":Ljava/lang/Exception;
a=0;//     :cond_1c
a=0;//     #v1=(Null);v8=(Uninit);v26=(Conflicted);
a=0;//     const/16 v25, 0x0
a=0;// 
a=0;//     #v25=(Null);
a=0;//     goto/16 :goto_5
a=0;// .end method
a=0;// 
a=0;// .method public static getEntityName(Ljava/lang/Class;)Ljava/lang/String;
a=0;//     .locals 13
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 194
a=0;//     #v9=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 195
a=0;//     .local v4, "entityAnnotation":Ljava/lang/annotation/Annotation;
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p0}, Ljava/lang/Class;->getAnnotations()[Ljava/lang/annotation/Annotation;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .local v2, "arr$":[Ljava/lang/annotation/Annotation;
a=0;//     #v2=(Reference,[Ljava/lang/annotation/Annotation;);
a=0;//     array-length v6, v2
a=0;// 
a=0;//     .local v6, "len$":I
a=0;//     #v6=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .local v5, "i$":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v5=(Integer);v10=(Conflicted);v11=(Conflicted);
a=0;//     if-ge v5, v6, :cond_1
a=0;// 
a=0;//     aget-object v0, v2, v5
a=0;// 
a=0;//     .line 196
a=0;//     .local v0, "annotation":Ljava/lang/annotation/Annotation;
a=0;//     #v0=(Null);
a=0;//     invoke-interface {v0}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 197
a=0;//     .local v1, "annotationClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     const-string v11, "javax.persistence.Entity"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_0
a=0;// 
a=0;//     .line 198
a=0;//     move-object v4, v0
a=0;// 
a=0;//     .line 195
a=0;//     :cond_0
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 202
a=0;//     .end local v0    # "annotation":Ljava/lang/annotation/Annotation;
a=0;//     .end local v1    # "annotationClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     move-object v8, v9
a=0;// 
a=0;//     .line 211
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v7=(Conflicted);v8=(Reference,Ljava/lang/String;);v12=(Conflicted);
a=0;//     return-object v8
a=0;// 
a=0;//     .line 206
a=0;//     :cond_3
a=0;//     :try_start_0
a=0;//     #v7=(Uninit);v8=(Uninit);v12=(Uninit);
a=0;//     invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Class;);
a=0;//     const-string v11, "name"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     new-array v12, v12, [Ljava/lang/Class;
a=0;// 
a=0;//     #v12=(Reference,[Ljava/lang/Class;);
a=0;//     invoke-virtual {v10, v11, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 207
a=0;//     .local v7, "method":Ljava/lang/reflect/Method;
a=0;//     #v7=(Reference,Ljava/lang/reflect/Method;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     new-array v10, v10, [Ljava/lang/Object;
a=0;// 
a=0;//     #v10=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-virtual {v7, v4, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v8, Ljava/lang/String;
a=0;// 
a=0;//     .line 208
a=0;//     .local v8, "name":Ljava/lang/String;
a=0;//     if-eqz v8, :cond_4
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/String;->length()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     if-gtz v10, :cond_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v10=(Conflicted);
a=0;//     move-object v8, v9
a=0;// 
a=0;//     .line 211
a=0;//     #v8=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 213
a=0;//     .end local v7    # "method":Ljava/lang/reflect/Method;
a=0;//     .end local v8    # "name":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v7=(Conflicted);v8=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 214
a=0;//     .local v3, "e":Ljava/lang/Exception;
a=0;//     #v3=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v9, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v10, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v11, "Could not get entity name from class "
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-direct {v9, v10, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v9
a=0;// .end method
}}
