package com.j256.ormlite.db; class DatabaseType { void a() { int a;
a=0;// .class public interface abstract Lcom/j256/ormlite/db/DatabaseType;
a=0;// .super Ljava/lang/Object;
a=0;// .source "DatabaseType.java"
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public abstract addPrimaryKeySql([Lcom/j256/ormlite/field/FieldType;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
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
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public abstract addUniqueComboSql([Lcom/j256/ormlite/field/FieldType;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
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
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public abstract appendColumnArg(Ljava/lang/String;Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
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
a=0;// .end method
a=0;// 
a=0;// .method public abstract appendCreateTableSuffix(Ljava/lang/StringBuilder;)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract appendEscapedWord(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract appendLimitValue(Ljava/lang/StringBuilder;JLjava/lang/Long;)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract appendOffsetValue(Ljava/lang/StringBuilder;J)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract appendSelectNextValFromSequence(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract dropColumnArg(Lcom/j256/ormlite/field/FieldType;Ljava/util/List;Ljava/util/List;)V
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
a=0;// .end method
a=0;// 
a=0;// .method public abstract extractDatabaseTableConfig(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)Lcom/j256/ormlite/table/DatabaseTableConfig;
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
a=0;// .end method
a=0;// 
a=0;// .method public abstract generateIdSequenceName(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public abstract getCommentLinePrefix()Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public abstract getDatabaseName()Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public abstract getFieldConverter(Lcom/j256/ormlite/field/DataPersister;)Lcom/j256/ormlite/field/FieldConverter;
a=0;// .end method
a=0;// 
a=0;// .method public abstract getPingStatement()Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public abstract isAllowGeneratedIdInsertSupported()Z
a=0;// .end method
a=0;// 
a=0;// .method public abstract isBatchUseTransaction()Z
a=0;// .end method
a=0;// 
a=0;// .method public abstract isCreateIfNotExistsSupported()Z
a=0;// .end method
a=0;// 
a=0;// .method public abstract isCreateIndexIfNotExistsSupported()Z
a=0;// .end method
a=0;// 
a=0;// .method public abstract isCreateTableReturnsNegative()Z
a=0;// .end method
a=0;// 
a=0;// .method public abstract isCreateTableReturnsZero()Z
a=0;// .end method
a=0;// 
a=0;// .method public abstract isDatabaseUrlThisType(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// .end method
a=0;// 
a=0;// .method public abstract isEntityNamesMustBeUpCase()Z
a=0;// .end method
a=0;// 
a=0;// .method public abstract isIdSequenceNeeded()Z
a=0;// .end method
a=0;// 
a=0;// .method public abstract isLimitAfterSelect()Z
a=0;// .end method
a=0;// 
a=0;// .method public abstract isLimitSqlSupported()Z
a=0;// .end method
a=0;// 
a=0;// .method public abstract isNestedSavePointsSupported()Z
a=0;// .end method
a=0;// 
a=0;// .method public abstract isOffsetLimitArgument()Z
a=0;// .end method
a=0;// 
a=0;// .method public abstract isOffsetSqlSupported()Z
a=0;// .end method
a=0;// 
a=0;// .method public abstract isSelectSequenceBeforeInsert()Z
a=0;// .end method
a=0;// 
a=0;// .method public abstract isTruncateSupported()Z
a=0;// .end method
a=0;// 
a=0;// .method public abstract isVarcharFieldWidthSupported()Z
a=0;// .end method
a=0;// 
a=0;// .method public abstract loadDriver()V
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public abstract setDriver(Ljava/sql/Driver;)V
a=0;// .end method
}}