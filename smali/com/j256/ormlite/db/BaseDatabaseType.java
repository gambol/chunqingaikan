package com.j256.ormlite.db; class BaseDatabaseType { void a() { int a;
a=0;// .class public abstract Lcom/j256/ormlite/db/BaseDatabaseType;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BaseDatabaseType.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/j256/ormlite/db/BaseDatabaseType$1;,
a=0;//         Lcom/j256/ormlite/db/BaseDatabaseType$BooleanNumberFieldConverter;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field protected static DEFAULT_SEQUENCE_SUFFIX:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected driver:Ljava/sql/Driver;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     const-string v0, "_id_seq"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/j256/ormlite/db/BaseDatabaseType;->DEFAULT_SEQUENCE_SUFFIX:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 548
a=0;//     #p0=(Reference,Lcom/j256/ormlite/db/BaseDatabaseType;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private addSingleUnique(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/util/List;Ljava/util/List;)V
a=0;//     .locals 2
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p2, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/StringBuilder;",
a=0;//             "Lcom/j256/ormlite/field/FieldType;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 538
a=0;//     .local p3, "additionalArgs":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     .local p4, "statementsAfter":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 539
a=0;//     .local v0, "alterSb":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, " UNIQUE ("
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 540
a=0;//     invoke-virtual {p2}, Lcom/j256/ormlite/field/FieldType;->getColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 541
a=0;//     const-string v1, ")"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 542
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {p3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 543
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private appendCanBeNull(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;)V
a=0;//     .locals 0
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p2, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .prologue
a=0;//     .line 531
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private appendDefaultValue(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;)V
a=0;//     .locals 1
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p2, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p3, "defaultValue"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 307
a=0;//     invoke-virtual {p2}, Lcom/j256/ormlite/field/FieldType;->isEscapedDefaultValue()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 308
a=0;//     invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendEscapedWord(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 312
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 310
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private appendDoubleType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
a=0;//     .locals 1
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p2, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p3, "fieldWidth"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 270
a=0;//     const-string v0, "DOUBLE PRECISION"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 271
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private appendFloatType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
a=0;//     .locals 1
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p2, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p3, "fieldWidth"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 260
a=0;//     const-string v0, "FLOAT"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 261
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private appendIntegerType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
a=0;//     .locals 1
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p2, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p3, "fieldWidth"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 243
a=0;//     const-string v0, "INTEGER"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 244
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addPrimaryKeySql([Lcom/j256/ormlite/field/FieldType;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
a=0;//     .locals 6
a=0;//     .param p1, "fieldTypes"    # [Lcom/j256/ormlite/field/FieldType;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "([",
a=0;//             "Lcom/j256/ormlite/field/FieldType;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 352
a=0;//     .local p2, "additionalArgs":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     .local p3, "statementsBefore":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     .local p4, "statementsAfter":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     .local p5, "queriesAfter":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 353
a=0;//     .local v4, "sb":Ljava/lang/StringBuilder;
a=0;//     #v4=(Null);
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
a=0;//     #v1=(Conflicted);v2=(Integer);v4=(Reference,Ljava/lang/StringBuilder;);v5=(Conflicted);
a=0;//     if-ge v2, v3, :cond_3
a=0;// 
a=0;//     aget-object v1, v0, v2
a=0;// 
a=0;//     .line 354
a=0;//     .local v1, "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/field/FieldType;->isGeneratedId()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/db/BaseDatabaseType;->generatedIdSqlAtEnd()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/field/FieldType;->isSelfGeneratedId()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 353
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v5=(Conflicted);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 356
a=0;//     :cond_1
a=0;//     #v5=(Boolean);
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/field/FieldType;->isId()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 357
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     .line 358
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .end local v4    # "sb":Ljava/lang/StringBuilder;
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v5, 0x30
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 359
a=0;//     .restart local v4    # "sb":Ljava/lang/StringBuilder;
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "PRIMARY KEY ("
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 363
a=0;//     :goto_2
a=0;//     #v5=(Conflicted);
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/field/FieldType;->getColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4, v5}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 361
a=0;//     :cond_2
a=0;//     #v5=(Boolean);
a=0;//     const/16 v5, 0x2c
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 366
a=0;//     .end local v1    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v5=(Conflicted);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     .line 367
a=0;//     const-string v5, ") "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 368
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-interface {p2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 370
a=0;//     :cond_4
a=0;//     #v5=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addUniqueComboSql([Lcom/j256/ormlite/field/FieldType;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
a=0;//     .locals 6
a=0;//     .param p1, "fieldTypes"    # [Lcom/j256/ormlite/field/FieldType;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "([",
a=0;//             "Lcom/j256/ormlite/field/FieldType;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 382
a=0;//     .local p2, "additionalArgs":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     .local p3, "statementsBefore":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     .local p4, "statementsAfter":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     .local p5, "queriesAfter":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 383
a=0;//     .local v4, "sb":Ljava/lang/StringBuilder;
a=0;//     #v4=(Null);
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
a=0;//     #v1=(Conflicted);v2=(Integer);v4=(Reference,Ljava/lang/StringBuilder;);v5=(Conflicted);
a=0;//     if-ge v2, v3, :cond_2
a=0;// 
a=0;//     aget-object v1, v0, v2
a=0;// 
a=0;//     .line 384
a=0;//     .local v1, "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/field/FieldType;->isUniqueCombo()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 385
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 386
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .end local v4    # "sb":Ljava/lang/StringBuilder;
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v5, 0x30
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 387
a=0;//     .restart local v4    # "sb":Ljava/lang/StringBuilder;
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "UNIQUE ("
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 391
a=0;//     :goto_1
a=0;//     #v5=(Conflicted);
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/field/FieldType;->getColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4, v5}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 383
a=0;//     :cond_0
a=0;//     #v5=(Conflicted);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 389
a=0;//     :cond_1
a=0;//     #v5=(Boolean);
a=0;//     const/16 v5, 0x2c
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 394
a=0;//     .end local v1    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v5=(Conflicted);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 395
a=0;//     const-string v5, ") "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 396
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-interface {p2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 398
a=0;//     :cond_3
a=0;//     #v5=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected appendBigDecimalNumericType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
a=0;//     .locals 1
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p2, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p3, "fieldWidth"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 300
a=0;//     const-string v0, "NUMERIC"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 301
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected appendBooleanType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
a=0;//     .locals 1
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p2, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p3, "fieldWidth"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 203
a=0;//     const-string v0, "BOOLEAN"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 204
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected appendByteArrayType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
a=0;//     .locals 1
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p2, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p3, "fieldWidth"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 280
a=0;//     const-string v0, "BLOB"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 281
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected appendByteType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
a=0;//     .locals 1
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p2, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p3, "fieldWidth"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 223
a=0;//     const-string v0, "TINYINT"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 224
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected appendCharType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
a=0;//     .locals 1
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p2, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p3, "fieldWidth"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 213
a=0;//     const-string v0, "CHAR"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 214
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public appendColumnArg(Ljava/lang/String;Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
a=0;//     .locals 15
a=0;//     .param p1, "tableName"    # Ljava/lang/String;
a=0;//     .param p2, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p3, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/StringBuilder;",
a=0;//             "Lcom/j256/ormlite/field/FieldType;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
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
a=0;//     .line 57
a=0;//     .local p4, "additionalArgs":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     .local p5, "statementsBefore":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     .local p6, "statementsAfter":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     .local p7, "queriesAfter":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     invoke-virtual/range {p3 .. p3}, Lcom/j256/ormlite/field/FieldType;->getColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0, v0, v4}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 58
a=0;//     const/16 v4, 0x20
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 59
a=0;//     invoke-virtual/range {p3 .. p3}, Lcom/j256/ormlite/field/FieldType;->getDataPersister()Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 61
a=0;//     .local v12, "dataPersister":Lcom/j256/ormlite/field/DataPersister;
a=0;//     #v12=(Reference,Lcom/j256/ormlite/field/DataPersister;);
a=0;//     invoke-virtual/range {p3 .. p3}, Lcom/j256/ormlite/field/FieldType;->getWidth()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 62
a=0;//     .local v14, "fieldWidth":I
a=0;//     #v14=(Integer);
a=0;//     if-nez v14, :cond_0
a=0;// 
a=0;//     .line 64
a=0;//     invoke-interface {v12}, Lcom/j256/ormlite/field/DataPersister;->getDefaultWidth()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 66
a=0;//     :cond_0
a=0;//     sget-object v4, Lcom/j256/ormlite/db/BaseDatabaseType$1;->$SwitchMap$com$j256$ormlite$field$SqlType:[I
a=0;// 
a=0;//     #v4=(Reference,[I);
a=0;//     invoke-interface {v12}, Lcom/j256/ormlite/field/DataPersister;->getSqlType()Lcom/j256/ormlite/field/SqlType;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lcom/j256/ormlite/field/SqlType;);
a=0;//     invoke-virtual {v5}, Lcom/j256/ormlite/field/SqlType;->ordinal()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     aget v4, v4, v5
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     packed-switch v4, :pswitch_data_0
a=0;// 
a=0;//     .line 127
a=0;//     new-instance v4, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "Unknown SQL-type "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-interface {v12}, Lcom/j256/ormlite/field/DataPersister;->getSqlType()Lcom/j256/ormlite/field/SqlType;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v4
a=0;// 
a=0;//     .line 69
a=0;//     :pswitch_0
a=0;//     #v4=(Integer);v5=(Integer);v6=(Uninit);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     move-object/from16 v1, p3
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-virtual {p0, v0, v1, v14}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendStringType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
a=0;// 
a=0;//     .line 129
a=0;//     :goto_0
a=0;//     const/16 v4, 0x20
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 135
a=0;//     invoke-virtual/range {p3 .. p3}, Lcom/j256/ormlite/field/FieldType;->isGeneratedIdSequence()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     invoke-virtual/range {p3 .. p3}, Lcom/j256/ormlite/field/FieldType;->isSelfGeneratedId()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-nez v4, :cond_4
a=0;// 
a=0;//     move-object v4, p0
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/db/BaseDatabaseType;);
a=0;//     move-object/from16 v5, p2
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v6, p3
a=0;// 
a=0;//     #v6=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     move-object/from16 v7, p5
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/List;);
a=0;//     move-object/from16 v8, p4
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/List;);
a=0;//     move-object/from16 v9, p7
a=0;// 
a=0;//     .line 136
a=0;//     #v9=(Reference,Ljava/util/List;);
a=0;//     invoke-virtual/range {v4 .. v9}, Lcom/j256/ormlite/db/BaseDatabaseType;->configureGeneratedIdSequence(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
a=0;// 
a=0;//     .line 144
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     invoke-virtual/range {p3 .. p3}, Lcom/j256/ormlite/field/FieldType;->isGeneratedId()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     .line 145
a=0;//     invoke-virtual/range {p3 .. p3}, Lcom/j256/ormlite/field/FieldType;->getDefaultValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 146
a=0;//     .local v13, "defaultValue":Ljava/lang/Object;
a=0;//     #v13=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v13, :cond_2
a=0;// 
a=0;//     .line 147
a=0;//     const-string v4, "DEFAULT "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 148
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     move-object/from16 v1, p3
a=0;// 
a=0;//     invoke-direct {p0, v0, v1, v13}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendDefaultValue(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 149
a=0;//     const/16 v4, 0x20
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 151
a=0;//     :cond_2
a=0;//     invoke-virtual/range {p3 .. p3}, Lcom/j256/ormlite/field/FieldType;->isCanBeNull()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_6
a=0;// 
a=0;//     .line 152
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     move-object/from16 v1, p3
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendCanBeNull(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;)V
a=0;// 
a=0;//     .line 156
a=0;//     :goto_2
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual/range {p3 .. p3}, Lcom/j256/ormlite/field/FieldType;->isUnique()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 157
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     move-object/from16 v1, p3
a=0;// 
a=0;//     move-object/from16 v2, p4
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     move-object/from16 v3, p6
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/List;);
a=0;//     invoke-direct {p0, v0, v1, v2, v3}, Lcom/j256/ormlite/db/BaseDatabaseType;->addSingleUnique(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/util/List;Ljava/util/List;)V
a=0;// 
a=0;//     .line 160
a=0;//     .end local v13    # "defaultValue":Ljava/lang/Object;
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);v3=(Conflicted);v13=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 73
a=0;//     :pswitch_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Integer);v5=(Integer);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v13=(Uninit);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     move-object/from16 v1, p3
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-virtual {p0, v0, v1, v14}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendLongStringType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 77
a=0;//     :pswitch_2
a=0;//     #v1=(Uninit);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     move-object/from16 v1, p3
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-virtual {p0, v0, v1, v14}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendBooleanType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 81
a=0;//     :pswitch_3
a=0;//     #v1=(Uninit);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     move-object/from16 v1, p3
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-virtual {p0, v0, v1, v14}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendDateType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 85
a=0;//     :pswitch_4
a=0;//     #v1=(Uninit);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     move-object/from16 v1, p3
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-virtual {p0, v0, v1, v14}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendCharType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 89
a=0;//     :pswitch_5
a=0;//     #v1=(Uninit);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     move-object/from16 v1, p3
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-virtual {p0, v0, v1, v14}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendByteType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 93
a=0;//     :pswitch_6
a=0;//     #v1=(Uninit);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     move-object/from16 v1, p3
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-virtual {p0, v0, v1, v14}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendByteArrayType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 97
a=0;//     :pswitch_7
a=0;//     #v1=(Uninit);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     move-object/from16 v1, p3
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-virtual {p0, v0, v1, v14}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendShortType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 101
a=0;//     :pswitch_8
a=0;//     #v1=(Uninit);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     move-object/from16 v1, p3
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-direct {p0, v0, v1, v14}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendIntegerType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 105
a=0;//     :pswitch_9
a=0;//     #v1=(Uninit);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     move-object/from16 v1, p3
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-virtual {p0, v0, v1, v14}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendLongType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 109
a=0;//     :pswitch_a
a=0;//     #v1=(Uninit);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     move-object/from16 v1, p3
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-direct {p0, v0, v1, v14}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendFloatType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 113
a=0;//     :pswitch_b
a=0;//     #v1=(Uninit);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     move-object/from16 v1, p3
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-direct {p0, v0, v1, v14}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendDoubleType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 117
a=0;//     :pswitch_c
a=0;//     #v1=(Uninit);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     move-object/from16 v1, p3
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-virtual {p0, v0, v1, v14}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendSerializableType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 121
a=0;//     :pswitch_d
a=0;//     #v1=(Uninit);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     move-object/from16 v1, p3
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-virtual {p0, v0, v1, v14}, Lcom/j256/ormlite/db/BaseDatabaseType;->appendBigDecimalNumericType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 137
a=0;//     :cond_4
a=0;//     #v4=(Boolean);
a=0;//     invoke-virtual/range {p3 .. p3}, Lcom/j256/ormlite/field/FieldType;->isGeneratedId()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     invoke-virtual/range {p3 .. p3}, Lcom/j256/ormlite/field/FieldType;->isSelfGeneratedId()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-nez v4, :cond_5
a=0;// 
a=0;//     move-object v4, p0
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/db/BaseDatabaseType;);
a=0;//     move-object/from16 v5, p1
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v6, p2
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v7, p3
a=0;// 
a=0;//     #v7=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     move-object/from16 v8, p5
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/List;);
a=0;//     move-object/from16 v9, p6
a=0;// 
a=0;//     #v9=(Reference,Ljava/util/List;);
a=0;//     move-object/from16 v10, p4
a=0;// 
a=0;//     #v10=(Reference,Ljava/util/List;);
a=0;//     move-object/from16 v11, p7
a=0;// 
a=0;//     .line 138
a=0;//     #v11=(Reference,Ljava/util/List;);
a=0;//     invoke-virtual/range {v4 .. v11}, Lcom/j256/ormlite/db/BaseDatabaseType;->configureGeneratedId(Ljava/lang/String;Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 140
a=0;//     :cond_5
a=0;//     #v4=(Boolean);v5=(Integer);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     invoke-virtual/range {p3 .. p3}, Lcom/j256/ormlite/field/FieldType;->isId()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     move-object v4, p0
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/db/BaseDatabaseType;);
a=0;//     move-object/from16 v5, p2
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v6, p3
a=0;// 
a=0;//     #v6=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     move-object/from16 v7, p5
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/List;);
a=0;//     move-object/from16 v8, p4
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/List;);
a=0;//     move-object/from16 v9, p7
a=0;// 
a=0;//     .line 141
a=0;//     #v9=(Reference,Ljava/util/List;);
a=0;//     invoke-virtual/range {v4 .. v9}, Lcom/j256/ormlite/db/BaseDatabaseType;->configureId(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 154
a=0;//     .restart local v13    # "defaultValue":Ljava/lang/Object;
a=0;//     :cond_6
a=0;//     #v4=(Boolean);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v13=(Reference,Ljava/lang/Object;);
a=0;//     const-string v4, "NOT NULL "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 66
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//         :pswitch_6
a=0;//         :pswitch_7
a=0;//         :pswitch_8
a=0;//         :pswitch_9
a=0;//         :pswitch_a
a=0;//         :pswitch_b
a=0;//         :pswitch_c
a=0;//         :pswitch_d
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public appendCreateTableSuffix(Ljava/lang/StringBuilder;)V
a=0;//     .locals 0
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 468
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected appendDateType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
a=0;//     .locals 1
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p2, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p3, "fieldWidth"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 193
a=0;//     const-string v0, "TIMESTAMP"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 194
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p2, "name"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v1, 0x60
a=0;// 
a=0;//     .line 409
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 410
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public appendEscapedWord(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p2, "word"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v1, 0x27
a=0;// 
a=0;//     .line 405
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 406
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public appendLimitValue(Ljava/lang/StringBuilder;JLjava/lang/Long;)V
a=0;//     .locals 2
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p2, "limit"    # J
a=0;//     .param p4, "offset"    # Ljava/lang/Long;
a=0;// 
a=0;//     .prologue
a=0;//     .line 455
a=0;//     const-string v0, "LIMIT "
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v1, 0x20
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 456
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected appendLongStringType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
a=0;//     .locals 1
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p2, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p3, "fieldWidth"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 183
a=0;//     const-string v0, "TEXT"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 184
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected appendLongType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
a=0;//     .locals 1
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p2, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p3, "fieldWidth"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 250
a=0;//     const-string v0, "BIGINT"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 251
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public appendOffsetValue(Ljava/lang/StringBuilder;J)V
a=0;//     .locals 2
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p2, "offset"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 459
a=0;//     const-string v0, "OFFSET "
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v1, 0x20
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 460
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public appendSelectNextValFromSequence(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p2, "sequenceName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 464
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected appendSerializableType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
a=0;//     .locals 1
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p2, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p3, "fieldWidth"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 290
a=0;//     const-string v0, "BLOB"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 291
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected appendShortType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
a=0;//     .locals 1
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p2, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p3, "fieldWidth"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 233
a=0;//     const-string v0, "SMALLINT"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 234
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected appendStringType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
a=0;//     .locals 2
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p2, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p3, "fieldWidth"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/db/BaseDatabaseType;->isVarcharFieldWidthSupported()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 170
a=0;//     const-string v0, "VARCHAR("
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ")"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 174
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 172
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     const-string v0, "VARCHAR"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected configureGeneratedId(Ljava/lang/String;Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
a=0;//     .locals 3
a=0;//     .param p1, "tableName"    # Ljava/lang/String;
a=0;//     .param p2, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p3, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/StringBuilder;",
a=0;//             "Lcom/j256/ormlite/field/FieldType;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 335
a=0;//     .local p4, "statementsBefore":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     .local p5, "statementsAfter":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     .local p6, "additionalArgs":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     .local p7, "queriesAfter":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "GeneratedId is not supported by database "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/db/BaseDatabaseType;->getDatabaseName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " for field "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
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
a=0;// .end method
a=0;// 
a=0;// .method protected configureGeneratedIdSequence(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
a=0;//     .locals 3
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p2, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/StringBuilder;",
a=0;//             "Lcom/j256/ormlite/field/FieldType;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
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
a=0;//     .line 322
a=0;//     .local p3, "statementsBefore":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     .local p4, "additionalArgs":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     .local p5, "queriesAfter":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     new-instance v0, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "GeneratedIdSequence is not supported by database "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/db/BaseDatabaseType;->getDatabaseName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " for field "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
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
a=0;// .end method
a=0;// 
a=0;// .method protected configureId(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
a=0;//     .locals 0
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p2, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/StringBuilder;",
a=0;//             "Lcom/j256/ormlite/field/FieldType;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 348
a=0;//     .local p3, "statementsBefore":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     .local p4, "additionalArgs":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     .local p5, "queriesAfter":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dropColumnArg(Lcom/j256/ormlite/field/FieldType;Ljava/util/List;Ljava/util/List;)V
a=0;//     .locals 0
a=0;//     .param p1, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/field/FieldType;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 402
a=0;//     .local p2, "statementsBefore":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     .local p3, "statementsAfter":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public extractDatabaseTableConfig(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)Lcom/j256/ormlite/table/DatabaseTableConfig;
a=0;//     .locals 1
a=0;//     .param p1, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
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
a=0;//     .line 521
a=0;//     .local p2, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public generateIdSequenceName(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .param p1, "tableName"    # Ljava/lang/String;
a=0;//     .param p2, "idFieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .prologue
a=0;//     .line 413
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget-object v2, Lcom/j256/ormlite/db/BaseDatabaseType;->DEFAULT_SEQUENCE_SUFFIX:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 414
a=0;//     .local v0, "name":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/db/BaseDatabaseType;->isEntityNamesMustBeUpCase()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 415
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 417
a=0;//     .end local v0    # "name":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected generatedIdSqlAtEnd()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 377
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getCommentLinePrefix()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 422
a=0;//     const-string v0, "-- "
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected abstract getDriverClassName()Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public getFieldConverter(Lcom/j256/ormlite/field/DataPersister;)Lcom/j256/ormlite/field/FieldConverter;
a=0;//     .locals 0
a=0;//     .param p1, "dataPersister"    # Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     .prologue
a=0;//     .line 427
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method public getPingStatement()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 487
a=0;//     const-string v0, "SELECT 1"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public isAllowGeneratedIdInsertSupported()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 511
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isBatchUseTransaction()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 491
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isCreateIfNotExistsSupported()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 499
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isCreateIndexIfNotExistsSupported()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 503
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/db/BaseDatabaseType;->isCreateIfNotExistsSupported()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isCreateTableReturnsNegative()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 475
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isCreateTableReturnsZero()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 471
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isEntityNamesMustBeUpCase()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 479
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isIdSequenceNeeded()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 431
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isLimitAfterSelect()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 451
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isLimitSqlSupported()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 439
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isNestedSavePointsSupported()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 483
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isOffsetLimitArgument()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 447
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isOffsetSqlSupported()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 443
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isSelectSequenceBeforeInsert()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 507
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isTruncateSupported()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 495
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isVarcharFieldWidthSupported()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 435
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public loadDriver()V
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/db/BaseDatabaseType;->getDriverClassName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 40
a=0;//     .local v0, "className":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 43
a=0;//     :try_start_0
a=0;//     invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 49
a=0;//     :cond_0
a=0;//     return-void
a=0;// 
a=0;//     .line 44
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 45
a=0;//     .local v1, "e":Ljava/lang/ClassNotFoundException;
a=0;//     #v1=(Reference,Ljava/lang/ClassNotFoundException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Driver class was not found for "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/db/BaseDatabaseType;->getDatabaseName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " database.  Missing jar with class "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "."
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2, v1}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method public setDriver(Ljava/sql/Driver;)V
a=0;//     .locals 0
a=0;//     .param p1, "driver"    # Ljava/sql/Driver;
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/db/BaseDatabaseType;->driver:Ljava/sql/Driver;
a=0;// 
a=0;//     .line 53
a=0;//     return-void
a=0;// .end method
}}
