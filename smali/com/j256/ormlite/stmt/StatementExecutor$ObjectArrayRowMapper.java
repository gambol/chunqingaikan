package com.j256.ormlite.stmt; class StatementExecutor$ObjectArrayRowMapper { void a() { int a;
a=0;// .class Lcom/j256/ormlite/stmt/StatementExecutor$ObjectArrayRowMapper;
a=0;// .super Ljava/lang/Object;
a=0;// .source "StatementExecutor.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/j256/ormlite/stmt/GenericRowMapper;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/j256/ormlite/stmt/StatementExecutor;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "ObjectArrayRowMapper"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Object;",
a=0;//         "Lcom/j256/ormlite/stmt/GenericRowMapper",
a=0;//         "<[",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final columnTypes:[Lcom/j256/ormlite/field/DataType;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>([Lcom/j256/ormlite/field/DataType;)V
a=0;//     .locals 0
a=0;//     .param p1, "columnTypes"    # [Lcom/j256/ormlite/field/DataType;
a=0;// 
a=0;//     .prologue
a=0;//     .line 599
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 600
a=0;//     #p0=(Reference,Lcom/j256/ormlite/stmt/StatementExecutor$ObjectArrayRowMapper;);
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/stmt/StatementExecutor$ObjectArrayRowMapper;->columnTypes:[Lcom/j256/ormlite/field/DataType;
a=0;// 
a=0;//     .line 601
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public bridge synthetic mapRow(Lcom/j256/ormlite/support/DatabaseResults;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "x0"    # Lcom/j256/ormlite/support/DatabaseResults;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 595
a=0;//     invoke-virtual {p0, p1}, Lcom/j256/ormlite/stmt/StatementExecutor$ObjectArrayRowMapper;->mapRow(Lcom/j256/ormlite/support/DatabaseResults;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public mapRow(Lcom/j256/ormlite/support/DatabaseResults;)[Ljava/lang/Object;
a=0;//     .locals 6
a=0;//     .param p1, "results"    # Lcom/j256/ormlite/support/DatabaseResults;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 604
a=0;//     invoke-interface {p1}, Lcom/j256/ormlite/support/DatabaseResults;->getColumnCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 605
a=0;//     .local v1, "columnN":I
a=0;//     #v1=(Integer);
a=0;//     new-array v3, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 606
a=0;//     .local v3, "result":[Ljava/lang/Object;
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "colC":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-ge v0, v1, :cond_1
a=0;// 
a=0;//     .line 608
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/stmt/StatementExecutor$ObjectArrayRowMapper;->columnTypes:[Lcom/j256/ormlite/field/DataType;
a=0;// 
a=0;//     #v4=(Reference,[Lcom/j256/ormlite/field/DataType;);
a=0;//     array-length v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lt v0, v4, :cond_0
a=0;// 
a=0;//     .line 609
a=0;//     sget-object v2, Lcom/j256/ormlite/field/DataType;->STRING:Lcom/j256/ormlite/field/DataType;
a=0;// 
a=0;//     .line 613
a=0;//     .local v2, "dataType":Lcom/j256/ormlite/field/DataType;
a=0;//     :goto_1
a=0;//     #v2=(Reference,Lcom/j256/ormlite/field/DataType;);v4=(Conflicted);
a=0;//     invoke-virtual {v2}, Lcom/j256/ormlite/field/DataType;->getDataPersister()Lcom/j256/ormlite/field/DataPersister;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/field/DataPersister;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-interface {v4, v5, p1, v0}, Lcom/j256/ormlite/field/DataPersister;->resultToJava(Lcom/j256/ormlite/field/FieldType;Lcom/j256/ormlite/support/DatabaseResults;I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     aput-object v4, v3, v0
a=0;// 
a=0;//     .line 606
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 611
a=0;//     .end local v2    # "dataType":Lcom/j256/ormlite/field/DataType;
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v4=(Integer);v5=(Conflicted);
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/stmt/StatementExecutor$ObjectArrayRowMapper;->columnTypes:[Lcom/j256/ormlite/field/DataType;
a=0;// 
a=0;//     #v4=(Reference,[Lcom/j256/ormlite/field/DataType;);
a=0;//     aget-object v2, v4, v0
a=0;// 
a=0;//     .restart local v2    # "dataType":Lcom/j256/ormlite/field/DataType;
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 615
a=0;//     .end local v2    # "dataType":Lcom/j256/ormlite/field/DataType;
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     return-object v3
a=0;// .end method
}}
