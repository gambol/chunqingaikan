package com.j256.ormlite.stmt; class StatementExecutor$UserObjectRowMapper { void a() { int a;
a=0;// .class Lcom/j256/ormlite/stmt/StatementExecutor$UserObjectRowMapper;
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
a=0;//     name = "UserObjectRowMapper"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<UO:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/lang/Object;",
a=0;//         "Lcom/j256/ormlite/stmt/GenericRowMapper",
a=0;//         "<TUO;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private columnNames:[Ljava/lang/String;
a=0;// 
a=0;// .field private final mapper:Lcom/j256/ormlite/dao/RawRowMapper;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/dao/RawRowMapper",
a=0;//             "<TUO;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final stringRowMapper:Lcom/j256/ormlite/stmt/GenericRowMapper;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/stmt/GenericRowMapper",
a=0;//             "<[",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/j256/ormlite/dao/RawRowMapper;Lcom/j256/ormlite/stmt/GenericRowMapper;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/dao/RawRowMapper",
a=0;//             "<TUO;>;",
a=0;//             "Lcom/j256/ormlite/stmt/GenericRowMapper",
a=0;//             "<[",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 573
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor$UserObjectRowMapper;, "Lcom/j256/ormlite/stmt/StatementExecutor$UserObjectRowMapper<TUO;>;"
a=0;//     .local p1, "mapper":Lcom/j256/ormlite/dao/RawRowMapper;, "Lcom/j256/ormlite/dao/RawRowMapper<TUO;>;"
a=0;//     .local p2, "stringMapper":Lcom/j256/ormlite/stmt/GenericRowMapper;, "Lcom/j256/ormlite/stmt/GenericRowMapper<[Ljava/lang/String;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 574
a=0;//     #p0=(Reference,Lcom/j256/ormlite/stmt/StatementExecutor$UserObjectRowMapper;);
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/stmt/StatementExecutor$UserObjectRowMapper;->mapper:Lcom/j256/ormlite/dao/RawRowMapper;
a=0;// 
a=0;//     .line 575
a=0;//     iput-object p2, p0, Lcom/j256/ormlite/stmt/StatementExecutor$UserObjectRowMapper;->stringRowMapper:Lcom/j256/ormlite/stmt/GenericRowMapper;
a=0;// 
a=0;//     .line 576
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private getColumnNames(Lcom/j256/ormlite/support/DatabaseResults;)[Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p1, "results"    # Lcom/j256/ormlite/support/DatabaseResults;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 584
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor$UserObjectRowMapper;, "Lcom/j256/ormlite/stmt/StatementExecutor$UserObjectRowMapper<TUO;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor$UserObjectRowMapper;->columnNames:[Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 585
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor$UserObjectRowMapper;->columnNames:[Ljava/lang/String;
a=0;// 
a=0;//     .line 588
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 587
a=0;//     :cond_0
a=0;//     invoke-interface {p1}, Lcom/j256/ormlite/support/DatabaseResults;->getColumnNames()[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor$UserObjectRowMapper;->columnNames:[Ljava/lang/String;
a=0;// 
a=0;//     .line 588
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/StatementExecutor$UserObjectRowMapper;->columnNames:[Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public mapRow(Lcom/j256/ormlite/support/DatabaseResults;)Ljava/lang/Object;
a=0;//     .locals 3
a=0;//     .param p1, "results"    # Lcom/j256/ormlite/support/DatabaseResults;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/DatabaseResults;",
a=0;//             ")TUO;"
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
a=0;//     .line 579
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/StatementExecutor$UserObjectRowMapper;, "Lcom/j256/ormlite/stmt/StatementExecutor$UserObjectRowMapper<TUO;>;"
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/StatementExecutor$UserObjectRowMapper;->stringRowMapper:Lcom/j256/ormlite/stmt/GenericRowMapper;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/stmt/GenericRowMapper;);
a=0;//     invoke-interface {v1, p1}, Lcom/j256/ormlite/stmt/GenericRowMapper;->mapRow(Lcom/j256/ormlite/support/DatabaseResults;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, [Ljava/lang/String;
a=0;// 
a=0;//     .line 580
a=0;//     .local v0, "stringResults":[Ljava/lang/String;
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/StatementExecutor$UserObjectRowMapper;->mapper:Lcom/j256/ormlite/dao/RawRowMapper;
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/StatementExecutor$UserObjectRowMapper;->getColumnNames(Lcom/j256/ormlite/support/DatabaseResults;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     invoke-interface {v1, v2, v0}, Lcom/j256/ormlite/dao/RawRowMapper;->mapRow([Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// .end method
}}
