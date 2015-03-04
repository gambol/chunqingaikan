package com.j256.ormlite.stmt; class QueryBuilder$InternalQueryBuilderWrapper { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/stmt/QueryBuilder$InternalQueryBuilderWrapper;
a=0;// .super Ljava/lang/Object;
a=0;// .source "QueryBuilder.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x9
a=0;//     name = "InternalQueryBuilderWrapper"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final queryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/stmt/QueryBuilder",
a=0;//             "<**>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/j256/ormlite/stmt/QueryBuilder;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/stmt/QueryBuilder",
a=0;//             "<**>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 677
a=0;//     .local p1, "queryBuilder":Lcom/j256/ormlite/stmt/QueryBuilder;, "Lcom/j256/ormlite/stmt/QueryBuilder<**>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 678
a=0;//     #p0=(Reference,Lcom/j256/ormlite/stmt/QueryBuilder$InternalQueryBuilderWrapper;);
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/stmt/QueryBuilder$InternalQueryBuilderWrapper;->queryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     .line 679
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public appendStatementString(Ljava/lang/StringBuilder;Ljava/util/List;)V
a=0;//     .locals 1
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
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
a=0;//     .line 682
a=0;//     .local p2, "argList":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/stmt/ArgumentHolder;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder$InternalQueryBuilderWrapper;->queryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/QueryBuilder;);
a=0;//     invoke-virtual {v0, p1, p2}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendStatementString(Ljava/lang/StringBuilder;Ljava/util/List;)V
a=0;// 
a=0;//     .line 683
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getResultFieldTypes()[Lcom/j256/ormlite/field/FieldType;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 686
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder$InternalQueryBuilderWrapper;->queryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/QueryBuilder;);
a=0;//     invoke-static {v0}, Lcom/j256/ormlite/stmt/QueryBuilder;->access$000(Lcom/j256/ormlite/stmt/QueryBuilder;)[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
