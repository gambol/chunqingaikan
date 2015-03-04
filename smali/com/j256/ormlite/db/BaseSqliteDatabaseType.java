package com.j256.ormlite.db; class BaseSqliteDatabaseType { void a() { int a;
a=0;// .class public abstract Lcom/j256/ormlite/db/BaseSqliteDatabaseType;
a=0;// .super Lcom/j256/ormlite/db/BaseDatabaseType;
a=0;// .source "BaseSqliteDatabaseType.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/j256/ormlite/db/BaseSqliteDatabaseType$1;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final booleanConverter:Lcom/j256/ormlite/field/FieldConverter;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     new-instance v0, Lcom/j256/ormlite/db/BaseDatabaseType$BooleanNumberFieldConverter;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/db/BaseDatabaseType$BooleanNumberFieldConverter;);
a=0;//     invoke-direct {v0}, Lcom/j256/ormlite/db/BaseDatabaseType$BooleanNumberFieldConverter;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/db/BaseDatabaseType$BooleanNumberFieldConverter;);
a=0;//     sput-object v0, Lcom/j256/ormlite/db/BaseSqliteDatabaseType;->booleanConverter:Lcom/j256/ormlite/field/FieldConverter;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/db/BaseDatabaseType;-><init>()V
a=0;// 
a=0;//     .line 82
a=0;//     #p0=(Reference,Lcom/j256/ormlite/db/BaseSqliteDatabaseType;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected appendLongType(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;I)V
a=0;//     .locals 2
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p2, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p3, "fieldWidth"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     invoke-virtual {p2}, Lcom/j256/ormlite/field/FieldType;->getSqlType()Lcom/j256/ormlite/field/SqlType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/SqlType;);
a=0;//     sget-object v1, Lcom/j256/ormlite/field/SqlType;->LONG:Lcom/j256/ormlite/field/SqlType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/SqlType;);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p2}, Lcom/j256/ormlite/field/FieldType;->isGeneratedId()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 30
a=0;//     const-string v0, "INTEGER"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 34
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 32
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "BIGINT"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected configureGeneratedId(Ljava/lang/String;Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
a=0;//     .locals 2
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
a=0;//     .line 44
a=0;//     .local p4, "statementsBefore":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     .local p5, "statementsAfter":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     .local p6, "additionalArgs":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     .local p7, "queriesAfter":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     invoke-virtual {p3}, Lcom/j256/ormlite/field/FieldType;->getSqlType()Lcom/j256/ormlite/field/SqlType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/SqlType;);
a=0;//     sget-object v1, Lcom/j256/ormlite/field/SqlType;->INTEGER:Lcom/j256/ormlite/field/SqlType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/SqlType;);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p3}, Lcom/j256/ormlite/field/FieldType;->getSqlType()Lcom/j256/ormlite/field/SqlType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Lcom/j256/ormlite/field/SqlType;->LONG:Lcom/j256/ormlite/field/SqlType;
a=0;// 
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 45
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "Sqlite requires that auto-increment generated-id be integer or long type"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 48
a=0;//     :cond_0
a=0;//     const-string v0, "PRIMARY KEY AUTOINCREMENT "
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 50
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected generatedIdSqlAtEnd()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getFieldConverter(Lcom/j256/ormlite/field/DataPersister;)Lcom/j256/ormlite/field/FieldConverter;
a=0;//     .locals 2
a=0;//     .param p1, "dataPersister"    # Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     sget-object v0, Lcom/j256/ormlite/db/BaseSqliteDatabaseType$1;->$SwitchMap$com$j256$ormlite$field$SqlType:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     invoke-interface {p1}, Lcom/j256/ormlite/field/DataPersister;->getSqlType()Lcom/j256/ormlite/field/SqlType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/SqlType;);
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/field/SqlType;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget v0, v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 82
a=0;//     invoke-super {p0, p1}, Lcom/j256/ormlite/db/BaseDatabaseType;->getFieldConverter(Lcom/j256/ormlite/field/DataPersister;)Lcom/j256/ormlite/field/FieldConverter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 78
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);
a=0;//     sget-object v0, Lcom/j256/ormlite/db/BaseSqliteDatabaseType;->booleanConverter:Lcom/j256/ormlite/field/FieldConverter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/FieldConverter;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 80
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);
a=0;//     invoke-static {}, Lcom/j256/ormlite/field/types/BigDecimalStringType;->getSingleton()Lcom/j256/ormlite/field/types/BigDecimalStringType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/types/BigDecimalStringType;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 76
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public isCreateIfNotExistsSupported()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isCreateTableReturnsZero()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
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
a=0;//     .line 59
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
}}
