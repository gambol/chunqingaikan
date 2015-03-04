package com.j256.ormlite.stmt.query; class SimpleComparison { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/stmt/query/SimpleComparison;
a=0;// .super Lcom/j256/ormlite/stmt/query/BaseComparison;
a=0;// .source "SimpleComparison.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final EQUAL_TO_OPERATION:Ljava/lang/String; = "="
a=0;// 
a=0;// .field public static final GREATER_THAN_EQUAL_TO_OPERATION:Ljava/lang/String; = ">="
a=0;// 
a=0;// .field public static final GREATER_THAN_OPERATION:Ljava/lang/String; = ">"
a=0;// 
a=0;// .field public static final LESS_THAN_EQUAL_TO_OPERATION:Ljava/lang/String; = "<="
a=0;// 
a=0;// .field public static final LESS_THAN_OPERATION:Ljava/lang/String; = "<"
a=0;// 
a=0;// .field public static final LIKE_OPERATION:Ljava/lang/String; = "LIKE"
a=0;// 
a=0;// .field public static final NOT_EQUAL_TO_OPERATION:Ljava/lang/String; = "<>"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final operation:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;//     .param p2, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p3, "value"    # Ljava/lang/Object;
a=0;//     .param p4, "operation"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, p1, p2, p3, v0}, Lcom/j256/ormlite/stmt/query/BaseComparison;-><init>(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;Z)V
a=0;// 
a=0;//     .line 26
a=0;//     #p0=(Reference,Lcom/j256/ormlite/stmt/query/SimpleComparison;);
a=0;//     iput-object p4, p0, Lcom/j256/ormlite/stmt/query/SimpleComparison;->operation:Ljava/lang/String;
a=0;// 
a=0;//     .line 27
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public appendOperation(Ljava/lang/StringBuilder;)V
a=0;//     .locals 1
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/query/SimpleComparison;->operation:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 32
a=0;//     const/16 v0, 0x20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 33
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic appendSql(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .param p2, "x1"    # Ljava/lang/String;
a=0;//     .param p3, "x2"    # Ljava/lang/StringBuilder;
a=0;//     .param p4, "x3"    # Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 12
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Lcom/j256/ormlite/stmt/query/BaseComparison;->appendSql(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic appendValue(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/StringBuilder;Ljava/util/List;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .param p2, "x1"    # Ljava/lang/StringBuilder;
a=0;//     .param p3, "x2"    # Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 12
a=0;//     invoke-super {p0, p1, p2, p3}, Lcom/j256/ormlite/stmt/query/BaseComparison;->appendValue(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/StringBuilder;Ljava/util/List;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic getColumnName()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 12
a=0;//     invoke-super {p0}, Lcom/j256/ormlite/stmt/query/BaseComparison;->getColumnName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic toString()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 12
a=0;//     invoke-super {p0}, Lcom/j256/ormlite/stmt/query/BaseComparison;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
}}
