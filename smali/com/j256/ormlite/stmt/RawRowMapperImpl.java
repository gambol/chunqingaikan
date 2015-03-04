package com.j256.ormlite.stmt; class RawRowMapperImpl { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/stmt/RawRowMapperImpl;
a=0;// .super Ljava/lang/Object;
a=0;// .source "RawRowMapperImpl.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/j256/ormlite/dao/RawRowMapper;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T:",
a=0;//         "Ljava/lang/Object;",
a=0;//         "ID:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/lang/Object;",
a=0;//         "Lcom/j256/ormlite/dao/RawRowMapper",
a=0;//         "<TT;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/table/TableInfo",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/j256/ormlite/table/TableInfo;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/table/TableInfo",
a=0;//             "<TT;TID;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/RawRowMapperImpl;, "Lcom/j256/ormlite/stmt/RawRowMapperImpl<TT;TID;>;"
a=0;//     .local p1, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 20
a=0;//     #p0=(Reference,Lcom/j256/ormlite/stmt/RawRowMapperImpl;);
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/stmt/RawRowMapperImpl;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     .line 21
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public mapRow([Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Object;
a=0;//     .locals 6
a=0;//     .param p1, "columnNames"    # [Ljava/lang/String;
a=0;//     .param p2, "resultColumns"    # [Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "([",
a=0;//             "Ljava/lang/String;",
a=0;//             "[",
a=0;//             "Ljava/lang/String;",
a=0;//             ")TT;"
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
a=0;//     .line 25
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/RawRowMapperImpl;, "Lcom/j256/ormlite/stmt/RawRowMapperImpl<TT;TID;>;"
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/stmt/RawRowMapperImpl;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     invoke-virtual {v4}, Lcom/j256/ormlite/table/TableInfo;->createObject()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 26
a=0;//     .local v3, "rowObj":Ljava/lang/Object;, "TT;"
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     array-length v4, p1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ge v2, v4, :cond_1
a=0;// 
a=0;//     .line 28
a=0;//     array-length v4, p2
a=0;// 
a=0;//     if-lt v2, v4, :cond_0
a=0;// 
a=0;//     .line 26
a=0;//     :goto_1
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 32
a=0;//     :cond_0
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/stmt/RawRowMapperImpl;->tableInfo:Lcom/j256/ormlite/table/TableInfo;
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     aget-object v5, p1, v2
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v4, v5}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypeByColumnName(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 33
a=0;//     .local v1, "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v1=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     aget-object v4, p2, v2
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v1, v4, v2}, Lcom/j256/ormlite/field/FieldType;->convertStringToJavaField(Ljava/lang/String;I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 35
a=0;//     .local v0, "fieldObj":Ljava/lang/Object;
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     invoke-virtual {v1, v3, v0, v4, v5}, Lcom/j256/ormlite/field/FieldType;->assignField(Ljava/lang/Object;Ljava/lang/Object;ZLcom/j256/ormlite/dao/ObjectCache;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 37
a=0;//     .end local v0    # "fieldObj":Ljava/lang/Object;
a=0;//     .end local v1    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Integer);v5=(Conflicted);
a=0;//     return-object v3
a=0;// .end method
}}
