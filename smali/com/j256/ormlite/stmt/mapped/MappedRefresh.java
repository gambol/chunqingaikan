package com.j256.ormlite.stmt.mapped; class MappedRefresh { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/stmt/mapped/MappedRefresh;
a=0;// .super Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;
a=0;// .source "MappedRefresh.java"
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
a=0;//         "Lcom/j256/ormlite/stmt/mapped/MappedQueryForId",
a=0;//         "<TT;TID;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/j256/ormlite/table/TableInfo;Ljava/lang/String;[Lcom/j256/ormlite/field/FieldType;[Lcom/j256/ormlite/field/FieldType;)V
a=0;//     .locals 6
a=0;//     .param p2, "statement"    # Ljava/lang/String;
a=0;//     .param p3, "argFieldTypes"    # [Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p4, "resultFieldTypes"    # [Lcom/j256/ormlite/field/FieldType;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/table/TableInfo",
a=0;//             "<TT;TID;>;",
a=0;//             "Ljava/lang/String;",
a=0;//             "[",
a=0;//             "Lcom/j256/ormlite/field/FieldType;",
a=0;//             "[",
a=0;//             "Lcom/j256/ormlite/field/FieldType;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/mapped/MappedRefresh;, "Lcom/j256/ormlite/stmt/mapped/MappedRefresh<TT;TID;>;"
a=0;//     .local p1, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     const-string v5, "refresh"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(UninitThis,Lcom/j256/ormlite/stmt/mapped/MappedRefresh;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/table/TableInfo;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     move-object v4, p4
a=0;// 
a=0;//     #v4=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;-><init>(Lcom/j256/ormlite/table/TableInfo;Ljava/lang/String;[Lcom/j256/ormlite/field/FieldType;[Lcom/j256/ormlite/field/FieldType;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 21
a=0;//     #v0=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedRefresh;);p0=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedRefresh;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static build(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;)Lcom/j256/ormlite/stmt/mapped/MappedRefresh;
a=0;//     .locals 6
a=0;//     .param p0, "databaseType"    # Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             "ID:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/db/DatabaseType;",
a=0;//             "Lcom/j256/ormlite/table/TableInfo",
a=0;//             "<TT;TID;>;)",
a=0;//             "Lcom/j256/ormlite/stmt/mapped/MappedRefresh",
a=0;//             "<TT;TID;>;"
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
a=0;//     .line 48
a=0;//     .local p1, "tableInfo":Lcom/j256/ormlite/table/TableInfo;, "Lcom/j256/ormlite/table/TableInfo<TT;TID;>;"
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getIdField()Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 49
a=0;//     .local v0, "idField":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 50
a=0;//     new-instance v2, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Cannot refresh "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getDataClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " because it doesn\'t have an id field"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 53
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-static {p0, p1, v0}, Lcom/j256/ormlite/stmt/mapped/MappedRefresh;->buildStatement(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Lcom/j256/ormlite/field/FieldType;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 54
a=0;//     .local v1, "statement":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Lcom/j256/ormlite/stmt/mapped/MappedRefresh;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/j256/ormlite/stmt/mapped/MappedRefresh;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v3=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getIdField()Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypes()[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-direct {v2, p1, v1, v3, v4}, Lcom/j256/ormlite/stmt/mapped/MappedRefresh;-><init>(Lcom/j256/ormlite/table/TableInfo;Ljava/lang/String;[Lcom/j256/ormlite/field/FieldType;[Lcom/j256/ormlite/field/FieldType;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/stmt/mapped/MappedRefresh;);
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public executeRefresh(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)I
a=0;//     .locals 8
a=0;//     .param p1, "databaseConnection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p3, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/DatabaseConnection;",
a=0;//             "TT;",
a=0;//             "Lcom/j256/ormlite/dao/ObjectCache;",
a=0;//             ")I"
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
a=0;//     .local p0, "this":Lcom/j256/ormlite/stmt/mapped/MappedRefresh;, "Lcom/j256/ormlite/stmt/mapped/MappedRefresh<TT;TID;>;"
a=0;//     .local p2, "data":Ljava/lang/Object;, "TT;"
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 31
a=0;//     #v6=(Null);
a=0;//     iget-object v7, p0, Lcom/j256/ormlite/stmt/mapped/MappedRefresh;->idField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     #v7=(Reference,Lcom/j256/ormlite/field/FieldType;);
a=0;//     invoke-virtual {v7, p2}, Lcom/j256/ormlite/field/FieldType;->extractJavaFieldValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 33
a=0;//     .local v3, "id":Ljava/lang/Object;, "TID;"
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-super {p0, p1, v3, v7}, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->execute(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 34
a=0;//     .local v5, "result":Ljava/lang/Object;, "TT;"
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     .line 43
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v6=(Boolean);v7=(Reference,Ljava/lang/Object;);
a=0;//     return v6
a=0;// 
a=0;//     .line 38
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);v6=(Null);v7=(Null);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/stmt/mapped/MappedRefresh;->resultsFieldTypes:[Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     .local v0, "arr$":[Lcom/j256/ormlite/field/FieldType;
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/field/FieldType;);
a=0;//     array-length v4, v0
a=0;// 
a=0;//     .local v4, "len$":I
a=0;//     #v4=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i$":I
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Integer);v7=(Reference,Ljava/lang/Object;);
a=0;//     if-ge v2, v4, :cond_2
a=0;// 
a=0;//     aget-object v1, v0, v2
a=0;// 
a=0;//     .line 39
a=0;//     .local v1, "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     #v1=(Null);
a=0;//     iget-object v7, p0, Lcom/j256/ormlite/stmt/mapped/MappedRefresh;->idField:Lcom/j256/ormlite/field/FieldType;
a=0;// 
a=0;//     if-eq v1, v7, :cond_1
a=0;// 
a=0;//     .line 40
a=0;//     invoke-virtual {v1, v5}, Lcom/j256/ormlite/field/FieldType;->extractJavaFieldValue(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v1, p2, v7, v6, p3}, Lcom/j256/ormlite/field/FieldType;->assignField(Ljava/lang/Object;Ljava/lang/Object;ZLcom/j256/ormlite/dao/ObjectCache;)V
a=0;// 
a=0;//     .line 38
a=0;//     :cond_1
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 43
a=0;//     .end local v1    # "fieldType":Lcom/j256/ormlite/field/FieldType;
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     goto :goto_0
a=0;// .end method
}}
