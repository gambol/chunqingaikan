package com.j256.ormlite.stmt.query; class BaseComparison { void a() { int a;
a=0;// .class abstract Lcom/j256/ormlite/stmt/query/BaseComparison;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BaseComparison.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/j256/ormlite/stmt/query/Comparison;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final NUMBER_CHARACTERS:Ljava/lang/String; = "0123456789.-+"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected final columnName:Ljava/lang/String;
a=0;// 
a=0;// .field protected final fieldType:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;// .field private final value:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method protected constructor <init>(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;Z)V
a=0;//     .locals 3
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;//     .param p2, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p3, "value"    # Ljava/lang/Object;
a=0;//     .param p4, "isComparison"    # Z
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 25
a=0;//     #p0=(Reference,Lcom/j256/ormlite/stmt/query/BaseComparison;);
a=0;//     if-eqz p4, :cond_0
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     invoke-virtual {p2}, Lcom/j256/ormlite/field/FieldType;->isComparable()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 26
a=0;//     new-instance v0, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Field \'"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "\' is of data type "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p2}, Lcom/j256/ormlite/field/FieldType;->getDataPersister()Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " which can not be compared"
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
a=0;//     .line 29
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Uninit);v2=(Uninit);
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/stmt/query/BaseComparison;->columnName:Ljava/lang/String;
a=0;// 
a=0;//     .line 30
a=0;//     iput-object p2, p0, Lcom/j256/ormlite/stmt/query/BaseComparison;->fieldType:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .line 31
a=0;//     iput-object p3, p0, Lcom/j256/ormlite/stmt/query/BaseComparison;->value:Ljava/lang/Object;
a=0;// 
a=0;//     .line 32
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected appendArgOrValue(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/field/FieldType;Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/Object;)V
a=0;//     .locals 9
a=0;//     .param p1, "databaseType"    # Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .param p2, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p3, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p5, "argOrValue"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/db/DatabaseType;",
a=0;//             "Lcom/j256/ormlite/field/FieldType;",
a=0;//             "Ljava/lang/StringBuilder;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/j256/ormlite/stmt/ArgumentHolder;",
a=0;//             ">;",
a=0;//             "Ljava/lang/Object;",
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
a=0;//     .local p4, "argList":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/stmt/ArgumentHolder;>;"
a=0;//     const/16 v1, 0x3f
a=0;// 
a=0;//     .line 63
a=0;//     #v1=(PosByte);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 64
a=0;//     .local v6, "appendSpace":Z
a=0;//     #v6=(One);
a=0;//     if-nez p5, :cond_0
a=0;// 
a=0;//     .line 65
a=0;//     new-instance v0, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "argument for \'"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p2}, Lcom/j256/ormlite/field/FieldType;->getFieldName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, "\' is null"
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
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
a=0;//     .line 66
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(PosByte);v3=(Uninit);
a=0;//     instance-of v0, p5, Lcom/j256/ormlite/stmt/ArgumentHolder;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 67
a=0;//     invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-object v7, p5
a=0;// 
a=0;//     .line 68
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Lcom/j256/ormlite/stmt/ArgumentHolder;
a=0;// 
a=0;//     .line 69
a=0;//     .local v7, "argHolder":Lcom/j256/ormlite/stmt/ArgumentHolder;
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/query/BaseComparison;->columnName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v7, v0, p2}, Lcom/j256/ormlite/stmt/ArgumentHolder;->setMetaInfo(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;)V
a=0;// 
a=0;//     .line 70
a=0;//     invoke-interface {p4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 108
a=0;//     .end local v7    # "argHolder":Lcom/j256/ormlite/stmt/ArgumentHolder;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Boolean);v7=(Conflicted);v8=(Conflicted);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 109
a=0;//     const/16 v0, 0x20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 111
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 71
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(PosByte);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(One);v7=(Uninit);v8=(Uninit);
a=0;//     invoke-virtual {p2}, Lcom/j256/ormlite/field/FieldType;->isArgumentHolderRequired()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 72
a=0;//     invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 73
a=0;//     new-instance v7, Lcom/j256/ormlite/stmt/SelectArg;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/j256/ormlite/stmt/SelectArg;);
a=0;//     invoke-direct {v7}, Lcom/j256/ormlite/stmt/SelectArg;-><init>()V
a=0;// 
a=0;//     .line 74
a=0;//     .restart local v7    # "argHolder":Lcom/j256/ormlite/stmt/ArgumentHolder;
a=0;//     #v7=(Reference,Lcom/j256/ormlite/stmt/SelectArg;);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/query/BaseComparison;->columnName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v7, v0, p2}, Lcom/j256/ormlite/stmt/ArgumentHolder;->setMetaInfo(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;)V
a=0;// 
a=0;//     .line 76
a=0;//     invoke-interface {v7, p5}, Lcom/j256/ormlite/stmt/ArgumentHolder;->setValue(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 77
a=0;//     invoke-interface {p4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 78
a=0;//     .end local v7    # "argHolder":Lcom/j256/ormlite/stmt/ArgumentHolder;
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v7=(Uninit);
a=0;//     invoke-virtual {p2}, Lcom/j256/ormlite/field/FieldType;->isForeign()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-virtual {p2}, Lcom/j256/ormlite/field/FieldType;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 83
a=0;//     invoke-virtual {p2}, Lcom/j256/ormlite/field/FieldType;->getForeignIdField()Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 84
a=0;//     .local v2, "idFieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v2=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-virtual {v2, p5}, Lcom/j256/ormlite/field/FieldType;->extractJavaFieldValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/query/BaseComparison;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object v4, p4
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/List;);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/j256/ormlite/stmt/query/BaseComparison;->appendArgOrValue(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/field/FieldType;Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 86
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 87
a=0;//     #v6=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .end local v2    # "idFieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(One);
a=0;//     invoke-virtual {p2}, Lcom/j256/ormlite/field/FieldType;->isEscapedValue()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 88
a=0;//     invoke-virtual {p2, p5}, Lcom/j256/ormlite/field/FieldType;->convertJavaFieldToSqlArgValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {p1, p3, v0}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedWord(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 89
a=0;//     :cond_5
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p2}, Lcom/j256/ormlite/field/FieldType;->isForeign()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     .line 95
a=0;//     invoke-virtual {p2, p5}, Lcom/j256/ormlite/field/FieldType;->convertJavaFieldToSqlArgValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 96
a=0;//     .local v8, "value":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_6
a=0;// 
a=0;//     .line 97
a=0;//     const-string v0, "0123456789.-+"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v8, v1}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Char);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gez v0, :cond_6
a=0;// 
a=0;//     .line 98
a=0;//     new-instance v0, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Foreign field "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, " does not seem to be producing a numerical value \'"
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, "\'. Maybe you are passing the wrong object to comparison: "
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
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
a=0;//     .line 103
a=0;//     :cond_6
a=0;//     #v0=(Integer);v1=(Conflicted);v3=(Uninit);
a=0;//     invoke-virtual {p3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 106
a=0;//     .end local v8    # "value":Ljava/lang/String;
a=0;//     :cond_7
a=0;//     #v0=(Boolean);v8=(Uninit);
a=0;//     invoke-virtual {p2, p5}, Lcom/j256/ormlite/field/FieldType;->convertJavaFieldToSqlArgValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public abstract appendOperation(Ljava/lang/StringBuilder;)V
a=0;// .end method
a=0;// 
a=0;// .method public appendSql(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V
a=0;//     .locals 1
a=0;//     .param p1, "databaseType"    # Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .param p2, "tableName"    # Ljava/lang/String;
a=0;//     .param p3, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/db/DatabaseType;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/StringBuilder;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/j256/ormlite/stmt/ArgumentHolder;",
a=0;//             ">;)V"
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
a=0;//     .local p4, "argList":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/stmt/ArgumentHolder;>;"
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 39
a=0;//     invoke-interface {p1, p3, p2}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 40
a=0;//     const/16 v0, 0x2e
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 42
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/query/BaseComparison;->columnName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, p3, v0}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 43
a=0;//     const/16 v0, 0x20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 44
a=0;//     invoke-virtual {p0, p3}, Lcom/j256/ormlite/stmt/query/BaseComparison;->appendOperation(Ljava/lang/StringBuilder;)V
a=0;// 
a=0;//     .line 46
a=0;//     invoke-virtual {p0, p1, p3, p4}, Lcom/j256/ormlite/stmt/query/BaseComparison;->appendValue(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/StringBuilder;Ljava/util/List;)V
a=0;// 
a=0;//     .line 47
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public appendValue(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/StringBuilder;Ljava/util/List;)V
a=0;//     .locals 6
a=0;//     .param p1, "databaseType"    # Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .param p2, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/db/DatabaseType;",
a=0;//             "Ljava/lang/StringBuilder;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/j256/ormlite/stmt/ArgumentHolder;",
a=0;//             ">;)V"
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
a=0;//     .line 55
a=0;//     .local p3, "argList":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/stmt/ArgumentHolder;>;"
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/stmt/query/BaseComparison;->fieldType:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     iget-object v5, p0, Lcom/j256/ormlite/stmt/query/BaseComparison;->value:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/query/BaseComparison;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/List;);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/j256/ormlite/stmt/query/BaseComparison;->appendArgOrValue(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/field/FieldType;Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 56
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getColumnName()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/query/BaseComparison;->columnName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v2, 0x20
a=0;// 
a=0;//     .line 115
a=0;//     #v2=(PosByte);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 116
a=0;//     .local v0, "sb":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/query/BaseComparison;->columnName:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 117
a=0;//     invoke-virtual {p0, v0}, Lcom/j256/ormlite/stmt/query/BaseComparison;->appendOperation(Ljava/lang/StringBuilder;)V
a=0;// 
a=0;//     .line 118
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 119
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/query/BaseComparison;->value:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 120
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// .end method
}}
